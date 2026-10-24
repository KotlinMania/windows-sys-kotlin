// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTCloseProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PTCloseProvider`(`hprovider` : `HPTPROVIDER`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTConvertDevModeToPrintTicket; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
public external fun `PTConvertDevModeToPrintTicket`(`hprovider` : `HPTPROVIDER`, `cbdevmode` : UInt, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Gdi`.`DEVMODEA`>?, `scope` : `EPrintTicketScope`, `pprintticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTConvertPrintTicketToDevMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
public external fun `PTConvertPrintTicketToDevMode`(`hprovider` : `HPTPROVIDER`, `pprintticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `basedevmodetype` : `EDefaultDevmodeType`, `scope` : `EPrintTicketScope`, `pcbdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppdevmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Gdi`.`DEVMODEA`>>?, `pbstrerrormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTGetPrintCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `PTGetPrintCapabilities`(`hprovider` : `HPTPROVIDER`, `pprintticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcapabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbstrerrormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTGetPrintDeviceCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `PTGetPrintDeviceCapabilities`(`hprovider` : `HPTPROVIDER`, `pprintticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdevicecapabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbstrerrormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTGetPrintDeviceResources; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `PTGetPrintDeviceResources`(`hprovider` : `HPTPROVIDER`, `pszlocalename` : `windows_sys`.`core`.`PCWSTR`, `pprintticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdeviceresources` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbstrerrormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTMergeAndValidatePrintTicket; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `PTMergeAndValidatePrintTicket`(`hprovider` : `HPTPROVIDER`, `pbaseticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdeltaticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `scope` : `EPrintTicketScope`, `presultticket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbstrerrormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTOpenProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PTOpenProvider`(`pszprintername` : `windows_sys`.`core`.`PCWSTR`, `dwversion` : UInt, `phprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HPTPROVIDER`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTOpenProviderEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PTOpenProviderEx`(`pszprintername` : `windows_sys`.`core`.`PCWSTR`, `dwmaxversion` : UInt, `dwprefversion` : UInt, `phprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HPTPROVIDER`>?, `pusedversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTQuerySchemaVersionSupport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PTQuerySchemaVersionSupport`(`pszprintername` : `windows_sys`.`core`.`PCWSTR`, `pmaxversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=prntvpt.dll, ABI=system, export=PTReleaseMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PTReleaseMemory`(`pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
public typealias `EDefaultDevmodeType` = Int;
public typealias `EPrintTicketScope` = Int;
public const val `E_DELTA_PRINTTICKET_FORMAT`: UInt = 2147745797u;
public const val `E_PRINTCAPABILITIES_FORMAT`: UInt = 2147745796u;
public const val `E_PRINTDEVICECAPABILITIES_FORMAT`: UInt = 2147745798u;
public const val `E_PRINTTICKET_FORMAT`: UInt = 2147745795u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPTPROVIDER` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `PRINTTICKET_ISTREAM_APIS`: UInt = 1u;
public const val `S_PT_CONFLICT_RESOLVED`: UInt = 262146u;
public const val `S_PT_NO_CONFLICT`: UInt = 262145u;
public const val `kPTDocumentScope`: `EPrintTicketScope` = 1;
public const val `kPTJobScope`: `EPrintTicketScope` = 2;
public const val `kPTPageScope`: `EPrintTicketScope` = 0;
public const val `kPrinterDefaultDevmode`: `EDefaultDevmodeType` = 1;
public const val `kUserDefaultDevmode`: `EDefaultDevmodeType` = 0;
