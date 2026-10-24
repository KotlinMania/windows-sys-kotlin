// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=BRUSHOBJ_hGetColorTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BRUSHOBJ_hGetColorTransform`(`pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=BRUSHOBJ_pvAllocRbrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BRUSHOBJ_pvAllocRbrush`(`pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `cj` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=BRUSHOBJ_pvGetRbrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BRUSHOBJ_pvGetRbrush`(`pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=BRUSHOBJ_ulGetBrushColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BRUSHOBJ_ulGetBrushColor`(`pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CLIPOBJ_bEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPOBJ_bEnum`(`pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `cj` : UInt, `pul` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CLIPOBJ_cEnumStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPOBJ_cEnumStart`(`pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `ball` : `windows_sys`.`core`.`BOOL`, `itype` : UInt, `idirection` : UInt, `climit` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=CLIPOBJ_ppoGetPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPOBJ_ppoGetPath`(`pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=CapabilitiesRequestAndCapabilitiesReply; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CapabilitiesRequestAndCapabilitiesReply`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pszasciicapabilitiesstring` : `windows_sys`.`core`.`PSTR`, `dwcapabilitiesstringlengthincharacters` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=DegaussMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DegaussMonitor`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=DestroyPhysicalMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyPhysicalMonitor`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=DestroyPhysicalMonitors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyPhysicalMonitors`(`dwphysicalmonitorarraysize` : UInt, `pphysicalmonitorarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`PHYSICAL_MONITOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DisplayConfigGetDeviceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DisplayConfigGetDeviceInfo`(`requestpacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_DEVICE_INFO_HEADER`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DisplayConfigSetDeviceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DisplayConfigSetDeviceInfo`(`setpacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_DEVICE_INFO_HEADER`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngAcquireSemaphore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngAcquireSemaphore`(`hsem` : `HSEMAPHORE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngAlphaBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngAlphaBlend`(`psodest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `prcldest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `prclsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pblendobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BLENDOBJ`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngAssociateSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngAssociateSurface`(`hsurf` : `HSURF`, `hdev` : `HDEV`, `flhooks` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngBitBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngBitBlt`(`psotrg` : /* Rust *const */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psomask` : /* Rust *const */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *const */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `prcltrg` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pptlsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `pptlmask` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `pbo` : /* Rust *const */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pptlbrush` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `rop4` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCheckAbort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngCheckAbort`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngComputeGlyphSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngComputeGlyphSet`(`ncodepage` : Int, `nfirstchar` : Int, `cchars` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`FD_GLYPHSET`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCopyBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngCopyBits`(`psodest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `prcldest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pptlsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCreateBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngCreateBitmap`(`sizl` : `super`.`super`.`Foundation`.`SIZE`, `lwidth` : Int, `iformat` : UInt, `fl` : UInt, `pvbits` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCreateClip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngCreateClip`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCreateDeviceBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngCreateDeviceBitmap`(`dhsurf` : `DHSURF`, `sizl` : `super`.`super`.`Foundation`.`SIZE`, `iformatcompat` : UInt) : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCreateDeviceSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngCreateDeviceSurface`(`dhsurf` : `DHSURF`, `sizl` : `super`.`super`.`Foundation`.`SIZE`, `iformatcompat` : UInt) : `HSURF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCreatePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngCreatePalette`(`imode` : UInt, `ccolors` : UInt, `pulcolors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flred` : UInt, `flgreen` : UInt, `flblue` : UInt) : `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngCreateSemaphore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngCreateSemaphore`() : `HSEMAPHORE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngDeleteClip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngDeleteClip`(`pco` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngDeletePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngDeletePalette`(`hpal` : `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngDeletePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngDeletePath`(`ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngDeleteSemaphore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngDeleteSemaphore`(`hsem` : `HSEMAPHORE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngDeleteSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngDeleteSurface`(`hsurf` : `HSURF`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngEraseSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngEraseSurface`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `prcl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `icolor` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngFillPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngFillPath`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pptlbrushorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `mix` : UInt, `floptions` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngFindResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngFindResource`(`h` : `super`.`super`.`Foundation`.`HANDLE`, `iname` : Int, `itype` : Int, `pulsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngFreeModule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngFreeModule`(`h` : `super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngGetCurrentCodePage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngGetCurrentCodePage`(`oemcodepage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ansicodepage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngGetDriverName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngGetDriverName`(`hdev` : `HDEV`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngGetPrinterDataFileName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngGetPrinterDataFileName`(`hdev` : `HDEV`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngGradientFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngGradientFill`(`psodest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `pvertex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`TRIVERTEX`>?, `nvertex` : UInt, `pmesh` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nmesh` : UInt, `prclextents` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pptlditherorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `ulmode` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngLineTo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngLineTo`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int, `prclbounds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `mix` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngLoadModule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngLoadModule`(`pwsz` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngLockSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngLockSurface`(`hsurf` : `HSURF`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngMarkBandingSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngMarkBandingSurface`(`hsurf` : `HSURF`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngMultiByteToUnicodeN; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngMultiByteToUnicodeN`(`unicodestring` : `windows_sys`.`core`.`PWSTR`, `maxbytesinunicodestring` : UInt, `bytesinunicodestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `multibytestring` : `windows_sys`.`core`.`PCSTR`, `bytesinmultibytestring` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngMultiByteToWideChar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngMultiByteToWideChar`(`codepage` : UInt, `widecharstring` : `windows_sys`.`core`.`PWSTR`, `bytesinwidecharstring` : Int, `multibytestring` : `windows_sys`.`core`.`PCSTR`, `bytesinmultibytestring` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngPaint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngPaint`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pptlbrushorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `mix` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngPlgBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngPlgBlt`(`psotrg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psomsk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `pca` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`COLORADJUSTMENT`>?, `pptlbrushorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `pptfx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTFIX`>?, `prcl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pptl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `imode` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngQueryEMFInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngQueryEMFInfo`(`hdev` : `HDEV`, `pemfinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EMFINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngQueryLocalTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngQueryLocalTime`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENG_TIME_FIELDS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngReleaseSemaphore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngReleaseSemaphore`(`hsem` : `HSEMAPHORE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngStretchBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngStretchBlt`(`psodest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psomask` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `pca` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`COLORADJUSTMENT`>?, `pptlhtorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `prcldest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `prclsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pptlmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `imode` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngStretchBltROP; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EngStretchBltROP`(`psodest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psomask` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `pca` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`COLORADJUSTMENT`>?, `pptlhtorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `prcldest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `prclsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pptlmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `imode` : UInt, `pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `rop4` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngStrokeAndFillPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngStrokeAndFillPath`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, `pbostroke` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `plineattrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEATTRS`>?, `pbofill` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pptlbrushorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `mixfill` : UInt, `floptions` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngStrokePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngStrokePath`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, `pbo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pptlbrushorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `plineattrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEATTRS`>?, `mix` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngTextOut; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngTextOut`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pstro` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?, `pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `prclextra` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `prclopaque` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `pbofore` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pboopaque` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, `pptlorg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, `mix` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngTransparentBlt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngTransparentBlt`(`psodst` : /* Rust *const */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `psosrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pco` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pxlo` : /* Rust *const */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `prcldst` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `prclsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, `transcolor` : UInt, `bcalledfrombitblt` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngUnicodeToMultiByteN; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngUnicodeToMultiByteN`(`multibytestring` : `windows_sys`.`core`.`PSTR`, `maxbytesinmultibytestring` : UInt, `bytesinmultibytestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `unicodestring` : `windows_sys`.`core`.`PCWSTR`, `bytesinunicodestring` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngUnlockSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngUnlockSurface`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EngWideCharToMultiByte; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EngWideCharToMultiByte`(`codepage` : UInt, `widecharstring` : `windows_sys`.`core`.`PCWSTR`, `bytesinwidecharstring` : Int, `multibytestring` : `windows_sys`.`core`.`PSTR`, `bytesinmultibytestring` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_cGetAllGlyphHandles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_cGetAllGlyphHandles`(`pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, `phg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_cGetGlyphs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_cGetGlyphs`(`pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, `imode` : UInt, `cglyph` : UInt, `phg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppvglyph` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_pQueryGlyphAttrs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_pQueryGlyphAttrs`(`pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, `imode` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`FD_GLYPHATTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_pfdg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_pfdg`(`pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`FD_GLYPHSET`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_pifi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `FONTOBJ_pifi`(`pfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FONTOBJ`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IFIMETRICS`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_pvTrueTypeFontFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_pvTrueTypeFontFile`(`pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, `pcjfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_pxoGetXform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_pxoGetXform`(`pfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FONTOBJ`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=FONTOBJ_vGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FONTOBJ_vGetInfo`(`pfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, `cjsize` : UInt, `pfi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTINFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetAutoRotationState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAutoRotationState`(`pstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AR_STATE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetCapabilitiesStringLength; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCapabilitiesStringLength`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pdwcapabilitiesstringlengthincharacters` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDisplayAutoRotationPreferences; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDisplayAutoRotationPreferences`(`porientation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORIENTATION_PREFERENCE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDisplayConfigBufferSizes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDisplayConfigBufferSizes`(`flags` : `QUERY_DISPLAY_CONFIG_FLAGS`, `numpatharrayelements` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nummodeinfoarrayelements` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorBrightness; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorBrightness`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pdwminimumbrightness` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwcurrentbrightness` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumbrightness` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorCapabilities`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pdwmonitorcapabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwsupportedcolortemperatures` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorColorTemperature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorColorTemperature`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pctcurrentcolortemperature` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MC_COLOR_TEMPERATURE`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorContrast; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorContrast`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pdwminimumcontrast` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwcurrentcontrast` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumcontrast` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorDisplayAreaPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorDisplayAreaPosition`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `ptpositiontype` : `MC_POSITION_TYPE`, `pdwminimumposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwcurrentposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorDisplayAreaSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorDisplayAreaSize`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `stsizetype` : `MC_SIZE_TYPE`, `pdwminimumwidthorheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwcurrentwidthorheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumwidthorheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorRedGreenOrBlueDrive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorRedGreenOrBlueDrive`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `dtdrivetype` : `MC_DRIVE_TYPE`, `pdwminimumdrive` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwcurrentdrive` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumdrive` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorRedGreenOrBlueGain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorRedGreenOrBlueGain`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `gtgaintype` : `MC_GAIN_TYPE`, `pdwminimumgain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwcurrentgain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumgain` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetMonitorTechnologyType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMonitorTechnologyType`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pdtydisplaytechnologytype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MC_DISPLAY_TECHNOLOGY_TYPE`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetNumberOfPhysicalMonitorsFromHMONITOR; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetNumberOfPhysicalMonitorsFromHMONITOR`(`hmonitor` : `super`.`super`.`Graphics`.`Gdi`.`HMONITOR`, `pdwnumberofphysicalmonitors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetPhysicalMonitorsFromHMONITOR; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetPhysicalMonitorsFromHMONITOR`(`hmonitor` : `super`.`super`.`Graphics`.`Gdi`.`HMONITOR`, `dwphysicalmonitorarraysize` : UInt, `pphysicalmonitorarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHYSICAL_MONITOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetTimingReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTimingReport`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `pmtrmonitortimingreport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MC_TIMING_REPORT`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=GetVCPFeatureAndVCPFeatureReply; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVCPFeatureAndVCPFeatureReply`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `bvcpcode` : UByte, `pvct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MC_VCP_CODE_TYPE`>?, `pdwcurrentvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmaximumvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=HT_Get8BPPFormatPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HT_Get8BPPFormatPalette`(`ppaletteentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`PALETTEENTRY`>?, `redgamma` : UShort, `greengamma` : UShort, `bluegamma` : UShort) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=HT_Get8BPPMaskPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HT_Get8BPPMaskPalette`(`ppaletteentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`PALETTEENTRY`>?, `use8bppmaskpal` : `windows_sys`.`core`.`BOOL`, `cmymask` : UByte, `redgamma` : UShort, `greengamma` : UShort, `bluegamma` : UShort) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PATHOBJ_bEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PATHOBJ_bEnum`(`ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHDATA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PATHOBJ_bEnumClipLines; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PATHOBJ_bEnumClipLines`(`ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `cb` : UInt, `pcl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPLINE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PATHOBJ_vEnumStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PATHOBJ_vEnumStart`(`ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PATHOBJ_vEnumStartClipLines; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PATHOBJ_vEnumStartClipLines`(`ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `pco` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, `pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `pla` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEATTRS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=PATHOBJ_vGetBounds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PATHOBJ_vGetBounds`(`ppo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, `prectfx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RECTFX`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=QueryDisplayConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryDisplayConfig`(`flags` : `QUERY_DISPLAY_CONFIG_FLAGS`, `numpatharrayelements` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `patharray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_PATH_INFO`>?, `nummodeinfoarrayelements` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `modeinfoarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_MODE_INFO`>?, `currenttopologyid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_TOPOLOGY_ID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=RestoreMonitorFactoryColorDefaults; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RestoreMonitorFactoryColorDefaults`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=RestoreMonitorFactoryDefaults; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RestoreMonitorFactoryDefaults`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=STROBJ_bEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `STROBJ_bEnum`(`pstro` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?, `pc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppgpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GLYPHPOS`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=STROBJ_bEnumPositionsOnly; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `STROBJ_bEnumPositionsOnly`(`pstro` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?, `pc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppgpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GLYPHPOS`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=STROBJ_bGetAdvanceWidths; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `STROBJ_bGetAdvanceWidths`(`pso` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?, `ifirst` : UInt, `c` : UInt, `pptqd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTQF`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=STROBJ_dwGetCodePage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `STROBJ_dwGetCodePage`(`pstro` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=STROBJ_vEnumStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `STROBJ_vEnumStart`(`pstro` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SaveCurrentMonitorSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaveCurrentMonitorSettings`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SaveCurrentSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaveCurrentSettings`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDisplayAutoRotationPreferences; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDisplayAutoRotationPreferences`(`orientation` : `ORIENTATION_PREFERENCE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDisplayConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDisplayConfig`(`numpatharrayelements` : UInt, `patharray` : /* Rust *const */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_PATH_INFO`>?, `nummodeinfoarrayelements` : UInt, `modeinfoarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`DISPLAYCONFIG_MODE_INFO`>?, `flags` : `SET_DISPLAY_CONFIG_FLAGS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorBrightness; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorBrightness`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `dwnewbrightness` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorColorTemperature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorColorTemperature`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `ctcurrentcolortemperature` : `MC_COLOR_TEMPERATURE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorContrast; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorContrast`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `dwnewcontrast` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorDisplayAreaPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorDisplayAreaPosition`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `ptpositiontype` : `MC_POSITION_TYPE`, `dwnewposition` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorDisplayAreaSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorDisplayAreaSize`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `stsizetype` : `MC_SIZE_TYPE`, `dwnewdisplayareawidthorheight` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorRedGreenOrBlueDrive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorRedGreenOrBlueDrive`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `dtdrivetype` : `MC_DRIVE_TYPE`, `dwnewdrive` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetMonitorRedGreenOrBlueGain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMonitorRedGreenOrBlueGain`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `gtgaintype` : `MC_GAIN_TYPE`, `dwnewgain` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dxva2.dll, ABI=system, export=SetVCPFeature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVCPFeature`(`hmonitor` : `super`.`super`.`Foundation`.`HANDLE`, `bvcpcode` : UByte, `dwnewvalue` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=XFORMOBJ_bApplyXform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XFORMOBJ_bApplyXform`(`pxo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, `imode` : UInt, `cpoints` : UInt, `pvin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=XFORMOBJ_iGetXform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XFORMOBJ_iGetXform`(`pxo` : /* Rust *const */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, `pxform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORML`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=XLATEOBJ_cGetPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XLATEOBJ_cGetPalette`(`pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `ipal` : UInt, `cpal` : UInt, `ppal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=XLATEOBJ_hGetColorTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XLATEOBJ_hGetColorTransform`(`pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=XLATEOBJ_iXlate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XLATEOBJ_iXlate`(`pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, `icolor` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=XLATEOBJ_piVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XLATEOBJ_piVector`(`pxlo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Adapter` (
    public var `AdapterName`: UShortArray,
    public var `numSources`: Int,
    public var `sources`: Array<`Sources`>,
)
// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for Adapter {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Adapters` (
    public var `numAdapters`: Int,
    public var `adapter`: Array<`Adapter`>,
)
// UNSUPPORTED Rust 161:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for Adapters {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BACKLIGHT_OPTIMIZATION_LEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BACKLIGHT_REDUCTION_GAMMA_RAMP` (
    public var `R`: UShortArray,
    public var `G`: UShortArray,
    public var `B`: UShortArray,
)
// UNSUPPORTED Rust 174:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BACKLIGHT_REDUCTION_GAMMA_RAMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BANK_POSITION` (
    public var `ReadBankPosition`: UInt,
    public var `WriteBankPosition`: UInt,
)
public const val `BITMAP_ARRAY_BYTE`: UInt = 3u;
public const val `BITMAP_BITS_BYTE_ALIGN`: UInt = 8u;
public const val `BITMAP_BITS_PIXEL`: UInt = 1u;
public const val `BITMAP_BITS_WORD_ALIGN`: UInt = 16u;
public const val `BITMAP_PLANES`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BLENDOBJ` (
    public var `BlendFunction`: `super`.`super`.`Graphics`.`Gdi`.`BLENDFUNCTION`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 103 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BRIGHTNESS_LEVEL` (
    public var `Count`: UByte,
    public var `Level`: UByteArray,
)
// UNSUPPORTED Rust 228:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BRIGHTNESS_LEVEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BRIGHTNESS_MAX_LEVEL_COUNT`: UInt = 103u;
public const val `BRIGHTNESS_MAX_NIT_RANGE_COUNT`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BRIGHTNESS_NIT_RANGE` (
    public var `MinLevelInMillinit`: UInt,
    public var `MaxLevelInMillinit`: UInt,
    public var `StepSizeInMillinit`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BRIGHTNESS_NIT_RANGES` (
    public var `NormalRangeCount`: UInt,
    public var `RangeCount`: UInt,
    public var `PreferredMaximumBrightness`: UInt,
    public var `SupportedRanges`: Array<`BRIGHTNESS_NIT_RANGE`>,
)
// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BRIGHTNESS_NIT_RANGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BRUSHOBJ` (
    public var `iSolidColor`: UInt,
    public var `pvRbrush`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `flColorType`: UInt,
)
// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 65 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CDDDXGK_REDIRBITMAPPRESENTINFO` (
    public var `NumDirtyRects`: UInt,
    public var `DirtyRect`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
    public var `NumContexts`: UInt,
    public var `hContext`: Array<`super`.`super`.`Foundation`.`HANDLE`>,
    public var `bDoNotSynchronizeWithDxContent`: Boolean,
)
// UNSUPPORTED Rust 293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHAR_IMAGE_INFO` (
    public var `CharInfo`: `super`.`super`.`System`.`Console`.`CHAR_INFO`,
    public var `FontImageInfo`: `FONT_IMAGE_INFO`,
)
// UNSUPPORTED Rust 312:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Console")]
// impl Default for CHAR_IMAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CHAR_TYPE_LEADING`: UInt = 2u;
public const val `CHAR_TYPE_SBCS`: UInt = 0u;
public const val `CHAR_TYPE_TRAILING`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHROMATICITY_COORDINATE` (
    public var `x`: Float,
    public var `y`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CIECHROMA` (
    public var `x`: Int,
    public var `y`: Int,
    public var `Y`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLIPLINE` (
    public var `ptfxA`: `POINTFIX`,
    public var `ptfxB`: `POINTFIX`,
    public var `lStyleState`: Int,
    public var `c`: UInt,
    public var `arun`: Array<`RUN`>,
)
// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLIPLINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLIPOBJ` (
    public var `iUniq`: UInt,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `iDComplexity`: UByte,
    public var `iFComplexity`: UByte,
    public var `iMode`: UByte,
    public var `fjOptions`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORINFO` (
    public var `Red`: `CIECHROMA`,
    public var `Green`: `CIECHROMA`,
    public var `Blue`: `CIECHROMA`,
    public var `Cyan`: `CIECHROMA`,
    public var `Magenta`: `CIECHROMA`,
    public var `Yellow`: `CIECHROMA`,
    public var `AlignmentWhite`: `CIECHROMA`,
    public var `RedGamma`: Int,
    public var `GreenGamma`: Int,
    public var `BlueGamma`: Int,
    public var `MagentaInCyanDye`: Int,
    public var `YellowInCyanDye`: Int,
    public var `CyanInMagentaDye`: Int,
    public var `YellowInMagentaDye`: Int,
    public var `CyanInYellowDye`: Int,
    public var `MagentaInYellowDye`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM` (
    public var `Type`: `COLORSPACE_TRANSFORM_TYPE`,
    public var `Data`: `COLORSPACE_TRANSFORM_0`,
)
// UNSUPPORTED Rust 384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 389:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLORSPACE_TRANSFORM_0 {
//     pub Rgb256x3x16: GAMMA_RAMP_RGB256x3x16,
//     pub Dxgi1: GAMMA_RAMP_DXGI_1,
//     pub T3x4: COLORSPACE_TRANSFORM_3x4,
//     pub MatrixV2: COLORSPACE_TRANSFORM_MATRIX_V2,
// }

// UNSUPPORTED Rust 397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_1DLUT_CAP` (
    public var `NumberOfLUTEntries`: UInt,
    public var `DataCap`: `COLORSPACE_TRANSFORM_DATA_CAP`,
)
// UNSUPPORTED Rust 408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_1DLUT_CAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4096 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_3x4` (
    public var `ColorMatrix3x4`: FloatArray,
    public var `ScalarMultiplier`: Float,
    public var `LookupTable1D`: Array<`GAMMA_RAMP_RGB`>,
)
// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_3x4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_DATA_CAP` (
    public var `DataType`: `COLORSPACE_TRANSFORM_DATA_TYPE`,
    public var `Anonymous`: `COLORSPACE_TRANSFORM_DATA_CAP_0`,
    public var `NumericRangeMin`: Float,
    public var `NumericRangeMax`: Float,
)
// UNSUPPORTED Rust 433:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_DATA_CAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 438:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLORSPACE_TRANSFORM_DATA_CAP_0 {
//     pub Anonymous1: COLORSPACE_TRANSFORM_DATA_CAP_0_0,
//     pub Anonymous2: COLORSPACE_TRANSFORM_DATA_CAP_0_1,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_DATA_CAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORSPACE_TRANSFORM_DATA_CAP_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORSPACE_TRANSFORM_DATA_CAP_0_1` (
    public var `_bitfield`: UInt,
)
public typealias `COLORSPACE_TRANSFORM_DATA_TYPE` = Int;
public const val `COLORSPACE_TRANSFORM_DATA_TYPE_FIXED_POINT`: `COLORSPACE_TRANSFORM_DATA_TYPE` = 0;
public const val `COLORSPACE_TRANSFORM_DATA_TYPE_FLOAT`: `COLORSPACE_TRANSFORM_DATA_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_MATRIX_CAP` (
    public var `Anonymous`: `COLORSPACE_TRANSFORM_MATRIX_CAP_0`,
    public var `DataCap`: `COLORSPACE_TRANSFORM_DATA_CAP`,
)
// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_MATRIX_CAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 474:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLORSPACE_TRANSFORM_MATRIX_CAP_0 {
//     pub Anonymous: COLORSPACE_TRANSFORM_MATRIX_CAP_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_MATRIX_CAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORSPACE_TRANSFORM_MATRIX_CAP_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4096 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_MATRIX_V2` (
    public var `StageControlLookupTable1DDegamma`: `COLORSPACE_TRANSFORM_STAGE_CONTROL`,
    public var `LookupTable1DDegamma`: Array<`GAMMA_RAMP_RGB`>,
    public var `StageControlColorMatrix3x3`: `COLORSPACE_TRANSFORM_STAGE_CONTROL`,
    public var `ColorMatrix3x3`: FloatArray,
    public var `StageControlLookupTable1DRegamma`: `COLORSPACE_TRANSFORM_STAGE_CONTROL`,
    public var `LookupTable1DRegamma`: Array<`GAMMA_RAMP_RGB`>,
)
// UNSUPPORTED Rust 500:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_MATRIX_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_SET_INPUT` (
    public var `OutputWireColorSpaceExpected`: `OUTPUT_WIRE_COLOR_SPACE_TYPE`,
    public var `OutputWireFormatExpected`: `OUTPUT_WIRE_FORMAT`,
    public var `ColorSpaceTransform`: `COLORSPACE_TRANSFORM`,
)
// UNSUPPORTED Rust 512:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COLORSPACE_TRANSFORM_SET_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORSPACE_TRANSFORM_STAGE_CONTROL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLORSPACE_TRANSFORM_TARGET_CAPS` (
    public var `Version`: `COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION`,
    public var `LookupTable1DDegammaCap`: `COLORSPACE_TRANSFORM_1DLUT_CAP`,
    public var `ColorMatrix3x3Cap`: `COLORSPACE_TRANSFORM_MATRIX_CAP`,
    public var `LookupTable1DRegammaCap`: `COLORSPACE_TRANSFORM_1DLUT_CAP`,
)
// UNSUPPORTED Rust 526:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 561:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_FULLSCREEN_VIDEO_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\FSVideo");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVHTADJDATA` (
    public var `DeviceFlags`: UInt,
    public var `DeviceXDPI`: UInt,
    public var `DeviceYDPI`: UInt,
    public var `pDefHTInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVHTINFO`>?,
    public var `pAdjHTInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVHTINFO`>?,
)
// UNSUPPORTED Rust 571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVHTADJDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEVHTADJF_ADDITIVE_DEVICE`: UInt = 2u;
public const val `DEVHTADJF_COLOR_DEVICE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVHTINFO` (
    public var `HTFlags`: UInt,
    public var `HTPatternSize`: UInt,
    public var `DevPelsDPI`: UInt,
    public var `ColorInfo`: `COLORINFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVINFO` (
    public var `flGraphicsCaps`: UInt,
    public var `lfDefaultFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `lfAnsiVarFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `lfAnsiFixFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `cFonts`: UInt,
    public var `iDitherFormat`: UInt,
    public var `cxDither`: UShort,
    public var `cyDither`: UShort,
    public var `hpalDefault`: `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`,
    public var `flGraphicsCaps2`: UInt,
)
// UNSUPPORTED Rust 601:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DEVINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Device_ActivityId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 4 };

// UNSUPPORTED Rust 608:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Device_AdapterLuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 3 };

// UNSUPPORTED Rust 609:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Device_TerminalLuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 2 };

// UNSUPPORTED Rust 610:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_IndirectDisplay: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 1 };

// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DHPDEV` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DHSURF` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_2DREGION` (
    public var `cx`: UInt,
    public var `cy`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_ADAPTER_NAME` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `adapterDevicePath`: UShortArray,
)
// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_ADAPTER_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_DESKTOP_IMAGE_INFO` (
    public var `PathSourceSize`: `super`.`super`.`Foundation`.`POINTL`,
    public var `DesktopImageRegion`: `super`.`super`.`Foundation`.`RECTL`,
    public var `DesktopImageClip`: `super`.`super`.`Foundation`.`RECTL`,
)
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_ADAPTER_NAME`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 4;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_ADVANCED_COLOR_INFO`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 9;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_MONITOR_SPECIALIZATION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 12;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_SDR_WHITE_LEVEL`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 11;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_SOURCE_NAME`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 1;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_SUPPORT_VIRTUAL_RESOLUTION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 7;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_BASE_TYPE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 6;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_NAME`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 2;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_PREFERRED_MODE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_DEVICE_INFO_HEADER` (
    public var `type`: `DISPLAYCONFIG_DEVICE_INFO_TYPE`,
    public var `size`: UInt,
    public var `adapterId`: `super`.`super`.`Foundation`.`LUID`,
    public var `id`: UInt,
)
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_ADVANCED_COLOR_STATE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 10;
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_MONITOR_SPECIALIZATION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 13;
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_SUPPORT_VIRTUAL_RESOLUTION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 8;
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_TARGET_PERSISTENCE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 5;
public typealias `DISPLAYCONFIG_DEVICE_INFO_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `Anonymous`: `DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0`,
    public var `colorEncoding`: `super`.`super`.`Graphics`.`Gdi`.`DISPLAYCONFIG_COLOR_ENCODING`,
    public var `bitsPerColorChannel`: UInt,
)
// UNSUPPORTED Rust 668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 674:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0 {
//     pub Anonymous: DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 681:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `Anonymous`: `DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0`,
)
// UNSUPPORTED Rust 699:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 704:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0 {
//     pub Anonymous: DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_MODE_INFO` (
    public var `infoType`: `DISPLAYCONFIG_MODE_INFO_TYPE`,
    public var `id`: UInt,
    public var `adapterId`: `super`.`super`.`Foundation`.`LUID`,
    public var `Anonymous`: `DISPLAYCONFIG_MODE_INFO_0`,
)
// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_MODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_MODE_INFO_0 {
//     pub targetMode: DISPLAYCONFIG_TARGET_MODE,
//     pub sourceMode: DISPLAYCONFIG_SOURCE_MODE,
//     pub desktopImageInfo: DISPLAYCONFIG_DESKTOP_IMAGE_INFO,
// }

// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_PATH_INFO` (
    public var `sourceInfo`: `DISPLAYCONFIG_PATH_SOURCE_INFO`,
    public var `targetInfo`: `DISPLAYCONFIG_PATH_TARGET_INFO`,
    public var `flags`: UInt,
)
// UNSUPPORTED Rust 776:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_PATH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_PATH_SOURCE_INFO` (
    public var `adapterId`: `super`.`super`.`Foundation`.`LUID`,
    public var `id`: UInt,
    public var `Anonymous`: `DISPLAYCONFIG_PATH_SOURCE_INFO_0`,
    public var `statusFlags`: UInt,
)
// UNSUPPORTED Rust 789:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_PATH_SOURCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 794:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_PATH_SOURCE_INFO_0 {
//     pub modeInfoIdx: u32,
//     pub Anonymous: DISPLAYCONFIG_PATH_SOURCE_INFO_0_0,
// }

// UNSUPPORTED Rust 800:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_PATH_SOURCE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_PATH_SOURCE_INFO_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_PATH_TARGET_INFO` (
    public var `adapterId`: `super`.`super`.`Foundation`.`LUID`,
    public var `id`: UInt,
    public var `Anonymous`: `DISPLAYCONFIG_PATH_TARGET_INFO_0`,
    public var `outputTechnology`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY`,
    public var `rotation`: `DISPLAYCONFIG_ROTATION`,
    public var `scaling`: `DISPLAYCONFIG_SCALING`,
    public var `refreshRate`: `DISPLAYCONFIG_RATIONAL`,
    public var `scanLineOrdering`: `DISPLAYCONFIG_SCANLINE_ORDERING`,
    public var `targetAvailable`: `windows_sys`.`core`.`BOOL`,
    public var `statusFlags`: UInt,
)
// UNSUPPORTED Rust 824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_PATH_TARGET_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 829:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_PATH_TARGET_INFO_0 {
//     pub modeInfoIdx: u32,
//     pub Anonymous: DISPLAYCONFIG_PATH_TARGET_INFO_0_0,
// }

// UNSUPPORTED Rust 835:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_PATH_TARGET_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_PATH_TARGET_INFO_0_0` (
    public var `_bitfield`: UInt,
)
public typealias `DISPLAYCONFIG_PIXELFORMAT` = Int;
public const val `DISPLAYCONFIG_PIXELFORMAT_16BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 2;
public const val `DISPLAYCONFIG_PIXELFORMAT_24BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 3;
public const val `DISPLAYCONFIG_PIXELFORMAT_32BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 4;
public const val `DISPLAYCONFIG_PIXELFORMAT_8BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 1;
public const val `DISPLAYCONFIG_PIXELFORMAT_NONGDI`: `DISPLAYCONFIG_PIXELFORMAT` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_RATIONAL` (
    public var `Numerator`: UInt,
    public var `Denominator`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_SDR_WHITE_LEVEL` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `SDRWhiteLevel`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `Anonymous`: `DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0`,
)
// UNSUPPORTED Rust 887:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 892:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0 {
//     pub Anonymous: DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `Anonymous`: `DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0`,
    public var `specializationType`: `windows_sys`.`core`.`GUID`,
    public var `specializationSubType`: `windows_sys`.`core`.`GUID`,
    public var `specializationApplicationName`: UShortArray,
)
// UNSUPPORTED Rust 917:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 922:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0 {
//     pub Anonymous: DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 928:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_SET_TARGET_PERSISTENCE` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `Anonymous`: `DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0`,
)
// UNSUPPORTED Rust 944:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SET_TARGET_PERSISTENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 949:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0 {
//     pub Anonymous: DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 955:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_SOURCE_DEVICE_NAME` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `viewGdiDeviceName`: UShortArray,
)
// UNSUPPORTED Rust 971:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SOURCE_DEVICE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_SOURCE_MODE` (
    public var `width`: UInt,
    public var `height`: UInt,
    public var `pixelFormat`: `DISPLAYCONFIG_PIXELFORMAT`,
    public var `position`: `super`.`super`.`Foundation`.`POINTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `Anonymous`: `DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0`,
)
// UNSUPPORTED Rust 990:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 995:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0 {
//     pub Anonymous: DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 1001:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_TARGET_BASE_TYPE` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `baseOutputTechnology`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_TARGET_DEVICE_NAME` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `flags`: `DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS`,
    public var `outputTechnology`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY`,
    public var `edidManufactureId`: UShort,
    public var `edidProductCodeId`: UShort,
    public var `connectorInstance`: UInt,
    public var `monitorFriendlyDeviceName`: UShortArray,
    public var `monitorDevicePath`: UShortArray,
)
// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_TARGET_DEVICE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS` (
    public var `Anonymous`: `DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0`,
)
// UNSUPPORTED Rust 1039:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1044:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0 {
//     pub Anonymous: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 1050:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_TARGET_MODE` (
    public var `targetVideoSignalInfo`: `DISPLAYCONFIG_VIDEO_SIGNAL_INFO`,
)
// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_TARGET_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_TARGET_PREFERRED_MODE` (
    public var `header`: `DISPLAYCONFIG_DEVICE_INFO_HEADER`,
    public var `width`: UInt,
    public var `height`: UInt,
    public var `targetMode`: `DISPLAYCONFIG_TARGET_MODE`,
)
// UNSUPPORTED Rust 1078:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPLAYCONFIG_VIDEO_SIGNAL_INFO` (
    public var `pixelRate`: ULong,
    public var `hSyncFreq`: `DISPLAYCONFIG_RATIONAL`,
    public var `vSyncFreq`: `DISPLAYCONFIG_RATIONAL`,
    public var `activeSize`: `DISPLAYCONFIG_2DREGION`,
    public var `totalSize`: `DISPLAYCONFIG_2DREGION`,
    public var `Anonymous`: `DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0`,
    public var `scanLineOrdering`: `DISPLAYCONFIG_SCANLINE_ORDERING`,
)
// UNSUPPORTED Rust 1100:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_VIDEO_SIGNAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1105:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0 {
//     pub AdditionalSignalInfo: DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0,
//     pub videoStandard: u32,
// }

// UNSUPPORTED Rust 1111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0` (
    public var `_bitfield`: UInt,
)
public const val `DISPLAYPOLICY_AC`: UInt = 1u;
public const val `DISPLAYPOLICY_DC`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISPLAY_BRIGHTNESS` (
    public var `ucDisplayPolicy`: UByte,
    public var `ucACBrightness`: UByte,
    public var `ucDCBrightness`: UByte,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRH_APIBITMAPDATA` (
    public var `pso`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?,
    public var `b`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1149:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRH_APIBITMAPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVEROBJ` (
    public var `pvObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pFreeProc`: `FREEOBJPROC`,
    public var `hdev`: `HDEV`,
    public var `dhpdev`: `DHPDEV`,
)
// UNSUPPORTED Rust 1162:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVEROBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRVENABLEDATA` (
    public var `iDriverVersion`: UInt,
    public var `c`: UInt,
    public var `pdrvfn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DRVFN`>?,
)
// UNSUPPORTED Rust 1174:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRVENABLEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRVFN` (
    public var `iFunc`: UInt,
    public var `pfn`: `PFN`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DXGK_WIN32K_PARAM_DATA` (
    public var `PathsArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ModesArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumPathArrayElements`: UInt,
    public var `NumModeArrayElements`: UInt,
    public var `SDCFlags`: UInt,
)
// UNSUPPORTED Rust 1218:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DXGK_WIN32K_PARAM_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DXGK_WIN32K_PARAM_FLAG_DISABLEVIEW`: UInt = 4u;
public const val `DXGK_WIN32K_PARAM_FLAG_MODESWITCH`: UInt = 2u;
public const val `DXGK_WIN32K_PARAM_FLAG_UPDATEREGISTRY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DisplayMode` (
    public var `DeviceName`: UShortArray,
    public var `devMode`: `super`.`super`.`Graphics`.`Gdi`.`DEVMODEW`,
)
// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DisplayMode {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DisplayModes` (
    public var `numDisplayModes`: Int,
    public var `displayMode`: Array<`DisplayMode`>,
)
// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EMFINFO` (
    public var `nSize`: UInt,
    public var `hdc`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `pvEMF`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pvCurrentRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for EMFINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENDCAP_BUTT`: Int = 2;
public const val `ENDCAP_ROUND`: Int = 0;
public const val `ENDCAP_SQUARE`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENGSAFESEMAPHORE` (
    public var `hsem`: `HSEMAPHORE`,
    public var `lCount`: Int,
)
// UNSUPPORTED Rust 1281:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENGSAFESEMAPHORE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ENG_DEVICE_ATTRIBUTE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENG_EVENT` (
    public var `pKEvent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `fFlags`: UInt,
)
// UNSUPPORTED Rust 1293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENG_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENG_FNT_CACHE_READ_FAULT`: UInt = 1u;
public const val `ENG_FNT_CACHE_WRITE_FAULT`: UInt = 2u;
public typealias `ENG_SYSTEM_ATTRIBUTE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENG_TIME_FIELDS` (
    public var `usYear`: UShort,
    public var `usMonth`: UShort,
    public var `usDay`: UShort,
    public var `usHour`: UShort,
    public var `usMinute`: UShort,
    public var `usSecond`: UShort,
    public var `usMilliseconds`: UShort,
    public var `usWeekday`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENUMRECTS` (
    public var `c`: UInt,
    public var `arcl`: Array<`super`.`super`.`Foundation`.`RECTL`>,
)
// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FD_DEVICEMETRICS` (
    public var `flRealizedType`: UInt,
    public var `pteBase`: `POINTE`,
    public var `pteSide`: `POINTE`,
    public var `lD`: Int,
    public var `fxMaxAscender`: Int,
    public var `fxMaxDescender`: Int,
    public var `ptlUnderline1`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlStrikeOut`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlULThickness`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlSOThickness`: `super`.`super`.`Foundation`.`POINTL`,
    public var `cxMax`: UInt,
    public var `cyMax`: UInt,
    public var `cjGlyphMax`: UInt,
    public var `fdxQuantized`: `FD_XFORM`,
    public var `lNonLinearExtLeading`: Int,
    public var `lNonLinearIntLeading`: Int,
    public var `lNonLinearMaxCharWidth`: Int,
    public var `lNonLinearAvgCharWidth`: Int,
    public var `lMinA`: Int,
    public var `lMinC`: Int,
    public var `lMinD`: Int,
    public var `alReserved`: IntArray,
)
// UNSUPPORTED Rust 1362:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FD_DEVICEMETRICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FD_ERROR`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FD_GLYPHATTR` (
    public var `cjThis`: UInt,
    public var `cGlyphs`: UInt,
    public var `iMode`: UInt,
    public var `aGlyphAttr`: UByteArray,
)
// UNSUPPORTED Rust 1376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FD_GLYPHATTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FD_GLYPHSET` (
    public var `cjThis`: UInt,
    public var `flAccel`: UInt,
    public var `cGlyphsSupported`: UInt,
    public var `cRuns`: UInt,
    public var `awcrun`: Array<`WCRUN`>,
)
// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FD_GLYPHSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FD_KERNINGPAIR` (
    public var `wcFirst`: UShort,
    public var `wcSecond`: UShort,
    public var `fwdKern`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FD_LIGATURE` (
    public var `culThis`: UInt,
    public var `ulType`: UInt,
    public var `cLigatures`: UInt,
    public var `alig`: Array<`LIGATURE`>,
)
// UNSUPPORTED Rust 1410:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FD_LIGATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FD_NEGATIVE_FONT`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FD_XFORM` (
    public var `eXX`: UInt,
    public var `eXY`: UInt,
    public var `eYX`: UInt,
    public var `eYY`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FD_XFORM` (
    public var `eXX`: Float,
    public var `eXY`: Float,
    public var `eYX`: Float,
    public var `eYY`: Float,
)
public const val `FF_IGNORED_SIGNATURE`: UInt = 2u;
public const val `FF_SIGNATURE_VERIFIED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLOATOBJ` (
    public var `ul1`: UInt,
    public var `ul2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLOATOBJ_XFORM` (
    public var `eM11`: `FLOATOBJ`,
    public var `eM12`: `FLOATOBJ`,
    public var `eM21`: `FLOATOBJ`,
    public var `eM22`: `FLOATOBJ`,
    public var `eDx`: `FLOATOBJ`,
    public var `eDy`: `FLOATOBJ`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLOATOBJ_XFORM` (
    public var `eM11`: Float,
    public var `eM12`: Float,
    public var `eM21`: Float,
    public var `eM22`: Float,
    public var `eDx`: Float,
    public var `eDy`: Float,
)
// UNSUPPORTED Rust 1465:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub union FLOAT_LONG {
//     pub e: u32,
//     pub l: i32,
// }

// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for FLOAT_LONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1478:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union FLOAT_LONG {
//     pub e: f32,
//     pub l: i32,
// }

// UNSUPPORTED Rust 1485:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FONTDIFF` (
    public var `jReserved1`: UByte,
    public var `jReserved2`: UByte,
    public var `jReserved3`: UByte,
    public var `bWeight`: UByte,
    public var `usWinWeight`: UShort,
    public var `fsSelection`: UShort,
    public var `fwdAveCharWidth`: Short,
    public var `fwdMaxCharInc`: Short,
    public var `ptlCaret`: `super`.`super`.`Foundation`.`POINTL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FONTINFO` (
    public var `cjThis`: UInt,
    public var `flCaps`: UInt,
    public var `cGlyphsSupported`: UInt,
    public var `cjMaxGlyph1`: UInt,
    public var `cjMaxGlyph4`: UInt,
    public var `cjMaxGlyph8`: UInt,
    public var `cjMaxGlyph32`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FONTOBJ` (
    public var `iUniq`: UInt,
    public var `iFace`: UInt,
    public var `cxMax`: UInt,
    public var `flFontType`: UInt,
    public var `iTTUniq`: ULong,
    public var `iFile`: ULong,
    public var `sizLogResPpi`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ulStyleSize`: UInt,
    public var `pvConsumer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pvProducer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1577:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FONTOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FONTSIM` (
    public var `dpBold`: Int,
    public var `dpItalic`: Int,
    public var `dpBoldItalic`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FONT_IMAGE_INFO` (
    public var `FontSize`: `super`.`super`.`System`.`Console`.`COORD`,
    public var `ImageBits`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1596:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FREEOBJPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DRIVEROBJ`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSCNTL_SCREEN_INFO` (
    public var `Position`: `super`.`super`.`System`.`Console`.`COORD`,
    public var `ScreenSize`: `super`.`super`.`System`.`Console`.`COORD`,
    public var `nNumberOfChars`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSVIDEO_COPY_FRAME_BUFFER` (
    public var `SrcScreen`: `FSCNTL_SCREEN_INFO`,
    public var `DestScreen`: `FSCNTL_SCREEN_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSVIDEO_CURSOR_POSITION` (
    public var `Coord`: `VIDEO_CURSOR_POSITION`,
    public var `dwType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSVIDEO_MODE_INFORMATION` (
    public var `VideoMode`: `VIDEO_MODE_INFORMATION`,
    public var `VideoMemory`: `VIDEO_MEMORY_INFORMATION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSVIDEO_REVERSE_MOUSE_POINTER` (
    public var `Screen`: `FSCNTL_SCREEN_INFO`,
    public var `dwType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSVIDEO_SCREEN_INFORMATION` (
    public var `ScreenSize`: `super`.`super`.`System`.`Console`.`COORD`,
    public var `FontSize`: `super`.`super`.`System`.`Console`.`COORD`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Console")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSVIDEO_WRITE_TO_FRAME_BUFFER` (
    public var `SrcBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CHAR_IMAGE_INFO`>?,
    public var `DestScreen`: `FSCNTL_SCREEN_INFO`,
)
// UNSUPPORTED Rust 1675:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Console")]
// impl Default for FSVIDEO_WRITE_TO_FRAME_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GAMMARAMP` (
    public var `Red`: UShortArray,
    public var `Green`: UShortArray,
    public var `Blue`: UShortArray,
)
// UNSUPPORTED Rust 1688:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GAMMARAMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1025 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GAMMA_RAMP_DXGI_1` (
    public var `Scale`: `GAMMA_RAMP_RGB`,
    public var `Offset`: `GAMMA_RAMP_RGB`,
    public var `GammaCurve`: Array<`GAMMA_RAMP_RGB`>,
)
// UNSUPPORTED Rust 1700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GAMMA_RAMP_DXGI_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GAMMA_RAMP_RGB` (
    public var `Red`: Float,
    public var `Green`: Float,
    public var `Blue`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GAMMA_RAMP_RGB256x3x16` (
    public var `Red`: UShortArray,
    public var `Green`: UShortArray,
    public var `Blue`: UShortArray,
)
// UNSUPPORTED Rust 1719:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GDIINFO` (
    public var `ulVersion`: UInt,
    public var `ulTechnology`: UInt,
    public var `ulHorzSize`: UInt,
    public var `ulVertSize`: UInt,
    public var `ulHorzRes`: UInt,
    public var `ulVertRes`: UInt,
    public var `cBitsPixel`: UInt,
    public var `cPlanes`: UInt,
    public var `ulNumColors`: UInt,
    public var `flRaster`: UInt,
    public var `ulLogPixelsX`: UInt,
    public var `ulLogPixelsY`: UInt,
    public var `flTextCaps`: UInt,
    public var `ulDACRed`: UInt,
    public var `ulDACGreen`: UInt,
    public var `ulDACBlue`: UInt,
    public var `ulAspectX`: UInt,
    public var `ulAspectY`: UInt,
    public var `ulAspectXY`: UInt,
    public var `xStyleStep`: Int,
    public var `yStyleStep`: Int,
    public var `denStyleStep`: Int,
    public var `ptlPhysOffset`: `super`.`super`.`Foundation`.`POINTL`,
    public var `szlPhysSize`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ulNumPalReg`: UInt,
    public var `ciDevice`: `COLORINFO`,
    public var `ulDevicePelsDPI`: UInt,
    public var `ulPrimaryOrder`: UInt,
    public var `ulHTPatternSize`: UInt,
    public var `ulHTOutputFormat`: UInt,
    public var `flHTFlags`: UInt,
    public var `ulVRefresh`: UInt,
    public var `ulBltAlignment`: UInt,
    public var `ulPanningHorzRes`: UInt,
    public var `ulPanningVertRes`: UInt,
    public var `xPanningAlignment`: UInt,
    public var `yPanningAlignment`: UInt,
    public var `cxHTPat`: UInt,
    public var `cyHTPat`: UInt,
    public var `pHTPatA`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pHTPatB`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pHTPatC`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `flShadeBlend`: UInt,
    public var `ulPhysicalPixelCharacteristics`: UInt,
    public var `ulPhysicalPixelGamma`: UInt,
)
// UNSUPPORTED Rust 1820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GDIINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GDI_DRIVER_VERSION`: UInt = 16384u;
public const val `GETCONNECTEDIDS_SOURCE`: UInt = 1u;
public const val `GETCONNECTEDIDS_TARGET`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GLYPHBITS` (
    public var `ptlOrigin`: `super`.`super`.`Foundation`.`POINTL`,
    public var `sizlBitmap`: `super`.`super`.`Foundation`.`SIZE`,
    public var `aj`: UByteArray,
)
// UNSUPPORTED Rust 1835:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GLYPHBITS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GLYPHDATA` (
    public var `gdf`: `GLYPHDEF`,
    public var `hg`: UInt,
    public var `fxD`: Int,
    public var `fxA`: Int,
    public var `fxAB`: Int,
    public var `fxInkTop`: Int,
    public var `fxInkBottom`: Int,
    public var `rclInk`: `super`.`super`.`Foundation`.`RECTL`,
    public var `ptqD`: `POINTQF`,
)
// UNSUPPORTED Rust 1853:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GLYPHDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1858:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GLYPHDEF {
//     pub pgb: *mut GLYPHBITS,
//     pub ppo: *mut PATHOBJ,
// }

// UNSUPPORTED Rust 1864:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GLYPHDEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GLYPHPOS` (
    public var `hg`: UInt,
    public var `pgdf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHDEF`>?,
    public var `ptl`: `super`.`super`.`Foundation`.`POINTL`,
)
// UNSUPPORTED Rust 1876:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GLYPHPOS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GS_16BIT_HANDLES`: UInt = 4u;
public const val `GS_8BIT_HANDLES`: UInt = 2u;
public const val `GS_UNICODE_HANDLES`: UInt = 1u;
// UNSUPPORTED Rust 1884:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_DISPLAY_ADAPTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5b45201d_f2f2_4f3b_85bb_30ff1f953599);

// UNSUPPORTED Rust 1885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_MONITOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6f07b5f_ee97_4a90_b076_33f57bf4eaa7);

// UNSUPPORTED Rust 1886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_VIDEO_OUTPUT_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ad9e4f0_f88d_4360_bab9_4c2d55e564cd);

// UNSUPPORTED Rust 1887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DISPLAY_DEVICE_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ca05180_a699_450a_9a0c_de4fbe3ddd89);

// UNSUPPORTED Rust 1888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MONITOR_OVERRIDE_PSEUDO_SPECIALIZED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf196c02f_f86f_4f9a_aa15_e9cebdfe3b96);

public const val `GX_GENERAL`: Int = 3;
public const val `GX_IDENTITY`: Int = 0;
public const val `GX_OFFSET`: Int = 1;
public const val `GX_SCALE`: Int = 2;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HBM` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDEV` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDRVOBJ` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HFASTMUTEX` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
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
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HSEMAPHORE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HSURF` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IFIEXTRA` (
    public var `ulIdentifier`: UInt,
    public var `dpFontSig`: Int,
    public var `cig`: UInt,
    public var `dpDesignVector`: Int,
    public var `dpAxesInfoW`: Int,
    public var `aulReserved`: UIntArray,
)
// UNSUPPORTED Rust 1989:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IFIEXTRA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IFIMETRICS` (
    public var `cjThis`: UInt,
    public var `cjIfiExtra`: UInt,
    public var `dpwszFamilyName`: Int,
    public var `dpwszStyleName`: Int,
    public var `dpwszFaceName`: Int,
    public var `dpwszUniqueName`: Int,
    public var `dpFontSim`: Int,
    public var `lEmbedId`: Int,
    public var `lItalicAngle`: Int,
    public var `lCharBias`: Int,
    public var `dpCharSets`: Int,
    public var `jWinCharSet`: UByte,
    public var `jWinPitchAndFamily`: UByte,
    public var `usWinWeight`: UShort,
    public var `flInfo`: UInt,
    public var `fsSelection`: UShort,
    public var `fsType`: UShort,
    public var `fwdUnitsPerEm`: Short,
    public var `fwdLowestPPEm`: Short,
    public var `fwdWinAscender`: Short,
    public var `fwdWinDescender`: Short,
    public var `fwdMacAscender`: Short,
    public var `fwdMacDescender`: Short,
    public var `fwdMacLineGap`: Short,
    public var `fwdTypoAscender`: Short,
    public var `fwdTypoDescender`: Short,
    public var `fwdTypoLineGap`: Short,
    public var `fwdAveCharWidth`: Short,
    public var `fwdMaxCharInc`: Short,
    public var `fwdCapHeight`: Short,
    public var `fwdXHeight`: Short,
    public var `fwdSubscriptXSize`: Short,
    public var `fwdSubscriptYSize`: Short,
    public var `fwdSubscriptXOffset`: Short,
    public var `fwdSubscriptYOffset`: Short,
    public var `fwdSuperscriptXSize`: Short,
    public var `fwdSuperscriptYSize`: Short,
    public var `fwdSuperscriptXOffset`: Short,
    public var `fwdSuperscriptYOffset`: Short,
    public var `fwdUnderscoreSize`: Short,
    public var `fwdUnderscorePosition`: Short,
    public var `fwdStrikeoutSize`: Short,
    public var `fwdStrikeoutPosition`: Short,
    public var `chFirstChar`: UByte,
    public var `chLastChar`: UByte,
    public var `chDefaultChar`: UByte,
    public var `chBreakChar`: UByte,
    public var `wcFirstChar`: UShort,
    public var `wcLastChar`: UShort,
    public var `wcDefaultChar`: UShort,
    public var `wcBreakChar`: UShort,
    public var `ptlBaseline`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlAspect`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlCaret`: `super`.`super`.`Foundation`.`POINTL`,
    public var `rclFontBox`: `super`.`super`.`Foundation`.`RECTL`,
    public var `achVendId`: UByteArray,
    public var `cKerningPairs`: UInt,
    public var `ulPanoseCulture`: UInt,
    public var `panose`: `super`.`super`.`Graphics`.`Gdi`.`PANOSE`,
)
// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for IFIMETRICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IFIMETRICS` (
    public var `cjThis`: UInt,
    public var `cjIfiExtra`: UInt,
    public var `dpwszFamilyName`: Int,
    public var `dpwszStyleName`: Int,
    public var `dpwszFaceName`: Int,
    public var `dpwszUniqueName`: Int,
    public var `dpFontSim`: Int,
    public var `lEmbedId`: Int,
    public var `lItalicAngle`: Int,
    public var `lCharBias`: Int,
    public var `dpCharSets`: Int,
    public var `jWinCharSet`: UByte,
    public var `jWinPitchAndFamily`: UByte,
    public var `usWinWeight`: UShort,
    public var `flInfo`: UInt,
    public var `fsSelection`: UShort,
    public var `fsType`: UShort,
    public var `fwdUnitsPerEm`: Short,
    public var `fwdLowestPPEm`: Short,
    public var `fwdWinAscender`: Short,
    public var `fwdWinDescender`: Short,
    public var `fwdMacAscender`: Short,
    public var `fwdMacDescender`: Short,
    public var `fwdMacLineGap`: Short,
    public var `fwdTypoAscender`: Short,
    public var `fwdTypoDescender`: Short,
    public var `fwdTypoLineGap`: Short,
    public var `fwdAveCharWidth`: Short,
    public var `fwdMaxCharInc`: Short,
    public var `fwdCapHeight`: Short,
    public var `fwdXHeight`: Short,
    public var `fwdSubscriptXSize`: Short,
    public var `fwdSubscriptYSize`: Short,
    public var `fwdSubscriptXOffset`: Short,
    public var `fwdSubscriptYOffset`: Short,
    public var `fwdSuperscriptXSize`: Short,
    public var `fwdSuperscriptYSize`: Short,
    public var `fwdSuperscriptXOffset`: Short,
    public var `fwdSuperscriptYOffset`: Short,
    public var `fwdUnderscoreSize`: Short,
    public var `fwdUnderscorePosition`: Short,
    public var `fwdStrikeoutSize`: Short,
    public var `fwdStrikeoutPosition`: Short,
    public var `chFirstChar`: UByte,
    public var `chLastChar`: UByte,
    public var `chDefaultChar`: UByte,
    public var `chBreakChar`: UByte,
    public var `wcFirstChar`: UShort,
    public var `wcLastChar`: UShort,
    public var `wcDefaultChar`: UShort,
    public var `wcBreakChar`: UShort,
    public var `ptlBaseline`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlAspect`: `super`.`super`.`Foundation`.`POINTL`,
    public var `ptlCaret`: `super`.`super`.`Foundation`.`POINTL`,
    public var `rclFontBox`: `super`.`super`.`Foundation`.`RECTL`,
    public var `achVendId`: UByteArray,
    public var `cKerningPairs`: UInt,
    public var `ulPanoseCulture`: UInt,
    public var `panose`: `super`.`super`.`Graphics`.`Gdi`.`PANOSE`,
    public var `Align`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2132:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INDIRECT_DISPLAY_INFO` (
    public var `DisplayAdapterLuid`: `super`.`super`.`Foundation`.`LUID`,
    public var `Flags`: UInt,
    public var `NumMonitors`: UInt,
    public var `DisplayAdapterTargetBase`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LIGATURE` (
    public var `culSize`: UInt,
    public var `pwsz`: `windows_sys`.`core`.`PWSTR`,
    public var `chglyph`: UInt,
    public var `ahglyph`: UIntArray,
)
// UNSUPPORTED Rust 2339:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LIGATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEATTRS` (
    public var `fl`: UInt,
    public var `iJoin`: UInt,
    public var `iEndCap`: UInt,
    public var `elWidth`: `FLOAT_LONG`,
    public var `eMiterLimit`: UInt,
    public var `cstyle`: UInt,
    public var `pstyle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FLOAT_LONG`>?,
    public var `elStyleState`: `FLOAT_LONG`,
)
// UNSUPPORTED Rust 2357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for LINEATTRS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LINEATTRS` (
    public var `fl`: UInt,
    public var `iJoin`: UInt,
    public var `iEndCap`: UInt,
    public var `elWidth`: `FLOAT_LONG`,
    public var `eMiterLimit`: Float,
    public var `cstyle`: UInt,
    public var `pstyle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FLOAT_LONG`>?,
    public var `elStyleState`: `FLOAT_LONG`,
)
// UNSUPPORTED Rust 2376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MC_TIMING_REPORT` (
    public var `dwHorizontalFrequencyInHZ`: UInt,
    public var `dwVerticalFrequencyInHZ`: UInt,
    public var `bTimingStatusByte`: UByte,
)
public typealias `MC_VCP_CODE_TYPE` = Int;
public const val `MC_VERTICAL_POSITION`: `MC_POSITION_TYPE` = 1;
public const val `MC_WIDTH`: `MC_SIZE_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIPI_DSI_CAPS` (
    public var `DSITypeMajor`: UByte,
    public var `DSITypeMinor`: UByte,
    public var `SpecVersionMajor`: UByte,
    public var `SpecVersionMinor`: UByte,
    public var `SpecVersionPatch`: UByte,
    public var `TargetMaximumReturnPacketSize`: UShort,
    public var `ResultCodeFlags`: UByte,
    public var `ResultCodeStatus`: UByte,
    public var `Revision`: UByte,
    public var `Level`: UByte,
    public var `DeviceClassHi`: UByte,
    public var `DeviceClassLo`: UByte,
    public var `ManufacturerHi`: UByte,
    public var `ManufacturerLo`: UByte,
    public var `ProductHi`: UByte,
    public var `ProductLo`: UByte,
    public var `LengthHi`: UByte,
    public var `LengthLo`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIPI_DSI_PACKET` (
    public var `Anonymous1`: `MIPI_DSI_PACKET_0`,
    public var `Anonymous2`: `MIPI_DSI_PACKET_1`,
    public var `EccFiller`: UByte,
    public var `Payload`: UByteArray,
)
// UNSUPPORTED Rust 2480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIPI_DSI_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2485:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIPI_DSI_PACKET_0 {
//     pub DataId: u8,
//     pub Anonymous: MIPI_DSI_PACKET_0_0,
// }

// UNSUPPORTED Rust 2491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIPI_DSI_PACKET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIPI_DSI_PACKET_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 2501:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIPI_DSI_PACKET_1 {
//     pub Anonymous: MIPI_DSI_PACKET_1_0,
//     pub LongWriteWordCount: u16,
// }

// UNSUPPORTED Rust 2507:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIPI_DSI_PACKET_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIPI_DSI_PACKET_1_0` (
    public var `Data0`: UByte,
    public var `Data1`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIPI_DSI_RESET` (
    public var `Flags`: UInt,
    public var `Anonymous`: `MIPI_DSI_RESET_0`,
)
// UNSUPPORTED Rust 2524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIPI_DSI_RESET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2529:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIPI_DSI_RESET_0 {
//     pub Anonymous: MIPI_DSI_RESET_0_0,
//     pub Results: u32,
// }

// UNSUPPORTED Rust 2535:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIPI_DSI_RESET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIPI_DSI_RESET_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIPI_DSI_TRANSMISSION` (
    public var `TotalBufferSize`: UInt,
    public var `PacketCount`: UByte,
    public var `FailedPacket`: UByte,
    public var `Anonymous`: `MIPI_DSI_TRANSMISSION_0`,
    public var `ReadWordCount`: UShort,
    public var `FinalCommandExtraPayload`: UShort,
    public var `MipiErrors`: UShort,
    public var `HostErrors`: UShort,
    public var `Packets`: Array<`MIPI_DSI_PACKET`>,
)
// UNSUPPORTED Rust 2558:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIPI_DSI_TRANSMISSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIPI_DSI_TRANSMISSION_0` (
    public var `_bitfield`: UShort,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OUTPUT_WIRE_FORMAT` (
    public var `ColorEncoding`: `OUTPUT_COLOR_ENCODING`,
    public var `BitsPerPixel`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PALOBJ` (
    public var `ulReserved`: UInt,
)
public const val `PAL_BGR`: UInt = 8u;
public const val `PAL_BITFIELDS`: UInt = 2u;
public const val `PAL_CMYK`: UInt = 16u;
public const val `PAL_INDEXED`: UInt = 1u;
public const val `PAL_RGB`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_BRIGHTNESS_SENSOR_DATA` (
    public var `Anonymous`: `PANEL_BRIGHTNESS_SENSOR_DATA_0`,
    public var `AlsReading`: Float,
    public var `ChromaticityCoordinate`: `CHROMATICITY_COORDINATE`,
    public var `ColorTemperature`: Float,
)
// UNSUPPORTED Rust 2620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_BRIGHTNESS_SENSOR_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2625:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_BRIGHTNESS_SENSOR_DATA_0 {
//     pub Anonymous: PANEL_BRIGHTNESS_SENSOR_DATA_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2631:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_BRIGHTNESS_SENSOR_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANEL_BRIGHTNESS_SENSOR_DATA_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANEL_GET_BACKLIGHT_REDUCTION` (
    public var `BacklightUsersetting`: UShort,
    public var `BacklightEffective`: UShort,
    public var `GammaRamp`: `BACKLIGHT_REDUCTION_GAMMA_RAMP`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_GET_BRIGHTNESS` (
    public var `Version`: `BRIGHTNESS_INTERFACE_VERSION`,
    public var `Anonymous`: `PANEL_GET_BRIGHTNESS_0`,
)
// UNSUPPORTED Rust 2654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_GET_BRIGHTNESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2659:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_GET_BRIGHTNESS_0 {
//     pub Level: u8,
//     pub Anonymous: PANEL_GET_BRIGHTNESS_0_0,
// }

// UNSUPPORTED Rust 2665:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_GET_BRIGHTNESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANEL_GET_BRIGHTNESS_0_0` (
    public var `CurrentInMillinits`: UInt,
    public var `TargetInMillinits`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_QUERY_BRIGHTNESS_CAPS` (
    public var `Version`: `BRIGHTNESS_INTERFACE_VERSION`,
    public var `Anonymous`: `PANEL_QUERY_BRIGHTNESS_CAPS_0`,
)
// UNSUPPORTED Rust 2682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_QUERY_BRIGHTNESS_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2687:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_QUERY_BRIGHTNESS_CAPS_0 {
//     pub Anonymous: PANEL_QUERY_BRIGHTNESS_CAPS_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_QUERY_BRIGHTNESS_CAPS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANEL_QUERY_BRIGHTNESS_CAPS_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_QUERY_BRIGHTNESS_RANGES` (
    public var `Version`: `BRIGHTNESS_INTERFACE_VERSION`,
    public var `Anonymous`: `PANEL_QUERY_BRIGHTNESS_RANGES_0`,
)
// UNSUPPORTED Rust 2709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_QUERY_BRIGHTNESS_RANGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2714:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_QUERY_BRIGHTNESS_RANGES_0 {
//     pub BrightnessLevel: BRIGHTNESS_LEVEL,
//     pub NitRanges: BRIGHTNESS_NIT_RANGES,
// }

// UNSUPPORTED Rust 2720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_QUERY_BRIGHTNESS_RANGES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANEL_SET_BACKLIGHT_OPTIMIZATION` (
    public var `Level`: `BACKLIGHT_OPTIMIZATION_LEVEL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_SET_BRIGHTNESS` (
    public var `Version`: `BRIGHTNESS_INTERFACE_VERSION`,
    public var `Anonymous`: `PANEL_SET_BRIGHTNESS_0`,
)
// UNSUPPORTED Rust 2736:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_SET_BRIGHTNESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2741:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_SET_BRIGHTNESS_0 {
//     pub Level: u8,
//     pub Anonymous: PANEL_SET_BRIGHTNESS_0_0,
// }

// UNSUPPORTED Rust 2747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_SET_BRIGHTNESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_SET_BRIGHTNESS_0_0` (
    public var `Millinits`: UInt,
    public var `TransitionTimeInMs`: UInt,
    public var `SensorData`: `PANEL_BRIGHTNESS_SENSOR_DATA`,
)
// UNSUPPORTED Rust 2759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_SET_BRIGHTNESS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PANEL_SET_BRIGHTNESS_STATE` (
    public var `Anonymous`: `PANEL_SET_BRIGHTNESS_STATE_0`,
)
// UNSUPPORTED Rust 2769:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_SET_BRIGHTNESS_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2774:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_SET_BRIGHTNESS_STATE_0 {
//     pub Anonymous: PANEL_SET_BRIGHTNESS_STATE_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2780:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PANEL_SET_BRIGHTNESS_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PANEL_SET_BRIGHTNESS_STATE_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PATHDATA` (
    public var `flags`: UInt,
    public var `count`: UInt,
    public var `pptfx`: /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTFIX`>?,
)
// UNSUPPORTED Rust 2797:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PATHDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PATHOBJ` (
    public var `fl`: UInt,
    public var `cCurves`: UInt,
)
public const val `PD_BEGINSUBPATH`: UInt = 1u;
public const val `PD_BEZIERS`: UInt = 16u;
public const val `PD_CLOSEFIGURE`: UInt = 8u;
public const val `PD_ENDSUBPATH`: UInt = 2u;
public const val `PD_RESETSTYLE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERBANDINFO` (
    public var `bRepeatThisBand`: `windows_sys`.`core`.`BOOL`,
    public var `szlBand`: `super`.`super`.`Foundation`.`SIZE`,
    public var `ulHorzRes`: UInt,
    public var `ulVertRes`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Long>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvAccumulateD3DDirtyRect` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CDDDXGK_REDIRBITMAPPRESENTINFO`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvAlphaBlend` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BLENDOBJ`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvAssertMode` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `windows_sys`.`core`.`BOOL`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvAssociateSharedSurface` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`SIZE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvBitBlt` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvCompletePDEV` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `HDEV`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvCopyBits` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvCreateDeviceBitmap` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `super`.`super`.`Foundation`.`SIZE`, UInt) -> `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvCreateDeviceBitmapEx` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `super`.`super`.`Foundation`.`SIZE`, UInt, UInt, `DHSURF`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDeleteDeviceBitmap` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHSURF`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDeleteDeviceBitmapEx` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHSURF`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_OpenGL")]
public typealias `PFN_DrvDescribePixelFormat` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, Int, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`OpenGL`.`PIXELFORMATDESCRIPTOR`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDestroyFont` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDisableDirectDraw` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDisableDriver` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDisablePDEV` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDisableSurface` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDitherColor` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvDrawEscape` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvEnableDriver` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`DRVENABLEDATA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvEnablePDEV` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEW`>?, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`HSURF`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`GDIINFO`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`DEVINFO`>?, `HDEV`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HANDLE`) -> `DHPDEV`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvEnableSurface` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`) -> `HSURF`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvEndDoc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvEndDxInterop` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvEscape` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvFillPath` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvFontManagement` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvFree` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvGetGlyphMode` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvGetModes` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEW`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvGetTrueTypeFile` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvGradientFill` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`TRIVERTEX`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvIcmCheckBitmapBits` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_ColorSystem"))]
public typealias `PFN_DrvIcmCreateColorTransform` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`ColorSystem`.`LOGCOLORSPACEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt) -> `super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvIcmDeleteColorTransform` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvIcmSetDeviceGammaRamp` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvLineTo` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, Int, Int, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvLoadFontFile` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DESIGNVECTOR`>?, UInt, UInt) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvLockDisplayArea` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvMovePointer` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvNextBand` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvNotify` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvPaint` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvPlgBlt` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`COLORADJUSTMENT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTFIX`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryAdvanceWidths` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryDeviceSupport` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvQueryFont` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`IFIMETRICS`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryFontCaps` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryFontData` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHDATA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryFontFile` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryFontTree` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, ULong, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryGlyphAttrs` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`FD_GLYPHATTR`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryPerBandInfo` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PERBANDINFO`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQuerySpoolType` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvQueryTrueTypeOutline` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, UInt, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHDATA`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`TTPOLYGONHEADER`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryTrueTypeSection` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvQueryTrueTypeTable` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, UInt, Int, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvRealizeBrush` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvRenderHint` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, UInt, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvResetDevice` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvResetPDEV` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `DHPDEV`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSaveScreenBits` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, UInt, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSendPage` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSetPalette` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`PALOBJ`>?, UInt, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSetPixelFormat` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, Int, `super`.`super`.`Foundation`.`HWND`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSetPointerShape` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, Int, Int, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvStartBanding` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvStartDoc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `windows_sys`.`core`.`PCWSTR`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvStartDxInterop` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvStartPage` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvStretchBlt` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`COLORADJUSTMENT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFN_DrvStretchBltROP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`COLORADJUSTMENT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvStrokeAndFillPath` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEATTRS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvStrokePath` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PATHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XFORMOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LINEATTRS`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSurfaceComplete` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, `super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSwapBuffers` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WNDOBJ`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSynchronize` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSynchronizeRedirectionBitmaps` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvSynchronizeSurface` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvTextOut` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`STROBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FONTOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`BRUSHOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINTL`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvTransparentBlt` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`XLATEOBJ`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvUnloadFontFile` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_DrvUnlockDisplayArea` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DHPDEV`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECTL`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngCombineRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngCopyRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngCreateRectRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, Int, Int, Int) -> `super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngDeleteRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngIntersectRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngSubtractRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngUnionRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_EngXorRgn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHYSICAL_MONITOR` (
    public var `hPhysicalMonitor`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `szPhysicalMonitorDescription`: UShortArray,
)
// UNSUPPORTED Rust 2933:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHYSICAL_MONITOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PHYSICAL_MONITOR_DESCRIPTION_SIZE`: UInt = 128u;
public const val `PLANAR_HC`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTE` (
    public var `x`: UInt,
    public var `y`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTE` (
    public var `x`: Float,
    public var `y`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTFIX` (
    public var `x`: Int,
    public var `y`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTQF` (
    public var `x`: Long,
    public var `y`: Long,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PVIDEO_WIN32K_CALLOUT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RECTFX` (
    public var `xLeft`: Int,
    public var `yTop`: Int,
    public var `xRight`: Int,
    public var `yBottom`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RUN` (
    public var `iStart`: Int,
    public var `iStop`: Int,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_ACTIVE_COLOR_PROFILE_NAME` (
    public var `ColorProfileName`: UShortArray,
)
// UNSUPPORTED Rust 3062:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SET_ACTIVE_COLOR_PROFILE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SET_DISPLAY_CONFIG_FLAGS` = UInt;
public const val `SGI_EXTRASPACE`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SORTCOMP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STROBJ` (
    public var `cGlyphs`: UInt,
    public var `flAccel`: UInt,
    public var `ulCharInc`: UInt,
    public var `rclBkGround`: `super`.`super`.`Foundation`.`RECTL`,
    public var `pgp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHPOS`>?,
    public var `pwszOrg`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STROBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STYPE_BITMAP`: Int = 0;
public const val `STYPE_DEVBITMAP`: Int = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SURFOBJ` (
    public var `dhsurf`: `DHSURF`,
    public var `hsurf`: `HSURF`,
    public var `dhpdev`: `DHPDEV`,
    public var `hdev`: `HDEV`,
    public var `sizlBitmap`: `super`.`super`.`Foundation`.`SIZE`,
    public var `cjBits`: UInt,
    public var `pvBits`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pvScan0`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lDelta`: Int,
    public var `iUniq`: UInt,
    public var `iBitmapFormat`: UInt,
    public var `iType`: UShort,
    public var `fjBitmap`: UShort,
)
// UNSUPPORTED Rust 3135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SURFOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `S_INIT`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Sources` (
    public var `sourceId`: UInt,
    public var `numTargets`: Int,
    public var `aTargets`: UIntArray,
)
// UNSUPPORTED Rust 3148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TYPE1_FONT` (
    public var `hPFM`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hPFB`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `ulIdentifier`: UInt,
)
// UNSUPPORTED Rust 3165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TYPE1_FONT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VGA_CHAR` (
    public var `Char`: Byte,
    public var `Attributes`: Byte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEOPARAMETERS` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `dwOffset`: UInt,
    public var `dwCommand`: UInt,
    public var `dwFlags`: UInt,
    public var `dwMode`: UInt,
    public var `dwTVStandard`: UInt,
    public var `dwAvailableModes`: UInt,
    public var `dwAvailableTVStandard`: UInt,
    public var `dwFlickerFilter`: UInt,
    public var `dwOverScanX`: UInt,
    public var `dwOverScanY`: UInt,
    public var `dwMaxUnscaledX`: UInt,
    public var `dwMaxUnscaledY`: UInt,
    public var `dwPositionX`: UInt,
    public var `dwPositionY`: UInt,
    public var `dwBrightness`: UInt,
    public var `dwContrast`: UInt,
    public var `dwCPType`: UInt,
    public var `dwCPCommand`: UInt,
    public var `dwCPStandard`: UInt,
    public var `dwCPKey`: UInt,
    public var `bCP_APSTriggerBits`: UInt,
    public var `bOEMCopyProtection`: UByteArray,
)
// UNSUPPORTED Rust 3203:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEOPARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_BANK_SELECT` (
    public var `Length`: UInt,
    public var `Size`: UInt,
    public var `BankingFlags`: UInt,
    public var `BankingType`: UInt,
    public var `PlanarHCBankingType`: UInt,
    public var `BitmapWidthInBytes`: UInt,
    public var `BitmapSize`: UInt,
    public var `Granularity`: UInt,
    public var `PlanarHCGranularity`: UInt,
    public var `CodeOffset`: UInt,
    public var `PlanarHCBankCodeOffset`: UInt,
    public var `PlanarHCEnableCodeOffset`: UInt,
    public var `PlanarHCDisableCodeOffset`: UInt,
)
public typealias `VIDEO_BANK_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_BRIGHTNESS_POLICY` (
    public var `DefaultToBiosPolicy`: Boolean,
    public var `LevelCount`: UByte,
    public var `Level`: Array<`VIDEO_BRIGHTNESS_POLICY_0`>,
)
// UNSUPPORTED Rust 3233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_BRIGHTNESS_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_BRIGHTNESS_POLICY_0` (
    public var `BatteryLevel`: UByte,
    public var `Brightness`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_CLUT` (
    public var `NumEntries`: UShort,
    public var `FirstEntry`: UShort,
    public var `LookupTable`: Array<`VIDEO_CLUT_0`>,
)
// UNSUPPORTED Rust 3251:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_CLUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3256:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIDEO_CLUT_0 {
//     pub RgbArray: VIDEO_CLUTDATA,
//     pub RgbLong: u32,
// }

// UNSUPPORTED Rust 3262:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_CLUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_CLUTDATA` (
    public var `Red`: UByte,
    public var `Green`: UByte,
    public var `Blue`: UByte,
    public var `Unused`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_COLOR_CAPABILITIES` (
    public var `Length`: UInt,
    public var `AttributeFlags`: UInt,
    public var `RedPhosphoreDecay`: Int,
    public var `GreenPhosphoreDecay`: Int,
    public var `BluePhosphoreDecay`: Int,
    public var `WhiteChromaticity_x`: Int,
    public var `WhiteChromaticity_y`: Int,
    public var `WhiteChromaticity_Y`: Int,
    public var `RedChromaticity_x`: Int,
    public var `RedChromaticity_y`: Int,
    public var `GreenChromaticity_x`: Int,
    public var `GreenChromaticity_y`: Int,
    public var `BlueChromaticity_x`: Int,
    public var `BlueChromaticity_y`: Int,
    public var `WhiteGamma`: Int,
    public var `RedGamma`: Int,
    public var `GreenGamma`: Int,
    public var `BlueGamma`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_COLOR_LUT_DATA` (
    public var `Length`: UInt,
    public var `LutDataFormat`: UInt,
    public var `LutData`: UByteArray,
)
// UNSUPPORTED Rust 3304:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_COLOR_LUT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_COLOR_LUT_DATA_FORMAT_PRIVATEFORMAT`: UInt = 2147483648u;
public const val `VIDEO_COLOR_LUT_DATA_FORMAT_RGB256WORDS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_CURSOR_ATTRIBUTES` (
    public var `Width`: UShort,
    public var `Height`: UShort,
    public var `Column`: Short,
    public var `Row`: Short,
    public var `Rate`: UByte,
    public var `Enable`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_CURSOR_POSITION` (
    public var `Column`: Short,
    public var `Row`: Short,
)
public const val `VIDEO_DEVICE_COLOR`: UInt = 1u;
// UNSUPPORTED Rust 3328:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const VIDEO_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("DISPLAY%d");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_DEVICE_SESSION_STATUS` (
    public var `bEnable`: UInt,
    public var `bSuccess`: UInt,
)
public const val `VIDEO_DUALVIEW_PRIMARY`: UInt = 2147483648u;
public const val `VIDEO_DUALVIEW_REMOVABLE`: UInt = 1u;
public const val `VIDEO_DUALVIEW_SECONDARY`: UInt = 1073741824u;
public const val `VIDEO_DUALVIEW_WDDM_VGA`: UInt = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_HARDWARE_STATE` (
    public var `StateHeader`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VIDEO_HARDWARE_STATE_HEADER`>?,
    public var `StateLength`: UInt,
)
// UNSUPPORTED Rust 3345:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_HARDWARE_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_HARDWARE_STATE_HEADER` (
    public var `Length`: UInt,
    public var `PortValue`: UByteArray,
    public var `AttribIndexDataState`: UInt,
    public var `BasicSequencerOffset`: UInt,
    public var `BasicCrtContOffset`: UInt,
    public var `BasicGraphContOffset`: UInt,
    public var `BasicAttribContOffset`: UInt,
    public var `BasicDacOffset`: UInt,
    public var `BasicLatchesOffset`: UInt,
    public var `ExtendedSequencerOffset`: UInt,
    public var `ExtendedCrtContOffset`: UInt,
    public var `ExtendedGraphContOffset`: UInt,
    public var `ExtendedAttribContOffset`: UInt,
    public var `ExtendedDacOffset`: UInt,
    public var `ExtendedValidatorStateOffset`: UInt,
    public var `ExtendedMiscDataOffset`: UInt,
    public var `PlaneLength`: UInt,
    public var `Plane1Offset`: UInt,
    public var `Plane2Offset`: UInt,
    public var `Plane3Offset`: UInt,
    public var `Plane4Offset`: UInt,
    public var `VGAStateFlags`: UInt,
    public var `DIBOffset`: UInt,
    public var `DIBBitsPerPixel`: UInt,
    public var `DIBXResolution`: UInt,
    public var `DIBYResolution`: UInt,
    public var `DIBXlatOffset`: UInt,
    public var `DIBXlatLength`: UInt,
    public var `VesaInfoOffset`: UInt,
    public var `FrameBufferData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_HARDWARE_STATE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_LOAD_FONT_INFORMATION` (
    public var `WidthInPixels`: UShort,
    public var `HeightInPixels`: UShort,
    public var `FontSize`: UInt,
    public var `Font`: UByteArray,
)
// UNSUPPORTED Rust 3397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_LOAD_FONT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_LUT_RGB256WORDS` (
    public var `Red`: UShortArray,
    public var `Green`: UShortArray,
    public var `Blue`: UShortArray,
)
// UNSUPPORTED Rust 3409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_LUT_RGB256WORDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_MAX_REASON`: UInt = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_MEMORY` (
    public var `RequestedVirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_MEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_MEMORY_INFORMATION` (
    public var `VideoRamBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `VideoRamLength`: UInt,
    public var `FrameBufferBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FrameBufferLength`: UInt,
)
// UNSUPPORTED Rust 3433:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_MEMORY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_MODE` (
    public var `RequestedMode`: UInt,
)
public const val `VIDEO_MODE_ANIMATE_START`: UInt = 8u;
public const val `VIDEO_MODE_ANIMATE_UPDATE`: UInt = 16u;
public const val `VIDEO_MODE_ASYNC_POINTER`: UInt = 1u;
public const val `VIDEO_MODE_BANKED`: UInt = 128u;
public const val `VIDEO_MODE_COLOR`: UInt = 1u;
public const val `VIDEO_MODE_COLOR_POINTER`: UInt = 4u;
public const val `VIDEO_MODE_GRAPHICS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_MODE_INFORMATION` (
    public var `Length`: UInt,
    public var `ModeIndex`: UInt,
    public var `VisScreenWidth`: UInt,
    public var `VisScreenHeight`: UInt,
    public var `ScreenStride`: UInt,
    public var `NumberOfPlanes`: UInt,
    public var `BitsPerPlane`: UInt,
    public var `Frequency`: UInt,
    public var `XMillimeter`: UInt,
    public var `YMillimeter`: UInt,
    public var `NumberRedBits`: UInt,
    public var `NumberGreenBits`: UInt,
    public var `NumberBlueBits`: UInt,
    public var `RedMask`: UInt,
    public var `GreenMask`: UInt,
    public var `BlueMask`: UInt,
    public var `AttributeFlags`: UInt,
    public var `VideoMemoryBitmapWidth`: UInt,
    public var `VideoMemoryBitmapHeight`: UInt,
    public var `DriverSpecificAttributeFlags`: UInt,
)
public const val `VIDEO_MODE_INTERLACED`: UInt = 16u;
public const val `VIDEO_MODE_LINEAR`: UInt = 256u;
public const val `VIDEO_MODE_MANAGED_PALETTE`: UInt = 8u;
public const val `VIDEO_MODE_MAP_MEM_LINEAR`: UInt = 1073741824u;
public const val `VIDEO_MODE_MONO_POINTER`: UInt = 2u;
public const val `VIDEO_MODE_NO_64_BIT_ACCESS`: UInt = 64u;
public const val `VIDEO_MODE_NO_OFF_SCREEN`: UInt = 32u;
public const val `VIDEO_MODE_NO_ZERO_MEMORY`: UInt = 2147483648u;
public const val `VIDEO_MODE_PALETTE_DRIVEN`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_MONITOR_DESCRIPTOR` (
    public var `DescriptorSize`: UInt,
    public var `Descriptor`: UByteArray,
)
// UNSUPPORTED Rust 3489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_MONITOR_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_NUM_MODES` (
    public var `NumModes`: UInt,
    public var `ModeInformationLength`: UInt,
)
public const val `VIDEO_OPTIONAL_GAMMET_TABLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_PALETTE_DATA` (
    public var `NumEntries`: UShort,
    public var `FirstEntry`: UShort,
    public var `Colors`: UShortArray,
)
// UNSUPPORTED Rust 3508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_PALETTE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_PERFORMANCE_COUNTER` (
    public var `NbOfAllocationEvicted`: ULongArray,
    public var `NbOfAllocationMarked`: ULongArray,
    public var `NbOfAllocationRestored`: ULongArray,
    public var `KBytesEvicted`: ULongArray,
    public var `KBytesMarked`: ULongArray,
    public var `KBytesRestored`: ULongArray,
    public var `NbProcessCommited`: ULong,
    public var `NbAllocationCommited`: ULong,
    public var `NbAllocationMarked`: ULong,
    public var `KBytesAllocated`: ULong,
    public var `KBytesAvailable`: ULong,
    public var `KBytesCurMarked`: ULong,
    public var `Reference`: ULong,
    public var `Unreference`: ULong,
    public var `TrueReference`: ULong,
    public var `NbOfPageIn`: ULong,
    public var `KBytesPageIn`: ULong,
    public var `NbOfPageOut`: ULong,
    public var `KBytesPageOut`: ULong,
    public var `NbOfRotateOut`: ULong,
    public var `KBytesRotateOut`: ULong,
)
// UNSUPPORTED Rust 3538:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_PERFORMANCE_COUNTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_POINTER_ATTRIBUTES` (
    public var `Flags`: UInt,
    public var `Width`: UInt,
    public var `Height`: UInt,
    public var `WidthInBytes`: UInt,
    public var `Enable`: UInt,
    public var `Column`: Short,
    public var `Row`: Short,
    public var `Pixels`: UByteArray,
)
// UNSUPPORTED Rust 3555:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_POINTER_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_POINTER_CAPABILITIES` (
    public var `Flags`: UInt,
    public var `MaxWidth`: UInt,
    public var `MaxHeight`: UInt,
    public var `HWPtrBitmapStart`: UInt,
    public var `HWPtrBitmapEnd`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_POINTER_POSITION` (
    public var `Column`: Short,
    public var `Row`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_POWER_MANAGEMENT` (
    public var `Length`: UInt,
    public var `DPMSVersion`: UInt,
    public var `PowerState`: UInt,
)
public typealias `VIDEO_POWER_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_PUBLIC_ACCESS_RANGES` (
    public var `InIoSpace`: UInt,
    public var `MappedInIoSpace`: UInt,
    public var `VirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3590:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_PUBLIC_ACCESS_RANGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_QUERY_PERFORMANCE_COUNTER` (
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VIDEO_PERFORMANCE_COUNTER`>?,
)
// UNSUPPORTED Rust 3601:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIDEO_REGISTER_VDM` (
    public var `MinimumStateSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_SHARE_MEMORY` (
    public var `ProcessHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `ViewOffset`: UInt,
    public var `ViewSize`: UInt,
    public var `RequestedVirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3629:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_SHARE_MEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_SHARE_MEMORY_INFORMATION` (
    public var `SharedViewOffset`: UInt,
    public var `SharedViewSize`: UInt,
    public var `VirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_SHARE_MEMORY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_STATE_NON_STANDARD_VGA`: UInt = 1u;
public const val `VIDEO_STATE_PACKED_CHAIN4_MODE`: UInt = 4u;
public const val `VIDEO_STATE_UNEMULATED_VGA_STATE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_VDM` (
    public var `ProcessHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 3654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_VDM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_WIN32K_CALLBACKS` (
    public var `PhysDisp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Callout`: `PVIDEO_WIN32K_CALLOUT`,
    public var `bACPI`: UInt,
    public var `pPhysDeviceObject`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `DualviewFlags`: UInt,
)
// UNSUPPORTED Rust 3668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VIDEO_WIN32K_CALLBACKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIDEO_WIN32K_CALLBACKS_PARAMS` (
    public var `CalloutType`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE`,
    public var `PhysDisp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Param`: ULong,
    public var `Status`: Int,
    public var `LockUserSession`: Boolean,
    public var `IsPostDevice`: Boolean,
    public var `SurpriseRemoval`: Boolean,
    public var `WaitForQueueReady`: Boolean,
)
// UNSUPPORTED Rust 3685:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WCRUN` (
    public var `wcLow`: UShort,
    public var `cGlyphs`: UShort,
    public var `phg`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 3722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WCRUN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINDDI_MAXSETPALETTECOLORINDEX`: UInt = 255u;
public const val `WINDDI_MAXSETPALETTECOLORS`: UInt = 256u;
public const val `WINDDI_MAX_BROADCAST_CONTEXT`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNDOBJ` (
    public var `coClient`: `CLIPOBJ`,
    public var `pvConsumer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `rclClient`: `super`.`super`.`Foundation`.`RECTL`,
    public var `psoOwner`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SURFOBJ`>?,
)
// UNSUPPORTED Rust 3738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNDOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WNDOBJCHANGEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WNDOBJ`>?, UInt) -> Unit>>>;
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
// UNSUPPORTED Rust 3765:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WVIDEO_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DISPLAY%d");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XFORML` (
    public var `eM11`: UInt,
    public var `eM12`: UInt,
    public var `eM21`: UInt,
    public var `eM22`: UInt,
    public var `eDx`: UInt,
    public var `eDy`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XFORML` (
    public var `eM11`: Float,
    public var `eM12`: Float,
    public var `eM21`: Float,
    public var `eM22`: Float,
    public var `eDx`: Float,
    public var `eDy`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XFORMOBJ` (
    public var `ulReserved`: UInt,
)
public const val `XF_INV_FXTOL`: Int = 3;
public const val `XF_INV_LTOL`: Int = 1;
public const val `XF_LTOFX`: Int = 2;
public const val `XF_LTOL`: Int = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XLATEOBJ` (
    public var `iUniq`: UInt,
    public var `flXlate`: UInt,
    public var `iSrcType`: UShort,
    public var `iDstType`: UShort,
    public var `cEntries`: UInt,
    public var `pulXlate`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 3807:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
