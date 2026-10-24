// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddISNSServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddISNSServerA`(`address` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddISNSServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddISNSServerW`(`address` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddIScsiConnectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIScsiConnectionA`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initiatorportnumber` : UInt, `targetportal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?, `securityflags` : ULong, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `keysize` : UInt, `key` : `windows_sys`.`core`.`PCSTR`, `connectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddIScsiConnectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIScsiConnectionW`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initiatorportnumber` : UInt, `targetportal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?, `securityflags` : ULong, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `keysize` : UInt, `key` : `windows_sys`.`core`.`PCSTR`, `connectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddIScsiSendTargetPortalA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIScsiSendTargetPortalA`(`initiatorinstance` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `securityflags` : ULong, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddIScsiSendTargetPortalW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIScsiSendTargetPortalW`(`initiatorinstance` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `securityflags` : ULong, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddIScsiStaticTargetA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIScsiStaticTargetA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `targetalias` : `windows_sys`.`core`.`PCSTR`, `targetflags` : UInt, `persist` : Boolean, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_MAPPINGA`>?, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `portalgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTAL_GROUPA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddIScsiStaticTargetW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIScsiStaticTargetW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `targetalias` : `windows_sys`.`core`.`PCWSTR`, `targetflags` : UInt, `persist` : Boolean, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_MAPPINGW`>?, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `portalgroup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTAL_GROUPW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddPersistentIScsiDeviceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPersistentIScsiDeviceA`(`devicepath` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddPersistentIScsiDeviceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPersistentIScsiDeviceW`(`devicepath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddRadiusServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddRadiusServerA`(`address` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=AddRadiusServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddRadiusServerW`(`address` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ClearPersistentIScsiDevices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClearPersistentIScsiDevices`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetDevicesForIScsiSessionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Ioctl")]
public external fun `GetDevicesForIScsiSessionA`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `devicecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `devices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_DEVICE_ON_SESSIONA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetDevicesForIScsiSessionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Ioctl")]
public external fun `GetDevicesForIScsiSessionW`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `devicecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `devices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_DEVICE_ON_SESSIONW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiIKEInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiIKEInfoA`(`initiatorname` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IKE_AUTHENTICATION_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiIKEInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiIKEInfoW`(`initiatorname` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `authinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IKE_AUTHENTICATION_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiInitiatorNodeNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiInitiatorNodeNameA`(`initiatornodename` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiInitiatorNodeNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiInitiatorNodeNameW`(`initiatornodename` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiSessionListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiSessionListA`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sessioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sessioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_SESSION_INFOA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiSessionListEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiSessionListEx`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sessioncountptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sessioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_SESSION_INFO_EX`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiSessionListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiSessionListW`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sessioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sessioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_SESSION_INFOW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiTargetInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiTargetInformationA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `discoverymechanism` : `windows_sys`.`core`.`PCSTR`, `infoclass` : `TARGET_INFORMATION_CLASS`, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiTargetInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiTargetInformationW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `discoverymechanism` : `windows_sys`.`core`.`PCWSTR`, `infoclass` : `TARGET_INFORMATION_CLASS`, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=GetIScsiVersionInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIScsiVersionInformation`(`versioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_VERSION_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=LoginIScsiTargetA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoginIScsiTargetA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `isinformationalsession` : Boolean, `initiatorinstance` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `targetportal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?, `securityflags` : ULong, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_MAPPINGA`>?, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `keysize` : UInt, `key` : `windows_sys`.`core`.`PCSTR`, `ispersistent` : Boolean, `uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `uniqueconnectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=LoginIScsiTargetW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoginIScsiTargetW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `isinformationalsession` : Boolean, `initiatorinstance` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `targetportal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?, `securityflags` : ULong, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_MAPPINGW`>?, `loginoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_LOGIN_OPTIONS`>?, `keysize` : UInt, `key` : `windows_sys`.`core`.`PCSTR`, `ispersistent` : Boolean, `uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `uniqueconnectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=LogoutIScsiTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LogoutIScsiTarget`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RefreshISNSServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RefreshISNSServerA`(`address` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RefreshISNSServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RefreshISNSServerW`(`address` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RefreshIScsiSendTargetPortalA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RefreshIScsiSendTargetPortalA`(`initiatorinstance` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RefreshIScsiSendTargetPortalW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RefreshIScsiSendTargetPortalW`(`initiatorinstance` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveISNSServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveISNSServerA`(`address` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveISNSServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveISNSServerW`(`address` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiConnection`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `connectionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiPersistentTargetA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiPersistentTargetA`(`initiatorinstance` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `targetname` : `windows_sys`.`core`.`PCSTR`, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiPersistentTargetW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiPersistentTargetW`(`initiatorinstance` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `targetname` : `windows_sys`.`core`.`PCWSTR`, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiSendTargetPortalA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiSendTargetPortalA`(`initiatorinstance` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiSendTargetPortalW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiSendTargetPortalW`(`initiatorinstance` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `portal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiStaticTargetA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiStaticTargetA`(`targetname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveIScsiStaticTargetW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveIScsiStaticTargetW`(`targetname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemovePersistentIScsiDeviceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePersistentIScsiDeviceA`(`devicepath` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemovePersistentIScsiDeviceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePersistentIScsiDeviceW`(`devicepath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveRadiusServerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveRadiusServerA`(`address` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=RemoveRadiusServerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveRadiusServerW`(`address` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportActiveIScsiTargetMappingsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportActiveIScsiTargetMappingsA`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mappingcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_MAPPINGA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportActiveIScsiTargetMappingsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportActiveIScsiTargetMappingsW`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mappingcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_MAPPINGW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportISNSServerListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportISNSServerListA`(`buffersizeinchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportISNSServerListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportISNSServerListW`(`buffersizeinchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiInitiatorListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiInitiatorListA`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiInitiatorListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiInitiatorListW`(`buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiPersistentLoginsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiPersistentLoginsA`(`count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `persistentlogininfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERSISTENT_ISCSI_LOGIN_INFOA`>?, `buffersizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiPersistentLoginsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiPersistentLoginsW`(`count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `persistentlogininfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERSISTENT_ISCSI_LOGIN_INFOW`>?, `buffersizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiSendTargetPortalsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiSendTargetPortalsA`(`portalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTAL_INFOA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiSendTargetPortalsExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiSendTargetPortalsExA`(`portalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portalinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTAL_INFO_EXA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiSendTargetPortalsExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiSendTargetPortalsExW`(`portalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portalinfosize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTAL_INFO_EXW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiSendTargetPortalsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiSendTargetPortalsW`(`portalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portalinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTAL_INFOW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiTargetPortalsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiTargetPortalsA`(`initiatorname` : `windows_sys`.`core`.`PCSTR`, `targetname` : `windows_sys`.`core`.`PCSTR`, `targetportaltag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `elementcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portals` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiTargetPortalsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiTargetPortalsW`(`initiatorname` : `windows_sys`.`core`.`PCWSTR`, `targetname` : `windows_sys`.`core`.`PCWSTR`, `targetportaltag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `elementcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portals` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_TARGET_PORTALW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiTargetsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiTargetsA`(`forceupdate` : Boolean, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportIScsiTargetsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportIScsiTargetsW`(`forceupdate` : Boolean, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportPersistentIScsiDevicesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportPersistentIScsiDevicesA`(`buffersizeinchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportPersistentIScsiDevicesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportPersistentIScsiDevicesW`(`buffersizeinchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportRadiusServerListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportRadiusServerListA`(`buffersizeinchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=ReportRadiusServerListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportRadiusServerListW`(`buffersizeinchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SendScsiInquiry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendScsiInquiry`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `lun` : ULong, `evpdcmddt` : UByte, `pagecode` : UByte, `scsistatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `responsesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `responsebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `sensesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sensebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SendScsiReadCapacity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendScsiReadCapacity`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `lun` : ULong, `scsistatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `responsesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `responsebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `sensesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sensebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SendScsiReportLuns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendScsiReportLuns`(`uniquesessionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_UNIQUE_SESSION_ID`>?, `scsistatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `responsesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `responsebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `sensesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sensebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiGroupPresharedKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiGroupPresharedKey`(`keylength` : UInt, `key` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `persist` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiIKEInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiIKEInfoA`(`initiatorname` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `authinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IKE_AUTHENTICATION_INFORMATION`>?, `persist` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiIKEInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiIKEInfoW`(`initiatorname` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `authinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IKE_AUTHENTICATION_INFORMATION`>?, `persist` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiInitiatorCHAPSharedSecret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiInitiatorCHAPSharedSecret`(`sharedsecretlength` : UInt, `sharedsecret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiInitiatorNodeNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiInitiatorNodeNameA`(`initiatornodename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiInitiatorNodeNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiInitiatorNodeNameW`(`initiatornodename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiInitiatorRADIUSSharedSecret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiInitiatorRADIUSSharedSecret`(`sharedsecretlength` : UInt, `sharedsecret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiTunnelModeOuterAddressA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiTunnelModeOuterAddressA`(`initiatorname` : `windows_sys`.`core`.`PCSTR`, `initiatorportnumber` : UInt, `destinationaddress` : `windows_sys`.`core`.`PCSTR`, `outermodeaddress` : `windows_sys`.`core`.`PCSTR`, `persist` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetIScsiTunnelModeOuterAddressW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIScsiTunnelModeOuterAddressW`(`initiatorname` : `windows_sys`.`core`.`PCWSTR`, `initiatorportnumber` : UInt, `destinationaddress` : `windows_sys`.`core`.`PCWSTR`, `outermodeaddress` : `windows_sys`.`core`.`PCWSTR`, `persist` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetupPersistentIScsiDevices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetupPersistentIScsiDevices`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iscsidsc.dll, ABI=system, export=SetupPersistentIScsiVolumes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetupPersistentIScsiVolumes`() : UInt
public const val `ATA_FLAGS_48BIT_COMMAND`: UInt = 8u;
public const val `ATA_FLAGS_DATA_IN`: UInt = 2u;
public const val `ATA_FLAGS_DATA_OUT`: UInt = 4u;
public const val `ATA_FLAGS_DRDY_REQUIRED`: UInt = 1u;
public const val `ATA_FLAGS_NO_MULTIPLE`: UInt = 32u;
public const val `ATA_FLAGS_USE_DMA`: UInt = 16u;
// UNSUPPORTED Rust 88:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATA_PASS_THROUGH_DIRECT {
//     pub Length: u16,
//     pub AtaFlags: u16,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub ReservedAsUchar: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub ReservedAsUlong: u32,
//     pub DataBuffer: *mut core::ffi::c_void,
//     pub PreviousTaskFile: [u8; 8],
//     pub CurrentTaskFile: [u8; 8],
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ATA_PASS_THROUGH_DIRECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 109:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct ATA_PASS_THROUGH_DIRECT32 {
//     pub Length: u16,
//     pub AtaFlags: u16,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub ReservedAsUchar: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub ReservedAsUlong: u32,
//     pub DataBuffer: *mut core::ffi::c_void,
//     pub PreviousTaskFile: [u8; 8],
//     pub CurrentTaskFile: [u8; 8],
// }

// UNSUPPORTED Rust 126:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for ATA_PASS_THROUGH_DIRECT32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 132:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATA_PASS_THROUGH_EX {
//     pub Length: u16,
//     pub AtaFlags: u16,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub ReservedAsUchar: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub ReservedAsUlong: u32,
//     pub DataBufferOffset: usize,
//     pub PreviousTaskFile: [u8; 8],
//     pub CurrentTaskFile: [u8; 8],
// }

// UNSUPPORTED Rust 148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ATA_PASS_THROUGH_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 153:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct ATA_PASS_THROUGH_EX32 {
//     pub Length: u16,
//     pub AtaFlags: u16,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub ReservedAsUchar: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub ReservedAsUlong: u32,
//     pub DataBufferOffset: u32,
//     pub PreviousTaskFile: [u8; 8],
//     pub CurrentTaskFile: [u8; 8],
// }

// UNSUPPORTED Rust 170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for ATA_PASS_THROUGH_EX32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 176:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_SCSI_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("\\Device\\ScsiPort");

// UNSUPPORTED Rust 177:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSM_NOTIFICATION_REQUEST_BLOCK {
//     pub Size: u32,
//     pub Version: u32,
//     pub NotifyFlags: u32,
//     pub DataSetProfile: u32,
//     pub Reserved: [u32; 3],
//     pub DataSetRangesCount: u32,
//     pub DataSetRanges: [MP_DEVICE_DATA_SET_RANGE; 1],
// }

// UNSUPPORTED Rust 188:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DSM_NOTIFICATION_REQUEST_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 193:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DUMP_DRIVER {
//     pub DumpDriverList: *mut core::ffi::c_void,
//     pub DriverName: [u16; 15],
//     pub BaseName: [u16; 15],
// }

// UNSUPPORTED Rust 200:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_DRIVER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 205:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DUMP_DRIVER_EX {
//     pub DumpDriverList: *mut core::ffi::c_void,
//     pub DriverName: [u16; 15],
//     pub BaseName: [u16; 15],
//     pub DriverFullPath: NTSCSI_UNICODE_STRING,
// }

// UNSUPPORTED Rust 213:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_DRIVER_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DUMP_DRIVER_NAME_LENGTH`: UInt = 15u;
public const val `DUMP_EX_FLAG_DRIVER_FULL_PATH_SUPPORT`: UInt = 8u;
public const val `DUMP_EX_FLAG_RESUME_SUPPORT`: UInt = 4u;
public const val `DUMP_EX_FLAG_SUPPORT_64BITMEMORY`: UInt = 1u;
public const val `DUMP_EX_FLAG_SUPPORT_DD_TELEMETRY`: UInt = 2u;
// UNSUPPORTED Rust 223:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DUMP_POINTERS {
//     pub AdapterObject: *mut _ADAPTER_OBJECT,
//     pub MappedRegisterBase: *mut core::ffi::c_void,
//     pub DumpData: *mut core::ffi::c_void,
//     pub CommonBufferVa: *mut core::ffi::c_void,
//     pub CommonBufferPa: i64,
//     pub CommonBufferSize: u32,
//     pub AllocateCommonBuffers: bool,
//     pub UseDiskDump: bool,
//     pub Spare1: [u8; 2],
//     pub DeviceObject: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 237:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_POINTERS {
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
public class `DUMP_POINTERS_EX` (
    public var `Header`: `DUMP_POINTERS_VERSION`,
    public var `DumpData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CommonBufferVa`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `CommonBufferSize`: UInt,
    public var `AllocateCommonBuffers`: Boolean,
    public var `DeviceObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DriverList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwPortFlags`: UInt,
    public var `MaxDeviceDumpSectionSize`: UInt,
    public var `MaxDeviceDumpLevel`: UInt,
    public var `MaxTransferSize`: UInt,
    public var `AdapterObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MappedRegisterBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DeviceReady`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?,
    public var `DumpDevicePowerOn`: `PDUMP_DEVICE_POWERON_ROUTINE`,
    public var `DumpDevicePowerOnContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_POINTERS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DUMP_POINTERS_VERSION` (
    public var `Version`: UInt,
    public var `Size`: UInt,
)
public const val `DUMP_POINTERS_VERSION_1`: UInt = 1u;
public const val `DUMP_POINTERS_VERSION_2`: UInt = 2u;
public const val `DUMP_POINTERS_VERSION_3`: UInt = 3u;
public const val `DUMP_POINTERS_VERSION_4`: UInt = 4u;
public const val `DiscoveryMechanisms`: `TARGET_INFORMATION_CLASS` = 2;
public const val `FILE_DEVICE_SCSI`: UInt = 27u;
public const val `FIRMWARE_FUNCTION_ACTIVATE`: UInt = 3u;
public const val `FIRMWARE_FUNCTION_DOWNLOAD`: UInt = 2u;
public const val `FIRMWARE_FUNCTION_GET_INFO`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FIRMWARE_REQUEST_BLOCK` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Function`: UInt,
    public var `Flags`: UInt,
    public var `DataBufferOffset`: UInt,
    public var `DataBufferLength`: UInt,
)
public const val `FIRMWARE_REQUEST_BLOCK_STRUCTURE_VERSION`: UInt = 1u;
public const val `FIRMWARE_REQUEST_FLAG_CONTROLLER`: UInt = 1u;
public const val `FIRMWARE_REQUEST_FLAG_FIRST_SEGMENT`: UInt = 4u;
public const val `FIRMWARE_REQUEST_FLAG_LAST_SEGMENT`: UInt = 2u;
public const val `FIRMWARE_REQUEST_FLAG_REPLACE_EXISTING_IMAGE`: UInt = 1073741824u;
public const val `FIRMWARE_REQUEST_FLAG_SWITCH_TO_EXISTING_FIRMWARE`: UInt = 2147483648u;
public const val `FIRMWARE_STATUS_COMMAND_ABORT`: UInt = 133u;
public const val `FIRMWARE_STATUS_CONTROLLER_ERROR`: UInt = 16u;
public const val `FIRMWARE_STATUS_DEVICE_ERROR`: UInt = 64u;
public const val `FIRMWARE_STATUS_END_OF_MEDIA`: UInt = 134u;
public const val `FIRMWARE_STATUS_ERROR`: UInt = 1u;
public const val `FIRMWARE_STATUS_ID_NOT_FOUND`: UInt = 131u;
public const val `FIRMWARE_STATUS_ILLEGAL_LENGTH`: UInt = 135u;
public const val `FIRMWARE_STATUS_ILLEGAL_REQUEST`: UInt = 2u;
public const val `FIRMWARE_STATUS_INPUT_BUFFER_TOO_BIG`: UInt = 4u;
public const val `FIRMWARE_STATUS_INTERFACE_CRC_ERROR`: UInt = 128u;
public const val `FIRMWARE_STATUS_INVALID_IMAGE`: UInt = 7u;
public const val `FIRMWARE_STATUS_INVALID_PARAMETER`: UInt = 3u;
public const val `FIRMWARE_STATUS_INVALID_SLOT`: UInt = 6u;
public const val `FIRMWARE_STATUS_MEDIA_CHANGE`: UInt = 130u;
public const val `FIRMWARE_STATUS_MEDIA_CHANGE_REQUEST`: UInt = 132u;
public const val `FIRMWARE_STATUS_OUTPUT_BUFFER_TOO_SMALL`: UInt = 5u;
public const val `FIRMWARE_STATUS_POWER_CYCLE_REQUIRED`: UInt = 32u;
public const val `FIRMWARE_STATUS_SUCCESS`: UInt = 0u;
public const val `FIRMWARE_STATUS_UNCORRECTABLE_DATA_ERROR`: UInt = 129u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HYBRID_DEMOTE_BY_SIZE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SourcePriority`: UByte,
    public var `TargetPriority`: UByte,
    public var `Reserved0`: UShort,
    public var `Reserved1`: UInt,
    public var `LbaCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HYBRID_DIRTY_THRESHOLDS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DirtyLowThreshold`: UInt,
    public var `DirtyHighThreshold`: UInt,
)
public const val `HYBRID_FUNCTION_DEMOTE_BY_SIZE`: UInt = 19u;
public const val `HYBRID_FUNCTION_DISABLE_CACHING_MEDIUM`: UInt = 16u;
public const val `HYBRID_FUNCTION_ENABLE_CACHING_MEDIUM`: UInt = 17u;
public const val `HYBRID_FUNCTION_GET_INFO`: UInt = 1u;
public const val `HYBRID_FUNCTION_SET_DIRTY_THRESHOLD`: UInt = 18u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HYBRID_INFORMATION` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `HybridSupported`: Boolean,
    public var `Status`: `NVCACHE_STATUS`,
    public var `CacheTypeEffective`: `NVCACHE_TYPE`,
    public var `CacheTypeDefault`: `NVCACHE_TYPE`,
    public var `FractionBase`: UInt,
    public var `CacheSize`: ULong,
    public var `Attributes`: `HYBRID_INFORMATION_0`,
    public var `Priorities`: `HYBRID_INFORMATION_1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HYBRID_INFORMATION_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 360:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HYBRID_INFORMATION_1 {
//     pub PriorityLevelCount: u8,
//     pub MaxPriorityBehavior: bool,
//     pub OptimalWriteGranularity: u8,
//     pub Reserved: u8,
//     pub DirtyThresholdLow: u32,
//     pub DirtyThresholdHigh: u32,
//     pub SupportedCommands: HYBRID_INFORMATION_1_0,
//     pub Priority: [NVCACHE_PRIORITY_LEVEL_DESCRIPTOR; 1],
// }

// UNSUPPORTED Rust 372:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HYBRID_INFORMATION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HYBRID_INFORMATION_1_0` (
    public var `_bitfield`: UInt,
    public var `MaxEvictCommands`: UInt,
    public var `MaxLbaRangeCountForEvict`: UInt,
    public var `MaxLbaRangeCountForChangeLba`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HYBRID_REQUEST_BLOCK` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Function`: UInt,
    public var `Flags`: UInt,
    public var `DataBufferOffset`: UInt,
    public var `DataBufferLength`: UInt,
)
public const val `HYBRID_REQUEST_BLOCK_STRUCTURE_VERSION`: UInt = 1u;
public const val `HYBRID_REQUEST_INFO_STRUCTURE_VERSION`: UInt = 1u;
public const val `HYBRID_STATUS_ENABLE_REFCOUNT_HOLD`: UInt = 16u;
public const val `HYBRID_STATUS_ILLEGAL_REQUEST`: UInt = 1u;
public const val `HYBRID_STATUS_INVALID_PARAMETER`: UInt = 2u;
public const val `HYBRID_STATUS_OUTPUT_BUFFER_TOO_SMALL`: UInt = 3u;
public const val `HYBRID_STATUS_SUCCESS`: UInt = 0u;
// UNSUPPORTED Rust 402:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IDE_IO_CONTROL {
//     pub HeaderLength: u32,
//     pub Signature: [u8; 8],
//     pub Timeout: u32,
//     pub ControlCode: u32,
//     pub ReturnStatus: u32,
//     pub DataLength: u32,
// }

// UNSUPPORTED Rust 412:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IDE_IO_CONTROL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 417:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ID_FQDN: windows_sys::core::PCSTR = windows_sys::core::s!("2");

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ID_IPV4_ADDR: windows_sys::core::PCSTR = windows_sys::core::s!("1");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ID_IPV6_ADDR: windows_sys::core::PCSTR = windows_sys::core::s!("5");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ID_USER_FQDN: windows_sys::core::PCSTR = windows_sys::core::s!("3");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKE_AUTHENTICATION_INFORMATION` (
    public var `AuthMethod`: `IKE_AUTHENTICATION_METHOD`,
    public var `Anonymous`: `IKE_AUTHENTICATION_INFORMATION_0`,
)
// UNSUPPORTED Rust 427:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKE_AUTHENTICATION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 432:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKE_AUTHENTICATION_INFORMATION_0 {
//     pub PsKey: IKE_AUTHENTICATION_PRESHARED_KEY,
// }

// UNSUPPORTED Rust 437:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKE_AUTHENTICATION_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKE_AUTHENTICATION_METHOD` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IKE_AUTHENTICATION_PRESHARED_KEY` (
    public var `SecurityFlags`: ULong,
    public var `IdType`: UByte,
    public var `IdLengthInBytes`: UInt,
    public var `Id`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `KeyLengthInBytes`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 453:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IKE_AUTHENTICATION_PRESHARED_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKE_AUTHENTICATION_PRESHARED_KEY_METHOD`: `IKE_AUTHENTICATION_METHOD` = 1;
public const val `IOCTL_ATA_MINIPORT`: UInt = 315444u;
public const val `IOCTL_ATA_PASS_THROUGH`: UInt = 315436u;
public const val `IOCTL_ATA_PASS_THROUGH_DIRECT`: UInt = 315440u;
public const val `IOCTL_IDE_PASS_THROUGH`: UInt = 315432u;
public const val `IOCTL_MINIPORT_PROCESS_SERVICE_IRP`: UInt = 315448u;
// UNSUPPORTED Rust 464:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_DSM_GENERAL: windows_sys::core::PCSTR = windows_sys::core::s!("MPDSMGEN");

// UNSUPPORTED Rust 465:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_DSM_NOTIFICATION: windows_sys::core::PCSTR = windows_sys::core::s!("MPDSM   ");

// UNSUPPORTED Rust 466:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_ENDURANCE_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("ENDURINF");

// UNSUPPORTED Rust 467:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_FIRMWARE: windows_sys::core::PCSTR = windows_sys::core::s!("FIRMWARE");

// UNSUPPORTED Rust 468:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_HYBRDISK: windows_sys::core::PCSTR = windows_sys::core::s!("HYBRDISK");

// UNSUPPORTED Rust 469:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_QUERY_PHYSICAL_TOPOLOGY: windows_sys::core::PCSTR = windows_sys::core::s!("TOPOLOGY");

// UNSUPPORTED Rust 470:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_QUERY_PROTOCOL: windows_sys::core::PCSTR = windows_sys::core::s!("PROTOCOL");

// UNSUPPORTED Rust 471:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_QUERY_TEMPERATURE: windows_sys::core::PCSTR = windows_sys::core::s!("TEMPERAT");

// UNSUPPORTED Rust 472:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_SCSIDISK: windows_sys::core::PCSTR = windows_sys::core::s!("SCSIDISK");

// UNSUPPORTED Rust 473:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_SET_PROTOCOL: windows_sys::core::PCSTR = windows_sys::core::s!("SETPROTO");

// UNSUPPORTED Rust 474:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IOCTL_MINIPORT_SIGNATURE_SET_TEMPERATURE_THRESHOLD: windows_sys::core::PCSTR = windows_sys::core::s!("SETTEMPT");

public const val `IOCTL_MPIO_PASS_THROUGH_PATH`: UInt = 315452u;
public const val `IOCTL_MPIO_PASS_THROUGH_PATH_DIRECT`: UInt = 315456u;
public const val `IOCTL_MPIO_PASS_THROUGH_PATH_DIRECT_EX`: UInt = 315472u;
public const val `IOCTL_MPIO_PASS_THROUGH_PATH_EX`: UInt = 315468u;
public const val `IOCTL_SCSI_BASE`: UInt = 4u;
public const val `IOCTL_SCSI_FREE_DUMP_POINTERS`: UInt = 266276u;
public const val `IOCTL_SCSI_GET_ADDRESS`: UInt = 266264u;
public const val `IOCTL_SCSI_GET_CAPABILITIES`: UInt = 266256u;
public const val `IOCTL_SCSI_GET_DUMP_POINTERS`: UInt = 266272u;
public const val `IOCTL_SCSI_GET_INQUIRY_DATA`: UInt = 266252u;
public const val `IOCTL_SCSI_MINIPORT`: UInt = 315400u;
public const val `IOCTL_SCSI_PASS_THROUGH`: UInt = 315396u;
public const val `IOCTL_SCSI_PASS_THROUGH_DIRECT`: UInt = 315412u;
public const val `IOCTL_SCSI_PASS_THROUGH_DIRECT_EX`: UInt = 315464u;
public const val `IOCTL_SCSI_PASS_THROUGH_EX`: UInt = 315460u;
public const val `IOCTL_SCSI_RESCAN_BUS`: UInt = 266268u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_SCSI_CAPABILITIES` (
    public var `Length`: UInt,
    public var `MaximumTransferLength`: UInt,
    public var `MaximumPhysicalPages`: UInt,
    public var `SupportedAsynchronousEvents`: UInt,
    public var `AlignmentMask`: UInt,
    public var `TaggedQueuing`: Boolean,
    public var `AdapterScansDown`: Boolean,
    public var `AdapterUsesPio`: Boolean,
)
public typealias `ISCSI_AUTH_TYPES` = Int;
public const val `ISCSI_CHAP_AUTH_TYPE`: `ISCSI_AUTH_TYPES` = 1;
// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_CONNECTION_INFOA {
//     pub ConnectionId: ISCSI_UNIQUE_SESSION_ID,
//     pub InitiatorAddress: windows_sys::core::PSTR,
//     pub TargetAddress: windows_sys::core::PSTR,
//     pub InitiatorSocket: u16,
//     pub TargetSocket: u16,
//     pub CID: [u8; 2],
// }

// UNSUPPORTED Rust 515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_CONNECTION_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 520:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_CONNECTION_INFOW {
//     pub ConnectionId: ISCSI_UNIQUE_SESSION_ID,
//     pub InitiatorAddress: windows_sys::core::PWSTR,
//     pub TargetAddress: windows_sys::core::PWSTR,
//     pub InitiatorSocket: u16,
//     pub TargetSocket: u16,
//     pub CID: [u8; 2],
// }

// UNSUPPORTED Rust 530:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_CONNECTION_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ISCSI_CONNECTION_INFO_EX` (
    public var `ConnectionId`: `ISCSI_UNIQUE_SESSION_ID`,
    public var `State`: UByte,
    public var `Protocol`: UByte,
    public var `HeaderDigest`: UByte,
    public var `DataDigest`: UByte,
    public var `MaxRecvDataSegmentLength`: UInt,
    public var `AuthType`: `ISCSI_AUTH_TYPES`,
    public var `EstimatedThroughput`: ULong,
    public var `MaxDatagramSize`: UInt,
)
// UNSUPPORTED Rust 548:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_System_Ioctl")]
// #[derive(Clone, Copy)]
// pub struct ISCSI_DEVICE_ON_SESSIONA {
//     pub InitiatorName: [i8; 256],
//     pub TargetName: [i8; 224],
//     pub ScsiAddress: SCSI_ADDRESS,
//     pub DeviceInterfaceType: windows_sys::core::GUID,
//     pub DeviceInterfaceName: [i8; 260],
//     pub LegacyName: [i8; 260],
//     pub StorageDeviceNumber: super::super::System::Ioctl::STORAGE_DEVICE_NUMBER,
//     pub DeviceInstance: u32,
// }

// UNSUPPORTED Rust 561:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Ioctl")]
// impl Default for ISCSI_DEVICE_ON_SESSIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 567:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_System_Ioctl")]
// #[derive(Clone, Copy)]
// pub struct ISCSI_DEVICE_ON_SESSIONW {
//     pub InitiatorName: [u16; 256],
//     pub TargetName: [u16; 224],
//     pub ScsiAddress: SCSI_ADDRESS,
//     pub DeviceInterfaceType: windows_sys::core::GUID,
//     pub DeviceInterfaceName: [u16; 260],
//     pub LegacyName: [u16; 260],
//     pub StorageDeviceNumber: super::super::System::Ioctl::STORAGE_DEVICE_NUMBER,
//     pub DeviceInstance: u32,
// }

// UNSUPPORTED Rust 580:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Ioctl")]
// impl Default for ISCSI_DEVICE_ON_SESSIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ISCSI_DIGEST_TYPES` = Int;
public const val `ISCSI_DIGEST_TYPE_CRC32C`: `ISCSI_DIGEST_TYPES` = 1;
public const val `ISCSI_DIGEST_TYPE_NONE`: `ISCSI_DIGEST_TYPES` = 0;
public const val `ISCSI_LOGIN_FLAG_ALLOW_PORTAL_HOPPING`: UInt = 8u;
public const val `ISCSI_LOGIN_FLAG_MULTIPATH_ENABLED`: UInt = 2u;
public const val `ISCSI_LOGIN_FLAG_REQUIRE_IPSEC`: UInt = 1u;
public const val `ISCSI_LOGIN_FLAG_RESERVED1`: UInt = 4u;
public const val `ISCSI_LOGIN_FLAG_USE_RADIUS_RESPONSE`: UInt = 16u;
public const val `ISCSI_LOGIN_FLAG_USE_RADIUS_VERIFICATION`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ISCSI_LOGIN_OPTIONS` (
    public var `Version`: UInt,
    public var `InformationSpecified`: UInt,
    public var `LoginFlags`: UInt,
    public var `AuthType`: `ISCSI_AUTH_TYPES`,
    public var `HeaderDigest`: `ISCSI_DIGEST_TYPES`,
    public var `DataDigest`: `ISCSI_DIGEST_TYPES`,
    public var `MaximumConnections`: UInt,
    public var `DefaultTime2Wait`: UInt,
    public var `DefaultTime2Retain`: UInt,
    public var `UsernameLength`: UInt,
    public var `PasswordLength`: UInt,
    public var `Username`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Password`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_LOGIN_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 617:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_AUTH_TYPE: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000080");

// UNSUPPORTED Rust 618:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_DATA_DIGEST: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000002");

// UNSUPPORTED Rust 619:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_DEFAULT_TIME_2_RETAIN: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000010");

// UNSUPPORTED Rust 620:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_DEFAULT_TIME_2_WAIT: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000008");

// UNSUPPORTED Rust 621:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_HEADER_DIGEST: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000001");

// UNSUPPORTED Rust 622:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_MAXIMUM_CONNECTIONS: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000004");

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_PASSWORD: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000040");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_LOGIN_OPTIONS_USERNAME: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000020");

public const val `ISCSI_LOGIN_OPTIONS_VERSION`: UInt = 0u;
public const val `ISCSI_MUTUAL_CHAP_AUTH_TYPE`: `ISCSI_AUTH_TYPES` = 2;
public const val `ISCSI_NO_AUTH_TYPE`: `ISCSI_AUTH_TYPES` = 0;
// UNSUPPORTED Rust 628:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_AGGRESSIVE_MODE_ENABLED: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000008");

// UNSUPPORTED Rust 629:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_IKE_IPSEC_ENABLED: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000002");

// UNSUPPORTED Rust 630:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_MAIN_MODE_ENABLED: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000004");

// UNSUPPORTED Rust 631:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_PFS_ENABLED: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000010");

// UNSUPPORTED Rust 632:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_TRANSPORT_MODE_PREFERRED: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000020");

// UNSUPPORTED Rust 633:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_TUNNEL_MODE_PREFERRED: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000040");

// UNSUPPORTED Rust 634:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ISCSI_SECURITY_FLAG_VALID: windows_sys::core::PCSTR = windows_sys::core::s!("0x00000001");

// UNSUPPORTED Rust 635:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_SESSION_INFOA {
//     pub SessionId: ISCSI_UNIQUE_SESSION_ID,
//     pub InitiatorName: windows_sys::core::PSTR,
//     pub TargetNodeName: windows_sys::core::PSTR,
//     pub TargetName: windows_sys::core::PSTR,
//     pub ISID: [u8; 6],
//     pub TSID: [u8; 2],
//     pub ConnectionCount: u32,
//     pub Connections: *mut ISCSI_CONNECTION_INFOA,
// }

// UNSUPPORTED Rust 647:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_SESSION_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 652:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_SESSION_INFOW {
//     pub SessionId: ISCSI_UNIQUE_SESSION_ID,
//     pub InitiatorName: windows_sys::core::PWSTR,
//     pub TargetNodeName: windows_sys::core::PWSTR,
//     pub TargetName: windows_sys::core::PWSTR,
//     pub ISID: [u8; 6],
//     pub TSID: [u8; 2],
//     pub ConnectionCount: u32,
//     pub Connections: *mut ISCSI_CONNECTION_INFOW,
// }

// UNSUPPORTED Rust 664:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_SESSION_INFOW {
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
public class `ISCSI_SESSION_INFO_EX` (
    public var `SessionId`: `ISCSI_UNIQUE_SESSION_ID`,
    public var `InitialR2t`: Boolean,
    public var `ImmediateData`: Boolean,
    public var `Type`: UByte,
    public var `DataSequenceInOrder`: Boolean,
    public var `DataPduInOrder`: Boolean,
    public var `ErrorRecoveryLevel`: UByte,
    public var `MaxOutstandingR2t`: UInt,
    public var `FirstBurstLength`: UInt,
    public var `MaxBurstLength`: UInt,
    public var `MaximumConnections`: UInt,
    public var `ConnectionCount`: UInt,
    public var `Connections`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ISCSI_CONNECTION_INFO_EX`>?,
)
// UNSUPPORTED Rust 686:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_SESSION_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ISCSI_TARGET_FLAG_HIDE_STATIC_TARGET`: UInt = 2u;
public const val `ISCSI_TARGET_FLAG_MERGE_TARGET_INFORMATION`: UInt = 4u;
// UNSUPPORTED Rust 693:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_MAPPINGA {
//     pub InitiatorName: [i8; 256],
//     pub TargetName: [i8; 224],
//     pub OSDeviceName: [i8; 260],
//     pub SessionId: ISCSI_UNIQUE_SESSION_ID,
//     pub OSBusNumber: u32,
//     pub OSTargetNumber: u32,
//     pub LUNCount: u32,
//     pub LUNList: *mut SCSI_LUN_LIST,
// }

// UNSUPPORTED Rust 705:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_MAPPINGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 710:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_MAPPINGW {
//     pub InitiatorName: [u16; 256],
//     pub TargetName: [u16; 224],
//     pub OSDeviceName: [u16; 260],
//     pub SessionId: ISCSI_UNIQUE_SESSION_ID,
//     pub OSBusNumber: u32,
//     pub OSTargetNumber: u32,
//     pub LUNCount: u32,
//     pub LUNList: *mut SCSI_LUN_LIST,
// }

// UNSUPPORTED Rust 722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_MAPPINGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 727:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTALA {
//     pub SymbolicName: [i8; 256],
//     pub Address: [i8; 256],
//     pub Socket: u16,
// }

// UNSUPPORTED Rust 734:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTALA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 739:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTALW {
//     pub SymbolicName: [u16; 256],
//     pub Address: [u16; 256],
//     pub Socket: u16,
// }

// UNSUPPORTED Rust 746:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTALW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 751:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTAL_GROUPA {
//     pub Count: u32,
//     pub Portals: [ISCSI_TARGET_PORTALA; 1],
// }

// UNSUPPORTED Rust 757:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTAL_GROUPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 762:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTAL_GROUPW {
//     pub Count: u32,
//     pub Portals: [ISCSI_TARGET_PORTALW; 1],
// }

// UNSUPPORTED Rust 768:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTAL_GROUPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 773:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTAL_INFOA {
//     pub InitiatorName: [i8; 256],
//     pub InitiatorPortNumber: u32,
//     pub SymbolicName: [i8; 256],
//     pub Address: [i8; 256],
//     pub Socket: u16,
// }

// UNSUPPORTED Rust 782:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTAL_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 787:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTAL_INFOW {
//     pub InitiatorName: [u16; 256],
//     pub InitiatorPortNumber: u32,
//     pub SymbolicName: [u16; 256],
//     pub Address: [u16; 256],
//     pub Socket: u16,
// }

// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTAL_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 801:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTAL_INFO_EXA {
//     pub InitiatorName: [i8; 256],
//     pub InitiatorPortNumber: u32,
//     pub SymbolicName: [i8; 256],
//     pub Address: [i8; 256],
//     pub Socket: u16,
//     pub SecurityFlags: u64,
//     pub LoginOptions: ISCSI_LOGIN_OPTIONS,
// }

// UNSUPPORTED Rust 812:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTAL_INFO_EXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 817:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ISCSI_TARGET_PORTAL_INFO_EXW {
//     pub InitiatorName: [u16; 256],
//     pub InitiatorPortNumber: u32,
//     pub SymbolicName: [u16; 256],
//     pub Address: [u16; 256],
//     pub Socket: u16,
//     pub SecurityFlags: u64,
//     pub LoginOptions: ISCSI_LOGIN_OPTIONS,
// }

// UNSUPPORTED Rust 828:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ISCSI_TARGET_PORTAL_INFO_EXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ISCSI_TCP_PROTOCOL_TYPE`: `TARGETPROTOCOLTYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ISCSI_UNIQUE_SESSION_ID` (
    public var `AdapterUnique`: ULong,
    public var `AdapterSpecific`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ISCSI_VERSION_INFO` (
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
    public var `BuildNumber`: UInt,
)
public const val `InitiatorName`: `TARGET_INFORMATION_CLASS` = 5;
public const val `LoginOptions`: `TARGET_INFORMATION_CLASS` = 7;
public const val `MAX_ISCSI_ALIAS_LEN`: UInt = 255u;
public const val `MAX_ISCSI_DISCOVERY_DOMAIN_LEN`: UInt = 256u;
public const val `MAX_ISCSI_HBANAME_LEN`: UInt = 256u;
public const val `MAX_ISCSI_NAME_LEN`: UInt = 223u;
public const val `MAX_ISCSI_PORTAL_ADDRESS_LEN`: UInt = 256u;
public const val `MAX_ISCSI_PORTAL_ALIAS_LEN`: UInt = 256u;
public const val `MAX_ISCSI_PORTAL_NAME_LEN`: UInt = 256u;
public const val `MAX_ISCSI_TEXT_ADDRESS_LEN`: UInt = 256u;
public const val `MAX_RADIUS_ADDRESS_LEN`: UInt = 41u;
public const val `MINIPORT_DSM_NOTIFICATION_VERSION`: UInt = 1u;
public const val `MINIPORT_DSM_NOTIFICATION_VERSION_1`: UInt = 1u;
public const val `MINIPORT_DSM_NOTIFY_FLAG_BEGIN`: UInt = 1u;
public const val `MINIPORT_DSM_NOTIFY_FLAG_END`: UInt = 2u;
public const val `MINIPORT_DSM_PROFILE_CRASHDUMP_FILE`: UInt = 3u;
public const val `MINIPORT_DSM_PROFILE_HIBERNATION_FILE`: UInt = 2u;
public const val `MINIPORT_DSM_PROFILE_PAGE_FILE`: UInt = 1u;
public const val `MINIPORT_DSM_PROFILE_UNKNOWN`: UInt = 0u;
public const val `MPIO_IOCTL_FLAG_INVOLVE_DSM`: UInt = 4u;
public const val `MPIO_IOCTL_FLAG_USE_PATHID`: UInt = 1u;
public const val `MPIO_IOCTL_FLAG_USE_SCSIADDRESS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH` (
    public var `PassThrough`: `SCSI_PASS_THROUGH`,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH32` (
    public var `PassThrough`: `SCSI_PASS_THROUGH32`,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH32_EX` (
    public var `PassThroughOffset`: UInt,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH_DIRECT` (
    public var `PassThrough`: `SCSI_PASS_THROUGH_DIRECT`,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH_DIRECT32` (
    public var `PassThrough`: `SCSI_PASS_THROUGH_DIRECT32`,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH_DIRECT32_EX` (
    public var `PassThroughOffset`: UInt,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH_DIRECT_EX` (
    public var `PassThroughOffset`: UInt,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MPIO_PASS_THROUGH_PATH_EX` (
    public var `PassThroughOffset`: UInt,
    public var `Version`: UInt,
    public var `Length`: UShort,
    public var `Flags`: UByte,
    public var `PortNumber`: UByte,
    public var `MpioPathId`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MP_DEVICE_DATA_SET_RANGE` (
    public var `StartingOffset`: Long,
    public var `LengthInBytes`: ULong,
)
public typealias `MP_STORAGE_DIAGNOSTIC_LEVEL` = Int;
public typealias `MP_STORAGE_DIAGNOSTIC_TARGET_TYPE` = Int;
public const val `MpStorageDiagnosticLevelDefault`: `MP_STORAGE_DIAGNOSTIC_LEVEL` = 0;
public const val `MpStorageDiagnosticLevelMax`: `MP_STORAGE_DIAGNOSTIC_LEVEL` = 1;
public const val `MpStorageDiagnosticTargetTypeHbaFirmware`: `MP_STORAGE_DIAGNOSTIC_TARGET_TYPE` = 3;
public const val `MpStorageDiagnosticTargetTypeMax`: `MP_STORAGE_DIAGNOSTIC_TARGET_TYPE` = 4;
public const val `MpStorageDiagnosticTargetTypeMiniport`: `MP_STORAGE_DIAGNOSTIC_TARGET_TYPE` = 2;
public const val `MpStorageDiagnosticTargetTypeUndefined`: `MP_STORAGE_DIAGNOSTIC_TARGET_TYPE` = 0;
public const val `NRB_FUNCTION_ADD_LBAS_PINNED_SET`: UInt = 16u;
public const val `NRB_FUNCTION_FLUSH_NVCACHE`: UInt = 20u;
public const val `NRB_FUNCTION_NVCACHE_INFO`: UInt = 236u;
public const val `NRB_FUNCTION_NVCACHE_POWER_MODE_RETURN`: UInt = 1u;
public const val `NRB_FUNCTION_NVCACHE_POWER_MODE_SET`: UInt = 0u;
public const val `NRB_FUNCTION_NVSEPARATED_FLUSH`: UInt = 193u;
public const val `NRB_FUNCTION_NVSEPARATED_INFO`: UInt = 192u;
public const val `NRB_FUNCTION_NVSEPARATED_WB_DISABLE`: UInt = 194u;
public const val `NRB_FUNCTION_NVSEPARATED_WB_REVERT_DEFAULT`: UInt = 195u;
public const val `NRB_FUNCTION_PASS_HINT_PAYLOAD`: UInt = 224u;
public const val `NRB_FUNCTION_QUERY_ASCENDER_STATUS`: UInt = 208u;
public const val `NRB_FUNCTION_QUERY_CACHE_MISS`: UInt = 19u;
public const val `NRB_FUNCTION_QUERY_HYBRID_DISK_STATUS`: UInt = 209u;
public const val `NRB_FUNCTION_QUERY_PINNED_SET`: UInt = 18u;
public const val `NRB_FUNCTION_REMOVE_LBAS_PINNED_SET`: UInt = 17u;
public const val `NRB_FUNCTION_SPINDLE_STATUS`: UInt = 229u;
public const val `NRB_ILLEGAL_REQUEST`: UInt = 1u;
public const val `NRB_INPUT_DATA_OVERRUN`: UInt = 3u;
public const val `NRB_INPUT_DATA_UNDERRUN`: UInt = 4u;
public const val `NRB_INVALID_PARAMETER`: UInt = 2u;
public const val `NRB_OUTPUT_DATA_OVERRUN`: UInt = 5u;
public const val `NRB_OUTPUT_DATA_UNDERRUN`: UInt = 6u;
public const val `NRB_SUCCESS`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NTSCSI_UNICODE_STRING` (
    public var `Length`: UShort,
    public var `MaximumLength`: UShort,
    public var `Buffer`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 997:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTSCSI_UNICODE_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1002:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NVCACHE_HINT_PAYLOAD {
//     pub Command: u8,
//     pub Feature7_0: u8,
//     pub Feature15_8: u8,
//     pub Count15_8: u8,
//     pub LBA7_0: u8,
//     pub LBA15_8: u8,
//     pub LBA23_16: u8,
//     pub LBA31_24: u8,
//     pub LBA39_32: u8,
//     pub LBA47_40: u8,
//     pub Auxiliary7_0: u8,
//     pub Auxiliary23_16: u8,
//     pub Reserved: [u8; 4],
// }

// UNSUPPORTED Rust 1019:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVCACHE_HINT_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1024:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NVCACHE_PRIORITY_LEVEL_DESCRIPTOR {
//     pub PriorityLevel: u8,
//     pub Reserved0: [u8; 3],
//     pub ConsumedNVMSizeFraction: u32,
//     pub ConsumedMappingResourcesFraction: u32,
//     pub ConsumedNVMSizeForDirtyDataFraction: u32,
//     pub ConsumedMappingResourcesForDirtyDataFraction: u32,
//     pub Reserved1: u32,
// }

// UNSUPPORTED Rust 1035:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVCACHE_PRIORITY_LEVEL_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVCACHE_REQUEST_BLOCK` (
    public var `NRBSize`: UInt,
    public var `Function`: UShort,
    public var `NRBFlags`: UInt,
    public var `NRBStatus`: UInt,
    public var `Count`: UInt,
    public var `LBA`: ULong,
    public var `DataBufSize`: UInt,
    public var `NVCacheStatus`: UInt,
    public var `NVCacheSubStatus`: UInt,
)
public typealias `NVCACHE_STATUS` = Int;
public typealias `NVCACHE_TYPE` = Int;
public const val `NVSEPWriteCacheTypeNone`: `NV_SEP_WRITE_CACHE_TYPE` = 1;
public const val `NVSEPWriteCacheTypeUnknown`: `NV_SEP_WRITE_CACHE_TYPE` = 0;
public const val `NVSEPWriteCacheTypeWriteBack`: `NV_SEP_WRITE_CACHE_TYPE` = 2;
public const val `NVSEPWriteCacheTypeWriteThrough`: `NV_SEP_WRITE_CACHE_TYPE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NV_FEATURE_PARAMETER` (
    public var `NVPowerModeEnabled`: UShort,
    public var `NVParameterReserv1`: UShort,
    public var `NVCmdEnabled`: UShort,
    public var `NVParameterReserv2`: UShort,
    public var `NVPowerModeVer`: UShort,
    public var `NVCmdVer`: UShort,
    public var `NVSize`: UInt,
    public var `NVReadSpeed`: UShort,
    public var `NVWrtSpeed`: UShort,
    public var `DeviceSpinUpTime`: UInt,
)
// UNSUPPORTED Rust 1073:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NV_SEP_CACHE_PARAMETER {
//     pub Version: u32,
//     pub Size: u32,
//     pub Flags: NV_SEP_CACHE_PARAMETER_0,
//     pub WriteCacheType: u8,
//     pub WriteCacheTypeEffective: u8,
//     pub ParameterReserve1: [u8; 3],
// }

// UNSUPPORTED Rust 1083:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NV_SEP_CACHE_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1088:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NV_SEP_CACHE_PARAMETER_0 {
//     pub CacheFlags: NV_SEP_CACHE_PARAMETER_0_0,
//     pub CacheFlagsSet: u8,
// }

// UNSUPPORTED Rust 1094:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NV_SEP_CACHE_PARAMETER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NV_SEP_CACHE_PARAMETER_0_0` (
    public var `_bitfield`: UByte,
)
public const val `NV_SEP_CACHE_PARAMETER_VERSION`: UInt = 1u;
public const val `NV_SEP_CACHE_PARAMETER_VERSION_1`: UInt = 1u;
public typealias `NV_SEP_WRITE_CACHE_TYPE` = Int;
public const val `NvCacheStatusDisabled`: `NVCACHE_STATUS` = 2;
public const val `NvCacheStatusDisabling`: `NVCACHE_STATUS` = 1;
public const val `NvCacheStatusEnabled`: `NVCACHE_STATUS` = 3;
public const val `NvCacheStatusUnknown`: `NVCACHE_STATUS` = 0;
public const val `NvCacheTypeNone`: `NVCACHE_TYPE` = 1;
public const val `NvCacheTypeUnknown`: `NVCACHE_TYPE` = 0;
public const val `NvCacheTypeWriteBack`: `NVCACHE_TYPE` = 2;
public const val `NvCacheTypeWriteThrough`: `NVCACHE_TYPE` = 3;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDUMP_DEVICE_POWERON_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// UNSUPPORTED Rust 1116:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERSISTENT_ISCSI_LOGIN_INFOA {
//     pub TargetName: [i8; 224],
//     pub IsInformationalSession: bool,
//     pub InitiatorInstance: [i8; 256],
//     pub InitiatorPortNumber: u32,
//     pub TargetPortal: ISCSI_TARGET_PORTALA,
//     pub SecurityFlags: u64,
//     pub Mappings: *mut ISCSI_TARGET_MAPPINGA,
//     pub LoginOptions: ISCSI_LOGIN_OPTIONS,
// }

// UNSUPPORTED Rust 1128:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERSISTENT_ISCSI_LOGIN_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1133:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERSISTENT_ISCSI_LOGIN_INFOW {
//     pub TargetName: [u16; 224],
//     pub IsInformationalSession: bool,
//     pub InitiatorInstance: [u16; 256],
//     pub InitiatorPortNumber: u32,
//     pub TargetPortal: ISCSI_TARGET_PORTALW,
//     pub SecurityFlags: u64,
//     pub Mappings: *mut ISCSI_TARGET_MAPPINGW,
//     pub LoginOptions: ISCSI_LOGIN_OPTIONS,
// }

// UNSUPPORTED Rust 1145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERSISTENT_ISCSI_LOGIN_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PersistentTargetMappings`: `TARGET_INFORMATION_CLASS` = 4;
public const val `PortalGroups`: `TARGET_INFORMATION_CLASS` = 3;
public const val `ProtocolType`: `TARGET_INFORMATION_CLASS` = 0;
// UNSUPPORTED Rust 1153:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCSI_ADAPTER_BUS_INFO {
//     pub NumberOfBuses: u8,
//     pub BusData: [SCSI_BUS_DATA; 1],
// }

// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCSI_ADAPTER_BUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCSI_ADDRESS` (
    public var `Length`: UInt,
    public var `PortNumber`: UByte,
    public var `PathId`: UByte,
    public var `TargetId`: UByte,
    public var `Lun`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCSI_BUS_DATA` (
    public var `NumberOfLogicalUnits`: UByte,
    public var `InitiatorBusId`: UByte,
    public var `InquiryDataOffset`: UInt,
)
// UNSUPPORTED Rust 1180:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCSI_INQUIRY_DATA {
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub DeviceClaimed: bool,
//     pub InquiryDataLength: u32,
//     pub NextInquiryDataOffset: u32,
//     pub InquiryData: [u8; 1],
// }

// UNSUPPORTED Rust 1191:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCSI_INQUIRY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCSI_IOCTL_DATA_BIDIRECTIONAL`: UInt = 3u;
public const val `SCSI_IOCTL_DATA_IN`: UInt = 1u;
public const val `SCSI_IOCTL_DATA_OUT`: UInt = 0u;
public const val `SCSI_IOCTL_DATA_UNSPECIFIED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCSI_LUN_LIST` (
    public var `OSLUN`: UInt,
    public var `TargetLUN`: ULong,
)
// UNSUPPORTED Rust 1206:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH {
//     pub Length: u16,
//     pub ScsiStatus: u8,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub CdbLength: u8,
//     pub SenseInfoLength: u8,
//     pub DataIn: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub DataBufferOffset: usize,
//     pub SenseInfoOffset: u32,
//     pub Cdb: [u8; 16],
// }

// UNSUPPORTED Rust 1223:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCSI_PASS_THROUGH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1228:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH32 {
//     pub Length: u16,
//     pub ScsiStatus: u8,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub CdbLength: u8,
//     pub SenseInfoLength: u8,
//     pub DataIn: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub DataBufferOffset: u32,
//     pub SenseInfoOffset: u32,
//     pub Cdb: [u8; 16],
// }

// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SCSI_PASS_THROUGH32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1252:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH32_EX {
//     pub Version: u32,
//     pub Length: u32,
//     pub CdbLength: u32,
//     pub StorAddressLength: u32,
//     pub ScsiStatus: u8,
//     pub SenseInfoLength: u8,
//     pub DataDirection: u8,
//     pub Reserved: u8,
//     pub TimeOutValue: u32,
//     pub StorAddressOffset: u32,
//     pub SenseInfoOffset: u32,
//     pub DataOutTransferLength: u32,
//     pub DataInTransferLength: u32,
//     pub DataOutBufferOffset: u32,
//     pub DataInBufferOffset: u32,
//     pub Cdb: [u8; 1],
// }

// UNSUPPORTED Rust 1273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SCSI_PASS_THROUGH32_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1279:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH_DIRECT {
//     pub Length: u16,
//     pub ScsiStatus: u8,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub CdbLength: u8,
//     pub SenseInfoLength: u8,
//     pub DataIn: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub DataBuffer: *mut core::ffi::c_void,
//     pub SenseInfoOffset: u32,
//     pub Cdb: [u8; 16],
// }

// UNSUPPORTED Rust 1296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCSI_PASS_THROUGH_DIRECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1301:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH_DIRECT32 {
//     pub Length: u16,
//     pub ScsiStatus: u8,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
//     pub CdbLength: u8,
//     pub SenseInfoLength: u8,
//     pub DataIn: u8,
//     pub DataTransferLength: u32,
//     pub TimeOutValue: u32,
//     pub DataBuffer: *mut core::ffi::c_void,
//     pub SenseInfoOffset: u32,
//     pub Cdb: [u8; 16],
// }

// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SCSI_PASS_THROUGH_DIRECT32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1325:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH_DIRECT32_EX {
//     pub Version: u32,
//     pub Length: u32,
//     pub CdbLength: u32,
//     pub StorAddressLength: u32,
//     pub ScsiStatus: u8,
//     pub SenseInfoLength: u8,
//     pub DataDirection: u8,
//     pub Reserved: u8,
//     pub TimeOutValue: u32,
//     pub StorAddressOffset: u32,
//     pub SenseInfoOffset: u32,
//     pub DataOutTransferLength: u32,
//     pub DataInTransferLength: u32,
//     pub DataOutBuffer: *mut core::ffi::c_void,
//     pub DataInBuffer: *mut core::ffi::c_void,
//     pub Cdb: [u8; 1],
// }

// UNSUPPORTED Rust 1346:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SCSI_PASS_THROUGH_DIRECT32_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1352:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH_DIRECT_EX {
//     pub Version: u32,
//     pub Length: u32,
//     pub CdbLength: u32,
//     pub StorAddressLength: u32,
//     pub ScsiStatus: u8,
//     pub SenseInfoLength: u8,
//     pub DataDirection: u8,
//     pub Reserved: u8,
//     pub TimeOutValue: u32,
//     pub StorAddressOffset: u32,
//     pub SenseInfoOffset: u32,
//     pub DataOutTransferLength: u32,
//     pub DataInTransferLength: u32,
//     pub DataOutBuffer: *mut core::ffi::c_void,
//     pub DataInBuffer: *mut core::ffi::c_void,
//     pub Cdb: [u8; 1],
// }

// UNSUPPORTED Rust 1372:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCSI_PASS_THROUGH_DIRECT_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1377:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCSI_PASS_THROUGH_EX {
//     pub Version: u32,
//     pub Length: u32,
//     pub CdbLength: u32,
//     pub StorAddressLength: u32,
//     pub ScsiStatus: u8,
//     pub SenseInfoLength: u8,
//     pub DataDirection: u8,
//     pub Reserved: u8,
//     pub TimeOutValue: u32,
//     pub StorAddressOffset: u32,
//     pub SenseInfoOffset: u32,
//     pub DataOutTransferLength: u32,
//     pub DataInTransferLength: u32,
//     pub DataOutBufferOffset: usize,
//     pub DataInBufferOffset: usize,
//     pub Cdb: [u8; 1],
// }

// UNSUPPORTED Rust 1397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCSI_PASS_THROUGH_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1402:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SRB_IO_CONTROL {
//     pub HeaderLength: u32,
//     pub Signature: [u8; 8],
//     pub Timeout: u32,
//     pub ControlCode: u32,
//     pub ReturnCode: u32,
//     pub Length: u32,
// }

// UNSUPPORTED Rust 1412:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SRB_IO_CONTROL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1417:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_DIAGNOSTIC_MP_REQUEST {
//     pub Version: u32,
//     pub Size: u32,
//     pub TargetType: MP_STORAGE_DIAGNOSTIC_TARGET_TYPE,
//     pub Level: MP_STORAGE_DIAGNOSTIC_LEVEL,
//     pub ProviderId: windows_sys::core::GUID,
//     pub BufferSize: u32,
//     pub Reserved: u32,
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1429:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DIAGNOSTIC_MP_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_DIAGNOSTIC_STATUS_BUFFER_TOO_SMALL`: UInt = 1u;
public const val `STORAGE_DIAGNOSTIC_STATUS_INVALID_PARAMETER`: UInt = 3u;
public const val `STORAGE_DIAGNOSTIC_STATUS_INVALID_SIGNATURE`: UInt = 4u;
public const val `STORAGE_DIAGNOSTIC_STATUS_INVALID_TARGET_TYPE`: UInt = 5u;
public const val `STORAGE_DIAGNOSTIC_STATUS_MORE_DATA`: UInt = 6u;
public const val `STORAGE_DIAGNOSTIC_STATUS_SUCCESS`: UInt = 0u;
public const val `STORAGE_DIAGNOSTIC_STATUS_UNSUPPORTED_VERSION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ENDURANCE_DATA_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `EnduranceInfo`: `STORAGE_ENDURANCE_INFO`,
)
// UNSUPPORTED Rust 1448:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_ENDURANCE_INFO {
//     pub ValidFields: u32,
//     pub GroupId: u32,
//     pub Flags: STORAGE_ENDURANCE_INFO_0,
//     pub LifePercentage: u32,
//     pub BytesReadCount: [u8; 16],
//     pub ByteWriteCount: [u8; 16],
// }

// UNSUPPORTED Rust 1458:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ENDURANCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ENDURANCE_INFO_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1468:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_ACTIVATE {
//     pub Version: u32,
//     pub Size: u32,
//     pub SlotToActivate: u8,
//     pub Reserved0: [u8; 3],
// }

// UNSUPPORTED Rust 1476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_ACTIVATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_FIRMWARE_ACTIVATE_STRUCTURE_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1482:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_DOWNLOAD {
//     pub Version: u32,
//     pub Size: u32,
//     pub Offset: u64,
//     pub BufferSize: u64,
//     pub ImageBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_DOWNLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_FIRMWARE_DOWNLOAD_STRUCTURE_VERSION`: UInt = 1u;
public const val `STORAGE_FIRMWARE_DOWNLOAD_STRUCTURE_VERSION_V2`: UInt = 2u;
// UNSUPPORTED Rust 1498:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_DOWNLOAD_V2 {
//     pub Version: u32,
//     pub Size: u32,
//     pub Offset: u64,
//     pub BufferSize: u64,
//     pub Slot: u8,
//     pub Reserved: [u8; 3],
//     pub ImageSize: u32,
//     pub ImageBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_DOWNLOAD_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1515:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_INFO {
//     pub Version: u32,
//     pub Size: u32,
//     pub UpgradeSupport: bool,
//     pub SlotCount: u8,
//     pub ActiveSlot: u8,
//     pub PendingActivateSlot: u8,
//     pub Reserved: u32,
//     pub Slot: [STORAGE_FIRMWARE_SLOT_INFO; 1],
// }

// UNSUPPORTED Rust 1527:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_FIRMWARE_INFO_INVALID_SLOT`: UInt = 255u;
public const val `STORAGE_FIRMWARE_INFO_STRUCTURE_VERSION`: UInt = 1u;
public const val `STORAGE_FIRMWARE_INFO_STRUCTURE_VERSION_V2`: UInt = 2u;
// UNSUPPORTED Rust 1535:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_INFO_V2 {
//     pub Version: u32,
//     pub Size: u32,
//     pub UpgradeSupport: bool,
//     pub SlotCount: u8,
//     pub ActiveSlot: u8,
//     pub PendingActivateSlot: u8,
//     pub FirmwareShared: bool,
//     pub Reserved: [u8; 3],
//     pub ImagePayloadAlignment: u32,
//     pub ImagePayloadMaxSize: u32,
//     pub Slot: [STORAGE_FIRMWARE_SLOT_INFO_V2; 1],
// }

// UNSUPPORTED Rust 1550:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1555:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_SLOT_INFO {
//     pub SlotNumber: u8,
//     pub ReadOnly: bool,
//     pub Reserved: [u8; 6],
//     pub Revision: STORAGE_FIRMWARE_SLOT_INFO_0,
// }

// UNSUPPORTED Rust 1563:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_SLOT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1568:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_FIRMWARE_SLOT_INFO_0 {
//     pub Info: [u8; 8],
//     pub AsUlonglong: u64,
// }

// UNSUPPORTED Rust 1574:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_SLOT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1579:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STORAGE_FIRMWARE_SLOT_INFO_V2 {
//     pub SlotNumber: u8,
//     pub ReadOnly: bool,
//     pub Reserved: [u8; 6],
//     pub Revision: [u8; 16],
// }

// UNSUPPORTED Rust 1587:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FIRMWARE_SLOT_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_FIRMWARE_SLOT_INFO_V2_REVISION_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 1593:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ScsiRawInterfaceGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f56309_b6bf_11d0_94f2_00a0c91efb8b);

public typealias `TARGETPROTOCOLTYPE` = Int;
public typealias `TARGET_INFORMATION_CLASS` = Int;
public const val `TargetAlias`: `TARGET_INFORMATION_CLASS` = 1;
public const val `TargetFlags`: `TARGET_INFORMATION_CLASS` = 6;
// UNSUPPORTED Rust 1598:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WmiScsiAddressGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f5630f_b6bf_11d0_94f2_00a0c91efb8b);

public typealias `_ADAPTER_OBJECT` = Long;
