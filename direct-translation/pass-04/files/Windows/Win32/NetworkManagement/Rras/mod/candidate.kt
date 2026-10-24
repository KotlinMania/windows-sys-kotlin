// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmAddGroupMembershipEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmAddGroupMembershipEntry`(`hprotocol` : `super`.`super`.`Foundation`.`HANDLE`, `dwsourceaddr` : UInt, `dwsourcemask` : UInt, `dwgroupaddr` : UInt, `dwgroupmask` : UInt, `dwifindex` : UInt, `dwifnexthopipaddr` : UInt, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmDeRegisterMProtocol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmDeRegisterMProtocol`(`hprotocol` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmDeleteGroupMembershipEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmDeleteGroupMembershipEntry`(`hprotocol` : `super`.`super`.`Foundation`.`HANDLE`, `dwsourceaddr` : UInt, `dwsourcemask` : UInt, `dwgroupaddr` : UInt, `dwgroupmask` : UInt, `dwifindex` : UInt, `dwifnexthopipaddr` : UInt, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetFirstMfe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmGetFirstMfe`(`pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetFirstMfeStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmGetFirstMfeStats`(`pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetMfe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
public external fun `MgmGetMfe`(`pimm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IpHelper`.`MIB_IPMCAST_MFE`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetMfeStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
public external fun `MgmGetMfeStats`(`pimm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IpHelper`.`MIB_IPMCAST_MFE`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetNextMfe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
public external fun `MgmGetNextMfe`(`pimmstart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IpHelper`.`MIB_IPMCAST_MFE`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetNextMfeStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
public external fun `MgmGetNextMfeStats`(`pimmstart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`IpHelper`.`MIB_IPMCAST_MFE`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGetProtocolOnInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmGetProtocolOnInterface`(`dwifindex` : UInt, `dwifnexthopaddr` : UInt, `pdwifprotocolid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwifcomponentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGroupEnumerationEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmGroupEnumerationEnd`(`henum` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGroupEnumerationGetNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmGroupEnumerationGetNext`(`henum` : `super`.`super`.`Foundation`.`HANDLE`, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmGroupEnumerationStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmGroupEnumerationStart`(`hprotocol` : `super`.`super`.`Foundation`.`HANDLE`, `metenumtype` : `MGM_ENUM_TYPES`, `phenumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmRegisterMProtocol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmRegisterMProtocol`(`prpiinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTING_PROTOCOL_CONFIG`>?, `dwprotocolid` : UInt, `dwcomponentid` : UInt, `phprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmReleaseInterfaceOwnership; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmReleaseInterfaceOwnership`(`hprotocol` : `super`.`super`.`Foundation`.`HANDLE`, `dwifindex` : UInt, `dwifnexthopaddr` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=MgmTakeInterfaceOwnership; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MgmTakeInterfaceOwnership`(`hprotocol` : `super`.`super`.`Foundation`.`HANDLE`, `dwifindex` : UInt, `dwifnexthopaddr` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminBufferFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminBufferFree`(`pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminConnectionClearStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminConnectionClearStats`(`hrasserver` : Long, `hrasconnection` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminConnectionEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminConnectionEnum`(`hrasserver` : Long, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `dwprefmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwresumehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminConnectionEnumEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminConnectionEnumEx`(`hrasserver` : Long, `pobjectheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`MPRAPI_OBJECT_HEADER`>?, `dwpreferedmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pprasconn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RAS_CONNECTION_EX`>>?, `lpdwresumehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminConnectionGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminConnectionGetInfo`(`hrasserver` : Long, `dwlevel` : UInt, `hrasconnection` : `super`.`super`.`Foundation`.`HANDLE`, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminConnectionGetInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminConnectionGetInfoEx`(`hrasserver` : Long, `hrasconnection` : `super`.`super`.`Foundation`.`HANDLE`, `prasconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_EX`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminConnectionRemoveQuarantine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminConnectionRemoveQuarantine`(`hrasserver` : `super`.`super`.`Foundation`.`HANDLE`, `hrasconnection` : `super`.`super`.`Foundation`.`HANDLE`, `fisipaddress` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminDeregisterConnectionNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminDeregisterConnectionNotification`(`hmprserver` : Long, `heventnotification` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminDeviceEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminDeviceEnum`(`hmprserver` : Long, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminEstablishDomainRasServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminEstablishDomainRasServer`(`pszdomain` : `windows_sys`.`core`.`PCWSTR`, `pszmachine` : `windows_sys`.`core`.`PCWSTR`, `benable` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminGetErrorString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminGetErrorString`(`dwerror` : UInt, `lplpwserrorstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminGetPDCServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminGetPDCServer`(`lpszdomain` : `windows_sys`.`core`.`PCWSTR`, `lpszserver` : `windows_sys`.`core`.`PCWSTR`, `lpszpdcserver` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceConnect`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `fsynchronous` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceCreate`(`hmprserver` : Long, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `phinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceDelete`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceDeviceGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceDeviceGetInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwindex` : UInt, `dwlevel` : UInt, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceDeviceSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceDeviceSetInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwindex` : UInt, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceDisconnect`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceEnum`(`hmprserver` : Long, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `dwprefmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwresumehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceGetCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceGetCredentials`(`lpwsserver` : `windows_sys`.`core`.`PCWSTR`, `lpwsinterfacename` : `windows_sys`.`core`.`PCWSTR`, `lpwsusername` : `windows_sys`.`core`.`PWSTR`, `lpwspassword` : `windows_sys`.`core`.`PWSTR`, `lpwsdomainname` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceGetCredentialsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceGetCredentialsEx`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceGetCustomInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
public external fun `MprAdminInterfaceGetCustomInfoEx`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `pcustominfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_IF_CUSTOMINFOEX2`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceGetHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceGetHandle`(`hmprserver` : Long, `lpwsinterfacename` : `windows_sys`.`core`.`PCWSTR`, `phinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `fincludeclientinterfaces` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceGetInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceQueryUpdateResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceQueryUpdateResult`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwprotocolid` : UInt, `lpdwupdateresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceSetCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceSetCredentials`(`lpwsserver` : `windows_sys`.`core`.`PCWSTR`, `lpwsinterfacename` : `windows_sys`.`core`.`PCWSTR`, `lpwsusername` : `windows_sys`.`core`.`PCWSTR`, `lpwsdomainname` : `windows_sys`.`core`.`PCWSTR`, `lpwspassword` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceSetCredentialsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceSetCredentialsEx`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceSetCustomInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
public external fun `MprAdminInterfaceSetCustomInfoEx`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `pcustominfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MPR_IF_CUSTOMINFOEX2`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceSetInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceTransportAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceTransportAdd`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `pinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwinterfaceinfosize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceTransportGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceTransportGetInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `ppinterfaceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwinterfaceinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceTransportRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceTransportRemove`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceTransportSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceTransportSetInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `pinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwinterfaceinfosize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceUpdatePhonebookInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceUpdatePhonebookInfo`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminInterfaceUpdateRoutes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminInterfaceUpdateRoutes`(`hmprserver` : Long, `hinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwprotocolid` : UInt, `hevent` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminIsDomainRasServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminIsDomainRasServer`(`pszdomain` : `windows_sys`.`core`.`PCWSTR`, `pszmachine` : `windows_sys`.`core`.`PCWSTR`, `pbisrasserver` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminIsServiceInitialized; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminIsServiceInitialized`(`lpwsservername` : `windows_sys`.`core`.`PCWSTR`, `fisserviceinitialized` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminIsServiceRunning; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminIsServiceRunning`(`lpwsservername` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBBufferFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBBufferFree`(`pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBEntryCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBEntryCreate`(`hmibserver` : Long, `dwpid` : UInt, `dwroutingpid` : UInt, `lpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwentrysize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBEntryDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBEntryDelete`(`hmibserver` : Long, `dwprotocolid` : UInt, `dwroutingpid` : UInt, `lpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwentrysize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBEntryGet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBEntryGet`(`hmibserver` : Long, `dwprotocolid` : UInt, `dwroutingpid` : UInt, `lpinentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinentrysize` : UInt, `lplpoutentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `lpoutentrysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBEntryGetFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBEntryGetFirst`(`hmibserver` : Long, `dwprotocolid` : UInt, `dwroutingpid` : UInt, `lpinentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinentrysize` : UInt, `lplpoutentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `lpoutentrysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBEntryGetNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBEntryGetNext`(`hmibserver` : Long, `dwprotocolid` : UInt, `dwroutingpid` : UInt, `lpinentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinentrysize` : UInt, `lplpoutentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `lpoutentrysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBEntrySet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBEntrySet`(`hmibserver` : Long, `dwprotocolid` : UInt, `dwroutingpid` : UInt, `lpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwentrysize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBServerConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBServerConnect`(`lpwsservername` : `windows_sys`.`core`.`PCWSTR`, `phmibserver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminMIBServerDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminMIBServerDisconnect`(`hmibserver` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminPortClearStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminPortClearStats`(`hrasserver` : Long, `hport` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminPortDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminPortDisconnect`(`hrasserver` : Long, `hport` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminPortEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminPortEnum`(`hrasserver` : Long, `dwlevel` : UInt, `hrasconnection` : `super`.`super`.`Foundation`.`HANDLE`, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `dwprefmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwresumehandle` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminPortGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminPortGetInfo`(`hrasserver` : Long, `dwlevel` : UInt, `hport` : `super`.`super`.`Foundation`.`HANDLE`, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminPortReset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminPortReset`(`hrasserver` : Long, `hport` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminRegisterConnectionNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminRegisterConnectionNotification`(`hmprserver` : Long, `heventnotification` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminSendUserMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminSendUserMessage`(`hmprserver` : Long, `hconnection` : `super`.`super`.`Foundation`.`HANDLE`, `lpwszmessage` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminServerConnect`(`lpwsservername` : `windows_sys`.`core`.`PCWSTR`, `phmprserver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminServerDisconnect`(`hmprserver` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerGetCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminServerGetCredentials`(`hmprserver` : Long, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminServerGetInfo`(`hmprserver` : Long, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerGetInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `MprAdminServerGetInfoEx`(`hmprserver` : Long, `pserverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_SERVER_EX1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerSetCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminServerSetCredentials`(`hmprserver` : Long, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminServerSetInfo`(`hmprserver` : Long, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminServerSetInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `MprAdminServerSetInfoEx`(`hmprserver` : Long, `pserverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MPR_SERVER_SET_CONFIG_EX1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminTransportCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminTransportCreate`(`hmprserver` : Long, `dwtransportid` : UInt, `lpwstransportname` : `windows_sys`.`core`.`PCWSTR`, `pglobalinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwglobalinfosize` : UInt, `pclientinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwclientinterfaceinfosize` : UInt, `lpwsdllpath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminTransportGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminTransportGetInfo`(`hmprserver` : Long, `dwtransportid` : UInt, `ppglobalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwglobalinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppclientinterfaceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwclientinterfaceinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminTransportSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminTransportSetInfo`(`hmprserver` : Long, `dwtransportid` : UInt, `pglobalinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwglobalinfosize` : UInt, `pclientinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwclientinterfaceinfosize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminUpdateConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminUpdateConnection`(`hrasserver` : Long, `hrasconnection` : `super`.`super`.`Foundation`.`HANDLE`, `prasupdateconnection` : /* Rust *const */ kotlinx.cinterop.CPointer<`RAS_UPDATE_CONNECTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminUserGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminUserGetInfo`(`lpszserver` : `windows_sys`.`core`.`PCWSTR`, `lpszuser` : `windows_sys`.`core`.`PCWSTR`, `dwlevel` : UInt, `lpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprAdminUserSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprAdminUserSetInfo`(`lpszserver` : `windows_sys`.`core`.`PCWSTR`, `lpszuser` : `windows_sys`.`core`.`PCWSTR`, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigBufferFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigBufferFree`(`pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigFilterGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigFilterGetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `dwtransportid` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigFilterSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigFilterSetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `dwtransportid` : UInt, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigGetFriendlyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigGetFriendlyName`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `pszguidname` : `windows_sys`.`core`.`PCWSTR`, `pszbuffer` : `windows_sys`.`core`.`PWSTR`, `dwbuffersize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigGetGuidName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigGetGuidName`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `pszfriendlyname` : `windows_sys`.`core`.`PCWSTR`, `pszbuffer` : `windows_sys`.`core`.`PWSTR`, `dwbuffersize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceCreate`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `phrouterinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceDelete`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceEnum`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `dwprefmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceGetCustomInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
public external fun `MprConfigInterfaceGetCustomInfoEx`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `pcustominfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_IF_CUSTOMINFOEX2`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceGetHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceGetHandle`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `lpwsinterfacename` : `windows_sys`.`core`.`PCWSTR`, `phrouterinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceGetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceSetCustomInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
public external fun `MprConfigInterfaceSetCustomInfoEx`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `pcustominfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MPR_IF_CUSTOMINFOEX2`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceSetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceTransportAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceTransportAdd`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `lpwstransportname` : `windows_sys`.`core`.`PCWSTR`, `pinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwinterfaceinfosize` : UInt, `phrouteriftransport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceTransportEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceTransportEnum`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `dwprefmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceTransportGetHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceTransportGetHandle`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `phrouteriftransport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceTransportGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceTransportGetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `hrouteriftransport` : `super`.`super`.`Foundation`.`HANDLE`, `ppinterfaceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwinterfaceinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceTransportRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceTransportRemove`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `hrouteriftransport` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigInterfaceTransportSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigInterfaceTransportSetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hrouterinterface` : `super`.`super`.`Foundation`.`HANDLE`, `hrouteriftransport` : `super`.`super`.`Foundation`.`HANDLE`, `pinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwinterfaceinfosize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerBackup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerBackup`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `lpwspath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerConnect`(`lpwsservername` : `windows_sys`.`core`.`PCWSTR`, `phmprconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerDisconnect`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerGetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerGetInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `MprConfigServerGetInfoEx`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `pserverinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_SERVER_EX1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerInstall; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerInstall`(`dwlevel` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerRefresh; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerRefresh`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerRestore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerRestore`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `lpwspath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigServerSetInfo`(`hmprserver` : Long, `dwlevel` : UInt, `lpbbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigServerSetInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `MprConfigServerSetInfoEx`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `psetserverconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`MPR_SERVER_SET_CONFIG_EX1`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigTransportCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigTransportCreate`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `lpwstransportname` : `windows_sys`.`core`.`PCWSTR`, `pglobalinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwglobalinfosize` : UInt, `pclientinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwclientinterfaceinfosize` : UInt, `lpwsdllpath` : `windows_sys`.`core`.`PCWSTR`, `phroutertransport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigTransportDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigTransportDelete`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hroutertransport` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigTransportEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigTransportEnum`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwlevel` : UInt, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `dwprefmaxlen` : UInt, `lpdwentriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwtotalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwresumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigTransportGetHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigTransportGetHandle`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `dwtransportid` : UInt, `phroutertransport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigTransportGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigTransportGetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hroutertransport` : `super`.`super`.`Foundation`.`HANDLE`, `ppglobalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwglobalinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppclientinterfaceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `lpdwclientinterfaceinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplpwsdllpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprConfigTransportSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprConfigTransportSetInfo`(`hmprconfig` : `super`.`super`.`Foundation`.`HANDLE`, `hroutertransport` : `super`.`super`.`Foundation`.`HANDLE`, `pglobalinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwglobalinfosize` : UInt, `pclientinterfaceinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwclientinterfaceinfosize` : UInt, `lpwsdllpath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoBlockAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoBlockAdd`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfotype` : UInt, `dwitemsize` : UInt, `dwitemcount` : UInt, `lpitemdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lplpnewheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoBlockFind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoBlockFind`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfotype` : UInt, `lpdwitemsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwitemcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lplpitemdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoBlockQuerySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoBlockQuerySize`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoBlockRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoBlockRemove`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfotype` : UInt, `lplpnewheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoBlockSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoBlockSet`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinfotype` : UInt, `dwitemsize` : UInt, `dwitemcount` : UInt, `lpitemdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lplpnewheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoCreate`(`dwversion` : UInt, `lplpnewheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoDelete`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoDuplicate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoDuplicate`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lplpnewheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mprapi.dll, ABI=system, export=MprInfoRemoveAll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MprInfoRemoveAll`(`lpheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lplpnewheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasClearConnectionStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasClearConnectionStatistics`(`hrasconn` : `HRASCONN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasClearLinkStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasClearLinkStatistics`(`hrasconn` : `HRASCONN`, `dwsubentry` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasConnectionNotificationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasConnectionNotificationA`(`param0` : `HRASCONN`, `param1` : `super`.`super`.`Foundation`.`HANDLE`, `param2` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasConnectionNotificationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasConnectionNotificationW`(`param0` : `HRASCONN`, `param1` : `super`.`super`.`Foundation`.`HANDLE`, `param2` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasCreatePhonebookEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasCreatePhonebookEntryA`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasCreatePhonebookEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasCreatePhonebookEntryW`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasDeleteEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDeleteEntryA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasDeleteEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDeleteEntryW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasDeleteSubEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDeleteSubEntryA`(`pszphonebook` : `windows_sys`.`core`.`PCSTR`, `pszentry` : `windows_sys`.`core`.`PCSTR`, `dwsubentryid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasDeleteSubEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDeleteSubEntryW`(`pszphonebook` : `windows_sys`.`core`.`PCWSTR`, `pszentry` : `windows_sys`.`core`.`PCWSTR`, `dwsubentryid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasDialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDialA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALEXTENSIONS`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALPARAMSA`>?, `param3` : UInt, `param4` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRASCONN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasdlg.dll, ABI=system, export=RasDialDlgA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDialDlgA`(`lpszphonebook` : `windows_sys`.`core`.`PCSTR`, `lpszentry` : `windows_sys`.`core`.`PCSTR`, `lpszphonenumber` : `windows_sys`.`core`.`PCSTR`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALDLG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasdlg.dll, ABI=system, export=RasDialDlgW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDialDlgW`(`lpszphonebook` : `windows_sys`.`core`.`PCWSTR`, `lpszentry` : `windows_sys`.`core`.`PCWSTR`, `lpszphonenumber` : `windows_sys`.`core`.`PCWSTR`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALDLG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasDialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasDialW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALEXTENSIONS`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALPARAMSW`>?, `param3` : UInt, `param4` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRASCONN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEditPhonebookEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEditPhonebookEntryA`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEditPhonebookEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEditPhonebookEntryW`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasdlg.dll, ABI=system, export=RasEntryDlgA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEntryDlgA`(`lpszphonebook` : `windows_sys`.`core`.`PCSTR`, `lpszentry` : `windows_sys`.`core`.`PCSTR`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYDLGA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasdlg.dll, ABI=system, export=RasEntryDlgW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEntryDlgW`(`lpszphonebook` : `windows_sys`.`core`.`PCWSTR`, `lpszentry` : `windows_sys`.`core`.`PCWSTR`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYDLGW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumAutodialAddressesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumAutodialAddressesA`(`lpprasautodialaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `lpdwcbrasautodialaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwcrasautodialaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumAutodialAddressesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumAutodialAddressesW`(`lpprasautodialaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `lpdwcbrasautodialaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwcrasautodialaddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumConnectionsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumConnectionsA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCONNA`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumConnectionsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumConnectionsW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCONNW`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumDevicesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumDevicesA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDEVINFOA`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumDevicesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumDevicesW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDEVINFOW`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumEntriesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumEntriesA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYNAMEA`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasEnumEntriesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasEnumEntriesW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYNAMEW`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasFreeEapUserIdentityA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasFreeEapUserIdentityA`(`praseapuseridentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASEAPUSERIDENTITYA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasFreeEapUserIdentityW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasFreeEapUserIdentityW`(`praseapuseridentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASEAPUSERIDENTITYW`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetAutodialAddressA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetAutodialAddressA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASAUTODIALENTRYA`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetAutodialAddressW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetAutodialAddressW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASAUTODIALENTRYW`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetAutodialEnableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetAutodialEnableA`(`param0` : UInt, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetAutodialEnableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetAutodialEnableW`(`param0` : UInt, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetAutodialParamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetAutodialParamA`(`param0` : UInt, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetAutodialParamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetAutodialParamW`(`param0` : UInt, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetConnectStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasGetConnectStatusA`(`param0` : `HRASCONN`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCONNSTATUSA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetConnectStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasGetConnectStatusW`(`param0` : `HRASCONN`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCONNSTATUSW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetConnectionStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetConnectionStatistics`(`hrasconn` : `HRASCONN`, `lpstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_STATS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetCountryInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetCountryInfoA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCTRYINFO`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetCountryInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetCountryInfoW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCTRYINFO`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetCredentialsA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCREDENTIALSA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetCredentialsW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCREDENTIALSW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetCustomAuthDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetCustomAuthDataA`(`pszphonebook` : `windows_sys`.`core`.`PCSTR`, `pszentry` : `windows_sys`.`core`.`PCSTR`, `pbcustomauthdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwsizeofcustomauthdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetCustomAuthDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetCustomAuthDataW`(`pszphonebook` : `windows_sys`.`core`.`PCWSTR`, `pszentry` : `windows_sys`.`core`.`PCWSTR`, `pbcustomauthdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwsizeofcustomauthdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEapUserDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetEapUserDataA`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `pszphonebook` : `windows_sys`.`core`.`PCSTR`, `pszentry` : `windows_sys`.`core`.`PCSTR`, `pbeapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwsizeofeapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEapUserDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetEapUserDataW`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `pszphonebook` : `windows_sys`.`core`.`PCWSTR`, `pszentry` : `windows_sys`.`core`.`PCWSTR`, `pbeapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwsizeofeapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEapUserIdentityA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetEapUserIdentityA`(`pszphonebook` : `windows_sys`.`core`.`PCSTR`, `pszentry` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `ppraseapuseridentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RASEAPUSERIDENTITYA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEapUserIdentityW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetEapUserIdentityW`(`pszphonebook` : `windows_sys`.`core`.`PCWSTR`, `pszentry` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `ppraseapuseridentity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RASEAPUSERIDENTITYW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEntryDialParamsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetEntryDialParamsA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALPARAMSA`>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEntryDialParamsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetEntryDialParamsW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALPARAMSW`>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEntryPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasGetEntryPropertiesA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYA`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetEntryPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasGetEntryPropertiesW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYW`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetErrorStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetErrorStringA`(`resourceid` : UInt, `lpszstring` : `windows_sys`.`core`.`PSTR`, `inbufsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetErrorStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetErrorStringW`(`resourceid` : UInt, `lpszstring` : `windows_sys`.`core`.`PWSTR`, `inbufsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetLinkStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetLinkStatistics`(`hrasconn` : `HRASCONN`, `dwsubentry` : UInt, `lpstatistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_STATS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetPCscf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetPCscf`(`lpszpcscf` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetProjectionInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetProjectionInfoA`(`param0` : `HRASCONN`, `param1` : `RASPROJECTION`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetProjectionInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasGetProjectionInfoEx`(`hrasconn` : `HRASCONN`, `prasprojection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_PROJECTION_INFO`>?, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetProjectionInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetProjectionInfoW`(`param0` : `HRASCONN`, `param1` : `RASPROJECTION`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetSubEntryHandleA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetSubEntryHandleA`(`param0` : `HRASCONN`, `param1` : UInt, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRASCONN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetSubEntryHandleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetSubEntryHandleW`(`param0` : `HRASCONN`, `param1` : UInt, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRASCONN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetSubEntryPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetSubEntryPropertiesA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASSUBENTRYA`>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param6` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasGetSubEntryPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasGetSubEntryPropertiesW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASSUBENTRYW`>?, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param6` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasHangUpA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasHangUpA`(`param0` : `HRASCONN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasHangUpW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasHangUpW`(`param0` : `HRASCONN`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasInvokeEapUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasInvokeEapUI`(`param0` : `HRASCONN`, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALEXTENSIONS`>?, `param3` : `super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasdlg.dll, ABI=system, export=RasPhonebookDlgA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasPhonebookDlgA`(`lpszphonebook` : `windows_sys`.`core`.`PCSTR`, `lpszentry` : `windows_sys`.`core`.`PCSTR`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASPBDLGA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasdlg.dll, ABI=system, export=RasPhonebookDlgW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasPhonebookDlgW`(`lpszphonebook` : `windows_sys`.`core`.`PCWSTR`, `lpszentry` : `windows_sys`.`core`.`PCWSTR`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RASPBDLGW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasRenameEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasRenameEntryA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasRenameEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasRenameEntryW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetAutodialAddressA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetAutodialAddressA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASAUTODIALENTRYA`>?, `param3` : UInt, `param4` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetAutodialAddressW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetAutodialAddressW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASAUTODIALENTRYW`>?, `param3` : UInt, `param4` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetAutodialEnableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetAutodialEnableA`(`param0` : UInt, `param1` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetAutodialEnableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetAutodialEnableW`(`param0` : UInt, `param1` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetAutodialParamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetAutodialParamA`(`param0` : UInt, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param2` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetAutodialParamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetAutodialParamW`(`param0` : UInt, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param2` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetCredentialsA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASCREDENTIALSA`>?, `param3` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetCredentialsW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASCREDENTIALSW`>?, `param3` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetCustomAuthDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetCustomAuthDataA`(`pszphonebook` : `windows_sys`.`core`.`PCSTR`, `pszentry` : `windows_sys`.`core`.`PCSTR`, `pbcustomauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsizeofcustomauthdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetCustomAuthDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetCustomAuthDataW`(`pszphonebook` : `windows_sys`.`core`.`PCWSTR`, `pszentry` : `windows_sys`.`core`.`PCWSTR`, `pbcustomauthdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsizeofcustomauthdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetEapUserDataA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetEapUserDataA`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `pszphonebook` : `windows_sys`.`core`.`PCSTR`, `pszentry` : `windows_sys`.`core`.`PCSTR`, `pbeapdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsizeofeapdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetEapUserDataW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetEapUserDataW`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `pszphonebook` : `windows_sys`.`core`.`PCWSTR`, `pszentry` : `windows_sys`.`core`.`PCWSTR`, `pbeapdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsizeofeapdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetEntryDialParamsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetEntryDialParamsA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALPARAMSA`>?, `param2` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetEntryDialParamsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetEntryDialParamsW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASDIALPARAMSW`>?, `param2` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetEntryPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasSetEntryPropertiesA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASENTRYA`>?, `param3` : UInt, `param4` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param5` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetEntryPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasSetEntryPropertiesW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASENTRYW`>?, `param3` : UInt, `param4` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param5` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetSubEntryPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetSubEntryPropertiesA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : UInt, `param3` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASSUBENTRYA`>?, `param4` : UInt, `param5` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param6` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasSetSubEntryPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasSetSubEntryPropertiesW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : UInt, `param3` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASSUBENTRYW`>?, `param4` : UInt, `param5` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param6` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasUpdateConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RasUpdateConnection`(`hrasconn` : `HRASCONN`, `lprasupdateconn` : /* Rust *const */ kotlinx.cinterop.CPointer<`RASUPDATECONN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasValidateEntryNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasValidateEntryNameA`(`param0` : `windows_sys`.`core`.`PCSTR`, `param1` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rasapi32.dll, ABI=system, export=RasValidateEntryNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RasValidateEntryNameW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmAddNextHop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmAddNextHop`(`rtmreghandle` : Long, `nexthopinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NEXTHOP_INFO`>?, `nexthophandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `changeflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmAddRouteToDest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmAddRouteToDest`(`rtmreghandle` : Long, `routehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `destaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `routeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ROUTE_INFO`>?, `timetolive` : UInt, `routelisthandle` : Long, `notifytype` : UInt, `notifyhandle` : Long, `changeflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmBlockMethods; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmBlockMethods`(`rtmreghandle` : Long, `targethandle` : `super`.`super`.`Foundation`.`HANDLE`, `targettype` : UByte, `blockingflag` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmConvertIpv6AddressAndLengthToNetAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RtmConvertIpv6AddressAndLengthToNetAddress`(`pnetaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `address` : `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`, `dwlength` : UInt, `dwaddresssize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmConvertNetAddressToIpv6AddressAndLength; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `RtmConvertNetAddressToIpv6AddressAndLength`(`pnetaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `paddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`>?, `plength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwaddresssize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmCreateDestEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmCreateDestEnum`(`rtmreghandle` : Long, `targetviews` : UInt, `enumflags` : UInt, `netaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `protocolid` : UInt, `rtmenumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmCreateNextHopEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmCreateNextHopEnum`(`rtmreghandle` : Long, `enumflags` : UInt, `netaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `rtmenumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmCreateRouteEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmCreateRouteEnum`(`rtmreghandle` : Long, `desthandle` : Long, `targetviews` : UInt, `enumflags` : UInt, `startdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `matchingflags` : UInt, `criteriaroute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ROUTE_INFO`>?, `criteriainterface` : UInt, `rtmenumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmCreateRouteList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmCreateRouteList`(`rtmreghandle` : Long, `routelisthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmCreateRouteListEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmCreateRouteListEnum`(`rtmreghandle` : Long, `routelisthandle` : Long, `rtmenumhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmDeleteEnumHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmDeleteEnumHandle`(`rtmreghandle` : Long, `enumhandle` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmDeleteNextHop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmDeleteNextHop`(`rtmreghandle` : Long, `nexthophandle` : Long, `nexthopinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NEXTHOP_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmDeleteRouteList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmDeleteRouteList`(`rtmreghandle` : Long, `routelisthandle` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmDeleteRouteToDest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmDeleteRouteToDest`(`rtmreghandle` : Long, `routehandle` : Long, `changeflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmDeregisterEntity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmDeregisterEntity`(`rtmreghandle` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmDeregisterFromChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmDeregisterFromChangeNotification`(`rtmreghandle` : Long, `notifyhandle` : Long) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmFindNextHop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmFindNextHop`(`rtmreghandle` : Long, `nexthopinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NEXTHOP_INFO`>?, `nexthophandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `nexthoppointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RTM_NEXTHOP_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetChangeStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetChangeStatus`(`rtmreghandle` : Long, `notifyhandle` : Long, `desthandle` : Long, `changestatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetChangedDests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetChangedDests`(`rtmreghandle` : Long, `notifyhandle` : Long, `numdests` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `changeddests` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetDestInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetDestInfo`(`rtmreghandle` : Long, `desthandle` : Long, `protocolid` : UInt, `targetviews` : UInt, `destinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetEntityInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetEntityInfo`(`rtmreghandle` : Long, `entityhandle` : Long, `entityinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetEntityMethods; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetEntityMethods`(`rtmreghandle` : Long, `entityhandle` : Long, `nummethods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `exptmethods` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_EXPORT_METHOD`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetEnumDests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetEnumDests`(`rtmreghandle` : Long, `enumhandle` : Long, `numdests` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `destinfos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetEnumNextHops; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetEnumNextHops`(`rtmreghandle` : Long, `enumhandle` : Long, `numnexthops` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nexthophandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetEnumRoutes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetEnumRoutes`(`rtmreghandle` : Long, `enumhandle` : Long, `numroutes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `routehandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetExactMatchDestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetExactMatchDestination`(`rtmreghandle` : Long, `destaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `protocolid` : UInt, `targetviews` : UInt, `destinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetExactMatchRoute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetExactMatchRoute`(`rtmreghandle` : Long, `destaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `matchingflags` : UInt, `routeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ROUTE_INFO`>?, `interfaceindex` : UInt, `targetviews` : UInt, `routehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetLessSpecificDestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetLessSpecificDestination`(`rtmreghandle` : Long, `desthandle` : Long, `protocolid` : UInt, `targetviews` : UInt, `destinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetListEnumRoutes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetListEnumRoutes`(`rtmreghandle` : Long, `enumhandle` : Long, `numroutes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `routehandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetMostSpecificDestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetMostSpecificDestination`(`rtmreghandle` : Long, `destaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?, `protocolid` : UInt, `targetviews` : UInt, `destinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetNextHopInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetNextHopInfo`(`rtmreghandle` : Long, `nexthophandle` : Long, `nexthopinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NEXTHOP_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetNextHopPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetNextHopPointer`(`rtmreghandle` : Long, `nexthophandle` : Long, `nexthoppointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RTM_NEXTHOP_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetOpaqueInformationPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetOpaqueInformationPointer`(`rtmreghandle` : Long, `desthandle` : Long, `opaqueinfopointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetRegisteredEntities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetRegisteredEntities`(`rtmreghandle` : Long, `numentities` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `entityhandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `entityinfos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetRouteInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetRouteInfo`(`rtmreghandle` : Long, `routehandle` : Long, `routeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ROUTE_INFO`>?, `destaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NET_ADDRESS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmGetRoutePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmGetRoutePointer`(`rtmreghandle` : Long, `routehandle` : Long, `routepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RTM_ROUTE_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmHoldDestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmHoldDestination`(`rtmreghandle` : Long, `desthandle` : Long, `targetviews` : UInt, `holdtime` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmIgnoreChangedDests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmIgnoreChangedDests`(`rtmreghandle` : Long, `notifyhandle` : Long, `numdests` : UInt, `changeddests` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmInsertInRouteList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmInsertInRouteList`(`rtmreghandle` : Long, `routelisthandle` : Long, `numroutes` : UInt, `routehandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmInvokeMethod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmInvokeMethod`(`rtmreghandle` : Long, `entityhandle` : Long, `input` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_METHOD_INPUT`>?, `outputsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `output` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_METHOD_OUTPUT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmIsBestRoute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmIsBestRoute`(`rtmreghandle` : Long, `routehandle` : Long, `bestinviews` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmIsMarkedForChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmIsMarkedForChangeNotification`(`rtmreghandle` : Long, `notifyhandle` : Long, `desthandle` : Long, `destmarked` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmLockDestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmLockDestination`(`rtmreghandle` : Long, `desthandle` : Long, `exclusive` : `windows_sys`.`core`.`BOOL`, `lockdest` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmLockNextHop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmLockNextHop`(`rtmreghandle` : Long, `nexthophandle` : Long, `exclusive` : `windows_sys`.`core`.`BOOL`, `locknexthop` : `windows_sys`.`core`.`BOOL`, `nexthoppointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RTM_NEXTHOP_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmLockRoute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmLockRoute`(`rtmreghandle` : Long, `routehandle` : Long, `exclusive` : `windows_sys`.`core`.`BOOL`, `lockroute` : `windows_sys`.`core`.`BOOL`, `routepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RTM_ROUTE_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmMarkDestForChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmMarkDestForChangeNotification`(`rtmreghandle` : Long, `notifyhandle` : Long, `desthandle` : Long, `markdest` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReferenceHandles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReferenceHandles`(`rtmreghandle` : Long, `numhandles` : UInt, `rtmhandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmRegisterEntity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmRegisterEntity`(`rtmentityinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_INFO`>?, `exportmethods` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_EXPORT_METHODS`>?, `eventcallback` : `RTM_EVENT_CALLBACK`, `reserveopaquepointer` : `windows_sys`.`core`.`BOOL`, `rtmregprofile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_REGN_PROFILE`>?, `rtmreghandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmRegisterForChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmRegisterForChangeNotification`(`rtmreghandle` : Long, `targetviews` : UInt, `notifyflags` : UInt, `notifycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `notifyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseChangedDests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseChangedDests`(`rtmreghandle` : Long, `notifyhandle` : Long, `numdests` : UInt, `changeddests` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseDestInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseDestInfo`(`rtmreghandle` : Long, `destinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseDests; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseDests`(`rtmreghandle` : Long, `numdests` : UInt, `destinfos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_DEST_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseEntities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseEntities`(`rtmreghandle` : Long, `numentities` : UInt, `entityhandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseEntityInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseEntityInfo`(`rtmreghandle` : Long, `entityinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseNextHopInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseNextHopInfo`(`rtmreghandle` : Long, `nexthopinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_NEXTHOP_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseNextHops; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseNextHops`(`rtmreghandle` : Long, `numnexthops` : UInt, `nexthophandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseRouteInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseRouteInfo`(`rtmreghandle` : Long, `routeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ROUTE_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmReleaseRoutes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmReleaseRoutes`(`rtmreghandle` : Long, `numroutes` : UInt, `routehandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=RtmUpdateAndUnlockRoute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtmUpdateAndUnlockRoute`(`rtmreghandle` : Long, `routehandle` : Long, `timetolive` : UInt, `routelisthandle` : Long, `notifytype` : UInt, `notifyhandle` : Long, `changeflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
public const val `ALLOW_NO_AUTH`: UInt = 1u;
public const val `ALL_SOURCES`: `MGM_ENUM_TYPES` = 1;
public const val `ANY_SOURCE`: `MGM_ENUM_TYPES` = 0;
public const val `ATADDRESSLEN`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTH_VALIDATION_EX` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `hRasConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wszUserName`: UShortArray,
    public var `wszLogonDomain`: UShortArray,
    public var `AuthInfoSize`: UInt,
    public var `AuthInfo`: UByteArray,
)
// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTH_VALIDATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DO_NOT_ALLOW_NO_AUTH`: UInt = 0u;
public const val `ERROR_ACCESSING_TCPCFGDLL`: UInt = 727u;
public const val `ERROR_ACCT_DISABLED`: UInt = 647u;
public const val `ERROR_ACCT_EXPIRED`: UInt = 708u;
public const val `ERROR_ACTION_REQUIRED`: UInt = 877u;
public const val `ERROR_ALLOCATING_MEMORY`: UInt = 664u;
public const val `ERROR_ALREADY_DISCONNECTING`: UInt = 617u;
public const val `ERROR_ASYNC_REQUEST_PENDING`: UInt = 616u;
public const val `ERROR_AUTHENTICATION_FAILURE`: UInt = 691u;
public const val `ERROR_AUTH_INTERNAL`: UInt = 645u;
public const val `ERROR_AUTOMATIC_VPN_FAILED`: UInt = 800u;
public const val `ERROR_BAD_ADDRESS_SPECIFIED`: UInt = 769u;
public const val `ERROR_BAD_CALLBACK_NUMBER`: UInt = 704u;
public const val `ERROR_BAD_PHONE_NUMBER`: UInt = 749u;
public const val `ERROR_BAD_STRING`: UInt = 637u;
public const val `ERROR_BAD_USAGE_IN_INI_FILE`: UInt = 669u;
public const val `ERROR_BIPLEX_PORT_NOT_AVAILABLE`: UInt = 712u;
public const val `ERROR_BLOCKED`: UInt = 775u;
public const val `ERROR_BROADBAND_ACTIVE`: UInt = 813u;
public const val `ERROR_BROADBAND_NO_NIC`: UInt = 814u;
public const val `ERROR_BROADBAND_TIMEOUT`: UInt = 815u;
public const val `ERROR_BUFFER_INVALID`: UInt = 610u;
public const val `ERROR_BUFFER_TOO_SMALL`: UInt = 603u;
public const val `ERROR_BUNDLE_NOT_FOUND`: UInt = 754u;
public const val `ERROR_CANNOT_DELETE`: UInt = 817u;
public const val `ERROR_CANNOT_DO_CUSTOMDIAL`: UInt = 755u;
public const val `ERROR_CANNOT_FIND_PHONEBOOK_ENTRY`: UInt = 623u;
public const val `ERROR_CANNOT_GET_LANA`: UInt = 639u;
public const val `ERROR_CANNOT_INITIATE_MOBIKE_UPDATE`: UInt = 844u;
public const val `ERROR_CANNOT_LOAD_PHONEBOOK`: UInt = 622u;
public const val `ERROR_CANNOT_LOAD_STRING`: UInt = 626u;
public const val `ERROR_CANNOT_OPEN_PHONEBOOK`: UInt = 621u;
public const val `ERROR_CANNOT_PROJECT_CLIENT`: UInt = 634u;
public const val `ERROR_CANNOT_SET_PORT_INFO`: UInt = 605u;
public const val `ERROR_CANNOT_SHARE_CONNECTION`: UInt = 763u;
public const val `ERROR_CANNOT_USE_LOGON_CREDENTIALS`: UInt = 739u;
public const val `ERROR_CANNOT_WRITE_PHONEBOOK`: UInt = 624u;
public const val `ERROR_CERT_FOR_ENCRYPTION_NOT_FOUND`: UInt = 781u;
public const val `ERROR_CHANGING_PASSWORD`: UInt = 709u;
public const val `ERROR_CMD_TOO_LONG`: UInt = 700u;
public const val `ERROR_CONGESTION`: UInt = 771u;
public const val `ERROR_CONNECTING_DEVICE_NOT_FOUND`: UInt = 797u;
public const val `ERROR_CONNECTION_ALREADY_SHARED`: UInt = 758u;
public const val `ERROR_CONNECTION_REJECT`: UInt = 770u;
public const val `ERROR_CORRUPT_PHONEBOOK`: UInt = 625u;
public const val `ERROR_DCB_NOT_FOUND`: UInt = 694u;
public const val `ERROR_DEFAULTOFF_MACRO_NOT_FOUND`: UInt = 656u;
public const val `ERROR_DEVICENAME_NOT_FOUND`: UInt = 659u;
public const val `ERROR_DEVICENAME_TOO_LONG`: UInt = 658u;
public const val `ERROR_DEVICETYPE_DOES_NOT_EXIST`: UInt = 609u;
public const val `ERROR_DEVICE_COMPLIANCE`: UInt = 875u;
public const val `ERROR_DEVICE_DOES_NOT_EXIST`: UInt = 608u;
public const val `ERROR_DEVICE_NOT_READY`: UInt = 666u;
public const val `ERROR_DIAL_ALREADY_IN_PROGRESS`: UInt = 756u;
public const val `ERROR_DISCONNECTION`: UInt = 628u;
public const val `ERROR_DNSNAME_NOT_RESOLVABLE`: UInt = 868u;
public const val `ERROR_DONOTDISTURB`: UInt = 776u;
public const val `ERROR_EAPTLS_CACHE_CREDENTIALS_INVALID`: UInt = 826u;
public const val `ERROR_EAPTLS_PASSWD_INVALID`: UInt = 869u;
public const val `ERROR_EAPTLS_SCARD_CACHE_CREDENTIALS_INVALID`: UInt = 847u;
public const val `ERROR_EAP_METHOD_DOES_NOT_SUPPORT_SSO`: UInt = 851u;
public const val `ERROR_EAP_METHOD_NOT_INSTALLED`: UInt = 850u;
public const val `ERROR_EAP_METHOD_OPERATION_NOT_SUPPORTED`: UInt = 852u;
public const val `ERROR_EAP_SERVER_CERT_EXPIRED`: UInt = 858u;
public const val `ERROR_EAP_SERVER_CERT_INVALID`: UInt = 857u;
public const val `ERROR_EAP_SERVER_CERT_OTHER_ERROR`: UInt = 860u;
public const val `ERROR_EAP_SERVER_CERT_REVOKED`: UInt = 859u;
public const val `ERROR_EAP_SERVER_ROOT_CERT_INVALID`: UInt = 865u;
public const val `ERROR_EAP_SERVER_ROOT_CERT_NAME_REQUIRED`: UInt = 866u;
public const val `ERROR_EAP_SERVER_ROOT_CERT_NOT_FOUND`: UInt = 864u;
public const val `ERROR_EAP_USER_CERT_EXPIRED`: UInt = 854u;
public const val `ERROR_EAP_USER_CERT_INVALID`: UInt = 853u;
public const val `ERROR_EAP_USER_CERT_OTHER_ERROR`: UInt = 856u;
public const val `ERROR_EAP_USER_CERT_REVOKED`: UInt = 855u;
public const val `ERROR_EAP_USER_ROOT_CERT_EXPIRED`: UInt = 863u;
public const val `ERROR_EAP_USER_ROOT_CERT_INVALID`: UInt = 862u;
public const val `ERROR_EAP_USER_ROOT_CERT_NOT_FOUND`: UInt = 861u;
public const val `ERROR_EMPTY_INI_FILE`: UInt = 690u;
public const val `ERROR_EVENT_INVALID`: UInt = 607u;
public const val `ERROR_FAILED_CP_REQUIRED`: UInt = 841u;
public const val `ERROR_FAILED_TO_ENCRYPT`: UInt = 768u;
public const val `ERROR_FAST_USER_SWITCH`: UInt = 831u;
public const val `ERROR_FEATURE_DEPRECATED`: UInt = 816u;
public const val `ERROR_FILE_COULD_NOT_BE_OPENED`: UInt = 657u;
public const val `ERROR_FROM_DEVICE`: UInt = 651u;
public const val `ERROR_HANGUP_FAILED`: UInt = 753u;
public const val `ERROR_HARDWARE_FAILURE`: UInt = 630u;
public const val `ERROR_HIBERNATION`: UInt = 832u;
public const val `ERROR_IDLE_TIMEOUT`: UInt = 828u;
public const val `ERROR_IKEV2_PSK_INTERFACE_ALREADY_EXISTS`: UInt = 870u;
public const val `ERROR_INCOMPATIBLE`: UInt = 772u;
public const val `ERROR_INTERACTIVE_MODE`: UInt = 703u;
public const val `ERROR_INTERNAL_ADDRESS_FAILURE`: UInt = 840u;
public const val `ERROR_INVALID_AUTH_STATE`: UInt = 705u;
public const val `ERROR_INVALID_CALLBACK_NUMBER`: UInt = 751u;
public const val `ERROR_INVALID_COMPRESSION_SPECIFIED`: UInt = 613u;
public const val `ERROR_INVALID_DESTINATION_IP`: UInt = 871u;
public const val `ERROR_INVALID_FUNCTION_FOR_ENTRY`: UInt = 780u;
public const val `ERROR_INVALID_INTERFACE_CONFIG`: UInt = 872u;
public const val `ERROR_INVALID_MSCHAPV2_CONFIG`: UInt = 805u;
public const val `ERROR_INVALID_PEAP_COOKIE_ATTRIBUTES`: UInt = 849u;
public const val `ERROR_INVALID_PEAP_COOKIE_CONFIG`: UInt = 803u;
public const val `ERROR_INVALID_PEAP_COOKIE_USER`: UInt = 804u;
public const val `ERROR_INVALID_PORT_HANDLE`: UInt = 601u;
public const val `ERROR_INVALID_PREFERENCES`: UInt = 846u;
public const val `ERROR_INVALID_SERVER_CERT`: UInt = 835u;
public const val `ERROR_INVALID_SIZE`: UInt = 632u;
public const val `ERROR_INVALID_SMM`: UInt = 745u;
public const val `ERROR_INVALID_TUNNELID`: UInt = 837u;
public const val `ERROR_INVALID_VPNSTRATEGY`: UInt = 825u;
public const val `ERROR_IN_COMMAND`: UInt = 681u;
public const val `ERROR_IPSEC_SERVICE_STOPPED`: UInt = 827u;
public const val `ERROR_IPXCP_DIALOUT_ALREADY_ACTIVE`: UInt = 726u;
public const val `ERROR_IPXCP_NET_NUMBER_CONFLICT`: UInt = 744u;
public const val `ERROR_IPXCP_NO_DIALIN_CONFIGURED`: UInt = 725u;
public const val `ERROR_IPXCP_NO_DIALOUT_CONFIGURED`: UInt = 724u;
public const val `ERROR_IP_CONFIGURATION`: UInt = 716u;
public const val `ERROR_KEY_NOT_FOUND`: UInt = 627u;
public const val `ERROR_LINE_BUSY`: UInt = 676u;
public const val `ERROR_LINK_FAILURE`: UInt = 829u;
public const val `ERROR_MACRO_NOT_DEFINED`: UInt = 654u;
public const val `ERROR_MACRO_NOT_FOUND`: UInt = 653u;
public const val `ERROR_MESSAGE_MACRO_NOT_FOUND`: UInt = 655u;
public const val `ERROR_MOBIKE_DISABLED`: UInt = 843u;
public const val `ERROR_NAME_EXISTS_ON_NET`: UInt = 642u;
public const val `ERROR_NETBIOS_ERROR`: UInt = 640u;
public const val `ERROR_NOT_BINARY_MACRO`: UInt = 693u;
public const val `ERROR_NOT_NAP_CAPABLE`: UInt = 836u;
public const val `ERROR_NO_ACTIVE_ISDN_LINES`: UInt = 713u;
public const val `ERROR_NO_ANSWER`: UInt = 678u;
public const val `ERROR_NO_CARRIER`: UInt = 679u;
public const val `ERROR_NO_CERTIFICATE`: UInt = 766u;
public const val `ERROR_NO_COMMAND_FOUND`: UInt = 661u;
public const val `ERROR_NO_CONNECTION`: UInt = 668u;
public const val `ERROR_NO_DIALIN_PERMISSION`: UInt = 649u;
public const val `ERROR_NO_DIALTONE`: UInt = 680u;
public const val `ERROR_NO_DIFF_USER_AT_LOGON`: UInt = 784u;
public const val `ERROR_NO_EAPTLS_CERTIFICATE`: UInt = 798u;
public const val `ERROR_NO_ENDPOINTS`: UInt = 620u;
public const val `ERROR_NO_IP_ADDRESSES`: UInt = 717u;
public const val `ERROR_NO_IP_RAS_ADAPTER`: UInt = 728u;
public const val `ERROR_NO_ISDN_CHANNELS_AVAILABLE`: UInt = 714u;
public const val `ERROR_NO_LOCAL_ENCRYPTION`: UInt = 741u;
public const val `ERROR_NO_MAC_FOR_PORT`: UInt = 747u;
public const val `ERROR_NO_REG_CERT_AT_LOGON`: UInt = 785u;
public const val `ERROR_NO_REMOTE_ENCRYPTION`: UInt = 742u;
public const val `ERROR_NO_RESPONSES`: UInt = 660u;
public const val `ERROR_NO_SMART_CARD_READER`: UInt = 764u;
public const val `ERROR_NUMBERCHANGED`: UInt = 773u;
public const val `ERROR_OAKLEY_ATTRIB_FAIL`: UInt = 788u;
public const val `ERROR_OAKLEY_AUTH_FAIL`: UInt = 787u;
public const val `ERROR_OAKLEY_ERROR`: UInt = 793u;
public const val `ERROR_OAKLEY_GENERAL_PROCESSING`: UInt = 789u;
public const val `ERROR_OAKLEY_NO_CERT`: UInt = 786u;
public const val `ERROR_OAKLEY_NO_PEER_CERT`: UInt = 790u;
public const val `ERROR_OAKLEY_NO_POLICY`: UInt = 791u;
public const val `ERROR_OAKLEY_TIMED_OUT`: UInt = 792u;
public const val `ERROR_OUTOFORDER`: UInt = 777u;
public const val `ERROR_OUT_OF_BUFFERS`: UInt = 614u;
public const val `ERROR_OVERRUN`: UInt = 710u;
public const val `ERROR_PARTIAL_RESPONSE_LOOPING`: UInt = 697u;
public const val `ERROR_PASSWD_EXPIRED`: UInt = 648u;
public const val `ERROR_PEAP_CRYPTOBINDING_INVALID`: UInt = 823u;
public const val `ERROR_PEAP_CRYPTOBINDING_NOTRECEIVED`: UInt = 824u;
public const val `ERROR_PEAP_IDENTITY_MISMATCH`: UInt = 867u;
public const val `ERROR_PEAP_SERVER_REJECTED_CLIENT_TLV`: UInt = 845u;
public const val `ERROR_PHONE_NUMBER_TOO_LONG`: UInt = 723u;
public const val `ERROR_PLUGIN_NOT_INSTALLED`: UInt = 876u;
public const val `ERROR_PORT_ALREADY_OPEN`: UInt = 602u;
public const val `ERROR_PORT_DISCONNECTED`: UInt = 619u;
public const val `ERROR_PORT_NOT_AVAILABLE`: UInt = 633u;
public const val `ERROR_PORT_NOT_CONFIGURED`: UInt = 665u;
public const val `ERROR_PORT_NOT_CONNECTED`: UInt = 606u;
public const val `ERROR_PORT_NOT_FOUND`: UInt = 615u;
public const val `ERROR_PORT_NOT_OPEN`: UInt = 618u;
public const val `ERROR_PORT_OR_DEVICE`: UInt = 692u;
public const val `ERROR_PPP_CP_REJECTED`: UInt = 733u;
public const val `ERROR_PPP_INVALID_PACKET`: UInt = 722u;
public const val `ERROR_PPP_LCP_TERMINATED`: UInt = 734u;
public const val `ERROR_PPP_LOOPBACK_DETECTED`: UInt = 737u;
public const val `ERROR_PPP_NCP_TERMINATED`: UInt = 736u;
public const val `ERROR_PPP_NOT_CONVERGING`: UInt = 732u;
public const val `ERROR_PPP_NO_ADDRESS_ASSIGNED`: UInt = 738u;
public const val `ERROR_PPP_NO_PROTOCOLS_CONFIGURED`: UInt = 720u;
public const val `ERROR_PPP_NO_RESPONSE`: UInt = 721u;
public const val `ERROR_PPP_REMOTE_TERMINATED`: UInt = 719u;
public const val `ERROR_PPP_REQUIRED_ADDRESS_REJECTED`: UInt = 735u;
public const val `ERROR_PPP_TIMEOUT`: UInt = 718u;
public const val `ERROR_PROJECTION_NOT_COMPLETE`: UInt = 730u;
public const val `ERROR_PROTOCOL_ENGINE_DISABLED`: UInt = 839u;
public const val `ERROR_PROTOCOL_NOT_CONFIGURED`: UInt = 731u;
public const val `ERROR_RASAUTO_CANNOT_INITIALIZE`: UInt = 757u;
public const val `ERROR_RASMAN_CANNOT_INITIALIZE`: UInt = 711u;
public const val `ERROR_RASMAN_SERVICE_STOPPED`: UInt = 834u;
public const val `ERROR_RASQEC_CONN_DOESNOTEXIST`: UInt = 821u;
public const val `ERROR_RASQEC_NAPAGENT_NOT_CONNECTED`: UInt = 820u;
public const val `ERROR_RASQEC_NAPAGENT_NOT_ENABLED`: UInt = 819u;
public const val `ERROR_RASQEC_RESOURCE_CREATION_FAILED`: UInt = 818u;
public const val `ERROR_RASQEC_TIMEOUT`: UInt = 822u;
public const val `ERROR_READING_DEFAULTOFF`: UInt = 689u;
public const val `ERROR_READING_DEVICENAME`: UInt = 672u;
public const val `ERROR_READING_DEVICETYPE`: UInt = 671u;
public const val `ERROR_READING_INI_FILE`: UInt = 667u;
public const val `ERROR_READING_MAXCARRIERBPS`: UInt = 675u;
public const val `ERROR_READING_MAXCONNECTBPS`: UInt = 674u;
public const val `ERROR_READING_SCARD`: UInt = 802u;
public const val `ERROR_READING_SECTIONNAME`: UInt = 670u;
public const val `ERROR_READING_USAGE`: UInt = 673u;
public const val `ERROR_RECV_BUF_FULL`: UInt = 699u;
public const val `ERROR_REMOTE_DISCONNECTION`: UInt = 629u;
public const val `ERROR_REMOTE_REQUIRES_ENCRYPTION`: UInt = 743u;
public const val `ERROR_REQUEST_TIMEOUT`: UInt = 638u;
public const val `ERROR_RESTRICTED_LOGON_HOURS`: UInt = 646u;
public const val `ERROR_ROUTE_NOT_ALLOCATED`: UInt = 612u;
public const val `ERROR_ROUTE_NOT_AVAILABLE`: UInt = 611u;
public const val `ERROR_SCRIPT_SYNTAX`: UInt = 752u;
public const val `ERROR_SERVER_GENERAL_NET_FAILURE`: UInt = 643u;
public const val `ERROR_SERVER_NOT_RESPONDING`: UInt = 650u;
public const val `ERROR_SERVER_OUT_OF_RESOURCES`: UInt = 641u;
public const val `ERROR_SERVER_POLICY`: UInt = 812u;
public const val `ERROR_SHARE_CONNECTION_FAILED`: UInt = 761u;
public const val `ERROR_SHARING_ADDRESS_EXISTS`: UInt = 765u;
public const val `ERROR_SHARING_CHANGE_FAILED`: UInt = 759u;
public const val `ERROR_SHARING_HOST_ADDRESS_CONFLICT`: UInt = 799u;
public const val `ERROR_SHARING_MULTIPLE_ADDRESSES`: UInt = 767u;
public const val `ERROR_SHARING_NO_PRIVATE_LAN`: UInt = 783u;
public const val `ERROR_SHARING_PRIVATE_INSTALL`: UInt = 762u;
public const val `ERROR_SHARING_ROUTER_INSTALL`: UInt = 760u;
public const val `ERROR_SHARING_RRAS_CONFLICT`: UInt = 782u;
public const val `ERROR_SLIP_REQUIRES_IP`: UInt = 729u;
public const val `ERROR_SMART_CARD_REQUIRED`: UInt = 779u;
public const val `ERROR_SMM_TIMEOUT`: UInt = 748u;
public const val `ERROR_SMM_UNINITIALIZED`: UInt = 746u;
public const val `ERROR_SSO_CERT_MISSING`: UInt = 874u;
public const val `ERROR_SSTP_COOKIE_SET_FAILURE`: UInt = 848u;
public const val `ERROR_STATE_MACHINES_ALREADY_STARTED`: UInt = 696u;
public const val `ERROR_STATE_MACHINES_NOT_STARTED`: UInt = 695u;
public const val `ERROR_SYSTEM_SUSPENDED`: UInt = 833u;
public const val `ERROR_TAPI_CONFIGURATION`: UInt = 740u;
public const val `ERROR_TEMPFAILURE`: UInt = 774u;
public const val `ERROR_TOO_MANY_LINE_ERRORS`: UInt = 715u;
public const val `ERROR_TS_UNACCEPTABLE`: UInt = 842u;
public const val `ERROR_UNABLE_TO_AUTHENTICATE_SERVER`: UInt = 778u;
public const val `ERROR_UNEXPECTED_RESPONSE`: UInt = 702u;
public const val `ERROR_UNKNOWN`: UInt = 635u;
public const val `ERROR_UNKNOWN_DEVICE_TYPE`: UInt = 663u;
public const val `ERROR_UNKNOWN_FRAMED_PROTOCOL`: UInt = 794u;
public const val `ERROR_UNKNOWN_RESPONSE_KEY`: UInt = 698u;
public const val `ERROR_UNKNOWN_SERVICE_TYPE`: UInt = 796u;
public const val `ERROR_UNRECOGNIZED_RESPONSE`: UInt = 652u;
public const val `ERROR_UNSUPPORTED_BPS`: UInt = 701u;
public const val `ERROR_UPDATECONNECTION_REQUEST_IN_PROCESS`: UInt = 838u;
public const val `ERROR_USER_DISCONNECTION`: UInt = 631u;
public const val `ERROR_USER_LOGOFF`: UInt = 830u;
public const val `ERROR_VALIDATING_SERVER_CERT`: UInt = 801u;
public const val `ERROR_VOICE_ANSWER`: UInt = 677u;
public const val `ERROR_VPN_BAD_CERT`: UInt = 810u;
public const val `ERROR_VPN_BAD_PSK`: UInt = 811u;
public const val `ERROR_VPN_DISCONNECT`: UInt = 807u;
public const val `ERROR_VPN_GRE_BLOCKED`: UInt = 806u;
public const val `ERROR_VPN_PLUGIN_GENERIC`: UInt = 873u;
public const val `ERROR_VPN_REFUSED`: UInt = 808u;
public const val `ERROR_VPN_TIMEOUT`: UInt = 809u;
public const val `ERROR_WRITING_DEFAULTOFF`: UInt = 688u;
public const val `ERROR_WRITING_DEVICENAME`: UInt = 684u;
public const val `ERROR_WRITING_DEVICETYPE`: UInt = 683u;
public const val `ERROR_WRITING_INITBPS`: UInt = 706u;
public const val `ERROR_WRITING_MAXCARRIERBPS`: UInt = 686u;
public const val `ERROR_WRITING_MAXCONNECTBPS`: UInt = 685u;
public const val `ERROR_WRITING_SECTIONNAME`: UInt = 682u;
public const val `ERROR_WRITING_USAGE`: UInt = 687u;
public const val `ERROR_WRONG_DEVICE_ATTACHED`: UInt = 636u;
public const val `ERROR_WRONG_INFO_SPECIFIED`: UInt = 604u;
public const val `ERROR_WRONG_KEY_SPECIFIED`: UInt = 662u;
public const val `ERROR_WRONG_MODULE`: UInt = 750u;
public const val `ERROR_WRONG_TUNNEL_TYPE`: UInt = 795u;
public const val `ERROR_X25_DIAGNOSTIC`: UInt = 707u;
public const val `ET_None`: UInt = 0u;
public const val `ET_Optional`: UInt = 3u;
public const val `ET_Require`: UInt = 1u;
public const val `ET_RequireMax`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GRE_CONFIG_PARAMS0` (
    public var `dwNumPorts`: UInt,
    public var `dwPortFlags`: UInt,
)
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRASCONN` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IKEV2_CONFIG_PARAMS` (
    public var `dwNumPorts`: UInt,
    public var `dwPortFlags`: UInt,
    public var `dwTunnelConfigParamFlags`: UInt,
    public var `TunnelConfigParams`: `IKEV2_TUNNEL_CONFIG_PARAMS4`,
)
public typealias `IKEV2_ID_PAYLOAD_TYPE` = Int;
public const val `IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_DN`: `IKEV2_ID_PAYLOAD_TYPE` = 9;
public const val `IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_GN`: `IKEV2_ID_PAYLOAD_TYPE` = 10;
public const val `IKEV2_ID_PAYLOAD_TYPE_FQDN`: `IKEV2_ID_PAYLOAD_TYPE` = 2;
public const val `IKEV2_ID_PAYLOAD_TYPE_ID_IPV6_ADDR`: `IKEV2_ID_PAYLOAD_TYPE` = 5;
public const val `IKEV2_ID_PAYLOAD_TYPE_INVALID`: `IKEV2_ID_PAYLOAD_TYPE` = 0;
public const val `IKEV2_ID_PAYLOAD_TYPE_IPV4_ADDR`: `IKEV2_ID_PAYLOAD_TYPE` = 1;
public const val `IKEV2_ID_PAYLOAD_TYPE_KEY_ID`: `IKEV2_ID_PAYLOAD_TYPE` = 11;
public const val `IKEV2_ID_PAYLOAD_TYPE_MAX`: `IKEV2_ID_PAYLOAD_TYPE` = 12;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED1`: `IKEV2_ID_PAYLOAD_TYPE` = 4;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED2`: `IKEV2_ID_PAYLOAD_TYPE` = 6;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED3`: `IKEV2_ID_PAYLOAD_TYPE` = 7;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED4`: `IKEV2_ID_PAYLOAD_TYPE` = 8;
public const val `IKEV2_ID_PAYLOAD_TYPE_RFC822_ADDR`: `IKEV2_ID_PAYLOAD_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEV2_PROJECTION_INFO` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `wszAddress`: UShortArray,
    public var `wszRemoteAddress`: UShortArray,
    public var `IPv4SubInterfaceIndex`: ULong,
    public var `dwIPv6NegotiationError`: UInt,
    public var `bInterfaceIdentifier`: UByteArray,
    public var `bRemoteInterfaceIdentifier`: UByteArray,
    public var `bPrefix`: UByteArray,
    public var `dwPrefixLength`: UInt,
    public var `IPv6SubInterfaceIndex`: ULong,
    public var `dwOptions`: UInt,
    public var `dwAuthenticationProtocol`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwCompressionAlgorithm`: UInt,
    public var `dwEncryptionMethod`: UInt,
)
// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEV2_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKEV2_PROJECTION_INFO2` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `wszAddress`: UShortArray,
    public var `wszRemoteAddress`: UShortArray,
    public var `IPv4SubInterfaceIndex`: ULong,
    public var `dwIPv6NegotiationError`: UInt,
    public var `bInterfaceIdentifier`: UByteArray,
    public var `bRemoteInterfaceIdentifier`: UByteArray,
    public var `bPrefix`: UByteArray,
    public var `dwPrefixLength`: UInt,
    public var `IPv6SubInterfaceIndex`: ULong,
    public var `dwOptions`: UInt,
    public var `dwAuthenticationProtocol`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwEmbeddedEAPTypeId`: UInt,
    public var `dwCompressionAlgorithm`: UInt,
    public var `dwEncryptionMethod`: UInt,
)
// UNSUPPORTED Rust 674:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKEV2_PROJECTION_INFO2 {
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
public class `IKEV2_TUNNEL_CONFIG_PARAMS2` (
    public var `dwIdleTimeout`: UInt,
    public var `dwNetworkBlackoutTime`: UInt,
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSizeForRenegotiation`: UInt,
    public var `dwConfigOptions`: UInt,
    public var `dwTotalCertificates`: UInt,
    public var `certificateNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`>?,
    public var `machineCertificateName`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `dwEncryptionType`: UInt,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
)
// UNSUPPORTED Rust 694:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for IKEV2_TUNNEL_CONFIG_PARAMS2 {
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
public class `IKEV2_TUNNEL_CONFIG_PARAMS3` (
    public var `dwIdleTimeout`: UInt,
    public var `dwNetworkBlackoutTime`: UInt,
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSizeForRenegotiation`: UInt,
    public var `dwConfigOptions`: UInt,
    public var `dwTotalCertificates`: UInt,
    public var `certificateNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`>?,
    public var `machineCertificateName`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `dwEncryptionType`: UInt,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
    public var `dwTotalEkus`: UInt,
    public var `certificateEKUs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_CERT_EKU`>?,
    public var `machineCertificateHash`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 718:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for IKEV2_TUNNEL_CONFIG_PARAMS3 {
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
public class `IKEV2_TUNNEL_CONFIG_PARAMS4` (
    public var `dwIdleTimeout`: UInt,
    public var `dwNetworkBlackoutTime`: UInt,
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSizeForRenegotiation`: UInt,
    public var `dwConfigOptions`: UInt,
    public var `dwTotalCertificates`: UInt,
    public var `certificateNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`>?,
    public var `machineCertificateName`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `dwEncryptionType`: UInt,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
    public var `dwTotalEkus`: UInt,
    public var `certificateEKUs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_CERT_EKU`>?,
    public var `machineCertificateHash`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `dwMmSaLifeTime`: UInt,
)
// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for IKEV2_TUNNEL_CONFIG_PARAMS4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPADDRESSLEN`: UInt = 15u;
public const val `IPV6_ADDRESS_LEN_IN_BYTES`: UInt = 16u;
public const val `IPXADDRESSLEN`: UInt = 22u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `L2TP_CONFIG_PARAMS0` (
    public var `dwNumPorts`: UInt,
    public var `dwPortFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `L2TP_CONFIG_PARAMS1` (
    public var `dwNumPorts`: UInt,
    public var `dwPortFlags`: UInt,
    public var `dwTunnelConfigParamFlags`: UInt,
    public var `TunnelConfigParams`: `L2TP_TUNNEL_CONFIG_PARAMS2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `L2TP_TUNNEL_CONFIG_PARAMS1` (
    public var `dwIdleTimeout`: UInt,
    public var `dwEncryptionType`: UInt,
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSizeForRenegotiation`: UInt,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
)
// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for L2TP_TUNNEL_CONFIG_PARAMS1 {
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
public class `L2TP_TUNNEL_CONFIG_PARAMS2` (
    public var `dwIdleTimeout`: UInt,
    public var `dwEncryptionType`: UInt,
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSizeForRenegotiation`: UInt,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
    public var `dwMmSaLifeTime`: UInt,
)
// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for L2TP_TUNNEL_CONFIG_PARAMS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAXIPADRESSLEN`: UInt = 64u;
public const val `MAX_SSTP_HASH_SIZE`: UInt = 32u;
public const val `METHOD_BGP4_AS_PATH`: UInt = 1u;
public const val `METHOD_BGP4_NEXTHOP_ATTR`: UInt = 8u;
public const val `METHOD_BGP4_PA_ORIGIN`: UInt = 4u;
public const val `METHOD_BGP4_PEER_ID`: UInt = 2u;
public const val `METHOD_RIP2_NEIGHBOUR_ADDR`: UInt = 1u;
public const val `METHOD_RIP2_OUTBOUND_INTF`: UInt = 2u;
public const val `METHOD_RIP2_ROUTE_TAG`: UInt = 4u;
public const val `METHOD_RIP2_ROUTE_TIMESTAMP`: UInt = 8u;
public const val `METHOD_TYPE_ALL_METHODS`: UInt = 4294967295u;
public typealias `MGM_ENUM_TYPES` = Int;
public const val `MGM_FORWARD_STATE_FLAG`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MGM_IF_ENTRY` (
    public var `dwIfIndex`: UInt,
    public var `dwIfNextHopAddr`: UInt,
    public var `bIGMP`: `windows_sys`.`core`.`BOOL`,
    public var `bIsEnabled`: `windows_sys`.`core`.`BOOL`,
)
public const val `MGM_JOIN_STATE_FLAG`: UInt = 1u;
public const val `MGM_MFE_STATS_0`: UInt = 1u;
public const val `MGM_MFE_STATS_1`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPRAPI_ADMIN_DLL_CALLBACKS` (
    public var `revision`: UByte,
    public var `lpfnMprAdminGetIpAddressForUser`: `PMPRADMINGETIPADDRESSFORUSER`,
    public var `lpfnMprAdminReleaseIpAddress`: `PMPRADMINRELEASEIPADRESS`,
    public var `lpfnMprAdminGetIpv6AddressForUser`: `PMPRADMINGETIPV6ADDRESSFORUSER`,
    public var `lpfnMprAdminReleaseIpV6AddressForUser`: `PMPRADMINRELEASEIPV6ADDRESSFORUSER`,
    public var `lpfnRasAdminAcceptNewLink`: `PMPRADMINACCEPTNEWLINK`,
    public var `lpfnRasAdminLinkHangupNotification`: `PMPRADMINLINKHANGUPNOTIFICATION`,
    public var `lpfnRasAdminTerminateDll`: `PMPRADMINTERMINATEDLL`,
    public var `lpfnRasAdminAcceptNewConnectionEx`: `PMPRADMINACCEPTNEWCONNECTIONEX`,
    public var `lpfnRasAdminAcceptEndpointChangeEx`: `PMPRADMINACCEPTTUNNELENDPOINTCHANGEEX`,
    public var `lpfnRasAdminAcceptReauthenticationEx`: `PMPRADMINACCEPTREAUTHENTICATIONEX`,
    public var `lpfnRasAdminConnectionHangupNotificationEx`: `PMPRADMINCONNECTIONHANGUPNOTIFICATIONEX`,
    public var `lpfnRASValidatePreAuthenticatedConnectionEx`: `PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEX`,
)
public const val `MPRAPI_ADMIN_DLL_VERSION_1`: UInt = 1u;
public const val `MPRAPI_ADMIN_DLL_VERSION_2`: UInt = 2u;
public const val `MPRAPI_IF_CUSTOM_CONFIG_FOR_IKEV2`: UInt = 1u;
public const val `MPRAPI_IKEV2_AUTH_USING_CERT`: UInt = 1u;
public const val `MPRAPI_IKEV2_AUTH_USING_EAP`: UInt = 2u;
public const val `MPRAPI_IKEV2_PROJECTION_INFO_TYPE`: UInt = 2u;
public const val `MPRAPI_IKEV2_SET_TUNNEL_CONFIG_PARAMS`: UInt = 1u;
public const val `MPRAPI_L2TP_SET_TUNNEL_CONFIG_PARAMS`: UInt = 1u;
public const val `MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_2`: UInt = 2u;
public const val `MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_3`: UInt = 3u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_2`: UInt = 2u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_3`: UInt = 3u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_4`: UInt = 4u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_5`: UInt = 5u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_2`: UInt = 2u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_3`: UInt = 3u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_4`: UInt = 4u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_5`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPRAPI_OBJECT_HEADER` (
    public var `revision`: UByte,
    public var `type`: UByte,
    public var `size`: UShort,
)
public typealias `MPRAPI_OBJECT_TYPE` = Int;
public const val `MPRAPI_OBJECT_TYPE_AUTH_VALIDATION_OBJECT`: `MPRAPI_OBJECT_TYPE` = 4;
public const val `MPRAPI_OBJECT_TYPE_IF_CUSTOM_CONFIG_OBJECT`: `MPRAPI_OBJECT_TYPE` = 6;
public const val `MPRAPI_OBJECT_TYPE_MPR_SERVER_OBJECT`: `MPRAPI_OBJECT_TYPE` = 2;
public const val `MPRAPI_OBJECT_TYPE_MPR_SERVER_SET_CONFIG_OBJECT`: `MPRAPI_OBJECT_TYPE` = 3;
public const val `MPRAPI_OBJECT_TYPE_RAS_CONNECTION_OBJECT`: `MPRAPI_OBJECT_TYPE` = 1;
public const val `MPRAPI_OBJECT_TYPE_UPDATE_CONNECTION_OBJECT`: `MPRAPI_OBJECT_TYPE` = 5;
public const val `MPRAPI_PPP_PROJECTION_INFO_TYPE`: UInt = 1u;
public const val `MPRAPI_RAS_CONNECTION_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_RAS_UPDATE_CONNECTION_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_GRE`: UInt = 16u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_IKEV2`: UInt = 8u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_L2TP`: UInt = 2u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_PPTP`: UInt = 1u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_SSTP`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPRAPI_TUNNEL_CONFIG_PARAMS0` (
    public var `IkeConfigParams`: `IKEV2_CONFIG_PARAMS`,
    public var `PptpConfigParams`: `PPTP_CONFIG_PARAMS`,
    public var `L2tpConfigParams`: `L2TP_CONFIG_PARAMS1`,
    public var `SstpConfigParams`: `SSTP_CONFIG_PARAMS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPRAPI_TUNNEL_CONFIG_PARAMS1` (
    public var `IkeConfigParams`: `IKEV2_CONFIG_PARAMS`,
    public var `PptpConfigParams`: `PPTP_CONFIG_PARAMS`,
    public var `L2tpConfigParams`: `L2TP_CONFIG_PARAMS1`,
    public var `SstpConfigParams`: `SSTP_CONFIG_PARAMS`,
    public var `GREConfigParams`: `GRE_CONFIG_PARAMS0`,
)
public const val `MPRDM_DialAll`: `MPR_INTERFACE_DIAL_MODE` = 1u;
public const val `MPRDM_DialAsNeeded`: `MPR_INTERFACE_DIAL_MODE` = 2u;
public const val `MPRDM_DialFirst`: `MPR_INTERFACE_DIAL_MODE` = 0u;
// UNSUPPORTED Rust 902:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Atm: windows_sys::core::PCWSTR = windows_sys::core::w!("ATM");

// UNSUPPORTED Rust 903:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_FrameRelay: windows_sys::core::PCWSTR = windows_sys::core::w!("FRAMERELAY");

// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Generic: windows_sys::core::PCWSTR = windows_sys::core::w!("GENERIC");

// UNSUPPORTED Rust 905:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Irda: windows_sys::core::PCWSTR = windows_sys::core::w!("IRDA");

// UNSUPPORTED Rust 906:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Isdn: windows_sys::core::PCWSTR = windows_sys::core::w!("isdn");

// UNSUPPORTED Rust 907:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Modem: windows_sys::core::PCWSTR = windows_sys::core::w!("modem");

// UNSUPPORTED Rust 908:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Pad: windows_sys::core::PCWSTR = windows_sys::core::w!("pad");

// UNSUPPORTED Rust 909:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Parallel: windows_sys::core::PCWSTR = windows_sys::core::w!("PARALLEL");

// UNSUPPORTED Rust 910:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_SW56: windows_sys::core::PCWSTR = windows_sys::core::w!("SW56");

// UNSUPPORTED Rust 911:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Serial: windows_sys::core::PCWSTR = windows_sys::core::w!("SERIAL");

// UNSUPPORTED Rust 912:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Sonet: windows_sys::core::PCWSTR = windows_sys::core::w!("SONET");

// UNSUPPORTED Rust 913:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_Vpn: windows_sys::core::PCWSTR = windows_sys::core::w!("vpn");

// UNSUPPORTED Rust 914:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MPRDT_X25: windows_sys::core::PCWSTR = windows_sys::core::w!("x25");

public const val `MPRET_Direct`: UInt = 3u;
public const val `MPRET_Phone`: UInt = 1u;
public const val `MPRET_Vpn`: UInt = 2u;
public const val `MPRIDS_Disabled`: UInt = 4294967295u;
public const val `MPRIDS_UseGlobalValue`: UInt = 0u;
public const val `MPRIO_DisableLcpExtensions`: UInt = 32u;
public const val `MPRIO_IpHeaderCompression`: UInt = 8u;
public const val `MPRIO_IpSecPreSharedKey`: UInt = 2147483648u;
public const val `MPRIO_NetworkLogon`: UInt = 8192u;
public const val `MPRIO_PromoteAlternates`: UInt = 32768u;
public const val `MPRIO_RemoteDefaultGateway`: UInt = 16u;
public const val `MPRIO_RequireCHAP`: UInt = 134217728u;
public const val `MPRIO_RequireDataEncryption`: UInt = 4096u;
public const val `MPRIO_RequireEAP`: UInt = 131072u;
public const val `MPRIO_RequireEncryptedPw`: UInt = 1024u;
public const val `MPRIO_RequireMachineCertificates`: UInt = 16777216u;
public const val `MPRIO_RequireMsCHAP`: UInt = 268435456u;
public const val `MPRIO_RequireMsCHAP2`: UInt = 536870912u;
public const val `MPRIO_RequireMsEncryptedPw`: UInt = 2048u;
public const val `MPRIO_RequirePAP`: UInt = 262144u;
public const val `MPRIO_RequireSPAP`: UInt = 524288u;
public const val `MPRIO_SecureLocalFiles`: UInt = 65536u;
public const val `MPRIO_SharedPhoneNumbers`: UInt = 8388608u;
public const val `MPRIO_SpecificIpAddr`: UInt = 2u;
public const val `MPRIO_SpecificNameServers`: UInt = 4u;
public const val `MPRIO_SwCompression`: UInt = 512u;
public const val `MPRIO_UsePreSharedKeyForIkev2Initiator`: UInt = 33554432u;
public const val `MPRIO_UsePreSharedKeyForIkev2Responder`: UInt = 67108864u;
public const val `MPRNP_Ip`: UInt = 4u;
public const val `MPRNP_Ipv6`: UInt = 8u;
public const val `MPRNP_Ipx`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_CERT_EKU` (
    public var `dwSize`: UInt,
    public var `IsEKUOID`: `windows_sys`.`core`.`BOOL`,
    public var `pwszEKU`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 953:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_CERT_EKU {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_CREDENTIALSEX_0` (
    public var `dwSize`: UInt,
    public var `lpbCredentialsInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 964:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_CREDENTIALSEX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_CREDENTIALSEX_1` (
    public var `dwSize`: UInt,
    public var `lpbCredentialsInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 975:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_CREDENTIALSEX_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_DEVICE_0` (
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
)
// UNSUPPORTED Rust 986:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_DEVICE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_DEVICE_1` (
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szLocalPhoneNumber`: UShortArray,
    public var `szAlternates`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 999:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_DEVICE_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_ENABLE_RAS_ON_DEVICE`: UInt = 1u;
public const val `MPR_ENABLE_ROUTING_ON_DEVICE`: UInt = 2u;
public typealias `MPR_ET` = UInt;
public const val `MPR_ET_None`: `MPR_ET` = 0u;
public const val `MPR_ET_Optional`: `MPR_ET` = 3u;
public const val `MPR_ET_Require`: `MPR_ET` = 1u;
public const val `MPR_ET_RequireMax`: `MPR_ET` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_FILTER_0` (
    public var `fEnable`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 41 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_IFTRANSPORT_0` (
    public var `dwTransportId`: UInt,
    public var `hIfTransport`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wszIfTransportName`: UShortArray,
)
// UNSUPPORTED Rust 1023:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_IFTRANSPORT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_IF_CUSTOMINFOEX0` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `dwFlags`: UInt,
    public var `customIkev2Config`: `ROUTER_IKEv2_IF_CUSTOM_CONFIG0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_IF_CUSTOMINFOEX1` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `dwFlags`: UInt,
    public var `customIkev2Config`: `ROUTER_IKEv2_IF_CUSTOM_CONFIG1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_IF_CUSTOMINFOEX2` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `dwFlags`: UInt,
    public var `customIkev2Config`: `ROUTER_IKEv2_IF_CUSTOM_CONFIG2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_INTERFACE_0` (
    public var `wszInterfaceName`: UShortArray,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `fEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dwIfType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionState`: `ROUTER_CONNECTION_STATE`,
    public var `fUnReachabilityReasons`: UInt,
    public var `dwLastError`: UInt,
)
// UNSUPPORTED Rust 1063:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_INTERFACE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_INTERFACE_1` (
    public var `wszInterfaceName`: UShortArray,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `fEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dwIfType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionState`: `ROUTER_CONNECTION_STATE`,
    public var `fUnReachabilityReasons`: UInt,
    public var `dwLastError`: UInt,
    public var `lpwsDialoutHoursRestriction`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1080:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_INTERFACE_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 201 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_INTERFACE_2` (
    public var `wszInterfaceName`: UShortArray,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `fEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dwIfType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionState`: `ROUTER_CONNECTION_STATE`,
    public var `fUnReachabilityReasons`: UInt,
    public var `dwLastError`: UInt,
    public var `dwfOptions`: UInt,
    public var `szLocalPhoneNumber`: UShortArray,
    public var `szAlternates`: `windows_sys`.`core`.`PWSTR`,
    public var `ipaddr`: UInt,
    public var `ipaddrDns`: UInt,
    public var `ipaddrDnsAlt`: UInt,
    public var `ipaddrWins`: UInt,
    public var `ipaddrWinsAlt`: UInt,
    public var `dwfNetProtocols`: UInt,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szX25PadType`: UShortArray,
    public var `szX25Address`: UShortArray,
    public var `szX25Facilities`: UShortArray,
    public var `szX25UserData`: UShortArray,
    public var `dwChannels`: UInt,
    public var `dwSubEntries`: UInt,
    public var `dwDialMode`: `MPR_INTERFACE_DIAL_MODE`,
    public var `dwDialExtraPercent`: UInt,
    public var `dwDialExtraSampleSeconds`: UInt,
    public var `dwHangUpExtraPercent`: UInt,
    public var `dwHangUpExtraSampleSeconds`: UInt,
    public var `dwIdleDisconnectSeconds`: UInt,
    public var `dwType`: UInt,
    public var `dwEncryptionType`: `MPR_ET`,
    public var `dwCustomAuthKey`: UInt,
    public var `dwCustomAuthDataSize`: UInt,
    public var `lpbCustomAuthData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `guidId`: `windows_sys`.`core`.`GUID`,
    public var `dwVpnStrategy`: `MPR_VS`,
)
// UNSUPPORTED Rust 1126:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_INTERFACE_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 201 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_INTERFACE_3` (
    public var `wszInterfaceName`: UShortArray,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `fEnabled`: `windows_sys`.`core`.`BOOL`,
    public var `dwIfType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionState`: `ROUTER_CONNECTION_STATE`,
    public var `fUnReachabilityReasons`: UInt,
    public var `dwLastError`: UInt,
    public var `dwfOptions`: UInt,
    public var `szLocalPhoneNumber`: UShortArray,
    public var `szAlternates`: `windows_sys`.`core`.`PWSTR`,
    public var `ipaddr`: UInt,
    public var `ipaddrDns`: UInt,
    public var `ipaddrDnsAlt`: UInt,
    public var `ipaddrWins`: UInt,
    public var `ipaddrWinsAlt`: UInt,
    public var `dwfNetProtocols`: UInt,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szX25PadType`: UShortArray,
    public var `szX25Address`: UShortArray,
    public var `szX25Facilities`: UShortArray,
    public var `szX25UserData`: UShortArray,
    public var `dwChannels`: UInt,
    public var `dwSubEntries`: UInt,
    public var `dwDialMode`: `MPR_INTERFACE_DIAL_MODE`,
    public var `dwDialExtraPercent`: UInt,
    public var `dwDialExtraSampleSeconds`: UInt,
    public var `dwHangUpExtraPercent`: UInt,
    public var `dwHangUpExtraSampleSeconds`: UInt,
    public var `dwIdleDisconnectSeconds`: UInt,
    public var `dwType`: UInt,
    public var `dwEncryptionType`: `MPR_ET`,
    public var `dwCustomAuthKey`: UInt,
    public var `dwCustomAuthDataSize`: UInt,
    public var `lpbCustomAuthData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `guidId`: `windows_sys`.`core`.`GUID`,
    public var `dwVpnStrategy`: `MPR_VS`,
    public var `AddressCount`: UInt,
    public var `ipv6addrDns`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `ipv6addrDnsAlt`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `ipv6addr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`>?,
)
// UNSUPPORTED Rust 1177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MPR_INTERFACE_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_INTERFACE_ADMIN_DISABLED`: UInt = 2u;
public const val `MPR_INTERFACE_CONNECTION_FAILURE`: UInt = 4u;
public const val `MPR_INTERFACE_DIALOUT_HOURS_RESTRICTION`: UInt = 16u;
public typealias `MPR_INTERFACE_DIAL_MODE` = UInt;
public const val `MPR_INTERFACE_NO_DEVICE`: UInt = 64u;
public const val `MPR_INTERFACE_NO_MEDIA_SENSE`: UInt = 32u;
public const val `MPR_INTERFACE_OUT_OF_RESOURCES`: UInt = 1u;
public const val `MPR_INTERFACE_SERVICE_PAUSED`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_IPINIP_INTERFACE_0` (
    public var `wszFriendlyName`: UShortArray,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1197:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_IPINIP_INTERFACE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_MaxAreaCode`: UInt = 10u;
public const val `MPR_MaxCallbackNumber`: UInt = 128u;
public const val `MPR_MaxDeviceName`: UInt = 128u;
public const val `MPR_MaxDeviceType`: UInt = 16u;
public const val `MPR_MaxEntryName`: UInt = 256u;
public const val `MPR_MaxFacilities`: UInt = 200u;
public const val `MPR_MaxIpAddress`: UInt = 15u;
public const val `MPR_MaxIpxAddress`: UInt = 21u;
public const val `MPR_MaxPadType`: UInt = 32u;
public const val `MPR_MaxPhoneNumber`: UInt = 128u;
public const val `MPR_MaxUserData`: UInt = 200u;
public const val `MPR_MaxX25Address`: UInt = 200u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_0` (
    public var `fLanOnlyMode`: `windows_sys`.`core`.`BOOL`,
    public var `dwUpTime`: UInt,
    public var `dwTotalPorts`: UInt,
    public var `dwPortsInUse`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_1` (
    public var `dwNumPptpPorts`: UInt,
    public var `dwPptpPortFlags`: UInt,
    public var `dwNumL2tpPorts`: UInt,
    public var `dwL2tpPortFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_2` (
    public var `dwNumPptpPorts`: UInt,
    public var `dwPptpPortFlags`: UInt,
    public var `dwNumL2tpPorts`: UInt,
    public var `dwL2tpPortFlags`: UInt,
    public var `dwNumSstpPorts`: UInt,
    public var `dwSstpPortFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_EX0` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `fLanOnlyMode`: UInt,
    public var `dwUpTime`: UInt,
    public var `dwTotalPorts`: UInt,
    public var `dwPortsInUse`: UInt,
    public var `Reserved`: UInt,
    public var `ConfigParams`: `MPRAPI_TUNNEL_CONFIG_PARAMS0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_EX1` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `fLanOnlyMode`: UInt,
    public var `dwUpTime`: UInt,
    public var `dwTotalPorts`: UInt,
    public var `dwPortsInUse`: UInt,
    public var `Reserved`: UInt,
    public var `ConfigParams`: `MPRAPI_TUNNEL_CONFIG_PARAMS1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_SET_CONFIG_EX0` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `setConfigForProtocols`: UInt,
    public var `ConfigParams`: `MPRAPI_TUNNEL_CONFIG_PARAMS0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPR_SERVER_SET_CONFIG_EX1` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `setConfigForProtocols`: UInt,
    public var `ConfigParams`: `MPRAPI_TUNNEL_CONFIG_PARAMS1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 41 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_TRANSPORT_0` (
    public var `dwTransportId`: UInt,
    public var `hTransport`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wszTransportName`: UShortArray,
)
// UNSUPPORTED Rust 1287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MPR_TRANSPORT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_VPN_TRAFFIC_SELECTOR` (
    public var `type`: `MPR_VPN_TS_TYPE`,
    public var `protocolId`: UByte,
    public var `portStart`: UShort,
    public var `portEnd`: UShort,
    public var `tsPayloadId`: UShort,
    public var `addrStart`: `VPN_TS_IP_ADDRESS`,
    public var `addrEnd`: `VPN_TS_IP_ADDRESS`,
)
// UNSUPPORTED Rust 1304:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MPR_VPN_TRAFFIC_SELECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MPR_VPN_TRAFFIC_SELECTORS` (
    public var `numTsi`: UInt,
    public var `numTsr`: UInt,
    public var `tsI`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_VPN_TRAFFIC_SELECTOR`>?,
    public var `tsR`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MPR_VPN_TRAFFIC_SELECTOR`>?,
)
// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MPR_VPN_TRAFFIC_SELECTORS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_VPN_TS_IPv4_ADDR_RANGE`: `MPR_VPN_TS_TYPE` = 7;
public const val `MPR_VPN_TS_IPv6_ADDR_RANGE`: `MPR_VPN_TS_TYPE` = 8;
public typealias `MPR_VPN_TS_TYPE` = Int;
public typealias `MPR_VS` = UInt;
public const val `MPR_VS_Default`: `MPR_VS` = 0u;
public const val `MPR_VS_Ikev2First`: UInt = 8u;
public const val `MPR_VS_Ikev2Only`: UInt = 7u;
public const val `MPR_VS_L2tpFirst`: `MPR_VS` = 4u;
public const val `MPR_VS_L2tpOnly`: `MPR_VS` = 3u;
public const val `MPR_VS_PptpFirst`: `MPR_VS` = 2u;
public const val `MPR_VS_PptpOnly`: `MPR_VS` = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ORASADFUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PENDING`: UInt = 600u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNRASFREEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNRASGETBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNRASRECEIVEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, `super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNRASRETRIEVEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNRASSENDBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNRASSETCOMMSETTINGS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASCOMMSETTINGS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public const val `PID_ATALK`: UInt = 41u;
public const val `PID_IP`: UInt = 33u;
public const val `PID_IPV6`: UInt = 87u;
public const val `PID_IPX`: UInt = 43u;
public const val `PID_NBF`: UInt = 63u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_CREATION_ALERT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`MGM_IF_ENTRY`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_DISABLE_IGMP_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_ENABLE_IGMP_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_JOIN_ALERT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, `windows_sys`.`core`.`BOOL`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_LOCAL_JOIN_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_LOCAL_LEAVE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_PRUNE_ALERT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, UInt, UInt, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_RPF_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMGM_WRONG_IF_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTNEWCONNECTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTNEWCONNECTION2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_2`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTNEWCONNECTION3` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_2`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_3`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTNEWCONNECTIONEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_EX`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTNEWLINK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_PORT_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_PORT_1`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTREAUTHENTICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_2`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_3`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTREAUTHENTICATIONEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_EX`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINACCEPTTUNNELENDPOINTCHANGEEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_EX`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINCONNECTIONHANGUPNOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINCONNECTIONHANGUPNOTIFICATION2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_2`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINCONNECTIONHANGUPNOTIFICATION3` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_1`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_2`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_3`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINCONNECTIONHANGUPNOTIFICATIONEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_CONNECTION_EX`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINGETIPADDRESSFORUSER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public typealias `PMPRADMINGETIPV6ADDRESSFORUSER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINLINKHANGUPNOTIFICATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_PORT_0`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RAS_PORT_1`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`AUTH_VALIDATION_EX`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINRELEASEIPADRESS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public typealias `PMPRADMINRELEASEIPV6ADDRESSFORUSER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PMPRADMINTERMINATEDLL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_ATCP_INFO` (
    public var `dwError`: UInt,
    public var `wszAddress`: UShortArray,
)
// UNSUPPORTED Rust 1385:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_ATCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PPP_CCP_COMPRESSION`: UInt = 1u;
public const val `PPP_CCP_ENCRYPTION128BIT`: UInt = 64u;
public const val `PPP_CCP_ENCRYPTION40BIT`: UInt = 32u;
public const val `PPP_CCP_ENCRYPTION40BITOLD`: UInt = 16u;
public const val `PPP_CCP_ENCRYPTION56BIT`: UInt = 128u;
public const val `PPP_CCP_HISTORYLESS`: UInt = 16777216u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPP_CCP_INFO` (
    public var `dwError`: UInt,
    public var `dwCompressionAlgorithm`: UInt,
    public var `dwOptions`: UInt,
    public var `dwRemoteCompressionAlgorithm`: UInt,
    public var `dwRemoteOptions`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPP_INFO` (
    public var `nbf`: `PPP_NBFCP_INFO`,
    public var `ip`: `PPP_IPCP_INFO`,
    public var `ipx`: `PPP_IPXCP_INFO`,
    public var `at`: `PPP_ATCP_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPP_INFO_2` (
    public var `nbf`: `PPP_NBFCP_INFO`,
    public var `ip`: `PPP_IPCP_INFO2`,
    public var `ipx`: `PPP_IPXCP_INFO`,
    public var `at`: `PPP_ATCP_INFO`,
    public var `ccp`: `PPP_CCP_INFO`,
    public var `lcp`: `PPP_LCP_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPP_INFO_3` (
    public var `nbf`: `PPP_NBFCP_INFO`,
    public var `ip`: `PPP_IPCP_INFO2`,
    public var `ipv6`: `PPP_IPV6_CP_INFO`,
    public var `ccp`: `PPP_CCP_INFO`,
    public var `lcp`: `PPP_LCP_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_IPCP_INFO` (
    public var `dwError`: UInt,
    public var `wszAddress`: UShortArray,
    public var `wszRemoteAddress`: UShortArray,
)
// UNSUPPORTED Rust 1439:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_IPCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_IPCP_INFO2` (
    public var `dwError`: UInt,
    public var `wszAddress`: UShortArray,
    public var `wszRemoteAddress`: UShortArray,
    public var `dwOptions`: UInt,
    public var `dwRemoteOptions`: UInt,
)
// UNSUPPORTED Rust 1453:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_IPCP_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PPP_IPCP_VJ`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_IPV6_CP_INFO` (
    public var `dwVersion`: UInt,
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `bInterfaceIdentifier`: UByteArray,
    public var `bRemoteInterfaceIdentifier`: UByteArray,
    public var `dwOptions`: UInt,
    public var `dwRemoteOptions`: UInt,
    public var `bPrefix`: UByteArray,
    public var `dwPrefixLength`: UInt,
)
// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_IPV6_CP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 23 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_IPXCP_INFO` (
    public var `dwError`: UInt,
    public var `wszAddress`: UShortArray,
)
// UNSUPPORTED Rust 1483:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_IPXCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PPP_LCP` = UInt;
public const val `PPP_LCP_3_DES`: UInt = 32u;
public const val `PPP_LCP_ACFC`: UInt = 4u;
public const val `PPP_LCP_AES_128`: UInt = 64u;
public const val `PPP_LCP_AES_192`: UInt = 256u;
public const val `PPP_LCP_AES_256`: UInt = 128u;
public const val `PPP_LCP_CHAP`: `PPP_LCP` = 49699u;
public const val `PPP_LCP_CHAP_MD5`: `PPP_LCP_INFO_AUTH_DATA` = 5u;
public const val `PPP_LCP_CHAP_MS`: `PPP_LCP_INFO_AUTH_DATA` = 128u;
public const val `PPP_LCP_CHAP_MSV2`: `PPP_LCP_INFO_AUTH_DATA` = 129u;
public const val `PPP_LCP_DES_56`: UInt = 16u;
public const val `PPP_LCP_EAP`: `PPP_LCP` = 49703u;
public const val `PPP_LCP_GCM_AES_128`: UInt = 512u;
public const val `PPP_LCP_GCM_AES_192`: UInt = 1024u;
public const val `PPP_LCP_GCM_AES_256`: UInt = 2048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPP_LCP_INFO` (
    public var `dwError`: UInt,
    public var `dwAuthenticationProtocol`: `PPP_LCP`,
    public var `dwAuthenticationData`: `PPP_LCP_INFO_AUTH_DATA`,
    public var `dwRemoteAuthenticationProtocol`: UInt,
    public var `dwRemoteAuthenticationData`: UInt,
    public var `dwTerminateReason`: UInt,
    public var `dwRemoteTerminateReason`: UInt,
    public var `dwOptions`: UInt,
    public var `dwRemoteOptions`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwRemoteEapTypeId`: UInt,
)
public typealias `PPP_LCP_INFO_AUTH_DATA` = UInt;
public const val `PPP_LCP_MULTILINK_FRAMING`: UInt = 1u;
public const val `PPP_LCP_PAP`: `PPP_LCP` = 49187u;
public const val `PPP_LCP_PFC`: UInt = 2u;
public const val `PPP_LCP_SPAP`: `PPP_LCP` = 49191u;
public const val `PPP_LCP_SSHF`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_NBFCP_INFO` (
    public var `dwError`: UInt,
    public var `wszWksta`: UShortArray,
)
// UNSUPPORTED Rust 1530:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_NBFCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_PROJECTION_INFO` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `wszAddress`: UShortArray,
    public var `wszRemoteAddress`: UShortArray,
    public var `dwIPv4Options`: UInt,
    public var `dwIPv4RemoteOptions`: UInt,
    public var `IPv4SubInterfaceIndex`: ULong,
    public var `dwIPv6NegotiationError`: UInt,
    public var `bInterfaceIdentifier`: UByteArray,
    public var `bRemoteInterfaceIdentifier`: UByteArray,
    public var `bPrefix`: UByteArray,
    public var `dwPrefixLength`: UInt,
    public var `IPv6SubInterfaceIndex`: ULong,
    public var `dwLcpError`: UInt,
    public var `dwAuthenticationProtocol`: `PPP_LCP`,
    public var `dwAuthenticationData`: `PPP_LCP_INFO_AUTH_DATA`,
    public var `dwRemoteAuthenticationProtocol`: `PPP_LCP`,
    public var `dwRemoteAuthenticationData`: `PPP_LCP_INFO_AUTH_DATA`,
    public var `dwLcpTerminateReason`: UInt,
    public var `dwLcpRemoteTerminateReason`: UInt,
    public var `dwLcpOptions`: UInt,
    public var `dwLcpRemoteOptions`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwRemoteEapTypeId`: UInt,
    public var `dwCcpError`: UInt,
    public var `dwCompressionAlgorithm`: UInt,
    public var `dwCcpOptions`: UInt,
    public var `dwRemoteCompressionAlgorithm`: UInt,
    public var `dwCcpRemoteOptions`: UInt,
)
// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PPP_PROJECTION_INFO2` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `wszAddress`: UShortArray,
    public var `wszRemoteAddress`: UShortArray,
    public var `dwIPv4Options`: UInt,
    public var `dwIPv4RemoteOptions`: UInt,
    public var `IPv4SubInterfaceIndex`: ULong,
    public var `dwIPv6NegotiationError`: UInt,
    public var `bInterfaceIdentifier`: UByteArray,
    public var `bRemoteInterfaceIdentifier`: UByteArray,
    public var `bPrefix`: UByteArray,
    public var `dwPrefixLength`: UInt,
    public var `IPv6SubInterfaceIndex`: ULong,
    public var `dwLcpError`: UInt,
    public var `dwAuthenticationProtocol`: `PPP_LCP`,
    public var `dwAuthenticationData`: `PPP_LCP_INFO_AUTH_DATA`,
    public var `dwRemoteAuthenticationProtocol`: `PPP_LCP`,
    public var `dwRemoteAuthenticationData`: `PPP_LCP_INFO_AUTH_DATA`,
    public var `dwLcpTerminateReason`: UInt,
    public var `dwLcpRemoteTerminateReason`: UInt,
    public var `dwLcpOptions`: UInt,
    public var `dwLcpRemoteOptions`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwEmbeddedEAPTypeId`: UInt,
    public var `dwRemoteEapTypeId`: UInt,
    public var `dwCcpError`: UInt,
    public var `dwCompressionAlgorithm`: UInt,
    public var `dwCcpOptions`: UInt,
    public var `dwRemoteCompressionAlgorithm`: UInt,
    public var `dwCcpRemoteOptions`: UInt,
)
// UNSUPPORTED Rust 1605:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PPP_PROJECTION_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PPTP_CONFIG_PARAMS` (
    public var `dwNumPorts`: UInt,
    public var `dwPortFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROJECTION_INFO` (
    public var `projectionInfoType`: UByte,
    public var `Anonymous`: `PROJECTION_INFO_0`,
)
// UNSUPPORTED Rust 1622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1627:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROJECTION_INFO_0 {
//     pub PppProjectionInfo: PPP_PROJECTION_INFO,
//     pub Ikev2ProjectionInfo: IKEV2_PROJECTION_INFO,
// }

// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROJECTION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROJECTION_INFO2` (
    public var `projectionInfoType`: UByte,
    public var `Anonymous`: `PROJECTION_INFO2_0`,
)
// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROJECTION_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1649:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROJECTION_INFO2_0 {
//     pub PppProjectionInfo: PPP_PROJECTION_INFO2,
//     pub Ikev2ProjectionInfo: IKEV2_PROJECTION_INFO2,
// }

// UNSUPPORTED Rust 1655:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROJECTION_INFO2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROJECTION_INFO_TYPE_IKEv2`: `RASPROJECTION_INFO_TYPE` = 2;
public const val `PROJECTION_INFO_TYPE_PPP`: `RASPROJECTION_INFO_TYPE` = 1;
public const val `RASADFLG_PositionDlg`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASADFUNCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASADPARAMS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASADFUNCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASADPARAMS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASADPARAMS` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
)
// UNSUPPORTED Rust 1674:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASADPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASADP_ConnectionQueryTimeout`: UInt = 4u;
public const val `RASADP_DisableConnectionQuery`: UInt = 0u;
public const val `RASADP_FailedConnectionTimeout`: UInt = 3u;
public const val `RASADP_LoginSessionDisable`: UInt = 1u;
public const val `RASADP_SavedAddressesLimit`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASAMBA` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `szNetBiosError`: ByteArray,
    public var `bLana`: UByte,
)
// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASAMBA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASAMBW` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `szNetBiosError`: UShortArray,
    public var `bLana`: UByte,
)
// UNSUPPORTED Rust 1705:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASAMBW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASAPIVERSION` = Int;
public const val `RASAPIVERSION_500`: `RASAPIVERSION` = 1;
public const val `RASAPIVERSION_501`: `RASAPIVERSION` = 2;
public const val `RASAPIVERSION_600`: `RASAPIVERSION` = 3;
public const val `RASAPIVERSION_601`: `RASAPIVERSION` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASAUTODIALENTRYA` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDialingLocation`: UInt,
    public var `szEntry`: ByteArray,
)
// UNSUPPORTED Rust 1723:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASAUTODIALENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASAUTODIALENTRYW` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwDialingLocation`: UInt,
    public var `szEntry`: UShortArray,
)
// UNSUPPORTED Rust 1736:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASAUTODIALENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASBASE`: UInt = 600u;
public const val `RASBASEEND`: UInt = 877u;
public const val `RASCCPCA_MPPC`: UInt = 6u;
public const val `RASCCPCA_STAC`: UInt = 5u;
public const val `RASCCPO_Compression`: UInt = 1u;
public const val `RASCCPO_Encryption128bit`: UInt = 64u;
public const val `RASCCPO_Encryption40bit`: UInt = 32u;
public const val `RASCCPO_Encryption56bit`: UInt = 16u;
public const val `RASCCPO_HistoryLess`: UInt = 2u;
public const val `RASCF_AllUsers`: UInt = 1u;
public const val `RASCF_GlobalCreds`: UInt = 2u;
public const val `RASCF_OwnerKnown`: UInt = 4u;
public const val `RASCF_OwnerMatch`: UInt = 8u;
public const val `RASCM_DDMPreSharedKey`: UInt = 64u;
public const val `RASCM_DefaultCreds`: UInt = 8u;
public const val `RASCM_Domain`: UInt = 4u;
public const val `RASCM_Password`: UInt = 2u;
public const val `RASCM_PreSharedKey`: UInt = 16u;
public const val `RASCM_ServerPreSharedKey`: UInt = 32u;
public const val `RASCM_UserName`: UInt = 1u;
public const val `RASCN_BandwidthAdded`: UInt = 4u;
public const val `RASCN_BandwidthRemoved`: UInt = 8u;
public const val `RASCN_Connection`: UInt = 1u;
public const val `RASCN_Disconnection`: UInt = 2u;
public const val `RASCN_Dormant`: UInt = 16u;
public const val `RASCN_EPDGPacketArrival`: UInt = 64u;
public const val `RASCN_ReConnection`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RASCOMMSETTINGS` (
    public var `dwSize`: UInt,
    public var `bParity`: UByte,
    public var `bStop`: UByte,
    public var `bByteSize`: UByte,
    public var `bAlign`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCONNA` (
    public var `dwSize`: UInt,
    public var `hrasconn`: `HRASCONN`,
    public var `szEntryName`: ByteArray,
    public var `szDeviceType`: ByteArray,
    public var `szDeviceName`: ByteArray,
    public var `szPhonebook`: ByteArray,
    public var `dwSubEntry`: UInt,
    public var `guidEntry`: `windows_sys`.`core`.`GUID`,
    public var `dwFlags`: UInt,
    public var `luid`: `super`.`super`.`Foundation`.`LUID`,
    public var `guidCorrelationId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1793:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASCONNA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCONNA` (
    public var `dwSize`: UInt,
    public var `hrasconn`: `HRASCONN`,
    public var `szEntryName`: ByteArray,
    public var `szDeviceType`: ByteArray,
    public var `szDeviceName`: ByteArray,
    public var `szPhonebook`: ByteArray,
    public var `dwSubEntry`: UInt,
    public var `guidEntry`: `windows_sys`.`core`.`GUID`,
    public var `dwFlags`: UInt,
    public var `luid`: `super`.`super`.`Foundation`.`LUID`,
    public var `guidCorrelationId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1815:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASCONNA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASCONNSTATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCONNSTATUSA` (
    public var `dwSize`: UInt,
    public var `rasconnstate`: `RASCONNSTATE`,
    public var `dwError`: UInt,
    public var `szDeviceType`: ByteArray,
    public var `szDeviceName`: ByteArray,
    public var `szPhoneNumber`: ByteArray,
    public var `localEndPoint`: `RASTUNNELENDPOINT`,
    public var `remoteEndPoint`: `RASTUNNELENDPOINT`,
    public var `rasconnsubstate`: `RASCONNSUBSTATE`,
)
// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASCONNSTATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCONNSTATUSW` (
    public var `dwSize`: UInt,
    public var `rasconnstate`: `RASCONNSTATE`,
    public var `dwError`: UInt,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szPhoneNumber`: UShortArray,
    public var `localEndPoint`: `RASTUNNELENDPOINT`,
    public var `remoteEndPoint`: `RASTUNNELENDPOINT`,
    public var `rasconnsubstate`: `RASCONNSUBSTATE`,
)
// UNSUPPORTED Rust 1856:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASCONNSTATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASCONNSUBSTATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCONNW` (
    public var `dwSize`: UInt,
    public var `hrasconn`: `HRASCONN`,
    public var `szEntryName`: UShortArray,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szPhonebook`: UShortArray,
    public var `dwSubEntry`: UInt,
    public var `guidEntry`: `windows_sys`.`core`.`GUID`,
    public var `dwFlags`: UInt,
    public var `luid`: `super`.`super`.`Foundation`.`LUID`,
    public var `guidCorrelationId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASCONNW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCONNW` (
    public var `dwSize`: UInt,
    public var `hrasconn`: `HRASCONN`,
    public var `szEntryName`: UShortArray,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szPhonebook`: UShortArray,
    public var `dwSubEntry`: UInt,
    public var `guidEntry`: `windows_sys`.`core`.`GUID`,
    public var `dwFlags`: UInt,
    public var `luid`: `super`.`super`.`Foundation`.`LUID`,
    public var `guidCorrelationId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1901:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASCONNW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCREDENTIALSA` (
    public var `dwSize`: UInt,
    public var `dwMask`: UInt,
    public var `szUserName`: ByteArray,
    public var `szPassword`: ByteArray,
    public var `szDomain`: ByteArray,
)
// UNSUPPORTED Rust 1916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASCREDENTIALSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASCREDENTIALSW` (
    public var `dwSize`: UInt,
    public var `dwMask`: UInt,
    public var `szUserName`: UShortArray,
    public var `szPassword`: UShortArray,
    public var `szDomain`: UShortArray,
)
// UNSUPPORTED Rust 1930:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASCREDENTIALSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASCSS_DONE`: UInt = 8192u;
public const val `RASCSS_Dormant`: `RASCONNSUBSTATE` = 1;
public const val `RASCSS_None`: `RASCONNSUBSTATE` = 0;
public const val `RASCSS_Reconnected`: `RASCONNSUBSTATE` = 8192;
public const val `RASCSS_Reconnecting`: `RASCONNSUBSTATE` = 2;
public const val `RASCS_AllDevicesConnected`: `RASCONNSTATE` = 4;
public const val `RASCS_ApplySettings`: `RASCONNSTATE` = 24;
public const val `RASCS_AuthAck`: `RASCONNSTATE` = 12;
public const val `RASCS_AuthCallback`: `RASCONNSTATE` = 8;
public const val `RASCS_AuthChangePassword`: `RASCONNSTATE` = 9;
public const val `RASCS_AuthLinkSpeed`: `RASCONNSTATE` = 11;
public const val `RASCS_AuthNotify`: `RASCONNSTATE` = 6;
public const val `RASCS_AuthProject`: `RASCONNSTATE` = 10;
public const val `RASCS_AuthRetry`: `RASCONNSTATE` = 7;
public const val `RASCS_Authenticate`: `RASCONNSTATE` = 5;
public const val `RASCS_Authenticated`: `RASCONNSTATE` = 14;
public const val `RASCS_CallbackComplete`: `RASCONNSTATE` = 20;
public const val `RASCS_CallbackSetByCaller`: `RASCONNSTATE` = 4098;
public const val `RASCS_ConnectDevice`: `RASCONNSTATE` = 2;
public const val `RASCS_Connected`: `RASCONNSTATE` = 8192;
public const val `RASCS_DONE`: UInt = 8192u;
public const val `RASCS_DeviceConnected`: `RASCONNSTATE` = 3;
public const val `RASCS_Disconnected`: `RASCONNSTATE` = 8193;
public const val `RASCS_Interactive`: `RASCONNSTATE` = 4096;
public const val `RASCS_InvokeEapUI`: `RASCONNSTATE` = 4100;
public const val `RASCS_LogonNetwork`: `RASCONNSTATE` = 21;
public const val `RASCS_OpenPort`: `RASCONNSTATE` = 0;
public const val `RASCS_PAUSED`: UInt = 4096u;
public const val `RASCS_PasswordExpired`: `RASCONNSTATE` = 4099;
public const val `RASCS_PortOpened`: `RASCONNSTATE` = 1;
public const val `RASCS_PrepareForCallback`: `RASCONNSTATE` = 15;
public const val `RASCS_Projected`: `RASCONNSTATE` = 18;
public const val `RASCS_ReAuthenticate`: `RASCONNSTATE` = 13;
public const val `RASCS_RetryAuthentication`: `RASCONNSTATE` = 4097;
public const val `RASCS_StartAuthentication`: `RASCONNSTATE` = 19;
public const val `RASCS_SubEntryConnected`: `RASCONNSTATE` = 22;
public const val `RASCS_SubEntryDisconnected`: `RASCONNSTATE` = 23;
public const val `RASCS_WaitForCallback`: `RASCONNSTATE` = 17;
public const val `RASCS_WaitForModemReset`: `RASCONNSTATE` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RASCTRYINFO` (
    public var `dwSize`: UInt,
    public var `dwCountryID`: UInt,
    public var `dwNextCountryID`: UInt,
    public var `dwCountryCode`: UInt,
    public var `dwCountryNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RASCUSTOMSCRIPTEXTENSIONS` (
    public var `dwSize`: UInt,
    public var `pfnRasSetCommSettings`: `PFNRASSETCOMMSETTINGS`,
)
public const val `RASDDFLAG_AoacRedial`: UInt = 4u;
public const val `RASDDFLAG_LinkFailure`: UInt = 2147483648u;
public const val `RASDDFLAG_NoPrompt`: UInt = 2u;
public const val `RASDDFLAG_PositionDlg`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDEVINFOA` (
    public var `dwSize`: UInt,
    public var `szDeviceType`: ByteArray,
    public var `szDeviceName`: ByteArray,
)
// UNSUPPORTED Rust 2000:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASDEVINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDEVINFOW` (
    public var `dwSize`: UInt,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
)
// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASDEVINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDEVSPECIFICINFO` (
    public var `dwSize`: UInt,
    public var `pbDevSpecificInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2024:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASDEVSPECIFICINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDEVSPECIFICINFO` (
    public var `dwSize`: UInt,
    public var `pbDevSpecificInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2037:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASDEVSPECIFICINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDIALDLG` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `dwSubEntry`: UInt,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2056:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASDIALDLG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2061:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDIALEVENT: windows_sys::core::PCSTR = windows_sys::core::s!("RasDialEvent");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDIALEXTENSIONS` (
    public var `dwSize`: UInt,
    public var `dwfOptions`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `reserved`: ULong,
    public var `reserved1`: ULong,
    public var `RasEapInfo`: `RASEAPINFO`,
    public var `fSkipPppAuth`: `windows_sys`.`core`.`BOOL`,
    public var `RasDevSpecificInfo`: `RASDEVSPECIFICINFO`,
)
// UNSUPPORTED Rust 2074:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASDIALEXTENSIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASDIALFUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `RASCONNSTATE`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASDIALFUNC1` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HRASCONN`, UInt, `RASCONNSTATE`, UInt, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASDIALFUNC2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, `HRASCONN`, UInt, `RASCONNSTATE`, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDIALPARAMSA` (
    public var `dwSize`: UInt,
    public var `szEntryName`: ByteArray,
    public var `szPhoneNumber`: ByteArray,
    public var `szCallbackNumber`: ByteArray,
    public var `szUserName`: ByteArray,
    public var `szPassword`: ByteArray,
    public var `szDomain`: ByteArray,
    public var `dwSubEntry`: UInt,
    public var `dwCallbackId`: ULong,
    public var `dwIfIndex`: UInt,
    public var `szEncPassword`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2098:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASDIALPARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDIALPARAMSA` (
    public var `dwSize`: UInt,
    public var `szEntryName`: ByteArray,
    public var `szPhoneNumber`: ByteArray,
    public var `szCallbackNumber`: ByteArray,
    public var `szUserName`: ByteArray,
    public var `szPassword`: ByteArray,
    public var `szDomain`: ByteArray,
    public var `dwSubEntry`: UInt,
    public var `dwCallbackId`: ULong,
    public var `dwIfIndex`: UInt,
    public var `szEncPassword`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2120:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASDIALPARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDIALPARAMSW` (
    public var `dwSize`: UInt,
    public var `szEntryName`: UShortArray,
    public var `szPhoneNumber`: UShortArray,
    public var `szCallbackNumber`: UShortArray,
    public var `szUserName`: UShortArray,
    public var `szPassword`: UShortArray,
    public var `szDomain`: UShortArray,
    public var `dwSubEntry`: UInt,
    public var `dwCallbackId`: ULong,
    public var `dwIfIndex`: UInt,
    public var `szEncPassword`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2142:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASDIALPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASDIALPARAMSW` (
    public var `dwSize`: UInt,
    public var `szEntryName`: UShortArray,
    public var `szPhoneNumber`: UShortArray,
    public var `szCallbackNumber`: UShortArray,
    public var `szUserName`: UShortArray,
    public var `szPassword`: UShortArray,
    public var `szDomain`: UShortArray,
    public var `dwSubEntry`: UInt,
    public var `dwCallbackId`: ULong,
    public var `dwIfIndex`: UInt,
    public var `szEncPassword`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2164:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASDIALPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2170:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Atm: windows_sys::core::PCWSTR = windows_sys::core::w!("ATM");

// UNSUPPORTED Rust 2171:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_FrameRelay: windows_sys::core::PCWSTR = windows_sys::core::w!("FRAMERELAY");

// UNSUPPORTED Rust 2172:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Generic: windows_sys::core::PCWSTR = windows_sys::core::w!("GENERIC");

// UNSUPPORTED Rust 2173:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Irda: windows_sys::core::PCWSTR = windows_sys::core::w!("IRDA");

// UNSUPPORTED Rust 2174:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Isdn: windows_sys::core::PCWSTR = windows_sys::core::w!("isdn");

// UNSUPPORTED Rust 2175:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Modem: windows_sys::core::PCWSTR = windows_sys::core::w!("modem");

// UNSUPPORTED Rust 2176:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_PPPoE: windows_sys::core::PCWSTR = windows_sys::core::w!("PPPoE");

// UNSUPPORTED Rust 2177:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Pad: windows_sys::core::PCWSTR = windows_sys::core::w!("pad");

// UNSUPPORTED Rust 2178:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Parallel: windows_sys::core::PCWSTR = windows_sys::core::w!("PARALLEL");

// UNSUPPORTED Rust 2179:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_SW56: windows_sys::core::PCWSTR = windows_sys::core::w!("SW56");

// UNSUPPORTED Rust 2180:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Serial: windows_sys::core::PCWSTR = windows_sys::core::w!("SERIAL");

// UNSUPPORTED Rust 2181:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Sonet: windows_sys::core::PCWSTR = windows_sys::core::w!("SONET");

// UNSUPPORTED Rust 2182:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_Vpn: windows_sys::core::PCWSTR = windows_sys::core::w!("vpn");

// UNSUPPORTED Rust 2183:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RASDT_X25: windows_sys::core::PCWSTR = windows_sys::core::w!("x25");

public const val `RASEAPF_Logon`: UInt = 4u;
public const val `RASEAPF_NonInteractive`: UInt = 2u;
public const val `RASEAPF_Preview`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASEAPINFO` (
    public var `dwSizeofEapInfo`: UInt,
    public var `pbEapInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2193:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASEAPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASEAPUSERIDENTITYA` (
    public var `szUserName`: ByteArray,
    public var `dwSizeofEapInfo`: UInt,
    public var `pbEapInfo`: UByteArray,
)
// UNSUPPORTED Rust 2205:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASEAPUSERIDENTITYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASEAPUSERIDENTITYW` (
    public var `szUserName`: UShortArray,
    public var `dwSizeofEapInfo`: UInt,
    public var `pbEapInfo`: UByteArray,
)
// UNSUPPORTED Rust 2217:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASEAPUSERIDENTITYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASEDFLAG_CloneEntry`: UInt = 4u;
public const val `RASEDFLAG_IncomingConnection`: UInt = 1024u;
public const val `RASEDFLAG_InternetEntry`: UInt = 256u;
public const val `RASEDFLAG_NAT`: UInt = 512u;
public const val `RASEDFLAG_NewBroadbandEntry`: UInt = 128u;
public const val `RASEDFLAG_NewDirectEntry`: UInt = 64u;
public const val `RASEDFLAG_NewEntry`: UInt = 2u;
public const val `RASEDFLAG_NewPhoneEntry`: UInt = 16u;
public const val `RASEDFLAG_NewTunnelEntry`: UInt = 32u;
public const val `RASEDFLAG_NoRename`: UInt = 8u;
public const val `RASEDFLAG_PositionDlg`: UInt = 1u;
public const val `RASEDFLAG_ShellOwned`: UInt = 1073741824u;
public const val `RASEDM_DialAll`: `RASENTRY_DIAL_MODE` = 1u;
public const val `RASEDM_DialAsNeeded`: `RASENTRY_DIAL_MODE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 11 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 201 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYA` (
    public var `dwSize`: UInt,
    public var `dwfOptions`: UInt,
    public var `dwCountryID`: UInt,
    public var `dwCountryCode`: UInt,
    public var `szAreaCode`: ByteArray,
    public var `szLocalPhoneNumber`: ByteArray,
    public var `dwAlternateOffset`: UInt,
    public var `ipaddr`: `RASIPADDR`,
    public var `ipaddrDns`: `RASIPADDR`,
    public var `ipaddrDnsAlt`: `RASIPADDR`,
    public var `ipaddrWins`: `RASIPADDR`,
    public var `ipaddrWinsAlt`: `RASIPADDR`,
    public var `dwFrameSize`: UInt,
    public var `dwfNetProtocols`: UInt,
    public var `dwFramingProtocol`: UInt,
    public var `szScript`: ByteArray,
    public var `szAutodialDll`: ByteArray,
    public var `szAutodialFunc`: ByteArray,
    public var `szDeviceType`: ByteArray,
    public var `szDeviceName`: ByteArray,
    public var `szX25PadType`: ByteArray,
    public var `szX25Address`: ByteArray,
    public var `szX25Facilities`: ByteArray,
    public var `szX25UserData`: ByteArray,
    public var `dwChannels`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `dwSubEntries`: UInt,
    public var `dwDialMode`: `RASENTRY_DIAL_MODE`,
    public var `dwDialExtraPercent`: UInt,
    public var `dwDialExtraSampleSeconds`: UInt,
    public var `dwHangUpExtraPercent`: UInt,
    public var `dwHangUpExtraSampleSeconds`: UInt,
    public var `dwIdleDisconnectSeconds`: UInt,
    public var `dwType`: UInt,
    public var `dwEncryptionType`: UInt,
    public var `dwCustomAuthKey`: UInt,
    public var `guidId`: `windows_sys`.`core`.`GUID`,
    public var `szCustomDialDll`: ByteArray,
    public var `dwVpnStrategy`: UInt,
    public var `dwfOptions2`: UInt,
    public var `dwfOptions3`: UInt,
    public var `szDnsSuffix`: ByteArray,
    public var `dwTcpWindowSize`: UInt,
    public var `szPrerequisitePbk`: ByteArray,
    public var `szPrerequisiteEntry`: ByteArray,
    public var `dwRedialCount`: UInt,
    public var `dwRedialPause`: UInt,
    public var `ipv6addrDns`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `ipv6addrDnsAlt`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwIPv4InterfaceMetric`: UInt,
    public var `dwIPv6InterfaceMetric`: UInt,
    public var `ipv6addr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwIPv6PrefixLength`: UInt,
    public var `dwNetworkOutageTime`: UInt,
    public var `szIDi`: ByteArray,
    public var `szIDr`: ByteArray,
    public var `fIsImsConfig`: `windows_sys`.`core`.`BOOL`,
    public var `IdiType`: `IKEV2_ID_PAYLOAD_TYPE`,
    public var `IdrType`: `IKEV2_ID_PAYLOAD_TYPE`,
    public var `fDisableIKEv2Fragmentation`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYDLGA` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `szEntry`: ByteArray,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2322:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASENTRYDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYDLGA` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `szEntry`: ByteArray,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2342:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASENTRYDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYDLGW` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `szEntry`: UShortArray,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2362:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASENTRYDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYDLGW` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `szEntry`: UShortArray,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASENTRYDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYNAMEA` (
    public var `dwSize`: UInt,
    public var `szEntryName`: ByteArray,
    public var `dwFlags`: UInt,
    public var `szPhonebookPath`: ByteArray,
)
// UNSUPPORTED Rust 2396:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASENTRYNAMEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYNAMEW` (
    public var `dwSize`: UInt,
    public var `szEntryName`: UShortArray,
    public var `dwFlags`: UInt,
    public var `szPhonebookPath`: UShortArray,
)
// UNSUPPORTED Rust 2409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASENTRYNAMEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 11 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 33 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 201 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASENTRYW` (
    public var `dwSize`: UInt,
    public var `dwfOptions`: UInt,
    public var `dwCountryID`: UInt,
    public var `dwCountryCode`: UInt,
    public var `szAreaCode`: UShortArray,
    public var `szLocalPhoneNumber`: UShortArray,
    public var `dwAlternateOffset`: UInt,
    public var `ipaddr`: `RASIPADDR`,
    public var `ipaddrDns`: `RASIPADDR`,
    public var `ipaddrDnsAlt`: `RASIPADDR`,
    public var `ipaddrWins`: `RASIPADDR`,
    public var `ipaddrWinsAlt`: `RASIPADDR`,
    public var `dwFrameSize`: UInt,
    public var `dwfNetProtocols`: UInt,
    public var `dwFramingProtocol`: UInt,
    public var `szScript`: UShortArray,
    public var `szAutodialDll`: UShortArray,
    public var `szAutodialFunc`: UShortArray,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szX25PadType`: UShortArray,
    public var `szX25Address`: UShortArray,
    public var `szX25Facilities`: UShortArray,
    public var `szX25UserData`: UShortArray,
    public var `dwChannels`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `dwSubEntries`: UInt,
    public var `dwDialMode`: `RASENTRY_DIAL_MODE`,
    public var `dwDialExtraPercent`: UInt,
    public var `dwDialExtraSampleSeconds`: UInt,
    public var `dwHangUpExtraPercent`: UInt,
    public var `dwHangUpExtraSampleSeconds`: UInt,
    public var `dwIdleDisconnectSeconds`: UInt,
    public var `dwType`: UInt,
    public var `dwEncryptionType`: UInt,
    public var `dwCustomAuthKey`: UInt,
    public var `guidId`: `windows_sys`.`core`.`GUID`,
    public var `szCustomDialDll`: UShortArray,
    public var `dwVpnStrategy`: UInt,
    public var `dwfOptions2`: UInt,
    public var `dwfOptions3`: UInt,
    public var `szDnsSuffix`: UShortArray,
    public var `dwTcpWindowSize`: UInt,
    public var `szPrerequisitePbk`: UShortArray,
    public var `szPrerequisiteEntry`: UShortArray,
    public var `dwRedialCount`: UInt,
    public var `dwRedialPause`: UInt,
    public var `ipv6addrDns`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `ipv6addrDnsAlt`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwIPv4InterfaceMetric`: UInt,
    public var `dwIPv6InterfaceMetric`: UInt,
    public var `ipv6addr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwIPv6PrefixLength`: UInt,
    public var `dwNetworkOutageTime`: UInt,
    public var `szIDi`: UShortArray,
    public var `szIDr`: UShortArray,
    public var `fIsImsConfig`: `windows_sys`.`core`.`BOOL`,
    public var `IdiType`: `IKEV2_ID_PAYLOAD_TYPE`,
    public var `IdrType`: `IKEV2_ID_PAYLOAD_TYPE`,
    public var `fDisableIKEv2Fragmentation`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASENTRY_DIAL_MODE` = UInt;
public const val `RASEO2_AuthTypeIsOtp`: UInt = 268435456u;
public const val `RASEO2_AutoTriggerCapable`: UInt = 67108864u;
public const val `RASEO2_CacheCredentials`: UInt = 33554432u;
public const val `RASEO2_DisableClassBasedStaticRoute`: UInt = 524288u;
public const val `RASEO2_DisableIKENameEkuCheck`: UInt = 262144u;
public const val `RASEO2_DisableMobility`: UInt = 2097152u;
public const val `RASEO2_DisableNbtOverIP`: UInt = 64u;
public const val `RASEO2_DontNegotiateMultilink`: UInt = 4u;
public const val `RASEO2_DontUseRasCredentials`: UInt = 8u;
public const val `RASEO2_IPv4ExplicitMetric`: UInt = 65536u;
public const val `RASEO2_IPv6ExplicitMetric`: UInt = 131072u;
public const val `RASEO2_IPv6RemoteDefaultGateway`: UInt = 8192u;
public const val `RASEO2_IPv6SpecificNameServers`: UInt = 4096u;
public const val `RASEO2_Internet`: UInt = 32u;
public const val `RASEO2_IsAlwaysOn`: UInt = 536870912u;
public const val `RASEO2_IsPrivateNetwork`: UInt = 1073741824u;
public const val `RASEO2_IsThirdPartyProfile`: UInt = 134217728u;
public const val `RASEO2_PlumbIKEv2TSAsRoutes`: UInt = 2147483648u;
public const val `RASEO2_ReconnectIfDropped`: UInt = 256u;
public const val `RASEO2_RegisterIpWithDNS`: UInt = 16384u;
public const val `RASEO2_RequireMachineCertificates`: UInt = 4194304u;
public const val `RASEO2_SecureClientForMSNet`: UInt = 2u;
public const val `RASEO2_SecureFileAndPrint`: UInt = 1u;
public const val `RASEO2_SecureRoutingCompartment`: UInt = 1024u;
public const val `RASEO2_SharePhoneNumbers`: UInt = 512u;
public const val `RASEO2_SpecificIPv6Addr`: UInt = 1048576u;
public const val `RASEO2_UseDNSSuffixForRegistration`: UInt = 32768u;
public const val `RASEO2_UseGlobalDeviceSettings`: UInt = 128u;
public const val `RASEO2_UsePreSharedKey`: UInt = 16u;
public const val `RASEO2_UsePreSharedKeyForIkev2Initiator`: UInt = 8388608u;
public const val `RASEO2_UsePreSharedKeyForIkev2Responder`: UInt = 16777216u;
public const val `RASEO2_UseTypicalSettings`: UInt = 2048u;
public const val `RASEO_Custom`: UInt = 1048576u;
public const val `RASEO_CustomScript`: UInt = 2147483648u;
public const val `RASEO_DisableLcpExtensions`: UInt = 32u;
public const val `RASEO_IpHeaderCompression`: UInt = 8u;
public const val `RASEO_ModemLights`: UInt = 256u;
public const val `RASEO_NetworkLogon`: UInt = 8192u;
public const val `RASEO_PreviewDomain`: UInt = 33554432u;
public const val `RASEO_PreviewPhoneNumber`: UInt = 2097152u;
public const val `RASEO_PreviewUserPw`: UInt = 16777216u;
public const val `RASEO_PromoteAlternates`: UInt = 32768u;
public const val `RASEO_RemoteDefaultGateway`: UInt = 16u;
public const val `RASEO_RequireCHAP`: UInt = 134217728u;
public const val `RASEO_RequireDataEncryption`: UInt = 4096u;
public const val `RASEO_RequireEAP`: UInt = 131072u;
public const val `RASEO_RequireEncryptedPw`: UInt = 1024u;
public const val `RASEO_RequireMsCHAP`: UInt = 268435456u;
public const val `RASEO_RequireMsCHAP2`: UInt = 536870912u;
public const val `RASEO_RequireMsEncryptedPw`: UInt = 2048u;
public const val `RASEO_RequirePAP`: UInt = 262144u;
public const val `RASEO_RequireSPAP`: UInt = 524288u;
public const val `RASEO_RequireW95MSCHAP`: UInt = 1073741824u;
public const val `RASEO_SecureLocalFiles`: UInt = 65536u;
public const val `RASEO_SharedPhoneNumbers`: UInt = 8388608u;
public const val `RASEO_ShowDialingProgress`: UInt = 67108864u;
public const val `RASEO_SpecificIpAddr`: UInt = 2u;
public const val `RASEO_SpecificNameServers`: UInt = 4u;
public const val `RASEO_SwCompression`: UInt = 512u;
public const val `RASEO_TerminalAfterDial`: UInt = 128u;
public const val `RASEO_TerminalBeforeDial`: UInt = 64u;
public const val `RASEO_UseCountryAndAreaCodes`: UInt = 1u;
public const val `RASEO_UseLogonCredentials`: UInt = 16384u;
public const val `RASET_Broadband`: UInt = 5u;
public const val `RASET_Direct`: UInt = 3u;
public const val `RASET_Internet`: UInt = 4u;
public const val `RASET_Phone`: UInt = 1u;
public const val `RASET_Vpn`: UInt = 2u;
public const val `RASFP_Ppp`: UInt = 1u;
public const val `RASFP_Ras`: UInt = 4u;
public const val `RASFP_Slip`: UInt = 2u;
public const val `RASIDS_Disabled`: UInt = 4294967295u;
public const val `RASIDS_UseGlobalValue`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASIKEV2_PROJECTION_INFO` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `ipv4Address`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `ipv4ServerAddress`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `dwIPv6NegotiationError`: UInt,
    public var `ipv6Address`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `ipv6ServerAddress`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwPrefixLength`: UInt,
    public var `dwAuthenticationProtocol`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwFlags`: `RASIKEV_PROJECTION_INFO_FLAGS`,
    public var `dwEncryptionMethod`: UInt,
    public var `numIPv4ServerAddresses`: UInt,
    public var `ipv4ServerAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN_ADDR`>?,
    public var `numIPv6ServerAddresses`: UInt,
    public var `ipv6ServerAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`>?,
)
// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASIKEV2_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASIKEV2_PROJECTION_INFO` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `ipv4Address`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `ipv4ServerAddress`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `dwIPv6NegotiationError`: UInt,
    public var `ipv6Address`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `ipv6ServerAddress`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwPrefixLength`: UInt,
    public var `dwAuthenticationProtocol`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwFlags`: `RASIKEV_PROJECTION_INFO_FLAGS`,
    public var `dwEncryptionMethod`: UInt,
    public var `numIPv4ServerAddresses`: UInt,
    public var `ipv4ServerAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN_ADDR`>?,
    public var `numIPv6ServerAddresses`: UInt,
    public var `ipv6ServerAddresses`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`>?,
)
// UNSUPPORTED Rust 2609:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASIKEV2_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASIKEV_PROJECTION_INFO_FLAGS` = UInt;
public const val `RASIKEv2_AUTH_EAP`: UInt = 2u;
public const val `RASIKEv2_AUTH_MACHINECERTIFICATES`: UInt = 1u;
public const val `RASIKEv2_AUTH_PSK`: UInt = 3u;
public const val `RASIKEv2_FLAGS_BEHIND_NAT`: `RASIKEV_PROJECTION_INFO_FLAGS` = 2u;
public const val `RASIKEv2_FLAGS_MOBIKESUPPORTED`: `RASIKEV_PROJECTION_INFO_FLAGS` = 1u;
public const val `RASIKEv2_FLAGS_SERVERBEHIND_NAT`: `RASIKEV_PROJECTION_INFO_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RASIPADDR` (
    public var `a`: UByte,
    public var `b`: UByte,
    public var `c`: UByte,
    public var `d`: UByte,
)
public const val `RASIPO_VJ`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 22 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASIPXW` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `szIpxAddress`: UShortArray,
)
// UNSUPPORTED Rust 2639:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASIPXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASLCPAD_CHAP_MD5`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = 5u;
public const val `RASLCPAD_CHAP_MS`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = 128u;
public const val `RASLCPAD_CHAP_MSV2`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = 129u;
public const val `RASLCPAP_CHAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49699u;
public const val `RASLCPAP_EAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49703u;
public const val `RASLCPAP_PAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49187u;
public const val `RASLCPAP_SPAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49191u;
public const val `RASLCPO_3_DES`: UInt = 16u;
public const val `RASLCPO_ACFC`: UInt = 2u;
public const val `RASLCPO_AES_128`: UInt = 32u;
public const val `RASLCPO_AES_192`: UInt = 128u;
public const val `RASLCPO_AES_256`: UInt = 64u;
public const val `RASLCPO_DES_56`: UInt = 8u;
public const val `RASLCPO_GCM_AES_128`: UInt = 256u;
public const val `RASLCPO_GCM_AES_192`: UInt = 512u;
public const val `RASLCPO_GCM_AES_256`: UInt = 1024u;
public const val `RASLCPO_PFC`: UInt = 1u;
public const val `RASLCPO_SSHF`: UInt = 4u;
public const val `RASNAP_ProbationTime`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASNOUSERA` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwTimeoutMs`: UInt,
    public var `szUserName`: ByteArray,
    public var `szPassword`: ByteArray,
    public var `szDomain`: ByteArray,
)
// UNSUPPORTED Rust 2673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASNOUSERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASNOUSERW` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwTimeoutMs`: UInt,
    public var `szUserName`: UShortArray,
    public var `szPassword`: UShortArray,
    public var `szDomain`: UShortArray,
)
// UNSUPPORTED Rust 2688:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASNOUSERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASNOUSER_SmartCard`: UInt = 1u;
public const val `RASNP_Ip`: UInt = 4u;
public const val `RASNP_Ipv6`: UInt = 8u;
public const val `RASNP_Ipx`: UInt = 2u;
public const val `RASNP_NetBEUI`: UInt = 1u;
public const val `RASPBDEVENT_AddEntry`: UInt = 1u;
public const val `RASPBDEVENT_DialEntry`: UInt = 4u;
public const val `RASPBDEVENT_EditEntry`: UInt = 2u;
public const val `RASPBDEVENT_EditGlobals`: UInt = 5u;
public const val `RASPBDEVENT_NoUser`: UInt = 6u;
public const val `RASPBDEVENT_NoUserEdit`: UInt = 7u;
public const val `RASPBDEVENT_RemoveEntry`: UInt = 3u;
public const val `RASPBDFLAG_ForceCloseOnDial`: UInt = 2u;
public const val `RASPBDFLAG_NoUser`: UInt = 16u;
public const val `RASPBDFLAG_PositionDlg`: UInt = 1u;
public const val `RASPBDFLAG_UpdateDefaults`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPBDLGA` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `dwCallbackId`: ULong,
    public var `pCallback`: `RASPBDLGFUNCA`,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2724:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASPBDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPBDLGA` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `dwCallbackId`: ULong,
    public var `pCallback`: `RASPBDLGFUNCA`,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASPBDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASPBDLGFUNCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASPBDLGFUNCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPBDLGW` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `dwCallbackId`: ULong,
    public var `pCallback`: `RASPBDLGFUNCW`,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2768:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for RASPBDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPBDLGW` (
    public var `dwSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `xDlg`: Int,
    public var `yDlg`: Int,
    public var `dwCallbackId`: ULong,
    public var `pCallback`: `RASPBDLGFUNCW`,
    public var `dwError`: UInt,
    public var `reserved`: ULong,
    public var `reserved2`: ULong,
)
// UNSUPPORTED Rust 2789:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASPBDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RASPPPCCP` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `dwCompressionAlgorithm`: UInt,
    public var `dwOptions`: UInt,
    public var `dwServerCompressionAlgorithm`: UInt,
    public var `dwServerOptions`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPIPA` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `szIpAddress`: ByteArray,
    public var `szServerIpAddress`: ByteArray,
    public var `dwOptions`: UInt,
    public var `dwServerOptions`: UInt,
)
// UNSUPPORTED Rust 2815:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPIPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPIPV6` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `bLocalInterfaceIdentifier`: UByteArray,
    public var `bPeerInterfaceIdentifier`: UByteArray,
    public var `bLocalCompressionProtocol`: UByteArray,
    public var `bPeerCompressionProtocol`: UByteArray,
)
// UNSUPPORTED Rust 2830:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPIPV6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPIPW` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `szIpAddress`: UShortArray,
    public var `szServerIpAddress`: UShortArray,
    public var `dwOptions`: UInt,
    public var `dwServerOptions`: UInt,
)
// UNSUPPORTED Rust 2845:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPIPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 22 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPIPXA` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `szIpxAddress`: ByteArray,
)
// UNSUPPORTED Rust 2857:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPIPXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1024 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPLCPA` (
    public var `dwSize`: UInt,
    public var `fBundled`: `windows_sys`.`core`.`BOOL`,
    public var `dwError`: UInt,
    public var `dwAuthenticationProtocol`: UInt,
    public var `dwAuthenticationData`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwServerAuthenticationProtocol`: UInt,
    public var `dwServerAuthenticationData`: UInt,
    public var `dwServerEapTypeId`: UInt,
    public var `fMultilink`: `windows_sys`.`core`.`BOOL`,
    public var `dwTerminateReason`: UInt,
    public var `dwServerTerminateReason`: UInt,
    public var `szReplyMessage`: ByteArray,
    public var `dwOptions`: UInt,
    public var `dwServerOptions`: UInt,
)
// UNSUPPORTED Rust 2881:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPLCPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1024 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPLCPW` (
    public var `dwSize`: UInt,
    public var `fBundled`: `windows_sys`.`core`.`BOOL`,
    public var `dwError`: UInt,
    public var `dwAuthenticationProtocol`: UInt,
    public var `dwAuthenticationData`: UInt,
    public var `dwEapTypeId`: UInt,
    public var `dwServerAuthenticationProtocol`: UInt,
    public var `dwServerAuthenticationData`: UInt,
    public var `dwServerEapTypeId`: UInt,
    public var `fMultilink`: `windows_sys`.`core`.`BOOL`,
    public var `dwTerminateReason`: UInt,
    public var `dwServerTerminateReason`: UInt,
    public var `szReplyMessage`: UShortArray,
    public var `dwOptions`: UInt,
    public var `dwServerOptions`: UInt,
)
// UNSUPPORTED Rust 2905:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPLCPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPNBFA` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `dwNetBiosError`: UInt,
    public var `szNetBiosError`: ByteArray,
    public var `szWorkstationName`: ByteArray,
    public var `bLana`: UByte,
)
// UNSUPPORTED Rust 2920:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPNBFA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPPNBFW` (
    public var `dwSize`: UInt,
    public var `dwError`: UInt,
    public var `dwNetBiosError`: UInt,
    public var `szNetBiosError`: UShortArray,
    public var `szWorkstationName`: UShortArray,
    public var `bLana`: UByte,
)
// UNSUPPORTED Rust 2935:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASPPPNBFW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASPPP_PROJECTION_INFO` (
    public var `dwIPv4NegotiationError`: UInt,
    public var `ipv4Address`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `ipv4ServerAddress`: `super`.`super`.`Networking`.`WinSock`.`IN_ADDR`,
    public var `dwIPv4Options`: UInt,
    public var `dwIPv4ServerOptions`: UInt,
    public var `dwIPv6NegotiationError`: UInt,
    public var `bInterfaceIdentifier`: UByteArray,
    public var `bServerInterfaceIdentifier`: UByteArray,
    public var `fBundled`: `windows_sys`.`core`.`BOOL`,
    public var `fMultilink`: `windows_sys`.`core`.`BOOL`,
    public var `dwAuthenticationProtocol`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL`,
    public var `dwAuthenticationData`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA`,
    public var `dwServerAuthenticationProtocol`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL`,
    public var `dwServerAuthenticationData`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA`,
    public var `dwEapTypeId`: UInt,
    public var `dwServerEapTypeId`: UInt,
    public var `dwLcpOptions`: UInt,
    public var `dwLcpServerOptions`: UInt,
    public var `dwCcpError`: UInt,
    public var `dwCcpCompressionAlgorithm`: UInt,
    public var `dwCcpServerCompressionAlgorithm`: UInt,
    public var `dwCcpOptions`: UInt,
    public var `dwCcpServerOptions`: UInt,
)
// UNSUPPORTED Rust 2968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASPPP_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = UInt;
public typealias `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = UInt;
public const val `RASPRIV2_DialinPolicy`: UInt = 1u;
public const val `RASPRIV_AdminSetCallback`: UInt = 2u;
public const val `RASPRIV_CallerSetCallback`: UInt = 4u;
public const val `RASPRIV_DialinPrivilege`: UInt = 8u;
public const val `RASPRIV_NoCallback`: UInt = 1u;
public typealias `RASPROJECTION` = Int;
public typealias `RASPROJECTION_INFO_TYPE` = Int;
public const val `RASP_Amb`: `RASPROJECTION` = 65536;
public const val `RASP_PppCcp`: `RASPROJECTION` = 33021;
public const val `RASP_PppIp`: `RASPROJECTION` = 32801;
public const val `RASP_PppIpv6`: `RASPROJECTION` = 32855;
public const val `RASP_PppIpx`: `RASPROJECTION` = 32811;
public const val `RASP_PppLcp`: `RASPROJECTION` = 49185;
public const val `RASP_PppNbf`: `RASPROJECTION` = 32831;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RASSECURITYPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASSUBENTRYA` (
    public var `dwSize`: UInt,
    public var `dwfFlags`: UInt,
    public var `szDeviceType`: ByteArray,
    public var `szDeviceName`: ByteArray,
    public var `szLocalPhoneNumber`: ByteArray,
    public var `dwAlternateOffset`: UInt,
)
// UNSUPPORTED Rust 3001:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASSUBENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASSUBENTRYW` (
    public var `dwSize`: UInt,
    public var `dwfFlags`: UInt,
    public var `szDeviceType`: UShortArray,
    public var `szDeviceName`: UShortArray,
    public var `szLocalPhoneNumber`: UShortArray,
    public var `dwAlternateOffset`: UInt,
)
// UNSUPPORTED Rust 3016:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RASSUBENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASTUNNELENDPOINT` (
    public var `dwType`: UInt,
    public var `Anonymous`: `RASTUNNELENDPOINT_0`,
)
// UNSUPPORTED Rust 3028:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASTUNNELENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3034:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RASTUNNELENDPOINT_0 {
//     pub ipv4: super::super::Networking::WinSock::IN_ADDR,
//     pub ipv6: super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 3041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASTUNNELENDPOINT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASTUNNELENDPOINT_IPv4`: UInt = 1u;
public const val `RASTUNNELENDPOINT_IPv6`: UInt = 2u;
public const val `RASTUNNELENDPOINT_UNKNOWN`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RASUPDATECONN` (
    public var `version`: `RASAPIVERSION`,
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwIfIndex`: UInt,
    public var `localEndPoint`: `RASTUNNELENDPOINT`,
    public var `remoteEndPoint`: `RASTUNNELENDPOINT`,
)
// UNSUPPORTED Rust 3061:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASUPDATECONN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_CONNECTION_0` (
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwConnectDuration`: UInt,
    public var `dwInterfaceType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionFlags`: `RAS_FLAGS`,
    public var `wszInterfaceName`: UShortArray,
    public var `wszUserName`: UShortArray,
    public var `wszLogonDomain`: UShortArray,
    public var `wszRemoteComputer`: UShortArray,
)
// UNSUPPORTED Rust 3080:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_CONNECTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_CONNECTION_1` (
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `PppInfo`: `PPP_INFO`,
    public var `dwBytesXmited`: UInt,
    public var `dwBytesRcved`: UInt,
    public var `dwFramesXmited`: UInt,
    public var `dwFramesRcved`: UInt,
    public var `dwCrcErr`: UInt,
    public var `dwTimeoutErr`: UInt,
    public var `dwAlignmentErr`: UInt,
    public var `dwHardwareOverrunErr`: UInt,
    public var `dwFramingErr`: UInt,
    public var `dwBufferOverrunErr`: UInt,
    public var `dwCompressionRatioIn`: UInt,
    public var `dwCompressionRatioOut`: UInt,
)
// UNSUPPORTED Rust 3104:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_CONNECTION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_CONNECTION_2` (
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wszUserName`: UShortArray,
    public var `dwInterfaceType`: `ROUTER_INTERFACE_TYPE`,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `PppInfo2`: `PPP_INFO_2`,
)
// UNSUPPORTED Rust 3118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_CONNECTION_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_CONNECTION_3` (
    public var `dwVersion`: UInt,
    public var `dwSize`: UInt,
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wszUserName`: UShortArray,
    public var `dwInterfaceType`: `ROUTER_INTERFACE_TYPE`,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `PppInfo3`: `PPP_INFO_3`,
    public var `rasQuarState`: `RAS_QUARANTINE_STATE`,
    public var `timer`: `super`.`super`.`Foundation`.`FILETIME`,
)
// UNSUPPORTED Rust 3136:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_CONNECTION_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 65 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_CONNECTION_4` (
    public var `dwConnectDuration`: UInt,
    public var `dwInterfaceType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionFlags`: `RAS_FLAGS`,
    public var `wszInterfaceName`: UShortArray,
    public var `wszUserName`: UShortArray,
    public var `wszLogonDomain`: UShortArray,
    public var `wszRemoteComputer`: UShortArray,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `rasQuarState`: `RAS_QUARANTINE_STATE`,
    public var `probationTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `connectionStartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ullBytesXmited`: ULong,
    public var `ullBytesRcved`: ULong,
    public var `dwFramesXmited`: UInt,
    public var `dwFramesRcved`: UInt,
    public var `dwCrcErr`: UInt,
    public var `dwTimeoutErr`: UInt,
    public var `dwAlignmentErr`: UInt,
    public var `dwHardwareOverrunErr`: UInt,
    public var `dwFramingErr`: UInt,
    public var `dwBufferOverrunErr`: UInt,
    public var `dwCompressionRatioIn`: UInt,
    public var `dwCompressionRatioOut`: UInt,
    public var `dwNumSwitchOvers`: UInt,
    public var `wszRemoteEndpointAddress`: UShortArray,
    public var `wszLocalEndpointAddress`: UShortArray,
    public var `ProjectionInfo`: `PROJECTION_INFO2`,
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwDeviceType`: UInt,
)
// UNSUPPORTED Rust 3175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_CONNECTION_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 65 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_CONNECTION_EX` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `dwConnectDuration`: UInt,
    public var `dwInterfaceType`: `ROUTER_INTERFACE_TYPE`,
    public var `dwConnectionFlags`: `RAS_FLAGS`,
    public var `wszInterfaceName`: UShortArray,
    public var `wszUserName`: UShortArray,
    public var `wszLogonDomain`: UShortArray,
    public var `wszRemoteComputer`: UShortArray,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `rasQuarState`: `RAS_QUARANTINE_STATE`,
    public var `probationTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwBytesXmited`: UInt,
    public var `dwBytesRcved`: UInt,
    public var `dwFramesXmited`: UInt,
    public var `dwFramesRcved`: UInt,
    public var `dwCrcErr`: UInt,
    public var `dwTimeoutErr`: UInt,
    public var `dwAlignmentErr`: UInt,
    public var `dwHardwareOverrunErr`: UInt,
    public var `dwFramingErr`: UInt,
    public var `dwBufferOverrunErr`: UInt,
    public var `dwCompressionRatioIn`: UInt,
    public var `dwCompressionRatioOut`: UInt,
    public var `dwNumSwitchOvers`: UInt,
    public var `wszRemoteEndpointAddress`: UShortArray,
    public var `wszLocalEndpointAddress`: UShortArray,
    public var `ProjectionInfo`: `PROJECTION_INFO`,
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hInterface`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 3213:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_CONNECTION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RAS_FLAGS` = UInt;
public const val `RAS_FLAGS_ARAP_CONNECTION`: `RAS_FLAGS` = 16u;
public const val `RAS_FLAGS_DORMANT`: `RAS_FLAGS` = 32u;
public const val `RAS_FLAGS_IKEV2_CONNECTION`: `RAS_FLAGS` = 16u;
public const val `RAS_FLAGS_MESSENGER_PRESENT`: `RAS_FLAGS` = 2u;
public const val `RAS_FLAGS_PPP_CONNECTION`: `RAS_FLAGS` = 1u;
public const val `RAS_FLAGS_QUARANTINE_PRESENT`: `RAS_FLAGS` = 8u;
public const val `RAS_FLAGS_RAS_CONNECTION`: UInt = 4u;
public typealias `RAS_HARDWARE_CONDITION` = Int;
public const val `RAS_HARDWARE_FAILURE`: `RAS_HARDWARE_CONDITION` = 1;
public const val `RAS_HARDWARE_OPERATIONAL`: `RAS_HARDWARE_CONDITION` = 0;
public const val `RAS_MaxAreaCode`: UInt = 10u;
public const val `RAS_MaxCallbackNumber`: UInt = 128u;
public const val `RAS_MaxDeviceName`: UInt = 128u;
public const val `RAS_MaxDeviceType`: UInt = 16u;
public const val `RAS_MaxDnsSuffix`: UInt = 256u;
public const val `RAS_MaxEntryName`: UInt = 256u;
public const val `RAS_MaxFacilities`: UInt = 200u;
public const val `RAS_MaxIDSize`: UInt = 256u;
public const val `RAS_MaxIpAddress`: UInt = 15u;
public const val `RAS_MaxIpxAddress`: UInt = 21u;
public const val `RAS_MaxPadType`: UInt = 32u;
public const val `RAS_MaxPhoneNumber`: UInt = 128u;
public const val `RAS_MaxReplyMessage`: UInt = 1024u;
public const val `RAS_MaxUserData`: UInt = 200u;
public const val `RAS_MaxX25Address`: UInt = 200u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_PORT_0` (
    public var `hPort`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwPortCondition`: `RAS_PORT_CONDITION`,
    public var `dwTotalNumberOfCalls`: UInt,
    public var `dwConnectDuration`: UInt,
    public var `wszPortName`: UShortArray,
    public var `wszMediaName`: UShortArray,
    public var `wszDeviceName`: UShortArray,
    public var `wszDeviceType`: UShortArray,
)
// UNSUPPORTED Rust 3257:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_PORT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_PORT_1` (
    public var `hPort`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwHardwareCondition`: `RAS_HARDWARE_CONDITION`,
    public var `dwLineSpeed`: UInt,
    public var `dwBytesXmited`: UInt,
    public var `dwBytesRcved`: UInt,
    public var `dwFramesXmited`: UInt,
    public var `dwFramesRcved`: UInt,
    public var `dwCrcErr`: UInt,
    public var `dwTimeoutErr`: UInt,
    public var `dwAlignmentErr`: UInt,
    public var `dwHardwareOverrunErr`: UInt,
    public var `dwFramingErr`: UInt,
    public var `dwBufferOverrunErr`: UInt,
    public var `dwCompressionRatioIn`: UInt,
    public var `dwCompressionRatioOut`: UInt,
)
// UNSUPPORTED Rust 3282:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_PORT_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 17 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_PORT_2` (
    public var `hPort`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hConnection`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwConn_State`: UInt,
    public var `wszPortName`: UShortArray,
    public var `wszMediaName`: UShortArray,
    public var `wszDeviceName`: UShortArray,
    public var `wszDeviceType`: UShortArray,
    public var `dwHardwareCondition`: `RAS_HARDWARE_CONDITION`,
    public var `dwLineSpeed`: UInt,
    public var `dwCrcErr`: UInt,
    public var `dwSerialOverRunErrs`: UInt,
    public var `dwTimeoutErr`: UInt,
    public var `dwAlignmentErr`: UInt,
    public var `dwHardwareOverrunErr`: UInt,
    public var `dwFramingErr`: UInt,
    public var `dwBufferOverrunErr`: UInt,
    public var `dwCompressionRatioIn`: UInt,
    public var `dwCompressionRatioOut`: UInt,
    public var `dwTotalErrors`: UInt,
    public var `ullBytesXmited`: ULong,
    public var `ullBytesRcved`: ULong,
    public var `ullFramesXmited`: ULong,
    public var `ullFramesRcved`: ULong,
    public var `ullBytesTxUncompressed`: ULong,
    public var `ullBytesTxCompressed`: ULong,
    public var `ullBytesRcvUncompressed`: ULong,
    public var `ullBytesRcvCompressed`: ULong,
)
// UNSUPPORTED Rust 3318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_PORT_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RAS_PORT_AUTHENTICATED`: `RAS_PORT_CONDITION` = 5;
public const val `RAS_PORT_AUTHENTICATING`: `RAS_PORT_CONDITION` = 4;
public const val `RAS_PORT_CALLING_BACK`: `RAS_PORT_CONDITION` = 2;
public typealias `RAS_PORT_CONDITION` = Int;
public const val `RAS_PORT_DISCONNECTED`: `RAS_PORT_CONDITION` = 1;
public const val `RAS_PORT_INITIALIZING`: `RAS_PORT_CONDITION` = 6;
public const val `RAS_PORT_LISTENING`: `RAS_PORT_CONDITION` = 3;
public const val `RAS_PORT_NON_OPERATIONAL`: `RAS_PORT_CONDITION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_PROJECTION_INFO` (
    public var `version`: `RASAPIVERSION`,
    public var `type`: `RASPROJECTION_INFO_TYPE`,
    public var `Anonymous`: `RAS_PROJECTION_INFO_0`,
)
// UNSUPPORTED Rust 3339:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RAS_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3345:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RAS_PROJECTION_INFO_0 {
//     pub ppp: RASPPP_PROJECTION_INFO,
//     pub ikev2: RASIKEV2_PROJECTION_INFO,
// }

// UNSUPPORTED Rust 3352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RAS_PROJECTION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RAS_QUARANTINE_STATE` = Int;
public const val `RAS_QUAR_STATE_NORMAL`: `RAS_QUARANTINE_STATE` = 0;
public const val `RAS_QUAR_STATE_NOT_CAPABLE`: `RAS_QUARANTINE_STATE` = 3;
public const val `RAS_QUAR_STATE_PROBATION`: `RAS_QUARANTINE_STATE` = 2;
public const val `RAS_QUAR_STATE_QUARANTINE`: `RAS_QUARANTINE_STATE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_SECURITY_INFO` (
    public var `LastError`: UInt,
    public var `BytesReceived`: UInt,
    public var `DeviceName`: ByteArray,
)
// UNSUPPORTED Rust 3370:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_SECURITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAS_STATS` (
    public var `dwSize`: UInt,
    public var `dwBytesXmited`: UInt,
    public var `dwBytesRcved`: UInt,
    public var `dwFramesXmited`: UInt,
    public var `dwFramesRcved`: UInt,
    public var `dwCrcErr`: UInt,
    public var `dwTimeoutErr`: UInt,
    public var `dwAlignmentErr`: UInt,
    public var `dwHardwareOverrunErr`: UInt,
    public var `dwFramingErr`: UInt,
    public var `dwBufferOverrunErr`: UInt,
    public var `dwCompressionRatioIn`: UInt,
    public var `dwCompressionRatioOut`: UInt,
    public var `dwBps`: UInt,
    public var `dwConnectDuration`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 65 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_UPDATE_CONNECTION` (
    public var `Header`: `MPRAPI_OBJECT_HEADER`,
    public var `dwIfIndex`: UInt,
    public var `wszLocalEndpointAddress`: UShortArray,
    public var `wszRemoteEndpointAddress`: UShortArray,
)
// UNSUPPORTED Rust 3402:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_UPDATE_CONNECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_USER_0` (
    public var `bfPrivilege`: UByte,
    public var `wszPhoneNumber`: UShortArray,
)
// UNSUPPORTED Rust 3413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_USER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAS_USER_1` (
    public var `bfPrivilege`: UByte,
    public var `wszPhoneNumber`: UShortArray,
    public var `bfPrivilege2`: UByte,
)
// UNSUPPORTED Rust 3425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RAS_USER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RCD_AllUsers`: UInt = 1u;
public const val `RCD_Eap`: UInt = 2u;
public const val `RCD_Logon`: UInt = 4u;
public const val `RCD_SingleUser`: UInt = 0u;
public const val `RDEOPT_CustomDial`: UInt = 4096u;
public const val `RDEOPT_DisableConnectedUI`: UInt = 64u;
public const val `RDEOPT_DisableReconnect`: UInt = 256u;
public const val `RDEOPT_DisableReconnectUI`: UInt = 128u;
public const val `RDEOPT_EapInfoCryptInCapable`: UInt = 32768u;
public const val `RDEOPT_IgnoreModemSpeaker`: UInt = 4u;
public const val `RDEOPT_IgnoreSoftwareCompression`: UInt = 16u;
public const val `RDEOPT_InvokeAutoTriggerCredentialUI`: UInt = 16384u;
public const val `RDEOPT_NoUser`: UInt = 512u;
public const val `RDEOPT_PauseOnScript`: UInt = 1024u;
public const val `RDEOPT_PausedStates`: UInt = 2u;
public const val `RDEOPT_Router`: UInt = 2048u;
public const val `RDEOPT_SetModemSpeaker`: UInt = 8u;
public const val `RDEOPT_SetSoftwareCompression`: UInt = 32u;
public const val `RDEOPT_UseCustomScripting`: UInt = 8192u;
public const val `RDEOPT_UsePrefixSuffix`: UInt = 1u;
public const val `REN_AllUsers`: UInt = 1u;
public const val `REN_User`: UInt = 0u;
public typealias `ROUTER_CONNECTION_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ROUTER_CUSTOM_IKEv2_POLICY0` (
    public var `dwIntegrityMethod`: UInt,
    public var `dwEncryptionMethod`: UInt,
    public var `dwCipherTransformConstant`: UInt,
    public var `dwAuthTransformConstant`: UInt,
    public var `dwPfsGroup`: UInt,
    public var `dwDhGroup`: UInt,
)
public const val `ROUTER_IF_STATE_CONNECTED`: `ROUTER_CONNECTION_STATE` = 3;
public const val `ROUTER_IF_STATE_CONNECTING`: `ROUTER_CONNECTION_STATE` = 2;
public const val `ROUTER_IF_STATE_DISCONNECTED`: `ROUTER_CONNECTION_STATE` = 1;
public const val `ROUTER_IF_STATE_UNREACHABLE`: `ROUTER_CONNECTION_STATE` = 0;
public const val `ROUTER_IF_TYPE_CLIENT`: `ROUTER_INTERFACE_TYPE` = 0;
public const val `ROUTER_IF_TYPE_DEDICATED`: `ROUTER_INTERFACE_TYPE` = 3;
public const val `ROUTER_IF_TYPE_DIALOUT`: `ROUTER_INTERFACE_TYPE` = 7;
public const val `ROUTER_IF_TYPE_FULL_ROUTER`: `ROUTER_INTERFACE_TYPE` = 2;
public const val `ROUTER_IF_TYPE_HOME_ROUTER`: `ROUTER_INTERFACE_TYPE` = 1;
public const val `ROUTER_IF_TYPE_INTERNAL`: `ROUTER_INTERFACE_TYPE` = 4;
public const val `ROUTER_IF_TYPE_LOOPBACK`: `ROUTER_INTERFACE_TYPE` = 5;
public const val `ROUTER_IF_TYPE_MAX`: `ROUTER_INTERFACE_TYPE` = 8;
public const val `ROUTER_IF_TYPE_TUNNEL1`: `ROUTER_INTERFACE_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ROUTER_IKEv2_IF_CUSTOM_CONFIG0` (
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSize`: UInt,
    public var `certificateName`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
)
// UNSUPPORTED Rust 3485:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for ROUTER_IKEv2_IF_CUSTOM_CONFIG0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ROUTER_IKEv2_IF_CUSTOM_CONFIG1` (
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSize`: UInt,
    public var `certificateName`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
    public var `certificateHash`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 3501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for ROUTER_IKEv2_IF_CUSTOM_CONFIG1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ROUTER_IKEv2_IF_CUSTOM_CONFIG2` (
    public var `dwSaLifeTime`: UInt,
    public var `dwSaDataSize`: UInt,
    public var `certificateName`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `customPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ROUTER_CUSTOM_IKEv2_POLICY0`>?,
    public var `certificateHash`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `dwMmSaLifeTime`: UInt,
    public var `vpnTrafficSelectors`: `MPR_VPN_TRAFFIC_SELECTORS`,
)
// UNSUPPORTED Rust 3519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// impl Default for ROUTER_IKEv2_IF_CUSTOM_CONFIG2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ROUTER_INTERFACE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ROUTING_PROTOCOL_CONFIG` (
    public var `dwCallbackFlags`: UInt,
    public var `pfnRpfCallback`: `PMGM_RPF_CALLBACK`,
    public var `pfnCreationAlertCallback`: `PMGM_CREATION_ALERT_CALLBACK`,
    public var `pfnPruneAlertCallback`: `PMGM_PRUNE_ALERT_CALLBACK`,
    public var `pfnJoinAlertCallback`: `PMGM_JOIN_ALERT_CALLBACK`,
    public var `pfnWrongIfCallback`: `PMGM_WRONG_IF_CALLBACK`,
    public var `pfnLocalJoinCallback`: `PMGM_LOCAL_JOIN_CALLBACK`,
    public var `pfnLocalLeaveCallback`: `PMGM_LOCAL_LEAVE_CALLBACK`,
    public var `pfnDisableIgmpCallback`: `PMGM_DISABLE_IGMP_CALLBACK`,
    public var `pfnEnableIgmpCallback`: `PMGM_ENABLE_IGMP_CALLBACK`,
)
// UNSUPPORTED Rust 3540:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RRAS_SERVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteAccess");

public const val `RTM_BLOCK_METHODS`: UInt = 1u;
public const val `RTM_CHANGE_NOTIFICATION`: `RTM_EVENT_TYPE` = 3;
public const val `RTM_CHANGE_TYPE_ALL`: UInt = 1u;
public const val `RTM_CHANGE_TYPE_BEST`: UInt = 2u;
public const val `RTM_CHANGE_TYPE_FORWARDING`: UInt = 4u;
public const val `RTM_DEST_FLAG_DONT_FORWARD`: UInt = 4u;
public const val `RTM_DEST_FLAG_FWD_ENGIN_ADD`: UInt = 2u;
public const val `RTM_DEST_FLAG_NATURAL_NET`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_DEST_INFO` (
    public var `DestHandle`: Long,
    public var `DestAddress`: `RTM_NET_ADDRESS`,
    public var `LastChanged`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `BelongsToViews`: UInt,
    public var `NumberOfViews`: UInt,
    public var `ViewInfo`: Array<`RTM_DEST_INFO_0`>,
)
// UNSUPPORTED Rust 3559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_DEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RTM_DEST_INFO_0` (
    public var `ViewId`: Int,
    public var `NumRoutes`: UInt,
    public var `Route`: Long,
    public var `Owner`: Long,
    public var `DestFlags`: UInt,
    public var `HoldRoute`: Long,
)
public const val `RTM_ENTITY_DEREGISTERED`: `RTM_EVENT_TYPE` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RTM_ENTITY_EXPORT_METHOD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, Long, /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_METHOD_INPUT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`RTM_ENTITY_METHOD_OUTPUT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_ENTITY_EXPORT_METHODS` (
    public var `NumMethods`: UInt,
    public var `Methods`: Array<`RTM_ENTITY_EXPORT_METHOD`>,
)
// UNSUPPORTED Rust 3582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ENTITY_EXPORT_METHODS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_ENTITY_ID` (
    public var `Anonymous`: `RTM_ENTITY_ID_0`,
)
// UNSUPPORTED Rust 3592:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ENTITY_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3597:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RTM_ENTITY_ID_0 {
//     pub Anonymous: RTM_ENTITY_ID_0_0,
//     pub EntityId: u64,
// }

// UNSUPPORTED Rust 3603:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ENTITY_ID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RTM_ENTITY_ID_0_0` (
    public var `EntityProtocolId`: UInt,
    public var `EntityInstanceId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_ENTITY_INFO` (
    public var `RtmInstanceId`: UShort,
    public var `AddressFamily`: UShort,
    public var `EntityId`: `RTM_ENTITY_ID`,
)
// UNSUPPORTED Rust 3621:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ENTITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_ENTITY_METHOD_INPUT` (
    public var `MethodType`: UInt,
    public var `InputSize`: UInt,
    public var `InputData`: UByteArray,
)
// UNSUPPORTED Rust 3633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ENTITY_METHOD_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_ENTITY_METHOD_OUTPUT` (
    public var `MethodType`: UInt,
    public var `MethodStatus`: UInt,
    public var `OutputSize`: UInt,
    public var `OutputData`: UByteArray,
)
// UNSUPPORTED Rust 3646:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ENTITY_METHOD_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_ENTITY_REGISTERED`: `RTM_EVENT_TYPE` = 0;
public const val `RTM_ENUM_ALL_DESTS`: UInt = 0u;
public const val `RTM_ENUM_ALL_ROUTES`: UInt = 0u;
public const val `RTM_ENUM_NEXT`: UInt = 1u;
public const val `RTM_ENUM_OWN_DESTS`: UInt = 16777216u;
public const val `RTM_ENUM_OWN_ROUTES`: UInt = 65536u;
public const val `RTM_ENUM_RANGE`: UInt = 2u;
public const val `RTM_ENUM_START`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RTM_EVENT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, `RTM_EVENT_TYPE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public typealias `RTM_EVENT_TYPE` = Int;
public const val `RTM_MATCH_FULL`: UInt = 65535u;
public const val `RTM_MATCH_INTERFACE`: UInt = 16u;
public const val `RTM_MATCH_NEIGHBOUR`: UInt = 2u;
public const val `RTM_MATCH_NEXTHOP`: UInt = 8u;
public const val `RTM_MATCH_NONE`: UInt = 0u;
public const val `RTM_MATCH_OWNER`: UInt = 1u;
public const val `RTM_MATCH_PREF`: UInt = 4u;
public const val `RTM_MAX_ADDRESS_SIZE`: UInt = 16u;
public const val `RTM_MAX_VIEWS`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_NET_ADDRESS` (
    public var `AddressFamily`: UShort,
    public var `NumBits`: UShort,
    public var `AddrBits`: UByteArray,
)
// UNSUPPORTED Rust 3677:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_NET_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_NEXTHOP_CHANGE_NEW`: UInt = 1u;
public const val `RTM_NEXTHOP_FLAGS_DOWN`: UInt = 2u;
public const val `RTM_NEXTHOP_FLAGS_REMOTE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_NEXTHOP_INFO` (
    public var `NextHopAddress`: `RTM_NET_ADDRESS`,
    public var `NextHopOwner`: Long,
    public var `InterfaceIndex`: UInt,
    public var `State`: UShort,
    public var `Flags`: UShort,
    public var `EntitySpecificInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `RemoteNextHop`: Long,
)
// UNSUPPORTED Rust 3696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_NEXTHOP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_NEXTHOP_LIST` (
    public var `NumNextHops`: UShort,
    public var `NextHops`: LongArray,
)
// UNSUPPORTED Rust 3707:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_NEXTHOP_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_NEXTHOP_STATE_CREATED`: UInt = 0u;
public const val `RTM_NEXTHOP_STATE_DELETED`: UInt = 1u;
public const val `RTM_NOTIFY_ONLY_MARKED_DESTS`: UInt = 65536u;
public const val `RTM_NUM_CHANGE_TYPES`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RTM_PREF_INFO` (
    public var `Metric`: UInt,
    public var `Preference`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RTM_REGN_PROFILE` (
    public var `MaxNextHopsInRoute`: UInt,
    public var `MaxHandlesInEnum`: UInt,
    public var `ViewsSupported`: UInt,
    public var `NumberOfViews`: UInt,
)
public const val `RTM_RESUME_METHODS`: UInt = 0u;
public const val `RTM_ROUTE_CHANGE_BEST`: UInt = 65536u;
public const val `RTM_ROUTE_CHANGE_FIRST`: UInt = 1u;
public const val `RTM_ROUTE_CHANGE_NEW`: UInt = 2u;
public const val `RTM_ROUTE_EXPIRED`: `RTM_EVENT_TYPE` = 2;
public const val `RTM_ROUTE_FLAGS_BLACKHOLE`: UInt = 2u;
public const val `RTM_ROUTE_FLAGS_DISCARD`: UInt = 4u;
public const val `RTM_ROUTE_FLAGS_INACTIVE`: UInt = 8u;
public const val `RTM_ROUTE_FLAGS_LIMITED_BC`: UInt = 1024u;
public const val `RTM_ROUTE_FLAGS_LOCAL`: UInt = 16u;
public const val `RTM_ROUTE_FLAGS_LOCAL_MCAST`: UInt = 512u;
public const val `RTM_ROUTE_FLAGS_LOOPBACK`: UInt = 128u;
public const val `RTM_ROUTE_FLAGS_MARTIAN`: UInt = 1u;
public const val `RTM_ROUTE_FLAGS_MCAST`: UInt = 256u;
public const val `RTM_ROUTE_FLAGS_MYSELF`: UInt = 64u;
public const val `RTM_ROUTE_FLAGS_ONES_NETBC`: UInt = 16384u;
public const val `RTM_ROUTE_FLAGS_ONES_SUBNETBC`: UInt = 32768u;
public const val `RTM_ROUTE_FLAGS_REMOTE`: UInt = 32u;
public const val `RTM_ROUTE_FLAGS_ZEROS_NETBC`: UInt = 4096u;
public const val `RTM_ROUTE_FLAGS_ZEROS_SUBNETBC`: UInt = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RTM_ROUTE_INFO` (
    public var `DestHandle`: Long,
    public var `RouteOwner`: Long,
    public var `Neighbour`: Long,
    public var `State`: UByte,
    public var `Flags1`: UByte,
    public var `Flags`: UShort,
    public var `PrefInfo`: `RTM_PREF_INFO`,
    public var `BelongsToViews`: UInt,
    public var `EntitySpecificInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NextHopsList`: `RTM_NEXTHOP_LIST`,
)
// UNSUPPORTED Rust 3764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RTM_ROUTE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_ROUTE_STATE_CREATED`: UInt = 0u;
public const val `RTM_ROUTE_STATE_DELETED`: UInt = 2u;
public const val `RTM_ROUTE_STATE_DELETING`: UInt = 1u;
public const val `RTM_VIEW_ID_MCAST`: UInt = 1u;
public const val `RTM_VIEW_ID_UCAST`: UInt = 0u;
public const val `RTM_VIEW_MASK_ALL`: UInt = 4294967295u;
public const val `RTM_VIEW_MASK_ANY`: UInt = 0u;
public const val `RTM_VIEW_MASK_MCAST`: UInt = 2u;
public const val `RTM_VIEW_MASK_NONE`: UInt = 0u;
public const val `RTM_VIEW_MASK_SIZE`: UInt = 32u;
public const val `RTM_VIEW_MASK_UCAST`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RasCustomDeleteEntryNotifyFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RasCustomDialDlgFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HINSTANCE`, UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALDLG`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RasCustomDialFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HINSTANCE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALEXTENSIONS`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALPARAMSA`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`HRASCONN`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RasCustomEntryDlgFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HINSTANCE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASENTRYDLGA`>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RasCustomHangUpFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HRASCONN`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RasCustomScriptExecuteFn` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `PFNRASGETBUFFER`, `PFNRASFREEBUFFER`, `PFNRASSENDBUFFER`, `PFNRASRECEIVEBUFFER`, `PFNRASRETRIEVEBUFFER`, `super`.`super`.`Foundation`.`HWND`, /* Rust *mut */ kotlinx.cinterop.CPointer<`RASDIALPARAMSA`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public const val `SECURITYMSG_ERROR`: `SECURITY_MESSAGE_MSG_ID` = 3u;
public const val `SECURITYMSG_FAILURE`: `SECURITY_MESSAGE_MSG_ID` = 2u;
public const val `SECURITYMSG_SUCCESS`: `SECURITY_MESSAGE_MSG_ID` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SECURITY_MESSAGE` (
    public var `dwMsgId`: `SECURITY_MESSAGE_MSG_ID`,
    public var `hPort`: Long,
    public var `dwError`: UInt,
    public var `UserName`: ByteArray,
    public var `Domain`: ByteArray,
)
// UNSUPPORTED Rust 3798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SECURITY_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURITY_MESSAGE_MSG_ID` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SOURCE_GROUP_ENTRY` (
    public var `dwSourceAddr`: UInt,
    public var `dwSourceMask`: UInt,
    public var `dwGroupAddr`: UInt,
    public var `dwGroupMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SSTP_CERT_INFO` (
    public var `isDefault`: `windows_sys`.`core`.`BOOL`,
    public var `certBlob`: `super`.`super`.`Security`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SSTP_CONFIG_PARAMS` (
    public var `dwNumPorts`: UInt,
    public var `dwPortFlags`: UInt,
    public var `isUseHttps`: `windows_sys`.`core`.`BOOL`,
    public var `certAlgorithm`: UInt,
    public var `sstpCertDetails`: `SSTP_CERT_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VPN_TS_IP_ADDRESS` (
    public var `Type`: UShort,
    public var `Anonymous`: `VPN_TS_IP_ADDRESS_0`,
)
// UNSUPPORTED Rust 3836:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for VPN_TS_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3842:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union VPN_TS_IP_ADDRESS_0 {
//     pub v4: super::super::Networking::WinSock::IN_ADDR,
//     pub v6: super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 3849:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for VPN_TS_IP_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VS_Default`: UInt = 0u;
public const val `VS_GREOnly`: UInt = 9u;
public const val `VS_Ikev2First`: UInt = 8u;
public const val `VS_Ikev2Only`: UInt = 7u;
public const val `VS_Ikev2Sstp`: UInt = 14u;
public const val `VS_L2tpFirst`: UInt = 4u;
public const val `VS_L2tpOnly`: UInt = 3u;
public const val `VS_L2tpSstp`: UInt = 13u;
public const val `VS_PptpFirst`: UInt = 2u;
public const val `VS_PptpOnly`: UInt = 1u;
public const val `VS_PptpSstp`: UInt = 12u;
public const val `VS_ProtocolList`: UInt = 15u;
public const val `VS_SstpFirst`: UInt = 6u;
public const val `VS_SstpOnly`: UInt = 5u;
public const val `WARNING_MSG_ALIAS_NOT_ADDED`: UInt = 644u;
public const val `WM_RASDIALEVENT`: UInt = 52429u;
