// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDAllocateLinkedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDAllocateLinkedMemory`(`pparent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbsize` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDAttachLinkedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDAttachLinkedMemory`(`pparent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pchild` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDeviceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDeviceHost`(`pszlocalid` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppdevicehost` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDeviceHost2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDeviceHost2`(`pszlocalid` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pconfigparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSD_CONFIG_PARAM`>?, `dwconfigparamcount` : UInt, `ppdevicehost` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDeviceHostAdvanced; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDeviceHostAdvanced`(`pszlocalid` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pphostaddresses` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwhostaddresscount` : UInt, `ppdevicehost` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDeviceProxy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDeviceProxy`(`pszdeviceid` : `windows_sys`.`core`.`PCWSTR`, `pszlocalid` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppdeviceproxy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDeviceProxy2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDeviceProxy2`(`pszdeviceid` : `windows_sys`.`core`.`PCWSTR`, `pszlocalid` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pconfigparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSD_CONFIG_PARAM`>?, `dwconfigparamcount` : UInt, `ppdeviceproxy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDeviceProxyAdvanced; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDeviceProxyAdvanced`(`pszdeviceid` : `windows_sys`.`core`.`PCWSTR`, `pdeviceaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszlocalid` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppdeviceproxy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDiscoveryProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDiscoveryProvider`(`pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDiscoveryProvider2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDiscoveryProvider2`(`pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pconfigparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSD_CONFIG_PARAM`>?, `dwconfigparamcount` : UInt, `ppprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDiscoveryPublisher; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDiscoveryPublisher`(`pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pppublisher` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateDiscoveryPublisher2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateDiscoveryPublisher2`(`pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pconfigparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSD_CONFIG_PARAM`>?, `dwconfigparamcount` : UInt, `pppublisher` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateHttpAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateHttpAddress`(`ppaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateHttpMessageParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateHttpMessageParameters`(`pptxparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateOutboundAttachment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateOutboundAttachment`(`ppattachment` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateUdpAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateUdpAddress`(`ppaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDCreateUdpMessageParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDCreateUdpMessageParameters`(`pptxparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDDetachLinkedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDDetachLinkedMemory`(`pvoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDFreeLinkedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDFreeLinkedMemory`(`pvoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDGenerateFault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDGenerateFault`(`pszcode` : `windows_sys`.`core`.`PCWSTR`, `pszsubcode` : `windows_sys`.`core`.`PCWSTR`, `pszreason` : `windows_sys`.`core`.`PCWSTR`, `pszdetail` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppfault` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WSD_SOAP_FAULT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDGenerateFaultEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDGenerateFaultEx`(`pcode` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?, `psubcode` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?, `preasons` : /* Rust *const */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?, `pszdetail` : `windows_sys`.`core`.`PCWSTR`, `ppfault` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WSD_SOAP_FAULT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDGetConfigurationOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDGetConfigurationOption`(`dwoption` : UInt, `pvoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cboutbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDSetConfigurationOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDSetConfigurationOption`(`dwoption` : UInt, `pvoid` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbinbuffer` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDUriDecode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDUriDecode`(`source` : `windows_sys`.`core`.`PCWSTR`, `cchsource` : UInt, `destout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `cchdestout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDUriEncode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDUriEncode`(`source` : `windows_sys`.`core`.`PCWSTR`, `cchsource` : UInt, `destout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `cchdestout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLAddChild; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLAddChild`(`pparent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?, `pchild` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLAddSibling; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLAddSibling`(`pfirst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?, `psecond` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLBuildAnyForSingleElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLBuildAnyForSingleElement`(`pelementname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?, `psztext` : `windows_sys`.`core`.`PCWSTR`, `ppany` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WSDXML_ELEMENT`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLCleanupElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLCleanupElement`(`pany` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLCreateContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLCreateContext`(`ppcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLGetNameFromBuiltinNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLGetNameFromBuiltinNamespace`(`psznamespace` : `windows_sys`.`core`.`PCWSTR`, `pszname` : `windows_sys`.`core`.`PCWSTR`, `ppname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WSDXML_NAME`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wsdapi.dll, ABI=system, export=WSDXMLGetValueFromAny; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WSDXMLGetValueFromAny`(`psznamespace` : `windows_sys`.`core`.`PCWSTR`, `pszname` : `windows_sys`.`core`.`PCWSTR`, `pany` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?, `ppszvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
public typealias `DeviceDiscoveryMechanism` = Int;
public const val `DirectedDiscovery`: `DeviceDiscoveryMechanism` = 1;
public const val `MulticastDiscovery`: `DeviceDiscoveryMechanism` = 0;
public const val `ONE_WAY`: `WSDUdpMessageType` = 0;
public const val `OpAnyElement`: `WSDXML_OP` = 6;
public const val `OpAnyElements`: `WSDXML_OP` = 7;
public const val `OpAnyNumber`: `WSDXML_OP` = 17;
public const val `OpAnyText`: `WSDXML_OP` = 8;
public const val `OpAnything`: `WSDXML_OP` = 16;
public const val `OpAttribute_`: `WSDXML_OP` = 9;
public const val `OpBeginAll`: `WSDXML_OP` = 14;
public const val `OpBeginAnyElement`: `WSDXML_OP` = 3;
public const val `OpBeginChoice`: `WSDXML_OP` = 10;
public const val `OpBeginElement_`: `WSDXML_OP` = 2;
public const val `OpBeginSequence`: `WSDXML_OP` = 12;
public const val `OpElement_`: `WSDXML_OP` = 5;
public const val `OpEndAll`: `WSDXML_OP` = 15;
public const val `OpEndChoice`: `WSDXML_OP` = 11;
public const val `OpEndElement`: `WSDXML_OP` = 4;
public const val `OpEndOfTable`: `WSDXML_OP` = 1;
public const val `OpEndSequence`: `WSDXML_OP` = 13;
public const val `OpFormatBool_`: `WSDXML_OP` = 20;
public const val `OpFormatDateTime_`: `WSDXML_OP` = 40;
public const val `OpFormatDom_`: `WSDXML_OP` = 30;
public const val `OpFormatDouble_`: `WSDXML_OP` = 42;
public const val `OpFormatDuration_`: `WSDXML_OP` = 39;
public const val `OpFormatDynamicType_`: `WSDXML_OP` = 37;
public const val `OpFormatFloat_`: `WSDXML_OP` = 41;
public const val `OpFormatInt16_`: `WSDXML_OP` = 22;
public const val `OpFormatInt32_`: `WSDXML_OP` = 23;
public const val `OpFormatInt64_`: `WSDXML_OP` = 24;
public const val `OpFormatInt8_`: `WSDXML_OP` = 21;
public const val `OpFormatListInsertTail_`: `WSDXML_OP` = 35;
public const val `OpFormatLookupType_`: `WSDXML_OP` = 38;
public const val `OpFormatMax`: `WSDXML_OP` = 46;
public const val `OpFormatName_`: `WSDXML_OP` = 34;
public const val `OpFormatStruct_`: `WSDXML_OP` = 31;
public const val `OpFormatType_`: `WSDXML_OP` = 36;
public const val `OpFormatUInt16_`: `WSDXML_OP` = 26;
public const val `OpFormatUInt32_`: `WSDXML_OP` = 27;
public const val `OpFormatUInt64_`: `WSDXML_OP` = 28;
public const val `OpFormatUInt8_`: `WSDXML_OP` = 25;
public const val `OpFormatUnicodeString_`: `WSDXML_OP` = 29;
public const val `OpFormatUri_`: `WSDXML_OP` = 32;
public const val `OpFormatUuidUri_`: `WSDXML_OP` = 33;
public const val `OpFormatXMLDeclaration_`: `WSDXML_OP` = 45;
public const val `OpNone`: `WSDXML_OP` = 0;
public const val `OpOneOrMore`: `WSDXML_OP` = 18;
public const val `OpOptional`: `WSDXML_OP` = 19;
public const val `OpProcess_`: `WSDXML_OP` = 43;
public const val `OpQualifiedAttribute_`: `WSDXML_OP` = 44;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWSD_SOAP_MESSAGE_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENT`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REQUESTBODY_GetStatus` (
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 90:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REQUESTBODY_GetStatus {
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
public class `REQUESTBODY_Renew` (
    public var `Expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 101:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REQUESTBODY_Renew {
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
public class `REQUESTBODY_Subscribe` (
    public var `EndTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Delivery`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_DELIVERY_MODE`>?,
    public var `Expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `Filter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_FILTER`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 115:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REQUESTBODY_Subscribe {
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
public class `REQUESTBODY_Unsubscribe` (
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REQUESTBODY_Unsubscribe {
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
public class `RESPONSEBODY_GetMetadata` (
    public var `Metadata`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_METADATA_SECTION_LIST`>?,
)
// UNSUPPORTED Rust 135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESPONSEBODY_GetMetadata {
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
public class `RESPONSEBODY_GetStatus` (
    public var `expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 146:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESPONSEBODY_GetStatus {
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
public class `RESPONSEBODY_Renew` (
    public var `expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 157:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESPONSEBODY_Renew {
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
public class `RESPONSEBODY_Subscribe` (
    public var `SubscriptionManager`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 169:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESPONSEBODY_Subscribe {
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
public class `RESPONSEBODY_SubscriptionEnd` (
    public var `SubscriptionManager`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Status`: `windows_sys`.`core`.`PCWSTR`,
    public var `Reason`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 182:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESPONSEBODY_SubscriptionEnd {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SecureDirectedDiscovery`: `DeviceDiscoveryMechanism` = 2;
public const val `TWO_WAY`: `WSDUdpMessageType` = 1;
public const val `WSDAPI_ADDRESSFAMILY_IPV4`: UInt = 1u;
public const val `WSDAPI_ADDRESSFAMILY_IPV6`: UInt = 2u;
public const val `WSDAPI_COMPACTSIG_ACCEPT_ALL_MESSAGES`: UInt = 1u;
public const val `WSDAPI_OPTION_MAX_INBOUND_MESSAGE_SIZE`: UInt = 1u;
public const val `WSDAPI_OPTION_TRACE_XML_TO_DEBUGGER`: UInt = 2u;
public const val `WSDAPI_OPTION_TRACE_XML_TO_FILE`: UInt = 3u;
public const val `WSDAPI_SSL_CERT_APPLY_DEFAULT_CHECKS`: UInt = 0u;
public const val `WSDAPI_SSL_CERT_IGNORE_EXPIRY`: UInt = 2u;
public const val `WSDAPI_SSL_CERT_IGNORE_INVALID_CN`: UInt = 16u;
public const val `WSDAPI_SSL_CERT_IGNORE_REVOCATION`: UInt = 1u;
public const val `WSDAPI_SSL_CERT_IGNORE_UNKNOWN_CA`: UInt = 8u;
public const val `WSDAPI_SSL_CERT_IGNORE_WRONG_USAGE`: UInt = 4u;
public const val `WSDET_INCOMING_FAULT`: `WSDEventType` = 2;
public const val `WSDET_INCOMING_MESSAGE`: `WSDEventType` = 1;
public const val `WSDET_NONE`: `WSDEventType` = 0;
public const val `WSDET_RESPONSE_TIMEOUT`: `WSDEventType` = 4;
public const val `WSDET_TRANSMISSION_FAILURE`: `WSDEventType` = 3;
public typealias `WSDEventType` = Int;
public typealias `WSDUdpMessageType` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WSDUdpRetransmitParams` (
    public var `ulSendDelay`: UInt,
    public var `ulRepeat`: UInt,
    public var `ulRepeatMinDelay`: UInt,
    public var `ulRepeatMaxDelay`: UInt,
    public var `ulRepeatUpperDelay`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_ATTRIBUTE` (
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ATTRIBUTE`>?,
    public var `Name`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `Value`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 225:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_ATTRIBUTE {
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
public class `WSDXML_ELEMENT` (
    public var `Node`: `WSDXML_NODE`,
    public var `Name`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `FirstAttribute`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ATTRIBUTE`>?,
    public var `FirstChild`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NODE`>?,
    public var `PrefixMappings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_PREFIX_MAPPING`>?,
)
// UNSUPPORTED Rust 239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_ELEMENT {
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
public class `WSDXML_ELEMENT_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_ELEMENT_LIST {
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
public class `WSDXML_NAME` (
    public var `Space`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAMESPACE`>?,
    public var `LocalName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_NAME {
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
public class `WSDXML_NAMESPACE` (
    public var `Uri`: `windows_sys`.`core`.`PCWSTR`,
    public var `PreferredPrefix`: `windows_sys`.`core`.`PCWSTR`,
    public var `Names`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `NamesCount`: UShort,
    public var `Encoding`: UShort,
)
// UNSUPPORTED Rust 275:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_NAMESPACE {
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
public class `WSDXML_NODE` (
    public var `Type`: Int,
    public var `Parent`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NODE`>?,
)
// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl WSDXML_NODE {
//     pub const ElementType: i32 = 0i32;
//     pub const TextType: i32 = 1i32;
// }

// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSDXML_OP` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_PREFIX_MAPPING` (
    public var `Refs`: UInt,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_PREFIX_MAPPING`>?,
    public var `Space`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAMESPACE`>?,
    public var `Prefix`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_PREFIX_MAPPING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_TEXT` (
    public var `Node`: `WSDXML_NODE`,
    public var `Text`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_TEXT {
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
public class `WSDXML_TYPE` (
    public var `Uri`: `windows_sys`.`core`.`PCWSTR`,
    public var `Table`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSDXML_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_APP_SEQUENCE` (
    public var `InstanceId`: ULong,
    public var `SequenceId`: `windows_sys`.`core`.`PCWSTR`,
    public var `MessageNumber`: ULong,
)
// UNSUPPORTED Rust 339:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_APP_SEQUENCE {
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
public class `WSD_BYE` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 350:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_BYE {
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
public class `WSD_CONFIG_ADDRESSES` (
    public var `addresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `dwAddressCount`: UInt,
)
// UNSUPPORTED Rust 361:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_CONFIG_ADDRESSES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSD_CONFIG_DEVICE_ADDRESSES`: `WSD_CONFIG_PARAM_TYPE` = 10;
public const val `WSD_CONFIG_HOSTING_ADDRESSES`: `WSD_CONFIG_PARAM_TYPE` = 9;
public const val `WSD_CONFIG_MAX_INBOUND_MESSAGE_SIZE`: `WSD_CONFIG_PARAM_TYPE` = 1;
public const val `WSD_CONFIG_MAX_OUTBOUND_MESSAGE_SIZE`: `WSD_CONFIG_PARAM_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_CONFIG_PARAM` (
    public var `configParamType`: `WSD_CONFIG_PARAM_TYPE`,
    public var `pConfigData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwConfigDataSize`: UInt,
)
// UNSUPPORTED Rust 377:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_CONFIG_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSD_CONFIG_PARAM_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WSD_DATETIME` (
    public var `isPositive`: `windows_sys`.`core`.`BOOL`,
    public var `year`: UInt,
    public var `month`: UByte,
    public var `day`: UByte,
    public var `hour`: UByte,
    public var `minute`: UByte,
    public var `second`: UByte,
    public var `millisecond`: UInt,
    public var `TZIsLocal`: `windows_sys`.`core`.`BOOL`,
    public var `TZIsPositive`: `windows_sys`.`core`.`BOOL`,
    public var `TZHour`: UByte,
    public var `TZMinute`: UByte,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSD_DEFAULT_EVENTING_ADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("http://*:5357/");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSD_DEFAULT_HOSTING_ADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("http://*:5357/");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WSD_DEFAULT_SECURE_HOSTING_ADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("https://*:5358/");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WSD_DURATION` (
    public var `isPositive`: `windows_sys`.`core`.`BOOL`,
    public var `year`: UInt,
    public var `month`: UInt,
    public var `day`: UInt,
    public var `hour`: UInt,
    public var `minute`: UInt,
    public var `second`: UInt,
    public var `millisecond`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_ENDPOINT_REFERENCE` (
    public var `Address`: `windows_sys`.`core`.`PCWSTR`,
    public var `ReferenceProperties`: `WSD_REFERENCE_PROPERTIES`,
    public var `ReferenceParameters`: `WSD_REFERENCE_PARAMETERS`,
    public var `PortType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `ServiceName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_ENDPOINT_REFERENCE {
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
public class `WSD_ENDPOINT_REFERENCE_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
)
// UNSUPPORTED Rust 435:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_ENDPOINT_REFERENCE_LIST {
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
public class `WSD_EVENT` (
    public var `Hr`: `windows_sys`.`core`.`HRESULT`,
    public var `EventType`: UInt,
    public var `DispatchTag`: `windows_sys`.`core`.`PWSTR`,
    public var `HandlerContext`: `WSD_HANDLER_CONTEXT`,
    public var `Soap`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_MESSAGE`>?,
    public var `Operation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_OPERATION`>?,
    public var `MessageParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_EVENT {
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
public class `WSD_EVENTING_DELIVERY_MODE` (
    public var `Mode`: `windows_sys`.`core`.`PCWSTR`,
    public var `Push`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_DELIVERY_MODE_PUSH`>?,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_EVENTING_DELIVERY_MODE {
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
public class `WSD_EVENTING_DELIVERY_MODE_PUSH` (
    public var `NotifyTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
)
// UNSUPPORTED Rust 473:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_EVENTING_DELIVERY_MODE_PUSH {
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
public class `WSD_EVENTING_EXPIRES` (
    public var `Duration`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_DURATION`>?,
    public var `DateTime`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_DATETIME`>?,
)
// UNSUPPORTED Rust 484:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_EVENTING_EXPIRES {
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
public class `WSD_EVENTING_FILTER` (
    public var `Dialect`: `windows_sys`.`core`.`PCWSTR`,
    public var `FilterAction`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_FILTER_ACTION`>?,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 496:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_EVENTING_FILTER {
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
public class `WSD_EVENTING_FILTER_ACTION` (
    public var `Actions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
)
// UNSUPPORTED Rust 506:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_EVENTING_FILTER_ACTION {
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
public class `WSD_HANDLER_CONTEXT` (
    public var `Handler`: `PWSD_SOAP_MESSAGE_HANDLER`,
    public var `PVoid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Unknown`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_HANDLER_CONTEXT {
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
public class `WSD_HEADER_RELATESTO` (
    public var `RelationshipType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `MessageID`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 529:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_HEADER_RELATESTO {
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
public class `WSD_HELLO` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Types`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `Scopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SCOPES`>?,
    public var `XAddrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
    public var `MetadataVersion`: ULong,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_HELLO {
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
public class `WSD_HOST_METADATA` (
    public var `Host`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA`>?,
    public var `Hosted`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA_LIST`>?,
)
// UNSUPPORTED Rust 555:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_HOST_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_LOCALIZED_STRING` (
    public var `lang`: `windows_sys`.`core`.`PCWSTR`,
    public var `String`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 566:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_LOCALIZED_STRING {
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
public class `WSD_LOCALIZED_STRING_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING`>?,
)
// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_LOCALIZED_STRING_LIST {
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
public class `WSD_METADATA_SECTION` (
    public var `Dialect`: `windows_sys`.`core`.`PCWSTR`,
    public var `Identifier`: `windows_sys`.`core`.`PCWSTR`,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MetadataReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Location`: `windows_sys`.`core`.`PCWSTR`,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 592:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_METADATA_SECTION {
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
public class `WSD_METADATA_SECTION_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_METADATA_SECTION_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_METADATA_SECTION`>?,
)
// UNSUPPORTED Rust 603:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_METADATA_SECTION_LIST {
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
public class `WSD_NAME_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
)
// UNSUPPORTED Rust 614:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_NAME_LIST {
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
public class `WSD_OPERATION` (
    public var `RequestType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_TYPE`>?,
    public var `ResponseType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_TYPE`>?,
    public var `RequestStubFunction`: `WSD_STUB_FUNCTION`,
)
// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_OPERATION {
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
public class `WSD_PORT_TYPE` (
    public var `EncodedName`: UInt,
    public var `OperationCount`: UInt,
    public var `Operations`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_OPERATION`>?,
    public var `ProtocolType`: `WSD_PROTOCOL_TYPE`,
)
// UNSUPPORTED Rust 639:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_PORT_TYPE {
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
public class `WSD_PROBE` (
    public var `Types`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `Scopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SCOPES`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 651:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_PROBE {
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
public class `WSD_PROBE_MATCH` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Types`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `Scopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SCOPES`>?,
    public var `XAddrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
    public var `MetadataVersion`: ULong,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 666:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_PROBE_MATCH {
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
public class `WSD_PROBE_MATCHES` (
    public var `ProbeMatch`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_PROBE_MATCH_LIST`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_PROBE_MATCHES {
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
public class `WSD_PROBE_MATCH_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_PROBE_MATCH_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_PROBE_MATCH`>?,
)
// UNSUPPORTED Rust 688:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_PROBE_MATCH_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSD_PROTOCOL_TYPE` = Int;
public const val `WSD_PT_ALL`: `WSD_PROTOCOL_TYPE` = 255;
public const val `WSD_PT_HTTP`: `WSD_PROTOCOL_TYPE` = 2;
public const val `WSD_PT_HTTPS`: `WSD_PROTOCOL_TYPE` = 4;
public const val `WSD_PT_NONE`: `WSD_PROTOCOL_TYPE` = 0;
public const val `WSD_PT_UDP`: `WSD_PROTOCOL_TYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_REFERENCE_PARAMETERS` (
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 704:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_REFERENCE_PARAMETERS {
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
public class `WSD_REFERENCE_PROPERTIES` (
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_REFERENCE_PROPERTIES {
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
public class `WSD_RELATIONSHIP_METADATA` (
    public var `Type`: `windows_sys`.`core`.`PCWSTR`,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_HOST_METADATA`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 726:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_RELATIONSHIP_METADATA {
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
public class `WSD_RESOLVE` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 737:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_RESOLVE {
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
public class `WSD_RESOLVE_MATCH` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Types`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `Scopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SCOPES`>?,
    public var `XAddrs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
    public var `MetadataVersion`: ULong,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_RESOLVE_MATCH {
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
public class `WSD_RESOLVE_MATCHES` (
    public var `ResolveMatch`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_RESOLVE_MATCH`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_RESOLVE_MATCHES {
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
public class `WSD_SCOPES` (
    public var `MatchBy`: `windows_sys`.`core`.`PCWSTR`,
    public var `Scopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
)
// UNSUPPORTED Rust 774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SCOPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SECURITY_CERT_VALIDATION` (
    public var `certMatchArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?,
    public var `dwCertMatchArrayCount`: UInt,
    public var `hCertMatchStore`: `super`.`super`.`Security`.`Cryptography`.`HCERTSTORE`,
    public var `hCertIssuerStore`: `super`.`super`.`Security`.`Cryptography`.`HCERTSTORE`,
    public var `dwCertCheckOptions`: UInt,
    public var `pszCNGHashAlgId`: `windows_sys`.`core`.`PCWSTR`,
    public var `pbCertHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwCertHashSize`: UInt,
)
// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WSD_SECURITY_CERT_VALIDATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SECURITY_CERT_VALIDATION_V1` (
    public var `certMatchArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?,
    public var `dwCertMatchArrayCount`: UInt,
    public var `hCertMatchStore`: `super`.`super`.`Security`.`Cryptography`.`HCERTSTORE`,
    public var `hCertIssuerStore`: `super`.`super`.`Security`.`Cryptography`.`HCERTSTORE`,
    public var `dwCertCheckOptions`: UInt,
)
// UNSUPPORTED Rust 808:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WSD_SECURITY_CERT_VALIDATION_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSD_SECURITY_COMPACTSIG_SIGNING_CERT`: `WSD_CONFIG_PARAM_TYPE` = 7;
public const val `WSD_SECURITY_COMPACTSIG_VALIDATION`: `WSD_CONFIG_PARAM_TYPE` = 8;
public const val `WSD_SECURITY_HTTP_AUTH_SCHEME_NEGOTIATE`: UInt = 1u;
public const val `WSD_SECURITY_HTTP_AUTH_SCHEME_NTLM`: UInt = 2u;
public const val `WSD_SECURITY_REQUIRE_CLIENT_CERT_OR_HTTP_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 12;
public const val `WSD_SECURITY_REQUIRE_HTTP_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SECURITY_SIGNATURE_VALIDATION` (
    public var `signingCertArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?,
    public var `dwSigningCertArrayCount`: UInt,
    public var `hSigningCertStore`: `super`.`super`.`Security`.`Cryptography`.`HCERTSTORE`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WSD_SECURITY_SIGNATURE_VALIDATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSD_SECURITY_SSL_CERT_FOR_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 3;
public const val `WSD_SECURITY_SSL_CLIENT_CERT_VALIDATION`: `WSD_CONFIG_PARAM_TYPE` = 5;
public const val `WSD_SECURITY_SSL_NEGOTIATE_CLIENT_CERT`: `WSD_CONFIG_PARAM_TYPE` = 6;
public const val `WSD_SECURITY_SSL_SERVER_CERT_VALIDATION`: `WSD_CONFIG_PARAM_TYPE` = 4;
public const val `WSD_SECURITY_USE_HTTP_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SERVICE_METADATA` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE_LIST`>?,
    public var `Types`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `ServiceId`: `windows_sys`.`core`.`PCWSTR`,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 848:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SERVICE_METADATA {
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
public class `WSD_SERVICE_METADATA_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA`>?,
)
// UNSUPPORTED Rust 859:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SERVICE_METADATA_LIST {
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
public class `WSD_SOAP_FAULT` (
    public var `Code`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_FAULT_CODE`>?,
    public var `Reason`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_FAULT_REASON`>?,
    public var `Node`: `windows_sys`.`core`.`PCWSTR`,
    public var `Role`: `windows_sys`.`core`.`PCWSTR`,
    public var `Detail`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 873:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SOAP_FAULT {
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
public class `WSD_SOAP_FAULT_CODE` (
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `Subcode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_FAULT_SUBCODE`>?,
)
// UNSUPPORTED Rust 884:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SOAP_FAULT_CODE {
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
public class `WSD_SOAP_FAULT_REASON` (
    public var `Text`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
)
// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SOAP_FAULT_REASON {
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
public class `WSD_SOAP_FAULT_SUBCODE` (
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `Subcode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_FAULT_SUBCODE`>?,
)
// UNSUPPORTED Rust 905:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SOAP_FAULT_SUBCODE {
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
public class `WSD_SOAP_HEADER` (
    public var `To`: `windows_sys`.`core`.`PCWSTR`,
    public var `Action`: `windows_sys`.`core`.`PCWSTR`,
    public var `MessageID`: `windows_sys`.`core`.`PCWSTR`,
    public var `RelatesTo`: `WSD_HEADER_RELATESTO`,
    public var `ReplyTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `From`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `FaultTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `AppSequence`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_APP_SEQUENCE`>?,
    public var `AnyHeaders`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SOAP_HEADER {
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
public class `WSD_SOAP_MESSAGE` (
    public var `Header`: `WSD_SOAP_HEADER`,
    public var `Body`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BodyType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_TYPE`>?,
)
// UNSUPPORTED Rust 935:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SOAP_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WSD_STUB_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENT`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SYNCHRONOUS_RESPONSE_CONTEXT` (
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `eventHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `messageParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `results`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_SYNCHRONOUS_RESPONSE_CONTEXT {
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
public class `WSD_THIS_DEVICE_METADATA` (
    public var `FriendlyName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
    public var `FirmwareVersion`: `windows_sys`.`core`.`PCWSTR`,
    public var `SerialNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 962:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_THIS_DEVICE_METADATA {
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
public class `WSD_THIS_MODEL_METADATA` (
    public var `Manufacturer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
    public var `ManufacturerUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `ModelName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
    public var `ModelNumber`: `windows_sys`.`core`.`PCWSTR`,
    public var `ModelUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `PresentationUrl`: `windows_sys`.`core`.`PCWSTR`,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 978:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_THIS_MODEL_METADATA {
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
public class `WSD_UNKNOWN_LOOKUP` (
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
)
// UNSUPPORTED Rust 988:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_UNKNOWN_LOOKUP {
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
public class `WSD_URI_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
    public var `Element`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 999:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WSD_URI_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

