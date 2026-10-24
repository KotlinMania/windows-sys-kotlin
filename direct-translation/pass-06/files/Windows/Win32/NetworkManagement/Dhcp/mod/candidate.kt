// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddFilterV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddFilterV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `addfilterinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_FILTER_ADD_INFO`>?, `forceflag` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddSecurityGroup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddSecurityGroup`(`pserver` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddServer`(`flags` : UInt, `idinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `newserver` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPDS_SERVER`>?, `callbackfn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddSubnetElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddSubnetElement`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `addelementinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddSubnetElementV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddSubnetElementV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `addelementinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V4`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddSubnetElementV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddSubnetElementV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `addelementinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V5`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAddSubnetElementV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAddSubnetElementV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `addelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAuditLogGetParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAuditLogGetParams`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `auditlogdir` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `diskcheckinterval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `maxlogfilessize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `minspaceondisk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpAuditLogSetParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpAuditLogSetParams`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `auditlogdir` : `windows_sys`.`core`.`PCWSTR`, `diskcheckinterval` : UInt, `maxlogfilessize` : UInt, `minspaceondisk` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpCApiCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCApiCleanup`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpCApiInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCApiInitialize`(`version` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateClass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateClass`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `classinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateClassV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateClassV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `classinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateClientInfoV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateClientInfoV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_V4`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateClientInfoVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateClientInfoVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_VQ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateOption`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt, `optioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateOptionV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateOptionV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateOptionV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateOptionV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateSubnet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateSubnet`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `subnetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateSubnetV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateSubnetV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `subnetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpCreateSubnetVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpCreateSubnetVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `subnetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_INFO_VQ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpDeRegisterParamChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeRegisterParamChange`(`flags` : UInt, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `event` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteClass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteClass`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteClassV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteClassV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteClientInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteClientInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteFilterV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteFilterV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `deletefilterinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_ADDR_PATTERN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteServer`(`flags` : UInt, `idinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `newserver` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPDS_SERVER`>?, `callbackfn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteSubnet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteSubnet`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `forceflag` : `DHCP_FORCE_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteSubnetV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteSubnetV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `forceflag` : `DHCP_FORCE_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDeleteSuperScopeV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDeleteSuperScopeV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `superscopename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDsCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDsCleanup`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpDsInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpDsInit`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumClasses; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumClasses`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `classinfoarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLASS_INFO_ARRAY`>>?, `nread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ntotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumClassesV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumClassesV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `classinfoarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLASS_INFO_ARRAY_V6`>>?, `nread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ntotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumFilterV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumFilterV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_ADDR_PATTERN`>?, `preferredmaximum` : UInt, `listtype` : `DHCP_FILTER_LIST_TYPE`, `enumfilterinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_FILTER_ENUM_INFO`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumOptionValues; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumOptionValues`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `optionvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE_ARRAY`>>?, `optionsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `optionstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumOptionValuesV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumOptionValuesV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `optionvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE_ARRAY`>>?, `optionsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `optionstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumOptionValuesV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumOptionValuesV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `optionvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE_ARRAY`>>?, `optionsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `optionstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumOptions`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `options` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_ARRAY`>>?, `optionsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `optionstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumOptionsV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumOptionsV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `options` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_ARRAY`>>?, `optionsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `optionstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumOptionsV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumOptionsV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `options` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_ARRAY`>>?, `optionsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `optionstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumServers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumServers`(`flags` : UInt, `idinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `servers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPDS_SERVERS`>>?, `callbackfn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetClients; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetClients`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_ARRAY`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetClientsFilterStatusInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetClientsFilterStatusInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetClientsV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetClientsV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_ARRAY_V4`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetClientsV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetClientsV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_ARRAY_V5`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetClientsV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetClientsV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_IPV6_ADDRESS`>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_ARRAY_V6`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetClientsVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetClientsVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_ARRAY_VQ`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetElements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetElements`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `enumelementtype` : `DHCP_SUBNET_ELEMENT_TYPE`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enumelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_ELEMENT_INFO_ARRAY`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetElementsV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetElementsV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `enumelementtype` : `DHCP_SUBNET_ELEMENT_TYPE`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enumelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetElementsV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetElementsV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `enumelementtype` : `DHCP_SUBNET_ELEMENT_TYPE`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enumelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetElementsV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetElementsV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `enumelementtype` : `DHCP_SUBNET_ELEMENT_TYPE_V6`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enumelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnets; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnets`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enuminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_IP_ARRAY`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpEnumSubnetsV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpEnumSubnetsV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enuminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV6_IP_ARRAY`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetAllOptionValues; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetAllOptionValues`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `values` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ALL_OPTION_VALUES`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetAllOptionValuesV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetAllOptionValuesV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?, `values` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ALL_OPTION_VALUES`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetAllOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetAllOptions`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ALL_OPTIONS`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetAllOptionsV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetAllOptionsV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ALL_OPTIONS`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetClassInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetClassInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `partialclassinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO`>?, `filledclassinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLASS_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetClientInfoV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetClientInfoV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_V4`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetClientInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetClientInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO_V6`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_V6`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetClientInfoVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetClientInfoVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_VQ`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetClientOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetClientOptions`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientipaddress` : UInt, `clientsubnetmask` : UInt, `clientoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetFilterV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetFilterV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `globalfilterinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_FILTER_GLOBAL_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetMibInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetMibInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `mibinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_MIB_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetMibInfoV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetMibInfoV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `mibinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_MIB_INFO_V5`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetMibInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetMibInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `mibinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_MIB_INFO_V6`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetOptionInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOptionInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetOptionInfoV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOptionInfoV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetOptionInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOptionInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOptionValue`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt, `scopeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetOptionValueV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOptionValueV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetOptionValueV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOptionValueV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpGetOriginalSubnetMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetOriginalSubnetMask`(`sadaptername` : `windows_sys`.`core`.`PCWSTR`, `dwsubnetmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetServerBindingInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetServerBindingInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `bindelementsinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_BIND_ELEMENT_ARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetServerBindingInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetServerBindingInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `bindelementsinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV6_BIND_ELEMENT_ARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetServerSpecificStrings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetServerSpecificStrings`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `serverspecificstrings` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SERVER_SPECIFIC_STRINGS`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetSubnetDelayOffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetSubnetDelayOffer`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `timedelayinmilliseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetSubnetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetSubnetInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `subnetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetSubnetInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetSubnetInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `subnetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_INFO_V6`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetSubnetInfoVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetSubnetInfoVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `subnetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUBNET_INFO_VQ`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetSuperScopeInfoV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetSuperScopeInfoV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `superscopetable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SUPER_SCOPE_TABLE`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetThreadOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetThreadOptions`(`pflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpGetVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpGetVersion`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `majorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `minorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprAddV4PolicyCondition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprAddV4PolicyCondition`(`policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?, `parentexpr` : UInt, `type` : `DHCP_POL_ATTR_TYPE`, `optionid` : UInt, `suboptionid` : UInt, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `operator` : `DHCP_POL_COMPARATOR`, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `valuelength` : UInt, `conditionindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprAddV4PolicyExpr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprAddV4PolicyExpr`(`policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?, `parentexpr` : UInt, `operator` : `DHCP_POL_LOGIC_OPER`, `exprindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprAddV4PolicyRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprAddV4PolicyRange`(`policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?, `range` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_IP_RANGE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprCreateV4Policy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprCreateV4Policy`(`policyname` : `windows_sys`.`core`.`PCWSTR`, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnet` : UInt, `processingorder` : UInt, `rootoperator` : `DHCP_POL_LOGIC_OPER`, `description` : `windows_sys`.`core`.`PCWSTR`, `enabled` : `windows_sys`.`core`.`BOOL`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_POLICY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprCreateV4PolicyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprCreateV4PolicyEx`(`policyname` : `windows_sys`.`core`.`PCWSTR`, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnet` : UInt, `processingorder` : UInt, `rootoperator` : `DHCP_POL_LOGIC_OPER`, `description` : `windows_sys`.`core`.`PCWSTR`, `enabled` : `windows_sys`.`core`.`BOOL`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_POLICY_EX`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFindV4DhcpProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFindV4DhcpProperty`(`propertyarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY_ARRAY`>?, `id` : `DHCP_PROPERTY_ID`, `type` : `DHCP_PROPERTY_TYPE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFreeV4DhcpProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFreeV4DhcpProperty`(`property` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFreeV4DhcpPropertyArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFreeV4DhcpPropertyArray`(`propertyarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY_ARRAY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFreeV4Policy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFreeV4Policy`(`policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFreeV4PolicyArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFreeV4PolicyArray`(`policyarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY_ARRAY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFreeV4PolicyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFreeV4PolicyEx`(`policyex` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY_EX`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprFreeV4PolicyExArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprFreeV4PolicyExArray`(`policyexarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY_EX_ARRAY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprIsV4PolicySingleUC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprIsV4PolicySingleUC`(`policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprIsV4PolicyValid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprIsV4PolicyValid`(`ppolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprIsV4PolicyWellFormed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprIsV4PolicyWellFormed`(`ppolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprModifyV4PolicyExpr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprModifyV4PolicyExpr`(`policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?, `operator` : `DHCP_POL_LOGIC_OPER`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpHlprResetV4PolicyExpr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpHlprResetV4PolicyExpr`(`policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpModifyClass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpModifyClass`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `classinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpModifyClassV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpModifyClassV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `reservedmustbezero` : UInt, `classinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpRegisterParamChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRegisterParamChange`(`flags` : UInt, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `adaptername` : `windows_sys`.`core`.`PCWSTR`, `classid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPCAPI_CLASSID`>?, `params` : `DHCPCAPI_PARAMS_ARRAY`, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpRemoveDNSRegistrations; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveDNSRegistrations`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveOption`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveOptionV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveOptionV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveOptionV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveOptionV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveOptionValue`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt, `scopeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveOptionValueV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveOptionValueV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveOptionValueV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveOptionValueV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveSubnetElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveSubnetElement`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `removeelementinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA`>?, `forceflag` : `DHCP_FORCE_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveSubnetElementV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveSubnetElementV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `removeelementinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V4`>?, `forceflag` : `DHCP_FORCE_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveSubnetElementV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveSubnetElementV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `removeelementinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V5`>?, `forceflag` : `DHCP_FORCE_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRemoveSubnetElementV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRemoveSubnetElementV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `removeelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V6`>?, `forceflag` : `DHCP_FORCE_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpRequestParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRequestParams`(`flags` : UInt, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `adaptername` : `windows_sys`.`core`.`PCWSTR`, `classid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPCAPI_CLASSID`>?, `sendparams` : `DHCPCAPI_PARAMS_ARRAY`, `recdparams` : `DHCPCAPI_PARAMS_ARRAY`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `psize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `requestidstr` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpRpcFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpRpcFreeMemory`(`bufferpointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpScanDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpScanDatabase`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `fixflag` : UInt, `scanlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SCAN_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerAuditlogParamsFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerAuditlogParamsFree`(`configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SERVER_CONFIG_INFO_VQ`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerBackupDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerBackupDatabase`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `path` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerGetConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerGetConfig`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SERVER_CONFIG_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerGetConfigV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerGetConfigV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SERVER_CONFIG_INFO_V4`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerGetConfigV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerGetConfigV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SERVER_CONFIG_INFO_V6`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerGetConfigVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerGetConfigVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_SERVER_CONFIG_INFO_VQ`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerQueryAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerQueryAttribute`(`serveripaddr` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt, `dhcpattribid` : UInt, `pdhcpattrib` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ATTRIB`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerQueryAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerQueryAttributes`(`serveripaddr` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt, `dwattribcount` : UInt, `pdhcpattribs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdhcpattribarr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ATTRIB_ARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerQueryDnsRegCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerQueryDnsRegCredentials`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `unamesize` : UInt, `uname` : `windows_sys`.`core`.`PWSTR`, `domainsize` : UInt, `domain` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerRedoAuthorization; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerRedoAuthorization`(`serveripaddr` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerRestoreDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerRestoreDatabase`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `path` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerSetConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerSetConfig`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fieldstoset` : UInt, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SERVER_CONFIG_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerSetConfigV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerSetConfigV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fieldstoset` : UInt, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SERVER_CONFIG_INFO_V4`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerSetConfigV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerSetConfigV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?, `fieldstoset` : UInt, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SERVER_CONFIG_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerSetConfigVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerSetConfigVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fieldstoset` : UInt, `configinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SERVER_CONFIG_INFO_VQ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerSetDnsRegCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerSetDnsRegCredentials`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `uname` : `windows_sys`.`core`.`PCWSTR`, `domain` : `windows_sys`.`core`.`PCWSTR`, `passwd` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpServerSetDnsRegCredentialsV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpServerSetDnsRegCredentialsV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `uname` : `windows_sys`.`core`.`PCWSTR`, `domain` : `windows_sys`.`core`.`PCWSTR`, `passwd` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetClientInfoV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetClientInfoV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_V4`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetClientInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetClientInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetClientInfoVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetClientInfoVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_VQ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetFilterV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetFilterV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `globalfilterinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_FILTER_GLOBAL_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt, `optioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionInfoV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionInfoV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `optioninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionValue`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `optionid` : UInt, `scopeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionValueV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionValueV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionValueV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionValueV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO6`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionValues; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionValues`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalues` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE_ARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetOptionValuesV5; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetOptionValuesV5`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `classname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE_ARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetServerBindingInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetServerBindingInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `bindelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_BIND_ELEMENT_ARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetServerBindingInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetServerBindingInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `bindelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6_BIND_ELEMENT_ARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetSubnetDelayOffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetSubnetDelayOffer`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `timedelayinmilliseconds` : UShort) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetSubnetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetSubnetInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `subnetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetSubnetInfoV6; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetSubnetInfoV6`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `subnetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetSubnetInfoVQ; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetSubnetInfoVQ`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `subnetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_INFO_VQ`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetSuperScopeV4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetSuperScopeV4`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `superscopename` : `windows_sys`.`core`.`PCWSTR`, `changeexisting` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpSetThreadOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpSetThreadOptions`(`flags` : UInt, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=DhcpUndoRequestParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpUndoRequestParams`(`flags` : UInt, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `adaptername` : `windows_sys`.`core`.`PCWSTR`, `requestidstr` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4AddPolicyRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4AddPolicyRange`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `range` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_IP_RANGE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4CreateClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4CreateClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_PB`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4CreateClientInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4CreateClientInfoEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_EX`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4CreatePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4CreatePolicy`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `ppolicy` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4CreatePolicyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4CreatePolicyEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `policyex` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY_EX`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4DeletePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4DeletePolicy`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4EnumPolicies; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4EnumPolicies`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `enuminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_POLICY_ARRAY`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4EnumPoliciesEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4EnumPoliciesEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `globalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `enuminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_POLICY_EX_ARRAY`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4EnumSubnetClients; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4EnumSubnetClients`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_PB_ARRAY`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4EnumSubnetClientsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4EnumSubnetClientsEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_EX_ARRAY`>>?, `clientsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `clientstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4EnumSubnetReservations; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4EnumSubnetReservations`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `enumelementinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_RESERVATION_INFO_ARRAY`>>?, `elementsread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `elementstotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverAddScopeToRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverAddScopeToRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `prelationship` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_FAILOVER_RELATIONSHIP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverCreateRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverCreateRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `prelationship` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_FAILOVER_RELATIONSHIP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverDeleteRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverDeleteRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `prelationshipname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverDeleteScopeFromRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverDeleteScopeFromRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `prelationship` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_FAILOVER_RELATIONSHIP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverEnumRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverEnumRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `preferredmaximum` : UInt, `prelationship` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_FAILOVER_RELATIONSHIP_ARRAY`>>?, `relationshipread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `relationshiptotal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverGetAddressStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverGetAddressStatus`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `pstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverGetClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverGetClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV4_FAILOVER_CLIENT_INFO`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverGetRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverGetRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `prelationshipname` : `windows_sys`.`core`.`PCWSTR`, `prelationship` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_FAILOVER_RELATIONSHIP`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverGetScopeRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverGetScopeRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeid` : UInt, `prelationship` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_FAILOVER_RELATIONSHIP`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverGetScopeStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverGetScopeStatistics`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeid` : UInt, `pstats` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_FAILOVER_STATISTICS`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverGetSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverGetSystemTime`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `ptime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pmaxalloweddeltatime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverSetRelationship; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverSetRelationship`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `prelationship` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_FAILOVER_RELATIONSHIP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4FailoverTriggerAddrAllocation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4FailoverTriggerAddrAllocation`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `pfailrelname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetAllOptionValues; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetAllOptionValues`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `values` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_ALL_OPTION_VALUES_PB`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_PB`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetClientInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetClientInfoEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `searchinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_SEARCH_INFO`>?, `clientinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_EX`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetFreeIPAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetFreeIPAddress`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeid` : UInt, `startip` : UInt, `endip` : UInt, `numfreeaddrreq` : UInt, `ipaddrlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_IP_ARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetOptionValue`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_OPTION_VALUE`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetPolicy`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_POLICY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4GetPolicyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4GetPolicyEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `globalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_POLICY_EX`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4QueryPolicyEnforcement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4QueryPolicyEnforcement`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `enabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4RemoveOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4RemoveOptionValue`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4RemovePolicyRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4RemovePolicyRange`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `range` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_IP_RANGE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4SetOptionValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4SetOptionValue`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `optionid` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_DATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4SetOptionValues; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4SetOptionValues`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `vendorname` : `windows_sys`.`core`.`PCWSTR`, `scopeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_SCOPE_INFO`>?, `optionvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE_ARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4SetPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4SetPolicy`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fieldsmodified` : UInt, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4SetPolicyEnforcement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4SetPolicyEnforcement`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fglobalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `enable` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV4SetPolicyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV4SetPolicyEx`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fieldsmodified` : UInt, `globalpolicy` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : UInt, `policyname` : `windows_sys`.`core`.`PCWSTR`, `policy` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_POLICY_EX`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV6CreateClientInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV6CreateClientInfo`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `clientinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCP_CLIENT_INFO_V6`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV6GetFreeIPAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV6GetFreeIPAddress`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `scopeid` : `DHCP_IPV6_ADDRESS`, `startip` : `DHCP_IPV6_ADDRESS`, `endip` : `DHCP_IPV6_ADDRESS`, `numfreeaddrreq` : UInt, `ipaddrlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV6_IP_ARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV6GetStatelessStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV6GetStatelessStatistics`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `statelessstats` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV6_STATELESS_STATS`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV6GetStatelessStoreParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV6GetStatelessStoreParams`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fserverlevel` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV6_STATELESS_PARAMS`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpsapi.dll, ABI=system, export=DhcpV6SetStatelessStoreParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DhcpV6SetStatelessStoreParams`(`serveripaddress` : `windows_sys`.`core`.`PCWSTR`, `fserverlevel` : `windows_sys`.`core`.`BOOL`, `subnetaddress` : `DHCP_IPV6_ADDRESS`, `fieldmodified` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<`DHCPV6_STATELESS_PARAMS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc6.dll, ABI=system, export=Dhcpv6CApiCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Dhcpv6CApiCleanup`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc6.dll, ABI=system, export=Dhcpv6CApiInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Dhcpv6CApiInitialize`(`version` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc6.dll, ABI=system, export=Dhcpv6ReleasePrefix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Dhcpv6ReleasePrefix`(`adaptername` : `windows_sys`.`core`.`PCWSTR`, `classid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6CAPI_CLASSID`>?, `leaseinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6PrefixLeaseInformation`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc6.dll, ABI=system, export=Dhcpv6RenewPrefix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Dhcpv6RenewPrefix`(`adaptername` : `windows_sys`.`core`.`PCWSTR`, `pclassid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6CAPI_CLASSID`>?, `prefixleaseinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6PrefixLeaseInformation`>?, `pdwtimetowait` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bvalidateprefix` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc6.dll, ABI=system, export=Dhcpv6RequestParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Dhcpv6RequestParams`(`forcenewinform` : `windows_sys`.`core`.`BOOL`, `reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `adaptername` : `windows_sys`.`core`.`PCWSTR`, `classid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6CAPI_CLASSID`>?, `recdparams` : `DHCPV6CAPI_PARAMS_ARRAY`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `psize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc6.dll, ABI=system, export=Dhcpv6RequestPrefix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Dhcpv6RequestPrefix`(`adaptername` : `windows_sys`.`core`.`PCWSTR`, `pclassid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6CAPI_CLASSID`>?, `prefixleaseinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6PrefixLeaseInformation`>?, `pdwtimetowait` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
public const val `ADDRESS_TYPE_IANA`: UInt = 0u;
public const val `ADDRESS_TYPE_IATA`: UInt = 1u;
public const val `Allow`: `DHCP_FILTER_LIST_TYPE` = 1;
public const val `CHANGESTATE`: UInt = 4u;
public const val `CLIENT_TYPE_BOOTP`: UInt = 2u;
public const val `CLIENT_TYPE_DHCP`: UInt = 1u;
public const val `CLIENT_TYPE_NONE`: UInt = 100u;
public const val `CLIENT_TYPE_RESERVATION_FLAG`: UInt = 4u;
public const val `CLIENT_TYPE_UNSPECIFIED`: UInt = 0u;
public const val `COMMUNICATION_INT`: `FSM_STATE` = 4;
public const val `CONFLICT_DONE`: `FSM_STATE` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DATE_TIME` (
    public var `dwLowDateTime`: UInt,
    public var `dwHighDateTime`: UInt,
)
public const val `DEFAULTQUARSETTING`: `QuarantineStatus` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPAPI_PARAMS` (
    public var `Flags`: UInt,
    public var `OptionId`: UInt,
    public var `IsVendor`: `windows_sys`.`core`.`BOOL`,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `nBytesData`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPAPI_PARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPAPI_PARAMS`.Companion.`default`() : `DHCPAPI_PARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPCAPI_CLASSID` (
    public var `Flags`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `nBytesData`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPCAPI_CLASSID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPCAPI_CLASSID`.Companion.`default`() : `DHCPCAPI_CLASSID` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCPCAPI_DEREGISTER_HANDLE_EVENT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPCAPI_PARAMS_ARRAY` (
    public var `nParams`: UInt,
    public var `Params`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPAPI_PARAMS`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPCAPI_PARAMS_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPCAPI_PARAMS_ARRAY`.Companion.`default`() : `DHCPCAPI_PARAMS_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCPCAPI_REGISTER_HANDLE_EVENT`: UInt = 1u;
public const val `DHCPCAPI_REQUEST_ASYNCHRONOUS`: UInt = 4u;
public const val `DHCPCAPI_REQUEST_CANCEL`: UInt = 8u;
public const val `DHCPCAPI_REQUEST_MASK`: UInt = 15u;
public const val `DHCPCAPI_REQUEST_PERSISTENT`: UInt = 1u;
public const val `DHCPCAPI_REQUEST_SYNCHRONOUS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPDS_SERVER` (
    public var `Version`: UInt,
    public var `ServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `ServerAddress`: UInt,
    public var `Flags`: UInt,
    public var `State`: UInt,
    public var `DsLocation`: `windows_sys`.`core`.`PWSTR`,
    public var `DsLocType`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPDS_SERVER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPDS_SERVER`.Companion.`default`() : `DHCPDS_SERVER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPDS_SERVERS` (
    public var `Flags`: UInt,
    public var `NumElements`: UInt,
    public var `Servers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPDS_SERVER`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPDS_SERVERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPDS_SERVERS`.Companion.`default`() : `DHCPDS_SERVERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV4_FAILOVER_CLIENT_INFO` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
    public var `Status`: `QuarantineStatus`,
    public var `ProbationEnds`: `DATE_TIME`,
    public var `QuarantineCapable`: `windows_sys`.`core`.`BOOL`,
    public var `SentPotExpTime`: UInt,
    public var `AckPotExpTime`: UInt,
    public var `RecvPotExpTime`: UInt,
    public var `StartTime`: UInt,
    public var `CltLastTransTime`: UInt,
    public var `LastBndUpdTime`: UInt,
    public var `BndMsgStatus`: UInt,
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV4_FAILOVER_CLIENT_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV4_FAILOVER_CLIENT_INFO`.Companion.`default`() : `DHCPV4_FAILOVER_CLIENT_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV4_FAILOVER_CLIENT_INFO_ARRAY` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCPV4_FAILOVER_CLIENT_INFO`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV4_FAILOVER_CLIENT_INFO_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV4_FAILOVER_CLIENT_INFO_ARRAY`.Companion.`default`() : `DHCPV4_FAILOVER_CLIENT_INFO_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV4_FAILOVER_CLIENT_INFO_EX` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
    public var `Status`: `QuarantineStatus`,
    public var `ProbationEnds`: `DATE_TIME`,
    public var `QuarantineCapable`: `windows_sys`.`core`.`BOOL`,
    public var `SentPotExpTime`: UInt,
    public var `AckPotExpTime`: UInt,
    public var `RecvPotExpTime`: UInt,
    public var `StartTime`: UInt,
    public var `CltLastTransTime`: UInt,
    public var `LastBndUpdTime`: UInt,
    public var `BndMsgStatus`: UInt,
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UByte,
    public var `AddressStateEx`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV4_FAILOVER_CLIENT_INFO_EX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV4_FAILOVER_CLIENT_INFO_EX`.Companion.`default`() : `DHCPV4_FAILOVER_CLIENT_INFO_EX` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6CAPI_CLASSID` (
    public var `Flags`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `nBytesData`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6CAPI_CLASSID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6CAPI_CLASSID`.Companion.`default`() : `DHCPV6CAPI_CLASSID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6CAPI_PARAMS` (
    public var `Flags`: UInt,
    public var `OptionId`: UInt,
    public var `IsVendor`: `windows_sys`.`core`.`BOOL`,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `nBytesData`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6CAPI_PARAMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6CAPI_PARAMS`.Companion.`default`() : `DHCPV6CAPI_PARAMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6CAPI_PARAMS_ARRAY` (
    public var `nParams`: UInt,
    public var `Params`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6CAPI_PARAMS`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6CAPI_PARAMS_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6CAPI_PARAMS_ARRAY`.Companion.`default`() : `DHCPV6CAPI_PARAMS_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6Prefix` (
    public var `prefix`: UByteArray,
    public var `prefixLength`: UInt,
    public var `preferredLifeTime`: UInt,
    public var `validLifeTime`: UInt,
    public var `status`: `StatusCode`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6Prefix`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6Prefix`.Companion.`default`() : `DHCPV6Prefix` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6PrefixLeaseInformation` (
    public var `nPrefixes`: UInt,
    public var `prefixArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6Prefix`>?,
    public var `iaid`: UInt,
    public var `T1`: Long,
    public var `T2`: Long,
    public var `MaxLeaseExpirationTime`: Long,
    public var `LastRenewalTime`: Long,
    public var `status`: `StatusCode`,
    public var `ServerId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ServerIdLen`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6PrefixLeaseInformation`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6PrefixLeaseInformation`.Companion.`default`() : `DHCPV6PrefixLeaseInformation` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6_BIND_ELEMENT` (
    public var `Flags`: UInt,
    public var `fBoundToDHCPServer`: `windows_sys`.`core`.`BOOL`,
    public var `AdapterPrimaryAddress`: `DHCP_IPV6_ADDRESS`,
    public var `AdapterSubnetAddress`: `DHCP_IPV6_ADDRESS`,
    public var `IfDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `IpV6IfIndex`: UInt,
    public var `IfIdSize`: UInt,
    public var `IfId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6_BIND_ELEMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6_BIND_ELEMENT`.Companion.`default`() : `DHCPV6_BIND_ELEMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6_BIND_ELEMENT_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6_BIND_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6_BIND_ELEMENT_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6_BIND_ELEMENT_ARRAY`.Companion.`default`() : `DHCPV6_BIND_ELEMENT_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6_IP_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_IPV6_ADDRESS`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6_IP_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6_IP_ARRAY`.Companion.`default`() : `DHCPV6_IP_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCPV6_OPTION_CLIENTID`: UInt = 1u;
public const val `DHCPV6_OPTION_DNS_SERVERS`: UInt = 23u;
public const val `DHCPV6_OPTION_DOMAIN_LIST`: UInt = 24u;
public const val `DHCPV6_OPTION_IA_NA`: UInt = 3u;
public const val `DHCPV6_OPTION_IA_PD`: UInt = 25u;
public const val `DHCPV6_OPTION_IA_TA`: UInt = 4u;
public const val `DHCPV6_OPTION_NISP_DOMAIN_NAME`: UInt = 30u;
public const val `DHCPV6_OPTION_NISP_SERVERS`: UInt = 28u;
public const val `DHCPV6_OPTION_NIS_DOMAIN_NAME`: UInt = 29u;
public const val `DHCPV6_OPTION_NIS_SERVERS`: UInt = 27u;
public const val `DHCPV6_OPTION_ORO`: UInt = 6u;
public const val `DHCPV6_OPTION_PREFERENCE`: UInt = 7u;
public const val `DHCPV6_OPTION_RAPID_COMMIT`: UInt = 14u;
public const val `DHCPV6_OPTION_RECONF_MSG`: UInt = 19u;
public const val `DHCPV6_OPTION_SERVERID`: UInt = 2u;
public const val `DHCPV6_OPTION_SIP_SERVERS_ADDRS`: UInt = 22u;
public const val `DHCPV6_OPTION_SIP_SERVERS_NAMES`: UInt = 21u;
public const val `DHCPV6_OPTION_UNICAST`: UInt = 12u;
public const val `DHCPV6_OPTION_USER_CLASS`: UInt = 15u;
public const val `DHCPV6_OPTION_VENDOR_CLASS`: UInt = 16u;
public const val `DHCPV6_OPTION_VENDOR_OPTS`: UInt = 17u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCPV6_STATELESS_PARAMS` (
    public var `Status`: `windows_sys`.`core`.`BOOL`,
    public var `PurgeInterval`: UInt,
)
public typealias `DHCPV6_STATELESS_PARAM_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCPV6_STATELESS_SCOPE_STATS` (
    public var `SubnetAddress`: `DHCP_IPV6_ADDRESS`,
    public var `NumStatelessClientsAdded`: ULong,
    public var `NumStatelessClientsRemoved`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCPV6_STATELESS_STATS` (
    public var `NumScopes`: UInt,
    public var `ScopeStats`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCPV6_STATELESS_SCOPE_STATS`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCPV6_STATELESS_STATS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCPV6_STATELESS_STATS`.Companion.`default`() : `DHCPV6_STATELESS_STATS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ADDR_PATTERN` (
    public var `MatchHWType`: `windows_sys`.`core`.`BOOL`,
    public var `HWType`: UByte,
    public var `IsWildcard`: `windows_sys`.`core`.`BOOL`,
    public var `Length`: UByte,
    public var `Pattern`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ADDR_PATTERN`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ADDR_PATTERN`.Companion.`default`() : `DHCP_ADDR_PATTERN` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ALL_OPTIONS` (
    public var `Flags`: UInt,
    public var `NonVendorOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_ARRAY`>?,
    public var `NumVendorOptions`: UInt,
    public var `VendorOptions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_ALL_OPTIONS_0`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ALL_OPTIONS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ALL_OPTIONS`.Companion.`default`() : `DHCP_ALL_OPTIONS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ALL_OPTIONS_0` (
    public var `Option`: `DHCP_OPTION`,
    public var `VendorName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClassName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ALL_OPTIONS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ALL_OPTIONS_0`.Companion.`default`() : `DHCP_ALL_OPTIONS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ALL_OPTION_VALUES` (
    public var `Flags`: UInt,
    public var `NumElements`: UInt,
    public var `Options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_ALL_OPTION_VALUES_0`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ALL_OPTION_VALUES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ALL_OPTION_VALUES`.Companion.`default`() : `DHCP_ALL_OPTION_VALUES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ALL_OPTION_VALUES_0` (
    public var `ClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `VendorName`: `windows_sys`.`core`.`PWSTR`,
    public var `IsVendor`: `windows_sys`.`core`.`BOOL`,
    public var `OptionsArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE_ARRAY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ALL_OPTION_VALUES_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ALL_OPTION_VALUES_0`.Companion.`default`() : `DHCP_ALL_OPTION_VALUES_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ALL_OPTION_VALUES_PB` (
    public var `Flags`: UInt,
    public var `NumElements`: UInt,
    public var `Options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_ALL_OPTION_VALUES_PB_0`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ALL_OPTION_VALUES_PB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ALL_OPTION_VALUES_PB`.Companion.`default`() : `DHCP_ALL_OPTION_VALUES_PB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ALL_OPTION_VALUES_PB_0` (
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `VendorName`: `windows_sys`.`core`.`PWSTR`,
    public var `IsVendor`: `windows_sys`.`core`.`BOOL`,
    public var `OptionsArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE_ARRAY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ALL_OPTION_VALUES_PB_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ALL_OPTION_VALUES_PB_0`.Companion.`default`() : `DHCP_ALL_OPTION_VALUES_PB_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ATTRIB` (
    public var `DhcpAttribId`: UInt,
    public var `DhcpAttribType`: UInt,
    public var `Anonymous`: `DHCP_ATTRIB_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ATTRIB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ATTRIB`.Companion.`default`() : `DHCP_ATTRIB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 629:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_ATTRIB_0 {
//     pub DhcpAttribBool: windows_sys::core::BOOL,
//     pub DhcpAttribUlong: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ATTRIB_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ATTRIB_0`.Companion.`default`() : `DHCP_ATTRIB_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_ATTRIB_ARRAY` (
    public var `NumElements`: UInt,
    public var `DhcpAttribs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_ATTRIB`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_ATTRIB_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_ATTRIB_ARRAY`.Companion.`default`() : `DHCP_ATTRIB_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_ATTRIB_BOOL_IS_ADMIN`: UInt = 5u;
public const val `DHCP_ATTRIB_BOOL_IS_BINDING_AWARE`: UInt = 4u;
public const val `DHCP_ATTRIB_BOOL_IS_DYNBOOTP`: UInt = 2u;
public const val `DHCP_ATTRIB_BOOL_IS_PART_OF_DSDC`: UInt = 3u;
public const val `DHCP_ATTRIB_BOOL_IS_ROGUE`: UInt = 1u;
public const val `DHCP_ATTRIB_TYPE_BOOL`: UInt = 1u;
public const val `DHCP_ATTRIB_TYPE_ULONG`: UInt = 2u;
public const val `DHCP_ATTRIB_ULONG_RESTORE_STATUS`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_BINARY_DATA` (
    public var `DataLength`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_BINARY_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_BINARY_DATA`.Companion.`default`() : `DHCP_BINARY_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_BIND_ELEMENT` (
    public var `Flags`: UInt,
    public var `fBoundToDHCPServer`: `windows_sys`.`core`.`BOOL`,
    public var `AdapterPrimaryAddress`: UInt,
    public var `AdapterSubnetAddress`: UInt,
    public var `IfDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `IfIdSize`: UInt,
    public var `IfId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_BIND_ELEMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_BIND_ELEMENT`.Companion.`default`() : `DHCP_BIND_ELEMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_BIND_ELEMENT_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_BIND_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_BIND_ELEMENT_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_BIND_ELEMENT_ARRAY`.Companion.`default`() : `DHCP_BIND_ELEMENT_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_BOOTP_IP_RANGE` (
    public var `StartAddress`: UInt,
    public var `EndAddress`: UInt,
    public var `BootpAllocated`: UInt,
    public var `MaxBootpAllowed`: UInt,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DHCP_CALLOUT_ENTRY_POINT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("DhcpServerCalloutEntry");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DHCP_CALLOUT_LIST_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("System\\CurrentControlSet\\Services\\DHCPServer\\Parameters");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DHCP_CALLOUT_LIST_VALUE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CalloutDlls");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CALLOUT_TABLE` (
    public var `DhcpControlHook`: `LPDHCP_CONTROL`,
    public var `DhcpNewPktHook`: `LPDHCP_NEWPKT`,
    public var `DhcpPktDropHook`: `LPDHCP_DROP_SEND`,
    public var `DhcpPktSendHook`: `LPDHCP_DROP_SEND`,
    public var `DhcpAddressDelHook`: `LPDHCP_PROB`,
    public var `DhcpAddressOfferHook`: `LPDHCP_GIVE_ADDRESS`,
    public var `DhcpHandleOptionsHook`: `LPDHCP_HANDLE_OPTIONS`,
    public var `DhcpDeleteClientHook`: `LPDHCP_DELETE_CLIENT`,
    public var `DhcpExtensionHook`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DhcpReservedHook`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CALLOUT_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CALLOUT_TABLE`.Companion.`default`() : `DHCP_CALLOUT_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLASS_INFO` (
    public var `ClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClassComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClassDataLength`: UInt,
    public var `IsVendor`: `windows_sys`.`core`.`BOOL`,
    public var `Flags`: UInt,
    public var `ClassData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLASS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLASS_INFO`.Companion.`default`() : `DHCP_CLASS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLASS_INFO_ARRAY` (
    public var `NumElements`: UInt,
    public var `Classes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLASS_INFO_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLASS_INFO_ARRAY`.Companion.`default`() : `DHCP_CLASS_INFO_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLASS_INFO_ARRAY_V6` (
    public var `NumElements`: UInt,
    public var `Classes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CLASS_INFO_V6`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLASS_INFO_ARRAY_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLASS_INFO_ARRAY_V6`.Companion.`default`() : `DHCP_CLASS_INFO_ARRAY_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLASS_INFO_V6` (
    public var `ClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClassComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClassDataLength`: UInt,
    public var `IsVendor`: `windows_sys`.`core`.`BOOL`,
    public var `EnterpriseNumber`: UInt,
    public var `Flags`: UInt,
    public var `ClassData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLASS_INFO_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLASS_INFO_V6`.Companion.`default`() : `DHCP_CLASS_INFO_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_CLIENT_BOOTP`: UInt = 805306371u;
public const val `DHCP_CLIENT_DHCP`: UInt = 805306372u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_FILTER_STATUS_INFO` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
    public var `Status`: `QuarantineStatus`,
    public var `ProbationEnds`: `DATE_TIME`,
    public var `QuarantineCapable`: `windows_sys`.`core`.`BOOL`,
    public var `FilterStatus`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_FILTER_STATUS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_FILTER_STATUS_INFO`.Companion.`default`() : `DHCP_CLIENT_FILTER_STATUS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_FILTER_STATUS_INFO`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY`.Companion.`default`() : `DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO`.Companion.`default`() : `DHCP_CLIENT_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_ARRAY` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_ARRAY`.Companion.`default`() : `DHCP_CLIENT_INFO_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_ARRAY_V4` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_V4`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_ARRAY_V4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_ARRAY_V4`.Companion.`default`() : `DHCP_CLIENT_INFO_ARRAY_V4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_ARRAY_V5` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_V5`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_ARRAY_V5`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_ARRAY_V5`.Companion.`default`() : `DHCP_CLIENT_INFO_ARRAY_V5` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_ARRAY_V6` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_V6`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_ARRAY_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_ARRAY_V6`.Companion.`default`() : `DHCP_CLIENT_INFO_ARRAY_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_ARRAY_VQ` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_VQ`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_ARRAY_VQ`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_ARRAY_VQ`.Companion.`default`() : `DHCP_CLIENT_INFO_ARRAY_VQ` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_EX` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
    public var `Status`: `QuarantineStatus`,
    public var `ProbationEnds`: `DATE_TIME`,
    public var `QuarantineCapable`: `windows_sys`.`core`.`BOOL`,
    public var `FilterStatus`: UInt,
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `Properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY_ARRAY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_EX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_EX`.Companion.`default`() : `DHCP_CLIENT_INFO_EX` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_EX_ARRAY` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_EX`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_EX_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_EX_ARRAY`.Companion.`default`() : `DHCP_CLIENT_INFO_EX_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_PB` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
    public var `Status`: `QuarantineStatus`,
    public var `ProbationEnds`: `DATE_TIME`,
    public var `QuarantineCapable`: `windows_sys`.`core`.`BOOL`,
    public var `FilterStatus`: UInt,
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_PB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_PB`.Companion.`default`() : `DHCP_CLIENT_INFO_PB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_PB_ARRAY` (
    public var `NumElements`: UInt,
    public var `Clients`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_CLIENT_INFO_PB`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_PB_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_PB_ARRAY`.Companion.`default`() : `DHCP_CLIENT_INFO_PB_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_V4` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_V4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_V4`.Companion.`default`() : `DHCP_CLIENT_INFO_V4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_V5` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_V5`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_V5`.Companion.`default`() : `DHCP_CLIENT_INFO_V5` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_V6` (
    public var `ClientIpAddress`: `DHCP_IPV6_ADDRESS`,
    public var `ClientDUID`: `DHCP_BINARY_DATA`,
    public var `AddressType`: UInt,
    public var `IAID`: UInt,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientValidLeaseExpires`: `DATE_TIME`,
    public var `ClientPrefLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO_V6`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_V6`.Companion.`default`() : `DHCP_CLIENT_INFO_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_CLIENT_INFO_VQ` (
    public var `ClientIpAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `ClientHardwareAddress`: `DHCP_BINARY_DATA`,
    public var `ClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientComment`: `windows_sys`.`core`.`PWSTR`,
    public var `ClientLeaseExpires`: `DATE_TIME`,
    public var `OwnerHost`: `DHCP_HOST_INFO`,
    public var `bClientType`: UByte,
    public var `AddressState`: UByte,
    public var `Status`: `QuarantineStatus`,
    public var `ProbationEnds`: `DATE_TIME`,
    public var `QuarantineCapable`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_CLIENT_INFO_VQ`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_CLIENT_INFO_VQ`.Companion.`default`() : `DHCP_CLIENT_INFO_VQ` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_CONTROL_CONTINUE`: UInt = 4u;
public const val `DHCP_CONTROL_PAUSE`: UInt = 3u;
public const val `DHCP_CONTROL_START`: UInt = 1u;
public const val `DHCP_CONTROL_STOP`: UInt = 2u;
public const val `DHCP_DROP_DUPLICATE`: UInt = 1u;
public const val `DHCP_DROP_GEN_FAILURE`: UInt = 256u;
public const val `DHCP_DROP_INTERNAL_ERROR`: UInt = 3u;
public const val `DHCP_DROP_INVALID`: UInt = 8u;
public const val `DHCP_DROP_NOADDRESS`: UInt = 10u;
public const val `DHCP_DROP_NOMEM`: UInt = 2u;
public const val `DHCP_DROP_NO_SUBNETS`: UInt = 7u;
public const val `DHCP_DROP_PAUSED`: UInt = 6u;
public const val `DHCP_DROP_PROCESSED`: UInt = 11u;
public const val `DHCP_DROP_TIMEOUT`: UInt = 4u;
public const val `DHCP_DROP_UNAUTH`: UInt = 5u;
public const val `DHCP_DROP_WRONG_SERVER`: UInt = 9u;
public const val `DHCP_ENDPOINT_FLAG_CANT_MODIFY`: UInt = 1u;
public const val `DHCP_FAILOVER_DELETE_SCOPES`: UInt = 1u;
public const val `DHCP_FAILOVER_MAX_NUM_ADD_SCOPES`: UInt = 400u;
public const val `DHCP_FAILOVER_MAX_NUM_REL`: UInt = 31u;
public typealias `DHCP_FAILOVER_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_FAILOVER_RELATIONSHIP` (
    public var `PrimaryServer`: UInt,
    public var `SecondaryServer`: UInt,
    public var `Mode`: `DHCP_FAILOVER_MODE`,
    public var `ServerType`: `DHCP_FAILOVER_SERVER`,
    public var `State`: `FSM_STATE`,
    public var `PrevState`: `FSM_STATE`,
    public var `Mclt`: UInt,
    public var `SafePeriod`: UInt,
    public var `RelationshipName`: `windows_sys`.`core`.`PWSTR`,
    public var `PrimaryServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `SecondaryServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pScopes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_IP_ARRAY`>?,
    public var `Percentage`: UByte,
    public var `SharedSecret`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_FAILOVER_RELATIONSHIP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_FAILOVER_RELATIONSHIP`.Companion.`default`() : `DHCP_FAILOVER_RELATIONSHIP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_FAILOVER_RELATIONSHIP_ARRAY` (
    public var `NumElements`: UInt,
    public var `pRelationships`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_FAILOVER_RELATIONSHIP`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_FAILOVER_RELATIONSHIP_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_FAILOVER_RELATIONSHIP_ARRAY`.Companion.`default`() : `DHCP_FAILOVER_RELATIONSHIP_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_FAILOVER_SERVER` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_FAILOVER_STATISTICS` (
    public var `NumAddr`: UInt,
    public var `AddrFree`: UInt,
    public var `AddrInUse`: UInt,
    public var `PartnerAddrFree`: UInt,
    public var `ThisAddrFree`: UInt,
    public var `PartnerAddrInUse`: UInt,
    public var `ThisAddrInUse`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_FILTER_ADD_INFO` (
    public var `AddrPatt`: `DHCP_ADDR_PATTERN`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `ListType`: `DHCP_FILTER_LIST_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_FILTER_ADD_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_FILTER_ADD_INFO`.Companion.`default`() : `DHCP_FILTER_ADD_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_FILTER_ENUM_INFO` (
    public var `NumElements`: UInt,
    public var `pEnumRecords`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_FILTER_RECORD`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_FILTER_ENUM_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_FILTER_ENUM_INFO`.Companion.`default`() : `DHCP_FILTER_ENUM_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_FILTER_GLOBAL_INFO` (
    public var `EnforceAllowList`: `windows_sys`.`core`.`BOOL`,
    public var `EnforceDenyList`: `windows_sys`.`core`.`BOOL`,
)
public typealias `DHCP_FILTER_LIST_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_FILTER_RECORD` (
    public var `AddrPatt`: `DHCP_ADDR_PATTERN`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_FILTER_RECORD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_FILTER_RECORD`.Companion.`default`() : `DHCP_FILTER_RECORD` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_FLAGS_DONT_ACCESS_DS`: UInt = 1u;
public const val `DHCP_FLAGS_DONT_DO_RPC`: UInt = 2u;
public const val `DHCP_FLAGS_OPTION_IS_VENDOR`: UInt = 3u;
public typealias `DHCP_FORCE_FLAG` = Int;
public const val `DHCP_GIVE_ADDRESS_NEW`: UInt = 805306369u;
public const val `DHCP_GIVE_ADDRESS_OLD`: UInt = 805306370u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_HOST_INFO` (
    public var `IpAddress`: UInt,
    public var `NetBiosName`: `windows_sys`.`core`.`PWSTR`,
    public var `HostName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_HOST_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_HOST_INFO`.Companion.`default`() : `DHCP_HOST_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_HOST_INFO_V6` (
    public var `IpAddress`: `DHCP_IPV6_ADDRESS`,
    public var `NetBiosName`: `windows_sys`.`core`.`PWSTR`,
    public var `HostName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_HOST_INFO_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_HOST_INFO_V6`.Companion.`default`() : `DHCP_HOST_INFO_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_IPV6_ADDRESS` (
    public var `HighOrderBits`: ULong,
    public var `LowOrderBits`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_IP_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_IP_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_IP_ARRAY`.Companion.`default`() : `DHCP_IP_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_IP_CLUSTER` (
    public var `ClusterAddress`: UInt,
    public var `ClusterMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_IP_RANGE` (
    public var `StartAddress`: UInt,
    public var `EndAddress`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_IP_RANGE_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_IP_RANGE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_IP_RANGE_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_IP_RANGE_ARRAY`.Companion.`default`() : `DHCP_IP_RANGE_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_IP_RANGE_V6` (
    public var `StartAddress`: `DHCP_IPV6_ADDRESS`,
    public var `EndAddress`: `DHCP_IPV6_ADDRESS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_IP_RESERVATION` (
    public var `ReservedIpAddress`: UInt,
    public var `ReservedForClient`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_BINARY_DATA`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_IP_RESERVATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_IP_RESERVATION`.Companion.`default`() : `DHCP_IP_RESERVATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_IP_RESERVATION_INFO` (
    public var `ReservedIpAddress`: UInt,
    public var `ReservedForClient`: `DHCP_BINARY_DATA`,
    public var `ReservedClientName`: `windows_sys`.`core`.`PWSTR`,
    public var `ReservedClientDesc`: `windows_sys`.`core`.`PWSTR`,
    public var `bAllowedClientTypes`: UByte,
    public var `fOptionsPresent`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_IP_RESERVATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_IP_RESERVATION_INFO`.Companion.`default`() : `DHCP_IP_RESERVATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_IP_RESERVATION_V4` (
    public var `ReservedIpAddress`: UInt,
    public var `ReservedForClient`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_BINARY_DATA`>?,
    public var `bAllowedClientTypes`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_IP_RESERVATION_V4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_IP_RESERVATION_V4`.Companion.`default`() : `DHCP_IP_RESERVATION_V4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_IP_RESERVATION_V6` (
    public var `ReservedIpAddress`: `DHCP_IPV6_ADDRESS`,
    public var `ReservedForClient`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_BINARY_DATA`>?,
    public var `InterfaceId`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_IP_RESERVATION_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_IP_RESERVATION_V6`.Companion.`default`() : `DHCP_IP_RESERVATION_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_MAX_DELAY`: UInt = 1000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_MIB_INFO` (
    public var `Discovers`: UInt,
    public var `Offers`: UInt,
    public var `Requests`: UInt,
    public var `Acks`: UInt,
    public var `Naks`: UInt,
    public var `Declines`: UInt,
    public var `Releases`: UInt,
    public var `ServerStartTime`: `DATE_TIME`,
    public var `Scopes`: UInt,
    public var `ScopeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SCOPE_MIB_INFO`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_MIB_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_MIB_INFO`.Companion.`default`() : `DHCP_MIB_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_MIB_INFO_V5` (
    public var `Discovers`: UInt,
    public var `Offers`: UInt,
    public var `Requests`: UInt,
    public var `Acks`: UInt,
    public var `Naks`: UInt,
    public var `Declines`: UInt,
    public var `Releases`: UInt,
    public var `ServerStartTime`: `DATE_TIME`,
    public var `QtnNumLeases`: UInt,
    public var `QtnPctQtnLeases`: UInt,
    public var `QtnProbationLeases`: UInt,
    public var `QtnNonQtnLeases`: UInt,
    public var `QtnExemptLeases`: UInt,
    public var `QtnCapableClients`: UInt,
    public var `QtnIASErrors`: UInt,
    public var `DelayedOffers`: UInt,
    public var `ScopesWithDelayedOffers`: UInt,
    public var `Scopes`: UInt,
    public var `ScopeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SCOPE_MIB_INFO_V5`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_MIB_INFO_V5`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_MIB_INFO_V5`.Companion.`default`() : `DHCP_MIB_INFO_V5` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_MIB_INFO_V6` (
    public var `Solicits`: UInt,
    public var `Advertises`: UInt,
    public var `Requests`: UInt,
    public var `Renews`: UInt,
    public var `Rebinds`: UInt,
    public var `Replies`: UInt,
    public var `Confirms`: UInt,
    public var `Declines`: UInt,
    public var `Releases`: UInt,
    public var `Informs`: UInt,
    public var `ServerStartTime`: `DATE_TIME`,
    public var `Scopes`: UInt,
    public var `ScopeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SCOPE_MIB_INFO_V6`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_MIB_INFO_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_MIB_INFO_V6`.Companion.`default`() : `DHCP_MIB_INFO_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_MIB_INFO_VQ` (
    public var `Discovers`: UInt,
    public var `Offers`: UInt,
    public var `Requests`: UInt,
    public var `Acks`: UInt,
    public var `Naks`: UInt,
    public var `Declines`: UInt,
    public var `Releases`: UInt,
    public var `ServerStartTime`: `DATE_TIME`,
    public var `QtnNumLeases`: UInt,
    public var `QtnPctQtnLeases`: UInt,
    public var `QtnProbationLeases`: UInt,
    public var `QtnNonQtnLeases`: UInt,
    public var `QtnExemptLeases`: UInt,
    public var `QtnCapableClients`: UInt,
    public var `QtnIASErrors`: UInt,
    public var `Scopes`: UInt,
    public var `ScopeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SCOPE_MIB_INFO_VQ`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_MIB_INFO_VQ`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_MIB_INFO_VQ`.Companion.`default`() : `DHCP_MIB_INFO_VQ` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_MIN_DELAY`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION` (
    public var `OptionID`: UInt,
    public var `OptionName`: `windows_sys`.`core`.`PWSTR`,
    public var `OptionComment`: `windows_sys`.`core`.`PWSTR`,
    public var `DefaultValue`: `DHCP_OPTION_DATA`,
    public var `OptionType`: `DHCP_OPTION_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION`.Companion.`default`() : `DHCP_OPTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_ARRAY` (
    public var `NumElements`: UInt,
    public var `Options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_ARRAY`.Companion.`default`() : `DHCP_OPTION_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_DATA` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_DATA_ELEMENT`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_DATA`.Companion.`default`() : `DHCP_OPTION_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_DATA_ELEMENT` (
    public var `OptionType`: `DHCP_OPTION_DATA_TYPE`,
    public var `Element`: `DHCP_OPTION_DATA_ELEMENT_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_DATA_ELEMENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_DATA_ELEMENT`.Companion.`default`() : `DHCP_OPTION_DATA_ELEMENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1407:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_OPTION_DATA_ELEMENT_0 {
//     pub ByteOption: u8,
//     pub WordOption: u16,
//     pub DWordOption: u32,
//     pub DWordDWordOption: DWORD_DWORD,
//     pub IpAddressOption: u32,
//     pub StringDataOption: windows_sys::core::PWSTR,
//     pub BinaryDataOption: DHCP_BINARY_DATA,
//     pub EncapsulatedDataOption: DHCP_BINARY_DATA,
//     pub Ipv6AddressDataOption: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_DATA_ELEMENT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_DATA_ELEMENT_0`.Companion.`default`() : `DHCP_OPTION_DATA_ELEMENT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_OPTION_DATA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_LIST` (
    public var `NumOptions`: UInt,
    public var `Options`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_LIST`.Companion.`default`() : `DHCP_OPTION_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_SCOPE_INFO` (
    public var `ScopeType`: `DHCP_OPTION_SCOPE_TYPE`,
    public var `ScopeInfo`: `DHCP_OPTION_SCOPE_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_SCOPE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_SCOPE_INFO`.Companion.`default`() : `DHCP_OPTION_SCOPE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1448:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_OPTION_SCOPE_INFO_0 {
//     pub DefaultScopeInfo: *mut core::ffi::c_void,
//     pub GlobalScopeInfo: *mut core::ffi::c_void,
//     pub SubnetScopeInfo: u32,
//     pub ReservedScopeInfo: DHCP_RESERVED_SCOPE,
//     pub MScopeInfo: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_SCOPE_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_SCOPE_INFO_0`.Companion.`default`() : `DHCP_OPTION_SCOPE_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_SCOPE_INFO6` (
    public var `ScopeType`: `DHCP_OPTION_SCOPE_TYPE6`,
    public var `ScopeInfo`: `DHCP_OPTION_SCOPE_INFO6_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_SCOPE_INFO6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_SCOPE_INFO6`.Companion.`default`() : `DHCP_OPTION_SCOPE_INFO6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1473:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_OPTION_SCOPE_INFO6_0 {
//     pub DefaultScopeInfo: *mut core::ffi::c_void,
//     pub SubnetScopeInfo: DHCP_IPV6_ADDRESS,
//     pub ReservedScopeInfo: DHCP_RESERVED_SCOPE6,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_SCOPE_INFO6_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_SCOPE_INFO6_0`.Companion.`default`() : `DHCP_OPTION_SCOPE_INFO6_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_OPTION_SCOPE_TYPE` = Int;
public typealias `DHCP_OPTION_SCOPE_TYPE6` = Int;
public typealias `DHCP_OPTION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_OPTION_VALUE` (
    public var `OptionID`: UInt,
    public var `Value`: `DHCP_OPTION_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_OPTION_VALUE_ARRAY` (
    public var `NumElements`: UInt,
    public var `Values`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_OPTION_VALUE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_OPTION_VALUE_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_OPTION_VALUE_ARRAY`.Companion.`default`() : `DHCP_OPTION_VALUE_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_OPT_ENUM_IGNORE_VENDOR`: UInt = 1u;
public const val `DHCP_OPT_ENUM_USE_CLASSNAME`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_PERF_STATS` (
    public var `dwNumPacketsReceived`: UInt,
    public var `dwNumPacketsDuplicate`: UInt,
    public var `dwNumPacketsExpired`: UInt,
    public var `dwNumMilliSecondsProcessed`: UInt,
    public var `dwNumPacketsInActiveQueue`: UInt,
    public var `dwNumPacketsInPingQueue`: UInt,
    public var `dwNumDiscoversReceived`: UInt,
    public var `dwNumOffersSent`: UInt,
    public var `dwNumRequestsReceived`: UInt,
    public var `dwNumInformsReceived`: UInt,
    public var `dwNumAcksSent`: UInt,
    public var `dwNumNacksSent`: UInt,
    public var `dwNumDeclinesReceived`: UInt,
    public var `dwNumReleasesReceived`: UInt,
    public var `dwNumDelayedOfferInQueue`: UInt,
    public var `dwNumPacketsProcessed`: UInt,
    public var `dwNumPacketsInQuarWaitingQueue`: UInt,
    public var `dwNumPacketsInQuarReadyQueue`: UInt,
    public var `dwNumPacketsInQuarDecisionQueue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POLICY` (
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `IsGlobalPolicy`: `windows_sys`.`core`.`BOOL`,
    public var `Subnet`: UInt,
    public var `ProcessingOrder`: UInt,
    public var `Conditions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POL_COND_ARRAY`>?,
    public var `Expressions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POL_EXPR_ARRAY`>?,
    public var `Ranges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_IP_RANGE_ARRAY`>?,
    public var `Description`: `windows_sys`.`core`.`PWSTR`,
    public var `Enabled`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POLICY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POLICY`.Companion.`default`() : `DHCP_POLICY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POLICY_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POLICY_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POLICY_ARRAY`.Companion.`default`() : `DHCP_POLICY_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POLICY_EX` (
    public var `PolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `IsGlobalPolicy`: `windows_sys`.`core`.`BOOL`,
    public var `Subnet`: UInt,
    public var `ProcessingOrder`: UInt,
    public var `Conditions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POL_COND_ARRAY`>?,
    public var `Expressions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POL_EXPR_ARRAY`>?,
    public var `Ranges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_IP_RANGE_ARRAY`>?,
    public var `Description`: `windows_sys`.`core`.`PWSTR`,
    public var `Enabled`: `windows_sys`.`core`.`BOOL`,
    public var `Properties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY_ARRAY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POLICY_EX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POLICY_EX`.Companion.`default`() : `DHCP_POLICY_EX` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POLICY_EX_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POLICY_EX`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POLICY_EX_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POLICY_EX_ARRAY`.Companion.`default`() : `DHCP_POLICY_EX_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_POLICY_FIELDS_TO_UPDATE` = Int;
public typealias `DHCP_POL_ATTR_TYPE` = Int;
public typealias `DHCP_POL_COMPARATOR` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POL_COND` (
    public var `ParentExpr`: UInt,
    public var `Type`: `DHCP_POL_ATTR_TYPE`,
    public var `OptionID`: UInt,
    public var `SubOptionID`: UInt,
    public var `VendorName`: `windows_sys`.`core`.`PWSTR`,
    public var `Operator`: `DHCP_POL_COMPARATOR`,
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ValueLength`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POL_COND`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POL_COND`.Companion.`default`() : `DHCP_POL_COND` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POL_COND_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POL_COND`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POL_COND_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POL_COND_ARRAY`.Companion.`default`() : `DHCP_POL_COND_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_POL_EXPR` (
    public var `ParentExpr`: UInt,
    public var `Operator`: `DHCP_POL_LOGIC_OPER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_POL_EXPR_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_POL_EXPR`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_POL_EXPR_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_POL_EXPR_ARRAY`.Companion.`default`() : `DHCP_POL_EXPR_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_POL_LOGIC_OPER` = Int;
public const val `DHCP_PROB_CONFLICT`: UInt = 536870913u;
public const val `DHCP_PROB_DECLINE`: UInt = 536870914u;
public const val `DHCP_PROB_NACKED`: UInt = 536870916u;
public const val `DHCP_PROB_RELEASE`: UInt = 536870915u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_PROPERTY` (
    public var `ID`: `DHCP_PROPERTY_ID`,
    public var `Type`: `DHCP_PROPERTY_TYPE`,
    public var `Value`: `DHCP_PROPERTY_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_PROPERTY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_PROPERTY`.Companion.`default`() : `DHCP_PROPERTY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1654:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_PROPERTY_0 {
//     pub ByteValue: u8,
//     pub WordValue: u16,
//     pub DWordValue: u32,
//     pub StringValue: windows_sys::core::PWSTR,
//     pub BinaryValue: DHCP_BINARY_DATA,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_PROPERTY_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_PROPERTY_0`.Companion.`default`() : `DHCP_PROPERTY_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_PROPERTY_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_PROPERTY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_PROPERTY_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_PROPERTY_ARRAY`.Companion.`default`() : `DHCP_PROPERTY_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_PROPERTY_ID` = Int;
public typealias `DHCP_PROPERTY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_RESERVATION_INFO_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DHCP_IP_RESERVATION_INFO`>>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_RESERVATION_INFO_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_RESERVATION_INFO_ARRAY`.Companion.`default`() : `DHCP_RESERVATION_INFO_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_RESERVED_SCOPE` (
    public var `ReservedIpAddress`: UInt,
    public var `ReservedIpSubnetAddress`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_RESERVED_SCOPE6` (
    public var `ReservedIpAddress`: `DHCP_IPV6_ADDRESS`,
    public var `ReservedIpSubnetAddress`: `DHCP_IPV6_ADDRESS`,
)
public typealias `DHCP_SCAN_FLAG` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_SCAN_ITEM` (
    public var `IpAddress`: UInt,
    public var `ScanFlag`: `DHCP_SCAN_FLAG`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SCAN_LIST` (
    public var `NumScanItems`: UInt,
    public var `ScanItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SCAN_ITEM`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SCAN_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SCAN_LIST`.Companion.`default`() : `DHCP_SCAN_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SEARCH_INFO` (
    public var `SearchType`: `DHCP_SEARCH_INFO_TYPE`,
    public var `SearchInfo`: `DHCP_SEARCH_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SEARCH_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SEARCH_INFO`.Companion.`default`() : `DHCP_SEARCH_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1733:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SEARCH_INFO_0 {
//     pub ClientIpAddress: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SEARCH_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SEARCH_INFO_0`.Companion.`default`() : `DHCP_SEARCH_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_SEARCH_INFO_TYPE` = Int;
public typealias `DHCP_SEARCH_INFO_TYPE_V6` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SEARCH_INFO_V6` (
    public var `SearchType`: `DHCP_SEARCH_INFO_TYPE_V6`,
    public var `SearchInfo`: `DHCP_SEARCH_INFO_V6_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SEARCH_INFO_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SEARCH_INFO_V6`.Companion.`default`() : `DHCP_SEARCH_INFO_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1758:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SEARCH_INFO_V6_0 {
//     pub ClientIpAddress: DHCP_IPV6_ADDRESS,
//     pub ClientDUID: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SEARCH_INFO_V6_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SEARCH_INFO_V6_0`.Companion.`default`() : `DHCP_SEARCH_INFO_V6_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_SEND_PACKET`: UInt = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SERVER_CONFIG_INFO` (
    public var `APIProtocolSupport`: UInt,
    public var `DatabaseName`: `windows_sys`.`core`.`PWSTR`,
    public var `DatabasePath`: `windows_sys`.`core`.`PWSTR`,
    public var `BackupPath`: `windows_sys`.`core`.`PWSTR`,
    public var `BackupInterval`: UInt,
    public var `DatabaseLoggingFlag`: UInt,
    public var `RestoreFlag`: UInt,
    public var `DatabaseCleanupInterval`: UInt,
    public var `DebugFlag`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SERVER_CONFIG_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SERVER_CONFIG_INFO`.Companion.`default`() : `DHCP_SERVER_CONFIG_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SERVER_CONFIG_INFO_V4` (
    public var `APIProtocolSupport`: UInt,
    public var `DatabaseName`: `windows_sys`.`core`.`PWSTR`,
    public var `DatabasePath`: `windows_sys`.`core`.`PWSTR`,
    public var `BackupPath`: `windows_sys`.`core`.`PWSTR`,
    public var `BackupInterval`: UInt,
    public var `DatabaseLoggingFlag`: UInt,
    public var `RestoreFlag`: UInt,
    public var `DatabaseCleanupInterval`: UInt,
    public var `DebugFlag`: UInt,
    public var `dwPingRetries`: UInt,
    public var `cbBootTableString`: UInt,
    public var `wszBootTableString`: `windows_sys`.`core`.`PWSTR`,
    public var `fAuditLog`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SERVER_CONFIG_INFO_V4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SERVER_CONFIG_INFO_V4`.Companion.`default`() : `DHCP_SERVER_CONFIG_INFO_V4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DHCP_SERVER_CONFIG_INFO_V6` (
    public var `UnicastFlag`: `windows_sys`.`core`.`BOOL`,
    public var `RapidCommitFlag`: `windows_sys`.`core`.`BOOL`,
    public var `PreferredLifetime`: UInt,
    public var `ValidLifetime`: UInt,
    public var `T1`: UInt,
    public var `T2`: UInt,
    public var `PreferredLifetimeIATA`: UInt,
    public var `ValidLifetimeIATA`: UInt,
    public var `fAuditLog`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SERVER_CONFIG_INFO_VQ` (
    public var `APIProtocolSupport`: UInt,
    public var `DatabaseName`: `windows_sys`.`core`.`PWSTR`,
    public var `DatabasePath`: `windows_sys`.`core`.`PWSTR`,
    public var `BackupPath`: `windows_sys`.`core`.`PWSTR`,
    public var `BackupInterval`: UInt,
    public var `DatabaseLoggingFlag`: UInt,
    public var `RestoreFlag`: UInt,
    public var `DatabaseCleanupInterval`: UInt,
    public var `DebugFlag`: UInt,
    public var `dwPingRetries`: UInt,
    public var `cbBootTableString`: UInt,
    public var `wszBootTableString`: `windows_sys`.`core`.`PWSTR`,
    public var `fAuditLog`: `windows_sys`.`core`.`BOOL`,
    public var `QuarantineOn`: `windows_sys`.`core`.`BOOL`,
    public var `QuarDefFail`: UInt,
    public var `QuarRuntimeStatus`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SERVER_CONFIG_INFO_VQ`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SERVER_CONFIG_INFO_VQ`.Companion.`default`() : `DHCP_SERVER_CONFIG_INFO_VQ` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SERVER_OPTIONS` (
    public var `MessageType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `SubnetMask`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `RequestedAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `RequestLeaseTime`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `OverlayFields`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `RouterAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `Server`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ParameterRequestList`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ParameterRequestListLength`: UInt,
    public var `MachineName`: `windows_sys`.`core`.`PSTR`,
    public var `MachineNameLength`: UInt,
    public var `ClientHardwareAddressType`: UByte,
    public var `ClientHardwareAddressLength`: UByte,
    public var `ClientHardwareAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ClassIdentifier`: `windows_sys`.`core`.`PSTR`,
    public var `ClassIdentifierLength`: UInt,
    public var `VendorClass`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `VendorClassLength`: UInt,
    public var `DNSFlags`: UInt,
    public var `DNSNameLength`: UInt,
    public var `DNSName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DSDomainNameRequested`: Boolean,
    public var `DSDomainName`: `windows_sys`.`core`.`PSTR`,
    public var `DSDomainNameLen`: UInt,
    public var `ScopeId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SERVER_OPTIONS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SERVER_OPTIONS`.Companion.`default`() : `DHCP_SERVER_OPTIONS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SERVER_SPECIFIC_STRINGS` (
    public var `DefaultVendorClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `DefaultUserClassName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SERVER_SPECIFIC_STRINGS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SERVER_SPECIFIC_STRINGS`.Companion.`default`() : `DHCP_SERVER_SPECIFIC_STRINGS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_DATA` (
    public var `ElementType`: `DHCP_SUBNET_ELEMENT_TYPE`,
    public var `Element`: `DHCP_SUBNET_ELEMENT_DATA_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1905:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_0 {
//     pub IpRange: *mut DHCP_IP_RANGE,
//     pub SecondaryHost: *mut DHCP_HOST_INFO,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE,
//     pub IpUsedCluster: *mut DHCP_IP_CLUSTER,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_0`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_DATA_V4` (
    public var `ElementType`: `DHCP_SUBNET_ELEMENT_TYPE`,
    public var `Element`: `DHCP_SUBNET_ELEMENT_DATA_V4_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_V4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_V4`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_V4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1930:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_V4_0 {
//     pub IpRange: *mut DHCP_IP_RANGE,
//     pub SecondaryHost: *mut DHCP_HOST_INFO,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION_V4,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE,
//     pub IpUsedCluster: *mut DHCP_IP_CLUSTER,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_V4_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_V4_0`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_V4_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_DATA_V5` (
    public var `ElementType`: `DHCP_SUBNET_ELEMENT_TYPE`,
    public var `Element`: `DHCP_SUBNET_ELEMENT_DATA_V5_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_V5`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_V5`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_V5` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1955:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_V5_0 {
//     pub IpRange: *mut DHCP_BOOTP_IP_RANGE,
//     pub SecondaryHost: *mut DHCP_HOST_INFO,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION_V4,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE,
//     pub IpUsedCluster: *mut DHCP_IP_CLUSTER,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_V5_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_V5_0`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_V5_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_DATA_V6` (
    public var `ElementType`: `DHCP_SUBNET_ELEMENT_TYPE_V6`,
    public var `Element`: `DHCP_SUBNET_ELEMENT_DATA_V6_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_V6`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1980:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_V6_0 {
//     pub IpRange: *mut DHCP_IP_RANGE_V6,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION_V6,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE_V6,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_DATA_V6_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_DATA_V6_0`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_DATA_V6_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_INFO_ARRAY` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_INFO_ARRAY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_INFO_ARRAY`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_INFO_ARRAY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V4`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V5`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6` (
    public var `NumElements`: UInt,
    public var `Elements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUBNET_ELEMENT_DATA_V6`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6`.Companion.`default`() : `DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DHCP_SUBNET_ELEMENT_TYPE` = Int;
public typealias `DHCP_SUBNET_ELEMENT_TYPE_V6` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_INFO` (
    public var `SubnetAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `SubnetName`: `windows_sys`.`core`.`PWSTR`,
    public var `SubnetComment`: `windows_sys`.`core`.`PWSTR`,
    public var `PrimaryHost`: `DHCP_HOST_INFO`,
    public var `SubnetState`: `DHCP_SUBNET_STATE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_INFO`.Companion.`default`() : `DHCP_SUBNET_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_INFO_V6` (
    public var `SubnetAddress`: `DHCP_IPV6_ADDRESS`,
    public var `Prefix`: UInt,
    public var `Preference`: UShort,
    public var `SubnetName`: `windows_sys`.`core`.`PWSTR`,
    public var `SubnetComment`: `windows_sys`.`core`.`PWSTR`,
    public var `State`: UInt,
    public var `ScopeId`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_INFO_V6`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_INFO_V6`.Companion.`default`() : `DHCP_SUBNET_INFO_V6` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUBNET_INFO_VQ` (
    public var `SubnetAddress`: UInt,
    public var `SubnetMask`: UInt,
    public var `SubnetName`: `windows_sys`.`core`.`PWSTR`,
    public var `SubnetComment`: `windows_sys`.`core`.`PWSTR`,
    public var `PrimaryHost`: `DHCP_HOST_INFO`,
    public var `SubnetState`: `DHCP_SUBNET_STATE`,
    public var `QuarantineOn`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `Reserved3`: Long,
    public var `Reserved4`: Long,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUBNET_INFO_VQ`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUBNET_INFO_VQ`.Companion.`default`() : `DHCP_SUBNET_INFO_VQ` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DHCP_SUBNET_INFO_VQ_FLAG_QUARANTINE`: UInt = 1u;
public typealias `DHCP_SUBNET_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUPER_SCOPE_TABLE` (
    public var `cEntries`: UInt,
    public var `pEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SUPER_SCOPE_TABLE_ENTRY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUPER_SCOPE_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUPER_SCOPE_TABLE`.Companion.`default`() : `DHCP_SUPER_SCOPE_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DHCP_SUPER_SCOPE_TABLE_ENTRY` (
    public var `SubnetAddress`: UInt,
    public var `SuperScopeNumber`: UInt,
    public var `NextInSuperScope`: UInt,
    public var `SuperScopeName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DHCP_SUPER_SCOPE_TABLE_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DHCP_SUPER_SCOPE_TABLE_ENTRY`.Companion.`default`() : `DHCP_SUPER_SCOPE_TABLE_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DNS_FLAG_CLEANUP_EXPIRED`: UInt = 4u;
public const val `DNS_FLAG_DISABLE_PTR_UPDATE`: UInt = 64u;
public const val `DNS_FLAG_ENABLED`: UInt = 1u;
public const val `DNS_FLAG_HAS_DNS_SUFFIX`: UInt = 128u;
public const val `DNS_FLAG_UPDATE_BOTH_ALWAYS`: UInt = 16u;
public const val `DNS_FLAG_UPDATE_DHCID`: UInt = 32u;
public const val `DNS_FLAG_UPDATE_DOWNLEVEL`: UInt = 2u;
public const val `DROPPACKET`: `QuarantineStatus` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DWORD_DWORD` (
    public var `DWord1`: UInt,
    public var `DWord2`: UInt,
)
public const val `Deny`: `DHCP_FILTER_LIST_TYPE` = 0;
public const val `DhcpArrayTypeOption`: `DHCP_OPTION_TYPE` = 1;
public const val `DhcpAttrFqdn`: `DHCP_POL_ATTR_TYPE` = 3;
public const val `DhcpAttrFqdnSingleLabel`: `DHCP_POL_ATTR_TYPE` = 4;
public const val `DhcpAttrHWAddr`: `DHCP_POL_ATTR_TYPE` = 0;
public const val `DhcpAttrOption`: `DHCP_POL_ATTR_TYPE` = 1;
public const val `DhcpAttrSubOption`: `DHCP_POL_ATTR_TYPE` = 2;
public const val `DhcpBinaryDataOption`: `DHCP_OPTION_DATA_TYPE` = 6;
public const val `DhcpByteOption`: `DHCP_OPTION_DATA_TYPE` = 0;
public const val `DhcpClientHardwareAddress`: `DHCP_SEARCH_INFO_TYPE` = 1;
public const val `DhcpClientIpAddress`: `DHCP_SEARCH_INFO_TYPE` = 0;
public const val `DhcpClientName`: `DHCP_SEARCH_INFO_TYPE` = 2;
public const val `DhcpCompBeginsWith`: `DHCP_POL_COMPARATOR` = 2;
public const val `DhcpCompEndsWith`: `DHCP_POL_COMPARATOR` = 4;
public const val `DhcpCompEqual`: `DHCP_POL_COMPARATOR` = 0;
public const val `DhcpCompNotBeginWith`: `DHCP_POL_COMPARATOR` = 3;
public const val `DhcpCompNotEndWith`: `DHCP_POL_COMPARATOR` = 5;
public const val `DhcpCompNotEqual`: `DHCP_POL_COMPARATOR` = 1;
public const val `DhcpDWordDWordOption`: `DHCP_OPTION_DATA_TYPE` = 3;
public const val `DhcpDWordOption`: `DHCP_OPTION_DATA_TYPE` = 2;
public const val `DhcpDatabaseFix`: `DHCP_SCAN_FLAG` = 1;
public const val `DhcpDefaultOptions`: `DHCP_OPTION_SCOPE_TYPE` = 0;
public const val `DhcpDefaultOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 0;
public const val `DhcpEncapsulatedDataOption`: `DHCP_OPTION_DATA_TYPE` = 7;
public const val `DhcpExcludedIpRanges`: `DHCP_SUBNET_ELEMENT_TYPE` = 3;
public const val `DhcpFailoverForce`: `DHCP_FORCE_FLAG` = 2;
public const val `DhcpFullForce`: `DHCP_FORCE_FLAG` = 0;
public const val `DhcpGlobalOptions`: `DHCP_OPTION_SCOPE_TYPE` = 1;
public const val `DhcpGlobalOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 3;
public const val `DhcpIpAddressOption`: `DHCP_OPTION_DATA_TYPE` = 4;
public const val `DhcpIpRanges`: `DHCP_SUBNET_ELEMENT_TYPE` = 0;
public const val `DhcpIpRangesBootpOnly`: `DHCP_SUBNET_ELEMENT_TYPE` = 7;
public const val `DhcpIpRangesDhcpBootp`: `DHCP_SUBNET_ELEMENT_TYPE` = 6;
public const val `DhcpIpRangesDhcpOnly`: `DHCP_SUBNET_ELEMENT_TYPE` = 5;
public const val `DhcpIpUsedClusters`: `DHCP_SUBNET_ELEMENT_TYPE` = 4;
public const val `DhcpIpv6AddressOption`: `DHCP_OPTION_DATA_TYPE` = 8;
public const val `DhcpLogicalAnd`: `DHCP_POL_LOGIC_OPER` = 1;
public const val `DhcpLogicalOr`: `DHCP_POL_LOGIC_OPER` = 0;
public const val `DhcpMScopeOptions`: `DHCP_OPTION_SCOPE_TYPE` = 4;
public const val `DhcpNoForce`: `DHCP_FORCE_FLAG` = 1;
public const val `DhcpPropIdClientAddressStateEx`: `DHCP_PROPERTY_ID` = 1;
public const val `DhcpPropIdPolicyDnsSuffix`: `DHCP_PROPERTY_ID` = 0;
public const val `DhcpPropTypeBinary`: `DHCP_PROPERTY_TYPE` = 4;
public const val `DhcpPropTypeByte`: `DHCP_PROPERTY_TYPE` = 0;
public const val `DhcpPropTypeDword`: `DHCP_PROPERTY_TYPE` = 2;
public const val `DhcpPropTypeString`: `DHCP_PROPERTY_TYPE` = 3;
public const val `DhcpPropTypeWord`: `DHCP_PROPERTY_TYPE` = 1;
public const val `DhcpRegistryFix`: `DHCP_SCAN_FLAG` = 0;
public const val `DhcpReservedIps`: `DHCP_SUBNET_ELEMENT_TYPE` = 2;
public const val `DhcpReservedOptions`: `DHCP_OPTION_SCOPE_TYPE` = 3;
public const val `DhcpReservedOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 2;
public const val `DhcpScopeOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 1;
public const val `DhcpSecondaryHosts`: `DHCP_SUBNET_ELEMENT_TYPE` = 1;
public const val `DhcpStatelessPurgeInterval`: `DHCPV6_STATELESS_PARAM_TYPE` = 1;
public const val `DhcpStatelessStatus`: `DHCPV6_STATELESS_PARAM_TYPE` = 2;
public const val `DhcpStringDataOption`: `DHCP_OPTION_DATA_TYPE` = 5;
public const val `DhcpSubnetDisabled`: `DHCP_SUBNET_STATE` = 1;
public const val `DhcpSubnetDisabledSwitched`: `DHCP_SUBNET_STATE` = 3;
public const val `DhcpSubnetEnabled`: `DHCP_SUBNET_STATE` = 0;
public const val `DhcpSubnetEnabledSwitched`: `DHCP_SUBNET_STATE` = 2;
public const val `DhcpSubnetInvalidState`: `DHCP_SUBNET_STATE` = 4;
public const val `DhcpSubnetOptions`: `DHCP_OPTION_SCOPE_TYPE` = 2;
public const val `DhcpUnaryElementTypeOption`: `DHCP_OPTION_TYPE` = 0;
public const val `DhcpUpdatePolicyDescr`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 16;
public const val `DhcpUpdatePolicyDnsSuffix`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 64;
public const val `DhcpUpdatePolicyExpr`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 4;
public const val `DhcpUpdatePolicyName`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 1;
public const val `DhcpUpdatePolicyOrder`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 2;
public const val `DhcpUpdatePolicyRanges`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 8;
public const val `DhcpUpdatePolicyStatus`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 32;
public const val `DhcpWordOption`: `DHCP_OPTION_DATA_TYPE` = 1;
public const val `Dhcpv6ClientDUID`: `DHCP_SEARCH_INFO_TYPE_V6` = 1;
public const val `Dhcpv6ClientIpAddress`: `DHCP_SEARCH_INFO_TYPE_V6` = 0;
public const val `Dhcpv6ClientName`: `DHCP_SEARCH_INFO_TYPE_V6` = 2;
public const val `Dhcpv6ExcludedIpRanges`: `DHCP_SUBNET_ELEMENT_TYPE_V6` = 2;
public const val `Dhcpv6IpRanges`: `DHCP_SUBNET_ELEMENT_TYPE_V6` = 0;
public const val `Dhcpv6ReservedIps`: `DHCP_SUBNET_ELEMENT_TYPE_V6` = 1;
public const val `ERROR_DDS_CLASS_DOES_NOT_EXIST`: UInt = 20078u;
public const val `ERROR_DDS_CLASS_EXISTS`: UInt = 20077u;
public const val `ERROR_DDS_DHCP_SERVER_NOT_FOUND`: UInt = 20074u;
public const val `ERROR_DDS_NO_DHCP_ROOT`: UInt = 20071u;
public const val `ERROR_DDS_NO_DS_AVAILABLE`: UInt = 20070u;
public const val `ERROR_DDS_OPTION_ALREADY_EXISTS`: UInt = 20075u;
public const val `ERROR_DDS_OPTION_DOES_NOT_EXIST`: UInt = 20076u;
public const val `ERROR_DDS_POSSIBLE_RANGE_CONFLICT`: UInt = 20087u;
public const val `ERROR_DDS_RANGE_DOES_NOT_EXIST`: UInt = 20088u;
public const val `ERROR_DDS_RESERVATION_CONFLICT`: UInt = 20086u;
public const val `ERROR_DDS_RESERVATION_NOT_PRESENT`: UInt = 20085u;
public const val `ERROR_DDS_SERVER_ADDRESS_MISMATCH`: UInt = 20081u;
public const val `ERROR_DDS_SERVER_ALREADY_EXISTS`: UInt = 20079u;
public const val `ERROR_DDS_SERVER_DOES_NOT_EXIST`: UInt = 20080u;
public const val `ERROR_DDS_SUBNET_EXISTS`: UInt = 20082u;
public const val `ERROR_DDS_SUBNET_HAS_DIFF_SSCOPE`: UInt = 20083u;
public const val `ERROR_DDS_SUBNET_NOT_PRESENT`: UInt = 20084u;
public const val `ERROR_DDS_TOO_MANY_ERRORS`: UInt = 20073u;
public const val `ERROR_DDS_UNEXPECTED_ERROR`: UInt = 20072u;
public const val `ERROR_DHCP_ADDRESS_NOT_AVAILABLE`: UInt = 20011u;
public const val `ERROR_DHCP_CANNOT_MODIFY_BINDINGS`: UInt = 20051u;
public const val `ERROR_DHCP_CANT_CHANGE_ATTRIBUTE`: UInt = 20048u;
public const val `ERROR_DHCP_CLASS_ALREADY_EXISTS`: UInt = 20045u;
public const val `ERROR_DHCP_CLASS_NOT_FOUND`: UInt = 20044u;
public const val `ERROR_DHCP_CLIENT_EXISTS`: UInt = 20014u;
public const val `ERROR_DHCP_DATABASE_INIT_FAILED`: UInt = 20001u;
public const val `ERROR_DHCP_DEFAULT_SCOPE_EXITS`: UInt = 20047u;
public const val `ERROR_DHCP_DELETE_BUILTIN_CLASS`: UInt = 20089u;
public const val `ERROR_DHCP_ELEMENT_CANT_REMOVE`: UInt = 20007u;
public const val `ERROR_DHCP_EXEMPTION_EXISTS`: UInt = 20055u;
public const val `ERROR_DHCP_EXEMPTION_NOT_PRESENT`: UInt = 20056u;
public const val `ERROR_DHCP_FO_ADDSCOPE_LEASES_NOT_SYNCED`: UInt = 20127u;
public const val `ERROR_DHCP_FO_BOOT_NOT_SUPPORTED`: UInt = 20131u;
public const val `ERROR_DHCP_FO_FEATURE_NOT_SUPPORTED`: UInt = 20134u;
public const val `ERROR_DHCP_FO_IPRANGE_TYPE_CONV_ILLEGAL`: UInt = 20129u;
public const val `ERROR_DHCP_FO_MAX_ADD_SCOPES`: UInt = 20130u;
public const val `ERROR_DHCP_FO_MAX_RELATIONSHIPS`: UInt = 20128u;
public const val `ERROR_DHCP_FO_NOT_SUPPORTED`: UInt = 20118u;
public const val `ERROR_DHCP_FO_RANGE_PART_OF_REL`: UInt = 20132u;
public const val `ERROR_DHCP_FO_RELATIONSHIP_DOES_NOT_EXIST`: UInt = 20115u;
public const val `ERROR_DHCP_FO_RELATIONSHIP_EXISTS`: UInt = 20114u;
public const val `ERROR_DHCP_FO_RELATIONSHIP_NAME_TOO_LONG`: UInt = 20125u;
public const val `ERROR_DHCP_FO_RELATION_IS_SECONDARY`: UInt = 20117u;
public const val `ERROR_DHCP_FO_SCOPE_ALREADY_IN_RELATIONSHIP`: UInt = 20113u;
public const val `ERROR_DHCP_FO_SCOPE_NOT_IN_RELATIONSHIP`: UInt = 20116u;
public const val `ERROR_DHCP_FO_SCOPE_SYNC_IN_PROGRESS`: UInt = 20133u;
public const val `ERROR_DHCP_FO_STATE_NOT_NORMAL`: UInt = 20120u;
public const val `ERROR_DHCP_FO_TIME_OUT_OF_SYNC`: UInt = 20119u;
public const val `ERROR_DHCP_HARDWARE_ADDRESS_TYPE_ALREADY_EXEMPT`: UInt = 20101u;
public const val `ERROR_DHCP_INVALID_DELAY`: UInt = 20092u;
public const val `ERROR_DHCP_INVALID_DHCP_CLIENT`: UInt = 20016u;
public const val `ERROR_DHCP_INVALID_DHCP_MESSAGE`: UInt = 20015u;
public const val `ERROR_DHCP_INVALID_PARAMETER_OPTION32`: UInt = 20057u;
public const val `ERROR_DHCP_INVALID_POLICY_EXPRESSION`: UInt = 20109u;
public const val `ERROR_DHCP_INVALID_PROCESSING_ORDER`: UInt = 20110u;
public const val `ERROR_DHCP_INVALID_RANGE`: UInt = 20023u;
public const val `ERROR_DHCP_INVALID_SUBNET_PREFIX`: UInt = 20091u;
public const val `ERROR_DHCP_IPRANGE_CONV_ILLEGAL`: UInt = 20049u;
public const val `ERROR_DHCP_IPRANGE_EXITS`: UInt = 20021u;
public const val `ERROR_DHCP_IP_ADDRESS_IN_USE`: UInt = 20032u;
public const val `ERROR_DHCP_JET97_CONV_REQUIRED`: UInt = 20036u;
public const val `ERROR_DHCP_JET_CONV_REQUIRED`: UInt = 20027u;
public const val `ERROR_DHCP_JET_ERROR`: UInt = 20013u;
public const val `ERROR_DHCP_LINKLAYER_ADDRESS_DOES_NOT_EXIST`: UInt = 20095u;
public const val `ERROR_DHCP_LINKLAYER_ADDRESS_EXISTS`: UInt = 20093u;
public const val `ERROR_DHCP_LINKLAYER_ADDRESS_RESERVATION_EXISTS`: UInt = 20094u;
public const val `ERROR_DHCP_LOG_FILE_PATH_TOO_LONG`: UInt = 20033u;
public const val `ERROR_DHCP_MSCOPE_EXISTS`: UInt = 20053u;
public const val `ERROR_DHCP_NAP_NOT_SUPPORTED`: UInt = 20138u;
public const val `ERROR_DHCP_NETWORK_CHANGED`: UInt = 20050u;
public const val `ERROR_DHCP_NETWORK_INIT_FAILED`: UInt = 20003u;
public const val `ERROR_DHCP_NOT_RESERVED_CLIENT`: UInt = 20018u;
public const val `ERROR_DHCP_NO_ADMIN_PERMISSION`: UInt = 20121u;
public const val `ERROR_DHCP_OPTION_EXITS`: UInt = 20009u;
public const val `ERROR_DHCP_OPTION_NOT_PRESENT`: UInt = 20010u;
public const val `ERROR_DHCP_OPTION_TYPE_MISMATCH`: UInt = 20103u;
public const val `ERROR_DHCP_POLICY_BAD_PARENT_EXPR`: UInt = 20104u;
public const val `ERROR_DHCP_POLICY_EDIT_FQDN_UNSUPPORTED`: UInt = 20137u;
public const val `ERROR_DHCP_POLICY_EXISTS`: UInt = 20105u;
public const val `ERROR_DHCP_POLICY_FQDN_OPTION_UNSUPPORTED`: UInt = 20136u;
public const val `ERROR_DHCP_POLICY_FQDN_RANGE_UNSUPPORTED`: UInt = 20135u;
public const val `ERROR_DHCP_POLICY_NOT_FOUND`: UInt = 20111u;
public const val `ERROR_DHCP_POLICY_RANGE_BAD`: UInt = 20107u;
public const val `ERROR_DHCP_POLICY_RANGE_EXISTS`: UInt = 20106u;
public const val `ERROR_DHCP_PRIMARY_NOT_FOUND`: UInt = 20006u;
public const val `ERROR_DHCP_RANGE_EXTENDED`: UInt = 20024u;
public const val `ERROR_DHCP_RANGE_FULL`: UInt = 20012u;
public const val `ERROR_DHCP_RANGE_INVALID_IN_SERVER_POLICY`: UInt = 20108u;
public const val `ERROR_DHCP_RANGE_TOO_SMALL`: UInt = 20020u;
public const val `ERROR_DHCP_REACHED_END_OF_SELECTION`: UInt = 20126u;
public const val `ERROR_DHCP_REGISTRY_INIT_FAILED`: UInt = 20000u;
public const val `ERROR_DHCP_RESERVEDIP_EXITS`: UInt = 20022u;
public const val `ERROR_DHCP_RESERVED_CLIENT`: UInt = 20019u;
public const val `ERROR_DHCP_ROGUE_DS_CONFLICT`: UInt = 20041u;
public const val `ERROR_DHCP_ROGUE_DS_UNREACHABLE`: UInt = 20040u;
public const val `ERROR_DHCP_ROGUE_INIT_FAILED`: UInt = 20037u;
public const val `ERROR_DHCP_ROGUE_NOT_AUTHORIZED`: UInt = 20039u;
public const val `ERROR_DHCP_ROGUE_NOT_OUR_ENTERPRISE`: UInt = 20042u;
public const val `ERROR_DHCP_ROGUE_SAMSHUTDOWN`: UInt = 20038u;
public const val `ERROR_DHCP_ROGUE_STANDALONE_IN_DS`: UInt = 20043u;
public const val `ERROR_DHCP_RPC_INIT_FAILED`: UInt = 20002u;
public const val `ERROR_DHCP_SCOPE_NAME_TOO_LONG`: UInt = 20046u;
public const val `ERROR_DHCP_SERVER_NAME_NOT_RESOLVED`: UInt = 20124u;
public const val `ERROR_DHCP_SERVER_NOT_REACHABLE`: UInt = 20122u;
public const val `ERROR_DHCP_SERVER_NOT_RUNNING`: UInt = 20123u;
public const val `ERROR_DHCP_SERVICE_PAUSED`: UInt = 20017u;
public const val `ERROR_DHCP_SUBNET_EXISTS`: UInt = 20052u;
public const val `ERROR_DHCP_SUBNET_EXITS`: UInt = 20004u;
public const val `ERROR_DHCP_SUBNET_NOT_PRESENT`: UInt = 20005u;
public const val `ERROR_DHCP_SUPER_SCOPE_NAME_TOO_LONG`: UInt = 20030u;
public const val `ERROR_DHCP_UNDEFINED_HARDWARE_ADDRESS_TYPE`: UInt = 20102u;
public const val `ERROR_DHCP_UNSUPPORTED_CLIENT`: UInt = 20034u;
public const val `ERROR_EXTEND_TOO_SMALL`: UInt = 20025u;
public const val `ERROR_LAST_DHCP_SERVER_ERROR`: UInt = 20139u;
public const val `ERROR_MSCOPE_RANGE_TOO_SMALL`: UInt = 20054u;
public const val `ERROR_SCOPE_RANGE_POLICY_RANGE_CONFLICT`: UInt = 20112u;
public const val `ERROR_SERVER_INVALID_BOOT_FILE_TABLE`: UInt = 20028u;
public const val `ERROR_SERVER_UNKNOWN_BOOT_FILE_NAME`: UInt = 20029u;
public const val `EXEMPT`: `QuarantineStatus` = 4;
public const val `FILTER_STATUS_FULL_MATCH_IN_ALLOW_LIST`: UInt = 2u;
public const val `FILTER_STATUS_FULL_MATCH_IN_DENY_LIST`: UInt = 4u;
public const val `FILTER_STATUS_NONE`: UInt = 1u;
public const val `FILTER_STATUS_WILDCARD_MATCH_IN_ALLOW_LIST`: UInt = 8u;
public const val `FILTER_STATUS_WILDCARD_MATCH_IN_DENY_LIST`: UInt = 16u;
public typealias `FSM_STATE` = Int;
public const val `HWTYPE_ETHERNET_10MB`: UInt = 1u;
public const val `HotStandby`: `DHCP_FAILOVER_MODE` = 1;
public const val `INIT`: `FSM_STATE` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_CONTROL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_DELETE_CLIENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_DROP_SEND` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_ENTRY_POINT_FUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_CALLOUT_TABLE`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_GIVE_ADDRESS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, UInt, UInt, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_HANDLE_OPTIONS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`DHCP_SERVER_OPTIONS`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_NEWPKT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDHCP_PROB` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public const val `LoadBalance`: `DHCP_FAILOVER_MODE` = 0;
public const val `MAC_ADDRESS_LENGTH`: UInt = 6u;
public const val `MAX_PATTERN_LENGTH`: UInt = 255u;
public const val `MCLT`: UInt = 1u;
public const val `MODE`: UInt = 16u;
public const val `NOQUARANTINE`: `QuarantineStatus` = 0;
public const val `NOQUARINFO`: `QuarantineStatus` = 6;
public const val `NORMAL`: `FSM_STATE` = 3;
public const val `NO_STATE`: `FSM_STATE` = 0;
public const val `OPTION_ALL_SUBNETS_MTU`: UInt = 27u;
public const val `OPTION_ARP_CACHE_TIMEOUT`: UInt = 35u;
public const val `OPTION_BE_A_MASK_SUPPLIER`: UInt = 30u;
public const val `OPTION_BE_A_ROUTER`: UInt = 19u;
public const val `OPTION_BOOTFILE_NAME`: UInt = 67u;
public const val `OPTION_BOOT_FILE_SIZE`: UInt = 13u;
public const val `OPTION_BROADCAST_ADDRESS`: UInt = 28u;
public const val `OPTION_CLIENT_CLASS_INFO`: UInt = 60u;
public const val `OPTION_CLIENT_ID`: UInt = 61u;
public const val `OPTION_COOKIE_SERVERS`: UInt = 8u;
public const val `OPTION_DEFAULT_TTL`: UInt = 23u;
public const val `OPTION_DOMAIN_NAME`: UInt = 15u;
public const val `OPTION_DOMAIN_NAME_SERVERS`: UInt = 6u;
public const val `OPTION_END`: UInt = 255u;
public const val `OPTION_ETHERNET_ENCAPSULATION`: UInt = 36u;
public const val `OPTION_EXTENSIONS_PATH`: UInt = 18u;
public const val `OPTION_HOST_NAME`: UInt = 12u;
public const val `OPTION_IEN116_NAME_SERVERS`: UInt = 5u;
public const val `OPTION_IMPRESS_SERVERS`: UInt = 10u;
public const val `OPTION_KEEP_ALIVE_DATA_SIZE`: UInt = 39u;
public const val `OPTION_KEEP_ALIVE_INTERVAL`: UInt = 38u;
public const val `OPTION_LEASE_TIME`: UInt = 51u;
public const val `OPTION_LOG_SERVERS`: UInt = 7u;
public const val `OPTION_LPR_SERVERS`: UInt = 9u;
public const val `OPTION_MAX_REASSEMBLY_SIZE`: UInt = 22u;
public const val `OPTION_MERIT_DUMP_FILE`: UInt = 14u;
public const val `OPTION_MESSAGE`: UInt = 56u;
public const val `OPTION_MESSAGE_LENGTH`: UInt = 57u;
public const val `OPTION_MESSAGE_TYPE`: UInt = 53u;
public const val `OPTION_MSFT_IE_PROXY`: UInt = 252u;
public const val `OPTION_MTU`: UInt = 26u;
public const val `OPTION_NETBIOS_DATAGRAM_SERVER`: UInt = 45u;
public const val `OPTION_NETBIOS_NAME_SERVER`: UInt = 44u;
public const val `OPTION_NETBIOS_NODE_TYPE`: UInt = 46u;
public const val `OPTION_NETBIOS_SCOPE_OPTION`: UInt = 47u;
public const val `OPTION_NETWORK_INFO_SERVERS`: UInt = 41u;
public const val `OPTION_NETWORK_INFO_SERVICE_DOM`: UInt = 40u;
public const val `OPTION_NETWORK_TIME_SERVERS`: UInt = 42u;
public const val `OPTION_NON_LOCAL_SOURCE_ROUTING`: UInt = 20u;
public const val `OPTION_OK_TO_OVERLAY`: UInt = 52u;
public const val `OPTION_PAD`: UInt = 0u;
public const val `OPTION_PARAMETER_REQUEST_LIST`: UInt = 55u;
public const val `OPTION_PERFORM_MASK_DISCOVERY`: UInt = 29u;
public const val `OPTION_PERFORM_ROUTER_DISCOVERY`: UInt = 31u;
public const val `OPTION_PMTU_AGING_TIMEOUT`: UInt = 24u;
public const val `OPTION_PMTU_PLATEAU_TABLE`: UInt = 25u;
public const val `OPTION_POLICY_FILTER_FOR_NLSR`: UInt = 21u;
public const val `OPTION_REBIND_TIME`: UInt = 59u;
public const val `OPTION_RENEWAL_TIME`: UInt = 58u;
public const val `OPTION_REQUESTED_ADDRESS`: UInt = 50u;
public const val `OPTION_RLP_SERVERS`: UInt = 11u;
public const val `OPTION_ROOT_DISK`: UInt = 17u;
public const val `OPTION_ROUTER_ADDRESS`: UInt = 3u;
public const val `OPTION_ROUTER_SOLICITATION_ADDR`: UInt = 32u;
public const val `OPTION_SERVER_IDENTIFIER`: UInt = 54u;
public const val `OPTION_STATIC_ROUTES`: UInt = 33u;
public const val `OPTION_SUBNET_MASK`: UInt = 1u;
public const val `OPTION_SWAP_SERVER`: UInt = 16u;
public const val `OPTION_TFTP_SERVER_NAME`: UInt = 66u;
public const val `OPTION_TIME_OFFSET`: UInt = 2u;
public const val `OPTION_TIME_SERVERS`: UInt = 4u;
public const val `OPTION_TRAILERS`: UInt = 34u;
public const val `OPTION_TTL`: UInt = 37u;
public const val `OPTION_VENDOR_SPEC_INFO`: UInt = 43u;
public const val `OPTION_XWINDOW_DISPLAY_MANAGER`: UInt = 49u;
public const val `OPTION_XWINDOW_FONT_SERVER`: UInt = 48u;
public const val `PARTNER_DOWN`: `FSM_STATE` = 5;
public const val `PAUSED`: `FSM_STATE` = 12;
public const val `PERCENTAGE`: UInt = 8u;
public const val `POTENTIAL_CONFLICT`: `FSM_STATE` = 6;
public const val `PREVSTATE`: UInt = 32u;
public const val `PROBATION`: `QuarantineStatus` = 3;
public const val `PrimaryServer`: `DHCP_FAILOVER_SERVER` = 0;
public const val `QUARANTINE_CONFIG_OPTION`: UInt = 43222u;
public const val `QUARANTINE_SCOPE_QUARPROFILE_OPTION`: UInt = 43221u;
public const val `QUARANTIN_OPTION_BASE`: UInt = 43220u;
public typealias `QuarantineStatus` = Int;
public const val `RECOVER`: `FSM_STATE` = 9;
public const val `RECOVER_DONE`: `FSM_STATE` = 11;
public const val `RECOVER_WAIT`: `FSM_STATE` = 10;
public const val `RESOLUTION_INT`: `FSM_STATE` = 8;
public const val `RESTRICTEDACCESS`: `QuarantineStatus` = 1;
public const val `SAFEPERIOD`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_MIB_INFO` (
    public var `Subnet`: UInt,
    public var `NumAddressesInuse`: UInt,
    public var `NumAddressesFree`: UInt,
    public var `NumPendingOffers`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_MIB_INFO_V5` (
    public var `Subnet`: UInt,
    public var `NumAddressesInuse`: UInt,
    public var `NumAddressesFree`: UInt,
    public var `NumPendingOffers`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_MIB_INFO_V6` (
    public var `Subnet`: `DHCP_IPV6_ADDRESS`,
    public var `NumAddressesInuse`: ULong,
    public var `NumAddressesFree`: ULong,
    public var `NumPendingAdvertises`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCOPE_MIB_INFO_VQ` (
    public var `Subnet`: UInt,
    public var `NumAddressesInuse`: UInt,
    public var `NumAddressesFree`: UInt,
    public var `NumPendingOffers`: UInt,
    public var `QtnNumLeases`: UInt,
    public var `QtnPctQtnLeases`: UInt,
    public var `QtnProbationLeases`: UInt,
    public var `QtnNonQtnLeases`: UInt,
    public var `QtnExemptLeases`: UInt,
    public var `QtnCapableClients`: UInt,
)
public const val `SHAREDSECRET`: UInt = 64u;
public const val `SHUTDOWN`: `FSM_STATE` = 13;
public const val `STARTUP`: `FSM_STATE` = 2;
public const val `STATUS_NOPREFIX_AVAIL`: `StatusCode` = 6;
public const val `STATUS_NO_BINDING`: `StatusCode` = 3;
public const val `STATUS_NO_ERROR`: `StatusCode` = 0;
public const val `STATUS_UNSPECIFIED_FAILURE`: `StatusCode` = 1;
public const val `SecondaryServer`: `DHCP_FAILOVER_SERVER` = 1;
public const val `Set_APIProtocolSupport`: UInt = 1u;
public const val `Set_AuditLogState`: UInt = 2048u;
public const val `Set_BackupInterval`: UInt = 16u;
public const val `Set_BackupPath`: UInt = 8u;
public const val `Set_BootFileTable`: UInt = 1024u;
public const val `Set_DatabaseCleanupInterval`: UInt = 128u;
public const val `Set_DatabaseLoggingFlag`: UInt = 32u;
public const val `Set_DatabaseName`: UInt = 2u;
public const val `Set_DatabasePath`: UInt = 4u;
public const val `Set_DebugFlag`: UInt = 256u;
public const val `Set_PingRetries`: UInt = 512u;
public const val `Set_PreferredLifetime`: UInt = 4u;
public const val `Set_PreferredLifetimeIATA`: UInt = 64u;
public const val `Set_QuarantineDefFail`: UInt = 8192u;
public const val `Set_QuarantineON`: UInt = 4096u;
public const val `Set_RapidCommitFlag`: UInt = 2u;
public const val `Set_RestoreFlag`: UInt = 64u;
public const val `Set_T1`: UInt = 16u;
public const val `Set_T2`: UInt = 32u;
public const val `Set_UnicastFlag`: UInt = 1u;
public const val `Set_ValidLifetime`: UInt = 8u;
public const val `Set_ValidLifetimeIATA`: UInt = 128u;
public typealias `StatusCode` = Int;
public const val `V5_ADDRESS_BIT_BOTH_REC`: UInt = 32u;
public const val `V5_ADDRESS_BIT_DELETED`: UInt = 128u;
public const val `V5_ADDRESS_BIT_UNREGISTERED`: UInt = 64u;
public const val `V5_ADDRESS_EX_BIT_DISABLE_PTR_RR`: UInt = 1u;
public const val `V5_ADDRESS_STATE_ACTIVE`: UInt = 1u;
public const val `V5_ADDRESS_STATE_DECLINED`: UInt = 2u;
public const val `V5_ADDRESS_STATE_DOOM`: UInt = 3u;
public const val `V5_ADDRESS_STATE_OFFERED`: UInt = 0u;
public const val `WARNING_EXTENDED_LESS`: Int = 20026;
