// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=AddIPAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddIPAddress`(`address` : UInt, `ipmask` : UInt, `ifindex` : UInt, `ntecontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nteinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CancelIPChangeNotify; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CancelIPChangeNotify`(`notifyoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CancelIfTimestampConfigChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelIfTimestampConfigChange`(`notificationhandle` : `HIFTIMESTAMPCHANGE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CancelMibChangeNotify2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelMibChangeNotify2`(`notificationhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CaptureInterfaceHardwareCrossTimestamp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `CaptureInterfaceHardwareCrossTimestamp`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `crosstimestamp` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERFACE_HARDWARE_CROSSTIMESTAMP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertCompartmentGuidToId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertCompartmentGuidToId`(`compartmentguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `compartmentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertCompartmentIdToGuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertCompartmentIdToGuid`(`compartmentid` : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`, `compartmentguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceAliasToLuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceAliasToLuid`(`interfacealias` : `windows_sys`.`core`.`PCWSTR`, `interfaceluid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceGuidToLuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceGuidToLuid`(`interfaceguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `interfaceluid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceIndexToLuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceIndexToLuid`(`interfaceindex` : UInt, `interfaceluid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceLuidToAlias; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceLuidToAlias`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `interfacealias` : `windows_sys`.`core`.`PWSTR`, `length` : ULong) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceLuidToGuid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceLuidToGuid`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `interfaceguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceLuidToIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceLuidToIndex`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `interfaceindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceLuidToNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceLuidToNameA`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `interfacename` : `windows_sys`.`core`.`PSTR`, `length` : ULong) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceLuidToNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceLuidToNameW`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `interfacename` : `windows_sys`.`core`.`PWSTR`, `length` : ULong) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceNameToLuidA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceNameToLuidA`(`interfacename` : `windows_sys`.`core`.`PCSTR`, `interfaceluid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertInterfaceNameToLuidW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `ConvertInterfaceNameToLuidW`(`interfacename` : `windows_sys`.`core`.`PCWSTR`, `interfaceluid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertIpv4MaskToLength; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertIpv4MaskToLength`(`mask` : UInt, `masklength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ConvertLengthToIpv4Mask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertLengthToIpv4Mask`(`masklength` : UInt, `mask` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateAnycastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `CreateAnycastIpAddressEntry`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_ANYCASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateIpForwardEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `CreateIpForwardEntry`(`proute` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARDROW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateIpForwardEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `CreateIpForwardEntry2`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateIpNetEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIpNetEntry`(`parpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPNETROW_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateIpNetEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `CreateIpNetEntry2`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPNET_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreatePersistentTcpPortReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePersistentTcpPortReservation`(`startport` : UShort, `numberofports` : UShort, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreatePersistentUdpPortReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePersistentUdpPortReservation`(`startport` : UShort, `numberofports` : UShort, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateProxyArpEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateProxyArpEntry`(`dwaddress` : UInt, `dwmask` : UInt, `dwifindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateSortedAddressPairs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `CreateSortedAddressPairs`(`sourceaddresslist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_IN6`>?, `sourceaddresscount` : UInt, `destinationaddresslist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_IN6`>?, `destinationaddresscount` : UInt, `addresssortoptions` : UInt, `sortedaddresspairlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_IN6_PAIR`>>?, `sortedaddresspaircount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=CreateUnicastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `CreateUnicastIpAddressEntry`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteAnycastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `DeleteAnycastIpAddressEntry`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_ANYCASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteIPAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteIPAddress`(`ntecontext` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteIpForwardEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `DeleteIpForwardEntry`(`proute` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARDROW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteIpForwardEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `DeleteIpForwardEntry2`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteIpNetEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteIpNetEntry`(`parpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPNETROW_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteIpNetEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `DeleteIpNetEntry2`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPNET_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeletePersistentTcpPortReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePersistentTcpPortReservation`(`startport` : UShort, `numberofports` : UShort) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeletePersistentUdpPortReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePersistentUdpPortReservation`(`startport` : UShort, `numberofports` : UShort) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteProxyArpEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteProxyArpEntry`(`dwaddress` : UInt, `dwmask` : UInt, `dwifindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DeleteUnicastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `DeleteUnicastIpAddressEntry`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=DisableMediaSense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `DisableMediaSense`(`phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=EnableRouter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `EnableRouter`(`phandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=FlushIpNetTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushIpNetTable`(`dwifindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=FlushIpNetTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `FlushIpNetTable2`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `interfaceindex` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=FlushIpPathTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `FlushIpPathTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=FreeDnsSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeDnsSettings`(`settings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_SETTINGS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=FreeInterfaceDnsSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeInterfaceDnsSettings`(`settings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_INTERFACE_SETTINGS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=FreeMibTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeMibTable`(`memory` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetAdapterIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAdapterIndex`(`adaptername` : `windows_sys`.`core`.`PCWSTR`, `ifindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetAdapterOrderMap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAdapterOrderMap`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ORDER_MAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetAdaptersAddresses; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetAdaptersAddresses`(`family` : UInt, `flags` : `GET_ADAPTERS_ADDRESSES_FLAGS`, `reserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `adapteraddresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ADDRESSES_LH`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetAdaptersInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAdaptersInfo`(`adapterinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_INFO`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetAnycastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetAnycastIpAddressEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_ANYCASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetAnycastIpAddressTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetAnycastIpAddressTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_ANYCASTIPADDRESS_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetBestInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBestInterface`(`dwdestaddr` : UInt, `pdwbestifindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetBestInterfaceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetBestInterfaceEx`(`pdestaddr` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>?, `pdwbestifindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetBestRoute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetBestRoute`(`dwdestaddr` : UInt, `dwsourceaddr` : UInt, `pbestroute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPFORWARDROW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetBestRoute2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetBestRoute2`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `interfaceindex` : UInt, `sourceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`>?, `destinationaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`>?, `addresssortoptions` : UInt, `bestroute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?, `bestsourceaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetCurrentThreadCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetCurrentThreadCompartmentId`() : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetCurrentThreadCompartmentScope; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentThreadCompartmentScope`(`compartmentscope` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `compartmentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetDefaultCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetDefaultCompartmentId`() : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetDnsSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDnsSettings`(`settings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_SETTINGS`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetExtendedTcpTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExtendedTcpTable`(`ptcptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `border` : `windows_sys`.`core`.`BOOL`, `ulaf` : UInt, `tableclass` : `TCP_TABLE_CLASS`, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetExtendedUdpTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExtendedUdpTable`(`pudptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `border` : `windows_sys`.`core`.`BOOL`, `ulaf` : UInt, `tableclass` : `UDP_TABLE_CLASS`, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetFriendlyIfIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFriendlyIfIndex`(`ifindex` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIcmpStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIcmpStatistics`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_ICMP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIcmpStatisticsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIcmpStatisticsEx`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_ICMP_EX_XPSP1`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIfEntry`(`pifrow` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IFROW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetIfEntry2`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IF_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfEntry2Ex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetIfEntry2Ex`(`level` : `MIB_IF_ENTRY_LEVEL`, `row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IF_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfStackTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIfStackTable`(`table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IFSTACK_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIfTable`(`piftable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IFTABLE`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `border` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetIfTable2`(`table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IF_TABLE2`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIfTable2Ex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetIfTable2Ex`(`level` : `MIB_IF_TABLE_LEVEL`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IF_TABLE2`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInterfaceActiveTimestampCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetInterfaceActiveTimestampCapabilities`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `timestampcapabilites` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERFACE_TIMESTAMP_CAPABILITIES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInterfaceCurrentTimestampCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetInterfaceCurrentTimestampCapabilities`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `timestampcapabilites` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERFACE_TIMESTAMP_CAPABILITIES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInterfaceDnsSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInterfaceDnsSettings`(`interface` : `windows_sys`.`core`.`GUID`, `settings` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_INTERFACE_SETTINGS`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInterfaceHardwareTimestampCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetInterfaceHardwareTimestampCapabilities`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `timestampcapabilites` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERFACE_TIMESTAMP_CAPABILITIES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInterfaceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInterfaceInfo`(`piftable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_INTERFACE_INFO`>?, `dwoutbuflen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInterfaceSupportedTimestampCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetInterfaceSupportedTimestampCapabilities`(`interfaceluid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Ndis`.`NET_LUID_LH`>?, `timestampcapabilites` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERFACE_TIMESTAMP_CAPABILITIES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetInvertedIfStackTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInvertedIfStackTable`(`table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_INVERTEDIFSTACK_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpAddrTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIpAddrTable`(`pipaddrtable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPADDRTABLE`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `border` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpErrorString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIpErrorString`(`errorcode` : UInt, `buffer` : `windows_sys`.`core`.`PWSTR`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpForwardEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpForwardEntry2`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpForwardTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetIpForwardTable`(`pipforwardtable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPFORWARDTABLE`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `border` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpForwardTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpForwardTable2`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IPFORWARD_TABLE2`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpInterfaceEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpInterfaceEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPINTERFACE_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpInterfaceTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpInterfaceTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IPINTERFACE_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpNetEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpNetEntry2`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPNET_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpNetTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIpNetTable`(`ipnettable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPNETTABLE`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpNetTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpNetTable2`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IPNET_TABLE2`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpNetworkConnectionBandwidthEstimates; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetIpNetworkConnectionBandwidthEstimates`(`interfaceindex` : UInt, `addressfamily` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `bandwidthestimates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IP_NETWORK_CONNECTION_BANDWIDTH_ESTIMATES`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpPathEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpPathEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPPATH_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpPathTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetIpPathTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_IPPATH_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIpStatistics`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPSTATS_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetIpStatisticsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIpStatisticsEx`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPSTATS_LH`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetJobCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetJobCompartmentId`(`jobhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetMulticastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetMulticastIpAddressEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_MULTICASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetMulticastIpAddressTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetMulticastIpAddressTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_MULTICASTIPADDRESS_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetNetworkConnectivityHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetNetworkConnectivityHint`(`connectivityhint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`NL_NETWORK_CONNECTIVITY_HINT`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetNetworkConnectivityHintForInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetNetworkConnectivityHintForInterface`(`interfaceindex` : UInt, `connectivityhint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`NL_NETWORK_CONNECTIVITY_HINT`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetNetworkInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNetworkInformation`(`networkguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `compartmentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `siteid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `networkname` : `windows_sys`.`core`.`PWSTR`, `length` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetNetworkParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNetworkParams`(`pfixedinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FIXED_INFO_W2KSP1`>?, `poutbuflen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetNumberOfInterfaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNumberOfInterfaces`(`pdwnumif` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetOwnerModuleFromPidAndInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOwnerModuleFromPidAndInfo`(`ulpid` : UInt, `pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `class` : `TCPIP_OWNER_MODULE_INFO_CLASS`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetOwnerModuleFromTcp6Entry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOwnerModuleFromTcp6Entry`(`ptcpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCP6ROW_OWNER_MODULE`>?, `class` : `TCPIP_OWNER_MODULE_INFO_CLASS`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetOwnerModuleFromTcpEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOwnerModuleFromTcpEntry`(`ptcpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCPROW_OWNER_MODULE`>?, `class` : `TCPIP_OWNER_MODULE_INFO_CLASS`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetOwnerModuleFromUdp6Entry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOwnerModuleFromUdp6Entry`(`pudpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UDP6ROW_OWNER_MODULE`>?, `class` : `TCPIP_OWNER_MODULE_INFO_CLASS`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetOwnerModuleFromUdpEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOwnerModuleFromUdpEntry`(`pudpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UDPROW_OWNER_MODULE`>?, `class` : `TCPIP_OWNER_MODULE_INFO_CLASS`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetPerAdapterInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPerAdapterInfo`(`ifindex` : UInt, `pperadapterinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_PER_ADAPTER_INFO_W2KSP1`>?, `poutbuflen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetPerTcp6ConnectionEStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetPerTcp6ConnectionEStats`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCP6ROW`>?, `estatstype` : `TCP_ESTATS_TYPE`, `rw` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rwversion` : UInt, `rwsize` : UInt, `ros` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rosversion` : UInt, `rossize` : UInt, `rod` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rodversion` : UInt, `rodsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetPerTcpConnectionEStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPerTcpConnectionEStats`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCPROW_LH`>?, `estatstype` : `TCP_ESTATS_TYPE`, `rw` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rwversion` : UInt, `rwsize` : UInt, `ros` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rosversion` : UInt, `rossize` : UInt, `rod` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rodversion` : UInt, `rodsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetRTTAndHopCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRTTAndHopCount`(`destipaddress` : UInt, `hopcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `maxhops` : UInt, `rtt` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetSessionCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `GetSessionCompartmentId`(`sessionid` : UInt) : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcp6Table; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetTcp6Table`(`tcptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCP6TABLE`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcp6Table2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetTcp6Table2`(`tcptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCP6TABLE2`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcpStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTcpStatistics`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCPSTATS_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcpStatisticsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTcpStatisticsEx`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCPSTATS_LH`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcpStatisticsEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTcpStatisticsEx2`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCPSTATS2`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcpTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTcpTable`(`tcptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCPTABLE`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTcpTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTcpTable2`(`tcptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_TCPTABLE2`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetTeredoPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTeredoPort`(`port` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUdp6Table; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `GetUdp6Table`(`udp6table` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UDP6TABLE`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUdpStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUdpStatistics`(`stats` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UDPSTATS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUdpStatisticsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUdpStatisticsEx`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UDPSTATS`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUdpStatisticsEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUdpStatisticsEx2`(`statistics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UDPSTATS2`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUdpTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUdpTable`(`udptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UDPTABLE`>?, `sizepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `order` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUniDirectionalAdapterInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUniDirectionalAdapterInfo`(`pipifinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_UNIDIRECTIONAL_ADAPTER_ADDRESS`>?, `dwoutbuflen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUnicastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetUnicastIpAddressEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=GetUnicastIpAddressTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `GetUnicastIpAddressTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_UNICASTIPADDRESS_TABLE`>>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=Icmp6CreateFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Icmp6CreateFile`() : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=Icmp6ParseReplies; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Icmp6ParseReplies`(`replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replysize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=Icmp6SendEcho2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_IO"))]
public external fun `Icmp6SendEcho2`(`icmphandle` : `super`.`super`.`Foundation`.`HANDLE`, `event` : `super`.`super`.`Foundation`.`HANDLE`, `apcroutine` : `super`.`super`.`System`.`IO`.`PIO_APC_ROUTINE`, `apccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sourceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_IN6`>?, `destinationaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_IN6`>?, `requestdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestsize` : UShort, `requestoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`IP_OPTION_INFORMATION`>?, `replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replysize` : UInt, `timeout` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IcmpCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IcmpCloseHandle`(`icmphandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IcmpCreateFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IcmpCreateFile`() : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IcmpParseReplies; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IcmpParseReplies`(`replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replysize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IcmpSendEcho; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IcmpSendEcho`(`icmphandle` : `super`.`super`.`Foundation`.`HANDLE`, `destinationaddress` : UInt, `requestdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestsize` : UShort, `requestoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`IP_OPTION_INFORMATION`>?, `replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replysize` : UInt, `timeout` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IcmpSendEcho2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `IcmpSendEcho2`(`icmphandle` : `super`.`super`.`Foundation`.`HANDLE`, `event` : `super`.`super`.`Foundation`.`HANDLE`, `apcroutine` : `super`.`super`.`System`.`IO`.`PIO_APC_ROUTINE`, `apccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `destinationaddress` : UInt, `requestdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestsize` : UShort, `requestoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`IP_OPTION_INFORMATION`>?, `replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replysize` : UInt, `timeout` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IcmpSendEcho2Ex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `IcmpSendEcho2Ex`(`icmphandle` : `super`.`super`.`Foundation`.`HANDLE`, `event` : `super`.`super`.`Foundation`.`HANDLE`, `apcroutine` : `super`.`super`.`System`.`IO`.`PIO_APC_ROUTINE`, `apccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sourceaddress` : UInt, `destinationaddress` : UInt, `requestdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestsize` : UShort, `requestoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`IP_OPTION_INFORMATION`>?, `replybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `replysize` : UInt, `timeout` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=InitializeIpForwardEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `InitializeIpForwardEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=InitializeIpInterfaceEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `InitializeIpInterfaceEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPINTERFACE_ROW`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=InitializeUnicastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `InitializeUnicastIpAddressEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_ROW`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IpReleaseAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IpReleaseAddress`(`adapterinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`IP_ADAPTER_INDEX_MAP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=IpRenewAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IpRenewAddress`(`adapterinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`IP_ADAPTER_INDEX_MAP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=LookupPersistentTcpPortReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LookupPersistentTcpPortReservation`(`startport` : UShort, `numberofports` : UShort, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=LookupPersistentUdpPortReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LookupPersistentUdpPortReservation`(`startport` : UShort, `numberofports` : UShort, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NhpAllocateAndGetInterfaceInfoFromStack; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NhpAllocateAndGetInterfaceInfoFromStack`(`pptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IP_INTERFACE_NAME_INFO_W2KSP1`>>?, `pdwcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `border` : `windows_sys`.`core`.`BOOL`, `hheap` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyAddrChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `NotifyAddrChange`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyIfTimestampConfigChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyIfTimestampConfigChange`(`callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK`, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIFTIMESTAMPCHANGE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyIpInterfaceChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `NotifyIpInterfaceChange`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `callback` : `PIPINTERFACE_CHANGE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialnotification` : Boolean, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyNetworkConnectivityHintChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `NotifyNetworkConnectivityHintChange`(`callback` : `PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialnotification` : Boolean, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyRouteChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `NotifyRouteChange`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `overlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyRouteChange2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `NotifyRouteChange2`(`addressfamily` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `callback` : `PIPFORWARD_CHANGE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialnotification` : Boolean, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyStableUnicastIpAddressTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `NotifyStableUnicastIpAddressTable`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `table` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MIB_UNICASTIPADDRESS_TABLE`>>?, `callercallback` : `PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyTeredoPortChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyTeredoPortChange`(`callback` : `PTEREDO_PORT_CHANGE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialnotification` : Boolean, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=NotifyUnicastIpAddressChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `NotifyUnicastIpAddressChange`(`family` : `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`, `callback` : `PUNICAST_IPADDRESS_CHANGE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `initialnotification` : Boolean, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ParseNetworkString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `ParseNetworkString`(`networkstring` : `windows_sys`.`core`.`PCWSTR`, `types` : UInt, `addressinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NET_ADDRESS_INFO`>?, `portnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `prefixlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfAddFiltersToInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfAddFiltersToInterface`(`ih` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cinfilters` : UInt, `pfiltin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PF_FILTER_DESCRIPTOR`>?, `coutfilters` : UInt, `pfiltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PF_FILTER_DESCRIPTOR`>?, `pfhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfAddGlobalFilterToInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfAddGlobalFilterToInterface`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `gffilter` : `GLOBAL_FILTER`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfBindInterfaceToIPAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfBindInterfaceToIPAddress`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pfattype` : `PFADDRESSTYPE`, `ipaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfBindInterfaceToIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfBindInterfaceToIndex`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwindex` : UInt, `pfatlinktype` : `PFADDRESSTYPE`, `linkipaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfCreateInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfCreateInterface`(`dwname` : UInt, `inaction` : `PFFORWARD_ACTION`, `outaction` : `PFFORWARD_ACTION`, `buselog` : `windows_sys`.`core`.`BOOL`, `bmustbeunique` : `windows_sys`.`core`.`BOOL`, `ppinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfDeleteInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfDeleteInterface`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfDeleteLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfDeleteLog`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfGetInterfaceStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfGetInterfaceStatistics`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppfstats` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PF_INTERFACE_STATS`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `fresetcounters` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfMakeLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfMakeLog`(`hevent` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfRebindFilters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfRebindFilters`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `platebindinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PF_LATEBIND_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfRemoveFilterHandles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfRemoveFilterHandles`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cfilters` : UInt, `pvhandles` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfRemoveFiltersFromInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfRemoveFiltersFromInterface`(`ih` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cinfilters` : UInt, `pfiltin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PF_FILTER_DESCRIPTOR`>?, `coutfilters` : UInt, `pfiltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PF_FILTER_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfRemoveGlobalFilterFromInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfRemoveGlobalFilterFromInterface`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `gffilter` : `GLOBAL_FILTER`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfSetLogBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfSetLogBuffer`(`pbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwsize` : UInt, `dwthreshold` : UInt, `dwentries` : UInt, `pdwloggedentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwlostentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwsizeused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfTestPacket; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfTestPacket`(`pininterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `poutinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbytes` : UInt, `pbpacket` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ppaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PFFORWARD_ACTION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=PfUnBindInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PfUnBindInterface`(`pinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=RegisterInterfaceTimestampConfigChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterInterfaceTimestampConfigChange`(`callback` : `PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK`, `callercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `notificationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIFTIMESTAMPCHANGE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ResolveIpNetEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `ResolveIpNetEntry2`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPNET_ROW2`>?, `sourceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=ResolveNeighbor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `ResolveNeighbor`(`networkaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKADDR`>?, `physicaladdress` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaladdresslength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=RestoreMediaSense; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `RestoreMediaSense`(`poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpdwenablecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SendARP; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendARP`(`destip` : UInt, `srcip` : UInt, `pmacaddr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phyaddrlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetCurrentThreadCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `SetCurrentThreadCompartmentId`(`compartmentid` : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetCurrentThreadCompartmentScope; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCurrentThreadCompartmentScope`(`compartmentscope` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetDnsSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDnsSettings`(`settings` : /* Rust *const */ kotlinx.cinterop.CPointer<`DNS_SETTINGS`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIfEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIfEntry`(`pifrow` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IFROW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetInterfaceDnsSettings; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetInterfaceDnsSettings`(`interface` : `windows_sys`.`core`.`GUID`, `settings` : /* Rust *const */ kotlinx.cinterop.CPointer<`DNS_INTERFACE_SETTINGS`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpForwardEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `SetIpForwardEntry`(`proute` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARDROW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpForwardEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `SetIpForwardEntry2`(`route` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpInterfaceEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `SetIpInterfaceEntry`(`row` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPINTERFACE_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpNetEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIpNetEntry`(`parpentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPNETROW_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpNetEntry2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `SetIpNetEntry2`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPNET_ROW2`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIpStatistics`(`pipstats` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPSTATS_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpStatisticsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIpStatisticsEx`(`statistics` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPSTATS_LH`>?, `family` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetIpTTL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIpTTL`(`nttl` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetJobCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `SetJobCompartmentId`(`jobhandle` : `super`.`super`.`Foundation`.`HANDLE`, `compartmentid` : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetNetworkInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `SetNetworkInformation`(`networkguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `compartmentid` : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`, `networkname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetPerTcp6ConnectionEStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `SetPerTcp6ConnectionEStats`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCP6ROW`>?, `estatstype` : `TCP_ESTATS_TYPE`, `rw` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rwversion` : UInt, `rwsize` : UInt, `offset` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetPerTcpConnectionEStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPerTcpConnectionEStats`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCPROW_LH`>?, `estatstype` : `TCP_ESTATS_TYPE`, `rw` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rwversion` : UInt, `rwsize` : UInt, `offset` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetSessionCompartmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
public external fun `SetSessionCompartmentId`(`sessionid` : UInt, `compartmentid` : `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetTcpEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTcpEntry`(`ptcprow` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_TCPROW_LH`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=SetUnicastIpAddressEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public external fun `SetUnicastIpAddressEntry`(`row` : /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_ROW`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=UnenableRouter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `UnenableRouter`(`poverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpdwenablecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=UnregisterInterfaceTimestampConfigChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterInterfaceTimestampConfigChange`(`notificationhandle` : `HIFTIMESTAMPCHANGE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=if_indextoname; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `if_indextoname`(`interfaceindex` : UInt, `interfacename` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=iphlpapi.dll, ABI=system, export=if_nametoindex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `if_nametoindex`(`interfacename` : `windows_sys`.`core`.`PCSTR`) : UInt
public const val `ANY_SIZE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ARP_SEND_REPLY` (
    public var `DestAddress`: UInt,
    public var `SrcAddress`: UInt,
)
public const val `BEST_IF`: UInt = 20u;
public const val `BEST_ROUTE`: UInt = 21u;
public const val `BROADCAST_NODETYPE`: UInt = 1u;
public const val `DEFAULT_MINIMUM_ENTITIES`: UInt = 32u;
public const val `DEST_LONGER`: UInt = 29u;
public const val `DEST_MATCHING`: UInt = 28u;
public const val `DEST_SHORTER`: UInt = 30u;
public const val `DNS_DDR_ADAPTER_ENABLE_DOH`: UInt = 1u;
public const val `DNS_DDR_ADAPTER_ENABLE_UDP_FALLBACK`: UInt = 2u;
public const val `DNS_DOH_AUTO_UPGRADE_SERVER`: UInt = 8u;
public const val `DNS_DOH_POLICY_AUTO`: UInt = 16u;
public const val `DNS_DOH_POLICY_DISABLE`: UInt = 8u;
public const val `DNS_DOH_POLICY_NOT_CONFIGURED`: UInt = 4u;
public const val `DNS_DOH_POLICY_REQUIRED`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_DOH_SERVER_SETTINGS` (
    public var `Template`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: ULong,
)
// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_DOH_SERVER_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_DOH_SERVER_SETTINGS_ENABLE`: UInt = 2u;
public const val `DNS_DOH_SERVER_SETTINGS_ENABLE_AUTO`: UInt = 1u;
public const val `DNS_DOH_SERVER_SETTINGS_ENABLE_DDR`: UInt = 16u;
public const val `DNS_DOH_SERVER_SETTINGS_FALLBACK_TO_UDP`: UInt = 4u;
public const val `DNS_ENABLE_DDR`: UInt = 64u;
public const val `DNS_ENABLE_DOH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_INTERFACE_SETTINGS` (
    public var `Version`: UInt,
    public var `Flags`: ULong,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `NameServer`: `windows_sys`.`core`.`PWSTR`,
    public var `SearchList`: `windows_sys`.`core`.`PWSTR`,
    public var `RegistrationEnabled`: UInt,
    public var `RegisterAdapterName`: UInt,
    public var `EnableLLMNR`: UInt,
    public var `QueryAdapterName`: UInt,
    public var `ProfileNameServer`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_INTERFACE_SETTINGS {
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
public class `DNS_INTERFACE_SETTINGS3` (
    public var `Version`: UInt,
    public var `Flags`: ULong,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `NameServer`: `windows_sys`.`core`.`PWSTR`,
    public var `SearchList`: `windows_sys`.`core`.`PWSTR`,
    public var `RegistrationEnabled`: UInt,
    public var `RegisterAdapterName`: UInt,
    public var `EnableLLMNR`: UInt,
    public var `QueryAdapterName`: UInt,
    public var `ProfileNameServer`: `windows_sys`.`core`.`PWSTR`,
    public var `DisableUnconstrainedQueries`: UInt,
    public var `SupplementalSearchList`: `windows_sys`.`core`.`PWSTR`,
    public var `cServerProperties`: UInt,
    public var `ServerProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_SERVER_PROPERTY`>?,
    public var `cProfileServerProperties`: UInt,
    public var `ProfileServerProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_SERVER_PROPERTY`>?,
)
// UNSUPPORTED Rust 373:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_INTERFACE_SETTINGS3 {
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
public class `DNS_INTERFACE_SETTINGS4` (
    public var `Version`: UInt,
    public var `Flags`: ULong,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `NameServer`: `windows_sys`.`core`.`PWSTR`,
    public var `SearchList`: `windows_sys`.`core`.`PWSTR`,
    public var `RegistrationEnabled`: UInt,
    public var `RegisterAdapterName`: UInt,
    public var `EnableLLMNR`: UInt,
    public var `QueryAdapterName`: UInt,
    public var `ProfileNameServer`: `windows_sys`.`core`.`PWSTR`,
    public var `DisableUnconstrainedQueries`: UInt,
    public var `SupplementalSearchList`: `windows_sys`.`core`.`PWSTR`,
    public var `cServerProperties`: UInt,
    public var `ServerProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_SERVER_PROPERTY`>?,
    public var `cProfileServerProperties`: UInt,
    public var `ProfileServerProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DNS_SERVER_PROPERTY`>?,
    public var `EncryptedDnsAdapterFlags`: UInt,
)
// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_INTERFACE_SETTINGS4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_INTERFACE_SETTINGS_EX` (
    public var `SettingsV1`: `DNS_INTERFACE_SETTINGS`,
    public var `DisableUnconstrainedQueries`: UInt,
    public var `SupplementalSearchList`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 411:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_INTERFACE_SETTINGS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_INTERFACE_SETTINGS_VERSION1`: UInt = 1u;
public const val `DNS_INTERFACE_SETTINGS_VERSION2`: UInt = 2u;
public const val `DNS_INTERFACE_SETTINGS_VERSION3`: UInt = 3u;
public const val `DNS_INTERFACE_SETTINGS_VERSION4`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_SERVER_PROPERTY` (
    public var `Version`: UInt,
    public var `ServerIndex`: UInt,
    public var `Type`: `DNS_SERVER_PROPERTY_TYPE`,
    public var `Property`: `DNS_SERVER_PROPERTY_TYPES`,
)
// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_SERVER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_SERVER_PROPERTY_TYPE` = Int;
// UNSUPPORTED Rust 434:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_SERVER_PROPERTY_TYPES {
//     pub DohSettings: *mut DNS_DOH_SERVER_SETTINGS,
// }

// UNSUPPORTED Rust 439:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_SERVER_PROPERTY_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_SERVER_PROPERTY_VERSION1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_SETTINGS` (
    public var `Version`: UInt,
    public var `Flags`: ULong,
    public var `Hostname`: `windows_sys`.`core`.`PWSTR`,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `SearchList`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_SETTINGS2` (
    public var `Version`: UInt,
    public var `Flags`: ULong,
    public var `Hostname`: `windows_sys`.`core`.`PWSTR`,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `SearchList`: `windows_sys`.`core`.`PWSTR`,
    public var `SettingFlags`: ULong,
)
// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DNS_SETTINGS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_SETTINGS_ENABLE_LLMNR`: UInt = 128u;
public const val `DNS_SETTINGS_QUERY_ADAPTER_NAME`: UInt = 256u;
public const val `DNS_SETTINGS_VERSION1`: UInt = 1u;
public const val `DNS_SETTINGS_VERSION2`: UInt = 2u;
public const val `DNS_SETTING_DDR`: UInt = 32768u;
public const val `DNS_SETTING_DISABLE_UNCONSTRAINED_QUERIES`: UInt = 1024u;
public const val `DNS_SETTING_DOH`: UInt = 4096u;
public const val `DNS_SETTING_DOH_PROFILE`: UInt = 8192u;
public const val `DNS_SETTING_DOMAIN`: UInt = 32u;
public const val `DNS_SETTING_ENCRYPTED_DNS_ADAPTER_FLAGS`: UInt = 16384u;
public const val `DNS_SETTING_HOSTNAME`: UInt = 64u;
public const val `DNS_SETTING_IPV6`: UInt = 1u;
public const val `DNS_SETTING_NAMESERVER`: UInt = 2u;
public const val `DNS_SETTING_PROFILE_NAMESERVER`: UInt = 512u;
public const val `DNS_SETTING_REGISTER_ADAPTER_NAME`: UInt = 16u;
public const val `DNS_SETTING_REGISTRATION_ENABLED`: UInt = 8u;
public const val `DNS_SETTING_SEARCHLIST`: UInt = 4u;
public const val `DNS_SETTING_SUPPLEMENTAL_SEARCH_LIST`: UInt = 2048u;
public const val `DnsServerDohProperty`: `DNS_SERVER_PROPERTY_TYPE` = 1;
public const val `DnsServerInvalidProperty`: `DNS_SERVER_PROPERTY_TYPE` = 0;
public const val `ERROR_BASE`: UInt = 23000u;
public const val `ERROR_IPV6_NOT_IMPLEMENTED`: UInt = 23003u;
public const val `FD_FLAGS_ALLFLAGS`: UInt = 1u;
public const val `FD_FLAGS_NOSYN`: UInt = 1u;
public const val `FILTER_ICMP_CODE_ANY`: UByte = 255u;
public const val `FILTER_ICMP_TYPE_ANY`: UByte = 255u;
// UNSUPPORTED Rust 500:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FIXED_INFO_W2KSP1 {
//     pub HostName: [i8; 132],
//     pub DomainName: [i8; 132],
//     pub CurrentDnsServer: *mut IP_ADDR_STRING,
//     pub DnsServerList: IP_ADDR_STRING,
//     pub NodeType: u32,
//     pub ScopeId: [i8; 260],
//     pub EnableRouting: u32,
//     pub EnableProxy: u32,
//     pub EnableDns: u32,
// }

// UNSUPPORTED Rust 513:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FIXED_INFO_W2KSP1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GAA_FLAG_INCLUDE_ALL_COMPARTMENTS`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 512u;
public const val `GAA_FLAG_INCLUDE_ALL_INTERFACES`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 256u;
public const val `GAA_FLAG_INCLUDE_GATEWAYS`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 128u;
public const val `GAA_FLAG_INCLUDE_PREFIX`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 16u;
public const val `GAA_FLAG_INCLUDE_TUNNEL_BINDINGORDER`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 1024u;
public const val `GAA_FLAG_INCLUDE_WINS_INFO`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 64u;
public const val `GAA_FLAG_SKIP_ANYCAST`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 2u;
public const val `GAA_FLAG_SKIP_DNS_INFO`: UInt = 2048u;
public const val `GAA_FLAG_SKIP_DNS_SERVER`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 8u;
public const val `GAA_FLAG_SKIP_FRIENDLY_NAME`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 32u;
public const val `GAA_FLAG_SKIP_MULTICAST`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 4u;
public const val `GAA_FLAG_SKIP_UNICAST`: `GET_ADAPTERS_ADDRESSES_FLAGS` = 1u;
public typealias `GET_ADAPTERS_ADDRESSES_FLAGS` = UInt;
public const val `GF_FRAGCACHE`: `GLOBAL_FILTER` = 9;
public const val `GF_FRAGMENTS`: `GLOBAL_FILTER` = 2;
public const val `GF_STRONGHOST`: `GLOBAL_FILTER` = 8;
public typealias `GLOBAL_FILTER` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HIFTIMESTAMPCHANGE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HYBRID_NODETYPE`: UInt = 8u;
public const val `ICMP4_DST_UNREACH`: `ICMP4_TYPE` = 3;
public const val `ICMP4_ECHO_REPLY`: `ICMP4_TYPE` = 0;
public const val `ICMP4_ECHO_REQUEST`: `ICMP4_TYPE` = 8;
public const val `ICMP4_MASK_REPLY`: `ICMP4_TYPE` = 18;
public const val `ICMP4_MASK_REQUEST`: `ICMP4_TYPE` = 17;
public const val `ICMP4_PARAM_PROB`: `ICMP4_TYPE` = 12;
public const val `ICMP4_REDIRECT`: `ICMP4_TYPE` = 5;
public const val `ICMP4_ROUTER_ADVERT`: `ICMP4_TYPE` = 9;
public const val `ICMP4_ROUTER_SOLICIT`: `ICMP4_TYPE` = 10;
public const val `ICMP4_SOURCE_QUENCH`: `ICMP4_TYPE` = 4;
public const val `ICMP4_TIMESTAMP_REPLY`: `ICMP4_TYPE` = 14;
public const val `ICMP4_TIMESTAMP_REQUEST`: `ICMP4_TYPE` = 13;
public const val `ICMP4_TIME_EXCEEDED`: `ICMP4_TYPE` = 11;
public typealias `ICMP4_TYPE` = Int;
public const val `ICMP6_DST_UNREACH`: `ICMP6_TYPE` = 1;
public const val `ICMP6_ECHO_REPLY`: `ICMP6_TYPE` = 129;
public const val `ICMP6_ECHO_REQUEST`: `ICMP6_TYPE` = 128;
public const val `ICMP6_INFOMSG_MASK`: UInt = 128u;
public const val `ICMP6_MEMBERSHIP_QUERY`: `ICMP6_TYPE` = 130;
public const val `ICMP6_MEMBERSHIP_REDUCTION`: `ICMP6_TYPE` = 132;
public const val `ICMP6_MEMBERSHIP_REPORT`: `ICMP6_TYPE` = 131;
public const val `ICMP6_PACKET_TOO_BIG`: `ICMP6_TYPE` = 2;
public const val `ICMP6_PARAM_PROB`: `ICMP6_TYPE` = 4;
public const val `ICMP6_TIME_EXCEEDED`: `ICMP6_TYPE` = 3;
public typealias `ICMP6_TYPE` = Int;
public const val `ICMP6_V2_MEMBERSHIP_REPORT`: `ICMP6_TYPE` = 143;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ICMPV6_ECHO_REPLY_LH` (
    public var `Address`: `IPV6_ADDRESS_EX`,
    public var `Status`: UInt,
    public var `RoundTripTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ICMP_ECHO_REPLY` (
    public var `Address`: UInt,
    public var `Status`: UInt,
    public var `RoundTripTime`: UInt,
    public var `DataSize`: UShort,
    public var `Reserved`: UShort,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Options`: `IP_OPTION_INFORMATION`,
)
// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ICMP_ECHO_REPLY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ICMP_ECHO_REPLY32` (
    public var `Address`: UInt,
    public var `Status`: UInt,
    public var `RoundTripTime`: UInt,
    public var `DataSize`: UShort,
    public var `Reserved`: UShort,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Options`: `IP_OPTION_INFORMATION32`,
)
// UNSUPPORTED Rust 598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for ICMP_ECHO_REPLY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICMP_STATS`: UInt = 11u;
public const val `IF_ACCESS_BROADCAST`: `IF_ACCESS_TYPE` = 2;
public const val `IF_ACCESS_LOOPBACK`: `IF_ACCESS_TYPE` = 1;
public const val `IF_ACCESS_POINTTOMULTIPOINT`: `IF_ACCESS_TYPE` = 4;
public const val `IF_ACCESS_POINTTOPOINT`: `IF_ACCESS_TYPE` = 3;
public const val `IF_ACCESS_POINT_TO_MULTI_POINT`: `IF_ACCESS_TYPE` = 4;
public const val `IF_ACCESS_POINT_TO_POINT`: `IF_ACCESS_TYPE` = 3;
public typealias `IF_ACCESS_TYPE` = Int;
public const val `IF_ADMIN_STATUS_DOWN`: UInt = 2u;
public const val `IF_ADMIN_STATUS_TESTING`: UInt = 3u;
public const val `IF_ADMIN_STATUS_UP`: UInt = 1u;
public const val `IF_CHECK_MCAST`: UInt = 1u;
public const val `IF_CHECK_NONE`: UInt = 0u;
public const val `IF_CHECK_SEND`: UInt = 2u;
public const val `IF_CONNECTION_DEDICATED`: UInt = 1u;
public const val `IF_CONNECTION_DEMAND`: UInt = 3u;
public const val `IF_CONNECTION_PASSIVE`: UInt = 2u;
public const val `IF_NUMBER`: UInt = 0u;
public const val `IF_OPER_STATUS_CONNECTED`: `INTERNAL_IF_OPER_STATUS` = 4;
public const val `IF_OPER_STATUS_CONNECTING`: `INTERNAL_IF_OPER_STATUS` = 3;
public const val `IF_OPER_STATUS_DISCONNECTED`: `INTERNAL_IF_OPER_STATUS` = 2;
public const val `IF_OPER_STATUS_NON_OPERATIONAL`: `INTERNAL_IF_OPER_STATUS` = 0;
public const val `IF_OPER_STATUS_OPERATIONAL`: `INTERNAL_IF_OPER_STATUS` = 5;
public const val `IF_OPER_STATUS_UNREACHABLE`: `INTERNAL_IF_OPER_STATUS` = 1;
public const val `IF_ROW`: UInt = 2u;
public const val `IF_STATUS`: UInt = 25u;
public const val `IF_TABLE`: UInt = 1u;
public const val `IF_TYPE_A12MPPSWITCH`: UInt = 130u;
public const val `IF_TYPE_AAL2`: UInt = 187u;
public const val `IF_TYPE_AAL5`: UInt = 49u;
public const val `IF_TYPE_ADSL`: UInt = 94u;
public const val `IF_TYPE_AFLANE_8023`: UInt = 59u;
public const val `IF_TYPE_AFLANE_8025`: UInt = 60u;
public const val `IF_TYPE_ARAP`: UInt = 88u;
public const val `IF_TYPE_ARCNET`: UInt = 35u;
public const val `IF_TYPE_ARCNET_PLUS`: UInt = 36u;
public const val `IF_TYPE_ASYNC`: UInt = 84u;
public const val `IF_TYPE_ATM`: UInt = 37u;
public const val `IF_TYPE_ATM_DXI`: UInt = 105u;
public const val `IF_TYPE_ATM_FUNI`: UInt = 106u;
public const val `IF_TYPE_ATM_IMA`: UInt = 107u;
public const val `IF_TYPE_ATM_LOGICAL`: UInt = 80u;
public const val `IF_TYPE_ATM_RADIO`: UInt = 189u;
public const val `IF_TYPE_ATM_SUBINTERFACE`: UInt = 134u;
public const val `IF_TYPE_ATM_VCI_ENDPT`: UInt = 194u;
public const val `IF_TYPE_ATM_VIRTUAL`: UInt = 149u;
public const val `IF_TYPE_BASIC_ISDN`: UInt = 20u;
public const val `IF_TYPE_BGP_POLICY_ACCOUNTING`: UInt = 162u;
public const val `IF_TYPE_BSC`: UInt = 83u;
public const val `IF_TYPE_CCTEMUL`: UInt = 61u;
public const val `IF_TYPE_CES`: UInt = 133u;
public const val `IF_TYPE_CHANNEL`: UInt = 70u;
public const val `IF_TYPE_CNR`: UInt = 85u;
public const val `IF_TYPE_COFFEE`: UInt = 132u;
public const val `IF_TYPE_COMPOSITELINK`: UInt = 155u;
public const val `IF_TYPE_DCN`: UInt = 141u;
public const val `IF_TYPE_DDN_X25`: UInt = 4u;
public const val `IF_TYPE_DIGITALPOWERLINE`: UInt = 138u;
public const val `IF_TYPE_DIGITAL_WRAPPER_OVERHEAD_CHANNEL`: UInt = 186u;
public const val `IF_TYPE_DLSW`: UInt = 74u;
public const val `IF_TYPE_DOCSCABLE_DOWNSTREAM`: UInt = 128u;
public const val `IF_TYPE_DOCSCABLE_MACLAYER`: UInt = 127u;
public const val `IF_TYPE_DOCSCABLE_UPSTREAM`: UInt = 129u;
public const val `IF_TYPE_DS0`: UInt = 81u;
public const val `IF_TYPE_DS0_BUNDLE`: UInt = 82u;
public const val `IF_TYPE_DS1`: UInt = 18u;
public const val `IF_TYPE_DS1_FDL`: UInt = 170u;
public const val `IF_TYPE_DS3`: UInt = 30u;
public const val `IF_TYPE_DTM`: UInt = 140u;
public const val `IF_TYPE_DVBRCC_DOWNSTREAM`: UInt = 147u;
public const val `IF_TYPE_DVBRCC_MACLAYER`: UInt = 146u;
public const val `IF_TYPE_DVBRCC_UPSTREAM`: UInt = 148u;
public const val `IF_TYPE_DVB_ASI_IN`: UInt = 172u;
public const val `IF_TYPE_DVB_ASI_OUT`: UInt = 173u;
public const val `IF_TYPE_E1`: UInt = 19u;
public const val `IF_TYPE_EON`: UInt = 25u;
public const val `IF_TYPE_EPLRS`: UInt = 87u;
public const val `IF_TYPE_ESCON`: UInt = 73u;
public const val `IF_TYPE_ETHERNET_3MBIT`: UInt = 26u;
public const val `IF_TYPE_ETHERNET_CSMACD`: UInt = 6u;
public const val `IF_TYPE_FAST`: UInt = 125u;
public const val `IF_TYPE_FASTETHER`: UInt = 62u;
public const val `IF_TYPE_FASTETHER_FX`: UInt = 69u;
public const val `IF_TYPE_FDDI`: UInt = 15u;
public const val `IF_TYPE_FIBRECHANNEL`: UInt = 56u;
public const val `IF_TYPE_FRAMERELAY`: UInt = 32u;
public const val `IF_TYPE_FRAMERELAY_INTERCONNECT`: UInt = 58u;
public const val `IF_TYPE_FRAMERELAY_MPI`: UInt = 92u;
public const val `IF_TYPE_FRAMERELAY_SERVICE`: UInt = 44u;
public const val `IF_TYPE_FRF16_MFR_BUNDLE`: UInt = 163u;
public const val `IF_TYPE_FR_DLCI_ENDPT`: UInt = 193u;
public const val `IF_TYPE_FR_FORWARD`: UInt = 158u;
public const val `IF_TYPE_G703_2MB`: UInt = 67u;
public const val `IF_TYPE_G703_64K`: UInt = 66u;
public const val `IF_TYPE_GIGABITETHERNET`: UInt = 117u;
public const val `IF_TYPE_GR303_IDT`: UInt = 178u;
public const val `IF_TYPE_GR303_RDT`: UInt = 177u;
public const val `IF_TYPE_H323_GATEKEEPER`: UInt = 164u;
public const val `IF_TYPE_H323_PROXY`: UInt = 165u;
public const val `IF_TYPE_HDH_1822`: UInt = 3u;
public const val `IF_TYPE_HDLC`: UInt = 118u;
public const val `IF_TYPE_HDSL2`: UInt = 168u;
public const val `IF_TYPE_HIPERLAN2`: UInt = 183u;
public const val `IF_TYPE_HIPPI`: UInt = 47u;
public const val `IF_TYPE_HIPPIINTERFACE`: UInt = 57u;
public const val `IF_TYPE_HOSTPAD`: UInt = 90u;
public const val `IF_TYPE_HSSI`: UInt = 46u;
public const val `IF_TYPE_HYPERCHANNEL`: UInt = 14u;
public const val `IF_TYPE_IBM370PARCHAN`: UInt = 72u;
public const val `IF_TYPE_IDSL`: UInt = 154u;
public const val `IF_TYPE_IEEE1394`: UInt = 144u;
public const val `IF_TYPE_IEEE80211`: UInt = 71u;
public const val `IF_TYPE_IEEE80212`: UInt = 55u;
public const val `IF_TYPE_IEEE802154`: UInt = 259u;
public const val `IF_TYPE_IEEE80216_WMAN`: UInt = 237u;
public const val `IF_TYPE_IEEE8023AD_LAG`: UInt = 161u;
public const val `IF_TYPE_IF_GSN`: UInt = 145u;
public const val `IF_TYPE_IMT`: UInt = 190u;
public const val `IF_TYPE_INTERLEAVE`: UInt = 124u;
public const val `IF_TYPE_IP`: UInt = 126u;
public const val `IF_TYPE_IPFORWARD`: UInt = 142u;
public const val `IF_TYPE_IPOVER_ATM`: UInt = 114u;
public const val `IF_TYPE_IPOVER_CDLC`: UInt = 109u;
public const val `IF_TYPE_IPOVER_CLAW`: UInt = 110u;
public const val `IF_TYPE_IPSWITCH`: UInt = 78u;
public const val `IF_TYPE_IS088023_CSMACD`: UInt = 7u;
public const val `IF_TYPE_ISDN`: UInt = 63u;
public const val `IF_TYPE_ISDN_S`: UInt = 75u;
public const val `IF_TYPE_ISDN_U`: UInt = 76u;
public const val `IF_TYPE_ISO88022_LLC`: UInt = 41u;
public const val `IF_TYPE_ISO88024_TOKENBUS`: UInt = 8u;
public const val `IF_TYPE_ISO88025R_DTR`: UInt = 86u;
public const val `IF_TYPE_ISO88025_CRFPRINT`: UInt = 98u;
public const val `IF_TYPE_ISO88025_FIBER`: UInt = 115u;
public const val `IF_TYPE_ISO88025_TOKENRING`: UInt = 9u;
public const val `IF_TYPE_ISO88026_MAN`: UInt = 10u;
public const val `IF_TYPE_ISUP`: UInt = 179u;
public const val `IF_TYPE_L2_VLAN`: UInt = 135u;
public const val `IF_TYPE_L3_IPVLAN`: UInt = 136u;
public const val `IF_TYPE_L3_IPXVLAN`: UInt = 137u;
public const val `IF_TYPE_LAP_B`: UInt = 16u;
public const val `IF_TYPE_LAP_D`: UInt = 77u;
public const val `IF_TYPE_LAP_F`: UInt = 119u;
public const val `IF_TYPE_LOCALTALK`: UInt = 42u;
public const val `IF_TYPE_MEDIAMAILOVERIP`: UInt = 139u;
public const val `IF_TYPE_MF_SIGLINK`: UInt = 167u;
public const val `IF_TYPE_MIO_X25`: UInt = 38u;
public const val `IF_TYPE_MODEM`: UInt = 48u;
public const val `IF_TYPE_MPC`: UInt = 113u;
public const val `IF_TYPE_MPLS`: UInt = 166u;
public const val `IF_TYPE_MPLS_TUNNEL`: UInt = 150u;
public const val `IF_TYPE_MSDSL`: UInt = 143u;
public const val `IF_TYPE_MVL`: UInt = 191u;
public const val `IF_TYPE_MYRINET`: UInt = 99u;
public const val `IF_TYPE_NFAS`: UInt = 175u;
public const val `IF_TYPE_NSIP`: UInt = 27u;
public const val `IF_TYPE_OPTICAL_CHANNEL`: UInt = 195u;
public const val `IF_TYPE_OPTICAL_TRANSPORT`: UInt = 196u;
public const val `IF_TYPE_OTHER`: UInt = 1u;
public const val `IF_TYPE_PARA`: UInt = 34u;
public const val `IF_TYPE_PLC`: UInt = 174u;
public const val `IF_TYPE_POS`: UInt = 171u;
public const val `IF_TYPE_PPP`: UInt = 23u;
public const val `IF_TYPE_PPPMULTILINKBUNDLE`: UInt = 108u;
public const val `IF_TYPE_PRIMARY_ISDN`: UInt = 21u;
public const val `IF_TYPE_PROP_BWA_P2MP`: UInt = 184u;
public const val `IF_TYPE_PROP_CNLS`: UInt = 89u;
public const val `IF_TYPE_PROP_DOCS_WIRELESS_DOWNSTREAM`: UInt = 181u;
public const val `IF_TYPE_PROP_DOCS_WIRELESS_MACLAYER`: UInt = 180u;
public const val `IF_TYPE_PROP_DOCS_WIRELESS_UPSTREAM`: UInt = 182u;
public const val `IF_TYPE_PROP_MULTIPLEXOR`: UInt = 54u;
public const val `IF_TYPE_PROP_POINT2POINT_SERIAL`: UInt = 22u;
public const val `IF_TYPE_PROP_VIRTUAL`: UInt = 53u;
public const val `IF_TYPE_PROP_WIRELESS_P2P`: UInt = 157u;
public const val `IF_TYPE_PROTEON_10MBIT`: UInt = 12u;
public const val `IF_TYPE_PROTEON_80MBIT`: UInt = 13u;
public const val `IF_TYPE_QLLC`: UInt = 68u;
public const val `IF_TYPE_RADIO_MAC`: UInt = 188u;
public const val `IF_TYPE_RADSL`: UInt = 95u;
public const val `IF_TYPE_REACH_DSL`: UInt = 192u;
public const val `IF_TYPE_REGULAR_1822`: UInt = 2u;
public const val `IF_TYPE_RFC1483`: UInt = 159u;
public const val `IF_TYPE_RFC877_X25`: UInt = 5u;
public const val `IF_TYPE_RS232`: UInt = 33u;
public const val `IF_TYPE_RSRB`: UInt = 79u;
public const val `IF_TYPE_SDLC`: UInt = 17u;
public const val `IF_TYPE_SDSL`: UInt = 96u;
public const val `IF_TYPE_SHDSL`: UInt = 169u;
public const val `IF_TYPE_SIP`: UInt = 31u;
public const val `IF_TYPE_SLIP`: UInt = 28u;
public const val `IF_TYPE_SMDS_DXI`: UInt = 43u;
public const val `IF_TYPE_SMDS_ICIP`: UInt = 52u;
public const val `IF_TYPE_SOFTWARE_LOOPBACK`: UInt = 24u;
public const val `IF_TYPE_SONET`: UInt = 39u;
public const val `IF_TYPE_SONET_OVERHEAD_CHANNEL`: UInt = 185u;
public const val `IF_TYPE_SONET_PATH`: UInt = 50u;
public const val `IF_TYPE_SONET_VT`: UInt = 51u;
public const val `IF_TYPE_SRP`: UInt = 151u;
public const val `IF_TYPE_SS7_SIGLINK`: UInt = 156u;
public const val `IF_TYPE_STACKTOSTACK`: UInt = 111u;
public const val `IF_TYPE_STARLAN`: UInt = 11u;
public const val `IF_TYPE_TDLC`: UInt = 116u;
public const val `IF_TYPE_TERMPAD`: UInt = 91u;
public const val `IF_TYPE_TR008`: UInt = 176u;
public const val `IF_TYPE_TRANSPHDLC`: UInt = 123u;
public const val `IF_TYPE_TUNNEL`: UInt = 131u;
public const val `IF_TYPE_ULTRA`: UInt = 29u;
public const val `IF_TYPE_USB`: UInt = 160u;
public const val `IF_TYPE_V11`: UInt = 64u;
public const val `IF_TYPE_V35`: UInt = 45u;
public const val `IF_TYPE_V36`: UInt = 65u;
public const val `IF_TYPE_V37`: UInt = 120u;
public const val `IF_TYPE_VDSL`: UInt = 97u;
public const val `IF_TYPE_VIRTUALIPADDRESS`: UInt = 112u;
public const val `IF_TYPE_VOICEOVERATM`: UInt = 152u;
public const val `IF_TYPE_VOICEOVERFRAMERELAY`: UInt = 153u;
public const val `IF_TYPE_VOICE_EM`: UInt = 100u;
public const val `IF_TYPE_VOICE_ENCAP`: UInt = 103u;
public const val `IF_TYPE_VOICE_FXO`: UInt = 101u;
public const val `IF_TYPE_VOICE_FXS`: UInt = 102u;
public const val `IF_TYPE_VOICE_OVERIP`: UInt = 104u;
public const val `IF_TYPE_WWANPP`: UInt = 243u;
public const val `IF_TYPE_WWANPP2`: UInt = 244u;
public const val `IF_TYPE_X213`: UInt = 93u;
public const val `IF_TYPE_X25_HUNTGROUP`: UInt = 122u;
public const val `IF_TYPE_X25_MLP`: UInt = 121u;
public const val `IF_TYPE_X25_PLE`: UInt = 40u;
public const val `IF_TYPE_XBOX_WIRELESS`: UInt = 281u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERFACE_HARDWARE_CROSSTIMESTAMP` (
    public var `SystemTimestamp1`: ULong,
    public var `HardwareClockTimestamp`: ULong,
    public var `SystemTimestamp2`: ULong,
)
public const val `INTERFACE_HARDWARE_CROSSTIMESTAMP_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES` (
    public var `PtpV2OverUdpIPv4EventMessageReceive`: Boolean,
    public var `PtpV2OverUdpIPv4AllMessageReceive`: Boolean,
    public var `PtpV2OverUdpIPv4EventMessageTransmit`: Boolean,
    public var `PtpV2OverUdpIPv4AllMessageTransmit`: Boolean,
    public var `PtpV2OverUdpIPv6EventMessageReceive`: Boolean,
    public var `PtpV2OverUdpIPv6AllMessageReceive`: Boolean,
    public var `PtpV2OverUdpIPv6EventMessageTransmit`: Boolean,
    public var `PtpV2OverUdpIPv6AllMessageTransmit`: Boolean,
    public var `AllReceive`: Boolean,
    public var `AllTransmit`: Boolean,
    public var `TaggedTransmit`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES` (
    public var `AllReceive`: Boolean,
    public var `AllTransmit`: Boolean,
    public var `TaggedTransmit`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERFACE_TIMESTAMP_CAPABILITIES` (
    public var `HardwareClockFrequencyHz`: ULong,
    public var `SupportsCrossTimestamp`: Boolean,
    public var `HardwareCapabilities`: `INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES`,
    public var `SoftwareCapabilities`: `INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES`,
)
public const val `INTERFACE_TIMESTAMP_CAPABILITIES_VERSION_1`: UInt = 1u;
public typealias `INTERNAL_IF_OPER_STATUS` = Int;
public const val `IOCTL_ARP_SEND_REQUEST`: UInt = 103u;
public const val `IOCTL_IP_ADDCHANGE_NOTIFY_REQUEST`: UInt = 102u;
public const val `IOCTL_IP_GET_BEST_INTERFACE`: UInt = 105u;
public const val `IOCTL_IP_INTERFACE_INFO`: UInt = 104u;
public const val `IOCTL_IP_RTCHANGE_NOTIFY_REQUEST`: UInt = 101u;
public const val `IOCTL_IP_UNIDIRECTIONAL_ADAPTER_ADDRESS`: UInt = 106u;
public const val `IP6_STATS`: UInt = 36u;
public const val `IPRTRMGR_PID`: UInt = 10000u;
// UNSUPPORTED Rust 880:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct IPV6_ADDRESS_EX {
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: [u16; 8],
//     pub sin6_scope_id: u32,
// }

// UNSUPPORTED Rust 888:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPV6_ADDRESS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPV6_GLOBAL_INFO`: UInt = 4294901775u;
public const val `IPV6_ROUTE_INFO`: UInt = 4294901776u;
// UNSUPPORTED Rust 895:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_ADDRESSES_LH {
//     pub Anonymous1: IP_ADAPTER_ADDRESSES_LH_0,
//     pub Next: *mut IP_ADAPTER_ADDRESSES_LH,
//     pub AdapterName: windows_sys::core::PSTR,
//     pub FirstUnicastAddress: *mut IP_ADAPTER_UNICAST_ADDRESS_LH,
//     pub FirstAnycastAddress: *mut IP_ADAPTER_ANYCAST_ADDRESS_XP,
//     pub FirstMulticastAddress: *mut IP_ADAPTER_MULTICAST_ADDRESS_XP,
//     pub FirstDnsServerAddress: *mut IP_ADAPTER_DNS_SERVER_ADDRESS_XP,
//     pub DnsSuffix: windows_sys::core::PWSTR,
//     pub Description: windows_sys::core::PWSTR,
//     pub FriendlyName: windows_sys::core::PWSTR,
//     pub PhysicalAddress: [u8; 8],
//     pub PhysicalAddressLength: u32,
//     pub Anonymous2: IP_ADAPTER_ADDRESSES_LH_1,
//     pub Mtu: u32,
//     pub IfType: u32,
//     pub OperStatus: super::Ndis::IF_OPER_STATUS,
//     pub Ipv6IfIndex: u32,
//     pub ZoneIndices: [u32; 16],
//     pub FirstPrefix: *mut IP_ADAPTER_PREFIX_XP,
//     pub TransmitLinkSpeed: u64,
//     pub ReceiveLinkSpeed: u64,
//     pub FirstWinsServerAddress: *mut IP_ADAPTER_WINS_SERVER_ADDRESS_LH,
//     pub FirstGatewayAddress: *mut IP_ADAPTER_GATEWAY_ADDRESS_LH,
//     pub Ipv4Metric: u32,
//     pub Ipv6Metric: u32,
//     pub Luid: super::Ndis::NET_LUID_LH,
//     pub Dhcpv4Server: super::super::Networking::WinSock::SOCKET_ADDRESS,
//     pub CompartmentId: super::Ndis::NET_IF_COMPARTMENT_ID,
//     pub NetworkGuid: windows_sys::core::GUID,
//     pub ConnectionType: super::Ndis::NET_IF_CONNECTION_TYPE,
//     pub TunnelType: super::Ndis::TUNNEL_TYPE,
//     pub Dhcpv6Server: super::super::Networking::WinSock::SOCKET_ADDRESS,
//     pub Dhcpv6ClientDuid: [u8; 130],
//     pub Dhcpv6ClientDuidLength: u32,
//     pub Dhcpv6Iaid: u32,
//     pub FirstDnsSuffix: *mut IP_ADAPTER_DNS_SUFFIX,
// }

// UNSUPPORTED Rust 936:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 942:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_LH_0_0,
// }

// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_ADDRESSES_LH_0_0` (
    public var `Length`: UInt,
    public var `IfIndex`: UInt,
)
// UNSUPPORTED Rust 962:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_LH_1 {
//     pub Flags: u32,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_LH_1_0,
// }

// UNSUPPORTED Rust 969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_LH_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_ADDRESSES_LH_1_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 981:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_ADDRESSES_XP {
//     pub Anonymous: IP_ADAPTER_ADDRESSES_XP_0,
//     pub Next: *mut IP_ADAPTER_ADDRESSES_XP,
//     pub AdapterName: windows_sys::core::PSTR,
//     pub FirstUnicastAddress: *mut IP_ADAPTER_UNICAST_ADDRESS_XP,
//     pub FirstAnycastAddress: *mut IP_ADAPTER_ANYCAST_ADDRESS_XP,
//     pub FirstMulticastAddress: *mut IP_ADAPTER_MULTICAST_ADDRESS_XP,
//     pub FirstDnsServerAddress: *mut IP_ADAPTER_DNS_SERVER_ADDRESS_XP,
//     pub DnsSuffix: windows_sys::core::PWSTR,
//     pub Description: windows_sys::core::PWSTR,
//     pub FriendlyName: windows_sys::core::PWSTR,
//     pub PhysicalAddress: [u8; 8],
//     pub PhysicalAddressLength: u32,
//     pub Flags: u32,
//     pub Mtu: u32,
//     pub IfType: u32,
//     pub OperStatus: super::Ndis::IF_OPER_STATUS,
//     pub Ipv6IfIndex: u32,
//     pub ZoneIndices: [u32; 16],
//     pub FirstPrefix: *mut IP_ADAPTER_PREFIX_XP,
// }

// UNSUPPORTED Rust 1005:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1011:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_XP_0_0,
// }

// UNSUPPORTED Rust 1018:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_ADDRESSES_XP_0_0` (
    public var `Length`: UInt,
    public var `IfIndex`: UInt,
)
public const val `IP_ADAPTER_ADDRESS_DNS_ELIGIBLE`: UInt = 1u;
public const val `IP_ADAPTER_ADDRESS_TRANSIENT`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_ANYCAST_ADDRESS_XP` (
    public var `Anonymous`: `IP_ADAPTER_ANYCAST_ADDRESS_XP_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ANYCAST_ADDRESS_XP`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
)
// UNSUPPORTED Rust 1041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_ANYCAST_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1047:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ANYCAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_ANYCAST_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0` (
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
public const val `IP_ADAPTER_DDNS_ENABLED`: UInt = 1u;
public const val `IP_ADAPTER_DHCP_ENABLED`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_DNS_SERVER_ADDRESS_XP` (
    public var `Anonymous`: `IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_DNS_SERVER_ADDRESS_XP`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
)
// UNSUPPORTED Rust 1077:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_DNS_SERVER_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1083:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1090:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0` (
    public var `Length`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1103:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_DNS_SUFFIX {
//     pub Next: *mut IP_ADAPTER_DNS_SUFFIX,
//     pub String: [u16; 256],
// }

// UNSUPPORTED Rust 1109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_ADAPTER_DNS_SUFFIX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_GATEWAY_ADDRESS_LH` (
    public var `Anonymous`: `IP_ADAPTER_GATEWAY_ADDRESS_LH_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_GATEWAY_ADDRESS_LH`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
)
// UNSUPPORTED Rust 1122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_GATEWAY_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1128:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_GATEWAY_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0,
// }

// UNSUPPORTED Rust 1135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_GATEWAY_ADDRESS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0` (
    public var `Length`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1148:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_INDEX_MAP {
//     pub Index: u32,
//     pub Name: [u16; 128],
// }

// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_ADAPTER_INDEX_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1159:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_INFO {
//     pub Next: *mut IP_ADAPTER_INFO,
//     pub ComboIndex: u32,
//     pub AdapterName: [i8; 260],
//     pub Description: [i8; 132],
//     pub AddressLength: u32,
//     pub Address: [u8; 8],
//     pub Index: u32,
//     pub Type: u32,
//     pub DhcpEnabled: u32,
//     pub CurrentIpAddress: *mut IP_ADDR_STRING,
//     pub IpAddressList: IP_ADDR_STRING,
//     pub GatewayList: IP_ADDR_STRING,
//     pub DhcpServer: IP_ADDR_STRING,
//     pub HaveWins: windows_sys::core::BOOL,
//     pub PrimaryWinsServer: IP_ADDR_STRING,
//     pub SecondaryWinsServer: IP_ADDR_STRING,
//     pub LeaseObtained: i64,
//     pub LeaseExpires: i64,
// }

// UNSUPPORTED Rust 1181:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_ADAPTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_ADAPTER_IPV4_ENABLED`: UInt = 128u;
public const val `IP_ADAPTER_IPV6_ENABLED`: UInt = 256u;
public const val `IP_ADAPTER_IPV6_MANAGE_ADDRESS_CONFIG`: UInt = 512u;
public const val `IP_ADAPTER_IPV6_OTHER_STATEFUL_CONFIG`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_MULTICAST_ADDRESS_XP` (
    public var `Anonymous`: `IP_ADAPTER_MULTICAST_ADDRESS_XP_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_MULTICAST_ADDRESS_XP`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
)
// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_MULTICAST_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1204:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_MULTICAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_MULTICAST_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0` (
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
public const val `IP_ADAPTER_NETBIOS_OVER_TCPIP_ENABLED`: UInt = 64u;
public const val `IP_ADAPTER_NO_MULTICAST`: UInt = 16u;
// UNSUPPORTED Rust 1226:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_ORDER_MAP {
//     pub NumAdapters: u32,
//     pub AdapterOrder: [u32; 1],
// }

// UNSUPPORTED Rust 1232:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_ADAPTER_ORDER_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_PREFIX_XP` (
    public var `Anonymous`: `IP_ADAPTER_PREFIX_XP_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_PREFIX_XP`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `PrefixLength`: UInt,
)
// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_PREFIX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1252:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_PREFIX_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_PREFIX_XP_0_0,
// }

// UNSUPPORTED Rust 1259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_PREFIX_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_PREFIX_XP_0_0` (
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
public const val `IP_ADAPTER_RECEIVE_ONLY`: UInt = 8u;
public const val `IP_ADAPTER_REGISTER_ADAPTER_SUFFIX`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_UNICAST_ADDRESS_LH` (
    public var `Anonymous`: `IP_ADAPTER_UNICAST_ADDRESS_LH_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_UNICAST_ADDRESS_LH`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `PrefixOrigin`: `super`.`super`.`Networking`.`WinSock`.`NL_PREFIX_ORIGIN`,
    public var `SuffixOrigin`: `super`.`super`.`Networking`.`WinSock`.`NL_SUFFIX_ORIGIN`,
    public var `DadState`: `super`.`super`.`Networking`.`WinSock`.`NL_DAD_STATE`,
    public var `ValidLifetime`: UInt,
    public var `PreferredLifetime`: UInt,
    public var `LeaseLifetime`: UInt,
    public var `OnLinkPrefixLength`: UByte,
)
// UNSUPPORTED Rust 1289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1295:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_UNICAST_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_LH_0_0,
// }

// UNSUPPORTED Rust 1302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_UNICAST_ADDRESS_LH_0_0` (
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_UNICAST_ADDRESS_XP` (
    public var `Anonymous`: `IP_ADAPTER_UNICAST_ADDRESS_XP_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_UNICAST_ADDRESS_XP`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `PrefixOrigin`: `super`.`super`.`Networking`.`WinSock`.`NL_PREFIX_ORIGIN`,
    public var `SuffixOrigin`: `super`.`super`.`Networking`.`WinSock`.`NL_SUFFIX_ORIGIN`,
    public var `DadState`: `super`.`super`.`Networking`.`WinSock`.`NL_DAD_STATE`,
    public var `ValidLifetime`: UInt,
    public var `PreferredLifetime`: UInt,
    public var `LeaseLifetime`: UInt,
)
// UNSUPPORTED Rust 1329:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1335:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_UNICAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1342:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_UNICAST_ADDRESS_XP_0_0` (
    public var `Length`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_WINS_SERVER_ADDRESS_LH` (
    public var `Anonymous`: `IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_WINS_SERVER_ADDRESS_LH`>?,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
)
// UNSUPPORTED Rust 1363:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_WINS_SERVER_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1369:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0,
// }

// UNSUPPORTED Rust 1376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0` (
    public var `Length`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADDRESS_PREFIX` (
    public var `Prefix`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `PrefixLength`: UByte,
)
// UNSUPPORTED Rust 1396:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADDRESS_PREFIX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1402:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADDRESS_STRING {
//     pub String: [i8; 16],
// }

// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_ADDRESS_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_ADDRROW`: UInt = 5u;
public const val `IP_ADDRTABLE`: UInt = 4u;
public const val `IP_ADDR_ADDED`: UInt = 11023u;
public const val `IP_ADDR_DELETED`: UInt = 11019u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADDR_STRING` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADDR_STRING`>?,
    public var `IpAddress`: `IP_ADDRESS_STRING`,
    public var `IpMask`: `IP_ADDRESS_STRING`,
    public var `Context`: UInt,
)
// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_ADDR_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_BAD_DESTINATION`: UInt = 11018u;
public const val `IP_BAD_HEADER`: UInt = 11042u;
public const val `IP_BAD_OPTION`: UInt = 11007u;
public const val `IP_BAD_REQ`: UInt = 11011u;
public const val `IP_BAD_ROUTE`: UInt = 11012u;
public const val `IP_BIND_ADAPTER`: UInt = 11026u;
public const val `IP_BUF_TOO_SMALL`: UInt = 11001u;
public const val `IP_DEMAND_DIAL_FILTER_INFO`: UInt = 4294901769u;
public const val `IP_DEMAND_DIAL_FILTER_INFO_V6`: UInt = 4294901779u;
public const val `IP_DEST_ADDR_UNREACHABLE`: UInt = 11003u;
public const val `IP_DEST_HOST_UNREACHABLE`: UInt = 11003u;
public const val `IP_DEST_NET_UNREACHABLE`: UInt = 11002u;
public const val `IP_DEST_NO_ROUTE`: UInt = 11002u;
public const val `IP_DEST_PORT_UNREACHABLE`: UInt = 11005u;
public const val `IP_DEST_PROHIBITED`: UInt = 11004u;
public const val `IP_DEST_PROT_UNREACHABLE`: UInt = 11004u;
public const val `IP_DEST_SCOPE_MISMATCH`: UInt = 11045u;
public const val `IP_DEST_UNREACHABLE`: UInt = 11040u;
public const val `IP_DEVICE_DOES_NOT_EXIST`: UInt = 11028u;
public const val `IP_DUPLICATE_ADDRESS`: UInt = 11029u;
public const val `IP_DUPLICATE_IPADD`: UInt = 11034u;
public const val `IP_EXPORT_INCLUDED`: UInt = 1u;
public const val `IP_FILTER_ENABLE_INFO`: UInt = 4294901781u;
public const val `IP_FILTER_ENABLE_INFO_V6`: UInt = 4294901782u;
public const val `IP_FLAG_DF`: UInt = 2u;
public const val `IP_FLAG_REVERSE`: UInt = 1u;
public const val `IP_FORWARDNUMBER`: UInt = 6u;
public const val `IP_FORWARDROW`: UInt = 8u;
public const val `IP_FORWARDTABLE`: UInt = 7u;
public const val `IP_GENERAL_FAILURE`: UInt = 11050u;
public const val `IP_GENERAL_INFO_BASE`: UInt = 4294901760u;
public const val `IP_GLOBAL_INFO`: UInt = 4294901763u;
public const val `IP_HOP_LIMIT_EXCEEDED`: UInt = 11013u;
public const val `IP_HW_ERROR`: UInt = 11008u;
public const val `IP_ICMP_ERROR`: UInt = 11044u;
public const val `IP_IFFILTER_INFO`: UInt = 4294901773u;
public const val `IP_IFFILTER_INFO_V6`: UInt = 4294901780u;
// UNSUPPORTED Rust 1466:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_INTERFACE_INFO {
//     pub NumAdapters: i32,
//     pub Adapter: [IP_ADAPTER_INDEX_MAP; 1],
// }

// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_INTERFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_INTERFACE_METRIC_CHANGE`: UInt = 11030u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_INTERFACE_NAME_INFO_W2KSP1` (
    public var `Index`: UInt,
    public var `MediaType`: UInt,
    public var `ConnectionType`: UByte,
    public var `AccessType`: UByte,
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `InterfaceGuid`: `windows_sys`.`core`.`GUID`,
)
public const val `IP_INTERFACE_STATUS_INFO`: UInt = 4294901764u;
public const val `IP_INTERFACE_WOL_CAPABILITY_CHANGE`: UInt = 11033u;
public const val `IP_IN_FILTER_INFO`: UInt = 4294901761u;
public const val `IP_IN_FILTER_INFO_V6`: UInt = 4294901777u;
public const val `IP_IPINIP_CFG_INFO`: UInt = 4294901772u;
public const val `IP_MCAST_BOUNDARY_INFO`: UInt = 4294901771u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_MCAST_COUNTER_INFO` (
    public var `InMcastOctets`: ULong,
    public var `OutMcastOctets`: ULong,
    public var `InMcastPkts`: ULong,
    public var `OutMcastPkts`: ULong,
)
public const val `IP_MCAST_HEARBEAT_INFO`: UInt = 4294901770u;
public const val `IP_MCAST_LIMIT_INFO`: UInt = 4294901774u;
public const val `IP_MEDIA_CONNECT`: UInt = 11024u;
public const val `IP_MEDIA_DISCONNECT`: UInt = 11025u;
public const val `IP_MTU_CHANGE`: UInt = 11021u;
public const val `IP_NEGOTIATING_IPSEC`: UInt = 11032u;
public const val `IP_NETROW`: UInt = 10u;
public const val `IP_NETTABLE`: UInt = 9u;
public const val `IP_NO_RESOURCES`: UInt = 11006u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_OPTION_INFORMATION` (
    public var `Ttl`: UByte,
    public var `Tos`: UByte,
    public var `Flags`: UByte,
    public var `OptionsSize`: UByte,
    public var `OptionsData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1520:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_OPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_OPTION_INFORMATION32` (
    public var `Ttl`: UByte,
    public var `Tos`: UByte,
    public var `Flags`: UByte,
    public var `OptionsSize`: UByte,
    public var `OptionsData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1535:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for IP_OPTION_INFORMATION32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_OPTION_TOO_BIG`: UInt = 11017u;
public const val `IP_OUT_FILTER_INFO`: UInt = 4294901762u;
public const val `IP_OUT_FILTER_INFO_V6`: UInt = 4294901778u;
public const val `IP_PACKET_TOO_BIG`: UInt = 11009u;
public const val `IP_PARAMETER_PROBLEM`: UInt = 11015u;
public const val `IP_PARAM_PROBLEM`: UInt = 11015u;
public const val `IP_PENDING`: UInt = 11255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_PER_ADAPTER_INFO_W2KSP1` (
    public var `AutoconfigEnabled`: UInt,
    public var `AutoconfigActive`: UInt,
    public var `CurrentDnsServer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADDR_STRING`>?,
    public var `DnsServerList`: `IP_ADDR_STRING`,
)
// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_PER_ADAPTER_INFO_W2KSP1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_PROT_PRIORITY_INFO`: UInt = 4294901766u;
public const val `IP_PROT_PRIORITY_INFO_EX`: UInt = 4294901783u;
public const val `IP_REASSEMBLY_TIME_EXCEEDED`: UInt = 11014u;
public const val `IP_RECONFIG_SECFLTR`: UInt = 11031u;
public const val `IP_REQ_TIMED_OUT`: UInt = 11010u;
public const val `IP_ROUTER_DISC_INFO`: UInt = 4294901767u;
public const val `IP_ROUTER_MANAGER_VERSION`: UInt = 1u;
public const val `IP_ROUTE_INFO`: UInt = 4294901765u;
public const val `IP_SOURCE_QUENCH`: UInt = 11016u;
public const val `IP_SPEC_MTU_CHANGE`: UInt = 11020u;
public const val `IP_STATS`: UInt = 3u;
public const val `IP_STATUS_BASE`: UInt = 11000u;
public const val `IP_SUCCESS`: UInt = 0u;
public const val `IP_TIME_EXCEEDED`: UInt = 11041u;
public const val `IP_TTL_EXPIRED_REASSEM`: UInt = 11014u;
public const val `IP_TTL_EXPIRED_TRANSIT`: UInt = 11013u;
public const val `IP_UNBIND_ADAPTER`: UInt = 11027u;
// UNSUPPORTED Rust 1578:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_UNIDIRECTIONAL_ADAPTER_ADDRESS {
//     pub NumAdapters: u32,
//     pub Address: [u32; 1],
// }

// UNSUPPORTED Rust 1584:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IP_UNIDIRECTIONAL_ADAPTER_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_UNLOAD`: UInt = 11022u;
public const val `IP_UNRECOGNIZED_NEXT_HEADER`: UInt = 11043u;
public const val `LB_DST_ADDR_USE_DSTADDR_FLAG`: UInt = 8u;
public const val `LB_DST_ADDR_USE_SRCADDR_FLAG`: UInt = 4u;
public const val `LB_DST_MASK_LATE_FLAG`: UInt = 32u;
public const val `LB_SRC_ADDR_USE_DSTADDR_FLAG`: UInt = 2u;
public const val `LB_SRC_ADDR_USE_SRCADDR_FLAG`: UInt = 1u;
public const val `LB_SRC_MASK_LATE_FLAG`: UInt = 16u;
public const val `MAXLEN_IFDESCR`: UInt = 256u;
public const val `MAXLEN_PHYSADDR`: UInt = 8u;
public const val `MAX_ADAPTER_ADDRESS_LENGTH`: UInt = 8u;
public const val `MAX_ADAPTER_DESCRIPTION_LENGTH`: UInt = 128u;
public const val `MAX_ADAPTER_NAME`: UInt = 128u;
public const val `MAX_ADAPTER_NAME_LENGTH`: UInt = 256u;
public const val `MAX_DHCPV6_DUID_LENGTH`: UInt = 130u;
public const val `MAX_DNS_SUFFIX_STRING_LENGTH`: UInt = 256u;
public const val `MAX_DOMAIN_NAME_LEN`: UInt = 128u;
public const val `MAX_HOSTNAME_LEN`: UInt = 128u;
public const val `MAX_IF_TYPE`: UInt = 281u;
public const val `MAX_INTERFACE_NAME_LEN`: UInt = 256u;
public const val `MAX_IP_STATUS`: UInt = 11050u;
public const val `MAX_MIB_OFFSET`: UInt = 8u;
public const val `MAX_OPT_SIZE`: UInt = 40u;
public const val `MAX_SCOPE_ID_LEN`: UInt = 256u;
public const val `MAX_SCOPE_NAME_LEN`: UInt = 255u;
public const val `MCAST_BOUNDARY`: UInt = 26u;
public const val `MCAST_GLOBAL`: UInt = 24u;
public const val `MCAST_IF_ENTRY`: UInt = 23u;
public const val `MCAST_MFE`: UInt = 18u;
public const val `MCAST_MFE_STATS`: UInt = 19u;
public const val `MCAST_MFE_STATS_EX`: UInt = 35u;
public const val `MCAST_SCOPE`: UInt = 27u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIBICMPINFO` (
    public var `icmpInStats`: `MIBICMPSTATS`,
    public var `icmpOutStats`: `MIBICMPSTATS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIBICMPSTATS` (
    public var `dwMsgs`: UInt,
    public var `dwErrors`: UInt,
    public var `dwDestUnreachs`: UInt,
    public var `dwTimeExcds`: UInt,
    public var `dwParmProbs`: UInt,
    public var `dwSrcQuenchs`: UInt,
    public var `dwRedirects`: UInt,
    public var `dwEchos`: UInt,
    public var `dwEchoReps`: UInt,
    public var `dwTimestamps`: UInt,
    public var `dwTimestampReps`: UInt,
    public var `dwAddrMasks`: UInt,
    public var `dwAddrMaskReps`: UInt,
)
// UNSUPPORTED Rust 1644:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIBICMPSTATS_EX_XPSP1 {
//     pub dwMsgs: u32,
//     pub dwErrors: u32,
//     pub rgdwTypeCount: [u32; 256],
// }

// UNSUPPORTED Rust 1651:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIBICMPSTATS_EX_XPSP1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_ANYCASTIPADDRESS_ROW` (
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `InterfaceIndex`: UInt,
    public var `ScopeId`: `super`.`super`.`Networking`.`WinSock`.`SCOPE_ID`,
)
// UNSUPPORTED Rust 1665:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_ANYCASTIPADDRESS_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1671:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_ANYCASTIPADDRESS_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_ANYCASTIPADDRESS_ROW; 1],
// }

// UNSUPPORTED Rust 1678:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_ANYCASTIPADDRESS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_BEST_IF` (
    public var `dwDestAddr`: UInt,
    public var `dwIfIndex`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_BOUNDARYROW` (
    public var `dwGroupAddress`: UInt,
    public var `dwGroupMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_ICMP` (
    public var `stats`: `MIBICMPINFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_ICMP_EX_XPSP1` (
    public var `icmpInStats`: `MIBICMPSTATS_EX_XPSP1`,
    public var `icmpOutStats`: `MIBICMPSTATS_EX_XPSP1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IFNUMBER` (
    public var `dwValue`: UInt,
)
// UNSUPPORTED Rust 1712:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IFROW {
//     pub wszName: [u16; 256],
//     pub dwIndex: u32,
//     pub dwType: u32,
//     pub dwMtu: u32,
//     pub dwSpeed: u32,
//     pub dwPhysAddrLen: u32,
//     pub bPhysAddr: [u8; 8],
//     pub dwAdminStatus: u32,
//     pub dwOperStatus: INTERNAL_IF_OPER_STATUS,
//     pub dwLastChange: u32,
//     pub dwInOctets: u32,
//     pub dwInUcastPkts: u32,
//     pub dwInNUcastPkts: u32,
//     pub dwInDiscards: u32,
//     pub dwInErrors: u32,
//     pub dwInUnknownProtos: u32,
//     pub dwOutOctets: u32,
//     pub dwOutUcastPkts: u32,
//     pub dwOutNUcastPkts: u32,
//     pub dwOutDiscards: u32,
//     pub dwOutErrors: u32,
//     pub dwOutQLen: u32,
//     pub dwDescrLen: u32,
//     pub bDescr: [u8; 256],
// }

// UNSUPPORTED Rust 1740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IFROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IFSTACK_ROW` (
    public var `HigherLayerInterfaceIndex`: UInt,
    public var `LowerLayerInterfaceIndex`: UInt,
)
// UNSUPPORTED Rust 1751:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IFSTACK_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_IFSTACK_ROW; 1],
// }

// UNSUPPORTED Rust 1757:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IFSTACK_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IFSTATUS` (
    public var `dwIfIndex`: UInt,
    public var `dwAdminStatus`: UInt,
    public var `dwOperationalStatus`: UInt,
    public var `bMHbeatActive`: `windows_sys`.`core`.`BOOL`,
    public var `bMHbeatAlive`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1771:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IFTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IFROW; 1],
// }

// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IFTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIB_IF_ADMIN_STATUS_DOWN`: UInt = 2u;
public const val `MIB_IF_ADMIN_STATUS_TESTING`: UInt = 3u;
public const val `MIB_IF_ADMIN_STATUS_UP`: UInt = 1u;
public typealias `MIB_IF_ENTRY_LEVEL` = Int;
// UNSUPPORTED Rust 1786:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct MIB_IF_ROW2 {
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub InterfaceIndex: u32,
//     pub InterfaceGuid: windows_sys::core::GUID,
//     pub Alias: [u16; 257],
//     pub Description: [u16; 257],
//     pub PhysicalAddressLength: u32,
//     pub PhysicalAddress: [u8; 32],
//     pub PermanentPhysicalAddress: [u8; 32],
//     pub Mtu: u32,
//     pub Type: u32,
//     pub TunnelType: super::Ndis::TUNNEL_TYPE,
//     pub MediaType: super::Ndis::NDIS_MEDIUM,
//     pub PhysicalMediumType: super::Ndis::NDIS_PHYSICAL_MEDIUM,
//     pub AccessType: super::Ndis::NET_IF_ACCESS_TYPE,
//     pub DirectionType: super::Ndis::NET_IF_DIRECTION_TYPE,
//     pub InterfaceAndOperStatusFlags: MIB_IF_ROW2_0,
//     pub OperStatus: super::Ndis::IF_OPER_STATUS,
//     pub AdminStatus: super::Ndis::NET_IF_ADMIN_STATUS,
//     pub MediaConnectState: super::Ndis::NET_IF_MEDIA_CONNECT_STATE,
//     pub NetworkGuid: windows_sys::core::GUID,
//     pub ConnectionType: super::Ndis::NET_IF_CONNECTION_TYPE,
//     pub TransmitLinkSpeed: u64,
//     pub ReceiveLinkSpeed: u64,
//     pub InOctets: u64,
//     pub InUcastPkts: u64,
//     pub InNUcastPkts: u64,
//     pub InDiscards: u64,
//     pub InErrors: u64,
//     pub InUnknownProtos: u64,
//     pub InUcastOctets: u64,
//     pub InMulticastOctets: u64,
//     pub InBroadcastOctets: u64,
//     pub OutOctets: u64,
//     pub OutUcastPkts: u64,
//     pub OutNUcastPkts: u64,
//     pub OutDiscards: u64,
//     pub OutErrors: u64,
//     pub OutUcastOctets: u64,
//     pub OutMulticastOctets: u64,
//     pub OutBroadcastOctets: u64,
//     pub OutQLen: u64,
// }

// UNSUPPORTED Rust 1832:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for MIB_IF_ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IF_ROW2_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 1844:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct MIB_IF_TABLE2 {
//     pub NumEntries: u32,
//     pub Table: [MIB_IF_ROW2; 1],
// }

// UNSUPPORTED Rust 1851:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for MIB_IF_TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MIB_IF_TABLE_LEVEL` = Int;
public const val `MIB_IF_TYPE_ETHERNET`: UInt = 6u;
public const val `MIB_IF_TYPE_FDDI`: UInt = 15u;
public const val `MIB_IF_TYPE_LOOPBACK`: UInt = 24u;
public const val `MIB_IF_TYPE_OTHER`: UInt = 1u;
public const val `MIB_IF_TYPE_PPP`: UInt = 23u;
public const val `MIB_IF_TYPE_SLIP`: UInt = 28u;
public const val `MIB_IF_TYPE_TOKENRING`: UInt = 9u;
public const val `MIB_INVALID_TEREDO_PORT_NUMBER`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_INVERTEDIFSTACK_ROW` (
    public var `LowerLayerInterfaceIndex`: UInt,
    public var `HigherLayerInterfaceIndex`: UInt,
)
// UNSUPPORTED Rust 1872:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_INVERTEDIFSTACK_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_INVERTEDIFSTACK_ROW; 1],
// }

// UNSUPPORTED Rust 1878:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_INVERTEDIFSTACK_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPADDRROW_W2K` (
    public var `dwAddr`: UInt,
    public var `dwIndex`: UInt,
    public var `dwMask`: UInt,
    public var `dwBCastAddr`: UInt,
    public var `dwReasmSize`: UInt,
    public var `unused1`: UShort,
    public var `unused2`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPADDRROW_XP` (
    public var `dwAddr`: UInt,
    public var `dwIndex`: UInt,
    public var `dwMask`: UInt,
    public var `dwBCastAddr`: UInt,
    public var `dwReasmSize`: UInt,
    public var `unused1`: UShort,
    public var `wType`: UShort,
)
// UNSUPPORTED Rust 1905:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPADDRTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPADDRROW_XP; 1],
// }

// UNSUPPORTED Rust 1911:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPADDRTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIB_IPADDR_DELETED`: UInt = 64u;
public const val `MIB_IPADDR_DISCONNECTED`: UInt = 8u;
public const val `MIB_IPADDR_DNS_ELIGIBLE`: UInt = 256u;
public const val `MIB_IPADDR_DYNAMIC`: UInt = 4u;
public const val `MIB_IPADDR_PRIMARY`: UInt = 1u;
public const val `MIB_IPADDR_TRANSIENT`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPDESTROW` (
    public var `ForwardRow`: `MIB_IPFORWARDROW`,
    public var `dwForwardPreference`: UInt,
    public var `dwForwardViewSet`: UInt,
)
// UNSUPPORTED Rust 1930:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPDESTROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1936:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_IPDESTTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPDESTROW; 1],
// }

// UNSUPPORTED Rust 1943:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPDESTTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPFORWARDNUMBER` (
    public var `dwValue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPFORWARDROW` (
    public var `dwForwardDest`: UInt,
    public var `dwForwardMask`: UInt,
    public var `dwForwardPolicy`: UInt,
    public var `dwForwardNextHop`: UInt,
    public var `dwForwardIfIndex`: UInt,
    public var `Anonymous1`: `MIB_IPFORWARDROW_0`,
    public var `Anonymous2`: `MIB_IPFORWARDROW_1`,
    public var `dwForwardAge`: UInt,
    public var `dwForwardNextHopAS`: UInt,
    public var `dwForwardMetric1`: UInt,
    public var `dwForwardMetric2`: UInt,
    public var `dwForwardMetric3`: UInt,
    public var `dwForwardMetric4`: UInt,
    public var `dwForwardMetric5`: UInt,
)
// UNSUPPORTED Rust 1973:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1979:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union MIB_IPFORWARDROW_0 {
//     pub dwForwardType: u32,
//     pub ForwardType: MIB_IPFORWARD_TYPE,
// }

// UNSUPPORTED Rust 1986:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDROW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1992:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union MIB_IPFORWARDROW_1 {
//     pub dwForwardProto: u32,
//     pub ForwardProto: super::super::Networking::WinSock::NL_ROUTE_PROTOCOL,
// }

// UNSUPPORTED Rust 1999:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDROW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2005:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_IPFORWARDTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPFORWARDROW; 1],
// }

// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPFORWARD_ROW2` (
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `InterfaceIndex`: UInt,
    public var `DestinationPrefix`: `IP_ADDRESS_PREFIX`,
    public var `NextHop`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `SitePrefixLength`: UByte,
    public var `ValidLifetime`: UInt,
    public var `PreferredLifetime`: UInt,
    public var `Metric`: UInt,
    public var `Protocol`: `super`.`super`.`Networking`.`WinSock`.`NL_ROUTE_PROTOCOL`,
    public var `Loopback`: Boolean,
    public var `AutoconfigureAddress`: Boolean,
    public var `Publish`: Boolean,
    public var `Immortal`: Boolean,
    public var `Age`: UInt,
    public var `Origin`: `super`.`super`.`Networking`.`WinSock`.`NL_ROUTE_ORIGIN`,
)
// UNSUPPORTED Rust 2038:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPFORWARD_ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2044:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPFORWARD_TABLE2 {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPFORWARD_ROW2; 1],
// }

// UNSUPPORTED Rust 2051:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPFORWARD_TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MIB_IPFORWARD_TYPE` = Int;
// UNSUPPORTED Rust 2058:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPINTERFACE_ROW {
//     pub Family: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub InterfaceIndex: u32,
//     pub MaxReassemblySize: u32,
//     pub InterfaceIdentifier: u64,
//     pub MinRouterAdvertisementInterval: u32,
//     pub MaxRouterAdvertisementInterval: u32,
//     pub AdvertisingEnabled: bool,
//     pub ForwardingEnabled: bool,
//     pub WeakHostSend: bool,
//     pub WeakHostReceive: bool,
//     pub UseAutomaticMetric: bool,
//     pub UseNeighborUnreachabilityDetection: bool,
//     pub ManagedAddressConfigurationSupported: bool,
//     pub OtherStatefulConfigurationSupported: bool,
//     pub AdvertiseDefaultRoute: bool,
//     pub RouterDiscoveryBehavior: super::super::Networking::WinSock::NL_ROUTER_DISCOVERY_BEHAVIOR,
//     pub DadTransmits: u32,
//     pub BaseReachableTime: u32,
//     pub RetransmitTime: u32,
//     pub PathMtuDiscoveryTimeout: u32,
//     pub LinkLocalAddressBehavior: super::super::Networking::WinSock::NL_LINK_LOCAL_ADDRESS_BEHAVIOR,
//     pub LinkLocalAddressTimeout: u32,
//     pub ZoneIndices: [u32; 16],
//     pub SitePrefixLength: u32,
//     pub Metric: u32,
//     pub NlMtu: u32,
//     pub Connected: bool,
//     pub SupportsWakeUpPatterns: bool,
//     pub SupportsNeighborDiscovery: bool,
//     pub SupportsRouterDiscovery: bool,
//     pub ReachableTime: u32,
//     pub TransmitOffload: super::super::Networking::WinSock::NL_INTERFACE_OFFLOAD_ROD,
//     pub ReceiveOffload: super::super::Networking::WinSock::NL_INTERFACE_OFFLOAD_ROD,
//     pub DisableDefaultRoutes: bool,
// }

// UNSUPPORTED Rust 2098:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPINTERFACE_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2104:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPINTERFACE_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPINTERFACE_ROW; 1],
// }

// UNSUPPORTED Rust 2111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPINTERFACE_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPMCAST_BOUNDARY` (
    public var `dwIfIndex`: UInt,
    public var `dwGroupAddress`: UInt,
    public var `dwGroupMask`: UInt,
    public var `dwStatus`: UInt,
)
// UNSUPPORTED Rust 2125:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_BOUNDARY_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_BOUNDARY; 1],
// }

// UNSUPPORTED Rust 2131:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_BOUNDARY_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPMCAST_GLOBAL` (
    public var `dwEnable`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPMCAST_IF_ENTRY` (
    public var `dwIfIndex`: UInt,
    public var `dwTtl`: UInt,
    public var `dwProtocol`: UInt,
    public var `dwRateLimit`: UInt,
    public var `ulInMcastOctets`: UInt,
    public var `ulOutMcastOctets`: UInt,
)
// UNSUPPORTED Rust 2151:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_IF_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_IF_ENTRY; 1],
// }

// UNSUPPORTED Rust 2157:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_IF_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2162:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_MFE {
//     pub dwGroup: u32,
//     pub dwSource: u32,
//     pub dwSrcMask: u32,
//     pub dwUpStrmNgbr: u32,
//     pub dwInIfIndex: u32,
//     pub dwInIfProtocol: u32,
//     pub dwRouteProtocol: u32,
//     pub dwRouteNetwork: u32,
//     pub dwRouteMask: u32,
//     pub ulUpTime: u32,
//     pub ulExpiryTime: u32,
//     pub ulTimeOut: u32,
//     pub ulNumOutIf: u32,
//     pub fFlags: u32,
//     pub dwReserved: u32,
//     pub rgmioOutInfo: [MIB_IPMCAST_OIF_XP; 1],
// }

// UNSUPPORTED Rust 2182:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_MFE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2187:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_MFE_STATS {
//     pub dwGroup: u32,
//     pub dwSource: u32,
//     pub dwSrcMask: u32,
//     pub dwUpStrmNgbr: u32,
//     pub dwInIfIndex: u32,
//     pub dwInIfProtocol: u32,
//     pub dwRouteProtocol: u32,
//     pub dwRouteNetwork: u32,
//     pub dwRouteMask: u32,
//     pub ulUpTime: u32,
//     pub ulExpiryTime: u32,
//     pub ulNumOutIf: u32,
//     pub ulInPkts: u32,
//     pub ulInOctets: u32,
//     pub ulPktsDifferentIf: u32,
//     pub ulQueueOverflow: u32,
//     pub rgmiosOutStats: [MIB_IPMCAST_OIF_STATS_LH; 1],
// }

// UNSUPPORTED Rust 2208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_MFE_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2213:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_MFE_STATS_EX_XP {
//     pub dwGroup: u32,
//     pub dwSource: u32,
//     pub dwSrcMask: u32,
//     pub dwUpStrmNgbr: u32,
//     pub dwInIfIndex: u32,
//     pub dwInIfProtocol: u32,
//     pub dwRouteProtocol: u32,
//     pub dwRouteNetwork: u32,
//     pub dwRouteMask: u32,
//     pub ulUpTime: u32,
//     pub ulExpiryTime: u32,
//     pub ulNumOutIf: u32,
//     pub ulInPkts: u32,
//     pub ulInOctets: u32,
//     pub ulPktsDifferentIf: u32,
//     pub ulQueueOverflow: u32,
//     pub ulUninitMfe: u32,
//     pub ulNegativeMfe: u32,
//     pub ulInDiscards: u32,
//     pub ulInHdrErrors: u32,
//     pub ulTotalOutPackets: u32,
//     pub rgmiosOutStats: [MIB_IPMCAST_OIF_STATS_LH; 1],
// }

// UNSUPPORTED Rust 2239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_MFE_STATS_EX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPMCAST_OIF_STATS_LH` (
    public var `dwOutIfIndex`: UInt,
    public var `dwNextHopAddr`: UInt,
    public var `dwDialContext`: UInt,
    public var `ulTtlTooLow`: UInt,
    public var `ulFragNeeded`: UInt,
    public var `ulOutPackets`: UInt,
    public var `ulOutDiscards`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_OIF_STATS_W2K` (
    public var `dwOutIfIndex`: UInt,
    public var `dwNextHopAddr`: UInt,
    public var `pvDialContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulTtlTooLow`: UInt,
    public var `ulFragNeeded`: UInt,
    public var `ulOutPackets`: UInt,
    public var `ulOutDiscards`: UInt,
)
// UNSUPPORTED Rust 2266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_OIF_STATS_W2K {
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
public class `MIB_IPMCAST_OIF_W2K` (
    public var `dwOutIfIndex`: UInt,
    public var `dwNextHopAddr`: UInt,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 2279:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_OIF_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPMCAST_OIF_XP` (
    public var `dwOutIfIndex`: UInt,
    public var `dwNextHopAddr`: UInt,
    public var `dwReserved`: UInt,
    public var `dwReserved1`: UInt,
)
// UNSUPPORTED Rust 2292:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_SCOPE {
//     pub dwGroupAddress: u32,
//     pub dwGroupMask: u32,
//     pub snNameBuffer: [u16; 256],
//     pub dwStatus: u32,
// }

// UNSUPPORTED Rust 2300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPMCAST_SCOPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2305:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNETROW_LH {
//     pub dwIndex: u32,
//     pub dwPhysAddrLen: u32,
//     pub bPhysAddr: [u8; 8],
//     pub dwAddr: u32,
//     pub Anonymous: MIB_IPNETROW_LH_0,
// }

// UNSUPPORTED Rust 2314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPNETROW_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2319:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_IPNETROW_LH_0 {
//     pub dwType: u32,
//     pub Type: MIB_IPNET_TYPE,
// }

// UNSUPPORTED Rust 2325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPNETROW_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2330:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNETROW_W2K {
//     pub dwIndex: u32,
//     pub dwPhysAddrLen: u32,
//     pub bPhysAddr: [u8; 8],
//     pub dwAddr: u32,
//     pub dwType: u32,
// }

// UNSUPPORTED Rust 2339:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPNETROW_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2344:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNETTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPNETROW_LH; 1],
// }

// UNSUPPORTED Rust 2350:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPNETTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2355:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNET_ROW2 {
//     pub Address: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub InterfaceIndex: u32,
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub PhysicalAddress: [u8; 32],
//     pub PhysicalAddressLength: u32,
//     pub State: super::super::Networking::WinSock::NL_NEIGHBOR_STATE,
//     pub Anonymous: MIB_IPNET_ROW2_0,
//     pub ReachabilityTime: MIB_IPNET_ROW2_1,
// }

// UNSUPPORTED Rust 2368:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2374:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPNET_ROW2_0 {
//     pub Anonymous: MIB_IPNET_ROW2_0_0,
//     pub Flags: u8,
// }

// UNSUPPORTED Rust 2381:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_ROW2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPNET_ROW2_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 2393:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPNET_ROW2_1 {
//     pub LastReachable: u32,
//     pub LastUnreachable: u32,
// }

// UNSUPPORTED Rust 2400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_ROW2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2406:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNET_TABLE2 {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPNET_ROW2; 1],
// }

// UNSUPPORTED Rust 2413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MIB_IPNET_TYPE` = Int;
public const val `MIB_IPNET_TYPE_DYNAMIC`: `MIB_IPNET_TYPE` = 3;
public const val `MIB_IPNET_TYPE_INVALID`: `MIB_IPNET_TYPE` = 2;
public const val `MIB_IPNET_TYPE_OTHER`: `MIB_IPNET_TYPE` = 1;
public const val `MIB_IPNET_TYPE_STATIC`: `MIB_IPNET_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPPATH_ROW` (
    public var `Source`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `Destination`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `InterfaceIndex`: UInt,
    public var `CurrentNextHop`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `PathMtu`: UInt,
    public var `RttMean`: UInt,
    public var `RttDeviation`: UInt,
    public var `Anonymous`: `MIB_IPPATH_ROW_0`,
    public var `IsReachable`: Boolean,
    public var `LinkTransmitSpeed`: ULong,
    public var `LinkReceiveSpeed`: ULong,
)
// UNSUPPORTED Rust 2441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPPATH_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2447:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPPATH_ROW_0 {
//     pub LastReachable: u32,
//     pub LastUnreachable: u32,
// }

// UNSUPPORTED Rust 2454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPPATH_ROW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2460:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPPATH_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPPATH_ROW; 1],
// }

// UNSUPPORTED Rust 2467:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPPATH_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIB_IPROUTE_METRIC_UNUSED`: UInt = 4294967295u;
public const val `MIB_IPROUTE_TYPE_DIRECT`: `MIB_IPFORWARD_TYPE` = 3;
public const val `MIB_IPROUTE_TYPE_INDIRECT`: `MIB_IPFORWARD_TYPE` = 4;
public const val `MIB_IPROUTE_TYPE_INVALID`: `MIB_IPFORWARD_TYPE` = 2;
public const val `MIB_IPROUTE_TYPE_OTHER`: `MIB_IPFORWARD_TYPE` = 1;
public typealias `MIB_IPSTATS_FORWARDING` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPSTATS_LH` (
    public var `Anonymous`: `MIB_IPSTATS_LH_0`,
    public var `dwDefaultTTL`: UInt,
    public var `dwInReceives`: UInt,
    public var `dwInHdrErrors`: UInt,
    public var `dwInAddrErrors`: UInt,
    public var `dwForwDatagrams`: UInt,
    public var `dwInUnknownProtos`: UInt,
    public var `dwInDiscards`: UInt,
    public var `dwInDelivers`: UInt,
    public var `dwOutRequests`: UInt,
    public var `dwRoutingDiscards`: UInt,
    public var `dwOutDiscards`: UInt,
    public var `dwOutNoRoutes`: UInt,
    public var `dwReasmTimeout`: UInt,
    public var `dwReasmReqds`: UInt,
    public var `dwReasmOks`: UInt,
    public var `dwReasmFails`: UInt,
    public var `dwFragOks`: UInt,
    public var `dwFragFails`: UInt,
    public var `dwFragCreates`: UInt,
    public var `dwNumIf`: UInt,
    public var `dwNumAddr`: UInt,
    public var `dwNumRoutes`: UInt,
)
// UNSUPPORTED Rust 2506:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPSTATS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2511:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_IPSTATS_LH_0 {
//     pub dwForwarding: u32,
//     pub Forwarding: MIB_IPSTATS_FORWARDING,
// }

// UNSUPPORTED Rust 2517:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_IPSTATS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IPSTATS_W2K` (
    public var `dwForwarding`: UInt,
    public var `dwDefaultTTL`: UInt,
    public var `dwInReceives`: UInt,
    public var `dwInHdrErrors`: UInt,
    public var `dwInAddrErrors`: UInt,
    public var `dwForwDatagrams`: UInt,
    public var `dwInUnknownProtos`: UInt,
    public var `dwInDiscards`: UInt,
    public var `dwInDelivers`: UInt,
    public var `dwOutRequests`: UInt,
    public var `dwRoutingDiscards`: UInt,
    public var `dwOutDiscards`: UInt,
    public var `dwOutNoRoutes`: UInt,
    public var `dwReasmTimeout`: UInt,
    public var `dwReasmReqds`: UInt,
    public var `dwReasmOks`: UInt,
    public var `dwReasmFails`: UInt,
    public var `dwFragOks`: UInt,
    public var `dwFragFails`: UInt,
    public var `dwFragCreates`: UInt,
    public var `dwNumIf`: UInt,
    public var `dwNumAddr`: UInt,
    public var `dwNumRoutes`: UInt,
)
public const val `MIB_IP_FORWARDING`: `MIB_IPSTATS_FORWARDING` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IP_NETWORK_CONNECTION_BANDWIDTH_ESTIMATES` (
    public var `InboundBandwidthInformation`: `super`.`super`.`Networking`.`WinSock`.`NL_BANDWIDTH_INFORMATION`,
    public var `OutboundBandwidthInformation`: `super`.`super`.`Networking`.`WinSock`.`NL_BANDWIDTH_INFORMATION`,
)
public const val `MIB_IP_NOT_FORWARDING`: `MIB_IPSTATS_FORWARDING` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_MCAST_LIMIT_ROW` (
    public var `dwTtl`: UInt,
    public var `dwRateLimit`: UInt,
)
// UNSUPPORTED Rust 2564:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_MFE_STATS_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_MFE_STATS; 1],
// }

// UNSUPPORTED Rust 2570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_MFE_STATS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2575:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_MFE_STATS_TABLE_EX_XP {
//     pub dwNumEntries: u32,
//     pub table: [*mut MIB_IPMCAST_MFE_STATS_EX_XP; 1],
// }

// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_MFE_STATS_TABLE_EX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2586:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_MFE_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_MFE; 1],
// }

// UNSUPPORTED Rust 2592:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_MFE_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_MULTICASTIPADDRESS_ROW` (
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `InterfaceIndex`: UInt,
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `ScopeId`: `super`.`super`.`Networking`.`WinSock`.`SCOPE_ID`,
)
// UNSUPPORTED Rust 2606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_MULTICASTIPADDRESS_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2612:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_MULTICASTIPADDRESS_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_MULTICASTIPADDRESS_ROW; 1],
// }

// UNSUPPORTED Rust 2619:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_MULTICASTIPADDRESS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MIB_NOTIFICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_OPAQUE_INFO` (
    public var `dwId`: UInt,
    public var `Anonymous`: `MIB_OPAQUE_INFO_0`,
)
// UNSUPPORTED Rust 2632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_OPAQUE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2637:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_OPAQUE_INFO_0 {
//     pub ullAlign: u64,
//     pub rgbyData: [u8; 1],
// }

// UNSUPPORTED Rust 2643:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_OPAQUE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2648:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_OPAQUE_QUERY {
//     pub dwVarId: u32,
//     pub rgdwVarIndex: [u32; 1],
// }

// UNSUPPORTED Rust 2654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_OPAQUE_QUERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_PROXYARP` (
    public var `dwAddress`: UInt,
    public var `dwMask`: UInt,
    public var `dwIfIndex`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_ROUTESTATE` (
    public var `bRoutesSetToStack`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6ROW` (
    public var `State`: `MIB_TCP_STATE`,
    public var `LocalAddr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `RemoteAddr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwRemoteScopeId`: UInt,
    public var `dwRemotePort`: UInt,
)
// UNSUPPORTED Rust 2683:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6ROW {
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
public class `MIB_TCP6ROW2` (
    public var `LocalAddr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `RemoteAddr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwRemoteScopeId`: UInt,
    public var `dwRemotePort`: UInt,
    public var `State`: `MIB_TCP_STATE`,
    public var `dwOwningPid`: UInt,
    public var `dwOffloadState`: `TCP_CONNECTION_OFFLOAD_STATE`,
)
// UNSUPPORTED Rust 2703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6ROW_OWNER_MODULE {
//     pub ucLocalAddr: [u8; 16],
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub ucRemoteAddr: [u8; 16],
//     pub dwRemoteScopeId: u32,
//     pub dwRemotePort: u32,
//     pub dwState: u32,
//     pub dwOwningPid: u32,
//     pub liCreateTimestamp: i64,
//     pub OwningModuleInfo: [u64; 16],
// }

// UNSUPPORTED Rust 2723:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCP6ROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2728:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6ROW_OWNER_PID {
//     pub ucLocalAddr: [u8; 16],
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub ucRemoteAddr: [u8; 16],
//     pub dwRemoteScopeId: u32,
//     pub dwRemotePort: u32,
//     pub dwState: u32,
//     pub dwOwningPid: u32,
// }

// UNSUPPORTED Rust 2740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCP6ROW_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2745:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW; 1],
// }

// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2758:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW2; 1],
// }

// UNSUPPORTED Rust 2765:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2771:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 2777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCP6TABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2782:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 2788:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCP6TABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_TCPROW2` (
    public var `dwState`: UInt,
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwRemoteAddr`: UInt,
    public var `dwRemotePort`: UInt,
    public var `dwOwningPid`: UInt,
    public var `dwOffloadState`: `TCP_CONNECTION_OFFLOAD_STATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPROW_LH` (
    public var `Anonymous`: `MIB_TCPROW_LH_0`,
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwRemoteAddr`: UInt,
    public var `dwRemotePort`: UInt,
)
// UNSUPPORTED Rust 2813:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPROW_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2818:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_TCPROW_LH_0 {
//     pub dwState: u32,
//     pub State: MIB_TCP_STATE,
// }

// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPROW_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2829:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPROW_OWNER_MODULE {
//     pub dwState: u32,
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwRemoteAddr: u32,
//     pub dwRemotePort: u32,
//     pub dwOwningPid: u32,
//     pub liCreateTimestamp: i64,
//     pub OwningModuleInfo: [u64; 16],
// }

// UNSUPPORTED Rust 2841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_TCPROW_OWNER_PID` (
    public var `dwState`: UInt,
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwRemoteAddr`: UInt,
    public var `dwRemotePort`: UInt,
    public var `dwOwningPid`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_TCPROW_W2K` (
    public var `dwState`: UInt,
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwRemoteAddr`: UInt,
    public var `dwRemotePort`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_TCPSTATS2` (
    public var `RtoAlgorithm`: `TCP_RTO_ALGORITHM`,
    public var `dwRtoMin`: UInt,
    public var `dwRtoMax`: UInt,
    public var `dwMaxConn`: UInt,
    public var `dwActiveOpens`: UInt,
    public var `dwPassiveOpens`: UInt,
    public var `dwAttemptFails`: UInt,
    public var `dwEstabResets`: UInt,
    public var `dwCurrEstab`: UInt,
    public var `dw64InSegs`: ULong,
    public var `dw64OutSegs`: ULong,
    public var `dwRetransSegs`: UInt,
    public var `dwInErrs`: UInt,
    public var `dwOutRsts`: UInt,
    public var `dwNumConns`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPSTATS_LH` (
    public var `Anonymous`: `MIB_TCPSTATS_LH_0`,
    public var `dwRtoMin`: UInt,
    public var `dwRtoMax`: UInt,
    public var `dwMaxConn`: UInt,
    public var `dwActiveOpens`: UInt,
    public var `dwPassiveOpens`: UInt,
    public var `dwAttemptFails`: UInt,
    public var `dwEstabResets`: UInt,
    public var `dwCurrEstab`: UInt,
    public var `dwInSegs`: UInt,
    public var `dwOutSegs`: UInt,
    public var `dwRetransSegs`: UInt,
    public var `dwInErrs`: UInt,
    public var `dwOutRsts`: UInt,
    public var `dwNumConns`: UInt,
)
// UNSUPPORTED Rust 2903:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPSTATS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2908:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_TCPSTATS_LH_0 {
//     pub dwRtoAlgorithm: u32,
//     pub RtoAlgorithm: TCP_RTO_ALGORITHM,
// }

// UNSUPPORTED Rust 2914:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPSTATS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_TCPSTATS_W2K` (
    public var `dwRtoAlgorithm`: UInt,
    public var `dwRtoMin`: UInt,
    public var `dwRtoMax`: UInt,
    public var `dwMaxConn`: UInt,
    public var `dwActiveOpens`: UInt,
    public var `dwPassiveOpens`: UInt,
    public var `dwAttemptFails`: UInt,
    public var `dwEstabResets`: UInt,
    public var `dwCurrEstab`: UInt,
    public var `dwInSegs`: UInt,
    public var `dwOutSegs`: UInt,
    public var `dwRetransSegs`: UInt,
    public var `dwInErrs`: UInt,
    public var `dwOutRsts`: UInt,
    public var `dwNumConns`: UInt,
)
// UNSUPPORTED Rust 2938:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW_LH; 1],
// }

// UNSUPPORTED Rust 2944:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2949:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW2; 1],
// }

// UNSUPPORTED Rust 2955:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPTABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2960:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 2966:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPTABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2971:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 2977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_TCPTABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIB_TCP_RTO_CONSTANT`: `TCP_RTO_ALGORITHM` = 2;
public const val `MIB_TCP_RTO_OTHER`: `TCP_RTO_ALGORITHM` = 1;
public const val `MIB_TCP_RTO_RSRE`: `TCP_RTO_ALGORITHM` = 3;
public const val `MIB_TCP_RTO_VANJ`: `TCP_RTO_ALGORITHM` = 4;
public typealias `MIB_TCP_STATE` = Int;
public const val `MIB_TCP_STATE_CLOSED`: `MIB_TCP_STATE` = 1;
public const val `MIB_TCP_STATE_CLOSE_WAIT`: `MIB_TCP_STATE` = 8;
public const val `MIB_TCP_STATE_CLOSING`: `MIB_TCP_STATE` = 9;
public const val `MIB_TCP_STATE_DELETE_TCB`: `MIB_TCP_STATE` = 12;
public const val `MIB_TCP_STATE_ESTAB`: `MIB_TCP_STATE` = 5;
public const val `MIB_TCP_STATE_FIN_WAIT1`: `MIB_TCP_STATE` = 6;
public const val `MIB_TCP_STATE_FIN_WAIT2`: `MIB_TCP_STATE` = 7;
public const val `MIB_TCP_STATE_LAST_ACK`: `MIB_TCP_STATE` = 10;
public const val `MIB_TCP_STATE_LISTEN`: `MIB_TCP_STATE` = 2;
public const val `MIB_TCP_STATE_RESERVED`: `MIB_TCP_STATE` = 100;
public const val `MIB_TCP_STATE_SYN_RCVD`: `MIB_TCP_STATE` = 4;
public const val `MIB_TCP_STATE_SYN_SENT`: `MIB_TCP_STATE` = 3;
public const val `MIB_TCP_STATE_TIME_WAIT`: `MIB_TCP_STATE` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6ROW` (
    public var `dwLocalAddr`: `super`.`super`.`Networking`.`WinSock`.`IN6_ADDR`,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
)
// UNSUPPORTED Rust 3008:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_UDP6ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3014:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6ROW2 {
//     pub ucLocalAddr: [u8; 16],
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
//     pub liCreateTimestamp: i64,
//     pub Anonymous: MIB_UDP6ROW2_0,
//     pub OwningModuleInfo: [u64; 16],
//     pub ucRemoteAddr: [u8; 16],
//     pub dwRemoteScopeId: u32,
//     pub dwRemotePort: u32,
// }

// UNSUPPORTED Rust 3028:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3033:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDP6ROW2_0 {
//     pub Anonymous: MIB_UDP6ROW2_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3039:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6ROW2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDP6ROW2_0_0` (
    public var `_bitfield`: Int,
)
// UNSUPPORTED Rust 3049:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6ROW_OWNER_MODULE {
//     pub ucLocalAddr: [u8; 16],
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
//     pub liCreateTimestamp: i64,
//     pub Anonymous: MIB_UDP6ROW_OWNER_MODULE_0,
//     pub OwningModuleInfo: [u64; 16],
// }

// UNSUPPORTED Rust 3060:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6ROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3065:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDP6ROW_OWNER_MODULE_0 {
//     pub Anonymous: MIB_UDP6ROW_OWNER_MODULE_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3071:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6ROW_OWNER_MODULE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDP6ROW_OWNER_MODULE_0_0` (
    public var `_bitfield`: Int,
)
// UNSUPPORTED Rust 3081:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6ROW_OWNER_PID {
//     pub ucLocalAddr: [u8; 16],
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
// }

// UNSUPPORTED Rust 3089:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6ROW_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3094:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW; 1],
// }

// UNSUPPORTED Rust 3101:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_UDP6TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3107:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW2; 1],
// }

// UNSUPPORTED Rust 3113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3118:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 3124:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6TABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3129:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 3135:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDP6TABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPROW` (
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
)
// UNSUPPORTED Rust 3146:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPROW2 {
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
//     pub liCreateTimestamp: i64,
//     pub Anonymous: MIB_UDPROW2_0,
//     pub OwningModuleInfo: [u64; 16],
//     pub dwRemoteAddr: u32,
//     pub dwRemotePort: u32,
// }

// UNSUPPORTED Rust 3158:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3163:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDPROW2_0 {
//     pub Anonymous: MIB_UDPROW2_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3169:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPROW2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPROW2_0_0` (
    public var `_bitfield`: Int,
)
// UNSUPPORTED Rust 3179:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPROW_OWNER_MODULE {
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
//     pub liCreateTimestamp: i64,
//     pub Anonymous: MIB_UDPROW_OWNER_MODULE_0,
//     pub OwningModuleInfo: [u64; 16],
// }

// UNSUPPORTED Rust 3189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3194:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDPROW_OWNER_MODULE_0 {
//     pub Anonymous: MIB_UDPROW_OWNER_MODULE_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3200:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPROW_OWNER_MODULE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPROW_OWNER_MODULE_0_0` (
    public var `_bitfield`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPROW_OWNER_PID` (
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwOwningPid`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPSTATS` (
    public var `dwInDatagrams`: UInt,
    public var `dwNoPorts`: UInt,
    public var `dwInErrors`: UInt,
    public var `dwOutDatagrams`: UInt,
    public var `dwNumAddrs`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPSTATS2` (
    public var `dw64InDatagrams`: ULong,
    public var `dwNoPorts`: UInt,
    public var `dwInErrors`: UInt,
    public var `dw64OutDatagrams`: ULong,
    public var `dwNumAddrs`: UInt,
)
// UNSUPPORTED Rust 3235:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW; 1],
// }

// UNSUPPORTED Rust 3241:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3246:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW2; 1],
// }

// UNSUPPORTED Rust 3252:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPTABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3257:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 3263:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPTABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3268:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 3274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MIB_UDPTABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UNICASTIPADDRESS_ROW` (
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `InterfaceIndex`: UInt,
    public var `PrefixOrigin`: `super`.`super`.`Networking`.`WinSock`.`NL_PREFIX_ORIGIN`,
    public var `SuffixOrigin`: `super`.`super`.`Networking`.`WinSock`.`NL_SUFFIX_ORIGIN`,
    public var `ValidLifetime`: UInt,
    public var `PreferredLifetime`: UInt,
    public var `OnLinkPrefixLength`: UByte,
    public var `SkipAsSource`: Boolean,
    public var `DadState`: `super`.`super`.`Networking`.`WinSock`.`NL_DAD_STATE`,
    public var `ScopeId`: `super`.`super`.`Networking`.`WinSock`.`SCOPE_ID`,
    public var `CreationTimeStamp`: Long,
)
// UNSUPPORTED Rust 3296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_UNICASTIPADDRESS_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3302:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_UNICASTIPADDRESS_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_UNICASTIPADDRESS_ROW; 1],
// }

// UNSUPPORTED Rust 3309:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_UNICASTIPADDRESS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIB_USE_CURRENT_FORWARDING`: UInt = 4294967295u;
public const val `MIB_USE_CURRENT_TTL`: UInt = 4294967295u;
public const val `MIN_IF_TYPE`: UInt = 1u;
public const val `MIXED_NODETYPE`: UInt = 4u;
public const val `MibAddInstance`: `MIB_NOTIFICATION_TYPE` = 1;
public const val `MibDeleteInstance`: `MIB_NOTIFICATION_TYPE` = 2;
public const val `MibIfEntryNormal`: `MIB_IF_ENTRY_LEVEL` = 0;
public const val `MibIfEntryNormalWithoutStatistics`: `MIB_IF_ENTRY_LEVEL` = 2;
public const val `MibIfTableNormal`: `MIB_IF_TABLE_LEVEL` = 0;
public const val `MibIfTableNormalWithoutStatistics`: `MIB_IF_TABLE_LEVEL` = 2;
public const val `MibIfTableRaw`: `MIB_IF_TABLE_LEVEL` = 1;
public const val `MibInitialNotification`: `MIB_NOTIFICATION_TYPE` = 3;
public const val `MibParameterNotification`: `MIB_NOTIFICATION_TYPE` = 0;
public const val `ND_NEIGHBOR_ADVERT`: `ICMP6_TYPE` = 136;
public const val `ND_NEIGHBOR_SOLICIT`: `ICMP6_TYPE` = 135;
public const val `ND_REDIRECT`: `ICMP6_TYPE` = 137;
public const val `ND_ROUTER_ADVERT`: `ICMP6_TYPE` = 134;
public const val `ND_ROUTER_SOLICIT`: `ICMP6_TYPE` = 133;
public const val `NET_ADDRESS_DNS_NAME`: `NET_ADDRESS_FORMAT` = 1;
public typealias `NET_ADDRESS_FORMAT` = Int;
public const val `NET_ADDRESS_FORMAT_UNSPECIFIED`: `NET_ADDRESS_FORMAT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NET_ADDRESS_INFO` (
    public var `Format`: `NET_ADDRESS_FORMAT`,
    public var `Anonymous`: `NET_ADDRESS_INFO_0`,
)
// UNSUPPORTED Rust 3343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for NET_ADDRESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3349:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union NET_ADDRESS_INFO_0 {
//     pub NamedAddress: NET_ADDRESS_INFO_0_0,
//     pub Ipv4Address: super::super::Networking::WinSock::SOCKADDR_IN,
//     pub Ipv6Address: super::super::Networking::WinSock::SOCKADDR_IN6,
//     pub IpAddress: super::super::Networking::WinSock::SOCKADDR,
// }

// UNSUPPORTED Rust 3358:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for NET_ADDRESS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3364:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct NET_ADDRESS_INFO_0_0 {
//     pub Address: [u16; 256],
//     pub Port: [u16; 6],
// }

// UNSUPPORTED Rust 3371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for NET_ADDRESS_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NET_ADDRESS_IPV4`: `NET_ADDRESS_FORMAT` = 2;
public const val `NET_ADDRESS_IPV6`: `NET_ADDRESS_FORMAT` = 3;
public const val `NET_STRING_IPV4_ADDRESS`: UInt = 1u;
public const val `NET_STRING_IPV4_NETWORK`: UInt = 4u;
public const val `NET_STRING_IPV4_SERVICE`: UInt = 2u;
public const val `NET_STRING_IPV6_ADDRESS`: UInt = 8u;
public const val `NET_STRING_IPV6_ADDRESS_NO_SCOPE`: UInt = 16u;
public const val `NET_STRING_IPV6_NETWORK`: UInt = 128u;
public const val `NET_STRING_IPV6_SERVICE`: UInt = 32u;
public const val `NET_STRING_IPV6_SERVICE_NO_SCOPE`: UInt = 64u;
public const val `NET_STRING_NAMED_ADDRESS`: UInt = 256u;
public const val `NET_STRING_NAMED_SERVICE`: UInt = 512u;
public const val `NUMBER_OF_EXPORTED_VARIABLES`: UInt = 39u;
public const val `PEER_TO_PEER_NODETYPE`: UInt = 2u;
public typealias `PFADDRESSTYPE` = Int;
public const val `PFERROR_BUFFER_TOO_SMALL`: UInt = 23002u;
public const val `PFERROR_NO_FILTERS_GIVEN`: UInt = 23001u;
public const val `PFERROR_NO_PF_INTERFACE`: UInt = 23000u;
public typealias `PFFORWARD_ACTION` = Int;
public typealias `PFFRAMETYPE` = Int;
public const val `PFFT_FILTER`: `PFFRAMETYPE` = 1;
public const val `PFFT_FRAG`: `PFFRAMETYPE` = 2;
public const val `PFFT_SPOOF`: `PFFRAMETYPE` = 3;
// UNSUPPORTED Rust 3400:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PFLOGFRAME {
//     pub Timestamp: i64,
//     pub pfeTypeOfFrame: PFFRAMETYPE,
//     pub dwTotalSizeUsed: u32,
//     pub dwFilterRule: u32,
//     pub wSizeOfAdditionalData: u16,
//     pub wSizeOfIpHeader: u16,
//     pub dwInterfaceName: u32,
//     pub dwIPIndex: u32,
//     pub bPacketData: [u8; 1],
// }

// UNSUPPORTED Rust 3413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PFLOGFRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PF_ACTION_DROP`: `PFFORWARD_ACTION` = 1;
public const val `PF_ACTION_FORWARD`: `PFFORWARD_ACTION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PF_FILTER_DESCRIPTOR` (
    public var `dwFilterFlags`: UInt,
    public var `dwRule`: UInt,
    public var `pfatType`: `PFADDRESSTYPE`,
    public var `SrcAddr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `SrcMask`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DstAddr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DstMask`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwProtocol`: UInt,
    public var `fLateBound`: UInt,
    public var `wSrcPort`: UShort,
    public var `wDstPort`: UShort,
    public var `wSrcPortHighRange`: UShort,
    public var `wDstPortHighRange`: UShort,
)
// UNSUPPORTED Rust 3437:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PF_FILTER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PF_FILTER_STATS` (
    public var `dwNumPacketsFiltered`: UInt,
    public var `info`: `PF_FILTER_DESCRIPTOR`,
)
// UNSUPPORTED Rust 3448:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PF_INTERFACE_STATS {
//     pub pvDriverContext: *mut core::ffi::c_void,
//     pub dwFlags: u32,
//     pub dwInDrops: u32,
//     pub dwOutDrops: u32,
//     pub eaInAction: PFFORWARD_ACTION,
//     pub eaOutAction: PFFORWARD_ACTION,
//     pub dwNumInFilters: u32,
//     pub dwNumOutFilters: u32,
//     pub dwFrag: u32,
//     pub dwSpoof: u32,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub liSYN: i64,
//     pub liTotalLogged: i64,
//     pub dwLostLogEntries: u32,
//     pub FilterInfo: [PF_FILTER_STATS; 1],
// }

// UNSUPPORTED Rust 3468:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PF_INTERFACE_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PF_IPV4`: `PFADDRESSTYPE` = 0;
public const val `PF_IPV6`: `PFADDRESSTYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PF_LATEBIND_INFO` (
    public var `SrcAddr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DstAddr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Mask`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 3482:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PF_LATEBIND_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public typealias `PIPFORWARD_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPFORWARD_ROW2`>?, `MIB_NOTIFICATION_TYPE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public typealias `PIPINTERFACE_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_IPINTERFACE_ROW`>?, `MIB_NOTIFICATION_TYPE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public typealias `PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Networking`.`WinSock`.`NL_NETWORK_CONNECTIVITY_HINT`) -> Unit>>>;
public const val `PROXY_ARP`: UInt = 22u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public typealias `PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_TABLE`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PTEREDO_PORT_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UShort, `MIB_NOTIFICATION_TYPE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
public typealias `PUNICAST_IPADDRESS_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MIB_UNICASTIPADDRESS_ROW`>?, `MIB_NOTIFICATION_TYPE`) -> Unit>>>;
public const val `ROUTE_LONGER`: UInt = 32u;
public const val `ROUTE_MATCHING`: UInt = 31u;
public const val `ROUTE_SHORTER`: UInt = 33u;
public const val `ROUTE_STATE`: UInt = 34u;
public const val `TCP6_STATS`: UInt = 38u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCPIP_OWNER_MODULE_BASIC_INFO` (
    public var `pModuleName`: `windows_sys`.`core`.`PWSTR`,
    public var `pModulePath`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3511:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCPIP_OWNER_MODULE_BASIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TCPIP_OWNER_MODULE_INFO_BASIC`: `TCPIP_OWNER_MODULE_INFO_CLASS` = 0;
public typealias `TCPIP_OWNER_MODULE_INFO_CLASS` = Int;
public const val `TCPIP_OWNING_MODULE_SIZE`: UInt = 16u;
public typealias `TCP_BOOLEAN_OPTIONAL` = Int;
public typealias `TCP_CONNECTION_OFFLOAD_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_BANDWIDTH_ROD_v0` (
    public var `OutboundBandwidth`: ULong,
    public var `InboundBandwidth`: ULong,
    public var `OutboundInstability`: ULong,
    public var `InboundInstability`: ULong,
    public var `OutboundBandwidthPeaked`: Boolean,
    public var `InboundBandwidthPeaked`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_BANDWIDTH_RW_v0` (
    public var `EnableCollectionOutbound`: `TCP_BOOLEAN_OPTIONAL`,
    public var `EnableCollectionInbound`: `TCP_BOOLEAN_OPTIONAL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_DATA_ROD_v0` (
    public var `DataBytesOut`: ULong,
    public var `DataSegsOut`: ULong,
    public var `DataBytesIn`: ULong,
    public var `DataSegsIn`: ULong,
    public var `SegsOut`: ULong,
    public var `SegsIn`: ULong,
    public var `SoftErrors`: UInt,
    public var `SoftErrorReason`: UInt,
    public var `SndUna`: UInt,
    public var `SndNxt`: UInt,
    public var `SndMax`: UInt,
    public var `ThruBytesAcked`: ULong,
    public var `RcvNxt`: UInt,
    public var `ThruBytesReceived`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_DATA_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_FINE_RTT_ROD_v0` (
    public var `RttVar`: UInt,
    public var `MaxRtt`: UInt,
    public var `MinRtt`: UInt,
    public var `SumRtt`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_FINE_RTT_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_OBS_REC_ROD_v0` (
    public var `CurRwinRcvd`: UInt,
    public var `MaxRwinRcvd`: UInt,
    public var `MinRwinRcvd`: UInt,
    public var `WinScaleRcvd`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_OBS_REC_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_PATH_ROD_v0` (
    public var `FastRetran`: UInt,
    public var `Timeouts`: UInt,
    public var `SubsequentTimeouts`: UInt,
    public var `CurTimeoutCount`: UInt,
    public var `AbruptTimeouts`: UInt,
    public var `PktsRetrans`: UInt,
    public var `BytesRetrans`: UInt,
    public var `DupAcksIn`: UInt,
    public var `SacksRcvd`: UInt,
    public var `SackBlocksRcvd`: UInt,
    public var `CongSignals`: UInt,
    public var `PreCongSumCwnd`: UInt,
    public var `PreCongSumRtt`: UInt,
    public var `PostCongSumRtt`: UInt,
    public var `PostCongCountRtt`: UInt,
    public var `EcnSignals`: UInt,
    public var `EceRcvd`: UInt,
    public var `SendStall`: UInt,
    public var `QuenchRcvd`: UInt,
    public var `RetranThresh`: UInt,
    public var `SndDupAckEpisodes`: UInt,
    public var `SumBytesReordered`: UInt,
    public var `NonRecovDa`: UInt,
    public var `NonRecovDaEpisodes`: UInt,
    public var `AckAfterFr`: UInt,
    public var `DsackDups`: UInt,
    public var `SampleRtt`: UInt,
    public var `SmoothedRtt`: UInt,
    public var `RttVar`: UInt,
    public var `MaxRtt`: UInt,
    public var `MinRtt`: UInt,
    public var `SumRtt`: UInt,
    public var `CountRtt`: UInt,
    public var `CurRto`: UInt,
    public var `MaxRto`: UInt,
    public var `MinRto`: UInt,
    public var `CurMss`: UInt,
    public var `MaxMss`: UInt,
    public var `MinMss`: UInt,
    public var `SpuriousRtoDetections`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_PATH_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_REC_ROD_v0` (
    public var `CurRwinSent`: UInt,
    public var `MaxRwinSent`: UInt,
    public var `MinRwinSent`: UInt,
    public var `LimRwin`: UInt,
    public var `DupAckEpisodes`: UInt,
    public var `DupAcksOut`: UInt,
    public var `CeRcvd`: UInt,
    public var `EcnSent`: UInt,
    public var `EcnNoncesRcvd`: UInt,
    public var `CurReasmQueue`: UInt,
    public var `MaxReasmQueue`: UInt,
    public var `CurAppRQueue`: ULong,
    public var `MaxAppRQueue`: ULong,
    public var `WinScaleSent`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_REC_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_SEND_BUFF_ROD_v0` (
    public var `CurRetxQueue`: ULong,
    public var `MaxRetxQueue`: ULong,
    public var `CurAppWQueue`: ULong,
    public var `MaxAppWQueue`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_SEND_BUFF_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_SND_CONG_ROD_v0` (
    public var `SndLimTransRwin`: UInt,
    public var `SndLimTimeRwin`: UInt,
    public var `SndLimBytesRwin`: ULong,
    public var `SndLimTransCwnd`: UInt,
    public var `SndLimTimeCwnd`: UInt,
    public var `SndLimBytesCwnd`: ULong,
    public var `SndLimTransSnd`: UInt,
    public var `SndLimTimeSnd`: UInt,
    public var `SndLimBytesSnd`: ULong,
    public var `SlowStart`: UInt,
    public var `CongAvoid`: UInt,
    public var `OtherReductions`: UInt,
    public var `CurCwnd`: UInt,
    public var `MaxSsCwnd`: UInt,
    public var `MaxCaCwnd`: UInt,
    public var `CurSsthresh`: UInt,
    public var `MaxSsthresh`: UInt,
    public var `MinSsthresh`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_SND_CONG_ROS_v0` (
    public var `LimCwnd`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_SND_CONG_RW_v0` (
    public var `EnableCollection`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_ESTATS_SYN_OPTS_ROS_v0` (
    public var `ActiveOpen`: Boolean,
    public var `MssRcvd`: UInt,
    public var `MssSent`: UInt,
)
public typealias `TCP_ESTATS_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCP_RESERVE_PORT_RANGE` (
    public var `UpperRange`: UShort,
    public var `LowerRange`: UShort,
)
public const val `TCP_ROW`: UInt = 14u;
public typealias `TCP_RTO_ALGORITHM` = Int;
public typealias `TCP_SOFT_ERROR` = Int;
public const val `TCP_STATS`: UInt = 12u;
public const val `TCP_TABLE`: UInt = 13u;
public const val `TCP_TABLE_BASIC_ALL`: `TCP_TABLE_CLASS` = 2;
public const val `TCP_TABLE_BASIC_CONNECTIONS`: `TCP_TABLE_CLASS` = 1;
public const val `TCP_TABLE_BASIC_LISTENER`: `TCP_TABLE_CLASS` = 0;
public typealias `TCP_TABLE_CLASS` = Int;
public const val `TCP_TABLE_OWNER_MODULE_ALL`: `TCP_TABLE_CLASS` = 8;
public const val `TCP_TABLE_OWNER_MODULE_CONNECTIONS`: `TCP_TABLE_CLASS` = 7;
public const val `TCP_TABLE_OWNER_MODULE_LISTENER`: `TCP_TABLE_CLASS` = 6;
public const val `TCP_TABLE_OWNER_PID_ALL`: `TCP_TABLE_CLASS` = 5;
public const val `TCP_TABLE_OWNER_PID_CONNECTIONS`: `TCP_TABLE_CLASS` = 4;
public const val `TCP_TABLE_OWNER_PID_LISTENER`: `TCP_TABLE_CLASS` = 3;
public const val `TcpBoolOptDisabled`: `TCP_BOOLEAN_OPTIONAL` = 0;
public const val `TcpBoolOptEnabled`: `TCP_BOOLEAN_OPTIONAL` = 1;
public const val `TcpBoolOptUnchanged`: `TCP_BOOLEAN_OPTIONAL` = -1;
public const val `TcpConnectionEstatsBandwidth`: `TCP_ESTATS_TYPE` = 7;
public const val `TcpConnectionEstatsData`: `TCP_ESTATS_TYPE` = 1;
public const val `TcpConnectionEstatsFineRtt`: `TCP_ESTATS_TYPE` = 8;
public const val `TcpConnectionEstatsMaximum`: `TCP_ESTATS_TYPE` = 9;
public const val `TcpConnectionEstatsObsRec`: `TCP_ESTATS_TYPE` = 6;
public const val `TcpConnectionEstatsPath`: `TCP_ESTATS_TYPE` = 3;
public const val `TcpConnectionEstatsRec`: `TCP_ESTATS_TYPE` = 5;
public const val `TcpConnectionEstatsSendBuff`: `TCP_ESTATS_TYPE` = 4;
public const val `TcpConnectionEstatsSndCong`: `TCP_ESTATS_TYPE` = 2;
public const val `TcpConnectionEstatsSynOpts`: `TCP_ESTATS_TYPE` = 0;
public const val `TcpConnectionOffloadStateInHost`: `TCP_CONNECTION_OFFLOAD_STATE` = 0;
public const val `TcpConnectionOffloadStateMax`: `TCP_CONNECTION_OFFLOAD_STATE` = 4;
public const val `TcpConnectionOffloadStateOffloaded`: `TCP_CONNECTION_OFFLOAD_STATE` = 2;
public const val `TcpConnectionOffloadStateOffloading`: `TCP_CONNECTION_OFFLOAD_STATE` = 1;
public const val `TcpConnectionOffloadStateUploading`: `TCP_CONNECTION_OFFLOAD_STATE` = 3;
public const val `TcpErrorAboveAckWindow`: `TCP_SOFT_ERROR` = 4;
public const val `TcpErrorAboveDataWindow`: `TCP_SOFT_ERROR` = 2;
public const val `TcpErrorAboveTsWindow`: `TCP_SOFT_ERROR` = 6;
public const val `TcpErrorBelowAckWindow`: `TCP_SOFT_ERROR` = 3;
public const val `TcpErrorBelowDataWindow`: `TCP_SOFT_ERROR` = 1;
public const val `TcpErrorBelowTsWindow`: `TCP_SOFT_ERROR` = 5;
public const val `TcpErrorDataChecksumError`: `TCP_SOFT_ERROR` = 7;
public const val `TcpErrorDataLengthError`: `TCP_SOFT_ERROR` = 8;
public const val `TcpErrorMaxSoftError`: `TCP_SOFT_ERROR` = 9;
public const val `TcpErrorNone`: `TCP_SOFT_ERROR` = 0;
public const val `TcpRtoAlgorithmConstant`: `TCP_RTO_ALGORITHM` = 2;
public const val `TcpRtoAlgorithmOther`: `TCP_RTO_ALGORITHM` = 1;
public const val `TcpRtoAlgorithmRsre`: `TCP_RTO_ALGORITHM` = 3;
public const val `TcpRtoAlgorithmVanj`: `TCP_RTO_ALGORITHM` = 4;
public const val `UDP6_STATS`: UInt = 37u;
public const val `UDP_ROW`: UInt = 17u;
public const val `UDP_STATS`: UInt = 15u;
public const val `UDP_TABLE`: UInt = 16u;
public const val `UDP_TABLE_BASIC`: `UDP_TABLE_CLASS` = 0;
public typealias `UDP_TABLE_CLASS` = Int;
public const val `UDP_TABLE_OWNER_MODULE`: `UDP_TABLE_CLASS` = 2;
public const val `UDP_TABLE_OWNER_PID`: `UDP_TABLE_CLASS` = 1;
