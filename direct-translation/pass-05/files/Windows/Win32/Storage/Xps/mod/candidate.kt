// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=AbortDoc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `AbortDoc`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeviceCapabilitiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DeviceCapabilitiesA`(`pdevice` : `windows_sys`.`core`.`PCSTR`, `pport` : `windows_sys`.`core`.`PCSTR`, `fwcapability` : `PRINTER_DEVICE_CAPABILITIES`, `poutput` : `windows_sys`.`core`.`PSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winspool.drv, ABI=system, export=DeviceCapabilitiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DeviceCapabilitiesW`(`pdevice` : `windows_sys`.`core`.`PCWSTR`, `pport` : `windows_sys`.`core`.`PCWSTR`, `fwcapability` : `PRINTER_DEVICE_CAPABILITIES`, `poutput` : `windows_sys`.`core`.`PWSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEW`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EndDoc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EndDoc`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=EndPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `EndPage`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=Escape; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `Escape`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `iescape` : Int, `cjin` : Int, `pvin` : `windows_sys`.`core`.`PCSTR`, `pvout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ExtEscape; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ExtEscape`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `iescape` : Int, `cjinput` : Int, `lpindata` : `windows_sys`.`core`.`PCSTR`, `cjoutput` : Int, `lpoutdata` : `windows_sys`.`core`.`PSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PrintWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `PrintWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdcblt` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `nflags` : `PRINT_WINDOW_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetAbortProc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetAbortProc`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `proc` : `ABORTPROC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StartDocA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `StartDocA`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpdi` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOCINFOA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StartDocW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `StartDocW`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpdi` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOCINFOW`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=StartPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `StartPage`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`) : Int
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `ABORTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Graphics`.`Gdi`.`HDC`, Int) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `DC_BINNAMES`: `PRINTER_DEVICE_CAPABILITIES` = 12u;
public const val `DC_BINS`: `PRINTER_DEVICE_CAPABILITIES` = 6u;
public const val `DC_COLLATE`: `PRINTER_DEVICE_CAPABILITIES` = 22u;
public const val `DC_COLORDEVICE`: `PRINTER_DEVICE_CAPABILITIES` = 32u;
public const val `DC_COPIES`: `PRINTER_DEVICE_CAPABILITIES` = 18u;
public const val `DC_DRIVER`: `PRINTER_DEVICE_CAPABILITIES` = 11u;
public const val `DC_DUPLEX`: `PRINTER_DEVICE_CAPABILITIES` = 7u;
public const val `DC_ENUMRESOLUTIONS`: `PRINTER_DEVICE_CAPABILITIES` = 13u;
public const val `DC_EXTRA`: `PRINTER_DEVICE_CAPABILITIES` = 9u;
public const val `DC_FIELDS`: `PRINTER_DEVICE_CAPABILITIES` = 1u;
public const val `DC_FILEDEPENDENCIES`: `PRINTER_DEVICE_CAPABILITIES` = 14u;
public const val `DC_MAXEXTENT`: `PRINTER_DEVICE_CAPABILITIES` = 5u;
public const val `DC_MEDIAREADY`: `PRINTER_DEVICE_CAPABILITIES` = 29u;
public const val `DC_MEDIATYPENAMES`: `PRINTER_DEVICE_CAPABILITIES` = 34u;
public const val `DC_MEDIATYPES`: `PRINTER_DEVICE_CAPABILITIES` = 35u;
public const val `DC_MINEXTENT`: `PRINTER_DEVICE_CAPABILITIES` = 4u;
public const val `DC_NUP`: `PRINTER_DEVICE_CAPABILITIES` = 33u;
public const val `DC_ORIENTATION`: `PRINTER_DEVICE_CAPABILITIES` = 17u;
public const val `DC_PAPERNAMES`: `PRINTER_DEVICE_CAPABILITIES` = 16u;
public const val `DC_PAPERS`: `PRINTER_DEVICE_CAPABILITIES` = 2u;
public const val `DC_PAPERSIZE`: `PRINTER_DEVICE_CAPABILITIES` = 3u;
public const val `DC_PERSONALITY`: `PRINTER_DEVICE_CAPABILITIES` = 25u;
public const val `DC_PRINTERMEM`: `PRINTER_DEVICE_CAPABILITIES` = 28u;
public const val `DC_PRINTRATE`: `PRINTER_DEVICE_CAPABILITIES` = 26u;
public const val `DC_PRINTRATEPPM`: `PRINTER_DEVICE_CAPABILITIES` = 31u;
public const val `DC_PRINTRATEUNIT`: `PRINTER_DEVICE_CAPABILITIES` = 27u;
public const val `DC_SIZE`: `PRINTER_DEVICE_CAPABILITIES` = 8u;
public const val `DC_STAPLE`: `PRINTER_DEVICE_CAPABILITIES` = 30u;
public const val `DC_TRUETYPE`: `PRINTER_DEVICE_CAPABILITIES` = 15u;
public const val `DC_VERSION`: `PRINTER_DEVICE_CAPABILITIES` = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOCINFOA` (
    public var `cbSize`: Int,
    public var `lpszDocName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpszOutput`: `windows_sys`.`core`.`PCSTR`,
    public var `lpszDatatype`: `windows_sys`.`core`.`PCSTR`,
    public var `fwType`: UInt,
)
// UNSUPPORTED Rust 66:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOCINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOCINFOW` (
    public var `cbSize`: Int,
    public var `lpszDocName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpszOutput`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpszDatatype`: `windows_sys`.`core`.`PCWSTR`,
    public var `fwType`: UInt,
)
// UNSUPPORTED Rust 80:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOCINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRAWPATRECT` (
    public var `ptPosition`: `super`.`super`.`Foundation`.`POINT`,
    public var `ptSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `wStyle`: UShort,
    public var `wPattern`: UShort,
)
public typealias `PRINTER_DEVICE_CAPABILITIES` = UShort;
public typealias `PRINT_WINDOW_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSFEATURE_CUSTPAPER` (
    public var `lOrientation`: Int,
    public var `lWidth`: Int,
    public var `lHeight`: Int,
    public var `lWidthOffset`: Int,
    public var `lHeightOffset`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSFEATURE_OUTPUT` (
    public var `bPageIndependent`: `windows_sys`.`core`.`BOOL`,
    public var `bSetPageDevice`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSINJECTDATA` (
    public var `DataBytes`: UInt,
    public var `InjectionPoint`: `PSINJECT_POINT`,
    public var `PageNumber`: UShort,
)
public const val `PSINJECT_BEGINDEFAULTS`: `PSINJECT_POINT` = 12u;
public const val `PSINJECT_BEGINPAGESETUP`: `PSINJECT_POINT` = 101u;
public const val `PSINJECT_BEGINPROLOG`: `PSINJECT_POINT` = 14u;
public const val `PSINJECT_BEGINSETUP`: `PSINJECT_POINT` = 16u;
public const val `PSINJECT_BEGINSTREAM`: `PSINJECT_POINT` = 1u;
public const val `PSINJECT_BOUNDINGBOX`: `PSINJECT_POINT` = 9u;
public const val `PSINJECT_COMMENTS`: `PSINJECT_POINT` = 11u;
public const val `PSINJECT_DOCNEEDEDRES`: `PSINJECT_POINT` = 5u;
public const val `PSINJECT_DOCSUPPLIEDRES`: `PSINJECT_POINT` = 6u;
public const val `PSINJECT_DOCUMENTPROCESSCOLORS`: `PSINJECT_POINT` = 10u;
public const val `PSINJECT_DOCUMENTPROCESSCOLORSATEND`: `PSINJECT_POINT` = 21u;
public const val `PSINJECT_ENDDEFAULTS`: `PSINJECT_POINT` = 13u;
public const val `PSINJECT_ENDPAGECOMMENTS`: `PSINJECT_POINT` = 107u;
public const val `PSINJECT_ENDPAGESETUP`: `PSINJECT_POINT` = 102u;
public const val `PSINJECT_ENDPROLOG`: `PSINJECT_POINT` = 15u;
public const val `PSINJECT_ENDSETUP`: `PSINJECT_POINT` = 17u;
public const val `PSINJECT_ENDSTREAM`: `PSINJECT_POINT` = 20u;
public const val `PSINJECT_EOF`: `PSINJECT_POINT` = 19u;
public const val `PSINJECT_ORIENTATION`: `PSINJECT_POINT` = 8u;
public const val `PSINJECT_PAGEBBOX`: `PSINJECT_POINT` = 106u;
public const val `PSINJECT_PAGENUMBER`: `PSINJECT_POINT` = 100u;
public const val `PSINJECT_PAGEORDER`: `PSINJECT_POINT` = 7u;
public const val `PSINJECT_PAGES`: `PSINJECT_POINT` = 4u;
public const val `PSINJECT_PAGESATEND`: `PSINJECT_POINT` = 3u;
public const val `PSINJECT_PAGETRAILER`: `PSINJECT_POINT` = 103u;
public const val `PSINJECT_PLATECOLOR`: `PSINJECT_POINT` = 104u;
public typealias `PSINJECT_POINT` = UShort;
public const val `PSINJECT_PSADOBE`: `PSINJECT_POINT` = 2u;
public const val `PSINJECT_SHOWPAGE`: `PSINJECT_POINT` = 105u;
public const val `PSINJECT_TRAILER`: `PSINJECT_POINT` = 18u;
public const val `PSINJECT_VMRESTORE`: `PSINJECT_POINT` = 201u;
public const val `PSINJECT_VMSAVE`: `PSINJECT_POINT` = 200u;
public const val `PW_CLIENTONLY`: `PRINT_WINDOW_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XPS_COLOR` (
    public var `colorType`: `XPS_COLOR_TYPE`,
    public var `value`: `XPS_COLOR_0`,
)
// UNSUPPORTED Rust 156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XPS_COLOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 161:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union XPS_COLOR_0 {
//     pub sRGB: XPS_COLOR_0_0,
//     pub scRGB: XPS_COLOR_0_1,
//     pub context: XPS_COLOR_0_2,
// }

// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XPS_COLOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XPS_COLOR_0_2` (
    public var `channelCount`: UByte,
    public var `channels`: FloatArray,
)
// UNSUPPORTED Rust 179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XPS_COLOR_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_COLOR_0_0` (
    public var `alpha`: UByte,
    public var `red`: UByte,
    public var `green`: UByte,
    public var `blue`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_COLOR_0_1` (
    public var `alpha`: Float,
    public var `red`: Float,
    public var `green`: Float,
    public var `blue`: Float,
)
public typealias `XPS_COLOR_INTERPOLATION` = Int;
public const val `XPS_COLOR_INTERPOLATION_SCRGBLINEAR`: `XPS_COLOR_INTERPOLATION` = 1;
public const val `XPS_COLOR_INTERPOLATION_SRGBLINEAR`: `XPS_COLOR_INTERPOLATION` = 2;
public typealias `XPS_COLOR_TYPE` = Int;
public const val `XPS_COLOR_TYPE_CONTEXT`: `XPS_COLOR_TYPE` = 3;
public const val `XPS_COLOR_TYPE_SCRGB`: `XPS_COLOR_TYPE` = 2;
public const val `XPS_COLOR_TYPE_SRGB`: `XPS_COLOR_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_DASH` (
    public var `length`: Float,
    public var `gap`: Float,
)
public typealias `XPS_DASH_CAP` = Int;
public const val `XPS_DASH_CAP_FLAT`: `XPS_DASH_CAP` = 1;
public const val `XPS_DASH_CAP_ROUND`: `XPS_DASH_CAP` = 2;
public const val `XPS_DASH_CAP_SQUARE`: `XPS_DASH_CAP` = 3;
public const val `XPS_DASH_CAP_TRIANGLE`: `XPS_DASH_CAP` = 4;
public typealias `XPS_DOCUMENT_TYPE` = Int;
public const val `XPS_DOCUMENT_TYPE_OPENXPS`: `XPS_DOCUMENT_TYPE` = 3;
public const val `XPS_DOCUMENT_TYPE_UNSPECIFIED`: `XPS_DOCUMENT_TYPE` = 1;
public const val `XPS_DOCUMENT_TYPE_XPS`: `XPS_DOCUMENT_TYPE` = 2;
public const val `XPS_E_ABSOLUTE_REFERENCE`: Int = -2142108159;
public const val `XPS_E_ALREADY_OWNED`: Int = -2142108413;
public const val `XPS_E_BLEED_BOX_PAGE_DIMENSIONS_NOT_IN_SYNC`: Int = -2142108407;
public const val `XPS_E_BOTH_PATHFIGURE_AND_ABBR_SYNTAX_PRESENT`: Int = -2142108409;
public const val `XPS_E_BOTH_RESOURCE_AND_SOURCEATTR_PRESENT`: Int = -2142108408;
public const val `XPS_E_CARET_OUTSIDE_STRING`: Int = -2142108923;
public const val `XPS_E_CARET_OUT_OF_ORDER`: Int = -2142108922;
public const val `XPS_E_COLOR_COMPONENT_OUT_OF_RANGE`: Int = -2142108410;
public const val `XPS_E_DICTIONARY_ITEM_NAMED`: Int = -2142108671;
public const val `XPS_E_DUPLICATE_NAMES`: Int = -2142109175;
public const val `XPS_E_DUPLICATE_RESOURCE_KEYS`: Int = -2142109184;
public const val `XPS_E_INDEX_OUT_OF_RANGE`: Int = -2142108416;
public const val `XPS_E_INVALID_BLEED_BOX`: Int = -2142109692;
public const val `XPS_E_INVALID_CONTENT_BOX`: Int = -2142109685;
public const val `XPS_E_INVALID_CONTENT_TYPE`: Int = -2142109682;
public const val `XPS_E_INVALID_FLOAT`: Int = -2142109689;
public const val `XPS_E_INVALID_FONT_URI`: Int = -2142109686;
public const val `XPS_E_INVALID_LANGUAGE`: Int = -2142109696;
public const val `XPS_E_INVALID_LOOKUP_TYPE`: Int = -2142109690;
public const val `XPS_E_INVALID_MARKUP`: Int = -2142109684;
public const val `XPS_E_INVALID_NAME`: Int = -2142109695;
public const val `XPS_E_INVALID_NUMBER_OF_COLOR_CHANNELS`: Int = -2142108158;
public const val `XPS_E_INVALID_NUMBER_OF_POINTS_IN_CURVE_SEGMENTS`: Int = -2142108160;
public const val `XPS_E_INVALID_OBFUSCATED_FONT_URI`: Int = -2142109681;
public const val `XPS_E_INVALID_PAGE_SIZE`: Int = -2142109693;
public const val `XPS_E_INVALID_RESOURCE_KEY`: Int = -2142109694;
public const val `XPS_E_INVALID_SIGNATUREBLOCK_MARKUP`: Int = -2142108789;
public const val `XPS_E_INVALID_THUMBNAIL_IMAGE_TYPE`: Int = -2142109691;
public const val `XPS_E_INVALID_XML_ENCODING`: Int = -2142109683;
public const val `XPS_E_MAPPING_OUTSIDE_INDICES`: Int = -2142108924;
public const val `XPS_E_MAPPING_OUTSIDE_STRING`: Int = -2142108925;
public const val `XPS_E_MAPPING_OUT_OF_ORDER`: Int = -2142108926;
public const val `XPS_E_MARKUP_COMPATIBILITY_ELEMENTS`: Int = -2142108791;
public const val `XPS_E_MISSING_COLORPROFILE`: Int = -2142109436;
public const val `XPS_E_MISSING_DISCARDCONTROL`: Int = -2142109422;
public const val `XPS_E_MISSING_DOCUMENT`: Int = -2142109431;
public const val `XPS_E_MISSING_DOCUMENTSEQUENCE_RELATIONSHIP`: Int = -2142109432;
public const val `XPS_E_MISSING_FONTURI`: Int = -2142109433;
public const val `XPS_E_MISSING_GLYPHS`: Int = -2142109438;
public const val `XPS_E_MISSING_IMAGE_IN_IMAGEBRUSH`: Int = -2142109426;
public const val `XPS_E_MISSING_LOOKUP`: Int = -2142109439;
public const val `XPS_E_MISSING_NAME`: Int = -2142109440;
public const val `XPS_E_MISSING_PAGE_IN_DOCUMENT`: Int = -2142109428;
public const val `XPS_E_MISSING_PAGE_IN_PAGEREFERENCE`: Int = -2142109427;
public const val `XPS_E_MISSING_PART_REFERENCE`: Int = -2142109424;
public const val `XPS_E_MISSING_PART_STREAM`: Int = -2142109421;
public const val `XPS_E_MISSING_REFERRED_DOCUMENT`: Int = -2142109430;
public const val `XPS_E_MISSING_REFERRED_PAGE`: Int = -2142109429;
public const val `XPS_E_MISSING_RELATIONSHIP_TARGET`: Int = -2142109435;
public const val `XPS_E_MISSING_RESOURCE_KEY`: Int = -2142109425;
public const val `XPS_E_MISSING_RESOURCE_RELATIONSHIP`: Int = -2142109434;
public const val `XPS_E_MISSING_RESTRICTED_FONT_RELATIONSHIP`: Int = -2142109423;
public const val `XPS_E_MISSING_SEGMENT_DATA`: Int = -2142109437;
public const val `XPS_E_MULTIPLE_DOCUMENTSEQUENCE_RELATIONSHIPS`: Int = -2142109182;
public const val `XPS_E_MULTIPLE_PRINTTICKETS_ON_DOCUMENT`: Int = -2142109178;
public const val `XPS_E_MULTIPLE_PRINTTICKETS_ON_DOCUMENTSEQUENCE`: Int = -2142109177;
public const val `XPS_E_MULTIPLE_PRINTTICKETS_ON_PAGE`: Int = -2142109179;
public const val `XPS_E_MULTIPLE_REFERENCES_TO_PART`: Int = -2142109176;
public const val `XPS_E_MULTIPLE_RESOURCES`: Int = -2142109183;
public const val `XPS_E_MULTIPLE_THUMBNAILS_ON_PACKAGE`: Int = -2142109180;
public const val `XPS_E_MULTIPLE_THUMBNAILS_ON_PAGE`: Int = -2142109181;
public const val `XPS_E_NEGATIVE_FLOAT`: Int = -2142108918;
public const val `XPS_E_NESTED_REMOTE_DICTIONARY`: Int = -2142108670;
public const val `XPS_E_NOT_ENOUGH_GRADIENT_STOPS`: Int = -2142108405;
public const val `XPS_E_NO_CUSTOM_OBJECTS`: Int = -2142108414;
public const val `XPS_E_OBJECT_DETACHED`: Int = -2142108790;
public const val `XPS_E_ODD_BIDILEVEL`: Int = -2142108921;
public const val `XPS_E_ONE_TO_ONE_MAPPING_EXPECTED`: Int = -2142108920;
public const val `XPS_E_PACKAGE_ALREADY_OPENED`: Int = -2142108793;
public const val `XPS_E_PACKAGE_NOT_OPENED`: Int = -2142108794;
public const val `XPS_E_PACKAGE_WRITER_NOT_CLOSED`: Int = -2142108404;
public const val `XPS_E_RELATIONSHIP_EXTERNAL`: Int = -2142108406;
public const val `XPS_E_RESOURCE_NOT_OWNED`: Int = -2142108412;
public const val `XPS_E_RESTRICTED_FONT_NOT_OBFUSCATED`: Int = -2142108919;
public const val `XPS_E_SIGNATUREID_DUP`: Int = -2142108792;
public const val `XPS_E_SIGREQUESTID_DUP`: Int = -2142108795;
public const val `XPS_E_STRING_TOO_LONG`: Int = -2142108928;
public const val `XPS_E_TOO_MANY_INDICES`: Int = -2142108927;
public const val `XPS_E_UNAVAILABLE_PACKAGE`: Int = -2142109420;
public const val `XPS_E_UNEXPECTED_COLORPROFILE`: Int = -2142108411;
public const val `XPS_E_UNEXPECTED_CONTENT_TYPE`: Int = -2142109688;
public const val `XPS_E_UNEXPECTED_RELATIONSHIP_TYPE`: Int = -2142109680;
public const val `XPS_E_UNEXPECTED_RESTRICTED_FONT_RELATIONSHIP`: Int = -2142109679;
public const val `XPS_E_VISUAL_CIRCULAR_REF`: Int = -2142108415;
public const val `XPS_E_XKEY_ATTR_PRESENT_OUTSIDE_RES_DICT`: Int = -2142108672;
public typealias `XPS_FILL_RULE` = Int;
public const val `XPS_FILL_RULE_EVENODD`: `XPS_FILL_RULE` = 1;
public const val `XPS_FILL_RULE_NONZERO`: `XPS_FILL_RULE` = 2;
public typealias `XPS_FONT_EMBEDDING` = Int;
public const val `XPS_FONT_EMBEDDING_NORMAL`: `XPS_FONT_EMBEDDING` = 1;
public const val `XPS_FONT_EMBEDDING_OBFUSCATED`: `XPS_FONT_EMBEDDING` = 2;
public const val `XPS_FONT_EMBEDDING_RESTRICTED`: `XPS_FONT_EMBEDDING` = 3;
public const val `XPS_FONT_EMBEDDING_RESTRICTED_UNOBFUSCATED`: `XPS_FONT_EMBEDDING` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_GLYPH_INDEX` (
    public var `index`: Int,
    public var `advanceWidth`: Float,
    public var `horizontalOffset`: Float,
    public var `verticalOffset`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_GLYPH_MAPPING` (
    public var `unicodeStringStart`: UInt,
    public var `unicodeStringLength`: UShort,
    public var `glyphIndicesStart`: UInt,
    public var `glyphIndicesLength`: UShort,
)
public typealias `XPS_IMAGE_TYPE` = Int;
public const val `XPS_IMAGE_TYPE_JPEG`: `XPS_IMAGE_TYPE` = 1;
public const val `XPS_IMAGE_TYPE_JXR`: `XPS_IMAGE_TYPE` = 5;
public const val `XPS_IMAGE_TYPE_PNG`: `XPS_IMAGE_TYPE` = 2;
public const val `XPS_IMAGE_TYPE_TIFF`: `XPS_IMAGE_TYPE` = 3;
public const val `XPS_IMAGE_TYPE_WDP`: `XPS_IMAGE_TYPE` = 4;
public typealias `XPS_INTERLEAVING` = Int;
public const val `XPS_INTERLEAVING_OFF`: `XPS_INTERLEAVING` = 1;
public const val `XPS_INTERLEAVING_ON`: `XPS_INTERLEAVING` = 2;
public typealias `XPS_LINE_CAP` = Int;
public const val `XPS_LINE_CAP_FLAT`: `XPS_LINE_CAP` = 1;
public const val `XPS_LINE_CAP_ROUND`: `XPS_LINE_CAP` = 2;
public const val `XPS_LINE_CAP_SQUARE`: `XPS_LINE_CAP` = 3;
public const val `XPS_LINE_CAP_TRIANGLE`: `XPS_LINE_CAP` = 4;
public typealias `XPS_LINE_JOIN` = Int;
public const val `XPS_LINE_JOIN_BEVEL`: `XPS_LINE_JOIN` = 2;
public const val `XPS_LINE_JOIN_MITER`: `XPS_LINE_JOIN` = 1;
public const val `XPS_LINE_JOIN_ROUND`: `XPS_LINE_JOIN` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_MATRIX` (
    public var `m11`: Float,
    public var `m12`: Float,
    public var `m21`: Float,
    public var `m22`: Float,
    public var `m31`: Float,
    public var `m32`: Float,
)
public typealias `XPS_OBJECT_TYPE` = Int;
public const val `XPS_OBJECT_TYPE_CANVAS`: `XPS_OBJECT_TYPE` = 1;
public const val `XPS_OBJECT_TYPE_GEOMETRY`: `XPS_OBJECT_TYPE` = 5;
public const val `XPS_OBJECT_TYPE_GLYPHS`: `XPS_OBJECT_TYPE` = 2;
public const val `XPS_OBJECT_TYPE_IMAGE_BRUSH`: `XPS_OBJECT_TYPE` = 7;
public const val `XPS_OBJECT_TYPE_LINEAR_GRADIENT_BRUSH`: `XPS_OBJECT_TYPE` = 8;
public const val `XPS_OBJECT_TYPE_MATRIX_TRANSFORM`: `XPS_OBJECT_TYPE` = 4;
public const val `XPS_OBJECT_TYPE_PATH`: `XPS_OBJECT_TYPE` = 3;
public const val `XPS_OBJECT_TYPE_RADIAL_GRADIENT_BRUSH`: `XPS_OBJECT_TYPE` = 9;
public const val `XPS_OBJECT_TYPE_SOLID_COLOR_BRUSH`: `XPS_OBJECT_TYPE` = 6;
public const val `XPS_OBJECT_TYPE_VISUAL_BRUSH`: `XPS_OBJECT_TYPE` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_POINT` (
    public var `x`: Float,
    public var `y`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_RECT` (
    public var `x`: Float,
    public var `y`: Float,
    public var `width`: Float,
    public var `height`: Float,
)
public typealias `XPS_SEGMENT_STROKE_PATTERN` = Int;
public const val `XPS_SEGMENT_STROKE_PATTERN_ALL`: `XPS_SEGMENT_STROKE_PATTERN` = 1;
public const val `XPS_SEGMENT_STROKE_PATTERN_MIXED`: `XPS_SEGMENT_STROKE_PATTERN` = 3;
public const val `XPS_SEGMENT_STROKE_PATTERN_NONE`: `XPS_SEGMENT_STROKE_PATTERN` = 2;
public typealias `XPS_SEGMENT_TYPE` = Int;
public const val `XPS_SEGMENT_TYPE_ARC_LARGE_CLOCKWISE`: `XPS_SEGMENT_TYPE` = 1;
public const val `XPS_SEGMENT_TYPE_ARC_LARGE_COUNTERCLOCKWISE`: `XPS_SEGMENT_TYPE` = 2;
public const val `XPS_SEGMENT_TYPE_ARC_SMALL_CLOCKWISE`: `XPS_SEGMENT_TYPE` = 3;
public const val `XPS_SEGMENT_TYPE_ARC_SMALL_COUNTERCLOCKWISE`: `XPS_SEGMENT_TYPE` = 4;
public const val `XPS_SEGMENT_TYPE_BEZIER`: `XPS_SEGMENT_TYPE` = 5;
public const val `XPS_SEGMENT_TYPE_LINE`: `XPS_SEGMENT_TYPE` = 6;
public const val `XPS_SEGMENT_TYPE_QUADRATIC_BEZIER`: `XPS_SEGMENT_TYPE` = 7;
public typealias `XPS_SIGNATURE_STATUS` = Int;
public const val `XPS_SIGNATURE_STATUS_BROKEN`: `XPS_SIGNATURE_STATUS` = 3;
public const val `XPS_SIGNATURE_STATUS_INCOMPLETE`: `XPS_SIGNATURE_STATUS` = 2;
public const val `XPS_SIGNATURE_STATUS_INCOMPLIANT`: `XPS_SIGNATURE_STATUS` = 1;
public const val `XPS_SIGNATURE_STATUS_QUESTIONABLE`: `XPS_SIGNATURE_STATUS` = 4;
public const val `XPS_SIGNATURE_STATUS_VALID`: `XPS_SIGNATURE_STATUS` = 5;
public typealias `XPS_SIGN_FLAGS` = Int;
public const val `XPS_SIGN_FLAGS_IGNORE_MARKUP_COMPATIBILITY`: `XPS_SIGN_FLAGS` = 1;
public const val `XPS_SIGN_FLAGS_NONE`: `XPS_SIGN_FLAGS` = 0;
public typealias `XPS_SIGN_POLICY` = Int;
public const val `XPS_SIGN_POLICY_ALL`: `XPS_SIGN_POLICY` = 15;
public const val `XPS_SIGN_POLICY_CORE_PROPERTIES`: `XPS_SIGN_POLICY` = 1;
public const val `XPS_SIGN_POLICY_DISCARD_CONTROL`: `XPS_SIGN_POLICY` = 8;
public const val `XPS_SIGN_POLICY_NONE`: `XPS_SIGN_POLICY` = 0;
public const val `XPS_SIGN_POLICY_PRINT_TICKET`: `XPS_SIGN_POLICY` = 4;
public const val `XPS_SIGN_POLICY_SIGNATURE_RELATIONSHIPS`: `XPS_SIGN_POLICY` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPS_SIZE` (
    public var `width`: Float,
    public var `height`: Float,
)
public typealias `XPS_SPREAD_METHOD` = Int;
public const val `XPS_SPREAD_METHOD_PAD`: `XPS_SPREAD_METHOD` = 1;
public const val `XPS_SPREAD_METHOD_REFLECT`: `XPS_SPREAD_METHOD` = 2;
public const val `XPS_SPREAD_METHOD_REPEAT`: `XPS_SPREAD_METHOD` = 3;
public typealias `XPS_STYLE_SIMULATION` = Int;
public const val `XPS_STYLE_SIMULATION_BOLD`: `XPS_STYLE_SIMULATION` = 3;
public const val `XPS_STYLE_SIMULATION_BOLDITALIC`: `XPS_STYLE_SIMULATION` = 4;
public const val `XPS_STYLE_SIMULATION_ITALIC`: `XPS_STYLE_SIMULATION` = 2;
public const val `XPS_STYLE_SIMULATION_NONE`: `XPS_STYLE_SIMULATION` = 1;
public typealias `XPS_THUMBNAIL_SIZE` = Int;
public const val `XPS_THUMBNAIL_SIZE_LARGE`: `XPS_THUMBNAIL_SIZE` = 4;
public const val `XPS_THUMBNAIL_SIZE_MEDIUM`: `XPS_THUMBNAIL_SIZE` = 3;
public const val `XPS_THUMBNAIL_SIZE_SMALL`: `XPS_THUMBNAIL_SIZE` = 2;
public const val `XPS_THUMBNAIL_SIZE_VERYSMALL`: `XPS_THUMBNAIL_SIZE` = 1;
public typealias `XPS_TILE_MODE` = Int;
public const val `XPS_TILE_MODE_FLIPX`: `XPS_TILE_MODE` = 3;
public const val `XPS_TILE_MODE_FLIPXY`: `XPS_TILE_MODE` = 5;
public const val `XPS_TILE_MODE_FLIPY`: `XPS_TILE_MODE` = 4;
public const val `XPS_TILE_MODE_NONE`: `XPS_TILE_MODE` = 1;
public const val `XPS_TILE_MODE_TILE`: `XPS_TILE_MODE` = 2;
// UNSUPPORTED Rust 438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const XpsOMObjectFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe974d26d_3d9b_4d47_88cc_3872f2dc3585);

// UNSUPPORTED Rust 439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const XpsOMThumbnailGenerator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7e4a23e2_b969_4761_be35_1a8ced58e323);

// UNSUPPORTED Rust 440:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const XpsSignatureManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb0c43320_2315_44a2_b70a_0943a140a8ee);

