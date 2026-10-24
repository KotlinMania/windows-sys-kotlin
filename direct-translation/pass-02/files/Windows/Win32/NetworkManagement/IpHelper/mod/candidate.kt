// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn AddIPAddress(address : u32, ipmask : u32, ifindex : u32, ntecontext : *mut u32, nteinstance : *mut u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn CancelIPChangeNotify(notifyoverlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn CancelIfTimestampConfigChange(notificationhandle : HIFTIMESTAMPCHANGE));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn CancelMibChangeNotify2(notificationhandle : super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn CaptureInterfaceHardwareCrossTimestamp(interfaceluid : *const super::Ndis:: NET_LUID_LH, crosstimestamp : *mut INTERFACE_HARDWARE_CROSSTIMESTAMP) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn ConvertCompartmentGuidToId(compartmentguid : *const windows_sys::core::GUID, compartmentid : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertCompartmentIdToGuid(compartmentid : super::Ndis:: NET_IF_COMPARTMENT_ID, compartmentguid : *mut windows_sys::core::GUID) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceAliasToLuid(interfacealias : windows_sys::core::PCWSTR, interfaceluid : *mut super::Ndis:: NET_LUID_LH) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceGuidToLuid(interfaceguid : *const windows_sys::core::GUID, interfaceluid : *mut super::Ndis:: NET_LUID_LH) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceIndexToLuid(interfaceindex : u32, interfaceluid : *mut super::Ndis:: NET_LUID_LH) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceLuidToAlias(interfaceluid : *const super::Ndis:: NET_LUID_LH, interfacealias : windows_sys::core::PWSTR, length : usize) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceLuidToGuid(interfaceluid : *const super::Ndis:: NET_LUID_LH, interfaceguid : *mut windows_sys::core::GUID) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceLuidToIndex(interfaceluid : *const super::Ndis:: NET_LUID_LH, interfaceindex : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceLuidToNameA(interfaceluid : *const super::Ndis:: NET_LUID_LH, interfacename : windows_sys::core::PSTR, length : usize) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceLuidToNameW(interfaceluid : *const super::Ndis:: NET_LUID_LH, interfacename : windows_sys::core::PWSTR, length : usize) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceNameToLuidA(interfacename : windows_sys::core::PCSTR, interfaceluid : *mut super::Ndis:: NET_LUID_LH) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn ConvertInterfaceNameToLuidW(interfacename : windows_sys::core::PCWSTR, interfaceluid : *mut super::Ndis:: NET_LUID_LH) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn ConvertIpv4MaskToLength(mask : u32, masklength : *mut u8) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn ConvertLengthToIpv4Mask(masklength : u32, mask : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn CreateAnycastIpAddressEntry(row : *const MIB_ANYCASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn CreateIpForwardEntry(proute : *const MIB_IPFORWARDROW) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn CreateIpForwardEntry2(row : *const MIB_IPFORWARD_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn CreateIpNetEntry(parpentry : *const MIB_IPNETROW_LH) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn CreateIpNetEntry2(row : *const MIB_IPNET_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn CreatePersistentTcpPortReservation(startport : u16, numberofports : u16, token : *mut u64) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn CreatePersistentUdpPortReservation(startport : u16, numberofports : u16, token : *mut u64) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn CreateProxyArpEntry(dwaddress : u32, dwmask : u32, dwifindex : u32) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn CreateSortedAddressPairs(sourceaddresslist : *const super::super::Networking::WinSock:: SOCKADDR_IN6, sourceaddresscount : u32, destinationaddresslist : *const super::super::Networking::WinSock:: SOCKADDR_IN6, destinationaddresscount : u32, addresssortoptions : u32, sortedaddresspairlist : *mut *mut super::super::Networking::WinSock:: SOCKADDR_IN6_PAIR, sortedaddresspaircount : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn CreateUnicastIpAddressEntry(row : *const MIB_UNICASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn DeleteAnycastIpAddressEntry(row : *const MIB_ANYCASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn DeleteIPAddress(ntecontext : u32) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn DeleteIpForwardEntry(proute : *const MIB_IPFORWARDROW) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn DeleteIpForwardEntry2(row : *const MIB_IPFORWARD_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn DeleteIpNetEntry(parpentry : *const MIB_IPNETROW_LH) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn DeleteIpNetEntry2(row : *const MIB_IPNET_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn DeletePersistentTcpPortReservation(startport : u16, numberofports : u16) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn DeletePersistentUdpPortReservation(startport : u16, numberofports : u16) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn DeleteProxyArpEntry(dwaddress : u32, dwmask : u32, dwifindex : u32) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn DeleteUnicastIpAddressEntry(row : *const MIB_UNICASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn DisableMediaSense(phandle : *mut super::super::Foundation:: HANDLE, poverlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn EnableRouter(phandle : *mut super::super::Foundation:: HANDLE, poverlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn FlushIpNetTable(dwifindex : u32) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn FlushIpNetTable2(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, interfaceindex : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn FlushIpPathTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn FreeDnsSettings(settings : *mut DNS_SETTINGS));

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn FreeInterfaceDnsSettings(settings : *mut DNS_INTERFACE_SETTINGS));

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn FreeMibTable(memory : *const core::ffi::c_void));

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetAdapterIndex(adaptername : windows_sys::core::PCWSTR, ifindex : *mut u32) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetAdapterOrderMap() -> *mut IP_ADAPTER_ORDER_MAP);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetAdaptersAddresses(family : u32, flags : GET_ADAPTERS_ADDRESSES_FLAGS, reserved : *const core::ffi::c_void, adapteraddresses : *mut IP_ADAPTER_ADDRESSES_LH, sizepointer : *mut u32) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetAdaptersInfo(adapterinfo : *mut IP_ADAPTER_INFO, sizepointer : *mut u32) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetAnycastIpAddressEntry(row : *mut MIB_ANYCASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetAnycastIpAddressTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_ANYCASTIPADDRESS_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetBestInterface(dwdestaddr : u32, pdwbestifindex : *mut u32) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetBestInterfaceEx(pdestaddr : *const super::super::Networking::WinSock:: SOCKADDR, pdwbestifindex : *mut u32) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetBestRoute(dwdestaddr : u32, dwsourceaddr : u32, pbestroute : *mut MIB_IPFORWARDROW) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetBestRoute2(interfaceluid : *const super::Ndis:: NET_LUID_LH, interfaceindex : u32, sourceaddress : *const super::super::Networking::WinSock:: SOCKADDR_INET, destinationaddress : *const super::super::Networking::WinSock:: SOCKADDR_INET, addresssortoptions : u32, bestroute : *mut MIB_IPFORWARD_ROW2, bestsourceaddress : *mut super::super::Networking::WinSock:: SOCKADDR_INET) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetCurrentThreadCompartmentId() -> super::Ndis:: NET_IF_COMPARTMENT_ID);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetCurrentThreadCompartmentScope(compartmentscope : *mut u32, compartmentid : *mut u32));

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetDefaultCompartmentId() -> super::Ndis:: NET_IF_COMPARTMENT_ID);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetDnsSettings(settings : *mut DNS_SETTINGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetExtendedTcpTable(ptcptable : *mut core::ffi::c_void, pdwsize : *mut u32, border : windows_sys::core::BOOL, ulaf : u32, tableclass : TCP_TABLE_CLASS, reserved : u32) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetExtendedUdpTable(pudptable : *mut core::ffi::c_void, pdwsize : *mut u32, border : windows_sys::core::BOOL, ulaf : u32, tableclass : UDP_TABLE_CLASS, reserved : u32) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetFriendlyIfIndex(ifindex : u32) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIcmpStatistics(statistics : *mut MIB_ICMP) -> u32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIcmpStatisticsEx(statistics : *mut MIB_ICMP_EX_XPSP1, family : u32) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIfEntry(pifrow : *mut MIB_IFROW) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetIfEntry2(row : *mut MIB_IF_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetIfEntry2Ex(level : MIB_IF_ENTRY_LEVEL, row : *mut MIB_IF_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIfStackTable(table : *mut *mut MIB_IFSTACK_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIfTable(piftable : *mut MIB_IFTABLE, pdwsize : *mut u32, border : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetIfTable2(table : *mut *mut MIB_IF_TABLE2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetIfTable2Ex(level : MIB_IF_TABLE_LEVEL, table : *mut *mut MIB_IF_TABLE2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetInterfaceActiveTimestampCapabilities(interfaceluid : *const super::Ndis:: NET_LUID_LH, timestampcapabilites : *mut INTERFACE_TIMESTAMP_CAPABILITIES) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetInterfaceCurrentTimestampCapabilities(interfaceluid : *const super::Ndis:: NET_LUID_LH, timestampcapabilites : *mut INTERFACE_TIMESTAMP_CAPABILITIES) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetInterfaceDnsSettings(interface : windows_sys::core::GUID, settings : *mut DNS_INTERFACE_SETTINGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetInterfaceHardwareTimestampCapabilities(interfaceluid : *const super::Ndis:: NET_LUID_LH, timestampcapabilites : *mut INTERFACE_TIMESTAMP_CAPABILITIES) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetInterfaceInfo(piftable : *mut IP_INTERFACE_INFO, dwoutbuflen : *mut u32) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetInterfaceSupportedTimestampCapabilities(interfaceluid : *const super::Ndis:: NET_LUID_LH, timestampcapabilites : *mut INTERFACE_TIMESTAMP_CAPABILITIES) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetInvertedIfStackTable(table : *mut *mut MIB_INVERTEDIFSTACK_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIpAddrTable(pipaddrtable : *mut MIB_IPADDRTABLE, pdwsize : *mut u32, border : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIpErrorString(errorcode : u32, buffer : windows_sys::core::PWSTR, size : *mut u32) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpForwardEntry2(row : *mut MIB_IPFORWARD_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpForwardTable(pipforwardtable : *mut MIB_IPFORWARDTABLE, pdwsize : *mut u32, border : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpForwardTable2(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_IPFORWARD_TABLE2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpInterfaceEntry(row : *mut MIB_IPINTERFACE_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpInterfaceTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_IPINTERFACE_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpNetEntry2(row : *mut MIB_IPNET_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIpNetTable(ipnettable : *mut MIB_IPNETTABLE, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpNetTable2(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_IPNET_TABLE2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpNetworkConnectionBandwidthEstimates(interfaceindex : u32, addressfamily : super::super::Networking::WinSock:: ADDRESS_FAMILY, bandwidthestimates : *mut MIB_IP_NETWORK_CONNECTION_BANDWIDTH_ESTIMATES) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpPathEntry(row : *mut MIB_IPPATH_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetIpPathTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_IPPATH_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIpStatistics(statistics : *mut MIB_IPSTATS_LH) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetIpStatisticsEx(statistics : *mut MIB_IPSTATS_LH, family : u32) -> u32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetJobCompartmentId(jobhandle : super::super::Foundation:: HANDLE) -> super::Ndis:: NET_IF_COMPARTMENT_ID);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetMulticastIpAddressEntry(row : *mut MIB_MULTICASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetMulticastIpAddressTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_MULTICASTIPADDRESS_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetNetworkConnectivityHint(connectivityhint : *mut super::super::Networking::WinSock:: NL_NETWORK_CONNECTIVITY_HINT) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetNetworkConnectivityHintForInterface(interfaceindex : u32, connectivityhint : *mut super::super::Networking::WinSock:: NL_NETWORK_CONNECTIVITY_HINT) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetNetworkInformation(networkguid : *const windows_sys::core::GUID, compartmentid : *mut u32, siteid : *mut u32, networkname : windows_sys::core::PWSTR, length : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetNetworkParams(pfixedinfo : *mut FIXED_INFO_W2KSP1, poutbuflen : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetNumberOfInterfaces(pdwnumif : *mut u32) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetOwnerModuleFromPidAndInfo(ulpid : u32, pinfo : *const u64, class : TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer : *mut core::ffi::c_void, pdwsize : *mut u32) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetOwnerModuleFromTcp6Entry(ptcpentry : *const MIB_TCP6ROW_OWNER_MODULE, class : TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer : *mut core::ffi::c_void, pdwsize : *mut u32) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetOwnerModuleFromTcpEntry(ptcpentry : *const MIB_TCPROW_OWNER_MODULE, class : TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer : *mut core::ffi::c_void, pdwsize : *mut u32) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetOwnerModuleFromUdp6Entry(pudpentry : *const MIB_UDP6ROW_OWNER_MODULE, class : TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer : *mut core::ffi::c_void, pdwsize : *mut u32) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetOwnerModuleFromUdpEntry(pudpentry : *const MIB_UDPROW_OWNER_MODULE, class : TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer : *mut core::ffi::c_void, pdwsize : *mut u32) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetPerAdapterInfo(ifindex : u32, pperadapterinfo : *mut IP_PER_ADAPTER_INFO_W2KSP1, poutbuflen : *mut u32) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetPerTcp6ConnectionEStats(row : *const MIB_TCP6ROW, estatstype : TCP_ESTATS_TYPE, rw : *mut u8, rwversion : u32, rwsize : u32, ros : *mut u8, rosversion : u32, rossize : u32, rod : *mut u8, rodversion : u32, rodsize : u32) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetPerTcpConnectionEStats(row : *const MIB_TCPROW_LH, estatstype : TCP_ESTATS_TYPE, rw : *mut u8, rwversion : u32, rwsize : u32, ros : *mut u8, rosversion : u32, rossize : u32, rod : *mut u8, rodversion : u32, rodsize : u32) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetRTTAndHopCount(destipaddress : u32, hopcount : *mut u32, maxhops : u32, rtt : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn GetSessionCompartmentId(sessionid : u32) -> super::Ndis:: NET_IF_COMPARTMENT_ID);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetTcp6Table(tcptable : *mut MIB_TCP6TABLE, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetTcp6Table2(tcptable : *mut MIB_TCP6TABLE2, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetTcpStatistics(statistics : *mut MIB_TCPSTATS_LH) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetTcpStatisticsEx(statistics : *mut MIB_TCPSTATS_LH, family : u32) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetTcpStatisticsEx2(statistics : *mut MIB_TCPSTATS2, family : u32) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetTcpTable(tcptable : *mut MIB_TCPTABLE, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetTcpTable2(tcptable : *mut MIB_TCPTABLE2, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetTeredoPort(port : *mut u16) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn GetUdp6Table(udp6table : *mut MIB_UDP6TABLE, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetUdpStatistics(stats : *mut MIB_UDPSTATS) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetUdpStatisticsEx(statistics : *mut MIB_UDPSTATS, family : u32) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetUdpStatisticsEx2(statistics : *mut MIB_UDPSTATS2, family : u32) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetUdpTable(udptable : *mut MIB_UDPTABLE, sizepointer : *mut u32, order : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn GetUniDirectionalAdapterInfo(pipifinfo : *mut IP_UNIDIRECTIONAL_ADAPTER_ADDRESS, dwoutbuflen : *mut u32) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetUnicastIpAddressEntry(row : *mut MIB_UNICASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn GetUnicastIpAddressTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_UNICASTIPADDRESS_TABLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn Icmp6CreateFile() -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn Icmp6ParseReplies(replybuffer : *mut core::ffi::c_void, replysize : u32) -> u32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_IO"))]
// windows_link::link!("iphlpapi.dll" "system" fn Icmp6SendEcho2(icmphandle : super::super::Foundation:: HANDLE, event : super::super::Foundation:: HANDLE, apcroutine : super::super::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, sourceaddress : *const super::super::Networking::WinSock:: SOCKADDR_IN6, destinationaddress : *const super::super::Networking::WinSock:: SOCKADDR_IN6, requestdata : *const core::ffi::c_void, requestsize : u16, requestoptions : *const IP_OPTION_INFORMATION, replybuffer : *mut core::ffi::c_void, replysize : u32, timeout : u32) -> u32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn IcmpCloseHandle(icmphandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn IcmpCreateFile() -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn IcmpParseReplies(replybuffer : *mut core::ffi::c_void, replysize : u32) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn IcmpSendEcho(icmphandle : super::super::Foundation:: HANDLE, destinationaddress : u32, requestdata : *const core::ffi::c_void, requestsize : u16, requestoptions : *const IP_OPTION_INFORMATION, replybuffer : *mut core::ffi::c_void, replysize : u32, timeout : u32) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn IcmpSendEcho2(icmphandle : super::super::Foundation:: HANDLE, event : super::super::Foundation:: HANDLE, apcroutine : super::super::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, destinationaddress : u32, requestdata : *const core::ffi::c_void, requestsize : u16, requestoptions : *const IP_OPTION_INFORMATION, replybuffer : *mut core::ffi::c_void, replysize : u32, timeout : u32) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn IcmpSendEcho2Ex(icmphandle : super::super::Foundation:: HANDLE, event : super::super::Foundation:: HANDLE, apcroutine : super::super::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, sourceaddress : u32, destinationaddress : u32, requestdata : *const core::ffi::c_void, requestsize : u16, requestoptions : *const IP_OPTION_INFORMATION, replybuffer : *mut core::ffi::c_void, replysize : u32, timeout : u32) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn InitializeIpForwardEntry(row : *mut MIB_IPFORWARD_ROW2));

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn InitializeIpInterfaceEntry(row : *mut MIB_IPINTERFACE_ROW));

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn InitializeUnicastIpAddressEntry(row : *mut MIB_UNICASTIPADDRESS_ROW));

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn IpReleaseAddress(adapterinfo : *const IP_ADAPTER_INDEX_MAP) -> u32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn IpRenewAddress(adapterinfo : *const IP_ADAPTER_INDEX_MAP) -> u32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn LookupPersistentTcpPortReservation(startport : u16, numberofports : u16, token : *mut u64) -> u32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn LookupPersistentUdpPortReservation(startport : u16, numberofports : u16, token : *mut u64) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn NhpAllocateAndGetInterfaceInfoFromStack(pptable : *mut *mut IP_INTERFACE_NAME_INFO_W2KSP1, pdwcount : *mut u32, border : windows_sys::core::BOOL, hheap : super::super::Foundation:: HANDLE, dwflags : u32) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyAddrChange(handle : *mut super::super::Foundation:: HANDLE, overlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn NotifyIfTimestampConfigChange(callercontext : *const core::ffi::c_void, callback : PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle : *mut HIFTIMESTAMPCHANGE) -> u32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyIpInterfaceChange(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, callback : PIPINTERFACE_CHANGE_CALLBACK, callercontext : *const core::ffi::c_void, initialnotification : bool, notificationhandle : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyNetworkConnectivityHintChange(callback : PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext : *const core::ffi::c_void, initialnotification : bool, notificationhandle : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyRouteChange(handle : *mut super::super::Foundation:: HANDLE, overlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyRouteChange2(addressfamily : super::super::Networking::WinSock:: ADDRESS_FAMILY, callback : PIPFORWARD_CHANGE_CALLBACK, callercontext : *const core::ffi::c_void, initialnotification : bool, notificationhandle : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyStableUnicastIpAddressTable(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, table : *mut *mut MIB_UNICASTIPADDRESS_TABLE, callercallback : PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext : *const core::ffi::c_void, notificationhandle : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn NotifyTeredoPortChange(callback : PTEREDO_PORT_CHANGE_CALLBACK, callercontext : *const core::ffi::c_void, initialnotification : bool, notificationhandle : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn NotifyUnicastIpAddressChange(family : super::super::Networking::WinSock:: ADDRESS_FAMILY, callback : PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext : *const core::ffi::c_void, initialnotification : bool, notificationhandle : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn ParseNetworkString(networkstring : windows_sys::core::PCWSTR, types : u32, addressinfo : *mut NET_ADDRESS_INFO, portnumber : *mut u16, prefixlength : *mut u8) -> u32);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfAddFiltersToInterface(ih : *mut core::ffi::c_void, cinfilters : u32, pfiltin : *mut PF_FILTER_DESCRIPTOR, coutfilters : u32, pfiltout : *mut PF_FILTER_DESCRIPTOR, pfhandle : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfAddGlobalFilterToInterface(pinterface : *mut core::ffi::c_void, gffilter : GLOBAL_FILTER) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfBindInterfaceToIPAddress(pinterface : *mut core::ffi::c_void, pfattype : PFADDRESSTYPE, ipaddress : *mut u8) -> u32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfBindInterfaceToIndex(pinterface : *mut core::ffi::c_void, dwindex : u32, pfatlinktype : PFADDRESSTYPE, linkipaddress : *mut u8) -> u32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfCreateInterface(dwname : u32, inaction : PFFORWARD_ACTION, outaction : PFFORWARD_ACTION, buselog : windows_sys::core::BOOL, bmustbeunique : windows_sys::core::BOOL, ppinterface : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfDeleteInterface(pinterface : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfDeleteLog() -> u32);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfGetInterfaceStatistics(pinterface : *mut core::ffi::c_void, ppfstats : *mut PF_INTERFACE_STATS, pdwbuffersize : *mut u32, fresetcounters : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfMakeLog(hevent : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfRebindFilters(pinterface : *mut core::ffi::c_void, platebindinfo : *mut PF_LATEBIND_INFO) -> u32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfRemoveFilterHandles(pinterface : *mut core::ffi::c_void, cfilters : u32, pvhandles : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfRemoveFiltersFromInterface(ih : *mut core::ffi::c_void, cinfilters : u32, pfiltin : *mut PF_FILTER_DESCRIPTOR, coutfilters : u32, pfiltout : *mut PF_FILTER_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfRemoveGlobalFilterFromInterface(pinterface : *mut core::ffi::c_void, gffilter : GLOBAL_FILTER) -> u32);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfSetLogBuffer(pbbuffer : *mut u8, dwsize : u32, dwthreshold : u32, dwentries : u32, pdwloggedentries : *mut u32, pdwlostentries : *mut u32, pdwsizeused : *mut u32) -> u32);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfTestPacket(pininterface : *mut core::ffi::c_void, poutinterface : *mut core::ffi::c_void, cbytes : u32, pbpacket : *mut u8, ppaction : *mut PFFORWARD_ACTION) -> u32);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn PfUnBindInterface(pinterface : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn RegisterInterfaceTimestampConfigChange(callback : PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext : *const core::ffi::c_void, notificationhandle : *mut HIFTIMESTAMPCHANGE) -> u32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn ResolveIpNetEntry2(row : *mut MIB_IPNET_ROW2, sourceaddress : *const super::super::Networking::WinSock:: SOCKADDR_INET) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn ResolveNeighbor(networkaddress : *const super::super::Networking::WinSock:: SOCKADDR, physicaladdress : *mut core::ffi::c_void, physicaladdresslength : *mut u32) -> u32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn RestoreMediaSense(poverlapped : *const super::super::System::IO:: OVERLAPPED, lpdwenablecount : *mut u32) -> u32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SendARP(destip : u32, srcip : u32, pmacaddr : *mut core::ffi::c_void, phyaddrlen : *mut u32) -> u32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn SetCurrentThreadCompartmentId(compartmentid : super::Ndis:: NET_IF_COMPARTMENT_ID) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetCurrentThreadCompartmentScope(compartmentscope : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetDnsSettings(settings : *const DNS_SETTINGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetIfEntry(pifrow : *const MIB_IFROW) -> u32);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetInterfaceDnsSettings(interface : windows_sys::core::GUID, settings : *const DNS_INTERFACE_SETTINGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn SetIpForwardEntry(proute : *const MIB_IPFORWARDROW) -> u32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn SetIpForwardEntry2(route : *const MIB_IPFORWARD_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn SetIpInterfaceEntry(row : *mut MIB_IPINTERFACE_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetIpNetEntry(parpentry : *const MIB_IPNETROW_LH) -> u32);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn SetIpNetEntry2(row : *const MIB_IPNET_ROW2) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetIpStatistics(pipstats : *const MIB_IPSTATS_LH) -> u32);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetIpStatisticsEx(statistics : *const MIB_IPSTATS_LH, family : u32) -> u32);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetIpTTL(nttl : u32) -> u32);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn SetJobCompartmentId(jobhandle : super::super::Foundation:: HANDLE, compartmentid : super::Ndis:: NET_IF_COMPARTMENT_ID) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn SetNetworkInformation(networkguid : *const windows_sys::core::GUID, compartmentid : super::Ndis:: NET_IF_COMPARTMENT_ID, networkname : windows_sys::core::PCWSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("iphlpapi.dll" "system" fn SetPerTcp6ConnectionEStats(row : *const MIB_TCP6ROW, estatstype : TCP_ESTATS_TYPE, rw : *const u8, rwversion : u32, rwsize : u32, offset : u32) -> u32);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetPerTcpConnectionEStats(row : *const MIB_TCPROW_LH, estatstype : TCP_ESTATS_TYPE, rw : *const u8, rwversion : u32, rwsize : u32, offset : u32) -> u32);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("iphlpapi.dll" "system" fn SetSessionCompartmentId(sessionid : u32, compartmentid : super::Ndis:: NET_IF_COMPARTMENT_ID) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn SetTcpEntry(ptcprow : *const MIB_TCPROW_LH) -> u32);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// windows_link::link!("iphlpapi.dll" "system" fn SetUnicastIpAddressEntry(row : *const MIB_UNICASTIPADDRESS_ROW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("iphlpapi.dll" "system" fn UnenableRouter(poverlapped : *const super::super::System::IO:: OVERLAPPED, lpdwenablecount : *mut u32) -> u32);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn UnregisterInterfaceTimestampConfigChange(notificationhandle : HIFTIMESTAMPCHANGE));

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn if_indextoname(interfaceindex : u32, interfacename : windows_sys::core::PSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("iphlpapi.dll" "system" fn if_nametoindex(interfacename : windows_sys::core::PCSTR) -> u32);

public const val `ANY_SIZE`: UInt = 1u;
// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ARP_SEND_REPLY {
//     pub DestAddress: u32,
//     pub SrcAddress: u32,
// }

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
// UNSUPPORTED Rust 317:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_DOH_SERVER_SETTINGS {
//     pub Template: windows_sys::core::PWSTR,
//     pub Flags: u64,
// }

// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_INTERFACE_SETTINGS {
//     pub Version: u32,
//     pub Flags: u64,
//     pub Domain: windows_sys::core::PWSTR,
//     pub NameServer: windows_sys::core::PWSTR,
//     pub SearchList: windows_sys::core::PWSTR,
//     pub RegistrationEnabled: u32,
//     pub RegisterAdapterName: u32,
//     pub EnableLLMNR: u32,
//     pub QueryAdapterName: u32,
//     pub ProfileNameServer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule
// impl Default for DNS_INTERFACE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_INTERFACE_SETTINGS3 {
//     pub Version: u32,
//     pub Flags: u64,
//     pub Domain: windows_sys::core::PWSTR,
//     pub NameServer: windows_sys::core::PWSTR,
//     pub SearchList: windows_sys::core::PWSTR,
//     pub RegistrationEnabled: u32,
//     pub RegisterAdapterName: u32,
//     pub EnableLLMNR: u32,
//     pub QueryAdapterName: u32,
//     pub ProfileNameServer: windows_sys::core::PWSTR,
//     pub DisableUnconstrainedQueries: u32,
//     pub SupplementalSearchList: windows_sys::core::PWSTR,
//     pub cServerProperties: u32,
//     pub ServerProperties: *mut DNS_SERVER_PROPERTY,
//     pub cProfileServerProperties: u32,
//     pub ProfileServerProperties: *mut DNS_SERVER_PROPERTY,
// }

// UNSUPPORTED Rust 373:1: declaration Impl has no candidate rule
// impl Default for DNS_INTERFACE_SETTINGS3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 378:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_INTERFACE_SETTINGS4 {
//     pub Version: u32,
//     pub Flags: u64,
//     pub Domain: windows_sys::core::PWSTR,
//     pub NameServer: windows_sys::core::PWSTR,
//     pub SearchList: windows_sys::core::PWSTR,
//     pub RegistrationEnabled: u32,
//     pub RegisterAdapterName: u32,
//     pub EnableLLMNR: u32,
//     pub QueryAdapterName: u32,
//     pub ProfileNameServer: windows_sys::core::PWSTR,
//     pub DisableUnconstrainedQueries: u32,
//     pub SupplementalSearchList: windows_sys::core::PWSTR,
//     pub cServerProperties: u32,
//     pub ServerProperties: *mut DNS_SERVER_PROPERTY,
//     pub cProfileServerProperties: u32,
//     pub ProfileServerProperties: *mut DNS_SERVER_PROPERTY,
//     pub EncryptedDnsAdapterFlags: u32,
// }

// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule
// impl Default for DNS_INTERFACE_SETTINGS4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 404:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_INTERFACE_SETTINGS_EX {
//     pub SettingsV1: DNS_INTERFACE_SETTINGS,
//     pub DisableUnconstrainedQueries: u32,
//     pub SupplementalSearchList: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 411:1: declaration Impl has no candidate rule
// impl Default for DNS_INTERFACE_SETTINGS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_INTERFACE_SETTINGS_VERSION1`: UInt = 1u;
public const val `DNS_INTERFACE_SETTINGS_VERSION2`: UInt = 2u;
public const val `DNS_INTERFACE_SETTINGS_VERSION3`: UInt = 3u;
public const val `DNS_INTERFACE_SETTINGS_VERSION4`: UInt = 4u;
// UNSUPPORTED Rust 420:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SERVER_PROPERTY {
//     pub Version: u32,
//     pub ServerIndex: u32,
//     pub Type: DNS_SERVER_PROPERTY_TYPE,
//     pub Property: DNS_SERVER_PROPERTY_TYPES,
// }

// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVER_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_SERVER_PROPERTY_TYPE` = Int;
// UNSUPPORTED Rust 434:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_SERVER_PROPERTY_TYPES {
//     pub DohSettings: *mut DNS_DOH_SERVER_SETTINGS,
// }

// UNSUPPORTED Rust 439:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVER_PROPERTY_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_SERVER_PROPERTY_VERSION1`: UInt = 1u;
// UNSUPPORTED Rust 445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SETTINGS {
//     pub Version: u32,
//     pub Flags: u64,
//     pub Hostname: windows_sys::core::PWSTR,
//     pub Domain: windows_sys::core::PWSTR,
//     pub SearchList: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule
// impl Default for DNS_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SETTINGS2 {
//     pub Version: u32,
//     pub Flags: u64,
//     pub Hostname: windows_sys::core::PWSTR,
//     pub Domain: windows_sys::core::PWSTR,
//     pub SearchList: windows_sys::core::PWSTR,
//     pub SettingFlags: u64,
// }

// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 500:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 513:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 535:1: non-scalar type Ptr unsupported
// pub type HIFTIMESTAMPCHANGE = *mut core::ffi::c_void;

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
// UNSUPPORTED Rust 563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ICMPV6_ECHO_REPLY_LH {
//     pub Address: IPV6_ADDRESS_EX,
//     pub Status: u32,
//     pub RoundTripTime: u32,
// }

// UNSUPPORTED Rust 570:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMP_ECHO_REPLY {
//     pub Address: u32,
//     pub Status: u32,
//     pub RoundTripTime: u32,
//     pub DataSize: u16,
//     pub Reserved: u16,
//     pub Data: *mut core::ffi::c_void,
//     pub Options: IP_OPTION_INFORMATION,
// }

// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule
// impl Default for ICMP_ECHO_REPLY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct ICMP_ECHO_REPLY32 {
//     pub Address: u32,
//     pub Status: u32,
//     pub RoundTripTime: u32,
//     pub DataSize: u16,
//     pub Reserved: u16,
//     pub Data: *mut core::ffi::c_void,
//     pub Options: IP_OPTION_INFORMATION32,
// }

// UNSUPPORTED Rust 598:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 832:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERFACE_HARDWARE_CROSSTIMESTAMP {
//     pub SystemTimestamp1: u64,
//     pub HardwareClockTimestamp: u64,
//     pub SystemTimestamp2: u64,
// }

public const val `INTERFACE_HARDWARE_CROSSTIMESTAMP_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES {
//     pub PtpV2OverUdpIPv4EventMessageReceive: bool,
//     pub PtpV2OverUdpIPv4AllMessageReceive: bool,
//     pub PtpV2OverUdpIPv4EventMessageTransmit: bool,
//     pub PtpV2OverUdpIPv4AllMessageTransmit: bool,
//     pub PtpV2OverUdpIPv6EventMessageReceive: bool,
//     pub PtpV2OverUdpIPv6AllMessageReceive: bool,
//     pub PtpV2OverUdpIPv6EventMessageTransmit: bool,
//     pub PtpV2OverUdpIPv6AllMessageTransmit: bool,
//     pub AllReceive: bool,
//     pub AllTransmit: bool,
//     pub TaggedTransmit: bool,
// }

// UNSUPPORTED Rust 855:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES {
//     pub AllReceive: bool,
//     pub AllTransmit: bool,
//     pub TaggedTransmit: bool,
// }

// UNSUPPORTED Rust 862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERFACE_TIMESTAMP_CAPABILITIES {
//     pub HardwareClockFrequencyHz: u64,
//     pub SupportsCrossTimestamp: bool,
//     pub HardwareCapabilities: INTERFACE_HARDWARE_TIMESTAMP_CAPABILITIES,
//     pub SoftwareCapabilities: INTERFACE_SOFTWARE_TIMESTAMP_CAPABILITIES,
// }

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
// UNSUPPORTED Rust 880:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct IPV6_ADDRESS_EX {
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: [u16; 8],
//     pub sin6_scope_id: u32,
// }

// UNSUPPORTED Rust 888:1: declaration Impl has no candidate rule
// impl Default for IPV6_ADDRESS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPV6_GLOBAL_INFO`: UInt = 4294901775u;
public const val `IPV6_ROUTE_INFO`: UInt = 4294901776u;
// UNSUPPORTED Rust 895:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 936:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 942:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_LH_0_0,
// }

// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_ADDRESSES_LH_0_0 {
//     pub Length: u32,
//     pub IfIndex: u32,
// }

// UNSUPPORTED Rust 962:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_LH_1 {
//     pub Flags: u32,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_LH_1_0,
// }

// UNSUPPORTED Rust 969:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_LH_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_ADDRESSES_LH_1_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 981:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 1005:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1011:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ADDRESSES_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ADDRESSES_XP_0_0,
// }

// UNSUPPORTED Rust 1018:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for IP_ADAPTER_ADDRESSES_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1024:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_ADDRESSES_XP_0_0 {
//     pub Length: u32,
//     pub IfIndex: u32,
// }

public const val `IP_ADAPTER_ADDRESS_DNS_ELIGIBLE`: UInt = 1u;
public const val `IP_ADAPTER_ADDRESS_TRANSIENT`: UInt = 2u;
// UNSUPPORTED Rust 1033:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_ANYCAST_ADDRESS_XP {
//     pub Anonymous: IP_ADAPTER_ANYCAST_ADDRESS_XP_0,
//     pub Next: *mut IP_ADAPTER_ANYCAST_ADDRESS_XP,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
// }

// UNSUPPORTED Rust 1041:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_ANYCAST_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1047:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_ANYCAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1054:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_ANYCAST_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1060:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_ANYCAST_ADDRESS_XP_0_0 {
//     pub Length: u32,
//     pub Flags: u32,
// }

public const val `IP_ADAPTER_DDNS_ENABLED`: UInt = 1u;
public const val `IP_ADAPTER_DHCP_ENABLED`: UInt = 4u;
// UNSUPPORTED Rust 1069:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_DNS_SERVER_ADDRESS_XP {
//     pub Anonymous: IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0,
//     pub Next: *mut IP_ADAPTER_DNS_SERVER_ADDRESS_XP,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
// }

// UNSUPPORTED Rust 1077:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_DNS_SERVER_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1083:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1090:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1096:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_DNS_SERVER_ADDRESS_XP_0_0 {
//     pub Length: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_DNS_SUFFIX {
//     pub Next: *mut IP_ADAPTER_DNS_SUFFIX,
//     pub String: [u16; 256],
// }

// UNSUPPORTED Rust 1109:1: declaration Impl has no candidate rule
// impl Default for IP_ADAPTER_DNS_SUFFIX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_GATEWAY_ADDRESS_LH {
//     pub Anonymous: IP_ADAPTER_GATEWAY_ADDRESS_LH_0,
//     pub Next: *mut IP_ADAPTER_GATEWAY_ADDRESS_LH,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
// }

// UNSUPPORTED Rust 1122:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_GATEWAY_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1128:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_GATEWAY_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0,
// }

// UNSUPPORTED Rust 1135:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_GATEWAY_ADDRESS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_GATEWAY_ADDRESS_LH_0_0 {
//     pub Length: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1148:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_INDEX_MAP {
//     pub Index: u32,
//     pub Name: [u16; 128],
// }

// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule
// impl Default for IP_ADAPTER_INDEX_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1159:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 1181:1: declaration Impl has no candidate rule
// impl Default for IP_ADAPTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_ADAPTER_IPV4_ENABLED`: UInt = 128u;
public const val `IP_ADAPTER_IPV6_ENABLED`: UInt = 256u;
public const val `IP_ADAPTER_IPV6_MANAGE_ADDRESS_CONFIG`: UInt = 512u;
public const val `IP_ADAPTER_IPV6_OTHER_STATEFUL_CONFIG`: UInt = 32u;
// UNSUPPORTED Rust 1190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_MULTICAST_ADDRESS_XP {
//     pub Anonymous: IP_ADAPTER_MULTICAST_ADDRESS_XP_0,
//     pub Next: *mut IP_ADAPTER_MULTICAST_ADDRESS_XP,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
// }

// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_MULTICAST_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1204:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_MULTICAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1211:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_MULTICAST_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_MULTICAST_ADDRESS_XP_0_0 {
//     pub Length: u32,
//     pub Flags: u32,
// }

public const val `IP_ADAPTER_NETBIOS_OVER_TCPIP_ENABLED`: UInt = 64u;
public const val `IP_ADAPTER_NO_MULTICAST`: UInt = 16u;
// UNSUPPORTED Rust 1226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_ORDER_MAP {
//     pub NumAdapters: u32,
//     pub AdapterOrder: [u32; 1],
// }

// UNSUPPORTED Rust 1232:1: declaration Impl has no candidate rule
// impl Default for IP_ADAPTER_ORDER_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_PREFIX_XP {
//     pub Anonymous: IP_ADAPTER_PREFIX_XP_0,
//     pub Next: *mut IP_ADAPTER_PREFIX_XP,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
//     pub PrefixLength: u32,
// }

// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_PREFIX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1252:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_PREFIX_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_PREFIX_XP_0_0,
// }

// UNSUPPORTED Rust 1259:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_PREFIX_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_PREFIX_XP_0_0 {
//     pub Length: u32,
//     pub Flags: u32,
// }

public const val `IP_ADAPTER_RECEIVE_ONLY`: UInt = 8u;
public const val `IP_ADAPTER_REGISTER_ADAPTER_SUFFIX`: UInt = 2u;
// UNSUPPORTED Rust 1274:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_UNICAST_ADDRESS_LH {
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_LH_0,
//     pub Next: *mut IP_ADAPTER_UNICAST_ADDRESS_LH,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
//     pub PrefixOrigin: super::super::Networking::WinSock::NL_PREFIX_ORIGIN,
//     pub SuffixOrigin: super::super::Networking::WinSock::NL_SUFFIX_ORIGIN,
//     pub DadState: super::super::Networking::WinSock::NL_DAD_STATE,
//     pub ValidLifetime: u32,
//     pub PreferredLifetime: u32,
//     pub LeaseLifetime: u32,
//     pub OnLinkPrefixLength: u8,
// }

// UNSUPPORTED Rust 1289:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1295:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_UNICAST_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_LH_0_0,
// }

// UNSUPPORTED Rust 1302:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_UNICAST_ADDRESS_LH_0_0 {
//     pub Length: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1315:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_UNICAST_ADDRESS_XP {
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_XP_0,
//     pub Next: *mut IP_ADAPTER_UNICAST_ADDRESS_XP,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
//     pub PrefixOrigin: super::super::Networking::WinSock::NL_PREFIX_ORIGIN,
//     pub SuffixOrigin: super::super::Networking::WinSock::NL_SUFFIX_ORIGIN,
//     pub DadState: super::super::Networking::WinSock::NL_DAD_STATE,
//     pub ValidLifetime: u32,
//     pub PreferredLifetime: u32,
//     pub LeaseLifetime: u32,
// }

// UNSUPPORTED Rust 1329:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1335:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_UNICAST_ADDRESS_XP_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_UNICAST_ADDRESS_XP_0_0,
// }

// UNSUPPORTED Rust 1342:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_UNICAST_ADDRESS_XP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_UNICAST_ADDRESS_XP_0_0 {
//     pub Length: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADAPTER_WINS_SERVER_ADDRESS_LH {
//     pub Anonymous: IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0,
//     pub Next: *mut IP_ADAPTER_WINS_SERVER_ADDRESS_LH,
//     pub Address: super::super::Networking::WinSock::SOCKET_ADDRESS,
// }

// UNSUPPORTED Rust 1363:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_WINS_SERVER_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1369:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0 {
//     pub Alignment: u64,
//     pub Anonymous: IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0,
// }

// UNSUPPORTED Rust 1376:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct IP_ADAPTER_WINS_SERVER_ADDRESS_LH_0_0 {
//     pub Length: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1389:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct IP_ADDRESS_PREFIX {
//     pub Prefix: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub PrefixLength: u8,
// }

// UNSUPPORTED Rust 1396:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for IP_ADDRESS_PREFIX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADDRESS_STRING {
//     pub String: [i8; 16],
// }

// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule
// impl Default for IP_ADDRESS_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_ADDRROW`: UInt = 5u;
public const val `IP_ADDRTABLE`: UInt = 4u;
public const val `IP_ADDR_ADDED`: UInt = 11023u;
public const val `IP_ADDR_DELETED`: UInt = 11019u;
// UNSUPPORTED Rust 1416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_ADDR_STRING {
//     pub Next: *mut IP_ADDR_STRING,
//     pub IpAddress: IP_ADDRESS_STRING,
//     pub IpMask: IP_ADDRESS_STRING,
//     pub Context: u32,
// }

// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1466:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_INTERFACE_INFO {
//     pub NumAdapters: i32,
//     pub Adapter: [IP_ADAPTER_INDEX_MAP; 1],
// }

// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule
// impl Default for IP_INTERFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_INTERFACE_METRIC_CHANGE`: UInt = 11030u;
// UNSUPPORTED Rust 1478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IP_INTERFACE_NAME_INFO_W2KSP1 {
//     pub Index: u32,
//     pub MediaType: u32,
//     pub ConnectionType: u8,
//     pub AccessType: u8,
//     pub DeviceGuid: windows_sys::core::GUID,
//     pub InterfaceGuid: windows_sys::core::GUID,
// }

public const val `IP_INTERFACE_STATUS_INFO`: UInt = 4294901764u;
public const val `IP_INTERFACE_WOL_CAPABILITY_CHANGE`: UInt = 11033u;
public const val `IP_IN_FILTER_INFO`: UInt = 4294901761u;
public const val `IP_IN_FILTER_INFO_V6`: UInt = 4294901777u;
public const val `IP_IPINIP_CFG_INFO`: UInt = 4294901772u;
public const val `IP_MCAST_BOUNDARY_INFO`: UInt = 4294901771u;
// UNSUPPORTED Rust 1494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IP_MCAST_COUNTER_INFO {
//     pub InMcastOctets: u64,
//     pub OutMcastOctets: u64,
//     pub InMcastPkts: u64,
//     pub OutMcastPkts: u64,
// }

public const val `IP_MCAST_HEARBEAT_INFO`: UInt = 4294901770u;
public const val `IP_MCAST_LIMIT_INFO`: UInt = 4294901774u;
public const val `IP_MEDIA_CONNECT`: UInt = 11024u;
public const val `IP_MEDIA_DISCONNECT`: UInt = 11025u;
public const val `IP_MTU_CHANGE`: UInt = 11021u;
public const val `IP_NEGOTIATING_IPSEC`: UInt = 11032u;
public const val `IP_NETROW`: UInt = 10u;
public const val `IP_NETTABLE`: UInt = 9u;
public const val `IP_NO_RESOURCES`: UInt = 11006u;
// UNSUPPORTED Rust 1511:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_OPTION_INFORMATION {
//     pub Ttl: u8,
//     pub Tos: u8,
//     pub Flags: u8,
//     pub OptionsSize: u8,
//     pub OptionsData: *mut u8,
// }

// UNSUPPORTED Rust 1520:1: declaration Impl has no candidate rule
// impl Default for IP_OPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct IP_OPTION_INFORMATION32 {
//     pub Ttl: u8,
//     pub Tos: u8,
//     pub Flags: u8,
//     pub OptionsSize: u8,
//     pub OptionsData: *mut u8,
// }

// UNSUPPORTED Rust 1535:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_PER_ADAPTER_INFO_W2KSP1 {
//     pub AutoconfigEnabled: u32,
//     pub AutoconfigActive: u32,
//     pub CurrentDnsServer: *mut IP_ADDR_STRING,
//     pub DnsServerList: IP_ADDR_STRING,
// }

// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_UNIDIRECTIONAL_ADAPTER_ADDRESS {
//     pub NumAdapters: u32,
//     pub Address: [u32; 1],
// }

// UNSUPPORTED Rust 1584:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1621:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIBICMPINFO {
//     pub icmpInStats: MIBICMPSTATS,
//     pub icmpOutStats: MIBICMPSTATS,
// }

// UNSUPPORTED Rust 1627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIBICMPSTATS {
//     pub dwMsgs: u32,
//     pub dwErrors: u32,
//     pub dwDestUnreachs: u32,
//     pub dwTimeExcds: u32,
//     pub dwParmProbs: u32,
//     pub dwSrcQuenchs: u32,
//     pub dwRedirects: u32,
//     pub dwEchos: u32,
//     pub dwEchoReps: u32,
//     pub dwTimestamps: u32,
//     pub dwTimestampReps: u32,
//     pub dwAddrMasks: u32,
//     pub dwAddrMaskReps: u32,
// }

// UNSUPPORTED Rust 1644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIBICMPSTATS_EX_XPSP1 {
//     pub dwMsgs: u32,
//     pub dwErrors: u32,
//     pub rgdwTypeCount: [u32; 256],
// }

// UNSUPPORTED Rust 1651:1: declaration Impl has no candidate rule
// impl Default for MIBICMPSTATS_EX_XPSP1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1656:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_ANYCASTIPADDRESS_ROW {
//     pub Address: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub InterfaceIndex: u32,
//     pub ScopeId: super::super::Networking::WinSock::SCOPE_ID,
// }

// UNSUPPORTED Rust 1665:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_ANYCASTIPADDRESS_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_ANYCASTIPADDRESS_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_ANYCASTIPADDRESS_ROW; 1],
// }

// UNSUPPORTED Rust 1678:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_ANYCASTIPADDRESS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1684:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_BEST_IF {
//     pub dwDestAddr: u32,
//     pub dwIfIndex: u32,
// }

// UNSUPPORTED Rust 1690:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_BOUNDARYROW {
//     pub dwGroupAddress: u32,
//     pub dwGroupMask: u32,
// }

// UNSUPPORTED Rust 1696:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_ICMP {
//     pub stats: MIBICMPINFO,
// }

// UNSUPPORTED Rust 1701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_ICMP_EX_XPSP1 {
//     pub icmpInStats: MIBICMPSTATS_EX_XPSP1,
//     pub icmpOutStats: MIBICMPSTATS_EX_XPSP1,
// }

// UNSUPPORTED Rust 1707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IFNUMBER {
//     pub dwValue: u32,
// }

// UNSUPPORTED Rust 1712:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 1740:1: declaration Impl has no candidate rule
// impl Default for MIB_IFROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1745:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IFSTACK_ROW {
//     pub HigherLayerInterfaceIndex: u32,
//     pub LowerLayerInterfaceIndex: u32,
// }

// UNSUPPORTED Rust 1751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IFSTACK_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_IFSTACK_ROW; 1],
// }

// UNSUPPORTED Rust 1757:1: declaration Impl has no candidate rule
// impl Default for MIB_IFSTACK_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1762:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IFSTATUS {
//     pub dwIfIndex: u32,
//     pub dwAdminStatus: u32,
//     pub dwOperationalStatus: u32,
//     pub bMHbeatActive: windows_sys::core::BOOL,
//     pub bMHbeatAlive: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IFTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IFROW; 1],
// }

// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule
// impl Default for MIB_IFTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MIB_IF_ADMIN_STATUS_DOWN`: UInt = 2u;
public const val `MIB_IF_ADMIN_STATUS_TESTING`: UInt = 3u;
public const val `MIB_IF_ADMIN_STATUS_UP`: UInt = 1u;
public typealias `MIB_IF_ENTRY_LEVEL` = Int;
// UNSUPPORTED Rust 1786:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 1832:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for MIB_IF_ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1838:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IF_ROW2_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct MIB_IF_TABLE2 {
//     pub NumEntries: u32,
//     pub Table: [MIB_IF_ROW2; 1],
// }

// UNSUPPORTED Rust 1851:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1866:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_INVERTEDIFSTACK_ROW {
//     pub LowerLayerInterfaceIndex: u32,
//     pub HigherLayerInterfaceIndex: u32,
// }

// UNSUPPORTED Rust 1872:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_INVERTEDIFSTACK_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_INVERTEDIFSTACK_ROW; 1],
// }

// UNSUPPORTED Rust 1878:1: declaration Impl has no candidate rule
// impl Default for MIB_INVERTEDIFSTACK_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1883:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPADDRROW_W2K {
//     pub dwAddr: u32,
//     pub dwIndex: u32,
//     pub dwMask: u32,
//     pub dwBCastAddr: u32,
//     pub dwReasmSize: u32,
//     pub unused1: u16,
//     pub unused2: u16,
// }

// UNSUPPORTED Rust 1894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPADDRROW_XP {
//     pub dwAddr: u32,
//     pub dwIndex: u32,
//     pub dwMask: u32,
//     pub dwBCastAddr: u32,
//     pub dwReasmSize: u32,
//     pub unused1: u16,
//     pub wType: u16,
// }

// UNSUPPORTED Rust 1905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPADDRTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPADDRROW_XP; 1],
// }

// UNSUPPORTED Rust 1911:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1922:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_IPDESTROW {
//     pub ForwardRow: MIB_IPFORWARDROW,
//     pub dwForwardPreference: u32,
//     pub dwForwardViewSet: u32,
// }

// UNSUPPORTED Rust 1930:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPDESTROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1936:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_IPDESTTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPDESTROW; 1],
// }

// UNSUPPORTED Rust 1943:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPDESTTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPFORWARDNUMBER {
//     pub dwValue: u32,
// }

// UNSUPPORTED Rust 1954:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_IPFORWARDROW {
//     pub dwForwardDest: u32,
//     pub dwForwardMask: u32,
//     pub dwForwardPolicy: u32,
//     pub dwForwardNextHop: u32,
//     pub dwForwardIfIndex: u32,
//     pub Anonymous1: MIB_IPFORWARDROW_0,
//     pub Anonymous2: MIB_IPFORWARDROW_1,
//     pub dwForwardAge: u32,
//     pub dwForwardNextHopAS: u32,
//     pub dwForwardMetric1: u32,
//     pub dwForwardMetric2: u32,
//     pub dwForwardMetric3: u32,
//     pub dwForwardMetric4: u32,
//     pub dwForwardMetric5: u32,
// }

// UNSUPPORTED Rust 1973:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1979:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union MIB_IPFORWARDROW_0 {
//     pub dwForwardType: u32,
//     pub ForwardType: MIB_IPFORWARD_TYPE,
// }

// UNSUPPORTED Rust 1986:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDROW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1992:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union MIB_IPFORWARDROW_1 {
//     pub dwForwardProto: u32,
//     pub ForwardProto: super::super::Networking::WinSock::NL_ROUTE_PROTOCOL,
// }

// UNSUPPORTED Rust 1999:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDROW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2005:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_IPFORWARDTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPFORWARDROW; 1],
// }

// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_IPFORWARDTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPFORWARD_ROW2 {
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub InterfaceIndex: u32,
//     pub DestinationPrefix: IP_ADDRESS_PREFIX,
//     pub NextHop: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub SitePrefixLength: u8,
//     pub ValidLifetime: u32,
//     pub PreferredLifetime: u32,
//     pub Metric: u32,
//     pub Protocol: super::super::Networking::WinSock::NL_ROUTE_PROTOCOL,
//     pub Loopback: bool,
//     pub AutoconfigureAddress: bool,
//     pub Publish: bool,
//     pub Immortal: bool,
//     pub Age: u32,
//     pub Origin: super::super::Networking::WinSock::NL_ROUTE_ORIGIN,
// }

// UNSUPPORTED Rust 2038:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPFORWARD_ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPFORWARD_TABLE2 {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPFORWARD_ROW2; 1],
// }

// UNSUPPORTED Rust 2051:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPFORWARD_TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MIB_IPFORWARD_TYPE` = Int;
// UNSUPPORTED Rust 2058:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2098:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPINTERFACE_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2104:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPINTERFACE_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPINTERFACE_ROW; 1],
// }

// UNSUPPORTED Rust 2111:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPINTERFACE_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2117:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPMCAST_BOUNDARY {
//     pub dwIfIndex: u32,
//     pub dwGroupAddress: u32,
//     pub dwGroupMask: u32,
//     pub dwStatus: u32,
// }

// UNSUPPORTED Rust 2125:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_BOUNDARY_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_BOUNDARY; 1],
// }

// UNSUPPORTED Rust 2131:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_BOUNDARY_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPMCAST_GLOBAL {
//     pub dwEnable: u32,
// }

// UNSUPPORTED Rust 2141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPMCAST_IF_ENTRY {
//     pub dwIfIndex: u32,
//     pub dwTtl: u32,
//     pub dwProtocol: u32,
//     pub dwRateLimit: u32,
//     pub ulInMcastOctets: u32,
//     pub ulOutMcastOctets: u32,
// }

// UNSUPPORTED Rust 2151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_IF_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_IF_ENTRY; 1],
// }

// UNSUPPORTED Rust 2157:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_IF_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2162:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2182:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_MFE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2187:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2208:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_MFE_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2213:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2239:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_MFE_STATS_EX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPMCAST_OIF_STATS_LH {
//     pub dwOutIfIndex: u32,
//     pub dwNextHopAddr: u32,
//     pub dwDialContext: u32,
//     pub ulTtlTooLow: u32,
//     pub ulFragNeeded: u32,
//     pub ulOutPackets: u32,
//     pub ulOutDiscards: u32,
// }

// UNSUPPORTED Rust 2255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_OIF_STATS_W2K {
//     pub dwOutIfIndex: u32,
//     pub dwNextHopAddr: u32,
//     pub pvDialContext: *mut core::ffi::c_void,
//     pub ulTtlTooLow: u32,
//     pub ulFragNeeded: u32,
//     pub ulOutPackets: u32,
//     pub ulOutDiscards: u32,
// }

// UNSUPPORTED Rust 2266:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_OIF_STATS_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_OIF_W2K {
//     pub dwOutIfIndex: u32,
//     pub dwNextHopAddr: u32,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 2279:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_OIF_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPMCAST_OIF_XP {
//     pub dwOutIfIndex: u32,
//     pub dwNextHopAddr: u32,
//     pub dwReserved: u32,
//     pub dwReserved1: u32,
// }

// UNSUPPORTED Rust 2292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPMCAST_SCOPE {
//     pub dwGroupAddress: u32,
//     pub dwGroupMask: u32,
//     pub snNameBuffer: [u16; 256],
//     pub dwStatus: u32,
// }

// UNSUPPORTED Rust 2300:1: declaration Impl has no candidate rule
// impl Default for MIB_IPMCAST_SCOPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNETROW_LH {
//     pub dwIndex: u32,
//     pub dwPhysAddrLen: u32,
//     pub bPhysAddr: [u8; 8],
//     pub dwAddr: u32,
//     pub Anonymous: MIB_IPNETROW_LH_0,
// }

// UNSUPPORTED Rust 2314:1: declaration Impl has no candidate rule
// impl Default for MIB_IPNETROW_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2319:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_IPNETROW_LH_0 {
//     pub dwType: u32,
//     pub Type: MIB_IPNET_TYPE,
// }

// UNSUPPORTED Rust 2325:1: declaration Impl has no candidate rule
// impl Default for MIB_IPNETROW_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNETROW_W2K {
//     pub dwIndex: u32,
//     pub dwPhysAddrLen: u32,
//     pub bPhysAddr: [u8; 8],
//     pub dwAddr: u32,
//     pub dwType: u32,
// }

// UNSUPPORTED Rust 2339:1: declaration Impl has no candidate rule
// impl Default for MIB_IPNETROW_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNETTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPNETROW_LH; 1],
// }

// UNSUPPORTED Rust 2350:1: declaration Impl has no candidate rule
// impl Default for MIB_IPNETTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2355:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2368:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2374:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPNET_ROW2_0 {
//     pub Anonymous: MIB_IPNET_ROW2_0_0,
//     pub Flags: u8,
// }

// UNSUPPORTED Rust 2381:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_ROW2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2387:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPNET_ROW2_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2393:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPNET_ROW2_1 {
//     pub LastReachable: u32,
//     pub LastUnreachable: u32,
// }

// UNSUPPORTED Rust 2400:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPNET_ROW2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPNET_TABLE2 {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPNET_ROW2; 1],
// }

// UNSUPPORTED Rust 2413:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPPATH_ROW {
//     pub Source: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub Destination: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub InterfaceIndex: u32,
//     pub CurrentNextHop: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub PathMtu: u32,
//     pub RttMean: u32,
//     pub RttDeviation: u32,
//     pub Anonymous: MIB_IPPATH_ROW_0,
//     pub IsReachable: bool,
//     pub LinkTransmitSpeed: u64,
//     pub LinkReceiveSpeed: u64,
// }

// UNSUPPORTED Rust 2441:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPPATH_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2447:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub union MIB_IPPATH_ROW_0 {
//     pub LastReachable: u32,
//     pub LastUnreachable: u32,
// }

// UNSUPPORTED Rust 2454:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_IPPATH_ROW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_IPPATH_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_IPPATH_ROW; 1],
// }

// UNSUPPORTED Rust 2467:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2479:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_IPSTATS_LH {
//     pub Anonymous: MIB_IPSTATS_LH_0,
//     pub dwDefaultTTL: u32,
//     pub dwInReceives: u32,
//     pub dwInHdrErrors: u32,
//     pub dwInAddrErrors: u32,
//     pub dwForwDatagrams: u32,
//     pub dwInUnknownProtos: u32,
//     pub dwInDiscards: u32,
//     pub dwInDelivers: u32,
//     pub dwOutRequests: u32,
//     pub dwRoutingDiscards: u32,
//     pub dwOutDiscards: u32,
//     pub dwOutNoRoutes: u32,
//     pub dwReasmTimeout: u32,
//     pub dwReasmReqds: u32,
//     pub dwReasmOks: u32,
//     pub dwReasmFails: u32,
//     pub dwFragOks: u32,
//     pub dwFragFails: u32,
//     pub dwFragCreates: u32,
//     pub dwNumIf: u32,
//     pub dwNumAddr: u32,
//     pub dwNumRoutes: u32,
// }

// UNSUPPORTED Rust 2506:1: declaration Impl has no candidate rule
// impl Default for MIB_IPSTATS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2511:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_IPSTATS_LH_0 {
//     pub dwForwarding: u32,
//     pub Forwarding: MIB_IPSTATS_FORWARDING,
// }

// UNSUPPORTED Rust 2517:1: declaration Impl has no candidate rule
// impl Default for MIB_IPSTATS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2522:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IPSTATS_W2K {
//     pub dwForwarding: u32,
//     pub dwDefaultTTL: u32,
//     pub dwInReceives: u32,
//     pub dwInHdrErrors: u32,
//     pub dwInAddrErrors: u32,
//     pub dwForwDatagrams: u32,
//     pub dwInUnknownProtos: u32,
//     pub dwInDiscards: u32,
//     pub dwInDelivers: u32,
//     pub dwOutRequests: u32,
//     pub dwRoutingDiscards: u32,
//     pub dwOutDiscards: u32,
//     pub dwOutNoRoutes: u32,
//     pub dwReasmTimeout: u32,
//     pub dwReasmReqds: u32,
//     pub dwReasmOks: u32,
//     pub dwReasmFails: u32,
//     pub dwFragOks: u32,
//     pub dwFragFails: u32,
//     pub dwFragCreates: u32,
//     pub dwNumIf: u32,
//     pub dwNumAddr: u32,
//     pub dwNumRoutes: u32,
// }

public const val `MIB_IP_FORWARDING`: `MIB_IPSTATS_FORWARDING` = 1;
// UNSUPPORTED Rust 2550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_IP_NETWORK_CONNECTION_BANDWIDTH_ESTIMATES {
//     pub InboundBandwidthInformation: super::super::Networking::WinSock::NL_BANDWIDTH_INFORMATION,
//     pub OutboundBandwidthInformation: super::super::Networking::WinSock::NL_BANDWIDTH_INFORMATION,
// }

public const val `MIB_IP_NOT_FORWARDING`: `MIB_IPSTATS_FORWARDING` = 2;
// UNSUPPORTED Rust 2558:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_MCAST_LIMIT_ROW {
//     pub dwTtl: u32,
//     pub dwRateLimit: u32,
// }

// UNSUPPORTED Rust 2564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_MFE_STATS_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_MFE_STATS; 1],
// }

// UNSUPPORTED Rust 2570:1: declaration Impl has no candidate rule
// impl Default for MIB_MFE_STATS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_MFE_STATS_TABLE_EX_XP {
//     pub dwNumEntries: u32,
//     pub table: [*mut MIB_IPMCAST_MFE_STATS_EX_XP; 1],
// }

// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule
// impl Default for MIB_MFE_STATS_TABLE_EX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_MFE_TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_IPMCAST_MFE; 1],
// }

// UNSUPPORTED Rust 2592:1: declaration Impl has no candidate rule
// impl Default for MIB_MFE_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_MULTICASTIPADDRESS_ROW {
//     pub Address: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub InterfaceIndex: u32,
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub ScopeId: super::super::Networking::WinSock::SCOPE_ID,
// }

// UNSUPPORTED Rust 2606:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_MULTICASTIPADDRESS_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_MULTICASTIPADDRESS_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_MULTICASTIPADDRESS_ROW; 1],
// }

// UNSUPPORTED Rust 2619:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_MULTICASTIPADDRESS_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MIB_NOTIFICATION_TYPE` = Int;
// UNSUPPORTED Rust 2626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_OPAQUE_INFO {
//     pub dwId: u32,
//     pub Anonymous: MIB_OPAQUE_INFO_0,
// }

// UNSUPPORTED Rust 2632:1: declaration Impl has no candidate rule
// impl Default for MIB_OPAQUE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2637:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_OPAQUE_INFO_0 {
//     pub ullAlign: u64,
//     pub rgbyData: [u8; 1],
// }

// UNSUPPORTED Rust 2643:1: declaration Impl has no candidate rule
// impl Default for MIB_OPAQUE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_OPAQUE_QUERY {
//     pub dwVarId: u32,
//     pub rgdwVarIndex: [u32; 1],
// }

// UNSUPPORTED Rust 2654:1: declaration Impl has no candidate rule
// impl Default for MIB_OPAQUE_QUERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_PROXYARP {
//     pub dwAddress: u32,
//     pub dwMask: u32,
//     pub dwIfIndex: u32,
// }

// UNSUPPORTED Rust 2666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_ROUTESTATE {
//     pub bRoutesSetToStack: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6ROW {
//     pub State: MIB_TCP_STATE,
//     pub LocalAddr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub RemoteAddr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwRemoteScopeId: u32,
//     pub dwRemotePort: u32,
// }

// UNSUPPORTED Rust 2683:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6ROW2 {
//     pub LocalAddr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub RemoteAddr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwRemoteScopeId: u32,
//     pub dwRemotePort: u32,
//     pub State: MIB_TCP_STATE,
//     pub dwOwningPid: u32,
//     pub dwOffloadState: TCP_CONNECTION_OFFLOAD_STATE,
// }

// UNSUPPORTED Rust 2703:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2723:1: declaration Impl has no candidate rule
// impl Default for MIB_TCP6ROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2728:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2740:1: declaration Impl has no candidate rule
// impl Default for MIB_TCP6ROW_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2745:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW; 1],
// }

// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW2; 1],
// }

// UNSUPPORTED Rust 2765:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_TCP6TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 2777:1: declaration Impl has no candidate rule
// impl Default for MIB_TCP6TABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCP6TABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCP6ROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 2788:1: declaration Impl has no candidate rule
// impl Default for MIB_TCP6TABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_TCPROW2 {
//     pub dwState: u32,
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwRemoteAddr: u32,
//     pub dwRemotePort: u32,
//     pub dwOwningPid: u32,
//     pub dwOffloadState: TCP_CONNECTION_OFFLOAD_STATE,
// }

// UNSUPPORTED Rust 2804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPROW_LH {
//     pub Anonymous: MIB_TCPROW_LH_0,
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwRemoteAddr: u32,
//     pub dwRemotePort: u32,
// }

// UNSUPPORTED Rust 2813:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPROW_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2818:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_TCPROW_LH_0 {
//     pub dwState: u32,
//     pub State: MIB_TCP_STATE,
// }

// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPROW_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2829:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 2841:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2846:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_TCPROW_OWNER_PID {
//     pub dwState: u32,
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwRemoteAddr: u32,
//     pub dwRemotePort: u32,
//     pub dwOwningPid: u32,
// }

// UNSUPPORTED Rust 2856:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_TCPROW_W2K {
//     pub dwState: u32,
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwRemoteAddr: u32,
//     pub dwRemotePort: u32,
// }

// UNSUPPORTED Rust 2865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_TCPSTATS2 {
//     pub RtoAlgorithm: TCP_RTO_ALGORITHM,
//     pub dwRtoMin: u32,
//     pub dwRtoMax: u32,
//     pub dwMaxConn: u32,
//     pub dwActiveOpens: u32,
//     pub dwPassiveOpens: u32,
//     pub dwAttemptFails: u32,
//     pub dwEstabResets: u32,
//     pub dwCurrEstab: u32,
//     pub dw64InSegs: u64,
//     pub dw64OutSegs: u64,
//     pub dwRetransSegs: u32,
//     pub dwInErrs: u32,
//     pub dwOutRsts: u32,
//     pub dwNumConns: u32,
// }

// UNSUPPORTED Rust 2884:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPSTATS_LH {
//     pub Anonymous: MIB_TCPSTATS_LH_0,
//     pub dwRtoMin: u32,
//     pub dwRtoMax: u32,
//     pub dwMaxConn: u32,
//     pub dwActiveOpens: u32,
//     pub dwPassiveOpens: u32,
//     pub dwAttemptFails: u32,
//     pub dwEstabResets: u32,
//     pub dwCurrEstab: u32,
//     pub dwInSegs: u32,
//     pub dwOutSegs: u32,
//     pub dwRetransSegs: u32,
//     pub dwInErrs: u32,
//     pub dwOutRsts: u32,
//     pub dwNumConns: u32,
// }

// UNSUPPORTED Rust 2903:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPSTATS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2908:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_TCPSTATS_LH_0 {
//     pub dwRtoAlgorithm: u32,
//     pub RtoAlgorithm: TCP_RTO_ALGORITHM,
// }

// UNSUPPORTED Rust 2914:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPSTATS_LH_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_TCPSTATS_W2K {
//     pub dwRtoAlgorithm: u32,
//     pub dwRtoMin: u32,
//     pub dwRtoMax: u32,
//     pub dwMaxConn: u32,
//     pub dwActiveOpens: u32,
//     pub dwPassiveOpens: u32,
//     pub dwAttemptFails: u32,
//     pub dwEstabResets: u32,
//     pub dwCurrEstab: u32,
//     pub dwInSegs: u32,
//     pub dwOutSegs: u32,
//     pub dwRetransSegs: u32,
//     pub dwInErrs: u32,
//     pub dwOutRsts: u32,
//     pub dwNumConns: u32,
// }

// UNSUPPORTED Rust 2938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW_LH; 1],
// }

// UNSUPPORTED Rust 2944:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW2; 1],
// }

// UNSUPPORTED Rust 2955:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPTABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 2966:1: declaration Impl has no candidate rule
// impl Default for MIB_TCPTABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2971:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_TCPTABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_TCPROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 2977:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6ROW {
//     pub dwLocalAddr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
// }

// UNSUPPORTED Rust 3008:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_UDP6ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3014:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 3028:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6ROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3033:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDP6ROW2_0 {
//     pub Anonymous: MIB_UDP6ROW2_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3039:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6ROW2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDP6ROW2_0_0 {
//     pub _bitfield: i32,
// }

// UNSUPPORTED Rust 3049:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 3060:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6ROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3065:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDP6ROW_OWNER_MODULE_0 {
//     pub Anonymous: MIB_UDP6ROW_OWNER_MODULE_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3071:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6ROW_OWNER_MODULE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3076:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDP6ROW_OWNER_MODULE_0_0 {
//     pub _bitfield: i32,
// }

// UNSUPPORTED Rust 3081:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6ROW_OWNER_PID {
//     pub ucLocalAddr: [u8; 16],
//     pub dwLocalScopeId: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
// }

// UNSUPPORTED Rust 3089:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6ROW_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3094:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW; 1],
// }

// UNSUPPORTED Rust 3101:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MIB_UDP6TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW2; 1],
// }

// UNSUPPORTED Rust 3113:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6TABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 3124:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6TABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDP6TABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDP6ROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 3135:1: declaration Impl has no candidate rule
// impl Default for MIB_UDP6TABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDPROW {
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
// }

// UNSUPPORTED Rust 3146:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 3158:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPROW2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3163:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDPROW2_0 {
//     pub Anonymous: MIB_UDPROW2_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3169:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPROW2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3174:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDPROW2_0_0 {
//     pub _bitfield: i32,
// }

// UNSUPPORTED Rust 3179:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 3189:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPROW_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3194:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIB_UDPROW_OWNER_MODULE_0 {
//     pub Anonymous: MIB_UDPROW_OWNER_MODULE_0_0,
//     pub dwFlags: i32,
// }

// UNSUPPORTED Rust 3200:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPROW_OWNER_MODULE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDPROW_OWNER_MODULE_0_0 {
//     pub _bitfield: i32,
// }

// UNSUPPORTED Rust 3210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDPROW_OWNER_PID {
//     pub dwLocalAddr: u32,
//     pub dwLocalPort: u32,
//     pub dwOwningPid: u32,
// }

// UNSUPPORTED Rust 3217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDPSTATS {
//     pub dwInDatagrams: u32,
//     pub dwNoPorts: u32,
//     pub dwInErrors: u32,
//     pub dwOutDatagrams: u32,
//     pub dwNumAddrs: u32,
// }

// UNSUPPORTED Rust 3226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIB_UDPSTATS2 {
//     pub dw64InDatagrams: u64,
//     pub dwNoPorts: u32,
//     pub dwInErrors: u32,
//     pub dw64OutDatagrams: u64,
//     pub dwNumAddrs: u32,
// }

// UNSUPPORTED Rust 3235:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW; 1],
// }

// UNSUPPORTED Rust 3241:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE2 {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW2; 1],
// }

// UNSUPPORTED Rust 3252:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPTABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE_OWNER_MODULE {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW_OWNER_MODULE; 1],
// }

// UNSUPPORTED Rust 3263:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPTABLE_OWNER_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3268:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIB_UDPTABLE_OWNER_PID {
//     pub dwNumEntries: u32,
//     pub table: [MIB_UDPROW_OWNER_PID; 1],
// }

// UNSUPPORTED Rust 3274:1: declaration Impl has no candidate rule
// impl Default for MIB_UDPTABLE_OWNER_PID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3279:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_UNICASTIPADDRESS_ROW {
//     pub Address: super::super::Networking::WinSock::SOCKADDR_INET,
//     pub InterfaceLuid: super::Ndis::NET_LUID_LH,
//     pub InterfaceIndex: u32,
//     pub PrefixOrigin: super::super::Networking::WinSock::NL_PREFIX_ORIGIN,
//     pub SuffixOrigin: super::super::Networking::WinSock::NL_SUFFIX_ORIGIN,
//     pub ValidLifetime: u32,
//     pub PreferredLifetime: u32,
//     pub OnLinkPrefixLength: u8,
//     pub SkipAsSource: bool,
//     pub DadState: super::super::Networking::WinSock::NL_DAD_STATE,
//     pub ScopeId: super::super::Networking::WinSock::SCOPE_ID,
//     pub CreationTimeStamp: i64,
// }

// UNSUPPORTED Rust 3296:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// impl Default for MIB_UNICASTIPADDRESS_ROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3302:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// #[derive(Clone, Copy)]
// pub struct MIB_UNICASTIPADDRESS_TABLE {
//     pub NumEntries: u32,
//     pub Table: [MIB_UNICASTIPADDRESS_ROW; 1],
// }

// UNSUPPORTED Rust 3309:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct NET_ADDRESS_INFO {
//     pub Format: NET_ADDRESS_FORMAT,
//     pub Anonymous: NET_ADDRESS_INFO_0,
// }

// UNSUPPORTED Rust 3343:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for NET_ADDRESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3349:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union NET_ADDRESS_INFO_0 {
//     pub NamedAddress: NET_ADDRESS_INFO_0_0,
//     pub Ipv4Address: super::super::Networking::WinSock::SOCKADDR_IN,
//     pub Ipv6Address: super::super::Networking::WinSock::SOCKADDR_IN6,
//     pub IpAddress: super::super::Networking::WinSock::SOCKADDR,
// }

// UNSUPPORTED Rust 3358:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for NET_ADDRESS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct NET_ADDRESS_INFO_0_0 {
//     pub Address: [u16; 256],
//     pub Port: [u16; 6],
// }

// UNSUPPORTED Rust 3371:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3400:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 3413:1: declaration Impl has no candidate rule
// impl Default for PFLOGFRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PF_ACTION_DROP`: `PFFORWARD_ACTION` = 1;
public const val `PF_ACTION_FORWARD`: `PFFORWARD_ACTION` = 0;
// UNSUPPORTED Rust 3420:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PF_FILTER_DESCRIPTOR {
//     pub dwFilterFlags: u32,
//     pub dwRule: u32,
//     pub pfatType: PFADDRESSTYPE,
//     pub SrcAddr: *mut u8,
//     pub SrcMask: *mut u8,
//     pub DstAddr: *mut u8,
//     pub DstMask: *mut u8,
//     pub dwProtocol: u32,
//     pub fLateBound: u32,
//     pub wSrcPort: u16,
//     pub wDstPort: u16,
//     pub wSrcPortHighRange: u16,
//     pub wDstPortHighRange: u16,
// }

// UNSUPPORTED Rust 3437:1: declaration Impl has no candidate rule
// impl Default for PF_FILTER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PF_FILTER_STATS {
//     pub dwNumPacketsFiltered: u32,
//     pub info: PF_FILTER_DESCRIPTOR,
// }

// UNSUPPORTED Rust 3448:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 3468:1: declaration Impl has no candidate rule
// impl Default for PF_INTERFACE_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PF_IPV4`: `PFADDRESSTYPE` = 0;
public const val `PF_IPV6`: `PFADDRESSTYPE` = 1;
// UNSUPPORTED Rust 3475:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PF_LATEBIND_INFO {
//     pub SrcAddr: *mut u8,
//     pub DstAddr: *mut u8,
//     pub Mask: *mut u8,
// }

// UNSUPPORTED Rust 3482:1: declaration Impl has no candidate rule
// impl Default for PF_LATEBIND_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3487:1: generic scalar type unsupported
// pub type PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 3488:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// pub type PIPFORWARD_CHANGE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void, row: *const MIB_IPFORWARD_ROW2, notificationtype: MIB_NOTIFICATION_TYPE)>;

// UNSUPPORTED Rust 3490:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// pub type PIPINTERFACE_CHANGE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void, row: *const MIB_IPINTERFACE_ROW, notificationtype: MIB_NOTIFICATION_TYPE)>;

// UNSUPPORTED Rust 3492:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Networking_WinSock")]
// pub type PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void, connectivityhint: super::super::Networking::WinSock::NL_NETWORK_CONNECTIVITY_HINT)>;

public const val `PROXY_ARP`: UInt = 22u;
// UNSUPPORTED Rust 3495:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// pub type PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void, addresstable: *const MIB_UNICASTIPADDRESS_TABLE)>;

// UNSUPPORTED Rust 3497:1: generic scalar type unsupported
// pub type PTEREDO_PORT_CHANGE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void, port: u16, notificationtype: MIB_NOTIFICATION_TYPE)>;

// UNSUPPORTED Rust 3498:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Networking_WinSock"))]
// pub type PUNICAST_IPADDRESS_CHANGE_CALLBACK = Option<unsafe extern "system" fn(callercontext: *const core::ffi::c_void, row: *const MIB_UNICASTIPADDRESS_ROW, notificationtype: MIB_NOTIFICATION_TYPE)>;

public const val `ROUTE_LONGER`: UInt = 32u;
public const val `ROUTE_MATCHING`: UInt = 31u;
public const val `ROUTE_SHORTER`: UInt = 33u;
public const val `ROUTE_STATE`: UInt = 34u;
public const val `TCP6_STATS`: UInt = 38u;
// UNSUPPORTED Rust 3505:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TCPIP_OWNER_MODULE_BASIC_INFO {
//     pub pModuleName: windows_sys::core::PWSTR,
//     pub pModulePath: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3511:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 3521:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_BANDWIDTH_ROD_v0 {
//     pub OutboundBandwidth: u64,
//     pub InboundBandwidth: u64,
//     pub OutboundInstability: u64,
//     pub InboundInstability: u64,
//     pub OutboundBandwidthPeaked: bool,
//     pub InboundBandwidthPeaked: bool,
// }

// UNSUPPORTED Rust 3531:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_BANDWIDTH_RW_v0 {
//     pub EnableCollectionOutbound: TCP_BOOLEAN_OPTIONAL,
//     pub EnableCollectionInbound: TCP_BOOLEAN_OPTIONAL,
// }

// UNSUPPORTED Rust 3537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_DATA_ROD_v0 {
//     pub DataBytesOut: u64,
//     pub DataSegsOut: u64,
//     pub DataBytesIn: u64,
//     pub DataSegsIn: u64,
//     pub SegsOut: u64,
//     pub SegsIn: u64,
//     pub SoftErrors: u32,
//     pub SoftErrorReason: u32,
//     pub SndUna: u32,
//     pub SndNxt: u32,
//     pub SndMax: u32,
//     pub ThruBytesAcked: u64,
//     pub RcvNxt: u32,
//     pub ThruBytesReceived: u64,
// }

// UNSUPPORTED Rust 3555:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_DATA_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_FINE_RTT_ROD_v0 {
//     pub RttVar: u32,
//     pub MaxRtt: u32,
//     pub MinRtt: u32,
//     pub SumRtt: u32,
// }

// UNSUPPORTED Rust 3568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_FINE_RTT_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_OBS_REC_ROD_v0 {
//     pub CurRwinRcvd: u32,
//     pub MaxRwinRcvd: u32,
//     pub MinRwinRcvd: u32,
//     pub WinScaleRcvd: u8,
// }

// UNSUPPORTED Rust 3581:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_OBS_REC_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_PATH_ROD_v0 {
//     pub FastRetran: u32,
//     pub Timeouts: u32,
//     pub SubsequentTimeouts: u32,
//     pub CurTimeoutCount: u32,
//     pub AbruptTimeouts: u32,
//     pub PktsRetrans: u32,
//     pub BytesRetrans: u32,
//     pub DupAcksIn: u32,
//     pub SacksRcvd: u32,
//     pub SackBlocksRcvd: u32,
//     pub CongSignals: u32,
//     pub PreCongSumCwnd: u32,
//     pub PreCongSumRtt: u32,
//     pub PostCongSumRtt: u32,
//     pub PostCongCountRtt: u32,
//     pub EcnSignals: u32,
//     pub EceRcvd: u32,
//     pub SendStall: u32,
//     pub QuenchRcvd: u32,
//     pub RetranThresh: u32,
//     pub SndDupAckEpisodes: u32,
//     pub SumBytesReordered: u32,
//     pub NonRecovDa: u32,
//     pub NonRecovDaEpisodes: u32,
//     pub AckAfterFr: u32,
//     pub DsackDups: u32,
//     pub SampleRtt: u32,
//     pub SmoothedRtt: u32,
//     pub RttVar: u32,
//     pub MaxRtt: u32,
//     pub MinRtt: u32,
//     pub SumRtt: u32,
//     pub CountRtt: u32,
//     pub CurRto: u32,
//     pub MaxRto: u32,
//     pub MinRto: u32,
//     pub CurMss: u32,
//     pub MaxMss: u32,
//     pub MinMss: u32,
//     pub SpuriousRtoDetections: u32,
// }

// UNSUPPORTED Rust 3630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_PATH_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_REC_ROD_v0 {
//     pub CurRwinSent: u32,
//     pub MaxRwinSent: u32,
//     pub MinRwinSent: u32,
//     pub LimRwin: u32,
//     pub DupAckEpisodes: u32,
//     pub DupAcksOut: u32,
//     pub CeRcvd: u32,
//     pub EcnSent: u32,
//     pub EcnNoncesRcvd: u32,
//     pub CurReasmQueue: u32,
//     pub MaxReasmQueue: u32,
//     pub CurAppRQueue: usize,
//     pub MaxAppRQueue: usize,
//     pub WinScaleSent: u8,
// }

// UNSUPPORTED Rust 3653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_REC_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_SEND_BUFF_ROD_v0 {
//     pub CurRetxQueue: usize,
//     pub MaxRetxQueue: usize,
//     pub CurAppWQueue: usize,
//     pub MaxAppWQueue: usize,
// }

// UNSUPPORTED Rust 3666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_SEND_BUFF_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_SND_CONG_ROD_v0 {
//     pub SndLimTransRwin: u32,
//     pub SndLimTimeRwin: u32,
//     pub SndLimBytesRwin: usize,
//     pub SndLimTransCwnd: u32,
//     pub SndLimTimeCwnd: u32,
//     pub SndLimBytesCwnd: usize,
//     pub SndLimTransSnd: u32,
//     pub SndLimTimeSnd: u32,
//     pub SndLimBytesSnd: usize,
//     pub SlowStart: u32,
//     pub CongAvoid: u32,
//     pub OtherReductions: u32,
//     pub CurCwnd: u32,
//     pub MaxSsCwnd: u32,
//     pub MaxCaCwnd: u32,
//     pub CurSsthresh: u32,
//     pub MaxSsthresh: u32,
//     pub MinSsthresh: u32,
// }

// UNSUPPORTED Rust 3693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_SND_CONG_ROS_v0 {
//     pub LimCwnd: u32,
// }

// UNSUPPORTED Rust 3698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_SND_CONG_RW_v0 {
//     pub EnableCollection: bool,
// }

// UNSUPPORTED Rust 3703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ESTATS_SYN_OPTS_ROS_v0 {
//     pub ActiveOpen: bool,
//     pub MssRcvd: u32,
//     pub MssSent: u32,
// }

public typealias `TCP_ESTATS_TYPE` = Int;
// UNSUPPORTED Rust 3711:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_RESERVE_PORT_RANGE {
//     pub UpperRange: u16,
//     pub LowerRange: u16,
// }

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
