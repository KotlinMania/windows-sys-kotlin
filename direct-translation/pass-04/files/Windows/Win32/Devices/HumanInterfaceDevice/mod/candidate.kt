// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dinput8.dll, ABI=system, export=DirectInput8Create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DirectInput8Create`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `dwversion` : UInt, `riidltf` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_FlushQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_FlushQueue`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_FreePreparsedData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_FreePreparsedData`(`preparseddata` : `PHIDP_PREPARSED_DATA`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetAttributes`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `attributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDD_ATTRIBUTES`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetConfiguration`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `configuration` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDD_CONFIGURATION`>?, `configurationlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetFeature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetFeature`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `reportbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reportbufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetHidGuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetHidGuid`(`hidguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetIndexedString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetIndexedString`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `stringindex` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetInputReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetInputReport`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `reportbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reportbufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetManufacturerString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetManufacturerString`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetMsGenreDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetMsGenreDescriptor`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetNumInputBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetNumInputBuffers`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `numberbuffers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetPhysicalDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetPhysicalDescriptor`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetPreparsedData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetPreparsedData`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `preparseddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PHIDP_PREPARSED_DATA`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetProductString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetProductString`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_GetSerialNumberString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_GetSerialNumberString`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_SetConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_SetConfiguration`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `configuration` : /* Rust *const */ kotlinx.cinterop.CPointer<`HIDD_CONFIGURATION`>?, `configurationlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_SetFeature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_SetFeature`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `reportbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reportbufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_SetNumInputBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_SetNumInputBuffers`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `numberbuffers` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidD_SetOutputReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidD_SetOutputReport`(`hiddeviceobject` : `super`.`super`.`Foundation`.`HANDLE`, `reportbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reportbufferlength` : UInt) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetButtonArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetButtonArray`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `buttondata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_BUTTON_ARRAY_DATA`>?, `buttondatalength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetButtonCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetButtonCaps`(`reporttype` : `HIDP_REPORT_TYPE`, `buttoncaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_BUTTON_CAPS`>?, `buttoncapslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetCaps`(`preparseddata` : `PHIDP_PREPARSED_DATA`, `capabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_CAPS`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetData`(`reporttype` : `HIDP_REPORT_TYPE`, `datalist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_DATA`>?, `datalength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetExtendedAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetExtendedAttributes`(`reporttype` : `HIDP_REPORT_TYPE`, `dataindex` : UShort, `preparseddata` : `PHIDP_PREPARSED_DATA`, `attributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_EXTENDED_ATTRIBUTES`>?, `lengthattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetLinkCollectionNodes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetLinkCollectionNodes`(`linkcollectionnodes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_LINK_COLLECTION_NODE`>?, `linkcollectionnodeslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetScaledUsageValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetScaledUsageValue`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `usagevalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetSpecificButtonCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetSpecificButtonCaps`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `buttoncaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_BUTTON_CAPS`>?, `buttoncapslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetSpecificValueCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetSpecificValueCaps`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `valuecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_VALUE_CAPS`>?, `valuecapslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetUsageValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetUsageValue`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `usagevalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetUsageValueArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetUsageValueArray`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `usagevalue` : `windows_sys`.`core`.`PSTR`, `usagevaluebytelength` : UShort, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetUsages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetUsages`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usagelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `usagelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetUsagesEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetUsagesEx`(`reporttype` : `HIDP_REPORT_TYPE`, `linkcollection` : UShort, `buttonlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`USAGE_AND_PAGE`>?, `usagelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_GetValueCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_GetValueCaps`(`reporttype` : `HIDP_REPORT_TYPE`, `valuecaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_VALUE_CAPS`>?, `valuecapslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_InitializeReportForID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_InitializeReportForID`(`reporttype` : `HIDP_REPORT_TYPE`, `reportid` : UByte, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_MaxDataListLength; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_MaxDataListLength`(`reporttype` : `HIDP_REPORT_TYPE`, `preparseddata` : `PHIDP_PREPARSED_DATA`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_MaxUsageListLength; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_MaxUsageListLength`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `preparseddata` : `PHIDP_PREPARSED_DATA`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_SetButtonArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_SetButtonArray`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `buttondata` : /* Rust *const */ kotlinx.cinterop.CPointer<`HIDP_BUTTON_ARRAY_DATA`>?, `buttondatalength` : UShort, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_SetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_SetData`(`reporttype` : `HIDP_REPORT_TYPE`, `datalist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_DATA`>?, `datalength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_SetScaledUsageValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_SetScaledUsageValue`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `usagevalue` : Int, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_SetUsageValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_SetUsageValue`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `usagevalue` : UInt, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_SetUsageValueArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_SetUsageValueArray`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usage` : UShort, `usagevalue` : `windows_sys`.`core`.`PCSTR`, `usagevaluebytelength` : UShort, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_SetUsages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_SetUsages`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usagelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `usagelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_TranslateUsagesToI8042ScanCodes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_TranslateUsagesToI8042ScanCodes`(`changedusagelist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `usagelistlength` : UInt, `keyaction` : `HIDP_KEYBOARD_DIRECTION`, `modifierstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_KEYBOARD_MODIFIER_STATE`>?, `insertcodesprocedure` : `PHIDP_INSERT_SCANCODES`, `insertcodescontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_UnsetUsages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_UnsetUsages`(`reporttype` : `HIDP_REPORT_TYPE`, `usagepage` : UShort, `linkcollection` : UShort, `usagelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `usagelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preparseddata` : `PHIDP_PREPARSED_DATA`, `report` : `windows_sys`.`core`.`PCSTR`, `reportlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hid.dll, ABI=system, export=HidP_UsageListDifference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HidP_UsageListDifference`(`previoususagelist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `currentusagelist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `breakusagelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `makeusagelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `usagelistlength` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winmm.dll, ABI=system, export=joyConfigChanged; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `joyConfigChanged`(`dwflags` : UInt) : UInt
public const val `BALLPOINT_I8042_HARDWARE`: UInt = 8u;
public const val `BALLPOINT_SERIAL_HARDWARE`: UInt = 16u;
public const val `BUTTON_BIT_ALLBUTTONSMASK`: UInt = 16383u;
public const val `BUTTON_BIT_BACK`: UInt = 32u;
public const val `BUTTON_BIT_CAMERAFOCUS`: UInt = 128u;
public const val `BUTTON_BIT_CAMERALENS`: UInt = 4096u;
public const val `BUTTON_BIT_CAMERASHUTTER`: UInt = 256u;
public const val `BUTTON_BIT_HEADSET`: UInt = 1024u;
public const val `BUTTON_BIT_HWKBDEPLOY`: UInt = 2048u;
public const val `BUTTON_BIT_OEMCUSTOM`: UInt = 8192u;
public const val `BUTTON_BIT_OEMCUSTOM2`: UInt = 16384u;
public const val `BUTTON_BIT_OEMCUSTOM3`: UInt = 32768u;
public const val `BUTTON_BIT_POWER`: UInt = 1u;
public const val `BUTTON_BIT_RINGERTOGGLE`: UInt = 512u;
public const val `BUTTON_BIT_ROTATION_LOCK`: UInt = 16u;
public const val `BUTTON_BIT_SEARCH`: UInt = 64u;
public const val `BUTTON_BIT_VOLUMEDOWN`: UInt = 8u;
public const val `BUTTON_BIT_VOLUMEUP`: UInt = 4u;
public const val `BUTTON_BIT_WINDOWS`: UInt = 2u;
// UNSUPPORTED Rust 67:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DirectInput: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25e609e0_b259_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 68:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DirectInput8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25e609e4_b259_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DirectInputDevice: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25e609e1_b259_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 70:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DirectInputDevice8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25e609e5_b259_11cf_bfc7_444553540000);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CPOINT` (
    public var `lP`: Int,
    public var `dwLog`: UInt,
)
// UNSUPPORTED Rust 77:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_KEYBOARD_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("\\Device\\KeyboardClass");

// UNSUPPORTED Rust 78:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_KEYBOARD_DEVICE_NAME_U: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\KeyboardClass");

// UNSUPPORTED Rust 79:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_MOUSE_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("\\Device\\PointerClass");

// UNSUPPORTED Rust 80:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_MOUSE_DEVICE_NAME_U: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\PointerClass");

// UNSUPPORTED Rust 81:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_BackgroundAccess: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 8 };

// UNSUPPORTED Rust 82:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_IsReadOnly: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 4 };

// UNSUPPORTED Rust 83:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_ProductId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 6 };

// UNSUPPORTED Rust 84:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_UsageId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 3 };

// UNSUPPORTED Rust 85:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_UsagePage: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 2 };

// UNSUPPORTED Rust 86:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_VendorId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 5 };

// UNSUPPORTED Rust 87:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_VersionNumber: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 7 };

// UNSUPPORTED Rust 88:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_HID_WakeScreenOnInputCapable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xcbf38310_4a17_4310_a1eb_247f0b67593b), pid: 9 };

public const val `DI8DEVCLASS_ALL`: UInt = 0u;
public const val `DI8DEVCLASS_DEVICE`: UInt = 1u;
public const val `DI8DEVCLASS_GAMECTRL`: UInt = 4u;
public const val `DI8DEVCLASS_KEYBOARD`: UInt = 3u;
public const val `DI8DEVCLASS_POINTER`: UInt = 2u;
public const val `DI8DEVTYPE1STPERSON_LIMITED`: UInt = 1u;
public const val `DI8DEVTYPE1STPERSON_SHOOTER`: UInt = 4u;
public const val `DI8DEVTYPE1STPERSON_SIXDOF`: UInt = 3u;
public const val `DI8DEVTYPE1STPERSON_UNKNOWN`: UInt = 2u;
public const val `DI8DEVTYPEDEVICECTRL_COMMSSELECTION`: UInt = 3u;
public const val `DI8DEVTYPEDEVICECTRL_COMMSSELECTION_HARDWIRED`: UInt = 4u;
public const val `DI8DEVTYPEDEVICECTRL_UNKNOWN`: UInt = 2u;
public const val `DI8DEVTYPEDRIVING_COMBINEDPEDALS`: UInt = 2u;
public const val `DI8DEVTYPEDRIVING_DUALPEDALS`: UInt = 3u;
public const val `DI8DEVTYPEDRIVING_HANDHELD`: UInt = 5u;
public const val `DI8DEVTYPEDRIVING_LIMITED`: UInt = 1u;
public const val `DI8DEVTYPEDRIVING_THREEPEDALS`: UInt = 4u;
public const val `DI8DEVTYPEFLIGHT_LIMITED`: UInt = 1u;
public const val `DI8DEVTYPEFLIGHT_RC`: UInt = 4u;
public const val `DI8DEVTYPEFLIGHT_STICK`: UInt = 2u;
public const val `DI8DEVTYPEFLIGHT_YOKE`: UInt = 3u;
public const val `DI8DEVTYPEGAMEPAD_LIMITED`: UInt = 1u;
public const val `DI8DEVTYPEGAMEPAD_STANDARD`: UInt = 2u;
public const val `DI8DEVTYPEGAMEPAD_TILT`: UInt = 3u;
public const val `DI8DEVTYPEJOYSTICK_LIMITED`: UInt = 1u;
public const val `DI8DEVTYPEJOYSTICK_STANDARD`: UInt = 2u;
public const val `DI8DEVTYPEKEYBOARD_J3100`: UInt = 12u;
public const val `DI8DEVTYPEKEYBOARD_JAPAN106`: UInt = 10u;
public const val `DI8DEVTYPEKEYBOARD_JAPANAX`: UInt = 11u;
public const val `DI8DEVTYPEKEYBOARD_NEC98`: UInt = 7u;
public const val `DI8DEVTYPEKEYBOARD_NEC98106`: UInt = 9u;
public const val `DI8DEVTYPEKEYBOARD_NEC98LAPTOP`: UInt = 8u;
public const val `DI8DEVTYPEKEYBOARD_NOKIA1050`: UInt = 5u;
public const val `DI8DEVTYPEKEYBOARD_NOKIA9140`: UInt = 6u;
public const val `DI8DEVTYPEKEYBOARD_OLIVETTI`: UInt = 2u;
public const val `DI8DEVTYPEKEYBOARD_PCAT`: UInt = 3u;
public const val `DI8DEVTYPEKEYBOARD_PCENH`: UInt = 4u;
public const val `DI8DEVTYPEKEYBOARD_PCXT`: UInt = 1u;
public const val `DI8DEVTYPEKEYBOARD_UNKNOWN`: UInt = 0u;
public const val `DI8DEVTYPEMOUSE_ABSOLUTE`: UInt = 6u;
public const val `DI8DEVTYPEMOUSE_FINGERSTICK`: UInt = 3u;
public const val `DI8DEVTYPEMOUSE_TOUCHPAD`: UInt = 4u;
public const val `DI8DEVTYPEMOUSE_TRACKBALL`: UInt = 5u;
public const val `DI8DEVTYPEMOUSE_TRADITIONAL`: UInt = 2u;
public const val `DI8DEVTYPEMOUSE_UNKNOWN`: UInt = 1u;
public const val `DI8DEVTYPEREMOTE_UNKNOWN`: UInt = 2u;
public const val `DI8DEVTYPESCREENPTR_LIGHTGUN`: UInt = 3u;
public const val `DI8DEVTYPESCREENPTR_LIGHTPEN`: UInt = 4u;
public const val `DI8DEVTYPESCREENPTR_TOUCH`: UInt = 5u;
public const val `DI8DEVTYPESCREENPTR_UNKNOWN`: UInt = 2u;
public const val `DI8DEVTYPESUPPLEMENTAL_2NDHANDCONTROLLER`: UInt = 3u;
public const val `DI8DEVTYPESUPPLEMENTAL_COMBINEDPEDALS`: UInt = 10u;
public const val `DI8DEVTYPESUPPLEMENTAL_DUALPEDALS`: UInt = 11u;
public const val `DI8DEVTYPESUPPLEMENTAL_HANDTRACKER`: UInt = 5u;
public const val `DI8DEVTYPESUPPLEMENTAL_HEADTRACKER`: UInt = 4u;
public const val `DI8DEVTYPESUPPLEMENTAL_RUDDERPEDALS`: UInt = 13u;
public const val `DI8DEVTYPESUPPLEMENTAL_SHIFTER`: UInt = 7u;
public const val `DI8DEVTYPESUPPLEMENTAL_SHIFTSTICKGATE`: UInt = 6u;
public const val `DI8DEVTYPESUPPLEMENTAL_SPLITTHROTTLE`: UInt = 9u;
public const val `DI8DEVTYPESUPPLEMENTAL_THREEPEDALS`: UInt = 12u;
public const val `DI8DEVTYPESUPPLEMENTAL_THROTTLE`: UInt = 8u;
public const val `DI8DEVTYPESUPPLEMENTAL_UNKNOWN`: UInt = 2u;
public const val `DI8DEVTYPE_1STPERSON`: UInt = 24u;
public const val `DI8DEVTYPE_DEVICE`: UInt = 17u;
public const val `DI8DEVTYPE_DEVICECTRL`: UInt = 25u;
public const val `DI8DEVTYPE_DRIVING`: UInt = 22u;
public const val `DI8DEVTYPE_FLIGHT`: UInt = 23u;
public const val `DI8DEVTYPE_GAMEPAD`: UInt = 21u;
public const val `DI8DEVTYPE_JOYSTICK`: UInt = 20u;
public const val `DI8DEVTYPE_KEYBOARD`: UInt = 19u;
public const val `DI8DEVTYPE_LIMITEDGAMESUBTYPE`: UInt = 1u;
public const val `DI8DEVTYPE_MOUSE`: UInt = 18u;
public const val `DI8DEVTYPE_REMOTE`: UInt = 27u;
public const val `DI8DEVTYPE_SCREENPOINTER`: UInt = 26u;
public const val `DI8DEVTYPE_SUPPLEMENTAL`: UInt = 28u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIACTIONA` (
    public var `uAppData`: ULong,
    public var `dwSemantic`: UInt,
    public var `dwFlags`: UInt,
    public var `Anonymous`: `DIACTIONA_0`,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `dwObjID`: UInt,
    public var `dwHow`: UInt,
)
// UNSUPPORTED Rust 175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIACTIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 180:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DIACTIONA_0 {
//     pub lptszActionName: windows_sys::core::PCSTR,
//     pub uResIdString: u32,
// }

// UNSUPPORTED Rust 186:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIACTIONA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIACTIONFORMATA` (
    public var `dwSize`: UInt,
    public var `dwActionSize`: UInt,
    public var `dwDataSize`: UInt,
    public var `dwNumActions`: UInt,
    public var `rgoAction`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIACTIONA`>?,
    public var `guidActionMap`: `windows_sys`.`core`.`GUID`,
    public var `dwGenre`: UInt,
    public var `dwBufferSize`: UInt,
    public var `lAxisMin`: Int,
    public var `lAxisMax`: Int,
    public var `hInstString`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `ftTimeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwCRC`: UInt,
    public var `tszActionMap`: ByteArray,
)
// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIACTIONFORMATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIACTIONFORMATW` (
    public var `dwSize`: UInt,
    public var `dwActionSize`: UInt,
    public var `dwDataSize`: UInt,
    public var `dwNumActions`: UInt,
    public var `rgoAction`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIACTIONW`>?,
    public var `guidActionMap`: `windows_sys`.`core`.`GUID`,
    public var `dwGenre`: UInt,
    public var `dwBufferSize`: UInt,
    public var `lAxisMin`: Int,
    public var `lAxisMax`: Int,
    public var `hInstString`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `ftTimeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwCRC`: UInt,
    public var `tszActionMap`: UShortArray,
)
// UNSUPPORTED Rust 232:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIACTIONFORMATW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIACTIONW` (
    public var `uAppData`: ULong,
    public var `dwSemantic`: UInt,
    public var `dwFlags`: UInt,
    public var `Anonymous`: `DIACTIONW_0`,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `dwObjID`: UInt,
    public var `dwHow`: UInt,
)
// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIACTIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 253:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DIACTIONW_0 {
//     pub lptszActionName: windows_sys::core::PCWSTR,
//     pub uResIdString: u32,
// }

// UNSUPPORTED Rust 259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIACTIONW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIAFTS_NEWDEVICEHIGH`: UInt = 4294967295u;
public const val `DIAFTS_NEWDEVICELOW`: UInt = 4294967295u;
public const val `DIAFTS_UNUSEDDEVICEHIGH`: UInt = 0u;
public const val `DIAFTS_UNUSEDDEVICELOW`: UInt = 0u;
public const val `DIAH_APPREQUESTED`: UInt = 2u;
public const val `DIAH_DEFAULT`: UInt = 32u;
public const val `DIAH_ERROR`: UInt = 2147483648u;
public const val `DIAH_HWAPP`: UInt = 4u;
public const val `DIAH_HWDEFAULT`: UInt = 8u;
public const val `DIAH_UNMAPPED`: UInt = 0u;
public const val `DIAH_USERCONFIG`: UInt = 1u;
public const val `DIAPPIDFLAG_NOSIZE`: UInt = 2u;
public const val `DIAPPIDFLAG_NOTIME`: UInt = 1u;
public const val `DIAXIS_2DCONTROL_INOUT`: UInt = 587301379u;
public const val `DIAXIS_2DCONTROL_LATERAL`: UInt = 587235841u;
public const val `DIAXIS_2DCONTROL_MOVE`: UInt = 587268610u;
public const val `DIAXIS_2DCONTROL_ROTATEZ`: UInt = 587350532u;
public const val `DIAXIS_3DCONTROL_INOUT`: UInt = 604078595u;
public const val `DIAXIS_3DCONTROL_LATERAL`: UInt = 604013057u;
public const val `DIAXIS_3DCONTROL_MOVE`: UInt = 604045826u;
public const val `DIAXIS_3DCONTROL_ROTATEX`: UInt = 604193284u;
public const val `DIAXIS_3DCONTROL_ROTATEY`: UInt = 604160517u;
public const val `DIAXIS_3DCONTROL_ROTATEZ`: UInt = 604127750u;
public const val `DIAXIS_ANY_1`: UInt = 4278206977u;
public const val `DIAXIS_ANY_2`: UInt = 4278206978u;
public const val `DIAXIS_ANY_3`: UInt = 4278206979u;
public const val `DIAXIS_ANY_4`: UInt = 4278206980u;
public const val `DIAXIS_ANY_A_1`: UInt = 4278436353u;
public const val `DIAXIS_ANY_A_2`: UInt = 4278436354u;
public const val `DIAXIS_ANY_B_1`: UInt = 4278469121u;
public const val `DIAXIS_ANY_B_2`: UInt = 4278469122u;
public const val `DIAXIS_ANY_C_1`: UInt = 4278501889u;
public const val `DIAXIS_ANY_C_2`: UInt = 4278501890u;
public const val `DIAXIS_ANY_R_1`: UInt = 4278338049u;
public const val `DIAXIS_ANY_R_2`: UInt = 4278338050u;
public const val `DIAXIS_ANY_S_1`: UInt = 4278534657u;
public const val `DIAXIS_ANY_S_2`: UInt = 4278534658u;
public const val `DIAXIS_ANY_U_1`: UInt = 4278370817u;
public const val `DIAXIS_ANY_U_2`: UInt = 4278370818u;
public const val `DIAXIS_ANY_V_1`: UInt = 4278403585u;
public const val `DIAXIS_ANY_V_2`: UInt = 4278403586u;
public const val `DIAXIS_ANY_X_1`: UInt = 4278239745u;
public const val `DIAXIS_ANY_X_2`: UInt = 4278239746u;
public const val `DIAXIS_ANY_Y_1`: UInt = 4278272513u;
public const val `DIAXIS_ANY_Y_2`: UInt = 4278272514u;
public const val `DIAXIS_ANY_Z_1`: UInt = 4278305281u;
public const val `DIAXIS_ANY_Z_2`: UInt = 4278305282u;
public const val `DIAXIS_ARCADEP_LATERAL`: UInt = 570458625u;
public const val `DIAXIS_ARCADEP_MOVE`: UInt = 570491394u;
public const val `DIAXIS_ARCADES_LATERAL`: UInt = 553681409u;
public const val `DIAXIS_ARCADES_MOVE`: UInt = 553714178u;
public const val `DIAXIS_BASEBALLB_LATERAL`: UInt = 251691521u;
public const val `DIAXIS_BASEBALLB_MOVE`: UInt = 251724290u;
public const val `DIAXIS_BASEBALLF_LATERAL`: UInt = 285245953u;
public const val `DIAXIS_BASEBALLF_MOVE`: UInt = 285278722u;
public const val `DIAXIS_BASEBALLP_LATERAL`: UInt = 268468737u;
public const val `DIAXIS_BASEBALLP_MOVE`: UInt = 268501506u;
public const val `DIAXIS_BBALLD_LATERAL`: UInt = 318800385u;
public const val `DIAXIS_BBALLD_MOVE`: UInt = 318833154u;
public const val `DIAXIS_BBALLO_LATERAL`: UInt = 302023169u;
public const val `DIAXIS_BBALLO_MOVE`: UInt = 302055938u;
public const val `DIAXIS_BIKINGM_BRAKE`: UInt = 470041091u;
public const val `DIAXIS_BIKINGM_PEDAL`: UInt = 469828098u;
public const val `DIAXIS_BIKINGM_TURN`: UInt = 469795329u;
public const val `DIAXIS_BROWSER_LATERAL`: UInt = 671121921u;
public const val `DIAXIS_BROWSER_MOVE`: UInt = 671154690u;
public const val `DIAXIS_BROWSER_VIEW`: UInt = 671187459u;
public const val `DIAXIS_CADF_INOUT`: UInt = 620855811u;
public const val `DIAXIS_CADF_LATERAL`: UInt = 620790273u;
public const val `DIAXIS_CADF_MOVE`: UInt = 620823042u;
public const val `DIAXIS_CADF_ROTATEX`: UInt = 620970500u;
public const val `DIAXIS_CADF_ROTATEY`: UInt = 620937733u;
public const val `DIAXIS_CADF_ROTATEZ`: UInt = 620904966u;
public const val `DIAXIS_CADM_INOUT`: UInt = 637633027u;
public const val `DIAXIS_CADM_LATERAL`: UInt = 637567489u;
public const val `DIAXIS_CADM_MOVE`: UInt = 637600258u;
public const val `DIAXIS_CADM_ROTATEX`: UInt = 637747716u;
public const val `DIAXIS_CADM_ROTATEY`: UInt = 637714949u;
public const val `DIAXIS_CADM_ROTATEZ`: UInt = 637682182u;
public const val `DIAXIS_DRIVINGC_ACCELERATE`: UInt = 33788418u;
public const val `DIAXIS_DRIVINGC_ACCEL_AND_BRAKE`: UInt = 33638916u;
public const val `DIAXIS_DRIVINGC_BRAKE`: UInt = 33821187u;
public const val `DIAXIS_DRIVINGC_STEER`: UInt = 33589761u;
public const val `DIAXIS_DRIVINGR_ACCELERATE`: UInt = 17011202u;
public const val `DIAXIS_DRIVINGR_ACCEL_AND_BRAKE`: UInt = 16861700u;
public const val `DIAXIS_DRIVINGR_BRAKE`: UInt = 17043971u;
public const val `DIAXIS_DRIVINGR_STEER`: UInt = 16812545u;
public const val `DIAXIS_DRIVINGT_ACCELERATE`: UInt = 50565635u;
public const val `DIAXIS_DRIVINGT_ACCEL_AND_BRAKE`: UInt = 50416134u;
public const val `DIAXIS_DRIVINGT_BARREL`: UInt = 50397698u;
public const val `DIAXIS_DRIVINGT_BRAKE`: UInt = 50614789u;
public const val `DIAXIS_DRIVINGT_ROTATE`: UInt = 50463236u;
public const val `DIAXIS_DRIVINGT_STEER`: UInt = 50366977u;
public const val `DIAXIS_FIGHTINGH_LATERAL`: UInt = 134251009u;
public const val `DIAXIS_FIGHTINGH_MOVE`: UInt = 134283778u;
public const val `DIAXIS_FIGHTINGH_ROTATE`: UInt = 134365699u;
public const val `DIAXIS_FISHING_LATERAL`: UInt = 234914305u;
public const val `DIAXIS_FISHING_MOVE`: UInt = 234947074u;
public const val `DIAXIS_FISHING_ROTATE`: UInt = 235028995u;
public const val `DIAXIS_FLYINGC_BANK`: UInt = 67144193u;
public const val `DIAXIS_FLYINGC_BRAKE`: UInt = 67398148u;
public const val `DIAXIS_FLYINGC_FLAPS`: UInt = 67459590u;
public const val `DIAXIS_FLYINGC_PITCH`: UInt = 67176962u;
public const val `DIAXIS_FLYINGC_RUDDER`: UInt = 67260933u;
public const val `DIAXIS_FLYINGC_THROTTLE`: UInt = 67342851u;
public const val `DIAXIS_FLYINGH_BANK`: UInt = 100698625u;
public const val `DIAXIS_FLYINGH_COLLECTIVE`: UInt = 100764163u;
public const val `DIAXIS_FLYINGH_PITCH`: UInt = 100731394u;
public const val `DIAXIS_FLYINGH_THROTTLE`: UInt = 100915717u;
public const val `DIAXIS_FLYINGH_TORQUE`: UInt = 100817412u;
public const val `DIAXIS_FLYINGM_BANK`: UInt = 83921409u;
public const val `DIAXIS_FLYINGM_BRAKE`: UInt = 84173317u;
public const val `DIAXIS_FLYINGM_FLAPS`: UInt = 84234758u;
public const val `DIAXIS_FLYINGM_PITCH`: UInt = 83954178u;
public const val `DIAXIS_FLYINGM_RUDDER`: UInt = 84036100u;
public const val `DIAXIS_FLYINGM_THROTTLE`: UInt = 84120067u;
public const val `DIAXIS_FOOTBALLD_LATERAL`: UInt = 385909249u;
public const val `DIAXIS_FOOTBALLD_MOVE`: UInt = 385942018u;
public const val `DIAXIS_FOOTBALLO_LATERAL`: UInt = 369132033u;
public const val `DIAXIS_FOOTBALLO_MOVE`: UInt = 369164802u;
public const val `DIAXIS_FOOTBALLQ_LATERAL`: UInt = 352354817u;
public const val `DIAXIS_FOOTBALLQ_MOVE`: UInt = 352387586u;
public const val `DIAXIS_FPS_LOOKUPDOWN`: UInt = 151093763u;
public const val `DIAXIS_FPS_MOVE`: UInt = 151060994u;
public const val `DIAXIS_FPS_ROTATE`: UInt = 151028225u;
public const val `DIAXIS_FPS_SIDESTEP`: UInt = 151142916u;
public const val `DIAXIS_GOLF_LATERAL`: UInt = 402686465u;
public const val `DIAXIS_GOLF_MOVE`: UInt = 402719234u;
public const val `DIAXIS_HOCKEYD_LATERAL`: UInt = 436240897u;
public const val `DIAXIS_HOCKEYD_MOVE`: UInt = 436273666u;
public const val `DIAXIS_HOCKEYG_LATERAL`: UInt = 453018113u;
public const val `DIAXIS_HOCKEYG_MOVE`: UInt = 453050882u;
public const val `DIAXIS_HOCKEYO_LATERAL`: UInt = 419463681u;
public const val `DIAXIS_HOCKEYO_MOVE`: UInt = 419496450u;
public const val `DIAXIS_HUNTING_LATERAL`: UInt = 218137089u;
public const val `DIAXIS_HUNTING_MOVE`: UInt = 218169858u;
public const val `DIAXIS_HUNTING_ROTATE`: UInt = 218251779u;
public const val `DIAXIS_MECHA_ROTATE`: UInt = 687997443u;
public const val `DIAXIS_MECHA_STEER`: UInt = 687899137u;
public const val `DIAXIS_MECHA_THROTTLE`: UInt = 688095748u;
public const val `DIAXIS_MECHA_TORSO`: UInt = 687931906u;
public const val `DIAXIS_RACQUET_LATERAL`: UInt = 536904193u;
public const val `DIAXIS_RACQUET_MOVE`: UInt = 536936962u;
public const val `DIAXIS_REMOTE_SLIDER`: UInt = 654639617u;
public const val `DIAXIS_REMOTE_SLIDER2`: UInt = 654656002u;
public const val `DIAXIS_SKIING_SPEED`: UInt = 486605314u;
public const val `DIAXIS_SKIING_TURN`: UInt = 486572545u;
public const val `DIAXIS_SOCCERD_LATERAL`: UInt = 520126977u;
public const val `DIAXIS_SOCCERD_MOVE`: UInt = 520159746u;
public const val `DIAXIS_SOCCERO_BEND`: UInt = 503415299u;
public const val `DIAXIS_SOCCERO_LATERAL`: UInt = 503349761u;
public const val `DIAXIS_SOCCERO_MOVE`: UInt = 503382530u;
public const val `DIAXIS_SPACESIM_CLIMB`: UInt = 117555716u;
public const val `DIAXIS_SPACESIM_LATERAL`: UInt = 117473793u;
public const val `DIAXIS_SPACESIM_MOVE`: UInt = 117506562u;
public const val `DIAXIS_SPACESIM_ROTATE`: UInt = 117588485u;
public const val `DIAXIS_SPACESIM_THROTTLE`: UInt = 117670403u;
public const val `DIAXIS_STRATEGYR_LATERAL`: UInt = 184582657u;
public const val `DIAXIS_STRATEGYR_MOVE`: UInt = 184615426u;
public const val `DIAXIS_STRATEGYR_ROTATE`: UInt = 184697347u;
public const val `DIAXIS_STRATEGYT_LATERAL`: UInt = 201359873u;
public const val `DIAXIS_STRATEGYT_MOVE`: UInt = 201392642u;
public const val `DIAXIS_TPS_MOVE`: UInt = 167838210u;
public const val `DIAXIS_TPS_STEP`: UInt = 167821827u;
public const val `DIAXIS_TPS_TURN`: UInt = 167903745u;
public const val `DIA_APPFIXED`: UInt = 16u;
public const val `DIA_APPMAPPED`: UInt = 2u;
public const val `DIA_APPNOMAP`: UInt = 4u;
public const val `DIA_FORCEFEEDBACK`: UInt = 1u;
public const val `DIA_NORANGE`: UInt = 8u;
public const val `DIBUTTON_2DCONTROL_DEVICE`: UInt = 587220222u;
public const val `DIBUTTON_2DCONTROL_DISPLAY`: UInt = 587219973u;
public const val `DIBUTTON_2DCONTROL_MENU`: UInt = 587203837u;
public const val `DIBUTTON_2DCONTROL_PAUSE`: UInt = 587220220u;
public const val `DIBUTTON_2DCONTROL_SELECT`: UInt = 587203585u;
public const val `DIBUTTON_2DCONTROL_SPECIAL`: UInt = 587203587u;
public const val `DIBUTTON_2DCONTROL_SPECIAL1`: UInt = 587203586u;
public const val `DIBUTTON_2DCONTROL_SPECIAL2`: UInt = 587203588u;
public const val `DIBUTTON_3DCONTROL_DEVICE`: UInt = 603997438u;
public const val `DIBUTTON_3DCONTROL_DISPLAY`: UInt = 603997189u;
public const val `DIBUTTON_3DCONTROL_MENU`: UInt = 603981053u;
public const val `DIBUTTON_3DCONTROL_PAUSE`: UInt = 603997436u;
public const val `DIBUTTON_3DCONTROL_SELECT`: UInt = 603980801u;
public const val `DIBUTTON_3DCONTROL_SPECIAL`: UInt = 603980803u;
public const val `DIBUTTON_3DCONTROL_SPECIAL1`: UInt = 603980802u;
public const val `DIBUTTON_3DCONTROL_SPECIAL2`: UInt = 603980804u;
public const val `DIBUTTON_ARCADEP_BACK_LINK`: UInt = 570508520u;
public const val `DIBUTTON_ARCADEP_CROUCH`: UInt = 570426371u;
public const val `DIBUTTON_ARCADEP_DEVICE`: UInt = 570443006u;
public const val `DIBUTTON_ARCADEP_FIRE`: UInt = 570426370u;
public const val `DIBUTTON_ARCADEP_FIRESECONDARY`: UInt = 570442758u;
public const val `DIBUTTON_ARCADEP_FORWARD_LINK`: UInt = 570508512u;
public const val `DIBUTTON_ARCADEP_JUMP`: UInt = 570426369u;
public const val `DIBUTTON_ARCADEP_LEFT_LINK`: UInt = 570475748u;
public const val `DIBUTTON_ARCADEP_MENU`: UInt = 570426621u;
public const val `DIBUTTON_ARCADEP_PAUSE`: UInt = 570443004u;
public const val `DIBUTTON_ARCADEP_RIGHT_LINK`: UInt = 570475756u;
public const val `DIBUTTON_ARCADEP_SELECT`: UInt = 570426373u;
public const val `DIBUTTON_ARCADEP_SPECIAL`: UInt = 570426372u;
public const val `DIBUTTON_ARCADEP_VIEW_DOWN_LINK`: UInt = 570934504u;
public const val `DIBUTTON_ARCADEP_VIEW_LEFT_LINK`: UInt = 570934500u;
public const val `DIBUTTON_ARCADEP_VIEW_RIGHT_LINK`: UInt = 570934508u;
public const val `DIBUTTON_ARCADEP_VIEW_UP_LINK`: UInt = 570934496u;
public const val `DIBUTTON_ARCADES_ATTACK`: UInt = 553649155u;
public const val `DIBUTTON_ARCADES_BACK_LINK`: UInt = 553731304u;
public const val `DIBUTTON_ARCADES_CARRY`: UInt = 553649154u;
public const val `DIBUTTON_ARCADES_DEVICE`: UInt = 553665790u;
public const val `DIBUTTON_ARCADES_FORWARD_LINK`: UInt = 553731296u;
public const val `DIBUTTON_ARCADES_LEFT_LINK`: UInt = 553698532u;
public const val `DIBUTTON_ARCADES_MENU`: UInt = 553649405u;
public const val `DIBUTTON_ARCADES_PAUSE`: UInt = 553665788u;
public const val `DIBUTTON_ARCADES_RIGHT_LINK`: UInt = 553698540u;
public const val `DIBUTTON_ARCADES_SELECT`: UInt = 553649157u;
public const val `DIBUTTON_ARCADES_SPECIAL`: UInt = 553649156u;
public const val `DIBUTTON_ARCADES_THROW`: UInt = 553649153u;
public const val `DIBUTTON_ARCADES_VIEW_DOWN_LINK`: UInt = 554157288u;
public const val `DIBUTTON_ARCADES_VIEW_LEFT_LINK`: UInt = 554157284u;
public const val `DIBUTTON_ARCADES_VIEW_RIGHT_LINK`: UInt = 554157292u;
public const val `DIBUTTON_ARCADES_VIEW_UP_LINK`: UInt = 554157280u;
public const val `DIBUTTON_BASEBALLB_BACK_LINK`: UInt = 251741416u;
public const val `DIBUTTON_BASEBALLB_BOX`: UInt = 251675658u;
public const val `DIBUTTON_BASEBALLB_BUNT`: UInt = 251659268u;
public const val `DIBUTTON_BASEBALLB_BURST`: UInt = 251659270u;
public const val `DIBUTTON_BASEBALLB_CONTACT`: UInt = 251659272u;
public const val `DIBUTTON_BASEBALLB_DEVICE`: UInt = 251675902u;
public const val `DIBUTTON_BASEBALLB_FORWARD_LINK`: UInt = 251741408u;
public const val `DIBUTTON_BASEBALLB_LEFT_LINK`: UInt = 251708644u;
public const val `DIBUTTON_BASEBALLB_MENU`: UInt = 251659517u;
public const val `DIBUTTON_BASEBALLB_NORMAL`: UInt = 251659266u;
public const val `DIBUTTON_BASEBALLB_NOSTEAL`: UInt = 251675657u;
public const val `DIBUTTON_BASEBALLB_PAUSE`: UInt = 251675900u;
public const val `DIBUTTON_BASEBALLB_POWER`: UInt = 251659267u;
public const val `DIBUTTON_BASEBALLB_RIGHT_LINK`: UInt = 251708652u;
public const val `DIBUTTON_BASEBALLB_SELECT`: UInt = 251659265u;
public const val `DIBUTTON_BASEBALLB_SLIDE`: UInt = 251659271u;
public const val `DIBUTTON_BASEBALLB_STEAL`: UInt = 251659269u;
public const val `DIBUTTON_BASEBALLF_AIM_LEFT_LINK`: UInt = 285263076u;
public const val `DIBUTTON_BASEBALLF_AIM_RIGHT_LINK`: UInt = 285263084u;
public const val `DIBUTTON_BASEBALLF_BACK_LINK`: UInt = 285295848u;
public const val `DIBUTTON_BASEBALLF_BURST`: UInt = 285213700u;
public const val `DIBUTTON_BASEBALLF_DEVICE`: UInt = 285230334u;
public const val `DIBUTTON_BASEBALLF_DIVE`: UInt = 285213702u;
public const val `DIBUTTON_BASEBALLF_FORWARD_LINK`: UInt = 285295840u;
public const val `DIBUTTON_BASEBALLF_JUMP`: UInt = 285213701u;
public const val `DIBUTTON_BASEBALLF_MENU`: UInt = 285213949u;
public const val `DIBUTTON_BASEBALLF_NEAREST`: UInt = 285213697u;
public const val `DIBUTTON_BASEBALLF_PAUSE`: UInt = 285230332u;
public const val `DIBUTTON_BASEBALLF_SHIFTIN`: UInt = 285230087u;
public const val `DIBUTTON_BASEBALLF_SHIFTOUT`: UInt = 285230088u;
public const val `DIBUTTON_BASEBALLF_THROW1`: UInt = 285213698u;
public const val `DIBUTTON_BASEBALLF_THROW2`: UInt = 285213699u;
public const val `DIBUTTON_BASEBALLP_BACK_LINK`: UInt = 268518632u;
public const val `DIBUTTON_BASEBALLP_BASE`: UInt = 268436483u;
public const val `DIBUTTON_BASEBALLP_DEVICE`: UInt = 268453118u;
public const val `DIBUTTON_BASEBALLP_FAKE`: UInt = 268436485u;
public const val `DIBUTTON_BASEBALLP_FORWARD_LINK`: UInt = 268518624u;
public const val `DIBUTTON_BASEBALLP_LEFT_LINK`: UInt = 268485860u;
public const val `DIBUTTON_BASEBALLP_LOOK`: UInt = 268452871u;
public const val `DIBUTTON_BASEBALLP_MENU`: UInt = 268436733u;
public const val `DIBUTTON_BASEBALLP_PAUSE`: UInt = 268453116u;
public const val `DIBUTTON_BASEBALLP_PITCH`: UInt = 268436482u;
public const val `DIBUTTON_BASEBALLP_RIGHT_LINK`: UInt = 268485868u;
public const val `DIBUTTON_BASEBALLP_SELECT`: UInt = 268436481u;
public const val `DIBUTTON_BASEBALLP_THROW`: UInt = 268436484u;
public const val `DIBUTTON_BASEBALLP_WALK`: UInt = 268452870u;
public const val `DIBUTTON_BBALLD_BACK_LINK`: UInt = 318850280u;
public const val `DIBUTTON_BBALLD_BURST`: UInt = 318768134u;
public const val `DIBUTTON_BBALLD_DEVICE`: UInt = 318784766u;
public const val `DIBUTTON_BBALLD_FAKE`: UInt = 318768131u;
public const val `DIBUTTON_BBALLD_FORWARD_LINK`: UInt = 318850272u;
public const val `DIBUTTON_BBALLD_JUMP`: UInt = 318768129u;
public const val `DIBUTTON_BBALLD_LEFT_LINK`: UInt = 318817508u;
public const val `DIBUTTON_BBALLD_MENU`: UInt = 318768381u;
public const val `DIBUTTON_BBALLD_PAUSE`: UInt = 318784764u;
public const val `DIBUTTON_BBALLD_PLAY`: UInt = 318768135u;
public const val `DIBUTTON_BBALLD_PLAYER`: UInt = 318768133u;
public const val `DIBUTTON_BBALLD_RIGHT_LINK`: UInt = 318817516u;
public const val `DIBUTTON_BBALLD_SPECIAL`: UInt = 318768132u;
public const val `DIBUTTON_BBALLD_STEAL`: UInt = 318768130u;
public const val `DIBUTTON_BBALLD_SUBSTITUTE`: UInt = 318784521u;
public const val `DIBUTTON_BBALLD_TIMEOUT`: UInt = 318784520u;
public const val `DIBUTTON_BBALLO_BACK_LINK`: UInt = 302073064u;
public const val `DIBUTTON_BBALLO_BURST`: UInt = 301990919u;
public const val `DIBUTTON_BBALLO_CALL`: UInt = 301990920u;
public const val `DIBUTTON_BBALLO_DEVICE`: UInt = 302007550u;
public const val `DIBUTTON_BBALLO_DUNK`: UInt = 301990914u;
public const val `DIBUTTON_BBALLO_FAKE`: UInt = 301990916u;
public const val `DIBUTTON_BBALLO_FORWARD_LINK`: UInt = 302073056u;
public const val `DIBUTTON_BBALLO_JAB`: UInt = 302007307u;
public const val `DIBUTTON_BBALLO_LEFT_LINK`: UInt = 302040292u;
public const val `DIBUTTON_BBALLO_MENU`: UInt = 301991165u;
public const val `DIBUTTON_BBALLO_PASS`: UInt = 301990915u;
public const val `DIBUTTON_BBALLO_PAUSE`: UInt = 302007548u;
public const val `DIBUTTON_BBALLO_PLAY`: UInt = 302007306u;
public const val `DIBUTTON_BBALLO_PLAYER`: UInt = 301990918u;
public const val `DIBUTTON_BBALLO_POST`: UInt = 302007308u;
public const val `DIBUTTON_BBALLO_RIGHT_LINK`: UInt = 302040300u;
public const val `DIBUTTON_BBALLO_SCREEN`: UInt = 302007305u;
public const val `DIBUTTON_BBALLO_SHOOT`: UInt = 301990913u;
public const val `DIBUTTON_BBALLO_SPECIAL`: UInt = 301990917u;
public const val `DIBUTTON_BBALLO_SUBSTITUTE`: UInt = 302007310u;
public const val `DIBUTTON_BBALLO_TIMEOUT`: UInt = 302007309u;
public const val `DIBUTTON_BIKINGM_BRAKE_BUTTON_LINK`: UInt = 470041832u;
public const val `DIBUTTON_BIKINGM_CAMERA`: UInt = 469763074u;
public const val `DIBUTTON_BIKINGM_DEVICE`: UInt = 469779710u;
public const val `DIBUTTON_BIKINGM_FASTER_LINK`: UInt = 469845216u;
public const val `DIBUTTON_BIKINGM_JUMP`: UInt = 469763073u;
public const val `DIBUTTON_BIKINGM_LEFT_LINK`: UInt = 469812452u;
public const val `DIBUTTON_BIKINGM_MENU`: UInt = 469763325u;
public const val `DIBUTTON_BIKINGM_PAUSE`: UInt = 469779708u;
public const val `DIBUTTON_BIKINGM_RIGHT_LINK`: UInt = 469812460u;
public const val `DIBUTTON_BIKINGM_SELECT`: UInt = 469763076u;
public const val `DIBUTTON_BIKINGM_SLOWER_LINK`: UInt = 469845224u;
public const val `DIBUTTON_BIKINGM_SPECIAL1`: UInt = 469763075u;
public const val `DIBUTTON_BIKINGM_SPECIAL2`: UInt = 469763077u;
public const val `DIBUTTON_BIKINGM_ZOOM`: UInt = 469779462u;
public const val `DIBUTTON_BROWSER_DEVICE`: UInt = 671106302u;
public const val `DIBUTTON_BROWSER_FAVORITES`: UInt = 671106054u;
public const val `DIBUTTON_BROWSER_HISTORY`: UInt = 671106057u;
public const val `DIBUTTON_BROWSER_HOME`: UInt = 671106053u;
public const val `DIBUTTON_BROWSER_MENU`: UInt = 671089917u;
public const val `DIBUTTON_BROWSER_NEXT`: UInt = 671106055u;
public const val `DIBUTTON_BROWSER_PAUSE`: UInt = 671106300u;
public const val `DIBUTTON_BROWSER_PREVIOUS`: UInt = 671106056u;
public const val `DIBUTTON_BROWSER_PRINT`: UInt = 671106058u;
public const val `DIBUTTON_BROWSER_REFRESH`: UInt = 671089666u;
public const val `DIBUTTON_BROWSER_SEARCH`: UInt = 671106051u;
public const val `DIBUTTON_BROWSER_SELECT`: UInt = 671089665u;
public const val `DIBUTTON_BROWSER_STOP`: UInt = 671106052u;
public const val `DIBUTTON_CADF_DEVICE`: UInt = 620774654u;
public const val `DIBUTTON_CADF_DISPLAY`: UInt = 620774405u;
public const val `DIBUTTON_CADF_MENU`: UInt = 620758269u;
public const val `DIBUTTON_CADF_PAUSE`: UInt = 620774652u;
public const val `DIBUTTON_CADF_SELECT`: UInt = 620758017u;
public const val `DIBUTTON_CADF_SPECIAL`: UInt = 620758019u;
public const val `DIBUTTON_CADF_SPECIAL1`: UInt = 620758018u;
public const val `DIBUTTON_CADF_SPECIAL2`: UInt = 620758020u;
public const val `DIBUTTON_CADM_DEVICE`: UInt = 637551870u;
public const val `DIBUTTON_CADM_DISPLAY`: UInt = 637551621u;
public const val `DIBUTTON_CADM_MENU`: UInt = 637535485u;
public const val `DIBUTTON_CADM_PAUSE`: UInt = 637551868u;
public const val `DIBUTTON_CADM_SELECT`: UInt = 637535233u;
public const val `DIBUTTON_CADM_SPECIAL`: UInt = 637535235u;
public const val `DIBUTTON_CADM_SPECIAL1`: UInt = 637535234u;
public const val `DIBUTTON_CADM_SPECIAL2`: UInt = 637535236u;
public const val `DIBUTTON_DRIVINGC_ACCELERATE_LINK`: UInt = 33805536u;
public const val `DIBUTTON_DRIVINGC_AIDS`: UInt = 33571847u;
public const val `DIBUTTON_DRIVINGC_BRAKE`: UInt = 33573896u;
public const val `DIBUTTON_DRIVINGC_DASHBOARD`: UInt = 33571846u;
public const val `DIBUTTON_DRIVINGC_DEVICE`: UInt = 33572094u;
public const val `DIBUTTON_DRIVINGC_FIRE`: UInt = 33557505u;
public const val `DIBUTTON_DRIVINGC_FIRESECONDARY`: UInt = 33573897u;
public const val `DIBUTTON_DRIVINGC_GLANCE_LEFT_LINK`: UInt = 34063588u;
public const val `DIBUTTON_DRIVINGC_GLANCE_RIGHT_LINK`: UInt = 34063596u;
public const val `DIBUTTON_DRIVINGC_MENU`: UInt = 33555709u;
public const val `DIBUTTON_DRIVINGC_PAUSE`: UInt = 33572092u;
public const val `DIBUTTON_DRIVINGC_SHIFTDOWN`: UInt = 33573893u;
public const val `DIBUTTON_DRIVINGC_SHIFTUP`: UInt = 33573892u;
public const val `DIBUTTON_DRIVINGC_STEER_LEFT_LINK`: UInt = 33606884u;
public const val `DIBUTTON_DRIVINGC_STEER_RIGHT_LINK`: UInt = 33606892u;
public const val `DIBUTTON_DRIVINGC_TARGET`: UInt = 33557507u;
public const val `DIBUTTON_DRIVINGC_WEAPONS`: UInt = 33557506u;
public const val `DIBUTTON_DRIVINGR_ACCELERATE_LINK`: UInt = 17028320u;
public const val `DIBUTTON_DRIVINGR_AIDS`: UInt = 16794630u;
public const val `DIBUTTON_DRIVINGR_BOOST`: UInt = 16794632u;
public const val `DIBUTTON_DRIVINGR_BRAKE`: UInt = 16796676u;
public const val `DIBUTTON_DRIVINGR_DASHBOARD`: UInt = 16794629u;
public const val `DIBUTTON_DRIVINGR_DEVICE`: UInt = 16794878u;
public const val `DIBUTTON_DRIVINGR_GLANCE_LEFT_LINK`: UInt = 17286372u;
public const val `DIBUTTON_DRIVINGR_GLANCE_RIGHT_LINK`: UInt = 17286380u;
public const val `DIBUTTON_DRIVINGR_MAP`: UInt = 16794631u;
public const val `DIBUTTON_DRIVINGR_MENU`: UInt = 16778493u;
public const val `DIBUTTON_DRIVINGR_PAUSE`: UInt = 16794876u;
public const val `DIBUTTON_DRIVINGR_PIT`: UInt = 16794633u;
public const val `DIBUTTON_DRIVINGR_SHIFTDOWN`: UInt = 16780290u;
public const val `DIBUTTON_DRIVINGR_SHIFTUP`: UInt = 16780289u;
public const val `DIBUTTON_DRIVINGR_STEER_LEFT_LINK`: UInt = 16829668u;
public const val `DIBUTTON_DRIVINGR_STEER_RIGHT_LINK`: UInt = 16829676u;
public const val `DIBUTTON_DRIVINGR_VIEW`: UInt = 16784387u;
public const val `DIBUTTON_DRIVINGT_ACCELERATE_LINK`: UInt = 50582752u;
public const val `DIBUTTON_DRIVINGT_BARREL_DOWN_LINK`: UInt = 50414824u;
public const val `DIBUTTON_DRIVINGT_BARREL_UP_LINK`: UInt = 50414816u;
public const val `DIBUTTON_DRIVINGT_BRAKE`: UInt = 50351110u;
public const val `DIBUTTON_DRIVINGT_DASHBOARD`: UInt = 50355205u;
public const val `DIBUTTON_DRIVINGT_DEVICE`: UInt = 50349310u;
public const val `DIBUTTON_DRIVINGT_FIRE`: UInt = 50334721u;
public const val `DIBUTTON_DRIVINGT_FIRESECONDARY`: UInt = 50351111u;
public const val `DIBUTTON_DRIVINGT_GLANCE_LEFT_LINK`: UInt = 50840804u;
public const val `DIBUTTON_DRIVINGT_GLANCE_RIGHT_LINK`: UInt = 50840812u;
public const val `DIBUTTON_DRIVINGT_MENU`: UInt = 50332925u;
public const val `DIBUTTON_DRIVINGT_PAUSE`: UInt = 50349308u;
public const val `DIBUTTON_DRIVINGT_ROTATE_LEFT_LINK`: UInt = 50480356u;
public const val `DIBUTTON_DRIVINGT_ROTATE_RIGHT_LINK`: UInt = 50480364u;
public const val `DIBUTTON_DRIVINGT_STEER_LEFT_LINK`: UInt = 50384100u;
public const val `DIBUTTON_DRIVINGT_STEER_RIGHT_LINK`: UInt = 50384108u;
public const val `DIBUTTON_DRIVINGT_TARGET`: UInt = 50334723u;
public const val `DIBUTTON_DRIVINGT_VIEW`: UInt = 50355204u;
public const val `DIBUTTON_DRIVINGT_WEAPONS`: UInt = 50334722u;
public const val `DIBUTTON_FIGHTINGH_BACKWARD_LINK`: UInt = 134300904u;
public const val `DIBUTTON_FIGHTINGH_BLOCK`: UInt = 134218755u;
public const val `DIBUTTON_FIGHTINGH_CROUCH`: UInt = 134218756u;
public const val `DIBUTTON_FIGHTINGH_DEVICE`: UInt = 134235390u;
public const val `DIBUTTON_FIGHTINGH_DISPLAY`: UInt = 134235145u;
public const val `DIBUTTON_FIGHTINGH_DODGE`: UInt = 134235146u;
public const val `DIBUTTON_FIGHTINGH_FORWARD_LINK`: UInt = 134300896u;
public const val `DIBUTTON_FIGHTINGH_JUMP`: UInt = 134218757u;
public const val `DIBUTTON_FIGHTINGH_KICK`: UInt = 134218754u;
public const val `DIBUTTON_FIGHTINGH_LEFT_LINK`: UInt = 134268132u;
public const val `DIBUTTON_FIGHTINGH_MENU`: UInt = 134219005u;
public const val `DIBUTTON_FIGHTINGH_PAUSE`: UInt = 134235388u;
public const val `DIBUTTON_FIGHTINGH_PUNCH`: UInt = 134218753u;
public const val `DIBUTTON_FIGHTINGH_RIGHT_LINK`: UInt = 134268140u;
public const val `DIBUTTON_FIGHTINGH_SELECT`: UInt = 134235144u;
public const val `DIBUTTON_FIGHTINGH_SPECIAL1`: UInt = 134218758u;
public const val `DIBUTTON_FIGHTINGH_SPECIAL2`: UInt = 134218759u;
public const val `DIBUTTON_FISHING_BACK_LINK`: UInt = 234964200u;
public const val `DIBUTTON_FISHING_BAIT`: UInt = 234882052u;
public const val `DIBUTTON_FISHING_BINOCULAR`: UInt = 234882051u;
public const val `DIBUTTON_FISHING_CAST`: UInt = 234882049u;
public const val `DIBUTTON_FISHING_CROUCH`: UInt = 234898439u;
public const val `DIBUTTON_FISHING_DEVICE`: UInt = 234898686u;
public const val `DIBUTTON_FISHING_DISPLAY`: UInt = 234898438u;
public const val `DIBUTTON_FISHING_FORWARD_LINK`: UInt = 234964192u;
public const val `DIBUTTON_FISHING_JUMP`: UInt = 234898440u;
public const val `DIBUTTON_FISHING_LEFT_LINK`: UInt = 234931428u;
public const val `DIBUTTON_FISHING_MAP`: UInt = 234882053u;
public const val `DIBUTTON_FISHING_MENU`: UInt = 234882301u;
public const val `DIBUTTON_FISHING_PAUSE`: UInt = 234898684u;
public const val `DIBUTTON_FISHING_RIGHT_LINK`: UInt = 234931436u;
public const val `DIBUTTON_FISHING_ROTATE_LEFT_LINK`: UInt = 235029732u;
public const val `DIBUTTON_FISHING_ROTATE_RIGHT_LINK`: UInt = 235029740u;
public const val `DIBUTTON_FISHING_TYPE`: UInt = 234882050u;
public const val `DIBUTTON_FLYINGC_BRAKE_LINK`: UInt = 67398880u;
public const val `DIBUTTON_FLYINGC_DEVICE`: UInt = 67126526u;
public const val `DIBUTTON_FLYINGC_DISPLAY`: UInt = 67118082u;
public const val `DIBUTTON_FLYINGC_FASTER_LINK`: UInt = 67359968u;
public const val `DIBUTTON_FLYINGC_FLAPSDOWN`: UInt = 67134469u;
public const val `DIBUTTON_FLYINGC_FLAPSUP`: UInt = 67134468u;
public const val `DIBUTTON_FLYINGC_GEAR`: UInt = 67120131u;
public const val `DIBUTTON_FLYINGC_GLANCE_DOWN_LINK`: UInt = 67618024u;
public const val `DIBUTTON_FLYINGC_GLANCE_LEFT_LINK`: UInt = 67618020u;
public const val `DIBUTTON_FLYINGC_GLANCE_RIGHT_LINK`: UInt = 67618028u;
public const val `DIBUTTON_FLYINGC_GLANCE_UP_LINK`: UInt = 67618016u;
public const val `DIBUTTON_FLYINGC_MENU`: UInt = 67110141u;
public const val `DIBUTTON_FLYINGC_PAUSE`: UInt = 67126524u;
public const val `DIBUTTON_FLYINGC_SLOWER_LINK`: UInt = 67359976u;
public const val `DIBUTTON_FLYINGC_VIEW`: UInt = 67118081u;
public const val `DIBUTTON_FLYINGH_COUNTER`: UInt = 100684804u;
public const val `DIBUTTON_FLYINGH_DEVICE`: UInt = 100680958u;
public const val `DIBUTTON_FLYINGH_FASTER_LINK`: UInt = 100916448u;
public const val `DIBUTTON_FLYINGH_FIRE`: UInt = 100668417u;
public const val `DIBUTTON_FLYINGH_FIRESECONDARY`: UInt = 100682759u;
public const val `DIBUTTON_FLYINGH_GEAR`: UInt = 100688902u;
public const val `DIBUTTON_FLYINGH_GLANCE_DOWN_LINK`: UInt = 101172456u;
public const val `DIBUTTON_FLYINGH_GLANCE_LEFT_LINK`: UInt = 101172452u;
public const val `DIBUTTON_FLYINGH_GLANCE_RIGHT_LINK`: UInt = 101172460u;
public const val `DIBUTTON_FLYINGH_GLANCE_UP_LINK`: UInt = 101172448u;
public const val `DIBUTTON_FLYINGH_MENU`: UInt = 100664573u;
public const val `DIBUTTON_FLYINGH_PAUSE`: UInt = 100680956u;
public const val `DIBUTTON_FLYINGH_SLOWER_LINK`: UInt = 100916456u;
public const val `DIBUTTON_FLYINGH_TARGET`: UInt = 100668419u;
public const val `DIBUTTON_FLYINGH_VIEW`: UInt = 100688901u;
public const val `DIBUTTON_FLYINGH_WEAPONS`: UInt = 100668418u;
public const val `DIBUTTON_FLYINGM_BRAKE_LINK`: UInt = 84174048u;
public const val `DIBUTTON_FLYINGM_COUNTER`: UInt = 83909636u;
public const val `DIBUTTON_FLYINGM_DEVICE`: UInt = 83903742u;
public const val `DIBUTTON_FLYINGM_DISPLAY`: UInt = 83911686u;
public const val `DIBUTTON_FLYINGM_FASTER_LINK`: UInt = 84137184u;
public const val `DIBUTTON_FLYINGM_FIRE`: UInt = 83889153u;
public const val `DIBUTTON_FLYINGM_FIRESECONDARY`: UInt = 83905545u;
public const val `DIBUTTON_FLYINGM_FLAPSDOWN`: UInt = 83907592u;
public const val `DIBUTTON_FLYINGM_FLAPSUP`: UInt = 83907591u;
public const val `DIBUTTON_FLYINGM_GEAR`: UInt = 83911690u;
public const val `DIBUTTON_FLYINGM_GLANCE_DOWN_LINK`: UInt = 84395240u;
public const val `DIBUTTON_FLYINGM_GLANCE_LEFT_LINK`: UInt = 84395236u;
public const val `DIBUTTON_FLYINGM_GLANCE_RIGHT_LINK`: UInt = 84395244u;
public const val `DIBUTTON_FLYINGM_GLANCE_UP_LINK`: UInt = 84395232u;
public const val `DIBUTTON_FLYINGM_MENU`: UInt = 83887357u;
public const val `DIBUTTON_FLYINGM_PAUSE`: UInt = 83903740u;
public const val `DIBUTTON_FLYINGM_SLOWER_LINK`: UInt = 84137192u;
public const val `DIBUTTON_FLYINGM_TARGET`: UInt = 83889155u;
public const val `DIBUTTON_FLYINGM_VIEW`: UInt = 83911685u;
public const val `DIBUTTON_FLYINGM_WEAPONS`: UInt = 83889154u;
public const val `DIBUTTON_FOOTBALLD_AUDIBLE`: UInt = 385893387u;
public const val `DIBUTTON_FOOTBALLD_BACK_LINK`: UInt = 385959144u;
public const val `DIBUTTON_FOOTBALLD_BULLRUSH`: UInt = 385893385u;
public const val `DIBUTTON_FOOTBALLD_DEVICE`: UInt = 385893630u;
public const val `DIBUTTON_FOOTBALLD_FAKE`: UInt = 385876997u;
public const val `DIBUTTON_FOOTBALLD_FORWARD_LINK`: UInt = 385959136u;
public const val `DIBUTTON_FOOTBALLD_JUMP`: UInt = 385876995u;
public const val `DIBUTTON_FOOTBALLD_LEFT_LINK`: UInt = 385926372u;
public const val `DIBUTTON_FOOTBALLD_MENU`: UInt = 385877245u;
public const val `DIBUTTON_FOOTBALLD_PAUSE`: UInt = 385893628u;
public const val `DIBUTTON_FOOTBALLD_PLAY`: UInt = 385876993u;
public const val `DIBUTTON_FOOTBALLD_RIGHT_LINK`: UInt = 385926380u;
public const val `DIBUTTON_FOOTBALLD_RIP`: UInt = 385893386u;
public const val `DIBUTTON_FOOTBALLD_SELECT`: UInt = 385876994u;
public const val `DIBUTTON_FOOTBALLD_SPIN`: UInt = 385893383u;
public const val `DIBUTTON_FOOTBALLD_SUBSTITUTE`: UInt = 385893389u;
public const val `DIBUTTON_FOOTBALLD_SUPERTACKLE`: UInt = 385876998u;
public const val `DIBUTTON_FOOTBALLD_SWIM`: UInt = 385893384u;
public const val `DIBUTTON_FOOTBALLD_TACKLE`: UInt = 385876996u;
public const val `DIBUTTON_FOOTBALLD_ZOOM`: UInt = 385893388u;
public const val `DIBUTTON_FOOTBALLO_BACK_LINK`: UInt = 369181928u;
public const val `DIBUTTON_FOOTBALLO_DEVICE`: UInt = 369116414u;
public const val `DIBUTTON_FOOTBALLO_DIVE`: UInt = 369116169u;
public const val `DIBUTTON_FOOTBALLO_FORWARD_LINK`: UInt = 369181920u;
public const val `DIBUTTON_FOOTBALLO_JUKE`: UInt = 369116166u;
public const val `DIBUTTON_FOOTBALLO_JUMP`: UInt = 369099777u;
public const val `DIBUTTON_FOOTBALLO_LEFTARM`: UInt = 369099778u;
public const val `DIBUTTON_FOOTBALLO_LEFT_LINK`: UInt = 369149156u;
public const val `DIBUTTON_FOOTBALLO_MENU`: UInt = 369100029u;
public const val `DIBUTTON_FOOTBALLO_PAUSE`: UInt = 369116412u;
public const val `DIBUTTON_FOOTBALLO_RIGHTARM`: UInt = 369099779u;
public const val `DIBUTTON_FOOTBALLO_RIGHT_LINK`: UInt = 369149164u;
public const val `DIBUTTON_FOOTBALLO_SHOULDER`: UInt = 369116167u;
public const val `DIBUTTON_FOOTBALLO_SPIN`: UInt = 369099781u;
public const val `DIBUTTON_FOOTBALLO_SUBSTITUTE`: UInt = 369116171u;
public const val `DIBUTTON_FOOTBALLO_THROW`: UInt = 369099780u;
public const val `DIBUTTON_FOOTBALLO_TURBO`: UInt = 369116168u;
public const val `DIBUTTON_FOOTBALLO_ZOOM`: UInt = 369116170u;
public const val `DIBUTTON_FOOTBALLP_DEVICE`: UInt = 335561982u;
public const val `DIBUTTON_FOOTBALLP_HELP`: UInt = 335545347u;
public const val `DIBUTTON_FOOTBALLP_MENU`: UInt = 335545597u;
public const val `DIBUTTON_FOOTBALLP_PAUSE`: UInt = 335561980u;
public const val `DIBUTTON_FOOTBALLP_PLAY`: UInt = 335545345u;
public const val `DIBUTTON_FOOTBALLP_SELECT`: UInt = 335545346u;
public const val `DIBUTTON_FOOTBALLQ_AUDIBLE`: UInt = 352338953u;
public const val `DIBUTTON_FOOTBALLQ_BACK_LINK`: UInt = 352404712u;
public const val `DIBUTTON_FOOTBALLQ_DEVICE`: UInt = 352339198u;
public const val `DIBUTTON_FOOTBALLQ_FAKE`: UInt = 352322566u;
public const val `DIBUTTON_FOOTBALLQ_FAKESNAP`: UInt = 352338951u;
public const val `DIBUTTON_FOOTBALLQ_FORWARD_LINK`: UInt = 352404704u;
public const val `DIBUTTON_FOOTBALLQ_JUMP`: UInt = 352322563u;
public const val `DIBUTTON_FOOTBALLQ_LEFT_LINK`: UInt = 352371940u;
public const val `DIBUTTON_FOOTBALLQ_MENU`: UInt = 352322813u;
public const val `DIBUTTON_FOOTBALLQ_MOTION`: UInt = 352338952u;
public const val `DIBUTTON_FOOTBALLQ_PASS`: UInt = 352322565u;
public const val `DIBUTTON_FOOTBALLQ_PAUSE`: UInt = 352339196u;
public const val `DIBUTTON_FOOTBALLQ_RIGHT_LINK`: UInt = 352371948u;
public const val `DIBUTTON_FOOTBALLQ_SELECT`: UInt = 352322561u;
public const val `DIBUTTON_FOOTBALLQ_SLIDE`: UInt = 352322564u;
public const val `DIBUTTON_FOOTBALLQ_SNAP`: UInt = 352322562u;
public const val `DIBUTTON_FPS_APPLY`: UInt = 150995971u;
public const val `DIBUTTON_FPS_BACKWARD_LINK`: UInt = 151078120u;
public const val `DIBUTTON_FPS_CROUCH`: UInt = 150995973u;
public const val `DIBUTTON_FPS_DEVICE`: UInt = 151012606u;
public const val `DIBUTTON_FPS_DISPLAY`: UInt = 151012360u;
public const val `DIBUTTON_FPS_DODGE`: UInt = 151012361u;
public const val `DIBUTTON_FPS_FIRE`: UInt = 150995969u;
public const val `DIBUTTON_FPS_FIRESECONDARY`: UInt = 151012364u;
public const val `DIBUTTON_FPS_FORWARD_LINK`: UInt = 151078112u;
public const val `DIBUTTON_FPS_GLANCEL`: UInt = 151012362u;
public const val `DIBUTTON_FPS_GLANCER`: UInt = 151012363u;
public const val `DIBUTTON_FPS_GLANCE_DOWN_LINK`: UInt = 151110888u;
public const val `DIBUTTON_FPS_GLANCE_UP_LINK`: UInt = 151110880u;
public const val `DIBUTTON_FPS_JUMP`: UInt = 150995974u;
public const val `DIBUTTON_FPS_MENU`: UInt = 150996221u;
public const val `DIBUTTON_FPS_PAUSE`: UInt = 151012604u;
public const val `DIBUTTON_FPS_ROTATE_LEFT_LINK`: UInt = 151045348u;
public const val `DIBUTTON_FPS_ROTATE_RIGHT_LINK`: UInt = 151045356u;
public const val `DIBUTTON_FPS_SELECT`: UInt = 150995972u;
public const val `DIBUTTON_FPS_STEP_LEFT_LINK`: UInt = 151143652u;
public const val `DIBUTTON_FPS_STEP_RIGHT_LINK`: UInt = 151143660u;
public const val `DIBUTTON_FPS_STRAFE`: UInt = 150995975u;
public const val `DIBUTTON_FPS_WEAPONS`: UInt = 150995970u;
public const val `DIBUTTON_GOLF_BACK_LINK`: UInt = 402736360u;
public const val `DIBUTTON_GOLF_DEVICE`: UInt = 402670846u;
public const val `DIBUTTON_GOLF_DOWN`: UInt = 402654212u;
public const val `DIBUTTON_GOLF_FLYBY`: UInt = 402654214u;
public const val `DIBUTTON_GOLF_FORWARD_LINK`: UInt = 402736352u;
public const val `DIBUTTON_GOLF_LEFT_LINK`: UInt = 402703588u;
public const val `DIBUTTON_GOLF_MENU`: UInt = 402654461u;
public const val `DIBUTTON_GOLF_PAUSE`: UInt = 402670844u;
public const val `DIBUTTON_GOLF_RIGHT_LINK`: UInt = 402703596u;
public const val `DIBUTTON_GOLF_SELECT`: UInt = 402654210u;
public const val `DIBUTTON_GOLF_SUBSTITUTE`: UInt = 402670601u;
public const val `DIBUTTON_GOLF_SWING`: UInt = 402654209u;
public const val `DIBUTTON_GOLF_TERRAIN`: UInt = 402654213u;
public const val `DIBUTTON_GOLF_TIMEOUT`: UInt = 402670600u;
public const val `DIBUTTON_GOLF_UP`: UInt = 402654211u;
public const val `DIBUTTON_GOLF_ZOOM`: UInt = 402670599u;
public const val `DIBUTTON_HOCKEYD_BACK_LINK`: UInt = 436290792u;
public const val `DIBUTTON_HOCKEYD_BLOCK`: UInt = 436208644u;
public const val `DIBUTTON_HOCKEYD_BURST`: UInt = 436208643u;
public const val `DIBUTTON_HOCKEYD_DEVICE`: UInt = 436225278u;
public const val `DIBUTTON_HOCKEYD_FAKE`: UInt = 436208645u;
public const val `DIBUTTON_HOCKEYD_FORWARD_LINK`: UInt = 436290784u;
public const val `DIBUTTON_HOCKEYD_LEFT_LINK`: UInt = 436258020u;
public const val `DIBUTTON_HOCKEYD_MENU`: UInt = 436208893u;
public const val `DIBUTTON_HOCKEYD_PAUSE`: UInt = 436225276u;
public const val `DIBUTTON_HOCKEYD_PLAYER`: UInt = 436208641u;
public const val `DIBUTTON_HOCKEYD_RIGHT_LINK`: UInt = 436258028u;
public const val `DIBUTTON_HOCKEYD_STEAL`: UInt = 436208642u;
public const val `DIBUTTON_HOCKEYD_STRATEGY`: UInt = 436225031u;
public const val `DIBUTTON_HOCKEYD_SUBSTITUTE`: UInt = 436225033u;
public const val `DIBUTTON_HOCKEYD_TIMEOUT`: UInt = 436225032u;
public const val `DIBUTTON_HOCKEYD_ZOOM`: UInt = 436225030u;
public const val `DIBUTTON_HOCKEYG_BACK_LINK`: UInt = 453068008u;
public const val `DIBUTTON_HOCKEYG_BLOCK`: UInt = 452985860u;
public const val `DIBUTTON_HOCKEYG_DEVICE`: UInt = 453002494u;
public const val `DIBUTTON_HOCKEYG_FORWARD_LINK`: UInt = 453068000u;
public const val `DIBUTTON_HOCKEYG_LEFT_LINK`: UInt = 453035236u;
public const val `DIBUTTON_HOCKEYG_MENU`: UInt = 452986109u;
public const val `DIBUTTON_HOCKEYG_PASS`: UInt = 452985857u;
public const val `DIBUTTON_HOCKEYG_PAUSE`: UInt = 453002492u;
public const val `DIBUTTON_HOCKEYG_POKE`: UInt = 452985858u;
public const val `DIBUTTON_HOCKEYG_RIGHT_LINK`: UInt = 453035244u;
public const val `DIBUTTON_HOCKEYG_STEAL`: UInt = 452985859u;
public const val `DIBUTTON_HOCKEYG_STRATEGY`: UInt = 453002246u;
public const val `DIBUTTON_HOCKEYG_SUBSTITUTE`: UInt = 453002248u;
public const val `DIBUTTON_HOCKEYG_TIMEOUT`: UInt = 453002247u;
public const val `DIBUTTON_HOCKEYG_ZOOM`: UInt = 453002245u;
public const val `DIBUTTON_HOCKEYO_BACK_LINK`: UInt = 419513576u;
public const val `DIBUTTON_HOCKEYO_BURST`: UInt = 419431427u;
public const val `DIBUTTON_HOCKEYO_DEVICE`: UInt = 419448062u;
public const val `DIBUTTON_HOCKEYO_FAKE`: UInt = 419431429u;
public const val `DIBUTTON_HOCKEYO_FORWARD_LINK`: UInt = 419513568u;
public const val `DIBUTTON_HOCKEYO_LEFT_LINK`: UInt = 419480804u;
public const val `DIBUTTON_HOCKEYO_MENU`: UInt = 419431677u;
public const val `DIBUTTON_HOCKEYO_PASS`: UInt = 419431426u;
public const val `DIBUTTON_HOCKEYO_PAUSE`: UInt = 419448060u;
public const val `DIBUTTON_HOCKEYO_RIGHT_LINK`: UInt = 419480812u;
public const val `DIBUTTON_HOCKEYO_SHOOT`: UInt = 419431425u;
public const val `DIBUTTON_HOCKEYO_SPECIAL`: UInt = 419431428u;
public const val `DIBUTTON_HOCKEYO_STRATEGY`: UInt = 419447815u;
public const val `DIBUTTON_HOCKEYO_SUBSTITUTE`: UInt = 419447817u;
public const val `DIBUTTON_HOCKEYO_TIMEOUT`: UInt = 419447816u;
public const val `DIBUTTON_HOCKEYO_ZOOM`: UInt = 419447814u;
public const val `DIBUTTON_HUNTING_AIM`: UInt = 218104834u;
public const val `DIBUTTON_HUNTING_BACK_LINK`: UInt = 218186984u;
public const val `DIBUTTON_HUNTING_BINOCULAR`: UInt = 218104836u;
public const val `DIBUTTON_HUNTING_CALL`: UInt = 218104837u;
public const val `DIBUTTON_HUNTING_CROUCH`: UInt = 218121225u;
public const val `DIBUTTON_HUNTING_DEVICE`: UInt = 218121470u;
public const val `DIBUTTON_HUNTING_DISPLAY`: UInt = 218121224u;
public const val `DIBUTTON_HUNTING_FIRE`: UInt = 218104833u;
public const val `DIBUTTON_HUNTING_FIRESECONDARY`: UInt = 218121227u;
public const val `DIBUTTON_HUNTING_FORWARD_LINK`: UInt = 218186976u;
public const val `DIBUTTON_HUNTING_JUMP`: UInt = 218121226u;
public const val `DIBUTTON_HUNTING_LEFT_LINK`: UInt = 218154212u;
public const val `DIBUTTON_HUNTING_MAP`: UInt = 218104838u;
public const val `DIBUTTON_HUNTING_MENU`: UInt = 218105085u;
public const val `DIBUTTON_HUNTING_PAUSE`: UInt = 218121468u;
public const val `DIBUTTON_HUNTING_RIGHT_LINK`: UInt = 218154220u;
public const val `DIBUTTON_HUNTING_ROTATE_LEFT_LINK`: UInt = 218252516u;
public const val `DIBUTTON_HUNTING_ROTATE_RIGHT_LINK`: UInt = 218252524u;
public const val `DIBUTTON_HUNTING_SPECIAL`: UInt = 218104839u;
public const val `DIBUTTON_HUNTING_WEAPON`: UInt = 218104835u;
public const val `DIBUTTON_MECHA_BACK_LINK`: UInt = 687949032u;
public const val `DIBUTTON_MECHA_CENTER`: UInt = 687883271u;
public const val `DIBUTTON_MECHA_DEVICE`: UInt = 687883518u;
public const val `DIBUTTON_MECHA_FASTER_LINK`: UInt = 688112864u;
public const val `DIBUTTON_MECHA_FIRE`: UInt = 687866881u;
public const val `DIBUTTON_MECHA_FIRESECONDARY`: UInt = 687883273u;
public const val `DIBUTTON_MECHA_FORWARD_LINK`: UInt = 687949024u;
public const val `DIBUTTON_MECHA_JUMP`: UInt = 687866886u;
public const val `DIBUTTON_MECHA_LEFT_LINK`: UInt = 687916260u;
public const val `DIBUTTON_MECHA_MENU`: UInt = 687867133u;
public const val `DIBUTTON_MECHA_PAUSE`: UInt = 687883516u;
public const val `DIBUTTON_MECHA_REVERSE`: UInt = 687866884u;
public const val `DIBUTTON_MECHA_RIGHT_LINK`: UInt = 687916268u;
public const val `DIBUTTON_MECHA_ROTATE_LEFT_LINK`: UInt = 688014564u;
public const val `DIBUTTON_MECHA_ROTATE_RIGHT_LINK`: UInt = 688014572u;
public const val `DIBUTTON_MECHA_SLOWER_LINK`: UInt = 688112872u;
public const val `DIBUTTON_MECHA_TARGET`: UInt = 687866883u;
public const val `DIBUTTON_MECHA_VIEW`: UInt = 687883272u;
public const val `DIBUTTON_MECHA_WEAPONS`: UInt = 687866882u;
public const val `DIBUTTON_MECHA_ZOOM`: UInt = 687866885u;
public const val `DIBUTTON_RACQUET_BACKSWING`: UInt = 536871938u;
public const val `DIBUTTON_RACQUET_BACK_LINK`: UInt = 536954088u;
public const val `DIBUTTON_RACQUET_DEVICE`: UInt = 536888574u;
public const val `DIBUTTON_RACQUET_FORWARD_LINK`: UInt = 536954080u;
public const val `DIBUTTON_RACQUET_LEFT_LINK`: UInt = 536921316u;
public const val `DIBUTTON_RACQUET_MENU`: UInt = 536872189u;
public const val `DIBUTTON_RACQUET_PAUSE`: UInt = 536888572u;
public const val `DIBUTTON_RACQUET_RIGHT_LINK`: UInt = 536921324u;
public const val `DIBUTTON_RACQUET_SELECT`: UInt = 536871941u;
public const val `DIBUTTON_RACQUET_SMASH`: UInt = 536871939u;
public const val `DIBUTTON_RACQUET_SPECIAL`: UInt = 536871940u;
public const val `DIBUTTON_RACQUET_SUBSTITUTE`: UInt = 536888327u;
public const val `DIBUTTON_RACQUET_SWING`: UInt = 536871937u;
public const val `DIBUTTON_RACQUET_TIMEOUT`: UInt = 536888326u;
public const val `DIBUTTON_REMOTE_ADJUST`: UInt = 654334990u;
public const val `DIBUTTON_REMOTE_CABLE`: UInt = 654334985u;
public const val `DIBUTTON_REMOTE_CD`: UInt = 654334986u;
public const val `DIBUTTON_REMOTE_CHANGE`: UInt = 654320646u;
public const val `DIBUTTON_REMOTE_CUE`: UInt = 654320644u;
public const val `DIBUTTON_REMOTE_DEVICE`: UInt = 654329086u;
public const val `DIBUTTON_REMOTE_DIGIT0`: UInt = 654332943u;
public const val `DIBUTTON_REMOTE_DIGIT1`: UInt = 654332944u;
public const val `DIBUTTON_REMOTE_DIGIT2`: UInt = 654332945u;
public const val `DIBUTTON_REMOTE_DIGIT3`: UInt = 654332946u;
public const val `DIBUTTON_REMOTE_DIGIT4`: UInt = 654332947u;
public const val `DIBUTTON_REMOTE_DIGIT5`: UInt = 654332948u;
public const val `DIBUTTON_REMOTE_DIGIT6`: UInt = 654332949u;
public const val `DIBUTTON_REMOTE_DIGIT7`: UInt = 654332950u;
public const val `DIBUTTON_REMOTE_DIGIT8`: UInt = 654332951u;
public const val `DIBUTTON_REMOTE_DIGIT9`: UInt = 654332952u;
public const val `DIBUTTON_REMOTE_DVD`: UInt = 654334989u;
public const val `DIBUTTON_REMOTE_MENU`: UInt = 654312701u;
public const val `DIBUTTON_REMOTE_MUTE`: UInt = 654312449u;
public const val `DIBUTTON_REMOTE_PAUSE`: UInt = 654329084u;
public const val `DIBUTTON_REMOTE_PLAY`: UInt = 654320643u;
public const val `DIBUTTON_REMOTE_RECORD`: UInt = 654320647u;
public const val `DIBUTTON_REMOTE_REVIEW`: UInt = 654320645u;
public const val `DIBUTTON_REMOTE_SELECT`: UInt = 654312450u;
public const val `DIBUTTON_REMOTE_TUNER`: UInt = 654334988u;
public const val `DIBUTTON_REMOTE_TV`: UInt = 654334984u;
public const val `DIBUTTON_REMOTE_VCR`: UInt = 654334987u;
public const val `DIBUTTON_SKIING_CAMERA`: UInt = 486540291u;
public const val `DIBUTTON_SKIING_CROUCH`: UInt = 486540290u;
public const val `DIBUTTON_SKIING_DEVICE`: UInt = 486556926u;
public const val `DIBUTTON_SKIING_FASTER_LINK`: UInt = 486622432u;
public const val `DIBUTTON_SKIING_JUMP`: UInt = 486540289u;
public const val `DIBUTTON_SKIING_LEFT_LINK`: UInt = 486589668u;
public const val `DIBUTTON_SKIING_MENU`: UInt = 486540541u;
public const val `DIBUTTON_SKIING_PAUSE`: UInt = 486556924u;
public const val `DIBUTTON_SKIING_RIGHT_LINK`: UInt = 486589676u;
public const val `DIBUTTON_SKIING_SELECT`: UInt = 486540293u;
public const val `DIBUTTON_SKIING_SLOWER_LINK`: UInt = 486622440u;
public const val `DIBUTTON_SKIING_SPECIAL1`: UInt = 486540292u;
public const val `DIBUTTON_SKIING_SPECIAL2`: UInt = 486540294u;
public const val `DIBUTTON_SKIING_ZOOM`: UInt = 486556679u;
public const val `DIBUTTON_SOCCERD_BACK_LINK`: UInt = 520176872u;
public const val `DIBUTTON_SOCCERD_BLOCK`: UInt = 520094721u;
public const val `DIBUTTON_SOCCERD_CLEAR`: UInt = 520111114u;
public const val `DIBUTTON_SOCCERD_DEVICE`: UInt = 520111358u;
public const val `DIBUTTON_SOCCERD_FAKE`: UInt = 520094723u;
public const val `DIBUTTON_SOCCERD_FORWARD_LINK`: UInt = 520176864u;
public const val `DIBUTTON_SOCCERD_FOUL`: UInt = 520111112u;
public const val `DIBUTTON_SOCCERD_GOALIECHARGE`: UInt = 520111115u;
public const val `DIBUTTON_SOCCERD_HEAD`: UInt = 520111113u;
public const val `DIBUTTON_SOCCERD_LEFT_LINK`: UInt = 520144100u;
public const val `DIBUTTON_SOCCERD_MENU`: UInt = 520094973u;
public const val `DIBUTTON_SOCCERD_PAUSE`: UInt = 520111356u;
public const val `DIBUTTON_SOCCERD_PLAYER`: UInt = 520094724u;
public const val `DIBUTTON_SOCCERD_RIGHT_LINK`: UInt = 520144108u;
public const val `DIBUTTON_SOCCERD_SELECT`: UInt = 520094726u;
public const val `DIBUTTON_SOCCERD_SLIDE`: UInt = 520094727u;
public const val `DIBUTTON_SOCCERD_SPECIAL`: UInt = 520094725u;
public const val `DIBUTTON_SOCCERD_STEAL`: UInt = 520094722u;
public const val `DIBUTTON_SOCCERD_SUBSTITUTE`: UInt = 520111116u;
public const val `DIBUTTON_SOCCERO_BACK_LINK`: UInt = 503399656u;
public const val `DIBUTTON_SOCCERO_CONTROL`: UInt = 503333900u;
public const val `DIBUTTON_SOCCERO_DEVICE`: UInt = 503334142u;
public const val `DIBUTTON_SOCCERO_FAKE`: UInt = 503317507u;
public const val `DIBUTTON_SOCCERO_FORWARD_LINK`: UInt = 503399648u;
public const val `DIBUTTON_SOCCERO_HEAD`: UInt = 503333901u;
public const val `DIBUTTON_SOCCERO_LEFT_LINK`: UInt = 503366884u;
public const val `DIBUTTON_SOCCERO_MENU`: UInt = 503317757u;
public const val `DIBUTTON_SOCCERO_PASS`: UInt = 503317506u;
public const val `DIBUTTON_SOCCERO_PASSTHRU`: UInt = 503333898u;
public const val `DIBUTTON_SOCCERO_PAUSE`: UInt = 503334140u;
public const val `DIBUTTON_SOCCERO_PLAYER`: UInt = 503317508u;
public const val `DIBUTTON_SOCCERO_RIGHT_LINK`: UInt = 503366892u;
public const val `DIBUTTON_SOCCERO_SELECT`: UInt = 503317510u;
public const val `DIBUTTON_SOCCERO_SHOOT`: UInt = 503317505u;
public const val `DIBUTTON_SOCCERO_SHOOTHIGH`: UInt = 503333897u;
public const val `DIBUTTON_SOCCERO_SHOOTLOW`: UInt = 503333896u;
public const val `DIBUTTON_SOCCERO_SPECIAL1`: UInt = 503317509u;
public const val `DIBUTTON_SOCCERO_SPRINT`: UInt = 503333899u;
public const val `DIBUTTON_SOCCERO_SUBSTITUTE`: UInt = 503333895u;
public const val `DIBUTTON_SPACESIM_BACKWARD_LINK`: UInt = 117523688u;
public const val `DIBUTTON_SPACESIM_DEVICE`: UInt = 117458174u;
public const val `DIBUTTON_SPACESIM_DISPLAY`: UInt = 117457925u;
public const val `DIBUTTON_SPACESIM_FASTER_LINK`: UInt = 117687520u;
public const val `DIBUTTON_SPACESIM_FIRE`: UInt = 117441537u;
public const val `DIBUTTON_SPACESIM_FIRESECONDARY`: UInt = 117457929u;
public const val `DIBUTTON_SPACESIM_FORWARD_LINK`: UInt = 117523680u;
public const val `DIBUTTON_SPACESIM_GEAR`: UInt = 117457928u;
public const val `DIBUTTON_SPACESIM_GLANCE_DOWN_LINK`: UInt = 117949672u;
public const val `DIBUTTON_SPACESIM_GLANCE_LEFT_LINK`: UInt = 117949668u;
public const val `DIBUTTON_SPACESIM_GLANCE_RIGHT_LINK`: UInt = 117949676u;
public const val `DIBUTTON_SPACESIM_GLANCE_UP_LINK`: UInt = 117949664u;
public const val `DIBUTTON_SPACESIM_LEFT_LINK`: UInt = 117490916u;
public const val `DIBUTTON_SPACESIM_LOWER`: UInt = 117457927u;
public const val `DIBUTTON_SPACESIM_MENU`: UInt = 117441789u;
public const val `DIBUTTON_SPACESIM_PAUSE`: UInt = 117458172u;
public const val `DIBUTTON_SPACESIM_RAISE`: UInt = 117457926u;
public const val `DIBUTTON_SPACESIM_RIGHT_LINK`: UInt = 117490924u;
public const val `DIBUTTON_SPACESIM_SLOWER_LINK`: UInt = 117687528u;
public const val `DIBUTTON_SPACESIM_TARGET`: UInt = 117441539u;
public const val `DIBUTTON_SPACESIM_TURN_LEFT_LINK`: UInt = 117589220u;
public const val `DIBUTTON_SPACESIM_TURN_RIGHT_LINK`: UInt = 117589228u;
public const val `DIBUTTON_SPACESIM_VIEW`: UInt = 117457924u;
public const val `DIBUTTON_SPACESIM_WEAPONS`: UInt = 117441538u;
public const val `DIBUTTON_STRATEGYR_APPLY`: UInt = 184550402u;
public const val `DIBUTTON_STRATEGYR_ATTACK`: UInt = 184550404u;
public const val `DIBUTTON_STRATEGYR_BACK_LINK`: UInt = 184632552u;
public const val `DIBUTTON_STRATEGYR_CAST`: UInt = 184550405u;
public const val `DIBUTTON_STRATEGYR_CROUCH`: UInt = 184550406u;
public const val `DIBUTTON_STRATEGYR_DEVICE`: UInt = 184567038u;
public const val `DIBUTTON_STRATEGYR_DISPLAY`: UInt = 184566793u;
public const val `DIBUTTON_STRATEGYR_FORWARD_LINK`: UInt = 184632544u;
public const val `DIBUTTON_STRATEGYR_GET`: UInt = 184550401u;
public const val `DIBUTTON_STRATEGYR_JUMP`: UInt = 184550407u;
public const val `DIBUTTON_STRATEGYR_LEFT_LINK`: UInt = 184599780u;
public const val `DIBUTTON_STRATEGYR_MAP`: UInt = 184566792u;
public const val `DIBUTTON_STRATEGYR_MENU`: UInt = 184550653u;
public const val `DIBUTTON_STRATEGYR_PAUSE`: UInt = 184567036u;
public const val `DIBUTTON_STRATEGYR_RIGHT_LINK`: UInt = 184599788u;
public const val `DIBUTTON_STRATEGYR_ROTATE_LEFT_LINK`: UInt = 184698084u;
public const val `DIBUTTON_STRATEGYR_ROTATE_RIGHT_LINK`: UInt = 184698092u;
public const val `DIBUTTON_STRATEGYR_SELECT`: UInt = 184550403u;
public const val `DIBUTTON_STRATEGYT_APPLY`: UInt = 201327619u;
public const val `DIBUTTON_STRATEGYT_BACK_LINK`: UInt = 201409768u;
public const val `DIBUTTON_STRATEGYT_DEVICE`: UInt = 201344254u;
public const val `DIBUTTON_STRATEGYT_DISPLAY`: UInt = 201344008u;
public const val `DIBUTTON_STRATEGYT_FORWARD_LINK`: UInt = 201409760u;
public const val `DIBUTTON_STRATEGYT_INSTRUCT`: UInt = 201327618u;
public const val `DIBUTTON_STRATEGYT_LEFT_LINK`: UInt = 201376996u;
public const val `DIBUTTON_STRATEGYT_MAP`: UInt = 201344007u;
public const val `DIBUTTON_STRATEGYT_MENU`: UInt = 201327869u;
public const val `DIBUTTON_STRATEGYT_PAUSE`: UInt = 201344252u;
public const val `DIBUTTON_STRATEGYT_RIGHT_LINK`: UInt = 201377004u;
public const val `DIBUTTON_STRATEGYT_SELECT`: UInt = 201327617u;
public const val `DIBUTTON_STRATEGYT_TEAM`: UInt = 201327620u;
public const val `DIBUTTON_STRATEGYT_TURN`: UInt = 201327621u;
public const val `DIBUTTON_STRATEGYT_ZOOM`: UInt = 201344006u;
public const val `DIBUTTON_TPS_ACTION`: UInt = 167773186u;
public const val `DIBUTTON_TPS_BACKWARD_LINK`: UInt = 167855336u;
public const val `DIBUTTON_TPS_DEVICE`: UInt = 167789822u;
public const val `DIBUTTON_TPS_DODGE`: UInt = 167789577u;
public const val `DIBUTTON_TPS_FORWARD_LINK`: UInt = 167855328u;
public const val `DIBUTTON_TPS_GLANCE_DOWN_LINK`: UInt = 168281320u;
public const val `DIBUTTON_TPS_GLANCE_LEFT_LINK`: UInt = 168281316u;
public const val `DIBUTTON_TPS_GLANCE_RIGHT_LINK`: UInt = 168281324u;
public const val `DIBUTTON_TPS_GLANCE_UP_LINK`: UInt = 168281312u;
public const val `DIBUTTON_TPS_INVENTORY`: UInt = 167789578u;
public const val `DIBUTTON_TPS_JUMP`: UInt = 167773189u;
public const val `DIBUTTON_TPS_MENU`: UInt = 167773437u;
public const val `DIBUTTON_TPS_PAUSE`: UInt = 167789820u;
public const val `DIBUTTON_TPS_RUN`: UInt = 167773185u;
public const val `DIBUTTON_TPS_SELECT`: UInt = 167773187u;
public const val `DIBUTTON_TPS_STEPLEFT`: UInt = 167789575u;
public const val `DIBUTTON_TPS_STEPRIGHT`: UInt = 167789576u;
public const val `DIBUTTON_TPS_TURN_LEFT_LINK`: UInt = 167920868u;
public const val `DIBUTTON_TPS_TURN_RIGHT_LINK`: UInt = 167920876u;
public const val `DIBUTTON_TPS_USE`: UInt = 167773188u;
public const val `DIBUTTON_TPS_VIEW`: UInt = 167789574u;
public const val `DICD_DEFAULT`: UInt = 0u;
public const val `DICD_EDIT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DICOLORSET` (
    public var `dwSize`: UInt,
    public var `cTextFore`: UInt,
    public var `cTextHighlight`: UInt,
    public var `cCalloutLine`: UInt,
    public var `cCalloutHighlight`: UInt,
    public var `cBorder`: UInt,
    public var `cControlFill`: UInt,
    public var `cHighlightFill`: UInt,
    public var `cAreaFill`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DICONDITION` (
    public var `lOffset`: Int,
    public var `lPositiveCoefficient`: Int,
    public var `lNegativeCoefficient`: Int,
    public var `dwPositiveSaturation`: UInt,
    public var `dwNegativeSaturation`: UInt,
    public var `lDeadBand`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DICONFIGUREDEVICESPARAMSA` (
    public var `dwSize`: UInt,
    public var `dwcUsers`: UInt,
    public var `lptszUserNames`: `windows_sys`.`core`.`PSTR`,
    public var `dwcFormats`: UInt,
    public var `lprgFormats`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIACTIONFORMATA`>?,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `dics`: `DICOLORSET`,
    public var `lpUnkDDSTarget`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1142:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DICONFIGUREDEVICESPARAMSA {
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
public class `DICONFIGUREDEVICESPARAMSW` (
    public var `dwSize`: UInt,
    public var `dwcUsers`: UInt,
    public var `lptszUserNames`: `windows_sys`.`core`.`PWSTR`,
    public var `dwcFormats`: UInt,
    public var `lprgFormats`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIACTIONFORMATW`>?,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `dics`: `DICOLORSET`,
    public var `lpUnkDDSTarget`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DICONFIGUREDEVICESPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DICONSTANTFORCE` (
    public var `lMagnitude`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DICUSTOMFORCE` (
    public var `cChannels`: UInt,
    public var `dwSamplePeriod`: UInt,
    public var `cSamples`: UInt,
    public var `rglForceData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
)
// UNSUPPORTED Rust 1177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DICUSTOMFORCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIDAL_BOTTOMALIGNED`: UInt = 8u;
public const val `DIDAL_CENTERED`: UInt = 0u;
public const val `DIDAL_LEFTALIGNED`: UInt = 1u;
public const val `DIDAL_MIDDLE`: UInt = 0u;
public const val `DIDAL_RIGHTALIGNED`: UInt = 2u;
public const val `DIDAL_TOPALIGNED`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDATAFORMAT` (
    public var `dwSize`: UInt,
    public var `dwObjSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDataSize`: UInt,
    public var `dwNumObjs`: UInt,
    public var `rgodf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIOBJECTDATAFORMAT`>?,
)
// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDATAFORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIDBAM_DEFAULT`: UInt = 0u;
public const val `DIDBAM_HWDEFAULTS`: UInt = 4u;
public const val `DIDBAM_INITIALIZE`: UInt = 2u;
public const val `DIDBAM_PRESERVE`: UInt = 1u;
public const val `DIDC_ALIAS`: UInt = 65536u;
public const val `DIDC_ATTACHED`: UInt = 1u;
public const val `DIDC_DEADBAND`: UInt = 16384u;
public const val `DIDC_EMULATED`: UInt = 4u;
public const val `DIDC_FFATTACK`: UInt = 512u;
public const val `DIDC_FFFADE`: UInt = 1024u;
public const val `DIDC_FORCEFEEDBACK`: UInt = 256u;
public const val `DIDC_HIDDEN`: UInt = 262144u;
public const val `DIDC_PHANTOM`: UInt = 131072u;
public const val `DIDC_POLLEDDATAFORMAT`: UInt = 8u;
public const val `DIDC_POLLEDDEVICE`: UInt = 2u;
public const val `DIDC_POSNEGCOEFFICIENTS`: UInt = 4096u;
public const val `DIDC_POSNEGSATURATION`: UInt = 8192u;
public const val `DIDC_SATURATION`: UInt = 2048u;
public const val `DIDC_STARTDELAY`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIDEVCAPS` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDevType`: UInt,
    public var `dwAxes`: UInt,
    public var `dwButtons`: UInt,
    public var `dwPOVs`: UInt,
    public var `dwFFSamplePeriod`: UInt,
    public var `dwFFMinTimeResolution`: UInt,
    public var `dwFirmwareRevision`: UInt,
    public var `dwHardwareRevision`: UInt,
    public var `dwFFDriverVersion`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIDEVCAPS_DX3` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDevType`: UInt,
    public var `dwAxes`: UInt,
    public var `dwButtons`: UInt,
    public var `dwPOVs`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEIMAGEINFOA` (
    public var `tszImagePath`: ByteArray,
    public var `dwFlags`: UInt,
    public var `dwViewID`: UInt,
    public var `rcOverlay`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwObjID`: UInt,
    public var `dwcValidPts`: UInt,
    public var `rgptCalloutLine`: Array<`super`.`super`.`Foundation`.`POINT`>,
    public var `rcCalloutRect`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwTextAlign`: UInt,
)
// UNSUPPORTED Rust 1260:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEIMAGEINFOA {
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
public class `DIDEVICEIMAGEINFOHEADERA` (
    public var `dwSize`: UInt,
    public var `dwSizeImageInfo`: UInt,
    public var `dwcViews`: UInt,
    public var `dwcButtons`: UInt,
    public var `dwcAxes`: UInt,
    public var `dwcPOVs`: UInt,
    public var `dwBufferSize`: UInt,
    public var `dwBufferUsed`: UInt,
    public var `lprgImageInfoArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEIMAGEINFOA`>?,
)
// UNSUPPORTED Rust 1278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEIMAGEINFOHEADERA {
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
public class `DIDEVICEIMAGEINFOHEADERW` (
    public var `dwSize`: UInt,
    public var `dwSizeImageInfo`: UInt,
    public var `dwcViews`: UInt,
    public var `dwcButtons`: UInt,
    public var `dwcAxes`: UInt,
    public var `dwcPOVs`: UInt,
    public var `dwBufferSize`: UInt,
    public var `dwBufferUsed`: UInt,
    public var `lprgImageInfoArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEIMAGEINFOW`>?,
)
// UNSUPPORTED Rust 1296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEIMAGEINFOHEADERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEIMAGEINFOW` (
    public var `tszImagePath`: UShortArray,
    public var `dwFlags`: UInt,
    public var `dwViewID`: UInt,
    public var `rcOverlay`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwObjID`: UInt,
    public var `dwcValidPts`: UInt,
    public var `rgptCalloutLine`: Array<`super`.`super`.`Foundation`.`POINT`>,
    public var `rcCalloutRect`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwTextAlign`: UInt,
)
// UNSUPPORTED Rust 1314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEIMAGEINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEINSTANCEA` (
    public var `dwSize`: UInt,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `guidProduct`: `windows_sys`.`core`.`GUID`,
    public var `dwDevType`: UInt,
    public var `tszInstanceName`: ByteArray,
    public var `tszProductName`: ByteArray,
    public var `guidFFDriver`: `windows_sys`.`core`.`GUID`,
    public var `wUsagePage`: UShort,
    public var `wUsage`: UShort,
)
// UNSUPPORTED Rust 1332:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEINSTANCEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEINSTANCEW` (
    public var `dwSize`: UInt,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `guidProduct`: `windows_sys`.`core`.`GUID`,
    public var `dwDevType`: UInt,
    public var `tszInstanceName`: UShortArray,
    public var `tszProductName`: UShortArray,
    public var `guidFFDriver`: `windows_sys`.`core`.`GUID`,
    public var `wUsagePage`: UShort,
    public var `wUsage`: UShort,
)
// UNSUPPORTED Rust 1350:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEINSTANCEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEINSTANCE_DX3A` (
    public var `dwSize`: UInt,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `guidProduct`: `windows_sys`.`core`.`GUID`,
    public var `dwDevType`: UInt,
    public var `tszInstanceName`: ByteArray,
    public var `tszProductName`: ByteArray,
)
// UNSUPPORTED Rust 1365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEINSTANCE_DX3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEINSTANCE_DX3W` (
    public var `dwSize`: UInt,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `guidProduct`: `windows_sys`.`core`.`GUID`,
    public var `dwDevType`: UInt,
    public var `tszInstanceName`: UShortArray,
    public var `tszProductName`: UShortArray,
)
// UNSUPPORTED Rust 1380:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEINSTANCE_DX3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIDEVICEOBJECTDATA` (
    public var `dwOfs`: UInt,
    public var `dwData`: UInt,
    public var `dwTimeStamp`: UInt,
    public var `dwSequence`: UInt,
    public var `uAppData`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIDEVICEOBJECTDATA_DX3` (
    public var `dwOfs`: UInt,
    public var `dwData`: UInt,
    public var `dwTimeStamp`: UInt,
    public var `dwSequence`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEOBJECTINSTANCEA` (
    public var `dwSize`: UInt,
    public var `guidType`: `windows_sys`.`core`.`GUID`,
    public var `dwOfs`: UInt,
    public var `dwType`: UInt,
    public var `dwFlags`: UInt,
    public var `tszName`: ByteArray,
    public var `dwFFMaxForce`: UInt,
    public var `dwFFForceResolution`: UInt,
    public var `wCollectionNumber`: UShort,
    public var `wDesignatorIndex`: UShort,
    public var `wUsagePage`: UShort,
    public var `wUsage`: UShort,
    public var `dwDimension`: UInt,
    public var `wExponent`: UShort,
    public var `wReportId`: UShort,
)
// UNSUPPORTED Rust 1421:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEOBJECTINSTANCEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEOBJECTINSTANCEW` (
    public var `dwSize`: UInt,
    public var `guidType`: `windows_sys`.`core`.`GUID`,
    public var `dwOfs`: UInt,
    public var `dwType`: UInt,
    public var `dwFlags`: UInt,
    public var `tszName`: UShortArray,
    public var `dwFFMaxForce`: UInt,
    public var `dwFFForceResolution`: UInt,
    public var `wCollectionNumber`: UShort,
    public var `wDesignatorIndex`: UShort,
    public var `wUsagePage`: UShort,
    public var `wUsage`: UShort,
    public var `dwDimension`: UInt,
    public var `wExponent`: UShort,
    public var `wReportId`: UShort,
)
// UNSUPPORTED Rust 1445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEOBJECTINSTANCEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEOBJECTINSTANCE_DX3A` (
    public var `dwSize`: UInt,
    public var `guidType`: `windows_sys`.`core`.`GUID`,
    public var `dwOfs`: UInt,
    public var `dwType`: UInt,
    public var `dwFlags`: UInt,
    public var `tszName`: ByteArray,
)
// UNSUPPORTED Rust 1460:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEOBJECTINSTANCE_DX3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIDEVICEOBJECTINSTANCE_DX3W` (
    public var `dwSize`: UInt,
    public var `guidType`: `windows_sys`.`core`.`GUID`,
    public var `dwOfs`: UInt,
    public var `dwType`: UInt,
    public var `dwFlags`: UInt,
    public var `tszName`: UShortArray,
)
// UNSUPPORTED Rust 1475:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIDEVICEOBJECTINSTANCE_DX3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIDEVICESTATE` (
    public var `dwSize`: UInt,
    public var `dwState`: UInt,
    public var `dwLoad`: UInt,
)
public const val `DIDEVTYPEJOYSTICK_FLIGHTSTICK`: UInt = 3u;
public const val `DIDEVTYPEJOYSTICK_GAMEPAD`: UInt = 4u;
public const val `DIDEVTYPEJOYSTICK_HEADTRACKER`: UInt = 7u;
public const val `DIDEVTYPEJOYSTICK_RUDDER`: UInt = 5u;
public const val `DIDEVTYPEJOYSTICK_TRADITIONAL`: UInt = 2u;
public const val `DIDEVTYPEJOYSTICK_UNKNOWN`: UInt = 1u;
public const val `DIDEVTYPEJOYSTICK_WHEEL`: UInt = 6u;
public const val `DIDEVTYPEKEYBOARD_J3100`: UInt = 12u;
public const val `DIDEVTYPEKEYBOARD_JAPAN106`: UInt = 10u;
public const val `DIDEVTYPEKEYBOARD_JAPANAX`: UInt = 11u;
public const val `DIDEVTYPEKEYBOARD_NEC98`: UInt = 7u;
public const val `DIDEVTYPEKEYBOARD_NEC98106`: UInt = 9u;
public const val `DIDEVTYPEKEYBOARD_NEC98LAPTOP`: UInt = 8u;
public const val `DIDEVTYPEKEYBOARD_NOKIA1050`: UInt = 5u;
public const val `DIDEVTYPEKEYBOARD_NOKIA9140`: UInt = 6u;
public const val `DIDEVTYPEKEYBOARD_OLIVETTI`: UInt = 2u;
public const val `DIDEVTYPEKEYBOARD_PCAT`: UInt = 3u;
public const val `DIDEVTYPEKEYBOARD_PCENH`: UInt = 4u;
public const val `DIDEVTYPEKEYBOARD_PCXT`: UInt = 1u;
public const val `DIDEVTYPEKEYBOARD_UNKNOWN`: UInt = 0u;
public const val `DIDEVTYPEMOUSE_FINGERSTICK`: UInt = 3u;
public const val `DIDEVTYPEMOUSE_TOUCHPAD`: UInt = 4u;
public const val `DIDEVTYPEMOUSE_TRACKBALL`: UInt = 5u;
public const val `DIDEVTYPEMOUSE_TRADITIONAL`: UInt = 2u;
public const val `DIDEVTYPEMOUSE_UNKNOWN`: UInt = 1u;
public const val `DIDEVTYPE_DEVICE`: UInt = 1u;
public const val `DIDEVTYPE_HID`: UInt = 65536u;
public const val `DIDEVTYPE_JOYSTICK`: UInt = 4u;
public const val `DIDEVTYPE_KEYBOARD`: UInt = 3u;
public const val `DIDEVTYPE_MOUSE`: UInt = 2u;
public const val `DIDFT_ABSAXIS`: UInt = 2u;
public const val `DIDFT_ALIAS`: UInt = 134217728u;
public const val `DIDFT_ALL`: UInt = 0u;
public const val `DIDFT_ANYINSTANCE`: UInt = 16776960u;
public const val `DIDFT_AXIS`: UInt = 3u;
public const val `DIDFT_BUTTON`: UInt = 12u;
public const val `DIDFT_COLLECTION`: UInt = 64u;
public const val `DIDFT_FFACTUATOR`: UInt = 16777216u;
public const val `DIDFT_FFEFFECTTRIGGER`: UInt = 33554432u;
public const val `DIDFT_INSTANCEMASK`: UInt = 16776960u;
public const val `DIDFT_NOCOLLECTION`: UInt = 16776960u;
public const val `DIDFT_NODATA`: UInt = 128u;
public const val `DIDFT_OUTPUT`: UInt = 268435456u;
public const val `DIDFT_POV`: UInt = 16u;
public const val `DIDFT_PSHBUTTON`: UInt = 4u;
public const val `DIDFT_RELAXIS`: UInt = 1u;
public const val `DIDFT_TGLBUTTON`: UInt = 8u;
public const val `DIDFT_VENDORDEFINED`: UInt = 67108864u;
public const val `DIDF_ABSAXIS`: UInt = 1u;
public const val `DIDF_RELAXIS`: UInt = 2u;
public const val `DIDIFT_CONFIGURATION`: UInt = 1u;
public const val `DIDIFT_DELETE`: UInt = 16777216u;
public const val `DIDIFT_OVERLAY`: UInt = 2u;
public const val `DIDOI_ASPECTACCEL`: UInt = 768u;
public const val `DIDOI_ASPECTFORCE`: UInt = 1024u;
public const val `DIDOI_ASPECTMASK`: UInt = 3840u;
public const val `DIDOI_ASPECTPOSITION`: UInt = 256u;
public const val `DIDOI_ASPECTVELOCITY`: UInt = 512u;
public const val `DIDOI_FFACTUATOR`: UInt = 1u;
public const val `DIDOI_FFEFFECTTRIGGER`: UInt = 2u;
public const val `DIDOI_GUIDISUSAGE`: UInt = 65536u;
public const val `DIDOI_POLLED`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIDRIVERVERSIONS` (
    public var `dwSize`: UInt,
    public var `dwFirmwareRevision`: UInt,
    public var `dwHardwareRevision`: UInt,
    public var `dwFFDriverVersion`: UInt,
)
public const val `DIDSAM_DEFAULT`: UInt = 0u;
public const val `DIDSAM_FORCESAVE`: UInt = 2u;
public const val `DIDSAM_NOUSER`: UInt = 1u;
public const val `DIEB_NOTRIGGER`: UInt = 4294967295u;
public const val `DIEDBSFL_ATTACHEDONLY`: UInt = 0u;
public const val `DIEDBSFL_AVAILABLEDEVICES`: UInt = 4096u;
public const val `DIEDBSFL_FORCEFEEDBACK`: UInt = 256u;
public const val `DIEDBSFL_MULTIMICEKEYBOARDS`: UInt = 8192u;
public const val `DIEDBSFL_NONGAMINGDEVICES`: UInt = 16384u;
public const val `DIEDBSFL_THISUSER`: UInt = 16u;
public const val `DIEDBSFL_VALID`: UInt = 28944u;
public const val `DIEDBS_MAPPEDPRI1`: UInt = 1u;
public const val `DIEDBS_MAPPEDPRI2`: UInt = 2u;
public const val `DIEDBS_NEWDEVICE`: UInt = 32u;
public const val `DIEDBS_RECENTDEVICE`: UInt = 16u;
public const val `DIEDFL_ALLDEVICES`: UInt = 0u;
public const val `DIEDFL_ATTACHEDONLY`: UInt = 1u;
public const val `DIEDFL_FORCEFEEDBACK`: UInt = 256u;
public const val `DIEDFL_INCLUDEALIASES`: UInt = 65536u;
public const val `DIEDFL_INCLUDEHIDDEN`: UInt = 262144u;
public const val `DIEDFL_INCLUDEPHANTOMS`: UInt = 131072u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIEFFECT` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDuration`: UInt,
    public var `dwSamplePeriod`: UInt,
    public var `dwGain`: UInt,
    public var `dwTriggerButton`: UInt,
    public var `dwTriggerRepeatInterval`: UInt,
    public var `cAxes`: UInt,
    public var `rgdwAxes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `rglDirection`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `lpEnvelope`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIENVELOPE`>?,
    public var `cbTypeSpecificParams`: UInt,
    public var `lpvTypeSpecificParams`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwStartDelay`: UInt,
)
// UNSUPPORTED Rust 1596:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIEFFECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIEFFECTATTRIBUTES` (
    public var `dwEffectId`: UInt,
    public var `dwEffType`: UInt,
    public var `dwStaticParams`: UInt,
    public var `dwDynamicParams`: UInt,
    public var `dwCoords`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIEFFECTINFOA` (
    public var `dwSize`: UInt,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `dwEffType`: UInt,
    public var `dwStaticParams`: UInt,
    public var `dwDynamicParams`: UInt,
    public var `tszName`: ByteArray,
)
// UNSUPPORTED Rust 1620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIEFFECTINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIEFFECTINFOW` (
    public var `dwSize`: UInt,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `dwEffType`: UInt,
    public var `dwStaticParams`: UInt,
    public var `dwDynamicParams`: UInt,
    public var `tszName`: UShortArray,
)
// UNSUPPORTED Rust 1635:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIEFFECTINFOW {
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
public class `DIEFFECT_DX5` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDuration`: UInt,
    public var `dwSamplePeriod`: UInt,
    public var `dwGain`: UInt,
    public var `dwTriggerButton`: UInt,
    public var `dwTriggerRepeatInterval`: UInt,
    public var `cAxes`: UInt,
    public var `rgdwAxes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `rglDirection`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `lpEnvelope`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIENVELOPE`>?,
    public var `cbTypeSpecificParams`: UInt,
    public var `lpvTypeSpecificParams`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1657:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIEFFECT_DX5 {
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
public class `DIEFFESCAPE` (
    public var `dwSize`: UInt,
    public var `dwCommand`: UInt,
    public var `lpvInBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbInBuffer`: UInt,
    public var `lpvOutBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbOutBuffer`: UInt,
)
// UNSUPPORTED Rust 1672:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIEFFESCAPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIEFF_CARTESIAN`: UInt = 16u;
public const val `DIEFF_OBJECTIDS`: UInt = 1u;
public const val `DIEFF_OBJECTOFFSETS`: UInt = 2u;
public const val `DIEFF_POLAR`: UInt = 32u;
public const val `DIEFF_SPHERICAL`: UInt = 64u;
public const val `DIEFT_ALL`: UInt = 0u;
public const val `DIEFT_CONDITION`: UInt = 4u;
public const val `DIEFT_CONSTANTFORCE`: UInt = 1u;
public const val `DIEFT_CUSTOMFORCE`: UInt = 5u;
public const val `DIEFT_DEADBAND`: UInt = 16384u;
public const val `DIEFT_FFATTACK`: UInt = 512u;
public const val `DIEFT_FFFADE`: UInt = 1024u;
public const val `DIEFT_HARDWARE`: UInt = 255u;
public const val `DIEFT_PERIODIC`: UInt = 3u;
public const val `DIEFT_POSNEGCOEFFICIENTS`: UInt = 4096u;
public const val `DIEFT_POSNEGSATURATION`: UInt = 8192u;
public const val `DIEFT_RAMPFORCE`: UInt = 2u;
public const val `DIEFT_SATURATION`: UInt = 2048u;
public const val `DIEFT_STARTDELAY`: UInt = 32768u;
public const val `DIEGES_EMULATED`: UInt = 2u;
public const val `DIEGES_PLAYING`: UInt = 1u;
public const val `DIENUM_CONTINUE`: UInt = 1u;
public const val `DIENUM_STOP`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIENVELOPE` (
    public var `dwSize`: UInt,
    public var `dwAttackLevel`: UInt,
    public var `dwAttackTime`: UInt,
    public var `dwFadeLevel`: UInt,
    public var `dwFadeTime`: UInt,
)
public const val `DIEP_ALLPARAMS`: UInt = 1023u;
public const val `DIEP_ALLPARAMS_DX5`: UInt = 511u;
public const val `DIEP_AXES`: UInt = 32u;
public const val `DIEP_DIRECTION`: UInt = 64u;
public const val `DIEP_DURATION`: UInt = 1u;
public const val `DIEP_ENVELOPE`: UInt = 128u;
public const val `DIEP_GAIN`: UInt = 4u;
public const val `DIEP_NODOWNLOAD`: UInt = 2147483648u;
public const val `DIEP_NORESTART`: UInt = 1073741824u;
public const val `DIEP_SAMPLEPERIOD`: UInt = 2u;
public const val `DIEP_START`: UInt = 536870912u;
public const val `DIEP_STARTDELAY`: UInt = 512u;
public const val `DIEP_TRIGGERBUTTON`: UInt = 8u;
public const val `DIEP_TRIGGERREPEATINTERVAL`: UInt = 16u;
public const val `DIEP_TYPESPECIFICPARAMS`: UInt = 256u;
public const val `DIERR_ACQUIRED`: Int = -2147024726;
public const val `DIERR_ALREADYINITIALIZED`: Int = -2147023649;
public const val `DIERR_BADDRIVERVER`: Int = -2147024777;
public const val `DIERR_BADINF`: Int = -2147220478;
public const val `DIERR_BETADIRECTINPUTVERSION`: Int = -2147023743;
public const val `DIERR_CANCELLED`: Int = -2147220479;
public const val `DIERR_DEVICEFULL`: Int = -2147220991;
public const val `DIERR_DEVICENOTREG`: Int = -2147221164;
public const val `DIERR_DRIVERFIRST`: Int = -2147220736;
public const val `DIERR_DRIVERLAST`: Int = -2147220481;
public const val `DIERR_EFFECTPLAYING`: Int = -2147220984;
public const val `DIERR_GENERIC`: Int = -2147467259;
public const val `DIERR_HANDLEEXISTS`: Int = -2147024891;
public const val `DIERR_HASEFFECTS`: Int = -2147220988;
public const val `DIERR_INCOMPLETEEFFECT`: Int = -2147220986;
public const val `DIERR_INPUTLOST`: Int = -2147024866;
public const val `DIERR_INSUFFICIENTPRIVS`: Int = -2147220992;
public const val `DIERR_INVALIDCLASSINSTALLER`: Int = -2147220480;
public const val `DIERR_INVALIDPARAM`: Int = -2147024809;
public const val `DIERR_MAPFILEFAIL`: Int = -2147220981;
public const val `DIERR_MOREDATA`: Int = -2147220990;
public const val `DIERR_NOAGGREGATION`: Int = -2147221232;
public const val `DIERR_NOINTERFACE`: Int = -2147467262;
public const val `DIERR_NOMOREITEMS`: Int = -2147024637;
public const val `DIERR_NOTACQUIRED`: Int = -2147024884;
public const val `DIERR_NOTBUFFERED`: Int = -2147220985;
public const val `DIERR_NOTDOWNLOADED`: Int = -2147220989;
public const val `DIERR_NOTEXCLUSIVEACQUIRED`: Int = -2147220987;
public const val `DIERR_NOTFOUND`: Int = -2147024894;
public const val `DIERR_NOTINITIALIZED`: Int = -2147024875;
public const val `DIERR_OBJECTNOTFOUND`: Int = -2147024894;
public const val `DIERR_OLDDIRECTINPUTVERSION`: Int = -2147023746;
public const val `DIERR_OTHERAPPHASPRIO`: Int = -2147024891;
public const val `DIERR_OUTOFMEMORY`: Int = -2147024882;
public const val `DIERR_READONLY`: Int = -2147024891;
public const val `DIERR_REPORTFULL`: Int = -2147220982;
public const val `DIERR_UNPLUGGED`: Int = -2147220983;
public const val `DIERR_UNSUPPORTED`: Int = -2147467263;
public const val `DIES_NODOWNLOAD`: UInt = 2147483648u;
public const val `DIES_SOLO`: UInt = 1u;
public const val `DIFEF_DEFAULT`: UInt = 0u;
public const val `DIFEF_INCLUDENONSTANDARD`: UInt = 1u;
public const val `DIFEF_MODIFYIFNEEDED`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIFFDEVICEATTRIBUTES` (
    public var `dwFlags`: UInt,
    public var `dwFFSamplePeriod`: UInt,
    public var `dwFFMinTimeResolution`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIFFOBJECTATTRIBUTES` (
    public var `dwFFMaxForce`: UInt,
    public var `dwFFForceResolution`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIFILEEFFECT` (
    public var `dwSize`: UInt,
    public var `GuidEffect`: `windows_sys`.`core`.`GUID`,
    public var `lpDiEffect`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DIEFFECT`>?,
    public var `szFriendlyName`: ByteArray,
)
// UNSUPPORTED Rust 1788:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIFILEEFFECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIGDD_PEEK`: UInt = 1u;
public const val `DIGFFS_ACTUATORSOFF`: UInt = 32u;
public const val `DIGFFS_ACTUATORSON`: UInt = 16u;
public const val `DIGFFS_DEVICELOST`: UInt = 2147483648u;
public const val `DIGFFS_EMPTY`: UInt = 1u;
public const val `DIGFFS_PAUSED`: UInt = 4u;
public const val `DIGFFS_POWEROFF`: UInt = 128u;
public const val `DIGFFS_POWERON`: UInt = 64u;
public const val `DIGFFS_SAFETYSWITCHOFF`: UInt = 512u;
public const val `DIGFFS_SAFETYSWITCHON`: UInt = 256u;
public const val `DIGFFS_STOPPED`: UInt = 2u;
public const val `DIGFFS_USERFFSWITCHOFF`: UInt = 2048u;
public const val `DIGFFS_USERFFSWITCHON`: UInt = 1024u;
public const val `DIHATSWITCH_2DCONTROL_HATSWITCH`: UInt = 587220481u;
public const val `DIHATSWITCH_3DCONTROL_HATSWITCH`: UInt = 603997697u;
public const val `DIHATSWITCH_ARCADEP_VIEW`: UInt = 570443265u;
public const val `DIHATSWITCH_ARCADES_VIEW`: UInt = 553666049u;
public const val `DIHATSWITCH_BBALLD_GLANCE`: UInt = 318785025u;
public const val `DIHATSWITCH_BBALLO_GLANCE`: UInt = 302007809u;
public const val `DIHATSWITCH_BIKINGM_SCROLL`: UInt = 469779969u;
public const val `DIHATSWITCH_CADF_HATSWITCH`: UInt = 620774913u;
public const val `DIHATSWITCH_CADM_HATSWITCH`: UInt = 637552129u;
public const val `DIHATSWITCH_DRIVINGC_GLANCE`: UInt = 33572353u;
public const val `DIHATSWITCH_DRIVINGR_GLANCE`: UInt = 16795137u;
public const val `DIHATSWITCH_DRIVINGT_GLANCE`: UInt = 50349569u;
public const val `DIHATSWITCH_FIGHTINGH_SLIDE`: UInt = 134235649u;
public const val `DIHATSWITCH_FISHING_GLANCE`: UInt = 234898945u;
public const val `DIHATSWITCH_FLYINGC_GLANCE`: UInt = 67126785u;
public const val `DIHATSWITCH_FLYINGH_GLANCE`: UInt = 100681217u;
public const val `DIHATSWITCH_FLYINGM_GLANCE`: UInt = 83904001u;
public const val `DIHATSWITCH_FPS_GLANCE`: UInt = 151012865u;
public const val `DIHATSWITCH_GOLF_SCROLL`: UInt = 402671105u;
public const val `DIHATSWITCH_HOCKEYD_SCROLL`: UInt = 436225537u;
public const val `DIHATSWITCH_HOCKEYG_SCROLL`: UInt = 453002753u;
public const val `DIHATSWITCH_HOCKEYO_SCROLL`: UInt = 419448321u;
public const val `DIHATSWITCH_HUNTING_GLANCE`: UInt = 218121729u;
public const val `DIHATSWITCH_MECHA_GLANCE`: UInt = 687883777u;
public const val `DIHATSWITCH_RACQUET_GLANCE`: UInt = 536888833u;
public const val `DIHATSWITCH_SKIING_GLANCE`: UInt = 486557185u;
public const val `DIHATSWITCH_SOCCERD_GLANCE`: UInt = 520111617u;
public const val `DIHATSWITCH_SOCCERO_GLANCE`: UInt = 503334401u;
public const val `DIHATSWITCH_SPACESIM_GLANCE`: UInt = 117458433u;
public const val `DIHATSWITCH_STRATEGYR_GLANCE`: UInt = 184567297u;
public const val `DIHATSWITCH_TPS_GLANCE`: UInt = 167790081u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIHIDFFINITINFO` (
    public var `dwSize`: UInt,
    public var `pwszDeviceInterface`: `windows_sys`.`core`.`PWSTR`,
    public var `GuidInstance`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1844:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIHIDFFINITINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIJC_CALLOUT`: UInt = 8u;
public const val `DIJC_GAIN`: UInt = 4u;
public const val `DIJC_GUIDINSTANCE`: UInt = 1u;
public const val `DIJC_REGHWCONFIGTYPE`: UInt = 2u;
public const val `DIJC_WDMGAMEPORT`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYCONFIG` (
    public var `dwSize`: UInt,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `hwc`: `JOYREGHWCONFIG`,
    public var `dwGain`: UInt,
    public var `wszType`: UShortArray,
    public var `wszCallout`: UShortArray,
    public var `guidGameport`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYCONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYCONFIG_DX5` (
    public var `dwSize`: UInt,
    public var `guidInstance`: `windows_sys`.`core`.`GUID`,
    public var `hwc`: `JOYREGHWCONFIG`,
    public var `dwGain`: UInt,
    public var `wszType`: UShortArray,
    public var `wszCallout`: UShortArray,
)
// UNSUPPORTED Rust 1880:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYCONFIG_DX5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYSTATE` (
    public var `lX`: Int,
    public var `lY`: Int,
    public var `lZ`: Int,
    public var `lRx`: Int,
    public var `lRy`: Int,
    public var `lRz`: Int,
    public var `rglSlider`: IntArray,
    public var `rgdwPOV`: UIntArray,
    public var `rgbButtons`: UByteArray,
)
// UNSUPPORTED Rust 1898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYSTATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYSTATE2` (
    public var `lX`: Int,
    public var `lY`: Int,
    public var `lZ`: Int,
    public var `lRx`: Int,
    public var `lRy`: Int,
    public var `lRz`: Int,
    public var `rglSlider`: IntArray,
    public var `rgdwPOV`: UIntArray,
    public var `rgbButtons`: UByteArray,
    public var `lVX`: Int,
    public var `lVY`: Int,
    public var `lVZ`: Int,
    public var `lVRx`: Int,
    public var `lVRy`: Int,
    public var `lVRz`: Int,
    public var `rglVSlider`: IntArray,
    public var `lAX`: Int,
    public var `lAY`: Int,
    public var `lAZ`: Int,
    public var `lARx`: Int,
    public var `lARy`: Int,
    public var `lARz`: Int,
    public var `rglASlider`: IntArray,
    public var `lFX`: Int,
    public var `lFY`: Int,
    public var `lFZ`: Int,
    public var `lFRx`: Int,
    public var `lFRy`: Int,
    public var `lFRz`: Int,
    public var `rglFSlider`: IntArray,
)
// UNSUPPORTED Rust 1937:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYSTATE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYTYPEINFO` (
    public var `dwSize`: UInt,
    public var `hws`: `JOYREGHWSETTINGS`,
    public var `clsidConfig`: `windows_sys`.`core`.`GUID`,
    public var `wszDisplayName`: UShortArray,
    public var `wszCallout`: UShortArray,
    public var `wszHardwareId`: UShortArray,
    public var `dwFlags1`: UInt,
    public var `dwFlags2`: UInt,
    public var `wszMapFile`: UShortArray,
)
// UNSUPPORTED Rust 1955:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYTYPEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYTYPEINFO_DX5` (
    public var `dwSize`: UInt,
    public var `hws`: `JOYREGHWSETTINGS`,
    public var `clsidConfig`: `windows_sys`.`core`.`GUID`,
    public var `wszDisplayName`: UShortArray,
    public var `wszCallout`: UShortArray,
)
// UNSUPPORTED Rust 1969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYTYPEINFO_DX5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYTYPEINFO_DX6` (
    public var `dwSize`: UInt,
    public var `hws`: `JOYREGHWSETTINGS`,
    public var `clsidConfig`: `windows_sys`.`core`.`GUID`,
    public var `wszDisplayName`: UShortArray,
    public var `wszCallout`: UShortArray,
    public var `wszHardwareId`: UShortArray,
    public var `dwFlags1`: UInt,
)
// UNSUPPORTED Rust 1985:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYTYPEINFO_DX6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIJOYUSERVALUES` (
    public var `dwSize`: UInt,
    public var `ruv`: `JOYREGUSERVALUES`,
    public var `wszGlobalDriver`: UShortArray,
    public var `wszGameportEmulator`: UShortArray,
)
// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIJOYUSERVALUES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIJU_GAMEPORTEMULATOR`: UInt = 4u;
public const val `DIJU_GLOBALDRIVER`: UInt = 2u;
public const val `DIJU_USERVALUES`: UInt = 1u;
public const val `DIKEYBOARD_0`: UInt = 2164261899u;
public const val `DIKEYBOARD_1`: UInt = 2164261890u;
public const val `DIKEYBOARD_2`: UInt = 2164261891u;
public const val `DIKEYBOARD_3`: UInt = 2164261892u;
public const val `DIKEYBOARD_4`: UInt = 2164261893u;
public const val `DIKEYBOARD_5`: UInt = 2164261894u;
public const val `DIKEYBOARD_6`: UInt = 2164261895u;
public const val `DIKEYBOARD_7`: UInt = 2164261896u;
public const val `DIKEYBOARD_8`: UInt = 2164261897u;
public const val `DIKEYBOARD_9`: UInt = 2164261898u;
public const val `DIKEYBOARD_A`: UInt = 2164261918u;
public const val `DIKEYBOARD_ABNT_C1`: UInt = 2164262003u;
public const val `DIKEYBOARD_ABNT_C2`: UInt = 2164262014u;
public const val `DIKEYBOARD_ADD`: UInt = 2164261966u;
public const val `DIKEYBOARD_APOSTROPHE`: UInt = 2164261928u;
public const val `DIKEYBOARD_APPS`: UInt = 2164262109u;
public const val `DIKEYBOARD_AT`: UInt = 2164262033u;
public const val `DIKEYBOARD_AX`: UInt = 2164262038u;
public const val `DIKEYBOARD_B`: UInt = 2164261936u;
public const val `DIKEYBOARD_BACK`: UInt = 2164261902u;
public const val `DIKEYBOARD_BACKSLASH`: UInt = 2164261931u;
public const val `DIKEYBOARD_C`: UInt = 2164261934u;
public const val `DIKEYBOARD_CALCULATOR`: UInt = 2164262049u;
public const val `DIKEYBOARD_CAPITAL`: UInt = 2164261946u;
public const val `DIKEYBOARD_COLON`: UInt = 2164262034u;
public const val `DIKEYBOARD_COMMA`: UInt = 2164261939u;
public const val `DIKEYBOARD_CONVERT`: UInt = 2164262009u;
public const val `DIKEYBOARD_D`: UInt = 2164261920u;
public const val `DIKEYBOARD_DECIMAL`: UInt = 2164261971u;
public const val `DIKEYBOARD_DELETE`: UInt = 2164262099u;
public const val `DIKEYBOARD_DIVIDE`: UInt = 2164262069u;
public const val `DIKEYBOARD_DOWN`: UInt = 2164262096u;
public const val `DIKEYBOARD_E`: UInt = 2164261906u;
public const val `DIKEYBOARD_END`: UInt = 2164262095u;
public const val `DIKEYBOARD_EQUALS`: UInt = 2164261901u;
public const val `DIKEYBOARD_ESCAPE`: UInt = 2164261889u;
public const val `DIKEYBOARD_F`: UInt = 2164261921u;
public const val `DIKEYBOARD_F1`: UInt = 2164261947u;
public const val `DIKEYBOARD_F10`: UInt = 2164261956u;
public const val `DIKEYBOARD_F11`: UInt = 2164261975u;
public const val `DIKEYBOARD_F12`: UInt = 2164261976u;
public const val `DIKEYBOARD_F13`: UInt = 2164261988u;
public const val `DIKEYBOARD_F14`: UInt = 2164261989u;
public const val `DIKEYBOARD_F15`: UInt = 2164261990u;
public const val `DIKEYBOARD_F2`: UInt = 2164261948u;
public const val `DIKEYBOARD_F3`: UInt = 2164261949u;
public const val `DIKEYBOARD_F4`: UInt = 2164261950u;
public const val `DIKEYBOARD_F5`: UInt = 2164261951u;
public const val `DIKEYBOARD_F6`: UInt = 2164261952u;
public const val `DIKEYBOARD_F7`: UInt = 2164261953u;
public const val `DIKEYBOARD_F8`: UInt = 2164261954u;
public const val `DIKEYBOARD_F9`: UInt = 2164261955u;
public const val `DIKEYBOARD_G`: UInt = 2164261922u;
public const val `DIKEYBOARD_GRAVE`: UInt = 2164261929u;
public const val `DIKEYBOARD_H`: UInt = 2164261923u;
public const val `DIKEYBOARD_HOME`: UInt = 2164262087u;
public const val `DIKEYBOARD_I`: UInt = 2164261911u;
public const val `DIKEYBOARD_INSERT`: UInt = 2164262098u;
public const val `DIKEYBOARD_J`: UInt = 2164261924u;
public const val `DIKEYBOARD_K`: UInt = 2164261925u;
public const val `DIKEYBOARD_KANA`: UInt = 2164262000u;
public const val `DIKEYBOARD_KANJI`: UInt = 2164262036u;
public const val `DIKEYBOARD_L`: UInt = 2164261926u;
public const val `DIKEYBOARD_LBRACKET`: UInt = 2164261914u;
public const val `DIKEYBOARD_LCONTROL`: UInt = 2164261917u;
public const val `DIKEYBOARD_LEFT`: UInt = 2164262091u;
public const val `DIKEYBOARD_LMENU`: UInt = 2164261944u;
public const val `DIKEYBOARD_LSHIFT`: UInt = 2164261930u;
public const val `DIKEYBOARD_LWIN`: UInt = 2164262107u;
public const val `DIKEYBOARD_M`: UInt = 2164261938u;
public const val `DIKEYBOARD_MAIL`: UInt = 2164262124u;
public const val `DIKEYBOARD_MEDIASELECT`: UInt = 2164262125u;
public const val `DIKEYBOARD_MEDIASTOP`: UInt = 2164262052u;
public const val `DIKEYBOARD_MINUS`: UInt = 2164261900u;
public const val `DIKEYBOARD_MULTIPLY`: UInt = 2164261943u;
public const val `DIKEYBOARD_MUTE`: UInt = 2164262048u;
public const val `DIKEYBOARD_MYCOMPUTER`: UInt = 2164262123u;
public const val `DIKEYBOARD_N`: UInt = 2164261937u;
public const val `DIKEYBOARD_NEXT`: UInt = 2164262097u;
public const val `DIKEYBOARD_NEXTTRACK`: UInt = 2164262041u;
public const val `DIKEYBOARD_NOCONVERT`: UInt = 2164262011u;
public const val `DIKEYBOARD_NUMLOCK`: UInt = 2164261957u;
public const val `DIKEYBOARD_NUMPAD0`: UInt = 2164261970u;
public const val `DIKEYBOARD_NUMPAD1`: UInt = 2164261967u;
public const val `DIKEYBOARD_NUMPAD2`: UInt = 2164261968u;
public const val `DIKEYBOARD_NUMPAD3`: UInt = 2164261969u;
public const val `DIKEYBOARD_NUMPAD4`: UInt = 2164261963u;
public const val `DIKEYBOARD_NUMPAD5`: UInt = 2164261964u;
public const val `DIKEYBOARD_NUMPAD6`: UInt = 2164261965u;
public const val `DIKEYBOARD_NUMPAD7`: UInt = 2164261959u;
public const val `DIKEYBOARD_NUMPAD8`: UInt = 2164261960u;
public const val `DIKEYBOARD_NUMPAD9`: UInt = 2164261961u;
public const val `DIKEYBOARD_NUMPADCOMMA`: UInt = 2164262067u;
public const val `DIKEYBOARD_NUMPADENTER`: UInt = 2164262044u;
public const val `DIKEYBOARD_NUMPADEQUALS`: UInt = 2164262029u;
public const val `DIKEYBOARD_O`: UInt = 2164261912u;
public const val `DIKEYBOARD_OEM_102`: UInt = 2164261974u;
public const val `DIKEYBOARD_P`: UInt = 2164261913u;
public const val `DIKEYBOARD_PAUSE`: UInt = 2164262085u;
public const val `DIKEYBOARD_PERIOD`: UInt = 2164261940u;
public const val `DIKEYBOARD_PLAYPAUSE`: UInt = 2164262050u;
public const val `DIKEYBOARD_POWER`: UInt = 2164262110u;
public const val `DIKEYBOARD_PREVTRACK`: UInt = 2164262032u;
public const val `DIKEYBOARD_PRIOR`: UInt = 2164262089u;
public const val `DIKEYBOARD_Q`: UInt = 2164261904u;
public const val `DIKEYBOARD_R`: UInt = 2164261907u;
public const val `DIKEYBOARD_RBRACKET`: UInt = 2164261915u;
public const val `DIKEYBOARD_RCONTROL`: UInt = 2164262045u;
public const val `DIKEYBOARD_RETURN`: UInt = 2164261916u;
public const val `DIKEYBOARD_RIGHT`: UInt = 2164262093u;
public const val `DIKEYBOARD_RMENU`: UInt = 2164262072u;
public const val `DIKEYBOARD_RSHIFT`: UInt = 2164261942u;
public const val `DIKEYBOARD_RWIN`: UInt = 2164262108u;
public const val `DIKEYBOARD_S`: UInt = 2164261919u;
public const val `DIKEYBOARD_SCROLL`: UInt = 2164261958u;
public const val `DIKEYBOARD_SEMICOLON`: UInt = 2164261927u;
public const val `DIKEYBOARD_SLASH`: UInt = 2164261941u;
public const val `DIKEYBOARD_SLEEP`: UInt = 2164262111u;
public const val `DIKEYBOARD_SPACE`: UInt = 2164261945u;
public const val `DIKEYBOARD_STOP`: UInt = 2164262037u;
public const val `DIKEYBOARD_SUBTRACT`: UInt = 2164261962u;
public const val `DIKEYBOARD_SYSRQ`: UInt = 2164262071u;
public const val `DIKEYBOARD_T`: UInt = 2164261908u;
public const val `DIKEYBOARD_TAB`: UInt = 2164261903u;
public const val `DIKEYBOARD_U`: UInt = 2164261910u;
public const val `DIKEYBOARD_UNDERLINE`: UInt = 2164262035u;
public const val `DIKEYBOARD_UNLABELED`: UInt = 2164262039u;
public const val `DIKEYBOARD_UP`: UInt = 2164262088u;
public const val `DIKEYBOARD_V`: UInt = 2164261935u;
public const val `DIKEYBOARD_VOLUMEDOWN`: UInt = 2164262062u;
public const val `DIKEYBOARD_VOLUMEUP`: UInt = 2164262064u;
public const val `DIKEYBOARD_W`: UInt = 2164261905u;
public const val `DIKEYBOARD_WAKE`: UInt = 2164262115u;
public const val `DIKEYBOARD_WEBBACK`: UInt = 2164262122u;
public const val `DIKEYBOARD_WEBFAVORITES`: UInt = 2164262118u;
public const val `DIKEYBOARD_WEBFORWARD`: UInt = 2164262121u;
public const val `DIKEYBOARD_WEBHOME`: UInt = 2164262066u;
public const val `DIKEYBOARD_WEBREFRESH`: UInt = 2164262119u;
public const val `DIKEYBOARD_WEBSEARCH`: UInt = 2164262117u;
public const val `DIKEYBOARD_WEBSTOP`: UInt = 2164262120u;
public const val `DIKEYBOARD_X`: UInt = 2164261933u;
public const val `DIKEYBOARD_Y`: UInt = 2164261909u;
public const val `DIKEYBOARD_YEN`: UInt = 2164262013u;
public const val `DIKEYBOARD_Z`: UInt = 2164261932u;
public const val `DIK_0`: UInt = 11u;
public const val `DIK_1`: UInt = 2u;
public const val `DIK_2`: UInt = 3u;
public const val `DIK_3`: UInt = 4u;
public const val `DIK_4`: UInt = 5u;
public const val `DIK_5`: UInt = 6u;
public const val `DIK_6`: UInt = 7u;
public const val `DIK_7`: UInt = 8u;
public const val `DIK_8`: UInt = 9u;
public const val `DIK_9`: UInt = 10u;
public const val `DIK_A`: UInt = 30u;
public const val `DIK_ABNT_C1`: UInt = 115u;
public const val `DIK_ABNT_C2`: UInt = 126u;
public const val `DIK_ADD`: UInt = 78u;
public const val `DIK_APOSTROPHE`: UInt = 40u;
public const val `DIK_APPS`: UInt = 221u;
public const val `DIK_AT`: UInt = 145u;
public const val `DIK_AX`: UInt = 150u;
public const val `DIK_B`: UInt = 48u;
public const val `DIK_BACK`: UInt = 14u;
public const val `DIK_BACKSLASH`: UInt = 43u;
public const val `DIK_BACKSPACE`: UInt = 14u;
public const val `DIK_C`: UInt = 46u;
public const val `DIK_CALCULATOR`: UInt = 161u;
public const val `DIK_CAPITAL`: UInt = 58u;
public const val `DIK_CAPSLOCK`: UInt = 58u;
public const val `DIK_CIRCUMFLEX`: UInt = 144u;
public const val `DIK_COLON`: UInt = 146u;
public const val `DIK_COMMA`: UInt = 51u;
public const val `DIK_CONVERT`: UInt = 121u;
public const val `DIK_D`: UInt = 32u;
public const val `DIK_DECIMAL`: UInt = 83u;
public const val `DIK_DELETE`: UInt = 211u;
public const val `DIK_DIVIDE`: UInt = 181u;
public const val `DIK_DOWN`: UInt = 208u;
public const val `DIK_DOWNARROW`: UInt = 208u;
public const val `DIK_E`: UInt = 18u;
public const val `DIK_END`: UInt = 207u;
public const val `DIK_EQUALS`: UInt = 13u;
public const val `DIK_ESCAPE`: UInt = 1u;
public const val `DIK_F`: UInt = 33u;
public const val `DIK_F1`: UInt = 59u;
public const val `DIK_F10`: UInt = 68u;
public const val `DIK_F11`: UInt = 87u;
public const val `DIK_F12`: UInt = 88u;
public const val `DIK_F13`: UInt = 100u;
public const val `DIK_F14`: UInt = 101u;
public const val `DIK_F15`: UInt = 102u;
public const val `DIK_F2`: UInt = 60u;
public const val `DIK_F3`: UInt = 61u;
public const val `DIK_F4`: UInt = 62u;
public const val `DIK_F5`: UInt = 63u;
public const val `DIK_F6`: UInt = 64u;
public const val `DIK_F7`: UInt = 65u;
public const val `DIK_F8`: UInt = 66u;
public const val `DIK_F9`: UInt = 67u;
public const val `DIK_G`: UInt = 34u;
public const val `DIK_GRAVE`: UInt = 41u;
public const val `DIK_H`: UInt = 35u;
public const val `DIK_HOME`: UInt = 199u;
public const val `DIK_I`: UInt = 23u;
public const val `DIK_INSERT`: UInt = 210u;
public const val `DIK_J`: UInt = 36u;
public const val `DIK_K`: UInt = 37u;
public const val `DIK_KANA`: UInt = 112u;
public const val `DIK_KANJI`: UInt = 148u;
public const val `DIK_L`: UInt = 38u;
public const val `DIK_LALT`: UInt = 56u;
public const val `DIK_LBRACKET`: UInt = 26u;
public const val `DIK_LCONTROL`: UInt = 29u;
public const val `DIK_LEFT`: UInt = 203u;
public const val `DIK_LEFTARROW`: UInt = 203u;
public const val `DIK_LMENU`: UInt = 56u;
public const val `DIK_LSHIFT`: UInt = 42u;
public const val `DIK_LWIN`: UInt = 219u;
public const val `DIK_M`: UInt = 50u;
public const val `DIK_MAIL`: UInt = 236u;
public const val `DIK_MEDIASELECT`: UInt = 237u;
public const val `DIK_MEDIASTOP`: UInt = 164u;
public const val `DIK_MINUS`: UInt = 12u;
public const val `DIK_MULTIPLY`: UInt = 55u;
public const val `DIK_MUTE`: UInt = 160u;
public const val `DIK_MYCOMPUTER`: UInt = 235u;
public const val `DIK_N`: UInt = 49u;
public const val `DIK_NEXT`: UInt = 209u;
public const val `DIK_NEXTTRACK`: UInt = 153u;
public const val `DIK_NOCONVERT`: UInt = 123u;
public const val `DIK_NUMLOCK`: UInt = 69u;
public const val `DIK_NUMPAD0`: UInt = 82u;
public const val `DIK_NUMPAD1`: UInt = 79u;
public const val `DIK_NUMPAD2`: UInt = 80u;
public const val `DIK_NUMPAD3`: UInt = 81u;
public const val `DIK_NUMPAD4`: UInt = 75u;
public const val `DIK_NUMPAD5`: UInt = 76u;
public const val `DIK_NUMPAD6`: UInt = 77u;
public const val `DIK_NUMPAD7`: UInt = 71u;
public const val `DIK_NUMPAD8`: UInt = 72u;
public const val `DIK_NUMPAD9`: UInt = 73u;
public const val `DIK_NUMPADCOMMA`: UInt = 179u;
public const val `DIK_NUMPADENTER`: UInt = 156u;
public const val `DIK_NUMPADEQUALS`: UInt = 141u;
public const val `DIK_NUMPADMINUS`: UInt = 74u;
public const val `DIK_NUMPADPERIOD`: UInt = 83u;
public const val `DIK_NUMPADPLUS`: UInt = 78u;
public const val `DIK_NUMPADSLASH`: UInt = 181u;
public const val `DIK_NUMPADSTAR`: UInt = 55u;
public const val `DIK_O`: UInt = 24u;
public const val `DIK_OEM_102`: UInt = 86u;
public const val `DIK_P`: UInt = 25u;
public const val `DIK_PAUSE`: UInt = 197u;
public const val `DIK_PERIOD`: UInt = 52u;
public const val `DIK_PGDN`: UInt = 209u;
public const val `DIK_PGUP`: UInt = 201u;
public const val `DIK_PLAYPAUSE`: UInt = 162u;
public const val `DIK_POWER`: UInt = 222u;
public const val `DIK_PREVTRACK`: UInt = 144u;
public const val `DIK_PRIOR`: UInt = 201u;
public const val `DIK_Q`: UInt = 16u;
public const val `DIK_R`: UInt = 19u;
public const val `DIK_RALT`: UInt = 184u;
public const val `DIK_RBRACKET`: UInt = 27u;
public const val `DIK_RCONTROL`: UInt = 157u;
public const val `DIK_RETURN`: UInt = 28u;
public const val `DIK_RIGHT`: UInt = 205u;
public const val `DIK_RIGHTARROW`: UInt = 205u;
public const val `DIK_RMENU`: UInt = 184u;
public const val `DIK_RSHIFT`: UInt = 54u;
public const val `DIK_RWIN`: UInt = 220u;
public const val `DIK_S`: UInt = 31u;
public const val `DIK_SCROLL`: UInt = 70u;
public const val `DIK_SEMICOLON`: UInt = 39u;
public const val `DIK_SLASH`: UInt = 53u;
public const val `DIK_SLEEP`: UInt = 223u;
public const val `DIK_SPACE`: UInt = 57u;
public const val `DIK_STOP`: UInt = 149u;
public const val `DIK_SUBTRACT`: UInt = 74u;
public const val `DIK_SYSRQ`: UInt = 183u;
public const val `DIK_T`: UInt = 20u;
public const val `DIK_TAB`: UInt = 15u;
public const val `DIK_U`: UInt = 22u;
public const val `DIK_UNDERLINE`: UInt = 147u;
public const val `DIK_UNLABELED`: UInt = 151u;
public const val `DIK_UP`: UInt = 200u;
public const val `DIK_UPARROW`: UInt = 200u;
public const val `DIK_V`: UInt = 47u;
public const val `DIK_VOLUMEDOWN`: UInt = 174u;
public const val `DIK_VOLUMEUP`: UInt = 176u;
public const val `DIK_W`: UInt = 17u;
public const val `DIK_WAKE`: UInt = 227u;
public const val `DIK_WEBBACK`: UInt = 234u;
public const val `DIK_WEBFAVORITES`: UInt = 230u;
public const val `DIK_WEBFORWARD`: UInt = 233u;
public const val `DIK_WEBHOME`: UInt = 178u;
public const val `DIK_WEBREFRESH`: UInt = 231u;
public const val `DIK_WEBSEARCH`: UInt = 229u;
public const val `DIK_WEBSTOP`: UInt = 232u;
public const val `DIK_X`: UInt = 45u;
public const val `DIK_Y`: UInt = 21u;
public const val `DIK_YEN`: UInt = 125u;
public const val `DIK_Z`: UInt = 44u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIMOUSESTATE` (
    public var `lX`: Int,
    public var `lY`: Int,
    public var `lZ`: Int,
    public var `rgbButtons`: UByteArray,
)
// UNSUPPORTED Rust 2318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIMOUSESTATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIMOUSESTATE2` (
    public var `lX`: Int,
    public var `lY`: Int,
    public var `lZ`: Int,
    public var `rgbButtons`: UByteArray,
)
// UNSUPPORTED Rust 2331:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIMOUSESTATE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIMSGWP_DX8APPSTART`: UInt = 2u;
public const val `DIMSGWP_DX8MAPPERAPPSTART`: UInt = 3u;
public const val `DIMSGWP_NEWAPPSTART`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIOBJECTATTRIBUTES` (
    public var `dwFlags`: UInt,
    public var `wUsagePage`: UShort,
    public var `wUsage`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIOBJECTCALIBRATION` (
    public var `lMin`: Int,
    public var `lCenter`: Int,
    public var `lMax`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIOBJECTDATAFORMAT` (
    public var `pguid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwOfs`: UInt,
    public var `dwType`: UInt,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 2361:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIOBJECTDATAFORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIPERIODIC` (
    public var `dwMagnitude`: UInt,
    public var `lOffset`: Int,
    public var `dwPhase`: UInt,
    public var `dwPeriod`: UInt,
)
public const val `DIPH_BYID`: UInt = 2u;
public const val `DIPH_BYOFFSET`: UInt = 1u;
public const val `DIPH_BYUSAGE`: UInt = 3u;
public const val `DIPH_DEVICE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIPOVCALIBRATION` (
    public var `lMin`: IntArray,
    public var `lMax`: IntArray,
)
// UNSUPPORTED Rust 2384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIPOVCALIBRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIPOV_ANY_1`: UInt = 4278208001u;
public const val `DIPOV_ANY_2`: UInt = 4278208002u;
public const val `DIPOV_ANY_3`: UInt = 4278208003u;
public const val `DIPOV_ANY_4`: UInt = 4278208004u;
public const val `DIPROPAUTOCENTER_OFF`: UInt = 0u;
public const val `DIPROPAUTOCENTER_ON`: UInt = 1u;
public const val `DIPROPAXISMODE_ABS`: UInt = 0u;
public const val `DIPROPAXISMODE_REL`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIPROPCAL` (
    public var `diph`: `DIPROPHEADER`,
    public var `lMin`: Int,
    public var `lCenter`: Int,
    public var `lMax`: Int,
)
public const val `DIPROPCALIBRATIONMODE_COOKED`: UInt = 0u;
public const val `DIPROPCALIBRATIONMODE_RAW`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIPROPCALPOV` (
    public var `diph`: `DIPROPHEADER`,
    public var `lMin`: IntArray,
    public var `lMax`: IntArray,
)
// UNSUPPORTED Rust 2414:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIPROPCALPOV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIPROPCPOINTS` (
    public var `diph`: `DIPROPHEADER`,
    public var `dwCPointsNum`: UInt,
    public var `cp`: Array<`CPOINT`>,
)
// UNSUPPORTED Rust 2426:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIPROPCPOINTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIPROPDWORD` (
    public var `diph`: `DIPROPHEADER`,
    public var `dwData`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIPROPGUIDANDPATH` (
    public var `diph`: `DIPROPHEADER`,
    public var `guidClass`: `windows_sys`.`core`.`GUID`,
    public var `wszPath`: UShortArray,
)
// UNSUPPORTED Rust 2444:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIPROPGUIDANDPATH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIPROPHEADER` (
    public var `dwSize`: UInt,
    public var `dwHeaderSize`: UInt,
    public var `dwObj`: UInt,
    public var `dwHow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIPROPPOINTER` (
    public var `diph`: `DIPROPHEADER`,
    public var `uData`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIPROPRANGE` (
    public var `diph`: `DIPROPHEADER`,
    public var `lMin`: Int,
    public var `lMax`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIPROPSTRING` (
    public var `diph`: `DIPROPHEADER`,
    public var `wsz`: UShortArray,
)
// UNSUPPORTED Rust 2476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIPROPSTRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_APPDATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000016);

// UNSUPPORTED Rust 2482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_AUTOCENTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000009);

// UNSUPPORTED Rust 2483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_AXISMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000002);

// UNSUPPORTED Rust 2484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_BUFFERSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000001);

// UNSUPPORTED Rust 2485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_CALIBRATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000000b);

// UNSUPPORTED Rust 2486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_CALIBRATIONMODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000000a);

// UNSUPPORTED Rust 2487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_CPOINTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000015);

// UNSUPPORTED Rust 2488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_DEADZONE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000005);

// UNSUPPORTED Rust 2489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_FFGAIN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000007);

// UNSUPPORTED Rust 2490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_FFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000008);

// UNSUPPORTED Rust 2491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_GETPORTDISPLAYNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000010);

// UNSUPPORTED Rust 2492:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_GRANULARITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000003);

// UNSUPPORTED Rust 2493:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_GUIDANDPATH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000000c);

// UNSUPPORTED Rust 2494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_INSTANCENAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000000d);

// UNSUPPORTED Rust 2495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_JOYSTICKID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000000f);

// UNSUPPORTED Rust 2496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_KEYNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000014);

// UNSUPPORTED Rust 2497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_LOGICALRANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000013);

// UNSUPPORTED Rust 2498:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_PHYSICALRANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000012);

// UNSUPPORTED Rust 2499:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_PRODUCTNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000000e);

// UNSUPPORTED Rust 2500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_RANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000004);

// UNSUPPORTED Rust 2501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_SATURATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000006);

// UNSUPPORTED Rust 2502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_SCANCODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000017);

// UNSUPPORTED Rust 2503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_TYPENAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_00000000001a);

// UNSUPPORTED Rust 2504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_USERNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000019);

// UNSUPPORTED Rust 2505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIPROP_VIDPID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000018);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIRAMPFORCE` (
    public var `lStart`: Int,
    public var `lEnd`: Int,
)
public const val `DIRECTINPUT_HEADER_VERSION`: UInt = 2048u;
// UNSUPPORTED Rust 2513:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_NOTIFICATION_MSGSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("DIRECTINPUT_NOTIFICATION_MSGSTRING");

// UNSUPPORTED Rust 2514:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_NOTIFICATION_MSGSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("DIRECTINPUT_NOTIFICATION_MSGSTRING");

// UNSUPPORTED Rust 2515:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_NOTIFICATION_MSGSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("DIRECTINPUT_NOTIFICATION_MSGSTRING");

// UNSUPPORTED Rust 2516:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_KEY_LASTAPP: windows_sys::core::PCWSTR = windows_sys::core::w!("MostRecentApplication");

// UNSUPPORTED Rust 2517:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_KEY_LASTAPPA: windows_sys::core::PCSTR = windows_sys::core::s!("MostRecentApplication");

// UNSUPPORTED Rust 2518:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_KEY_LASTAPPW: windows_sys::core::PCWSTR = windows_sys::core::w!("MostRecentApplication");

// UNSUPPORTED Rust 2519:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_KEY_LASTMAPAPP: windows_sys::core::PCWSTR = windows_sys::core::w!("MostRecentMapperApplication");

// UNSUPPORTED Rust 2520:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_KEY_LASTMAPAPPA: windows_sys::core::PCSTR = windows_sys::core::s!("MostRecentMapperApplication");

// UNSUPPORTED Rust 2521:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_KEY_LASTMAPAPPW: windows_sys::core::PCWSTR = windows_sys::core::w!("MostRecentMapperApplication");

// UNSUPPORTED Rust 2522:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_APPIDFLAG: windows_sys::core::PCWSTR = windows_sys::core::w!("AppIdFlag");

// UNSUPPORTED Rust 2523:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_APPIDFLAGA: windows_sys::core::PCSTR = windows_sys::core::s!("AppIdFlag");

// UNSUPPORTED Rust 2524:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_APPIDFLAGW: windows_sys::core::PCWSTR = windows_sys::core::w!("AppIdFlag");

// UNSUPPORTED Rust 2525:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("Id");

// UNSUPPORTED Rust 2526:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_IDA: windows_sys::core::PCSTR = windows_sys::core::s!("Id");

// UNSUPPORTED Rust 2527:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_IDW: windows_sys::core::PCWSTR = windows_sys::core::w!("Id");

// UNSUPPORTED Rust 2528:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_LASTSTART: windows_sys::core::PCWSTR = windows_sys::core::w!("MostRecentStart");

// UNSUPPORTED Rust 2529:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_LASTSTARTA: windows_sys::core::PCSTR = windows_sys::core::s!("MostRecentStart");

// UNSUPPORTED Rust 2530:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_LASTSTARTW: windows_sys::core::PCWSTR = windows_sys::core::w!("MostRecentStart");

// UNSUPPORTED Rust 2531:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_MAPPER: windows_sys::core::PCWSTR = windows_sys::core::w!("UsesMapper");

// UNSUPPORTED Rust 2532:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_MAPPERA: windows_sys::core::PCSTR = windows_sys::core::s!("UsesMapper");

// UNSUPPORTED Rust 2533:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_MAPPERW: windows_sys::core::PCWSTR = windows_sys::core::w!("UsesMapper");

// UNSUPPORTED Rust 2534:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 2535:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_NAMEA: windows_sys::core::PCSTR = windows_sys::core::s!("Name");

// UNSUPPORTED Rust 2536:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_NAMEW: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 2537:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 2538:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_VERSIONA: windows_sys::core::PCSTR = windows_sys::core::s!("Version");

// UNSUPPORTED Rust 2539:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DIRECTINPUT_REGSTR_VAL_VERSIONW: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

public const val `DIRECTINPUT_VERSION`: UInt = 2048u;
public const val `DISCL_BACKGROUND`: UInt = 8u;
public const val `DISCL_EXCLUSIVE`: UInt = 1u;
public const val `DISCL_FOREGROUND`: UInt = 4u;
public const val `DISCL_NONEXCLUSIVE`: UInt = 2u;
public const val `DISCL_NOWINKEY`: UInt = 16u;
public const val `DISDD_CONTINUE`: UInt = 1u;
public const val `DISFFC_CONTINUE`: UInt = 8u;
public const val `DISFFC_PAUSE`: UInt = 4u;
public const val `DISFFC_RESET`: UInt = 1u;
public const val `DISFFC_SETACTUATORSOFF`: UInt = 32u;
public const val `DISFFC_SETACTUATORSON`: UInt = 16u;
public const val `DISFFC_STOPALL`: UInt = 2u;
public const val `DITC_CALLOUT`: UInt = 8u;
public const val `DITC_CLSIDCONFIG`: UInt = 2u;
public const val `DITC_DISPLAYNAME`: UInt = 4u;
public const val `DITC_FLAGS1`: UInt = 32u;
public const val `DITC_FLAGS2`: UInt = 64u;
public const val `DITC_HARDWAREID`: UInt = 16u;
public const val `DITC_MAPFILE`: UInt = 128u;
public const val `DITC_REGHWSETTINGS`: UInt = 1u;
public const val `DIVIRTUAL_ARCADE_PLATFORM`: UInt = 570425344u;
public const val `DIVIRTUAL_ARCADE_SIDE2SIDE`: UInt = 553648128u;
public const val `DIVIRTUAL_BROWSER_CONTROL`: UInt = 671088640u;
public const val `DIVIRTUAL_CAD_2DCONTROL`: UInt = 587202560u;
public const val `DIVIRTUAL_CAD_3DCONTROL`: UInt = 603979776u;
public const val `DIVIRTUAL_CAD_FLYBY`: UInt = 620756992u;
public const val `DIVIRTUAL_CAD_MODEL`: UInt = 637534208u;
public const val `DIVIRTUAL_DRIVING_COMBAT`: UInt = 33554432u;
public const val `DIVIRTUAL_DRIVING_MECHA`: UInt = 687865856u;
public const val `DIVIRTUAL_DRIVING_RACE`: UInt = 16777216u;
public const val `DIVIRTUAL_DRIVING_TANK`: UInt = 50331648u;
public const val `DIVIRTUAL_FIGHTING_FPS`: UInt = 150994944u;
public const val `DIVIRTUAL_FIGHTING_HAND2HAND`: UInt = 134217728u;
public const val `DIVIRTUAL_FIGHTING_THIRDPERSON`: UInt = 167772160u;
public const val `DIVIRTUAL_FLYING_CIVILIAN`: UInt = 67108864u;
public const val `DIVIRTUAL_FLYING_HELICOPTER`: UInt = 100663296u;
public const val `DIVIRTUAL_FLYING_MILITARY`: UInt = 83886080u;
public const val `DIVIRTUAL_REMOTE_CONTROL`: UInt = 654311424u;
public const val `DIVIRTUAL_SPACESIM`: UInt = 117440512u;
public const val `DIVIRTUAL_SPORTS_BASEBALL_BAT`: UInt = 251658240u;
public const val `DIVIRTUAL_SPORTS_BASEBALL_FIELD`: UInt = 285212672u;
public const val `DIVIRTUAL_SPORTS_BASEBALL_PITCH`: UInt = 268435456u;
public const val `DIVIRTUAL_SPORTS_BASKETBALL_DEFENSE`: UInt = 318767104u;
public const val `DIVIRTUAL_SPORTS_BASKETBALL_OFFENSE`: UInt = 301989888u;
public const val `DIVIRTUAL_SPORTS_BIKING_MOUNTAIN`: UInt = 469762048u;
public const val `DIVIRTUAL_SPORTS_FISHING`: UInt = 234881024u;
public const val `DIVIRTUAL_SPORTS_FOOTBALL_DEFENSE`: UInt = 385875968u;
public const val `DIVIRTUAL_SPORTS_FOOTBALL_FIELD`: UInt = 335544320u;
public const val `DIVIRTUAL_SPORTS_FOOTBALL_OFFENSE`: UInt = 369098752u;
public const val `DIVIRTUAL_SPORTS_FOOTBALL_QBCK`: UInt = 352321536u;
public const val `DIVIRTUAL_SPORTS_GOLF`: UInt = 402653184u;
public const val `DIVIRTUAL_SPORTS_HOCKEY_DEFENSE`: UInt = 436207616u;
public const val `DIVIRTUAL_SPORTS_HOCKEY_GOALIE`: UInt = 452984832u;
public const val `DIVIRTUAL_SPORTS_HOCKEY_OFFENSE`: UInt = 419430400u;
public const val `DIVIRTUAL_SPORTS_HUNTING`: UInt = 218103808u;
public const val `DIVIRTUAL_SPORTS_RACQUET`: UInt = 536870912u;
public const val `DIVIRTUAL_SPORTS_SKIING`: UInt = 486539264u;
public const val `DIVIRTUAL_SPORTS_SOCCER_DEFENSE`: UInt = 520093696u;
public const val `DIVIRTUAL_SPORTS_SOCCER_OFFENSE`: UInt = 503316480u;
public const val `DIVIRTUAL_STRATEGY_ROLEPLAYING`: UInt = 184549376u;
public const val `DIVIRTUAL_STRATEGY_TURN`: UInt = 201326592u;
public const val `DIVOICE_ALL`: UInt = 2197816330u;
public const val `DIVOICE_CHANNEL1`: UInt = 2197816321u;
public const val `DIVOICE_CHANNEL2`: UInt = 2197816322u;
public const val `DIVOICE_CHANNEL3`: UInt = 2197816323u;
public const val `DIVOICE_CHANNEL4`: UInt = 2197816324u;
public const val `DIVOICE_CHANNEL5`: UInt = 2197816325u;
public const val `DIVOICE_CHANNEL6`: UInt = 2197816326u;
public const val `DIVOICE_CHANNEL7`: UInt = 2197816327u;
public const val `DIVOICE_CHANNEL8`: UInt = 2197816328u;
public const val `DIVOICE_PLAYBACKMUTE`: UInt = 2197816332u;
public const val `DIVOICE_RECORDMUTE`: UInt = 2197816331u;
public const val `DIVOICE_TEAM`: UInt = 2197816329u;
public const val `DIVOICE_TRANSMIT`: UInt = 2197816333u;
public const val `DIVOICE_VOICECOMMAND`: UInt = 2197816336u;
public const val `DI_BUFFEROVERFLOW`: Int = 1;
public const val `DI_DEGREES`: UInt = 100u;
public const val `DI_DOWNLOADSKIPPED`: Int = 3;
public const val `DI_EFFECTRESTARTED`: Int = 4;
public const val `DI_FFNOMINALMAX`: UInt = 10000u;
public const val `DI_NOEFFECT`: Int = 1;
public const val `DI_NOTATTACHED`: Int = 1;
public const val `DI_OK`: Int = 0;
public const val `DI_POLLEDDEVICE`: Int = 2;
public const val `DI_PROPNOEFFECT`: Int = 1;
public const val `DI_SECONDS`: UInt = 1000000u;
public const val `DI_SETTINGSNOTSAVED`: Int = 11;
public const val `DI_TRUNCATED`: Int = 8;
public const val `DI_TRUNCATEDANDRESTARTED`: Int = 12;
public const val `DI_WRITEPROTECT`: Int = 19;
public typealias `GPIOBUTTONS_BUTTON_TYPE` = Int;
public const val `GPIO_BUTTON_BACK`: `GPIOBUTTONS_BUTTON_TYPE` = 5;
public const val `GPIO_BUTTON_CAMERA_FOCUS`: `GPIOBUTTONS_BUTTON_TYPE` = 7;
public const val `GPIO_BUTTON_CAMERA_LENS`: `GPIOBUTTONS_BUTTON_TYPE` = 12;
public const val `GPIO_BUTTON_CAMERA_SHUTTER`: `GPIOBUTTONS_BUTTON_TYPE` = 8;
public const val `GPIO_BUTTON_COUNT`: `GPIOBUTTONS_BUTTON_TYPE` = 16;
public const val `GPIO_BUTTON_COUNT_MIN`: `GPIOBUTTONS_BUTTON_TYPE` = 5;
public const val `GPIO_BUTTON_HEADSET`: `GPIOBUTTONS_BUTTON_TYPE` = 10;
public const val `GPIO_BUTTON_HWKB_DEPLOY`: `GPIOBUTTONS_BUTTON_TYPE` = 11;
public const val `GPIO_BUTTON_OEM_CUSTOM`: `GPIOBUTTONS_BUTTON_TYPE` = 13;
public const val `GPIO_BUTTON_OEM_CUSTOM2`: `GPIOBUTTONS_BUTTON_TYPE` = 14;
public const val `GPIO_BUTTON_OEM_CUSTOM3`: `GPIOBUTTONS_BUTTON_TYPE` = 15;
public const val `GPIO_BUTTON_POWER`: `GPIOBUTTONS_BUTTON_TYPE` = 0;
public const val `GPIO_BUTTON_RINGER_TOGGLE`: `GPIOBUTTONS_BUTTON_TYPE` = 9;
public const val `GPIO_BUTTON_ROTATION_LOCK`: `GPIOBUTTONS_BUTTON_TYPE` = 4;
public const val `GPIO_BUTTON_SEARCH`: `GPIOBUTTONS_BUTTON_TYPE` = 6;
public const val `GPIO_BUTTON_VOLUME_DOWN`: `GPIOBUTTONS_BUTTON_TYPE` = 3;
public const val `GPIO_BUTTON_VOLUME_UP`: `GPIOBUTTONS_BUTTON_TYPE` = 2;
public const val `GPIO_BUTTON_WINDOWS`: `GPIOBUTTONS_BUTTON_TYPE` = 1;
// UNSUPPORTED Rust 2650:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Button: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02f0_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2651:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ConstantForce: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c20_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2652:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_CustomForce: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c2b_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2653:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_HID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d1e55b2_f16f_11cf_88cb_001111000030);

// UNSUPPORTED Rust 2654:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_KEYBOARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884b96c3_56ef_11d1_bc8c_00a0c91405dd);

// UNSUPPORTED Rust 2655:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_MOUSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x378de44c_56ef_11d1_bc8c_00a0c91405dd);

// UNSUPPORTED Rust 2656:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Damper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c28_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2657:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Friction: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c2a_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2658:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HIDClass: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x745a17a0_74d3_11d0_b6fe_00a0c90f57da);

// UNSUPPORTED Rust 2659:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HID_INTERFACE_HIDPARSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5c315a5_69ac_4bc2_9279_d0b64576f44b);

// UNSUPPORTED Rust 2660:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HID_INTERFACE_NOTIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c4e2e88_25e6_4c33_882f_3d82e6073681);

// UNSUPPORTED Rust 2661:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Inertia: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c29_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2662:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Joystick: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b70_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2663:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Key: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55728220_d33c_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2664:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_KeyboardClass: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96b_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2665:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MediaClass: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96c_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2666:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_MouseClass: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96f_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2667:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_POV: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02f2_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2668:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_RampForce: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c21_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2669:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_RxAxis: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02f4_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2670:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_RyAxis: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02f5_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2671:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_RzAxis: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02e3_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2672:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SawtoothDown: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c26_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2673:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SawtoothUp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c25_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2674:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Sine: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c23_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2675:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Slider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02e4_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2676:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Spring: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c27_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2677:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Square: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c22_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2678:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SysKeyboard: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b61_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2679:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SysKeyboardEm: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b82_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2680:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SysKeyboardEm2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b83_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2681:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SysMouse: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b60_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2682:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SysMouseEm: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b80_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2683:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SysMouseEm2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f1d2b81_d5a0_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2684:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Triangle: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13541c24_8e33_11d0_9ad0_00a0c9a06e35);

// UNSUPPORTED Rust 2685:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_Unknown: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02f3_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2686:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_XAxis: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02e0_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2687:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_YAxis: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02e1_c9f3_11cf_bfc7_444553540000);

// UNSUPPORTED Rust 2688:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_ZAxis: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa36d02e2_c9f3_11cf_bfc7_444553540000);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDD_ATTRIBUTES` (
    public var `Size`: UInt,
    public var `VendorID`: UShort,
    public var `ProductID`: UShort,
    public var `VersionNumber`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDD_CONFIGURATION` (
    public var `cookie`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `size`: UInt,
    public var `RingBufferSize`: UInt,
)
// UNSUPPORTED Rust 2704:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDD_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDP_BUTTON_ARRAY_DATA` (
    public var `ArrayIndex`: UShort,
    public var `On`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_BUTTON_CAPS` (
    public var `UsagePage`: UShort,
    public var `ReportID`: UByte,
    public var `IsAlias`: Boolean,
    public var `BitField`: UShort,
    public var `LinkCollection`: UShort,
    public var `LinkUsage`: UShort,
    public var `LinkUsagePage`: UShort,
    public var `IsRange`: Boolean,
    public var `IsStringRange`: Boolean,
    public var `IsDesignatorRange`: Boolean,
    public var `IsAbsolute`: Boolean,
    public var `ReportCount`: UShort,
    public var `Reserved2`: UShort,
    public var `Reserved`: UIntArray,
    public var `Anonymous`: `HIDP_BUTTON_CAPS_0`,
)
// UNSUPPORTED Rust 2734:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_BUTTON_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2739:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HIDP_BUTTON_CAPS_0 {
//     pub Range: HIDP_BUTTON_CAPS_0_0,
//     pub NotRange: HIDP_BUTTON_CAPS_0_1,
// }

// UNSUPPORTED Rust 2745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_BUTTON_CAPS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDP_BUTTON_CAPS_0_1` (
    public var `Usage`: UShort,
    public var `Reserved1`: UShort,
    public var `StringIndex`: UShort,
    public var `Reserved2`: UShort,
    public var `DesignatorIndex`: UShort,
    public var `Reserved3`: UShort,
    public var `DataIndex`: UShort,
    public var `Reserved4`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDP_BUTTON_CAPS_0_0` (
    public var `UsageMin`: UShort,
    public var `UsageMax`: UShort,
    public var `StringMin`: UShort,
    public var `StringMax`: UShort,
    public var `DesignatorMin`: UShort,
    public var `DesignatorMax`: UShort,
    public var `DataIndexMin`: UShort,
    public var `DataIndexMax`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_CAPS` (
    public var `Usage`: UShort,
    public var `UsagePage`: UShort,
    public var `InputReportByteLength`: UShort,
    public var `OutputReportByteLength`: UShort,
    public var `FeatureReportByteLength`: UShort,
    public var `Reserved`: UShortArray,
    public var `NumberLinkCollectionNodes`: UShort,
    public var `NumberInputButtonCaps`: UShort,
    public var `NumberInputValueCaps`: UShort,
    public var `NumberInputDataIndices`: UShort,
    public var `NumberOutputButtonCaps`: UShort,
    public var `NumberOutputValueCaps`: UShort,
    public var `NumberOutputDataIndices`: UShort,
    public var `NumberFeatureButtonCaps`: UShort,
    public var `NumberFeatureValueCaps`: UShort,
    public var `NumberFeatureDataIndices`: UShort,
)
// UNSUPPORTED Rust 2794:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_DATA` (
    public var `DataIndex`: UShort,
    public var `Reserved`: UShort,
    public var `Anonymous`: `HIDP_DATA_0`,
)
// UNSUPPORTED Rust 2806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2811:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HIDP_DATA_0 {
//     pub RawValue: u32,
//     pub On: bool,
// }

// UNSUPPORTED Rust 2817:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_EXTENDED_ATTRIBUTES` (
    public var `NumGlobalUnknowns`: UByte,
    public var `Reserved`: UByteArray,
    public var `GlobalUnknowns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HIDP_UNKNOWN_TOKEN`>?,
    public var `Data`: UIntArray,
)
// UNSUPPORTED Rust 2830:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_EXTENDED_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HIDP_KEYBOARD_DIRECTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_KEYBOARD_MODIFIER_STATE` (
    public var `Anonymous`: `HIDP_KEYBOARD_MODIFIER_STATE_0`,
)
// UNSUPPORTED Rust 2841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_KEYBOARD_MODIFIER_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2846:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HIDP_KEYBOARD_MODIFIER_STATE_0 {
//     pub Anonymous: HIDP_KEYBOARD_MODIFIER_STATE_0_0,
//     pub ul: u32,
// }

// UNSUPPORTED Rust 2852:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_KEYBOARD_MODIFIER_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDP_KEYBOARD_MODIFIER_STATE_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_LINK_COLLECTION_NODE` (
    public var `LinkUsage`: UShort,
    public var `LinkUsagePage`: UShort,
    public var `Parent`: UShort,
    public var `NumberOfChildren`: UShort,
    public var `NextSibling`: UShort,
    public var `FirstChild`: UShort,
    public var `_bitfield`: UInt,
    public var `UserContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_LINK_COLLECTION_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HIDP_REPORT_TYPE` = Int;
// UNSUPPORTED Rust 2880:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_BAD_LOG_PHY_VALUES: super::super::Foundation::NTSTATUS = 0xC0110006_u32 as _;

// UNSUPPORTED Rust 2881:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_BUFFER_TOO_SMALL: super::super::Foundation::NTSTATUS = 0xC0110007_u32 as _;

// UNSUPPORTED Rust 2882:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_BUTTON_NOT_PRESSED: super::super::Foundation::NTSTATUS = 0xC011000F_u32 as _;

// UNSUPPORTED Rust 2883:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_DATA_INDEX_NOT_FOUND: super::super::Foundation::NTSTATUS = 0xC011000D_u32 as _;

// UNSUPPORTED Rust 2884:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_DATA_INDEX_OUT_OF_RANGE: super::super::Foundation::NTSTATUS = 0xC011000E_u32 as _;

// UNSUPPORTED Rust 2885:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_I8042_TRANS_UNKNOWN: super::super::Foundation::NTSTATUS = 0xC0110009_u32 as _;

// UNSUPPORTED Rust 2886:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_I8242_TRANS_UNKNOWN: super::super::Foundation::NTSTATUS = 0xC0110009_u32 as _;

// UNSUPPORTED Rust 2887:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_INCOMPATIBLE_REPORT_ID: super::super::Foundation::NTSTATUS = 0xC011000A_u32 as _;

// UNSUPPORTED Rust 2888:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_INTERNAL_ERROR: super::super::Foundation::NTSTATUS = 0xC0110008_u32 as _;

// UNSUPPORTED Rust 2889:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_INVALID_PREPARSED_DATA: super::super::Foundation::NTSTATUS = 0xC0110001_u32 as _;

// UNSUPPORTED Rust 2890:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_INVALID_REPORT_LENGTH: super::super::Foundation::NTSTATUS = 0xC0110003_u32 as _;

// UNSUPPORTED Rust 2891:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_INVALID_REPORT_TYPE: super::super::Foundation::NTSTATUS = 0xC0110002_u32 as _;

// UNSUPPORTED Rust 2892:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_IS_VALUE_ARRAY: super::super::Foundation::NTSTATUS = 0xC011000C_u32 as _;

// UNSUPPORTED Rust 2893:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_NOT_BUTTON_ARRAY: super::super::Foundation::NTSTATUS = 0xC0110021_u32 as _;

// UNSUPPORTED Rust 2894:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_NOT_IMPLEMENTED: super::super::Foundation::NTSTATUS = 0xC0110020_u32 as _;

// UNSUPPORTED Rust 2895:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_NOT_VALUE_ARRAY: super::super::Foundation::NTSTATUS = 0xC011000B_u32 as _;

// UNSUPPORTED Rust 2896:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_NULL: super::super::Foundation::NTSTATUS = 0x80110001_u32 as _;

// UNSUPPORTED Rust 2897:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_REPORT_DOES_NOT_EXIST: super::super::Foundation::NTSTATUS = 0xC0110010_u32 as _;

// UNSUPPORTED Rust 2898:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_SUCCESS: super::super::Foundation::NTSTATUS = 0x110000_u32 as _;

// UNSUPPORTED Rust 2899:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_USAGE_NOT_FOUND: super::super::Foundation::NTSTATUS = 0xC0110004_u32 as _;

// UNSUPPORTED Rust 2900:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const HIDP_STATUS_VALUE_OUT_OF_RANGE: super::super::Foundation::NTSTATUS = 0xC0110005_u32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_UNKNOWN_TOKEN` (
    public var `Token`: UByte,
    public var `Reserved`: UByteArray,
    public var `BitField`: UInt,
)
// UNSUPPORTED Rust 2908:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_UNKNOWN_TOKEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIDP_VALUE_CAPS` (
    public var `UsagePage`: UShort,
    public var `ReportID`: UByte,
    public var `IsAlias`: Boolean,
    public var `BitField`: UShort,
    public var `LinkCollection`: UShort,
    public var `LinkUsage`: UShort,
    public var `LinkUsagePage`: UShort,
    public var `IsRange`: Boolean,
    public var `IsStringRange`: Boolean,
    public var `IsDesignatorRange`: Boolean,
    public var `IsAbsolute`: Boolean,
    public var `HasNull`: Boolean,
    public var `Reserved`: UByte,
    public var `BitSize`: UShort,
    public var `ReportCount`: UShort,
    public var `Reserved2`: UShortArray,
    public var `UnitsExp`: UInt,
    public var `Units`: UInt,
    public var `LogicalMin`: Int,
    public var `LogicalMax`: Int,
    public var `PhysicalMin`: Int,
    public var `PhysicalMax`: Int,
    public var `Anonymous`: `HIDP_VALUE_CAPS_0`,
)
// UNSUPPORTED Rust 2940:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_VALUE_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2945:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HIDP_VALUE_CAPS_0 {
//     pub Range: HIDP_VALUE_CAPS_0_0,
//     pub NotRange: HIDP_VALUE_CAPS_0_1,
// }

// UNSUPPORTED Rust 2951:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIDP_VALUE_CAPS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDP_VALUE_CAPS_0_1` (
    public var `Usage`: UShort,
    public var `Reserved1`: UShort,
    public var `StringIndex`: UShort,
    public var `Reserved2`: UShort,
    public var `DesignatorIndex`: UShort,
    public var `Reserved3`: UShort,
    public var `DataIndex`: UShort,
    public var `Reserved4`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HIDP_VALUE_CAPS_0_0` (
    public var `UsageMin`: UShort,
    public var `UsageMax`: UShort,
    public var `StringMin`: UShort,
    public var `StringMax`: UShort,
    public var `DesignatorMin`: UShort,
    public var `DesignatorMax`: UShort,
    public var `DataIndexMin`: UShort,
    public var `DataIndexMax`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HID_COLLECTION_INFORMATION` (
    public var `DescriptorSize`: UInt,
    public var `Polled`: Boolean,
    public var `Reserved1`: UByteArray,
    public var `VendorID`: UShort,
    public var `ProductID`: UShort,
    public var `VersionNumber`: UShort,
)
// UNSUPPORTED Rust 2990:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HID_COLLECTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HID_DRIVER_CONFIG` (
    public var `Size`: UInt,
    public var `RingBufferSize`: UInt,
)
public const val `HID_REVISION`: UInt = 1u;
public const val `HID_USAGE_ALPHANUMERIC_14_SEGMENT_DIRECT_MAP`: UShort = 69u;
public const val `HID_USAGE_ALPHANUMERIC_7_SEGMENT_DIRECT_MAP`: UShort = 67u;
public const val `HID_USAGE_ALPHANUMERIC_ALPHANUMERIC_DISPLAY`: UShort = 1u;
public const val `HID_USAGE_ALPHANUMERIC_ASCII_CHARACTER_SET`: UShort = 33u;
public const val `HID_USAGE_ALPHANUMERIC_ATTRIBUTE_DATA`: UShort = 74u;
public const val `HID_USAGE_ALPHANUMERIC_ATTRIBUTE_READBACK`: UShort = 73u;
public const val `HID_USAGE_ALPHANUMERIC_BITMAPPED_DISPLAY`: UShort = 2u;
public const val `HID_USAGE_ALPHANUMERIC_BITMAP_SIZE_X`: UShort = 128u;
public const val `HID_USAGE_ALPHANUMERIC_BITMAP_SIZE_Y`: UShort = 129u;
public const val `HID_USAGE_ALPHANUMERIC_BIT_DEPTH_FORMAT`: UShort = 131u;
public const val `HID_USAGE_ALPHANUMERIC_BLIT_DATA`: UShort = 143u;
public const val `HID_USAGE_ALPHANUMERIC_BLIT_RECTANGLE_X1`: UShort = 139u;
public const val `HID_USAGE_ALPHANUMERIC_BLIT_RECTANGLE_X2`: UShort = 141u;
public const val `HID_USAGE_ALPHANUMERIC_BLIT_RECTANGLE_Y1`: UShort = 140u;
public const val `HID_USAGE_ALPHANUMERIC_BLIT_RECTANGLE_Y2`: UShort = 142u;
public const val `HID_USAGE_ALPHANUMERIC_BLIT_REPORT`: UShort = 138u;
public const val `HID_USAGE_ALPHANUMERIC_CHARACTER_ATTRIBUTE`: UShort = 72u;
public const val `HID_USAGE_ALPHANUMERIC_CHARACTER_REPORT`: UShort = 43u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_ATTR_BLINK`: UShort = 77u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_ATTR_ENHANCE`: UShort = 75u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_ATTR_UNDERLINE`: UShort = 76u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_HEIGHT`: UShort = 62u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_SPACING_HORIZONTAL`: UShort = 63u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_SPACING_VERTICAL`: UShort = 64u;
public const val `HID_USAGE_ALPHANUMERIC_CHAR_WIDTH`: UShort = 61u;
public const val `HID_USAGE_ALPHANUMERIC_CLEAR_DISPLAY`: UShort = 37u;
public const val `HID_USAGE_ALPHANUMERIC_COLUMN`: UShort = 52u;
public const val `HID_USAGE_ALPHANUMERIC_COLUMNS`: UShort = 54u;
public const val `HID_USAGE_ALPHANUMERIC_CURSOR_BLINK`: UShort = 58u;
public const val `HID_USAGE_ALPHANUMERIC_CURSOR_ENABLE`: UShort = 57u;
public const val `HID_USAGE_ALPHANUMERIC_CURSOR_MODE`: UShort = 56u;
public const val `HID_USAGE_ALPHANUMERIC_CURSOR_PIXEL_POSITIONING`: UShort = 55u;
public const val `HID_USAGE_ALPHANUMERIC_CURSOR_POSITION_REPORT`: UShort = 50u;
public const val `HID_USAGE_ALPHANUMERIC_DATA_READ_BACK`: UShort = 34u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_ATTRIBUTES_REPORT`: UShort = 32u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_BRIGHTNESS`: UShort = 70u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_CONTRAST`: UShort = 71u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_CONTROL_REPORT`: UShort = 36u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_DATA`: UShort = 44u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_ENABLE`: UShort = 38u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_ORIENTATION`: UShort = 132u;
public const val `HID_USAGE_ALPHANUMERIC_DISPLAY_STATUS`: UShort = 45u;
public const val `HID_USAGE_ALPHANUMERIC_ERR_FONT_DATA_CANNOT_BE_READ`: UShort = 49u;
public const val `HID_USAGE_ALPHANUMERIC_ERR_NOT_A_LOADABLE_CHARACTER`: UShort = 48u;
public const val `HID_USAGE_ALPHANUMERIC_FONT_14_SEGMENT`: UShort = 68u;
public const val `HID_USAGE_ALPHANUMERIC_FONT_7_SEGMENT`: UShort = 66u;
public const val `HID_USAGE_ALPHANUMERIC_FONT_DATA`: UShort = 60u;
public const val `HID_USAGE_ALPHANUMERIC_FONT_READ_BACK`: UShort = 35u;
public const val `HID_USAGE_ALPHANUMERIC_FONT_REPORT`: UShort = 59u;
public const val `HID_USAGE_ALPHANUMERIC_HORIZONTAL_SCROLL`: UShort = 42u;
public const val `HID_USAGE_ALPHANUMERIC_PALETTE_DATA`: UShort = 136u;
public const val `HID_USAGE_ALPHANUMERIC_PALETTE_DATA_OFFSET`: UShort = 135u;
public const val `HID_USAGE_ALPHANUMERIC_PALETTE_DATA_SIZE`: UShort = 134u;
public const val `HID_USAGE_ALPHANUMERIC_PALETTE_REPORT`: UShort = 133u;
public const val `HID_USAGE_ALPHANUMERIC_ROW`: UShort = 51u;
public const val `HID_USAGE_ALPHANUMERIC_ROWS`: UShort = 53u;
public const val `HID_USAGE_ALPHANUMERIC_SCREEN_SAVER_DELAY`: UShort = 39u;
public const val `HID_USAGE_ALPHANUMERIC_SCREEN_SAVER_ENABLE`: UShort = 40u;
public const val `HID_USAGE_ALPHANUMERIC_SOFT_BUTTON`: UShort = 144u;
public const val `HID_USAGE_ALPHANUMERIC_SOFT_BUTTON_ID`: UShort = 145u;
public const val `HID_USAGE_ALPHANUMERIC_SOFT_BUTTON_OFFSET1`: UShort = 147u;
public const val `HID_USAGE_ALPHANUMERIC_SOFT_BUTTON_OFFSET2`: UShort = 148u;
public const val `HID_USAGE_ALPHANUMERIC_SOFT_BUTTON_REPORT`: UShort = 149u;
public const val `HID_USAGE_ALPHANUMERIC_SOFT_BUTTON_SIDE`: UShort = 146u;
public const val `HID_USAGE_ALPHANUMERIC_STATUS_NOT_READY`: UShort = 46u;
public const val `HID_USAGE_ALPHANUMERIC_STATUS_READY`: UShort = 47u;
public const val `HID_USAGE_ALPHANUMERIC_UNICODE_CHAR_SET`: UShort = 65u;
public const val `HID_USAGE_ALPHANUMERIC_VERTICAL_SCROLL`: UShort = 41u;
public const val `HID_USAGE_CAMERA_AUTO_FOCUS`: UShort = 32u;
public const val `HID_USAGE_CAMERA_SHUTTER`: UShort = 33u;
public const val `HID_USAGE_CONSUMERCTRL`: UShort = 1u;
public const val `HID_USAGE_CONSUMER_AC_BACK`: UShort = 548u;
public const val `HID_USAGE_CONSUMER_AC_BOOKMARKS`: UShort = 554u;
public const val `HID_USAGE_CONSUMER_AC_FORWARD`: UShort = 549u;
public const val `HID_USAGE_CONSUMER_AC_GOTO`: UShort = 546u;
public const val `HID_USAGE_CONSUMER_AC_HOME`: UShort = 547u;
public const val `HID_USAGE_CONSUMER_AC_NEXT`: UShort = 553u;
public const val `HID_USAGE_CONSUMER_AC_PAN`: UShort = 568u;
public const val `HID_USAGE_CONSUMER_AC_PREVIOUS`: UShort = 552u;
public const val `HID_USAGE_CONSUMER_AC_REFRESH`: UShort = 551u;
public const val `HID_USAGE_CONSUMER_AC_SEARCH`: UShort = 545u;
public const val `HID_USAGE_CONSUMER_AC_STOP`: UShort = 550u;
public const val `HID_USAGE_CONSUMER_AL_BROWSER`: UShort = 404u;
public const val `HID_USAGE_CONSUMER_AL_CALCULATOR`: UShort = 402u;
public const val `HID_USAGE_CONSUMER_AL_CONFIGURATION`: UShort = 387u;
public const val `HID_USAGE_CONSUMER_AL_EMAIL`: UShort = 394u;
public const val `HID_USAGE_CONSUMER_AL_SEARCH`: UShort = 454u;
public const val `HID_USAGE_CONSUMER_BALANCE`: UShort = 225u;
public const val `HID_USAGE_CONSUMER_BASS`: UShort = 227u;
public const val `HID_USAGE_CONSUMER_BASS_BOOST`: UShort = 229u;
public const val `HID_USAGE_CONSUMER_BASS_DECREMENT`: UShort = 339u;
public const val `HID_USAGE_CONSUMER_BASS_INCREMENT`: UShort = 338u;
public const val `HID_USAGE_CONSUMER_CHANNEL_DECREMENT`: UShort = 157u;
public const val `HID_USAGE_CONSUMER_CHANNEL_INCREMENT`: UShort = 156u;
public const val `HID_USAGE_CONSUMER_EXTENDED_KEYBOARD_ATTRIBUTES_COLLECTION`: UShort = 704u;
public const val `HID_USAGE_CONSUMER_FAST_FORWARD`: UShort = 179u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_OPEN_GAMEBAR`: UShort = 208u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_RECORD_CLIP`: UShort = 210u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_SCREENSHOT`: UShort = 211u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_TOGGLE_BROADCAST`: UShort = 215u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_TOGGLE_CAMERA`: UShort = 214u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_TOGGLE_INDICATOR`: UShort = 212u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_TOGGLE_MICROPHONE`: UShort = 213u;
public const val `HID_USAGE_CONSUMER_GAMEDVR_TOGGLE_RECORD`: UShort = 209u;
public const val `HID_USAGE_CONSUMER_IMPLEMENTED_KEYBOARD_INPUT_ASSIST_CONTROLS`: UShort = 710u;
public const val `HID_USAGE_CONSUMER_KEYBOARD_FORM_FACTOR`: UShort = 705u;
public const val `HID_USAGE_CONSUMER_KEYBOARD_IETF_LANGUAGE_TAG_INDEX`: UShort = 709u;
public const val `HID_USAGE_CONSUMER_KEYBOARD_KEY_TYPE`: UShort = 706u;
public const val `HID_USAGE_CONSUMER_KEYBOARD_PHYSICAL_LAYOUT`: UShort = 707u;
public const val `HID_USAGE_CONSUMER_LOUDNESS`: UShort = 231u;
public const val `HID_USAGE_CONSUMER_MPX`: UShort = 232u;
public const val `HID_USAGE_CONSUMER_MUTE`: UShort = 226u;
public const val `HID_USAGE_CONSUMER_PAUSE`: UShort = 177u;
public const val `HID_USAGE_CONSUMER_PLAY`: UShort = 176u;
public const val `HID_USAGE_CONSUMER_PLAY_PAUSE`: UShort = 205u;
public const val `HID_USAGE_CONSUMER_RECORD`: UShort = 178u;
public const val `HID_USAGE_CONSUMER_REWIND`: UShort = 180u;
public const val `HID_USAGE_CONSUMER_SCAN_NEXT_TRACK`: UShort = 181u;
public const val `HID_USAGE_CONSUMER_SCAN_PREV_TRACK`: UShort = 182u;
public const val `HID_USAGE_CONSUMER_STOP`: UShort = 183u;
public const val `HID_USAGE_CONSUMER_SURROUND_MODE`: UShort = 230u;
public const val `HID_USAGE_CONSUMER_TREBLE`: UShort = 228u;
public const val `HID_USAGE_CONSUMER_TREBLE_DECREMENT`: UShort = 341u;
public const val `HID_USAGE_CONSUMER_TREBLE_INCREMENT`: UShort = 340u;
public const val `HID_USAGE_CONSUMER_VENDOR_SPECIFIC_KEYBOARD_PHYSICAL_LAYOUT`: UShort = 708u;
public const val `HID_USAGE_CONSUMER_VOLUME`: UShort = 224u;
public const val `HID_USAGE_CONSUMER_VOLUME_DECREMENT`: UShort = 234u;
public const val `HID_USAGE_CONSUMER_VOLUME_INCREMENT`: UShort = 233u;
public const val `HID_USAGE_DIGITIZER_3D_DIGITIZER`: UShort = 8u;
public const val `HID_USAGE_DIGITIZER_ALTITUDE`: UShort = 64u;
public const val `HID_USAGE_DIGITIZER_ARMATURE`: UShort = 11u;
public const val `HID_USAGE_DIGITIZER_ARTICULATED_ARM`: UShort = 10u;
public const val `HID_USAGE_DIGITIZER_AZIMUTH`: UShort = 63u;
public const val `HID_USAGE_DIGITIZER_BARREL_PRESSURE`: UShort = 49u;
public const val `HID_USAGE_DIGITIZER_BARREL_SWITCH`: UShort = 68u;
public const val `HID_USAGE_DIGITIZER_BATTERY_STRENGTH`: UShort = 59u;
public const val `HID_USAGE_DIGITIZER_COORD_MEASURING`: UShort = 7u;
public const val `HID_USAGE_DIGITIZER_DATA_VALID`: UShort = 55u;
public const val `HID_USAGE_DIGITIZER_DIGITIZER`: UShort = 1u;
public const val `HID_USAGE_DIGITIZER_ERASER`: UShort = 69u;
public const val `HID_USAGE_DIGITIZER_FINGER`: UShort = 34u;
public const val `HID_USAGE_DIGITIZER_FREE_SPACE_WAND`: UShort = 13u;
public const val `HID_USAGE_DIGITIZER_HEAT_MAP`: UShort = 15u;
public const val `HID_USAGE_DIGITIZER_HEAT_MAP_FRAME_DATA`: UShort = 108u;
public const val `HID_USAGE_DIGITIZER_HEAT_MAP_PROTOCOL_VENDOR_ID`: UShort = 106u;
public const val `HID_USAGE_DIGITIZER_HEAT_MAP_PROTOCOL_VERSION`: UShort = 107u;
public const val `HID_USAGE_DIGITIZER_INVERT`: UShort = 60u;
public const val `HID_USAGE_DIGITIZER_IN_RANGE`: UShort = 50u;
public const val `HID_USAGE_DIGITIZER_LIGHT_PEN`: UShort = 3u;
public const val `HID_USAGE_DIGITIZER_MULTI_POINT`: UShort = 12u;
public const val `HID_USAGE_DIGITIZER_PEN`: UShort = 2u;
public const val `HID_USAGE_DIGITIZER_PROG_CHANGE_KEYS`: UShort = 58u;
public const val `HID_USAGE_DIGITIZER_PUCK`: UShort = 33u;
public const val `HID_USAGE_DIGITIZER_QUALITY`: UShort = 54u;
public const val `HID_USAGE_DIGITIZER_SECONDARY_TIP_SWITCH`: UShort = 67u;
public const val `HID_USAGE_DIGITIZER_STEREO_PLOTTER`: UShort = 9u;
public const val `HID_USAGE_DIGITIZER_STYLUS`: UShort = 32u;
public const val `HID_USAGE_DIGITIZER_TABLET_FUNC_KEYS`: UShort = 57u;
public const val `HID_USAGE_DIGITIZER_TABLET_PICK`: UShort = 70u;
public const val `HID_USAGE_DIGITIZER_TAP`: UShort = 53u;
public const val `HID_USAGE_DIGITIZER_TIP_PRESSURE`: UShort = 48u;
public const val `HID_USAGE_DIGITIZER_TIP_SWITCH`: UShort = 66u;
public const val `HID_USAGE_DIGITIZER_TOUCH`: UShort = 51u;
public const val `HID_USAGE_DIGITIZER_TOUCH_PAD`: UShort = 5u;
public const val `HID_USAGE_DIGITIZER_TOUCH_SCREEN`: UShort = 4u;
public const val `HID_USAGE_DIGITIZER_TRANSDUCER_CONNECTED`: UShort = 162u;
public const val `HID_USAGE_DIGITIZER_TRANSDUCER_INDEX`: UShort = 56u;
public const val `HID_USAGE_DIGITIZER_TRANSDUCER_PRODUCT`: UShort = 146u;
public const val `HID_USAGE_DIGITIZER_TRANSDUCER_SERIAL`: UShort = 91u;
public const val `HID_USAGE_DIGITIZER_TRANSDUCER_SERIAL_PART2`: UShort = 110u;
public const val `HID_USAGE_DIGITIZER_TRANSDUCER_VENDOR`: UShort = 145u;
public const val `HID_USAGE_DIGITIZER_TWIST`: UShort = 65u;
public const val `HID_USAGE_DIGITIZER_UNTOUCH`: UShort = 52u;
public const val `HID_USAGE_DIGITIZER_WHITE_BOARD`: UShort = 6u;
public const val `HID_USAGE_DIGITIZER_X_TILT`: UShort = 61u;
public const val `HID_USAGE_DIGITIZER_Y_TILT`: UShort = 62u;
public const val `HID_USAGE_GAME_3D_GAME_CONTROLLER`: UShort = 1u;
public const val `HID_USAGE_GAME_BUMP`: UShort = 44u;
public const val `HID_USAGE_GAME_FLIPPER`: UShort = 42u;
public const val `HID_USAGE_GAME_GAMEPAD_FIRE_JUMP`: UShort = 55u;
public const val `HID_USAGE_GAME_GAMEPAD_TRIGGER`: UShort = 57u;
public const val `HID_USAGE_GAME_GUN_AUTOMATIC`: UShort = 53u;
public const val `HID_USAGE_GAME_GUN_BOLT`: UShort = 48u;
public const val `HID_USAGE_GAME_GUN_BURST`: UShort = 52u;
public const val `HID_USAGE_GAME_GUN_CLIP`: UShort = 49u;
public const val `HID_USAGE_GAME_GUN_DEVICE`: UShort = 3u;
public const val `HID_USAGE_GAME_GUN_SAFETY`: UShort = 54u;
public const val `HID_USAGE_GAME_GUN_SELECTOR`: UShort = 50u;
public const val `HID_USAGE_GAME_GUN_SINGLE_SHOT`: UShort = 51u;
public const val `HID_USAGE_GAME_LEAN_FORWARD_BACK`: UShort = 40u;
public const val `HID_USAGE_GAME_LEAN_RIGHT_LEFT`: UShort = 39u;
public const val `HID_USAGE_GAME_MOVE_FORWARD_BACK`: UShort = 37u;
public const val `HID_USAGE_GAME_MOVE_RIGHT_LEFT`: UShort = 36u;
public const val `HID_USAGE_GAME_MOVE_UP_DOWN`: UShort = 38u;
public const val `HID_USAGE_GAME_NEW_GAME`: UShort = 45u;
public const val `HID_USAGE_GAME_PINBALL_DEVICE`: UShort = 2u;
public const val `HID_USAGE_GAME_PITCH_FORWARD_BACK`: UShort = 34u;
public const val `HID_USAGE_GAME_PLAYER`: UShort = 47u;
public const val `HID_USAGE_GAME_POINT_OF_VIEW`: UShort = 32u;
public const val `HID_USAGE_GAME_POV_HEIGHT`: UShort = 41u;
public const val `HID_USAGE_GAME_ROLL_RIGHT_LEFT`: UShort = 35u;
public const val `HID_USAGE_GAME_SECONDARY_FLIPPER`: UShort = 43u;
public const val `HID_USAGE_GAME_SHOOT_BALL`: UShort = 46u;
public const val `HID_USAGE_GAME_TURN_RIGHT_LEFT`: UShort = 33u;
public const val `HID_USAGE_GENERIC_BYTE_COUNT`: UShort = 59u;
public const val `HID_USAGE_GENERIC_CONTROL_ENABLE`: UShort = 203u;
public const val `HID_USAGE_GENERIC_COUNTED_BUFFER`: UShort = 58u;
public const val `HID_USAGE_GENERIC_DEVICE_BATTERY_STRENGTH`: UShort = 32u;
public const val `HID_USAGE_GENERIC_DEVICE_DISCOVER_WIRELESS_CONTROL`: UShort = 35u;
public const val `HID_USAGE_GENERIC_DEVICE_SECURITY_CODE_CHAR_ENTERED`: UShort = 36u;
public const val `HID_USAGE_GENERIC_DEVICE_SECURITY_CODE_CHAR_ERASED`: UShort = 37u;
public const val `HID_USAGE_GENERIC_DEVICE_SECURITY_CODE_CLEARED`: UShort = 38u;
public const val `HID_USAGE_GENERIC_DEVICE_WIRELESS_CHANNEL`: UShort = 33u;
public const val `HID_USAGE_GENERIC_DEVICE_WIRELESS_ID`: UShort = 34u;
public const val `HID_USAGE_GENERIC_DIAL`: UShort = 55u;
public const val `HID_USAGE_GENERIC_DPAD_DOWN`: UShort = 145u;
public const val `HID_USAGE_GENERIC_DPAD_LEFT`: UShort = 147u;
public const val `HID_USAGE_GENERIC_DPAD_RIGHT`: UShort = 146u;
public const val `HID_USAGE_GENERIC_DPAD_UP`: UShort = 144u;
public const val `HID_USAGE_GENERIC_FEATURE_NOTIFICATION`: UShort = 71u;
public const val `HID_USAGE_GENERIC_GAMEPAD`: UShort = 5u;
public const val `HID_USAGE_GENERIC_HATSWITCH`: UShort = 57u;
public const val `HID_USAGE_GENERIC_INTERACTIVE_CONTROL`: UShort = 14u;
public const val `HID_USAGE_GENERIC_JOYSTICK`: UShort = 4u;
public const val `HID_USAGE_GENERIC_KEYBOARD`: UShort = 6u;
public const val `HID_USAGE_GENERIC_KEYPAD`: UShort = 7u;
public const val `HID_USAGE_GENERIC_MOTION_WAKEUP`: UShort = 60u;
public const val `HID_USAGE_GENERIC_MOUSE`: UShort = 2u;
public const val `HID_USAGE_GENERIC_MULTI_AXIS_CONTROLLER`: UShort = 8u;
public const val `HID_USAGE_GENERIC_POINTER`: UShort = 1u;
public const val `HID_USAGE_GENERIC_PORTABLE_DEVICE_CONTROL`: UShort = 13u;
public const val `HID_USAGE_GENERIC_RESOLUTION_MULTIPLIER`: UShort = 72u;
public const val `HID_USAGE_GENERIC_RX`: UShort = 51u;
public const val `HID_USAGE_GENERIC_RY`: UShort = 52u;
public const val `HID_USAGE_GENERIC_RZ`: UShort = 53u;
public const val `HID_USAGE_GENERIC_SELECT`: UShort = 62u;
public const val `HID_USAGE_GENERIC_SLIDER`: UShort = 54u;
public const val `HID_USAGE_GENERIC_START`: UShort = 61u;
public const val `HID_USAGE_GENERIC_SYSCTL_APP_BREAK`: UShort = 165u;
public const val `HID_USAGE_GENERIC_SYSCTL_APP_DBG_BREAK`: UShort = 166u;
public const val `HID_USAGE_GENERIC_SYSCTL_APP_MENU`: UShort = 134u;
public const val `HID_USAGE_GENERIC_SYSCTL_COLD_RESTART`: UShort = 142u;
public const val `HID_USAGE_GENERIC_SYSCTL_CONTEXT_MENU`: UShort = 132u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISMISS_NOTIFICATION`: UShort = 154u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_AUTOSCALE`: UShort = 183u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_BOTH`: UShort = 179u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_DUAL`: UShort = 180u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_EXTERNAL`: UShort = 178u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_INTERNAL`: UShort = 177u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_INVERT`: UShort = 176u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_SWAP`: UShort = 182u;
public const val `HID_USAGE_GENERIC_SYSCTL_DISP_TOGGLE`: UShort = 181u;
public const val `HID_USAGE_GENERIC_SYSCTL_DOCK`: UShort = 160u;
public const val `HID_USAGE_GENERIC_SYSCTL_FN`: UShort = 151u;
public const val `HID_USAGE_GENERIC_SYSCTL_FN_LOCK`: UShort = 152u;
public const val `HID_USAGE_GENERIC_SYSCTL_FN_LOCK_INDICATOR`: UShort = 153u;
public const val `HID_USAGE_GENERIC_SYSCTL_HELP_MENU`: UShort = 135u;
public const val `HID_USAGE_GENERIC_SYSCTL_HIBERNATE`: UShort = 168u;
public const val `HID_USAGE_GENERIC_SYSCTL_MAIN_MENU`: UShort = 133u;
public const val `HID_USAGE_GENERIC_SYSCTL_MENU_DOWN`: UShort = 141u;
public const val `HID_USAGE_GENERIC_SYSCTL_MENU_EXIT`: UShort = 136u;
public const val `HID_USAGE_GENERIC_SYSCTL_MENU_LEFT`: UShort = 139u;
public const val `HID_USAGE_GENERIC_SYSCTL_MENU_RIGHT`: UShort = 138u;
public const val `HID_USAGE_GENERIC_SYSCTL_MENU_SELECT`: UShort = 137u;
public const val `HID_USAGE_GENERIC_SYSCTL_MENU_UP`: UShort = 140u;
public const val `HID_USAGE_GENERIC_SYSCTL_MUTE`: UShort = 167u;
public const val `HID_USAGE_GENERIC_SYSCTL_POWER`: UShort = 129u;
public const val `HID_USAGE_GENERIC_SYSCTL_SETUP`: UShort = 162u;
public const val `HID_USAGE_GENERIC_SYSCTL_SLEEP`: UShort = 130u;
public const val `HID_USAGE_GENERIC_SYSCTL_SYS_BREAK`: UShort = 163u;
public const val `HID_USAGE_GENERIC_SYSCTL_SYS_DBG_BREAK`: UShort = 164u;
public const val `HID_USAGE_GENERIC_SYSCTL_UNDOCK`: UShort = 161u;
public const val `HID_USAGE_GENERIC_SYSCTL_WAKE`: UShort = 131u;
public const val `HID_USAGE_GENERIC_SYSCTL_WARM_RESTART`: UShort = 143u;
public const val `HID_USAGE_GENERIC_SYSTEM_CTL`: UShort = 128u;
public const val `HID_USAGE_GENERIC_SYSTEM_DISPLAY_ROTATION_LOCK_BUTTON`: UShort = 201u;
public const val `HID_USAGE_GENERIC_SYSTEM_DISPLAY_ROTATION_LOCK_SLIDER_SWITCH`: UShort = 202u;
public const val `HID_USAGE_GENERIC_TABLET_PC_SYSTEM_CTL`: UShort = 9u;
public const val `HID_USAGE_GENERIC_VBRX`: UShort = 67u;
public const val `HID_USAGE_GENERIC_VBRY`: UShort = 68u;
public const val `HID_USAGE_GENERIC_VBRZ`: UShort = 69u;
public const val `HID_USAGE_GENERIC_VNO`: UShort = 70u;
public const val `HID_USAGE_GENERIC_VX`: UShort = 64u;
public const val `HID_USAGE_GENERIC_VY`: UShort = 65u;
public const val `HID_USAGE_GENERIC_VZ`: UShort = 66u;
public const val `HID_USAGE_GENERIC_WHEEL`: UShort = 56u;
public const val `HID_USAGE_GENERIC_X`: UShort = 48u;
public const val `HID_USAGE_GENERIC_Y`: UShort = 49u;
public const val `HID_USAGE_GENERIC_Z`: UShort = 50u;
public const val `HID_USAGE_HAPTICS_AUTO_ASSOCIATED_CONTROL`: UShort = 34u;
public const val `HID_USAGE_HAPTICS_AUTO_TRIGGER`: UShort = 32u;
public const val `HID_USAGE_HAPTICS_DURATION_LIST`: UShort = 17u;
public const val `HID_USAGE_HAPTICS_INTENSITY`: UShort = 35u;
public const val `HID_USAGE_HAPTICS_MANUAL_TRIGGER`: UShort = 33u;
public const val `HID_USAGE_HAPTICS_REPEAT_COUNT`: UShort = 36u;
public const val `HID_USAGE_HAPTICS_RETRIGGER_PERIOD`: UShort = 37u;
public const val `HID_USAGE_HAPTICS_SIMPLE_CONTROLLER`: UShort = 1u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_BEGIN`: UShort = 4096u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_BUZZ`: UShort = 4100u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_CLICK`: UShort = 4099u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_CUTOFF_TIME`: UShort = 40u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_END`: UShort = 8191u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_LIST`: UShort = 16u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_NULL`: UShort = 4098u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_PRESS`: UShort = 4102u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_RELEASE`: UShort = 4103u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_RUMBLE`: UShort = 4101u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_STOP`: UShort = 4097u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_VENDOR_BEGIN`: UShort = 8192u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_VENDOR_END`: UShort = 12287u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_VENDOR_ID`: UShort = 39u;
public const val `HID_USAGE_HAPTICS_WAVEFORM_VENDOR_PAGE`: UShort = 38u;
public const val `HID_USAGE_KEYBOARD_CAPS_LOCK`: UShort = 57u;
public const val `HID_USAGE_KEYBOARD_DELETE`: UShort = 42u;
public const val `HID_USAGE_KEYBOARD_DELETE_FORWARD`: UShort = 76u;
public const val `HID_USAGE_KEYBOARD_ESCAPE`: UShort = 41u;
public const val `HID_USAGE_KEYBOARD_F1`: UShort = 58u;
public const val `HID_USAGE_KEYBOARD_F10`: UShort = 67u;
public const val `HID_USAGE_KEYBOARD_F11`: UShort = 68u;
public const val `HID_USAGE_KEYBOARD_F12`: UShort = 69u;
public const val `HID_USAGE_KEYBOARD_F13`: UShort = 104u;
public const val `HID_USAGE_KEYBOARD_F14`: UShort = 105u;
public const val `HID_USAGE_KEYBOARD_F15`: UShort = 106u;
public const val `HID_USAGE_KEYBOARD_F16`: UShort = 107u;
public const val `HID_USAGE_KEYBOARD_F17`: UShort = 108u;
public const val `HID_USAGE_KEYBOARD_F18`: UShort = 109u;
public const val `HID_USAGE_KEYBOARD_F19`: UShort = 110u;
public const val `HID_USAGE_KEYBOARD_F2`: UShort = 59u;
public const val `HID_USAGE_KEYBOARD_F20`: UShort = 111u;
public const val `HID_USAGE_KEYBOARD_F21`: UShort = 112u;
public const val `HID_USAGE_KEYBOARD_F22`: UShort = 113u;
public const val `HID_USAGE_KEYBOARD_F23`: UShort = 114u;
public const val `HID_USAGE_KEYBOARD_F24`: UShort = 115u;
public const val `HID_USAGE_KEYBOARD_F3`: UShort = 60u;
public const val `HID_USAGE_KEYBOARD_F4`: UShort = 61u;
public const val `HID_USAGE_KEYBOARD_F5`: UShort = 62u;
public const val `HID_USAGE_KEYBOARD_F6`: UShort = 63u;
public const val `HID_USAGE_KEYBOARD_F7`: UShort = 64u;
public const val `HID_USAGE_KEYBOARD_F8`: UShort = 65u;
public const val `HID_USAGE_KEYBOARD_F9`: UShort = 66u;
public const val `HID_USAGE_KEYBOARD_KEYPAD_0_AND_INSERT`: UShort = 98u;
public const val `HID_USAGE_KEYBOARD_KEYPAD_1_AND_END`: UShort = 89u;
public const val `HID_USAGE_KEYBOARD_LALT`: UShort = 226u;
public const val `HID_USAGE_KEYBOARD_LCTRL`: UShort = 224u;
public const val `HID_USAGE_KEYBOARD_LGUI`: UShort = 227u;
public const val `HID_USAGE_KEYBOARD_LSHFT`: UShort = 225u;
public const val `HID_USAGE_KEYBOARD_NOEVENT`: UShort = 0u;
public const val `HID_USAGE_KEYBOARD_NUM_LOCK`: UShort = 83u;
public const val `HID_USAGE_KEYBOARD_ONE`: UShort = 30u;
public const val `HID_USAGE_KEYBOARD_POSTFAIL`: UShort = 2u;
public const val `HID_USAGE_KEYBOARD_PRINT_SCREEN`: UShort = 70u;
public const val `HID_USAGE_KEYBOARD_RALT`: UShort = 230u;
public const val `HID_USAGE_KEYBOARD_RCTRL`: UShort = 228u;
public const val `HID_USAGE_KEYBOARD_RETURN`: UShort = 40u;
public const val `HID_USAGE_KEYBOARD_RGUI`: UShort = 231u;
public const val `HID_USAGE_KEYBOARD_ROLLOVER`: UShort = 1u;
public const val `HID_USAGE_KEYBOARD_RSHFT`: UShort = 229u;
public const val `HID_USAGE_KEYBOARD_SCROLL_LOCK`: UShort = 71u;
public const val `HID_USAGE_KEYBOARD_UNDEFINED`: UShort = 3u;
public const val `HID_USAGE_KEYBOARD_ZERO`: UShort = 39u;
public const val `HID_USAGE_KEYBOARD_aA`: UShort = 4u;
public const val `HID_USAGE_KEYBOARD_zZ`: UShort = 29u;
public const val `HID_USAGE_LAMPARRAY`: UShort = 1u;
public const val `HID_USAGE_LAMPARRAY_ATTRBIUTES_REPORT`: UShort = 2u;
public const val `HID_USAGE_LAMPARRAY_AUTONOMOUS_MODE`: UShort = 113u;
public const val `HID_USAGE_LAMPARRAY_BLUE_LEVEL_COUNT`: UShort = 42u;
public const val `HID_USAGE_LAMPARRAY_BOUNDING_BOX_DEPTH_IN_MICROMETERS`: UShort = 6u;
public const val `HID_USAGE_LAMPARRAY_BOUNDING_BOX_HEIGHT_IN_MICROMETERS`: UShort = 5u;
public const val `HID_USAGE_LAMPARRAY_BOUNDING_BOX_WIDTH_IN_MICROMETERS`: UShort = 4u;
public const val `HID_USAGE_LAMPARRAY_CONTROL_REPORT`: UShort = 112u;
public const val `HID_USAGE_LAMPARRAY_GREEN_LEVEL_COUNT`: UShort = 41u;
public const val `HID_USAGE_LAMPARRAY_INPUT_BINDING`: UShort = 45u;
public const val `HID_USAGE_LAMPARRAY_INTENSITY_LEVEL_COUNT`: UShort = 43u;
public const val `HID_USAGE_LAMPARRAY_IS_PROGRAMMABLE`: UShort = 44u;
public const val `HID_USAGE_LAMPARRAY_KIND`: UShort = 7u;
public const val `HID_USAGE_LAMPARRAY_LAMP_ATTRIBUTES_REQUEST_REPORT`: UShort = 32u;
public const val `HID_USAGE_LAMPARRAY_LAMP_ATTRIBUTES_RESPONSE_REPORT`: UShort = 34u;
public const val `HID_USAGE_LAMPARRAY_LAMP_BLUE_UPDATE_CHANNEL`: UShort = 83u;
public const val `HID_USAGE_LAMPARRAY_LAMP_COUNT`: UShort = 3u;
public const val `HID_USAGE_LAMPARRAY_LAMP_GREEN_UPDATE_CHANNEL`: UShort = 82u;
public const val `HID_USAGE_LAMPARRAY_LAMP_ID`: UShort = 33u;
public const val `HID_USAGE_LAMPARRAY_LAMP_ID_END`: UShort = 98u;
public const val `HID_USAGE_LAMPARRAY_LAMP_ID_START`: UShort = 97u;
public const val `HID_USAGE_LAMPARRAY_LAMP_INTENSITY_UPDATE_CHANNEL`: UShort = 84u;
public const val `HID_USAGE_LAMPARRAY_LAMP_MULTI_UPDATE_REPORT`: UShort = 80u;
public const val `HID_USAGE_LAMPARRAY_LAMP_PURPOSES`: UShort = 38u;
public const val `HID_USAGE_LAMPARRAY_LAMP_RANGE_UPDATE_REPORT`: UShort = 96u;
public const val `HID_USAGE_LAMPARRAY_LAMP_RED_UPDATE_CHANNEL`: UShort = 81u;
public const val `HID_USAGE_LAMPARRAY_LAMP_UPDATE_FLAGS`: UShort = 85u;
public const val `HID_USAGE_LAMPARRAY_MIN_UPDATE_INTERVAL_IN_MICROSECONDS`: UShort = 8u;
public const val `HID_USAGE_LAMPARRAY_POSITION_X_IN_MICROMETERS`: UShort = 35u;
public const val `HID_USAGE_LAMPARRAY_POSITION_Y_IN_MICROMETERS`: UShort = 36u;
public const val `HID_USAGE_LAMPARRAY_POSITION_Z_IN_MICROMETERS`: UShort = 37u;
public const val `HID_USAGE_LAMPARRAY_RED_LEVEL_COUNT`: UShort = 40u;
public const val `HID_USAGE_LAMPARRAY_UPDATE_LATENCY_IN_MICROSECONDS`: UShort = 39u;
public const val `HID_USAGE_LED_AMBER`: UShort = 74u;
public const val `HID_USAGE_LED_BATTERY_LOW`: UShort = 29u;
public const val `HID_USAGE_LED_BATTERY_OK`: UShort = 28u;
public const val `HID_USAGE_LED_BATTERY_OPERATION`: UShort = 27u;
public const val `HID_USAGE_LED_BUSY`: UShort = 44u;
public const val `HID_USAGE_LED_CALL_PICKUP`: UShort = 37u;
public const val `HID_USAGE_LED_CAMERA_OFF`: UShort = 41u;
public const val `HID_USAGE_LED_CAMERA_ON`: UShort = 40u;
public const val `HID_USAGE_LED_CAPS_LOCK`: UShort = 2u;
public const val `HID_USAGE_LED_CAV`: UShort = 20u;
public const val `HID_USAGE_LED_CLV`: UShort = 21u;
public const val `HID_USAGE_LED_COMPOSE`: UShort = 4u;
public const val `HID_USAGE_LED_CONFERENCE`: UShort = 38u;
public const val `HID_USAGE_LED_COVERAGE`: UShort = 34u;
public const val `HID_USAGE_LED_DATA_MODE`: UShort = 26u;
public const val `HID_USAGE_LED_DO_NOT_DISTURB`: UShort = 8u;
public const val `HID_USAGE_LED_EQUALIZER_ENABLE`: UShort = 13u;
public const val `HID_USAGE_LED_ERROR`: UShort = 57u;
public const val `HID_USAGE_LED_EXTERNAL_POWER`: UShort = 77u;
public const val `HID_USAGE_LED_FAST_BLINK_OFF_TIME`: UShort = 70u;
public const val `HID_USAGE_LED_FAST_BLINK_ON_TIME`: UShort = 69u;
public const val `HID_USAGE_LED_FAST_FORWARD`: UShort = 53u;
public const val `HID_USAGE_LED_FLASH_ON_TIME`: UShort = 66u;
public const val `HID_USAGE_LED_FORWARD`: UShort = 49u;
public const val `HID_USAGE_LED_GENERIC_INDICATOR`: UShort = 75u;
public const val `HID_USAGE_LED_GREEN`: UShort = 73u;
public const val `HID_USAGE_LED_HEAD_SET`: UShort = 31u;
public const val `HID_USAGE_LED_HIGH_CUT_FILTER`: UShort = 11u;
public const val `HID_USAGE_LED_HOLD`: UShort = 32u;
public const val `HID_USAGE_LED_INDICATOR_COLOR`: UShort = 71u;
public const val `HID_USAGE_LED_INDICATOR_FAST_BLINK`: UShort = 64u;
public const val `HID_USAGE_LED_INDICATOR_FLASH`: UShort = 62u;
public const val `HID_USAGE_LED_INDICATOR_OFF`: UShort = 65u;
public const val `HID_USAGE_LED_INDICATOR_ON`: UShort = 61u;
public const val `HID_USAGE_LED_INDICATOR_SLOW_BLINK`: UShort = 63u;
public const val `HID_USAGE_LED_IN_USE_INDICATOR`: UShort = 59u;
public const val `HID_USAGE_LED_KANA`: UShort = 5u;
public const val `HID_USAGE_LED_LOW_CUT_FILTER`: UShort = 12u;
public const val `HID_USAGE_LED_MESSAGE_WAITING`: UShort = 25u;
public const val `HID_USAGE_LED_MICROPHONE`: UShort = 33u;
public const val `HID_USAGE_LED_MULTI_MODE_INDICATOR`: UShort = 60u;
public const val `HID_USAGE_LED_MUTE`: UShort = 9u;
public const val `HID_USAGE_LED_NIGHT_MODE`: UShort = 35u;
public const val `HID_USAGE_LED_NUM_LOCK`: UShort = 1u;
public const val `HID_USAGE_LED_OFF_HOOK`: UShort = 23u;
public const val `HID_USAGE_LED_OFF_LINE`: UShort = 43u;
public const val `HID_USAGE_LED_ON_LINE`: UShort = 42u;
public const val `HID_USAGE_LED_PAPER_JAM`: UShort = 47u;
public const val `HID_USAGE_LED_PAPER_OUT`: UShort = 46u;
public const val `HID_USAGE_LED_PAUSE`: UShort = 55u;
public const val `HID_USAGE_LED_PLAY`: UShort = 54u;
public const val `HID_USAGE_LED_POWER`: UShort = 6u;
public const val `HID_USAGE_LED_READY`: UShort = 45u;
public const val `HID_USAGE_LED_RECORD`: UShort = 56u;
public const val `HID_USAGE_LED_RECORDING_FORMAT_DET`: UShort = 22u;
public const val `HID_USAGE_LED_RED`: UShort = 72u;
public const val `HID_USAGE_LED_REMOTE`: UShort = 48u;
public const val `HID_USAGE_LED_REPEAT`: UShort = 16u;
public const val `HID_USAGE_LED_REVERSE`: UShort = 50u;
public const val `HID_USAGE_LED_REWIND`: UShort = 52u;
public const val `HID_USAGE_LED_RING`: UShort = 24u;
public const val `HID_USAGE_LED_SAMPLING_RATE_DETECT`: UShort = 18u;
public const val `HID_USAGE_LED_SCROLL_LOCK`: UShort = 3u;
public const val `HID_USAGE_LED_SELECTED_INDICATOR`: UShort = 58u;
public const val `HID_USAGE_LED_SEND_CALLS`: UShort = 36u;
public const val `HID_USAGE_LED_SHIFT`: UShort = 7u;
public const val `HID_USAGE_LED_SLOW_BLINK_OFF_TIME`: UShort = 68u;
public const val `HID_USAGE_LED_SLOW_BLINK_ON_TIME`: UShort = 67u;
public const val `HID_USAGE_LED_SOUND_FIELD_ON`: UShort = 14u;
public const val `HID_USAGE_LED_SPEAKER`: UShort = 30u;
public const val `HID_USAGE_LED_SPINNING`: UShort = 19u;
public const val `HID_USAGE_LED_STAND_BY`: UShort = 39u;
public const val `HID_USAGE_LED_STEREO`: UShort = 17u;
public const val `HID_USAGE_LED_STOP`: UShort = 51u;
public const val `HID_USAGE_LED_SURROUND_FIELD_ON`: UShort = 15u;
public const val `HID_USAGE_LED_SYSTEM_SUSPEND`: UShort = 76u;
public const val `HID_USAGE_LED_TONE_ENABLE`: UShort = 10u;
public const val `HID_USAGE_MS_BTH_HF_DIALMEMORY`: UShort = 34u;
public const val `HID_USAGE_MS_BTH_HF_DIALNUMBER`: UShort = 33u;
public const val `HID_USAGE_PAGE_ALPHANUMERIC`: UShort = 20u;
public const val `HID_USAGE_PAGE_ARCADE`: UShort = 145u;
public const val `HID_USAGE_PAGE_BARCODE_SCANNER`: UShort = 140u;
public const val `HID_USAGE_PAGE_BUTTON`: UShort = 9u;
public const val `HID_USAGE_PAGE_CAMERA_CONTROL`: UShort = 144u;
public const val `HID_USAGE_PAGE_CONSUMER`: UShort = 12u;
public const val `HID_USAGE_PAGE_DIGITIZER`: UShort = 13u;
public const val `HID_USAGE_PAGE_GAME`: UShort = 5u;
public const val `HID_USAGE_PAGE_GENERIC`: UShort = 1u;
public const val `HID_USAGE_PAGE_GENERIC_DEVICE`: UShort = 6u;
public const val `HID_USAGE_PAGE_HAPTICS`: UShort = 14u;
public const val `HID_USAGE_PAGE_KEYBOARD`: UShort = 7u;
public const val `HID_USAGE_PAGE_LED`: UShort = 8u;
public const val `HID_USAGE_PAGE_LIGHTING_ILLUMINATION`: UShort = 89u;
public const val `HID_USAGE_PAGE_MAGNETIC_STRIPE_READER`: UShort = 142u;
public const val `HID_USAGE_PAGE_MICROSOFT_BLUETOOTH_HANDSFREE`: UShort = 65523u;
public const val `HID_USAGE_PAGE_ORDINAL`: UShort = 10u;
public const val `HID_USAGE_PAGE_PID`: UShort = 15u;
public const val `HID_USAGE_PAGE_SENSOR`: UShort = 32u;
public const val `HID_USAGE_PAGE_SIMULATION`: UShort = 2u;
public const val `HID_USAGE_PAGE_SPORT`: UShort = 4u;
public const val `HID_USAGE_PAGE_TELEPHONY`: UShort = 11u;
public const val `HID_USAGE_PAGE_UNDEFINED`: UShort = 0u;
public const val `HID_USAGE_PAGE_UNICODE`: UShort = 16u;
public const val `HID_USAGE_PAGE_VENDOR_DEFINED_BEGIN`: UShort = 65280u;
public const val `HID_USAGE_PAGE_VENDOR_DEFINED_END`: UShort = 65535u;
public const val `HID_USAGE_PAGE_VR`: UShort = 3u;
public const val `HID_USAGE_PAGE_WEIGHING_DEVICE`: UShort = 141u;
public const val `HID_USAGE_SIMULATION_ACCELLERATOR`: UShort = 196u;
public const val `HID_USAGE_SIMULATION_AILERON`: UShort = 176u;
public const val `HID_USAGE_SIMULATION_AILERON_TRIM`: UShort = 177u;
public const val `HID_USAGE_SIMULATION_AIRPLANE_SIMULATION_DEVICE`: UShort = 9u;
public const val `HID_USAGE_SIMULATION_ANTI_TORQUE_CONTROL`: UShort = 178u;
public const val `HID_USAGE_SIMULATION_AUTOMOBILE_SIMULATION_DEVICE`: UShort = 2u;
public const val `HID_USAGE_SIMULATION_AUTOPIOLOT_ENABLE`: UShort = 179u;
public const val `HID_USAGE_SIMULATION_BALLAST`: UShort = 204u;
public const val `HID_USAGE_SIMULATION_BARREL_ELEVATION`: UShort = 202u;
public const val `HID_USAGE_SIMULATION_BICYCLE_CRANK`: UShort = 205u;
public const val `HID_USAGE_SIMULATION_BICYCLE_SIMULATION_DEVICE`: UShort = 12u;
public const val `HID_USAGE_SIMULATION_BRAKE`: UShort = 197u;
public const val `HID_USAGE_SIMULATION_CHAFF_RELEASE`: UShort = 180u;
public const val `HID_USAGE_SIMULATION_CLUTCH`: UShort = 198u;
public const val `HID_USAGE_SIMULATION_COLLECTIVE_CONTROL`: UShort = 181u;
public const val `HID_USAGE_SIMULATION_CYCLIC_CONTROL`: UShort = 34u;
public const val `HID_USAGE_SIMULATION_CYCLIC_TRIM`: UShort = 35u;
public const val `HID_USAGE_SIMULATION_DIVE_BRAKE`: UShort = 182u;
public const val `HID_USAGE_SIMULATION_DIVE_PLANE`: UShort = 203u;
public const val `HID_USAGE_SIMULATION_ELECTRONIC_COUNTERMEASURES`: UShort = 183u;
public const val `HID_USAGE_SIMULATION_ELEVATOR`: UShort = 184u;
public const val `HID_USAGE_SIMULATION_ELEVATOR_TRIM`: UShort = 185u;
public const val `HID_USAGE_SIMULATION_FLARE_RELEASE`: UShort = 189u;
public const val `HID_USAGE_SIMULATION_FLIGHT_COMMUNICATIONS`: UShort = 188u;
public const val `HID_USAGE_SIMULATION_FLIGHT_CONTROL_STICK`: UShort = 32u;
public const val `HID_USAGE_SIMULATION_FLIGHT_SIMULATION_DEVICE`: UShort = 1u;
public const val `HID_USAGE_SIMULATION_FLIGHT_STICK`: UShort = 33u;
public const val `HID_USAGE_SIMULATION_FLIGHT_YOKE`: UShort = 36u;
public const val `HID_USAGE_SIMULATION_FRONT_BRAKE`: UShort = 207u;
public const val `HID_USAGE_SIMULATION_HANDLE_BARS`: UShort = 206u;
public const val `HID_USAGE_SIMULATION_HELICOPTER_SIMULATION_DEVICE`: UShort = 10u;
public const val `HID_USAGE_SIMULATION_LANDING_GEAR`: UShort = 190u;
public const val `HID_USAGE_SIMULATION_MAGIC_CARPET_SIMULATION_DEVICE`: UShort = 11u;
public const val `HID_USAGE_SIMULATION_MOTORCYCLE_SIMULATION_DEVICE`: UShort = 7u;
public const val `HID_USAGE_SIMULATION_REAR_BRAKE`: UShort = 208u;
public const val `HID_USAGE_SIMULATION_RUDDER`: UShort = 186u;
public const val `HID_USAGE_SIMULATION_SAILING_SIMULATION_DEVICE`: UShort = 6u;
public const val `HID_USAGE_SIMULATION_SHIFTER`: UShort = 199u;
public const val `HID_USAGE_SIMULATION_SPACESHIP_SIMULATION_DEVICE`: UShort = 4u;
public const val `HID_USAGE_SIMULATION_SPORTS_SIMULATION_DEVICE`: UShort = 8u;
public const val `HID_USAGE_SIMULATION_STEERING`: UShort = 200u;
public const val `HID_USAGE_SIMULATION_SUBMARINE_SIMULATION_DEVICE`: UShort = 5u;
public const val `HID_USAGE_SIMULATION_TANK_SIMULATION_DEVICE`: UShort = 3u;
public const val `HID_USAGE_SIMULATION_THROTTLE`: UShort = 187u;
public const val `HID_USAGE_SIMULATION_TOE_BRAKE`: UShort = 191u;
public const val `HID_USAGE_SIMULATION_TRACK_CONTROL`: UShort = 37u;
public const val `HID_USAGE_SIMULATION_TRIGGER`: UShort = 192u;
public const val `HID_USAGE_SIMULATION_TURRET_DIRECTION`: UShort = 201u;
public const val `HID_USAGE_SIMULATION_WEAPONS_ARM`: UShort = 193u;
public const val `HID_USAGE_SIMULATION_WEAPONS_SELECT`: UShort = 194u;
public const val `HID_USAGE_SIMULATION_WING_FLAPS`: UShort = 195u;
public const val `HID_USAGE_SPORT_10_IRON`: UShort = 90u;
public const val `HID_USAGE_SPORT_11_IRON`: UShort = 91u;
public const val `HID_USAGE_SPORT_1_IRON`: UShort = 81u;
public const val `HID_USAGE_SPORT_1_WOOD`: UShort = 95u;
public const val `HID_USAGE_SPORT_2_IRON`: UShort = 82u;
public const val `HID_USAGE_SPORT_3_IRON`: UShort = 83u;
public const val `HID_USAGE_SPORT_3_WOOD`: UShort = 96u;
public const val `HID_USAGE_SPORT_4_IRON`: UShort = 84u;
public const val `HID_USAGE_SPORT_5_IRON`: UShort = 85u;
public const val `HID_USAGE_SPORT_5_WOOD`: UShort = 97u;
public const val `HID_USAGE_SPORT_6_IRON`: UShort = 86u;
public const val `HID_USAGE_SPORT_7_IRON`: UShort = 87u;
public const val `HID_USAGE_SPORT_7_WOOD`: UShort = 98u;
public const val `HID_USAGE_SPORT_8_IRON`: UShort = 88u;
public const val `HID_USAGE_SPORT_9_IRON`: UShort = 89u;
public const val `HID_USAGE_SPORT_9_WOOD`: UShort = 99u;
public const val `HID_USAGE_SPORT_BASEBALL_BAT`: UShort = 1u;
public const val `HID_USAGE_SPORT_FOLLOW_THROUGH`: UShort = 54u;
public const val `HID_USAGE_SPORT_GOLF_CLUB`: UShort = 2u;
public const val `HID_USAGE_SPORT_HEEL_TOE`: UShort = 53u;
public const val `HID_USAGE_SPORT_HEIGHT`: UShort = 57u;
public const val `HID_USAGE_SPORT_LOFT_WEDGE`: UShort = 93u;
public const val `HID_USAGE_SPORT_OAR`: UShort = 48u;
public const val `HID_USAGE_SPORT_POWER_WEDGE`: UShort = 94u;
public const val `HID_USAGE_SPORT_PUTTER`: UShort = 80u;
public const val `HID_USAGE_SPORT_RATE`: UShort = 50u;
public const val `HID_USAGE_SPORT_ROWING_MACHINE`: UShort = 3u;
public const val `HID_USAGE_SPORT_SAND_WEDGE`: UShort = 92u;
public const val `HID_USAGE_SPORT_SLOPE`: UShort = 49u;
public const val `HID_USAGE_SPORT_STICK_FACE_ANGLE`: UShort = 52u;
public const val `HID_USAGE_SPORT_STICK_SPEED`: UShort = 51u;
public const val `HID_USAGE_SPORT_STICK_TYPE`: UShort = 56u;
public const val `HID_USAGE_SPORT_TEMPO`: UShort = 55u;
public const val `HID_USAGE_SPORT_TREADMILL`: UShort = 4u;
public const val `HID_USAGE_TELEPHONY_ANSWERING_MACHINE`: UShort = 2u;
public const val `HID_USAGE_TELEPHONY_DROP`: UShort = 38u;
public const val `HID_USAGE_TELEPHONY_HANDSET`: UShort = 4u;
public const val `HID_USAGE_TELEPHONY_HEADSET`: UShort = 5u;
public const val `HID_USAGE_TELEPHONY_HOST_AVAILABLE`: UShort = 241u;
public const val `HID_USAGE_TELEPHONY_KEYPAD`: UShort = 6u;
public const val `HID_USAGE_TELEPHONY_KEYPAD_0`: UShort = 176u;
public const val `HID_USAGE_TELEPHONY_KEYPAD_D`: UShort = 191u;
public const val `HID_USAGE_TELEPHONY_LINE`: UShort = 42u;
public const val `HID_USAGE_TELEPHONY_MESSAGE_CONTROLS`: UShort = 3u;
public const val `HID_USAGE_TELEPHONY_PHONE`: UShort = 1u;
public const val `HID_USAGE_TELEPHONY_PROGRAMMABLE_BUTTON`: UShort = 7u;
public const val `HID_USAGE_TELEPHONY_REDIAL`: UShort = 36u;
public const val `HID_USAGE_TELEPHONY_RING_ENABLE`: UShort = 45u;
public const val `HID_USAGE_TELEPHONY_SEND`: UShort = 49u;
public const val `HID_USAGE_TELEPHONY_TRANSFER`: UShort = 37u;
public const val `HID_USAGE_VR_ANIMATRONIC_DEVICE`: UShort = 10u;
public const val `HID_USAGE_VR_BELT`: UShort = 1u;
public const val `HID_USAGE_VR_BODY_SUIT`: UShort = 2u;
public const val `HID_USAGE_VR_DISPLAY_ENABLE`: UShort = 33u;
public const val `HID_USAGE_VR_FLEXOR`: UShort = 3u;
public const val `HID_USAGE_VR_GLOVE`: UShort = 4u;
public const val `HID_USAGE_VR_HAND_TRACKER`: UShort = 7u;
public const val `HID_USAGE_VR_HEAD_MOUNTED_DISPLAY`: UShort = 6u;
public const val `HID_USAGE_VR_HEAD_TRACKER`: UShort = 5u;
public const val `HID_USAGE_VR_OCULOMETER`: UShort = 8u;
public const val `HID_USAGE_VR_STEREO_ENABLE`: UShort = 32u;
public const val `HID_USAGE_VR_VEST`: UShort = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HID_XFER_PACKET` (
    public var `reportBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `reportBufferLen`: UInt,
    public var `reportId`: UByte,
)
// UNSUPPORTED Rust 3624:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HID_XFER_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HORIZONTAL_WHEEL_PRESENT`: UInt = 32768u;
public const val `HidP_Feature`: `HIDP_REPORT_TYPE` = 2;
public const val `HidP_Input`: `HIDP_REPORT_TYPE` = 0;
public const val `HidP_Keyboard_Break`: `HIDP_KEYBOARD_DIRECTION` = 0;
public const val `HidP_Keyboard_Make`: `HIDP_KEYBOARD_DIRECTION` = 1;
public const val `HidP_Output`: `HIDP_REPORT_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INDICATOR_LIST` (
    public var `MakeCode`: UShort,
    public var `IndicatorFlags`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INPUT_BUTTON_ENABLE_INFO` (
    public var `ButtonType`: `GPIOBUTTONS_BUTTON_TYPE`,
    public var `Enabled`: Boolean,
)
public const val `IOCTL_BUTTON_GET_ENABLED_ON_IDLE`: UInt = 721580u;
public const val `IOCTL_BUTTON_SET_ENABLED_ON_IDLE`: UInt = 721576u;
public const val `IOCTL_KEYBOARD_INSERT_DATA`: UInt = 721152u;
public const val `IOCTL_KEYBOARD_QUERY_ATTRIBUTES`: UInt = 720896u;
public const val `IOCTL_KEYBOARD_QUERY_EXTENDED_ATTRIBUTES`: UInt = 721408u;
public const val `IOCTL_KEYBOARD_QUERY_IME_STATUS`: UInt = 724992u;
public const val `IOCTL_KEYBOARD_QUERY_INDICATORS`: UInt = 720960u;
public const val `IOCTL_KEYBOARD_QUERY_INDICATOR_TRANSLATION`: UInt = 721024u;
public const val `IOCTL_KEYBOARD_QUERY_TYPEMATIC`: UInt = 720928u;
public const val `IOCTL_KEYBOARD_SET_IME_STATUS`: UInt = 724996u;
public const val `IOCTL_KEYBOARD_SET_INDICATORS`: UInt = 720904u;
public const val `IOCTL_KEYBOARD_SET_TYPEMATIC`: UInt = 720900u;
public const val `IOCTL_MOUSE_INSERT_DATA`: UInt = 983044u;
public const val `IOCTL_MOUSE_QUERY_ATTRIBUTES`: UInt = 983040u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOYCALIBRATE` (
    public var `wXbase`: UInt,
    public var `wXdelta`: UInt,
    public var `wYbase`: UInt,
    public var `wYdelta`: UInt,
    public var `wZbase`: UInt,
    public var `wZdelta`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOYPOS` (
    public var `dwX`: UInt,
    public var `dwY`: UInt,
    public var `dwZ`: UInt,
    public var `dwR`: UInt,
    public var `dwU`: UInt,
    public var `dwV`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOYRANGE` (
    public var `jpMin`: `JOYPOS`,
    public var `jpMax`: `JOYPOS`,
    public var `jpCenter`: `JOYPOS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOYREGHWCONFIG` (
    public var `hws`: `JOYREGHWSETTINGS`,
    public var `dwUsageSettings`: UInt,
    public var `hwv`: `JOYREGHWVALUES`,
    public var `dwType`: UInt,
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOYREGHWSETTINGS` (
    public var `dwFlags`: UInt,
    public var `dwNumButtons`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JOYREGHWVALUES` (
    public var `jrvHardware`: `JOYRANGE`,
    public var `dwPOVValues`: UIntArray,
    public var `dwCalFlags`: UInt,
)
// UNSUPPORTED Rust 3710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JOYREGHWVALUES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JOYREGUSERVALUES` (
    public var `dwTimeOut`: UInt,
    public var `jrvRanges`: `JOYRANGE`,
    public var `jpDeadZone`: `JOYPOS`,
)
public const val `JOYTYPE_ANALOGCOMPAT`: Int = 8;
public const val `JOYTYPE_DEFAULTPROPSHEET`: Int = -2147483648;
public const val `JOYTYPE_DEVICEHIDE`: Int = 65536;
public const val `JOYTYPE_ENABLEINPUTREPORT`: Int = 16777216;
public const val `JOYTYPE_GAMEHIDE`: Int = 524288;
public const val `JOYTYPE_HIDEACTIVE`: Int = 1048576;
public const val `JOYTYPE_INFODEFAULT`: Int = 0;
public const val `JOYTYPE_INFOMASK`: Int = 14680064;
public const val `JOYTYPE_INFOYRPEDALS`: Int = 6291456;
public const val `JOYTYPE_INFOYYPEDALS`: Int = 2097152;
public const val `JOYTYPE_INFOZISSLIDER`: Int = 2097152;
public const val `JOYTYPE_INFOZISZ`: Int = 4194304;
public const val `JOYTYPE_INFOZRPEDALS`: Int = 8388608;
public const val `JOYTYPE_INFOZYPEDALS`: Int = 4194304;
public const val `JOYTYPE_KEYBHIDE`: Int = 262144;
public const val `JOYTYPE_MOUSEHIDE`: Int = 131072;
public const val `JOYTYPE_NOAUTODETECTGAMEPORT`: Int = 2;
public const val `JOYTYPE_NOHIDDIRECT`: Int = 4;
public const val `JOYTYPE_ZEROGAMEENUMOEMDATA`: Int = 1;
public const val `JOY_HWS_AUTOLOAD`: Int = 268435456;
public const val `JOY_HWS_GAMEPORTBUSBUSY`: Int = 1;
public const val `JOY_HWS_HASPOV`: Int = 2;
public const val `JOY_HWS_HASR`: Int = 524288;
public const val `JOY_HWS_HASU`: Int = 8388608;
public const val `JOY_HWS_HASV`: Int = 16777216;
public const val `JOY_HWS_HASZ`: Int = 1;
public const val `JOY_HWS_ISANALOGPORTDRIVER`: Int = 134217728;
public const val `JOY_HWS_ISCARCTRL`: Int = 64;
public const val `JOY_HWS_ISGAMEPAD`: Int = 32;
public const val `JOY_HWS_ISGAMEPORTBUS`: Int = -2147483648;
public const val `JOY_HWS_ISGAMEPORTDRIVER`: Int = 67108864;
public const val `JOY_HWS_ISHEADTRACKER`: Int = 33554432;
public const val `JOY_HWS_ISYOKE`: Int = 16;
public const val `JOY_HWS_NODEVNODE`: Int = 536870912;
public const val `JOY_HWS_POVISBUTTONCOMBOS`: Int = 4;
public const val `JOY_HWS_POVISJ1X`: Int = 65536;
public const val `JOY_HWS_POVISJ1Y`: Int = 131072;
public const val `JOY_HWS_POVISJ2X`: Int = 262144;
public const val `JOY_HWS_POVISPOLL`: Int = 8;
public const val `JOY_HWS_RISJ1X`: Int = 1048576;
public const val `JOY_HWS_RISJ1Y`: Int = 2097152;
public const val `JOY_HWS_RISJ2Y`: Int = 4194304;
public const val `JOY_HWS_XISJ1Y`: Int = 128;
public const val `JOY_HWS_XISJ2X`: Int = 256;
public const val `JOY_HWS_XISJ2Y`: Int = 512;
public const val `JOY_HWS_YISJ1X`: Int = 1024;
public const val `JOY_HWS_YISJ2X`: Int = 2048;
public const val `JOY_HWS_YISJ2Y`: Int = 4096;
public const val `JOY_HWS_ZISJ1X`: Int = 8192;
public const val `JOY_HWS_ZISJ1Y`: Int = 16384;
public const val `JOY_HWS_ZISJ2X`: Int = 32768;
public const val `JOY_HW_2A_2B_GENERIC`: UInt = 2u;
public const val `JOY_HW_2A_4B_GENERIC`: UInt = 3u;
public const val `JOY_HW_2B_FLIGHTYOKE`: UInt = 5u;
public const val `JOY_HW_2B_FLIGHTYOKETHROTTLE`: UInt = 6u;
public const val `JOY_HW_2B_GAMEPAD`: UInt = 4u;
public const val `JOY_HW_3A_2B_GENERIC`: UInt = 7u;
public const val `JOY_HW_3A_4B_GENERIC`: UInt = 8u;
public const val `JOY_HW_4B_FLIGHTYOKE`: UInt = 10u;
public const val `JOY_HW_4B_FLIGHTYOKETHROTTLE`: UInt = 11u;
public const val `JOY_HW_4B_GAMEPAD`: UInt = 9u;
public const val `JOY_HW_CUSTOM`: UInt = 1u;
public const val `JOY_HW_LASTENTRY`: UInt = 13u;
public const val `JOY_HW_NONE`: UInt = 0u;
public const val `JOY_HW_TWO_2A_2B_WITH_Y`: UInt = 12u;
public const val `JOY_ISCAL_POV`: Int = 32;
public const val `JOY_ISCAL_R`: Int = 4;
public const val `JOY_ISCAL_U`: Int = 8;
public const val `JOY_ISCAL_V`: Int = 16;
public const val `JOY_ISCAL_XY`: Int = 1;
public const val `JOY_ISCAL_Z`: Int = 2;
public const val `JOY_OEMPOLL_PASSDRIVERDATA`: UInt = 7u;
public const val `JOY_PASSDRIVERDATA`: Int = 268435456;
public const val `JOY_POVVAL_BACKWARD`: UInt = 1u;
public const val `JOY_POVVAL_FORWARD`: UInt = 0u;
public const val `JOY_POVVAL_LEFT`: UInt = 2u;
public const val `JOY_POVVAL_RIGHT`: UInt = 3u;
public const val `JOY_POV_NUMDIRS`: UInt = 4u;
public const val `JOY_US_HASRUDDER`: Int = 1;
public const val `JOY_US_ISOEM`: Int = 4;
public const val `JOY_US_PRESENT`: Int = 2;
public const val `JOY_US_RESERVED`: Int = -2147483648;
public const val `JOY_US_VOLATILE`: Int = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_ATTRIBUTES` (
    public var `KeyboardIdentifier`: `KEYBOARD_ID`,
    public var `KeyboardMode`: UShort,
    public var `NumberOfFunctionKeys`: UShort,
    public var `NumberOfIndicators`: UShort,
    public var `NumberOfKeysTotal`: UShort,
    public var `InputDataQueueLength`: UInt,
    public var `KeyRepeatMinimum`: `KEYBOARD_TYPEMATIC_PARAMETERS`,
    public var `KeyRepeatMaximum`: `KEYBOARD_TYPEMATIC_PARAMETERS`,
)
public const val `KEYBOARD_CAPS_LOCK_ON`: UInt = 4u;
public const val `KEYBOARD_ERROR_VALUE_BASE`: UInt = 10000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_EXTENDED_ATTRIBUTES` (
    public var `Version`: UByte,
    public var `FormFactor`: UByte,
    public var `KeyType`: UByte,
    public var `PhysicalLayout`: UByte,
    public var `VendorSpecificPhysicalLayout`: UByte,
    public var `IETFLanguageTagIndex`: UByte,
    public var `ImplementedInputAssistControls`: UByte,
)
public const val `KEYBOARD_EXTENDED_ATTRIBUTES_STRUCT_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_ID` (
    public var `Type`: UByte,
    public var `Subtype`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_IME_STATUS` (
    public var `UnitId`: UShort,
    public var `ImeOpen`: UInt,
    public var `ImeConvMode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_INDICATOR_PARAMETERS` (
    public var `UnitId`: UShort,
    public var `LedFlags`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KEYBOARD_INDICATOR_TRANSLATION` (
    public var `NumberOfIndicatorKeys`: UShort,
    public var `IndicatorList`: Array<`INDICATOR_LIST`>,
)
// UNSUPPORTED Rust 3856:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KEYBOARD_INDICATOR_TRANSLATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_INPUT_DATA` (
    public var `UnitId`: UShort,
    public var `MakeCode`: UShort,
    public var `Flags`: UShort,
    public var `Reserved`: UShort,
    public var `ExtraInformation`: UInt,
)
public const val `KEYBOARD_KANA_LOCK_ON`: UInt = 8u;
public const val `KEYBOARD_LED_INJECTED`: UInt = 32768u;
public const val `KEYBOARD_NUM_LOCK_ON`: UInt = 2u;
public const val `KEYBOARD_OVERRUN_MAKE_CODE`: UInt = 255u;
public const val `KEYBOARD_SCROLL_LOCK_ON`: UInt = 1u;
public const val `KEYBOARD_SHADOW`: UInt = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_TYPEMATIC_PARAMETERS` (
    public var `UnitId`: UShort,
    public var `Rate`: UShort,
    public var `Delay`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBOARD_UNIT_ID_PARAMETER` (
    public var `UnitId`: UShort,
)
public const val `KEY_BREAK`: UInt = 1u;
public const val `KEY_E0`: UInt = 2u;
public const val `KEY_E1`: UInt = 4u;
public const val `KEY_FROM_KEYBOARD_OVERRIDER`: UInt = 128u;
public const val `KEY_MAKE`: UInt = 0u;
public const val `KEY_RIM_VKEY`: UInt = 64u;
public const val `KEY_TERMSRV_SET_LED`: UInt = 8u;
public const val `KEY_TERMSRV_SHADOW`: UInt = 16u;
public const val `KEY_TERMSRV_VKPACKET`: UInt = 32u;
public const val `KEY_UNICODE_SEQUENCE_END`: UInt = 512u;
public const val `KEY_UNICODE_SEQUENCE_ITEM`: UInt = 256u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDICONFIGUREDEVICESCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMCREATEDEFFECTOBJECTSCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMDEVICEOBJECTSCALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEOBJECTINSTANCEA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMDEVICEOBJECTSCALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEOBJECTINSTANCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMDEVICESBYSEMANTICSCBA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEINSTANCEA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMDEVICESBYSEMANTICSCBW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEINSTANCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMDEVICESCALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEINSTANCEA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMDEVICESCALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIDEVICEINSTANCEW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMEFFECTSCALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIEFFECTINFOA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMEFFECTSCALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIEFFECTINFOW`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIENUMEFFECTSINFILECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DIFILEEFFECT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDIJOYTYPECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNSHOWJOYCPL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`) -> Unit>>>;
public const val `MAXCPOINTSNUM`: UInt = 8u;
public const val `MAX_JOYSTICKOEMVXDNAME`: UInt = 260u;
public const val `MAX_JOYSTRING`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSE_ATTRIBUTES` (
    public var `MouseIdentifier`: UShort,
    public var `NumberOfButtons`: UShort,
    public var `SampleRate`: UShort,
    public var `InputDataQueueLength`: UInt,
)
public const val `MOUSE_BUTTON_1_DOWN`: UInt = 1u;
public const val `MOUSE_BUTTON_1_UP`: UInt = 2u;
public const val `MOUSE_BUTTON_2_DOWN`: UInt = 4u;
public const val `MOUSE_BUTTON_2_UP`: UInt = 8u;
public const val `MOUSE_BUTTON_3_DOWN`: UInt = 16u;
public const val `MOUSE_BUTTON_3_UP`: UInt = 32u;
public const val `MOUSE_BUTTON_4_DOWN`: UInt = 64u;
public const val `MOUSE_BUTTON_4_UP`: UInt = 128u;
public const val `MOUSE_BUTTON_5_DOWN`: UInt = 256u;
public const val `MOUSE_BUTTON_5_UP`: UInt = 512u;
public const val `MOUSE_ERROR_VALUE_BASE`: UInt = 20000u;
public const val `MOUSE_HID_HARDWARE`: UInt = 128u;
public const val `MOUSE_HWHEEL`: UInt = 2048u;
public const val `MOUSE_I8042_HARDWARE`: UInt = 2u;
public const val `MOUSE_INPORT_HARDWARE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MOUSE_INPUT_DATA` (
    public var `UnitId`: UShort,
    public var `Flags`: UShort,
    public var `Anonymous`: `MOUSE_INPUT_DATA_0`,
    public var `RawButtons`: UInt,
    public var `LastX`: Int,
    public var `LastY`: Int,
    public var `ExtraInformation`: UInt,
)
// UNSUPPORTED Rust 3949:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MOUSE_INPUT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3954:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MOUSE_INPUT_DATA_0 {
//     pub Buttons: u32,
//     pub Anonymous: MOUSE_INPUT_DATA_0_0,
// }

// UNSUPPORTED Rust 3960:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MOUSE_INPUT_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSE_INPUT_DATA_0_0` (
    public var `ButtonFlags`: UShort,
    public var `ButtonData`: UShort,
)
public const val `MOUSE_LEFT_BUTTON_DOWN`: UInt = 1u;
public const val `MOUSE_LEFT_BUTTON_UP`: UInt = 2u;
public const val `MOUSE_MIDDLE_BUTTON_DOWN`: UInt = 16u;
public const val `MOUSE_MIDDLE_BUTTON_UP`: UInt = 32u;
public const val `MOUSE_RIGHT_BUTTON_DOWN`: UInt = 4u;
public const val `MOUSE_RIGHT_BUTTON_UP`: UInt = 8u;
public const val `MOUSE_SERIAL_HARDWARE`: UInt = 4u;
public const val `MOUSE_TERMSRV_SRC_SHADOW`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSE_UNIT_ID_PARAMETER` (
    public var `UnitId`: UShort,
)
public const val `MOUSE_WHEEL`: UInt = 1024u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_HidP_GetVersionInternal` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PHIDP_INSERT_SCANCODES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCSTR`, UInt) -> Boolean>>>;
public typealias `PHIDP_PREPARSED_DATA` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USAGE_AND_PAGE` (
    public var `Usage`: UShort,
    public var `UsagePage`: UShort,
)
public const val `WHEELMOUSE_HID_HARDWARE`: UInt = 256u;
public const val `WHEELMOUSE_I8042_HARDWARE`: UInt = 32u;
public const val `WHEELMOUSE_SERIAL_HARDWARE`: UInt = 64u;
