// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("prntvpt.dll" "system" fn PTCloseProvider(hprovider : HPTPROVIDER) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
// windows_link::link!("prntvpt.dll" "system" fn PTConvertDevModeToPrintTicket(hprovider : HPTPROVIDER, cbdevmode : u32, pdevmode : *const super::super::Gdi:: DEVMODEA, scope : EPrintTicketScope, pprintticket : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
// windows_link::link!("prntvpt.dll" "system" fn PTConvertPrintTicketToDevMode(hprovider : HPTPROVIDER, pprintticket : * mut core::ffi::c_void, basedevmodetype : EDefaultDevmodeType, scope : EPrintTicketScope, pcbdevmode : *mut u32, ppdevmode : *mut *mut super::super::Gdi:: DEVMODEA, pbstrerrormessage : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("prntvpt.dll" "system" fn PTGetPrintCapabilities(hprovider : HPTPROVIDER, pprintticket : * mut core::ffi::c_void, pcapabilities : * mut core::ffi::c_void, pbstrerrormessage : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("prntvpt.dll" "system" fn PTGetPrintDeviceCapabilities(hprovider : HPTPROVIDER, pprintticket : * mut core::ffi::c_void, pdevicecapabilities : * mut core::ffi::c_void, pbstrerrormessage : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("prntvpt.dll" "system" fn PTGetPrintDeviceResources(hprovider : HPTPROVIDER, pszlocalename : windows_sys::core::PCWSTR, pprintticket : * mut core::ffi::c_void, pdeviceresources : * mut core::ffi::c_void, pbstrerrormessage : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("prntvpt.dll" "system" fn PTMergeAndValidatePrintTicket(hprovider : HPTPROVIDER, pbaseticket : * mut core::ffi::c_void, pdeltaticket : * mut core::ffi::c_void, scope : EPrintTicketScope, presultticket : * mut core::ffi::c_void, pbstrerrormessage : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("prntvpt.dll" "system" fn PTOpenProvider(pszprintername : windows_sys::core::PCWSTR, dwversion : u32, phprovider : *mut HPTPROVIDER) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("prntvpt.dll" "system" fn PTOpenProviderEx(pszprintername : windows_sys::core::PCWSTR, dwmaxversion : u32, dwprefversion : u32, phprovider : *mut HPTPROVIDER, pusedversion : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("prntvpt.dll" "system" fn PTQuerySchemaVersionSupport(pszprintername : windows_sys::core::PCWSTR, pmaxversion : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("prntvpt.dll" "system" fn PTReleaseMemory(pbuffer : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

public typealias `EDefaultDevmodeType` = Int;
public typealias `EPrintTicketScope` = Int;
public const val `E_DELTA_PRINTTICKET_FORMAT`: UInt = 2147745797u;
public const val `E_PRINTCAPABILITIES_FORMAT`: UInt = 2147745796u;
public const val `E_PRINTDEVICECAPABILITIES_FORMAT`: UInt = 2147745798u;
public const val `E_PRINTTICKET_FORMAT`: UInt = 2147745795u;
// UNSUPPORTED Rust 24:1: non-scalar type Ptr unsupported
// pub type HPTPROVIDER = *mut core::ffi::c_void;

public const val `PRINTTICKET_ISTREAM_APIS`: UInt = 1u;
public const val `S_PT_CONFLICT_RESOLVED`: UInt = 262146u;
public const val `S_PT_NO_CONFLICT`: UInt = 262145u;
public const val `kPTDocumentScope`: `EPrintTicketScope` = 1;
public const val `kPTJobScope`: `EPrintTicketScope` = 2;
public const val `kPTPageScope`: `EPrintTicketScope` = 0;
public const val `kPrinterDefaultDevmode`: `EDefaultDevmodeType` = 1;
public const val `kUserDefaultDevmode`: `EDefaultDevmodeType` = 0;
