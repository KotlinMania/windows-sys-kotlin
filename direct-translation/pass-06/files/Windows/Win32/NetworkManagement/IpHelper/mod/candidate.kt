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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_DOH_SERVER_SETTINGS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_DOH_SERVER_SETTINGS`.Companion.`default`() : `DNS_DOH_SERVER_SETTINGS` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_INTERFACE_SETTINGS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_INTERFACE_SETTINGS`.Companion.`default`() : `DNS_INTERFACE_SETTINGS` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_INTERFACE_SETTINGS3`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_INTERFACE_SETTINGS3`.Companion.`default`() : `DNS_INTERFACE_SETTINGS3` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_INTERFACE_SETTINGS4`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_INTERFACE_SETTINGS4`.Companion.`default`() : `DNS_INTERFACE_SETTINGS4` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DNS_INTERFACE_SETTINGS_EX` (
    public var `SettingsV1`: `DNS_INTERFACE_SETTINGS`,
    public var `DisableUnconstrainedQueries`: UInt,
    public var `SupplementalSearchList`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_INTERFACE_SETTINGS_EX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_INTERFACE_SETTINGS_EX`.Companion.`default`() : `DNS_INTERFACE_SETTINGS_EX` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_SERVER_PROPERTY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_SERVER_PROPERTY`.Companion.`default`() : `DNS_SERVER_PROPERTY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DNS_SERVER_PROPERTY_TYPE` = Int;
// UNSUPPORTED Rust 434:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_SERVER_PROPERTY_TYPES {
//     pub DohSettings: *mut DNS_DOH_SERVER_SETTINGS,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_SERVER_PROPERTY_TYPES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_SERVER_PROPERTY_TYPES`.Companion.`default`() : `DNS_SERVER_PROPERTY_TYPES` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_SETTINGS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_SETTINGS`.Companion.`default`() : `DNS_SETTINGS` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DNS_SETTINGS2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DNS_SETTINGS2`.Companion.`default`() : `DNS_SETTINGS2` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 132 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FIXED_INFO_W2KSP1` (
    public var `HostName`: ByteArray,
    public var `DomainName`: ByteArray,
    public var `CurrentDnsServer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADDR_STRING`>?,
    public var `DnsServerList`: `IP_ADDR_STRING`,
    public var `NodeType`: UInt,
    public var `ScopeId`: ByteArray,
    public var `EnableRouting`: UInt,
    public var `EnableProxy`: UInt,
    public var `EnableDns`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FIXED_INFO_W2KSP1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FIXED_INFO_W2KSP1`.Companion.`default`() : `FIXED_INFO_W2KSP1` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ICMP_ECHO_REPLY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ICMP_ECHO_REPLY`.Companion.`default`() : `ICMP_ECHO_REPLY` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ICMP_ECHO_REPLY32`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `ICMP_ECHO_REPLY32`.Companion.`default`() : `ICMP_ECHO_REPLY32` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPV6_ADDRESS_EX` (
    public var `sin6_port`: UShort,
    public var `sin6_flowinfo`: UInt,
    public var `sin6_addr`: UShortArray,
    public var `sin6_scope_id`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IPV6_ADDRESS_EX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IPV6_ADDRESS_EX`.Companion.`default`() : `IPV6_ADDRESS_EX` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IPV6_GLOBAL_INFO`: UInt = 4294901775u;
public const val `IPV6_ROUTE_INFO`: UInt = 4294901776u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 130 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_ADDRESSES_LH` (
    public var `Anonymous1`: `IP_ADAPTER_ADDRESSES_LH_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ADDRESSES_LH`>?,
    public var `AdapterName`: `windows_sys`.`core`.`PSTR`,
    public var `FirstUnicastAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_UNICAST_ADDRESS_LH`>?,
    public var `FirstAnycastAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ANYCAST_ADDRESS_XP`>?,
    public var `FirstMulticastAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_MULTICAST_ADDRESS_XP`>?,
    public var `FirstDnsServerAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_DNS_SERVER_ADDRESS_XP`>?,
    public var `DnsSuffix`: `windows_sys`.`core`.`PWSTR`,
    public var `Description`: `windows_sys`.`core`.`PWSTR`,
    public var `FriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `PhysicalAddress`: UByteArray,
    public var `PhysicalAddressLength`: UInt,
    public var `Anonymous2`: `IP_ADAPTER_ADDRESSES_LH_1`,
    public var `Mtu`: UInt,
    public var `IfType`: UInt,
    public var `OperStatus`: `super`.`Ndis`.`IF_OPER_STATUS`,
    public var `Ipv6IfIndex`: UInt,
    public var `ZoneIndices`: UIntArray,
    public var `FirstPrefix`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_PREFIX_XP`>?,
    public var `TransmitLinkSpeed`: ULong,
    public var `ReceiveLinkSpeed`: ULong,
    public var `FirstWinsServerAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_WINS_SERVER_ADDRESS_LH`>?,
    public var `FirstGatewayAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_GATEWAY_ADDRESS_LH`>?,
    public var `Ipv4Metric`: UInt,
    public var `Ipv6Metric`: UInt,
    public var `Luid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `Dhcpv4Server`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `CompartmentId`: `super`.`Ndis`.`NET_IF_COMPARTMENT_ID`,
    public var `NetworkGuid`: `windows_sys`.`core`.`GUID`,
    public var `ConnectionType`: `super`.`Ndis`.`NET_IF_CONNECTION_TYPE`,
    public var `TunnelType`: `super`.`Ndis`.`TUNNEL_TYPE`,
    public var `Dhcpv6Server`: `super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS`,
    public var `Dhcpv6ClientDuid`: UByteArray,
    public var `Dhcpv6ClientDuidLength`: UInt,
    public var `Dhcpv6Iaid`: UInt,
    public var `FirstDnsSuffix`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_DNS_SUFFIX`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ADDRESSES_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `IP_ADAPTER_ADDRESSES_LH`.Companion.`default`() : `IP_ADAPTER_ADDRESSES_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 942:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_LH_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ADDRESSES_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `IP_ADAPTER_ADDRESSES_LH_0`.Companion.`default`() : `IP_ADAPTER_ADDRESSES_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ADDRESSES_LH_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `IP_ADAPTER_ADDRESSES_LH_1`.Companion.`default`() : `IP_ADAPTER_ADDRESSES_LH_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_ADDRESSES_LH_1_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_ADDRESSES_XP` (
    public var `Anonymous`: `IP_ADAPTER_ADDRESSES_XP_0`,
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ADDRESSES_XP`>?,
    public var `AdapterName`: `windows_sys`.`core`.`PSTR`,
    public var `FirstUnicastAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_UNICAST_ADDRESS_XP`>?,
    public var `FirstAnycastAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_ANYCAST_ADDRESS_XP`>?,
    public var `FirstMulticastAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_MULTICAST_ADDRESS_XP`>?,
    public var `FirstDnsServerAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_DNS_SERVER_ADDRESS_XP`>?,
    public var `DnsSuffix`: `windows_sys`.`core`.`PWSTR`,
    public var `Description`: `windows_sys`.`core`.`PWSTR`,
    public var `FriendlyName`: `windows_sys`.`core`.`PWSTR`,
    public var `PhysicalAddress`: UByteArray,
    public var `PhysicalAddressLength`: UInt,
    public var `Flags`: UInt,
    public var `Mtu`: UInt,
    public var `IfType`: UInt,
    public var `OperStatus`: `super`.`Ndis`.`IF_OPER_STATUS`,
    public var `Ipv6IfIndex`: UInt,
    public var `ZoneIndices`: UIntArray,
    public var `FirstPrefix`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_PREFIX_XP`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ADDRESSES_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `IP_ADAPTER_ADDRESSES_XP`.Companion.`default`() : `IP_ADAPTER_ADDRESSES_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1011:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_XP_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ADDRESSES_XP_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `IP_ADAPTER_ADDRESSES_XP_0`.Companion.`default`() : `IP_ADAPTER_ADDRESSES_XP_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ANYCAST_ADDRESS_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_ANYCAST_ADDRESS_XP`.Companion.`default`() : `IP_ADAPTER_ANYCAST_ADDRESS_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1047:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ANYCAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ANYCAST_ADDRESS_XP_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_ANYCAST_ADDRESS_XP_0`.Companion.`default`() : `IP_ADAPTER_ANYCAST_ADDRESS_XP_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_DNS_SERVER_ADDRESS_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_DNS_SERVER_ADDRESS_XP`.Companion.`default`() : `IP_ADAPTER_DNS_SERVER_ADDRESS_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1083:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0`.Companion.`default`() : `IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0` (
    public var `Length`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_DNS_SUFFIX` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_DNS_SUFFIX`>?,
    public var `String`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_DNS_SUFFIX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_ADAPTER_DNS_SUFFIX`.Companion.`default`() : `IP_ADAPTER_DNS_SUFFIX` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_GATEWAY_ADDRESS_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_GATEWAY_ADDRESS_LH`.Companion.`default`() : `IP_ADAPTER_GATEWAY_ADDRESS_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1128:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_GATEWAY_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_GATEWAY_ADDRESS_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_GATEWAY_ADDRESS_LH_0`.Companion.`default`() : `IP_ADAPTER_GATEWAY_ADDRESS_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0` (
    public var `Length`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_INDEX_MAP` (
    public var `Index`: UInt,
    public var `Name`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_INDEX_MAP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_ADAPTER_INDEX_MAP`.Companion.`default`() : `IP_ADAPTER_INDEX_MAP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 132 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_INFO` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADAPTER_INFO`>?,
    public var `ComboIndex`: UInt,
    public var `AdapterName`: ByteArray,
    public var `Description`: ByteArray,
    public var `AddressLength`: UInt,
    public var `Address`: UByteArray,
    public var `Index`: UInt,
    public var `Type`: UInt,
    public var `DhcpEnabled`: UInt,
    public var `CurrentIpAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IP_ADDR_STRING`>?,
    public var `IpAddressList`: `IP_ADDR_STRING`,
    public var `GatewayList`: `IP_ADDR_STRING`,
    public var `DhcpServer`: `IP_ADDR_STRING`,
    public var `HaveWins`: `windows_sys`.`core`.`BOOL`,
    public var `PrimaryWinsServer`: `IP_ADDR_STRING`,
    public var `SecondaryWinsServer`: `IP_ADDR_STRING`,
    public var `LeaseObtained`: Long,
    public var `LeaseExpires`: Long,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_ADAPTER_INFO`.Companion.`default`() : `IP_ADAPTER_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_MULTICAST_ADDRESS_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_MULTICAST_ADDRESS_XP`.Companion.`default`() : `IP_ADAPTER_MULTICAST_ADDRESS_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1204:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_MULTICAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_MULTICAST_ADDRESS_XP_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_MULTICAST_ADDRESS_XP_0`.Companion.`default`() : `IP_ADAPTER_MULTICAST_ADDRESS_XP_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADAPTER_ORDER_MAP` (
    public var `NumAdapters`: UInt,
    public var `AdapterOrder`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_ORDER_MAP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_ADAPTER_ORDER_MAP`.Companion.`default`() : `IP_ADAPTER_ORDER_MAP` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_PREFIX_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_PREFIX_XP`.Companion.`default`() : `IP_ADAPTER_PREFIX_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1252:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_PREFIX_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_PREFIX_XP_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_PREFIX_XP_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_PREFIX_XP_0`.Companion.`default`() : `IP_ADAPTER_PREFIX_XP_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_UNICAST_ADDRESS_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_UNICAST_ADDRESS_LH`.Companion.`default`() : `IP_ADAPTER_UNICAST_ADDRESS_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1295:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_UNICAST_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_LH_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_UNICAST_ADDRESS_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_UNICAST_ADDRESS_LH_0`.Companion.`default`() : `IP_ADAPTER_UNICAST_ADDRESS_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_UNICAST_ADDRESS_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_UNICAST_ADDRESS_XP`.Companion.`default`() : `IP_ADAPTER_UNICAST_ADDRESS_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1335:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_UNICAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_XP_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_UNICAST_ADDRESS_XP_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_UNICAST_ADDRESS_XP_0`.Companion.`default`() : `IP_ADAPTER_UNICAST_ADDRESS_XP_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_WINS_SERVER_ADDRESS_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_WINS_SERVER_ADDRESS_LH`.Companion.`default`() : `IP_ADAPTER_WINS_SERVER_ADDRESS_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1369:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0`.Companion.`default`() : `IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADDRESS_PREFIX`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `IP_ADDRESS_PREFIX`.Companion.`default`() : `IP_ADDRESS_PREFIX` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_ADDRESS_STRING` (
    public var `String`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADDRESS_STRING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_ADDRESS_STRING`.Companion.`default`() : `IP_ADDRESS_STRING` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_ADDR_STRING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_ADDR_STRING`.Companion.`default`() : `IP_ADDR_STRING` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_INTERFACE_INFO` (
    public var `NumAdapters`: Int,
    public var `Adapter`: Array<`IP_ADAPTER_INDEX_MAP`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_INTERFACE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_INTERFACE_INFO`.Companion.`default`() : `IP_INTERFACE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_OPTION_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_OPTION_INFORMATION`.Companion.`default`() : `IP_OPTION_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_OPTION_INFORMATION32`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `IP_OPTION_INFORMATION32`.Companion.`default`() : `IP_OPTION_INFORMATION32` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_PER_ADAPTER_INFO_W2KSP1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_PER_ADAPTER_INFO_W2KSP1`.Companion.`default`() : `IP_PER_ADAPTER_INFO_W2KSP1` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IP_UNIDIRECTIONAL_ADAPTER_ADDRESS` (
    public var `NumAdapters`: UInt,
    public var `Address`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IP_UNIDIRECTIONAL_ADAPTER_ADDRESS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IP_UNIDIRECTIONAL_ADAPTER_ADDRESS`.Companion.`default`() : `IP_UNIDIRECTIONAL_ADAPTER_ADDRESS` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIBICMPSTATS_EX_XPSP1` (
    public var `dwMsgs`: UInt,
    public var `dwErrors`: UInt,
    public var `rgdwTypeCount`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIBICMPSTATS_EX_XPSP1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIBICMPSTATS_EX_XPSP1`.Companion.`default`() : `MIBICMPSTATS_EX_XPSP1` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_ANYCASTIPADDRESS_ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_ANYCASTIPADDRESS_ROW`.Companion.`default`() : `MIB_ANYCASTIPADDRESS_ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_ANYCASTIPADDRESS_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_ANYCASTIPADDRESS_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_ANYCASTIPADDRESS_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_ANYCASTIPADDRESS_TABLE`.Companion.`default`() : `MIB_ANYCASTIPADDRESS_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IFROW` (
    public var `wszName`: UShortArray,
    public var `dwIndex`: UInt,
    public var `dwType`: UInt,
    public var `dwMtu`: UInt,
    public var `dwSpeed`: UInt,
    public var `dwPhysAddrLen`: UInt,
    public var `bPhysAddr`: UByteArray,
    public var `dwAdminStatus`: UInt,
    public var `dwOperStatus`: `INTERNAL_IF_OPER_STATUS`,
    public var `dwLastChange`: UInt,
    public var `dwInOctets`: UInt,
    public var `dwInUcastPkts`: UInt,
    public var `dwInNUcastPkts`: UInt,
    public var `dwInDiscards`: UInt,
    public var `dwInErrors`: UInt,
    public var `dwInUnknownProtos`: UInt,
    public var `dwOutOctets`: UInt,
    public var `dwOutUcastPkts`: UInt,
    public var `dwOutNUcastPkts`: UInt,
    public var `dwOutDiscards`: UInt,
    public var `dwOutErrors`: UInt,
    public var `dwOutQLen`: UInt,
    public var `dwDescrLen`: UInt,
    public var `bDescr`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IFROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IFROW`.Companion.`default`() : `MIB_IFROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IFSTACK_ROW` (
    public var `HigherLayerInterfaceIndex`: UInt,
    public var `LowerLayerInterfaceIndex`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IFSTACK_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_IFSTACK_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IFSTACK_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IFSTACK_TABLE`.Companion.`default`() : `MIB_IFSTACK_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IFTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IFROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IFTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IFTABLE`.Companion.`default`() : `MIB_IFTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MIB_IF_ADMIN_STATUS_DOWN`: UInt = 2u;
public const val `MIB_IF_ADMIN_STATUS_TESTING`: UInt = 3u;
public const val `MIB_IF_ADMIN_STATUS_UP`: UInt = 1u;
public typealias `MIB_IF_ENTRY_LEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IF_ROW2` (
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `InterfaceIndex`: UInt,
    public var `InterfaceGuid`: `windows_sys`.`core`.`GUID`,
    public var `Alias`: UShortArray,
    public var `Description`: UShortArray,
    public var `PhysicalAddressLength`: UInt,
    public var `PhysicalAddress`: UByteArray,
    public var `PermanentPhysicalAddress`: UByteArray,
    public var `Mtu`: UInt,
    public var `Type`: UInt,
    public var `TunnelType`: `super`.`Ndis`.`TUNNEL_TYPE`,
    public var `MediaType`: `super`.`Ndis`.`NDIS_MEDIUM`,
    public var `PhysicalMediumType`: `super`.`Ndis`.`NDIS_PHYSICAL_MEDIUM`,
    public var `AccessType`: `super`.`Ndis`.`NET_IF_ACCESS_TYPE`,
    public var `DirectionType`: `super`.`Ndis`.`NET_IF_DIRECTION_TYPE`,
    public var `InterfaceAndOperStatusFlags`: `MIB_IF_ROW2_0`,
    public var `OperStatus`: `super`.`Ndis`.`IF_OPER_STATUS`,
    public var `AdminStatus`: `super`.`Ndis`.`NET_IF_ADMIN_STATUS`,
    public var `MediaConnectState`: `super`.`Ndis`.`NET_IF_MEDIA_CONNECT_STATE`,
    public var `NetworkGuid`: `windows_sys`.`core`.`GUID`,
    public var `ConnectionType`: `super`.`Ndis`.`NET_IF_CONNECTION_TYPE`,
    public var `TransmitLinkSpeed`: ULong,
    public var `ReceiveLinkSpeed`: ULong,
    public var `InOctets`: ULong,
    public var `InUcastPkts`: ULong,
    public var `InNUcastPkts`: ULong,
    public var `InDiscards`: ULong,
    public var `InErrors`: ULong,
    public var `InUnknownProtos`: ULong,
    public var `InUcastOctets`: ULong,
    public var `InMulticastOctets`: ULong,
    public var `InBroadcastOctets`: ULong,
    public var `OutOctets`: ULong,
    public var `OutUcastPkts`: ULong,
    public var `OutNUcastPkts`: ULong,
    public var `OutDiscards`: ULong,
    public var `OutErrors`: ULong,
    public var `OutUcastOctets`: ULong,
    public var `OutMulticastOctets`: ULong,
    public var `OutBroadcastOctets`: ULong,
    public var `OutQLen`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IF_ROW2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]

    public fun `MIB_IF_ROW2`.Companion.`default`() : `MIB_IF_ROW2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_IF_ROW2_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IF_TABLE2` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_IF_ROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IF_TABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_NetworkManagement_Ndis")]

    public fun `MIB_IF_TABLE2`.Companion.`default`() : `MIB_IF_TABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_INVERTEDIFSTACK_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_INVERTEDIFSTACK_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_INVERTEDIFSTACK_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_INVERTEDIFSTACK_TABLE`.Companion.`default`() : `MIB_INVERTEDIFSTACK_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPADDRTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPADDRROW_XP`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPADDRTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPADDRTABLE`.Companion.`default`() : `MIB_IPADDRTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPDESTROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_IPDESTROW`.Companion.`default`() : `MIB_IPDESTROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPDESTTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPDESTROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPDESTTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_IPDESTTABLE`.Companion.`default`() : `MIB_IPDESTTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPFORWARDROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_IPFORWARDROW`.Companion.`default`() : `MIB_IPFORWARDROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1979:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union MIB_IPFORWARDROW_0 {
//     pub dwForwardType: u32,
//     pub ForwardType: MIB_IPFORWARD_TYPE,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPFORWARDROW_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_IPFORWARDROW_0`.Companion.`default`() : `MIB_IPFORWARDROW_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1992:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union MIB_IPFORWARDROW_1 {
//     pub dwForwardProto: u32,
//     pub ForwardProto: super::super::Networking::WinSock::NL_ROUTE_PROTOCOL,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPFORWARDROW_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_IPFORWARDROW_1`.Companion.`default`() : `MIB_IPFORWARDROW_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPFORWARDTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPFORWARDROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPFORWARDTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_IPFORWARDTABLE`.Companion.`default`() : `MIB_IPFORWARDTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPFORWARD_ROW2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPFORWARD_ROW2`.Companion.`default`() : `MIB_IPFORWARD_ROW2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPFORWARD_TABLE2` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_IPFORWARD_ROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPFORWARD_TABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPFORWARD_TABLE2`.Companion.`default`() : `MIB_IPFORWARD_TABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `MIB_IPFORWARD_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPINTERFACE_ROW` (
    public var `Family`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `InterfaceIndex`: UInt,
    public var `MaxReassemblySize`: UInt,
    public var `InterfaceIdentifier`: ULong,
    public var `MinRouterAdvertisementInterval`: UInt,
    public var `MaxRouterAdvertisementInterval`: UInt,
    public var `AdvertisingEnabled`: Boolean,
    public var `ForwardingEnabled`: Boolean,
    public var `WeakHostSend`: Boolean,
    public var `WeakHostReceive`: Boolean,
    public var `UseAutomaticMetric`: Boolean,
    public var `UseNeighborUnreachabilityDetection`: Boolean,
    public var `ManagedAddressConfigurationSupported`: Boolean,
    public var `OtherStatefulConfigurationSupported`: Boolean,
    public var `AdvertiseDefaultRoute`: Boolean,
    public var `RouterDiscoveryBehavior`: `super`.`super`.`Networking`.`WinSock`.`NL_ROUTER_DISCOVERY_BEHAVIOR`,
    public var `DadTransmits`: UInt,
    public var `BaseReachableTime`: UInt,
    public var `RetransmitTime`: UInt,
    public var `PathMtuDiscoveryTimeout`: UInt,
    public var `LinkLocalAddressBehavior`: `super`.`super`.`Networking`.`WinSock`.`NL_LINK_LOCAL_ADDRESS_BEHAVIOR`,
    public var `LinkLocalAddressTimeout`: UInt,
    public var `ZoneIndices`: UIntArray,
    public var `SitePrefixLength`: UInt,
    public var `Metric`: UInt,
    public var `NlMtu`: UInt,
    public var `Connected`: Boolean,
    public var `SupportsWakeUpPatterns`: Boolean,
    public var `SupportsNeighborDiscovery`: Boolean,
    public var `SupportsRouterDiscovery`: Boolean,
    public var `ReachableTime`: UInt,
    public var `TransmitOffload`: `super`.`super`.`Networking`.`WinSock`.`NL_INTERFACE_OFFLOAD_ROD`,
    public var `ReceiveOffload`: `super`.`super`.`Networking`.`WinSock`.`NL_INTERFACE_OFFLOAD_ROD`,
    public var `DisableDefaultRoutes`: Boolean,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPINTERFACE_ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPINTERFACE_ROW`.Companion.`default`() : `MIB_IPINTERFACE_ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPINTERFACE_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_IPINTERFACE_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPINTERFACE_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPINTERFACE_TABLE`.Companion.`default`() : `MIB_IPINTERFACE_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_BOUNDARY_TABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPMCAST_BOUNDARY`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_BOUNDARY_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_BOUNDARY_TABLE`.Companion.`default`() : `MIB_IPMCAST_BOUNDARY_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_IF_TABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPMCAST_IF_ENTRY`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_IF_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_IF_TABLE`.Companion.`default`() : `MIB_IPMCAST_IF_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_MFE` (
    public var `dwGroup`: UInt,
    public var `dwSource`: UInt,
    public var `dwSrcMask`: UInt,
    public var `dwUpStrmNgbr`: UInt,
    public var `dwInIfIndex`: UInt,
    public var `dwInIfProtocol`: UInt,
    public var `dwRouteProtocol`: UInt,
    public var `dwRouteNetwork`: UInt,
    public var `dwRouteMask`: UInt,
    public var `ulUpTime`: UInt,
    public var `ulExpiryTime`: UInt,
    public var `ulTimeOut`: UInt,
    public var `ulNumOutIf`: UInt,
    public var `fFlags`: UInt,
    public var `dwReserved`: UInt,
    public var `rgmioOutInfo`: Array<`MIB_IPMCAST_OIF_XP`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_MFE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_MFE`.Companion.`default`() : `MIB_IPMCAST_MFE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_MFE_STATS` (
    public var `dwGroup`: UInt,
    public var `dwSource`: UInt,
    public var `dwSrcMask`: UInt,
    public var `dwUpStrmNgbr`: UInt,
    public var `dwInIfIndex`: UInt,
    public var `dwInIfProtocol`: UInt,
    public var `dwRouteProtocol`: UInt,
    public var `dwRouteNetwork`: UInt,
    public var `dwRouteMask`: UInt,
    public var `ulUpTime`: UInt,
    public var `ulExpiryTime`: UInt,
    public var `ulNumOutIf`: UInt,
    public var `ulInPkts`: UInt,
    public var `ulInOctets`: UInt,
    public var `ulPktsDifferentIf`: UInt,
    public var `ulQueueOverflow`: UInt,
    public var `rgmiosOutStats`: Array<`MIB_IPMCAST_OIF_STATS_LH`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_MFE_STATS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_MFE_STATS`.Companion.`default`() : `MIB_IPMCAST_MFE_STATS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_MFE_STATS_EX_XP` (
    public var `dwGroup`: UInt,
    public var `dwSource`: UInt,
    public var `dwSrcMask`: UInt,
    public var `dwUpStrmNgbr`: UInt,
    public var `dwInIfIndex`: UInt,
    public var `dwInIfProtocol`: UInt,
    public var `dwRouteProtocol`: UInt,
    public var `dwRouteNetwork`: UInt,
    public var `dwRouteMask`: UInt,
    public var `ulUpTime`: UInt,
    public var `ulExpiryTime`: UInt,
    public var `ulNumOutIf`: UInt,
    public var `ulInPkts`: UInt,
    public var `ulInOctets`: UInt,
    public var `ulPktsDifferentIf`: UInt,
    public var `ulQueueOverflow`: UInt,
    public var `ulUninitMfe`: UInt,
    public var `ulNegativeMfe`: UInt,
    public var `ulInDiscards`: UInt,
    public var `ulInHdrErrors`: UInt,
    public var `ulTotalOutPackets`: UInt,
    public var `rgmiosOutStats`: Array<`MIB_IPMCAST_OIF_STATS_LH`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_MFE_STATS_EX_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_MFE_STATS_EX_XP`.Companion.`default`() : `MIB_IPMCAST_MFE_STATS_EX_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_OIF_STATS_W2K`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_OIF_STATS_W2K`.Companion.`default`() : `MIB_IPMCAST_OIF_STATS_W2K` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_OIF_W2K`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_OIF_W2K`.Companion.`default`() : `MIB_IPMCAST_OIF_W2K` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPMCAST_SCOPE` (
    public var `dwGroupAddress`: UInt,
    public var `dwGroupMask`: UInt,
    public var `snNameBuffer`: UShortArray,
    public var `dwStatus`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPMCAST_SCOPE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPMCAST_SCOPE`.Companion.`default`() : `MIB_IPMCAST_SCOPE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPNETROW_LH` (
    public var `dwIndex`: UInt,
    public var `dwPhysAddrLen`: UInt,
    public var `bPhysAddr`: UByteArray,
    public var `dwAddr`: UInt,
    public var `Anonymous`: `MIB_IPNETROW_LH_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNETROW_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPNETROW_LH`.Companion.`default`() : `MIB_IPNETROW_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2319:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_IPNETROW_LH_0 {
//     pub dwType: u32,
//     pub Type: MIB_IPNET_TYPE,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNETROW_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPNETROW_LH_0`.Companion.`default`() : `MIB_IPNETROW_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPNETROW_W2K` (
    public var `dwIndex`: UInt,
    public var `dwPhysAddrLen`: UInt,
    public var `bPhysAddr`: UByteArray,
    public var `dwAddr`: UInt,
    public var `dwType`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNETROW_W2K`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPNETROW_W2K`.Companion.`default`() : `MIB_IPNETROW_W2K` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPNETTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPNETROW_LH`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNETTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPNETTABLE`.Companion.`default`() : `MIB_IPNETTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPNET_ROW2` (
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_INET`,
    public var `InterfaceIndex`: UInt,
    public var `InterfaceLuid`: `super`.`Ndis`.`NET_LUID_LH`,
    public var `PhysicalAddress`: UByteArray,
    public var `PhysicalAddressLength`: UInt,
    public var `State`: `super`.`super`.`Networking`.`WinSock`.`NL_NEIGHBOR_STATE`,
    public var `Anonymous`: `MIB_IPNET_ROW2_0`,
    public var `ReachabilityTime`: `MIB_IPNET_ROW2_1`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNET_ROW2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPNET_ROW2`.Companion.`default`() : `MIB_IPNET_ROW2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2374:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPNET_ROW2_0 {
//     pub Anonymous: MIB_IPNET_ROW2_0_0,
//     pub Flags: u8,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNET_ROW2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPNET_ROW2_0`.Companion.`default`() : `MIB_IPNET_ROW2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNET_ROW2_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPNET_ROW2_1`.Companion.`default`() : `MIB_IPNET_ROW2_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPNET_TABLE2` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_IPNET_ROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPNET_TABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPNET_TABLE2`.Companion.`default`() : `MIB_IPNET_TABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPPATH_ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPPATH_ROW`.Companion.`default`() : `MIB_IPPATH_ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2447:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPPATH_ROW_0 {
//     pub LastReachable: u32,
//     pub LastUnreachable: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPPATH_ROW_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPPATH_ROW_0`.Companion.`default`() : `MIB_IPPATH_ROW_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_IPPATH_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_IPPATH_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPPATH_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_IPPATH_TABLE`.Companion.`default`() : `MIB_IPPATH_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPSTATS_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPSTATS_LH`.Companion.`default`() : `MIB_IPSTATS_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2511:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_IPSTATS_LH_0 {
//     pub dwForwarding: u32,
//     pub Forwarding: MIB_IPSTATS_FORWARDING,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_IPSTATS_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_IPSTATS_LH_0`.Companion.`default`() : `MIB_IPSTATS_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_MFE_STATS_TABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPMCAST_MFE_STATS`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_MFE_STATS_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_MFE_STATS_TABLE`.Companion.`default`() : `MIB_MFE_STATS_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_MFE_STATS_TABLE_EX_XP` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`MIB_IPMCAST_MFE_STATS_EX_XP`>?>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_MFE_STATS_TABLE_EX_XP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_MFE_STATS_TABLE_EX_XP`.Companion.`default`() : `MIB_MFE_STATS_TABLE_EX_XP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_MFE_TABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_IPMCAST_MFE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_MFE_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_MFE_TABLE`.Companion.`default`() : `MIB_MFE_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_MULTICASTIPADDRESS_ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_MULTICASTIPADDRESS_ROW`.Companion.`default`() : `MIB_MULTICASTIPADDRESS_ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_MULTICASTIPADDRESS_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_MULTICASTIPADDRESS_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_MULTICASTIPADDRESS_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_MULTICASTIPADDRESS_TABLE`.Companion.`default`() : `MIB_MULTICASTIPADDRESS_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `MIB_NOTIFICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_OPAQUE_INFO` (
    public var `dwId`: UInt,
    public var `Anonymous`: `MIB_OPAQUE_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_OPAQUE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_OPAQUE_INFO`.Companion.`default`() : `MIB_OPAQUE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2637:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_OPAQUE_INFO_0 {
//     pub ullAlign: u64,
//     pub rgbyData: [u8; 1],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_OPAQUE_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_OPAQUE_INFO_0`.Companion.`default`() : `MIB_OPAQUE_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_OPAQUE_QUERY` (
    public var `dwVarId`: UInt,
    public var `rgdwVarIndex`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_OPAQUE_QUERY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_OPAQUE_QUERY`.Companion.`default`() : `MIB_OPAQUE_QUERY` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_TCP6ROW`.Companion.`default`() : `MIB_TCP6ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6ROW2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_TCP6ROW2`.Companion.`default`() : `MIB_TCP6ROW2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6ROW_OWNER_MODULE` (
    public var `ucLocalAddr`: UByteArray,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `ucRemoteAddr`: UByteArray,
    public var `dwRemoteScopeId`: UInt,
    public var `dwRemotePort`: UInt,
    public var `dwState`: UInt,
    public var `dwOwningPid`: UInt,
    public var `liCreateTimestamp`: Long,
    public var `OwningModuleInfo`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6ROW_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCP6ROW_OWNER_MODULE`.Companion.`default`() : `MIB_TCP6ROW_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6ROW_OWNER_PID` (
    public var `ucLocalAddr`: UByteArray,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `ucRemoteAddr`: UByteArray,
    public var `dwRemoteScopeId`: UInt,
    public var `dwRemotePort`: UInt,
    public var `dwState`: UInt,
    public var `dwOwningPid`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6ROW_OWNER_PID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCP6ROW_OWNER_PID`.Companion.`default`() : `MIB_TCP6ROW_OWNER_PID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6TABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCP6ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_TCP6TABLE`.Companion.`default`() : `MIB_TCP6TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6TABLE2` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCP6ROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6TABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_TCP6TABLE2`.Companion.`default`() : `MIB_TCP6TABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6TABLE_OWNER_MODULE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCP6ROW_OWNER_MODULE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6TABLE_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCP6TABLE_OWNER_MODULE`.Companion.`default`() : `MIB_TCP6TABLE_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCP6TABLE_OWNER_PID` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCP6ROW_OWNER_PID`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCP6TABLE_OWNER_PID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCP6TABLE_OWNER_PID`.Companion.`default`() : `MIB_TCP6TABLE_OWNER_PID` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPROW_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPROW_LH`.Companion.`default`() : `MIB_TCPROW_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2818:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_TCPROW_LH_0 {
//     pub dwState: u32,
//     pub State: MIB_TCP_STATE,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPROW_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPROW_LH_0`.Companion.`default`() : `MIB_TCPROW_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPROW_OWNER_MODULE` (
    public var `dwState`: UInt,
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwRemoteAddr`: UInt,
    public var `dwRemotePort`: UInt,
    public var `dwOwningPid`: UInt,
    public var `liCreateTimestamp`: Long,
    public var `OwningModuleInfo`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPROW_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPROW_OWNER_MODULE`.Companion.`default`() : `MIB_TCPROW_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPSTATS_LH`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPSTATS_LH`.Companion.`default`() : `MIB_TCPSTATS_LH` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 2908:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_TCPSTATS_LH_0 {
//     pub dwRtoAlgorithm: u32,
//     pub RtoAlgorithm: TCP_RTO_ALGORITHM,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPSTATS_LH_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPSTATS_LH_0`.Companion.`default`() : `MIB_TCPSTATS_LH_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCPROW_LH`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPTABLE`.Companion.`default`() : `MIB_TCPTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPTABLE2` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCPROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPTABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPTABLE2`.Companion.`default`() : `MIB_TCPTABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPTABLE_OWNER_MODULE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCPROW_OWNER_MODULE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPTABLE_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPTABLE_OWNER_MODULE`.Companion.`default`() : `MIB_TCPTABLE_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_TCPTABLE_OWNER_PID` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_TCPROW_OWNER_PID`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_TCPTABLE_OWNER_PID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_TCPTABLE_OWNER_PID`.Companion.`default`() : `MIB_TCPTABLE_OWNER_PID` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_UDP6ROW`.Companion.`default`() : `MIB_UDP6ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6ROW2` (
    public var `ucLocalAddr`: UByteArray,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwOwningPid`: UInt,
    public var `liCreateTimestamp`: Long,
    public var `Anonymous`: `MIB_UDP6ROW2_0`,
    public var `OwningModuleInfo`: ULongArray,
    public var `ucRemoteAddr`: UByteArray,
    public var `dwRemoteScopeId`: UInt,
    public var `dwRemotePort`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6ROW2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6ROW2`.Companion.`default`() : `MIB_UDP6ROW2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 3033:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDP6ROW2_0 {
//     pub Anonymous: MIB_UDP6ROW2_0_0,
//     pub dwFlags: i32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6ROW2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6ROW2_0`.Companion.`default`() : `MIB_UDP6ROW2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDP6ROW2_0_0` (
    public var `_bitfield`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6ROW_OWNER_MODULE` (
    public var `ucLocalAddr`: UByteArray,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwOwningPid`: UInt,
    public var `liCreateTimestamp`: Long,
    public var `Anonymous`: `MIB_UDP6ROW_OWNER_MODULE_0`,
    public var `OwningModuleInfo`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6ROW_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6ROW_OWNER_MODULE`.Companion.`default`() : `MIB_UDP6ROW_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 3065:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDP6ROW_OWNER_MODULE_0 {
//     pub Anonymous: MIB_UDP6ROW_OWNER_MODULE_0_0,
//     pub dwFlags: i32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6ROW_OWNER_MODULE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6ROW_OWNER_MODULE_0`.Companion.`default`() : `MIB_UDP6ROW_OWNER_MODULE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDP6ROW_OWNER_MODULE_0_0` (
    public var `_bitfield`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6ROW_OWNER_PID` (
    public var `ucLocalAddr`: UByteArray,
    public var `dwLocalScopeId`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwOwningPid`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6ROW_OWNER_PID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6ROW_OWNER_PID`.Companion.`default`() : `MIB_UDP6ROW_OWNER_PID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6TABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDP6ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `MIB_UDP6TABLE`.Companion.`default`() : `MIB_UDP6TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6TABLE2` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDP6ROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6TABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6TABLE2`.Companion.`default`() : `MIB_UDP6TABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6TABLE_OWNER_MODULE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDP6ROW_OWNER_MODULE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6TABLE_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6TABLE_OWNER_MODULE`.Companion.`default`() : `MIB_UDP6TABLE_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDP6TABLE_OWNER_PID` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDP6ROW_OWNER_PID`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDP6TABLE_OWNER_PID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDP6TABLE_OWNER_PID`.Companion.`default`() : `MIB_UDP6TABLE_OWNER_PID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPROW` (
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDPROW2` (
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwOwningPid`: UInt,
    public var `liCreateTimestamp`: Long,
    public var `Anonymous`: `MIB_UDPROW2_0`,
    public var `OwningModuleInfo`: ULongArray,
    public var `dwRemoteAddr`: UInt,
    public var `dwRemotePort`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPROW2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPROW2`.Companion.`default`() : `MIB_UDPROW2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 3163:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDPROW2_0 {
//     pub Anonymous: MIB_UDPROW2_0_0,
//     pub dwFlags: i32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPROW2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPROW2_0`.Companion.`default`() : `MIB_UDPROW2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MIB_UDPROW2_0_0` (
    public var `_bitfield`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDPROW_OWNER_MODULE` (
    public var `dwLocalAddr`: UInt,
    public var `dwLocalPort`: UInt,
    public var `dwOwningPid`: UInt,
    public var `liCreateTimestamp`: Long,
    public var `Anonymous`: `MIB_UDPROW_OWNER_MODULE_0`,
    public var `OwningModuleInfo`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPROW_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPROW_OWNER_MODULE`.Companion.`default`() : `MIB_UDPROW_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 3194:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDPROW_OWNER_MODULE_0 {
//     pub Anonymous: MIB_UDPROW_OWNER_MODULE_0_0,
//     pub dwFlags: i32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPROW_OWNER_MODULE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPROW_OWNER_MODULE_0`.Companion.`default`() : `MIB_UDPROW_OWNER_MODULE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDPTABLE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDPROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPTABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPTABLE`.Companion.`default`() : `MIB_UDPTABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDPTABLE2` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDPROW2`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPTABLE2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPTABLE2`.Companion.`default`() : `MIB_UDPTABLE2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDPTABLE_OWNER_MODULE` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDPROW_OWNER_MODULE`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPTABLE_OWNER_MODULE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPTABLE_OWNER_MODULE`.Companion.`default`() : `MIB_UDPTABLE_OWNER_MODULE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UDPTABLE_OWNER_PID` (
    public var `dwNumEntries`: UInt,
    public var `table`: Array<`MIB_UDPROW_OWNER_PID`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UDPTABLE_OWNER_PID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MIB_UDPTABLE_OWNER_PID`.Companion.`default`() : `MIB_UDPTABLE_OWNER_PID` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UNICASTIPADDRESS_ROW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_UNICASTIPADDRESS_ROW`.Companion.`default`() : `MIB_UNICASTIPADDRESS_ROW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MIB_UNICASTIPADDRESS_TABLE` (
    public var `NumEntries`: UInt,
    public var `Table`: Array<`MIB_UNICASTIPADDRESS_ROW`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MIB_UNICASTIPADDRESS_TABLE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]

    public fun `MIB_UNICASTIPADDRESS_TABLE`.Companion.`default`() : `MIB_UNICASTIPADDRESS_TABLE` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `NET_ADDRESS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `NET_ADDRESS_INFO`.Companion.`default`() : `NET_ADDRESS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `NET_ADDRESS_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `NET_ADDRESS_INFO_0`.Companion.`default`() : `NET_ADDRESS_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NET_ADDRESS_INFO_0_0` (
    public var `Address`: UShortArray,
    public var `Port`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `NET_ADDRESS_INFO_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `NET_ADDRESS_INFO_0_0`.Companion.`default`() : `NET_ADDRESS_INFO_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PFLOGFRAME` (
    public var `Timestamp`: Long,
    public var `pfeTypeOfFrame`: `PFFRAMETYPE`,
    public var `dwTotalSizeUsed`: UInt,
    public var `dwFilterRule`: UInt,
    public var `wSizeOfAdditionalData`: UShort,
    public var `wSizeOfIpHeader`: UShort,
    public var `dwInterfaceName`: UInt,
    public var `dwIPIndex`: UInt,
    public var `bPacketData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PFLOGFRAME`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PFLOGFRAME`.Companion.`default`() : `PFLOGFRAME` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PF_FILTER_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PF_FILTER_DESCRIPTOR`.Companion.`default`() : `PF_FILTER_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PF_FILTER_STATS` (
    public var `dwNumPacketsFiltered`: UInt,
    public var `info`: `PF_FILTER_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PF_INTERFACE_STATS` (
    public var `pvDriverContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwFlags`: UInt,
    public var `dwInDrops`: UInt,
    public var `dwOutDrops`: UInt,
    public var `eaInAction`: `PFFORWARD_ACTION`,
    public var `eaOutAction`: `PFFORWARD_ACTION`,
    public var `dwNumInFilters`: UInt,
    public var `dwNumOutFilters`: UInt,
    public var `dwFrag`: UInt,
    public var `dwSpoof`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `liSYN`: Long,
    public var `liTotalLogged`: Long,
    public var `dwLostLogEntries`: UInt,
    public var `FilterInfo`: Array<`PF_FILTER_STATS`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PF_INTERFACE_STATS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PF_INTERFACE_STATS`.Companion.`default`() : `PF_INTERFACE_STATS` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PF_LATEBIND_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PF_LATEBIND_INFO`.Companion.`default`() : `PF_LATEBIND_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TCPIP_OWNER_MODULE_BASIC_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TCPIP_OWNER_MODULE_BASIC_INFO`.Companion.`default`() : `TCPIP_OWNER_MODULE_BASIC_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
