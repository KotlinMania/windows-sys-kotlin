// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDCancelOpenSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDCancelOpenSession`(`hsessionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDCloseHandle`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDCloseSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDCloseSession`(`hsessionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDOpenHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDOpenHandle`(`dwclientversion` : UInt, `pdwnegotiatedversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `phclienthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDOpenLegacySession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDOpenLegacySession`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `plegacymacaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `phsessionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `pguidsessioninterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDStartOpenSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDStartOpenSession`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pdeviceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pfncallback` : `WFD_OPEN_SESSION_COMPLETE_CALLBACK`, `phsessionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WFDUpdateDeviceVisibility; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WFDUpdateDeviceVisibility`(`pdeviceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanAllocateMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanAllocateMemory`(`dwmemorysize` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanCloseHandle`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `WlanConnect`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pconnectionparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLAN_CONNECTION_PARAMETERS`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanConnect2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `WlanConnect2`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pconnectionparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLAN_CONNECTION_PARAMETERS_V2`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanDeleteProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanDeleteProfile`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanDeviceServiceCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanDeviceServiceCommand`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pdeviceserviceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwopcode` : UInt, `dwinbuffersize` : UInt, `pinbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoutbuffersize` : UInt, `poutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanDisconnect`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanEnumInterfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanEnumInterfaces`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppinterfacelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_INTERFACE_INFO_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanExtractPsdIEDataList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanExtractPsdIEDataList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `dwiedatasize` : UInt, `prawiedata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `strformat` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pppsdiedatalist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_RAW_DATA_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanFreeMemory`(`pmemory` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetAvailableNetworkList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetAvailableNetworkList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppavailablenetworklist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_AVAILABLE_NETWORK_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetAvailableNetworkList2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetAvailableNetworkList2`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppavailablenetworklist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_AVAILABLE_NETWORK_LIST_V2`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetFilterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetFilterList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `wlanfilterlisttype` : `WLAN_FILTER_LIST_TYPE`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppnetworklist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DOT11_NETWORK_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetInterfaceCapability; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetInterfaceCapability`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppcapability` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_INTERFACE_CAPABILITY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetNetworkBssList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetNetworkBssList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pdot11ssid` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_SSID`>?, `dot11bsstype` : `DOT11_BSS_TYPE`, `bsecurityenabled` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppwlanbsslist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_BSS_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetProfile`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstrprofilexml` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwgrantedaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetProfileCustomUserData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetProfileCustomUserData`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetProfileList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetProfileList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppprofilelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_PROFILE_INFO_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetSecuritySettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetSecuritySettings`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `securableobject` : `WLAN_SECURABLE_OBJECT`, `pvaluetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_OPCODE_VALUE_TYPE`>?, `pstrcurrentsddl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pdwgrantedaccess` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanGetSupportedDeviceServices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanGetSupportedDeviceServices`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppdevsvcguidlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_DEVICE_SERVICE_GUID_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkForceStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkForceStart`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkForceStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkForceStop`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkInitSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkInitSettings`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkQueryProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkQueryProperty`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `opcode` : `WLAN_HOSTED_NETWORK_OPCODE`, `pdwdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pwlanopcodevaluetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_OPCODE_VALUE_TYPE`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkQuerySecondaryKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkQuerySecondaryKey`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pdwkeylength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppuckeydata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `pbispassphrase` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pbpersistent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkQueryStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkQueryStatus`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `ppwlanhostednetworkstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLAN_HOSTED_NETWORK_STATUS`>>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkRefreshSecuritySettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkRefreshSecuritySettings`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkSetProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkSetProperty`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `opcode` : `WLAN_HOSTED_NETWORK_OPCODE`, `dwdatasize` : UInt, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkSetSecondaryKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkSetSecondaryKey`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `dwkeylength` : UInt, `puckeydata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bispassphrase` : `windows_sys`.`core`.`BOOL`, `bpersistent` : `windows_sys`.`core`.`BOOL`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkStartUsing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkStartUsing`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanHostedNetworkStopUsing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanHostedNetworkStopUsing`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pfailreason` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_HOSTED_NETWORK_REASON`>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanIhvControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanIhvControl`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `type` : `WLAN_IHV_CONTROL_TYPE`, `dwinbuffersize` : UInt, `pinbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoutbuffersize` : UInt, `poutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanOpenHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanOpenHandle`(`dwclientversion` : UInt, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwnegotiatedversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `phclienthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanQueryAutoConfigParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanQueryAutoConfigParameter`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `opcode` : `WLAN_AUTOCONF_OPCODE`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pwlanopcodevaluetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_OPCODE_VALUE_TYPE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanQueryInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanQueryInterface`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `opcode` : `WLAN_INTF_OPCODE`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pwlanopcodevaluetype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLAN_OPCODE_VALUE_TYPE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanReasonCodeToString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanReasonCodeToString`(`dwreasoncode` : UInt, `dwbuffersize` : UInt, `pstringbuffer` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanRegisterDeviceServiceNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanRegisterDeviceServiceNotification`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pdevsvcguidlist` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLAN_DEVICE_SERVICE_GUID_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanRegisterNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanRegisterNotification`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `dwnotifsource` : `WLAN_NOTIFICATION_SOURCES`, `bignoreduplicate` : `windows_sys`.`core`.`BOOL`, `funccallback` : `WLAN_NOTIFICATION_CALLBACK`, `pcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwprevnotifsource` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanRegisterVirtualStationNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanRegisterVirtualStationNotification`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `bregister` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanRenameProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanRenameProfile`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `stroldprofilename` : `windows_sys`.`core`.`PCWSTR`, `strnewprofilename` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSaveTemporaryProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSaveTemporaryProfile`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `stralluserprofilesecurity` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `boverwrite` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanScan; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanScan`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pdot11ssid` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_SSID`>?, `piedata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLAN_RAW_DATA`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetAutoConfigParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetAutoConfigParameter`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `opcode` : `WLAN_AUTOCONF_OPCODE`, `dwdatasize` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetFilterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetFilterList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `wlanfilterlisttype` : `WLAN_FILTER_LIST_TYPE`, `pnetworklist` : /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_NETWORK_LIST`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetInterface`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `opcode` : `WLAN_INTF_OPCODE`, `dwdatasize` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetProfile`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : UInt, `strprofilexml` : `windows_sys`.`core`.`PCWSTR`, `stralluserprofilesecurity` : `windows_sys`.`core`.`PCWSTR`, `boverwrite` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwreasoncode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetProfileCustomUserData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetProfileCustomUserData`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `dwdatasize` : UInt, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetProfileEapUserData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public external fun `WlanSetProfileEapUserData`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `eaptype` : `super`.`super`.`Security`.`ExtensibleAuthenticationProtocol`.`EAP_METHOD_TYPE`, `dwflags` : `WLAN_SET_EAPHOST_FLAGS`, `dweapuserdatasize` : UInt, `pbeapuserdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetProfileEapXmlUserData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetProfileEapXmlUserData`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `WLAN_SET_EAPHOST_FLAGS`, `streapxmluserdata` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetProfileList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetProfileList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwitems` : UInt, `strprofilenames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetProfilePosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetProfilePosition`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `dwposition` : UInt, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetPsdIEDataList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetPsdIEDataList`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `strformat` : `windows_sys`.`core`.`PCWSTR`, `ppsdiedatalist` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLAN_RAW_DATA_LIST`>?, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanapi.dll, ABI=system, export=WlanSetSecuritySettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanSetSecuritySettings`(`hclienthandle` : `super`.`super`.`Foundation`.`HANDLE`, `securableobject` : `WLAN_SECURABLE_OBJECT`, `strmodifiedsddl` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wlanui.dll, ABI=system, export=WlanUIEditProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WlanUIEditProfile`(`dwclientversion` : UInt, `wstrprofilename` : `windows_sys`.`core`.`PCWSTR`, `pinterfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `wlstartpage` : `WL_DISPLAY_PAGES`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwlanreasoncode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
public typealias `CH_DESCRIPTION_TYPE` = Int;
// UNSUPPORTED Rust 66:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_AccessPointBssid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 19 };

// UNSUPPORTED Rust 67:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_ChallengeAep: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 21 };

// UNSUPPORTED Rust 68:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_DevnodeAep: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 23 };

// UNSUPPORTED Rust 69:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_HostName_ResolutionMode: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 25 };

// UNSUPPORTED Rust 70:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_PinSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 29 };

// UNSUPPORTED Rust 71:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_RtspTcpConnectionParametersSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 30 };

// UNSUPPORTED Rust 72:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_SinkHostName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 20 };

// UNSUPPORTED Rust 73:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_SinkIpAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 26 };

// UNSUPPORTED Rust 74:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_StreamSecuritySupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 18 };

// UNSUPPORTED Rust 75:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_InfraCast_Supported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 17 };

// UNSUPPORTED Rust 76:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AERCapabilityPresent: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 17 };

// UNSUPPORTED Rust 77:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AcsCapabilityRegister: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 32 };

// UNSUPPORTED Rust 78:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AcsCompatibleUpHierarchy: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 31 };

// UNSUPPORTED Rust 79:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AcsSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 29 };

// UNSUPPORTED Rust 80:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AriSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 30 };

// UNSUPPORTED Rust 81:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AtomicsSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 35 };

// UNSUPPORTED Rust 82:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_AtsSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 33 };

// UNSUPPORTED Rust 83:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_BarTypes: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 16 };

// UNSUPPORTED Rust 84:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_BaseClass: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 3 };

// UNSUPPORTED Rust 85:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_Correctable_Error_Mask: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 21 };

// UNSUPPORTED Rust 86:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_CurrentLinkSpeed: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 9 };

// UNSUPPORTED Rust 87:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_CurrentLinkWidth: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 10 };

// UNSUPPORTED Rust 88:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_CurrentPayloadSize: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 6 };

// UNSUPPORTED Rust 89:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_CurrentSpeedAndMode: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 2 };

// UNSUPPORTED Rust 90:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_D3ColdSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 38 };

// UNSUPPORTED Rust 91:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_DeviceType: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 1 };

// UNSUPPORTED Rust 92:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_ECRC_Errors: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 22 };

// UNSUPPORTED Rust 93:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_Error_Reporting: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 23 };

// UNSUPPORTED Rust 94:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_ExpressSpecVersion: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 13 };

// UNSUPPORTED Rust 95:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_FirmwareErrorHandling: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 18 };

// UNSUPPORTED Rust 96:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_InterruptMessageMaximum: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 15 };

// UNSUPPORTED Rust 97:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_InterruptSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 14 };

// UNSUPPORTED Rust 98:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_Label_Id: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 27 };

// UNSUPPORTED Rust 99:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_Label_String: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 28 };

// UNSUPPORTED Rust 100:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_MaxLinkSpeed: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 11 };

// UNSUPPORTED Rust 101:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_MaxLinkWidth: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 12 };

// UNSUPPORTED Rust 102:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_MaxPayloadSize: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 7 };

// UNSUPPORTED Rust 103:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_MaxReadRequestSize: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 8 };

// UNSUPPORTED Rust 104:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_OnPostPath: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 37 };

// UNSUPPORTED Rust 105:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_ParentSerialNumber: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 45 };

// UNSUPPORTED Rust 106:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_ProgIf: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 5 };

// UNSUPPORTED Rust 107:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_RequiresReservedMemoryRegion: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 34 };

// UNSUPPORTED Rust 108:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_RootError_Reporting: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 24 };

// UNSUPPORTED Rust 109:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_S0WakeupSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 25 };

// UNSUPPORTED Rust 110:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_SerialNumber: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 40 };

// UNSUPPORTED Rust 111:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_SriovSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 26 };

// UNSUPPORTED Rust 112:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_SubClass: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 4 };

// UNSUPPORTED Rust 113:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_SupportedLinkSubState: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 36 };

// UNSUPPORTED Rust 114:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_Uncorrectable_Error_Mask: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 19 };

// UNSUPPORTED Rust 115:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_Uncorrectable_Error_Severity: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 20 };

// UNSUPPORTED Rust 116:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_UsbComponentRelation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 43 };

// UNSUPPORTED Rust 117:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_UsbDvsecPortSpecificAttributes: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 42 };

// UNSUPPORTED Rust 118:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_UsbDvsecPortType: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 41 };

// UNSUPPORTED Rust 119:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciDevice_UsbHostRouterName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 44 };

// UNSUPPORTED Rust 120:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_ASPMSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 8 };

// UNSUPPORTED Rust 121:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_ClockPowerManagementSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 9 };

// UNSUPPORTED Rust 122:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_CurrentSpeedAndMode: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 2 };

// UNSUPPORTED Rust 123:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_DeviceIDMessagingCapable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 4 };

// UNSUPPORTED Rust 124:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_ExtendedConfigAvailable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 6 };

// UNSUPPORTED Rust 125:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_ExtendedPCIConfigOpRegionSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 7 };

// UNSUPPORTED Rust 126:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_MSISupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 11 };

// UNSUPPORTED Rust 127:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_NativePciExpressControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 17 };

// UNSUPPORTED Rust 128:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_PCIExpressAERControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 15 };

// UNSUPPORTED Rust 129:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_PCIExpressCapabilityControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 16 };

// UNSUPPORTED Rust 130:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_PCIExpressNativeHotPlugControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 12 };

// UNSUPPORTED Rust 131:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_PCIExpressNativePMEControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 14 };

// UNSUPPORTED Rust 132:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_PCISegmentGroupsSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 10 };

// UNSUPPORTED Rust 133:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_SHPCNativeHotPlugControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 13 };

// UNSUPPORTED Rust 134:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_SecondaryBusWidth: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 5 };

// UNSUPPORTED Rust 135:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_SecondaryInterface: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 1 };

// UNSUPPORTED Rust 136:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_SupportedSpeedsAndModes: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 3 };

// UNSUPPORTED Rust 137:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_PciRootBus_SystemMsiSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 18 };

// UNSUPPORTED Rust 138:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirectServices_AdvertisementId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 5 };

// UNSUPPORTED Rust 139:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirectServices_RequestServiceInformation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 7 };

// UNSUPPORTED Rust 140:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirectServices_ServiceAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 2 };

// UNSUPPORTED Rust 141:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirectServices_ServiceConfigMethods: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 6 };

// UNSUPPORTED Rust 142:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirectServices_ServiceInformation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 4 };

// UNSUPPORTED Rust 143:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirectServices_ServiceName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 3 };

// UNSUPPORTED Rust 144:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_DeviceAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 1 };

// UNSUPPORTED Rust 145:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_DeviceAddressCopy: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 13 };

// UNSUPPORTED Rust 146:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_FoundWsbService: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 24 };

// UNSUPPORTED Rust 147:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_GroupId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 4 };

// UNSUPPORTED Rust 148:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_InformationElements: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 12 };

// UNSUPPORTED Rust 149:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_InterfaceAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 2 };

// UNSUPPORTED Rust 150:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_InterfaceGuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 3 };

// UNSUPPORTED Rust 151:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_IsConnected: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 5 };

// UNSUPPORTED Rust 152:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_IsDMGCapable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 22 };

// UNSUPPORTED Rust 153:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_IsLegacyDevice: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 7 };

// UNSUPPORTED Rust 154:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_IsMiracastLCPSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 9 };

// UNSUPPORTED Rust 155:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_IsRecentlyAssociated: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 14 };

// UNSUPPORTED Rust 156:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_IsVisible: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 6 };

// UNSUPPORTED Rust 157:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_LinkQuality: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 28 };

// UNSUPPORTED Rust 158:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_MiracastVersion: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 8 };

// UNSUPPORTED Rust 159:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_Miracast_SessionMgmtControlPort: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 31 };

// UNSUPPORTED Rust 160:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_NoMiracastAutoProject: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 16 };

// UNSUPPORTED Rust 161:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_RtspTcpConnectionParametersSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 32 };

// UNSUPPORTED Rust 162:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_Service_Aeps: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 15 };

// UNSUPPORTED Rust 163:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_Services: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 10 };

// UNSUPPORTED Rust 164:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_SupportedChannelList: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 11 };

// UNSUPPORTED Rust 165:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFiDirect_TransientAssociation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 27 };

// UNSUPPORTED Rust 166:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_WiFi_InterfaceGuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1167eb_cbfc_4341_a568_a7c91a68982c), pid: 2 };

public typealias `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = UInt;
public typealias `DEVPROP_PCIDEVICE_ACSSUPPORT` = UInt;
public typealias `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = UInt;
public typealias `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = UInt;
public typealias `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = UInt;
public typealias `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_LINKSPEED` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION` = UInt;
public typealias `DEVPROP_PCIROOTBUS_BUSWIDTH` = UInt;
public typealias `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = UInt;
public typealias `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = UInt;
public typealias `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = UInt;
public const val `DISCOVERY_FILTER_BITMASK_ANY`: UInt = 15u;
public const val `DISCOVERY_FILTER_BITMASK_DEVICE`: UInt = 1u;
public const val `DISCOVERY_FILTER_BITMASK_GO`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_ADAPTER_RESET` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_CONTROL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public typealias `DOT11EXTIHV_CREATE_DISCOVERY_PROFILES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`BOOL`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_PROFILE_PARAMS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_BSS_LIST`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_DISCOVERY_PROFILE_LIST`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_DEINIT_ADAPTER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_DEINIT_SERVICE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_GET_VERSION_INFO` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_IHV_VERSION_INFO`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_INIT_ADAPTER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_ADAPTER`>?, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Security_ExtensibleAuthenticationProtocol", feature = "Win32_System_RemoteDesktop"))]
public typealias `DOT11EXTIHV_INIT_SERVICE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_APIS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_HANDLERS`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_INIT_VIRTUAL_STATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_VIRTUAL_STATION_APIS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_IS_UI_REQUEST_PENDING` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`GUID`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public typealias `DOT11EXTIHV_ONEX_INDICATE_RESULT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `DOT11_MSONEX_RESULT`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_MSONEX_RESULT_PARAMS`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public typealias `DOT11EXTIHV_PERFORM_CAPABILITY_MATCH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_PROFILE_PARAMS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_CONNECTIVITY_PROFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_SECURITY_PROFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_BSS_LIST`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public typealias `DOT11EXTIHV_PERFORM_POST_ASSOCIATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_PORT_STATE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_ASSOCIATION_COMPLETION_PARAMETERS`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public typealias `DOT11EXTIHV_PERFORM_PRE_ASSOCIATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_PROFILE_PARAMS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_CONNECTIVITY_PROFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_SECURITY_PROFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_BSS_LIST`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_RemoteDesktop")]
public typealias `DOT11EXTIHV_PROCESS_SESSION_CHANGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`RemoteDesktop`.`WTSSESSION_NOTIFICATION`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_PROCESS_UI_RESPONSE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`GUID`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_QUERY_UI_REQUEST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `DOT11EXT_IHV_CONNECTION_PHASE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DOT11EXT_IHV_UI_REQUEST`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_RECEIVE_INDICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `DOT11EXT_IHV_INDICATION_TYPE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_RECEIVE_PACKET` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_SEND_PACKET_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXTIHV_STOP_POST_ASSOCIATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public typealias `DOT11EXTIHV_VALIDATE_PROFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_PROFILE_PARAMS`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_CONNECTIVITY_PROFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_SECURITY_PROFILE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_ALLOCATE_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Security_ExtensibleAuthenticationProtocol"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11EXT_APIS` (
    public var `Dot11ExtAllocateBuffer`: `DOT11EXT_ALLOCATE_BUFFER`,
    public var `Dot11ExtFreeBuffer`: `DOT11EXT_FREE_BUFFER`,
    public var `Dot11ExtSetProfileCustomUserData`: `DOT11EXT_SET_PROFILE_CUSTOM_USER_DATA`,
    public var `Dot11ExtGetProfileCustomUserData`: `DOT11EXT_GET_PROFILE_CUSTOM_USER_DATA`,
    public var `Dot11ExtSetCurrentProfile`: `DOT11EXT_SET_CURRENT_PROFILE`,
    public var `Dot11ExtSendUIRequest`: `DOT11EXT_SEND_UI_REQUEST`,
    public var `Dot11ExtPreAssociateCompletion`: `DOT11EXT_PRE_ASSOCIATE_COMPLETION`,
    public var `Dot11ExtPostAssociateCompletion`: `DOT11EXT_POST_ASSOCIATE_COMPLETION`,
    public var `Dot11ExtSendNotification`: `DOT11EXT_SEND_NOTIFICATION`,
    public var `Dot11ExtSendPacket`: `DOT11EXT_SEND_PACKET`,
    public var `Dot11ExtSetEtherTypeHandling`: `DOT11EXT_SET_ETHERTYPE_HANDLING`,
    public var `Dot11ExtSetAuthAlgorithm`: `DOT11EXT_SET_AUTH_ALGORITHM`,
    public var `Dot11ExtSetUnicastCipherAlgorithm`: `DOT11EXT_SET_UNICAST_CIPHER_ALGORITHM`,
    public var `Dot11ExtSetMulticastCipherAlgorithm`: `DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHM`,
    public var `Dot11ExtSetDefaultKey`: `DOT11EXT_SET_DEFAULT_KEY`,
    public var `Dot11ExtSetKeyMappingKey`: `DOT11EXT_SET_KEY_MAPPING_KEY`,
    public var `Dot11ExtSetDefaultKeyId`: `DOT11EXT_SET_DEFAULT_KEY_ID`,
    public var `Dot11ExtNicSpecificExtension`: `DOT11EXT_NIC_SPECIFIC_EXTENSION`,
    public var `Dot11ExtSetExcludeUnencrypted`: `DOT11EXT_SET_EXCLUDE_UNENCRYPTED`,
    public var `Dot11ExtStartOneX`: `DOT11EXT_ONEX_START`,
    public var `Dot11ExtStopOneX`: `DOT11EXT_ONEX_STOP`,
    public var `Dot11ExtProcessSecurityPacket`: `DOT11EXT_PROCESS_ONEX_PACKET`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_FREE_BUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_GET_PROFILE_CUSTOM_USER_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> UInt>>>;
public typealias `DOT11EXT_IHV_CONNECTION_PHASE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11EXT_IHV_CONNECTIVITY_PROFILE` (
    public var `pszXmlFragmentIhvConnectivity`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11EXT_IHV_CONNECTIVITY_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11EXT_IHV_DISCOVERY_PROFILE` (
    public var `IhvConnectivityProfile`: `DOT11EXT_IHV_CONNECTIVITY_PROFILE`,
    public var `IhvSecurityProfile`: `DOT11EXT_IHV_SECURITY_PROFILE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11EXT_IHV_DISCOVERY_PROFILE_LIST` (
    public var `dwCount`: UInt,
    public var `pIhvDiscoveryProfiles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_DISCOVERY_PROFILE`>?,
)
// UNSUPPORTED Rust 267:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11EXT_IHV_DISCOVERY_PROFILE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Security_ExtensibleAuthenticationProtocol", feature = "Win32_System_RemoteDesktop"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11EXT_IHV_HANDLERS` (
    public var `Dot11ExtIhvDeinitService`: `DOT11EXTIHV_DEINIT_SERVICE`,
    public var `Dot11ExtIhvInitAdapter`: `DOT11EXTIHV_INIT_ADAPTER`,
    public var `Dot11ExtIhvDeinitAdapter`: `DOT11EXTIHV_DEINIT_ADAPTER`,
    public var `Dot11ExtIhvPerformPreAssociate`: `DOT11EXTIHV_PERFORM_PRE_ASSOCIATE`,
    public var `Dot11ExtIhvAdapterReset`: `DOT11EXTIHV_ADAPTER_RESET`,
    public var `Dot11ExtIhvPerformPostAssociate`: `DOT11EXTIHV_PERFORM_POST_ASSOCIATE`,
    public var `Dot11ExtIhvStopPostAssociate`: `DOT11EXTIHV_STOP_POST_ASSOCIATE`,
    public var `Dot11ExtIhvValidateProfile`: `DOT11EXTIHV_VALIDATE_PROFILE`,
    public var `Dot11ExtIhvPerformCapabilityMatch`: `DOT11EXTIHV_PERFORM_CAPABILITY_MATCH`,
    public var `Dot11ExtIhvCreateDiscoveryProfiles`: `DOT11EXTIHV_CREATE_DISCOVERY_PROFILES`,
    public var `Dot11ExtIhvProcessSessionChange`: `DOT11EXTIHV_PROCESS_SESSION_CHANGE`,
    public var `Dot11ExtIhvReceiveIndication`: `DOT11EXTIHV_RECEIVE_INDICATION`,
    public var `Dot11ExtIhvReceivePacket`: `DOT11EXTIHV_RECEIVE_PACKET`,
    public var `Dot11ExtIhvSendPacketCompletion`: `DOT11EXTIHV_SEND_PACKET_COMPLETION`,
    public var `Dot11ExtIhvIsUIRequestPending`: `DOT11EXTIHV_IS_UI_REQUEST_PENDING`,
    public var `Dot11ExtIhvProcessUIResponse`: `DOT11EXTIHV_PROCESS_UI_RESPONSE`,
    public var `Dot11ExtIhvQueryUIRequest`: `DOT11EXTIHV_QUERY_UI_REQUEST`,
    public var `Dot11ExtIhvOnexIndicateResult`: `DOT11EXTIHV_ONEX_INDICATE_RESULT`,
    public var `Dot11ExtIhvControl`: `DOT11EXTIHV_CONTROL`,
)
public typealias `DOT11EXT_IHV_INDICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11EXT_IHV_PARAMS` (
    public var `dot11ExtIhvProfileParams`: `DOT11EXT_IHV_PROFILE_PARAMS`,
    public var `wstrProfileName`: UShortArray,
    public var `dwProfileTypeFlags`: UInt,
    public var `interfaceGuid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11EXT_IHV_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11EXT_IHV_PROFILE_PARAMS` (
    public var `pSsidList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_SSID_LIST`>?,
    public var `BssType`: `DOT11_BSS_TYPE`,
    public var `pMSSecuritySettings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_MSSECURITY_SETTINGS`>?,
)
// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11EXT_IHV_PROFILE_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11EXT_IHV_SECURITY_PROFILE` (
    public var `pszXmlFragmentIhvSecurity`: `windows_sys`.`core`.`PWSTR`,
    public var `bUseMSOnex`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 332:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11EXT_IHV_SECURITY_PROFILE {
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
public class `DOT11EXT_IHV_SSID_LIST` (
    public var `ulCount`: UInt,
    public var `SSIDs`: Array<`DOT11_SSID`>,
)
// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11EXT_IHV_SSID_LIST {
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
public class `DOT11EXT_IHV_UI_REQUEST` (
    public var `dwSessionId`: UInt,
    public var `guidUIRequest`: `windows_sys`.`core`.`GUID`,
    public var `UIPageClsid`: `windows_sys`.`core`.`GUID`,
    public var `dwByteCount`: UInt,
    public var `pvUIRequest`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11EXT_IHV_UI_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_NIC_SPECIFIC_EXTENSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
public typealias `DOT11EXT_ONEX_START` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ExtensibleAuthenticationProtocol`.`EAP_ATTRIBUTES`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_ONEX_STOP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_POST_ASSOCIATE_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_PRE_ASSOCIATE_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_PROCESS_ONEX_PACKET` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public const val `DOT11EXT_PSK_MAX_LENGTH`: UInt = 64u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_RELEASE_VIRTUAL_STATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_REQUEST_VIRTUAL_STATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SEND_NOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`L2_NOTIFICATION_DATA`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SEND_PACKET` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SEND_UI_REQUEST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_UI_REQUEST`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_AUTH_ALGORITHM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_CURRENT_PROFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_CONNECTIVITY_PROFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_IHV_SECURITY_PROFILE`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public typealias `DOT11EXT_SET_DEFAULT_KEY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_CIPHER_DEFAULT_KEY_VALUE`>?, `DOT11_DIRECTION`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_DEFAULT_KEY_ID` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_ETHERTYPE_HANDLING` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_PRIVACY_EXEMPTION`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_EXCLUDE_UNENCRYPTED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`BOOL`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_KEY_MAPPING_KEY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11_CIPHER_KEY_MAPPING_KEY_VALUE`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_PROFILE_CUSTOM_USER_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_UNICAST_CIPHER_ALGORITHM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DOT11EXT_VIRTUAL_STATION_AP_PROPERTY`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11EXT_VIRTUAL_STATION_APIS` (
    public var `Dot11ExtRequestVirtualStation`: `DOT11EXT_REQUEST_VIRTUAL_STATION`,
    public var `Dot11ExtReleaseVirtualStation`: `DOT11EXT_RELEASE_VIRTUAL_STATION`,
    public var `Dot11ExtQueryVirtualStationProperties`: `DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIES`,
    public var `Dot11ExtSetVirtualStationAPProperties`: `DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIES`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11EXT_VIRTUAL_STATION_AP_PROPERTY` (
    public var `dot11SSID`: `DOT11_SSID`,
    public var `dot11AuthAlgo`: `DOT11_AUTH_ALGORITHM`,
    public var `dot11CipherAlgo`: `DOT11_CIPHER_ALGORITHM`,
    public var `bIsPassPhrase`: `windows_sys`.`core`.`BOOL`,
    public var `dwKeyLength`: UInt,
    public var `ucKeyData`: UByteArray,
)
// UNSUPPORTED Rust 406:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11EXT_VIRTUAL_STATION_AP_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_ACCESSNETWORKOPTIONS` (
    public var `AccessNetworkType`: UByte,
    public var `Internet`: UByte,
    public var `ASRA`: UByte,
    public var `ESR`: UByte,
    public var `UESA`: UByte,
)
public typealias `DOT11_AC_PARAM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ADAPTER` (
    public var `gAdapterId`: `windows_sys`.`core`.`GUID`,
    public var `pszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `Dot11CurrentOpMode`: `DOT11_CURRENT_OPERATION_MODE`,
)
// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_ADAPTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_ADDITIONAL_IE` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uBeaconIEsOffset`: UInt,
    public var `uBeaconIEsLength`: UInt,
    public var `uResponseIEsOffset`: UInt,
    public var `uResponseIEsLength`: UInt,
)
public const val `DOT11_ADDITIONAL_IE_REVISION_1`: UInt = 1u;
public typealias `DOT11_ADHOC_AUTH_ALGORITHM` = Int;
public const val `DOT11_ADHOC_AUTH_ALGO_80211_OPEN`: `DOT11_ADHOC_AUTH_ALGORITHM` = 1;
public const val `DOT11_ADHOC_AUTH_ALGO_INVALID`: `DOT11_ADHOC_AUTH_ALGORITHM` = -1;
public const val `DOT11_ADHOC_AUTH_ALGO_RSNA_PSK`: `DOT11_ADHOC_AUTH_ALGORITHM` = 7;
public typealias `DOT11_ADHOC_CIPHER_ALGORITHM` = Int;
public const val `DOT11_ADHOC_CIPHER_ALGO_CCMP`: `DOT11_ADHOC_CIPHER_ALGORITHM` = 4;
public const val `DOT11_ADHOC_CIPHER_ALGO_INVALID`: `DOT11_ADHOC_CIPHER_ALGORITHM` = -1;
public const val `DOT11_ADHOC_CIPHER_ALGO_NONE`: `DOT11_ADHOC_CIPHER_ALGORITHM` = 0;
public const val `DOT11_ADHOC_CIPHER_ALGO_WEP`: `DOT11_ADHOC_CIPHER_ALGORITHM` = 257;
public const val `DOT11_ADHOC_CONNECT_FAIL_DOMAIN_MISMATCH`: `DOT11_ADHOC_CONNECT_FAIL_REASON` = 0;
public const val `DOT11_ADHOC_CONNECT_FAIL_OTHER`: `DOT11_ADHOC_CONNECT_FAIL_REASON` = 2;
public const val `DOT11_ADHOC_CONNECT_FAIL_PASSPHRASE_MISMATCH`: `DOT11_ADHOC_CONNECT_FAIL_REASON` = 1;
public typealias `DOT11_ADHOC_CONNECT_FAIL_REASON` = Int;
public typealias `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = Int;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_CONNECTED`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 13;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_CONNECTING`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 12;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_DISCONNECTED`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 11;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_FORMED`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 14;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_INVALID`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ANQP_QUERY_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `Status`: `DOT11_ANQP_QUERY_RESULT`,
    public var `hContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uResponseLength`: UInt,
)
// UNSUPPORTED Rust 472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ANQP_QUERY_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ANQP_QUERY_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_ANQP_QUERY_RESULT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_AP_JOIN_REQUEST` (
    public var `uJoinFailureTimeout`: UInt,
    public var `OperationalRateSet`: `DOT11_RATE_SET`,
    public var `uChCenterFrequency`: UInt,
    public var `dot11BSSDescription`: `DOT11_BSS_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ASSOCIATION_COMPLETION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `MacAddr`: UByteArray,
    public var `uStatus`: UInt,
    public var `bReAssocReq`: Boolean,
    public var `bReAssocResp`: Boolean,
    public var `uAssocReqOffset`: UInt,
    public var `uAssocReqSize`: UInt,
    public var `uAssocRespOffset`: UInt,
    public var `uAssocRespSize`: UInt,
    public var `uBeaconOffset`: UInt,
    public var `uBeaconSize`: UInt,
    public var `uIHVDataOffset`: UInt,
    public var `uIHVDataSize`: UInt,
    public var `AuthAlgo`: `DOT11_AUTH_ALGORITHM`,
    public var `UnicastCipher`: `DOT11_CIPHER_ALGORITHM`,
    public var `MulticastCipher`: `DOT11_CIPHER_ALGORITHM`,
    public var `uActivePhyListOffset`: UInt,
    public var `uActivePhyListSize`: UInt,
    public var `bFourAddressSupported`: Boolean,
    public var `bPortAuthorized`: Boolean,
    public var `ucActiveQoSProtocol`: UByte,
    public var `DSInfo`: `DOT11_DS_INFO`,
    public var `uEncapTableOffset`: UInt,
    public var `uEncapTableSize`: UInt,
    public var `MulticastMgmtCipher`: `DOT11_CIPHER_ALGORITHM`,
    public var `uAssocComebackTime`: UInt,
)
// UNSUPPORTED Rust 519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_COMPLETION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_ASSOCIATION_COMPLETION_PARAMETERS_REVISION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ASSOCIATION_INFO_EX` (
    public var `PeerMacAddress`: UByteArray,
    public var `BSSID`: UByteArray,
    public var `usCapabilityInformation`: UShort,
    public var `usListenInterval`: UShort,
    public var `ucPeerSupportedRates`: UByteArray,
    public var `usAssociationID`: UShort,
    public var `dot11AssociationState`: `DOT11_ASSOCIATION_STATE`,
    public var `dot11PowerMode`: `DOT11_POWER_MODE`,
    public var `liAssociationUpTime`: Long,
    public var `ullNumOfTxPacketSuccesses`: ULong,
    public var `ullNumOfTxPacketFailures`: ULong,
    public var `ullNumOfRxPacketSuccesses`: ULong,
    public var `ullNumOfRxPacketFailures`: ULong,
)
// UNSUPPORTED Rust 544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_ASSOCIATION_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ASSOCIATION_INFO_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11AssocInfo`: Array<`DOT11_ASSOCIATION_INFO_EX`>,
)
// UNSUPPORTED Rust 558:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_INFO_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ASSOCIATION_PARAMS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `BSSID`: UByteArray,
    public var `uAssocRequestIEsOffset`: UInt,
    public var `uAssocRequestIEsLength`: UInt,
)
// UNSUPPORTED Rust 574:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_PARAMS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ASSOCIATION_START_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `MacAddr`: UByteArray,
    public var `SSID`: `DOT11_SSID`,
    public var `uIHVDataOffset`: UInt,
    public var `uIHVDataSize`: UInt,
)
// UNSUPPORTED Rust 591:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_START_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_START_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_ASSOCIATION_STATE` = Int;
public const val `DOT11_ASSOC_ERROR_SOURCE_OS`: UInt = 0u;
public const val `DOT11_ASSOC_ERROR_SOURCE_OTHER`: UInt = 255u;
public const val `DOT11_ASSOC_ERROR_SOURCE_REMOTE`: UInt = 1u;
public const val `DOT11_ASSOC_STATUS_SUCCESS`: UInt = 0u;
public typealias `DOT11_AUTH_ALGORITHM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_AUTH_ALGORITHM_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `AlgorithmIds`: Array<`DOT11_AUTH_ALGORITHM`>,
)
// UNSUPPORTED Rust 613:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AUTH_ALGORITHM_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AUTH_ALGORITHM_LIST_REVISION_1`: UInt = 1u;
public const val `DOT11_AUTH_ALGO_80211_OPEN`: `DOT11_AUTH_ALGORITHM` = 1;
public const val `DOT11_AUTH_ALGO_80211_SHARED_KEY`: `DOT11_AUTH_ALGORITHM` = 2;
public const val `DOT11_AUTH_ALGO_IHV_END`: `DOT11_AUTH_ALGORITHM` = -1;
public const val `DOT11_AUTH_ALGO_IHV_START`: `DOT11_AUTH_ALGORITHM` = -2147483648;
public const val `DOT11_AUTH_ALGO_MICHAEL`: UInt = 1u;
public const val `DOT11_AUTH_ALGO_OWE`: `DOT11_AUTH_ALGORITHM` = 10;
public const val `DOT11_AUTH_ALGO_RSNA`: `DOT11_AUTH_ALGORITHM` = 6;
public const val `DOT11_AUTH_ALGO_RSNA_PSK`: `DOT11_AUTH_ALGORITHM` = 7;
public const val `DOT11_AUTH_ALGO_WPA`: `DOT11_AUTH_ALGORITHM` = 3;
public const val `DOT11_AUTH_ALGO_WPA3`: `DOT11_AUTH_ALGORITHM` = 8;
public const val `DOT11_AUTH_ALGO_WPA3_ENT`: `DOT11_AUTH_ALGORITHM` = 11;
public const val `DOT11_AUTH_ALGO_WPA3_ENT_192`: `DOT11_AUTH_ALGORITHM` = 8;
public const val `DOT11_AUTH_ALGO_WPA3_SAE`: `DOT11_AUTH_ALGORITHM` = 9;
public const val `DOT11_AUTH_ALGO_WPA_NONE`: `DOT11_AUTH_ALGORITHM` = 5;
public const val `DOT11_AUTH_ALGO_WPA_PSK`: `DOT11_AUTH_ALGORITHM` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_AUTH_CIPHER_PAIR` (
    public var `AuthAlgoId`: `DOT11_AUTH_ALGORITHM`,
    public var `CipherAlgoId`: `DOT11_CIPHER_ALGORITHM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_AUTH_CIPHER_PAIR_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `AuthCipherPairs`: Array<`DOT11_AUTH_CIPHER_PAIR`>,
)
// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AUTH_CIPHER_PAIR_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AUTH_CIPHER_PAIR_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_AVAILABLE_CHANNEL_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `uChannelNumber`: UIntArray,
)
// UNSUPPORTED Rust 666:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AVAILABLE_CHANNEL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AVAILABLE_CHANNEL_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_AVAILABLE_FREQUENCY_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `uFrequencyValue`: UIntArray,
)
// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AVAILABLE_FREQUENCY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AVAILABLE_FREQUENCY_LIST_REVISION_1`: UInt = 1u;
public typealias `DOT11_BAND` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_BSSID_CANDIDATE` (
    public var `BSSID`: UByteArray,
    public var `uFlags`: UInt,
)
// UNSUPPORTED Rust 696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_BSSID_CANDIDATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_BSSID_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `BSSIDs`: UByteArray,
)
// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_BSSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_BSSID_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_BSS_DESCRIPTION` (
    public var `uReserved`: UInt,
    public var `dot11BSSID`: UByteArray,
    public var `dot11BSSType`: `DOT11_BSS_TYPE`,
    public var `usBeaconPeriod`: UShort,
    public var `ullTimestamp`: ULong,
    public var `usCapabilityInformation`: UShort,
    public var `uBufferLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 729:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_BSS_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_BSS_ENTRY` (
    public var `uPhyId`: UInt,
    public var `PhySpecificInfo`: `DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO`,
    public var `dot11BSSID`: UByteArray,
    public var `dot11BSSType`: `DOT11_BSS_TYPE`,
    public var `lRSSI`: Int,
    public var `uLinkQuality`: UInt,
    public var `bInRegDomain`: Boolean,
    public var `usBeaconPeriod`: UShort,
    public var `ullTimestamp`: ULong,
    public var `ullHostTimestamp`: ULong,
    public var `usCapabilityInformation`: UShort,
    public var `uBufferLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 751:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_BSS_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_BSS_ENTRY_BYTE_ARRAY_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 757:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO {
//     pub uChCenterFrequency: u32,
//     pub FHSS: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0,
// }

// UNSUPPORTED Rust 763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0` (
    public var `uHopPattern`: UInt,
    public var `uHopSet`: UInt,
    public var `uDwellTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_BSS_LIST` (
    public var `uNumOfBytes`: UInt,
    public var `pucBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 781:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_BSS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_BSS_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_BYTE_ARRAY` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfBytes`: UInt,
    public var `uTotalNumOfBytes`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_BYTE_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_CAN_SUSTAIN_AP_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ulReason`: UInt,
)
public const val `DOT11_CAN_SUSTAIN_AP_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_CAN_SUSTAIN_AP_REASON_IHV_END`: UInt = 4294967295u;
public const val `DOT11_CAN_SUSTAIN_AP_REASON_IHV_START`: UInt = 4278190080u;
public const val `DOT11_CAPABILITY_CHANNEL_AGILITY`: UInt = 128u;
public const val `DOT11_CAPABILITY_DSSSOFDM`: UInt = 8192u;
public const val `DOT11_CAPABILITY_INFO_CF_POLLABLE`: UInt = 4u;
public const val `DOT11_CAPABILITY_INFO_CF_POLL_REQ`: UInt = 8u;
public const val `DOT11_CAPABILITY_INFO_ESS`: UInt = 1u;
public const val `DOT11_CAPABILITY_INFO_IBSS`: UInt = 2u;
public const val `DOT11_CAPABILITY_INFO_PRIVACY`: UInt = 16u;
public const val `DOT11_CAPABILITY_PBCC`: UInt = 64u;
public const val `DOT11_CAPABILITY_SHORT_PREAMBLE`: UInt = 32u;
public const val `DOT11_CAPABILITY_SHORT_SLOT_TIME`: UInt = 1024u;
public const val `DOT11_CCA_MODE_CS_ONLY`: UInt = 2u;
public const val `DOT11_CCA_MODE_CS_WITH_TIMER`: UInt = 8u;
public const val `DOT11_CCA_MODE_ED_ONLY`: UInt = 1u;
public const val `DOT11_CCA_MODE_ED_and_CS`: UInt = 4u;
public const val `DOT11_CCA_MODE_HRCS_AND_ED`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_CHANNEL_HINT` (
    public var `Dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `uChannelNumber`: UInt,
)
public typealias `DOT11_CIPHER_ALGORITHM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_CIPHER_ALGORITHM_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `AlgorithmIds`: Array<`DOT11_CIPHER_ALGORITHM`>,
)
// UNSUPPORTED Rust 843:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_CIPHER_ALGORITHM_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CIPHER_ALGORITHM_LIST_REVISION_1`: UInt = 1u;
public const val `DOT11_CIPHER_ALGO_BIP`: `DOT11_CIPHER_ALGORITHM` = 6;
public const val `DOT11_CIPHER_ALGO_BIP_CMAC_256`: `DOT11_CIPHER_ALGORITHM` = 13;
public const val `DOT11_CIPHER_ALGO_BIP_GMAC_128`: `DOT11_CIPHER_ALGORITHM` = 11;
public const val `DOT11_CIPHER_ALGO_BIP_GMAC_256`: `DOT11_CIPHER_ALGORITHM` = 12;
public const val `DOT11_CIPHER_ALGO_CCMP`: `DOT11_CIPHER_ALGORITHM` = 4;
public const val `DOT11_CIPHER_ALGO_CCMP_256`: `DOT11_CIPHER_ALGORITHM` = 10;
public const val `DOT11_CIPHER_ALGO_GCMP`: `DOT11_CIPHER_ALGORITHM` = 8;
public const val `DOT11_CIPHER_ALGO_GCMP_256`: `DOT11_CIPHER_ALGORITHM` = 9;
public const val `DOT11_CIPHER_ALGO_IHV_END`: `DOT11_CIPHER_ALGORITHM` = -1;
public const val `DOT11_CIPHER_ALGO_IHV_START`: `DOT11_CIPHER_ALGORITHM` = -2147483648;
public const val `DOT11_CIPHER_ALGO_NONE`: `DOT11_CIPHER_ALGORITHM` = 0;
public const val `DOT11_CIPHER_ALGO_RSN_USE_GROUP`: `DOT11_CIPHER_ALGORITHM` = 256;
public const val `DOT11_CIPHER_ALGO_TKIP`: `DOT11_CIPHER_ALGORITHM` = 2;
public const val `DOT11_CIPHER_ALGO_WEP`: `DOT11_CIPHER_ALGORITHM` = 257;
public const val `DOT11_CIPHER_ALGO_WEP104`: `DOT11_CIPHER_ALGORITHM` = 5;
public const val `DOT11_CIPHER_ALGO_WEP40`: `DOT11_CIPHER_ALGORITHM` = 1;
public const val `DOT11_CIPHER_ALGO_WPA_USE_GROUP`: `DOT11_CIPHER_ALGORITHM` = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_CIPHER_DEFAULT_KEY_VALUE` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uKeyIndex`: UInt,
    public var `AlgorithmId`: `DOT11_CIPHER_ALGORITHM`,
    public var `MacAddr`: UByteArray,
    public var `bDelete`: Boolean,
    public var `bStatic`: Boolean,
    public var `usKeyLength`: UShort,
    public var `ucKey`: UByteArray,
)
// UNSUPPORTED Rust 880:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_CIPHER_DEFAULT_KEY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CIPHER_DEFAULT_KEY_VALUE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_CIPHER_KEY_MAPPING_KEY_VALUE` (
    public var `PeerMacAddr`: UByteArray,
    public var `AlgorithmId`: `DOT11_CIPHER_ALGORITHM`,
    public var `Direction`: `DOT11_DIRECTION`,
    public var `bDelete`: Boolean,
    public var `bStatic`: Boolean,
    public var `usKeyLength`: UShort,
    public var `ucKey`: UByteArray,
)
// UNSUPPORTED Rust 898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_CIPHER_KEY_MAPPING_KEY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CIPHER_KEY_MAPPING_KEY_VALUE_BYTE_ARRAY_REVISION_1`: UInt = 1u;
public const val `DOT11_CONF_ALGO_TKIP`: UInt = 2u;
public const val `DOT11_CONF_ALGO_WEP_RC4`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_CONNECTION_COMPLETION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uStatus`: UInt,
)
public const val `DOT11_CONNECTION_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_CONNECTION_START_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `BSSType`: `DOT11_BSS_TYPE`,
    public var `AdhocBSSID`: UByteArray,
    public var `AdhocSSID`: `DOT11_SSID`,
)
// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_CONNECTION_START_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CONNECTION_START_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_CONNECTION_STATUS_SUCCESS`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_COUNTERS_ENTRY` (
    public var `uTransmittedFragmentCount`: UInt,
    public var `uMulticastTransmittedFrameCount`: UInt,
    public var `uFailedCount`: UInt,
    public var `uRetryCount`: UInt,
    public var `uMultipleRetryCount`: UInt,
    public var `uFrameDuplicateCount`: UInt,
    public var `uRTSSuccessCount`: UInt,
    public var `uRTSFailureCount`: UInt,
    public var `uACKFailureCount`: UInt,
    public var `uReceivedFragmentCount`: UInt,
    public var `uMulticastReceivedFrameCount`: UInt,
    public var `uFCSErrorCount`: UInt,
    public var `uTransmittedFrameCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_COUNTRY_OR_REGION_STRING_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `CountryOrRegionStrings`: UByteArray,
)
// UNSUPPORTED Rust 957:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_COUNTRY_OR_REGION_STRING_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_COUNTRY_OR_REGION_STRING_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_CURRENT_OFFLOAD_CAPABILITY` (
    public var `uReserved`: UInt,
    public var `uFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_CURRENT_OPERATION_MODE` (
    public var `uReserved`: UInt,
    public var `uCurrentOpMode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_CURRENT_OPTIONAL_CAPABILITY` (
    public var `uReserved`: UInt,
    public var `bDot11CFPollable`: Boolean,
    public var `bDot11PCF`: Boolean,
    public var `bDot11PCFMPDUTransferToPC`: Boolean,
    public var `bStrictlyOrderedServiceClass`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_DATA_RATE_MAPPING_ENTRY` (
    public var `ucDataRateIndex`: UByte,
    public var `ucDataRateFlag`: UByte,
    public var `usDataRateValue`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 126 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_DATA_RATE_MAPPING_TABLE` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uDataRateMappingLength`: UInt,
    public var `DataRateMappingEntries`: Array<`DOT11_DATA_RATE_MAPPING_ENTRY`>,
)
// UNSUPPORTED Rust 1000:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_DATA_RATE_MAPPING_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DATA_RATE_MAPPING_TABLE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_DEFAULT_WEP_OFFLOAD` (
    public var `uReserved`: UInt,
    public var `hOffloadContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hOffload`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwIndex`: UInt,
    public var `dot11OffloadType`: `DOT11_OFFLOAD_TYPE`,
    public var `dwAlgorithm`: UInt,
    public var `uFlags`: UInt,
    public var `dot11KeyDirection`: `DOT11_KEY_DIRECTION`,
    public var `ucMacAddress`: UByteArray,
    public var `uNumOfRWsOnMe`: UInt,
    public var `dot11IV48Counters`: Array<`DOT11_IV48_COUNTER`>,
    public var `usDot11RWBitMaps`: UShortArray,
    public var `usKeyLength`: UShort,
    public var `ucKey`: UByteArray,
)
// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_DEFAULT_WEP_OFFLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_DEFAULT_WEP_UPLOAD` (
    public var `uReserved`: UInt,
    public var `dot11OffloadType`: `DOT11_OFFLOAD_TYPE`,
    public var `hOffload`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uNumOfRWsUsed`: UInt,
    public var `dot11IV48Counters`: Array<`DOT11_IV48_COUNTER`>,
    public var `usDot11RWBitMaps`: UShortArray,
)
// UNSUPPORTED Rust 1040:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_DEFAULT_WEP_UPLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DEVICE_ENTRY_BYTE_ARRAY_REVISION_1`: UInt = 1u;
public typealias `DOT11_DIRECTION` = Int;
public const val `DOT11_DIR_BOTH`: `DOT11_DIRECTION` = 3;
public const val `DOT11_DIR_INBOUND`: `DOT11_DIRECTION` = 1;
public const val `DOT11_DIR_OUTBOUND`: `DOT11_DIRECTION` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_DISASSOCIATE_PEER_REQUEST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMacAddr`: UByteArray,
    public var `usReason`: UShort,
)
// UNSUPPORTED Rust 1058:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_DISASSOCIATE_PEER_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DISASSOCIATE_PEER_REQUEST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_DISASSOCIATION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `MacAddr`: UByteArray,
    public var `uReason`: UInt,
    public var `uIHVDataOffset`: UInt,
    public var `uIHVDataSize`: UInt,
)
// UNSUPPORTED Rust 1075:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_DISASSOCIATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DISASSOCIATION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_DIVERSITY_SELECTION_RX` (
    public var `uAntennaListIndex`: UInt,
    public var `bDiversitySelectionRX`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_DIVERSITY_SELECTION_RX_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11DiversitySelectionRx`: Array<`DOT11_DIVERSITY_SELECTION_RX`>,
)
// UNSUPPORTED Rust 1095:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_DIVERSITY_SELECTION_RX_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_DIVERSITY_SUPPORT` = Int;
public const val `DOT11_DS_CHANGED`: `DOT11_DS_INFO` = 0;
public typealias `DOT11_DS_INFO` = Int;
public const val `DOT11_DS_UNCHANGED`: `DOT11_DS_INFO` = 1;
public const val `DOT11_DS_UNKNOWN`: `DOT11_DS_INFO` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_EAP_RESULT` (
    public var `dwFailureReasonCode`: UInt,
    public var `pAttribArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`ExtensibleAuthenticationProtocol`.`EAP_ATTRIBUTES`>?,
)
// UNSUPPORTED Rust 1112:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11_EAP_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ENCAP_802_1H`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_ENCAP_ENTRY` (
    public var `usEtherType`: UShort,
    public var `usEncapType`: UShort,
)
public const val `DOT11_ENCAP_RFC_1042`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_ERP_PHY_ATTRIBUTES` (
    public var `HRDSSSAttributes`: `DOT11_HRDSSS_PHY_ATTRIBUTES`,
    public var `bERPPBCCOptionImplemented`: Boolean,
    public var `bDSSSOFDMOptionImplemented`: Boolean,
    public var `bShortSlotTimeOptionImplemented`: Boolean,
)
public const val `DOT11_EXEMPT_ALWAYS`: UInt = 1u;
public const val `DOT11_EXEMPT_BOTH`: UInt = 3u;
public const val `DOT11_EXEMPT_MULTICAST`: UInt = 2u;
public const val `DOT11_EXEMPT_NO_EXEMPTION`: UInt = 0u;
public const val `DOT11_EXEMPT_ON_KEY_MAPPING_KEY_UNAVAILABLE`: UInt = 2u;
public const val `DOT11_EXEMPT_UNICAST`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_EXTAP_ATTRIBUTES` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uScanSSIDListSize`: UInt,
    public var `uDesiredSSIDListSize`: UInt,
    public var `uPrivacyExemptionListSize`: UInt,
    public var `uAssociationTableSize`: UInt,
    public var `uDefaultKeyTableSize`: UInt,
    public var `uWEPKeyValueMaxLength`: UInt,
    public var `bStrictlyOrderedServiceClassImplemented`: Boolean,
    public var `uNumSupportedCountryOrRegionStrings`: UInt,
    public var `pSupportedCountryOrRegionStrings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `uInfraNumSupportedUcastAlgoPairs`: UInt,
    public var `pInfraSupportedUcastAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
    public var `uInfraNumSupportedMcastAlgoPairs`: UInt,
    public var `pInfraSupportedMcastAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
)
// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTAP_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTAP_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `DOT11_EXTAP_RECV_CONTEXT_REVISION_1`: UInt = 1u;
public const val `DOT11_EXTAP_SEND_CONTEXT_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_EXTSTA_ATTRIBUTES` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uScanSSIDListSize`: UInt,
    public var `uDesiredBSSIDListSize`: UInt,
    public var `uDesiredSSIDListSize`: UInt,
    public var `uExcludedMacAddressListSize`: UInt,
    public var `uPrivacyExemptionListSize`: UInt,
    public var `uKeyMappingTableSize`: UInt,
    public var `uDefaultKeyTableSize`: UInt,
    public var `uWEPKeyValueMaxLength`: UInt,
    public var `uPMKIDCacheSize`: UInt,
    public var `uMaxNumPerSTADefaultKeyTables`: UInt,
    public var `bStrictlyOrderedServiceClassImplemented`: Boolean,
    public var `ucSupportedQoSProtocolFlags`: UByte,
    public var `bSafeModeImplemented`: Boolean,
    public var `uNumSupportedCountryOrRegionStrings`: UInt,
    public var `pSupportedCountryOrRegionStrings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `uInfraNumSupportedUcastAlgoPairs`: UInt,
    public var `pInfraSupportedUcastAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
    public var `uInfraNumSupportedMcastAlgoPairs`: UInt,
    public var `pInfraSupportedMcastAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
    public var `uAdhocNumSupportedUcastAlgoPairs`: UInt,
    public var `pAdhocSupportedUcastAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
    public var `uAdhocNumSupportedMcastAlgoPairs`: UInt,
    public var `pAdhocSupportedMcastAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
    public var `bAutoPowerSaveMode`: Boolean,
    public var `uMaxNetworkOffloadListSize`: UInt,
    public var `bMFPCapable`: Boolean,
    public var `uInfraNumSupportedMcastMgmtAlgoPairs`: UInt,
    public var `pInfraSupportedMcastMgmtAlgoPairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_AUTH_CIPHER_PAIR`>?,
    public var `bNeighborReportSupported`: Boolean,
    public var `bAPChannelReportSupported`: Boolean,
    public var `bActionFramesSupported`: Boolean,
    public var `bANQPQueryOffloadSupported`: Boolean,
    public var `bHESSIDConnectionSupported`: Boolean,
)
// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTSTA_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_3`: UInt = 3u;
public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_4`: UInt = 4u;
public const val `DOT11_EXTSTA_ATTRIBUTES_SAFEMODE_CERTIFIED`: UInt = 2u;
public const val `DOT11_EXTSTA_ATTRIBUTES_SAFEMODE_OID_SUPPORTED`: UInt = 1u;
public const val `DOT11_EXTSTA_ATTRIBUTES_SAFEMODE_RESERVED`: UInt = 12u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_EXTSTA_CAPABILITY` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uScanSSIDListSize`: UInt,
    public var `uDesiredBSSIDListSize`: UInt,
    public var `uDesiredSSIDListSize`: UInt,
    public var `uExcludedMacAddressListSize`: UInt,
    public var `uPrivacyExemptionListSize`: UInt,
    public var `uKeyMappingTableSize`: UInt,
    public var `uDefaultKeyTableSize`: UInt,
    public var `uWEPKeyValueMaxLength`: UInt,
    public var `uPMKIDCacheSize`: UInt,
    public var `uMaxNumPerSTADefaultKeyTables`: UInt,
)
public const val `DOT11_EXTSTA_CAPABILITY_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_EXTSTA_RECV_CONTEXT` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uReceiveFlags`: UInt,
    public var `uPhyId`: UInt,
    public var `uChCenterFrequency`: UInt,
    public var `usNumberOfMPDUsReceived`: UShort,
    public var `lRSSI`: Int,
    public var `ucDataRate`: UByte,
    public var `uSizeMediaSpecificInfo`: UInt,
    public var `pvMediaSpecificInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ullTimestamp`: ULong,
)
// UNSUPPORTED Rust 1252:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTSTA_RECV_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTSTA_RECV_CONTEXT_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_EXTSTA_SEND_CONTEXT` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `usExemptionActionType`: UShort,
    public var `uPhyId`: UInt,
    public var `uDelayedSleepValue`: UInt,
    public var `pvMediaSpecificInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uSendFlags`: UInt,
)
// UNSUPPORTED Rust 1270:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTSTA_SEND_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTSTA_SEND_CONTEXT_REVISION_1`: UInt = 1u;
public const val `DOT11_FLAGS_80211B_CHANNEL_AGILITY`: UInt = 4u;
public const val `DOT11_FLAGS_80211B_PBCC`: UInt = 2u;
public const val `DOT11_FLAGS_80211B_SHORT_PREAMBLE`: UInt = 1u;
public const val `DOT11_FLAGS_80211G_BARKER_PREAMBLE_MODE`: UInt = 128u;
public const val `DOT11_FLAGS_80211G_DSSS_OFDM`: UInt = 16u;
public const val `DOT11_FLAGS_80211G_NON_ERP_PRESENT`: UInt = 64u;
public const val `DOT11_FLAGS_80211G_USE_PROTECTION`: UInt = 32u;
public const val `DOT11_FLAGS_PS_ON`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_FRAGMENT_DESCRIPTOR` (
    public var `uOffset`: UInt,
    public var `uLength`: UInt,
)
public const val `DOT11_FREQUENCY_BANDS_LOWER`: UInt = 1u;
public const val `DOT11_FREQUENCY_BANDS_MIDDLE`: UInt = 2u;
public const val `DOT11_FREQUENCY_BANDS_UPPER`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 1305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 1323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_HESSID_LENGTH`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_HOPPING_PATTERN_ENTRY` (
    public var `uHoppingPatternIndex`: UInt,
    public var `uRandomTableFieldNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_HOPPING_PATTERN_ENTRY_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11HoppingPatternEntry`: Array<`DOT11_HOPPING_PATTERN_ENTRY`>,
)
// UNSUPPORTED Rust 1362:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_HOPPING_PATTERN_ENTRY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_HOP_ALGO_ADOPTED` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_HRDSSS_PHY_ATTRIBUTES` (
    public var `bShortPreambleOptionImplemented`: Boolean,
    public var `bPBCCOptionImplemented`: Boolean,
    public var `bChannelAgilityPresent`: Boolean,
    public var `uHRCCAModeSupported`: UInt,
)
public const val `DOT11_HR_CCA_MODE_CS_AND_ED`: UInt = 4u;
public const val `DOT11_HR_CCA_MODE_CS_ONLY`: UInt = 2u;
public const val `DOT11_HR_CCA_MODE_CS_WITH_TIMER`: UInt = 8u;
public const val `DOT11_HR_CCA_MODE_ED_ONLY`: UInt = 1u;
public const val `DOT11_HR_CCA_MODE_HRCS_AND_ED`: UInt = 16u;
public const val `DOT11_HW_DEFRAGMENTATION_SUPPORTED`: UInt = 8u;
public const val `DOT11_HW_FRAGMENTATION_SUPPORTED`: UInt = 4u;
public const val `DOT11_HW_MSDU_AUTH_SUPPORTED_RX`: UInt = 32u;
public const val `DOT11_HW_MSDU_AUTH_SUPPORTED_TX`: UInt = 16u;
public const val `DOT11_HW_WEP_SUPPORTED_RX`: UInt = 2u;
public const val `DOT11_HW_WEP_SUPPORTED_TX`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_IBSS_PARAMS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `bJoinOnly`: Boolean,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
public const val `DOT11_IBSS_PARAMS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_IHV_VERSION_INFO` (
    public var `dwVerMin`: UInt,
    public var `dwVerMax`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMacAddr`: UByteArray,
    public var `uStatus`: UInt,
    public var `ucErrorSource`: UByte,
    public var `bReAssocReq`: Boolean,
    public var `bReAssocResp`: Boolean,
    public var `uAssocReqOffset`: UInt,
    public var `uAssocReqSize`: UInt,
    public var `uAssocRespOffset`: UInt,
    public var `uAssocRespSize`: UInt,
    public var `AuthAlgo`: `DOT11_AUTH_ALGORITHM`,
    public var `UnicastCipher`: `DOT11_CIPHER_ALGORITHM`,
    public var `MulticastCipher`: `DOT11_CIPHER_ALGORITHM`,
    public var `uActivePhyListOffset`: UInt,
    public var `uActivePhyListSize`: UInt,
    public var `uBeaconOffset`: UInt,
    public var `uBeaconSize`: UInt,
)
// UNSUPPORTED Rust 1425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INCOMING_ASSOC_DECISION` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMacAddr`: UByteArray,
    public var `bAccept`: Boolean,
    public var `usReasonCode`: UShort,
    public var `uAssocResponseIEsOffset`: UInt,
    public var `uAssocResponseIEsLength`: UInt,
)
// UNSUPPORTED Rust 1443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_DECISION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_DECISION_REVISION_1`: UInt = 1u;
public const val `DOT11_INCOMING_ASSOC_DECISION_REVISION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INCOMING_ASSOC_DECISION_V2` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMacAddr`: UByteArray,
    public var `bAccept`: Boolean,
    public var `usReasonCode`: UShort,
    public var `uAssocResponseIEsOffset`: UInt,
    public var `uAssocResponseIEsLength`: UInt,
    public var `WFDStatus`: UByte,
)
// UNSUPPORTED Rust 1463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_DECISION_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMacAddr`: UByteArray,
    public var `bReAssocReq`: Boolean,
    public var `uAssocReqOffset`: UInt,
    public var `uAssocReqSize`: UInt,
)
// UNSUPPORTED Rust 1479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INCOMING_ASSOC_STARTED_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMacAddr`: UByteArray,
)
// UNSUPPORTED Rust 1493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_STARTED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_STARTED_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_INVALID_CHANNEL_NUMBER`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `ReceiverAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 1513:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ReceiverDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_IV48_COUNTER` (
    public var `uIV32Counter`: UInt,
    public var `usIV16Counter`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_JOIN_REQUEST` (
    public var `uJoinFailureTimeout`: UInt,
    public var `OperationalRateSet`: `DOT11_RATE_SET`,
    public var `uChCenterFrequency`: UInt,
    public var `dot11BSSDescription`: `DOT11_BSS_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_KEY_ALGO_BIP` (
    public var `ucIPN`: UByteArray,
    public var `ulBIPKeyLength`: UInt,
    public var `ucBIPKey`: UByteArray,
)
// UNSUPPORTED Rust 1559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_KEY_ALGO_BIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_KEY_ALGO_BIP_GMAC_256` (
    public var `ucIPN`: UByteArray,
    public var `ulBIPGmac256KeyLength`: UInt,
    public var `ucBIPGmac256Key`: UByteArray,
)
// UNSUPPORTED Rust 1571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_KEY_ALGO_BIP_GMAC_256 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_KEY_ALGO_CCMP` (
    public var `ucIV48Counter`: UByteArray,
    public var `ulCCMPKeyLength`: UInt,
    public var `ucCCMPKey`: UByteArray,
)
// UNSUPPORTED Rust 1583:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_KEY_ALGO_CCMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_KEY_ALGO_GCMP` (
    public var `ucIV48Counter`: UByteArray,
    public var `ulGCMPKeyLength`: UInt,
    public var `ucGCMPKey`: UByteArray,
)
// UNSUPPORTED Rust 1595:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_KEY_ALGO_GCMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_KEY_ALGO_GCMP_256` (
    public var `ucIV48Counter`: UByteArray,
    public var `ulGCMP256KeyLength`: UInt,
    public var `ucGCMP256Key`: UByteArray,
)
// UNSUPPORTED Rust 1607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_KEY_ALGO_GCMP_256 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_KEY_ALGO_TKIP_MIC` (
    public var `ucIV48Counter`: UByteArray,
    public var `ulTKIPKeyLength`: UInt,
    public var `ulMICKeyLength`: UInt,
    public var `ucTKIPMICKeys`: UByteArray,
)
// UNSUPPORTED Rust 1620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_KEY_ALGO_TKIP_MIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_KEY_DIRECTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_LINK_QUALITY_ENTRY` (
    public var `PeerMacAddr`: UByteArray,
    public var `ucLinkQuality`: UByte,
)
// UNSUPPORTED Rust 1632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_LINK_QUALITY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_LINK_QUALITY_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uLinkQualityListSize`: UInt,
    public var `uLinkQualityListOffset`: UInt,
)
public const val `DOT11_LINK_QUALITY_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MAC_ADDRESS_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `MacAddrs`: UByteArray,
)
// UNSUPPORTED Rust 1655:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_MAC_ADDRESS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MAC_ADDRESS_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MAC_FRAME_STATISTICS` (
    public var `ullTransmittedFrameCount`: ULong,
    public var `ullReceivedFrameCount`: ULong,
    public var `ullTransmittedFailureFrameCount`: ULong,
    public var `ullReceivedFailureFrameCount`: ULong,
    public var `ullWEPExcludedCount`: ULong,
    public var `ullTKIPLocalMICFailures`: ULong,
    public var `ullTKIPReplays`: ULong,
    public var `ullTKIPICVErrorCount`: ULong,
    public var `ullCCMPReplays`: ULong,
    public var `ullCCMPDecryptErrors`: ULong,
    public var `ullWEPUndecryptableCount`: ULong,
    public var `ullWEPICVErrorCount`: ULong,
    public var `ullDecryptSuccessCount`: ULong,
    public var `ullDecryptFailureCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MAC_INFO` (
    public var `uReserved`: UInt,
    public var `uNdisPortNumber`: UInt,
    public var `MacAddr`: UByteArray,
)
// UNSUPPORTED Rust 1687:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MAC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MAC_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uOpmodeMask`: UInt,
)
public const val `DOT11_MAC_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MANUFACTURING_CALLBACK_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `dot11ManufacturingCallbackType`: `DOT11_MANUFACTURING_CALLBACK_TYPE`,
    public var `uStatus`: UInt,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_MANUFACTURING_CALLBACK_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MANUFACTURING_CALLBACK_REVISION_1`: UInt = 1u;
public typealias `DOT11_MANUFACTURING_CALLBACK_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MANUFACTURING_FUNCTIONAL_TEST_QUERY_ADC` (
    public var `Dot11Band`: `DOT11_BAND`,
    public var `uChannel`: UInt,
    public var `ADCPowerLevel`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MANUFACTURING_FUNCTIONAL_TEST_RX` (
    public var `bEnabled`: Boolean,
    public var `Dot11Band`: `DOT11_BAND`,
    public var `uChannel`: UInt,
    public var `PowerLevel`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MANUFACTURING_FUNCTIONAL_TEST_TX` (
    public var `bEnable`: Boolean,
    public var `bOpenLoop`: Boolean,
    public var `Dot11Band`: `DOT11_BAND`,
    public var `uChannel`: UInt,
    public var `uSetPowerLevel`: UInt,
    public var `ADCPowerLevel`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MANUFACTURING_SELF_TEST_QUERY_RESULTS` (
    public var `SelfTestType`: `DOT11_MANUFACTURING_SELF_TEST_TYPE`,
    public var `uTestID`: UInt,
    public var `bResult`: Boolean,
    public var `uPinFailedBitMask`: UInt,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uBytesWrittenOut`: UInt,
    public var `ucBufferOut`: UByteArray,
)
// UNSUPPORTED Rust 1753:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MANUFACTURING_SELF_TEST_QUERY_RESULTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MANUFACTURING_SELF_TEST_SET_PARAMS` (
    public var `SelfTestType`: `DOT11_MANUFACTURING_SELF_TEST_TYPE`,
    public var `uTestID`: UInt,
    public var `uPinBitMask`: UInt,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uBufferLength`: UInt,
    public var `ucBufferIn`: UByteArray,
)
// UNSUPPORTED Rust 1768:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MANUFACTURING_SELF_TEST_SET_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_MANUFACTURING_SELF_TEST_TYPE` = Int;
public const val `DOT11_MANUFACTURING_SELF_TEST_TYPE_BT_COEXISTENCE`: `DOT11_MANUFACTURING_SELF_TEST_TYPE` = 3;
public const val `DOT11_MANUFACTURING_SELF_TEST_TYPE_INTERFACE`: `DOT11_MANUFACTURING_SELF_TEST_TYPE` = 1;
public const val `DOT11_MANUFACTURING_SELF_TEST_TYPE_RF_INTERFACE`: `DOT11_MANUFACTURING_SELF_TEST_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MANUFACTURING_TEST` (
    public var `dot11ManufacturingTestType`: `DOT11_MANUFACTURING_TEST_TYPE`,
    public var `uBufferLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 1784:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MANUFACTURING_TEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MANUFACTURING_TEST_QUERY_DATA` (
    public var `uKey`: UInt,
    public var `uOffset`: UInt,
    public var `uBufferLength`: UInt,
    public var `uBytesRead`: UInt,
    public var `ucBufferOut`: UByteArray,
)
// UNSUPPORTED Rust 1798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MANUFACTURING_TEST_QUERY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MANUFACTURING_TEST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MANUFACTURING_TEST_SET_DATA` (
    public var `uKey`: UInt,
    public var `uOffset`: UInt,
    public var `uBufferLength`: UInt,
    public var `ucBufferIn`: UByteArray,
)
// UNSUPPORTED Rust 1812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MANUFACTURING_TEST_SET_DATA {
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
public class `DOT11_MANUFACTURING_TEST_SLEEP` (
    public var `uSleepTime`: UInt,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1823:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MANUFACTURING_TEST_SLEEP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_MANUFACTURING_TEST_TYPE` = Int;
public const val `DOT11_MAX_CHANNEL_HINTS`: UInt = 4u;
public const val `DOT11_MAX_NUM_DEFAULT_KEY`: UInt = 4u;
public const val `DOT11_MAX_NUM_DEFAULT_KEY_MFP`: UInt = 6u;
public const val `DOT11_MAX_NUM_OF_FRAGMENTS`: UInt = 16u;
public const val `DOT11_MAX_PDU_SIZE`: UInt = 2346u;
public const val `DOT11_MAX_REQUESTED_SERVICE_INFORMATION_LENGTH`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MD_CAPABILITY_ENTRY_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11MDCapabilityEntry`: Array<`DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY`>,
)
// UNSUPPORTED Rust 1842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_MD_CAPABILITY_ENTRY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MIN_PDU_SIZE`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MPDU_MAX_LENGTH_INDICATION` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uPhyId`: UInt,
    public var `uMPDUMaxLength`: UInt,
)
public const val `DOT11_MPDU_MAX_LENGTH_INDICATION_REVISION_1`: UInt = 1u;
public const val `DOT11_MSONEX_FAILURE`: `DOT11_MSONEX_RESULT` = 1;
public const val `DOT11_MSONEX_IN_PROGRESS`: `DOT11_MSONEX_RESULT` = 2;
public typealias `DOT11_MSONEX_RESULT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MSONEX_RESULT_PARAMS` (
    public var `Dot11OnexAuthStatus`: `ONEX_AUTH_STATUS`,
    public var `Dot11OneXReasonCode`: `ONEX_REASON_CODE`,
    public var `pbMPPESendKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwMPPESendKeyLen`: UInt,
    public var `pbMPPERecvKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwMPPERecvKeyLen`: UInt,
    public var `pDot11EapResult`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_EAP_RESULT`>?,
)
// UNSUPPORTED Rust 1872:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11_MSONEX_RESULT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MSONEX_SUCCESS`: `DOT11_MSONEX_RESULT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_MSSECURITY_SETTINGS` (
    public var `dot11AuthAlgorithm`: `DOT11_AUTH_ALGORITHM`,
    public var `dot11CipherAlgorithm`: `DOT11_CIPHER_ALGORITHM`,
    public var `fOneXEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `eapMethodType`: `super`.`super`.`Security`.`ExtensibleAuthenticationProtocol`.`EAP_METHOD_TYPE`,
    public var `dwEapConnectionDataLen`: UInt,
    public var `pEapConnectionData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1890:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11_MSSECURITY_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY` (
    public var `uMultiDomainCapabilityIndex`: UInt,
    public var `uFirstChannelNumber`: UInt,
    public var `uNumberOfChannels`: UInt,
    public var `lMaximumTransmitPowerLevel`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_NETWORK` (
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_NETWORK_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `dwIndex`: UInt,
    public var `Network`: Array<`DOT11_NETWORK`>,
)
// UNSUPPORTED Rust 1917:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_NETWORK_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_NIC_SPECIFIC_EXTENSION` (
    public var `uBufferLength`: UInt,
    public var `uTotalBufferLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 1929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_NIC_SPECIFIC_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_NLO_FLAG_SCAN_AT_SYSTEM_RESUME`: UInt = 4u;
public const val `DOT11_NLO_FLAG_SCAN_ON_AOAC_PLATFORM`: UInt = 2u;
public const val `DOT11_NLO_FLAG_STOP_NLO_INDICATION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_OFDM_PHY_ATTRIBUTES` (
    public var `uFrequencyBandsSupported`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_OFFLOAD_CAPABILITY` (
    public var `uReserved`: UInt,
    public var `uFlags`: UInt,
    public var `uSupportedWEPAlgorithms`: UInt,
    public var `uNumOfReplayWindows`: UInt,
    public var `uMaxWEPKeyMappingLength`: UInt,
    public var `uSupportedAuthAlgorithms`: UInt,
    public var `uMaxAuthKeyMappingLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_OFFLOAD_NETWORK` (
    public var `Ssid`: `DOT11_SSID`,
    public var `UnicastCipher`: `DOT11_CIPHER_ALGORITHM`,
    public var `AuthAlgo`: `DOT11_AUTH_ALGORITHM`,
    public var `Dot11ChannelHints`: Array<`DOT11_CHANNEL_HINT`>,
)
// UNSUPPORTED Rust 1961:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_OFFLOAD_NETWORK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_OFFLOAD_NETWORK_LIST_INFO` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ulFlags`: UInt,
    public var `FastScanPeriod`: UInt,
    public var `FastScanIterations`: UInt,
    public var `SlowScanPeriod`: UInt,
    public var `uNumOfEntries`: UInt,
    public var `offloadNetworkList`: Array<`DOT11_OFFLOAD_NETWORK`>,
)
// UNSUPPORTED Rust 1978:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_OFFLOAD_NETWORK_LIST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_OFFLOAD_NETWORK_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_OFFLOAD_NETWORK_STATUS_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `Status`: Int,
)
public const val `DOT11_OFFLOAD_NETWORK_STATUS_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_OFFLOAD_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_OI` (
    public var `OILength`: UShort,
    public var `OI`: UByteArray,
)
// UNSUPPORTED Rust 2000:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_OI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_OI_MAX_LENGTH`: UInt = 5u;
public const val `DOT11_OI_MIN_LENGTH`: UInt = 3u;
public const val `DOT11_OPERATION_MODE_AP`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_OPERATION_MODE_CAPABILITY` (
    public var `uReserved`: UInt,
    public var `uMajorVersion`: UInt,
    public var `uMinorVersion`: UInt,
    public var `uNumOfTXBuffers`: UInt,
    public var `uNumOfRXBuffers`: UInt,
    public var `uOpModeCapability`: UInt,
)
public const val `DOT11_OPERATION_MODE_EXTENSIBLE_AP`: UInt = 8u;
public const val `DOT11_OPERATION_MODE_EXTENSIBLE_STATION`: UInt = 4u;
public const val `DOT11_OPERATION_MODE_MANUFACTURING`: UInt = 1073741824u;
public const val `DOT11_OPERATION_MODE_NETWORK_MONITOR`: UInt = 2147483648u;
public const val `DOT11_OPERATION_MODE_STATION`: UInt = 1u;
public const val `DOT11_OPERATION_MODE_UNKNOWN`: UInt = 0u;
public const val `DOT11_OPERATION_MODE_WFD_CLIENT`: UInt = 64u;
public const val `DOT11_OPERATION_MODE_WFD_DEVICE`: UInt = 16u;
public const val `DOT11_OPERATION_MODE_WFD_GROUP_OWNER`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_OPTIONAL_CAPABILITY` (
    public var `uReserved`: UInt,
    public var `bDot11PCF`: Boolean,
    public var `bDot11PCFMPDUTransferToPC`: Boolean,
    public var `bStrictlyOrderedServiceClass`: Boolean,
)
public const val `DOT11_PACKET_TYPE_ALL_MULTICAST_CTRL`: UInt = 4096u;
public const val `DOT11_PACKET_TYPE_ALL_MULTICAST_DATA`: UInt = 16384u;
public const val `DOT11_PACKET_TYPE_ALL_MULTICAST_MGMT`: UInt = 8192u;
public const val `DOT11_PACKET_TYPE_BROADCAST_CTRL`: UInt = 64u;
public const val `DOT11_PACKET_TYPE_BROADCAST_DATA`: UInt = 256u;
public const val `DOT11_PACKET_TYPE_BROADCAST_MGMT`: UInt = 128u;
public const val `DOT11_PACKET_TYPE_DIRECTED_CTRL`: UInt = 1u;
public const val `DOT11_PACKET_TYPE_DIRECTED_DATA`: UInt = 4u;
public const val `DOT11_PACKET_TYPE_DIRECTED_MGMT`: UInt = 2u;
public const val `DOT11_PACKET_TYPE_MULTICAST_CTRL`: UInt = 8u;
public const val `DOT11_PACKET_TYPE_MULTICAST_DATA`: UInt = 32u;
public const val `DOT11_PACKET_TYPE_MULTICAST_MGMT`: UInt = 16u;
public const val `DOT11_PACKET_TYPE_PROMISCUOUS_CTRL`: UInt = 512u;
public const val `DOT11_PACKET_TYPE_PROMISCUOUS_DATA`: UInt = 2048u;
public const val `DOT11_PACKET_TYPE_PROMISCUOUS_MGMT`: UInt = 1024u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PEER_INFO` (
    public var `MacAddress`: UByteArray,
    public var `usCapabilityInformation`: UShort,
    public var `AuthAlgo`: `DOT11_AUTH_ALGORITHM`,
    public var `UnicastCipherAlgo`: `DOT11_CIPHER_ALGORITHM`,
    public var `MulticastCipherAlgo`: `DOT11_CIPHER_ALGORITHM`,
    public var `bWpsEnabled`: Boolean,
    public var `usListenInterval`: UShort,
    public var `ucSupportedRates`: UByteArray,
    public var `usAssociationID`: UShort,
    public var `AssociationState`: `DOT11_ASSOCIATION_STATE`,
    public var `PowerMode`: `DOT11_POWER_MODE`,
    public var `liAssociationUpTime`: Long,
    public var `Statistics`: `DOT11_PEER_STATISTICS`,
)
// UNSUPPORTED Rust 2067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_PEER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PEER_INFO_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `PeerInfo`: Array<`DOT11_PEER_INFO`>,
)
// UNSUPPORTED Rust 2081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PEER_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PEER_INFO_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_PEER_STATISTICS` (
    public var `ullDecryptSuccessCount`: ULong,
    public var `ullDecryptFailureCount`: ULong,
    public var `ullTxPacketSuccessCount`: ULong,
    public var `ullTxPacketFailureCount`: ULong,
    public var `ullRxPacketSuccessCount`: ULong,
    public var `ullRxPacketFailureCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_PER_MSDU_COUNTERS` (
    public var `uTransmittedFragmentCount`: UInt,
    public var `uRetryCount`: UInt,
    public var `uRTSSuccessCount`: UInt,
    public var `uRTSFailureCount`: UInt,
    public var `uACKFailureCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 126 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PHY_ATTRIBUTES` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PhyType`: `DOT11_PHY_TYPE`,
    public var `bHardwarePhyState`: Boolean,
    public var `bSoftwarePhyState`: Boolean,
    public var `bCFPollable`: Boolean,
    public var `uMPDUMaxLength`: UInt,
    public var `TempType`: `DOT11_TEMP_TYPE`,
    public var `DiversitySupport`: `DOT11_DIVERSITY_SUPPORT`,
    public var `PhySpecificAttributes`: `DOT11_PHY_ATTRIBUTES_0`,
    public var `uNumberSupportedPowerLevels`: UInt,
    public var `TxPowerLevels`: UIntArray,
    public var `uNumDataRateMappingEntries`: UInt,
    public var `DataRateMappingEntries`: Array<`DOT11_DATA_RATE_MAPPING_ENTRY`>,
    public var `SupportedDataRatesValue`: `DOT11_SUPPORTED_DATA_RATES_VALUE_V2`,
)
// UNSUPPORTED Rust 2126:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2132:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub union DOT11_PHY_ATTRIBUTES_0 {
//     pub HRDSSSAttributes: DOT11_HRDSSS_PHY_ATTRIBUTES,
//     pub OFDMAttributes: DOT11_OFDM_PHY_ATTRIBUTES,
//     pub ERPAttributes: DOT11_ERP_PHY_ATTRIBUTES,
// }

// UNSUPPORTED Rust 2140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_ATTRIBUTES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_PHY_FRAME_STATISTICS` (
    public var `ullTransmittedFrameCount`: ULong,
    public var `ullMulticastTransmittedFrameCount`: ULong,
    public var `ullFailedCount`: ULong,
    public var `ullRetryCount`: ULong,
    public var `ullMultipleRetryCount`: ULong,
    public var `ullMaxTXLifetimeExceededCount`: ULong,
    public var `ullTransmittedFragmentCount`: ULong,
    public var `ullRTSSuccessCount`: ULong,
    public var `ullRTSFailureCount`: ULong,
    public var `ullACKFailureCount`: ULong,
    public var `ullReceivedFrameCount`: ULong,
    public var `ullMulticastReceivedFrameCount`: ULong,
    public var `ullPromiscuousReceivedFrameCount`: ULong,
    public var `ullMaxRXLifetimeExceededCount`: ULong,
    public var `ullFrameDuplicateCount`: ULong,
    public var `ullReceivedFragmentCount`: ULong,
    public var `ullPromiscuousReceivedFragmentCount`: ULong,
    public var `ullFCSErrorCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ulPhyId`: UInt,
    public var `Anonymous`: `DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0`,
)
// UNSUPPORTED Rust 2177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2183:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub union DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0 {
//     pub ulChannel: u32,
//     pub ulFrequency: u32,
// }

// UNSUPPORTED Rust 2190:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PHY_ID_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11PhyId`: UIntArray,
)
// UNSUPPORTED Rust 2206:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_ID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_ID_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_PHY_STATE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uPhyId`: UInt,
    public var `bHardwarePhyState`: Boolean,
    public var `bSoftwarePhyState`: Boolean,
)
public const val `DOT11_PHY_STATE_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_PHY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PHY_TYPE_INFO` (
    public var `dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `bUseParameters`: Boolean,
    public var `uProbeDelay`: UInt,
    public var `uMinChannelTime`: UInt,
    public var `uMaxChannelTime`: UInt,
    public var `ChDescriptionType`: `CH_DESCRIPTION_TYPE`,
    public var `uChannelListSize`: UInt,
    public var `ucChannelListBuffer`: UByteArray,
)
// UNSUPPORTED Rust 2236:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_PHY_TYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PHY_TYPE_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11PhyType`: Array<`DOT11_PHY_TYPE`>,
)
// UNSUPPORTED Rust 2250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_TYPE_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_PMKID_CANDIDATE_LIST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uCandidateListSize`: UInt,
    public var `uCandidateListOffset`: UInt,
)
public const val `DOT11_PMKID_CANDIDATE_LIST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PMKID_ENTRY` (
    public var `BSSID`: UByteArray,
    public var `PMKID`: UByteArray,
    public var `uFlags`: UInt,
)
// UNSUPPORTED Rust 2273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_PMKID_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PMKID_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `PMKIDs`: Array<`DOT11_PMKID_ENTRY`>,
)
// UNSUPPORTED Rust 2287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PMKID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PMKID_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PORT_STATE` (
    public var `PeerMacAddress`: UByteArray,
    public var `uSessionId`: UInt,
    public var `bPortControlled`: `windows_sys`.`core`.`BOOL`,
    public var `bPortAuthorized`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_PORT_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PORT_STATE_NOTIFICATION` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerMac`: UByteArray,
    public var `bOpen`: Boolean,
)
// UNSUPPORTED Rust 2315:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PORT_STATE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PORT_STATE_NOTIFICATION_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_POWER_MGMT_AUTO_MODE_ENABLED_INFO` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `bEnabled`: Boolean,
)
public const val `DOT11_POWER_MGMT_AUTO_MODE_ENABLED_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_POWER_MGMT_MODE` (
    public var `dot11PowerMode`: `DOT11_POWER_MODE`,
    public var `uPowerSaveLevel`: UInt,
    public var `usListenInterval`: UShort,
    public var `usAID`: UShort,
    public var `bReceiveDTIMs`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_POWER_MGMT_MODE_STATUS_INFO` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PowerSaveMode`: `DOT11_POWER_MODE`,
    public var `uPowerSaveLevel`: UInt,
    public var `Reason`: `DOT11_POWER_MODE_REASON`,
)
public const val `DOT11_POWER_MGMT_MODE_STATUS_INFO_REVISION_1`: UInt = 1u;
public typealias `DOT11_POWER_MODE` = Int;
public typealias `DOT11_POWER_MODE_REASON` = Int;
public const val `DOT11_POWER_SAVE_LEVEL_FAST_PSP`: UInt = 2u;
public const val `DOT11_POWER_SAVE_LEVEL_MAX_PSP`: UInt = 1u;
public const val `DOT11_POWER_SAVING_FAST_PSP`: UInt = 8u;
public const val `DOT11_POWER_SAVING_MAXIMUM_LEVEL`: UInt = 24u;
public const val `DOT11_POWER_SAVING_MAX_PSP`: UInt = 16u;
public const val `DOT11_POWER_SAVING_NO_POWER_SAVING`: UInt = 0u;
public const val `DOT11_PRIORITY_CONTENTION`: UInt = 0u;
public const val `DOT11_PRIORITY_CONTENTION_FREE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_PRIVACY_EXEMPTION` (
    public var `usEtherType`: UShort,
    public var `usExemptionActionType`: UShort,
    public var `usExemptionPacketType`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PRIVACY_EXEMPTION_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `PrivacyExemptionEntries`: Array<`DOT11_PRIVACY_EXEMPTION`>,
)
// UNSUPPORTED Rust 2375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PRIVACY_EXEMPTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PRIVACY_EXEMPTION_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `ReceiverAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ReceiverDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `Status`: Int,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2412:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_PSD_IE_MAX_DATA_SIZE`: UInt = 240u;
public const val `DOT11_PSD_IE_MAX_ENTRY_NUMBER`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_QOS_PARAMS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ucEnabledQoSProtocolFlags`: UByte,
)
public const val `DOT11_QOS_PARAMS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_QOS_TX_DURATION` (
    public var `uNominalMSDUSize`: UInt,
    public var `uMinPHYRate`: UInt,
    public var `uDuration`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_QOS_TX_MEDIUM_TIME` (
    public var `dot11PeerAddress`: UByteArray,
    public var `ucQoSPriority`: UByte,
    public var `uMediumTimeAdmited`: UInt,
)
// UNSUPPORTED Rust 2443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_QOS_TX_MEDIUM_TIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_RADIO_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 126 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RATE_SET` (
    public var `uRateSetLength`: UInt,
    public var `ucRateSet`: UByteArray,
)
// UNSUPPORTED Rust 2455:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_RATE_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RATE_SET_MAX_LENGTH`: UInt = 126u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2471:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `RequestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `ResponseContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2507:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `TransmitterDeviceAddress`: UByteArray,
    public var `BSSID`: UByteArray,
    public var `DialogToken`: UByte,
    public var `RequestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2526:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `TransmitterDeviceAddress`: UByteArray,
    public var `BSSID`: UByteArray,
    public var `DialogToken`: UByte,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `TransmitterDeviceAddress`: UByteArray,
    public var `BSSID`: UByteArray,
    public var `DialogToken`: UByte,
    public var `RequestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2563:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `TransmitterDeviceAddress`: UByteArray,
    public var `BSSID`: UByteArray,
    public var `DialogToken`: UByte,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_RECV_CONTEXT_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECV_EXTENSION_INFO` (
    public var `uVersion`: UInt,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `uChCenterFrequency`: UInt,
    public var `lRSSI`: Int,
    public var `lRSSIMin`: Int,
    public var `lRSSIMax`: Int,
    public var `uRSSI`: UInt,
    public var `ucPriority`: UByte,
    public var `ucDataRate`: UByte,
    public var `ucPeerMacAddress`: UByteArray,
    public var `dwExtendedStatus`: UInt,
    public var `hWEPOffloadContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hAuthOffloadContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `usWEPAppliedMask`: UShort,
    public var `usWPAMSDUPriority`: UShort,
    public var `dot11LowestIV48Counter`: `DOT11_IV48_COUNTER`,
    public var `usDot11LeftRWBitMap`: UShort,
    public var `dot11HighestIV48Counter`: `DOT11_IV48_COUNTER`,
    public var `usDot11RightRWBitMap`: UShort,
    public var `usNumberOfMPDUsReceived`: UShort,
    public var `usNumberOfFragments`: UShort,
    public var `pNdisPackets`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
)
// UNSUPPORTED Rust 2616:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_RECV_EXTENSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECV_EXTENSION_INFO_V2` (
    public var `uVersion`: UInt,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `uChCenterFrequency`: UInt,
    public var `lRSSI`: Int,
    public var `uRSSI`: UInt,
    public var `ucPriority`: UByte,
    public var `ucDataRate`: UByte,
    public var `ucPeerMacAddress`: UByteArray,
    public var `dwExtendedStatus`: UInt,
    public var `hWEPOffloadContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hAuthOffloadContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `usWEPAppliedMask`: UShort,
    public var `usWPAMSDUPriority`: UShort,
    public var `dot11LowestIV48Counter`: `DOT11_IV48_COUNTER`,
    public var `usDot11LeftRWBitMap`: UShort,
    public var `dot11HighestIV48Counter`: `DOT11_IV48_COUNTER`,
    public var `usDot11RightRWBitMap`: UShort,
    public var `usNumberOfMPDUsReceived`: UShort,
    public var `usNumberOfFragments`: UShort,
    public var `pNdisPackets`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
)
// UNSUPPORTED Rust 2646:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_RECV_EXTENSION_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_RECV_SENSITIVITY` (
    public var `ucDataRate`: UByte,
    public var `lRSSIMin`: Int,
    public var `lRSSIMax`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RECV_SENSITIVITY_LIST` (
    public var `Anonymous`: `DOT11_RECV_SENSITIVITY_LIST_0`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11RecvSensitivity`: Array<`DOT11_RECV_SENSITIVITY`>,
)
// UNSUPPORTED Rust 2666:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_RECV_SENSITIVITY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2671:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DOT11_RECV_SENSITIVITY_LIST_0 {
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub uPhyId: u32,
// }

// UNSUPPORTED Rust 2677:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_RECV_SENSITIVITY_LIST_0 {
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
public class `DOT11_REG_DOMAINS_SUPPORT_VALUE` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11RegDomainValue`: Array<`DOT11_REG_DOMAIN_VALUE`>,
)
// UNSUPPORTED Rust 2689:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_REG_DOMAINS_SUPPORT_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_REG_DOMAIN_DOC`: UInt = 32u;
public const val `DOT11_REG_DOMAIN_ETSI`: UInt = 48u;
public const val `DOT11_REG_DOMAIN_FCC`: UInt = 16u;
public const val `DOT11_REG_DOMAIN_FRANCE`: UInt = 50u;
public const val `DOT11_REG_DOMAIN_MKK`: UInt = 64u;
public const val `DOT11_REG_DOMAIN_OTHER`: UInt = 0u;
public const val `DOT11_REG_DOMAIN_SPAIN`: UInt = 49u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_REG_DOMAIN_VALUE` (
    public var `uRegDomainsSupportIndex`: UInt,
    public var `uRegDomainsSupportValue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_RESET_REQUEST` (
    public var `dot11ResetType`: `DOT11_RESET_TYPE`,
    public var `dot11MacAddress`: UByteArray,
    public var `bSetDefaultMIB`: Boolean,
)
// UNSUPPORTED Rust 2714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_RESET_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_RESET_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_ROAMING_COMPLETION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uStatus`: UInt,
)
public const val `DOT11_ROAMING_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_ROAMING_START_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `AdhocBSSID`: UByteArray,
    public var `AdhocSSID`: `DOT11_SSID`,
    public var `uRoamingReason`: UInt,
)
// UNSUPPORTED Rust 2737:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ROAMING_START_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ROAMING_START_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_RSSI_RANGE` (
    public var `dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `uRSSIMin`: UInt,
    public var `uRSSIMax`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SCAN_REQUEST` (
    public var `dot11BSSType`: `DOT11_BSS_TYPE`,
    public var `dot11BSSID`: UByteArray,
    public var `dot11SSID`: `DOT11_SSID`,
    public var `dot11ScanType`: `DOT11_SCAN_TYPE`,
    public var `bRestrictedScan`: Boolean,
    public var `bUseRequestIE`: Boolean,
    public var `uRequestIDsOffset`: UInt,
    public var `uNumOfRequestIDs`: UInt,
    public var `uPhyTypesOffset`: UInt,
    public var `uNumOfPhyTypes`: UInt,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 2768:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SCAN_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SCAN_REQUEST_V2` (
    public var `dot11BSSType`: `DOT11_BSS_TYPE`,
    public var `dot11BSSID`: UByteArray,
    public var `dot11ScanType`: `DOT11_SCAN_TYPE`,
    public var `bRestrictedScan`: Boolean,
    public var `udot11SSIDsOffset`: UInt,
    public var `uNumOfdot11SSIDs`: UInt,
    public var `bUseRequestIE`: Boolean,
    public var `uRequestIDsOffset`: UInt,
    public var `uNumOfRequestIDs`: UInt,
    public var `uPhyTypeInfosOffset`: UInt,
    public var `uNumOfPhyTypeInfos`: UInt,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 2791:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SCAN_REQUEST_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_SCAN_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SECURITY_PACKET_HEADER` (
    public var `PeerMac`: UByteArray,
    public var `usEtherType`: UShort,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 2804:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SECURITY_PACKET_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_CONTEXT_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `ResponseContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uSendTimeout`: UInt,
    public var `Status`: UByte,
    public var `GroupCapability`: UByte,
    public var `GroupID`: `DOT11_WFD_GROUP_ID`,
    public var `bUseGroupID`: Boolean,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2826:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `uSendTimeout`: UInt,
    public var `GroupOwnerIntent`: `DOT11_WFD_GO_INTENT`,
    public var `MinimumConfigTimeout`: `DOT11_WFD_CONFIGURATION_TIMEOUT`,
    public var `IntendedInterfaceAddress`: UByteArray,
    public var `GroupCapability`: UByte,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2848:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `PeerDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `RequestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uSendTimeout`: UInt,
    public var `Status`: UByte,
    public var `GroupOwnerIntent`: `DOT11_WFD_GO_INTENT`,
    public var `MinimumConfigTimeout`: `DOT11_WFD_CONFIGURATION_TIMEOUT`,
    public var `IntendedInterfaceAddress`: UByteArray,
    public var `GroupCapability`: UByte,
    public var `GroupID`: `DOT11_WFD_GROUP_ID`,
    public var `bUseGroupID`: Boolean,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_INVITATION_REQUEST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `DialogToken`: UByte,
    public var `PeerDeviceAddress`: UByteArray,
    public var `uSendTimeout`: UInt,
    public var `MinimumConfigTimeout`: `DOT11_WFD_CONFIGURATION_TIMEOUT`,
    public var `InvitationFlags`: `DOT11_WFD_INVITATION_FLAGS`,
    public var `GroupBSSID`: UByteArray,
    public var `bUseGroupBSSID`: Boolean,
    public var `OperatingChannel`: `DOT11_WFD_CHANNEL`,
    public var `bUseSpecifiedOperatingChannel`: Boolean,
    public var `GroupID`: `DOT11_WFD_GROUP_ID`,
    public var `bLocalGO`: Boolean,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2900:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_INVITATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_INVITATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_INVITATION_RESPONSE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ReceiverDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `RequestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uSendTimeout`: UInt,
    public var `Status`: UByte,
    public var `MinimumConfigTimeout`: `DOT11_WFD_CONFIGURATION_TIMEOUT`,
    public var `GroupBSSID`: UByteArray,
    public var `bUseGroupBSSID`: Boolean,
    public var `OperatingChannel`: `DOT11_WFD_CHANNEL`,
    public var `bUseSpecifiedOperatingChannel`: Boolean,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2925:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_INVITATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_INVITATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `DialogToken`: UByte,
    public var `PeerDeviceAddress`: UByteArray,
    public var `uSendTimeout`: UInt,
    public var `GroupCapability`: UByte,
    public var `GroupID`: `DOT11_WFD_GROUP_ID`,
    public var `bUseGroupID`: Boolean,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2946:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ReceiverDeviceAddress`: UByteArray,
    public var `DialogToken`: UByte,
    public var `RequestContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `uSendTimeout`: UInt,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
)
// UNSUPPORTED Rust 2965:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_SERVICE_CLASS_REORDERABLE_MULTICAST`: UInt = 0u;
public const val `DOT11_SERVICE_CLASS_STRICTLY_ORDERED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SSID` (
    public var `uSSIDLength`: UInt,
    public var `ucSSID`: UByteArray,
)
// UNSUPPORTED Rust 2980:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SSID_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `SSIDs`: Array<`DOT11_SSID`>,
)
// UNSUPPORTED Rust 2994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SSID_LIST_REVISION_1`: UInt = 1u;
public const val `DOT11_SSID_MAX_LENGTH`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_START_REQUEST` (
    public var `uStartFailureTimeout`: UInt,
    public var `OperationalRateSet`: `DOT11_RATE_SET`,
    public var `uChCenterFrequency`: UInt,
    public var `dot11BSSDescription`: `DOT11_BSS_DESCRIPTION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_STATISTICS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ullFourWayHandshakeFailures`: ULong,
    public var `ullTKIPCounterMeasuresInvoked`: ULong,
    public var `ullReserved`: ULong,
    public var `MacUcastCounters`: `DOT11_MAC_FRAME_STATISTICS`,
    public var `MacMcastCounters`: `DOT11_MAC_FRAME_STATISTICS`,
    public var `PhyCounters`: Array<`DOT11_PHY_FRAME_STATISTICS`>,
)
// UNSUPPORTED Rust 3022:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_STATISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_STATISTICS_REVISION_1`: UInt = 1u;
public const val `DOT11_STATUS_AP_JOIN_CONFIRM`: UInt = 5u;
public const val `DOT11_STATUS_AUTH_FAILED`: UInt = 131072u;
public const val `DOT11_STATUS_AUTH_NOT_VERIFIED`: UInt = 32768u;
public const val `DOT11_STATUS_AUTH_VERIFIED`: UInt = 65536u;
public const val `DOT11_STATUS_ENCRYPTION_FAILED`: UInt = 512u;
public const val `DOT11_STATUS_EXCESSIVE_DATA_LENGTH`: UInt = 256u;
public const val `DOT11_STATUS_GENERATE_AUTH_FAILED`: UInt = 16384u;
public const val `DOT11_STATUS_ICV_VERIFIED`: UInt = 2048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_STATUS_INDICATION` (
    public var `uStatusType`: UInt,
    public var `ndisStatus`: Int,
)
public const val `DOT11_STATUS_JOIN_CONFIRM`: UInt = 2u;
public const val `DOT11_STATUS_MPDU_MAX_LENGTH_CHANGED`: UInt = 6u;
public const val `DOT11_STATUS_PACKET_NOT_REASSEMBLED`: UInt = 8192u;
public const val `DOT11_STATUS_PACKET_REASSEMBLED`: UInt = 4096u;
public const val `DOT11_STATUS_PS_LIFETIME_EXPIRED`: UInt = 262144u;
public const val `DOT11_STATUS_RESET_CONFIRM`: UInt = 4u;
public const val `DOT11_STATUS_RETRY_LIMIT_EXCEEDED`: UInt = 2u;
public const val `DOT11_STATUS_SCAN_CONFIRM`: UInt = 1u;
public const val `DOT11_STATUS_START_CONFIRM`: UInt = 3u;
public const val `DOT11_STATUS_SUCCESS`: UInt = 1u;
public const val `DOT11_STATUS_UNAVAILABLE_BSS`: UInt = 128u;
public const val `DOT11_STATUS_UNAVAILABLE_PRIORITY`: UInt = 16u;
public const val `DOT11_STATUS_UNAVAILABLE_SERVICE_CLASS`: UInt = 32u;
public const val `DOT11_STATUS_UNSUPPORTED_PRIORITY`: UInt = 4u;
public const val `DOT11_STATUS_UNSUPPORTED_SERVICE_CLASS`: UInt = 8u;
public const val `DOT11_STATUS_WEP_KEY_UNAVAILABLE`: UInt = 1024u;
public const val `DOT11_STATUS_XMIT_MSDU_TIMER_EXPIRED`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_STOP_AP_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ulReason`: UInt,
)
public const val `DOT11_STOP_AP_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_STOP_AP_REASON_AP_ACTIVE`: UInt = 3u;
public const val `DOT11_STOP_AP_REASON_CHANNEL_NOT_AVAILABLE`: UInt = 2u;
public const val `DOT11_STOP_AP_REASON_FREQUENCY_NOT_AVAILABLE`: UInt = 1u;
public const val `DOT11_STOP_AP_REASON_IHV_END`: UInt = 4294967295u;
public const val `DOT11_STOP_AP_REASON_IHV_START`: UInt = 4278190080u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_SUPPORTED_ANTENNA` (
    public var `uAntennaListIndex`: UInt,
    public var `bSupportedAntenna`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SUPPORTED_ANTENNA_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11SupportedAntenna`: Array<`DOT11_SUPPORTED_ANTENNA`>,
)
// UNSUPPORTED Rust 3086:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_ANTENNA_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SUPPORTED_DATA_RATES_VALUE` (
    public var `ucSupportedTxDataRatesValue`: UByteArray,
    public var `ucSupportedRxDataRatesValue`: UByteArray,
)
// UNSUPPORTED Rust 3097:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_DATA_RATES_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SUPPORTED_DATA_RATES_VALUE_V2` (
    public var `ucSupportedTxDataRatesValue`: UByteArray,
    public var `ucSupportedRxDataRatesValue`: UByteArray,
)
// UNSUPPORTED Rust 3108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_DATA_RATES_VALUE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_SUPPORTED_DSSS_CHANNEL` (
    public var `uChannel`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SUPPORTED_DSSS_CHANNEL_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11SupportedDSSSChannel`: Array<`DOT11_SUPPORTED_DSSS_CHANNEL`>,
)
// UNSUPPORTED Rust 3125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_DSSS_CHANNEL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_SUPPORTED_OFDM_FREQUENCY` (
    public var `uCenterFrequency`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SUPPORTED_OFDM_FREQUENCY_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11SupportedOFDMFrequency`: Array<`DOT11_SUPPORTED_OFDM_FREQUENCY`>,
)
// UNSUPPORTED Rust 3142:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_OFDM_FREQUENCY_LIST {
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
public class `DOT11_SUPPORTED_PHY_TYPES` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11PHYType`: Array<`DOT11_PHY_TYPE`>,
)
// UNSUPPORTED Rust 3154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_PHY_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_SUPPORTED_POWER_LEVELS` (
    public var `uNumOfSupportedPowerLevels`: UInt,
    public var `uTxPowerLevelValues`: UIntArray,
)
// UNSUPPORTED Rust 3165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_SUPPORTED_POWER_LEVELS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_TEMP_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_TKIPMIC_FAILURE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `bDefaultKeyFailure`: Boolean,
    public var `uKeyIndex`: UInt,
    public var `PeerMac`: UByteArray,
)
// UNSUPPORTED Rust 3180:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_TKIPMIC_FAILURE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_TKIPMIC_FAILURE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_UPDATE_IE` (
    public var `dot11UpdateIEOp`: `DOT11_UPDATE_IE_OP`,
    public var `uBufferLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 3194:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_UPDATE_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_UPDATE_IE_OP` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_VENUEINFO` (
    public var `VenueGroup`: UByte,
    public var `VenueType`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_VWIFI_ATTRIBUTES` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uTotalNumOfEntries`: UInt,
    public var `Combinations`: Array<`DOT11_VWIFI_COMBINATION`>,
)
// UNSUPPORTED Rust 3214:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_VWIFI_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_VWIFI_ATTRIBUTES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_VWIFI_COMBINATION` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumInfrastructure`: UInt,
    public var `uNumAdhoc`: UInt,
    public var `uNumSoftAP`: UInt,
)
public const val `DOT11_VWIFI_COMBINATION_REVISION_1`: UInt = 1u;
public const val `DOT11_VWIFI_COMBINATION_REVISION_2`: UInt = 2u;
public const val `DOT11_VWIFI_COMBINATION_REVISION_3`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_VWIFI_COMBINATION_V2` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumInfrastructure`: UInt,
    public var `uNumAdhoc`: UInt,
    public var `uNumSoftAP`: UInt,
    public var `uNumVirtualStation`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_VWIFI_COMBINATION_V3` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumInfrastructure`: UInt,
    public var `uNumAdhoc`: UInt,
    public var `uNumSoftAP`: UInt,
    public var `uNumVirtualStation`: UInt,
    public var `uNumWFDGroup`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WEP_OFFLOAD` (
    public var `uReserved`: UInt,
    public var `hOffloadContext`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hOffload`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dot11OffloadType`: `DOT11_OFFLOAD_TYPE`,
    public var `dwAlgorithm`: UInt,
    public var `bRowIsOutbound`: Boolean,
    public var `bUseDefault`: Boolean,
    public var `uFlags`: UInt,
    public var `ucMacAddress`: UByteArray,
    public var `uNumOfRWsOnPeer`: UInt,
    public var `uNumOfRWsOnMe`: UInt,
    public var `dot11IV48Counters`: Array<`DOT11_IV48_COUNTER`>,
    public var `usDot11RWBitMaps`: UShortArray,
    public var `usKeyLength`: UShort,
    public var `ucKey`: UByteArray,
)
// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WEP_OFFLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WEP_UPLOAD` (
    public var `uReserved`: UInt,
    public var `dot11OffloadType`: `DOT11_OFFLOAD_TYPE`,
    public var `hOffload`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uNumOfRWsUsed`: UInt,
    public var `dot11IV48Counters`: Array<`DOT11_IV48_COUNTER`>,
    public var `usDot11RWBitMaps`: UShortArray,
)
// UNSUPPORTED Rust 3288:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WEP_UPLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_ADDITIONAL_IE` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uBeaconIEsOffset`: UInt,
    public var `uBeaconIEsLength`: UInt,
    public var `uProbeResponseIEsOffset`: UInt,
    public var `uProbeResponseIEsLength`: UInt,
    public var `uDefaultRequestIEsOffset`: UInt,
    public var `uDefaultRequestIEsLength`: UInt,
)
public const val `DOT11_WFD_ADDITIONAL_IE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR` (
    public var `AdvertisementID`: UInt,
    public var `ConfigMethods`: UShort,
    public var `ServiceNameLength`: UByte,
    public var `ServiceName`: UByteArray,
)
// UNSUPPORTED Rust 3314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR {
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
public class `DOT11_WFD_ADVERTISED_SERVICE_LIST` (
    public var `ServiceCount`: UShort,
    public var `AdvertisedService`: Array<`DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 3325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_ADVERTISED_SERVICE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_ADVERTISEMENT_ID` (
    public var `AdvertisementID`: UInt,
    public var `ServiceAddress`: UByteArray,
)
// UNSUPPORTED Rust 3336:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_ADVERTISEMENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_APS2_SERVICE_TYPE_MAX_LENGTH`: UInt = 21u;
public const val `DOT11_WFD_ASP2_INSTANCE_NAME_MAX_LENGTH`: UInt = 63u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_ATTRIBUTES` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumConcurrentGORole`: UInt,
    public var `uNumConcurrentClientRole`: UInt,
    public var `WPSVersionsSupported`: UInt,
    public var `bServiceDiscoverySupported`: Boolean,
    public var `bClientDiscoverabilitySupported`: Boolean,
    public var `bInfrastructureManagementSupported`: Boolean,
    public var `uMaxSecondaryDeviceTypeListSize`: UInt,
    public var `DeviceAddress`: UByteArray,
    public var `uInterfaceAddressListCount`: UInt,
    public var `pInterfaceAddressList`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `uNumSupportedCountryOrRegionStrings`: UInt,
    public var `pSupportedCountryOrRegionStrings`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `uDiscoveryFilterListSize`: UInt,
    public var `uGORoleClientTableSize`: UInt,
)
// UNSUPPORTED Rust 3363:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_WFD_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_ATTRIBUTES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_CHANNEL` (
    public var `CountryRegionString`: UByteArray,
    public var `OperatingClass`: UByte,
    public var `ChannelNumber`: UByte,
)
// UNSUPPORTED Rust 3377:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_CHANNEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_CONFIGURATION_TIMEOUT` (
    public var `GOTimeout`: UByte,
    public var `ClientTimeout`: UByte,
)
public const val `DOT11_WFD_DEVICE_AUTO_AVAILABILITY`: UInt = 16u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_CONCURRENT_OPERATION`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_DEVICE_CAPABILITY_CONFIG` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `bServiceDiscoveryEnabled`: Boolean,
    public var `bClientDiscoverabilityEnabled`: Boolean,
    public var `bConcurrentOperationSupported`: Boolean,
    public var `bInfrastructureManagementEnabled`: Boolean,
    public var `bDeviceLimitReached`: Boolean,
    public var `bInvitationProcedureEnabled`: Boolean,
    public var `WPSVersionsEnabled`: UInt,
)
public const val `DOT11_WFD_DEVICE_CAPABILITY_CONFIG_REVISION_1`: UInt = 1u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_CLIENT_DISCOVERABILITY`: UInt = 2u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_DEVICE_LIMIT`: UInt = 16u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_INFRASTRUCTURE_MANAGED`: UInt = 8u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_INVITATION_PROCEDURE`: UInt = 32u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_RESERVED_6`: UInt = 64u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_RESERVED_7`: UInt = 128u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_SERVICE_DISCOVERY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_DEVICE_ENTRY` (
    public var `uPhyId`: UInt,
    public var `PhySpecificInfo`: `DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO`,
    public var `dot11BSSID`: UByteArray,
    public var `dot11BSSType`: `DOT11_BSS_TYPE`,
    public var `TransmitterAddress`: UByteArray,
    public var `lRSSI`: Int,
    public var `uLinkQuality`: UInt,
    public var `usBeaconPeriod`: UShort,
    public var `ullTimestamp`: ULong,
    public var `ullBeaconHostTimestamp`: ULong,
    public var `ullProbeResponseHostTimestamp`: ULong,
    public var `usCapabilityInformation`: UShort,
    public var `uBeaconIEsOffset`: UInt,
    public var `uBeaconIEsLength`: UInt,
    public var `uProbeResponseIEsOffset`: UInt,
    public var `uProbeResponseIEsLength`: UInt,
)
// UNSUPPORTED Rust 3431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_DEVICE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_DEVICE_HIGH_AVAILABILITY`: UInt = 24u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_DEVICE_INFO` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `DeviceAddress`: UByteArray,
    public var `ConfigMethods`: UShort,
    public var `PrimaryDeviceType`: `DOT11_WFD_DEVICE_TYPE`,
    public var `DeviceName`: `DOT11_WPS_DEVICE_NAME`,
)
// UNSUPPORTED Rust 3447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_WFD_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_DEVICE_INFO_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_DEVICE_LISTEN_CHANNEL` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `ChannelNumber`: UByte,
)
public const val `DOT11_WFD_DEVICE_LISTEN_CHANNEL_REVISION_1`: UInt = 1u;
public const val `DOT11_WFD_DEVICE_NOT_DISCOVERABLE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_DEVICE_TYPE` (
    public var `CategoryID`: UShort,
    public var `SubCategoryID`: UShort,
    public var `OUI`: UByteArray,
)
// UNSUPPORTED Rust 3470:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_DEVICE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_DISCOVER_COMPLETE_MAX_LIST_SIZE`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_DISCOVER_COMPLETE_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `Status`: Int,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `uListOffset`: UInt,
    public var `uListLength`: UInt,
)
public const val `DOT11_WFD_DISCOVER_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_DISCOVER_DEVICE_FILTER` (
    public var `DeviceID`: UByteArray,
    public var `ucBitmask`: UByte,
    public var `GroupSSID`: `DOT11_SSID`,
)
// UNSUPPORTED Rust 3495:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_DISCOVER_DEVICE_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_DISCOVER_REQUEST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `DiscoverType`: `DOT11_WFD_DISCOVER_TYPE`,
    public var `ScanType`: `DOT11_WFD_SCAN_TYPE`,
    public var `uDiscoverTimeout`: UInt,
    public var `uDeviceFilterListOffset`: UInt,
    public var `uNumDeviceFilters`: UInt,
    public var `uIEsOffset`: UInt,
    public var `uIEsLength`: UInt,
    public var `bForceScanLegacyNetworks`: Boolean,
)
public const val `DOT11_WFD_DISCOVER_REQUEST_REVISION_1`: UInt = 1u;
public typealias `DOT11_WFD_DISCOVER_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_GO_INTENT` (
    public var `_bitfield`: UByte,
)
public const val `DOT11_WFD_GROUP_CAPABILITY_CROSS_CONNECTION_SUPPORTED`: UInt = 16u;
public const val `DOT11_WFD_GROUP_CAPABILITY_EAPOL_KEY_IP_ADDRESS_ALLOCATION_SUPPORTED`: UInt = 128u;
public const val `DOT11_WFD_GROUP_CAPABILITY_GROUP_LIMIT_REACHED`: UInt = 4u;
public const val `DOT11_WFD_GROUP_CAPABILITY_GROUP_OWNER`: UInt = 1u;
public const val `DOT11_WFD_GROUP_CAPABILITY_INTRABSS_DISTRIBUTION_SUPPORTED`: UInt = 8u;
public const val `DOT11_WFD_GROUP_CAPABILITY_IN_GROUP_FORMATION`: UInt = 64u;
public const val `DOT11_WFD_GROUP_CAPABILITY_NONE`: UInt = 0u;
public const val `DOT11_WFD_GROUP_CAPABILITY_PERSISTENT_GROUP`: UInt = 2u;
public const val `DOT11_WFD_GROUP_CAPABILITY_PERSISTENT_RECONNECT_SUPPORTED`: UInt = 32u;
public const val `DOT11_WFD_GROUP_CAPABILITY_RESERVED_7`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_GROUP_ID` (
    public var `DeviceAddress`: UByteArray,
    public var `SSID`: `DOT11_SSID`,
)
// UNSUPPORTED Rust 3537:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_GROUP_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_GROUP_JOIN_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `GOOperatingChannel`: `DOT11_WFD_CHANNEL`,
    public var `GOConfigTime`: UInt,
    public var `bInGroupFormation`: Boolean,
    public var `bWaitForWPSReady`: Boolean,
)
public const val `DOT11_WFD_GROUP_JOIN_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `bPersistentGroupEnabled`: Boolean,
    public var `bIntraBSSDistributionSupported`: Boolean,
    public var `bCrossConnectionSupported`: Boolean,
    public var `bPersistentReconnectSupported`: Boolean,
    public var `bGroupFormationEnabled`: Boolean,
    public var `uMaximumGroupLimit`: UInt,
)
public const val `DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_REVISION_1`: UInt = 1u;
public const val `DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_REVISION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_V2` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `bPersistentGroupEnabled`: Boolean,
    public var `bIntraBSSDistributionSupported`: Boolean,
    public var `bCrossConnectionSupported`: Boolean,
    public var `bPersistentReconnectSupported`: Boolean,
    public var `bGroupFormationEnabled`: Boolean,
    public var `uMaximumGroupLimit`: UInt,
    public var `bEapolKeyIpAddressAllocationSupported`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_GROUP_START_PARAMETERS` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `AdvertisedOperatingChannel`: `DOT11_WFD_CHANNEL`,
)
public const val `DOT11_WFD_GROUP_START_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WFD_INVITATION_FLAGS` (
    public var `_bitfield`: UByte,
)
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_FROM_WLAN_CROSS_CONNECTION_POLICY`: UInt = 1u;
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_INFRASTRUCTURE_MANAGED_POLICY`: UInt = 4u;
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_NOT_MANAGED_INFRASTRUCTURE_CAPABLE`: UInt = 2u;
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_WFD_COEXISTENCE_POLICY`: UInt = 3u;
public const val `DOT11_WFD_MINOR_REASON_SUCCESS`: UInt = 0u;
public typealias `DOT11_WFD_SCAN_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST` (
    public var `Header`: `super`.`Ndis`.`NDIS_OBJECT_HEADER`,
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `SecondaryDeviceTypes`: Array<`DOT11_WFD_DEVICE_TYPE`>,
)
// UNSUPPORTED Rust 3608:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_SERVICE_HASH_LIST` (
    public var `ServiceHashCount`: UShort,
    public var `ServiceHash`: UByteArray,
)
// UNSUPPORTED Rust 3621:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_SERVICE_HASH_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_SERVICE_INFORMATION_MAX_LENGTH`: UInt = 65535u;
public const val `DOT11_WFD_SERVICE_NAME_MAX_LENGTH`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_SESSION_ID` (
    public var `SessionID`: UInt,
    public var `SessionAddress`: UByteArray,
)
// UNSUPPORTED Rust 3634:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_SESSION_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 144 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WFD_SESSION_INFO` (
    public var `uSessionInfoLength`: UShort,
    public var `ucSessionInfo`: UByteArray,
)
// UNSUPPORTED Rust 3645:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WFD_SESSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_SESSION_INFO_MAX_LENGTH`: UInt = 144u;
public const val `DOT11_WFD_STATUS_FAILED_INCOMPATIBLE_PARAMETERS`: UInt = 2u;
public const val `DOT11_WFD_STATUS_FAILED_INCOMPATIBLE_PROVISIONING_METHOD`: UInt = 10u;
public const val `DOT11_WFD_STATUS_FAILED_INFORMATION_IS_UNAVAILABLE`: UInt = 1u;
public const val `DOT11_WFD_STATUS_FAILED_INVALID_PARAMETERS`: UInt = 4u;
public const val `DOT11_WFD_STATUS_FAILED_LIMIT_REACHED`: UInt = 3u;
public const val `DOT11_WFD_STATUS_FAILED_MATCHING_MAX_INTENT`: UInt = 9u;
public const val `DOT11_WFD_STATUS_FAILED_NO_COMMON_CHANNELS`: UInt = 7u;
public const val `DOT11_WFD_STATUS_FAILED_PREVIOUS_PROTOCOL_ERROR`: UInt = 6u;
public const val `DOT11_WFD_STATUS_FAILED_REJECTED_BY_USER`: UInt = 11u;
public const val `DOT11_WFD_STATUS_FAILED_UNABLE_TO_ACCOMODATE_REQUEST`: UInt = 5u;
public const val `DOT11_WFD_STATUS_FAILED_UNKNOWN_WFD_GROUP`: UInt = 8u;
public const val `DOT11_WFD_STATUS_SUCCESS`: UInt = 0u;
public const val `DOT11_WFD_STATUS_SUCCESS_ACCEPTED_BY_USER`: UInt = 12u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DOT11_WME_AC_PARAMETERS` (
    public var `ucAccessCategoryIndex`: UByte,
    public var `ucAIFSN`: UByte,
    public var `ucECWmin`: UByte,
    public var `ucECWmax`: UByte,
    public var `usTXOPLimit`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WME_AC_PARAMETERS_LIST` (
    public var `uNumOfEntries`: UInt,
    public var `uTotalNumOfEntries`: UInt,
    public var `dot11WMEACParameters`: Array<`DOT11_WME_AC_PARAMETERS`>,
)
// UNSUPPORTED Rust 3680:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WME_AC_PARAMETERS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WME_PACKET`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WME_UPDATE_IE` (
    public var `uParamElemMinBeaconIntervals`: UInt,
    public var `uWMEInfoElemOffset`: UInt,
    public var `uWMEInfoElemLength`: UInt,
    public var `uWMEParamElemOffset`: UInt,
    public var `uWMEParamElemLength`: UInt,
    public var `ucBuffer`: UByteArray,
)
// UNSUPPORTED Rust 3696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WME_UPDATE_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WPA_TSC` (
    public var `uReserved`: UInt,
    public var `dot11OffloadType`: `DOT11_OFFLOAD_TYPE`,
    public var `hOffload`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dot11IV48Counter`: `DOT11_IV48_COUNTER`,
)
// UNSUPPORTED Rust 3709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WPA_TSC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_WPS_CONFIG_METHOD` = Int;
public const val `DOT11_WPS_CONFIG_METHOD_DISPLAY`: `DOT11_WPS_CONFIG_METHOD` = 8;
public const val `DOT11_WPS_CONFIG_METHOD_KEYPAD`: `DOT11_WPS_CONFIG_METHOD` = 256;
public const val `DOT11_WPS_CONFIG_METHOD_NFC_INTERFACE`: `DOT11_WPS_CONFIG_METHOD` = 64;
public const val `DOT11_WPS_CONFIG_METHOD_NFC_TAG`: `DOT11_WPS_CONFIG_METHOD` = 32;
public const val `DOT11_WPS_CONFIG_METHOD_NULL`: `DOT11_WPS_CONFIG_METHOD` = 0;
public const val `DOT11_WPS_CONFIG_METHOD_PUSHBUTTON`: `DOT11_WPS_CONFIG_METHOD` = 128;
public const val `DOT11_WPS_CONFIG_METHOD_WFDS_DEFAULT`: `DOT11_WPS_CONFIG_METHOD` = 4096;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOT11_WPS_DEVICE_NAME` (
    public var `uDeviceNameLength`: UInt,
    public var `ucDeviceName`: UByteArray,
)
// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DOT11_WPS_DEVICE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WPS_DEVICE_NAME_MAX_LENGTH`: UInt = 32u;
public typealias `DOT11_WPS_DEVICE_PASSWORD_ID` = Int;
public const val `DOT11_WPS_MAX_MODEL_NAME_LENGTH`: UInt = 32u;
public const val `DOT11_WPS_MAX_MODEL_NUMBER_LENGTH`: UInt = 32u;
public const val `DOT11_WPS_MAX_PASSKEY_LENGTH`: UInt = 8u;
public const val `DOT11_WPS_PASSWORD_ID_DEFAULT`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 0;
public const val `DOT11_WPS_PASSWORD_ID_MACHINE_SPECIFIED`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 2;
public const val `DOT11_WPS_PASSWORD_ID_NFC_CONNECTION_HANDOVER`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 7;
public const val `DOT11_WPS_PASSWORD_ID_OOB_RANGE_MAX`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 65535;
public const val `DOT11_WPS_PASSWORD_ID_OOB_RANGE_MIN`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 16;
public const val `DOT11_WPS_PASSWORD_ID_PUSHBUTTON`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 4;
public const val `DOT11_WPS_PASSWORD_ID_REGISTRAR_SPECIFIED`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 5;
public const val `DOT11_WPS_PASSWORD_ID_REKEY`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 3;
public const val `DOT11_WPS_PASSWORD_ID_USER_SPECIFIED`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 1;
public const val `DOT11_WPS_PASSWORD_ID_WFD_SERVICES`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 8;
public const val `DOT11_WPS_VERSION_1_0`: UInt = 1u;
public const val `DOT11_WPS_VERSION_2_0`: UInt = 2u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_Enhanced`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 4u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_NoP2PSupported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 2u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_NotSupported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 0u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_SingleFunctionSupported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 1u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_Supported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 3u;
public const val `DevProp_PciDevice_AcsSupport_Missing`: `DEVPROP_PCIDEVICE_ACSSUPPORT` = 2u;
public const val `DevProp_PciDevice_AcsSupport_NotNeeded`: `DEVPROP_PCIDEVICE_ACSSUPPORT` = 1u;
public const val `DevProp_PciDevice_AcsSupport_Present`: `DEVPROP_PCIDEVICE_ACSSUPPORT` = 0u;
public const val `DevProp_PciDevice_BridgeType_PciConventional`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 6u;
public const val `DevProp_PciDevice_BridgeType_PciExpressDownstreamSwitchPort`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 10u;
public const val `DevProp_PciDevice_BridgeType_PciExpressEventCollector`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 14u;
public const val `DevProp_PciDevice_BridgeType_PciExpressRootPort`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 8u;
public const val `DevProp_PciDevice_BridgeType_PciExpressToPciXBridge`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 11u;
public const val `DevProp_PciDevice_BridgeType_PciExpressTreatedAsPci`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 13u;
public const val `DevProp_PciDevice_BridgeType_PciExpressUpstreamSwitchPort`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 9u;
public const val `DevProp_PciDevice_BridgeType_PciX`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 7u;
public const val `DevProp_PciDevice_BridgeType_PciXToExpressBridge`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 12u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_100Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 2u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_133MHZ`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 3u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_66Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 1u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_ECC_100Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 6u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_ECC_133Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 7u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_ECC_66Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 5u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_266_100MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 10u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_266_133MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 11u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_266_66MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 9u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_533_100MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 14u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_533_133MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 15u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_533_66MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 13u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode_Conventional_Pci`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 0u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_Pci_Conventional_33MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 0u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_Pci_Conventional_66MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 1u;
public const val `DevProp_PciDevice_DeviceType_PciConventional`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 0u;
public const val `DevProp_PciDevice_DeviceType_PciExpressEndpoint`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 2u;
public const val `DevProp_PciDevice_DeviceType_PciExpressLegacyEndpoint`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 3u;
public const val `DevProp_PciDevice_DeviceType_PciExpressRootComplexIntegratedEndpoint`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 4u;
public const val `DevProp_PciDevice_DeviceType_PciExpressTreatedAsPci`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 5u;
public const val `DevProp_PciDevice_DeviceType_PciX`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 1u;
public const val `DevProp_PciDevice_InterruptType_LineBased`: `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = 1u;
public const val `DevProp_PciDevice_InterruptType_Msi`: `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = 2u;
public const val `DevProp_PciDevice_InterruptType_MsiX`: `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = 4u;
public const val `DevProp_PciDevice_SriovSupport_DidntGetVfBarSpace`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 4u;
public const val `DevProp_PciDevice_SriovSupport_MissingAcs`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 1u;
public const val `DevProp_PciDevice_SriovSupport_MissingPfDriver`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 2u;
public const val `DevProp_PciDevice_SriovSupport_NoBusResource`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 3u;
public const val `DevProp_PciDevice_SriovSupport_Ok`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 0u;
public const val `DevProp_PciExpressDevice_LinkSpeed_Five_Gbps`: `DEVPROP_PCIEXPRESSDEVICE_LINKSPEED` = 2u;
public const val `DevProp_PciExpressDevice_LinkSpeed_TwoAndHalf_Gbps`: `DEVPROP_PCIEXPRESSDEVICE_LINKSPEED` = 1u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_1`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 1u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_12`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 12u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_16`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 16u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_2`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 2u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_32`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 32u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_4`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 4u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_8`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 8u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_1024Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 3u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_128Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 0u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_2048Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 4u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_256Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 1u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_4096Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 5u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_512Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 2u;
public const val `DevProp_PciExpressDevice_Spec_Version_10`: `DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION` = 1u;
public const val `DevProp_PciExpressDevice_Spec_Version_11`: `DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION` = 2u;
public const val `DevProp_PciRootBus_BusWidth_32Bits`: `DEVPROP_PCIROOTBUS_BUSWIDTH` = 0u;
public const val `DevProp_PciRootBus_BusWidth_64Bits`: `DEVPROP_PCIROOTBUS_BUSWIDTH` = 1u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_Conventional_33Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 0u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_Conventional_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 1u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_266_Mode2_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 9u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_266_Mode2_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 10u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_266_Mode2_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 8u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_533_Mode2_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 12u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_533_Mode2_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 13u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_533_Mode2_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 11u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 3u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 4u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 2u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_ECC_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 6u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_ECC_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 7u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_ECC_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 5u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciConventional`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 0u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciExpress`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 3u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciXMode1`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 1u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciXMode2`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 2u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_Conventional_33Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 1u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_Conventional_66Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 2u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_133Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 8u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_266Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 16u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_533Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 32u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_66Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 4u;
// UNSUPPORTED Rust 3839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Dot11AdHocManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd06a84f_83bd_4d01_8ab9_2389fea0869e);

// UNSUPPORTED Rust 3840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_AEPSERVICE_WIFIDIRECT_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc29827c_9caf_4928_99a9_18f7c2381389);

// UNSUPPORTED Rust 3841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_ASP_INFRA_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff823995_7a72_4c80_8757_c67ee13d1a49);

// UNSUPPORTED Rust 3842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_WIFIDIRECT_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x439b20af_8955_405b_99f0_a62af0c68d43);

// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `IHV_INIT_FUNCTION_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Dot11ExtIhvInitService");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `IHV_INIT_VS_FUNCTION_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Dot11ExtIhvInitVirtualStation");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `IHV_VERSION_FUNCTION_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Dot11ExtIhvGetVersionInfo");
public const val `IndicationTypeLinkQuality`: `DOT11EXT_IHV_INDICATION_TYPE` = 4;
public const val `IndicationTypeNicSpecificNotification`: `DOT11EXT_IHV_INDICATION_TYPE` = 0;
public const val `IndicationTypePhyStateChange`: `DOT11EXT_IHV_INDICATION_TYPE` = 3;
public const val `IndicationTypePmkidCandidateList`: `DOT11EXT_IHV_INDICATION_TYPE` = 1;
public const val `IndicationTypeTkipMicFailure`: `DOT11EXT_IHV_INDICATION_TYPE` = 2;
public const val `L2_NOTIFICATION_CODE_GROUP_SIZE`: UInt = 4096u;
public const val `L2_NOTIFICATION_CODE_PUBLIC_BEGIN`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `L2_NOTIFICATION_DATA` (
    public var `NotificationSource`: `WLAN_NOTIFICATION_SOURCES`,
    public var `NotificationCode`: UInt,
    public var `InterfaceGuid`: `windows_sys`.`core`.`GUID`,
    public var `dwDataSize`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3862:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for L2_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `L2_NOTIFICATION_SOURCE_ALL`: UInt = 65535u;
public const val `L2_NOTIFICATION_SOURCE_DOT3_AUTO_CONFIG`: UInt = 1u;
public const val `L2_NOTIFICATION_SOURCE_NONE`: UInt = 0u;
public const val `L2_NOTIFICATION_SOURCE_ONEX`: UInt = 4u;
public const val `L2_NOTIFICATION_SOURCE_SECURITY`: UInt = 2u;
public const val `L2_NOTIFICATION_SOURCE_WCM`: UInt = 256u;
public const val `L2_NOTIFICATION_SOURCE_WCM_CSP`: UInt = 512u;
public const val `L2_NOTIFICATION_SOURCE_WFD`: UInt = 1024u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_ACM`: UInt = 8u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_DEVICE_SERVICE`: UInt = 2048u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_HNWK`: UInt = 128u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_IHV`: UInt = 64u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_MSM`: UInt = 16u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_SECURITY`: UInt = 32u;
public const val `L2_PROFILE_MAX_NAME_LENGTH`: UInt = 256u;
public const val `L2_REASON_CODE_DOT11_AC_BASE`: UInt = 131072u;
public const val `L2_REASON_CODE_DOT11_MSM_BASE`: UInt = 196608u;
public const val `L2_REASON_CODE_DOT11_SECURITY_BASE`: UInt = 262144u;
public const val `L2_REASON_CODE_DOT3_AC_BASE`: UInt = 393216u;
public const val `L2_REASON_CODE_DOT3_MSM_BASE`: UInt = 458752u;
public const val `L2_REASON_CODE_GEN_BASE`: UInt = 65536u;
public const val `L2_REASON_CODE_GROUP_SIZE`: UInt = 65536u;
public const val `L2_REASON_CODE_IHV_BASE`: UInt = 589824u;
public const val `L2_REASON_CODE_ONEX_BASE`: UInt = 327680u;
public const val `L2_REASON_CODE_PROFILE_BASE`: UInt = 524288u;
public const val `L2_REASON_CODE_PROFILE_MISSING`: UInt = 1u;
public const val `L2_REASON_CODE_RESERVED_BASE`: UInt = 720896u;
public const val `L2_REASON_CODE_SUCCESS`: UInt = 0u;
public const val `L2_REASON_CODE_UNKNOWN`: UInt = 65537u;
public const val `L2_REASON_CODE_WIMAX_BASE`: UInt = 655360u;
public const val `MAX_NUM_SUPPORTED_RATES`: UInt = 8u;
public const val `MAX_NUM_SUPPORTED_RATES_V2`: UInt = 255u;
public const val `MS_MAX_PROFILE_NAME_LENGTH`: UInt = 256u;
public const val `MS_PROFILE_GROUP_POLICY`: UInt = 1u;
public const val `MS_PROFILE_USER`: UInt = 2u;
public const val `NDIS_PACKET_TYPE_802_11_ALL_MULTICAST_DATA`: UInt = 4u;
public const val `NDIS_PACKET_TYPE_802_11_BROADCAST_DATA`: UInt = 8u;
public const val `NDIS_PACKET_TYPE_802_11_DIRECTED_DATA`: UInt = 1u;
public const val `NDIS_PACKET_TYPE_802_11_MULTICAST_DATA`: UInt = 2u;
public const val `NDIS_PACKET_TYPE_802_11_PROMISCUOUS_DATA`: UInt = 32u;
public const val `OID_DOT11_AP_JOIN_REQUEST`: UInt = 218170205u;
public const val `OID_DOT11_ATIM_WINDOW`: UInt = 218170122u;
public const val `OID_DOT11_BEACON_PERIOD`: UInt = 218170139u;
public const val `OID_DOT11_CCA_MODE_SUPPORTED`: UInt = 218170166u;
public const val `OID_DOT11_CCA_WATCHDOG_COUNT_MAX`: UInt = 218170170u;
public const val `OID_DOT11_CCA_WATCHDOG_COUNT_MIN`: UInt = 218170172u;
public const val `OID_DOT11_CCA_WATCHDOG_TIMER_MAX`: UInt = 218170169u;
public const val `OID_DOT11_CCA_WATCHDOG_TIMER_MIN`: UInt = 218170171u;
public const val `OID_DOT11_CFP_MAX_DURATION`: UInt = 218170136u;
public const val `OID_DOT11_CFP_PERIOD`: UInt = 218170135u;
public const val `OID_DOT11_CF_POLLABLE`: UInt = 218170134u;
public const val `OID_DOT11_CHANNEL_AGILITY_ENABLED`: UInt = 218170184u;
public const val `OID_DOT11_CHANNEL_AGILITY_PRESENT`: UInt = 218170183u;
public const val `OID_DOT11_COUNTERS_ENTRY`: UInt = 218170149u;
public const val `OID_DOT11_COUNTRY_STRING`: UInt = 218170188u;
public const val `OID_DOT11_CURRENT_ADDRESS`: UInt = 218171138u;
public const val `OID_DOT11_CURRENT_CCA_MODE`: UInt = 218170167u;
public const val `OID_DOT11_CURRENT_CHANNEL`: UInt = 218170165u;
public const val `OID_DOT11_CURRENT_CHANNEL_NUMBER`: UInt = 218170159u;
public const val `OID_DOT11_CURRENT_DWELL_TIME`: UInt = 218170161u;
public const val `OID_DOT11_CURRENT_FREQUENCY`: UInt = 218170178u;
public const val `OID_DOT11_CURRENT_INDEX`: UInt = 218170164u;
public const val `OID_DOT11_CURRENT_OFFLOAD_CAPABILITY`: UInt = 218170113u;
public const val `OID_DOT11_CURRENT_OPERATION_MODE`: UInt = 218170120u;
public const val `OID_DOT11_CURRENT_OPTIONAL_CAPABILITY`: UInt = 218170131u;
public const val `OID_DOT11_CURRENT_PACKET_FILTER`: UInt = 218170121u;
public const val `OID_DOT11_CURRENT_PATTERN`: UInt = 218170163u;
public const val `OID_DOT11_CURRENT_PHY_TYPE`: UInt = 218170124u;
public const val `OID_DOT11_CURRENT_REG_DOMAIN`: UInt = 218170151u;
public const val `OID_DOT11_CURRENT_RX_ANTENNA`: UInt = 218170155u;
public const val `OID_DOT11_CURRENT_SET`: UInt = 218170162u;
public const val `OID_DOT11_CURRENT_TX_ANTENNA`: UInt = 218170153u;
public const val `OID_DOT11_CURRENT_TX_POWER_LEVEL`: UInt = 218170157u;
public const val `OID_DOT11_DEFAULT_WEP_OFFLOAD`: UInt = 218170116u;
public const val `OID_DOT11_DEFAULT_WEP_UPLOAD`: UInt = 218170117u;
public const val `OID_DOT11_DIVERSITY_SELECTION_RX`: UInt = 218170176u;
public const val `OID_DOT11_DIVERSITY_SUPPORT`: UInt = 218170154u;
public const val `OID_DOT11_DSSS_OFDM_OPTION_ENABLED`: UInt = 218170209u;
public const val `OID_DOT11_DSSS_OFDM_OPTION_IMPLEMENTED`: UInt = 218170208u;
public const val `OID_DOT11_DTIM_PERIOD`: UInt = 218170140u;
public const val `OID_DOT11_ED_THRESHOLD`: UInt = 218170168u;
public const val `OID_DOT11_EHCC_CAPABILITY_ENABLED`: UInt = 218170193u;
public const val `OID_DOT11_EHCC_CAPABILITY_IMPLEMENTED`: UInt = 218170192u;
public const val `OID_DOT11_EHCC_NUMBER_OF_CHANNELS_FAMILY_INDEX`: UInt = 218170191u;
public const val `OID_DOT11_EHCC_PRIME_RADIX`: UInt = 218170190u;
public const val `OID_DOT11_ERP_PBCC_OPTION_ENABLED`: UInt = 218170207u;
public const val `OID_DOT11_ERP_PBCC_OPTION_IMPLEMENTED`: UInt = 218170206u;
public const val `OID_DOT11_FRAGMENTATION_THRESHOLD`: UInt = 218170146u;
public const val `OID_DOT11_FREQUENCY_BANDS_SUPPORTED`: UInt = 218170180u;
public const val `OID_DOT11_HOPPING_PATTERN`: UInt = 218170199u;
public const val `OID_DOT11_HOP_ALGORITHM_ADOPTED`: UInt = 218170194u;
public const val `OID_DOT11_HOP_MODULUS`: UInt = 218170197u;
public const val `OID_DOT11_HOP_OFFSET`: UInt = 218170198u;
public const val `OID_DOT11_HOP_TIME`: UInt = 218170158u;
public const val `OID_DOT11_HR_CCA_MODE_SUPPORTED`: UInt = 218170185u;
public const val `OID_DOT11_JOIN_REQUEST`: UInt = 218170125u;
public const val `OID_DOT11_LONG_RETRY_LIMIT`: UInt = 218170145u;
public const val `OID_DOT11_MAC_ADDRESS`: UInt = 218170142u;
public const val `OID_DOT11_MAXIMUM_LIST_SIZE`: UInt = 218171141u;
public const val `OID_DOT11_MAX_DWELL_TIME`: UInt = 218170160u;
public const val `OID_DOT11_MAX_MAC_ADDRESS_STATES`: UInt = 218170212u;
public const val `OID_DOT11_MAX_RECEIVE_LIFETIME`: UInt = 218170148u;
public const val `OID_DOT11_MAX_TRANSMIT_MSDU_LIFETIME`: UInt = 218170147u;
public const val `OID_DOT11_MEDIUM_OCCUPANCY_LIMIT`: UInt = 218170133u;
public const val `OID_DOT11_MPDU_MAX_LENGTH`: UInt = 218170118u;
public const val `OID_DOT11_MULTICAST_LIST`: UInt = 218171140u;
public const val `OID_DOT11_MULTI_DOMAIN_CAPABILITY`: UInt = 218170189u;
public const val `OID_DOT11_MULTI_DOMAIN_CAPABILITY_ENABLED`: UInt = 218170187u;
public const val `OID_DOT11_MULTI_DOMAIN_CAPABILITY_IMPLEMENTED`: UInt = 218170186u;
public const val `OID_DOT11_NDIS_START`: UInt = 218170112u;
public const val `OID_DOT11_NIC_POWER_STATE`: UInt = 218170129u;
public const val `OID_DOT11_NIC_SPECIFIC_EXTENSION`: UInt = 218170204u;
public const val `OID_DOT11_NUMBER_OF_HOPPING_SETS`: UInt = 218170196u;
public const val `OID_DOT11_OFFLOAD_CAPABILITY`: UInt = 218170112u;
public const val `OID_DOT11_OPERATIONAL_RATE_SET`: UInt = 218170138u;
public const val `OID_DOT11_OPERATION_MODE_CAPABILITY`: UInt = 218170119u;
public const val `OID_DOT11_OPTIONAL_CAPABILITY`: UInt = 218170130u;
public const val `OID_DOT11_PBCC_OPTION_IMPLEMENTED`: UInt = 218170182u;
public const val `OID_DOT11_PERMANENT_ADDRESS`: UInt = 218171139u;
public const val `OID_DOT11_POWER_MGMT_MODE`: UInt = 218170137u;
public const val `OID_DOT11_PRIVATE_OIDS_START`: UInt = 218171136u;
public const val `OID_DOT11_QOS_TX_DURATION`: UInt = 218170219u;
public const val `OID_DOT11_QOS_TX_MEDIUM_TIME`: UInt = 218170220u;
public const val `OID_DOT11_QOS_TX_QUEUES_SUPPORTED`: UInt = 218170218u;
public const val `OID_DOT11_RANDOM_TABLE_FIELD_NUMBER`: UInt = 218170200u;
public const val `OID_DOT11_RANDOM_TABLE_FLAG`: UInt = 218170195u;
public const val `OID_DOT11_RECV_SENSITIVITY_LIST`: UInt = 218170213u;
public const val `OID_DOT11_REG_DOMAINS_SUPPORT_VALUE`: UInt = 218170173u;
public const val `OID_DOT11_RESET_REQUEST`: UInt = 218170128u;
public const val `OID_DOT11_RF_USAGE`: UInt = 218170203u;
public const val `OID_DOT11_RSSI_RANGE`: UInt = 218170202u;
public const val `OID_DOT11_RTS_THRESHOLD`: UInt = 218170143u;
public const val `OID_DOT11_SCAN_REQUEST`: UInt = 218170123u;
public const val `OID_DOT11_SHORT_PREAMBLE_OPTION_IMPLEMENTED`: UInt = 218170181u;
public const val `OID_DOT11_SHORT_RETRY_LIMIT`: UInt = 218170144u;
public const val `OID_DOT11_SHORT_SLOT_TIME_OPTION_ENABLED`: UInt = 218170211u;
public const val `OID_DOT11_SHORT_SLOT_TIME_OPTION_IMPLEMENTED`: UInt = 218170210u;
public const val `OID_DOT11_START_REQUEST`: UInt = 218170126u;
public const val `OID_DOT11_STATION_ID`: UInt = 218170132u;
public const val `OID_DOT11_SUPPORTED_DATA_RATES_VALUE`: UInt = 218170177u;
public const val `OID_DOT11_SUPPORTED_DSSS_CHANNEL_LIST`: UInt = 218170222u;
public const val `OID_DOT11_SUPPORTED_OFDM_FREQUENCY_LIST`: UInt = 218170221u;
public const val `OID_DOT11_SUPPORTED_PHY_TYPES`: UInt = 218170150u;
public const val `OID_DOT11_SUPPORTED_POWER_LEVELS`: UInt = 218170156u;
public const val `OID_DOT11_SUPPORTED_RX_ANTENNA`: UInt = 218170175u;
public const val `OID_DOT11_SUPPORTED_TX_ANTENNA`: UInt = 218170174u;
public const val `OID_DOT11_TEMP_TYPE`: UInt = 218170152u;
public const val `OID_DOT11_TI_THRESHOLD`: UInt = 218170179u;
public const val `OID_DOT11_UPDATE_IE`: UInt = 218170127u;
public const val `OID_DOT11_WEP_ICV_ERROR_COUNT`: UInt = 218170141u;
public const val `OID_DOT11_WEP_OFFLOAD`: UInt = 218170114u;
public const val `OID_DOT11_WEP_UPLOAD`: UInt = 218170115u;
public const val `OID_DOT11_WME_AC_PARAMETERS`: UInt = 218170216u;
public const val `OID_DOT11_WME_ENABLED`: UInt = 218170215u;
public const val `OID_DOT11_WME_IMPLEMENTED`: UInt = 218170214u;
public const val `OID_DOT11_WME_UPDATE_IE`: UInt = 218170217u;
public const val `OID_DOT11_WPA_TSC`: UInt = 218170201u;
public const val `ONEX_AUTHENTICATOR_NO_LONGER_PRESENT`: `ONEX_REASON_CODE` = 327686;
public typealias `ONEX_AUTH_IDENTITY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ONEX_AUTH_PARAMS` (
    public var `fUpdatePending`: `windows_sys`.`core`.`BOOL`,
    public var `oneXConnProfile`: `ONEX_VARIABLE_BLOB`,
    public var `authIdentity`: `ONEX_AUTH_IDENTITY`,
    public var `dwQuarantineState`: UInt,
    public var `_bitfield`: UInt,
    public var `dwSessionId`: UInt,
    public var `hUserToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `OneXUserProfile`: `ONEX_VARIABLE_BLOB`,
    public var `Identity`: `ONEX_VARIABLE_BLOB`,
    public var `UserName`: `ONEX_VARIABLE_BLOB`,
    public var `Domain`: `ONEX_VARIABLE_BLOB`,
)
// UNSUPPORTED Rust 4041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ONEX_AUTH_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ONEX_AUTH_RESTART_REASON` = Int;
public typealias `ONEX_AUTH_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ONEX_EAP_ERROR` (
    public var `dwWinError`: UInt,
    public var `type`: `super`.`super`.`Security`.`ExtensibleAuthenticationProtocol`.`EAP_METHOD_TYPE`,
    public var `dwReasonCode`: UInt,
    public var `rootCauseGuid`: `windows_sys`.`core`.`GUID`,
    public var `repairGuid`: `windows_sys`.`core`.`GUID`,
    public var `helpLinkGuid`: `windows_sys`.`core`.`GUID`,
    public var `_bitfield`: UInt,
    public var `RootCauseString`: `ONEX_VARIABLE_BLOB`,
    public var `RepairString`: `ONEX_VARIABLE_BLOB`,
)
public const val `ONEX_EAP_FAILURE_RECEIVED`: `ONEX_REASON_CODE` = 327685;
public typealias `ONEX_EAP_METHOD_BACKEND_SUPPORT` = Int;
public const val `ONEX_IDENTITY_NOT_FOUND`: `ONEX_REASON_CODE` = 327682;
public typealias `ONEX_NOTIFICATION_TYPE` = Int;
public const val `ONEX_NO_RESPONSE_TO_IDENTITY`: `ONEX_REASON_CODE` = 327687;
public const val `ONEX_PROFILE_DISALLOWED_EAP_TYPE`: `ONEX_REASON_CODE` = 327690;
public const val `ONEX_PROFILE_EXPIRED_EXPLICIT_CREDENTIALS`: `ONEX_REASON_CODE` = 327699;
public const val `ONEX_PROFILE_INVALID_AUTH_MODE`: `ONEX_REASON_CODE` = 327695;
public const val `ONEX_PROFILE_INVALID_EAP_CONNECTION_PROPERTIES`: `ONEX_REASON_CODE` = 327696;
public const val `ONEX_PROFILE_INVALID_EAP_TYPE_OR_FLAG`: `ONEX_REASON_CODE` = 327691;
public const val `ONEX_PROFILE_INVALID_EXPLICIT_CREDENTIALS`: `ONEX_REASON_CODE` = 327698;
public const val `ONEX_PROFILE_INVALID_LENGTH`: `ONEX_REASON_CODE` = 327689;
public const val `ONEX_PROFILE_INVALID_ONEX_FLAGS`: `ONEX_REASON_CODE` = 327692;
public const val `ONEX_PROFILE_INVALID_SUPPLICANT_MODE`: `ONEX_REASON_CODE` = 327694;
public const val `ONEX_PROFILE_INVALID_TIMER_VALUE`: `ONEX_REASON_CODE` = 327693;
public const val `ONEX_PROFILE_VERSION_NOT_SUPPORTED`: `ONEX_REASON_CODE` = 327688;
public typealias `ONEX_REASON_CODE` = Int;
public const val `ONEX_REASON_CODE_SUCCESS`: `ONEX_REASON_CODE` = 0;
public const val `ONEX_REASON_START`: `ONEX_REASON_CODE` = 327680;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ONEX_RESULT_UPDATE_DATA` (
    public var `oneXStatus`: `ONEX_STATUS`,
    public var `BackendSupport`: `ONEX_EAP_METHOD_BACKEND_SUPPORT`,
    public var `fBackendEngaged`: `windows_sys`.`core`.`BOOL`,
    public var `_bitfield`: UInt,
    public var `authParams`: `ONEX_VARIABLE_BLOB`,
    public var `eapError`: `ONEX_VARIABLE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ONEX_STATUS` (
    public var `authStatus`: `ONEX_AUTH_STATUS`,
    public var `dwReason`: UInt,
    public var `dwError`: UInt,
)
public const val `ONEX_UI_CANCELLED`: `ONEX_REASON_CODE` = 327697;
public const val `ONEX_UI_DISABLED`: `ONEX_REASON_CODE` = 327683;
public const val `ONEX_UI_FAILURE`: `ONEX_REASON_CODE` = 327684;
public const val `ONEX_UI_NOT_PERMITTED`: `ONEX_REASON_CODE` = 327700;
public const val `ONEX_UNABLE_TO_IDENTIFY_USER`: `ONEX_REASON_CODE` = 327681;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ONEX_USER_INFO` (
    public var `authIdentity`: `ONEX_AUTH_IDENTITY`,
    public var `_bitfield`: UInt,
    public var `UserName`: `ONEX_VARIABLE_BLOB`,
    public var `DomainName`: `ONEX_VARIABLE_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ONEX_VARIABLE_BLOB` (
    public var `dwSize`: UInt,
    public var `dwOffset`: UInt,
)
public const val `OneXAuthFailure`: `ONEX_AUTH_STATUS` = 4;
public const val `OneXAuthIdentityExplicitUser`: `ONEX_AUTH_IDENTITY` = 3;
public const val `OneXAuthIdentityGuest`: `ONEX_AUTH_IDENTITY` = 4;
public const val `OneXAuthIdentityInvalid`: `ONEX_AUTH_IDENTITY` = 5;
public const val `OneXAuthIdentityMachine`: `ONEX_AUTH_IDENTITY` = 1;
public const val `OneXAuthIdentityNone`: `ONEX_AUTH_IDENTITY` = 0;
public const val `OneXAuthIdentityUser`: `ONEX_AUTH_IDENTITY` = 2;
public const val `OneXAuthInProgress`: `ONEX_AUTH_STATUS` = 1;
public const val `OneXAuthInvalid`: `ONEX_AUTH_STATUS` = 5;
public const val `OneXAuthNoAuthenticatorFound`: `ONEX_AUTH_STATUS` = 2;
public const val `OneXAuthNotStarted`: `ONEX_AUTH_STATUS` = 0;
public const val `OneXAuthSuccess`: `ONEX_AUTH_STATUS` = 3;
public const val `OneXEapMethodBackendSupportUnknown`: `ONEX_EAP_METHOD_BACKEND_SUPPORT` = 0;
public const val `OneXEapMethodBackendSupported`: `ONEX_EAP_METHOD_BACKEND_SUPPORT` = 1;
public const val `OneXEapMethodBackendUnsupported`: `ONEX_EAP_METHOD_BACKEND_SUPPORT` = 2;
public const val `OneXNotificationTypeAuthRestarted`: `ONEX_NOTIFICATION_TYPE` = 2;
public const val `OneXNotificationTypeEventInvalid`: `ONEX_NOTIFICATION_TYPE` = 3;
public const val `OneXNotificationTypeResultUpdate`: `ONEX_NOTIFICATION_TYPE` = 1;
public const val `OneXNumNotifications`: `ONEX_NOTIFICATION_TYPE` = 3;
public const val `OneXPublicNotificationBase`: `ONEX_NOTIFICATION_TYPE` = 0;
public const val `OneXRestartReasonAltCredsTrial`: `ONEX_AUTH_RESTART_REASON` = 7;
public const val `OneXRestartReasonInvalid`: `ONEX_AUTH_RESTART_REASON` = 8;
public const val `OneXRestartReasonMsmInitiated`: `ONEX_AUTH_RESTART_REASON` = 1;
public const val `OneXRestartReasonOneXAuthTimeout`: `ONEX_AUTH_RESTART_REASON` = 3;
public const val `OneXRestartReasonOneXConfigurationChanged`: `ONEX_AUTH_RESTART_REASON` = 4;
public const val `OneXRestartReasonOneXHeldStateTimeout`: `ONEX_AUTH_RESTART_REASON` = 2;
public const val `OneXRestartReasonOneXUserChanged`: `ONEX_AUTH_RESTART_REASON` = 5;
public const val `OneXRestartReasonPeerInitiated`: `ONEX_AUTH_RESTART_REASON` = 0;
public const val `OneXRestartReasonQuarantineStateChanged`: `ONEX_AUTH_RESTART_REASON` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WDIAG_IHV_WLAN_ID` (
    public var `strProfileName`: UShortArray,
    public var `Ssid`: `DOT11_SSID`,
    public var `BssType`: `DOT11_BSS_TYPE`,
    public var `dwFlags`: UInt,
    public var `dwReasonCode`: UInt,
)
// UNSUPPORTED Rust 4155:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WDIAG_IHV_WLAN_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WDIAG_IHV_WLAN_ID_FLAG_SECURITY_ENABLED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WFDSVC_CONNECTION_CAPABILITY` (
    public var `bNew`: Boolean,
    public var `bClient`: Boolean,
    public var `bGO`: Boolean,
)
public const val `WFDSVC_CONNECTION_CAPABILITY_CLIENT`: UInt = 2u;
public const val `WFDSVC_CONNECTION_CAPABILITY_GO`: UInt = 4u;
public const val `WFDSVC_CONNECTION_CAPABILITY_NEW`: UInt = 1u;
public const val `WFD_API_VERSION`: UInt = 1u;
public const val `WFD_API_VERSION_1_0`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WFD_GROUP_ID` (
    public var `DeviceAddress`: UByteArray,
    public var `GroupSSID`: `DOT11_SSID`,
)
// UNSUPPORTED Rust 4179:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WFD_GROUP_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WFD_OPEN_SESSION_COMPLETE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`GUID`, UInt, UInt) -> Unit>>>;
public typealias `WFD_ROLE_TYPE` = Int;
public const val `WFD_ROLE_TYPE_CLIENT`: `WFD_ROLE_TYPE` = 4;
public const val `WFD_ROLE_TYPE_DEVICE`: `WFD_ROLE_TYPE` = 1;
public const val `WFD_ROLE_TYPE_GROUP_OWNER`: `WFD_ROLE_TYPE` = 2;
public const val `WFD_ROLE_TYPE_MAX`: `WFD_ROLE_TYPE` = 5;
public const val `WFD_ROLE_TYPE_NONE`: `WFD_ROLE_TYPE` = 0;
public typealias `WLAN_ADHOC_NETWORK_STATE` = Int;
public const val `WLAN_API_VERSION`: UInt = 2u;
public const val `WLAN_API_VERSION_1_0`: UInt = 1u;
public const val `WLAN_API_VERSION_2_0`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_ASSOCIATION_ATTRIBUTES` (
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `dot11Bssid`: UByteArray,
    public var `dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `uDot11PhyIndex`: UInt,
    public var `wlanSignalQuality`: UInt,
    public var `ulRxRate`: UInt,
    public var `ulTxRate`: UInt,
)
// UNSUPPORTED Rust 4207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_ASSOCIATION_ATTRIBUTES {
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
public class `WLAN_AUTH_CIPHER_PAIR_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `pAuthCipherPairList`: Array<`DOT11_AUTH_CIPHER_PAIR`>,
)
// UNSUPPORTED Rust 4218:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_AUTH_CIPHER_PAIR_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_AUTOCONF_OPCODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_AVAILABLE_NETWORK` (
    public var `strProfileName`: UShortArray,
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `uNumberOfBssids`: UInt,
    public var `bNetworkConnectable`: `windows_sys`.`core`.`BOOL`,
    public var `wlanNotConnectableReason`: UInt,
    public var `uNumberOfPhyTypes`: UInt,
    public var `dot11PhyTypes`: Array<`DOT11_PHY_TYPE`>,
    public var `bMorePhyTypes`: `windows_sys`.`core`.`BOOL`,
    public var `wlanSignalQuality`: UInt,
    public var `bSecurityEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dot11DefaultAuthAlgorithm`: `DOT11_AUTH_ALGORITHM`,
    public var `dot11DefaultCipherAlgorithm`: `DOT11_CIPHER_ALGORITHM`,
    public var `dwFlags`: UInt,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 4243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_AVAILABLE_NETWORK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_AVAILABLE_NETWORK_ANQP_SUPPORTED`: UInt = 32u;
public const val `WLAN_AVAILABLE_NETWORK_AUTO_CONNECT_FAILED`: UInt = 256u;
public const val `WLAN_AVAILABLE_NETWORK_CONNECTED`: UInt = 1u;
public const val `WLAN_AVAILABLE_NETWORK_CONSOLE_USER_PROFILE`: UInt = 4u;
public const val `WLAN_AVAILABLE_NETWORK_HAS_PROFILE`: UInt = 2u;
public const val `WLAN_AVAILABLE_NETWORK_HOTSPOT2_DOMAIN`: UInt = 64u;
public const val `WLAN_AVAILABLE_NETWORK_HOTSPOT2_ENABLED`: UInt = 16u;
public const val `WLAN_AVAILABLE_NETWORK_HOTSPOT2_ROAMING`: UInt = 128u;
public const val `WLAN_AVAILABLE_NETWORK_INCLUDE_ALL_ADHOC_PROFILES`: UInt = 1u;
public const val `WLAN_AVAILABLE_NETWORK_INCLUDE_ALL_MANUAL_HIDDEN_PROFILES`: UInt = 2u;
public const val `WLAN_AVAILABLE_NETWORK_INTERWORKING_SUPPORTED`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_AVAILABLE_NETWORK_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `dwIndex`: UInt,
    public var `Network`: Array<`WLAN_AVAILABLE_NETWORK`>,
)
// UNSUPPORTED Rust 4266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_AVAILABLE_NETWORK_LIST {
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
public class `WLAN_AVAILABLE_NETWORK_LIST_V2` (
    public var `dwNumberOfItems`: UInt,
    public var `dwIndex`: UInt,
    public var `Network`: Array<`WLAN_AVAILABLE_NETWORK_V2`>,
)
// UNSUPPORTED Rust 4278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_AVAILABLE_NETWORK_LIST_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_AVAILABLE_NETWORK_V2` (
    public var `strProfileName`: UShortArray,
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `uNumberOfBssids`: UInt,
    public var `bNetworkConnectable`: `windows_sys`.`core`.`BOOL`,
    public var `wlanNotConnectableReason`: UInt,
    public var `uNumberOfPhyTypes`: UInt,
    public var `dot11PhyTypes`: Array<`DOT11_PHY_TYPE`>,
    public var `bMorePhyTypes`: `windows_sys`.`core`.`BOOL`,
    public var `wlanSignalQuality`: UInt,
    public var `bSecurityEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dot11DefaultAuthAlgorithm`: `DOT11_AUTH_ALGORITHM`,
    public var `dot11DefaultCipherAlgorithm`: `DOT11_CIPHER_ALGORITHM`,
    public var `dwFlags`: UInt,
    public var `AccessNetworkOptions`: `DOT11_ACCESSNETWORKOPTIONS`,
    public var `dot11HESSID`: UByteArray,
    public var `VenueInfo`: `DOT11_VENUEINFO`,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 4305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_AVAILABLE_NETWORK_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_BSS_ENTRY` (
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `uPhyId`: UInt,
    public var `dot11Bssid`: UByteArray,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `dot11BssPhyType`: `DOT11_PHY_TYPE`,
    public var `lRssi`: Int,
    public var `uLinkQuality`: UInt,
    public var `bInRegDomain`: Boolean,
    public var `usBeaconPeriod`: UShort,
    public var `ullTimestamp`: ULong,
    public var `ullHostTimestamp`: ULong,
    public var `usCapabilityInformation`: UShort,
    public var `ulChCenterFrequency`: UInt,
    public var `wlanRateSet`: `WLAN_RATE_SET`,
    public var `ulIeOffset`: UInt,
    public var `ulIeSize`: UInt,
)
// UNSUPPORTED Rust 4330:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_BSS_ENTRY {
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
public class `WLAN_BSS_LIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNumberOfItems`: UInt,
    public var `wlanBssEntries`: Array<`WLAN_BSS_ENTRY`>,
)
// UNSUPPORTED Rust 4342:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_BSS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_CONNECTION_ADHOC_JOIN_ONLY`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_CONNECTION_ATTRIBUTES` (
    public var `isState`: `WLAN_INTERFACE_STATE`,
    public var `wlanConnectionMode`: `WLAN_CONNECTION_MODE`,
    public var `strProfileName`: UShortArray,
    public var `wlanAssociationAttributes`: `WLAN_ASSOCIATION_ATTRIBUTES`,
    public var `wlanSecurityAttributes`: `WLAN_SECURITY_ATTRIBUTES`,
)
// UNSUPPORTED Rust 4357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_CONNECTION_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_CONNECTION_EAPOL_PASSTHROUGH`: UInt = 8u;
public const val `WLAN_CONNECTION_HIDDEN_NETWORK`: UInt = 1u;
public const val `WLAN_CONNECTION_IGNORE_PRIVACY_BIT`: UInt = 4u;
public typealias `WLAN_CONNECTION_MODE` = Int;
public const val `WLAN_CONNECTION_NOTIFICATION_ADHOC_NETWORK_FORMED`: `WLAN_CONNECTION_NOTIFICATION_FLAGS` = 1u;
public const val `WLAN_CONNECTION_NOTIFICATION_CONSOLE_USER_PROFILE`: `WLAN_CONNECTION_NOTIFICATION_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_CONNECTION_NOTIFICATION_DATA` (
    public var `wlanConnectionMode`: `WLAN_CONNECTION_MODE`,
    public var `strProfileName`: UShortArray,
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `bSecurityEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `wlanReasonCode`: UInt,
    public var `dwFlags`: `WLAN_CONNECTION_NOTIFICATION_FLAGS`,
    public var `strProfileXml`: UShortArray,
)
// UNSUPPORTED Rust 4380:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_CONNECTION_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_CONNECTION_NOTIFICATION_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_CONNECTION_PARAMETERS` (
    public var `wlanConnectionMode`: `WLAN_CONNECTION_MODE`,
    public var `strProfile`: `windows_sys`.`core`.`PCWSTR`,
    public var `pDot11Ssid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_SSID`>?,
    public var `pDesiredBssidList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_BSSID_LIST`>?,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 4397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for WLAN_CONNECTION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_CONNECTION_PARAMETERS_V2` (
    public var `wlanConnectionMode`: `WLAN_CONNECTION_MODE`,
    public var `strProfile`: `windows_sys`.`core`.`PCWSTR`,
    public var `pDot11Ssid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_SSID`>?,
    public var `pDot11Hessid`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pDesiredBssidList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_BSSID_LIST`>?,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `dwFlags`: UInt,
    public var `pDot11AccessNetworkOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DOT11_ACCESSNETWORKOPTIONS`>?,
)
// UNSUPPORTED Rust 4416:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for WLAN_CONNECTION_PARAMETERS_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_CONNECTION_PERSIST_DISCOVERY_PROFILE`: UInt = 16u;
public const val `WLAN_CONNECTION_PERSIST_DISCOVERY_PROFILE_CONNECTION_MODE_AUTO`: UInt = 32u;
public const val `WLAN_CONNECTION_PERSIST_DISCOVERY_PROFILE_OVERWRITE_EXISTING`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_COUNTRY_OR_REGION_STRING_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `pCountryOrRegionStringList`: UByteArray,
)
// UNSUPPORTED Rust 4431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_COUNTRY_OR_REGION_STRING_LIST {
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
public class `WLAN_DEVICE_SERVICE_GUID_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `dwIndex`: UInt,
    public var `DeviceService`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 4443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_DEVICE_SERVICE_GUID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_DEVICE_SERVICE_NOTIFICATION_DATA` (
    public var `DeviceService`: `windows_sys`.`core`.`GUID`,
    public var `dwOpCode`: UInt,
    public var `dwDataSize`: UInt,
    public var `DataBlob`: UByteArray,
)
// UNSUPPORTED Rust 4456:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_DEVICE_SERVICE_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_FILTER_LIST_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_HOSTED_NETWORK_CONNECTION_SETTINGS` (
    public var `hostedNetworkSSID`: `DOT11_SSID`,
    public var `dwMaxNumberOfPeers`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_HOSTED_NETWORK_DATA_PEER_STATE_CHANGE` (
    public var `OldState`: `WLAN_HOSTED_NETWORK_PEER_STATE`,
    public var `NewState`: `WLAN_HOSTED_NETWORK_PEER_STATE`,
    public var `PeerStateChangeReason`: `WLAN_HOSTED_NETWORK_REASON`,
)
public typealias `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = Int;
public typealias `WLAN_HOSTED_NETWORK_OPCODE` = Int;
public typealias `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_HOSTED_NETWORK_PEER_STATE` (
    public var `PeerMacAddress`: UByteArray,
    public var `PeerAuthState`: `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE`,
)
// UNSUPPORTED Rust 4484:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_HOSTED_NETWORK_PEER_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_HOSTED_NETWORK_RADIO_STATE` (
    public var `dot11SoftwareRadioState`: `DOT11_RADIO_STATE`,
    public var `dot11HardwareRadioState`: `DOT11_RADIO_STATE`,
)
public typealias `WLAN_HOSTED_NETWORK_REASON` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_HOSTED_NETWORK_SECURITY_SETTINGS` (
    public var `dot11AuthAlgo`: `DOT11_AUTH_ALGORITHM`,
    public var `dot11CipherAlgo`: `DOT11_CIPHER_ALGORITHM`,
)
public typealias `WLAN_HOSTED_NETWORK_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_HOSTED_NETWORK_STATE_CHANGE` (
    public var `OldState`: `WLAN_HOSTED_NETWORK_STATE`,
    public var `NewState`: `WLAN_HOSTED_NETWORK_STATE`,
    public var `StateChangeReason`: `WLAN_HOSTED_NETWORK_REASON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_HOSTED_NETWORK_STATUS` (
    public var `HostedNetworkState`: `WLAN_HOSTED_NETWORK_STATE`,
    public var `IPDeviceID`: `windows_sys`.`core`.`GUID`,
    public var `wlanHostedNetworkBSSID`: UByteArray,
    public var `dot11PhyType`: `DOT11_PHY_TYPE`,
    public var `ulChannelFrequency`: UInt,
    public var `dwNumberOfPeers`: UInt,
    public var `PeerList`: Array<`WLAN_HOSTED_NETWORK_PEER_STATE`>,
)
// UNSUPPORTED Rust 4521:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_HOSTED_NETWORK_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_IHV_CONTROL_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_INTERFACE_CAPABILITY` (
    public var `interfaceType`: `WLAN_INTERFACE_TYPE`,
    public var `bDot11DSupported`: `windows_sys`.`core`.`BOOL`,
    public var `dwMaxDesiredSsidListSize`: UInt,
    public var `dwMaxDesiredBssidListSize`: UInt,
    public var `dwNumberOfSupportedPhys`: UInt,
    public var `dot11PhyTypes`: Array<`DOT11_PHY_TYPE`>,
)
// UNSUPPORTED Rust 4537:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_INTERFACE_CAPABILITY {
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
public class `WLAN_INTERFACE_INFO` (
    public var `InterfaceGuid`: `windows_sys`.`core`.`GUID`,
    public var `strInterfaceDescription`: UShortArray,
    public var `isState`: `WLAN_INTERFACE_STATE`,
)
// UNSUPPORTED Rust 4549:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_INTERFACE_INFO {
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
public class `WLAN_INTERFACE_INFO_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `dwIndex`: UInt,
    public var `InterfaceInfo`: Array<`WLAN_INTERFACE_INFO`>,
)
// UNSUPPORTED Rust 4561:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_INTERFACE_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_INTERFACE_STATE` = Int;
public typealias `WLAN_INTERFACE_TYPE` = Int;
public typealias `WLAN_INTF_OPCODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_MAC_FRAME_STATISTICS` (
    public var `ullTransmittedFrameCount`: ULong,
    public var `ullReceivedFrameCount`: ULong,
    public var `ullWEPExcludedCount`: ULong,
    public var `ullTKIPLocalMICFailures`: ULong,
    public var `ullTKIPReplays`: ULong,
    public var `ullTKIPICVErrorCount`: ULong,
    public var `ullCCMPReplays`: ULong,
    public var `ullCCMPDecryptErrors`: ULong,
    public var `ullWEPUndecryptableCount`: ULong,
    public var `ullWEPICVErrorCount`: ULong,
    public var `ullDecryptSuccessCount`: ULong,
    public var `ullDecryptFailureCount`: ULong,
)
public const val `WLAN_MAX_NAME_LENGTH`: UInt = 256u;
public const val `WLAN_MAX_PHY_INDEX`: UInt = 64u;
public const val `WLAN_MAX_PHY_TYPE_NUMBER`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_MSM_NOTIFICATION_DATA` (
    public var `wlanConnectionMode`: `WLAN_CONNECTION_MODE`,
    public var `strProfileName`: UShortArray,
    public var `dot11Ssid`: `DOT11_SSID`,
    public var `dot11BssType`: `DOT11_BSS_TYPE`,
    public var `dot11MacAddr`: UByteArray,
    public var `bSecurityEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `bFirstPeer`: `windows_sys`.`core`.`BOOL`,
    public var `bLastPeer`: `windows_sys`.`core`.`BOOL`,
    public var `wlanReasonCode`: UInt,
)
// UNSUPPORTED Rust 4601:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_MSM_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_NOTIFICATION_ACM` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WLAN_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`L2_NOTIFICATION_DATA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `WLAN_NOTIFICATION_MSM` = Int;
public typealias `WLAN_NOTIFICATION_SECURITY` = Int;
public typealias `WLAN_NOTIFICATION_SOURCES` = UInt;
public const val `WLAN_NOTIFICATION_SOURCE_ACM`: `WLAN_NOTIFICATION_SOURCES` = 8u;
public const val `WLAN_NOTIFICATION_SOURCE_ALL`: `WLAN_NOTIFICATION_SOURCES` = 65535u;
public const val `WLAN_NOTIFICATION_SOURCE_DEVICE_SERVICE`: `WLAN_NOTIFICATION_SOURCES` = 2048u;
public const val `WLAN_NOTIFICATION_SOURCE_HNWK`: `WLAN_NOTIFICATION_SOURCES` = 128u;
public const val `WLAN_NOTIFICATION_SOURCE_IHV`: `WLAN_NOTIFICATION_SOURCES` = 64u;
public const val `WLAN_NOTIFICATION_SOURCE_MSM`: `WLAN_NOTIFICATION_SOURCES` = 16u;
public const val `WLAN_NOTIFICATION_SOURCE_NONE`: `WLAN_NOTIFICATION_SOURCES` = 0u;
public const val `WLAN_NOTIFICATION_SOURCE_ONEX`: `WLAN_NOTIFICATION_SOURCES` = 4u;
public const val `WLAN_NOTIFICATION_SOURCE_SECURITY`: `WLAN_NOTIFICATION_SOURCES` = 32u;
public typealias `WLAN_OPCODE_VALUE_TYPE` = Int;
public typealias `WLAN_OPERATIONAL_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_PHY_FRAME_STATISTICS` (
    public var `ullTransmittedFrameCount`: ULong,
    public var `ullMulticastTransmittedFrameCount`: ULong,
    public var `ullFailedCount`: ULong,
    public var `ullRetryCount`: ULong,
    public var `ullMultipleRetryCount`: ULong,
    public var `ullMaxTXLifetimeExceededCount`: ULong,
    public var `ullTransmittedFragmentCount`: ULong,
    public var `ullRTSSuccessCount`: ULong,
    public var `ullRTSFailureCount`: ULong,
    public var `ullACKFailureCount`: ULong,
    public var `ullReceivedFrameCount`: ULong,
    public var `ullMulticastReceivedFrameCount`: ULong,
    public var `ullPromiscuousReceivedFrameCount`: ULong,
    public var `ullMaxRXLifetimeExceededCount`: ULong,
    public var `ullFrameDuplicateCount`: ULong,
    public var `ullReceivedFragmentCount`: ULong,
    public var `ullPromiscuousReceivedFragmentCount`: ULong,
    public var `ullFCSErrorCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_PHY_RADIO_STATE` (
    public var `dwPhyIndex`: UInt,
    public var `dot11SoftwareRadioState`: `DOT11_RADIO_STATE`,
    public var `dot11HardwareRadioState`: `DOT11_RADIO_STATE`,
)
public typealias `WLAN_POWER_SETTING` = Int;
public const val `WLAN_PROFILE_CONNECTION_MODE_AUTO`: UInt = 131072u;
public const val `WLAN_PROFILE_CONNECTION_MODE_SET_BY_CLIENT`: UInt = 65536u;
public const val `WLAN_PROFILE_GET_PLAINTEXT_KEY`: UInt = 4u;
public const val `WLAN_PROFILE_GROUP_POLICY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_PROFILE_INFO` (
    public var `strProfileName`: UShortArray,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 4662:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_PROFILE_INFO {
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
public class `WLAN_PROFILE_INFO_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `dwIndex`: UInt,
    public var `ProfileInfo`: Array<`WLAN_PROFILE_INFO`>,
)
// UNSUPPORTED Rust 4674:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_PROFILE_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_PROFILE_USER`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_RADIO_STATE` (
    public var `dwNumberOfPhys`: UInt,
    public var `PhyRadioState`: Array<`WLAN_PHY_RADIO_STATE`>,
)
// UNSUPPORTED Rust 4686:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_RADIO_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 126 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_RATE_SET` (
    public var `uRateSetLength`: UInt,
    public var `usRateSet`: UShortArray,
)
// UNSUPPORTED Rust 4697:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_RATE_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_RAW_DATA` (
    public var `dwDataSize`: UInt,
    public var `DataBlob`: UByteArray,
)
// UNSUPPORTED Rust 4708:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_RAW_DATA {
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
public class `WLAN_RAW_DATA_LIST` (
    public var `dwTotalSize`: UInt,
    public var `dwNumberOfItems`: UInt,
    public var `DataList`: Array<`WLAN_RAW_DATA_LIST_0`>,
)
// UNSUPPORTED Rust 4720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_RAW_DATA_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_RAW_DATA_LIST_0` (
    public var `dwDataOffset`: UInt,
    public var `dwDataSize`: UInt,
)
public const val `WLAN_REASON_CODE_AC_BASE`: UInt = 131072u;
public const val `WLAN_REASON_CODE_AC_CONNECT_BASE`: UInt = 163840u;
public const val `WLAN_REASON_CODE_AC_END`: UInt = 196607u;
public const val `WLAN_REASON_CODE_ADHOC_SECURITY_FAILURE`: UInt = 229386u;
public const val `WLAN_REASON_CODE_AP_PROFILE_NOT_ALLOWED`: UInt = 163856u;
public const val `WLAN_REASON_CODE_AP_PROFILE_NOT_ALLOWED_FOR_CLIENT`: UInt = 163855u;
public const val `WLAN_REASON_CODE_AP_STARTING_FAILURE`: UInt = 229395u;
public const val `WLAN_REASON_CODE_ASSOCIATION_FAILURE`: UInt = 229378u;
public const val `WLAN_REASON_CODE_ASSOCIATION_TIMEOUT`: UInt = 229379u;
public const val `WLAN_REASON_CODE_AUTO_AP_PROFILE_NOT_ALLOWED`: UInt = 524313u;
public const val `WLAN_REASON_CODE_AUTO_CONNECTION_NOT_ALLOWED`: UInt = 524314u;
public const val `WLAN_REASON_CODE_AUTO_SWITCH_SET_FOR_ADHOC`: UInt = 524304u;
public const val `WLAN_REASON_CODE_AUTO_SWITCH_SET_FOR_MANUAL_CONNECTION`: UInt = 524305u;
public const val `WLAN_REASON_CODE_BAD_MAX_NUMBER_OF_CLIENTS_FOR_AP`: UInt = 524310u;
public const val `WLAN_REASON_CODE_BASE`: UInt = 131072u;
public const val `WLAN_REASON_CODE_BSS_TYPE_NOT_ALLOWED`: UInt = 163845u;
public const val `WLAN_REASON_CODE_BSS_TYPE_UNMATCH`: UInt = 196611u;
public const val `WLAN_REASON_CODE_CONFLICT_SECURITY`: UInt = 524299u;
public const val `WLAN_REASON_CODE_CONNECT_CALL_FAIL`: UInt = 163849u;
public const val `WLAN_REASON_CODE_DATARATE_UNMATCH`: UInt = 196613u;
public const val `WLAN_REASON_CODE_DISCONNECT_TIMEOUT`: UInt = 229391u;
public const val `WLAN_REASON_CODE_DRIVER_DISCONNECTED`: UInt = 229387u;
public const val `WLAN_REASON_CODE_DRIVER_OPERATION_FAILURE`: UInt = 229388u;
public const val `WLAN_REASON_CODE_GP_DENIED`: UInt = 163843u;
public const val `WLAN_REASON_CODE_HOTSPOT2_PROFILE_DENIED`: UInt = 163857u;
public const val `WLAN_REASON_CODE_HOTSPOT2_PROFILE_NOT_ALLOWED`: UInt = 524315u;
public const val `WLAN_REASON_CODE_IHV_CONNECTIVITY_NOT_SUPPORTED`: UInt = 524309u;
public const val `WLAN_REASON_CODE_IHV_NOT_AVAILABLE`: UInt = 229389u;
public const val `WLAN_REASON_CODE_IHV_NOT_RESPONDING`: UInt = 229390u;
public const val `WLAN_REASON_CODE_IHV_OUI_MISMATCH`: UInt = 524296u;
public const val `WLAN_REASON_CODE_IHV_OUI_MISSING`: UInt = 524297u;
public const val `WLAN_REASON_CODE_IHV_SECURITY_NOT_SUPPORTED`: UInt = 524295u;
public const val `WLAN_REASON_CODE_IHV_SECURITY_ONEX_MISSING`: UInt = 524306u;
public const val `WLAN_REASON_CODE_IHV_SETTINGS_MISSING`: UInt = 524298u;
public const val `WLAN_REASON_CODE_INTERNAL_FAILURE`: UInt = 229392u;
public const val `WLAN_REASON_CODE_INVALID_ADHOC_CONNECTION_MODE`: UInt = 524302u;
public const val `WLAN_REASON_CODE_INVALID_BSS_TYPE`: UInt = 524301u;
public const val `WLAN_REASON_CODE_INVALID_CHANNEL`: UInt = 524311u;
public const val `WLAN_REASON_CODE_INVALID_PHY_TYPE`: UInt = 524293u;
public const val `WLAN_REASON_CODE_INVALID_PROFILE_NAME`: UInt = 524291u;
public const val `WLAN_REASON_CODE_INVALID_PROFILE_SCHEMA`: UInt = 524289u;
public const val `WLAN_REASON_CODE_INVALID_PROFILE_TYPE`: UInt = 524292u;
public const val `WLAN_REASON_CODE_IN_BLOCKED_LIST`: UInt = 163847u;
public const val `WLAN_REASON_CODE_IN_FAILED_LIST`: UInt = 163846u;
public const val `WLAN_REASON_CODE_KEY_MISMATCH`: UInt = 163853u;
public const val `WLAN_REASON_CODE_MSMSEC_AUTH_START_TIMEOUT`: UInt = 294914u;
public const val `WLAN_REASON_CODE_MSMSEC_AUTH_SUCCESS_TIMEOUT`: UInt = 294915u;
public const val `WLAN_REASON_CODE_MSMSEC_AUTH_WCN_COMPLETED`: UInt = 294937u;
public const val `WLAN_REASON_CODE_MSMSEC_BASE`: UInt = 262144u;
public const val `WLAN_REASON_CODE_MSMSEC_CANCELLED`: UInt = 294929u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_DISCOVERY`: UInt = 262165u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_MFP_NW_NIC`: UInt = 262181u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_NETWORK`: UInt = 262162u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_NIC`: UInt = 262163u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE`: UInt = 262164u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_AUTH`: UInt = 262174u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_CIPHER`: UInt = 262175u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_SAFE_MODE_NIC`: UInt = 262177u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_SAFE_MODE_NW`: UInt = 262178u;
public const val `WLAN_REASON_CODE_MSMSEC_CONNECT_BASE`: UInt = 294912u;
public const val `WLAN_REASON_CODE_MSMSEC_DOWNGRADE_DETECTED`: UInt = 294931u;
public const val `WLAN_REASON_CODE_MSMSEC_END`: UInt = 327679u;
public const val `WLAN_REASON_CODE_MSMSEC_FORCED_FAILURE`: UInt = 294933u;
public const val `WLAN_REASON_CODE_MSMSEC_G1_MISSING_GRP_KEY`: UInt = 294925u;
public const val `WLAN_REASON_CODE_MSMSEC_G1_MISSING_KEY_DATA`: UInt = 294924u;
public const val `WLAN_REASON_CODE_MSMSEC_G1_MISSING_MGMT_GRP_KEY`: UInt = 294939u;
public const val `WLAN_REASON_CODE_MSMSEC_KEY_FORMAT`: UInt = 294930u;
public const val `WLAN_REASON_CODE_MSMSEC_KEY_START_TIMEOUT`: UInt = 294916u;
public const val `WLAN_REASON_CODE_MSMSEC_KEY_SUCCESS_TIMEOUT`: UInt = 294917u;
public const val `WLAN_REASON_CODE_MSMSEC_M2_MISSING_IE`: UInt = 294936u;
public const val `WLAN_REASON_CODE_MSMSEC_M2_MISSING_KEY_DATA`: UInt = 294935u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_GRP_KEY`: UInt = 294920u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_IE`: UInt = 294919u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_KEY_DATA`: UInt = 294918u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_MGMT_GRP_KEY`: UInt = 294938u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_TOO_MANY_RSNIE`: UInt = 294934u;
public const val `WLAN_REASON_CODE_MSMSEC_MAX`: UInt = 327679u;
public const val `WLAN_REASON_CODE_MSMSEC_MIN`: UInt = 262144u;
public const val `WLAN_REASON_CODE_MSMSEC_MIXED_CELL`: UInt = 262169u;
public const val `WLAN_REASON_CODE_MSMSEC_NIC_FAILURE`: UInt = 294928u;
public const val `WLAN_REASON_CODE_MSMSEC_NO_AUTHENTICATOR`: UInt = 294927u;
public const val `WLAN_REASON_CODE_MSMSEC_NO_PAIRWISE_KEY`: UInt = 294923u;
public const val `WLAN_REASON_CODE_MSMSEC_PEER_INDICATED_INSECURE`: UInt = 294926u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_AUTH_TIMERS_INVALID`: UInt = 262170u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_DUPLICATE_AUTH_CIPHER`: UInt = 262151u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_AUTH_CIPHER`: UInt = 262153u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_GKEY_INTV`: UInt = 262171u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_KEY_INDEX`: UInt = 262145u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PMKCACHE_MODE`: UInt = 262156u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PMKCACHE_SIZE`: UInt = 262157u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PMKCACHE_TTL`: UInt = 262158u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PREAUTH_MODE`: UInt = 262159u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PREAUTH_THROTTLE`: UInt = 262160u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_KEYMATERIAL_CHAR`: UInt = 262167u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_KEY_LENGTH`: UInt = 262147u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_KEY_UNMAPPED_CHAR`: UInt = 262173u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_NO_AUTH_CIPHER_SPECIFIED`: UInt = 262149u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_ONEX_DISABLED`: UInt = 262154u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_ONEX_ENABLED`: UInt = 262155u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PASSPHRASE_CHAR`: UInt = 262166u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PREAUTH_ONLY_ENABLED`: UInt = 262161u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PSK_LENGTH`: UInt = 262148u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PSK_PRESENT`: UInt = 262146u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_RAWDATA_INVALID`: UInt = 262152u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_SAFE_MODE`: UInt = 262176u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_TOO_MANY_AUTH_CIPHER_SPECIFIED`: UInt = 262150u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_UNSUPPORTED_AUTH`: UInt = 262179u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_UNSUPPORTED_CIPHER`: UInt = 262180u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_WRONG_KEYTYPE`: UInt = 262168u;
public const val `WLAN_REASON_CODE_MSMSEC_PR_IE_MATCHING`: UInt = 294921u;
public const val `WLAN_REASON_CODE_MSMSEC_PSK_MISMATCH_SUSPECTED`: UInt = 294932u;
public const val `WLAN_REASON_CODE_MSMSEC_SEC_IE_MATCHING`: UInt = 294922u;
public const val `WLAN_REASON_CODE_MSMSEC_TRANSITION_NETWORK`: UInt = 262172u;
public const val `WLAN_REASON_CODE_MSMSEC_UI_REQUEST_FAILURE`: UInt = 294913u;
public const val `WLAN_REASON_CODE_MSM_BASE`: UInt = 196608u;
public const val `WLAN_REASON_CODE_MSM_CONNECT_BASE`: UInt = 229376u;
public const val `WLAN_REASON_CODE_MSM_END`: UInt = 262143u;
public const val `WLAN_REASON_CODE_MSM_SECURITY_MISSING`: UInt = 524294u;
public const val `WLAN_REASON_CODE_NETWORK_NOT_AVAILABLE`: UInt = 163851u;
public const val `WLAN_REASON_CODE_NETWORK_NOT_COMPATIBLE`: UInt = 131073u;
public const val `WLAN_REASON_CODE_NON_BROADCAST_SET_FOR_ADHOC`: UInt = 524303u;
public const val `WLAN_REASON_CODE_NOT_VISIBLE`: UInt = 163842u;
public const val `WLAN_REASON_CODE_NO_AUTO_CONNECTION`: UInt = 163841u;
public const val `WLAN_REASON_CODE_NO_VISIBLE_AP`: UInt = 229396u;
public const val `WLAN_REASON_CODE_OPERATION_MODE_NOT_SUPPORTED`: UInt = 524312u;
public const val `WLAN_REASON_CODE_PHY_TYPE_UNMATCH`: UInt = 196612u;
public const val `WLAN_REASON_CODE_PRE_SECURITY_FAILURE`: UInt = 229380u;
public const val `WLAN_REASON_CODE_PROFILE_BASE`: UInt = 524288u;
public const val `WLAN_REASON_CODE_PROFILE_CHANGED_OR_DELETED`: UInt = 163852u;
public const val `WLAN_REASON_CODE_PROFILE_CONNECT_BASE`: UInt = 557056u;
public const val `WLAN_REASON_CODE_PROFILE_END`: UInt = 589823u;
public const val `WLAN_REASON_CODE_PROFILE_MISSING`: UInt = 524290u;
public const val `WLAN_REASON_CODE_PROFILE_NOT_COMPATIBLE`: UInt = 131074u;
public const val `WLAN_REASON_CODE_PROFILE_SSID_INVALID`: UInt = 524307u;
public const val `WLAN_REASON_CODE_RANGE_SIZE`: UInt = 65536u;
public const val `WLAN_REASON_CODE_RESERVED_BASE`: UInt = 720896u;
public const val `WLAN_REASON_CODE_RESERVED_END`: UInt = 786431u;
public const val `WLAN_REASON_CODE_ROAMING_FAILURE`: UInt = 229384u;
public const val `WLAN_REASON_CODE_ROAMING_SECURITY_FAILURE`: UInt = 229385u;
public const val `WLAN_REASON_CODE_SCAN_CALL_FAIL`: UInt = 163850u;
public const val `WLAN_REASON_CODE_SECURITY_FAILURE`: UInt = 229382u;
public const val `WLAN_REASON_CODE_SECURITY_MISSING`: UInt = 524300u;
public const val `WLAN_REASON_CODE_SECURITY_TIMEOUT`: UInt = 229383u;
public const val `WLAN_REASON_CODE_SSID_LIST_TOO_LONG`: UInt = 163848u;
public const val `WLAN_REASON_CODE_START_SECURITY_FAILURE`: UInt = 229381u;
public const val `WLAN_REASON_CODE_SUCCESS`: UInt = 0u;
public const val `WLAN_REASON_CODE_TOO_MANY_SECURITY_ATTEMPTS`: UInt = 229394u;
public const val `WLAN_REASON_CODE_TOO_MANY_SSID`: UInt = 524308u;
public const val `WLAN_REASON_CODE_UI_REQUEST_TIMEOUT`: UInt = 229393u;
public const val `WLAN_REASON_CODE_UNKNOWN`: UInt = 65537u;
public const val `WLAN_REASON_CODE_UNSUPPORTED_SECURITY_SET`: UInt = 196610u;
public const val `WLAN_REASON_CODE_UNSUPPORTED_SECURITY_SET_BY_OS`: UInt = 196609u;
public const val `WLAN_REASON_CODE_USER_CANCELLED`: UInt = 229377u;
public const val `WLAN_REASON_CODE_USER_DENIED`: UInt = 163844u;
public const val `WLAN_REASON_CODE_USER_NOT_RESPOND`: UInt = 163854u;
public typealias `WLAN_SECURABLE_OBJECT` = Int;
public const val `WLAN_SECURABLE_OBJECT_COUNT`: `WLAN_SECURABLE_OBJECT` = 17;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLAN_SECURITY_ATTRIBUTES` (
    public var `bSecurityEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `bOneXEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dot11AuthAlgorithm`: `DOT11_AUTH_ALGORITHM`,
    public var `dot11CipherAlgorithm`: `DOT11_CIPHER_ALGORITHM`,
)
public const val `WLAN_SET_EAPHOST_DATA_ALL_USERS`: `WLAN_SET_EAPHOST_FLAGS` = 1u;
public typealias `WLAN_SET_EAPHOST_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLAN_STATISTICS` (
    public var `ullFourWayHandshakeFailures`: ULong,
    public var `ullTKIPCounterMeasuresInvoked`: ULong,
    public var `ullReserved`: ULong,
    public var `MacUcastCounters`: `WLAN_MAC_FRAME_STATISTICS`,
    public var `MacMcastCounters`: `WLAN_MAC_FRAME_STATISTICS`,
    public var `dwNumberOfPhys`: UInt,
    public var `PhyCounters`: Array<`WLAN_PHY_FRAME_STATISTICS`>,
)
// UNSUPPORTED Rust 4909:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLAN_STATISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_UI_API_INITIAL_VERSION`: UInt = 1u;
public const val `WLAN_UI_API_VERSION`: UInt = 1u;
public const val `WLAdvPage`: `WL_DISPLAY_PAGES` = 2;
public const val `WLConnectionPage`: `WL_DISPLAY_PAGES` = 0;
public const val `WLSecurityPage`: `WL_DISPLAY_PAGES` = 1;
public typealias `WL_DISPLAY_PAGES` = Int;
public const val `ch_description_type_center_frequency`: `CH_DESCRIPTION_TYPE` = 2;
public const val `ch_description_type_logical`: `CH_DESCRIPTION_TYPE` = 1;
public const val `ch_description_type_phy_specific`: `CH_DESCRIPTION_TYPE` = 3;
public const val `connection_phase_any`: `DOT11EXT_IHV_CONNECTION_PHASE` = 0;
public const val `connection_phase_initial_connection`: `DOT11EXT_IHV_CONNECTION_PHASE` = 1;
public const val `connection_phase_post_l3_connection`: `DOT11EXT_IHV_CONNECTION_PHASE` = 2;
public const val `dot11_AC_param_BE`: `DOT11_AC_PARAM` = 0;
public const val `dot11_AC_param_BK`: `DOT11_AC_PARAM` = 1;
public const val `dot11_AC_param_VI`: `DOT11_AC_PARAM` = 2;
public const val `dot11_AC_param_VO`: `DOT11_AC_PARAM` = 3;
public const val `dot11_AC_param_max`: `DOT11_AC_PARAM` = 4;
public const val `dot11_ANQP_query_result_access_issues`: `DOT11_ANQP_QUERY_RESULT` = 7;
public const val `dot11_ANQP_query_result_advertisement_protocol_not_supported_on_remote`: `DOT11_ANQP_QUERY_RESULT` = 4;
public const val `dot11_ANQP_query_result_advertisement_server_not_responding`: `DOT11_ANQP_QUERY_RESULT` = 6;
public const val `dot11_ANQP_query_result_failure`: `DOT11_ANQP_QUERY_RESULT` = 1;
public const val `dot11_ANQP_query_result_gas_protocol_failure`: `DOT11_ANQP_QUERY_RESULT` = 5;
public const val `dot11_ANQP_query_result_resources`: `DOT11_ANQP_QUERY_RESULT` = 3;
public const val `dot11_ANQP_query_result_success`: `DOT11_ANQP_QUERY_RESULT` = 0;
public const val `dot11_ANQP_query_result_timed_out`: `DOT11_ANQP_QUERY_RESULT` = 2;
public const val `dot11_BSS_type_any`: `DOT11_BSS_TYPE` = 3;
public const val `dot11_BSS_type_independent`: `DOT11_BSS_TYPE` = 2;
public const val `dot11_BSS_type_infrastructure`: `DOT11_BSS_TYPE` = 1;
public const val `dot11_assoc_state_auth_assoc`: `DOT11_ASSOCIATION_STATE` = 3;
public const val `dot11_assoc_state_auth_unassoc`: `DOT11_ASSOCIATION_STATE` = 2;
public const val `dot11_assoc_state_unauth_unassoc`: `DOT11_ASSOCIATION_STATE` = 1;
public const val `dot11_assoc_state_zero`: `DOT11_ASSOCIATION_STATE` = 0;
public const val `dot11_band_2p4g`: `DOT11_BAND` = 1;
public const val `dot11_band_4p9g`: `DOT11_BAND` = 2;
public const val `dot11_band_5g`: `DOT11_BAND` = 3;
public const val `dot11_diversity_support_dynamic`: `DOT11_DIVERSITY_SUPPORT` = 3;
public const val `dot11_diversity_support_fixedlist`: `DOT11_DIVERSITY_SUPPORT` = 1;
public const val `dot11_diversity_support_notsupported`: `DOT11_DIVERSITY_SUPPORT` = 2;
public const val `dot11_diversity_support_unknown`: `DOT11_DIVERSITY_SUPPORT` = 0;
public const val `dot11_hop_algo_current`: `DOT11_HOP_ALGO_ADOPTED` = 0;
public const val `dot11_hop_algo_hcc`: `DOT11_HOP_ALGO_ADOPTED` = 2;
public const val `dot11_hop_algo_hop_index`: `DOT11_HOP_ALGO_ADOPTED` = 1;
public const val `dot11_key_direction_both`: `DOT11_KEY_DIRECTION` = 1;
public const val `dot11_key_direction_inbound`: `DOT11_KEY_DIRECTION` = 2;
public const val `dot11_key_direction_outbound`: `DOT11_KEY_DIRECTION` = 3;
public const val `dot11_manufacturing_callback_IHV_end`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = -1;
public const val `dot11_manufacturing_callback_IHV_start`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = -2147483648;
public const val `dot11_manufacturing_callback_self_test_complete`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = 1;
public const val `dot11_manufacturing_callback_sleep_complete`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = 2;
public const val `dot11_manufacturing_callback_unknown`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = 0;
public const val `dot11_manufacturing_test_IHV_end`: `DOT11_MANUFACTURING_TEST_TYPE` = -1;
public const val `dot11_manufacturing_test_IHV_start`: `DOT11_MANUFACTURING_TEST_TYPE` = -2147483648;
public const val `dot11_manufacturing_test_awake`: `DOT11_MANUFACTURING_TEST_TYPE` = 9;
public const val `dot11_manufacturing_test_query_adc`: `DOT11_MANUFACTURING_TEST_TYPE` = 5;
public const val `dot11_manufacturing_test_query_data`: `DOT11_MANUFACTURING_TEST_TYPE` = 7;
public const val `dot11_manufacturing_test_rx`: `DOT11_MANUFACTURING_TEST_TYPE` = 3;
public const val `dot11_manufacturing_test_self_query_result`: `DOT11_MANUFACTURING_TEST_TYPE` = 2;
public const val `dot11_manufacturing_test_self_start`: `DOT11_MANUFACTURING_TEST_TYPE` = 1;
public const val `dot11_manufacturing_test_set_data`: `DOT11_MANUFACTURING_TEST_TYPE` = 6;
public const val `dot11_manufacturing_test_sleep`: `DOT11_MANUFACTURING_TEST_TYPE` = 8;
public const val `dot11_manufacturing_test_tx`: `DOT11_MANUFACTURING_TEST_TYPE` = 4;
public const val `dot11_manufacturing_test_unknown`: `DOT11_MANUFACTURING_TEST_TYPE` = 0;
public const val `dot11_offload_type_auth`: `DOT11_OFFLOAD_TYPE` = 2;
public const val `dot11_offload_type_wep`: `DOT11_OFFLOAD_TYPE` = 1;
public const val `dot11_phy_type_IHV_end`: `DOT11_PHY_TYPE` = -1;
public const val `dot11_phy_type_IHV_start`: `DOT11_PHY_TYPE` = -2147483648;
public const val `dot11_phy_type_any`: `DOT11_PHY_TYPE` = 0;
public const val `dot11_phy_type_dmg`: `DOT11_PHY_TYPE` = 9;
public const val `dot11_phy_type_dsss`: `DOT11_PHY_TYPE` = 2;
public const val `dot11_phy_type_eht`: `DOT11_PHY_TYPE` = 11;
public const val `dot11_phy_type_erp`: `DOT11_PHY_TYPE` = 6;
public const val `dot11_phy_type_fhss`: `DOT11_PHY_TYPE` = 1;
public const val `dot11_phy_type_he`: `DOT11_PHY_TYPE` = 10;
public const val `dot11_phy_type_hrdsss`: `DOT11_PHY_TYPE` = 5;
public const val `dot11_phy_type_ht`: `DOT11_PHY_TYPE` = 7;
public const val `dot11_phy_type_irbaseband`: `DOT11_PHY_TYPE` = 3;
public const val `dot11_phy_type_ofdm`: `DOT11_PHY_TYPE` = 4;
public const val `dot11_phy_type_unknown`: `DOT11_PHY_TYPE` = 0;
public const val `dot11_phy_type_vht`: `DOT11_PHY_TYPE` = 8;
public const val `dot11_power_mode_active`: `DOT11_POWER_MODE` = 1;
public const val `dot11_power_mode_powersave`: `DOT11_POWER_MODE` = 2;
public const val `dot11_power_mode_reason_compliant_AP`: `DOT11_POWER_MODE_REASON` = 3;
public const val `dot11_power_mode_reason_compliant_WFD_device`: `DOT11_POWER_MODE_REASON` = 4;
public const val `dot11_power_mode_reason_legacy_WFD_device`: `DOT11_POWER_MODE_REASON` = 2;
public const val `dot11_power_mode_reason_no_change`: `DOT11_POWER_MODE_REASON` = 0;
public const val `dot11_power_mode_reason_noncompliant_AP`: `DOT11_POWER_MODE_REASON` = 1;
public const val `dot11_power_mode_reason_others`: `DOT11_POWER_MODE_REASON` = 5;
public const val `dot11_power_mode_unknown`: `DOT11_POWER_MODE` = 0;
public const val `dot11_radio_state_off`: `DOT11_RADIO_STATE` = 2;
public const val `dot11_radio_state_on`: `DOT11_RADIO_STATE` = 1;
public const val `dot11_radio_state_unknown`: `DOT11_RADIO_STATE` = 0;
public const val `dot11_reset_type_mac`: `DOT11_RESET_TYPE` = 2;
public const val `dot11_reset_type_phy`: `DOT11_RESET_TYPE` = 1;
public const val `dot11_reset_type_phy_and_mac`: `DOT11_RESET_TYPE` = 3;
public const val `dot11_scan_type_active`: `DOT11_SCAN_TYPE` = 1;
public const val `dot11_scan_type_auto`: `DOT11_SCAN_TYPE` = 3;
public const val `dot11_scan_type_forced`: `DOT11_SCAN_TYPE` = -2147483648;
public const val `dot11_scan_type_passive`: `DOT11_SCAN_TYPE` = 2;
public const val `dot11_temp_type_1`: `DOT11_TEMP_TYPE` = 1;
public const val `dot11_temp_type_2`: `DOT11_TEMP_TYPE` = 2;
public const val `dot11_temp_type_unknown`: `DOT11_TEMP_TYPE` = 0;
public const val `dot11_update_ie_op_create_replace`: `DOT11_UPDATE_IE_OP` = 1;
public const val `dot11_update_ie_op_delete`: `DOT11_UPDATE_IE_OP` = 2;
public const val `dot11_wfd_discover_type_auto`: `DOT11_WFD_DISCOVER_TYPE` = 3;
public const val `dot11_wfd_discover_type_find_only`: `DOT11_WFD_DISCOVER_TYPE` = 2;
public const val `dot11_wfd_discover_type_forced`: `DOT11_WFD_DISCOVER_TYPE` = -2147483648;
public const val `dot11_wfd_discover_type_scan_only`: `DOT11_WFD_DISCOVER_TYPE` = 1;
public const val `dot11_wfd_discover_type_scan_social_channels`: `DOT11_WFD_DISCOVER_TYPE` = 4;
public const val `dot11_wfd_scan_type_active`: `DOT11_WFD_SCAN_TYPE` = 1;
public const val `dot11_wfd_scan_type_auto`: `DOT11_WFD_SCAN_TYPE` = 3;
public const val `dot11_wfd_scan_type_passive`: `DOT11_WFD_SCAN_TYPE` = 2;
public const val `wlan_adhoc_network_state_connected`: `WLAN_ADHOC_NETWORK_STATE` = 1;
public const val `wlan_adhoc_network_state_formed`: `WLAN_ADHOC_NETWORK_STATE` = 0;
public const val `wlan_autoconf_opcode_allow_explicit_creds`: `WLAN_AUTOCONF_OPCODE` = 4;
public const val `wlan_autoconf_opcode_allow_virtual_station_extensibility`: `WLAN_AUTOCONF_OPCODE` = 6;
public const val `wlan_autoconf_opcode_block_period`: `WLAN_AUTOCONF_OPCODE` = 5;
public const val `wlan_autoconf_opcode_end`: `WLAN_AUTOCONF_OPCODE` = 7;
public const val `wlan_autoconf_opcode_only_use_gp_profiles_for_allowed_networks`: `WLAN_AUTOCONF_OPCODE` = 3;
public const val `wlan_autoconf_opcode_power_setting`: `WLAN_AUTOCONF_OPCODE` = 2;
public const val `wlan_autoconf_opcode_show_denied_networks`: `WLAN_AUTOCONF_OPCODE` = 1;
public const val `wlan_autoconf_opcode_start`: `WLAN_AUTOCONF_OPCODE` = 0;
public const val `wlan_connection_mode_auto`: `WLAN_CONNECTION_MODE` = 4;
public const val `wlan_connection_mode_discovery_secure`: `WLAN_CONNECTION_MODE` = 2;
public const val `wlan_connection_mode_discovery_unsecure`: `WLAN_CONNECTION_MODE` = 3;
public const val `wlan_connection_mode_invalid`: `WLAN_CONNECTION_MODE` = 5;
public const val `wlan_connection_mode_profile`: `WLAN_CONNECTION_MODE` = 0;
public const val `wlan_connection_mode_temporary_profile`: `WLAN_CONNECTION_MODE` = 1;
public const val `wlan_filter_list_type_gp_deny`: `WLAN_FILTER_LIST_TYPE` = 1;
public const val `wlan_filter_list_type_gp_permit`: `WLAN_FILTER_LIST_TYPE` = 0;
public const val `wlan_filter_list_type_user_deny`: `WLAN_FILTER_LIST_TYPE` = 3;
public const val `wlan_filter_list_type_user_permit`: `WLAN_FILTER_LIST_TYPE` = 2;
public const val `wlan_hosted_network_active`: `WLAN_HOSTED_NETWORK_STATE` = 2;
public const val `wlan_hosted_network_idle`: `WLAN_HOSTED_NETWORK_STATE` = 1;
public const val `wlan_hosted_network_opcode_connection_settings`: `WLAN_HOSTED_NETWORK_OPCODE` = 0;
public const val `wlan_hosted_network_opcode_enable`: `WLAN_HOSTED_NETWORK_OPCODE` = 3;
public const val `wlan_hosted_network_opcode_security_settings`: `WLAN_HOSTED_NETWORK_OPCODE` = 1;
public const val `wlan_hosted_network_opcode_station_profile`: `WLAN_HOSTED_NETWORK_OPCODE` = 2;
public const val `wlan_hosted_network_peer_state_authenticated`: `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE` = 1;
public const val `wlan_hosted_network_peer_state_change`: `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = 4097;
public const val `wlan_hosted_network_peer_state_invalid`: `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE` = 0;
public const val `wlan_hosted_network_radio_state_change`: `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = 4098;
public const val `wlan_hosted_network_reason_ap_start_failed`: `WLAN_HOSTED_NETWORK_REASON` = 19;
public const val `wlan_hosted_network_reason_bad_parameters`: `WLAN_HOSTED_NETWORK_REASON` = 2;
public const val `wlan_hosted_network_reason_client_abort`: `WLAN_HOSTED_NETWORK_REASON` = 18;
public const val `wlan_hosted_network_reason_crypt_error`: `WLAN_HOSTED_NETWORK_REASON` = 8;
public const val `wlan_hosted_network_reason_device_change`: `WLAN_HOSTED_NETWORK_REASON` = 25;
public const val `wlan_hosted_network_reason_elevation_required`: `WLAN_HOSTED_NETWORK_REASON` = 5;
public const val `wlan_hosted_network_reason_gp_denied`: `WLAN_HOSTED_NETWORK_REASON` = 23;
public const val `wlan_hosted_network_reason_impersonation`: `WLAN_HOSTED_NETWORK_REASON` = 9;
public const val `wlan_hosted_network_reason_incompatible_connection_started`: `WLAN_HOSTED_NETWORK_REASON` = 15;
public const val `wlan_hosted_network_reason_incompatible_connection_stopped`: `WLAN_HOSTED_NETWORK_REASON` = 16;
public const val `wlan_hosted_network_reason_insufficient_resources`: `WLAN_HOSTED_NETWORK_REASON` = 4;
public const val `wlan_hosted_network_reason_interface_available`: `WLAN_HOSTED_NETWORK_REASON` = 11;
public const val `wlan_hosted_network_reason_interface_unavailable`: `WLAN_HOSTED_NETWORK_REASON` = 12;
public const val `wlan_hosted_network_reason_miniport_started`: `WLAN_HOSTED_NETWORK_REASON` = 14;
public const val `wlan_hosted_network_reason_miniport_stopped`: `WLAN_HOSTED_NETWORK_REASON` = 13;
public const val `wlan_hosted_network_reason_peer_arrived`: `WLAN_HOSTED_NETWORK_REASON` = 20;
public const val `wlan_hosted_network_reason_peer_departed`: `WLAN_HOSTED_NETWORK_REASON` = 21;
public const val `wlan_hosted_network_reason_peer_timeout`: `WLAN_HOSTED_NETWORK_REASON` = 22;
public const val `wlan_hosted_network_reason_persistence_failed`: `WLAN_HOSTED_NETWORK_REASON` = 7;
public const val `wlan_hosted_network_reason_properties_change`: `WLAN_HOSTED_NETWORK_REASON` = 26;
public const val `wlan_hosted_network_reason_read_only`: `WLAN_HOSTED_NETWORK_REASON` = 6;
public const val `wlan_hosted_network_reason_service_available_on_virtual_station`: `WLAN_HOSTED_NETWORK_REASON` = 28;
public const val `wlan_hosted_network_reason_service_shutting_down`: `WLAN_HOSTED_NETWORK_REASON` = 3;
public const val `wlan_hosted_network_reason_service_unavailable`: `WLAN_HOSTED_NETWORK_REASON` = 24;
public const val `wlan_hosted_network_reason_stop_before_start`: `WLAN_HOSTED_NETWORK_REASON` = 10;
public const val `wlan_hosted_network_reason_success`: `WLAN_HOSTED_NETWORK_REASON` = 0;
public const val `wlan_hosted_network_reason_unspecified`: `WLAN_HOSTED_NETWORK_REASON` = 1;
public const val `wlan_hosted_network_reason_user_action`: `WLAN_HOSTED_NETWORK_REASON` = 17;
public const val `wlan_hosted_network_reason_virtual_station_blocking_use`: `WLAN_HOSTED_NETWORK_REASON` = 27;
public const val `wlan_hosted_network_state_change`: `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = 4096;
public const val `wlan_hosted_network_unavailable`: `WLAN_HOSTED_NETWORK_STATE` = 0;
public const val `wlan_ihv_control_type_driver`: `WLAN_IHV_CONTROL_TYPE` = 1;
public const val `wlan_ihv_control_type_service`: `WLAN_IHV_CONTROL_TYPE` = 0;
public const val `wlan_interface_state_ad_hoc_network_formed`: `WLAN_INTERFACE_STATE` = 2;
public const val `wlan_interface_state_associating`: `WLAN_INTERFACE_STATE` = 5;
public const val `wlan_interface_state_authenticating`: `WLAN_INTERFACE_STATE` = 7;
public const val `wlan_interface_state_connected`: `WLAN_INTERFACE_STATE` = 1;
public const val `wlan_interface_state_disconnected`: `WLAN_INTERFACE_STATE` = 4;
public const val `wlan_interface_state_disconnecting`: `WLAN_INTERFACE_STATE` = 3;
public const val `wlan_interface_state_discovering`: `WLAN_INTERFACE_STATE` = 6;
public const val `wlan_interface_state_not_ready`: `WLAN_INTERFACE_STATE` = 0;
public const val `wlan_interface_type_emulated_802_11`: `WLAN_INTERFACE_TYPE` = 0;
public const val `wlan_interface_type_invalid`: `WLAN_INTERFACE_TYPE` = 2;
public const val `wlan_interface_type_native_802_11`: `WLAN_INTERFACE_TYPE` = 1;
public const val `wlan_intf_opcode_autoconf_enabled`: `WLAN_INTF_OPCODE` = 1;
public const val `wlan_intf_opcode_autoconf_end`: `WLAN_INTF_OPCODE` = 268435455;
public const val `wlan_intf_opcode_autoconf_start`: `WLAN_INTF_OPCODE` = 0;
public const val `wlan_intf_opcode_background_scan_enabled`: `WLAN_INTF_OPCODE` = 2;
public const val `wlan_intf_opcode_bss_type`: `WLAN_INTF_OPCODE` = 5;
public const val `wlan_intf_opcode_certified_safe_mode`: `WLAN_INTF_OPCODE` = 14;
public const val `wlan_intf_opcode_channel_number`: `WLAN_INTF_OPCODE` = 8;
public const val `wlan_intf_opcode_current_connection`: `WLAN_INTF_OPCODE` = 7;
public const val `wlan_intf_opcode_current_operation_mode`: `WLAN_INTF_OPCODE` = 12;
public const val `wlan_intf_opcode_hosted_network_capable`: `WLAN_INTF_OPCODE` = 15;
public const val `wlan_intf_opcode_ihv_end`: `WLAN_INTF_OPCODE` = 1073741823;
public const val `wlan_intf_opcode_ihv_start`: `WLAN_INTF_OPCODE` = 805306368;
public const val `wlan_intf_opcode_interface_state`: `WLAN_INTF_OPCODE` = 6;
public const val `wlan_intf_opcode_management_frame_protection_capable`: `WLAN_INTF_OPCODE` = 16;
public const val `wlan_intf_opcode_media_streaming_mode`: `WLAN_INTF_OPCODE` = 3;
public const val `wlan_intf_opcode_msm_end`: `WLAN_INTF_OPCODE` = 536870911;
public const val `wlan_intf_opcode_msm_start`: `WLAN_INTF_OPCODE` = 268435712;
public const val `wlan_intf_opcode_radio_state`: `WLAN_INTF_OPCODE` = 4;
public const val `wlan_intf_opcode_rssi`: `WLAN_INTF_OPCODE` = 268435714;
public const val `wlan_intf_opcode_secondary_sta_interfaces`: `WLAN_INTF_OPCODE` = 17;
public const val `wlan_intf_opcode_secondary_sta_synchronized_connections`: `WLAN_INTF_OPCODE` = 18;
public const val `wlan_intf_opcode_security_end`: `WLAN_INTF_OPCODE` = 805306367;
public const val `wlan_intf_opcode_security_start`: `WLAN_INTF_OPCODE` = 536936448;
public const val `wlan_intf_opcode_statistics`: `WLAN_INTF_OPCODE` = 268435713;
public const val `wlan_intf_opcode_supported_adhoc_auth_cipher_pairs`: `WLAN_INTF_OPCODE` = 10;
public const val `wlan_intf_opcode_supported_country_or_region_string_list`: `WLAN_INTF_OPCODE` = 11;
public const val `wlan_intf_opcode_supported_infrastructure_auth_cipher_pairs`: `WLAN_INTF_OPCODE` = 9;
public const val `wlan_intf_opcode_supported_safe_mode`: `WLAN_INTF_OPCODE` = 13;
public const val `wlan_notification_acm_adhoc_network_state_change`: `WLAN_NOTIFICATION_ACM` = 22;
public const val `wlan_notification_acm_autoconf_disabled`: `WLAN_NOTIFICATION_ACM` = 2;
public const val `wlan_notification_acm_autoconf_enabled`: `WLAN_NOTIFICATION_ACM` = 1;
public const val `wlan_notification_acm_background_scan_disabled`: `WLAN_NOTIFICATION_ACM` = 4;
public const val `wlan_notification_acm_background_scan_enabled`: `WLAN_NOTIFICATION_ACM` = 3;
public const val `wlan_notification_acm_bss_type_change`: `WLAN_NOTIFICATION_ACM` = 5;
public const val `wlan_notification_acm_connection_attempt_fail`: `WLAN_NOTIFICATION_ACM` = 11;
public const val `wlan_notification_acm_connection_complete`: `WLAN_NOTIFICATION_ACM` = 10;
public const val `wlan_notification_acm_connection_start`: `WLAN_NOTIFICATION_ACM` = 9;
public const val `wlan_notification_acm_disconnected`: `WLAN_NOTIFICATION_ACM` = 21;
public const val `wlan_notification_acm_disconnecting`: `WLAN_NOTIFICATION_ACM` = 20;
public const val `wlan_notification_acm_end`: `WLAN_NOTIFICATION_ACM` = 28;
public const val `wlan_notification_acm_filter_list_change`: `WLAN_NOTIFICATION_ACM` = 12;
public const val `wlan_notification_acm_interface_arrival`: `WLAN_NOTIFICATION_ACM` = 13;
public const val `wlan_notification_acm_interface_removal`: `WLAN_NOTIFICATION_ACM` = 14;
public const val `wlan_notification_acm_network_available`: `WLAN_NOTIFICATION_ACM` = 19;
public const val `wlan_notification_acm_network_not_available`: `WLAN_NOTIFICATION_ACM` = 18;
public const val `wlan_notification_acm_operational_state_change`: `WLAN_NOTIFICATION_ACM` = 27;
public const val `wlan_notification_acm_power_setting_change`: `WLAN_NOTIFICATION_ACM` = 6;
public const val `wlan_notification_acm_profile_blocked`: `WLAN_NOTIFICATION_ACM` = 25;
public const val `wlan_notification_acm_profile_change`: `WLAN_NOTIFICATION_ACM` = 15;
public const val `wlan_notification_acm_profile_name_change`: `WLAN_NOTIFICATION_ACM` = 16;
public const val `wlan_notification_acm_profile_unblocked`: `WLAN_NOTIFICATION_ACM` = 23;
public const val `wlan_notification_acm_profiles_exhausted`: `WLAN_NOTIFICATION_ACM` = 17;
public const val `wlan_notification_acm_scan_complete`: `WLAN_NOTIFICATION_ACM` = 7;
public const val `wlan_notification_acm_scan_fail`: `WLAN_NOTIFICATION_ACM` = 8;
public const val `wlan_notification_acm_scan_list_refresh`: `WLAN_NOTIFICATION_ACM` = 26;
public const val `wlan_notification_acm_screen_power_change`: `WLAN_NOTIFICATION_ACM` = 24;
public const val `wlan_notification_acm_start`: `WLAN_NOTIFICATION_ACM` = 0;
public const val `wlan_notification_msm_adapter_operation_mode_change`: `WLAN_NOTIFICATION_MSM` = 14;
public const val `wlan_notification_msm_adapter_removal`: `WLAN_NOTIFICATION_MSM` = 13;
public const val `wlan_notification_msm_associated`: `WLAN_NOTIFICATION_MSM` = 2;
public const val `wlan_notification_msm_associating`: `WLAN_NOTIFICATION_MSM` = 1;
public const val `wlan_notification_msm_authenticating`: `WLAN_NOTIFICATION_MSM` = 3;
public const val `wlan_notification_msm_connected`: `WLAN_NOTIFICATION_MSM` = 4;
public const val `wlan_notification_msm_disassociating`: `WLAN_NOTIFICATION_MSM` = 9;
public const val `wlan_notification_msm_disconnected`: `WLAN_NOTIFICATION_MSM` = 10;
public const val `wlan_notification_msm_end`: `WLAN_NOTIFICATION_MSM` = 17;
public const val `wlan_notification_msm_link_degraded`: `WLAN_NOTIFICATION_MSM` = 15;
public const val `wlan_notification_msm_link_improved`: `WLAN_NOTIFICATION_MSM` = 16;
public const val `wlan_notification_msm_peer_join`: `WLAN_NOTIFICATION_MSM` = 11;
public const val `wlan_notification_msm_peer_leave`: `WLAN_NOTIFICATION_MSM` = 12;
public const val `wlan_notification_msm_radio_state_change`: `WLAN_NOTIFICATION_MSM` = 7;
public const val `wlan_notification_msm_roaming_end`: `WLAN_NOTIFICATION_MSM` = 6;
public const val `wlan_notification_msm_roaming_start`: `WLAN_NOTIFICATION_MSM` = 5;
public const val `wlan_notification_msm_signal_quality_change`: `WLAN_NOTIFICATION_MSM` = 8;
public const val `wlan_notification_msm_start`: `WLAN_NOTIFICATION_MSM` = 0;
public const val `wlan_notification_security_end`: `WLAN_NOTIFICATION_SECURITY` = 1;
public const val `wlan_notification_security_start`: `WLAN_NOTIFICATION_SECURITY` = 0;
public const val `wlan_opcode_value_type_invalid`: `WLAN_OPCODE_VALUE_TYPE` = 3;
public const val `wlan_opcode_value_type_query_only`: `WLAN_OPCODE_VALUE_TYPE` = 0;
public const val `wlan_opcode_value_type_set_by_group_policy`: `WLAN_OPCODE_VALUE_TYPE` = 1;
public const val `wlan_opcode_value_type_set_by_user`: `WLAN_OPCODE_VALUE_TYPE` = 2;
public const val `wlan_operational_state_going_off`: `WLAN_OPERATIONAL_STATE` = 3;
public const val `wlan_operational_state_going_on`: `WLAN_OPERATIONAL_STATE` = 4;
public const val `wlan_operational_state_off`: `WLAN_OPERATIONAL_STATE` = 1;
public const val `wlan_operational_state_on`: `WLAN_OPERATIONAL_STATE` = 2;
public const val `wlan_operational_state_unknown`: `WLAN_OPERATIONAL_STATE` = 0;
public const val `wlan_power_setting_invalid`: `WLAN_POWER_SETTING` = 4;
public const val `wlan_power_setting_low_saving`: `WLAN_POWER_SETTING` = 1;
public const val `wlan_power_setting_maximum_saving`: `WLAN_POWER_SETTING` = 3;
public const val `wlan_power_setting_medium_saving`: `WLAN_POWER_SETTING` = 2;
public const val `wlan_power_setting_no_saving`: `WLAN_POWER_SETTING` = 0;
public const val `wlan_secure_ac_enabled`: `WLAN_SECURABLE_OBJECT` = 2;
public const val `wlan_secure_add_new_all_user_profiles`: `WLAN_SECURABLE_OBJECT` = 9;
public const val `wlan_secure_add_new_per_user_profiles`: `WLAN_SECURABLE_OBJECT` = 10;
public const val `wlan_secure_all_user_profiles_order`: `WLAN_SECURABLE_OBJECT` = 8;
public const val `wlan_secure_bc_scan_enabled`: `WLAN_SECURABLE_OBJECT` = 3;
public const val `wlan_secure_bss_type`: `WLAN_SECURABLE_OBJECT` = 4;
public const val `wlan_secure_current_operation_mode`: `WLAN_SECURABLE_OBJECT` = 12;
public const val `wlan_secure_deny_list`: `WLAN_SECURABLE_OBJECT` = 1;
public const val `wlan_secure_get_plaintext_key`: `WLAN_SECURABLE_OBJECT` = 13;
public const val `wlan_secure_hosted_network_elevated_access`: `WLAN_SECURABLE_OBJECT` = 14;
public const val `wlan_secure_ihv_control`: `WLAN_SECURABLE_OBJECT` = 7;
public const val `wlan_secure_interface_properties`: `WLAN_SECURABLE_OBJECT` = 6;
public const val `wlan_secure_media_streaming_mode_enabled`: `WLAN_SECURABLE_OBJECT` = 11;
public const val `wlan_secure_permit_list`: `WLAN_SECURABLE_OBJECT` = 0;
public const val `wlan_secure_show_denied`: `WLAN_SECURABLE_OBJECT` = 5;
public const val `wlan_secure_virtual_station_extensibility`: `WLAN_SECURABLE_OBJECT` = 15;
public const val `wlan_secure_wfd_elevated_access`: `WLAN_SECURABLE_OBJECT` = 16;
