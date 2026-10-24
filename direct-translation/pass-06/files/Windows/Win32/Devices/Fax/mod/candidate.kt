// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fxsutility.dll, ABI=system, export=CanSendToFaxRecipient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CanSendToFaxRecipient`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxAbort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxAbort`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxAccessCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxAccessCheck`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `accessmask` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxClose`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxCompleteJobParamsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxCompleteJobParamsA`(`jobparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_PARAMA`>>?, `coverpageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_COVERPAGE_INFOA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxCompleteJobParamsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxCompleteJobParamsW`(`jobparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_PARAMW`>>?, `coverpageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_COVERPAGE_INFOW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxConnectFaxServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxConnectFaxServerA`(`machinename` : `windows_sys`.`core`.`PCSTR`, `faxhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxConnectFaxServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxConnectFaxServerW`(`machinename` : `windows_sys`.`core`.`PCWSTR`, `faxhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnableRoutingMethodA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnableRoutingMethodA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingguid` : `windows_sys`.`core`.`PCSTR`, `enabled` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnableRoutingMethodW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnableRoutingMethodW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingguid` : `windows_sys`.`core`.`PCWSTR`, `enabled` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumGlobalRoutingInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumGlobalRoutingInfoA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `routinginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_GLOBAL_ROUTING_INFOA`>>?, `methodsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumGlobalRoutingInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumGlobalRoutingInfoW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `routinginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_GLOBAL_ROUTING_INFOW`>>?, `methodsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumJobsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumJobsA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYA`>>?, `jobsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumJobsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumJobsW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYW`>>?, `jobsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumPortsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumPortsA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `portinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOA`>>?, `portsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumPortsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumPortsW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `portinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOW`>>?, `portsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumRoutingMethodsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumRoutingMethodsA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingmethod` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_ROUTING_METHODA`>>?, `methodsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxEnumRoutingMethodsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxEnumRoutingMethodsW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingmethod` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_ROUTING_METHODW`>>?, `methodsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxFreeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxFreeBuffer`(`buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetConfigurationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetConfigurationA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `faxconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_CONFIGURATIONA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetConfigurationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetConfigurationW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `faxconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_CONFIGURATIONW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetDeviceStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetDeviceStatusA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `devicestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_DEVICE_STATUSA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetDeviceStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetDeviceStatusW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `devicestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_DEVICE_STATUSW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetJobA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetJobA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt, `jobentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetJobW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetJobW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt, `jobentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetLoggingCategoriesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetLoggingCategoriesA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `categories` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_LOG_CATEGORYA`>>?, `numbercategories` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetLoggingCategoriesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetLoggingCategoriesW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `categories` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_LOG_CATEGORYW`>>?, `numbercategories` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetPageData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetPageData`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `imagewidth` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `imageheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetPortA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetPortA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `portinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetPortW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetPortW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `portinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetRoutingInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetRoutingInfoA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingguid` : `windows_sys`.`core`.`PCSTR`, `routinginfobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `routinginfobuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxGetRoutingInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxGetRoutingInfoW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingguid` : `windows_sys`.`core`.`PCWSTR`, `routinginfobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `routinginfobuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxInitializeEventQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxInitializeEventQueue`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `completionport` : `super`.`super`.`Foundation`.`HANDLE`, `completionkey` : ULong, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `messagestart` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxOpenPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxOpenPort`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `deviceid` : UInt, `flags` : UInt, `faxporthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxPrintCoverPageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `FaxPrintCoverPageA`(`faxcontextinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOA`>?, `coverpageinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxPrintCoverPageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `FaxPrintCoverPageW`(`faxcontextinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOW`>?, `coverpageinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxRegisterRoutingExtensionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxRegisterRoutingExtensionW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `extensionname` : `windows_sys`.`core`.`PCWSTR`, `friendlyname` : `windows_sys`.`core`.`PCWSTR`, `imagename` : `windows_sys`.`core`.`PCWSTR`, `callback` : `PFAX_ROUTING_INSTALLATION_CALLBACKW`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxRegisterServiceProviderW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxRegisterServiceProviderW`(`deviceprovider` : `windows_sys`.`core`.`PCWSTR`, `friendlyname` : `windows_sys`.`core`.`PCWSTR`, `imagename` : `windows_sys`.`core`.`PCWSTR`, `tspname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSendDocumentA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSendDocumentA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCSTR`, `jobparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_PARAMA`>?, `coverpageinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOA`>?, `faxjobid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSendDocumentForBroadcastA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSendDocumentForBroadcastA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCSTR`, `faxjobid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `faxrecipientcallback` : `PFAX_RECIPIENT_CALLBACKA`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSendDocumentForBroadcastW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSendDocumentForBroadcastW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCWSTR`, `faxjobid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `faxrecipientcallback` : `PFAX_RECIPIENT_CALLBACKW`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSendDocumentW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSendDocumentW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCWSTR`, `jobparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_PARAMW`>?, `coverpageinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOW`>?, `faxjobid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetConfigurationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetConfigurationA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `faxconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONFIGURATIONA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetConfigurationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetConfigurationW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `faxconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONFIGURATIONW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetGlobalRoutingInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetGlobalRoutingInfoA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `routinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_GLOBAL_ROUTING_INFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetGlobalRoutingInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetGlobalRoutingInfoW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `routinginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_GLOBAL_ROUTING_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetJobA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetJobA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt, `command` : UInt, `jobentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_ENTRYA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetJobW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetJobW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `jobid` : UInt, `command` : UInt, `jobentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_ENTRYW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetLoggingCategoriesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetLoggingCategoriesA`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `categories` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_LOG_CATEGORYA`>?, `numbercategories` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetLoggingCategoriesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetLoggingCategoriesW`(`faxhandle` : `super`.`super`.`Foundation`.`HANDLE`, `categories` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_LOG_CATEGORYW`>?, `numbercategories` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetPortA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetPortA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `portinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PORT_INFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetPortW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetPortW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `portinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PORT_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetRoutingInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetRoutingInfoA`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingguid` : `windows_sys`.`core`.`PCSTR`, `routinginfobuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `routinginfobuffersize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxSetRoutingInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxSetRoutingInfoW`(`faxporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `routingguid` : `windows_sys`.`core`.`PCWSTR`, `routinginfobuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `routinginfobuffersize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxStartPrintJobA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `FaxStartPrintJobA`(`printername` : `windows_sys`.`core`.`PCSTR`, `printinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PRINT_INFOA`>?, `faxjobid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `faxcontextinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxStartPrintJobW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `FaxStartPrintJobW`(`printername` : `windows_sys`.`core`.`PCWSTR`, `printinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PRINT_INFOW`>?, `faxjobid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `faxcontextinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winfax.dll, ABI=system, export=FaxUnregisterServiceProviderW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaxUnregisterServiceProviderW`(`deviceprovider` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=fxsutility.dll, ABI=system, export=SendToFaxRecipient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendToFaxRecipient`(`sndmode` : `SendToMode`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sti.dll, ABI=system, export=StiCreateInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StiCreateInstanceW`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `dwver` : UInt, `ppsti` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CF_MSFAXSRV_DEVICE_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FAXSRV_DeviceID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CF_MSFAXSRV_FSP_GUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FAXSRV_FSPGuid");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CF_MSFAXSRV_ROUTEEXT_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FAXSRV_RoutingExtName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CF_MSFAXSRV_ROUTING_METHOD_GUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FAXSRV_RoutingMethodGuid");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CF_MSFAXSRV_SERVER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FAXSRV_ServerName");
// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_Sti: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb323f8e0_2e68_11d0_90ea_00aa0060f86c);

// UNSUPPORTED Rust 70:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WIA_DeviceType: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x6bdd1fc6_810f_11d0_bec7_08002be2092f), pid: 2 };

// UNSUPPORTED Rust 71:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WIA_USDClassId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x6bdd1fc6_810f_11d0_bec7_08002be2092f), pid: 3 };

public const val `DEV_ID_SRC_FAX`: `FAX_ENUM_DEVICE_ID_SOURCE` = 0;
public const val `DEV_ID_SRC_TAPI`: `FAX_ENUM_DEVICE_ID_SOURCE` = 1;
public const val `DRT_EMAIL`: `FAX_ENUM_DELIVERY_REPORT_TYPES` = 1;
public const val `DRT_INBOX`: `FAX_ENUM_DELIVERY_REPORT_TYPES` = 2;
public const val `DRT_NONE`: `FAX_ENUM_DELIVERY_REPORT_TYPES` = 0;
public const val `FAXDEVRECEIVE_SIZE`: UInt = 4096u;
public const val `FAXDEVREPORTSTATUS_SIZE`: UInt = 4096u;
public const val `FAXLOG_CATEGORY_INBOUND`: `FAX_ENUM_LOG_CATEGORIES` = 3;
public const val `FAXLOG_CATEGORY_INIT`: `FAX_ENUM_LOG_CATEGORIES` = 1;
public const val `FAXLOG_CATEGORY_OUTBOUND`: `FAX_ENUM_LOG_CATEGORIES` = 2;
public const val `FAXLOG_CATEGORY_UNKNOWN`: `FAX_ENUM_LOG_CATEGORIES` = 4;
public const val `FAXLOG_LEVEL_MAX`: `FAX_ENUM_LOG_LEVELS` = 3;
public const val `FAXLOG_LEVEL_MED`: `FAX_ENUM_LOG_LEVELS` = 2;
public const val `FAXLOG_LEVEL_MIN`: `FAX_ENUM_LOG_LEVELS` = 1;
public const val `FAXLOG_LEVEL_NONE`: `FAX_ENUM_LOG_LEVELS` = 0;
public typealias `FAXROUTE_ENABLE` = Int;
// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FAXSRV_DEVICE_NODETYPE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3115a19a_6251_46ac_9425_14782858b8c9);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FAXSRV_DEVICE_PROVIDER_NODETYPE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd38e2ac_b926_4161_8640_0f6956ee2ba3);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FAXSRV_ROUTING_METHOD_NODETYPE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x220d2cb0_85a9_4a43_b6e8_9d66b44f1af5);

public typealias `FAX_ACCESS_RIGHTS_ENUM` = Int;
public typealias `FAX_ACCESS_RIGHTS_ENUM_2` = Int;
public typealias `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_CONFIGURATIONA` (
    public var `SizeOfStruct`: UInt,
    public var `Retries`: UInt,
    public var `RetryDelay`: UInt,
    public var `DirtyDays`: UInt,
    public var `Branding`: `windows_sys`.`core`.`BOOL`,
    public var `UseDeviceTsid`: `windows_sys`.`core`.`BOOL`,
    public var `ServerCp`: `windows_sys`.`core`.`BOOL`,
    public var `PauseServerQueue`: `windows_sys`.`core`.`BOOL`,
    public var `StartCheapTime`: `FAX_TIME`,
    public var `StopCheapTime`: `FAX_TIME`,
    public var `ArchiveOutgoingFaxes`: `windows_sys`.`core`.`BOOL`,
    public var `ArchiveDirectory`: `windows_sys`.`core`.`PCSTR`,
    public var `Reserved`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_CONFIGURATIONA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_CONFIGURATIONA`.Companion.`default`() : `FAX_CONFIGURATIONA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_CONFIGURATIONW` (
    public var `SizeOfStruct`: UInt,
    public var `Retries`: UInt,
    public var `RetryDelay`: UInt,
    public var `DirtyDays`: UInt,
    public var `Branding`: `windows_sys`.`core`.`BOOL`,
    public var `UseDeviceTsid`: `windows_sys`.`core`.`BOOL`,
    public var `ServerCp`: `windows_sys`.`core`.`BOOL`,
    public var `PauseServerQueue`: `windows_sys`.`core`.`BOOL`,
    public var `StartCheapTime`: `FAX_TIME`,
    public var `StopCheapTime`: `FAX_TIME`,
    public var `ArchiveOutgoingFaxes`: `windows_sys`.`core`.`BOOL`,
    public var `ArchiveDirectory`: `windows_sys`.`core`.`PCWSTR`,
    public var `Reserved`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_CONFIGURATIONW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_CONFIGURATIONW`.Companion.`default`() : `FAX_CONFIGURATIONW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `FAX_CONFIG_QUERY`: UInt = 4u;
public const val `FAX_CONFIG_SET`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_CONTEXT_INFOA` (
    public var `SizeOfStruct`: UInt,
    public var `hDC`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `ServerName`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_CONTEXT_INFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `FAX_CONTEXT_INFOA`.Companion.`default`() : `FAX_CONTEXT_INFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_CONTEXT_INFOW` (
    public var `SizeOfStruct`: UInt,
    public var `hDC`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `ServerName`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_CONTEXT_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `FAX_CONTEXT_INFOW`.Companion.`default`() : `FAX_CONTEXT_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_COVERPAGE_INFOA` (
    public var `SizeOfStruct`: UInt,
    public var `CoverPageName`: `windows_sys`.`core`.`PCSTR`,
    public var `UseServerCoverPage`: `windows_sys`.`core`.`BOOL`,
    public var `RecName`: `windows_sys`.`core`.`PCSTR`,
    public var `RecFaxNumber`: `windows_sys`.`core`.`PCSTR`,
    public var `RecCompany`: `windows_sys`.`core`.`PCSTR`,
    public var `RecStreetAddress`: `windows_sys`.`core`.`PCSTR`,
    public var `RecCity`: `windows_sys`.`core`.`PCSTR`,
    public var `RecState`: `windows_sys`.`core`.`PCSTR`,
    public var `RecZip`: `windows_sys`.`core`.`PCSTR`,
    public var `RecCountry`: `windows_sys`.`core`.`PCSTR`,
    public var `RecTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `RecDepartment`: `windows_sys`.`core`.`PCSTR`,
    public var `RecOfficeLocation`: `windows_sys`.`core`.`PCSTR`,
    public var `RecHomePhone`: `windows_sys`.`core`.`PCSTR`,
    public var `RecOfficePhone`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrName`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrFaxNumber`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrCompany`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrAddress`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrDepartment`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrOfficeLocation`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrHomePhone`: `windows_sys`.`core`.`PCSTR`,
    public var `SdrOfficePhone`: `windows_sys`.`core`.`PCSTR`,
    public var `Note`: `windows_sys`.`core`.`PCSTR`,
    public var `Subject`: `windows_sys`.`core`.`PCSTR`,
    public var `TimeSent`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `PageCount`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_COVERPAGE_INFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_COVERPAGE_INFOA`.Companion.`default`() : `FAX_COVERPAGE_INFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_COVERPAGE_INFOW` (
    public var `SizeOfStruct`: UInt,
    public var `CoverPageName`: `windows_sys`.`core`.`PCWSTR`,
    public var `UseServerCoverPage`: `windows_sys`.`core`.`BOOL`,
    public var `RecName`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecFaxNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecCompany`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecStreetAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecCity`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecState`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecZip`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecCountry`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecDepartment`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecOfficeLocation`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecHomePhone`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecOfficePhone`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrName`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrFaxNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrCompany`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrDepartment`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrOfficeLocation`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrHomePhone`: `windows_sys`.`core`.`PCWSTR`,
    public var `SdrOfficePhone`: `windows_sys`.`core`.`PCWSTR`,
    public var `Note`: `windows_sys`.`core`.`PCWSTR`,
    public var `Subject`: `windows_sys`.`core`.`PCWSTR`,
    public var `TimeSent`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `PageCount`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_COVERPAGE_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_COVERPAGE_INFOW`.Companion.`default`() : `FAX_COVERPAGE_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_COVERPAGE_TYPE_ENUM` = Int;
public typealias `FAX_DEVICE_RECEIVE_MODE_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_DEVICE_STATUSA` (
    public var `SizeOfStruct`: UInt,
    public var `CallerId`: `windows_sys`.`core`.`PCSTR`,
    public var `Csid`: `windows_sys`.`core`.`PCSTR`,
    public var `CurrentPage`: UInt,
    public var `DeviceId`: UInt,
    public var `DeviceName`: `windows_sys`.`core`.`PCSTR`,
    public var `DocumentName`: `windows_sys`.`core`.`PCSTR`,
    public var `JobType`: UInt,
    public var `PhoneNumber`: `windows_sys`.`core`.`PCSTR`,
    public var `RoutingString`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCSTR`,
    public var `Size`: UInt,
    public var `StartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `Status`: UInt,
    public var `StatusString`: `windows_sys`.`core`.`PCSTR`,
    public var `SubmittedTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `TotalPages`: UInt,
    public var `Tsid`: `windows_sys`.`core`.`PCSTR`,
    public var `UserName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_DEVICE_STATUSA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_DEVICE_STATUSA`.Companion.`default`() : `FAX_DEVICE_STATUSA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_DEVICE_STATUSW` (
    public var `SizeOfStruct`: UInt,
    public var `CallerId`: `windows_sys`.`core`.`PCWSTR`,
    public var `Csid`: `windows_sys`.`core`.`PCWSTR`,
    public var `CurrentPage`: UInt,
    public var `DeviceId`: UInt,
    public var `DeviceName`: `windows_sys`.`core`.`PCWSTR`,
    public var `DocumentName`: `windows_sys`.`core`.`PCWSTR`,
    public var `JobType`: UInt,
    public var `PhoneNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `RoutingString`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Size`: UInt,
    public var `StartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `Status`: UInt,
    public var `StatusString`: `windows_sys`.`core`.`PCWSTR`,
    public var `SubmittedTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `TotalPages`: UInt,
    public var `Tsid`: `windows_sys`.`core`.`PCWSTR`,
    public var `UserName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_DEVICE_STATUSW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_DEVICE_STATUSW`.Companion.`default`() : `FAX_DEVICE_STATUSW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_DEV_STATUS` (
    public var `SizeOfStruct`: UInt,
    public var `StatusId`: UInt,
    public var `StringId`: UInt,
    public var `PageCount`: UInt,
    public var `CSI`: `windows_sys`.`core`.`PWSTR`,
    public var `CallerId`: `windows_sys`.`core`.`PWSTR`,
    public var `RoutingInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `ErrorCode`: UInt,
    public var `Reserved`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_DEV_STATUS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_DEV_STATUS`.Companion.`default`() : `FAX_DEV_STATUS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_ENUM_DELIVERY_REPORT_TYPES` = Int;
public typealias `FAX_ENUM_DEVICE_ID_SOURCE` = Int;
public typealias `FAX_ENUM_JOB_COMMANDS` = Int;
public typealias `FAX_ENUM_JOB_SEND_ATTRIBUTES` = Int;
public typealias `FAX_ENUM_LOG_CATEGORIES` = Int;
public typealias `FAX_ENUM_LOG_LEVELS` = Int;
public typealias `FAX_ENUM_PORT_OPEN_TYPE` = Int;
public const val `FAX_ERR_BAD_GROUP_CONFIGURATION`: Int = 7003;
public const val `FAX_ERR_DEVICE_NUM_LIMIT_EXCEEDED`: Int = 7010;
public const val `FAX_ERR_DIRECTORY_IN_USE`: Int = 7007;
public const val `FAX_ERR_END`: Int = 7013;
public const val `FAX_ERR_FILE_ACCESS_DENIED`: Int = 7008;
public const val `FAX_ERR_GROUP_IN_USE`: Int = 7004;
public const val `FAX_ERR_GROUP_NOT_FOUND`: Int = 7002;
public const val `FAX_ERR_MESSAGE_NOT_FOUND`: Int = 7009;
public const val `FAX_ERR_NOT_NTFS`: Int = 7006;
public const val `FAX_ERR_NOT_SUPPORTED_ON_THIS_SKU`: Int = 7011;
public const val `FAX_ERR_RECIPIENTS_LIMIT`: Int = 7013;
public const val `FAX_ERR_RULE_NOT_FOUND`: Int = 7005;
public const val `FAX_ERR_SRV_OUTOFMEMORY`: Int = 7001;
public const val `FAX_ERR_START`: Int = 7001;
public const val `FAX_ERR_VERSION_MISMATCH`: Int = 7012;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FAX_EVENTA` (
    public var `SizeOfStruct`: UInt,
    public var `TimeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `DeviceId`: UInt,
    public var `EventId`: UInt,
    public var `JobId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FAX_EVENTW` (
    public var `SizeOfStruct`: UInt,
    public var `TimeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `DeviceId`: UInt,
    public var `EventId`: UInt,
    public var `JobId`: UInt,
)
public const val `FAX_E_BAD_GROUP_CONFIGURATION`: Int = -2147214501;
public const val `FAX_E_DEVICE_NUM_LIMIT_EXCEEDED`: Int = -2147214494;
public const val `FAX_E_DIRECTORY_IN_USE`: Int = -2147214497;
public const val `FAX_E_FILE_ACCESS_DENIED`: Int = -2147214496;
public const val `FAX_E_GROUP_IN_USE`: Int = -2147214500;
public const val `FAX_E_GROUP_NOT_FOUND`: Int = -2147214502;
public const val `FAX_E_MESSAGE_NOT_FOUND`: Int = -2147214495;
public const val `FAX_E_NOT_NTFS`: Int = -2147214498;
public const val `FAX_E_NOT_SUPPORTED_ON_THIS_SKU`: Int = -2147214493;
public const val `FAX_E_RECIPIENTS_LIMIT`: Int = -2147214491;
public const val `FAX_E_RULE_NOT_FOUND`: Int = -2147214499;
public const val `FAX_E_SRV_OUTOFMEMORY`: Int = -2147214503;
public const val `FAX_E_VERSION_MISMATCH`: Int = -2147214492;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_GLOBAL_ROUTING_INFOA` (
    public var `SizeOfStruct`: UInt,
    public var `Priority`: UInt,
    public var `Guid`: `windows_sys`.`core`.`PCSTR`,
    public var `FriendlyName`: `windows_sys`.`core`.`PCSTR`,
    public var `FunctionName`: `windows_sys`.`core`.`PCSTR`,
    public var `ExtensionImageName`: `windows_sys`.`core`.`PCSTR`,
    public var `ExtensionFriendlyName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_GLOBAL_ROUTING_INFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_GLOBAL_ROUTING_INFOA`.Companion.`default`() : `FAX_GLOBAL_ROUTING_INFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_GLOBAL_ROUTING_INFOW` (
    public var `SizeOfStruct`: UInt,
    public var `Priority`: UInt,
    public var `Guid`: `windows_sys`.`core`.`PCWSTR`,
    public var `FriendlyName`: `windows_sys`.`core`.`PCWSTR`,
    public var `FunctionName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ExtensionImageName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ExtensionFriendlyName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_GLOBAL_ROUTING_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_GLOBAL_ROUTING_INFOW`.Companion.`default`() : `FAX_GLOBAL_ROUTING_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_GROUP_STATUS_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_JOB_ENTRYA` (
    public var `SizeOfStruct`: UInt,
    public var `JobId`: UInt,
    public var `UserName`: `windows_sys`.`core`.`PCSTR`,
    public var `JobType`: UInt,
    public var `QueueStatus`: UInt,
    public var `Status`: UInt,
    public var `Size`: UInt,
    public var `PageCount`: UInt,
    public var `RecipientNumber`: `windows_sys`.`core`.`PCSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderCompany`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderDept`: `windows_sys`.`core`.`PCSTR`,
    public var `BillingCode`: `windows_sys`.`core`.`PCSTR`,
    public var `ScheduleAction`: UInt,
    public var `ScheduleTime`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `DeliveryReportType`: UInt,
    public var `DeliveryReportAddress`: `windows_sys`.`core`.`PCSTR`,
    public var `DocumentName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_JOB_ENTRYA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_JOB_ENTRYA`.Companion.`default`() : `FAX_JOB_ENTRYA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_JOB_ENTRYW` (
    public var `SizeOfStruct`: UInt,
    public var `JobId`: UInt,
    public var `UserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `JobType`: UInt,
    public var `QueueStatus`: UInt,
    public var `Status`: UInt,
    public var `Size`: UInt,
    public var `PageCount`: UInt,
    public var `RecipientNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderCompany`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderDept`: `windows_sys`.`core`.`PCWSTR`,
    public var `BillingCode`: `windows_sys`.`core`.`PCWSTR`,
    public var `ScheduleAction`: UInt,
    public var `ScheduleTime`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `DeliveryReportType`: UInt,
    public var `DeliveryReportAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `DocumentName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_JOB_ENTRYW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_JOB_ENTRYW`.Companion.`default`() : `FAX_JOB_ENTRYW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_JOB_EXTENDED_STATUS_ENUM` = Int;
public const val `FAX_JOB_MANAGE`: UInt = 64u;
public typealias `FAX_JOB_OPERATIONS_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_JOB_PARAMA` (
    public var `SizeOfStruct`: UInt,
    public var `RecipientNumber`: `windows_sys`.`core`.`PCSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderCompany`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderDept`: `windows_sys`.`core`.`PCSTR`,
    public var `BillingCode`: `windows_sys`.`core`.`PCSTR`,
    public var `ScheduleAction`: UInt,
    public var `ScheduleTime`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `DeliveryReportType`: UInt,
    public var `DeliveryReportAddress`: `windows_sys`.`core`.`PCSTR`,
    public var `DocumentName`: `windows_sys`.`core`.`PCSTR`,
    public var `CallHandle`: UInt,
    public var `Reserved`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_JOB_PARAMA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_JOB_PARAMA`.Companion.`default`() : `FAX_JOB_PARAMA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_JOB_PARAMW` (
    public var `SizeOfStruct`: UInt,
    public var `RecipientNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderCompany`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderDept`: `windows_sys`.`core`.`PCWSTR`,
    public var `BillingCode`: `windows_sys`.`core`.`PCWSTR`,
    public var `ScheduleAction`: UInt,
    public var `ScheduleTime`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `DeliveryReportType`: UInt,
    public var `DeliveryReportAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `DocumentName`: `windows_sys`.`core`.`PCWSTR`,
    public var `CallHandle`: UInt,
    public var `Reserved`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_JOB_PARAMW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_JOB_PARAMW`.Companion.`default`() : `FAX_JOB_PARAMW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `FAX_JOB_QUERY`: UInt = 2u;
public typealias `FAX_JOB_STATUS_ENUM` = Int;
public const val `FAX_JOB_SUBMIT`: UInt = 1u;
public typealias `FAX_JOB_TYPE_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_LOG_CATEGORYA` (
    public var `Name`: `windows_sys`.`core`.`PCSTR`,
    public var `Category`: UInt,
    public var `Level`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_LOG_CATEGORYA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_LOG_CATEGORYA`.Companion.`default`() : `FAX_LOG_CATEGORYA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_LOG_CATEGORYW` (
    public var `Name`: `windows_sys`.`core`.`PCWSTR`,
    public var `Category`: UInt,
    public var `Level`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_LOG_CATEGORYW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_LOG_CATEGORYW`.Companion.`default`() : `FAX_LOG_CATEGORYW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_LOG_LEVEL_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_PORT_INFOA` (
    public var `SizeOfStruct`: UInt,
    public var `DeviceId`: UInt,
    public var `State`: UInt,
    public var `Flags`: UInt,
    public var `Rings`: UInt,
    public var `Priority`: UInt,
    public var `DeviceName`: `windows_sys`.`core`.`PCSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCSTR`,
    public var `Csid`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_PORT_INFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_PORT_INFOA`.Companion.`default`() : `FAX_PORT_INFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_PORT_INFOW` (
    public var `SizeOfStruct`: UInt,
    public var `DeviceId`: UInt,
    public var `State`: UInt,
    public var `Flags`: UInt,
    public var `Rings`: UInt,
    public var `Priority`: UInt,
    public var `DeviceName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCWSTR`,
    public var `Csid`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_PORT_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_PORT_INFOW`.Companion.`default`() : `FAX_PORT_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `FAX_PORT_QUERY`: UInt = 16u;
public const val `FAX_PORT_SET`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_PRINT_INFOA` (
    public var `SizeOfStruct`: UInt,
    public var `DocName`: `windows_sys`.`core`.`PCSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCSTR`,
    public var `RecipientNumber`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderCompany`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderDept`: `windows_sys`.`core`.`PCSTR`,
    public var `SenderBillingCode`: `windows_sys`.`core`.`PCSTR`,
    public var `Reserved`: `windows_sys`.`core`.`PCSTR`,
    public var `DrEmailAddress`: `windows_sys`.`core`.`PCSTR`,
    public var `OutputFileName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_PRINT_INFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_PRINT_INFOA`.Companion.`default`() : `FAX_PRINT_INFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_PRINT_INFOW` (
    public var `SizeOfStruct`: UInt,
    public var `DocName`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecipientName`: `windows_sys`.`core`.`PCWSTR`,
    public var `RecipientNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderName`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderCompany`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderDept`: `windows_sys`.`core`.`PCWSTR`,
    public var `SenderBillingCode`: `windows_sys`.`core`.`PCWSTR`,
    public var `Reserved`: `windows_sys`.`core`.`PCWSTR`,
    public var `DrEmailAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `OutputFileName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_PRINT_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_PRINT_INFOW`.Companion.`default`() : `FAX_PRINT_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_PRIORITY_TYPE_ENUM` = Int;
public typealias `FAX_PROVIDER_STATUS_ENUM` = Int;
public typealias `FAX_RECEIPT_TYPE_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_RECEIVE` (
    public var `SizeOfStruct`: UInt,
    public var `FileName`: `windows_sys`.`core`.`PWSTR`,
    public var `ReceiverName`: `windows_sys`.`core`.`PWSTR`,
    public var `ReceiverNumber`: `windows_sys`.`core`.`PWSTR`,
    public var `Reserved`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_RECEIVE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_RECEIVE`.Companion.`default`() : `FAX_RECEIVE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_ROUTE` (
    public var `SizeOfStruct`: UInt,
    public var `JobId`: UInt,
    public var `ElapsedTime`: ULong,
    public var `ReceiveTime`: ULong,
    public var `PageCount`: UInt,
    public var `Csid`: `windows_sys`.`core`.`PCWSTR`,
    public var `Tsid`: `windows_sys`.`core`.`PCWSTR`,
    public var `CallerId`: `windows_sys`.`core`.`PCWSTR`,
    public var `RoutingInfo`: `windows_sys`.`core`.`PCWSTR`,
    public var `ReceiverName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ReceiverNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `DeviceName`: `windows_sys`.`core`.`PCWSTR`,
    public var `DeviceId`: UInt,
    public var `RoutingInfoData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `RoutingInfoDataSize`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_ROUTE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_ROUTE`.Companion.`default`() : `FAX_ROUTE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FAX_ROUTE_CALLBACKROUTINES` (
    public var `SizeOfStruct`: UInt,
    public var `FaxRouteAddFile`: `PFAXROUTEADDFILE`,
    public var `FaxRouteDeleteFile`: `PFAXROUTEDELETEFILE`,
    public var `FaxRouteGetFile`: `PFAXROUTEGETFILE`,
    public var `FaxRouteEnumFiles`: `PFAXROUTEENUMFILES`,
    public var `FaxRouteModifyRoutingData`: `PFAXROUTEMODIFYROUTINGDATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_ROUTING_METHODA` (
    public var `SizeOfStruct`: UInt,
    public var `DeviceId`: UInt,
    public var `Enabled`: `windows_sys`.`core`.`BOOL`,
    public var `DeviceName`: `windows_sys`.`core`.`PCSTR`,
    public var `Guid`: `windows_sys`.`core`.`PCSTR`,
    public var `FriendlyName`: `windows_sys`.`core`.`PCSTR`,
    public var `FunctionName`: `windows_sys`.`core`.`PCSTR`,
    public var `ExtensionImageName`: `windows_sys`.`core`.`PCSTR`,
    public var `ExtensionFriendlyName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_ROUTING_METHODA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_ROUTING_METHODA`.Companion.`default`() : `FAX_ROUTING_METHODA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_ROUTING_METHODW` (
    public var `SizeOfStruct`: UInt,
    public var `DeviceId`: UInt,
    public var `Enabled`: `windows_sys`.`core`.`BOOL`,
    public var `DeviceName`: `windows_sys`.`core`.`PCWSTR`,
    public var `Guid`: `windows_sys`.`core`.`PCWSTR`,
    public var `FriendlyName`: `windows_sys`.`core`.`PCWSTR`,
    public var `FunctionName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ExtensionImageName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ExtensionFriendlyName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_ROUTING_METHODW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_ROUTING_METHODW`.Companion.`default`() : `FAX_ROUTING_METHODW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_ROUTING_RULE_CODE_ENUM` = Int;
public typealias `FAX_RULE_STATUS_ENUM` = Int;
public typealias `FAX_SCHEDULE_TYPE_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FAX_SEND` (
    public var `SizeOfStruct`: UInt,
    public var `FileName`: `windows_sys`.`core`.`PWSTR`,
    public var `CallerName`: `windows_sys`.`core`.`PWSTR`,
    public var `CallerNumber`: `windows_sys`.`core`.`PWSTR`,
    public var `ReceiverName`: `windows_sys`.`core`.`PWSTR`,
    public var `ReceiverNumber`: `windows_sys`.`core`.`PWSTR`,
    public var `Branding`: `windows_sys`.`core`.`BOOL`,
    public var `CallHandle`: UInt,
    public var `Reserved`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FAX_SEND`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FAX_SEND`.Companion.`default`() : `FAX_SEND` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FAX_SERVER_APIVERSION_ENUM` = Int;
public typealias `FAX_SERVER_EVENTS_TYPE_ENUM` = Int;
public typealias `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FAX_TIME` (
    public var `Hour`: UShort,
    public var `Minute`: UShort,
)
public const val `FEI_ABORTING`: UInt = 15u;
public const val `FEI_ANSWERED`: UInt = 21u;
public const val `FEI_BAD_ADDRESS`: UInt = 7u;
public const val `FEI_BUSY`: UInt = 5u;
public const val `FEI_CALL_BLACKLISTED`: UInt = 13u;
public const val `FEI_CALL_DELAYED`: UInt = 12u;
public const val `FEI_COMPLETED`: UInt = 4u;
public const val `FEI_DELETED`: UInt = 23u;
public const val `FEI_DIALING`: UInt = 1u;
public const val `FEI_DISCONNECTED`: UInt = 9u;
public const val `FEI_FATAL_ERROR`: UInt = 10u;
public const val `FEI_FAXSVC_ENDED`: UInt = 20u;
public const val `FEI_FAXSVC_STARTED`: UInt = 27u;
public const val `FEI_HANDLED`: UInt = 26u;
public const val `FEI_IDLE`: UInt = 19u;
public const val `FEI_INITIALIZING`: UInt = 24u;
public const val `FEI_JOB_QUEUED`: UInt = 22u;
public const val `FEI_LINE_UNAVAILABLE`: UInt = 25u;
public const val `FEI_MODEM_POWERED_OFF`: UInt = 18u;
public const val `FEI_MODEM_POWERED_ON`: UInt = 17u;
public const val `FEI_NEVENTS`: UInt = 27u;
public const val `FEI_NOT_FAX_CALL`: UInt = 11u;
public const val `FEI_NO_ANSWER`: UInt = 6u;
public const val `FEI_NO_DIAL_TONE`: UInt = 8u;
public const val `FEI_RECEIVING`: UInt = 3u;
public const val `FEI_RINGING`: UInt = 14u;
public const val `FEI_ROUTING`: UInt = 16u;
public const val `FEI_SENDING`: UInt = 2u;
public const val `FPF_RECEIVE`: UInt = 1u;
public const val `FPF_SEND`: UInt = 2u;
public const val `FPF_VIRTUAL`: UInt = 4u;
public const val `FPS_ABORTING`: UInt = 538968064u;
public const val `FPS_ANSWERED`: UInt = 545259520u;
public const val `FPS_AVAILABLE`: UInt = 537919488u;
public const val `FPS_BAD_ADDRESS`: UInt = 536871168u;
public const val `FPS_BUSY`: UInt = 536870976u;
public const val `FPS_CALL_BLACKLISTED`: UInt = 536887296u;
public const val `FPS_CALL_DELAYED`: UInt = 536879104u;
public const val `FPS_COMPLETED`: UInt = 536870920u;
public const val `FPS_DIALING`: UInt = 536870913u;
public const val `FPS_DISCONNECTED`: UInt = 536871936u;
public const val `FPS_FATAL_ERROR`: UInt = 536872960u;
public const val `FPS_HANDLED`: UInt = 536870928u;
public const val `FPS_INITIALIZING`: UInt = 536903680u;
public const val `FPS_NOT_FAX_CALL`: UInt = 536875008u;
public const val `FPS_NO_ANSWER`: UInt = 536871040u;
public const val `FPS_NO_DIAL_TONE`: UInt = 536871424u;
public const val `FPS_OFFLINE`: UInt = 536936448u;
public const val `FPS_RECEIVING`: UInt = 536870916u;
public const val `FPS_RINGING`: UInt = 537001984u;
public const val `FPS_ROUTING`: UInt = 541065216u;
public const val `FPS_SENDING`: UInt = 536870914u;
public const val `FPS_UNAVAILABLE`: UInt = 536870944u;
public const val `FS_ANSWERED`: UInt = 545259520u;
public const val `FS_BAD_ADDRESS`: UInt = 536871168u;
public const val `FS_BUSY`: UInt = 536870976u;
public const val `FS_CALL_BLACKLISTED`: UInt = 536887296u;
public const val `FS_CALL_DELAYED`: UInt = 536879104u;
public const val `FS_COMPLETED`: UInt = 536870920u;
public const val `FS_DIALING`: UInt = 536870913u;
public const val `FS_DISCONNECTED`: UInt = 536871936u;
public const val `FS_FATAL_ERROR`: UInt = 536872960u;
public const val `FS_HANDLED`: UInt = 536870928u;
public const val `FS_INITIALIZING`: UInt = 536870912u;
public const val `FS_LINE_UNAVAILABLE`: UInt = 536870944u;
public const val `FS_NOT_FAX_CALL`: UInt = 536875008u;
public const val `FS_NO_ANSWER`: UInt = 536871040u;
public const val `FS_NO_DIAL_TONE`: UInt = 536871424u;
public const val `FS_RECEIVING`: UInt = 536870916u;
public const val `FS_TRANSMITTING`: UInt = 536870914u;
public const val `FS_USER_ABORT`: UInt = 538968064u;
// UNSUPPORTED Rust 812:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7e0647f_4524_4464_a56d_b9fe666f715e);

// UNSUPPORTED Rust 813:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccountFolders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x85398f49_c034_4a3f_821c_db7d685e8129);

// UNSUPPORTED Rust 814:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccountIncomingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x14b33db5_4c40_4ecf_9ef8_a360cbe809ed);

// UNSUPPORTED Rust 815:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccountIncomingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bcf6094_b4da_45f4_b8d6_ddeb2186652c);

// UNSUPPORTED Rust 816:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccountOutgoingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x851e7af5_433a_4739_a2df_ad245c2cb98e);

// UNSUPPORTED Rust 817:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccountOutgoingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfeeceefb_c149_48ba_bab8_b791e101f62f);

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccountSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbc23c4b_79e0_4291_bc56_c12e253bbf3a);

// UNSUPPORTED Rust 819:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxAccounts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda1f94aa_ee2c_47c0_8f4f_2a217075b76e);

// UNSUPPORTED Rust 820:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcfef5d0e_e84d_462e_aabb_87d31eb04fef);

// UNSUPPORTED Rust 821:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxActivityLogging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf0a0294e_3bbd_48b8_8f13_8c591a55bdbc);

// UNSUPPORTED Rust 822:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxConfiguration: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5857326f_e7b3_41a7_9c19_a91b463e2d56);

// UNSUPPORTED Rust 823:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxDevice: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59e3a5b2_d676_484b_a6de_720bfa89b5af);

// UNSUPPORTED Rust 824:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxDeviceIds: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdc539ea_7277_460e_8de0_48a0a5760d1f);

// UNSUPPORTED Rust 825:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxDeviceProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17cf1aa3_f5eb_484a_9c9a_4440a5baabfc);

// UNSUPPORTED Rust 826:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxDeviceProviders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb8fe768_875a_4f5f_82c5_03f23aac1bd7);

// UNSUPPORTED Rust 827:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxDevices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5589e28e_23cb_4919_8808_e6101846e80d);

// UNSUPPORTED Rust 828:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxDocument: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f3f9f91_c838_415e_a4f3_3e828ca445e0);

// UNSUPPORTED Rust 829:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxEventLogging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6850930_a0f6_4a6f_95b7_db2ebf3d02e3);

// UNSUPPORTED Rust 830:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxFolders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc35211d7_5776_48cb_af44_c31be3b2cfe5);

// UNSUPPORTED Rust 831:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxInboundRouting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe80248ed_ad65_4218_8108_991924d4e7ed);

// UNSUPPORTED Rust 832:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxInboundRoutingExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d7dfb51_7207_4436_a0d9_24e32ee56988);

// UNSUPPORTED Rust 833:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxInboundRoutingExtensions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x189a48ed_623c_4c0d_80f2_d66c7b9efec2);

// UNSUPPORTED Rust 834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxInboundRoutingMethod: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b9fd75c_0194_4b72_9ce5_02a8205ac7d4);

// UNSUPPORTED Rust 835:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxInboundRoutingMethods: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25fcb76a_b750_4b82_9266_fbbbae8922ba);

// UNSUPPORTED Rust 836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxIncomingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8426c56a_35a1_4c6f_af93_fc952422e2c2);

// UNSUPPORTED Rust 837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxIncomingJob: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc47311ec_ae32_41b8_ae4b_3eae0629d0c9);

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxIncomingJobs: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1bb8a43_8866_4fb7_a15d_6266c875a5cc);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxIncomingMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1932fcf7_9d43_4d5a_89ff_03861b321736);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxIncomingMessageIterator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6088e1d8_3fc8_45c2_87b1_909a29607ea9);

// UNSUPPORTED Rust 841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxIncomingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69131717_f3f1_40e3_809d_a6cbf7bd85e5);

// UNSUPPORTED Rust 842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxJobStatus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bf222f4_be8d_442f_841d_6132742423bb);

// UNSUPPORTED Rust 843:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxLoggingOptions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1bf9eea6_ece0_4785_a18b_de56e9eef96a);

// UNSUPPORTED Rust 844:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutboundRouting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc81b385e_b869_4afd_86c0_616498ed9be2);

// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutboundRoutingGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0213f3e0_6791_4d77_a271_04d2357c50d6);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutboundRoutingGroups: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xccbea1a5_e2b4_4b57_9421_b04b6289464b);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutboundRoutingRule: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6549eebf_08d1_475a_828b_3bf105952fa0);

// UNSUPPORTED Rust 848:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutboundRoutingRules: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd385beca_e624_4473_bfaa_9f4000831f54);

// UNSUPPORTED Rust 849:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutgoingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43c28403_e04f_474d_990c_b94669148f59);

// UNSUPPORTED Rust 850:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutgoingJob: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71bb429c_0ef9_4915_bec5_a5d897a3e924);

// UNSUPPORTED Rust 851:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutgoingJobs: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92bf2a6c_37be_43fa_a37d_cb0e5f753b35);

// UNSUPPORTED Rust 852:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutgoingMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91b4a378_4ad8_4aef_a4dc_97d96e939a3a);

// UNSUPPORTED Rust 853:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutgoingMessageIterator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a3224d0_d30b_49de_9813_cb385790fbbb);

// UNSUPPORTED Rust 854:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxOutgoingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7421169e_8c43_4b0d_bb16_645c8fa40357);

// UNSUPPORTED Rust 855:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxReceiptOptions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6982487b_227b_4c96_a61c_248348b05ab6);

// UNSUPPORTED Rust 856:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxRecipient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60bf3301_7df8_4bd8_9148_7b5801f9efdf);

// UNSUPPORTED Rust 857:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxRecipients: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea9bdf53_10a9_4d4f_a067_63c8f84f01b0);

// UNSUPPORTED Rust 858:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxSecurity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10c4ddde_abf0_43df_964f_7f3ac21a4c7b);

// UNSUPPORTED Rust 859:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxSecurity2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x735c1248_ec89_4c30_a127_656e92e3c4ea);

// UNSUPPORTED Rust 860:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxSender: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x265d84d0_1850_4360_b7c8_758bbb5f0b96);

// UNSUPPORTED Rust 861:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FaxServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcda8acb0_8cf5_4f6c_9ba2_5931d40c8cae);

// UNSUPPORTED Rust 862:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DeviceArrivedLaunch: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x740d9ee6_70f1_11d1_ad10_00a02438ad48);

// UNSUPPORTED Rust 863:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_STIUserDefined1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc00eb795_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 864:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_STIUserDefined2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc77ae9c5_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 865:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_STIUserDefined3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc77ae9c6_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 866:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_ScanFaxImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc00eb793_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 867:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_ScanImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6c5a715_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 868:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_ScanPrintImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb441f425_8c6e_11d2_977a_0000f87a926f);

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `IS_DIGITAL_CAMERA_STR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IsDigitalCamera");
public const val `IS_DIGITAL_CAMERA_VAL`: UInt = 1u;
public const val `JC_DELETE`: `FAX_ENUM_JOB_COMMANDS` = 1;
public const val `JC_PAUSE`: `FAX_ENUM_JOB_COMMANDS` = 2;
public const val `JC_RESUME`: `FAX_ENUM_JOB_COMMANDS` = 3;
public const val `JC_UNKNOWN`: `FAX_ENUM_JOB_COMMANDS` = 0;
public const val `JSA_DISCOUNT_PERIOD`: `FAX_ENUM_JOB_SEND_ATTRIBUTES` = 2;
public const val `JSA_NOW`: `FAX_ENUM_JOB_SEND_ATTRIBUTES` = 0;
public const val `JSA_SPECIFIC_TIME`: `FAX_ENUM_JOB_SEND_ATTRIBUTES` = 1;
public const val `JS_DELETING`: UInt = 2u;
public const val `JS_FAILED`: UInt = 4u;
public const val `JS_INPROGRESS`: UInt = 1u;
public const val `JS_NOLINE`: UInt = 16u;
public const val `JS_PAUSED`: UInt = 8u;
public const val `JS_PENDING`: UInt = 0u;
public const val `JS_RETRIES_EXCEEDED`: UInt = 64u;
public const val `JS_RETRYING`: UInt = 32u;
public const val `JT_FAIL_RECEIVE`: UInt = 4u;
public const val `JT_RECEIVE`: UInt = 2u;
public const val `JT_ROUTING`: UInt = 3u;
public const val `JT_SEND`: UInt = 1u;
public const val `JT_UNKNOWN`: UInt = 0u;
public const val `MAX_NOTIFICATION_DATA`: UInt = 64u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MS_FAXROUTE_EMAIL_GUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{6bbf7bfe-9af2-11d0-abf7-00c04fd91a4e}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MS_FAXROUTE_FOLDER_GUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{92041a90-9af2-11d0-abf7-00c04fd91a4e}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MS_FAXROUTE_PRINTING_GUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{aec1b37c-9af2-11d0-abf7-00c04fd91a4e}");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXABORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXACCESSCHECK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXCLOSE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXCOMPLETEJOBPARAMSA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_PARAMA`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_COVERPAGE_INFOA`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXCOMPLETEJOBPARAMSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_PARAMW`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_COVERPAGE_INFOW`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXCONNECTFAXSERVERA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXCONNECTFAXSERVERW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVABORTOPERATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public typealias `PFAXDEVCONFIGURE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`HPROPSHEETPAGE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVENDJOB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVINITIALIZE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`PFAX_LINECALLBACK`>?, `PFAX_SERVICE_CALLBACK`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVRECEIVE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_RECEIVE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVREPORTSTATUS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_DEV_STATUS`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVSEND` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_SEND`>?, `PFAX_SEND_CALLBACK`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVSHUTDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVSTARTJOB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `super`.`super`.`Foundation`.`HANDLE`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXDEVVIRTUALDEVICECREATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `super`.`super`.`Foundation`.`HANDLE`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENABLEROUTINGMETHODA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`BOOL`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENABLEROUTINGMETHODW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`BOOL`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMGLOBALROUTINGINFOA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_GLOBAL_ROUTING_INFOA`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMGLOBALROUTINGINFOW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_GLOBAL_ROUTING_INFOW`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMJOBSA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYA`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMJOBSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYW`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMPORTSA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOA`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMPORTSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOW`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMROUTINGMETHODSA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_ROUTING_METHODA`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXENUMROUTINGMETHODSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_ROUTING_METHODW`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXFREEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETCONFIGURATIONA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_CONFIGURATIONA`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETCONFIGURATIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_CONFIGURATIONW`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETDEVICESTATUSA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_DEVICE_STATUSA`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETDEVICESTATUSW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_DEVICE_STATUSW`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETJOBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYA`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETJOBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_JOB_ENTRYW`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETLOGGINGCATEGORIESA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_LOG_CATEGORYA`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETLOGGINGCATEGORIESW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_LOG_CATEGORYW`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETPAGEDATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETPORTA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOA`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETPORTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`FAX_PORT_INFOW`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETROUTINGINFOA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXGETROUTINGINFOW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXINITIALIZEEVENTQUEUE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, ULong, `super`.`super`.`Foundation`.`HWND`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXOPENPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFAXPRINTCOVERPAGEA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFAXPRINTCOVERPAGEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOW`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXREGISTERROUTINGEXTENSIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `PFAX_ROUTING_INSTALLATION_CALLBACKW`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXREGISTERSERVICEPROVIDERW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEADDFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEDELETEFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCWSTR`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEDEVICECHANGENOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`BOOL`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEDEVICEENABLE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, Int) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEENUMFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEENUMFILES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `PFAXROUTEENUMFILE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEGETFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEGETROUTINGINFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEINITIALIZE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_ROUTE_CALLBACKROUTINES`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEMETHOD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`FAX_ROUTE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTEMODIFYROUTINGDATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXROUTESETROUTINGINFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSENDDOCUMENTA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_PARAMA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSENDDOCUMENTFORBROADCASTA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `PFAX_RECIPIENT_CALLBACKA`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSENDDOCUMENTFORBROADCASTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `PFAX_RECIPIENT_CALLBACKW`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSENDDOCUMENTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_PARAMW`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETCONFIGURATIONA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONFIGURATIONA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETCONFIGURATIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_CONFIGURATIONW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETGLOBALROUTINGINFOA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_GLOBAL_ROUTING_INFOA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETGLOBALROUTINGINFOW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_GLOBAL_ROUTING_INFOW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETJOBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_ENTRYA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETJOBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_JOB_ENTRYW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETLOGGINGCATEGORIESA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_LOG_CATEGORYA`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETLOGGINGCATEGORIESW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_LOG_CATEGORYW`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETPORTA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PORT_INFOA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETPORTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PORT_INFOW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETROUTINGINFOA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXSETROUTINGINFOW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFAXSTARTPRINTJOBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PRINT_INFOA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `PFAXSTARTPRINTJOBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`FAX_PRINT_INFOW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_CONTEXT_INFOW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAXUNREGISTERSERVICEPROVIDERW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_CONFIG_CHANGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_FREE_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_GET_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `FAX_ENUM_DEVICE_ID_SOURCE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_INITIALIZE_CONFIG` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PFAX_EXT_GET_DATA`, `PFAX_EXT_SET_DATA`, `PFAX_EXT_REGISTER_FOR_EVENTS`, `PFAX_EXT_UNREGISTER_FOR_EVENTS`, `PFAX_EXT_FREE_BUFFER`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_REGISTER_FOR_EVENTS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HINSTANCE`, UInt, `FAX_ENUM_DEVICE_ID_SOURCE`, `windows_sys`.`core`.`PCWSTR`, `PFAX_EXT_CONFIG_CHANGE`) -> `super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_SET_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HINSTANCE`, UInt, `FAX_ENUM_DEVICE_ID_SOURCE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_EXT_UNREGISTER_FOR_EVENTS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_LINECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, ULong, ULong, ULong, ULong) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_RECIPIENT_CALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_JOB_PARAMA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_RECIPIENT_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_JOB_PARAMW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FAX_COVERPAGE_INFOW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_ROUTING_INSTALLATION_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PWSTR`, `windows_sys`.`core`.`PWSTR`, `windows_sys`.`core`.`PWSTR`, `windows_sys`.`core`.`PWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_SEND_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFAX_SERVICE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, ULong, ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PORT_OPEN_MODIFY`: `FAX_ENUM_PORT_OPEN_TYPE` = 2;
public const val `PORT_OPEN_QUERY`: `FAX_ENUM_PORT_OPEN_TYPE` = 1;
public const val `QUERY_STATUS`: `FAXROUTE_ENABLE` = -1;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_BAUDRATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BaudRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_BAUDRATE_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("BaudRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_DATA_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceData");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_DEVICESUBTYPE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceSubType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_DEVICETYPE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_DEVICE_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DriverDesc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_DEV_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_DRIVER_DESC_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DriverDesc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_FRIENDLY_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FriendlyName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_GENERIC_CAPS_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Capabilities");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_GUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GUID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_GUID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GUID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_HARDWARE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HardwareConfig");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_HARDWARE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HardwareConfig");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_LAUNCHABLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Launchable");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_LAUNCHABLE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Launchable");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_LAUNCH_APPS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LaunchApplications");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_LAUNCH_APPS_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LaunchApplications");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_SHUTDOWNDELAY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ShutdownIfUnusedDelay");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_SHUTDOWNDELAY_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ShutdownIfUnusedDelay");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_TYPE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Type");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REGSTR_VAL_VENDOR_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Vendor");
public const val `SEND_TO_FAX_RECIPIENT_ATTACHMENT`: `SendToMode` = 0;
public const val `STATUS_DISABLE`: `FAXROUTE_ENABLE` = 0;
public const val `STATUS_ENABLE`: `FAXROUTE_ENABLE` = 1;
public const val `STIEDFL_ALLDEVICES`: UInt = 0u;
public const val `STIEDFL_ATTACHEDONLY`: UInt = 1u;
public const val `STIERR_ALREADY_INITIALIZED`: Int = -2147023649;
public const val `STIERR_BADDRIVER`: Int = -2147024777;
public const val `STIERR_BETA_VERSION`: Int = -2147023743;
public const val `STIERR_DEVICENOTREG`: Int = -2147221164;
public const val `STIERR_DEVICE_LOCKED`: Int = -2147024863;
public const val `STIERR_DEVICE_NOTREADY`: Int = -2147024875;
public const val `STIERR_GENERIC`: Int = -2147467259;
public const val `STIERR_HANDLEEXISTS`: Int = -2147024713;
public const val `STIERR_INVALID_DEVICE_NAME`: Int = -2147024773;
public const val `STIERR_INVALID_HW_TYPE`: Int = -2147024883;
public const val `STIERR_INVALID_PARAM`: Int = -2147024809;
public const val `STIERR_NEEDS_LOCK`: Int = -2147024738;
public const val `STIERR_NOEVENTS`: Int = -2147024637;
public const val `STIERR_NOINTERFACE`: Int = -2147467262;
public const val `STIERR_NOTINITIALIZED`: Int = -2147024891;
public const val `STIERR_NOT_INITIALIZED`: Int = -2147024875;
public const val `STIERR_OBJECTNOTFOUND`: Int = -2147024894;
public const val `STIERR_OLD_VERSION`: Int = -2147023746;
public const val `STIERR_OUTOFMEMORY`: Int = -2147024882;
public const val `STIERR_READONLY`: Int = -2147024891;
public const val `STIERR_SHARING_VIOLATION`: Int = -2147024864;
public const val `STIERR_UNSUPPORTED`: Int = -2147467263;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STINOTIFY` (
    public var `dwSize`: UInt,
    public var `guidNotificationCode`: `windows_sys`.`core`.`GUID`,
    public var `abNotificationData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STINOTIFY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STINOTIFY`.Companion.`default`() : `STINOTIFY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STISUBSCRIBE` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwFilter`: UInt,
    public var `hWndNotify`: `super`.`super`.`Foundation`.`HWND`,
    public var `hEvent`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uiNotificationMessage`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STISUBSCRIBE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STISUBSCRIBE`.Companion.`default`() : `STISUBSCRIBE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_ADD_DEVICE_BROADCAST_ACTION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Arrival");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_ADD_DEVICE_BROADCAST_STRING`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("STI\\");
public const val `STI_CHANGENOEFFECT`: Int = 1;
public const val `STI_DEVICE_CREATE_BOTH`: UInt = 3u;
public const val `STI_DEVICE_CREATE_DATA`: UInt = 2u;
public const val `STI_DEVICE_CREATE_FOR_MONITOR`: UInt = 16777216u;
public const val `STI_DEVICE_CREATE_MASK`: UInt = 65535u;
public const val `STI_DEVICE_CREATE_STATUS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STI_DEVICE_INFORMATIONW` (
    public var `dwSize`: UInt,
    public var `DeviceType`: UInt,
    public var `szDeviceInternalName`: UShortArray,
    public var `DeviceCapabilitiesA`: `STI_DEV_CAPS`,
    public var `dwHardwareConfiguration`: UInt,
    public var `pszVendorDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDeviceDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPortName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPropProvider`: `windows_sys`.`core`.`PWSTR`,
    public var `pszLocalName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STI_DEVICE_INFORMATIONW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STI_DEVICE_INFORMATIONW`.Companion.`default`() : `STI_DEVICE_INFORMATIONW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `STI_DEVICE_MJ_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STI_DEVICE_STATUS` (
    public var `dwSize`: UInt,
    public var `StatusMask`: UInt,
    public var `dwOnlineState`: UInt,
    public var `dwHardwareStatusCode`: UInt,
    public var `dwEventHandlingState`: UInt,
    public var `dwPollingInterval`: UInt,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DefaultLaunchApp");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("DefaultLaunchApp");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DisableNotifications");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("DisableNotifications");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_ICM_PROFILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ICMProfile");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_ICM_PROFILE_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ICMProfile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_ISIS_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ISISDriverName");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_ISIS_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ISISDriverName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_TIMEOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PollTimeout");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_TIMEOUT_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("PollTimeout");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_TWAIN_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TwainDS");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_DEVICE_VALUE_TWAIN_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("TwainDS");
public const val `STI_DEVSTATUS_EVENTS_STATE`: UInt = 2u;
public const val `STI_DEVSTATUS_ONLINE_STATE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STI_DEV_CAPS` (
    public var `dwGeneric`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STI_DIAG` (
    public var `dwSize`: UInt,
    public var `dwBasicDiagCode`: UInt,
    public var `dwVendorDiagCode`: UInt,
    public var `dwStatusMask`: UInt,
    public var `sErrorInfo`: `_ERROR_INFOW`,
)
public const val `STI_DIAGCODE_HWPRESENCE`: UInt = 1u;
public const val `STI_ERROR_NO_ERROR`: Int = 0;
public const val `STI_EVENTHANDLING_ENABLED`: UInt = 1u;
public const val `STI_EVENTHANDLING_PENDING`: UInt = 4u;
public const val `STI_EVENTHANDLING_POLLING`: UInt = 2u;
public const val `STI_GENCAP_AUTO_PORTSELECT`: UInt = 8u;
public const val `STI_GENCAP_COMMON_MASK`: UInt = 255u;
public const val `STI_GENCAP_GENERATE_ARRIVALEVENT`: UInt = 4u;
public const val `STI_GENCAP_NOTIFICATIONS`: UInt = 1u;
public const val `STI_GENCAP_POLLING_NEEDED`: UInt = 2u;
public const val `STI_GENCAP_SUBSET`: UInt = 32u;
public const val `STI_GENCAP_WIA`: UInt = 16u;
public const val `STI_HW_CONFIG_PARALLEL`: UInt = 16u;
public const val `STI_HW_CONFIG_SCSI`: UInt = 2u;
public const val `STI_HW_CONFIG_SERIAL`: UInt = 8u;
public const val `STI_HW_CONFIG_UNKNOWN`: UInt = 1u;
public const val `STI_HW_CONFIG_USB`: UInt = 4u;
public const val `STI_MAX_INTERNAL_NAME_LENGTH`: UInt = 128u;
public const val `STI_NOTCONNECTED`: Int = 1;
public const val `STI_OK`: Int = 0;
public const val `STI_ONLINESTATE_BUSY`: UInt = 256u;
public const val `STI_ONLINESTATE_ERROR`: UInt = 4u;
public const val `STI_ONLINESTATE_INITIALIZING`: UInt = 1024u;
public const val `STI_ONLINESTATE_IO_ACTIVE`: UInt = 128u;
public const val `STI_ONLINESTATE_OFFLINE`: UInt = 64u;
public const val `STI_ONLINESTATE_OPERATIONAL`: UInt = 1u;
public const val `STI_ONLINESTATE_PAPER_JAM`: UInt = 16u;
public const val `STI_ONLINESTATE_PAPER_PROBLEM`: UInt = 32u;
public const val `STI_ONLINESTATE_PAUSED`: UInt = 8u;
public const val `STI_ONLINESTATE_PENDING`: UInt = 2u;
public const val `STI_ONLINESTATE_POWER_SAVE`: UInt = 8192u;
public const val `STI_ONLINESTATE_TRANSFERRING`: UInt = 512u;
public const val `STI_ONLINESTATE_USER_INTERVENTION`: UInt = 4096u;
public const val `STI_ONLINESTATE_WARMING_UP`: UInt = 2048u;
public const val `STI_RAW_RESERVED`: UInt = 4096u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_REMOVE_DEVICE_BROADCAST_ACTION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Removal");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STI_REMOVE_DEVICE_BROADCAST_STRING`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("STI\\");
public const val `STI_SUBSCRIBE_FLAG_EVENT`: UInt = 2u;
public const val `STI_SUBSCRIBE_FLAG_WINDOW`: UInt = 1u;
public const val `STI_TRACE_ERROR`: UInt = 4u;
public const val `STI_TRACE_INFORMATION`: UInt = 1u;
public const val `STI_TRACE_WARNING`: UInt = 2u;
public const val `STI_UNICODE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STI_USD_CAPS` (
    public var `dwVersion`: UInt,
    public var `dwGenericCaps`: UInt,
)
public const val `STI_USD_GENCAP_NATIVE_PUSHSUPPORT`: UInt = 1u;
public const val `STI_VERSION`: UInt = 2u;
public const val `STI_VERSION_FLAG_MASK`: UInt = 4278190080u;
public const val `STI_VERSION_FLAG_UNICODE`: UInt = 16777216u;
public const val `STI_VERSION_MIN_ALLOWED`: UInt = 2u;
public const val `STI_VERSION_REAL`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STI_WIA_DEVICE_INFORMATIONW` (
    public var `dwSize`: UInt,
    public var `DeviceType`: UInt,
    public var `szDeviceInternalName`: UShortArray,
    public var `DeviceCapabilitiesA`: `STI_DEV_CAPS`,
    public var `dwHardwareConfiguration`: UInt,
    public var `pszVendorDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDeviceDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPortName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPropProvider`: `windows_sys`.`core`.`PWSTR`,
    public var `pszLocalName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszUiDll`: `windows_sys`.`core`.`PWSTR`,
    public var `pszServer`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STI_WIA_DEVICE_INFORMATIONW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STI_WIA_DEVICE_INFORMATIONW`.Companion.`default`() : `STI_WIA_DEVICE_INFORMATIONW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SUPPORTS_MSCPLUS_STR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SupportsMSCPlus");
public const val `SUPPORTS_MSCPLUS_VAL`: UInt = 1u;
public typealias `SendToMode` = Int;
public const val `StiDeviceTypeDefault`: `STI_DEVICE_MJ_TYPE` = 0;
public const val `StiDeviceTypeDigitalCamera`: `STI_DEVICE_MJ_TYPE` = 2;
public const val `StiDeviceTypeScanner`: `STI_DEVICE_MJ_TYPE` = 1;
public const val `StiDeviceTypeStreamingVideo`: `STI_DEVICE_MJ_TYPE` = 3;
public const val `WIA_INCOMPAT_XP`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_ERROR_INFOW` (
    public var `dwSize`: UInt,
    public var `dwGenericError`: UInt,
    public var `dwVendorError`: UInt,
    public var `szExtendedErrorText`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `_ERROR_INFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `_ERROR_INFOW`.Companion.`default`() : `_ERROR_INFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `faetFXSSVC_ENDED`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 16;
public const val `faetIN_ARCHIVE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 4;
public const val `faetIN_QUEUE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 1;
public const val `faetNONE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 0;
public const val `faetOUT_ARCHIVE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 8;
public const val `faetOUT_QUEUE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 2;
public const val `far2MANAGE_ARCHIVES`: `FAX_ACCESS_RIGHTS_ENUM_2` = 256;
public const val `far2MANAGE_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM_2` = 64;
public const val `far2MANAGE_OUT_JOBS`: `FAX_ACCESS_RIGHTS_ENUM_2` = 16;
public const val `far2MANAGE_RECEIVE_FOLDER`: `FAX_ACCESS_RIGHTS_ENUM_2` = 512;
public const val `far2QUERY_ARCHIVES`: `FAX_ACCESS_RIGHTS_ENUM_2` = 128;
public const val `far2QUERY_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM_2` = 32;
public const val `far2QUERY_OUT_JOBS`: `FAX_ACCESS_RIGHTS_ENUM_2` = 8;
public const val `far2SUBMIT_HIGH`: `FAX_ACCESS_RIGHTS_ENUM_2` = 4;
public const val `far2SUBMIT_LOW`: `FAX_ACCESS_RIGHTS_ENUM_2` = 1;
public const val `far2SUBMIT_NORMAL`: `FAX_ACCESS_RIGHTS_ENUM_2` = 2;
public const val `farMANAGE_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM` = 64;
public const val `farMANAGE_IN_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 256;
public const val `farMANAGE_JOBS`: `FAX_ACCESS_RIGHTS_ENUM` = 16;
public const val `farMANAGE_OUT_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 1024;
public const val `farQUERY_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM` = 32;
public const val `farQUERY_IN_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 128;
public const val `farQUERY_JOBS`: `FAX_ACCESS_RIGHTS_ENUM` = 8;
public const val `farQUERY_OUT_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 512;
public const val `farSUBMIT_HIGH`: `FAX_ACCESS_RIGHTS_ENUM` = 4;
public const val `farSUBMIT_LOW`: `FAX_ACCESS_RIGHTS_ENUM` = 1;
public const val `farSUBMIT_NORMAL`: `FAX_ACCESS_RIGHTS_ENUM` = 2;
public const val `fcptLOCAL`: `FAX_COVERPAGE_TYPE_ENUM` = 1;
public const val `fcptNONE`: `FAX_COVERPAGE_TYPE_ENUM` = 0;
public const val `fcptSERVER`: `FAX_COVERPAGE_TYPE_ENUM` = 2;
public const val `fdrmAUTO_ANSWER`: `FAX_DEVICE_RECEIVE_MODE_ENUM` = 1;
public const val `fdrmMANUAL_ANSWER`: `FAX_DEVICE_RECEIVE_MODE_ENUM` = 2;
public const val `fdrmNO_ANSWER`: `FAX_DEVICE_RECEIVE_MODE_ENUM` = 0;
public const val `fgsALL_DEV_NOT_VALID`: `FAX_GROUP_STATUS_ENUM` = 2;
public const val `fgsALL_DEV_VALID`: `FAX_GROUP_STATUS_ENUM` = 0;
public const val `fgsEMPTY`: `FAX_GROUP_STATUS_ENUM` = 1;
public const val `fgsSOME_DEV_NOT_VALID`: `FAX_GROUP_STATUS_ENUM` = 3;
public const val `fjesANSWERED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 5;
public const val `fjesBAD_ADDRESS`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 10;
public const val `fjesBUSY`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 8;
public const val `fjesCALL_ABORTED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 19;
public const val `fjesCALL_BLACKLISTED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 14;
public const val `fjesCALL_COMPLETED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 18;
public const val `fjesCALL_DELAYED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 13;
public const val `fjesDIALING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 3;
public const val `fjesDISCONNECTED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 1;
public const val `fjesFATAL_ERROR`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 12;
public const val `fjesHANDLED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 17;
public const val `fjesINITIALIZING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 2;
public const val `fjesLINE_UNAVAILABLE`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 7;
public const val `fjesNONE`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 0;
public const val `fjesNOT_FAX_CALL`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 15;
public const val `fjesNO_ANSWER`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 9;
public const val `fjesNO_DIAL_TONE`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 11;
public const val `fjesPARTIALLY_RECEIVED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 16;
public const val `fjesPROPRIETARY`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 16777216;
public const val `fjesRECEIVING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 6;
public const val `fjesTRANSMITTING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 4;
public const val `fjoDELETE`: `FAX_JOB_OPERATIONS_ENUM` = 16;
public const val `fjoPAUSE`: `FAX_JOB_OPERATIONS_ENUM` = 2;
public const val `fjoRECIPIENT_INFO`: `FAX_JOB_OPERATIONS_ENUM` = 32;
public const val `fjoRESTART`: `FAX_JOB_OPERATIONS_ENUM` = 8;
public const val `fjoRESUME`: `FAX_JOB_OPERATIONS_ENUM` = 4;
public const val `fjoSENDER_INFO`: `FAX_JOB_OPERATIONS_ENUM` = 64;
public const val `fjoVIEW`: `FAX_JOB_OPERATIONS_ENUM` = 1;
public const val `fjsCANCELED`: `FAX_JOB_STATUS_ENUM` = 512;
public const val `fjsCANCELING`: `FAX_JOB_STATUS_ENUM` = 1024;
public const val `fjsCOMPLETED`: `FAX_JOB_STATUS_ENUM` = 256;
public const val `fjsFAILED`: `FAX_JOB_STATUS_ENUM` = 8;
public const val `fjsINPROGRESS`: `FAX_JOB_STATUS_ENUM` = 2;
public const val `fjsNOLINE`: `FAX_JOB_STATUS_ENUM` = 32;
public const val `fjsPAUSED`: `FAX_JOB_STATUS_ENUM` = 16;
public const val `fjsPENDING`: `FAX_JOB_STATUS_ENUM` = 1;
public const val `fjsRETRIES_EXCEEDED`: `FAX_JOB_STATUS_ENUM` = 128;
public const val `fjsRETRYING`: `FAX_JOB_STATUS_ENUM` = 64;
public const val `fjsROUTING`: `FAX_JOB_STATUS_ENUM` = 2048;
public const val `fjtRECEIVE`: `FAX_JOB_TYPE_ENUM` = 1;
public const val `fjtROUTING`: `FAX_JOB_TYPE_ENUM` = 2;
public const val `fjtSEND`: `FAX_JOB_TYPE_ENUM` = 0;
public const val `fllMAX`: `FAX_LOG_LEVEL_ENUM` = 3;
public const val `fllMED`: `FAX_LOG_LEVEL_ENUM` = 2;
public const val `fllMIN`: `FAX_LOG_LEVEL_ENUM` = 1;
public const val `fllNONE`: `FAX_LOG_LEVEL_ENUM` = 0;
public const val `fpsBAD_GUID`: `FAX_PROVIDER_STATUS_ENUM` = 2;
public const val `fpsBAD_VERSION`: `FAX_PROVIDER_STATUS_ENUM` = 3;
public const val `fpsCANT_INIT`: `FAX_PROVIDER_STATUS_ENUM` = 6;
public const val `fpsCANT_LINK`: `FAX_PROVIDER_STATUS_ENUM` = 5;
public const val `fpsCANT_LOAD`: `FAX_PROVIDER_STATUS_ENUM` = 4;
public const val `fpsSERVER_ERROR`: `FAX_PROVIDER_STATUS_ENUM` = 1;
public const val `fpsSUCCESS`: `FAX_PROVIDER_STATUS_ENUM` = 0;
public const val `fptHIGH`: `FAX_PRIORITY_TYPE_ENUM` = 2;
public const val `fptLOW`: `FAX_PRIORITY_TYPE_ENUM` = 0;
public const val `fptNORMAL`: `FAX_PRIORITY_TYPE_ENUM` = 1;
public const val `frrcANY_CODE`: `FAX_ROUTING_RULE_CODE_ENUM` = 0;
public const val `frsALL_GROUP_DEV_NOT_VALID`: `FAX_RULE_STATUS_ENUM` = 2;
public const val `frsBAD_DEVICE`: `FAX_RULE_STATUS_ENUM` = 4;
public const val `frsEMPTY_GROUP`: `FAX_RULE_STATUS_ENUM` = 1;
public const val `frsSOME_GROUP_DEV_NOT_VALID`: `FAX_RULE_STATUS_ENUM` = 3;
public const val `frsVALID`: `FAX_RULE_STATUS_ENUM` = 0;
public const val `frtMAIL`: `FAX_RECEIPT_TYPE_ENUM` = 1;
public const val `frtMSGBOX`: `FAX_RECEIPT_TYPE_ENUM` = 4;
public const val `frtNONE`: `FAX_RECEIPT_TYPE_ENUM` = 0;
public const val `fsAPI_VERSION_0`: `FAX_SERVER_APIVERSION_ENUM` = 0;
public const val `fsAPI_VERSION_1`: `FAX_SERVER_APIVERSION_ENUM` = 65536;
public const val `fsAPI_VERSION_2`: `FAX_SERVER_APIVERSION_ENUM` = 131072;
public const val `fsAPI_VERSION_3`: `FAX_SERVER_APIVERSION_ENUM` = 196608;
public const val `fsatANONYMOUS`: `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = 0;
public const val `fsatBASIC`: `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = 1;
public const val `fsatNTLM`: `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = 2;
public const val `fsetACTIVITY`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 8;
public const val `fsetCONFIG`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 4;
public const val `fsetDEVICE_STATUS`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 256;
public const val `fsetFXSSVC_ENDED`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 128;
public const val `fsetINCOMING_CALL`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 512;
public const val `fsetIN_ARCHIVE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 32;
public const val `fsetIN_QUEUE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 1;
public const val `fsetNONE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 0;
public const val `fsetOUT_ARCHIVE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 64;
public const val `fsetOUT_QUEUE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 2;
public const val `fsetQUEUE_STATE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 16;
public const val `fstDISCOUNT_PERIOD`: `FAX_SCHEDULE_TYPE_ENUM` = 2;
public const val `fstNOW`: `FAX_SCHEDULE_TYPE_ENUM` = 0;
public const val `fstSPECIFIC_TIME`: `FAX_SCHEDULE_TYPE_ENUM` = 1;
public const val `lDEFAULT_PREFETCH_SIZE`: Int = 100;
public const val `prv_DEFAULT_PREFETCH_SIZE`: UInt = 100u;
public const val `wcharREASSIGN_RECIPIENTS_DELIMITER`: UShort = 59u;
