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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `REQUESTBODY_GetStatus`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `REQUESTBODY_GetStatus`.Companion.`default`() : `REQUESTBODY_GetStatus` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REQUESTBODY_Renew` (
    public var `Expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `REQUESTBODY_Renew`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `REQUESTBODY_Renew`.Companion.`default`() : `REQUESTBODY_Renew` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `REQUESTBODY_Subscribe`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `REQUESTBODY_Subscribe`.Companion.`default`() : `REQUESTBODY_Subscribe` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REQUESTBODY_Unsubscribe` (
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `REQUESTBODY_Unsubscribe`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `REQUESTBODY_Unsubscribe`.Companion.`default`() : `REQUESTBODY_Unsubscribe` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESPONSEBODY_GetMetadata` (
    public var `Metadata`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_METADATA_SECTION_LIST`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESPONSEBODY_GetMetadata`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESPONSEBODY_GetMetadata`.Companion.`default`() : `RESPONSEBODY_GetMetadata` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESPONSEBODY_GetStatus` (
    public var `expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESPONSEBODY_GetStatus`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESPONSEBODY_GetStatus`.Companion.`default`() : `RESPONSEBODY_GetStatus` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESPONSEBODY_Renew` (
    public var `expires`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_EVENTING_EXPIRES`>?,
    public var `any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESPONSEBODY_Renew`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESPONSEBODY_Renew`.Companion.`default`() : `RESPONSEBODY_Renew` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESPONSEBODY_Subscribe`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESPONSEBODY_Subscribe`.Companion.`default`() : `RESPONSEBODY_Subscribe` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RESPONSEBODY_SubscriptionEnd`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RESPONSEBODY_SubscriptionEnd`.Companion.`default`() : `RESPONSEBODY_SubscriptionEnd` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_ATTRIBUTE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_ATTRIBUTE`.Companion.`default`() : `WSDXML_ATTRIBUTE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_ELEMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_ELEMENT`.Companion.`default`() : `WSDXML_ELEMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_ELEMENT_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_ELEMENT_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_ELEMENT_LIST`.Companion.`default`() : `WSDXML_ELEMENT_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_NAME` (
    public var `Space`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAMESPACE`>?,
    public var `LocalName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_NAME`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_NAME`.Companion.`default`() : `WSDXML_NAME` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_NAMESPACE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_NAMESPACE`.Companion.`default`() : `WSDXML_NAMESPACE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule; syntax: factory impl contains Const; no associated items are omitted
// impl WSDXML_NODE {
//     pub const ElementType: i32 = 0i32;
//     pub const TextType: i32 = 1i32;
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_NODE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_NODE`.Companion.`default`() : `WSDXML_NODE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_PREFIX_MAPPING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_PREFIX_MAPPING`.Companion.`default`() : `WSDXML_PREFIX_MAPPING` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_TEXT` (
    public var `Node`: `WSDXML_NODE`,
    public var `Text`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_TEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_TEXT`.Companion.`default`() : `WSDXML_TEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSDXML_TYPE` (
    public var `Uri`: `windows_sys`.`core`.`PCWSTR`,
    public var `Table`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSDXML_TYPE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSDXML_TYPE`.Companion.`default`() : `WSDXML_TYPE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_APP_SEQUENCE` (
    public var `InstanceId`: ULong,
    public var `SequenceId`: `windows_sys`.`core`.`PCWSTR`,
    public var `MessageNumber`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_APP_SEQUENCE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_APP_SEQUENCE`.Companion.`default`() : `WSD_APP_SEQUENCE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_BYE` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_BYE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_BYE`.Companion.`default`() : `WSD_BYE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_CONFIG_ADDRESSES` (
    public var `addresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `dwAddressCount`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_CONFIG_ADDRESSES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_CONFIG_ADDRESSES`.Companion.`default`() : `WSD_CONFIG_ADDRESSES` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_CONFIG_PARAM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_CONFIG_PARAM`.Companion.`default`() : `WSD_CONFIG_PARAM` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_ENDPOINT_REFERENCE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_ENDPOINT_REFERENCE`.Companion.`default`() : `WSD_ENDPOINT_REFERENCE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_ENDPOINT_REFERENCE_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_ENDPOINT_REFERENCE_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_ENDPOINT_REFERENCE_LIST`.Companion.`default`() : `WSD_ENDPOINT_REFERENCE_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_EVENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_EVENT`.Companion.`default`() : `WSD_EVENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_EVENTING_DELIVERY_MODE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_EVENTING_DELIVERY_MODE`.Companion.`default`() : `WSD_EVENTING_DELIVERY_MODE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_EVENTING_DELIVERY_MODE_PUSH` (
    public var `NotifyTo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_EVENTING_DELIVERY_MODE_PUSH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_EVENTING_DELIVERY_MODE_PUSH`.Companion.`default`() : `WSD_EVENTING_DELIVERY_MODE_PUSH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_EVENTING_EXPIRES` (
    public var `Duration`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_DURATION`>?,
    public var `DateTime`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_DATETIME`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_EVENTING_EXPIRES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_EVENTING_EXPIRES`.Companion.`default`() : `WSD_EVENTING_EXPIRES` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_EVENTING_FILTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_EVENTING_FILTER`.Companion.`default`() : `WSD_EVENTING_FILTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_EVENTING_FILTER_ACTION` (
    public var `Actions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_EVENTING_FILTER_ACTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_EVENTING_FILTER_ACTION`.Companion.`default`() : `WSD_EVENTING_FILTER_ACTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_HANDLER_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_HANDLER_CONTEXT`.Companion.`default`() : `WSD_HANDLER_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_HEADER_RELATESTO` (
    public var `RelationshipType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `MessageID`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_HEADER_RELATESTO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_HEADER_RELATESTO`.Companion.`default`() : `WSD_HEADER_RELATESTO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_HELLO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_HELLO`.Companion.`default`() : `WSD_HELLO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_HOST_METADATA` (
    public var `Host`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA`>?,
    public var `Hosted`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA_LIST`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_HOST_METADATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_HOST_METADATA`.Companion.`default`() : `WSD_HOST_METADATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_LOCALIZED_STRING` (
    public var `lang`: `windows_sys`.`core`.`PCWSTR`,
    public var `String`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_LOCALIZED_STRING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_LOCALIZED_STRING`.Companion.`default`() : `WSD_LOCALIZED_STRING` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_LOCALIZED_STRING_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_LOCALIZED_STRING_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_LOCALIZED_STRING_LIST`.Companion.`default`() : `WSD_LOCALIZED_STRING_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_METADATA_SECTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_METADATA_SECTION`.Companion.`default`() : `WSD_METADATA_SECTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_METADATA_SECTION_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_METADATA_SECTION_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_METADATA_SECTION`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_METADATA_SECTION_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_METADATA_SECTION_LIST`.Companion.`default`() : `WSD_METADATA_SECTION_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_NAME_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_NAME_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_NAME_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_NAME_LIST`.Companion.`default`() : `WSD_NAME_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_OPERATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_OPERATION`.Companion.`default`() : `WSD_OPERATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_PORT_TYPE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_PORT_TYPE`.Companion.`default`() : `WSD_PORT_TYPE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_PROBE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_PROBE`.Companion.`default`() : `WSD_PROBE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_PROBE_MATCH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_PROBE_MATCH`.Companion.`default`() : `WSD_PROBE_MATCH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_PROBE_MATCHES` (
    public var `ProbeMatch`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_PROBE_MATCH_LIST`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_PROBE_MATCHES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_PROBE_MATCHES`.Companion.`default`() : `WSD_PROBE_MATCHES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_PROBE_MATCH_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_PROBE_MATCH_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_PROBE_MATCH`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_PROBE_MATCH_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_PROBE_MATCH_LIST`.Companion.`default`() : `WSD_PROBE_MATCH_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_REFERENCE_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_REFERENCE_PARAMETERS`.Companion.`default`() : `WSD_REFERENCE_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_REFERENCE_PROPERTIES` (
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_REFERENCE_PROPERTIES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_REFERENCE_PROPERTIES`.Companion.`default`() : `WSD_REFERENCE_PROPERTIES` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_RELATIONSHIP_METADATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_RELATIONSHIP_METADATA`.Companion.`default`() : `WSD_RELATIONSHIP_METADATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_RESOLVE` (
    public var `EndpointReference`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_ENDPOINT_REFERENCE`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_RESOLVE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_RESOLVE`.Companion.`default`() : `WSD_RESOLVE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_RESOLVE_MATCH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_RESOLVE_MATCH`.Companion.`default`() : `WSD_RESOLVE_MATCH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_RESOLVE_MATCHES` (
    public var `ResolveMatch`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_RESOLVE_MATCH`>?,
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_RESOLVE_MATCHES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_RESOLVE_MATCHES`.Companion.`default`() : `WSD_RESOLVE_MATCHES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SCOPES` (
    public var `MatchBy`: `windows_sys`.`core`.`PCWSTR`,
    public var `Scopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SCOPES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SCOPES`.Companion.`default`() : `WSD_SCOPES` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SECURITY_CERT_VALIDATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]

    public fun `WSD_SECURITY_CERT_VALIDATION`.Companion.`default`() : `WSD_SECURITY_CERT_VALIDATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SECURITY_CERT_VALIDATION_V1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]

    public fun `WSD_SECURITY_CERT_VALIDATION_V1`.Companion.`default`() : `WSD_SECURITY_CERT_VALIDATION_V1` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SECURITY_SIGNATURE_VALIDATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]

    public fun `WSD_SECURITY_SIGNATURE_VALIDATION`.Companion.`default`() : `WSD_SECURITY_SIGNATURE_VALIDATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SERVICE_METADATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SERVICE_METADATA`.Companion.`default`() : `WSD_SERVICE_METADATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SERVICE_METADATA_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA_LIST`>?,
    public var `Element`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SERVICE_METADATA`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SERVICE_METADATA_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SERVICE_METADATA_LIST`.Companion.`default`() : `WSD_SERVICE_METADATA_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SOAP_FAULT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SOAP_FAULT`.Companion.`default`() : `WSD_SOAP_FAULT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SOAP_FAULT_CODE` (
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `Subcode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_FAULT_SUBCODE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SOAP_FAULT_CODE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SOAP_FAULT_CODE`.Companion.`default`() : `WSD_SOAP_FAULT_CODE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SOAP_FAULT_REASON` (
    public var `Text`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_LOCALIZED_STRING_LIST`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SOAP_FAULT_REASON`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SOAP_FAULT_REASON`.Companion.`default`() : `WSD_SOAP_FAULT_REASON` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_SOAP_FAULT_SUBCODE` (
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_NAME`>?,
    public var `Subcode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_SOAP_FAULT_SUBCODE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SOAP_FAULT_SUBCODE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SOAP_FAULT_SUBCODE`.Companion.`default`() : `WSD_SOAP_FAULT_SUBCODE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SOAP_HEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SOAP_HEADER`.Companion.`default`() : `WSD_SOAP_HEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SOAP_MESSAGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SOAP_MESSAGE`.Companion.`default`() : `WSD_SOAP_MESSAGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_SYNCHRONOUS_RESPONSE_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_SYNCHRONOUS_RESPONSE_CONTEXT`.Companion.`default`() : `WSD_SYNCHRONOUS_RESPONSE_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_THIS_DEVICE_METADATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_THIS_DEVICE_METADATA`.Companion.`default`() : `WSD_THIS_DEVICE_METADATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_THIS_MODEL_METADATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_THIS_MODEL_METADATA`.Companion.`default`() : `WSD_THIS_MODEL_METADATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_UNKNOWN_LOOKUP` (
    public var `Any`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSDXML_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_UNKNOWN_LOOKUP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_UNKNOWN_LOOKUP`.Companion.`default`() : `WSD_UNKNOWN_LOOKUP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WSD_URI_LIST` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WSD_URI_LIST`>?,
    public var `Element`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WSD_URI_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WSD_URI_LIST`.Companion.`default`() : `WSD_URI_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

