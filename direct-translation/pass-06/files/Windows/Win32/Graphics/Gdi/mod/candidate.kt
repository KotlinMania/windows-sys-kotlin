// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AbortPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AbortPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AddFontMemResourceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFontMemResourceEx`(`pfileview` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cjsize` : UInt, `pvresrved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pnumfonts` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AddFontResourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFontResourceA`(`param0` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AddFontResourceExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFontResourceExA`(`name` : `windows_sys`.`core`.`PCSTR`, `fl` : `FONT_RESOURCE_CHARACTERISTICS`, `res` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AddFontResourceExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFontResourceExW`(`name` : `windows_sys`.`core`.`PCWSTR`, `fl` : `FONT_RESOURCE_CHARACTERISTICS`, `res` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AddFontResourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddFontResourceW`(`param0` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msimg32.dll, ABI=system, export=AlphaBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AlphaBlend`(`hdcdest` : `HDC`, `xorigindest` : Int, `yorigindest` : Int, `wdest` : Int, `hdest` : Int, `hdcsrc` : `HDC`, `xoriginsrc` : Int, `yoriginsrc` : Int, `wsrc` : Int, `hsrc` : Int, `ftn` : `BLENDFUNCTION`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AngleArc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AngleArc`(`hdc` : `HDC`, `x` : Int, `y` : Int, `r` : UInt, `startangle` : Float, `sweepangle` : Float) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AnimatePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AnimatePalette`(`hpal` : `HPALETTE`, `istartindex` : UInt, `centries` : UInt, `ppe` : /* Rust *const */ kotlinx.cinterop.CPointer<`PALETTEENTRY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Arc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Arc`(`hdc` : `HDC`, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int, `x3` : Int, `y3` : Int, `x4` : Int, `y4` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ArcTo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ArcTo`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int, `xr1` : Int, `yr1` : Int, `xr2` : Int, `yr2` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BeginPaint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BeginPaint`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppaint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PAINTSTRUCT`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=BeginPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BeginPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=BitBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BitBlt`(`hdc` : `HDC`, `x` : Int, `y` : Int, `cx` : Int, `cy` : Int, `hdcsrc` : `HDC`, `x1` : Int, `y1` : Int, `rop` : `ROP_CODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CancelDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelDC`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeDisplaySettingsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeDisplaySettingsA`(`lpdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEA`>?, `dwflags` : `CDS_TYPE`) : `DISP_CHANGE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeDisplaySettingsExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeDisplaySettingsExA`(`lpszdevicename` : `windows_sys`.`core`.`PCSTR`, `lpdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEA`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : `CDS_TYPE`, `lparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `DISP_CHANGE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeDisplaySettingsExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeDisplaySettingsExW`(`lpszdevicename` : `windows_sys`.`core`.`PCWSTR`, `lpdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEW`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : `CDS_TYPE`, `lparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `DISP_CHANGE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeDisplaySettingsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeDisplaySettingsW`(`lpdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEW`>?, `dwflags` : `CDS_TYPE`) : `DISP_CHANGE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Chord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Chord`(`hdc` : `HDC`, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int, `x3` : Int, `y3` : Int, `x4` : Int, `y4` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ClientToScreen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClientToScreen`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CloseEnhMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseEnhMetaFile`(`hdc` : `HDC`) : `HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CloseFigure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseFigure`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CloseMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseMetaFile`(`hdc` : `HDC`) : `HMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CombineRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CombineRgn`(`hrgndst` : `HRGN`, `hrgnsrc1` : `HRGN`, `hrgnsrc2` : `HRGN`, `imode` : `RGN_COMBINE_MODE`) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CombineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CombineTransform`(`lpxfout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORM`>?, `lpxf1` : /* Rust *const */ kotlinx.cinterop.CPointer<`XFORM`>?, `lpxf2` : /* Rust *const */ kotlinx.cinterop.CPointer<`XFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CopyEnhMetaFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyEnhMetaFileA`(`henh` : `HENHMETAFILE`, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : `HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CopyEnhMetaFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyEnhMetaFileW`(`henh` : `HENHMETAFILE`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CopyMetaFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyMetaFileA`(`param0` : `HMETAFILE`, `param1` : `windows_sys`.`core`.`PCSTR`) : `HMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CopyMetaFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyMetaFileW`(`param0` : `HMETAFILE`, `param1` : `windows_sys`.`core`.`PCWSTR`) : `HMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CopyRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyRect`(`lprcdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateBitmap`(`nwidth` : Int, `nheight` : Int, `nplanes` : UInt, `nbitcount` : UInt, `lpbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateBitmapIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateBitmapIndirect`(`pbm` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAP`>?) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateBrushIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateBrushIndirect`(`plbrush` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGBRUSH`>?) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateCompatibleBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCompatibleBitmap`(`hdc` : `HDC`, `cx` : Int, `cy` : Int) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateCompatibleDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCompatibleDC`(`hdc` : `HDC`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDCA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDCA`(`pwszdriver` : `windows_sys`.`core`.`PCSTR`, `pwszdevice` : `windows_sys`.`core`.`PCSTR`, `pszport` : `windows_sys`.`core`.`PCSTR`, `pdm` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEA`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDCW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDCW`(`pwszdriver` : `windows_sys`.`core`.`PCWSTR`, `pwszdevice` : `windows_sys`.`core`.`PCWSTR`, `pszport` : `windows_sys`.`core`.`PCWSTR`, `pdm` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEW`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDIBPatternBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDIBPatternBrush`(`h` : `super`.`super`.`Foundation`.`HGLOBAL`, `iusage` : `DIB_USAGE`) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDIBPatternBrushPt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDIBPatternBrushPt`(`lppackeddib` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iusage` : `DIB_USAGE`) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDIBSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDIBSection`(`hdc` : `HDC`, `pbmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAPINFO`>?, `usage` : `DIB_USAGE`, `ppvbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `hsection` : `super`.`super`.`Foundation`.`HANDLE`, `offset` : UInt) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDIBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDIBitmap`(`hdc` : `HDC`, `pbmih` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAPINFOHEADER`>?, `flinit` : UInt, `pjbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAPINFO`>?, `iusage` : `DIB_USAGE`) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateDiscardableBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDiscardableBitmap`(`hdc` : `HDC`, `cx` : Int, `cy` : Int) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateEllipticRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateEllipticRgn`(`x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateEllipticRgnIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateEllipticRgnIndirect`(`lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateEnhMetaFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateEnhMetaFileA`(`hdc` : `HDC`, `lpfilename` : `windows_sys`.`core`.`PCSTR`, `lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpdesc` : `windows_sys`.`core`.`PCSTR`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateEnhMetaFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateEnhMetaFileW`(`hdc` : `HDC`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpdesc` : `windows_sys`.`core`.`PCWSTR`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateFontA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontA`(`cheight` : Int, `cwidth` : Int, `cescapement` : Int, `corientation` : Int, `cweight` : Int, `bitalic` : UInt, `bunderline` : UInt, `bstrikeout` : UInt, `icharset` : UInt, `ioutprecision` : UInt, `iclipprecision` : UInt, `iquality` : UInt, `ipitchandfamily` : UInt, `pszfacename` : `windows_sys`.`core`.`PCSTR`) : `HFONT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateFontIndirectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontIndirectA`(`lplf` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGFONTA`>?) : `HFONT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateFontIndirectExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontIndirectExA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENUMLOGFONTEXDVA`>?) : `HFONT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateFontIndirectExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontIndirectExW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENUMLOGFONTEXDVW`>?) : `HFONT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateFontIndirectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontIndirectW`(`lplf` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGFONTW`>?) : `HFONT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fontsub.dll, ABI=C, export=CreateFontPackage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontPackage`(`puchsrcbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ulsrcbuffersize` : UInt, `ppuchfontpackagebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pulfontpackagebuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `usflag` : UShort, `usttcindex` : UShort, `ussubsetformat` : UShort, `ussubsetlanguage` : UShort, `ussubsetplatform` : `CREATE_FONT_PACKAGE_SUBSET_PLATFORM`, `ussubsetencoding` : `CREATE_FONT_PACKAGE_SUBSET_ENCODING`, `pussubsetkeeplist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ussubsetlistcount` : UShort, `lpfnallocate` : `CFP_ALLOCPROC`, `lpfnreallocate` : `CFP_REALLOCPROC`, `lpfnfree` : `CFP_FREEPROC`, `lpvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateFontW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFontW`(`cheight` : Int, `cwidth` : Int, `cescapement` : Int, `corientation` : Int, `cweight` : Int, `bitalic` : UInt, `bunderline` : UInt, `bstrikeout` : UInt, `icharset` : UInt, `ioutprecision` : UInt, `iclipprecision` : UInt, `iquality` : UInt, `ipitchandfamily` : UInt, `pszfacename` : `windows_sys`.`core`.`PCWSTR`) : `HFONT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateHalftonePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateHalftonePalette`(`hdc` : `HDC`) : `HPALETTE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateHatchBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateHatchBrush`(`ihatch` : `HATCH_BRUSH_STYLE`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateICA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateICA`(`pszdriver` : `windows_sys`.`core`.`PCSTR`, `pszdevice` : `windows_sys`.`core`.`PCSTR`, `pszport` : `windows_sys`.`core`.`PCSTR`, `pdm` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEA`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateICW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateICW`(`pszdriver` : `windows_sys`.`core`.`PCWSTR`, `pszdevice` : `windows_sys`.`core`.`PCWSTR`, `pszport` : `windows_sys`.`core`.`PCWSTR`, `pdm` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEW`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateMetaFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMetaFileA`(`pszfile` : `windows_sys`.`core`.`PCSTR`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateMetaFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMetaFileW`(`pszfile` : `windows_sys`.`core`.`PCWSTR`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreatePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePalette`(`plpal` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGPALETTE`>?) : `HPALETTE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreatePatternBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePatternBrush`(`hbm` : `HBITMAP`) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreatePen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePen`(`istyle` : `PEN_STYLE`, `cwidth` : Int, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `HPEN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreatePenIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePenIndirect`(`plpen` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGPEN`>?) : `HPEN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreatePolyPolygonRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePolyPolygonRgn`(`pptl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `pc` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `cpoly` : Int, `imode` : `CREATE_POLYGON_RGN_MODE`) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreatePolygonRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePolygonRgn`(`pptl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpoint` : Int, `imode` : `CREATE_POLYGON_RGN_MODE`) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateRectRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRectRgn`(`x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateRectRgnIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRectRgnIndirect`(`lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateRoundRectRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRoundRectRgn`(`x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int, `w` : Int, `h` : Int) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateScalableFontResourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateScalableFontResourceA`(`fdwhidden` : UInt, `lpszfont` : `windows_sys`.`core`.`PCSTR`, `lpszfile` : `windows_sys`.`core`.`PCSTR`, `lpszpath` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateScalableFontResourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateScalableFontResourceW`(`fdwhidden` : UInt, `lpszfont` : `windows_sys`.`core`.`PCWSTR`, `lpszfile` : `windows_sys`.`core`.`PCWSTR`, `lpszpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CreateSolidBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateSolidBrush`(`color` : `super`.`super`.`Foundation`.`COLORREF`) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DPtoLP; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPtoLP`(`hdc` : `HDC`, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `c` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DeleteDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteDC`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DeleteEnhMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteEnhMetaFile`(`hmf` : `HENHMETAFILE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DeleteMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteMetaFile`(`hmf` : `HMETAFILE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DeleteObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteObject`(`ho` : `HGDIOBJ`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawAnimatedRects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawAnimatedRects`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `idani` : Int, `lprcfrom` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcto` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawCaption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawCaption`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdc` : `HDC`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `flags` : `DRAW_CAPTION_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawEdge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawEdge`(`hdc` : `HDC`, `qrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `edge` : `DRAWEDGE_FLAGS`, `grfflags` : `DRAW_EDGE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DrawEscape; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawEscape`(`hdc` : `HDC`, `iescape` : Int, `cjin` : Int, `lpin` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawFocusRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawFocusRect`(`hdc` : `HDC`, `lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawFrameControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawFrameControl`(`param0` : `HDC`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `param2` : `DFC_TYPE`, `param3` : `DFCS_STATE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawStateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawStateA`(`hdc` : `HDC`, `hbrfore` : `HBRUSH`, `qfncallback` : `DRAWSTATEPROC`, `ldata` : `super`.`super`.`Foundation`.`LPARAM`, `wdata` : `super`.`super`.`Foundation`.`WPARAM`, `x` : Int, `y` : Int, `cx` : Int, `cy` : Int, `uflags` : `DRAWSTATE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawStateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawStateW`(`hdc` : `HDC`, `hbrfore` : `HBRUSH`, `qfncallback` : `DRAWSTATEPROC`, `ldata` : `super`.`super`.`Foundation`.`LPARAM`, `wdata` : `super`.`super`.`Foundation`.`WPARAM`, `x` : Int, `y` : Int, `cx` : Int, `cy` : Int, `uflags` : `DRAWSTATE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawTextA`(`hdc` : `HDC`, `lpchtext` : `windows_sys`.`core`.`PCSTR`, `cchtext` : Int, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `format` : `DRAW_TEXT_FORMAT`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawTextExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawTextExA`(`hdc` : `HDC`, `lpchtext` : `windows_sys`.`core`.`PSTR`, `cchtext` : Int, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `format` : `DRAW_TEXT_FORMAT`, `lpdtp` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRAWTEXTPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawTextExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawTextExW`(`hdc` : `HDC`, `lpchtext` : `windows_sys`.`core`.`PWSTR`, `cchtext` : Int, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `format` : `DRAW_TEXT_FORMAT`, `lpdtp` : /* Rust *const */ kotlinx.cinterop.CPointer<`DRAWTEXTPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawTextW`(`hdc` : `HDC`, `lpchtext` : `windows_sys`.`core`.`PCWSTR`, `cchtext` : Int, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `format` : `DRAW_TEXT_FORMAT`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Ellipse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Ellipse`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EndPaint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndPaint`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppaint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PAINTSTRUCT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EndPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplayDevicesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplayDevicesA`(`lpdevice` : `windows_sys`.`core`.`PCSTR`, `idevnum` : UInt, `lpdisplaydevice` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISPLAY_DEVICEA`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplayDevicesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplayDevicesW`(`lpdevice` : `windows_sys`.`core`.`PCWSTR`, `idevnum` : UInt, `lpdisplaydevice` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISPLAY_DEVICEW`>?, `dwflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplayMonitors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplayMonitors`(`hdc` : `HDC`, `lprcclip` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpfnenum` : `MONITORENUMPROC`, `dwdata` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplaySettingsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplaySettingsA`(`lpszdevicename` : `windows_sys`.`core`.`PCSTR`, `imodenum` : `ENUM_DISPLAY_SETTINGS_MODE`, `lpdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplaySettingsExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplaySettingsExA`(`lpszdevicename` : `windows_sys`.`core`.`PCSTR`, `imodenum` : `ENUM_DISPLAY_SETTINGS_MODE`, `lpdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEA`>?, `dwflags` : `ENUM_DISPLAY_SETTINGS_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplaySettingsExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplaySettingsExW`(`lpszdevicename` : `windows_sys`.`core`.`PCWSTR`, `imodenum` : `ENUM_DISPLAY_SETTINGS_MODE`, `lpdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEW`>?, `dwflags` : `ENUM_DISPLAY_SETTINGS_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDisplaySettingsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDisplaySettingsW`(`lpszdevicename` : `windows_sys`.`core`.`PCWSTR`, `imodenum` : `ENUM_DISPLAY_SETTINGS_MODE`, `lpdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumEnhMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumEnhMetaFile`(`hdc` : `HDC`, `hmf` : `HENHMETAFILE`, `proc` : `ENHMFENUMPROC`, `param3` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumFontFamiliesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFontFamiliesA`(`hdc` : `HDC`, `lplogfont` : `windows_sys`.`core`.`PCSTR`, `lpproc` : `FONTENUMPROCA`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumFontFamiliesExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFontFamiliesExA`(`hdc` : `HDC`, `lplogfont` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGFONTA`>?, `lpproc` : `FONTENUMPROCA`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `dwflags` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumFontFamiliesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFontFamiliesExW`(`hdc` : `HDC`, `lplogfont` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGFONTW`>?, `lpproc` : `FONTENUMPROCW`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `dwflags` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumFontFamiliesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFontFamiliesW`(`hdc` : `HDC`, `lplogfont` : `windows_sys`.`core`.`PCWSTR`, `lpproc` : `FONTENUMPROCW`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumFontsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFontsA`(`hdc` : `HDC`, `lplogfont` : `windows_sys`.`core`.`PCSTR`, `lpproc` : `FONTENUMPROCA`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumFontsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumFontsW`(`hdc` : `HDC`, `lplogfont` : `windows_sys`.`core`.`PCWSTR`, `lpproc` : `FONTENUMPROCW`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumMetaFile`(`hdc` : `HDC`, `hmf` : `HMETAFILE`, `proc` : `MFENUMPROC`, `param3` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EnumObjects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumObjects`(`hdc` : `HDC`, `ntype` : `OBJ_TYPE`, `lpfunc` : `GOBJENUMPROC`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EqualRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EqualRect`(`lprc1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprc2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EqualRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EqualRgn`(`hrgn1` : `HRGN`, `hrgn2` : `HRGN`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExcludeClipRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExcludeClipRect`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ExcludeUpdateRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExcludeUpdateRgn`(`hdc` : `HDC`, `hwnd` : `super`.`super`.`Foundation`.`HWND`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtCreatePen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtCreatePen`(`ipenstyle` : UInt, `cwidth` : UInt, `plbrush` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOGBRUSH`>?, `cstyle` : UInt, `pstyle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `HPEN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtCreateRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtCreateRegion`(`lpx` : /* Rust *const */ kotlinx.cinterop.CPointer<`XFORM`>?, `ncount` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`RGNDATA`>?) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtFloodFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtFloodFill`(`hdc` : `HDC`, `x` : Int, `y` : Int, `color` : `super`.`super`.`Foundation`.`COLORREF`, `type` : `EXT_FLOOD_FILL_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtSelectClipRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtSelectClipRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`, `mode` : `RGN_COMBINE_MODE`) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtTextOutA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtTextOutA`(`hdc` : `HDC`, `x` : Int, `y` : Int, `options` : `ETO_OPTIONS`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpstring` : `windows_sys`.`core`.`PCSTR`, `c` : UInt, `lpdx` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtTextOutW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtTextOutW`(`hdc` : `HDC`, `x` : Int, `y` : Int, `options` : `ETO_OPTIONS`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `c` : UInt, `lpdx` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FillPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FillPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FillRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FillRect`(`hdc` : `HDC`, `lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `hbr` : `HBRUSH`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FillRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FillRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`, `hbr` : `HBRUSH`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FixBrushOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FixBrushOrgEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `ptl` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FlattenPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlattenPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FloodFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FloodFill`(`hdc` : `HDC`, `x` : Int, `y` : Int, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FrameRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FrameRect`(`hdc` : `HDC`, `lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `hbr` : `HBRUSH`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FrameRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FrameRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`, `hbr` : `HBRUSH`, `w` : Int, `h` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiAlphaBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiAlphaBlend`(`hdcdest` : `HDC`, `xorigindest` : Int, `yorigindest` : Int, `wdest` : Int, `hdest` : Int, `hdcsrc` : `HDC`, `xoriginsrc` : Int, `yoriginsrc` : Int, `wsrc` : Int, `hsrc` : Int, `ftn` : `BLENDFUNCTION`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiComment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiComment`(`hdc` : `HDC`, `nsize` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiFlush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiFlush`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGetBatchLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiGetBatchLimit`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiGradientFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiGradientFill`(`hdc` : `HDC`, `pvertex` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRIVERTEX`>?, `nvertex` : UInt, `pmesh` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ncount` : UInt, `ulmode` : `GRADIENT_FILL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiSetBatchLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiSetBatchLimit`(`dw` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GdiTransparentBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiTransparentBlt`(`hdcdest` : `HDC`, `xorigindest` : Int, `yorigindest` : Int, `wdest` : Int, `hdest` : Int, `hdcsrc` : `HDC`, `xoriginsrc` : Int, `yoriginsrc` : Int, `wsrc` : Int, `hsrc` : Int, `crtransparent` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetArcDirection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetArcDirection`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetAspectRatioFilterEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAspectRatioFilterEx`(`hdc` : `HDC`, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetBitmapBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBitmapBits`(`hbit` : `HBITMAP`, `cb` : Int, `lpvbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetBitmapDimensionEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBitmapDimensionEx`(`hbit` : `HBITMAP`, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetBkColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBkColor`(`hdc` : `HDC`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetBkMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBkMode`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetBoundsRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBoundsRect`(`hdc` : `HDC`, `lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetBrushOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBrushOrgEx`(`hdc` : `HDC`, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharABCWidthsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharABCWidthsA`(`hdc` : `HDC`, `wfirst` : UInt, `wlast` : UInt, `lpabc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ABC`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharABCWidthsFloatA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharABCWidthsFloatA`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpabc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ABCFLOAT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharABCWidthsFloatW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharABCWidthsFloatW`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpabc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ABCFLOAT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharABCWidthsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharABCWidthsI`(`hdc` : `HDC`, `gifirst` : UInt, `cgi` : UInt, `pgi` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pabc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ABC`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharABCWidthsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharABCWidthsW`(`hdc` : `HDC`, `wfirst` : UInt, `wlast` : UInt, `lpabc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ABC`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidth32A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidth32A`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidth32W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidth32W`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidthA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidthA`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidthFloatA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidthFloatA`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidthFloatW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidthFloatW`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidthI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidthI`(`hdc` : `HDC`, `gifirst` : UInt, `cgi` : UInt, `pgi` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `piwidths` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharWidthW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharWidthW`(`hdc` : `HDC`, `ifirst` : UInt, `ilast` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharacterPlacementA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharacterPlacementA`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `ncount` : Int, `nmexextent` : Int, `lpresults` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GCP_RESULTSA`>?, `dwflags` : `GET_CHARACTER_PLACEMENT_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCharacterPlacementW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCharacterPlacementW`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `ncount` : Int, `nmexextent` : Int, `lpresults` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GCP_RESULTSW`>?, `dwflags` : `GET_CHARACTER_PLACEMENT_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetClipBox; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipBox`(`hdc` : `HDC`, `lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetClipRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetColorAdjustment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetColorAdjustment`(`hdc` : `HDC`, `lpca` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COLORADJUSTMENT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCurrentObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentObject`(`hdc` : `HDC`, `type` : UInt) : `HGDIOBJ`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetCurrentPositionEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPositionEx`(`hdc` : `HDC`, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDC`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDCBrushColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDCBrushColor`(`hdc` : `HDC`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDCEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDCEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrgnclip` : `HRGN`, `flags` : `GET_DCX_FLAGS`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDCOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDCOrgEx`(`hdc` : `HDC`, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDCPenColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDCPenColor`(`hdc` : `HDC`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDIBColorTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDIBColorTable`(`hdc` : `HDC`, `istart` : UInt, `centries` : UInt, `prgbq` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RGBQUAD`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDIBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDIBits`(`hdc` : `HDC`, `hbm` : `HBITMAP`, `start` : UInt, `clines` : UInt, `lpvbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbmi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BITMAPINFO`>?, `usage` : `DIB_USAGE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetDeviceCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDeviceCaps`(`hdc` : `HDC`, `index` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFileA`(`lpname` : `windows_sys`.`core`.`PCSTR`) : `HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFileBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFileBits`(`hemf` : `HENHMETAFILE`, `nsize` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFileDescriptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFileDescriptionA`(`hemf` : `HENHMETAFILE`, `cchbuffer` : UInt, `lpdescription` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFileDescriptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFileDescriptionW`(`hemf` : `HENHMETAFILE`, `cchbuffer` : UInt, `lpdescription` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFileHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFileHeader`(`hemf` : `HENHMETAFILE`, `nsize` : UInt, `lpenhmetaheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENHMETAHEADER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFilePaletteEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFilePaletteEntries`(`hemf` : `HENHMETAFILE`, `nnumentries` : UInt, `lppaletteentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PALETTEENTRY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnhMetaFileW`(`lpname` : `windows_sys`.`core`.`PCWSTR`) : `HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetFontData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFontData`(`hdc` : `HDC`, `dwtable` : UInt, `dwoffset` : UInt, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cjbuffer` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetFontLanguageInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFontLanguageInfo`(`hdc` : `HDC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetFontUnicodeRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFontUnicodeRanges`(`hdc` : `HDC`, `lpgs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHSET`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetGlyphIndicesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGlyphIndicesA`(`hdc` : `HDC`, `lpstr` : `windows_sys`.`core`.`PCSTR`, `c` : Int, `pgi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `fl` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetGlyphIndicesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGlyphIndicesW`(`hdc` : `HDC`, `lpstr` : `windows_sys`.`core`.`PCWSTR`, `c` : Int, `pgi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `fl` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetGlyphOutlineA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGlyphOutlineA`(`hdc` : `HDC`, `uchar` : UInt, `fuformat` : `GET_GLYPH_OUTLINE_FORMAT`, `lpgm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHMETRICS`>?, `cjbuffer` : UInt, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpmat2` : /* Rust *const */ kotlinx.cinterop.CPointer<`MAT2`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetGlyphOutlineW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGlyphOutlineW`(`hdc` : `HDC`, `uchar` : UInt, `fuformat` : `GET_GLYPH_OUTLINE_FORMAT`, `lpgm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHMETRICS`>?, `cjbuffer` : UInt, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpmat2` : /* Rust *const */ kotlinx.cinterop.CPointer<`MAT2`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetGraphicsMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGraphicsMode`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetKerningPairsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKerningPairsA`(`hdc` : `HDC`, `npairs` : UInt, `lpkernpair` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KERNINGPAIR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetKerningPairsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKerningPairsW`(`hdc` : `HDC`, `npairs` : UInt, `lpkernpair` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KERNINGPAIR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLayout`(`hdc` : `HDC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetMapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMapMode`(`hdc` : `HDC`) : `HDC_MAP_MODE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetMetaFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMetaFileA`(`lpname` : `windows_sys`.`core`.`PCSTR`) : `HMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetMetaFileBitsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMetaFileBitsEx`(`hmf` : `HMETAFILE`, `cbbuffer` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetMetaFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMetaFileW`(`lpname` : `windows_sys`.`core`.`PCWSTR`) : `HMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetMetaRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMetaRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetMiterLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMiterLimit`(`hdc` : `HDC`, `plimit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMonitorInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorInfoA`(`hmonitor` : `HMONITOR`, `lpmi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MONITORINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMonitorInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorInfoW`(`hmonitor` : `HMONITOR`, `lpmi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MONITORINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetNearestColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNearestColor`(`hdc` : `HDC`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetNearestPaletteIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNearestPaletteIndex`(`h` : `HPALETTE`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetObjectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetObjectA`(`h` : `HGDIOBJ`, `c` : Int, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetObjectType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetObjectType`(`h` : `HGDIOBJ`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetObjectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetObjectW`(`h` : `HGDIOBJ`, `c` : Int, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetOutlineTextMetricsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOutlineTextMetricsA`(`hdc` : `HDC`, `cjcopy` : UInt, `potm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OUTLINETEXTMETRICA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetOutlineTextMetricsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOutlineTextMetricsW`(`hdc` : `HDC`, `cjcopy` : UInt, `potm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OUTLINETEXTMETRICW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetPaletteEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPaletteEntries`(`hpal` : `HPALETTE`, `istart` : UInt, `centries` : UInt, `ppalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PALETTEENTRY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPath`(`hdc` : `HDC`, `apt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `aj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cpt` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetPixel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPixel`(`hdc` : `HDC`, `x` : Int, `y` : Int) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetPolyFillMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPolyFillMode`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetROP2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetROP2`(`hdc` : `HDC`) : `R2_MODE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetRandomRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRandomRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`, `i` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetRasterizerCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRasterizerCaps`(`lpraststat` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASTERIZER_STATUS`>?, `cjbytes` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetRegionData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRegionData`(`hrgn` : `HRGN`, `ncount` : UInt, `lprgndata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RGNDATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetRgnBox; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRgnBox`(`hrgn` : `HRGN`, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetStockObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStockObject`(`i` : `GET_STOCK_OBJECT_FLAGS`) : `HGDIOBJ`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetStretchBltMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStretchBltMode`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSysColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSysColor`(`nindex` : `SYS_COLOR_INDEX`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSysColorBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSysColorBrush`(`nindex` : `SYS_COLOR_INDEX`) : `HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetSystemPaletteEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemPaletteEntries`(`hdc` : `HDC`, `istart` : UInt, `centries` : UInt, `ppalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PALETTEENTRY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetSystemPaletteUse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemPaletteUse`(`hdc` : `HDC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetTabbedTextExtentA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTabbedTextExtentA`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `chcount` : Int, `ntabpositions` : Int, `lpntabstoppositions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetTabbedTextExtentW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTabbedTextExtentW`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `chcount` : Int, `ntabpositions` : Int, `lpntabstoppositions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextAlign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextAlign`(`hdc` : `HDC`) : `TEXT_ALIGN_OPTIONS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextCharacterExtra; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextCharacterExtra`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextColor`(`hdc` : `HDC`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentExPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentExPointA`(`hdc` : `HDC`, `lpszstring` : `windows_sys`.`core`.`PCSTR`, `cchstring` : Int, `nmaxextent` : Int, `lpnfit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpndx` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentExPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentExPointI`(`hdc` : `HDC`, `lpwszstring` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cwchstring` : Int, `nmaxextent` : Int, `lpnfit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpndx` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentExPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentExPointW`(`hdc` : `HDC`, `lpszstring` : `windows_sys`.`core`.`PCWSTR`, `cchstring` : Int, `nmaxextent` : Int, `lpnfit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpndx` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentPoint32A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentPoint32A`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `c` : Int, `psizl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentPoint32W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentPoint32W`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `c` : Int, `psizl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentPointA`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `c` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentPointI`(`hdc` : `HDC`, `pgiin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cgi` : Int, `psize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextExtentPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextExtentPointW`(`hdc` : `HDC`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `c` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextFaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextFaceA`(`hdc` : `HDC`, `c` : Int, `lpname` : `windows_sys`.`core`.`PSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextFaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextFaceW`(`hdc` : `HDC`, `c` : Int, `lpname` : `windows_sys`.`core`.`PWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextMetricsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextMetricsA`(`hdc` : `HDC`, `lptm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TEXTMETRICA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetTextMetricsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTextMetricsW`(`hdc` : `HDC`, `lptm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TEXTMETRICW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetUpdateRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUpdateRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `berase` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetUpdateRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUpdateRgn`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrgn` : `HRGN`, `berase` : `windows_sys`.`core`.`BOOL`) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetViewportExtEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetViewportExtEx`(`hdc` : `HDC`, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetViewportOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetViewportOrgEx`(`hdc` : `HDC`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetWinMetaFileBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWinMetaFileBits`(`hemf` : `HENHMETAFILE`, `cbdata16` : UInt, `pdata16` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `imapmode` : Int, `hdcref` : `HDC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowDC`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetWindowExtEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowExtEx`(`hdc` : `HDC`, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetWindowOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowOrgEx`(`hdc` : `HDC`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowRgn`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrgn` : `HRGN`) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowRgnBox; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowRgnBox`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWorldTransform`(`hdc` : `HDC`, `lpxf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msimg32.dll, ABI=system, export=GradientFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GradientFill`(`hdc` : `HDC`, `pvertex` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRIVERTEX`>?, `nvertex` : UInt, `pmesh` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nmesh` : UInt, `ulmode` : `GRADIENT_FILL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GrayStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GrayStringA`(`hdc` : `HDC`, `hbrush` : `HBRUSH`, `lpoutputfunc` : `GRAYSTRINGPROC`, `lpdata` : `super`.`super`.`Foundation`.`LPARAM`, `ncount` : Int, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GrayStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GrayStringW`(`hdc` : `HDC`, `hbrush` : `HBRUSH`, `lpoutputfunc` : `GRAYSTRINGPROC`, `lpdata` : `super`.`super`.`Foundation`.`LPARAM`, `ncount` : Int, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InflateRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InflateRect`(`lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dx` : Int, `dy` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=IntersectClipRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IntersectClipRect`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IntersectRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IntersectRect`(`lprcdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InvalidateRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InvalidateRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `berase` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InvalidateRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InvalidateRgn`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrgn` : `HRGN`, `berase` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InvertRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InvertRect`(`hdc` : `HDC`, `lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=InvertRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InvertRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsRectEmpty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsRectEmpty`(`lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=LPtoDP; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPtoDP`(`hdc` : `HDC`, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `c` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=LineDDA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LineDDA`(`xstart` : Int, `ystart` : Int, `xend` : Int, `yend` : Int, `lpproc` : `LINEDDAPROC`, `data` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=LineTo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LineTo`(`hdc` : `HDC`, `x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadBitmapA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadBitmapA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpbitmapname` : `windows_sys`.`core`.`PCSTR`) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadBitmapW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadBitmapW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpbitmapname` : `windows_sys`.`core`.`PCWSTR`) : `HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LockWindowUpdate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LockWindowUpdate`(`hwndlock` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MapWindowPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapWindowPoints`(`hwndfrom` : `super`.`super`.`Foundation`.`HWND`, `hwndto` : `super`.`super`.`Foundation`.`HWND`, `lppoints` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpoints` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=MaskBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MaskBlt`(`hdcdest` : `HDC`, `xdest` : Int, `ydest` : Int, `width` : Int, `height` : Int, `hdcsrc` : `HDC`, `xsrc` : Int, `ysrc` : Int, `hbmmask` : `HBITMAP`, `xmask` : Int, `ymask` : Int, `rop` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fontsub.dll, ABI=C, export=MergeFontPackage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MergeFontPackage`(`puchmergefontbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ulmergefontbuffersize` : UInt, `puchfontpackagebuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ulfontpackagebuffersize` : UInt, `ppuchdestbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `puldestbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `usmode` : UShort, `lpfnallocate` : `CFP_ALLOCPROC`, `lpfnreallocate` : `CFP_REALLOCPROC`, `lpfnfree` : `CFP_FREEPROC`, `lpvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ModifyWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ModifyWorldTransform`(`hdc` : `HDC`, `lpxf` : /* Rust *const */ kotlinx.cinterop.CPointer<`XFORM`>?, `mode` : `MODIFY_WORLD_TRANSFORM_MODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MonitorFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MonitorFromPoint`(`pt` : `super`.`super`.`Foundation`.`POINT`, `dwflags` : `MONITOR_FROM_FLAGS`) : `HMONITOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MonitorFromRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MonitorFromRect`(`lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwflags` : `MONITOR_FROM_FLAGS`) : `HMONITOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MonitorFromWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MonitorFromWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : `MONITOR_FROM_FLAGS`) : `HMONITOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=MoveToEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveToEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=OffsetClipRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OffsetClipRgn`(`hdc` : `HDC`, `x` : Int, `y` : Int) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OffsetRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OffsetRect`(`lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dx` : Int, `dy` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=OffsetRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OffsetRgn`(`hrgn` : `HRGN`, `x` : Int, `y` : Int) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=OffsetViewportOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OffsetViewportOrgEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=OffsetWindowOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OffsetWindowOrgEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PaintDesktop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PaintDesktop`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PaintRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PaintRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PatBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PatBlt`(`hdc` : `HDC`, `x` : Int, `y` : Int, `w` : Int, `h` : Int, `rop` : `ROP_CODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PathToRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PathToRegion`(`hdc` : `HDC`) : `HRGN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Pie; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Pie`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int, `xr1` : Int, `yr1` : Int, `xr2` : Int, `yr2` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PlayEnhMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlayEnhMetaFile`(`hdc` : `HDC`, `hmf` : `HENHMETAFILE`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PlayEnhMetaFileRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlayEnhMetaFileRecord`(`hdc` : `HDC`, `pht` : /* Rust *const */ kotlinx.cinterop.CPointer<`HANDLETABLE`>?, `pmr` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENHMETARECORD`>?, `cht` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PlayMetaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlayMetaFile`(`hdc` : `HDC`, `hmf` : `HMETAFILE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PlayMetaFileRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlayMetaFileRecord`(`hdc` : `HDC`, `lphandletable` : /* Rust *const */ kotlinx.cinterop.CPointer<`HANDLETABLE`>?, `lpmr` : /* Rust *const */ kotlinx.cinterop.CPointer<`METARECORD`>?, `noobjs` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PlgBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PlgBlt`(`hdcdest` : `HDC`, `lppoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `hdcsrc` : `HDC`, `xsrc` : Int, `ysrc` : Int, `width` : Int, `height` : Int, `hbmmask` : `HBITMAP`, `xmask` : Int, `ymask` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyBezier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyBezier`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpt` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyBezierTo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyBezierTo`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpt` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyDraw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyDraw`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `aj` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cpt` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyPolygon`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `asz` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `csz` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyPolyline; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyPolyline`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `asz` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `csz` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyTextOutA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyTextOutA`(`hdc` : `HDC`, `ppt` : /* Rust *const */ kotlinx.cinterop.CPointer<`POLYTEXTA`>?, `nstrings` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolyTextOutW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolyTextOutW`(`hdc` : `HDC`, `ppt` : /* Rust *const */ kotlinx.cinterop.CPointer<`POLYTEXTW`>?, `nstrings` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Polygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Polygon`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpt` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Polyline; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Polyline`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpt` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PolylineTo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PolylineTo`(`hdc` : `HDC`, `apt` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `cpt` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PtInRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PtInRect`(`lprc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pt` : `super`.`super`.`Foundation`.`POINT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PtInRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PtInRegion`(`hrgn` : `HRGN`, `x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PtVisible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PtVisible`(`hdc` : `HDC`, `x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RealizePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RealizePalette`(`hdc` : `HDC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RectInRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RectInRegion`(`hrgn` : `HRGN`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RectVisible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RectVisible`(`hdc` : `HDC`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Rectangle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Rectangle`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RedrawWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RedrawWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprcupdate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `hrgnupdate` : `HRGN`, `flags` : `REDRAW_WINDOW_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ReleaseDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReleaseDC`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RemoveFontMemResourceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveFontMemResourceEx`(`h` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RemoveFontResourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveFontResourceA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RemoveFontResourceExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveFontResourceExA`(`name` : `windows_sys`.`core`.`PCSTR`, `fl` : UInt, `pdv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RemoveFontResourceExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveFontResourceExW`(`name` : `windows_sys`.`core`.`PCWSTR`, `fl` : UInt, `pdv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RemoveFontResourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveFontResourceW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ResetDCA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResetDCA`(`hdc` : `HDC`, `lpdm` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEA`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ResetDCW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResetDCW`(`hdc` : `HDC`, `lpdm` : /* Rust *const */ kotlinx.cinterop.CPointer<`DEVMODEW`>?) : `HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ResizePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResizePalette`(`hpal` : `HPALETTE`, `n` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RestoreDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RestoreDC`(`hdc` : `HDC`, `nsaveddc` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=RoundRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RoundRect`(`hdc` : `HDC`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int, `width` : Int, `height` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SaveDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaveDC`(`hdc` : `HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ScaleViewportExtEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScaleViewportExtEx`(`hdc` : `HDC`, `xn` : Int, `dx` : Int, `yn` : Int, `yd` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ScaleWindowExtEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScaleWindowExtEx`(`hdc` : `HDC`, `xn` : Int, `xd` : Int, `yn` : Int, `yd` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ScreenToClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScreenToClient`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SelectClipPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectClipPath`(`hdc` : `HDC`, `mode` : `RGN_COMBINE_MODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SelectClipRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectClipRgn`(`hdc` : `HDC`, `hrgn` : `HRGN`) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SelectObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectObject`(`hdc` : `HDC`, `h` : `HGDIOBJ`) : `HGDIOBJ`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SelectPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectPalette`(`hdc` : `HDC`, `hpal` : `HPALETTE`, `bforcebkgd` : `windows_sys`.`core`.`BOOL`) : `HPALETTE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetArcDirection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetArcDirection`(`hdc` : `HDC`, `dir` : `ARC_DIRECTION`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetBitmapBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetBitmapBits`(`hbm` : `HBITMAP`, `cb` : UInt, `pvbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetBitmapDimensionEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetBitmapDimensionEx`(`hbm` : `HBITMAP`, `w` : Int, `h` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetBkColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetBkColor`(`hdc` : `HDC`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetBkMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetBkMode`(`hdc` : `HDC`, `mode` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetBoundsRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetBoundsRect`(`hdc` : `HDC`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `flags` : `SET_BOUNDS_RECT_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetBrushOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetBrushOrgEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetColorAdjustment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetColorAdjustment`(`hdc` : `HDC`, `lpca` : /* Rust *const */ kotlinx.cinterop.CPointer<`COLORADJUSTMENT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetDCBrushColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDCBrushColor`(`hdc` : `HDC`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetDCPenColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDCPenColor`(`hdc` : `HDC`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetDIBColorTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDIBColorTable`(`hdc` : `HDC`, `istart` : UInt, `centries` : UInt, `prgbq` : /* Rust *const */ kotlinx.cinterop.CPointer<`RGBQUAD`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetDIBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDIBits`(`hdc` : `HDC`, `hbm` : `HBITMAP`, `start` : UInt, `clines` : UInt, `lpbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAPINFO`>?, `coloruse` : `DIB_USAGE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetDIBitsToDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDIBitsToDevice`(`hdc` : `HDC`, `xdest` : Int, `ydest` : Int, `w` : UInt, `h` : UInt, `xsrc` : Int, `ysrc` : Int, `startscan` : UInt, `clines` : UInt, `lpvbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAPINFO`>?, `coloruse` : `DIB_USAGE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetEnhMetaFileBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEnhMetaFileBits`(`nsize` : UInt, `pb` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetGraphicsMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetGraphicsMode`(`hdc` : `HDC`, `imode` : `GRAPHICS_MODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetLayout`(`hdc` : `HDC`, `l` : `DC_LAYOUT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetMapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMapMode`(`hdc` : `HDC`, `imode` : `HDC_MAP_MODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetMapperFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMapperFlags`(`hdc` : `HDC`, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetMetaFileBitsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMetaFileBitsEx`(`cbbuffer` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `HMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetMetaRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMetaRgn`(`hdc` : `HDC`) : `GDI_REGION_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetMiterLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMiterLimit`(`hdc` : `HDC`, `limit` : Float, `old` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetPaletteEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPaletteEntries`(`hpal` : `HPALETTE`, `istart` : UInt, `centries` : UInt, `ppalentries` : /* Rust *const */ kotlinx.cinterop.CPointer<`PALETTEENTRY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetPixel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPixel`(`hdc` : `HDC`, `x` : Int, `y` : Int, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetPixelV; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPixelV`(`hdc` : `HDC`, `x` : Int, `y` : Int, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetPolyFillMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPolyFillMode`(`hdc` : `HDC`, `mode` : `CREATE_POLYGON_RGN_MODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetROP2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetROP2`(`hdc` : `HDC`, `rop2` : `R2_MODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetRect`(`lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `xleft` : Int, `ytop` : Int, `xright` : Int, `ybottom` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetRectEmpty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetRectEmpty`(`lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetRectRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetRectRgn`(`hrgn` : `HRGN`, `left` : Int, `top` : Int, `right` : Int, `bottom` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetStretchBltMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetStretchBltMode`(`hdc` : `HDC`, `mode` : `STRETCH_BLT_MODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetSysColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSysColors`(`celements` : Int, `lpaelements` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpargbvalues` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`COLORREF`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetSystemPaletteUse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemPaletteUse`(`hdc` : `HDC`, `use` : `SYSTEM_PALETTE_USE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetTextAlign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTextAlign`(`hdc` : `HDC`, `align` : `TEXT_ALIGN_OPTIONS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetTextCharacterExtra; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTextCharacterExtra`(`hdc` : `HDC`, `extra` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetTextColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTextColor`(`hdc` : `HDC`, `color` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetTextJustification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTextJustification`(`hdc` : `HDC`, `extra` : Int, `count` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetViewportExtEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetViewportExtEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetViewportOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetViewportOrgEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetWindowExtEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowExtEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetWindowOrgEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowOrgEx`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowRgn`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrgn` : `HRGN`, `bredraw` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWorldTransform`(`hdc` : `HDC`, `lpxf` : /* Rust *const */ kotlinx.cinterop.CPointer<`XFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StretchBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StretchBlt`(`hdcdest` : `HDC`, `xdest` : Int, `ydest` : Int, `wdest` : Int, `hdest` : Int, `hdcsrc` : `HDC`, `xsrc` : Int, `ysrc` : Int, `wsrc` : Int, `hsrc` : Int, `rop` : `ROP_CODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StretchDIBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StretchDIBits`(`hdc` : `HDC`, `xdest` : Int, `ydest` : Int, `destwidth` : Int, `destheight` : Int, `xsrc` : Int, `ysrc` : Int, `srcwidth` : Int, `srcheight` : Int, `lpbits` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`BITMAPINFO`>?, `iusage` : `DIB_USAGE`, `rop` : `ROP_CODE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StrokeAndFillPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StrokeAndFillPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StrokePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StrokePath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SubtractRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SubtractRect`(`lprcdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTCharToUnicode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTCharToUnicode`(`hdc` : `HDC`, `puccharcodes` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ulcharcodesize` : UInt, `pusshortcodes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ulshortcodesize` : UInt, `ulflags` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTDeleteEmbeddedFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTDeleteEmbeddedFont`(`hfontreference` : `super`.`super`.`Foundation`.`HANDLE`, `ulflags` : UInt, `pulstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTEmbedFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTEmbedFont`(`hdc` : `HDC`, `ulflags` : `TTEMBED_FLAGS`, `ulcharset` : `EMBED_FONT_CHARSET`, `pulprivstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EMBEDDED_FONT_PRIV_STATUS`>?, `pulstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfnwritetostream` : `WRITEEMBEDPROC`, `lpvwritestream` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `puscharcodeset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `uscharcodecount` : UShort, `uslanguage` : UShort, `pttembedinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTEMBEDINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTEmbedFontEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTEmbedFontEx`(`hdc` : `HDC`, `ulflags` : `TTEMBED_FLAGS`, `ulcharset` : `EMBED_FONT_CHARSET`, `pulprivstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EMBEDDED_FONT_PRIV_STATUS`>?, `pulstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfnwritetostream` : `WRITEEMBEDPROC`, `lpvwritestream` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pulcharcodeset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `uscharcodecount` : UShort, `uslanguage` : UShort, `pttembedinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTEMBEDINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTEmbedFontFromFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTEmbedFontFromFileA`(`hdc` : `HDC`, `szfontfilename` : `windows_sys`.`core`.`PCSTR`, `usttcindex` : UShort, `ulflags` : `TTEMBED_FLAGS`, `ulcharset` : `EMBED_FONT_CHARSET`, `pulprivstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EMBEDDED_FONT_PRIV_STATUS`>?, `pulstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfnwritetostream` : `WRITEEMBEDPROC`, `lpvwritestream` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `puscharcodeset` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `uscharcodecount` : UShort, `uslanguage` : UShort, `pttembedinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTEMBEDINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTEnableEmbeddingForFacename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTEnableEmbeddingForFacename`(`lpszfacename` : `windows_sys`.`core`.`PCSTR`, `benable` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTGetEmbeddedFontInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTGetEmbeddedFontInfo`(`ulflags` : `TTEMBED_FLAGS`, `pulprivstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ulprivs` : `FONT_LICENSE_PRIVS`, `pulstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfnreadfromstream` : `READEMBEDPROC`, `lpvreadstream` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pttloadinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTLOADINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTGetEmbeddingType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTGetEmbeddingType`(`hdc` : `HDC`, `pulembedtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EMBEDDED_FONT_PRIV_STATUS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTGetNewFontName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTGetNewFontName`(`phfontreference` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `wzwinfamilyname` : `windows_sys`.`core`.`PWSTR`, `cchmaxwinname` : Int, `szmacfamilyname` : `windows_sys`.`core`.`PSTR`, `cchmaxmacname` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTIsEmbeddingEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTIsEmbeddingEnabled`(`hdc` : `HDC`, `pbenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTIsEmbeddingEnabledForFacename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTIsEmbeddingEnabledForFacename`(`lpszfacename` : `windows_sys`.`core`.`PCSTR`, `pbenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTLoadEmbeddedFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTLoadEmbeddedFont`(`phfontreference` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `ulflags` : UInt, `pulprivstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EMBEDDED_FONT_PRIV_STATUS`>?, `ulprivs` : `FONT_LICENSE_PRIVS`, `pulstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TTLOAD_EMBEDDED_FONT_STATUS`>?, `lpfnreadfromstream` : `READEMBEDPROC`, `lpvreadstream` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szwinfamilyname` : `windows_sys`.`core`.`PCWSTR`, `szmacfamilyname` : `windows_sys`.`core`.`PCSTR`, `pttloadinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTLOADINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTRunValidationTests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTRunValidationTests`(`hdc` : `HDC`, `ptestparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTVALIDATIONTESTSPARAMS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=t2embed.dll, ABI=system, export=TTRunValidationTestsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TTRunValidationTestsEx`(`hdc` : `HDC`, `ptestparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`TTVALIDATIONTESTSPARAMSEX`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TabbedTextOutA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TabbedTextOutA`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lpstring` : `windows_sys`.`core`.`PCSTR`, `chcount` : Int, `ntabpositions` : Int, `lpntabstoppositions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `ntaborigin` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TabbedTextOutW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TabbedTextOutW`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `chcount` : Int, `ntabpositions` : Int, `lpntabstoppositions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `ntaborigin` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=TextOutA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextOutA`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lpstring` : `windows_sys`.`core`.`PCSTR`, `c` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=TextOutW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextOutW`(`hdc` : `HDC`, `x` : Int, `y` : Int, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `c` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msimg32.dll, ABI=system, export=TransparentBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TransparentBlt`(`hdcdest` : `HDC`, `xorigindest` : Int, `yorigindest` : Int, `wdest` : Int, `hdest` : Int, `hdcsrc` : `HDC`, `xoriginsrc` : Int, `yoriginsrc` : Int, `wsrc` : Int, `hsrc` : Int, `crtransparent` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnionRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnionRect`(`lprcdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcsrc2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=UnrealizeObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnrealizeObject`(`h` : `HGDIOBJ`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=UpdateColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateColors`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UpdateWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ValidateRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ValidateRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ValidateRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ValidateRgn`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hrgn` : `HRGN`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=WidenPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WidenPath`(`hdc` : `HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WindowFromDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WindowFromDC`(`hdc` : `HDC`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglSwapMultipleBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wglSwapMultipleBuffers`(`param0` : UInt, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`WGLSWAP`>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ABC` (
    public var `abcA`: Int,
    public var `abcB`: UInt,
    public var `abcC`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ABCFLOAT` (
    public var `abcfA`: Float,
    public var `abcfB`: Float,
    public var `abcfC`: Float,
)
public const val `ABORTDOC`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ABORTPATH` (
    public var `emr`: `EMR`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AXESLISTA` (
    public var `axlReserved`: UInt,
    public var `axlNumAxes`: UInt,
    public var `axlAxisInfo`: Array<`AXISINFOA`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AXESLISTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AXESLISTA`.Companion.`default`() : `AXESLISTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AXESLISTW` (
    public var `axlReserved`: UInt,
    public var `axlNumAxes`: UInt,
    public var `axlAxisInfo`: Array<`AXISINFOW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AXESLISTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AXESLISTW`.Companion.`default`() : `AXESLISTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AXISINFOA` (
    public var `axMinValue`: Int,
    public var `axMaxValue`: Int,
    public var `axAxisName`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AXISINFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AXISINFOA`.Companion.`default`() : `AXISINFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AXISINFOW` (
    public var `axMinValue`: Int,
    public var `axMaxValue`: Int,
    public var `axAxisName`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AXISINFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AXISINFOW`.Companion.`default`() : `AXISINFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BITMAP` (
    public var `bmType`: Int,
    public var `bmWidth`: Int,
    public var `bmHeight`: Int,
    public var `bmWidthBytes`: Int,
    public var `bmPlanes`: UShort,
    public var `bmBitsPixel`: UShort,
    public var `bmBits`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BITMAP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BITMAP`.Companion.`default`() : `BITMAP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BITMAPCOREHEADER` (
    public var `bcSize`: UInt,
    public var `bcWidth`: UShort,
    public var `bcHeight`: UShort,
    public var `bcPlanes`: UShort,
    public var `bcBitCount`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BITMAPCOREINFO` (
    public var `bmciHeader`: `BITMAPCOREHEADER`,
    public var `bmciColors`: Array<`RGBTRIPLE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BITMAPCOREINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BITMAPCOREINFO`.Companion.`default`() : `BITMAPCOREINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BITMAPFILEHEADER` (
    public var `bfType`: UShort,
    public var `bfSize`: UInt,
    public var `bfReserved1`: UShort,
    public var `bfReserved2`: UShort,
    public var `bfOffBits`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BITMAPINFO` (
    public var `bmiHeader`: `BITMAPINFOHEADER`,
    public var `bmiColors`: Array<`RGBQUAD`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BITMAPINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BITMAPINFO`.Companion.`default`() : `BITMAPINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BITMAPINFOHEADER` (
    public var `biSize`: UInt,
    public var `biWidth`: Int,
    public var `biHeight`: Int,
    public var `biPlanes`: UShort,
    public var `biBitCount`: UShort,
    public var `biCompression`: UInt,
    public var `biSizeImage`: UInt,
    public var `biXPelsPerMeter`: Int,
    public var `biYPelsPerMeter`: Int,
    public var `biClrUsed`: UInt,
    public var `biClrImportant`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BITMAPV4HEADER` (
    public var `bV4Size`: UInt,
    public var `bV4Width`: Int,
    public var `bV4Height`: Int,
    public var `bV4Planes`: UShort,
    public var `bV4BitCount`: UShort,
    public var `bV4V4Compression`: `BI_COMPRESSION`,
    public var `bV4SizeImage`: UInt,
    public var `bV4XPelsPerMeter`: Int,
    public var `bV4YPelsPerMeter`: Int,
    public var `bV4ClrUsed`: UInt,
    public var `bV4ClrImportant`: UInt,
    public var `bV4RedMask`: UInt,
    public var `bV4GreenMask`: UInt,
    public var `bV4BlueMask`: UInt,
    public var `bV4AlphaMask`: UInt,
    public var `bV4CSType`: UInt,
    public var `bV4Endpoints`: `CIEXYZTRIPLE`,
    public var `bV4GammaRed`: UInt,
    public var `bV4GammaGreen`: UInt,
    public var `bV4GammaBlue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BITMAPV5HEADER` (
    public var `bV5Size`: UInt,
    public var `bV5Width`: Int,
    public var `bV5Height`: Int,
    public var `bV5Planes`: UShort,
    public var `bV5BitCount`: UShort,
    public var `bV5Compression`: `BI_COMPRESSION`,
    public var `bV5SizeImage`: UInt,
    public var `bV5XPelsPerMeter`: Int,
    public var `bV5YPelsPerMeter`: Int,
    public var `bV5ClrUsed`: UInt,
    public var `bV5ClrImportant`: UInt,
    public var `bV5RedMask`: UInt,
    public var `bV5GreenMask`: UInt,
    public var `bV5BlueMask`: UInt,
    public var `bV5AlphaMask`: UInt,
    public var `bV5CSType`: UInt,
    public var `bV5Endpoints`: `CIEXYZTRIPLE`,
    public var `bV5GammaRed`: UInt,
    public var `bV5GammaGreen`: UInt,
    public var `bV5GammaBlue`: UInt,
    public var `bV5Intent`: UInt,
    public var `bV5ProfileData`: UInt,
    public var `bV5ProfileSize`: UInt,
    public var `bV5Reserved`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BLENDFUNCTION` (
    public var `BlendOp`: UByte,
    public var `BlendFlags`: UByte,
    public var `SourceConstantAlpha`: UByte,
    public var `AlphaFormat`: UByte,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CFP_ALLOCPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CFP_FREEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CFP_REALLOCPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
public const val `CHARSET_DEFAULT`: UInt = 1u;
public const val `CHARSET_GLYPHIDX`: UInt = 3u;
public const val `CHARSET_SYMBOL`: `EMBED_FONT_CHARSET` = 2u;
public const val `CHARSET_UNICODE`: `EMBED_FONT_CHARSET` = 1u;
public const val `CHECKJPEGFORMAT`: UInt = 4119u;
public const val `CHECKPNGFORMAT`: UInt = 4120u;
public const val `CHINESEBIG5_CHARSET`: `FONT_CHARSET` = 136u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CIEXYZ` (
    public var `ciexyzX`: Int,
    public var `ciexyzY`: Int,
    public var `ciexyzZ`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CIEXYZTRIPLE` (
    public var `ciexyzRed`: `CIEXYZ`,
    public var `ciexyzGreen`: `CIEXYZ`,
    public var `ciexyzBlue`: `CIEXYZ`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORADJUSTMENT` (
    public var `caSize`: UShort,
    public var `caFlags`: UShort,
    public var `caIlluminantIndex`: UShort,
    public var `caRedGamma`: UShort,
    public var `caGreenGamma`: UShort,
    public var `caBlueGamma`: UShort,
    public var `caReferenceBlack`: UShort,
    public var `caReferenceWhite`: UShort,
    public var `caContrast`: Short,
    public var `caBrightness`: Short,
    public var `caColorfulness`: Short,
    public var `caRedGreenTint`: Short,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DESIGNVECTOR` (
    public var `dvReserved`: UInt,
    public var `dvNumAxes`: UInt,
    public var `dvValues`: IntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DESIGNVECTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DESIGNVECTOR`.Companion.`default`() : `DESIGNVECTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DESKTOPHORZRES`: `GET_DEVICE_CAPS_INDEX` = 118u;
public const val `DESKTOPVERTRES`: `GET_DEVICE_CAPS_INDEX` = 117u;
public const val `DEVICEDATA`: UInt = 19u;
public const val `DEVICE_DEFAULT_FONT`: `GET_STOCK_OBJECT_FLAGS` = 14;
public const val `DEVICE_FONTTYPE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVMODEA` (
    public var `dmDeviceName`: UByteArray,
    public var `dmSpecVersion`: UShort,
    public var `dmDriverVersion`: UShort,
    public var `dmSize`: UShort,
    public var `dmDriverExtra`: UShort,
    public var `dmFields`: `DEVMODE_FIELD_FLAGS`,
    public var `Anonymous1`: `DEVMODEA_0`,
    public var `dmColor`: `DEVMODE_COLOR`,
    public var `dmDuplex`: `DEVMODE_DUPLEX`,
    public var `dmYResolution`: Short,
    public var `dmTTOption`: `DEVMODE_TRUETYPE_OPTION`,
    public var `dmCollate`: `DEVMODE_COLLATE`,
    public var `dmFormName`: UByteArray,
    public var `dmLogPixels`: UShort,
    public var `dmBitsPerPel`: UInt,
    public var `dmPelsWidth`: UInt,
    public var `dmPelsHeight`: UInt,
    public var `Anonymous2`: `DEVMODEA_1`,
    public var `dmDisplayFrequency`: UInt,
    public var `dmICMMethod`: UInt,
    public var `dmICMIntent`: UInt,
    public var `dmMediaType`: UInt,
    public var `dmDitherType`: UInt,
    public var `dmReserved1`: UInt,
    public var `dmReserved2`: UInt,
    public var `dmPanningWidth`: UInt,
    public var `dmPanningHeight`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEVMODEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DEVMODEA`.Companion.`default`() : `DEVMODEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 906:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEA_0 {
//     pub Anonymous1: DEVMODEA_0_0,
//     pub Anonymous2: DEVMODEA_0_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEVMODEA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DEVMODEA_0`.Companion.`default`() : `DEVMODEA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVMODEA_0_0` (
    public var `dmOrientation`: Short,
    public var `dmPaperSize`: Short,
    public var `dmPaperLength`: Short,
    public var `dmPaperWidth`: Short,
    public var `dmScale`: Short,
    public var `dmCopies`: Short,
    public var `dmDefaultSource`: Short,
    public var `dmPrintQuality`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVMODEA_0_1` (
    public var `dmPosition`: `super`.`super`.`Foundation`.`POINTL`,
    public var `dmDisplayOrientation`: `DEVMODE_DISPLAY_ORIENTATION`,
    public var `dmDisplayFixedOutput`: `DEVMODE_DISPLAY_FIXED_OUTPUT`,
)
// UNSUPPORTED Rust 936:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEA_1 {
//     pub dmDisplayFlags: u32,
//     pub dmNup: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEVMODEA_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DEVMODEA_1`.Companion.`default`() : `DEVMODEA_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVMODEW` (
    public var `dmDeviceName`: UShortArray,
    public var `dmSpecVersion`: UShort,
    public var `dmDriverVersion`: UShort,
    public var `dmSize`: UShort,
    public var `dmDriverExtra`: UShort,
    public var `dmFields`: `DEVMODE_FIELD_FLAGS`,
    public var `Anonymous1`: `DEVMODEW_0`,
    public var `dmColor`: `DEVMODE_COLOR`,
    public var `dmDuplex`: `DEVMODE_DUPLEX`,
    public var `dmYResolution`: Short,
    public var `dmTTOption`: `DEVMODE_TRUETYPE_OPTION`,
    public var `dmCollate`: `DEVMODE_COLLATE`,
    public var `dmFormName`: UShortArray,
    public var `dmLogPixels`: UShort,
    public var `dmBitsPerPel`: UInt,
    public var `dmPelsWidth`: UInt,
    public var `dmPelsHeight`: UInt,
    public var `Anonymous2`: `DEVMODEW_1`,
    public var `dmDisplayFrequency`: UInt,
    public var `dmICMMethod`: UInt,
    public var `dmICMIntent`: UInt,
    public var `dmMediaType`: UInt,
    public var `dmDitherType`: UInt,
    public var `dmReserved1`: UInt,
    public var `dmReserved2`: UInt,
    public var `dmPanningWidth`: UInt,
    public var `dmPanningHeight`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEVMODEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DEVMODEW`.Companion.`default`() : `DEVMODEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 983:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEW_0 {
//     pub Anonymous1: DEVMODEW_0_0,
//     pub Anonymous2: DEVMODEW_0_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEVMODEW_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DEVMODEW_0`.Companion.`default`() : `DEVMODEW_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVMODEW_0_0` (
    public var `dmOrientation`: Short,
    public var `dmPaperSize`: Short,
    public var `dmPaperLength`: Short,
    public var `dmPaperWidth`: Short,
    public var `dmScale`: Short,
    public var `dmCopies`: Short,
    public var `dmDefaultSource`: Short,
    public var `dmPrintQuality`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVMODEW_0_1` (
    public var `dmPosition`: `super`.`super`.`Foundation`.`POINTL`,
    public var `dmDisplayOrientation`: `DEVMODE_DISPLAY_ORIENTATION`,
    public var `dmDisplayFixedOutput`: `DEVMODE_DISPLAY_FIXED_OUTPUT`,
)
// UNSUPPORTED Rust 1013:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEW_1 {
//     pub dmDisplayFlags: u32,
//     pub dmNup: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DEVMODEW_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DEVMODEW_1`.Companion.`default`() : `DEVMODEW_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIBSECTION` (
    public var `dsBm`: `BITMAP`,
    public var `dsBmih`: `BITMAPINFOHEADER`,
    public var `dsBitfields`: UIntArray,
    public var `dshSection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dsOffset`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DIBSECTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DIBSECTION`.Companion.`default`() : `DIBSECTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAY_DEVICEA` (
    public var `cb`: UInt,
    public var `DeviceName`: ByteArray,
    public var `DeviceString`: ByteArray,
    public var `StateFlags`: `DISPLAY_DEVICE_STATE_FLAGS`,
    public var `DeviceID`: ByteArray,
    public var `DeviceKey`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DISPLAY_DEVICEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DISPLAY_DEVICEA`.Companion.`default`() : `DISPLAY_DEVICEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAY_DEVICEW` (
    public var `cb`: UInt,
    public var `DeviceName`: UShortArray,
    public var `DeviceString`: UShortArray,
    public var `StateFlags`: `DISPLAY_DEVICE_STATE_FLAGS`,
    public var `DeviceID`: UShortArray,
    public var `DeviceKey`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DISPLAY_DEVICEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DISPLAY_DEVICEW`.Companion.`default`() : `DISPLAY_DEVICEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DRAWSTATEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HDC`, `super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`WPARAM`, Int, Int) -> `windows_sys`.`core`.`BOOL`>>>;
public typealias `DRAWSTATE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRAWTEXTPARAMS` (
    public var `cbSize`: UInt,
    public var `iTabLength`: Int,
    public var `iLeftMargin`: Int,
    public var `iRightMargin`: Int,
    public var `uiLengthDrawn`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMR` (
    public var `iType`: `ENHANCED_METAFILE_RECORD_TYPE`,
    public var `nSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRALPHABLEND` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `cxDest`: Int,
    public var `cyDest`: Int,
    public var `dwRop`: UInt,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `xformSrc`: `XFORM`,
    public var `crBkColorSrc`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iUsageSrc`: UInt,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `cxSrc`: Int,
    public var `cySrc`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRANGLEARC` (
    public var `emr`: `EMR`,
    public var `ptlCenter`: `super`.`super`.`Foundation`.`POINTL`,
    public var `nRadius`: UInt,
    public var `eStartAngle`: Float,
    public var `eSweepAngle`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRARC` (
    public var `emr`: `EMR`,
    public var `rclBox`: `super`.`super`.`Foundation`.`RECTL`,
    public var `ptlStart`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlEnd`: `super`.`super`.`Foundation`.`POINTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRBITBLT` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `cxDest`: Int,
    public var `cyDest`: Int,
    public var `dwRop`: UInt,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `xformSrc`: `XFORM`,
    public var `crBkColorSrc`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iUsageSrc`: UInt,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCOLORCORRECTPALETTE` (
    public var `emr`: `EMR`,
    public var `ihPalette`: UInt,
    public var `nFirstEntry`: UInt,
    public var `nPalEntries`: UInt,
    public var `nReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRCOLORMATCHTOTARGET` (
    public var `emr`: `EMR`,
    public var `dwAction`: UInt,
    public var `dwFlags`: UInt,
    public var `cbName`: UInt,
    public var `cbData`: UInt,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRCOLORMATCHTOTARGET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRCOLORMATCHTOTARGET`.Companion.`default`() : `EMRCOLORMATCHTOTARGET` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCREATEBRUSHINDIRECT` (
    public var `emr`: `EMR`,
    public var `ihBrush`: UInt,
    public var `lb`: `LOGBRUSH32`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCREATEDIBPATTERNBRUSHPT` (
    public var `emr`: `EMR`,
    public var `ihBrush`: UInt,
    public var `iUsage`: UInt,
    public var `offBmi`: UInt,
    public var `cbBmi`: UInt,
    public var `offBits`: UInt,
    public var `cbBits`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCREATEMONOBRUSH` (
    public var `emr`: `EMR`,
    public var `ihBrush`: UInt,
    public var `iUsage`: UInt,
    public var `offBmi`: UInt,
    public var `cbBmi`: UInt,
    public var `offBits`: UInt,
    public var `cbBits`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCREATEPALETTE` (
    public var `emr`: `EMR`,
    public var `ihPal`: UInt,
    public var `lgpl`: `LOGPALETTE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRCREATEPEN` (
    public var `emr`: `EMR`,
    public var `ihPen`: UInt,
    public var `lopn`: `LOGPEN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRELLIPSE` (
    public var `emr`: `EMR`,
    public var `rclBox`: `super`.`super`.`Foundation`.`RECTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMREOF` (
    public var `emr`: `EMR`,
    public var `nPalEntries`: UInt,
    public var `offPalEntries`: UInt,
    public var `nSizeLast`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMREXCLUDECLIPRECT` (
    public var `emr`: `EMR`,
    public var `rclClip`: `super`.`super`.`Foundation`.`RECTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMREXTCREATEFONTINDIRECTW` (
    public var `emr`: `EMR`,
    public var `ihFont`: UInt,
    public var `elfw`: `EXTLOGFONTW`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMREXTCREATEPEN` (
    public var `emr`: `EMR`,
    public var `ihPen`: UInt,
    public var `offBmi`: UInt,
    public var `cbBmi`: UInt,
    public var `offBits`: UInt,
    public var `cbBits`: UInt,
    public var `elp`: `EXTLOGPEN32`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMREXTESCAPE` (
    public var `emr`: `EMR`,
    public var `iEscape`: Int,
    public var `cbEscData`: Int,
    public var `EscData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMREXTESCAPE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMREXTESCAPE`.Companion.`default`() : `EMREXTESCAPE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMREXTFLOODFILL` (
    public var `emr`: `EMR`,
    public var `ptlStart`: `super`.`super`.`Foundation`.`POINTL`,
    public var `crColor`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iMode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMREXTSELECTCLIPRGN` (
    public var `emr`: `EMR`,
    public var `cbRgnData`: UInt,
    public var `iMode`: UInt,
    public var `RgnData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMREXTSELECTCLIPRGN`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMREXTSELECTCLIPRGN`.Companion.`default`() : `EMREXTSELECTCLIPRGN` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMREXTTEXTOUTA` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `iGraphicsMode`: UInt,
    public var `exScale`: Float,
    public var `eyScale`: Float,
    public var `emrtext`: `EMRTEXT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRFILLPATH` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRFILLRGN` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cbRgnData`: UInt,
    public var `ihBrush`: UInt,
    public var `RgnData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRFILLRGN`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRFILLRGN`.Companion.`default`() : `EMRFILLRGN` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRFORMAT` (
    public var `dSignature`: UInt,
    public var `nVersion`: UInt,
    public var `cbData`: UInt,
    public var `offData`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRFRAMERGN` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cbRgnData`: UInt,
    public var `ihBrush`: UInt,
    public var `szlStroke`: `super`.`super`.`Foundation`.`SIZE`,
    public var `RgnData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRFRAMERGN`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRFRAMERGN`.Companion.`default`() : `EMRFRAMERGN` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRGDICOMMENT` (
    public var `emr`: `EMR`,
    public var `cbData`: UInt,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRGDICOMMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRGDICOMMENT`.Companion.`default`() : `EMRGDICOMMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRGLSBOUNDEDRECORD` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cbData`: UInt,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRGLSBOUNDEDRECORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRGLSBOUNDEDRECORD`.Companion.`default`() : `EMRGLSBOUNDEDRECORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRGLSRECORD` (
    public var `emr`: `EMR`,
    public var `cbData`: UInt,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRGLSRECORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRGLSRECORD`.Companion.`default`() : `EMRGLSRECORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRGRADIENTFILL` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `nVer`: UInt,
    public var `nTri`: UInt,
    public var `ulMode`: `GRADIENT_FILL`,
    public var `Ver`: Array<`TRIVERTEX`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRGRADIENTFILL`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRGRADIENTFILL`.Companion.`default`() : `EMRGRADIENTFILL` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRINVERTRGN` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cbRgnData`: UInt,
    public var `RgnData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRINVERTRGN`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRINVERTRGN`.Companion.`default`() : `EMRINVERTRGN` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRLINETO` (
    public var `emr`: `EMR`,
    public var `ptl`: `super`.`super`.`Foundation`.`POINTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRMASKBLT` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `cxDest`: Int,
    public var `cyDest`: Int,
    public var `dwRop`: UInt,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `xformSrc`: `XFORM`,
    public var `crBkColorSrc`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iUsageSrc`: UInt,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `xMask`: Int,
    public var `yMask`: Int,
    public var `iUsageMask`: UInt,
    public var `offBmiMask`: UInt,
    public var `cbBmiMask`: UInt,
    public var `offBitsMask`: UInt,
    public var `cbBitsMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRMODIFYWORLDTRANSFORM` (
    public var `emr`: `EMR`,
    public var `xform`: `XFORM`,
    public var `iMode`: `MODIFY_WORLD_TRANSFORM_MODE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRNAMEDESCAPE` (
    public var `emr`: `EMR`,
    public var `iEscape`: Int,
    public var `cbDriver`: Int,
    public var `cbEscData`: Int,
    public var `EscData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRNAMEDESCAPE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRNAMEDESCAPE`.Companion.`default`() : `EMRNAMEDESCAPE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMROFFSETCLIPRGN` (
    public var `emr`: `EMR`,
    public var `ptlOffset`: `super`.`super`.`Foundation`.`POINTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPLGBLT` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `aptlDest`: Array<`super`.`super`.`Foundation`.`POINTL`>,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `cxSrc`: Int,
    public var `cySrc`: Int,
    public var `xformSrc`: `XFORM`,
    public var `crBkColorSrc`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iUsageSrc`: UInt,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `xMask`: Int,
    public var `yMask`: Int,
    public var `iUsageMask`: UInt,
    public var `offBmiMask`: UInt,
    public var `cbBmiMask`: UInt,
    public var `offBitsMask`: UInt,
    public var `cbBitsMask`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPLGBLT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPLGBLT`.Companion.`default`() : `EMRPLGBLT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYDRAW` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cptl`: UInt,
    public var `aptl`: Array<`super`.`super`.`Foundation`.`POINTL`>,
    public var `abTypes`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYDRAW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYDRAW`.Companion.`default`() : `EMRPOLYDRAW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYDRAW16` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cpts`: UInt,
    public var `apts`: Array<`super`.`super`.`Foundation`.`POINTS`>,
    public var `abTypes`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYDRAW16`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYDRAW16`.Companion.`default`() : `EMRPOLYDRAW16` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYLINE` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cptl`: UInt,
    public var `aptl`: Array<`super`.`super`.`Foundation`.`POINTL`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYLINE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYLINE`.Companion.`default`() : `EMRPOLYLINE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYLINE16` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `cpts`: UInt,
    public var `apts`: Array<`super`.`super`.`Foundation`.`POINTS`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYLINE16`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYLINE16`.Companion.`default`() : `EMRPOLYLINE16` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYPOLYLINE` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `nPolys`: UInt,
    public var `cptl`: UInt,
    public var `aPolyCounts`: UIntArray,
    public var `aptl`: Array<`super`.`super`.`Foundation`.`POINTL`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYPOLYLINE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYPOLYLINE`.Companion.`default`() : `EMRPOLYPOLYLINE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYPOLYLINE16` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `nPolys`: UInt,
    public var `cpts`: UInt,
    public var `aPolyCounts`: UIntArray,
    public var `apts`: Array<`super`.`super`.`Foundation`.`POINTS`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYPOLYLINE16`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYPOLYLINE16`.Companion.`default`() : `EMRPOLYPOLYLINE16` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRPOLYTEXTOUTA` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `iGraphicsMode`: UInt,
    public var `exScale`: Float,
    public var `eyScale`: Float,
    public var `cStrings`: Int,
    public var `aemrtext`: Array<`EMRTEXT`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRPOLYTEXTOUTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRPOLYTEXTOUTA`.Companion.`default`() : `EMRPOLYTEXTOUTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRRESIZEPALETTE` (
    public var `emr`: `EMR`,
    public var `ihPal`: UInt,
    public var `cEntries`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRRESTOREDC` (
    public var `emr`: `EMR`,
    public var `iRelative`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRROUNDRECT` (
    public var `emr`: `EMR`,
    public var `rclBox`: `super`.`super`.`Foundation`.`RECTL`,
    public var `szlCorner`: `super`.`super`.`Foundation`.`SIZE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSCALEVIEWPORTEXTEX` (
    public var `emr`: `EMR`,
    public var `xNum`: Int,
    public var `xDenom`: Int,
    public var `yNum`: Int,
    public var `yDenom`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSELECTCLIPPATH` (
    public var `emr`: `EMR`,
    public var `iMode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSELECTOBJECT` (
    public var `emr`: `EMR`,
    public var `ihObject`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSELECTPALETTE` (
    public var `emr`: `EMR`,
    public var `ihPal`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETARCDIRECTION` (
    public var `emr`: `EMR`,
    public var `iArcDirection`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETCOLORADJUSTMENT` (
    public var `emr`: `EMR`,
    public var `ColorAdjustment`: `COLORADJUSTMENT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETCOLORSPACE` (
    public var `emr`: `EMR`,
    public var `ihCS`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETDIBITSTODEVICE` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `cxSrc`: Int,
    public var `cySrc`: Int,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `iUsageSrc`: UInt,
    public var `iStartScan`: UInt,
    public var `cScans`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRSETICMPROFILE` (
    public var `emr`: `EMR`,
    public var `dwFlags`: UInt,
    public var `cbName`: UInt,
    public var `cbData`: UInt,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRSETICMPROFILE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRSETICMPROFILE`.Companion.`default`() : `EMRSETICMPROFILE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETMAPPERFLAGS` (
    public var `emr`: `EMR`,
    public var `dwFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETMITERLIMIT` (
    public var `emr`: `EMR`,
    public var `eMiterLimit`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMRSETPALETTEENTRIES` (
    public var `emr`: `EMR`,
    public var `ihPal`: UInt,
    public var `iStart`: UInt,
    public var `cEntries`: UInt,
    public var `aPalEntries`: Array<`PALETTEENTRY`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EMRSETPALETTEENTRIES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EMRSETPALETTEENTRIES`.Companion.`default`() : `EMRSETPALETTEENTRIES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETPIXELV` (
    public var `emr`: `EMR`,
    public var `ptlPixel`: `super`.`super`.`Foundation`.`POINTL`,
    public var `crColor`: `super`.`super`.`Foundation`.`COLORREF`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETTEXTCOLOR` (
    public var `emr`: `EMR`,
    public var `crColor`: `super`.`super`.`Foundation`.`COLORREF`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETVIEWPORTEXTEX` (
    public var `emr`: `EMR`,
    public var `szlExtent`: `super`.`super`.`Foundation`.`SIZE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETVIEWPORTORGEX` (
    public var `emr`: `EMR`,
    public var `ptlOrigin`: `super`.`super`.`Foundation`.`POINTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSETWORLDTRANSFORM` (
    public var `emr`: `EMR`,
    public var `xform`: `XFORM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSTRETCHBLT` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `cxDest`: Int,
    public var `cyDest`: Int,
    public var `dwRop`: UInt,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `xformSrc`: `XFORM`,
    public var `crBkColorSrc`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iUsageSrc`: UInt,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `cxSrc`: Int,
    public var `cySrc`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRSTRETCHDIBITS` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `cxSrc`: Int,
    public var `cySrc`: Int,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `iUsageSrc`: UInt,
    public var `dwRop`: UInt,
    public var `cxDest`: Int,
    public var `cyDest`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRTEXT` (
    public var `ptlReference`: `super`.`super`.`Foundation`.`POINTL`,
    public var `nChars`: UInt,
    public var `offString`: UInt,
    public var `fOptions`: UInt,
    public var `rcl`: `super`.`super`.`Foundation`.`RECTL`,
    public var `offDx`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRTRANSPARENTBLT` (
    public var `emr`: `EMR`,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `xDest`: Int,
    public var `yDest`: Int,
    public var `cxDest`: Int,
    public var `cyDest`: Int,
    public var `dwRop`: UInt,
    public var `xSrc`: Int,
    public var `ySrc`: Int,
    public var `xformSrc`: `XFORM`,
    public var `crBkColorSrc`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iUsageSrc`: UInt,
    public var `offBmiSrc`: UInt,
    public var `cbBmiSrc`: UInt,
    public var `offBitsSrc`: UInt,
    public var `cbBitsSrc`: UInt,
    public var `cxSrc`: Int,
    public var `cySrc`: Int,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENHMETAHEADER` (
    public var `iType`: UInt,
    public var `nSize`: UInt,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `rclFrame`: `super`.`super`.`Foundation`.`RECTL`,
    public var `dSignature`: UInt,
    public var `nVersion`: UInt,
    public var `nBytes`: UInt,
    public var `nRecords`: UInt,
    public var `nHandles`: UShort,
    public var `sReserved`: UShort,
    public var `nDescription`: UInt,
    public var `offDescription`: UInt,
    public var `nPalEntries`: UInt,
    public var `szlDevice`: `super`.`super`.`Foundation`.`SIZE`,
    public var `szlMillimeters`: `super`.`super`.`Foundation`.`SIZE`,
    public var `cbPixelFormat`: UInt,
    public var `offPixelFormat`: UInt,
    public var `bOpenGL`: UInt,
    public var `szlMicrometers`: `super`.`super`.`Foundation`.`SIZE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENHMETARECORD` (
    public var `iType`: `ENHANCED_METAFILE_RECORD_TYPE`,
    public var `nSize`: UInt,
    public var `dParm`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENHMETARECORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENHMETARECORD`.Companion.`default`() : `ENHMETARECORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ENHMETA_SIGNATURE`: UInt = 1179469088u;
public const val `ENHMETA_STOCK_OBJECT`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ENHMFENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HDC`, /* Rust *const */ kotlinx.cinterop.CPointer<`HANDLETABLE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`ENHMETARECORD`>?, Int, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMLOGFONTA` (
    public var `elfLogFont`: `LOGFONTA`,
    public var `elfFullName`: UByteArray,
    public var `elfStyle`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUMLOGFONTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUMLOGFONTA`.Companion.`default`() : `ENUMLOGFONTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMLOGFONTEXA` (
    public var `elfLogFont`: `LOGFONTA`,
    public var `elfFullName`: UByteArray,
    public var `elfStyle`: UByteArray,
    public var `elfScript`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUMLOGFONTEXA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUMLOGFONTEXA`.Companion.`default`() : `ENUMLOGFONTEXA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENUMLOGFONTEXDVA` (
    public var `elfEnumLogfontEx`: `ENUMLOGFONTEXA`,
    public var `elfDesignVector`: `DESIGNVECTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENUMLOGFONTEXDVW` (
    public var `elfEnumLogfontEx`: `ENUMLOGFONTEXW`,
    public var `elfDesignVector`: `DESIGNVECTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMLOGFONTEXW` (
    public var `elfLogFont`: `LOGFONTW`,
    public var `elfFullName`: UShortArray,
    public var `elfStyle`: UShortArray,
    public var `elfScript`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUMLOGFONTEXW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUMLOGFONTEXW`.Companion.`default`() : `ENUMLOGFONTEXW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMLOGFONTW` (
    public var `elfLogFont`: `LOGFONTW`,
    public var `elfFullName`: UShortArray,
    public var `elfStyle`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ENUMLOGFONTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ENUMLOGFONTW`.Companion.`default`() : `ENUMLOGFONTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTLOGFONTA` (
    public var `elfLogFont`: `LOGFONTA`,
    public var `elfFullName`: UByteArray,
    public var `elfStyle`: UByteArray,
    public var `elfVersion`: UInt,
    public var `elfStyleSize`: UInt,
    public var `elfMatch`: UInt,
    public var `elfReserved`: UInt,
    public var `elfVendorId`: UByteArray,
    public var `elfCulture`: UInt,
    public var `elfPanose`: `PANOSE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EXTLOGFONTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EXTLOGFONTA`.Companion.`default`() : `EXTLOGFONTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTLOGFONTW` (
    public var `elfLogFont`: `LOGFONTW`,
    public var `elfFullName`: UShortArray,
    public var `elfStyle`: UShortArray,
    public var `elfVersion`: UInt,
    public var `elfStyleSize`: UInt,
    public var `elfMatch`: UInt,
    public var `elfReserved`: UInt,
    public var `elfVendorId`: UByteArray,
    public var `elfCulture`: UInt,
    public var `elfPanose`: `PANOSE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EXTLOGFONTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EXTLOGFONTW`.Companion.`default`() : `EXTLOGFONTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTLOGPEN` (
    public var `elpPenStyle`: UInt,
    public var `elpWidth`: UInt,
    public var `elpBrushStyle`: UInt,
    public var `elpColor`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `elpHatch`: ULong,
    public var `elpNumEntries`: UInt,
    public var `elpStyleEntry`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EXTLOGPEN`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EXTLOGPEN`.Companion.`default`() : `EXTLOGPEN` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTLOGPEN32` (
    public var `elpPenStyle`: UInt,
    public var `elpWidth`: UInt,
    public var `elpBrushStyle`: UInt,
    public var `elpColor`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `elpHatch`: UInt,
    public var `elpNumEntries`: UInt,
    public var `elpStyleEntry`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EXTLOGPEN32`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EXTLOGPEN32`.Companion.`default`() : `EXTLOGPEN32` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FIXED` (
    public var `fract`: UShort,
    public var `value`: Short,
)
public const val `FIXED_PITCH`: `FONT_PITCH` = 1u;
public const val `FLI_GLYPHS`: Int = 262144;
public const val `FLI_MASK`: UInt = 4155u;
public const val `FLOODFILLBORDER`: `EXT_FLOOD_FILL_TYPE` = 0u;
public const val `FLOODFILLSURFACE`: `EXT_FLOOD_FILL_TYPE` = 1u;
public const val `FLUSHOUTPUT`: UInt = 6u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FONTENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LOGFONTA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`TEXTMETRICA`>?, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FONTENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`LOGFONTW`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`TEXTMETRICW`>?, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GCP_RESULTSA` (
    public var `lStructSize`: UInt,
    public var `lpOutString`: `windows_sys`.`core`.`PSTR`,
    public var `lpOrder`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `lpDx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `lpCaretPos`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `lpClass`: `windows_sys`.`core`.`PSTR`,
    public var `lpGlyphs`: `windows_sys`.`core`.`PWSTR`,
    public var `nGlyphs`: UInt,
    public var `nMaxFit`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GCP_RESULTSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GCP_RESULTSA`.Companion.`default`() : `GCP_RESULTSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GCP_RESULTSW` (
    public var `lStructSize`: UInt,
    public var `lpOutString`: `windows_sys`.`core`.`PWSTR`,
    public var `lpOrder`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `lpDx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `lpCaretPos`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `lpClass`: `windows_sys`.`core`.`PSTR`,
    public var `lpGlyphs`: `windows_sys`.`core`.`PWSTR`,
    public var `nGlyphs`: UInt,
    public var `nMaxFit`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GCP_RESULTSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GCP_RESULTSW`.Companion.`default`() : `GCP_RESULTSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GLYPHMETRICS` (
    public var `gmBlackBoxX`: UInt,
    public var `gmBlackBoxY`: UInt,
    public var `gmptGlyphOrigin`: `super`.`super`.`Foundation`.`POINT`,
    public var `gmCellIncX`: Short,
    public var `gmCellIncY`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GLYPHSET` (
    public var `cbThis`: UInt,
    public var `flAccel`: UInt,
    public var `cGlyphsSupported`: UInt,
    public var `cRanges`: UInt,
    public var `ranges`: Array<`WCRANGE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GLYPHSET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GLYPHSET`.Companion.`default`() : `GLYPHSET` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `GM_ADVANCED`: `GRAPHICS_MODE` = 2;
public const val `GM_COMPATIBLE`: `GRAPHICS_MODE` = 1;
public const val `GM_LAST`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GOBJENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
public typealias `GRADIENT_FILL` = UInt;
public const val `GRADIENT_FILL_OP_FLAG`: UInt = 255u;
public const val `GRADIENT_FILL_RECT_H`: `GRADIENT_FILL` = 0u;
public const val `GRADIENT_FILL_RECT_V`: `GRADIENT_FILL` = 1u;
public const val `GRADIENT_FILL_TRIANGLE`: `GRADIENT_FILL` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GRADIENT_RECT` (
    public var `UpperLeft`: UInt,
    public var `LowerRight`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GRADIENT_TRIANGLE` (
    public var `Vertex1`: UInt,
    public var `Vertex2`: UInt,
    public var `Vertex3`: UInt,
)
public typealias `GRAPHICS_MODE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GRAYSTRINGPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HDC`, `super`.`super`.`Foundation`.`LPARAM`, Int) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `GRAY_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 2;
public const val `GREEK_CHARSET`: `FONT_CHARSET` = 161u;
public const val `GS_8BIT_INDICES`: UInt = 1u;
public const val `HALFTONE`: `STRETCH_BLT_MODE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HANDLETABLE` (
    public var `objectHandle`: Array<`HGDIOBJ`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HANDLETABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HANDLETABLE`.Companion.`default`() : `HANDLETABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `HANGEUL_CHARSET`: `FONT_CHARSET` = 129u;
public const val `HANGUL_CHARSET`: `FONT_CHARSET` = 129u;
public typealias `HATCH_BRUSH_STYLE` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HBITMAP` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HBRUSH` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDC` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `HDC_MAP_MODE` = Int;
public const val `HEBREW_CHARSET`: `FONT_CHARSET` = 177u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HENHMETAFILE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HFONT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HGDIOBJ` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMETAFILE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMONITOR` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HOLLOW_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 5;
public const val `HORZRES`: `GET_DEVICE_CAPS_INDEX` = 8u;
public const val `HORZSIZE`: `GET_DEVICE_CAPS_INDEX` = 4u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPALETTE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPEN` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRGN` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KERNINGPAIR` (
    public var `wFirst`: UShort,
    public var `wSecond`: UShort,
    public var `iKernAmount`: Int,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LINEDDAPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, Int, `super`.`super`.`Foundation`.`LPARAM`) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LOGBRUSH` (
    public var `lbStyle`: `BRUSH_STYLE`,
    public var `lbColor`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `lbHatch`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LOGBRUSH32` (
    public var `lbStyle`: `BRUSH_STYLE`,
    public var `lbColor`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `lbHatch`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGFONTA` (
    public var `lfHeight`: Int,
    public var `lfWidth`: Int,
    public var `lfEscapement`: Int,
    public var `lfOrientation`: Int,
    public var `lfWeight`: Int,
    public var `lfItalic`: UByte,
    public var `lfUnderline`: UByte,
    public var `lfStrikeOut`: UByte,
    public var `lfCharSet`: `FONT_CHARSET`,
    public var `lfOutPrecision`: `FONT_OUTPUT_PRECISION`,
    public var `lfClipPrecision`: `FONT_CLIP_PRECISION`,
    public var `lfQuality`: `FONT_QUALITY`,
    public var `lfPitchAndFamily`: UByte,
    public var `lfFaceName`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `LOGFONTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `LOGFONTA`.Companion.`default`() : `LOGFONTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGFONTW` (
    public var `lfHeight`: Int,
    public var `lfWidth`: Int,
    public var `lfEscapement`: Int,
    public var `lfOrientation`: Int,
    public var `lfWeight`: Int,
    public var `lfItalic`: UByte,
    public var `lfUnderline`: UByte,
    public var `lfStrikeOut`: UByte,
    public var `lfCharSet`: `FONT_CHARSET`,
    public var `lfOutPrecision`: `FONT_OUTPUT_PRECISION`,
    public var `lfClipPrecision`: `FONT_CLIP_PRECISION`,
    public var `lfQuality`: `FONT_QUALITY`,
    public var `lfPitchAndFamily`: UByte,
    public var `lfFaceName`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `LOGFONTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `LOGFONTW`.Companion.`default`() : `LOGFONTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGPALETTE` (
    public var `palVersion`: UShort,
    public var `palNumEntries`: UShort,
    public var `palPalEntry`: Array<`PALETTEENTRY`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `LOGPALETTE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `LOGPALETTE`.Companion.`default`() : `LOGPALETTE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LOGPEN` (
    public var `lopnStyle`: UInt,
    public var `lopnWidth`: `super`.`super`.`Foundation`.`POINT`,
    public var `lopnColor`: `super`.`super`.`Foundation`.`COLORREF`,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNDEVCAPS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UInt, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEA`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNDEVMODE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `super`.`super`.`Foundation`.`HMODULE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEA`>?, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVMODEA`>?, `windows_sys`.`core`.`PCSTR`, UInt) -> UInt>>>;
public const val `LTGRAY_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 1;
public const val `MAC_CHARSET`: `FONT_CHARSET` = 77u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MAT2` (
    public var `eM11`: `FIXED`,
    public var `eM12`: `FIXED`,
    public var `eM21`: `FIXED`,
    public var `eM22`: `FIXED`,
)
public const val `MAXSTRETCHBLTMODE`: UInt = 4u;
public const val `MERGECOPY`: `ROP_CODE` = 12583114u;
public const val `MERGEPAINT`: `ROP_CODE` = 12255782u;
public const val `METAFILE_DRIVER`: UInt = 2049u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `METAHEADER` (
    public var `mtType`: UShort,
    public var `mtHeaderSize`: UShort,
    public var `mtVersion`: UShort,
    public var `mtSize`: UInt,
    public var `mtNoObjects`: UShort,
    public var `mtMaxRecord`: UInt,
    public var `mtNoParameters`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `METARECORD` (
    public var `rdSize`: UInt,
    public var `rdFunction`: UShort,
    public var `rdParm`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `METARECORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `METARECORD`.Companion.`default`() : `METARECORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MFENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HDC`, /* Rust *const */ kotlinx.cinterop.CPointer<`HANDLETABLE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`METARECORD`>?, Int, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MONITORENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HMONITOR`, `HDC`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MONITORINFO` (
    public var `cbSize`: UInt,
    public var `rcMonitor`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcWork`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITORINFOEXA` (
    public var `monitorInfo`: `MONITORINFO`,
    public var `szDevice`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONITORINFOEXA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONITORINFOEXA`.Companion.`default`() : `MONITORINFOEXA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONITORINFOEXW` (
    public var `monitorInfo`: `MONITORINFO`,
    public var `szDevice`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONITORINFOEXW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONITORINFOEXW`.Companion.`default`() : `MONITORINFOEXW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NEWTEXTMETRICA` (
    public var `tmHeight`: Int,
    public var `tmAscent`: Int,
    public var `tmDescent`: Int,
    public var `tmInternalLeading`: Int,
    public var `tmExternalLeading`: Int,
    public var `tmAveCharWidth`: Int,
    public var `tmMaxCharWidth`: Int,
    public var `tmWeight`: Int,
    public var `tmOverhang`: Int,
    public var `tmDigitizedAspectX`: Int,
    public var `tmDigitizedAspectY`: Int,
    public var `tmFirstChar`: UByte,
    public var `tmLastChar`: UByte,
    public var `tmDefaultChar`: UByte,
    public var `tmBreakChar`: UByte,
    public var `tmItalic`: UByte,
    public var `tmUnderlined`: UByte,
    public var `tmStruckOut`: UByte,
    public var `tmPitchAndFamily`: `TMPF_FLAGS`,
    public var `tmCharSet`: UByte,
    public var `ntmFlags`: UInt,
    public var `ntmSizeEM`: UInt,
    public var `ntmCellHeight`: UInt,
    public var `ntmAvgWidth`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NEWTEXTMETRICW` (
    public var `tmHeight`: Int,
    public var `tmAscent`: Int,
    public var `tmDescent`: Int,
    public var `tmInternalLeading`: Int,
    public var `tmExternalLeading`: Int,
    public var `tmAveCharWidth`: Int,
    public var `tmMaxCharWidth`: Int,
    public var `tmWeight`: Int,
    public var `tmOverhang`: Int,
    public var `tmDigitizedAspectX`: Int,
    public var `tmDigitizedAspectY`: Int,
    public var `tmFirstChar`: UShort,
    public var `tmLastChar`: UShort,
    public var `tmDefaultChar`: UShort,
    public var `tmBreakChar`: UShort,
    public var `tmItalic`: UByte,
    public var `tmUnderlined`: UByte,
    public var `tmStruckOut`: UByte,
    public var `tmPitchAndFamily`: `TMPF_FLAGS`,
    public var `tmCharSet`: UByte,
    public var `ntmFlags`: UInt,
    public var `ntmSizeEM`: UInt,
    public var `ntmCellHeight`: UInt,
    public var `ntmAvgWidth`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OUTLINETEXTMETRICA` (
    public var `otmSize`: UInt,
    public var `otmTextMetrics`: `TEXTMETRICA`,
    public var `otmFiller`: UByte,
    public var `otmPanoseNumber`: `PANOSE`,
    public var `otmfsSelection`: UInt,
    public var `otmfsType`: UInt,
    public var `otmsCharSlopeRise`: Int,
    public var `otmsCharSlopeRun`: Int,
    public var `otmItalicAngle`: Int,
    public var `otmEMSquare`: UInt,
    public var `otmAscent`: Int,
    public var `otmDescent`: Int,
    public var `otmLineGap`: UInt,
    public var `otmsCapEmHeight`: UInt,
    public var `otmsXHeight`: UInt,
    public var `otmrcFontBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `otmMacAscent`: Int,
    public var `otmMacDescent`: Int,
    public var `otmMacLineGap`: UInt,
    public var `otmusMinimumPPEM`: UInt,
    public var `otmptSubscriptSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmptSubscriptOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmptSuperscriptSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmptSuperscriptOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmsStrikeoutSize`: UInt,
    public var `otmsStrikeoutPosition`: Int,
    public var `otmsUnderscoreSize`: Int,
    public var `otmsUnderscorePosition`: Int,
    public var `otmpFamilyName`: `windows_sys`.`core`.`PSTR`,
    public var `otmpFaceName`: `windows_sys`.`core`.`PSTR`,
    public var `otmpStyleName`: `windows_sys`.`core`.`PSTR`,
    public var `otmpFullName`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OUTLINETEXTMETRICA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OUTLINETEXTMETRICA`.Companion.`default`() : `OUTLINETEXTMETRICA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OUTLINETEXTMETRICW` (
    public var `otmSize`: UInt,
    public var `otmTextMetrics`: `TEXTMETRICW`,
    public var `otmFiller`: UByte,
    public var `otmPanoseNumber`: `PANOSE`,
    public var `otmfsSelection`: UInt,
    public var `otmfsType`: UInt,
    public var `otmsCharSlopeRise`: Int,
    public var `otmsCharSlopeRun`: Int,
    public var `otmItalicAngle`: Int,
    public var `otmEMSquare`: UInt,
    public var `otmAscent`: Int,
    public var `otmDescent`: Int,
    public var `otmLineGap`: UInt,
    public var `otmsCapEmHeight`: UInt,
    public var `otmsXHeight`: UInt,
    public var `otmrcFontBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `otmMacAscent`: Int,
    public var `otmMacDescent`: Int,
    public var `otmMacLineGap`: UInt,
    public var `otmusMinimumPPEM`: UInt,
    public var `otmptSubscriptSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmptSubscriptOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmptSuperscriptSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmptSuperscriptOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `otmsStrikeoutSize`: UInt,
    public var `otmsStrikeoutPosition`: Int,
    public var `otmsUnderscoreSize`: Int,
    public var `otmsUnderscorePosition`: Int,
    public var `otmpFamilyName`: `windows_sys`.`core`.`PSTR`,
    public var `otmpFaceName`: `windows_sys`.`core`.`PSTR`,
    public var `otmpStyleName`: `windows_sys`.`core`.`PSTR`,
    public var `otmpFullName`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OUTLINETEXTMETRICW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OUTLINETEXTMETRICW`.Companion.`default`() : `OUTLINETEXTMETRICW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAINTSTRUCT` (
    public var `hdc`: `HDC`,
    public var `fErase`: `windows_sys`.`core`.`BOOL`,
    public var `rcPaint`: `super`.`super`.`Foundation`.`RECT`,
    public var `fRestore`: `windows_sys`.`core`.`BOOL`,
    public var `fIncUpdate`: `windows_sys`.`core`.`BOOL`,
    public var `rgbReserved`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PAINTSTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PAINTSTRUCT`.Companion.`default`() : `PAINTSTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PALETTEENTRY` (
    public var `peRed`: UByte,
    public var `peGreen`: UByte,
    public var `peBlue`: UByte,
    public var `peFlags`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANOSE` (
    public var `bFamilyType`: `PAN_FAMILY_TYPE`,
    public var `bSerifStyle`: `PAN_SERIF_STYLE`,
    public var `bWeight`: `PAN_WEIGHT`,
    public var `bProportion`: `PAN_PROPORTION`,
    public var `bContrast`: `PAN_CONTRAST`,
    public var `bStrokeVariation`: `PAN_STROKE_VARIATION`,
    public var `bArmStyle`: `PAN_ARM_STYLE`,
    public var `bLetterform`: `PAN_LETT_FORM`,
    public var `bMidline`: `PAN_MIDLINE`,
    public var `bXHeight`: `PAN_XHEIGHT`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PELARRAY` (
    public var `paXCount`: Int,
    public var `paYCount`: Int,
    public var `paXExt`: Int,
    public var `paYExt`: Int,
    public var `paRGBs`: UByte,
)
public typealias `PEN_STYLE` = Int;
public const val `PHYSICALHEIGHT`: `GET_DEVICE_CAPS_INDEX` = 111u;
public const val `PHYSICALOFFSETX`: `GET_DEVICE_CAPS_INDEX` = 112u;
public const val `PHYSICALOFFSETY`: `GET_DEVICE_CAPS_INDEX` = 113u;
public const val `PHYSICALWIDTH`: `GET_DEVICE_CAPS_INDEX` = 110u;
public const val `PLANES`: `GET_DEVICE_CAPS_INDEX` = 14u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTFX` (
    public var `x`: `FIXED`,
    public var `y`: `FIXED`,
)
public const val `POLYFILL_LAST`: UInt = 2u;
public const val `POLYGONALCAPS`: `GET_DEVICE_CAPS_INDEX` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLYTEXTA` (
    public var `x`: Int,
    public var `y`: Int,
    public var `n`: UInt,
    public var `lpstr`: `windows_sys`.`core`.`PCSTR`,
    public var `uiFlags`: UInt,
    public var `rcl`: `super`.`super`.`Foundation`.`RECT`,
    public var `pdx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `POLYTEXTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `POLYTEXTA`.Companion.`default`() : `POLYTEXTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLYTEXTW` (
    public var `x`: Int,
    public var `y`: Int,
    public var `n`: UInt,
    public var `lpstr`: `windows_sys`.`core`.`PCWSTR`,
    public var `uiFlags`: UInt,
    public var `rcl`: `super`.`super`.`Foundation`.`RECT`,
    public var `pdx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `POLYTEXTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `POLYTEXTW`.Companion.`default`() : `POLYTEXTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RASTERIZER_STATUS` (
    public var `nSize`: Short,
    public var `wFlags`: Short,
    public var `nLanguageID`: Short,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `READEMBEDPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
public typealias `REDRAW_WINDOW_FLAGS` = UInt;
public const val `RELATIVE`: UInt = 2u;
public const val `RESTORE_CTM`: UInt = 4100u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RGBQUAD` (
    public var `rgbBlue`: UByte,
    public var `rgbGreen`: UByte,
    public var `rgbRed`: UByte,
    public var `rgbReserved`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RGBTRIPLE` (
    public var `rgbtBlue`: UByte,
    public var `rgbtGreen`: UByte,
    public var `rgbtRed`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RGNDATA` (
    public var `rdh`: `RGNDATAHEADER`,
    public var `Buffer`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RGNDATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RGNDATA`.Companion.`default`() : `RGNDATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RGNDATAHEADER` (
    public var `dwSize`: UInt,
    public var `iType`: UInt,
    public var `nCount`: UInt,
    public var `nRgnSize`: UInt,
    public var `rcBound`: `super`.`super`.`Foundation`.`RECT`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TEXTMETRICA` (
    public var `tmHeight`: Int,
    public var `tmAscent`: Int,
    public var `tmDescent`: Int,
    public var `tmInternalLeading`: Int,
    public var `tmExternalLeading`: Int,
    public var `tmAveCharWidth`: Int,
    public var `tmMaxCharWidth`: Int,
    public var `tmWeight`: Int,
    public var `tmOverhang`: Int,
    public var `tmDigitizedAspectX`: Int,
    public var `tmDigitizedAspectY`: Int,
    public var `tmFirstChar`: UByte,
    public var `tmLastChar`: UByte,
    public var `tmDefaultChar`: UByte,
    public var `tmBreakChar`: UByte,
    public var `tmItalic`: UByte,
    public var `tmUnderlined`: UByte,
    public var `tmStruckOut`: UByte,
    public var `tmPitchAndFamily`: `TMPF_FLAGS`,
    public var `tmCharSet`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TEXTMETRICW` (
    public var `tmHeight`: Int,
    public var `tmAscent`: Int,
    public var `tmDescent`: Int,
    public var `tmInternalLeading`: Int,
    public var `tmExternalLeading`: Int,
    public var `tmAveCharWidth`: Int,
    public var `tmMaxCharWidth`: Int,
    public var `tmWeight`: Int,
    public var `tmOverhang`: Int,
    public var `tmDigitizedAspectX`: Int,
    public var `tmDigitizedAspectY`: Int,
    public var `tmFirstChar`: UShort,
    public var `tmLastChar`: UShort,
    public var `tmDefaultChar`: UShort,
    public var `tmBreakChar`: UShort,
    public var `tmItalic`: UByte,
    public var `tmUnderlined`: UByte,
    public var `tmStruckOut`: UByte,
    public var `tmPitchAndFamily`: `TMPF_FLAGS`,
    public var `tmCharSet`: UByte,
)
public typealias `TEXT_ALIGN_OPTIONS` = UInt;
public const val `THAI_CHARSET`: `FONT_CHARSET` = 222u;
public const val `TMPF_DEVICE`: `TMPF_FLAGS` = 8u;
public const val `TMPF_FIXED_PITCH`: `TMPF_FLAGS` = 1u;
public typealias `TMPF_FLAGS` = UByte;
public const val `TMPF_TRUETYPE`: `TMPF_FLAGS` = 4u;
public const val `TMPF_VECTOR`: `TMPF_FLAGS` = 2u;
public const val `TRANSFORM_CTM`: UInt = 4107u;
public const val `TRANSPARENT`: `BACKGROUND_MODE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRIVERTEX` (
    public var `x`: Int,
    public var `y`: Int,
    public var `Red`: UShort,
    public var `Green`: UShort,
    public var `Blue`: UShort,
    public var `Alpha`: UShort,
)
public const val `TRUETYPE_FONTTYPE`: UInt = 4u;
public const val `TTDELETE_DONTREMOVEFONT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTEMBEDINFO` (
    public var `usStructSize`: UShort,
    public var `usRootStrSize`: UShort,
    public var `pusRootStr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TTEMBEDINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TTEMBEDINFO`.Companion.`default`() : `TTEMBEDINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTLOADINFO` (
    public var `usStructSize`: UShort,
    public var `usRefStrSize`: UShort,
    public var `pusRefStr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TTLOADINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TTLOADINFO`.Companion.`default`() : `TTLOADINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `TTLOAD_EMBEDDED_FONT_STATUS` = UInt;
public const val `TTLOAD_EUDC_OVERWRITE`: UInt = 2u;
public const val `TTLOAD_EUDC_SET`: UInt = 4u;
public const val `TTLOAD_FONT_IN_SYSSTARTUP`: `TTLOAD_EMBEDDED_FONT_STATUS` = 2u;
public const val `TTLOAD_FONT_SUBSETTED`: `TTLOAD_EMBEDDED_FONT_STATUS` = 1u;
public const val `TTLOAD_PRIVATE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTPOLYCURVE` (
    public var `wType`: UShort,
    public var `cpfx`: UShort,
    public var `apfx`: Array<`POINTFX`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TTPOLYCURVE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TTPOLYCURVE`.Companion.`default`() : `TTPOLYCURVE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TTPOLYGONHEADER` (
    public var `cb`: UInt,
    public var `dwType`: UInt,
    public var `pfxStart`: `POINTFX`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTVALIDATIONTESTSPARAMS` (
    public var `ulStructSize`: UInt,
    public var `lTestFromSize`: Int,
    public var `lTestToSize`: Int,
    public var `ulCharSet`: UInt,
    public var `usReserved1`: UShort,
    public var `usCharCodeCount`: UShort,
    public var `pusCharCodeSet`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TTVALIDATIONTESTSPARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TTVALIDATIONTESTSPARAMS`.Companion.`default`() : `TTVALIDATIONTESTSPARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTVALIDATIONTESTSPARAMSEX` (
    public var `ulStructSize`: UInt,
    public var `lTestFromSize`: Int,
    public var `lTestToSize`: Int,
    public var `ulCharSet`: UInt,
    public var `usReserved1`: UShort,
    public var `usCharCodeCount`: UShort,
    public var `pulCharCodeSet`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TTVALIDATIONTESTSPARAMSEX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TTVALIDATIONTESTSPARAMSEX`.Companion.`default`() : `TTVALIDATIONTESTSPARAMSEX` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCRANGE` (
    public var `wcLow`: UShort,
    public var `cGlyphs`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WGLSWAP` (
    public var `hdc`: `HDC`,
    public var `uiFlags`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WGLSWAP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WGLSWAP`.Companion.`default`() : `WGLSWAP` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WRITEEMBEDPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XFORM` (
    public var `eM11`: Float,
    public var `eM12`: Float,
    public var `eM21`: Float,
    public var `eM22`: Float,
    public var `eDx`: Float,
    public var `eDy`: Float,
)
