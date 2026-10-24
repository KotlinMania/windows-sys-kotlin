// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("mswsock.dll" "system" fn AcceptEx(slistensocket : SOCKET, sacceptsocket : SOCKET, lpoutputbuffer : *mut core::ffi::c_void, dwreceivedatalength : u32, dwlocaladdresslength : u32, dwremoteaddresslength : u32, lpdwbytesreceived : *mut u32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn EnumProtocolsA(lpiprotocols : *const i32, lpprotocolbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn EnumProtocolsW(lpiprotocols : *const i32, lpprotocolbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn FreeAddrInfoEx(paddrinfoex : *const ADDRINFOEXA));

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn FreeAddrInfoExW(paddrinfoex : *const ADDRINFOEXW));

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn FreeAddrInfoW(paddrinfo : *const ADDRINFOW));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetAcceptExSockaddrs(lpoutputbuffer : *const core::ffi::c_void, dwreceivedatalength : u32, dwlocaladdresslength : u32, dwremoteaddresslength : u32, localsockaddr : *mut *mut SOCKADDR, localsockaddrlength : *mut i32, remotesockaddr : *mut *mut SOCKADDR, remotesockaddrlength : *mut i32));

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn GetAddrInfoExA(pname : windows_sys::core::PCSTR, pservicename : windows_sys::core::PCSTR, dwnamespace : u32, lpnspid : *const windows_sys::core::GUID, hints : *const ADDRINFOEXA, ppresult : *mut *mut ADDRINFOEXA, timeout : *const TIMEVAL, lpoverlapped : *const super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn GetAddrInfoExCancel(lphandle : *const super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn GetAddrInfoExOverlappedResult(lpoverlapped : *const super::super::System::IO:: OVERLAPPED) -> i32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn GetAddrInfoExW(pname : windows_sys::core::PCWSTR, pservicename : windows_sys::core::PCWSTR, dwnamespace : u32, lpnspid : *const windows_sys::core::GUID, hints : *const ADDRINFOEXW, ppresult : *mut *mut ADDRINFOEXW, timeout : *const TIMEVAL, lpoverlapped : *const super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn GetAddrInfoW(pnodename : windows_sys::core::PCWSTR, pservicename : windows_sys::core::PCWSTR, phints : *const ADDRINFOW, ppresult : *mut *mut ADDRINFOW) -> i32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetAddressByNameA(dwnamespace : u32, lpservicetype : *const windows_sys::core::GUID, lpservicename : windows_sys::core::PCSTR, lpiprotocols : *const i32, dwresolution : u32, lpserviceasyncinfo : *const SERVICE_ASYNC_INFO, lpcsaddrbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32, lpaliasbuffer : windows_sys::core::PSTR, lpdwaliasbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetAddressByNameW(dwnamespace : u32, lpservicetype : *const windows_sys::core::GUID, lpservicename : windows_sys::core::PCWSTR, lpiprotocols : *const i32, dwresolution : u32, lpserviceasyncinfo : *const SERVICE_ASYNC_INFO, lpcsaddrbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32, lpaliasbuffer : windows_sys::core::PWSTR, lpdwaliasbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn GetHostNameW(name : windows_sys::core::PWSTR, namelen : i32) -> i32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetNameByTypeA(lpservicetype : *const windows_sys::core::GUID, lpservicename : windows_sys::core::PSTR, dwnamelength : u32) -> i32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetNameByTypeW(lpservicetype : *const windows_sys::core::GUID, lpservicename : windows_sys::core::PWSTR, dwnamelength : u32) -> i32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn GetNameInfoW(psockaddr : *const SOCKADDR, sockaddrlength : socklen_t, pnodebuffer : windows_sys::core::PWSTR, nodebuffersize : u32, pservicebuffer : windows_sys::core::PWSTR, servicebuffersize : u32, flags : i32) -> i32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetServiceA(dwnamespace : u32, lpguid : *const windows_sys::core::GUID, lpservicename : windows_sys::core::PCSTR, dwproperties : u32, lpbuffer : *mut core::ffi::c_void, lpdwbuffersize : *mut u32, lpserviceasyncinfo : *const SERVICE_ASYNC_INFO) -> i32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetServiceW(dwnamespace : u32, lpguid : *const windows_sys::core::GUID, lpservicename : windows_sys::core::PCWSTR, dwproperties : u32, lpbuffer : *mut core::ffi::c_void, lpdwbuffersize : *mut u32, lpserviceasyncinfo : *const SERVICE_ASYNC_INFO) -> i32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetTypeByNameA(lpservicename : windows_sys::core::PCSTR, lpservicetype : *mut windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn GetTypeByNameW(lpservicename : windows_sys::core::PCWSTR, lpservicetype : *mut windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn InetNtopW(family : i32, paddr : *const core::ffi::c_void, pstringbuf : windows_sys::core::PWSTR, stringbufsize : usize) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn InetPtonW(family : i32, pszaddrstring : windows_sys::core::PCWSTR, paddrbuf : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn ProcessSocketNotifications(completionport : super::super::Foundation:: HANDLE, registrationcount : u32, registrationinfos : *mut SOCK_NOTIFY_REGISTRATION, timeoutms : u32, completioncount : u32, completionportentries : *mut super::super::System::IO:: OVERLAPPED_ENTRY, receivedentrycount : *mut u32) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlEthernetAddressToStringA(addr : *const DL_EUI48, s : windows_sys::core::PSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlEthernetAddressToStringW(addr : *const DL_EUI48, s : windows_sys::core::PWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlEthernetStringToAddressA(s : windows_sys::core::PCSTR, terminator : *mut windows_sys::core::PCSTR, addr : *mut DL_EUI48) -> i32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlEthernetStringToAddressW(s : windows_sys::core::PCWSTR, terminator : *mut windows_sys::core::PCWSTR, addr : *mut DL_EUI48) -> i32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4AddressToStringA(addr : *const IN_ADDR, s : windows_sys::core::PSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4AddressToStringExA(address : *const IN_ADDR, port : u16, addressstring : windows_sys::core::PSTR, addressstringlength : *mut u32) -> i32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4AddressToStringExW(address : *const IN_ADDR, port : u16, addressstring : windows_sys::core::PWSTR, addressstringlength : *mut u32) -> i32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4AddressToStringW(addr : *const IN_ADDR, s : windows_sys::core::PWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4StringToAddressA(s : windows_sys::core::PCSTR, strict : bool, terminator : *mut windows_sys::core::PCSTR, addr : *mut IN_ADDR) -> i32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4StringToAddressExA(addressstring : windows_sys::core::PCSTR, strict : bool, address : *mut IN_ADDR, port : *mut u16) -> i32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4StringToAddressExW(addressstring : windows_sys::core::PCWSTR, strict : bool, address : *mut IN_ADDR, port : *mut u16) -> i32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv4StringToAddressW(s : windows_sys::core::PCWSTR, strict : bool, terminator : *mut windows_sys::core::PCWSTR, addr : *mut IN_ADDR) -> i32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6AddressToStringA(addr : *const IN6_ADDR, s : windows_sys::core::PSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6AddressToStringExA(address : *const IN6_ADDR, scopeid : u32, port : u16, addressstring : windows_sys::core::PSTR, addressstringlength : *mut u32) -> i32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6AddressToStringExW(address : *const IN6_ADDR, scopeid : u32, port : u16, addressstring : windows_sys::core::PWSTR, addressstringlength : *mut u32) -> i32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6AddressToStringW(addr : *const IN6_ADDR, s : windows_sys::core::PWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6StringToAddressA(s : windows_sys::core::PCSTR, terminator : *mut windows_sys::core::PCSTR, addr : *mut IN6_ADDR) -> i32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6StringToAddressExA(addressstring : windows_sys::core::PCSTR, address : *mut IN6_ADDR, scopeid : *mut u32, port : *mut u16) -> i32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6StringToAddressExW(addressstring : windows_sys::core::PCWSTR, address : *mut IN6_ADDR, scopeid : *mut u32, port : *mut u16) -> i32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIpv6StringToAddressW(s : windows_sys::core::PCWSTR, terminator : *mut windows_sys::core::PCWSTR, addr : *mut IN6_ADDR) -> i32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_IO"))]
// windows_link::link!("ws2_32.dll" "system" fn SetAddrInfoExA(pname : windows_sys::core::PCSTR, pservicename : windows_sys::core::PCSTR, paddresses : *const SOCKET_ADDRESS, dwaddresscount : u32, lpblob : *const super::super::System::Com:: BLOB, dwflags : u32, dwnamespace : u32, lpnspid : *const windows_sys::core::GUID, timeout : *const TIMEVAL, lpoverlapped : *const super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_IO"))]
// windows_link::link!("ws2_32.dll" "system" fn SetAddrInfoExW(pname : windows_sys::core::PCWSTR, pservicename : windows_sys::core::PCWSTR, paddresses : *const SOCKET_ADDRESS, dwaddresscount : u32, lpblob : *const super::super::System::Com:: BLOB, dwflags : u32, dwnamespace : u32, lpnspid : *const windows_sys::core::GUID, timeout : *const TIMEVAL, lpoverlapped : *const super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mswsock.dll" "system" fn SetServiceA(dwnamespace : u32, dwoperation : SET_SERVICE_OPERATION, dwflags : u32, lpserviceinfo : *const SERVICE_INFOA, lpserviceasyncinfo : *const SERVICE_ASYNC_INFO, lpdwstatusflags : *mut u32) -> i32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mswsock.dll" "system" fn SetServiceW(dwnamespace : u32, dwoperation : SET_SERVICE_OPERATION, dwflags : u32, lpserviceinfo : *const SERVICE_INFOW, lpserviceasyncinfo : *const SERVICE_ASYNC_INFO, lpdwstatusflags : *mut u32) -> i32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("windows.networking.dll" "system" fn SetSocketMediaStreamingMode(value : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("mswsock.dll" "system" fn TransmitFile(hsocket : SOCKET, hfile : super::super::Foundation:: HANDLE, nnumberofbytestowrite : u32, nnumberofbytespersend : u32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lptransmitbuffers : *const TRANSMIT_FILE_BUFFERS, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WPUCompleteOverlappedRequest(s : SOCKET, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, dwerror : u32, cbtransferred : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAccept(s : SOCKET, addr : *mut SOCKADDR, addrlen : *mut i32, lpfncondition : LPCONDITIONPROC, dwcallbackdata : usize) -> SOCKET);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAddressToStringA(lpsaaddress : *const SOCKADDR, dwaddresslength : u32, lpprotocolinfo : *const WSAPROTOCOL_INFOA, lpszaddressstring : windows_sys::core::PSTR, lpdwaddressstringlength : *mut u32) -> i32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAddressToStringW(lpsaaddress : *const SOCKADDR, dwaddresslength : u32, lpprotocolinfo : *const WSAPROTOCOL_INFOW, lpszaddressstring : windows_sys::core::PWSTR, lpdwaddressstringlength : *mut u32) -> i32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSAAdvertiseProvider(puuidproviderid : *const windows_sys::core::GUID, pnspv2routine : *const NSPV2_ROUTINE) -> i32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncGetHostByAddr(hwnd : super::super::Foundation:: HWND, wmsg : u32, addr : windows_sys::core::PCSTR, len : i32, r#type : i32, buf : windows_sys::core::PSTR, buflen : i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncGetHostByName(hwnd : super::super::Foundation:: HWND, wmsg : u32, name : windows_sys::core::PCSTR, buf : windows_sys::core::PSTR, buflen : i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncGetProtoByName(hwnd : super::super::Foundation:: HWND, wmsg : u32, name : windows_sys::core::PCSTR, buf : windows_sys::core::PSTR, buflen : i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncGetProtoByNumber(hwnd : super::super::Foundation:: HWND, wmsg : u32, number : i32, buf : windows_sys::core::PSTR, buflen : i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncGetServByName(hwnd : super::super::Foundation:: HWND, wmsg : u32, name : windows_sys::core::PCSTR, proto : windows_sys::core::PCSTR, buf : windows_sys::core::PSTR, buflen : i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncGetServByPort(hwnd : super::super::Foundation:: HWND, wmsg : u32, port : i32, proto : windows_sys::core::PCSTR, buf : windows_sys::core::PSTR, buflen : i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAAsyncSelect(s : SOCKET, hwnd : super::super::Foundation:: HWND, wmsg : u32, levent : i32) -> i32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSACancelAsyncRequest(hasynctaskhandle : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSACancelBlockingCall() -> i32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSACleanup() -> i32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSACloseEvent(hevent : WSAEVENT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAConnect(s : SOCKET, name : *const SOCKADDR, namelen : i32, lpcallerdata : *const WSABUF, lpcalleedata : *mut WSABUF, lpsqos : *const QOS, lpgqos : *const QOS) -> i32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSAConnectByList(s : SOCKET, socketaddress : *const SOCKET_ADDRESS_LIST, localaddresslength : *mut u32, localaddress : *mut SOCKADDR, remoteaddresslength : *mut u32, remoteaddress : *mut SOCKADDR, timeout : *const TIMEVAL, reserved : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSAConnectByNameA(s : SOCKET, nodename : windows_sys::core::PCSTR, servicename : windows_sys::core::PCSTR, localaddresslength : *mut u32, localaddress : *mut SOCKADDR, remoteaddresslength : *mut u32, remoteaddress : *mut SOCKADDR, timeout : *const TIMEVAL, reserved : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSAConnectByNameW(s : SOCKET, nodename : windows_sys::core::PCWSTR, servicename : windows_sys::core::PCWSTR, localaddresslength : *mut u32, localaddress : *mut SOCKADDR, remoteaddresslength : *mut u32, remoteaddress : *mut SOCKADDR, timeout : *const TIMEVAL, reserved : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSACreateEvent() -> WSAEVENT);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("fwpuclnt.dll" "system" fn WSADeleteSocketPeerTargetName(socket : SOCKET, peeraddr : *const SOCKADDR, peeraddrlen : u32, overlapped : *const super::super::System::IO:: OVERLAPPED, completionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSADuplicateSocketA(s : SOCKET, dwprocessid : u32, lpprotocolinfo : *mut WSAPROTOCOL_INFOA) -> i32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSADuplicateSocketW(s : SOCKET, dwprocessid : u32, lpprotocolinfo : *mut WSAPROTOCOL_INFOW) -> i32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumNameSpaceProvidersA(lpdwbufferlength : *mut u32, lpnspbuffer : *mut WSANAMESPACE_INFOA) -> i32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumNameSpaceProvidersExA(lpdwbufferlength : *mut u32, lpnspbuffer : *mut WSANAMESPACE_INFOEXA) -> i32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumNameSpaceProvidersExW(lpdwbufferlength : *mut u32, lpnspbuffer : *mut WSANAMESPACE_INFOEXW) -> i32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumNameSpaceProvidersW(lpdwbufferlength : *mut u32, lpnspbuffer : *mut WSANAMESPACE_INFOW) -> i32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumNetworkEvents(s : SOCKET, heventobject : WSAEVENT, lpnetworkevents : *mut WSANETWORKEVENTS) -> i32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumProtocolsA(lpiprotocols : *const i32, lpprotocolbuffer : *mut WSAPROTOCOL_INFOA, lpdwbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAEnumProtocolsW(lpiprotocols : *const i32, lpprotocolbuffer : *mut WSAPROTOCOL_INFOW, lpdwbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAEventSelect(s : SOCKET, heventobject : WSAEVENT, lnetworkevents : i32) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAGetLastError() -> WSA_ERROR);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSAGetOverlappedResult(s : SOCKET, lpoverlapped : *const super::super::System::IO:: OVERLAPPED, lpcbtransfer : *mut u32, fwait : windows_sys::core::BOOL, lpdwflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAGetQOSByName(s : SOCKET, lpqosname : *const WSABUF, lpqos : *mut QOS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAGetServiceClassInfoA(lpproviderid : *const windows_sys::core::GUID, lpserviceclassid : *const windows_sys::core::GUID, lpdwbufsize : *mut u32, lpserviceclassinfo : *mut WSASERVICECLASSINFOA) -> i32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAGetServiceClassInfoW(lpproviderid : *const windows_sys::core::GUID, lpserviceclassid : *const windows_sys::core::GUID, lpdwbufsize : *mut u32, lpserviceclassinfo : *mut WSASERVICECLASSINFOW) -> i32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAGetServiceClassNameByClassIdA(lpserviceclassid : *const windows_sys::core::GUID, lpszserviceclassname : windows_sys::core::PSTR, lpdwbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAGetServiceClassNameByClassIdW(lpserviceclassid : *const windows_sys::core::GUID, lpszserviceclassname : windows_sys::core::PWSTR, lpdwbufferlength : *mut u32) -> i32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAHtonl(s : SOCKET, hostlong : u32, lpnetlong : *mut u32) -> i32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAHtons(s : SOCKET, hostshort : u16, lpnetshort : *mut u16) -> i32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn WSAImpersonateSocketPeer(socket : SOCKET, peeraddr : *const SOCKADDR, peeraddrlen : u32) -> i32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAInstallServiceClassA(lpserviceclassinfo : *const WSASERVICECLASSINFOA) -> i32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAInstallServiceClassW(lpserviceclassinfo : *const WSASERVICECLASSINFOW) -> i32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSAIoctl(s : SOCKET, dwiocontrolcode : u32, lpvinbuffer : *const core::ffi::c_void, cbinbuffer : u32, lpvoutbuffer : *mut core::ffi::c_void, cboutbuffer : u32, lpcbbytesreturned : *mut u32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAIsBlocking() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAJoinLeaf(s : SOCKET, name : *const SOCKADDR, namelen : i32, lpcallerdata : *const WSABUF, lpcalleedata : *mut WSABUF, lpsqos : *const QOS, lpgqos : *const QOS, dwflags : u32) -> SOCKET);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSALookupServiceBeginA(lpqsrestrictions : *const WSAQUERYSETA, dwcontrolflags : u32, lphlookup : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSALookupServiceBeginW(lpqsrestrictions : *const WSAQUERYSETW, dwcontrolflags : u32, lphlookup : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSALookupServiceEnd(hlookup : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSALookupServiceNextA(hlookup : super::super::Foundation:: HANDLE, dwcontrolflags : u32, lpdwbufferlength : *mut u32, lpqsresults : *mut WSAQUERYSETA) -> i32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSALookupServiceNextW(hlookup : super::super::Foundation:: HANDLE, dwcontrolflags : u32, lpdwbufferlength : *mut u32, lpqsresults : *mut WSAQUERYSETW) -> i32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSANSPIoctl(hlookup : super::super::Foundation:: HANDLE, dwcontrolcode : u32, lpvinbuffer : *const core::ffi::c_void, cbinbuffer : u32, lpvoutbuffer : *mut core::ffi::c_void, cboutbuffer : u32, lpcbbytesreturned : *mut u32, lpcompletion : *const WSACOMPLETION) -> i32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSANtohl(s : SOCKET, netlong : u32, lphostlong : *mut u32) -> i32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSANtohs(s : SOCKET, netshort : u16, lphostshort : *mut u16) -> i32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAPoll(fdarray : *mut WSAPOLLFD, fds : u32, timeout : i32) -> i32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAProviderCompleteAsyncCall(hasynccall : super::super::Foundation:: HANDLE, iretcode : i32) -> i32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSAProviderConfigChange(lpnotificationhandle : *mut super::super::Foundation:: HANDLE, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("fwpuclnt.dll" "system" fn WSAQuerySocketSecurity(socket : SOCKET, securityquerytemplate : *const SOCKET_SECURITY_QUERY_TEMPLATE, securityquerytemplatelen : u32, securityqueryinfo : *mut SOCKET_SECURITY_QUERY_INFO, securityqueryinfolen : *mut u32, overlapped : *const super::super::System::IO:: OVERLAPPED, completionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSARecv(s : SOCKET, lpbuffers : *const WSABUF, dwbuffercount : u32, lpnumberofbytesrecvd : *mut u32, lpflags : *mut u32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSARecvDisconnect(s : SOCKET, lpinbounddisconnectdata : *const WSABUF) -> i32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("mswsock.dll" "system" fn WSARecvEx(s : SOCKET, buf : windows_sys::core::PSTR, len : i32, flags : *mut i32) -> i32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSARecvFrom(s : SOCKET, lpbuffers : *const WSABUF, dwbuffercount : u32, lpnumberofbytesrecvd : *mut u32, lpflags : *mut u32, lpfrom : *mut SOCKADDR, lpfromlen : *mut i32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSARemoveServiceClass(lpserviceclassid : *const windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAResetEvent(hevent : WSAEVENT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn WSARevertImpersonation() -> i32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSASend(s : SOCKET, lpbuffers : *const WSABUF, dwbuffercount : u32, lpnumberofbytessent : *mut u32, dwflags : u32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSASendDisconnect(s : SOCKET, lpoutbounddisconnectdata : *const WSABUF) -> i32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSASendMsg(handle : SOCKET, lpmsg : *const WSAMSG, dwflags : u32, lpnumberofbytessent : *mut u32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("ws2_32.dll" "system" fn WSASendTo(s : SOCKET, lpbuffers : *const WSABUF, dwbuffercount : u32, lpnumberofbytessent : *mut u32, dwflags : u32, lpto : *const SOCKADDR, itolen : i32, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED, lpcompletionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSASetBlockingHook(lpblockfunc : super::super::Foundation:: FARPROC) -> super::super::Foundation:: FARPROC);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSASetEvent(hevent : WSAEVENT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSASetLastError(ierror : i32));

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSASetServiceA(lpqsreginfo : *const WSAQUERYSETA, essoperation : WSAESETSERVICEOP, dwcontrolflags : u32) -> i32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSASetServiceW(lpqsreginfo : *const WSAQUERYSETW, essoperation : WSAESETSERVICEOP, dwcontrolflags : u32) -> i32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("fwpuclnt.dll" "system" fn WSASetSocketPeerTargetName(socket : SOCKET, peertargetname : *const SOCKET_PEER_TARGET_NAME, peertargetnamelen : u32, overlapped : *const super::super::System::IO:: OVERLAPPED, completionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("fwpuclnt.dll" "system" fn WSASetSocketSecurity(socket : SOCKET, securitysettings : *const SOCKET_SECURITY_SETTINGS, securitysettingslen : u32, overlapped : *const super::super::System::IO:: OVERLAPPED, completionroutine : LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSASocketA(af : i32, r#type : i32, protocol : i32, lpprotocolinfo : *const WSAPROTOCOL_INFOA, g : u32, dwflags : u32) -> SOCKET);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSASocketW(af : i32, r#type : i32, protocol : i32, lpprotocolinfo : *const WSAPROTOCOL_INFOW, g : u32, dwflags : u32) -> SOCKET);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAStartup(wversionrequested : u16, lpwsadata : *mut WSADATA) -> i32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAStringToAddressA(addressstring : windows_sys::core::PCSTR, addressfamily : i32, lpprotocolinfo : *const WSAPROTOCOL_INFOA, lpaddress : *mut SOCKADDR, lpaddresslength : *mut i32) -> i32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAStringToAddressW(addressstring : windows_sys::core::PCWSTR, addressfamily : i32, lpprotocolinfo : *const WSAPROTOCOL_INFOW, lpaddress : *mut SOCKADDR, lpaddresslength : *mut i32) -> i32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAUnadvertiseProvider(puuidproviderid : *const windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAUnhookBlockingHook() -> i32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSAWaitForMultipleEvents(cevents : u32, lphevents : *const super::super::Foundation:: HANDLE, fwaitall : windows_sys::core::BOOL, dwtimeout : u32, falertable : windows_sys::core::BOOL) -> super::super::Foundation:: WAIT_EVENT);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCDeinstallProvider(lpproviderid : *const windows_sys::core::GUID, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCDeinstallProvider32(lpproviderid : *const windows_sys::core::GUID, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCEnableNSProvider(lpproviderid : *const windows_sys::core::GUID, fenable : windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCEnableNSProvider32(lpproviderid : *const windows_sys::core::GUID, fenable : windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCEnumNameSpaceProviders32(lpdwbufferlength : *mut u32, lpnspbuffer : *mut WSANAMESPACE_INFOW) -> i32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSCEnumNameSpaceProvidersEx32(lpdwbufferlength : *mut u32, lpnspbuffer : *mut WSANAMESPACE_INFOEXW) -> i32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCEnumProtocols(lpiprotocols : *const i32, lpprotocolbuffer : *mut WSAPROTOCOL_INFOW, lpdwbufferlength : *mut u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCEnumProtocols32(lpiprotocols : *const i32, lpprotocolbuffer : *mut WSAPROTOCOL_INFOW, lpdwbufferlength : *mut u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCGetApplicationCategory(path : windows_sys::core::PCWSTR, pathlength : u32, extra : windows_sys::core::PCWSTR, extralength : u32, ppermittedlspcategories : *mut u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCGetProviderInfo(lpproviderid : *const windows_sys::core::GUID, infotype : WSC_PROVIDER_INFO_TYPE, info : *mut u8, infosize : *mut usize, flags : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCGetProviderInfo32(lpproviderid : *const windows_sys::core::GUID, infotype : WSC_PROVIDER_INFO_TYPE, info : *mut u8, infosize : *mut usize, flags : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCGetProviderPath(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PWSTR, lpproviderdllpathlen : *mut i32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCGetProviderPath32(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PWSTR, lpproviderdllpathlen : *mut i32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallNameSpace(lpszidentifier : windows_sys::core::PCWSTR, lpszpathname : windows_sys::core::PCWSTR, dwnamespace : u32, dwversion : u32, lpproviderid : *const windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallNameSpace32(lpszidentifier : windows_sys::core::PCWSTR, lpszpathname : windows_sys::core::PCWSTR, dwnamespace : u32, dwversion : u32, lpproviderid : *const windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallNameSpaceEx(lpszidentifier : windows_sys::core::PCWSTR, lpszpathname : windows_sys::core::PCWSTR, dwnamespace : u32, dwversion : u32, lpproviderid : *const windows_sys::core::GUID, lpproviderspecific : *const super::super::System::Com:: BLOB) -> i32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallNameSpaceEx32(lpszidentifier : windows_sys::core::PCWSTR, lpszpathname : windows_sys::core::PCWSTR, dwnamespace : u32, dwversion : u32, lpproviderid : *const windows_sys::core::GUID, lpproviderspecific : *const super::super::System::Com:: BLOB) -> i32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallProvider(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PCWSTR, lpprotocolinfolist : *const WSAPROTOCOL_INFOW, dwnumberofentries : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallProvider64_32(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PCWSTR, lpprotocolinfolist : *const WSAPROTOCOL_INFOW, dwnumberofentries : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCInstallProviderAndChains64_32(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PCWSTR, lpszproviderdllpath32 : windows_sys::core::PCWSTR, lpszlspname : windows_sys::core::PCWSTR, dwserviceflags : u32, lpprotocolinfolist : *mut WSAPROTOCOL_INFOW, dwnumberofentries : u32, lpdwcatalogentryid : *mut u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCSetApplicationCategory(path : windows_sys::core::PCWSTR, pathlength : u32, extra : windows_sys::core::PCWSTR, extralength : u32, permittedlspcategories : u32, pprevpermlspcat : *mut u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCSetProviderInfo(lpproviderid : *const windows_sys::core::GUID, infotype : WSC_PROVIDER_INFO_TYPE, info : *const u8, infosize : usize, flags : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCSetProviderInfo32(lpproviderid : *const windows_sys::core::GUID, infotype : WSC_PROVIDER_INFO_TYPE, info : *const u8, infosize : usize, flags : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCUnInstallNameSpace(lpproviderid : *const windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCUnInstallNameSpace32(lpproviderid : *const windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCUpdateProvider(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PCWSTR, lpprotocolinfolist : *const WSAPROTOCOL_INFOW, dwnumberofentries : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCUpdateProvider32(lpproviderid : *const windows_sys::core::GUID, lpszproviderdllpath : windows_sys::core::PCWSTR, lpprotocolinfolist : *const WSAPROTOCOL_INFOW, dwnumberofentries : u32, lperrno : *mut i32) -> i32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCWriteNameSpaceOrder(lpproviderid : *mut windows_sys::core::GUID, dwnumberofentries : u32) -> i32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCWriteNameSpaceOrder32(lpproviderid : *mut windows_sys::core::GUID, dwnumberofentries : u32) -> i32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn WSCWriteProviderOrder(lpwdcatalogentryid : *mut u32, dwnumberofentries : u32) -> i32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ws2_32.dll" "system" fn WSCWriteProviderOrder32(lpwdcatalogentryid : *mut u32, dwnumberofentries : u32) -> i32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn __WSAFDIsSet(fd : SOCKET, param1 : *mut FD_SET) -> i32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn accept(s : SOCKET, addr : *mut SOCKADDR, addrlen : *mut i32) -> SOCKET);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn bind(s : SOCKET, name : *const SOCKADDR, namelen : i32) -> i32);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn closesocket(s : SOCKET) -> i32);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn connect(s : SOCKET, name : *const SOCKADDR, namelen : i32) -> i32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn freeaddrinfo(paddrinfo : *const ADDRINFOA));

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getaddrinfo(pnodename : windows_sys::core::PCSTR, pservicename : windows_sys::core::PCSTR, phints : *const ADDRINFOA, ppresult : *mut *mut ADDRINFOA) -> i32);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn gethostbyaddr(addr : windows_sys::core::PCSTR, len : i32, r#type : i32) -> *mut HOSTENT);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn gethostbyname(name : windows_sys::core::PCSTR) -> *mut HOSTENT);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn gethostname(name : windows_sys::core::PSTR, namelen : i32) -> i32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getnameinfo(psockaddr : *const SOCKADDR, sockaddrlength : socklen_t, pnodebuffer : windows_sys::core::PSTR, nodebuffersize : u32, pservicebuffer : windows_sys::core::PSTR, servicebuffersize : u32, flags : i32) -> i32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getpeername(s : SOCKET, name : *mut SOCKADDR, namelen : *mut i32) -> i32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getprotobyname(name : windows_sys::core::PCSTR) -> *mut PROTOENT);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getprotobynumber(number : i32) -> *mut PROTOENT);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getservbyname(name : windows_sys::core::PCSTR, proto : windows_sys::core::PCSTR) -> *mut SERVENT);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getservbyport(port : i32, proto : windows_sys::core::PCSTR) -> *mut SERVENT);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getsockname(s : SOCKET, name : *mut SOCKADDR, namelen : *mut i32) -> i32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn getsockopt(s : SOCKET, level : i32, optname : i32, optval : windows_sys::core::PSTR, optlen : *mut i32) -> i32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn htonl(hostlong : u32) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn htons(hostshort : u16) -> u16);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn inet_addr(cp : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn inet_ntoa(r#in : IN_ADDR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn inet_ntop(family : i32, paddr : *const core::ffi::c_void, pstringbuf : windows_sys::core::PSTR, stringbufsize : usize) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn inet_pton(family : i32, pszaddrstring : windows_sys::core::PCSTR, paddrbuf : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn ioctlsocket(s : SOCKET, cmd : i32, argp : *mut u32) -> i32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn listen(s : SOCKET, backlog : i32) -> i32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn ntohl(netlong : u32) -> u32);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn ntohs(netshort : u16) -> u16);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn recv(s : SOCKET, buf : windows_sys::core::PSTR, len : i32, flags : SEND_RECV_FLAGS) -> i32);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn recvfrom(s : SOCKET, buf : windows_sys::core::PSTR, len : i32, flags : i32, from : *mut SOCKADDR, fromlen : *mut i32) -> i32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn select(nfds : i32, readfds : *mut FD_SET, writefds : *mut FD_SET, exceptfds : *mut FD_SET, timeout : *const TIMEVAL) -> i32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn send(s : SOCKET, buf : windows_sys::core::PCSTR, len : i32, flags : SEND_RECV_FLAGS) -> i32);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn sendto(s : SOCKET, buf : windows_sys::core::PCSTR, len : i32, flags : i32, to : *const SOCKADDR, tolen : i32) -> i32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn setsockopt(s : SOCKET, level : i32, optname : i32, optval : windows_sys::core::PCSTR, optlen : i32) -> i32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn shutdown(s : SOCKET, how : WINSOCK_SHUTDOWN_HOW) -> i32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("ws2_32.dll" "system" fn socket(af : i32, r#type : WINSOCK_SOCKET_TYPE, protocol : i32) -> SOCKET);

public const val `AAL5_MODE_MESSAGE`: UInt = 1u;
public const val `AAL5_MODE_STREAMING`: UInt = 2u;
// UNSUPPORTED Rust 261:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AAL5_PARAMETERS {
//     pub ForwardMaxCPCSSDUSize: u32,
//     pub BackwardMaxCPCSSDUSize: u32,
//     pub Mode: u8,
//     pub SSCSType: u8,
// }

public const val `AAL5_SSCS_FRAME_RELAY`: UInt = 4u;
public const val `AAL5_SSCS_NULL`: UInt = 0u;
public const val `AAL5_SSCS_SSCOP_ASSURED`: UInt = 1u;
public const val `AAL5_SSCS_SSCOP_NON_ASSURED`: UInt = 2u;
public const val `AALTYPE_5`: `AAL_TYPE` = 5;
public const val `AALTYPE_USER`: `AAL_TYPE` = 16;
// UNSUPPORTED Rust 275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AALUSER_PARAMETERS {
//     pub UserDefined: u32,
// }

// UNSUPPORTED Rust 280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AAL_PARAMETERS_IE {
//     pub AALType: AAL_TYPE,
//     pub AALSpecificParameters: AAL_PARAMETERS_IE_0,
// }

// UNSUPPORTED Rust 286:1: declaration Impl has no candidate rule
// impl Default for AAL_PARAMETERS_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 291:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AAL_PARAMETERS_IE_0 {
//     pub AAL5Parameters: AAL5_PARAMETERS,
//     pub AALUserParameters: AALUSER_PARAMETERS,
// }

// UNSUPPORTED Rust 297:1: declaration Impl has no candidate rule
// impl Default for AAL_PARAMETERS_IE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AAL_TYPE` = Int;
public typealias `ADDRESS_FAMILY` = UShort;
// UNSUPPORTED Rust 304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOA {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_next: *mut ADDRINFOA,
// }

// UNSUPPORTED Rust 316:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEX2A {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEX2A,
//     pub ai_version: i32,
//     pub ai_fqdn: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 338:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEX2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEX2W {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEX2W,
//     pub ai_version: i32,
//     pub ai_fqdn: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 360:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEX2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEX3 {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEX3,
//     pub ai_version: i32,
//     pub ai_fqdn: windows_sys::core::PWSTR,
//     pub ai_interfaceindex: i32,
// }

// UNSUPPORTED Rust 383:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEX3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEX4 {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEX4,
//     pub ai_version: i32,
//     pub ai_fqdn: windows_sys::core::PWSTR,
//     pub ai_interfaceindex: i32,
//     pub ai_resolutionhandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 407:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEX4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEX5 {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEX5,
//     pub ai_version: i32,
//     pub ai_fqdn: windows_sys::core::PWSTR,
//     pub ai_interfaceindex: i32,
//     pub ai_resolutionhandle: super::super::Foundation::HANDLE,
//     pub ai_ttl: u32,
// }

// UNSUPPORTED Rust 432:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEX5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEX6 {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEX5,
//     pub ai_version: i32,
//     pub ai_fqdn: windows_sys::core::PWSTR,
//     pub ai_interfaceindex: i32,
//     pub ai_resolutionhandle: super::super::Foundation::HANDLE,
//     pub ai_ttl: u32,
//     pub ai_numservers: u32,
//     pub ai_servers: *mut ADDRINFO_DNS_SERVER,
//     pub ai_responseflags: u64,
// }

// UNSUPPORTED Rust 460:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEX6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 465:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEXA {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEXA,
// }

// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 485:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOEXW {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_blob: *mut core::ffi::c_void,
//     pub ai_bloblen: usize,
//     pub ai_provider: *mut windows_sys::core::GUID,
//     pub ai_next: *mut ADDRINFOEXW,
// }

// UNSUPPORTED Rust 500:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADDRINFOEX_VERSION_2`: UInt = 2u;
public const val `ADDRINFOEX_VERSION_3`: UInt = 3u;
public const val `ADDRINFOEX_VERSION_4`: UInt = 4u;
public const val `ADDRINFOEX_VERSION_5`: UInt = 5u;
public const val `ADDRINFOEX_VERSION_6`: UInt = 6u;
// UNSUPPORTED Rust 510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFOW {
//     pub ai_flags: i32,
//     pub ai_family: i32,
//     pub ai_socktype: i32,
//     pub ai_protocol: i32,
//     pub ai_addrlen: usize,
//     pub ai_canonname: windows_sys::core::PWSTR,
//     pub ai_addr: *mut SOCKADDR,
//     pub ai_next: *mut ADDRINFOW,
// }

// UNSUPPORTED Rust 522:1: declaration Impl has no candidate rule
// impl Default for ADDRINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADDRINFO_DNS_SERVER {
//     pub ai_servertype: u32,
//     pub ai_flags: u64,
//     pub ai_addrlen: u32,
//     pub ai_addr: *mut SOCKADDR,
//     pub Anonymous: ADDRINFO_DNS_SERVER_0,
// }

// UNSUPPORTED Rust 536:1: declaration Impl has no candidate rule
// impl Default for ADDRINFO_DNS_SERVER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 541:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ADDRINFO_DNS_SERVER_0 {
//     pub ai_template: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 546:1: declaration Impl has no candidate rule
// impl Default for ADDRINFO_DNS_SERVER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADDR_ANY`: UInt = 0u;
// UNSUPPORTED Rust 552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AFPROTOCOLS {
//     pub iAddressFamily: i32,
//     pub iProtocol: i32,
// }

public const val `AF_12844`: UShort = 25u;
public const val `AF_APPLETALK`: UShort = 16u;
public const val `AF_ATM`: UShort = 22u;
public const val `AF_BAN`: UShort = 21u;
public const val `AF_CCITT`: UShort = 10u;
public const val `AF_CHAOS`: UShort = 5u;
public const val `AF_CLUSTER`: UShort = 24u;
public const val `AF_DATAKIT`: UShort = 9u;
public const val `AF_DECnet`: UShort = 12u;
public const val `AF_DLI`: UShort = 13u;
public const val `AF_ECMA`: UShort = 8u;
public const val `AF_FIREFOX`: UShort = 19u;
public const val `AF_HYLINK`: UShort = 15u;
public const val `AF_HYPERV`: UShort = 34u;
public const val `AF_ICLFXBM`: UShort = 31u;
public const val `AF_IMPLINK`: UShort = 3u;
public const val `AF_INET`: `ADDRESS_FAMILY` = 2u;
public const val `AF_INET6`: `ADDRESS_FAMILY` = 23u;
public const val `AF_IPX`: UShort = 6u;
public const val `AF_IRDA`: UShort = 26u;
public const val `AF_ISO`: UShort = 7u;
public const val `AF_LAT`: UShort = 14u;
public const val `AF_LINK`: UShort = 33u;
public const val `AF_MAX`: UShort = 29u;
public const val `AF_NETBIOS`: UShort = 17u;
public const val `AF_NETDES`: UShort = 28u;
public const val `AF_NS`: UShort = 6u;
public const val `AF_OSI`: UShort = 7u;
public const val `AF_PUP`: UShort = 4u;
public const val `AF_SNA`: UShort = 11u;
public const val `AF_TCNMESSAGE`: UShort = 30u;
public const val `AF_TCNPROCESS`: UShort = 29u;
public const val `AF_UNIX`: UShort = 1u;
public const val `AF_UNKNOWN1`: UShort = 20u;
public const val `AF_UNSPEC`: `ADDRESS_FAMILY` = 0u;
public const val `AF_VOICEVIEW`: UShort = 18u;
public const val `AI_ADDRCONFIG`: UInt = 1024u;
public const val `AI_ALL`: UInt = 256u;
public const val `AI_BYPASS_DNS_CACHE`: UInt = 64u;
public const val `AI_CANONNAME`: UInt = 2u;
public const val `AI_DISABLE_IDN_ENCODING`: UInt = 524288u;
public const val `AI_DNS_ONLY`: UInt = 16u;
public const val `AI_DNS_RESPONSE_HOSTFILE`: UInt = 2u;
public const val `AI_DNS_RESPONSE_SECURE`: UInt = 1u;
public const val `AI_DNS_SERVER_TYPE_DOH`: UInt = 2u;
public const val `AI_DNS_SERVER_TYPE_UDP`: UInt = 1u;
public const val `AI_DNS_SERVER_UDP_FALLBACK`: UInt = 1u;
public const val `AI_EXCLUSIVE_CUSTOM_SERVERS`: UInt = 2097152u;
public const val `AI_EXTENDED`: UInt = 2147483648u;
public const val `AI_FILESERVER`: UInt = 262144u;
public const val `AI_FORCE_CLEAR_TEXT`: UInt = 32u;
public const val `AI_FQDN`: UInt = 131072u;
public const val `AI_NON_AUTHORITATIVE`: UInt = 16384u;
public const val `AI_NUMERICHOST`: UInt = 4u;
public const val `AI_NUMERICSERV`: UInt = 8u;
public const val `AI_PASSIVE`: UInt = 1u;
public const val `AI_REQUIRE_SECURE`: UInt = 536870912u;
public const val `AI_RESOLUTION_HANDLE`: UInt = 1073741824u;
public const val `AI_RETURN_PREFERRED_NAMES`: UInt = 65536u;
public const val `AI_RETURN_RESPONSE_FLAGS`: UInt = 268435456u;
public const val `AI_RETURN_TTL`: UInt = 128u;
public const val `AI_SECURE`: UInt = 32768u;
public const val `AI_SECURE_WITH_FALLBACK`: UInt = 1048576u;
public const val `AI_V4MAPPED`: UInt = 2048u;
public typealias `ARP_HARDWARE_TYPE` = Int;
// UNSUPPORTED Rust 623:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ARP_HEADER {
//     pub HardwareAddressSpace: u16,
//     pub ProtocolAddressSpace: u16,
//     pub HardwareAddressLength: u8,
//     pub ProtocolAddressLength: u8,
//     pub Opcode: u16,
//     pub SenderHardwareAddress: [u8; 1],
// }

// UNSUPPORTED Rust 633:1: declaration Impl has no candidate rule
// impl Default for ARP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ARP_HW_802`: `ARP_HARDWARE_TYPE` = 6;
public const val `ARP_HW_ENET`: `ARP_HARDWARE_TYPE` = 1;
public typealias `ARP_OPCODE` = Int;
public const val `ARP_REQUEST`: `ARP_OPCODE` = 1;
public const val `ARP_RESPONSE`: `ARP_OPCODE` = 2;
// UNSUPPORTED Rust 643:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ASSOCIATE_NAMERES_CONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59a38b67_d4fe_46e1_ba3c_87ea74ca3049);

// UNSUPPORTED Rust 644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ASSOCIATE_NAMERES_CONTEXT_INPUT {
//     pub TransportSettingId: TRANSPORT_SETTING_ID,
//     pub Handle: u64,
// }

public const val `ATMPROTO_AAL1`: UInt = 1u;
public const val `ATMPROTO_AAL2`: UInt = 2u;
public const val `ATMPROTO_AAL34`: UInt = 3u;
public const val `ATMPROTO_AAL5`: UInt = 5u;
public const val `ATMPROTO_AALUSER`: UInt = 0u;
// UNSUPPORTED Rust 655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATM_ADDRESS {
//     pub AddressType: u32,
//     pub NumofDigits: u32,
//     pub Addr: [u8; 20],
// }

// UNSUPPORTED Rust 662:1: declaration Impl has no candidate rule
// impl Default for ATM_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ATM_ADDR_SIZE`: UInt = 20u;
public const val `ATM_AESA`: UInt = 2u;
// UNSUPPORTED Rust 669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATM_BHLI {
//     pub HighLayerInfoType: u32,
//     pub HighLayerInfoLength: u32,
//     pub HighLayerInfo: [u8; 8],
// }

// UNSUPPORTED Rust 676:1: declaration Impl has no candidate rule
// impl Default for ATM_BHLI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATM_BLLI {
//     pub Layer2Protocol: u32,
//     pub Layer2UserSpecifiedProtocol: u32,
//     pub Layer3Protocol: u32,
//     pub Layer3UserSpecifiedProtocol: u32,
//     pub Layer3IPI: u32,
//     pub SnapID: [u8; 5],
// }

// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule
// impl Default for ATM_BLLI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 696:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATM_BLLI_IE {
//     pub Layer2Protocol: u32,
//     pub Layer2Mode: u8,
//     pub Layer2WindowSize: u8,
//     pub Layer2UserSpecifiedProtocol: u32,
//     pub Layer3Protocol: u32,
//     pub Layer3Mode: u8,
//     pub Layer3DefaultPacketSize: u8,
//     pub Layer3PacketWindowSize: u8,
//     pub Layer3UserSpecifiedProtocol: u32,
//     pub Layer3IPI: u32,
//     pub SnapID: [u8; 5],
// }

// UNSUPPORTED Rust 711:1: declaration Impl has no candidate rule
// impl Default for ATM_BLLI_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_BROADBAND_BEARER_CAPABILITY_IE {
//     pub BearerClass: u8,
//     pub TrafficType: u8,
//     pub TimingRequirements: u8,
//     pub ClippingSusceptability: u8,
//     pub UserPlaneConnectionConfig: u8,
// }

// UNSUPPORTED Rust 725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_CALLING_PARTY_NUMBER_IE {
//     pub ATM_Number: ATM_ADDRESS,
//     pub Presentation_Indication: u8,
//     pub Screening_Indicator: u8,
// }

// UNSUPPORTED Rust 732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATM_CAUSE_IE {
//     pub Location: u8,
//     pub Cause: u8,
//     pub DiagnosticsLength: u8,
//     pub Diagnostics: [u8; 4],
// }

// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule
// impl Default for ATM_CAUSE_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 745:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_CONNECTION_ID {
//     pub DeviceNumber: u32,
//     pub VPI: u32,
//     pub VCI: u32,
// }

public const val `ATM_E164`: UInt = 1u;
public const val `ATM_NSAP`: UInt = 2u;
// UNSUPPORTED Rust 754:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_PVC_PARAMS {
//     pub PvcConnectionId: ATM_CONNECTION_ID,
//     pub PvcQos: QOS,
// }

// UNSUPPORTED Rust 760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_QOS_CLASS_IE {
//     pub QOSClassForward: u8,
//     pub QOSClassBackward: u8,
// }

// UNSUPPORTED Rust 766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_TD {
//     pub PeakCellRate_CLP0: u32,
//     pub PeakCellRate_CLP01: u32,
//     pub SustainableCellRate_CLP0: u32,
//     pub SustainableCellRate_CLP01: u32,
//     pub MaxBurstSize_CLP0: u32,
//     pub MaxBurstSize_CLP01: u32,
//     pub Tagging: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ATM_TRAFFIC_DESCRIPTOR_IE {
//     pub Forward: ATM_TD,
//     pub Backward: ATM_TD,
//     pub BestEffort: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ATM_TRANSIT_NETWORK_SELECTION_IE {
//     pub TypeOfNetworkId: u8,
//     pub NetworkIdPlan: u8,
//     pub NetworkIdLength: u8,
//     pub NetworkId: [u8; 1],
// }

// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule
// impl Default for ATM_TRANSIT_NETWORK_SELECTION_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BASE_PROTOCOL`: UInt = 1u;
public const val `BCOB_A`: UInt = 1u;
public const val `BCOB_C`: UInt = 3u;
public const val `BCOB_X`: UInt = 16u;
public const val `BHLI_HighLayerProfile`: UInt = 2u;
public const val `BHLI_ISO`: UInt = 0u;
public const val `BHLI_UserSpecific`: UInt = 1u;
public const val `BHLI_VendorSpecificAppId`: UInt = 3u;
public const val `BIGENDIAN`: UInt = 0u;
public const val `BITS_PER_BYTE`: UInt = 8u;
public const val `BLLI_L2_ELAPB`: UInt = 8u;
public const val `BLLI_L2_HDLC_ABM`: UInt = 11u;
public const val `BLLI_L2_HDLC_ARM`: UInt = 9u;
public const val `BLLI_L2_HDLC_NRM`: UInt = 10u;
public const val `BLLI_L2_ISO_1745`: UInt = 1u;
public const val `BLLI_L2_ISO_7776`: UInt = 17u;
public const val `BLLI_L2_LLC`: UInt = 12u;
public const val `BLLI_L2_MODE_EXT`: UInt = 128u;
public const val `BLLI_L2_MODE_NORMAL`: UInt = 64u;
public const val `BLLI_L2_Q921`: UInt = 2u;
public const val `BLLI_L2_Q922`: UInt = 14u;
public const val `BLLI_L2_USER_SPECIFIED`: UInt = 16u;
public const val `BLLI_L2_X25L`: UInt = 6u;
public const val `BLLI_L2_X25M`: UInt = 7u;
public const val `BLLI_L2_X75`: UInt = 13u;
public const val `BLLI_L3_IPI_IP`: UInt = 204u;
public const val `BLLI_L3_IPI_SNAP`: UInt = 128u;
public const val `BLLI_L3_ISO_8208`: UInt = 7u;
public const val `BLLI_L3_ISO_TR9577`: UInt = 11u;
public const val `BLLI_L3_MODE_EXT`: UInt = 128u;
public const val `BLLI_L3_MODE_NORMAL`: UInt = 64u;
public const val `BLLI_L3_PACKET_1024`: UInt = 10u;
public const val `BLLI_L3_PACKET_128`: UInt = 7u;
public const val `BLLI_L3_PACKET_16`: UInt = 4u;
public const val `BLLI_L3_PACKET_2048`: UInt = 11u;
public const val `BLLI_L3_PACKET_256`: UInt = 8u;
public const val `BLLI_L3_PACKET_32`: UInt = 5u;
public const val `BLLI_L3_PACKET_4096`: UInt = 12u;
public const val `BLLI_L3_PACKET_512`: UInt = 9u;
public const val `BLLI_L3_PACKET_64`: UInt = 6u;
public const val `BLLI_L3_SIO_8473`: UInt = 9u;
public const val `BLLI_L3_T70`: UInt = 10u;
public const val `BLLI_L3_USER_SPECIFIED`: UInt = 16u;
public const val `BLLI_L3_X223`: UInt = 8u;
public const val `BLLI_L3_X25`: UInt = 6u;
public const val `BYTE_ORDER`: UInt = 1234u;
public const val `CAUSE_AAL_PARAMETERS_UNSUPPORTED`: UInt = 93u;
public const val `CAUSE_ACCESS_INFORMAION_DISCARDED`: UInt = 43u;
public const val `CAUSE_BEARER_CAPABILITY_UNAUTHORIZED`: UInt = 57u;
public const val `CAUSE_BEARER_CAPABILITY_UNAVAILABLE`: UInt = 58u;
public const val `CAUSE_BEARER_CAPABILITY_UNIMPLEMENTED`: UInt = 65u;
public const val `CAUSE_CALL_REJECTED`: UInt = 21u;
public const val `CAUSE_CHANNEL_NONEXISTENT`: UInt = 82u;
public const val `CAUSE_COND_PERMANENT`: UInt = 1u;
public const val `CAUSE_COND_TRANSIENT`: UInt = 2u;
public const val `CAUSE_COND_UNKNOWN`: UInt = 0u;
public const val `CAUSE_DESTINATION_OUT_OF_ORDER`: UInt = 27u;
public const val `CAUSE_INCOMPATIBLE_DESTINATION`: UInt = 88u;
public const val `CAUSE_INCORRECT_MESSAGE_LENGTH`: UInt = 104u;
public const val `CAUSE_INVALID_CALL_REFERENCE`: UInt = 81u;
public const val `CAUSE_INVALID_ENDPOINT_REFERENCE`: UInt = 89u;
public const val `CAUSE_INVALID_IE_CONTENTS`: UInt = 100u;
public const val `CAUSE_INVALID_NUMBER_FORMAT`: UInt = 28u;
public const val `CAUSE_INVALID_STATE_FOR_MESSAGE`: UInt = 101u;
public const val `CAUSE_INVALID_TRANSIT_NETWORK_SELECTION`: UInt = 91u;
public const val `CAUSE_LOC_BEYOND_INTERWORKING`: UInt = 10u;
public const val `CAUSE_LOC_INTERNATIONAL_NETWORK`: UInt = 7u;
public const val `CAUSE_LOC_PRIVATE_LOCAL`: UInt = 1u;
public const val `CAUSE_LOC_PRIVATE_REMOTE`: UInt = 5u;
public const val `CAUSE_LOC_PUBLIC_LOCAL`: UInt = 2u;
public const val `CAUSE_LOC_PUBLIC_REMOTE`: UInt = 4u;
public const val `CAUSE_LOC_TRANSIT_NETWORK`: UInt = 3u;
public const val `CAUSE_LOC_USER`: UInt = 0u;
public const val `CAUSE_MANDATORY_IE_MISSING`: UInt = 96u;
public const val `CAUSE_NA_ABNORMAL`: UInt = 4u;
public const val `CAUSE_NA_NORMAL`: UInt = 0u;
public const val `CAUSE_NETWORK_OUT_OF_ORDER`: UInt = 38u;
public const val `CAUSE_NORMAL_CALL_CLEARING`: UInt = 16u;
public const val `CAUSE_NORMAL_UNSPECIFIED`: UInt = 31u;
public const val `CAUSE_NO_ROUTE_TO_DESTINATION`: UInt = 3u;
public const val `CAUSE_NO_ROUTE_TO_TRANSIT_NETWORK`: UInt = 2u;
public const val `CAUSE_NO_USER_RESPONDING`: UInt = 18u;
public const val `CAUSE_NO_VPI_VCI_AVAILABLE`: UInt = 45u;
public const val `CAUSE_NUMBER_CHANGED`: UInt = 22u;
public const val `CAUSE_OPTION_UNAVAILABLE`: UInt = 63u;
public const val `CAUSE_PROTOCOL_ERROR`: UInt = 111u;
public const val `CAUSE_PU_PROVIDER`: UInt = 0u;
public const val `CAUSE_PU_USER`: UInt = 8u;
public const val `CAUSE_QOS_UNAVAILABLE`: UInt = 49u;
public const val `CAUSE_REASON_IE_INSUFFICIENT`: UInt = 8u;
public const val `CAUSE_REASON_IE_MISSING`: UInt = 4u;
public const val `CAUSE_REASON_USER`: UInt = 0u;
public const val `CAUSE_RECOVERY_ON_TIMEOUT`: UInt = 102u;
public const val `CAUSE_RESOURCE_UNAVAILABLE`: UInt = 47u;
public const val `CAUSE_STATUS_ENQUIRY_RESPONSE`: UInt = 30u;
public const val `CAUSE_TEMPORARY_FAILURE`: UInt = 41u;
public const val `CAUSE_TOO_MANY_PENDING_ADD_PARTY`: UInt = 92u;
public const val `CAUSE_UNALLOCATED_NUMBER`: UInt = 1u;
public const val `CAUSE_UNIMPLEMENTED_IE`: UInt = 99u;
public const val `CAUSE_UNIMPLEMENTED_MESSAGE_TYPE`: UInt = 97u;
public const val `CAUSE_UNSUPPORTED_TRAFFIC_PARAMETERS`: UInt = 73u;
public const val `CAUSE_USER_BUSY`: UInt = 17u;
public const val `CAUSE_USER_CELL_RATE_UNAVAILABLE`: UInt = 51u;
public const val `CAUSE_USER_REJECTS_CLIR`: UInt = 23u;
public const val `CAUSE_VPI_VCI_UNACCEPTABLE`: UInt = 10u;
public const val `CAUSE_VPI_VCI_UNAVAILABLE`: UInt = 35u;
public const val `CF_ACCEPT`: UInt = 0u;
public const val `CF_DEFER`: UInt = 2u;
public const val `CF_REJECT`: UInt = 1u;
public const val `CLIP_NOT`: UInt = 0u;
public const val `CLIP_SUS`: UInt = 32u;
// UNSUPPORTED Rust 908:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSGHDR {
//     pub cmsg_len: usize,
//     pub cmsg_level: i32,
//     pub cmsg_type: i32,
// }

public const val `COMP_EQUAL`: `WSAECOMPARATOR` = 0;
public const val `COMP_NOTLESS`: `WSAECOMPARATOR` = 1;
public typealias `CONTROL_CHANNEL_TRIGGER_STATUS` = Int;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_HARDWARE_SLOT_ALLOCATED`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 2;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_INVALID`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 0;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_POLICY_ERROR`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 3;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_SERVICE_UNAVAILABLE`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 6;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_SOFTWARE_SLOT_ALLOCATED`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 1;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_SYSTEM_ERROR`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 4;
public const val `CONTROL_CHANNEL_TRIGGER_STATUS_TRANSPORT_DISCONNECTED`: `CONTROL_CHANNEL_TRIGGER_STATUS` = 5;
// UNSUPPORTED Rust 925:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CSADDR_INFO {
//     pub LocalAddr: SOCKET_ADDRESS,
//     pub RemoteAddr: SOCKET_ADDRESS,
//     pub iSocketType: i32,
//     pub iProtocol: i32,
// }

public const val `DE_REUSE_SOCKET`: UInt = 2u;
public const val `DL_ADDRESS_LENGTH_MAXIMUM`: UInt = 32u;
// UNSUPPORTED Rust 935:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DL_EI48 {
//     pub Byte: [u8; 3],
// }

// UNSUPPORTED Rust 940:1: declaration Impl has no candidate rule
// impl Default for DL_EI48 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 945:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DL_EI64 {
//     pub Byte: [u8; 5],
// }

// UNSUPPORTED Rust 950:1: declaration Impl has no candidate rule
// impl Default for DL_EI64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 955:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DL_EUI48 {
//     pub Byte: [u8; 6],
//     pub Anonymous: DL_EUI48_0,
// }

// UNSUPPORTED Rust 961:1: declaration Impl has no candidate rule
// impl Default for DL_EUI48 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DL_EUI48_0 {
//     pub Oui: DL_OUI,
//     pub Ei48: DL_EI48,
// }

// UNSUPPORTED Rust 972:1: declaration Impl has no candidate rule
// impl Default for DL_EUI48_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 977:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DL_EUI64 {
//     pub Byte: [u8; 8],
//     pub Value: u64,
//     pub Anonymous: DL_EUI64_0,
// }

// UNSUPPORTED Rust 984:1: declaration Impl has no candidate rule
// impl Default for DL_EUI64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DL_EUI64_0 {
//     pub Oui: DL_OUI,
//     pub Anonymous: DL_EUI64_0_0,
// }

// UNSUPPORTED Rust 995:1: declaration Impl has no candidate rule
// impl Default for DL_EUI64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1000:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DL_EUI64_0_0 {
//     pub Ei64: DL_EI64,
//     pub Anonymous: DL_EUI64_0_0_0,
// }

// UNSUPPORTED Rust 1006:1: declaration Impl has no candidate rule
// impl Default for DL_EUI64_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DL_EUI64_0_0_0 {
//     pub Type: u8,
//     pub Tse: u8,
//     pub Ei48: DL_EI48,
// }

// UNSUPPORTED Rust 1018:1: declaration Impl has no candidate rule
// impl Default for DL_EUI64_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DL_HEADER_LENGTH_MAXIMUM`: UInt = 64u;
// UNSUPPORTED Rust 1024:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DL_OUI {
//     pub Byte: [u8; 3],
//     pub Anonymous: DL_OUI_0,
// }

// UNSUPPORTED Rust 1030:1: declaration Impl has no candidate rule
// impl Default for DL_OUI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1035:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DL_OUI_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1040:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DL_TEREDO_ADDRESS {
//     pub Reserved: [u8; 6],
//     pub Anonymous: DL_TEREDO_ADDRESS_0,
// }

// UNSUPPORTED Rust 1046:1: declaration Impl has no candidate rule
// impl Default for DL_TEREDO_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1051:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union DL_TEREDO_ADDRESS_0 {
//     pub Eui64: DL_EUI64,
//     pub Anonymous: DL_TEREDO_ADDRESS_0_0,
// }

// UNSUPPORTED Rust 1057:1: declaration Impl has no candidate rule
// impl Default for DL_TEREDO_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1062:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DL_TEREDO_ADDRESS_0_0 {
//     pub Flags: u16,
//     pub MappedPort: u16,
//     pub MappedAddress: IN_ADDR,
// }

// UNSUPPORTED Rust 1069:1: declaration Impl has no candidate rule
// impl Default for DL_TEREDO_ADDRESS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1074:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DL_TEREDO_ADDRESS_PRV {
//     pub Reserved: [u8; 6],
//     pub Anonymous: DL_TEREDO_ADDRESS_PRV_0,
// }

// UNSUPPORTED Rust 1080:1: declaration Impl has no candidate rule
// impl Default for DL_TEREDO_ADDRESS_PRV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1085:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union DL_TEREDO_ADDRESS_PRV_0 {
//     pub Eui64: DL_EUI64,
//     pub Anonymous: DL_TEREDO_ADDRESS_PRV_0_0,
// }

// UNSUPPORTED Rust 1091:1: declaration Impl has no candidate rule
// impl Default for DL_TEREDO_ADDRESS_PRV_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1096:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DL_TEREDO_ADDRESS_PRV_0_0 {
//     pub Flags: u16,
//     pub MappedPort: u16,
//     pub MappedAddress: IN_ADDR,
//     pub LocalAddress: IN_ADDR,
//     pub InterfaceIndex: u32,
//     pub LocalPort: u16,
//     pub DlDestination: DL_EUI48,
// }

// UNSUPPORTED Rust 1107:1: declaration Impl has no candidate rule
// impl Default for DL_TEREDO_ADDRESS_PRV_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1112:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct DL_TUNNEL_ADDRESS {
//     pub CompartmentId: super::super::System::Kernel::COMPARTMENT_ID,
//     pub ScopeId: SCOPE_ID,
//     pub IpAddress: [u8; 1],
// }

// UNSUPPORTED Rust 1120:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DL_TUNNEL_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ETHERNET_HEADER {
//     pub Destination: DL_EUI48,
//     pub Source: DL_EUI48,
//     pub Anonymous: ETHERNET_HEADER_0,
// }

// UNSUPPORTED Rust 1133:1: declaration Impl has no candidate rule
// impl Default for ETHERNET_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1138:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ETHERNET_HEADER_0 {
//     pub Type: u16,
//     pub Length: u16,
// }

// UNSUPPORTED Rust 1144:1: declaration Impl has no candidate rule
// impl Default for ETHERNET_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ETHERNET_TYPE_802_1AD`: UInt = 34984u;
public const val `ETHERNET_TYPE_802_1Q`: UInt = 33024u;
public const val `ETHERNET_TYPE_ARP`: UInt = 2054u;
public const val `ETHERNET_TYPE_IPV4`: UInt = 2048u;
public const val `ETHERNET_TYPE_IPV6`: UInt = 34525u;
public const val `ETHERNET_TYPE_MINIMUM`: UInt = 1536u;
public const val `ETH_LENGTH_OF_HEADER`: UInt = 14u;
public const val `ETH_LENGTH_OF_SNAP_HEADER`: UInt = 8u;
public const val `ETH_LENGTH_OF_VLAN_HEADER`: UInt = 4u;
public const val `EXT_LEN_UNIT`: UInt = 8u;
public const val `E_WINDOW_ADVANCE_BY_TIME`: `eWINDOW_ADVANCE_METHOD` = 1;
public const val `E_WINDOW_USE_AS_DATA_CACHE`: `eWINDOW_ADVANCE_METHOD` = 2;
public typealias `FALLBACK_INDEX` = Int;
public const val `FD_ACCEPT`: UInt = 8u;
public const val `FD_ACCEPT_BIT`: UInt = 3u;
public const val `FD_ADDRESS_LIST_CHANGE_BIT`: UInt = 9u;
public const val `FD_CLOSE`: UInt = 32u;
public const val `FD_CLOSE_BIT`: UInt = 5u;
public const val `FD_CONNECT`: UInt = 16u;
public const val `FD_CONNECT_BIT`: UInt = 4u;
public const val `FD_GROUP_QOS_BIT`: UInt = 7u;
public const val `FD_MAX_EVENTS`: UInt = 10u;
public const val `FD_OOB`: UInt = 4u;
public const val `FD_OOB_BIT`: UInt = 2u;
public const val `FD_QOS_BIT`: UInt = 6u;
public const val `FD_READ`: UInt = 1u;
public const val `FD_READ_BIT`: UInt = 0u;
public const val `FD_ROUTING_INTERFACE_CHANGE_BIT`: UInt = 8u;
// UNSUPPORTED Rust 1177:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FD_SET {
//     pub fd_count: u32,
//     pub fd_array: [SOCKET; 64],
// }

// UNSUPPORTED Rust 1183:1: declaration Impl has no candidate rule
// impl Default for FD_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FD_SETSIZE`: UInt = 64u;
public const val `FD_WRITE`: UInt = 2u;
public const val `FD_WRITE_BIT`: UInt = 1u;
public const val `FIOASYNC`: Int = -2147195267;
public const val `FIONBIO`: Int = -2147195266;
public const val `FIONREAD`: Int = 1074030207;
// UNSUPPORTED Rust 1194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FLOWSPEC {
//     pub TokenRate: u32,
//     pub TokenBucketSize: u32,
//     pub PeakBandwidth: u32,
//     pub Latency: u32,
//     pub DelayVariation: u32,
//     pub ServiceType: u32,
//     pub MaxSduSize: u32,
//     pub MinimumPolicedSize: u32,
// }

public const val `FROM_PROTOCOL_INFO`: Int = -1;
public const val `FallbackIndexMax`: `FALLBACK_INDEX` = 1;
public const val `FallbackIndexTcpFastopen`: `FALLBACK_INDEX` = 0;
public const val `GAI_STRERROR_BUFFER_SIZE`: UInt = 1024u;
// UNSUPPORTED Rust 1210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_FILTER {
//     pub gf_interface: u32,
//     pub gf_group: SOCKADDR_STORAGE,
//     pub gf_fmode: MULTICAST_MODE_TYPE,
//     pub gf_numsrc: u32,
//     pub gf_slist: [SOCKADDR_STORAGE; 1],
// }

// UNSUPPORTED Rust 1219:1: declaration Impl has no candidate rule
// impl Default for GROUP_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GROUP_REQ {
//     pub gr_interface: u32,
//     pub gr_group: SOCKADDR_STORAGE,
// }

// UNSUPPORTED Rust 1230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GROUP_SOURCE_REQ {
//     pub gsr_interface: u32,
//     pub gsr_group: SOCKADDR_STORAGE,
//     pub gsr_source: SOCKADDR_STORAGE,
// }

// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HOSTENT {
//     pub h_name: windows_sys::core::PSTR,
//     pub h_aliases: *mut *mut i8,
//     pub h_addrtype: i16,
//     pub h_length: i16,
//     pub h_addr_list: *mut *mut i8,
// }

// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule
// impl Default for HOSTENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IAS_ATTRIB_INT`: UInt = 1u;
public const val `IAS_ATTRIB_NO_ATTRIB`: UInt = 0u;
public const val `IAS_ATTRIB_NO_CLASS`: UInt = 16u;
public const val `IAS_ATTRIB_OCTETSEQ`: UInt = 2u;
public const val `IAS_ATTRIB_STR`: UInt = 3u;
public const val `IAS_MAX_ATTRIBNAME`: UInt = 256u;
public const val `IAS_MAX_CLASSNAME`: UInt = 64u;
public const val `IAS_MAX_OCTET_STRING`: UInt = 1024u;
public const val `IAS_MAX_USER_STRING`: UInt = 256u;
public typealias `ICMP4_TIME_EXCEED_CODE` = Int;
public const val `ICMP4_TIME_EXCEED_REASSEMBLY`: `ICMP4_TIME_EXCEED_CODE` = 1;
public const val `ICMP4_TIME_EXCEED_TRANSIT`: `ICMP4_TIME_EXCEED_CODE` = 0;
public const val `ICMP4_UNREACH_ADMIN`: `ICMP4_UNREACH_CODE` = 13;
public typealias `ICMP4_UNREACH_CODE` = Int;
public const val `ICMP4_UNREACH_FRAG_NEEDED`: `ICMP4_UNREACH_CODE` = 4;
public const val `ICMP4_UNREACH_HOST`: `ICMP4_UNREACH_CODE` = 1;
public const val `ICMP4_UNREACH_HOST_ADMIN`: `ICMP4_UNREACH_CODE` = 10;
public const val `ICMP4_UNREACH_HOST_TOS`: `ICMP4_UNREACH_CODE` = 12;
public const val `ICMP4_UNREACH_HOST_UNKNOWN`: `ICMP4_UNREACH_CODE` = 7;
public const val `ICMP4_UNREACH_ISOLATED`: `ICMP4_UNREACH_CODE` = 8;
public const val `ICMP4_UNREACH_NET`: `ICMP4_UNREACH_CODE` = 0;
public const val `ICMP4_UNREACH_NET_ADMIN`: `ICMP4_UNREACH_CODE` = 9;
public const val `ICMP4_UNREACH_NET_TOS`: `ICMP4_UNREACH_CODE` = 11;
public const val `ICMP4_UNREACH_NET_UNKNOWN`: `ICMP4_UNREACH_CODE` = 6;
public const val `ICMP4_UNREACH_PORT`: `ICMP4_UNREACH_CODE` = 3;
public const val `ICMP4_UNREACH_PROTOCOL`: `ICMP4_UNREACH_CODE` = 2;
public const val `ICMP4_UNREACH_SOURCEROUTE_FAILED`: `ICMP4_UNREACH_CODE` = 5;
public const val `ICMP6_DST_UNREACH_ADDR`: UInt = 3u;
public const val `ICMP6_DST_UNREACH_ADMIN`: UInt = 1u;
public const val `ICMP6_DST_UNREACH_BEYONDSCOPE`: UInt = 2u;
public const val `ICMP6_DST_UNREACH_NOPORT`: UInt = 4u;
public const val `ICMP6_DST_UNREACH_NOROUTE`: UInt = 0u;
public const val `ICMP6_PARAMPROB_FIRSTFRAGMENT`: UInt = 3u;
public const val `ICMP6_PARAMPROB_HEADER`: UInt = 0u;
public const val `ICMP6_PARAMPROB_NEXTHEADER`: UInt = 1u;
public const val `ICMP6_PARAMPROB_OPTION`: UInt = 2u;
public const val `ICMP6_TIME_EXCEED_REASSEMBLY`: UInt = 1u;
public const val `ICMP6_TIME_EXCEED_TRANSIT`: UInt = 0u;
// UNSUPPORTED Rust 1289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMPV4_ADDRESS_MASK_MESSAGE {
//     pub Header: ICMP_MESSAGE,
//     pub AddressMask: u32,
// }

// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule
// impl Default for ICMPV4_ADDRESS_MASK_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICMPV4_INVALID_PREFERENCE_LEVEL`: UInt = 2147483648u;
// UNSUPPORTED Rust 1301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMPV4_ROUTER_ADVERT_ENTRY {
//     pub RouterAdvertAddr: IN_ADDR,
//     pub PreferenceLevel: i32,
// }

// UNSUPPORTED Rust 1307:1: declaration Impl has no candidate rule
// impl Default for ICMPV4_ROUTER_ADVERT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMPV4_ROUTER_ADVERT_HEADER {
//     pub RaHeader: ICMP_MESSAGE,
// }

// UNSUPPORTED Rust 1317:1: declaration Impl has no candidate rule
// impl Default for ICMPV4_ROUTER_ADVERT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMPV4_ROUTER_SOLICIT {
//     pub RsHeader: ICMP_MESSAGE,
// }

// UNSUPPORTED Rust 1327:1: declaration Impl has no candidate rule
// impl Default for ICMPV4_ROUTER_SOLICIT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMPV4_TIMESTAMP_MESSAGE {
//     pub Header: ICMP_MESSAGE,
//     pub OriginateTimestamp: u32,
//     pub ReceiveTimestamp: u32,
//     pub TransmitTimestamp: u32,
// }

// UNSUPPORTED Rust 1340:1: declaration Impl has no candidate rule
// impl Default for ICMPV4_TIMESTAMP_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICMPV6_ECHO_REQUEST_FLAG_REVERSE`: UInt = 1u;
// UNSUPPORTED Rust 1346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMP_ERROR_INFO {
//     pub srcaddress: SOCKADDR_INET,
//     pub protocol: IPPROTO,
//     pub r#type: u8,
//     pub code: u8,
// }

// UNSUPPORTED Rust 1354:1: declaration Impl has no candidate rule
// impl Default for ICMP_ERROR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1359:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ICMP_HEADER {
//     pub Type: u8,
//     pub Code: u8,
//     pub Checksum: u16,
// }

// UNSUPPORTED Rust 1366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICMP_MESSAGE {
//     pub Header: ICMP_HEADER,
//     pub Data: ICMP_MESSAGE_0,
// }

// UNSUPPORTED Rust 1372:1: declaration Impl has no candidate rule
// impl Default for ICMP_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1377:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ICMP_MESSAGE_0 {
//     pub Data32: [u32; 1],
//     pub Data16: [u16; 2],
//     pub Data8: [u8; 4],
// }

// UNSUPPORTED Rust 1384:1: declaration Impl has no candidate rule
// impl Default for ICMP_MESSAGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IE_AALParameters`: `Q2931_IE_TYPE` = 0;
public const val `IE_BHLI`: `Q2931_IE_TYPE` = 3;
public const val `IE_BLLI`: `Q2931_IE_TYPE` = 4;
public const val `IE_BroadbandBearerCapability`: `Q2931_IE_TYPE` = 2;
public const val `IE_CalledPartyNumber`: `Q2931_IE_TYPE` = 5;
public const val `IE_CalledPartySubaddress`: `Q2931_IE_TYPE` = 6;
public const val `IE_CallingPartyNumber`: `Q2931_IE_TYPE` = 7;
public const val `IE_CallingPartySubaddress`: `Q2931_IE_TYPE` = 8;
public const val `IE_Cause`: `Q2931_IE_TYPE` = 9;
public const val `IE_QOSClass`: `Q2931_IE_TYPE` = 10;
public const val `IE_TrafficDescriptor`: `Q2931_IE_TYPE` = 1;
public const val `IE_TransitNetworkSelection`: `Q2931_IE_TYPE` = 11;
public const val `IFF_BROADCAST`: UInt = 2u;
public const val `IFF_LOOPBACK`: UInt = 4u;
public const val `IFF_MULTICAST`: UInt = 16u;
public const val `IFF_POINTTOPOINT`: UInt = 8u;
public const val `IFF_UP`: UInt = 1u;
// UNSUPPORTED Rust 1406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IGMPV3_QUERY_HEADER {
//     pub Type: u8,
//     pub Anonymous1: IGMPV3_QUERY_HEADER_0,
//     pub Checksum: u16,
//     pub MulticastAddress: IN_ADDR,
//     pub _bitfield: u8,
//     pub Anonymous2: IGMPV3_QUERY_HEADER_1,
//     pub SourceCount: u16,
// }

// UNSUPPORTED Rust 1417:1: declaration Impl has no candidate rule
// impl Default for IGMPV3_QUERY_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1422:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IGMPV3_QUERY_HEADER_0 {
//     pub MaxRespCode: u8,
//     pub Anonymous: IGMPV3_QUERY_HEADER_0_0,
// }

// UNSUPPORTED Rust 1428:1: declaration Impl has no candidate rule
// impl Default for IGMPV3_QUERY_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1433:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IGMPV3_QUERY_HEADER_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1438:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IGMPV3_QUERY_HEADER_1 {
//     pub QueriersQueryInterfaceCode: u8,
//     pub Anonymous: IGMPV3_QUERY_HEADER_1_0,
// }

// UNSUPPORTED Rust 1444:1: declaration Impl has no candidate rule
// impl Default for IGMPV3_QUERY_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1449:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IGMPV3_QUERY_HEADER_1_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IGMPV3_REPORT_HEADER {
//     pub Type: u8,
//     pub Reserved: u8,
//     pub Checksum: u16,
//     pub Reserved2: u16,
//     pub RecordCount: u16,
// }

// UNSUPPORTED Rust 1463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IGMPV3_REPORT_RECORD_HEADER {
//     pub Type: u8,
//     pub AuxillaryDataLength: u8,
//     pub SourceCount: u16,
//     pub MulticastAddress: IN_ADDR,
// }

// UNSUPPORTED Rust 1471:1: declaration Impl has no candidate rule
// impl Default for IGMPV3_REPORT_RECORD_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IGMP_HEADER {
//     pub Anonymous1: IGMP_HEADER_0,
//     pub Anonymous2: IGMP_HEADER_1,
//     pub Checksum: u16,
//     pub MulticastAddress: IN_ADDR,
// }

// UNSUPPORTED Rust 1484:1: declaration Impl has no candidate rule
// impl Default for IGMP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1489:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IGMP_HEADER_0 {
//     pub Anonymous: IGMP_HEADER_0_0,
//     pub VersionType: u8,
// }

// UNSUPPORTED Rust 1495:1: declaration Impl has no candidate rule
// impl Default for IGMP_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1500:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IGMP_HEADER_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1505:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IGMP_HEADER_1 {
//     pub Reserved: u8,
//     pub MaxRespTime: u8,
//     pub Code: u8,
// }

// UNSUPPORTED Rust 1512:1: declaration Impl has no candidate rule
// impl Default for IGMP_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IGMP_LEAVE_GROUP_TYPE`: UInt = 23u;
public typealias `IGMP_MAX_RESP_CODE_TYPE` = Int;
public const val `IGMP_MAX_RESP_CODE_TYPE_FLOAT`: `IGMP_MAX_RESP_CODE_TYPE` = 1;
public const val `IGMP_MAX_RESP_CODE_TYPE_NORMAL`: `IGMP_MAX_RESP_CODE_TYPE` = 0;
public const val `IGMP_QUERY_TYPE`: UInt = 17u;
public const val `IGMP_VERSION1_REPORT_TYPE`: UInt = 18u;
public const val `IGMP_VERSION2_REPORT_TYPE`: UInt = 22u;
public const val `IGMP_VERSION3_REPORT_TYPE`: UInt = 34u;
public const val `IMPLINK_HIGHEXPER`: UInt = 158u;
public const val `IMPLINK_IP`: UInt = 155u;
public const val `IMPLINK_LOWEXPER`: UInt = 156u;
public const val `IN4ADDR_ANY`: UInt = 0u;
public const val `IN4ADDR_BROADCAST`: UInt = 4294967295u;
public const val `IN4ADDR_LINKLOCALPREFIX_LENGTH`: UInt = 16u;
public const val `IN4ADDR_LOOPBACK`: UInt = 16777343u;
public const val `IN4ADDR_LOOPBACKPREFIX_LENGTH`: UInt = 8u;
public const val `IN4ADDR_MULTICASTPREFIX_LENGTH`: UInt = 4u;
public const val `IN6ADDR_6TO4PREFIX_LENGTH`: UInt = 16u;
public const val `IN6ADDR_LINKLOCALPREFIX_LENGTH`: UInt = 64u;
public const val `IN6ADDR_MULTICASTPREFIX_LENGTH`: UInt = 8u;
public const val `IN6ADDR_SOLICITEDNODEMULTICASTPREFIX_LENGTH`: UInt = 104u;
public const val `IN6ADDR_TEREDOPREFIX_LENGTH`: UInt = 32u;
public const val `IN6ADDR_V4MAPPEDPREFIX_LENGTH`: UInt = 96u;
// UNSUPPORTED Rust 1540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN6_ADDR {
//     pub u: IN6_ADDR_0,
// }

// UNSUPPORTED Rust 1545:1: declaration Impl has no candidate rule
// impl Default for IN6_ADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1550:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IN6_ADDR_0 {
//     pub Byte: [u8; 16],
//     pub Word: [u16; 8],
// }

// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule
// impl Default for IN6_ADDR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IN6_EMBEDDEDV4_BITS_IN_BYTE`: UInt = 8u;
public const val `IN6_EMBEDDEDV4_UOCTET_POSITION`: UInt = 8u;
// UNSUPPORTED Rust 1563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN6_PKTINFO {
//     pub ipi6_addr: IN6_ADDR,
//     pub ipi6_ifindex: u32,
// }

// UNSUPPORTED Rust 1569:1: declaration Impl has no candidate rule
// impl Default for IN6_PKTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1574:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN6_PKTINFO_EX {
//     pub pkt_info: IN6_PKTINFO,
//     pub scope_id: SCOPE_ID,
// }

// UNSUPPORTED Rust 1580:1: declaration Impl has no candidate rule
// impl Default for IN6_PKTINFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INADDR_ANY`: UInt = 0u;
public const val `INADDR_BROADCAST`: UInt = 4294967295u;
public const val `INADDR_LOOPBACK`: UInt = 2130706433u;
public const val `INADDR_NONE`: UInt = 4294967295u;
public const val `INCL_WINSOCK_API_PROTOTYPES`: UInt = 1u;
public const val `INCL_WINSOCK_API_TYPEDEFS`: UInt = 0u;
public const val `INET6_ADDRSTRLEN`: UInt = 65u;
public const val `INET_ADDRSTRLEN`: UInt = 22u;
// UNSUPPORTED Rust 1593:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INET_PORT_RANGE {
//     pub StartPort: u16,
//     pub NumberOfPorts: u16,
// }

// UNSUPPORTED Rust 1599:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INET_PORT_RESERVATION_INFORMATION {
//     pub OwningPid: u32,
// }

// UNSUPPORTED Rust 1604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INET_PORT_RESERVATION_INSTANCE {
//     pub Reservation: INET_PORT_RANGE,
//     pub Token: INET_PORT_RESERVATION_TOKEN,
// }

// UNSUPPORTED Rust 1610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INET_PORT_RESERVATION_TOKEN {
//     pub Token: u64,
// }

// UNSUPPORTED Rust 1615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERFACE_INFO {
//     pub iiFlags: u32,
//     pub iiAddress: sockaddr_gen,
//     pub iiBroadcastAddress: sockaddr_gen,
//     pub iiNetmask: sockaddr_gen,
// }

// UNSUPPORTED Rust 1623:1: declaration Impl has no candidate rule
// impl Default for INTERFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1628:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERFACE_INFO_EX {
//     pub iiFlags: u32,
//     pub iiAddress: SOCKET_ADDRESS,
//     pub iiBroadcastAddress: SOCKET_ADDRESS,
//     pub iiNetmask: SOCKET_ADDRESS,
// }

public const val `INVALID_SOCKET`: `SOCKET` = 18446744073709551615uL;
// UNSUPPORTED Rust 1637:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN_ADDR {
//     pub S_un: IN_ADDR_0,
// }

// UNSUPPORTED Rust 1642:1: declaration Impl has no candidate rule
// impl Default for IN_ADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1647:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IN_ADDR_0 {
//     pub S_un_b: IN_ADDR_0_0,
//     pub S_un_w: IN_ADDR_0_1,
//     pub S_addr: u32,
// }

// UNSUPPORTED Rust 1654:1: declaration Impl has no candidate rule
// impl Default for IN_ADDR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IN_ADDR_0_0 {
//     pub s_b1: u8,
//     pub s_b2: u8,
//     pub s_b3: u8,
//     pub s_b4: u8,
// }

// UNSUPPORTED Rust 1667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IN_ADDR_0_1 {
//     pub s_w1: u16,
//     pub s_w2: u16,
// }

public const val `IN_CLASSA_HOST`: UInt = 16777215u;
public const val `IN_CLASSA_MAX`: UInt = 128u;
public const val `IN_CLASSA_NET`: UInt = 4278190080u;
public const val `IN_CLASSA_NSHIFT`: UInt = 24u;
public const val `IN_CLASSB_HOST`: UInt = 65535u;
public const val `IN_CLASSB_MAX`: UInt = 65536u;
public const val `IN_CLASSB_NET`: UInt = 4294901760u;
public const val `IN_CLASSB_NSHIFT`: UInt = 16u;
public const val `IN_CLASSC_HOST`: UInt = 255u;
public const val `IN_CLASSC_NET`: UInt = 4294967040u;
public const val `IN_CLASSC_NSHIFT`: UInt = 8u;
public const val `IN_CLASSD_HOST`: UInt = 268435455u;
public const val `IN_CLASSD_NET`: UInt = 4026531840u;
public const val `IN_CLASSD_NSHIFT`: UInt = 28u;
// UNSUPPORTED Rust 1687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN_PKTINFO {
//     pub ipi_addr: IN_ADDR,
//     pub ipi_ifindex: u32,
// }

// UNSUPPORTED Rust 1693:1: declaration Impl has no candidate rule
// impl Default for IN_PKTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN_PKTINFO_EX {
//     pub pkt_info: IN_PKTINFO,
//     pub scope_id: SCOPE_ID,
// }

// UNSUPPORTED Rust 1704:1: declaration Impl has no candidate rule
// impl Default for IN_PKTINFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IN_RECVERR {
//     pub protocol: IPPROTO,
//     pub info: u32,
//     pub r#type: u8,
//     pub code: u8,
// }

public const val `IOCPARM_MASK`: UInt = 127u;
public const val `IOC_IN`: UInt = 2147483648u;
public const val `IOC_INOUT`: UInt = 3221225472u;
public const val `IOC_OUT`: UInt = 1073741824u;
public const val `IOC_PROTOCOL`: UInt = 268435456u;
public const val `IOC_UNIX`: UInt = 0u;
public const val `IOC_VENDOR`: UInt = 402653184u;
public const val `IOC_VOID`: UInt = 536870912u;
public const val `IOC_WS2`: UInt = 134217728u;
public const val `IP4_OFF_MASK`: UInt = 65311u;
public const val `IP6F_MORE_FRAG`: UInt = 256u;
public const val `IP6F_OFF_MASK`: UInt = 63743u;
public const val `IP6F_RESERVED_MASK`: UInt = 1536u;
public const val `IP6OPT_JUMBO`: `IPV6_OPTION_TYPE` = 194;
public const val `IP6OPT_MUTABLE`: UInt = 32u;
public const val `IP6OPT_NSAP_ADDR`: `IPV6_OPTION_TYPE` = 195;
public const val `IP6OPT_PAD1`: `IPV6_OPTION_TYPE` = 0;
public const val `IP6OPT_PADN`: `IPV6_OPTION_TYPE` = 1;
public const val `IP6OPT_ROUTER_ALERT`: `IPV6_OPTION_TYPE` = 5;
public const val `IP6OPT_TUNNEL_LIMIT`: `IPV6_OPTION_TYPE` = 4;
public const val `IP6OPT_TYPE_DISCARD`: UInt = 64u;
public const val `IP6OPT_TYPE_FORCEICMP`: UInt = 128u;
public const val `IP6OPT_TYPE_ICMP`: UInt = 192u;
public const val `IP6OPT_TYPE_SKIP`: UInt = 0u;
public const val `IP6T_SO_ORIGINAL_DST`: UInt = 12303u;
public const val `IPPORT_BIFFUDP`: UInt = 512u;
public const val `IPPORT_CHARGEN`: UInt = 19u;
public const val `IPPORT_CMDSERVER`: UInt = 514u;
public const val `IPPORT_DAYTIME`: UInt = 13u;
public const val `IPPORT_DISCARD`: UInt = 9u;
public const val `IPPORT_DYNAMIC_MAX`: UInt = 65535u;
public const val `IPPORT_DYNAMIC_MIN`: UInt = 49152u;
public const val `IPPORT_ECHO`: UInt = 7u;
public const val `IPPORT_EFSSERVER`: UInt = 520u;
public const val `IPPORT_EPMAP`: UInt = 135u;
public const val `IPPORT_EXECSERVER`: UInt = 512u;
public const val `IPPORT_FINGER`: UInt = 79u;
public const val `IPPORT_FTP`: UInt = 21u;
public const val `IPPORT_FTP_DATA`: UInt = 20u;
public const val `IPPORT_HTTPS`: UInt = 443u;
public const val `IPPORT_IMAP`: UInt = 143u;
public const val `IPPORT_IMAP3`: UInt = 220u;
public const val `IPPORT_LDAP`: UInt = 389u;
public const val `IPPORT_LOGINSERVER`: UInt = 513u;
public const val `IPPORT_MICROSOFT_DS`: UInt = 445u;
public const val `IPPORT_MSP`: UInt = 18u;
public const val `IPPORT_MTP`: UInt = 57u;
public const val `IPPORT_NAMESERVER`: UInt = 42u;
public const val `IPPORT_NETBIOS_DGM`: UInt = 138u;
public const val `IPPORT_NETBIOS_NS`: UInt = 137u;
public const val `IPPORT_NETBIOS_SSN`: UInt = 139u;
public const val `IPPORT_NETSTAT`: UInt = 15u;
public const val `IPPORT_NTP`: UInt = 123u;
public const val `IPPORT_POP3`: UInt = 110u;
public const val `IPPORT_QOTD`: UInt = 17u;
public const val `IPPORT_REGISTERED_MAX`: UInt = 49151u;
public const val `IPPORT_REGISTERED_MIN`: UInt = 1024u;
public const val `IPPORT_RESERVED`: UInt = 1024u;
public const val `IPPORT_RJE`: UInt = 77u;
public const val `IPPORT_ROUTESERVER`: UInt = 520u;
public const val `IPPORT_SMTP`: UInt = 25u;
public const val `IPPORT_SNMP`: UInt = 161u;
public const val `IPPORT_SNMP_TRAP`: UInt = 162u;
public const val `IPPORT_SUPDUP`: UInt = 95u;
public const val `IPPORT_SYSTAT`: UInt = 11u;
public const val `IPPORT_TCPMUX`: UInt = 1u;
public const val `IPPORT_TELNET`: UInt = 23u;
public const val `IPPORT_TFTP`: UInt = 69u;
public const val `IPPORT_TIMESERVER`: UInt = 37u;
public const val `IPPORT_TTYLINK`: UInt = 87u;
public const val `IPPORT_WHOIS`: UInt = 43u;
public const val `IPPORT_WHOSERVER`: UInt = 513u;
public typealias `IPPROTO` = Int;
public const val `IPPROTO_AH`: `IPPROTO` = 51;
public const val `IPPROTO_CBT`: `IPPROTO` = 7;
public const val `IPPROTO_DSTOPTS`: `IPPROTO` = 60;
public const val `IPPROTO_EGP`: `IPPROTO` = 8;
public const val `IPPROTO_ESP`: `IPPROTO` = 50;
public const val `IPPROTO_FRAGMENT`: `IPPROTO` = 44;
public const val `IPPROTO_GGP`: `IPPROTO` = 3;
public const val `IPPROTO_HOPOPTS`: `IPPROTO` = 0;
public const val `IPPROTO_ICLFXBM`: `IPPROTO` = 78;
public const val `IPPROTO_ICMP`: `IPPROTO` = 1;
public const val `IPPROTO_ICMPV6`: `IPPROTO` = 58;
public const val `IPPROTO_IDP`: `IPPROTO` = 22;
public const val `IPPROTO_IGMP`: `IPPROTO` = 2;
public const val `IPPROTO_IGP`: `IPPROTO` = 9;
public const val `IPPROTO_IP`: `IPPROTO` = 0;
public const val `IPPROTO_IPV4`: `IPPROTO` = 4;
public const val `IPPROTO_IPV6`: `IPPROTO` = 41;
public const val `IPPROTO_L2TP`: `IPPROTO` = 115;
public const val `IPPROTO_MAX`: `IPPROTO` = 256;
public const val `IPPROTO_ND`: `IPPROTO` = 77;
public const val `IPPROTO_NONE`: `IPPROTO` = 59;
public const val `IPPROTO_PGM`: `IPPROTO` = 113;
public const val `IPPROTO_PIM`: `IPPROTO` = 103;
public const val `IPPROTO_PUP`: `IPPROTO` = 12;
public const val `IPPROTO_RAW`: `IPPROTO` = 255;
public const val `IPPROTO_RDP`: `IPPROTO` = 27;
public const val `IPPROTO_RESERVED_IPSEC`: `IPPROTO` = 258;
public const val `IPPROTO_RESERVED_IPSECOFFLOAD`: `IPPROTO` = 259;
public const val `IPPROTO_RESERVED_MAX`: `IPPROTO` = 261;
public const val `IPPROTO_RESERVED_RAW`: `IPPROTO` = 257;
public const val `IPPROTO_RESERVED_WNV`: `IPPROTO` = 260;
public const val `IPPROTO_RM`: `IPPROTO` = 113;
public const val `IPPROTO_ROUTING`: `IPPROTO` = 43;
public const val `IPPROTO_SCTP`: `IPPROTO` = 132;
public const val `IPPROTO_ST`: `IPPROTO` = 5;
public const val `IPPROTO_TCP`: `IPPROTO` = 6;
public const val `IPPROTO_UDP`: `IPPROTO` = 17;
// UNSUPPORTED Rust 1827:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct IPTLS_METADATA {
//     pub SequenceNumber: u64,
// }

// UNSUPPORTED Rust 1832:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV4_HEADER {
//     pub Anonymous1: IPV4_HEADER_0,
//     pub Anonymous2: IPV4_HEADER_1,
//     pub TotalLength: u16,
//     pub Identification: u16,
//     pub Anonymous3: IPV4_HEADER_2,
//     pub TimeToLive: u8,
//     pub Protocol: u8,
//     pub HeaderChecksum: u16,
//     pub SourceAddress: IN_ADDR,
//     pub DestinationAddress: IN_ADDR,
// }

// UNSUPPORTED Rust 1846:1: declaration Impl has no candidate rule
// impl Default for IPV4_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1851:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV4_HEADER_0 {
//     pub VersionAndHeaderLength: u8,
//     pub Anonymous: IPV4_HEADER_0_0,
// }

// UNSUPPORTED Rust 1857:1: declaration Impl has no candidate rule
// impl Default for IPV4_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV4_HEADER_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1867:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV4_HEADER_1 {
//     pub TypeOfServiceAndEcnField: u8,
//     pub Anonymous: IPV4_HEADER_1_0,
// }

// UNSUPPORTED Rust 1873:1: declaration Impl has no candidate rule
// impl Default for IPV4_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV4_HEADER_1_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 1883:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV4_HEADER_2 {
//     pub FlagsAndOffset: u16,
//     pub Anonymous: IPV4_HEADER_2_0,
// }

// UNSUPPORTED Rust 1889:1: declaration Impl has no candidate rule
// impl Default for IPV4_HEADER_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV4_HEADER_2_0 {
//     pub _bitfield: u16,
// }

public const val `IPV4_MAX_MINIMUM_MTU`: UInt = 576u;
public const val `IPV4_MINIMUM_MTU`: UInt = 576u;
public const val `IPV4_MIN_MINIMUM_MTU`: UInt = 352u;
// UNSUPPORTED Rust 1902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV4_OPTION_HEADER {
//     pub Anonymous: IPV4_OPTION_HEADER_0,
//     pub OptionLength: u8,
// }

// UNSUPPORTED Rust 1908:1: declaration Impl has no candidate rule
// impl Default for IPV4_OPTION_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1913:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV4_OPTION_HEADER_0 {
//     pub OptionType: u8,
//     pub Anonymous: IPV4_OPTION_HEADER_0_0,
// }

// UNSUPPORTED Rust 1919:1: declaration Impl has no candidate rule
// impl Default for IPV4_OPTION_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1924:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV4_OPTION_HEADER_0_0 {
//     pub _bitfield: u8,
// }

public typealias `IPV4_OPTION_TYPE` = Int;
// UNSUPPORTED Rust 1930:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV4_ROUTING_HEADER {
//     pub OptionHeader: IPV4_OPTION_HEADER,
//     pub Pointer: u8,
// }

// UNSUPPORTED Rust 1936:1: declaration Impl has no candidate rule
// impl Default for IPV4_ROUTING_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1941:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV4_TIMESTAMP_OPTION {
//     pub OptionHeader: IPV4_OPTION_HEADER,
//     pub Pointer: u8,
//     pub Anonymous: IPV4_TIMESTAMP_OPTION_0,
// }

// UNSUPPORTED Rust 1948:1: declaration Impl has no candidate rule
// impl Default for IPV4_TIMESTAMP_OPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1953:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV4_TIMESTAMP_OPTION_0 {
//     pub FlagsOverflow: u8,
//     pub Anonymous: IPV4_TIMESTAMP_OPTION_0_0,
// }

// UNSUPPORTED Rust 1959:1: declaration Impl has no candidate rule
// impl Default for IPV4_TIMESTAMP_OPTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1964:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV4_TIMESTAMP_OPTION_0_0 {
//     pub _bitfield: u8,
// }

public const val `IPV4_VERSION`: UInt = 4u;
public const val `IPV6_ADD_IFLIST`: Int = 29;
public const val `IPV6_ADD_MEMBERSHIP`: Int = 12;
public const val `IPV6_CHECKSUM`: Int = 26;
public const val `IPV6_DEL_IFLIST`: Int = 30;
public const val `IPV6_DONTFRAG`: Int = 14;
public const val `IPV6_DROP_MEMBERSHIP`: Int = 13;
public const val `IPV6_ECN`: Int = 50;
public const val `IPV6_ECN_MASK`: UInt = 12288u;
public const val `IPV6_ECN_SHIFT`: UInt = 12u;
// UNSUPPORTED Rust 1979:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV6_EXTENSION_HEADER {
//     pub NextHeader: u8,
//     pub Length: u8,
// }

public const val `IPV6_FLOW_LABEL_MASK`: UInt = 4294905600u;
// UNSUPPORTED Rust 1986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_FRAGMENT_HEADER {
//     pub NextHeader: u8,
//     pub Reserved: u8,
//     pub Anonymous: IPV6_FRAGMENT_HEADER_0,
//     pub Id: u32,
// }

// UNSUPPORTED Rust 1994:1: declaration Impl has no candidate rule
// impl Default for IPV6_FRAGMENT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1999:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV6_FRAGMENT_HEADER_0 {
//     pub Anonymous: IPV6_FRAGMENT_HEADER_0_0,
//     pub OffsetAndFlags: u16,
// }

// UNSUPPORTED Rust 2005:1: declaration Impl has no candidate rule
// impl Default for IPV6_FRAGMENT_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2010:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV6_FRAGMENT_HEADER_0_0 {
//     pub _bitfield: u16,
// }

public const val `IPV6_FULL_TRAFFIC_CLASS_MASK`: UInt = 61455u;
public const val `IPV6_GET_IFLIST`: Int = 33;
public const val `IPV6_HDRINCL`: Int = 2;
// UNSUPPORTED Rust 2018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_HEADER {
//     pub Anonymous: IPV6_HEADER_0,
//     pub PayloadLength: u16,
//     pub NextHeader: u8,
//     pub HopLimit: u8,
//     pub SourceAddress: IN6_ADDR,
//     pub DestinationAddress: IN6_ADDR,
// }

// UNSUPPORTED Rust 2028:1: declaration Impl has no candidate rule
// impl Default for IPV6_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2033:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV6_HEADER_0 {
//     pub VersionClassFlow: u32,
//     pub Anonymous: IPV6_HEADER_0_0,
// }

// UNSUPPORTED Rust 2039:1: declaration Impl has no candidate rule
// impl Default for IPV6_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV6_HEADER_0_0 {
//     pub _bitfield: u32,
// }

public const val `IPV6_HOPLIMIT`: Int = 21;
public const val `IPV6_HOPOPTS`: Int = 1;
public const val `IPV6_IFLIST`: Int = 28;
public const val `IPV6_JOIN_GROUP`: Int = 12;
public const val `IPV6_LEAVE_GROUP`: Int = 13;
public const val `IPV6_MINIMUM_MTU`: UInt = 1280u;
// UNSUPPORTED Rust 2055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_MREQ {
//     pub ipv6mr_multiaddr: IN6_ADDR,
//     pub ipv6mr_interface: u32,
// }

// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule
// impl Default for IPV6_MREQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPV6_MTU`: Int = 72;
public const val `IPV6_MTU_DISCOVER`: Int = 71;
public const val `IPV6_MULTICAST_HOPS`: Int = 10;
public const val `IPV6_MULTICAST_IF`: Int = 9;
public const val `IPV6_MULTICAST_LOOP`: Int = 11;
// UNSUPPORTED Rust 2071:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS {
//     pub Anonymous: IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2077:1: declaration Impl has no candidate rule
// impl Default for IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2082:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0 {
//     pub _bitfield: u8,
//     pub Reserved2: [u8; 3],
// }

// UNSUPPORTED Rust 2088:1: declaration Impl has no candidate rule
// impl Default for IPV6_NEIGHBOR_ADVERTISEMENT_FLAGS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPV6_NRT_INTERFACE`: Int = 74;
// UNSUPPORTED Rust 2094:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV6_OPTION_HEADER {
//     pub Type: u8,
//     pub DataLength: u8,
// }

// UNSUPPORTED Rust 2100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_OPTION_JUMBOGRAM {
//     pub Header: IPV6_OPTION_HEADER,
//     pub JumbogramLength: [u8; 4],
// }

// UNSUPPORTED Rust 2106:1: declaration Impl has no candidate rule
// impl Default for IPV6_OPTION_JUMBOGRAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_OPTION_ROUTER_ALERT {
//     pub Header: IPV6_OPTION_HEADER,
//     pub Value: [u8; 2],
// }

// UNSUPPORTED Rust 2117:1: declaration Impl has no candidate rule
// impl Default for IPV6_OPTION_ROUTER_ALERT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IPV6_OPTION_TYPE` = Int;
public const val `IPV6_PKTINFO`: Int = 19;
public const val `IPV6_PKTINFO_EX`: Int = 51;
public const val `IPV6_PROTECTION_LEVEL`: Int = 23;
public const val `IPV6_RECVDSTADDR`: Int = 25;
public const val `IPV6_RECVECN`: Int = 50;
public const val `IPV6_RECVERR`: Int = 75;
public const val `IPV6_RECVIF`: Int = 24;
public const val `IPV6_RECVRTHDR`: Int = 38;
public const val `IPV6_RECVTCLASS`: Int = 40;
// UNSUPPORTED Rust 2132:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPV6_ROUTER_ADVERTISEMENT_FLAGS {
//     pub Anonymous: IPV6_ROUTER_ADVERTISEMENT_FLAGS_0,
//     pub Value: u8,
// }

// UNSUPPORTED Rust 2138:1: declaration Impl has no candidate rule
// impl Default for IPV6_ROUTER_ADVERTISEMENT_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPV6_ROUTER_ADVERTISEMENT_FLAGS_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2148:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPV6_ROUTING_HEADER {
//     pub NextHeader: u8,
//     pub Length: u8,
//     pub RoutingType: u8,
//     pub SegmentsLeft: u8,
//     pub Reserved: [u8; 4],
// }

// UNSUPPORTED Rust 2157:1: declaration Impl has no candidate rule
// impl Default for IPV6_ROUTING_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPV6_RTHDR`: Int = 32;
public const val `IPV6_TCLASS`: Int = 39;
public const val `IPV6_TRAFFIC_CLASS_MASK`: UInt = 49167u;
public const val `IPV6_UNICAST_HOPS`: Int = 4;
public const val `IPV6_UNICAST_IF`: Int = 31;
public const val `IPV6_USER_MTU`: Int = 76;
public const val `IPV6_V6ONLY`: Int = 27;
public const val `IPV6_VERSION`: UInt = 96u;
public const val `IPV6_WFP_REDIRECT_CONTEXT`: Int = 70;
public const val `IPV6_WFP_REDIRECT_RECORDS`: Int = 60;
public const val `IPX_ADDRESS`: Int = 16391;
// UNSUPPORTED Rust 2173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPX_ADDRESS_DATA {
//     pub adapternum: i32,
//     pub netnum: [u8; 4],
//     pub nodenum: [u8; 6],
//     pub wan: bool,
//     pub status: bool,
//     pub maxpkt: i32,
//     pub linkspeed: u32,
// }

// UNSUPPORTED Rust 2184:1: declaration Impl has no candidate rule
// impl Default for IPX_ADDRESS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPX_ADDRESS_NOTIFY`: Int = 16396;
public const val `IPX_DSTYPE`: Int = 16386;
public const val `IPX_EXTENDED_ADDRESS`: Int = 16388;
public const val `IPX_FILTERPTYPE`: Int = 16385;
public const val `IPX_GETNETINFO`: Int = 16392;
public const val `IPX_GETNETINFO_NORIP`: Int = 16393;
public const val `IPX_IMMEDIATESPXACK`: Int = 16400;
public const val `IPX_MAXSIZE`: Int = 16390;
public const val `IPX_MAX_ADAPTER_NUM`: Int = 16397;
// UNSUPPORTED Rust 2198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPX_NETNUM_DATA {
//     pub netnum: [u8; 4],
//     pub hopcount: u16,
//     pub netdelay: u16,
//     pub cardnum: i32,
//     pub router: [u8; 6],
// }

// UNSUPPORTED Rust 2207:1: declaration Impl has no candidate rule
// impl Default for IPX_NETNUM_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPX_PTYPE`: Int = 16384;
public const val `IPX_RECEIVE_BROADCAST`: Int = 16399;
public const val `IPX_RECVHDR`: Int = 16389;
public const val `IPX_RERIPNETNUMBER`: Int = 16398;
// UNSUPPORTED Rust 2216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPX_SPXCONNSTATUS_DATA {
//     pub ConnectionState: u8,
//     pub WatchDogActive: u8,
//     pub LocalConnectionId: u16,
//     pub RemoteConnectionId: u16,
//     pub LocalSequenceNumber: u16,
//     pub LocalAckNumber: u16,
//     pub LocalAllocNumber: u16,
//     pub RemoteAckNumber: u16,
//     pub RemoteAllocNumber: u16,
//     pub LocalSocket: u16,
//     pub ImmediateAddress: [u8; 6],
//     pub RemoteNetwork: [u8; 4],
//     pub RemoteNode: [u8; 6],
//     pub RemoteSocket: u16,
//     pub RetransmissionCount: u16,
//     pub EstimatedRoundTripDelay: u16,
//     pub RetransmittedPackets: u16,
//     pub SuppressedPacket: u16,
// }

// UNSUPPORTED Rust 2238:1: declaration Impl has no candidate rule
// impl Default for IPX_SPXCONNSTATUS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPX_SPXGETCONNECTIONSTATUS`: Int = 16395;
public const val `IPX_STOPFILTERPTYPE`: Int = 16387;
public const val `IP_ADD_IFLIST`: Int = 29;
public const val `IP_ADD_MEMBERSHIP`: Int = 12;
public const val `IP_ADD_SOURCE_MEMBERSHIP`: Int = 15;
public const val `IP_BLOCK_SOURCE`: Int = 17;
public const val `IP_DEFAULT_MULTICAST_LOOP`: UInt = 1u;
public const val `IP_DEFAULT_MULTICAST_TTL`: UInt = 1u;
public const val `IP_DEL_IFLIST`: Int = 30;
public const val `IP_DONTFRAGMENT`: Int = 14;
public const val `IP_DROP_MEMBERSHIP`: Int = 13;
public const val `IP_DROP_SOURCE_MEMBERSHIP`: Int = 16;
public const val `IP_ECN`: Int = 50;
public const val `IP_GET_IFLIST`: Int = 33;
public const val `IP_HDRINCL`: Int = 2;
public const val `IP_HOPLIMIT`: Int = 21;
public const val `IP_IFLIST`: Int = 28;
public const val `IP_MAX_MEMBERSHIPS`: UInt = 20u;
// UNSUPPORTED Rust 2261:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_MREQ {
//     pub imr_multiaddr: IN_ADDR,
//     pub imr_interface: IN_ADDR,
// }

// UNSUPPORTED Rust 2267:1: declaration Impl has no candidate rule
// impl Default for IP_MREQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2272:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_MREQ_SOURCE {
//     pub imr_multiaddr: IN_ADDR,
//     pub imr_sourceaddr: IN_ADDR,
//     pub imr_interface: IN_ADDR,
// }

// UNSUPPORTED Rust 2279:1: declaration Impl has no candidate rule
// impl Default for IP_MREQ_SOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_MSFILTER {
//     pub imsf_multiaddr: IN_ADDR,
//     pub imsf_interface: IN_ADDR,
//     pub imsf_fmode: MULTICAST_MODE_TYPE,
//     pub imsf_numsrc: u32,
//     pub imsf_slist: [IN_ADDR; 1],
// }

// UNSUPPORTED Rust 2293:1: declaration Impl has no candidate rule
// impl Default for IP_MSFILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_MTU`: Int = 73;
public const val `IP_MTU_DISCOVER`: Int = 71;
public const val `IP_MULTICAST_IF`: Int = 9;
public const val `IP_MULTICAST_LOOP`: Int = 11;
public const val `IP_MULTICAST_TTL`: Int = 10;
public const val `IP_NRT_INTERFACE`: Int = 74;
public const val `IP_OPTIONS`: Int = 1;
public const val `IP_OPTION_TIMESTAMP_ADDRESS`: `IP_OPTION_TIMESTAMP_FLAGS` = 1;
public typealias `IP_OPTION_TIMESTAMP_FLAGS` = Int;
public const val `IP_OPTION_TIMESTAMP_ONLY`: `IP_OPTION_TIMESTAMP_FLAGS` = 0;
public const val `IP_OPTION_TIMESTAMP_SPECIFIC_ADDRESS`: `IP_OPTION_TIMESTAMP_FLAGS` = 3;
public const val `IP_OPT_EOL`: `IPV4_OPTION_TYPE` = 0;
public const val `IP_OPT_LSRR`: `IPV4_OPTION_TYPE` = 131;
public const val `IP_OPT_MULTIDEST`: `IPV4_OPTION_TYPE` = 149;
public const val `IP_OPT_NOP`: `IPV4_OPTION_TYPE` = 1;
public const val `IP_OPT_ROUTER_ALERT`: `IPV4_OPTION_TYPE` = 148;
public const val `IP_OPT_RR`: `IPV4_OPTION_TYPE` = 7;
public const val `IP_OPT_SECURITY`: `IPV4_OPTION_TYPE` = 130;
public const val `IP_OPT_SID`: `IPV4_OPTION_TYPE` = 136;
public const val `IP_OPT_SSRR`: `IPV4_OPTION_TYPE` = 137;
public const val `IP_OPT_TS`: `IPV4_OPTION_TYPE` = 68;
public const val `IP_ORIGINAL_ARRIVAL_IF`: Int = 47;
public const val `IP_PKTINFO`: Int = 19;
public const val `IP_PKTINFO_EX`: Int = 51;
public const val `IP_PMTUDISC_DO`: `PMTUD_STATE` = 1;
public const val `IP_PMTUDISC_DONT`: `PMTUD_STATE` = 2;
public const val `IP_PMTUDISC_MAX`: `PMTUD_STATE` = 4;
public const val `IP_PMTUDISC_NOT_SET`: `PMTUD_STATE` = 0;
public const val `IP_PMTUDISC_PROBE`: `PMTUD_STATE` = 3;
public const val `IP_PROTECTION_LEVEL`: Int = 23;
public const val `IP_RECEIVE_BROADCAST`: Int = 22;
public const val `IP_RECVDSTADDR`: Int = 25;
public const val `IP_RECVECN`: Int = 50;
public const val `IP_RECVERR`: Int = 75;
public const val `IP_RECVIF`: Int = 24;
public const val `IP_RECVRTHDR`: Int = 38;
public const val `IP_RECVTCLASS`: Int = 40;
public const val `IP_RECVTOS`: Int = 40;
public const val `IP_RECVTTL`: Int = 21;
public const val `IP_RTHDR`: Int = 32;
public const val `IP_TCLASS`: Int = 39;
public const val `IP_TOS`: Int = 3;
public const val `IP_TTL`: Int = 4;
public const val `IP_UNBLOCK_SOURCE`: Int = 18;
public const val `IP_UNICAST_IF`: Int = 31;
public const val `IP_UNSPECIFIED_HOP_LIMIT`: Int = -1;
public const val `IP_UNSPECIFIED_TYPE_OF_SERVICE`: Int = -1;
public const val `IP_UNSPECIFIED_USER_MTU`: UInt = 4294967295u;
public const val `IP_USER_MTU`: Int = 76;
public const val `IP_VER_MASK`: UInt = 240u;
public const val `IP_WFP_REDIRECT_CONTEXT`: Int = 70;
public const val `IP_WFP_REDIRECT_RECORDS`: Int = 60;
public const val `IRDA_PROTO_SOCK_STREAM`: UInt = 1u;
public const val `IRLMP_9WIRE_MODE`: Int = 22;
public const val `IRLMP_DISCOVERY_MODE`: Int = 25;
public const val `IRLMP_ENUMDEVICES`: Int = 16;
public const val `IRLMP_EXCLUSIVE_MODE`: Int = 20;
public const val `IRLMP_IAS_QUERY`: Int = 18;
public const val `IRLMP_IAS_SET`: Int = 17;
public const val `IRLMP_IRLPT_MODE`: Int = 21;
public const val `IRLMP_PARAMETERS`: Int = 24;
public const val `IRLMP_SEND_PDU_LEN`: Int = 19;
public const val `IRLMP_SHARP_MODE`: Int = 32;
public const val `IRLMP_TINYTP_MODE`: Int = 23;
public const val `ISOPROTO_CLNP`: UInt = 31u;
public const val `ISOPROTO_CLTP`: UInt = 30u;
public const val `ISOPROTO_ESIS`: UInt = 34u;
public const val `ISOPROTO_INACT_NL`: UInt = 33u;
public const val `ISOPROTO_INTRAISIS`: UInt = 35u;
public const val `ISOPROTO_TP`: UInt = 29u;
public const val `ISOPROTO_TP0`: UInt = 25u;
public const val `ISOPROTO_TP1`: UInt = 26u;
public const val `ISOPROTO_TP2`: UInt = 27u;
public const val `ISOPROTO_TP3`: UInt = 28u;
public const val `ISOPROTO_TP4`: UInt = 29u;
public const val `ISOPROTO_X25`: UInt = 32u;
public const val `ISO_EXP_DATA_NUSE`: UInt = 1u;
public const val `ISO_EXP_DATA_USE`: UInt = 0u;
public const val `ISO_HIERARCHICAL`: UInt = 0u;
public const val `ISO_MAX_ADDR_LENGTH`: UInt = 64u;
public const val `ISO_NON_HIERARCHICAL`: UInt = 1u;
public const val `IpDadStateDeprecated`: `NL_DAD_STATE` = 3;
public const val `IpDadStateDuplicate`: `NL_DAD_STATE` = 2;
public const val `IpDadStateInvalid`: `NL_DAD_STATE` = 0;
public const val `IpDadStatePreferred`: `NL_DAD_STATE` = 4;
public const val `IpDadStateTentative`: `NL_DAD_STATE` = 1;
public const val `IpPrefixOriginDhcp`: `NL_PREFIX_ORIGIN` = 3;
public const val `IpPrefixOriginManual`: `NL_PREFIX_ORIGIN` = 1;
public const val `IpPrefixOriginOther`: `NL_PREFIX_ORIGIN` = 0;
public const val `IpPrefixOriginRouterAdvertisement`: `NL_PREFIX_ORIGIN` = 4;
public const val `IpPrefixOriginUnchanged`: `NL_PREFIX_ORIGIN` = 16;
public const val `IpPrefixOriginWellKnown`: `NL_PREFIX_ORIGIN` = 2;
public const val `IpSuffixOriginDhcp`: `NL_SUFFIX_ORIGIN` = 3;
public const val `IpSuffixOriginLinkLayerAddress`: `NL_SUFFIX_ORIGIN` = 4;
public const val `IpSuffixOriginManual`: `NL_SUFFIX_ORIGIN` = 1;
public const val `IpSuffixOriginOther`: `NL_SUFFIX_ORIGIN` = 0;
public const val `IpSuffixOriginRandom`: `NL_SUFFIX_ORIGIN` = 5;
public const val `IpSuffixOriginUnchanged`: `NL_SUFFIX_ORIGIN` = 16;
public const val `IpSuffixOriginWellKnown`: `NL_SUFFIX_ORIGIN` = 2;
public const val `JL_BOTH`: UInt = 4u;
public const val `JL_RECEIVER_ONLY`: UInt = 2u;
public const val `JL_SENDER_ONLY`: UInt = 1u;
public const val `LAYERED_PROTOCOL`: UInt = 0u;
// UNSUPPORTED Rust 2401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LINGER {
//     pub l_onoff: u16,
//     pub l_linger: u16,
// }

public const val `LITTLEENDIAN`: UInt = 1u;
public const val `LM_BAUD_115200`: UInt = 115200u;
public const val `LM_BAUD_1152K`: UInt = 1152000u;
public const val `LM_BAUD_1200`: UInt = 1200u;
public const val `LM_BAUD_16M`: UInt = 16000000u;
public const val `LM_BAUD_19200`: UInt = 19200u;
public const val `LM_BAUD_2400`: UInt = 2400u;
public const val `LM_BAUD_38400`: UInt = 38400u;
public const val `LM_BAUD_4M`: UInt = 4000000u;
public const val `LM_BAUD_57600`: UInt = 57600u;
public const val `LM_BAUD_576K`: UInt = 576000u;
public const val `LM_BAUD_9600`: UInt = 9600u;
public const val `LM_HB1_Computer`: Int = 4;
public const val `LM_HB1_Fax`: Int = 32;
public const val `LM_HB1_LANAccess`: Int = 64;
public const val `LM_HB1_Modem`: Int = 16;
public const val `LM_HB1_PDA_Palmtop`: Int = 2;
public const val `LM_HB1_PnP`: Int = 1;
public const val `LM_HB1_Printer`: Int = 8;
public const val `LM_HB2_FileServer`: Int = 2;
public const val `LM_HB2_Telephony`: Int = 1;
public const val `LM_HB_Extension`: Int = 128;
// UNSUPPORTED Rust 2429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LM_IRPARMS {
//     pub nTXDataBytes: u32,
//     pub nRXDataBytes: u32,
//     pub nBaudRate: u32,
//     pub thresholdTime: u32,
//     pub discTime: u32,
//     pub nMSLinkTurn: u16,
//     pub nTXPackets: u8,
//     pub nRXPackets: u8,
// }

public const val `LOG2_BITS_PER_BYTE`: UInt = 3u;
// UNSUPPORTED Rust 2442:1: generic scalar type unsupported
// pub type LPBLOCKINGCALLBACK = Option<unsafe extern "system" fn(dwcontext: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2443:1: generic scalar type unsupported
// pub type LPCONDITIONPROC = Option<unsafe extern "system" fn(lpcallerid: *mut WSABUF, lpcallerdata: *mut WSABUF, lpsqos: *mut QOS, lpgqos: *mut QOS, lpcalleeid: *mut WSABUF, lpcalleedata: *mut WSABUF, g: *mut u32, dwcallbackdata: usize) -> i32>;

// UNSUPPORTED Rust 2444:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_ACCEPTEX = Option<unsafe extern "system" fn(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: *mut core::ffi::c_void, dwreceivedatalength: u32, dwlocaladdresslength: u32, dwremoteaddresslength: u32, lpdwbytesreceived: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2446:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_CONNECTEX = Option<unsafe extern "system" fn(s: SOCKET, name: *const SOCKADDR, namelen: i32, lpsendbuffer: *const core::ffi::c_void, dwsenddatalength: u32, lpdwbytessent: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2448:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_DISCONNECTEX = Option<unsafe extern "system" fn(s: SOCKET, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, dwflags: u32, dwreserved: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2450:1: generic scalar type unsupported
// pub type LPFN_GETACCEPTEXSOCKADDRS = Option<unsafe extern "system" fn(lpoutputbuffer: *const core::ffi::c_void, dwreceivedatalength: u32, dwlocaladdresslength: u32, dwremoteaddresslength: u32, localsockaddr: *mut *mut SOCKADDR, localsockaddrlength: *mut i32, remotesockaddr: *mut *mut SOCKADDR, remotesockaddrlength: *mut i32)>;

// UNSUPPORTED Rust 2451:1: generic scalar type unsupported
// pub type LPFN_NSPAPI = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 2452:1: generic scalar type unsupported
// pub type LPFN_RIOCLOSECOMPLETIONQUEUE = Option<unsafe extern "system" fn(cq: RIO_CQ)>;

// UNSUPPORTED Rust 2453:1: generic scalar type unsupported
// pub type LPFN_RIOCREATECOMPLETIONQUEUE = Option<unsafe extern "system" fn(queuesize: u32, notificationcompletion: *const RIO_NOTIFICATION_COMPLETION) -> RIO_CQ>;

// UNSUPPORTED Rust 2454:1: generic scalar type unsupported
// pub type LPFN_RIOCREATEREQUESTQUEUE = Option<unsafe extern "system" fn(socket: SOCKET, maxoutstandingreceive: u32, maxreceivedatabuffers: u32, maxoutstandingsend: u32, maxsenddatabuffers: u32, receivecq: RIO_CQ, sendcq: RIO_CQ, socketcontext: *const core::ffi::c_void) -> RIO_RQ>;

// UNSUPPORTED Rust 2455:1: generic scalar type unsupported
// pub type LPFN_RIODEQUEUECOMPLETION = Option<unsafe extern "system" fn(cq: RIO_CQ, array: *mut RIORESULT, arraysize: u32) -> u32>;

// UNSUPPORTED Rust 2456:1: generic scalar type unsupported
// pub type LPFN_RIODEREGISTERBUFFER = Option<unsafe extern "system" fn(bufferid: RIO_BUFFERID)>;

// UNSUPPORTED Rust 2457:1: generic scalar type unsupported
// pub type LPFN_RIONOTIFY = Option<unsafe extern "system" fn(cq: RIO_CQ) -> i32>;

// UNSUPPORTED Rust 2458:1: generic scalar type unsupported
// pub type LPFN_RIORECEIVE = Option<unsafe extern "system" fn(socketqueue: RIO_RQ, pdata: *const RIO_BUF, databuffercount: u32, flags: u32, requestcontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2459:1: generic scalar type unsupported
// pub type LPFN_RIORECEIVEEX = Option<unsafe extern "system" fn(socketqueue: RIO_RQ, pdata: *const RIO_BUF, databuffercount: u32, plocaladdress: *const RIO_BUF, premoteaddress: *const RIO_BUF, pcontrolcontext: *const RIO_BUF, pflags: *const RIO_BUF, flags: u32, requestcontext: *const core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 2460:1: generic scalar type unsupported
// pub type LPFN_RIOREGISTERBUFFER = Option<unsafe extern "system" fn(databuffer: windows_sys::core::PCSTR, datalength: u32) -> RIO_BUFFERID>;

// UNSUPPORTED Rust 2461:1: generic scalar type unsupported
// pub type LPFN_RIORESIZECOMPLETIONQUEUE = Option<unsafe extern "system" fn(cq: RIO_CQ, queuesize: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2462:1: generic scalar type unsupported
// pub type LPFN_RIORESIZEREQUESTQUEUE = Option<unsafe extern "system" fn(rq: RIO_RQ, maxoutstandingreceive: u32, maxoutstandingsend: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2463:1: generic scalar type unsupported
// pub type LPFN_RIOSEND = Option<unsafe extern "system" fn(socketqueue: RIO_RQ, pdata: *const RIO_BUF, databuffercount: u32, flags: u32, requestcontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2464:1: generic scalar type unsupported
// pub type LPFN_RIOSENDEX = Option<unsafe extern "system" fn(socketqueue: RIO_RQ, pdata: *const RIO_BUF, databuffercount: u32, plocaladdress: *const RIO_BUF, premoteaddress: *const RIO_BUF, pcontrolcontext: *const RIO_BUF, pflags: *const RIO_BUF, flags: u32, requestcontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2465:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_TRANSMITFILE = Option<unsafe extern "system" fn(hsocket: SOCKET, hfile: super::super::Foundation::HANDLE, nnumberofbytestowrite: u32, nnumberofbytespersend: u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lptransmitbuffers: *const TRANSMIT_FILE_BUFFERS, dwreserved: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2467:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_TRANSMITPACKETS = Option<unsafe extern "system" fn(hsocket: SOCKET, lppacketarray: *const TRANSMIT_PACKETS_ELEMENT, nelementcount: u32, nsendsize: u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2469:1: generic scalar type unsupported
// pub type LPFN_WSAPOLL = Option<unsafe extern "system" fn(fdarray: *mut WSAPOLLFD, nfds: u32, timeout: i32) -> i32>;

// UNSUPPORTED Rust 2470:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_WSARECVMSG = Option<unsafe extern "system" fn(s: SOCKET, lpmsg: *mut WSAMSG, lpdwnumberofbytesrecvd: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32>;

// UNSUPPORTED Rust 2472:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFN_WSASENDMSG = Option<unsafe extern "system" fn(s: SOCKET, lpmsg: *const WSAMSG, dwflags: u32, lpnumberofbytessent: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE) -> i32>;

// UNSUPPORTED Rust 2474:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPLOOKUPSERVICE_COMPLETION_ROUTINE = Option<unsafe extern "system" fn(dwerror: u32, dwbytes: u32, lpoverlapped: *const super::super::System::IO::OVERLAPPED)>;

// UNSUPPORTED Rust 2476:1: generic scalar type unsupported
// pub type LPNSPCLEANUP = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID) -> i32>;

// UNSUPPORTED Rust 2477:1: generic scalar type unsupported
// pub type LPNSPGETSERVICECLASSINFO = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpdwbufsize: *const u32, lpserviceclassinfo: *const WSASERVICECLASSINFOW) -> i32>;

// UNSUPPORTED Rust 2478:1: generic scalar type unsupported
// pub type LPNSPINSTALLSERVICECLASS = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpserviceclassinfo: *const WSASERVICECLASSINFOW) -> i32>;

// UNSUPPORTED Rust 2479:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPNSPIOCTL = Option<unsafe extern "system" fn(hlookup: super::super::Foundation::HANDLE, dwcontrolcode: u32, lpvinbuffer: *const core::ffi::c_void, cbinbuffer: u32, lpvoutbuffer: *mut core::ffi::c_void, cboutbuffer: u32, lpcbbytesreturned: *mut u32, lpcompletion: *const WSACOMPLETION, lpthreadid: *const WSATHREADID) -> i32>;

// UNSUPPORTED Rust 2481:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNSPLOOKUPSERVICEBEGIN = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpqsrestrictions: *const WSAQUERYSETW, lpserviceclassinfo: *const WSASERVICECLASSINFOW, dwcontrolflags: u32, lphlookup: *mut super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2483:1: generic scalar type unsupported
// pub type LPNSPLOOKUPSERVICEEND = Option<unsafe extern "system" fn(hlookup: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2484:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNSPLOOKUPSERVICENEXT = Option<unsafe extern "system" fn(hlookup: super::super::Foundation::HANDLE, dwcontrolflags: u32, lpdwbufferlength: *mut u32, lpqsresults: *mut WSAQUERYSETW) -> i32>;

// UNSUPPORTED Rust 2486:1: generic scalar type unsupported
// pub type LPNSPREMOVESERVICECLASS = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpserviceclassid: *const windows_sys::core::GUID) -> i32>;

// UNSUPPORTED Rust 2487:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNSPSETSERVICE = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpserviceclassinfo: *const WSASERVICECLASSINFOW, lpqsreginfo: *const WSAQUERYSETW, essoperation: WSAESETSERVICEOP, dwcontrolflags: u32) -> i32>;

// UNSUPPORTED Rust 2489:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_IO"))]
// pub type LPNSPSTARTUP = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpnsproutines: *mut NSP_ROUTINE) -> i32>;

// UNSUPPORTED Rust 2491:1: generic scalar type unsupported
// pub type LPNSPV2CLEANUP = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, pvclientsessionarg: *const core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 2492:1: generic scalar type unsupported
// pub type LPNSPV2CLIENTSESSIONRUNDOWN = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, pvclientsessionarg: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2493:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNSPV2LOOKUPSERVICEBEGIN = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpqsrestrictions: *const WSAQUERYSET2W, dwcontrolflags: u32, lpvclientsessionarg: *const core::ffi::c_void, lphlookup: *mut super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2495:1: generic scalar type unsupported
// pub type LPNSPV2LOOKUPSERVICEEND = Option<unsafe extern "system" fn(hlookup: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2496:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNSPV2LOOKUPSERVICENEXTEX = Option<unsafe extern "system" fn(hasynccall: super::super::Foundation::HANDLE, hlookup: super::super::Foundation::HANDLE, dwcontrolflags: u32, lpdwbufferlength: *const u32, lpqsresults: *mut WSAQUERYSET2W)>;

// UNSUPPORTED Rust 2498:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNSPV2SETSERVICEEX = Option<unsafe extern "system" fn(hasynccall: super::super::Foundation::HANDLE, lpproviderid: *const windows_sys::core::GUID, lpqsreginfo: *const WSAQUERYSET2W, essoperation: WSAESETSERVICEOP, dwcontrolflags: u32, lpvclientsessionarg: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 2500:1: generic scalar type unsupported
// pub type LPNSPV2STARTUP = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, ppvclientsessionarg: *mut *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 2501:1: generic scalar type unsupported
// pub type LPSERVICE_CALLBACK_PROC = Option<unsafe extern "system" fn(lparam: super::super::Foundation::LPARAM, hasynctaskhandle: super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 2502:1: generic scalar type unsupported
// pub type LPWPUCLOSEEVENT = Option<unsafe extern "system" fn(hevent: WSAEVENT, lperrno: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2503:1: generic scalar type unsupported
// pub type LPWPUCLOSESOCKETHANDLE = Option<unsafe extern "system" fn(s: SOCKET, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2504:1: generic scalar type unsupported
// pub type LPWPUCLOSETHREAD = Option<unsafe extern "system" fn(lpthreadid: *const WSATHREADID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2505:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWPUCOMPLETEOVERLAPPEDREQUEST = Option<unsafe extern "system" fn(s: SOCKET, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, dwerror: u32, cbtransferred: u32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2507:1: generic scalar type unsupported
// pub type LPWPUCREATEEVENT = Option<unsafe extern "system" fn(lperrno: *mut i32) -> WSAEVENT>;

// UNSUPPORTED Rust 2508:1: generic scalar type unsupported
// pub type LPWPUCREATESOCKETHANDLE = Option<unsafe extern "system" fn(dwcatalogentryid: u32, dwcontext: usize, lperrno: *mut i32) -> SOCKET>;

// UNSUPPORTED Rust 2509:1: generic scalar type unsupported
// pub type LPWPUFDISSET = Option<unsafe extern "system" fn(s: SOCKET, fdset: *const FD_SET) -> i32>;

// UNSUPPORTED Rust 2510:1: generic scalar type unsupported
// pub type LPWPUGETPROVIDERPATH = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpszproviderdllpath: windows_sys::core::PWSTR, lpproviderdllpathlen: *mut i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2511:1: generic scalar type unsupported
// pub type LPWPUMODIFYIFSHANDLE = Option<unsafe extern "system" fn(dwcatalogentryid: u32, proposedhandle: SOCKET, lperrno: *mut i32) -> SOCKET>;

// UNSUPPORTED Rust 2512:1: generic scalar type unsupported
// pub type LPWPUOPENCURRENTTHREAD = Option<unsafe extern "system" fn(lpthreadid: *mut WSATHREADID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2513:1: generic scalar type unsupported
// pub type LPWPUPOSTMESSAGE = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, msg: u32, wparam: super::super::Foundation::WPARAM, lparam: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2514:1: generic scalar type unsupported
// pub type LPWPUQUERYBLOCKINGCALLBACK = Option<unsafe extern "system" fn(dwcatalogentryid: u32, lplpfncallback: *mut LPBLOCKINGCALLBACK, lpdwcontext: *mut usize, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2515:1: generic scalar type unsupported
// pub type LPWPUQUERYSOCKETHANDLECONTEXT = Option<unsafe extern "system" fn(s: SOCKET, lpcontext: *mut usize, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2516:1: generic scalar type unsupported
// pub type LPWPUQUEUEAPC = Option<unsafe extern "system" fn(lpthreadid: *const WSATHREADID, lpfnuserapc: LPWSAUSERAPC, dwcontext: usize, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2517:1: generic scalar type unsupported
// pub type LPWPURESETEVENT = Option<unsafe extern "system" fn(hevent: WSAEVENT, lperrno: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2518:1: generic scalar type unsupported
// pub type LPWPUSETEVENT = Option<unsafe extern "system" fn(hevent: WSAEVENT, lperrno: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2519:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSAOVERLAPPED_COMPLETION_ROUTINE = Option<unsafe extern "system" fn(dwerror: u32, cbtransferred: u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, dwflags: u32)>;

// UNSUPPORTED Rust 2521:1: generic scalar type unsupported
// pub type LPWSAUSERAPC = Option<unsafe extern "system" fn(dwcontext: usize)>;

// UNSUPPORTED Rust 2522:1: generic scalar type unsupported
// pub type LPWSCDEINSTALLPROVIDER = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2523:1: generic scalar type unsupported
// pub type LPWSCENABLENSPROVIDER = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, fenable: windows_sys::core::BOOL) -> i32>;

// UNSUPPORTED Rust 2524:1: generic scalar type unsupported
// pub type LPWSCENUMPROTOCOLS = Option<unsafe extern "system" fn(lpiprotocols: *const i32, lpprotocolbuffer: *mut WSAPROTOCOL_INFOW, lpdwbufferlength: *mut u32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2525:1: generic scalar type unsupported
// pub type LPWSCGETPROVIDERPATH = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpszproviderdllpath: windows_sys::core::PWSTR, lpproviderdllpathlen: *mut i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2526:1: generic scalar type unsupported
// pub type LPWSCINSTALLNAMESPACE = Option<unsafe extern "system" fn(lpszidentifier: windows_sys::core::PCWSTR, lpszpathname: windows_sys::core::PCWSTR, dwnamespace: u32, dwversion: u32, lpproviderid: *const windows_sys::core::GUID) -> i32>;

// UNSUPPORTED Rust 2527:1: generic scalar type unsupported
// pub type LPWSCINSTALLPROVIDER = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpszproviderdllpath: windows_sys::core::PCWSTR, lpprotocolinfolist: *const WSAPROTOCOL_INFOW, dwnumberofentries: u32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2528:1: generic scalar type unsupported
// pub type LPWSCUNINSTALLNAMESPACE = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID) -> i32>;

// UNSUPPORTED Rust 2529:1: generic scalar type unsupported
// pub type LPWSCUPDATEPROVIDER = Option<unsafe extern "system" fn(lpproviderid: *const windows_sys::core::GUID, lpszproviderdllpath: windows_sys::core::PCWSTR, lpprotocolinfolist: *const WSAPROTOCOL_INFOW, dwnumberofentries: u32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2530:1: generic scalar type unsupported
// pub type LPWSCWRITENAMESPACEORDER = Option<unsafe extern "system" fn(lpproviderid: *mut windows_sys::core::GUID, dwnumberofentries: u32) -> i32>;

// UNSUPPORTED Rust 2531:1: generic scalar type unsupported
// pub type LPWSCWRITEPROVIDERORDER = Option<unsafe extern "system" fn(lpwdcatalogentryid: *mut u32, dwnumberofentries: u32) -> i32>;

// UNSUPPORTED Rust 2532:1: generic scalar type unsupported
// pub type LPWSPACCEPT = Option<unsafe extern "system" fn(s: SOCKET, addr: *mut SOCKADDR, addrlen: *mut i32, lpfncondition: LPCONDITIONPROC, dwcallbackdata: usize, lperrno: *mut i32) -> SOCKET>;

// UNSUPPORTED Rust 2533:1: generic scalar type unsupported
// pub type LPWSPADDRESSTOSTRING = Option<unsafe extern "system" fn(lpsaaddress: *const SOCKADDR, dwaddresslength: u32, lpprotocolinfo: *const WSAPROTOCOL_INFOW, lpszaddressstring: windows_sys::core::PWSTR, lpdwaddressstringlength: *mut u32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2534:1: generic scalar type unsupported
// pub type LPWSPASYNCSELECT = Option<unsafe extern "system" fn(s: SOCKET, hwnd: super::super::Foundation::HWND, wmsg: u32, levent: i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2535:1: generic scalar type unsupported
// pub type LPWSPBIND = Option<unsafe extern "system" fn(s: SOCKET, name: *const SOCKADDR, namelen: i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2536:1: generic scalar type unsupported
// pub type LPWSPCANCELBLOCKINGCALL = Option<unsafe extern "system" fn(lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2537:1: generic scalar type unsupported
// pub type LPWSPCLEANUP = Option<unsafe extern "system" fn(lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2538:1: generic scalar type unsupported
// pub type LPWSPCLOSESOCKET = Option<unsafe extern "system" fn(s: SOCKET, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2539:1: generic scalar type unsupported
// pub type LPWSPCONNECT = Option<unsafe extern "system" fn(s: SOCKET, name: *const SOCKADDR, namelen: i32, lpcallerdata: *const WSABUF, lpcalleedata: *mut WSABUF, lpsqos: *const QOS, lpgqos: *const QOS, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2540:1: generic scalar type unsupported
// pub type LPWSPDUPLICATESOCKET = Option<unsafe extern "system" fn(s: SOCKET, dwprocessid: u32, lpprotocolinfo: *mut WSAPROTOCOL_INFOW, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2541:1: generic scalar type unsupported
// pub type LPWSPENUMNETWORKEVENTS = Option<unsafe extern "system" fn(s: SOCKET, heventobject: super::super::Foundation::HANDLE, lpnetworkevents: *mut WSANETWORKEVENTS, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2542:1: generic scalar type unsupported
// pub type LPWSPEVENTSELECT = Option<unsafe extern "system" fn(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2543:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPGETOVERLAPPEDRESULT = Option<unsafe extern "system" fn(s: SOCKET, lpoverlapped: *const super::super::System::IO::OVERLAPPED, lpcbtransfer: *mut u32, fwait: windows_sys::core::BOOL, lpdwflags: *mut u32, lperrno: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2545:1: generic scalar type unsupported
// pub type LPWSPGETPEERNAME = Option<unsafe extern "system" fn(s: SOCKET, name: *mut SOCKADDR, namelen: *mut i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2546:1: generic scalar type unsupported
// pub type LPWSPGETQOSBYNAME = Option<unsafe extern "system" fn(s: SOCKET, lpqosname: *const WSABUF, lpqos: *mut QOS, lperrno: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2547:1: generic scalar type unsupported
// pub type LPWSPGETSOCKNAME = Option<unsafe extern "system" fn(s: SOCKET, name: *mut SOCKADDR, namelen: *mut i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2548:1: generic scalar type unsupported
// pub type LPWSPGETSOCKOPT = Option<unsafe extern "system" fn(s: SOCKET, level: i32, optname: i32, optval: windows_sys::core::PSTR, optlen: *mut i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2549:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPIOCTL = Option<unsafe extern "system" fn(s: SOCKET, dwiocontrolcode: u32, lpvinbuffer: *const core::ffi::c_void, cbinbuffer: u32, lpvoutbuffer: *mut core::ffi::c_void, cboutbuffer: u32, lpcbbytesreturned: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: *const WSATHREADID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2551:1: generic scalar type unsupported
// pub type LPWSPJOINLEAF = Option<unsafe extern "system" fn(s: SOCKET, name: *const SOCKADDR, namelen: i32, lpcallerdata: *const WSABUF, lpcalleedata: *mut WSABUF, lpsqos: *const QOS, lpgqos: *const QOS, dwflags: u32, lperrno: *mut i32) -> SOCKET>;

// UNSUPPORTED Rust 2552:1: generic scalar type unsupported
// pub type LPWSPLISTEN = Option<unsafe extern "system" fn(s: SOCKET, backlog: i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2553:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPRECV = Option<unsafe extern "system" fn(s: SOCKET, lpbuffers: *const WSABUF, dwbuffercount: u32, lpnumberofbytesrecvd: *mut u32, lpflags: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: *const WSATHREADID, lperrno: *const i32) -> i32>;

// UNSUPPORTED Rust 2555:1: generic scalar type unsupported
// pub type LPWSPRECVDISCONNECT = Option<unsafe extern "system" fn(s: SOCKET, lpinbounddisconnectdata: *const WSABUF, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2556:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPRECVFROM = Option<unsafe extern "system" fn(s: SOCKET, lpbuffers: *const WSABUF, dwbuffercount: u32, lpnumberofbytesrecvd: *mut u32, lpflags: *mut u32, lpfrom: *mut SOCKADDR, lpfromlen: *mut i32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: *const WSATHREADID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2558:1: generic scalar type unsupported
// pub type LPWSPSELECT = Option<unsafe extern "system" fn(nfds: i32, readfds: *mut FD_SET, writefds: *mut FD_SET, exceptfds: *mut FD_SET, timeout: *const TIMEVAL, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2559:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPSEND = Option<unsafe extern "system" fn(s: SOCKET, lpbuffers: *const WSABUF, dwbuffercount: u32, lpnumberofbytessent: *mut u32, dwflags: u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: *const WSATHREADID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2561:1: generic scalar type unsupported
// pub type LPWSPSENDDISCONNECT = Option<unsafe extern "system" fn(s: SOCKET, lpoutbounddisconnectdata: *const WSABUF, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2562:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPSENDTO = Option<unsafe extern "system" fn(s: SOCKET, lpbuffers: *const WSABUF, dwbuffercount: u32, lpnumberofbytessent: *mut u32, dwflags: u32, lpto: *const SOCKADDR, itolen: i32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE, lpthreadid: *const WSATHREADID, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2564:1: generic scalar type unsupported
// pub type LPWSPSETSOCKOPT = Option<unsafe extern "system" fn(s: SOCKET, level: i32, optname: i32, optval: windows_sys::core::PCSTR, optlen: i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2565:1: generic scalar type unsupported
// pub type LPWSPSHUTDOWN = Option<unsafe extern "system" fn(s: SOCKET, how: i32, lperrno: *mut i32) -> i32>;

// UNSUPPORTED Rust 2566:1: generic scalar type unsupported
// pub type LPWSPSOCKET = Option<unsafe extern "system" fn(af: i32, r#type: i32, protocol: i32, lpprotocolinfo: *const WSAPROTOCOL_INFOW, g: u32, dwflags: u32, lperrno: *mut i32) -> SOCKET>;

// UNSUPPORTED Rust 2567:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPWSPSTARTUP = Option<unsafe extern "system" fn(wversionrequested: u16, lpwspdata: *const WSPDATA, lpprotocolinfo: *const WSAPROTOCOL_INFOW, upcalltable: WSPUPCALLTABLE, lpproctable: *mut WSPPROC_TABLE) -> i32>;

// UNSUPPORTED Rust 2569:1: generic scalar type unsupported
// pub type LPWSPSTRINGTOADDRESS = Option<unsafe extern "system" fn(addressstring: windows_sys::core::PCWSTR, addressfamily: i32, lpprotocolinfo: *const WSAPROTOCOL_INFOW, lpaddress: *mut SOCKADDR, lpaddresslength: *mut i32, lperrno: *mut i32) -> i32>;

public const val `LSP_CRYPTO_COMPRESS`: UInt = 64u;
public const val `LSP_FIREWALL`: UInt = 8u;
public const val `LSP_INBOUND_MODIFY`: UInt = 16u;
public const val `LSP_INSPECTOR`: UInt = 1u;
public const val `LSP_LOCAL_CACHE`: UInt = 128u;
public const val `LSP_OUTBOUND_MODIFY`: UInt = 32u;
public const val `LSP_PROXY`: UInt = 4u;
public const val `LSP_REDIRECTOR`: UInt = 2u;
public const val `LSP_SYSTEM`: UInt = 2147483648u;
public const val `LUP_ADDRCONFIG`: UInt = 1048576u;
public const val `LUP_API_ANSI`: UInt = 16777216u;
public const val `LUP_CONTAINERS`: UInt = 2u;
public const val `LUP_DEEP`: UInt = 1u;
public const val `LUP_DISABLE_IDN_ENCODING`: UInt = 8388608u;
public const val `LUP_DNS_ONLY`: UInt = 131072u;
public const val `LUP_DUAL_ADDR`: UInt = 2097152u;
public const val `LUP_EXCLUSIVE_CUSTOM_SERVERS`: UInt = 134217728u;
public const val `LUP_EXTENDED_QUERYSET`: UInt = 33554432u;
public const val `LUP_FILESERVER`: UInt = 4194304u;
public const val `LUP_FLUSHCACHE`: UInt = 4096u;
public const val `LUP_FLUSHPREVIOUS`: UInt = 8192u;
public const val `LUP_FORCE_CLEAR_TEXT`: UInt = 1073741824u;
public const val `LUP_NEAREST`: UInt = 8u;
public const val `LUP_NOCONTAINERS`: UInt = 4u;
public const val `LUP_NON_AUTHORITATIVE`: UInt = 16384u;
public const val `LUP_REQUIRE_SECURE`: UInt = 268435456u;
public const val `LUP_RESOLUTION_HANDLE`: UInt = 2147483648u;
public const val `LUP_RES_SERVICE`: UInt = 32768u;
public const val `LUP_RETURN_ADDR`: UInt = 256u;
public const val `LUP_RETURN_ALIASES`: UInt = 1024u;
public const val `LUP_RETURN_ALL`: UInt = 4080u;
public const val `LUP_RETURN_BLOB`: UInt = 512u;
public const val `LUP_RETURN_COMMENT`: UInt = 128u;
public const val `LUP_RETURN_NAME`: UInt = 16u;
public const val `LUP_RETURN_PREFERRED_NAMES`: UInt = 65536u;
public const val `LUP_RETURN_QUERY_STRING`: UInt = 2048u;
public const val `LUP_RETURN_RESPONSE_FLAGS`: UInt = 262144u;
public const val `LUP_RETURN_TTL`: UInt = 536870912u;
public const val `LUP_RETURN_TYPE`: UInt = 32u;
public const val `LUP_RETURN_VERSION`: UInt = 64u;
public const val `LUP_SECURE`: UInt = 32768u;
public const val `LUP_SECURE_WITH_FALLBACK`: UInt = 67108864u;
public const val `LinkLocalAlwaysOff`: `NL_LINK_LOCAL_ADDRESS_BEHAVIOR` = 0;
public const val `LinkLocalAlwaysOn`: `NL_LINK_LOCAL_ADDRESS_BEHAVIOR` = 2;
public const val `LinkLocalDelayed`: `NL_LINK_LOCAL_ADDRESS_BEHAVIOR` = 1;
public const val `LinkLocalUnchanged`: `NL_LINK_LOCAL_ADDRESS_BEHAVIOR` = -1;
public const val `LmCharSetASCII`: UInt = 0u;
public const val `LmCharSetISO_8859_1`: UInt = 1u;
public const val `LmCharSetISO_8859_2`: UInt = 2u;
public const val `LmCharSetISO_8859_3`: UInt = 3u;
public const val `LmCharSetISO_8859_4`: UInt = 4u;
public const val `LmCharSetISO_8859_5`: UInt = 5u;
public const val `LmCharSetISO_8859_6`: UInt = 6u;
public const val `LmCharSetISO_8859_7`: UInt = 7u;
public const val `LmCharSetISO_8859_8`: UInt = 8u;
public const val `LmCharSetISO_8859_9`: UInt = 9u;
public const val `LmCharSetUNICODE`: UInt = 255u;
public const val `MAXGETHOSTSTRUCT`: UInt = 1024u;
public const val `MAX_IPV4_HLEN`: UInt = 60u;
public const val `MAX_IPV4_PACKET`: UInt = 65535u;
public const val `MAX_IPV6_PAYLOAD`: UInt = 65535u;
public const val `MAX_MCAST_TTL`: UInt = 255u;
public const val `MAX_PROTOCOL_CHAIN`: UInt = 7u;
public const val `MAX_WINDOW_INCREMENT_PERCENTAGE`: UInt = 25u;
public const val `MCAST_BLOCK_SOURCE`: UInt = 43u;
public const val `MCAST_EXCLUDE`: `MULTICAST_MODE_TYPE` = 1;
public const val `MCAST_INCLUDE`: `MULTICAST_MODE_TYPE` = 0;
public const val `MCAST_JOIN_GROUP`: UInt = 41u;
public const val `MCAST_JOIN_SOURCE_GROUP`: UInt = 45u;
public const val `MCAST_LEAVE_GROUP`: UInt = 42u;
public const val `MCAST_LEAVE_SOURCE_GROUP`: UInt = 46u;
public const val `MCAST_UNBLOCK_SOURCE`: UInt = 44u;
public const val `MIB_IPPROTO_BBN`: `NL_ROUTE_PROTOCOL` = 12;
public const val `MIB_IPPROTO_BGP`: `NL_ROUTE_PROTOCOL` = 14;
public const val `MIB_IPPROTO_CISCO`: `NL_ROUTE_PROTOCOL` = 11;
public const val `MIB_IPPROTO_DHCP`: `NL_ROUTE_PROTOCOL` = 19;
public const val `MIB_IPPROTO_DVMRP`: `NL_ROUTE_PROTOCOL` = 17;
public const val `MIB_IPPROTO_EGP`: `NL_ROUTE_PROTOCOL` = 5;
public const val `MIB_IPPROTO_EIGRP`: `NL_ROUTE_PROTOCOL` = 16;
public const val `MIB_IPPROTO_ES_IS`: `NL_ROUTE_PROTOCOL` = 10;
public const val `MIB_IPPROTO_GGP`: `NL_ROUTE_PROTOCOL` = 6;
public const val `MIB_IPPROTO_HELLO`: `NL_ROUTE_PROTOCOL` = 7;
public const val `MIB_IPPROTO_ICMP`: `NL_ROUTE_PROTOCOL` = 4;
public const val `MIB_IPPROTO_IDPR`: `NL_ROUTE_PROTOCOL` = 15;
public const val `MIB_IPPROTO_IS_IS`: `NL_ROUTE_PROTOCOL` = 9;
public const val `MIB_IPPROTO_LOCAL`: `NL_ROUTE_PROTOCOL` = 2;
public const val `MIB_IPPROTO_NETMGMT`: `NL_ROUTE_PROTOCOL` = 3;
public const val `MIB_IPPROTO_NT_AUTOSTATIC`: `NL_ROUTE_PROTOCOL` = 10002;
public const val `MIB_IPPROTO_NT_STATIC`: `NL_ROUTE_PROTOCOL` = 10006;
public const val `MIB_IPPROTO_NT_STATIC_NON_DOD`: `NL_ROUTE_PROTOCOL` = 10007;
public const val `MIB_IPPROTO_OSPF`: `NL_ROUTE_PROTOCOL` = 13;
public const val `MIB_IPPROTO_OTHER`: `NL_ROUTE_PROTOCOL` = 1;
public const val `MIB_IPPROTO_RIP`: `NL_ROUTE_PROTOCOL` = 8;
public const val `MIB_IPPROTO_RPL`: `NL_ROUTE_PROTOCOL` = 18;
public const val `MIT_GUID`: `NPI_MODULEID_TYPE` = 1;
public const val `MIT_IF_LUID`: `NPI_MODULEID_TYPE` = 2;
// UNSUPPORTED Rust 2666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MLDV2_QUERY_HEADER {
//     pub IcmpHeader: ICMP_HEADER,
//     pub Anonymous1: MLDV2_QUERY_HEADER_0,
//     pub Reserved: u16,
//     pub MulticastAddress: IN6_ADDR,
//     pub _bitfield: u8,
//     pub Anonymous2: MLDV2_QUERY_HEADER_1,
//     pub SourceCount: u16,
// }

// UNSUPPORTED Rust 2677:1: declaration Impl has no candidate rule
// impl Default for MLDV2_QUERY_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2682:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MLDV2_QUERY_HEADER_0 {
//     pub MaxRespCode: u16,
//     pub Anonymous: MLDV2_QUERY_HEADER_0_0,
// }

// UNSUPPORTED Rust 2688:1: declaration Impl has no candidate rule
// impl Default for MLDV2_QUERY_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MLDV2_QUERY_HEADER_0_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 2698:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MLDV2_QUERY_HEADER_1 {
//     pub QueriersQueryInterfaceCode: u8,
//     pub Anonymous: MLDV2_QUERY_HEADER_1_0,
// }

// UNSUPPORTED Rust 2704:1: declaration Impl has no candidate rule
// impl Default for MLDV2_QUERY_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MLDV2_QUERY_HEADER_1_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2714:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MLDV2_REPORT_HEADER {
//     pub IcmpHeader: ICMP_HEADER,
//     pub Reserved: u16,
//     pub RecordCount: u16,
// }

// UNSUPPORTED Rust 2721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MLDV2_REPORT_RECORD_HEADER {
//     pub Type: u8,
//     pub AuxillaryDataLength: u8,
//     pub SourceCount: u16,
//     pub MulticastAddress: IN6_ADDR,
// }

// UNSUPPORTED Rust 2729:1: declaration Impl has no candidate rule
// impl Default for MLDV2_REPORT_RECORD_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2734:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MLD_HEADER {
//     pub IcmpHeader: ICMP_HEADER,
//     pub MaxRespTime: u16,
//     pub Reserved: u16,
//     pub MulticastAddress: IN6_ADDR,
// }

// UNSUPPORTED Rust 2742:1: declaration Impl has no candidate rule
// impl Default for MLD_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MLD_MAX_RESP_CODE_TYPE` = Int;
public const val `MLD_MAX_RESP_CODE_TYPE_FLOAT`: `MLD_MAX_RESP_CODE_TYPE` = 1;
public const val `MLD_MAX_RESP_CODE_TYPE_NORMAL`: `MLD_MAX_RESP_CODE_TYPE` = 0;
public const val `MSG_BCAST`: UInt = 1024u;
public const val `MSG_CTRUNC`: UInt = 512u;
public const val `MSG_DONTROUTE`: `SEND_RECV_FLAGS` = 4;
public const val `MSG_ERRQUEUE`: UInt = 4096u;
public const val `MSG_INTERRUPT`: UInt = 16u;
public const val `MSG_MAXIOVLEN`: UInt = 16u;
public const val `MSG_MCAST`: UInt = 2048u;
public const val `MSG_OOB`: `SEND_RECV_FLAGS` = 1;
public const val `MSG_PARTIAL`: UInt = 32768u;
public const val `MSG_PEEK`: `SEND_RECV_FLAGS` = 2;
public const val `MSG_PUSH_IMMEDIATE`: `SEND_RECV_FLAGS` = 32;
public const val `MSG_TRUNC`: UInt = 256u;
public const val `MSG_WAITALL`: `SEND_RECV_FLAGS` = 8;
public typealias `MULTICAST_MODE_TYPE` = Int;
// UNSUPPORTED Rust 2764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NAPI_DOMAIN_DESCRIPTION_BLOB {
//     pub AuthLevel: u32,
//     pub cchDomainName: u32,
//     pub OffsetNextDomainDescription: u32,
//     pub OffsetThisDomainName: u32,
// }

// UNSUPPORTED Rust 2772:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NAPI_PROVIDER_INSTALLATION_BLOB {
//     pub dwVersion: u32,
//     pub dwProviderType: u32,
//     pub fSupportsWildCard: u32,
//     pub cDomains: u32,
//     pub OffsetFirstDomain: u32,
// }

public typealias `NAPI_PROVIDER_LEVEL` = Int;
public typealias `NAPI_PROVIDER_TYPE` = Int;
public const val `ND_NA_FLAG_OVERRIDE`: UInt = 536870912u;
public const val `ND_NA_FLAG_ROUTER`: UInt = 2147483648u;
public const val `ND_NA_FLAG_SOLICITED`: UInt = 1073741824u;
// UNSUPPORTED Rust 2786:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_NEIGHBOR_ADVERT_HEADER {
//     pub nd_na_hdr: ICMP_MESSAGE,
//     pub nd_na_target: IN6_ADDR,
// }

// UNSUPPORTED Rust 2792:1: declaration Impl has no candidate rule
// impl Default for ND_NEIGHBOR_ADVERT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2797:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_NEIGHBOR_SOLICIT_HEADER {
//     pub nd_ns_hdr: ICMP_MESSAGE,
//     pub nd_ns_target: IN6_ADDR,
// }

// UNSUPPORTED Rust 2803:1: declaration Impl has no candidate rule
// impl Default for ND_NEIGHBOR_SOLICIT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_DNSSL {
//     pub nd_opt_dnssl_type: u8,
//     pub nd_opt_dnssl_len: u8,
//     pub nd_opt_dnssl_reserved: u16,
//     pub nd_opt_dnssl_lifetime: u32,
// }

// UNSUPPORTED Rust 2816:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_HDR {
//     pub nd_opt_type: u8,
//     pub nd_opt_len: u8,
// }

// UNSUPPORTED Rust 2822:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_MTU {
//     pub nd_opt_mtu_type: u8,
//     pub nd_opt_mtu_len: u8,
//     pub nd_opt_mtu_reserved: u16,
//     pub nd_opt_mtu_mtu: u32,
// }

// UNSUPPORTED Rust 2830:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_OPTION_PREFIX_INFO {
//     pub nd_opt_pi_type: u8,
//     pub nd_opt_pi_len: u8,
//     pub nd_opt_pi_prefix_len: u8,
//     pub Anonymous1: ND_OPTION_PREFIX_INFO_0,
//     pub nd_opt_pi_valid_time: u32,
//     pub nd_opt_pi_preferred_time: u32,
//     pub Anonymous2: ND_OPTION_PREFIX_INFO_1,
//     pub nd_opt_pi_prefix: IN6_ADDR,
// }

// UNSUPPORTED Rust 2842:1: declaration Impl has no candidate rule
// impl Default for ND_OPTION_PREFIX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2847:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ND_OPTION_PREFIX_INFO_0 {
//     pub nd_opt_pi_flags_reserved: u8,
//     pub Flags: ND_OPTION_PREFIX_INFO_0_0,
// }

// UNSUPPORTED Rust 2853:1: declaration Impl has no candidate rule
// impl Default for ND_OPTION_PREFIX_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2858:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_PREFIX_INFO_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2863:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ND_OPTION_PREFIX_INFO_1 {
//     pub nd_opt_pi_reserved2: u32,
//     pub Anonymous: ND_OPTION_PREFIX_INFO_1_0,
// }

// UNSUPPORTED Rust 2869:1: declaration Impl has no candidate rule
// impl Default for ND_OPTION_PREFIX_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2874:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_OPTION_PREFIX_INFO_1_0 {
//     pub nd_opt_pi_reserved3: [u8; 3],
//     pub nd_opt_pi_site_prefix_len: u8,
// }

// UNSUPPORTED Rust 2880:1: declaration Impl has no candidate rule
// impl Default for ND_OPTION_PREFIX_INFO_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2885:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_RDNSS {
//     pub nd_opt_rdnss_type: u8,
//     pub nd_opt_rdnss_len: u8,
//     pub nd_opt_rdnss_reserved: u16,
//     pub nd_opt_rdnss_lifetime: u32,
// }

// UNSUPPORTED Rust 2893:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_RD_HDR {
//     pub nd_opt_rh_type: u8,
//     pub nd_opt_rh_len: u8,
//     pub nd_opt_rh_reserved1: u16,
//     pub nd_opt_rh_reserved2: u32,
// }

// UNSUPPORTED Rust 2901:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_OPTION_ROUTE_INFO {
//     pub nd_opt_ri_type: u8,
//     pub nd_opt_ri_len: u8,
//     pub nd_opt_ri_prefix_len: u8,
//     pub Anonymous: ND_OPTION_ROUTE_INFO_0,
//     pub nd_opt_ri_route_lifetime: u32,
//     pub nd_opt_ri_prefix: IN6_ADDR,
// }

// UNSUPPORTED Rust 2911:1: declaration Impl has no candidate rule
// impl Default for ND_OPTION_ROUTE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2916:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ND_OPTION_ROUTE_INFO_0 {
//     pub nd_opt_ri_flags_reserved: u8,
//     pub Flags: ND_OPTION_ROUTE_INFO_0_0,
// }

// UNSUPPORTED Rust 2922:1: declaration Impl has no candidate rule
// impl Default for ND_OPTION_ROUTE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ND_OPTION_ROUTE_INFO_0_0 {
//     pub _bitfield: u8,
// }

public typealias `ND_OPTION_TYPE` = Int;
public const val `ND_OPT_ADVERTISEMENT_INTERVAL`: `ND_OPTION_TYPE` = 7;
public const val `ND_OPT_DNSSL`: `ND_OPTION_TYPE` = 31;
public const val `ND_OPT_DNSSL_MIN_LEN`: UInt = 16u;
public const val `ND_OPT_HOME_AGENT_INFORMATION`: `ND_OPTION_TYPE` = 8;
public const val `ND_OPT_MTU`: `ND_OPTION_TYPE` = 5;
public const val `ND_OPT_NBMA_SHORTCUT_LIMIT`: `ND_OPTION_TYPE` = 6;
public const val `ND_OPT_PI_FLAG_AUTO`: UInt = 64u;
public const val `ND_OPT_PI_FLAG_ONLINK`: UInt = 128u;
public const val `ND_OPT_PI_FLAG_ROUTE`: UInt = 1u;
public const val `ND_OPT_PI_FLAG_ROUTER_ADDR`: UInt = 32u;
public const val `ND_OPT_PI_FLAG_SITE_PREFIX`: UInt = 16u;
public const val `ND_OPT_PREFIX_INFORMATION`: `ND_OPTION_TYPE` = 3;
public const val `ND_OPT_RDNSS`: `ND_OPTION_TYPE` = 25;
public const val `ND_OPT_RDNSS_MIN_LEN`: UInt = 24u;
public const val `ND_OPT_REDIRECTED_HEADER`: `ND_OPTION_TYPE` = 4;
public const val `ND_OPT_RI_FLAG_PREFERENCE`: UInt = 24u;
public const val `ND_OPT_ROUTE_INFO`: `ND_OPTION_TYPE` = 24;
public const val `ND_OPT_SOURCE_ADDR_LIST`: `ND_OPTION_TYPE` = 9;
public const val `ND_OPT_SOURCE_LINKADDR`: `ND_OPTION_TYPE` = 1;
public const val `ND_OPT_TARGET_ADDR_LIST`: `ND_OPTION_TYPE` = 10;
public const val `ND_OPT_TARGET_LINKADDR`: `ND_OPTION_TYPE` = 2;
public const val `ND_RA_FLAG_HOME_AGENT`: UInt = 32u;
public const val `ND_RA_FLAG_MANAGED`: UInt = 128u;
public const val `ND_RA_FLAG_OTHER`: UInt = 64u;
public const val `ND_RA_FLAG_PREFERENCE`: UInt = 24u;
// UNSUPPORTED Rust 2958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_REDIRECT_HEADER {
//     pub nd_rd_hdr: ICMP_MESSAGE,
//     pub nd_rd_target: IN6_ADDR,
//     pub nd_rd_dst: IN6_ADDR,
// }

// UNSUPPORTED Rust 2965:1: declaration Impl has no candidate rule
// impl Default for ND_REDIRECT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_ROUTER_ADVERT_HEADER {
//     pub nd_ra_hdr: ICMP_MESSAGE,
//     pub nd_ra_reachable: u32,
//     pub nd_ra_retransmit: u32,
// }

// UNSUPPORTED Rust 2977:1: declaration Impl has no candidate rule
// impl Default for ND_ROUTER_ADVERT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ND_ROUTER_SOLICIT_HEADER {
//     pub nd_rs_hdr: ICMP_MESSAGE,
// }

// UNSUPPORTED Rust 2987:1: declaration Impl has no candidate rule
// impl Default for ND_ROUTER_SOLICIT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NETBIOS_GROUP_NAME`: UInt = 1u;
public const val `NETBIOS_NAME_LENGTH`: UInt = 16u;
public const val `NETBIOS_TYPE_QUICK_GROUP`: UInt = 3u;
public const val `NETBIOS_TYPE_QUICK_UNIQUE`: UInt = 2u;
public const val `NETBIOS_UNIQUE_NAME`: UInt = 0u;
// UNSUPPORTED Rust 2997:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETRESOURCE2A {
//     pub dwScope: u32,
//     pub dwType: u32,
//     pub dwUsage: u32,
//     pub dwDisplayType: u32,
//     pub lpLocalName: windows_sys::core::PSTR,
//     pub lpRemoteName: windows_sys::core::PSTR,
//     pub lpComment: windows_sys::core::PSTR,
//     pub ns_info: NS_INFOA,
//     pub ServiceType: windows_sys::core::GUID,
//     pub dwProtocols: u32,
//     pub lpiProtocols: *mut i32,
// }

// UNSUPPORTED Rust 3012:1: declaration Impl has no candidate rule
// impl Default for NETRESOURCE2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETRESOURCE2W {
//     pub dwScope: u32,
//     pub dwType: u32,
//     pub dwUsage: u32,
//     pub dwDisplayType: u32,
//     pub lpLocalName: windows_sys::core::PWSTR,
//     pub lpRemoteName: windows_sys::core::PWSTR,
//     pub lpComment: windows_sys::core::PWSTR,
//     pub ns_info: NS_INFOA,
//     pub ServiceType: windows_sys::core::GUID,
//     pub dwProtocols: u32,
//     pub lpiProtocols: *mut i32,
// }

// UNSUPPORTED Rust 3032:1: declaration Impl has no candidate rule
// impl Default for NETRESOURCE2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NI_DGRAM`: UInt = 16u;
public const val `NI_MAXHOST`: UInt = 1025u;
public const val `NI_MAXSERV`: UInt = 32u;
public const val `NI_NAMEREQD`: UInt = 4u;
public const val `NI_NOFQDN`: UInt = 1u;
public const val `NI_NUMERICHOST`: UInt = 2u;
public const val `NI_NUMERICSERV`: UInt = 8u;
public const val `NLA_802_1X_LOCATION`: `NLA_BLOB_DATA_TYPE` = 2;
public const val `NLA_ALLUSERS_NETWORK`: UInt = 1u;
// UNSUPPORTED Rust 3046:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NLA_BLOB {
//     pub header: NLA_BLOB_0,
//     pub data: NLA_BLOB_1,
// }

// UNSUPPORTED Rust 3052:1: declaration Impl has no candidate rule
// impl Default for NLA_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3057:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NLA_BLOB_1 {
//     pub rawData: [i8; 1],
//     pub interfaceData: NLA_BLOB_1_0,
//     pub locationData: NLA_BLOB_1_1,
//     pub connectivity: NLA_BLOB_1_2,
//     pub ICS: NLA_BLOB_1_3,
// }

// UNSUPPORTED Rust 3066:1: declaration Impl has no candidate rule
// impl Default for NLA_BLOB_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3071:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NLA_BLOB_1_3 {
//     pub remote: NLA_BLOB_1_3_0,
// }

// UNSUPPORTED Rust 3076:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NLA_BLOB_1_3_0 {
//     pub speed: u32,
//     pub r#type: u32,
//     pub state: u32,
//     pub machineName: [u16; 256],
//     pub sharedAdapterName: [u16; 256],
// }

// UNSUPPORTED Rust 3085:1: declaration Impl has no candidate rule
// impl Default for NLA_BLOB_1_3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3090:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NLA_BLOB_1_2 {
//     pub r#type: NLA_CONNECTIVITY_TYPE,
//     pub internet: NLA_INTERNET,
// }

// UNSUPPORTED Rust 3096:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NLA_BLOB_1_0 {
//     pub dwType: u32,
//     pub dwSpeed: u32,
//     pub adapterName: [i8; 1],
// }

// UNSUPPORTED Rust 3103:1: declaration Impl has no candidate rule
// impl Default for NLA_BLOB_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3108:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NLA_BLOB_1_1 {
//     pub information: [i8; 1],
// }

// UNSUPPORTED Rust 3113:1: declaration Impl has no candidate rule
// impl Default for NLA_BLOB_1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NLA_BLOB_0 {
//     pub r#type: NLA_BLOB_DATA_TYPE,
//     pub dwSize: u32,
//     pub nextOffset: u32,
// }

public typealias `NLA_BLOB_DATA_TYPE` = Int;
public const val `NLA_CONNECTIVITY`: `NLA_BLOB_DATA_TYPE` = 3;
public typealias `NLA_CONNECTIVITY_TYPE` = Int;
public const val `NLA_FRIENDLY_NAME`: UInt = 2u;
public const val `NLA_ICS`: `NLA_BLOB_DATA_TYPE` = 4;
public const val `NLA_INTERFACE`: `NLA_BLOB_DATA_TYPE` = 1;
public typealias `NLA_INTERNET` = Int;
public const val `NLA_INTERNET_NO`: `NLA_INTERNET` = 1;
public const val `NLA_INTERNET_UNKNOWN`: `NLA_INTERNET` = 0;
public const val `NLA_INTERNET_YES`: `NLA_INTERNET` = 2;
// UNSUPPORTED Rust 3135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NLA_NAMESPACE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6642243a_3ba8_4aa6_baa5_2e0bd71fdd83);

public const val `NLA_NETWORK_AD_HOC`: `NLA_CONNECTIVITY_TYPE` = 0;
public const val `NLA_NETWORK_MANAGED`: `NLA_CONNECTIVITY_TYPE` = 1;
public const val `NLA_NETWORK_UNKNOWN`: `NLA_CONNECTIVITY_TYPE` = 3;
public const val `NLA_NETWORK_UNMANAGED`: `NLA_CONNECTIVITY_TYPE` = 2;
public const val `NLA_RAW_DATA`: `NLA_BLOB_DATA_TYPE` = 0;
// UNSUPPORTED Rust 3141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NLA_SERVICE_CLASS_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0037e515_b5c9_4a43_bada_8b48a87ad239);

public typealias `NL_ADDRESS_TYPE` = Int;
public typealias `NL_BANDWIDTH_FLAG` = Int;
// UNSUPPORTED Rust 3144:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NL_BANDWIDTH_INFORMATION {
//     pub Bandwidth: u64,
//     pub Instability: u64,
//     pub BandwidthPeaked: bool,
// }

public typealias `NL_DAD_STATE` = Int;
public typealias `NL_INTERFACE_NETWORK_CATEGORY_STATE` = Int;
// UNSUPPORTED Rust 3153:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NL_INTERFACE_OFFLOAD_ROD {
//     pub _bitfield: u8,
// }

public typealias `NL_LINK_LOCAL_ADDRESS_BEHAVIOR` = Int;
public typealias `NL_NEIGHBOR_STATE` = Int;
public typealias `NL_NETWORK_CATEGORY` = Int;
public typealias `NL_NETWORK_CONNECTIVITY_COST_HINT` = Int;
// UNSUPPORTED Rust 3162:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NL_NETWORK_CONNECTIVITY_HINT {
//     pub ConnectivityLevel: NL_NETWORK_CONNECTIVITY_LEVEL_HINT,
//     pub ConnectivityCost: NL_NETWORK_CONNECTIVITY_COST_HINT,
//     pub ApproachingDataLimit: bool,
//     pub OverDataLimit: bool,
//     pub Roaming: bool,
// }

public typealias `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = Int;
// UNSUPPORTED Rust 3172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NL_PATH_BANDWIDTH_ROD {
//     pub Bandwidth: u64,
//     pub Instability: u64,
//     pub BandwidthPeaked: bool,
// }

public typealias `NL_PREFIX_ORIGIN` = Int;
public typealias `NL_ROUTER_DISCOVERY_BEHAVIOR` = Int;
public typealias `NL_ROUTE_ORIGIN` = Int;
public typealias `NL_ROUTE_PROTOCOL` = Int;
public typealias `NL_SUFFIX_ORIGIN` = Int;
// UNSUPPORTED Rust 3184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NPI_MODULEID {
//     pub Length: u16,
//     pub Type: NPI_MODULEID_TYPE,
//     pub Anonymous: NPI_MODULEID_0,
// }

// UNSUPPORTED Rust 3191:1: declaration Impl has no candidate rule
// impl Default for NPI_MODULEID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3196:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NPI_MODULEID_0 {
//     pub Guid: windows_sys::core::GUID,
//     pub IfLuid: super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 3202:1: declaration Impl has no candidate rule
// impl Default for NPI_MODULEID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NPI_MODULEID_TYPE` = Int;
public const val `NSPROTO_IPX`: UInt = 1000u;
public const val `NSPROTO_SPX`: UInt = 1256u;
public const val `NSPROTO_SPXII`: UInt = 1257u;
// UNSUPPORTED Rust 3211:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct NSPV2_ROUTINE {
//     pub cbSize: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub NSPv2Startup: LPNSPV2STARTUP,
//     pub NSPv2Cleanup: LPNSPV2CLEANUP,
//     pub NSPv2LookupServiceBegin: LPNSPV2LOOKUPSERVICEBEGIN,
//     pub NSPv2LookupServiceNextEx: LPNSPV2LOOKUPSERVICENEXTEX,
//     pub NSPv2LookupServiceEnd: LPNSPV2LOOKUPSERVICEEND,
//     pub NSPv2SetServiceEx: LPNSPV2SETSERVICEEX,
//     pub NSPv2ClientSessionRundown: LPNSPV2CLIENTSESSIONRUNDOWN,
// }

public const val `NSP_NOTIFY_APC`: `WSACOMPLETIONTYPE` = 4;
public const val `NSP_NOTIFY_EVENT`: `WSACOMPLETIONTYPE` = 2;
public const val `NSP_NOTIFY_HWND`: `WSACOMPLETIONTYPE` = 1;
public const val `NSP_NOTIFY_IMMEDIATELY`: `WSACOMPLETIONTYPE` = 0;
public const val `NSP_NOTIFY_PORT`: `WSACOMPLETIONTYPE` = 3;
// UNSUPPORTED Rust 3231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_IO"))]
// #[derive(Clone, Copy, Default)]
// pub struct NSP_ROUTINE {
//     pub cbSize: u32,
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
//     pub NSPCleanup: LPNSPCLEANUP,
//     pub NSPLookupServiceBegin: LPNSPLOOKUPSERVICEBEGIN,
//     pub NSPLookupServiceNext: LPNSPLOOKUPSERVICENEXT,
//     pub NSPLookupServiceEnd: LPNSPLOOKUPSERVICEEND,
//     pub NSPSetService: LPNSPSETSERVICE,
//     pub NSPInstallServiceClass: LPNSPINSTALLSERVICECLASS,
//     pub NSPRemoveServiceClass: LPNSPREMOVESERVICECLASS,
//     pub NSPGetServiceClassInfo: LPNSPGETSERVICECLASSINFO,
//     pub NSPIoctl: LPNSPIOCTL,
// }

public const val `NSTYPE_DYNAMIC`: UInt = 2u;
public const val `NSTYPE_ENUMERABLE`: UInt = 4u;
public const val `NSTYPE_HIERARCHICAL`: UInt = 1u;
public const val `NSTYPE_WORKGROUP`: UInt = 8u;
public const val `NS_ALL`: UInt = 0u;
public const val `NS_DEFAULT`: UInt = 0u;
public const val `NS_DHCP`: UInt = 6u;
public const val `NS_DNS`: UInt = 12u;
public const val `NS_EMAIL`: UInt = 37u;
// UNSUPPORTED Rust 3257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NS_INFOA {
//     pub dwNameSpace: u32,
//     pub dwNameSpaceFlags: u32,
//     pub lpNameSpace: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3264:1: declaration Impl has no candidate rule
// impl Default for NS_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3269:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NS_INFOW {
//     pub dwNameSpace: u32,
//     pub dwNameSpaceFlags: u32,
//     pub lpNameSpace: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3276:1: declaration Impl has no candidate rule
// impl Default for NS_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NS_LOCALNAME`: UInt = 19u;
public const val `NS_MS`: UInt = 30u;
public const val `NS_NBP`: UInt = 20u;
public const val `NS_NDS`: UInt = 2u;
public const val `NS_NETBT`: UInt = 13u;
public const val `NS_NETDES`: UInt = 60u;
public const val `NS_NIS`: UInt = 41u;
public const val `NS_NISPLUS`: UInt = 42u;
public const val `NS_NLA`: UInt = 15u;
public const val `NS_NTDS`: UInt = 32u;
public const val `NS_PEER_BROWSE`: UInt = 3u;
public const val `NS_SAP`: UInt = 1u;
// UNSUPPORTED Rust 3293:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct NS_SERVICE_INFOA {
//     pub dwNameSpace: u32,
//     pub ServiceInfo: SERVICE_INFOA,
// }

// UNSUPPORTED Rust 3300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy, Default)]
// pub struct NS_SERVICE_INFOW {
//     pub dwNameSpace: u32,
//     pub ServiceInfo: SERVICE_INFOW,
// }

public const val `NS_SLP`: UInt = 5u;
public const val `NS_STDA`: UInt = 31u;
public const val `NS_TCPIP_HOSTS`: UInt = 11u;
public const val `NS_TCPIP_LOCAL`: UInt = 10u;
public const val `NS_VNS`: UInt = 50u;
public const val `NS_WINS`: UInt = 14u;
public const val `NS_WRQ`: UInt = 50u;
public const val `NS_X500`: UInt = 40u;
public const val `NetworkCategoryDomainAuthenticated`: `NL_NETWORK_CATEGORY` = 2;
public const val `NetworkCategoryPrivate`: `NL_NETWORK_CATEGORY` = 1;
public const val `NetworkCategoryPublic`: `NL_NETWORK_CATEGORY` = 0;
public const val `NetworkCategoryUnchanged`: `NL_NETWORK_CATEGORY` = -1;
public const val `NetworkCategoryUnknown`: `NL_NETWORK_CATEGORY` = -1;
public const val `NetworkConnectivityCostHintFixed`: `NL_NETWORK_CONNECTIVITY_COST_HINT` = 2;
public const val `NetworkConnectivityCostHintUnknown`: `NL_NETWORK_CONNECTIVITY_COST_HINT` = 0;
public const val `NetworkConnectivityCostHintUnrestricted`: `NL_NETWORK_CONNECTIVITY_COST_HINT` = 1;
public const val `NetworkConnectivityCostHintVariable`: `NL_NETWORK_CONNECTIVITY_COST_HINT` = 3;
public const val `NetworkConnectivityLevelHintConstrainedInternetAccess`: `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = 4;
public const val `NetworkConnectivityLevelHintHidden`: `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = 5;
public const val `NetworkConnectivityLevelHintInternetAccess`: `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = 3;
public const val `NetworkConnectivityLevelHintLocalAccess`: `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = 2;
public const val `NetworkConnectivityLevelHintNone`: `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = 1;
public const val `NetworkConnectivityLevelHintUnknown`: `NL_NETWORK_CONNECTIVITY_LEVEL_HINT` = 0;
public const val `NlatAnycast`: `NL_ADDRESS_TYPE` = 2;
public const val `NlatBroadcast`: `NL_ADDRESS_TYPE` = 4;
public const val `NlatInvalid`: `NL_ADDRESS_TYPE` = 5;
public const val `NlatMulticast`: `NL_ADDRESS_TYPE` = 3;
public const val `NlatUnicast`: `NL_ADDRESS_TYPE` = 1;
public const val `NlatUnspecified`: `NL_ADDRESS_TYPE` = 0;
public const val `NlbwDisabled`: `NL_BANDWIDTH_FLAG` = 0;
public const val `NlbwEnabled`: `NL_BANDWIDTH_FLAG` = 1;
public const val `NlbwUnchanged`: `NL_BANDWIDTH_FLAG` = -1;
public const val `NldsDeprecated`: `NL_DAD_STATE` = 3;
public const val `NldsDuplicate`: `NL_DAD_STATE` = 2;
public const val `NldsInvalid`: `NL_DAD_STATE` = 0;
public const val `NldsPreferred`: `NL_DAD_STATE` = 4;
public const val `NldsTentative`: `NL_DAD_STATE` = 1;
public const val `NlincCategoryStateMax`: `NL_INTERFACE_NETWORK_CATEGORY_STATE` = 4;
public const val `NlincCategoryUnknown`: `NL_INTERFACE_NETWORK_CATEGORY_STATE` = 0;
public const val `NlincDomainAuthenticated`: `NL_INTERFACE_NETWORK_CATEGORY_STATE` = 3;
public const val `NlincPrivate`: `NL_INTERFACE_NETWORK_CATEGORY_STATE` = 2;
public const val `NlincPublic`: `NL_INTERFACE_NETWORK_CATEGORY_STATE` = 1;
public const val `NlnsDelay`: `NL_NEIGHBOR_STATE` = 3;
public const val `NlnsIncomplete`: `NL_NEIGHBOR_STATE` = 1;
public const val `NlnsMaximum`: `NL_NEIGHBOR_STATE` = 7;
public const val `NlnsPermanent`: `NL_NEIGHBOR_STATE` = 6;
public const val `NlnsProbe`: `NL_NEIGHBOR_STATE` = 2;
public const val `NlnsReachable`: `NL_NEIGHBOR_STATE` = 5;
public const val `NlnsStale`: `NL_NEIGHBOR_STATE` = 4;
public const val `NlnsUnreachable`: `NL_NEIGHBOR_STATE` = 0;
public const val `Nlro6to4`: `NL_ROUTE_ORIGIN` = 4;
public const val `NlroDHCP`: `NL_ROUTE_ORIGIN` = 2;
public const val `NlroManual`: `NL_ROUTE_ORIGIN` = 0;
public const val `NlroRouterAdvertisement`: `NL_ROUTE_ORIGIN` = 3;
public const val `NlroWellKnown`: `NL_ROUTE_ORIGIN` = 1;
public const val `NlsoDhcp`: `NL_SUFFIX_ORIGIN` = 3;
public const val `NlsoLinkLayerAddress`: `NL_SUFFIX_ORIGIN` = 4;
public const val `NlsoManual`: `NL_SUFFIX_ORIGIN` = 1;
public const val `NlsoOther`: `NL_SUFFIX_ORIGIN` = 0;
public const val `NlsoRandom`: `NL_SUFFIX_ORIGIN` = 5;
public const val `NlsoWellKnown`: `NL_SUFFIX_ORIGIN` = 2;
public const val `PFL_HIDDEN`: UInt = 4u;
public const val `PFL_MATCHES_PROTOCOL_ZERO`: UInt = 8u;
public const val `PFL_MULTIPLE_PROTO_ENTRIES`: UInt = 1u;
public const val `PFL_NETWORKDIRECT_PROVIDER`: UInt = 16u;
public const val `PFL_RECOMMENDED_PROTO_ENTRY`: UInt = 2u;
public const val `PF_APPLETALK`: UShort = 16u;
public const val `PF_ATM`: UShort = 22u;
public const val `PF_BAN`: UShort = 21u;
public const val `PF_CCITT`: UShort = 10u;
public const val `PF_CHAOS`: UShort = 5u;
public const val `PF_DATAKIT`: UShort = 9u;
public const val `PF_DECnet`: UShort = 12u;
public const val `PF_DLI`: UShort = 13u;
public const val `PF_ECMA`: UShort = 8u;
public const val `PF_FIREFOX`: UShort = 19u;
public const val `PF_HYLINK`: UShort = 15u;
public const val `PF_IMPLINK`: UShort = 3u;
public const val `PF_IPX`: UShort = 6u;
public const val `PF_IRDA`: UShort = 26u;
public const val `PF_ISO`: UShort = 7u;
public const val `PF_LAT`: UShort = 14u;
public const val `PF_MAX`: UShort = 29u;
public const val `PF_NS`: UShort = 6u;
public const val `PF_OSI`: UShort = 7u;
public const val `PF_PUP`: UShort = 4u;
public const val `PF_SNA`: UShort = 11u;
public const val `PF_UNIX`: UShort = 1u;
public const val `PF_UNKNOWN1`: UShort = 20u;
public const val `PF_VOICEVIEW`: UShort = 18u;
public const val `PI_ALLOWED`: UInt = 0u;
public const val `PI_NUMBER_NOT_AVAILABLE`: UInt = 128u;
public const val `PI_RESTRICTED`: UInt = 64u;
public typealias `PMTUD_STATE` = Int;
public const val `POLLERR`: `WSAPOLL_EVENT_FLAGS` = 1;
public const val `POLLHUP`: `WSAPOLL_EVENT_FLAGS` = 2;
public const val `POLLIN`: `WSAPOLL_EVENT_FLAGS` = 768;
public const val `POLLNVAL`: `WSAPOLL_EVENT_FLAGS` = 4;
public const val `POLLOUT`: `WSAPOLL_EVENT_FLAGS` = 16;
public const val `POLLPRI`: `WSAPOLL_EVENT_FLAGS` = 1024;
public const val `POLLRDBAND`: `WSAPOLL_EVENT_FLAGS` = 512;
public const val `POLLRDNORM`: `WSAPOLL_EVENT_FLAGS` = 256;
public const val `POLLWRBAND`: `WSAPOLL_EVENT_FLAGS` = 32;
public const val `POLLWRNORM`: `WSAPOLL_EVENT_FLAGS` = 16;
// UNSUPPORTED Rust 3411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRIORITY_STATUS {
//     pub Sender: SOCKET_PRIORITY_HINT,
//     pub Receiver: SOCKET_PRIORITY_HINT,
// }

public const val `PROP_ADDRESSES`: UInt = 256u;
public const val `PROP_ALL`: UInt = 2147483648u;
public const val `PROP_COMMENT`: UInt = 1u;
public const val `PROP_DISPLAY_HINT`: UInt = 4u;
public const val `PROP_LOCALE`: UInt = 2u;
public const val `PROP_MACHINE`: UInt = 32u;
public const val `PROP_SD`: UInt = 512u;
public const val `PROP_START_TIME`: UInt = 16u;
public const val `PROP_VERSION`: UInt = 8u;
public const val `PROTECTION_LEVEL_DEFAULT`: UInt = 20u;
public const val `PROTECTION_LEVEL_EDGERESTRICTED`: UInt = 20u;
public const val `PROTECTION_LEVEL_RESTRICTED`: UInt = 30u;
public const val `PROTECTION_LEVEL_UNRESTRICTED`: UInt = 10u;
// UNSUPPORTED Rust 3430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROTOCOL_INFOA {
//     pub dwServiceFlags: u32,
//     pub iAddressFamily: i32,
//     pub iMaxSockAddr: i32,
//     pub iMinSockAddr: i32,
//     pub iSocketType: i32,
//     pub iProtocol: i32,
//     pub dwMessageSize: u32,
//     pub lpProtocol: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3442:1: declaration Impl has no candidate rule
// impl Default for PROTOCOL_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROTOCOL_INFOW {
//     pub dwServiceFlags: u32,
//     pub iAddressFamily: i32,
//     pub iMaxSockAddr: i32,
//     pub iMinSockAddr: i32,
//     pub iSocketType: i32,
//     pub iProtocol: i32,
//     pub dwMessageSize: u32,
//     pub lpProtocol: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3459:1: declaration Impl has no candidate rule
// impl Default for PROTOCOL_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROTOENT {
//     pub p_name: windows_sys::core::PSTR,
//     pub p_aliases: *mut *mut i8,
//     pub p_proto: i16,
// }

// UNSUPPORTED Rust 3471:1: declaration Impl has no candidate rule
// impl Default for PROTOENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROTO_IP_BBN`: `NL_ROUTE_PROTOCOL` = 12;
public const val `PROTO_IP_BGP`: `NL_ROUTE_PROTOCOL` = 14;
public const val `PROTO_IP_CISCO`: `NL_ROUTE_PROTOCOL` = 11;
public const val `PROTO_IP_DHCP`: `NL_ROUTE_PROTOCOL` = 19;
public const val `PROTO_IP_DVMRP`: `NL_ROUTE_PROTOCOL` = 17;
public const val `PROTO_IP_EGP`: `NL_ROUTE_PROTOCOL` = 5;
public const val `PROTO_IP_EIGRP`: `NL_ROUTE_PROTOCOL` = 16;
public const val `PROTO_IP_ES_IS`: `NL_ROUTE_PROTOCOL` = 10;
public const val `PROTO_IP_GGP`: `NL_ROUTE_PROTOCOL` = 6;
public const val `PROTO_IP_HELLO`: `NL_ROUTE_PROTOCOL` = 7;
public const val `PROTO_IP_ICMP`: `NL_ROUTE_PROTOCOL` = 4;
public const val `PROTO_IP_IDPR`: `NL_ROUTE_PROTOCOL` = 15;
public const val `PROTO_IP_IS_IS`: `NL_ROUTE_PROTOCOL` = 9;
public const val `PROTO_IP_LOCAL`: `NL_ROUTE_PROTOCOL` = 2;
public const val `PROTO_IP_NETMGMT`: `NL_ROUTE_PROTOCOL` = 3;
public const val `PROTO_IP_NT_AUTOSTATIC`: `NL_ROUTE_PROTOCOL` = 10002;
public const val `PROTO_IP_NT_STATIC`: `NL_ROUTE_PROTOCOL` = 10006;
public const val `PROTO_IP_NT_STATIC_NON_DOD`: `NL_ROUTE_PROTOCOL` = 10007;
public const val `PROTO_IP_OSPF`: `NL_ROUTE_PROTOCOL` = 13;
public const val `PROTO_IP_OTHER`: `NL_ROUTE_PROTOCOL` = 1;
public const val `PROTO_IP_RIP`: `NL_ROUTE_PROTOCOL` = 8;
public const val `PROTO_IP_RPL`: `NL_ROUTE_PROTOCOL` = 18;
public const val `PVD_CONFIG`: Int = 12289;
public const val `ProviderInfoAudit`: `WSC_PROVIDER_INFO_TYPE` = 1;
public const val `ProviderInfoLspCategories`: `WSC_PROVIDER_INFO_TYPE` = 0;
public const val `ProviderLevel_None`: `NAPI_PROVIDER_LEVEL` = 0;
public const val `ProviderLevel_Primary`: `NAPI_PROVIDER_LEVEL` = 2;
public const val `ProviderLevel_Secondary`: `NAPI_PROVIDER_LEVEL` = 1;
public const val `ProviderType_Application`: `NAPI_PROVIDER_TYPE` = 1;
public const val `ProviderType_Service`: `NAPI_PROVIDER_TYPE` = 2;
// UNSUPPORTED Rust 3506:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Q2931_IE {
//     pub IEType: Q2931_IE_TYPE,
//     pub IELength: u32,
//     pub IE: [u8; 1],
// }

// UNSUPPORTED Rust 3513:1: declaration Impl has no candidate rule
// impl Default for Q2931_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `Q2931_IE_TYPE` = Int;
// UNSUPPORTED Rust 3519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS {
//     pub SendingFlowspec: FLOWSPEC,
//     pub ReceivingFlowspec: FLOWSPEC,
//     pub ProviderSpecific: WSABUF,
// }

public const val `QOS_CLASS0`: UInt = 0u;
public const val `QOS_CLASS1`: UInt = 1u;
public const val `QOS_CLASS2`: UInt = 2u;
public const val `QOS_CLASS3`: UInt = 3u;
public const val `QOS_CLASS4`: UInt = 4u;
// UNSUPPORTED Rust 3531:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RCVALL_IF {
//     pub Mode: RCVALL_VALUE,
//     pub Interface: u32,
// }

public const val `RCVALL_IPLEVEL`: `RCVALL_VALUE` = 3;
public const val `RCVALL_OFF`: `RCVALL_VALUE` = 0;
public const val `RCVALL_ON`: `RCVALL_VALUE` = 1;
public const val `RCVALL_SOCKETLEVELONLY`: `RCVALL_VALUE` = 2;
public typealias `RCVALL_VALUE` = Int;
// UNSUPPORTED Rust 3542:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const REAL_TIME_NOTIFICATION_CAPABILITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6b59819a_5cae_492d_a901_2a3c2c50164f);

// UNSUPPORTED Rust 3543:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const REAL_TIME_NOTIFICATION_CAPABILITY_EX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6843da03_154a_4616_a508_44371295f96b);

// UNSUPPORTED Rust 3544:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REAL_TIME_NOTIFICATION_SETTING_INPUT {
//     pub TransportSettingId: TRANSPORT_SETTING_ID,
//     pub BrokerEventGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REAL_TIME_NOTIFICATION_SETTING_INPUT_EX {
//     pub TransportSettingId: TRANSPORT_SETTING_ID,
//     pub BrokerEventGuid: windows_sys::core::GUID,
//     pub Unmark: bool,
// }

// UNSUPPORTED Rust 3557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct REAL_TIME_NOTIFICATION_SETTING_OUTPUT {
//     pub ChannelStatus: CONTROL_CHANNEL_TRIGGER_STATUS,
// }

public const val `RESOURCEDISPLAYTYPE_DOMAIN`: `RESOURCE_DISPLAY_TYPE` = 1u;
public const val `RESOURCEDISPLAYTYPE_FILE`: `RESOURCE_DISPLAY_TYPE` = 4u;
public const val `RESOURCEDISPLAYTYPE_GENERIC`: `RESOURCE_DISPLAY_TYPE` = 0u;
public const val `RESOURCEDISPLAYTYPE_GROUP`: `RESOURCE_DISPLAY_TYPE` = 5u;
public const val `RESOURCEDISPLAYTYPE_SERVER`: `RESOURCE_DISPLAY_TYPE` = 2u;
public const val `RESOURCEDISPLAYTYPE_SHARE`: `RESOURCE_DISPLAY_TYPE` = 3u;
public const val `RESOURCEDISPLAYTYPE_TREE`: `RESOURCE_DISPLAY_TYPE` = 10u;
public typealias `RESOURCE_DISPLAY_TYPE` = UInt;
public const val `RESULT_IS_ADDED`: UInt = 16u;
public const val `RESULT_IS_ALIAS`: UInt = 1u;
public const val `RESULT_IS_CHANGED`: UInt = 32u;
public const val `RESULT_IS_DELETED`: UInt = 64u;
public const val `RES_FIND_MULTIPLE`: UInt = 2u;
public const val `RES_FLUSH_CACHE`: UInt = 2u;
public const val `RES_SERVICE`: UInt = 4u;
public const val `RES_SOFT_SEARCH`: UInt = 1u;
public const val `RES_UNUSED_1`: UInt = 1u;
// UNSUPPORTED Rust 3579:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RIORESULT {
//     pub Status: i32,
//     pub BytesTransferred: u32,
//     pub SocketContext: u64,
//     pub RequestContext: u64,
// }

// UNSUPPORTED Rust 3587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RIO_BUF {
//     pub BufferId: RIO_BUFFERID,
//     pub Offset: u32,
//     pub Length: u32,
// }

public typealias `RIO_BUFFERID` = Long;
// UNSUPPORTED Rust 3595:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RIO_CMSG_BUFFER {
//     pub TotalLength: u32,
// }

public const val `RIO_CORRUPT_CQ`: UInt = 4294967295u;
public typealias `RIO_CQ` = Long;
public const val `RIO_EVENT_COMPLETION`: `RIO_NOTIFICATION_COMPLETION_TYPE` = 1;
// UNSUPPORTED Rust 3603:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RIO_EXTENSION_FUNCTION_TABLE {
//     pub cbSize: u32,
//     pub RIOReceive: LPFN_RIORECEIVE,
//     pub RIOReceiveEx: LPFN_RIORECEIVEEX,
//     pub RIOSend: LPFN_RIOSEND,
//     pub RIOSendEx: LPFN_RIOSENDEX,
//     pub RIOCloseCompletionQueue: LPFN_RIOCLOSECOMPLETIONQUEUE,
//     pub RIOCreateCompletionQueue: LPFN_RIOCREATECOMPLETIONQUEUE,
//     pub RIOCreateRequestQueue: LPFN_RIOCREATEREQUESTQUEUE,
//     pub RIODequeueCompletion: LPFN_RIODEQUEUECOMPLETION,
//     pub RIODeregisterBuffer: LPFN_RIODEREGISTERBUFFER,
//     pub RIONotify: LPFN_RIONOTIFY,
//     pub RIORegisterBuffer: LPFN_RIOREGISTERBUFFER,
//     pub RIOResizeCompletionQueue: LPFN_RIORESIZECOMPLETIONQUEUE,
//     pub RIOResizeRequestQueue: LPFN_RIORESIZEREQUESTQUEUE,
// }

public const val `RIO_IOCP_COMPLETION`: `RIO_NOTIFICATION_COMPLETION_TYPE` = 2;
public const val `RIO_MAX_CQ_SIZE`: UInt = 134217728u;
public const val `RIO_MSG_COMMIT_ONLY`: UInt = 8u;
public const val `RIO_MSG_DEFER`: UInt = 2u;
public const val `RIO_MSG_DONT_NOTIFY`: UInt = 1u;
public const val `RIO_MSG_WAITALL`: UInt = 4u;
// UNSUPPORTED Rust 3627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RIO_NOTIFICATION_COMPLETION {
//     pub Type: RIO_NOTIFICATION_COMPLETION_TYPE,
//     pub Anonymous: RIO_NOTIFICATION_COMPLETION_0,
// }

// UNSUPPORTED Rust 3633:1: declaration Impl has no candidate rule
// impl Default for RIO_NOTIFICATION_COMPLETION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3638:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RIO_NOTIFICATION_COMPLETION_0 {
//     pub Event: RIO_NOTIFICATION_COMPLETION_0_0,
//     pub Iocp: RIO_NOTIFICATION_COMPLETION_0_1,
// }

// UNSUPPORTED Rust 3644:1: declaration Impl has no candidate rule
// impl Default for RIO_NOTIFICATION_COMPLETION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RIO_NOTIFICATION_COMPLETION_0_0 {
//     pub EventHandle: super::super::Foundation::HANDLE,
//     pub NotifyReset: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3655:1: declaration Impl has no candidate rule
// impl Default for RIO_NOTIFICATION_COMPLETION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3660:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RIO_NOTIFICATION_COMPLETION_0_1 {
//     pub IocpHandle: super::super::Foundation::HANDLE,
//     pub CompletionKey: *mut core::ffi::c_void,
//     pub Overlapped: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3667:1: declaration Impl has no candidate rule
// impl Default for RIO_NOTIFICATION_COMPLETION_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RIO_NOTIFICATION_COMPLETION_TYPE` = Int;
public typealias `RIO_RQ` = Long;
public const val `RM_ADD_RECEIVE_IF`: Int = 1008;
public const val `RM_DEL_RECEIVE_IF`: Int = 1009;
// UNSUPPORTED Rust 3676:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RM_FEC_INFO {
//     pub FECBlockSize: u16,
//     pub FECProActivePackets: u16,
//     pub FECGroupSize: u8,
//     pub fFECOnDemandParityEnabled: bool,
// }

public const val `RM_FLUSHCACHE`: Int = 1003;
public const val `RM_HIGH_SPEED_INTRANET_OPT`: Int = 1014;
public const val `RM_LATEJOIN`: Int = 1006;
public const val `RM_OPTIONSBASE`: Int = 1000;
public const val `RM_RATE_WINDOW_SIZE`: Int = 1001;
public const val `RM_RECEIVER_STATISTICS`: Int = 1013;
// UNSUPPORTED Rust 3690:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RM_RECEIVER_STATS {
//     pub NumODataPacketsReceived: u64,
//     pub NumRDataPacketsReceived: u64,
//     pub NumDuplicateDataPackets: u64,
//     pub DataBytesReceived: u64,
//     pub TotalBytesReceived: u64,
//     pub RateKBitsPerSecOverall: u64,
//     pub RateKBitsPerSecLast: u64,
//     pub TrailingEdgeSeqId: u64,
//     pub LeadingEdgeSeqId: u64,
//     pub AverageSequencesInWindow: u64,
//     pub MinSequencesInWindow: u64,
//     pub MaxSequencesInWindow: u64,
//     pub FirstNakSequenceNumber: u64,
//     pub NumPendingNaks: u64,
//     pub NumOutstandingNaks: u64,
//     pub NumDataPacketsBuffered: u64,
//     pub TotalSelectiveNaksSent: u64,
//     pub TotalParityNaksSent: u64,
// }

public const val `RM_SENDER_STATISTICS`: Int = 1005;
// UNSUPPORTED Rust 3713:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RM_SENDER_STATS {
//     pub DataBytesSent: u64,
//     pub TotalBytesSent: u64,
//     pub NaksReceived: u64,
//     pub NaksReceivedTooLate: u64,
//     pub NumOutstandingNaks: u64,
//     pub NumNaksAfterRData: u64,
//     pub RepairPacketsSent: u64,
//     pub BufferSpaceAvailable: u64,
//     pub TrailingEdgeSeqId: u64,
//     pub LeadingEdgeSeqId: u64,
//     pub RateKBitsPerSecOverall: u64,
//     pub RateKBitsPerSecLast: u64,
//     pub TotalODataPacketsSent: u64,
// }

public const val `RM_SENDER_WINDOW_ADVANCE_METHOD`: Int = 1004;
// UNSUPPORTED Rust 3731:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RM_SEND_WINDOW {
//     pub RateKbitsPerSec: u32,
//     pub WindowSizeInMSecs: u32,
//     pub WindowSizeInBytes: u32,
// }

public const val `RM_SEND_WINDOW_ADV_RATE`: Int = 1010;
public const val `RM_SET_MCAST_TTL`: Int = 1012;
public const val `RM_SET_MESSAGE_BOUNDARY`: Int = 1002;
public const val `RM_SET_SEND_IF`: Int = 1007;
public const val `RM_USE_FEC`: Int = 1011;
public const val `RNRSERVICE_DELETE`: `WSAESETSERVICEOP` = 2;
public const val `RNRSERVICE_DEREGISTER`: `WSAESETSERVICEOP` = 1;
public const val `RNRSERVICE_REGISTER`: `WSAESETSERVICEOP` = 0;
// UNSUPPORTED Rust 3746:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RSS_SCALABILITY_INFO {
//     pub RssEnabled: bool,
// }

public const val `RouteProtocolBbn`: `NL_ROUTE_PROTOCOL` = 12;
public const val `RouteProtocolBgp`: `NL_ROUTE_PROTOCOL` = 14;
public const val `RouteProtocolCisco`: `NL_ROUTE_PROTOCOL` = 11;
public const val `RouteProtocolDhcp`: `NL_ROUTE_PROTOCOL` = 19;
public const val `RouteProtocolDvmrp`: `NL_ROUTE_PROTOCOL` = 17;
public const val `RouteProtocolEgp`: `NL_ROUTE_PROTOCOL` = 5;
public const val `RouteProtocolEigrp`: `NL_ROUTE_PROTOCOL` = 16;
public const val `RouteProtocolEsIs`: `NL_ROUTE_PROTOCOL` = 10;
public const val `RouteProtocolGgp`: `NL_ROUTE_PROTOCOL` = 6;
public const val `RouteProtocolHello`: `NL_ROUTE_PROTOCOL` = 7;
public const val `RouteProtocolIcmp`: `NL_ROUTE_PROTOCOL` = 4;
public const val `RouteProtocolIdpr`: `NL_ROUTE_PROTOCOL` = 15;
public const val `RouteProtocolIsIs`: `NL_ROUTE_PROTOCOL` = 9;
public const val `RouteProtocolLocal`: `NL_ROUTE_PROTOCOL` = 2;
public const val `RouteProtocolNetMgmt`: `NL_ROUTE_PROTOCOL` = 3;
public const val `RouteProtocolOspf`: `NL_ROUTE_PROTOCOL` = 13;
public const val `RouteProtocolOther`: `NL_ROUTE_PROTOCOL` = 1;
public const val `RouteProtocolRip`: `NL_ROUTE_PROTOCOL` = 8;
public const val `RouteProtocolRpl`: `NL_ROUTE_PROTOCOL` = 18;
public const val `RouterDiscoveryDhcp`: `NL_ROUTER_DISCOVERY_BEHAVIOR` = 2;
public const val `RouterDiscoveryDisabled`: `NL_ROUTER_DISCOVERY_BEHAVIOR` = 0;
public const val `RouterDiscoveryEnabled`: `NL_ROUTER_DISCOVERY_BEHAVIOR` = 1;
public const val `RouterDiscoveryUnchanged`: `NL_ROUTER_DISCOVERY_BEHAVIOR` = -1;
public const val `SAP_FIELD_ABSENT`: UInt = 4294967294u;
public const val `SAP_FIELD_ANY`: UInt = 4294967295u;
public const val `SAP_FIELD_ANY_AESA_REST`: UInt = 4294967291u;
public const val `SAP_FIELD_ANY_AESA_SEL`: UInt = 4294967290u;
// UNSUPPORTED Rust 3778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCOPE_ID {
//     pub Anonymous: SCOPE_ID_0,
// }

// UNSUPPORTED Rust 3783:1: declaration Impl has no candidate rule
// impl Default for SCOPE_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3788:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SCOPE_ID_0 {
//     pub Anonymous: SCOPE_ID_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 3794:1: declaration Impl has no candidate rule
// impl Default for SCOPE_ID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3799:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCOPE_ID_0_0 {
//     pub _bitfield: u32,
// }

public typealias `SCOPE_LEVEL` = Int;
public const val `SD_BOTH`: `WINSOCK_SHUTDOWN_HOW` = 2;
public const val `SD_RECEIVE`: `WINSOCK_SHUTDOWN_HOW` = 0;
public const val `SD_SEND`: `WINSOCK_SHUTDOWN_HOW` = 1;
public const val `SECURITY_PROTOCOL_NONE`: UInt = 0u;
public const val `SENDER_DEFAULT_LATE_JOINER_PERCENTAGE`: UInt = 0u;
public const val `SENDER_DEFAULT_RATE_KBITS_PER_SEC`: UInt = 56u;
public const val `SENDER_DEFAULT_WINDOW_ADV_PERCENTAGE`: UInt = 15u;
public const val `SENDER_MAX_LATE_JOINER_PERCENTAGE`: UInt = 75u;
public typealias `SEND_RECV_FLAGS` = Int;
// UNSUPPORTED Rust 3814:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SERVENT {
//     pub s_name: windows_sys::core::PSTR,
//     pub s_aliases: *mut *mut i8,
//     pub s_port: i16,
//     pub s_proto: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3823:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SERVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SERVENT {
//     pub s_name: windows_sys::core::PSTR,
//     pub s_aliases: *mut *mut i8,
//     pub s_proto: windows_sys::core::PSTR,
//     pub s_port: i16,
// }

// UNSUPPORTED Rust 3838:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SERVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_ADDRESS {
//     pub dwAddressType: u32,
//     pub dwAddressFlags: u32,
//     pub dwAddressLength: u32,
//     pub dwPrincipalLength: u32,
//     pub lpAddress: *mut u8,
//     pub lpPrincipal: *mut u8,
// }

// UNSUPPORTED Rust 3854:1: declaration Impl has no candidate rule
// impl Default for SERVICE_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3859:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_ADDRESSES {
//     pub dwAddressCount: u32,
//     pub Addresses: [SERVICE_ADDRESS; 1],
// }

// UNSUPPORTED Rust 3865:1: declaration Impl has no candidate rule
// impl Default for SERVICE_ADDRESSES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_ADDRESS_FLAG_RPC_CN`: UInt = 1u;
public const val `SERVICE_ADDRESS_FLAG_RPC_DG`: UInt = 2u;
public const val `SERVICE_ADDRESS_FLAG_RPC_NB`: UInt = 4u;
public const val `SERVICE_ADD_TYPE`: `SET_SERVICE_OPERATION` = 4u;
// UNSUPPORTED Rust 3874:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_ASYNC_INFO {
//     pub lpServiceCallbackProc: LPSERVICE_CALLBACK_PROC,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub hAsyncTaskHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 3881:1: declaration Impl has no candidate rule
// impl Default for SERVICE_ASYNC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_DELETE_TYPE`: `SET_SERVICE_OPERATION` = 5u;
public const val `SERVICE_DEREGISTER`: `SET_SERVICE_OPERATION` = 2u;
public const val `SERVICE_FLAG_DEFER`: UInt = 1u;
public const val `SERVICE_FLAG_HARD`: UInt = 2u;
public const val `SERVICE_FLUSH`: `SET_SERVICE_OPERATION` = 3u;
// UNSUPPORTED Rust 3891:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SERVICE_INFOA {
//     pub lpServiceType: *mut windows_sys::core::GUID,
//     pub lpServiceName: windows_sys::core::PSTR,
//     pub lpComment: windows_sys::core::PSTR,
//     pub lpLocale: windows_sys::core::PSTR,
//     pub dwDisplayHint: RESOURCE_DISPLAY_TYPE,
//     pub dwVersion: u32,
//     pub dwTime: u32,
//     pub lpMachineName: windows_sys::core::PSTR,
//     pub lpServiceAddress: *mut SERVICE_ADDRESSES,
//     pub ServiceSpecificInfo: super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 3906:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SERVICE_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3912:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SERVICE_INFOW {
//     pub lpServiceType: *mut windows_sys::core::GUID,
//     pub lpServiceName: windows_sys::core::PWSTR,
//     pub lpComment: windows_sys::core::PWSTR,
//     pub lpLocale: windows_sys::core::PWSTR,
//     pub dwDisplayHint: RESOURCE_DISPLAY_TYPE,
//     pub dwVersion: u32,
//     pub dwTime: u32,
//     pub lpMachineName: windows_sys::core::PWSTR,
//     pub lpServiceAddress: *mut SERVICE_ADDRESSES,
//     pub ServiceSpecificInfo: super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 3927:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SERVICE_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_LOCAL`: UInt = 4u;
public const val `SERVICE_MULTIPLE`: UInt = 1u;
public const val `SERVICE_REGISTER`: `SET_SERVICE_OPERATION` = 1u;
public const val `SERVICE_RESOURCE`: UInt = 1u;
public const val `SERVICE_SERVICE`: UInt = 2u;
// UNSUPPORTED Rust 3938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TYPE_INFO {
//     pub dwTypeNameOffset: u32,
//     pub dwValueCount: u32,
//     pub Values: [SERVICE_TYPE_VALUE; 1],
// }

// UNSUPPORTED Rust 3945:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3950:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TYPE_INFO_ABSA {
//     pub lpTypeName: windows_sys::core::PSTR,
//     pub dwValueCount: u32,
//     pub Values: [SERVICE_TYPE_VALUE_ABSA; 1],
// }

// UNSUPPORTED Rust 3957:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TYPE_INFO_ABSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TYPE_INFO_ABSW {
//     pub lpTypeName: windows_sys::core::PWSTR,
//     pub dwValueCount: u32,
//     pub Values: [SERVICE_TYPE_VALUE_ABSW; 1],
// }

// UNSUPPORTED Rust 3969:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TYPE_INFO_ABSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3974:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_TYPE_VALUE {
//     pub dwNameSpace: u32,
//     pub dwValueType: u32,
//     pub dwValueSize: u32,
//     pub dwValueNameOffset: u32,
//     pub dwValueOffset: u32,
// }

// UNSUPPORTED Rust 3983:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TYPE_VALUE_ABSA {
//     pub dwNameSpace: u32,
//     pub dwValueType: u32,
//     pub dwValueSize: u32,
//     pub lpValueName: windows_sys::core::PSTR,
//     pub lpValue: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3992:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TYPE_VALUE_ABSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3997:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TYPE_VALUE_ABSW {
//     pub dwNameSpace: u32,
//     pub dwValueType: u32,
//     pub dwValueSize: u32,
//     pub lpValueName: windows_sys::core::PWSTR,
//     pub lpValue: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4006:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TYPE_VALUE_ABSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4011:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_CONN: windows_sys::core::PCWSTR = windows_sys::core::w!("ConnectionOriented");

// UNSUPPORTED Rust 4012:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_CONNA: windows_sys::core::PCSTR = windows_sys::core::s!("ConnectionOriented");

// UNSUPPORTED Rust 4013:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_CONNW: windows_sys::core::PCWSTR = windows_sys::core::w!("ConnectionOriented");

// UNSUPPORTED Rust 4014:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_IPXPORTA: windows_sys::core::PCSTR = windows_sys::core::s!("IpxSocket");

// UNSUPPORTED Rust 4015:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_IPXPORTW: windows_sys::core::PCWSTR = windows_sys::core::w!("IpxSocket");

// UNSUPPORTED Rust 4016:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_OBJECTID: windows_sys::core::PCWSTR = windows_sys::core::w!("ObjectId");

// UNSUPPORTED Rust 4017:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_OBJECTIDA: windows_sys::core::PCSTR = windows_sys::core::s!("ObjectId");

// UNSUPPORTED Rust 4018:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_OBJECTIDW: windows_sys::core::PCWSTR = windows_sys::core::w!("ObjectId");

// UNSUPPORTED Rust 4019:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_SAPID: windows_sys::core::PCWSTR = windows_sys::core::w!("SapId");

// UNSUPPORTED Rust 4020:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_SAPIDA: windows_sys::core::PCSTR = windows_sys::core::s!("SapId");

// UNSUPPORTED Rust 4021:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_SAPIDW: windows_sys::core::PCWSTR = windows_sys::core::w!("SapId");

// UNSUPPORTED Rust 4022:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_TCPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("TcpPort");

// UNSUPPORTED Rust 4023:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_TCPPORTA: windows_sys::core::PCSTR = windows_sys::core::s!("TcpPort");

// UNSUPPORTED Rust 4024:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_TCPPORTW: windows_sys::core::PCWSTR = windows_sys::core::w!("TcpPort");

// UNSUPPORTED Rust 4025:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_UDPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("UdpPort");

// UNSUPPORTED Rust 4026:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_UDPPORTA: windows_sys::core::PCSTR = windows_sys::core::s!("UdpPort");

// UNSUPPORTED Rust 4027:1: non-scalar type Ptr unsupported
// pub const SERVICE_TYPE_VALUE_UDPPORTW: windows_sys::core::PCWSTR = windows_sys::core::w!("UdpPort");

public typealias `SET_SERVICE_OPERATION` = UInt;
public const val `SET_SERVICE_PARTIAL_SUCCESS`: UInt = 1u;
public const val `SG_CONSTRAINED_GROUP`: UInt = 2u;
public const val `SG_UNCONSTRAINED_GROUP`: UInt = 1u;
public const val `SIOCATMARK`: Int = 1074033415;
public const val `SIOCGHIWAT`: Int = 1074033409;
public const val `SIOCGLOWAT`: Int = 1074033411;
public const val `SIOCSHIWAT`: Int = -2147192064;
public const val `SIOCSLOWAT`: Int = -2147192062;
public const val `SIO_ABSORB_RTRALERT`: UInt = 2550136837u;
public const val `SIO_ACQUIRE_PORT_RESERVATION`: UInt = 2550136932u;
public const val `SIO_ADDRESS_LIST_CHANGE`: UInt = 671088663u;
public const val `SIO_ADDRESS_LIST_QUERY`: UInt = 1207959574u;
public const val `SIO_ADDRESS_LIST_SORT`: UInt = 3355443225u;
public const val `SIO_AF_UNIX_GETPEERPID`: UInt = 1476395264u;
public const val `SIO_AF_UNIX_SETBINDPARENTPATH`: UInt = 2550137089u;
public const val `SIO_AF_UNIX_SETCONNPARENTPATH`: UInt = 2550137090u;
public const val `SIO_APPLY_TRANSPORT_SETTING`: UInt = 2550136851u;
public const val `SIO_ASSOCIATE_HANDLE`: UInt = 2281701377u;
public const val `SIO_ASSOCIATE_PORT_RESERVATION`: UInt = 2550136934u;
public const val `SIO_ASSOCIATE_PVC`: UInt = 2417360899u;
public const val `SIO_BASE_HANDLE`: UInt = 1207959586u;
public const val `SIO_BSP_HANDLE`: UInt = 1207959579u;
public const val `SIO_BSP_HANDLE_POLL`: UInt = 1207959581u;
public const val `SIO_BSP_HANDLE_SELECT`: UInt = 1207959580u;
public const val `SIO_CPU_AFFINITY`: UInt = 2550136853u;
public const val `SIO_DELETE_PEER_TARGET_NAME`: UInt = 2550137035u;
public const val `SIO_ENABLE_CIRCULAR_QUEUEING`: UInt = 671088642u;
public const val `SIO_EXT_POLL`: UInt = 3355443231u;
public const val `SIO_EXT_SELECT`: UInt = 3355443230u;
public const val `SIO_EXT_SENDMSG`: UInt = 3355443232u;
public const val `SIO_FIND_ROUTE`: UInt = 1207959555u;
public const val `SIO_FLUSH`: UInt = 671088644u;
public const val `SIO_GET_ATM_ADDRESS`: UInt = 3491102722u;
public const val `SIO_GET_ATM_CONNECTION_ID`: UInt = 1343619076u;
public const val `SIO_GET_BROADCAST_ADDRESS`: UInt = 1207959557u;
public const val `SIO_GET_EXTENSION_FUNCTION_POINTER`: UInt = 3355443206u;
public const val `SIO_GET_GROUP_QOS`: UInt = 3355443208u;
public const val `SIO_GET_MULTIPLE_EXTENSION_FUNCTION_POINTER`: UInt = 3355443236u;
public const val `SIO_GET_NUMBER_OF_ATM_DEVICES`: UInt = 1343619073u;
public const val `SIO_GET_QOS`: UInt = 3355443207u;
public const val `SIO_GET_TX_TIMESTAMP`: UInt = 2550137066u;
public const val `SIO_INDEX_ADD_MCAST`: UInt = 2550136842u;
public const val `SIO_INDEX_BIND`: UInt = 2550136840u;
public const val `SIO_INDEX_DEL_MCAST`: UInt = 2550136843u;
public const val `SIO_INDEX_MCASTIF`: UInt = 2550136841u;
public const val `SIO_KEEPALIVE_VALS`: UInt = 2550136836u;
public const val `SIO_LIMIT_BROADCASTS`: UInt = 2550136839u;
public const val `SIO_LOOPBACK_FAST_PATH`: UInt = 2550136848u;
public const val `SIO_MULTICAST_SCOPE`: UInt = 2281701386u;
public const val `SIO_MULTIPOINT_LOOPBACK`: UInt = 2281701385u;
public const val `SIO_NSP_NOTIFY_CHANGE`: UInt = 2281701401u;
public const val `SIO_PRIORITY_HINT`: UInt = 2550136856u;
public const val `SIO_QUERY_RSS_PROCESSOR_INFO`: UInt = 1207959589u;
public const val `SIO_QUERY_RSS_SCALABILITY_INFO`: UInt = 1476395218u;
public const val `SIO_QUERY_SECURITY`: UInt = 3623878857u;
public const val `SIO_QUERY_TARGET_PNP_HANDLE`: UInt = 1207959576u;
public const val `SIO_QUERY_TRANSPORT_SETTING`: UInt = 2550136852u;
public const val `SIO_QUERY_WFP_ALE_ENDPOINT_HANDLE`: UInt = 1476395213u;
public const val `SIO_QUERY_WFP_CONNECTION_REDIRECT_CONTEXT`: UInt = 2550137053u;
public const val `SIO_QUERY_WFP_CONNECTION_REDIRECT_RECORDS`: UInt = 2550137052u;
public const val `SIO_RCVALL`: UInt = 2550136833u;
public const val `SIO_RCVALL_IF`: UInt = 2550136846u;
public const val `SIO_RCVALL_IGMPMCAST`: UInt = 2550136835u;
public const val `SIO_RCVALL_MCAST`: UInt = 2550136834u;
public const val `SIO_RCVALL_MCAST_IF`: UInt = 2550136845u;
public const val `SIO_RELEASE_PORT_RESERVATION`: UInt = 2550136933u;
public const val `SIO_RESERVED_1`: UInt = 2281701402u;
public const val `SIO_RESERVED_2`: UInt = 2281701409u;
public const val `SIO_ROUTING_INTERFACE_CHANGE`: UInt = 2281701397u;
public const val `SIO_ROUTING_INTERFACE_QUERY`: UInt = 3355443220u;
public const val `SIO_SET_COMPATIBILITY_MODE`: UInt = 2550137132u;
public const val `SIO_SET_GROUP_QOS`: UInt = 2281701388u;
public const val `SIO_SET_PEER_TARGET_NAME`: UInt = 2550137034u;
public const val `SIO_SET_PRIORITY_HINT`: UInt = 2550136856u;
public const val `SIO_SET_QOS`: UInt = 2281701387u;
public const val `SIO_SET_SECURITY`: UInt = 2550137032u;
public const val `SIO_SET_WFP_CONNECTION_REDIRECT_RECORDS`: UInt = 2550137054u;
public const val `SIO_SOCKET_CLOSE_NOTIFY`: UInt = 2550136845u;
public const val `SIO_SOCKET_USAGE_NOTIFICATION`: UInt = 2550137036u;
public const val `SIO_TCP_INFO`: UInt = 3623878695u;
public const val `SIO_TCP_INITIAL_RTO`: UInt = 2550136849u;
public const val `SIO_TCP_SET_ACK_FREQUENCY`: UInt = 2550136855u;
public const val `SIO_TCP_SET_ICW`: UInt = 2550136854u;
public const val `SIO_TIMESTAMPING`: UInt = 2550137067u;
public const val `SIO_TRANSLATE_HANDLE`: UInt = 3355443213u;
public const val `SIO_UCAST_IF`: UInt = 2550136838u;
public const val `SIO_UDP_CONNRESET`: UInt = 2550136844u;
public const val `SIO_UDP_NETRESET`: UInt = 2550136847u;
public const val `SIZEOF_IP_OPT_ROUTERALERT`: UInt = 4u;
public const val `SIZEOF_IP_OPT_ROUTING_HEADER`: UInt = 3u;
public const val `SIZEOF_IP_OPT_SECURITY`: UInt = 11u;
public const val `SIZEOF_IP_OPT_STREAMIDENTIFIER`: UInt = 4u;
public const val `SIZEOF_IP_OPT_TIMESTAMP_HEADER`: UInt = 4u;
public const val `SI_NETWORK`: UInt = 3u;
public const val `SI_USER_FAILED`: UInt = 2u;
public const val `SI_USER_NOT_SCREENED`: UInt = 0u;
public const val `SI_USER_PASSED`: UInt = 1u;
public const val `SNAP_CONTROL`: UInt = 3u;
public const val `SNAP_DSAP`: UInt = 170u;
// UNSUPPORTED Rust 4128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SNAP_HEADER {
//     pub Dsap: u8,
//     pub Ssap: u8,
//     pub Control: u8,
//     pub Oui: [u8; 3],
//     pub Type: u16,
// }

// UNSUPPORTED Rust 4137:1: declaration Impl has no candidate rule
// impl Default for SNAP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SNAP_OUI`: UInt = 0u;
public const val `SNAP_SSAP`: UInt = 170u;
// UNSUPPORTED Rust 4144:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR {
//     pub sa_family: ADDRESS_FAMILY,
//     pub sa_data: [i8; 14],
// }

// UNSUPPORTED Rust 4150:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKADDR_ATM {
//     pub satm_family: u16,
//     pub satm_number: ATM_ADDRESS,
//     pub satm_blli: ATM_BLLI,
//     pub satm_bhli: ATM_BHLI,
// }

// UNSUPPORTED Rust 4163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_DL {
//     pub sdl_family: ADDRESS_FAMILY,
//     pub sdl_data: [u8; 8],
//     pub sdl_zero: [u8; 4],
// }

// UNSUPPORTED Rust 4170:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_DL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_IN {
//     pub sin_family: ADDRESS_FAMILY,
//     pub sin_port: u16,
//     pub sin_addr: IN_ADDR,
//     pub sin_zero: [i8; 8],
// }

// UNSUPPORTED Rust 4183:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4188:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_IN6 {
//     pub sin6_family: ADDRESS_FAMILY,
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: IN6_ADDR,
//     pub Anonymous: SOCKADDR_IN6_0,
// }

// UNSUPPORTED Rust 4197:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IN6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4202:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SOCKADDR_IN6_0 {
//     pub sin6_scope_id: u32,
//     pub sin6_scope_struct: SCOPE_ID,
// }

// UNSUPPORTED Rust 4208:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IN6_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_IN6_PAIR {
//     pub SourceAddress: *mut SOCKADDR_IN6,
//     pub DestinationAddress: *mut SOCKADDR_IN6,
// }

// UNSUPPORTED Rust 4219:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IN6_PAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_IN6_W2KSP1 {
//     pub sin6_family: i16,
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: IN6_ADDR,
//     pub sin6_scope_id: u32,
// }

// UNSUPPORTED Rust 4233:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IN6_W2KSP1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4238:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SOCKADDR_INET {
//     pub Ipv4: SOCKADDR_IN,
//     pub Ipv6: SOCKADDR_IN6,
//     pub si_family: ADDRESS_FAMILY,
// }

// UNSUPPORTED Rust 4245:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_INET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4250:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_IPX {
//     pub sa_family: i16,
//     pub sa_netnum: [i8; 4],
//     pub sa_nodenum: [i8; 6],
//     pub sa_socket: u16,
// }

// UNSUPPORTED Rust 4258:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IPX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4263:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_IRDA {
//     pub irdaAddressFamily: u16,
//     pub irdaDeviceID: [u8; 4],
//     pub irdaServiceName: [i8; 25],
// }

// UNSUPPORTED Rust 4270:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_IRDA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_NB {
//     pub snb_family: i16,
//     pub snb_type: u16,
//     pub snb_name: [i8; 16],
// }

// UNSUPPORTED Rust 4282:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_NB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4287:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_STORAGE {
//     pub ss_family: ADDRESS_FAMILY,
//     pub __ss_pad1: [i8; 6],
//     pub __ss_align: i64,
//     pub __ss_pad2: [i8; 112],
// }

// UNSUPPORTED Rust 4295:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_STORAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_STORAGE_XP {
//     pub ss_family: i16,
//     pub __ss_pad1: [i8; 6],
//     pub __ss_align: i64,
//     pub __ss_pad2: [i8; 112],
// }

// UNSUPPORTED Rust 4308:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_STORAGE_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_TP {
//     pub tp_family: u16,
//     pub tp_addr_type: u16,
//     pub tp_taddr_len: u16,
//     pub tp_tsel_len: u16,
//     pub tp_addr: [u8; 64],
// }

// UNSUPPORTED Rust 4322:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_TP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4327:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_UN {
//     pub sun_family: ADDRESS_FAMILY,
//     pub sun_path: [i8; 108],
// }

// UNSUPPORTED Rust 4333:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_UN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4338:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKADDR_VNS {
//     pub sin_family: u16,
//     pub net_address: [u8; 4],
//     pub subnet_addr: [u8; 2],
//     pub port: [u8; 2],
//     pub hops: u8,
//     pub filler: [u8; 5],
// }

// UNSUPPORTED Rust 4348:1: declaration Impl has no candidate rule
// impl Default for SOCKADDR_VNS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SOCKET` = ULong;
// UNSUPPORTED Rust 4354:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKET_ADDRESS {
//     pub lpSockaddr: *mut SOCKADDR,
//     pub iSockaddrLength: i32,
// }

// UNSUPPORTED Rust 4360:1: declaration Impl has no candidate rule
// impl Default for SOCKET_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKET_ADDRESS_LIST {
//     pub iAddressCount: i32,
//     pub Address: [SOCKET_ADDRESS; 1],
// }

// UNSUPPORTED Rust 4371:1: declaration Impl has no candidate rule
// impl Default for SOCKET_ADDRESS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SOCKET_DEFAULT2_QM_POLICY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaec2ef9c_3a4d_4d3e_8842_239942e39a47);

public const val `SOCKET_ERROR`: Int = -1;
public const val `SOCKET_INFO_CONNECTION_ENCRYPTED`: UInt = 2u;
public const val `SOCKET_INFO_CONNECTION_IMPERSONATED`: UInt = 4u;
public const val `SOCKET_INFO_CONNECTION_SECURED`: UInt = 1u;
// UNSUPPORTED Rust 4381:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKET_PEER_TARGET_NAME {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub PeerAddress: SOCKADDR_STORAGE,
//     pub PeerTargetNameStringLen: u32,
//     pub AllStrings: [u16; 1],
// }

// UNSUPPORTED Rust 4389:1: declaration Impl has no candidate rule
// impl Default for SOCKET_PEER_TARGET_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SOCKET_PRIORITY_HINT` = Int;
// UNSUPPORTED Rust 4395:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKET_PROCESSOR_AFFINITY {
//     pub Processor: super::super::System::Kernel::PROCESSOR_NUMBER,
//     pub NumaNodeId: u16,
//     pub Reserved: u16,
// }

public const val `SOCKET_QUERY_IPSEC2_ABORT_CONNECTION_ON_FIELD_CHANGE`: UInt = 1u;
public const val `SOCKET_QUERY_IPSEC2_FIELD_MASK_MM_SA_ID`: UInt = 1u;
public const val `SOCKET_QUERY_IPSEC2_FIELD_MASK_QM_SA_ID`: UInt = 2u;
public typealias `SOCKET_SECURITY_PROTOCOL` = Int;
public const val `SOCKET_SECURITY_PROTOCOL_DEFAULT`: `SOCKET_SECURITY_PROTOCOL` = 0;
public const val `SOCKET_SECURITY_PROTOCOL_INVALID`: `SOCKET_SECURITY_PROTOCOL` = 3;
public const val `SOCKET_SECURITY_PROTOCOL_IPSEC`: `SOCKET_SECURITY_PROTOCOL` = 1;
public const val `SOCKET_SECURITY_PROTOCOL_IPSEC2`: `SOCKET_SECURITY_PROTOCOL` = 2;
// UNSUPPORTED Rust 4411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKET_SECURITY_QUERY_INFO {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub Flags: u32,
//     pub PeerApplicationAccessTokenHandle: u64,
//     pub PeerMachineAccessTokenHandle: u64,
// }

// UNSUPPORTED Rust 4419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKET_SECURITY_QUERY_INFO_IPSEC2 {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub Flags: u32,
//     pub PeerApplicationAccessTokenHandle: u64,
//     pub PeerMachineAccessTokenHandle: u64,
//     pub MmSaId: u64,
//     pub QmSaId: u64,
//     pub NegotiationWinerr: u32,
//     pub SaLookupContext: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4431:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKET_SECURITY_QUERY_TEMPLATE {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub PeerAddress: SOCKADDR_STORAGE,
//     pub PeerTokenAccessMask: u32,
// }

// UNSUPPORTED Rust 4438:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKET_SECURITY_QUERY_TEMPLATE_IPSEC2 {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub PeerAddress: SOCKADDR_STORAGE,
//     pub PeerTokenAccessMask: u32,
//     pub Flags: u32,
//     pub FieldMask: u32,
// }

// UNSUPPORTED Rust 4447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKET_SECURITY_SETTINGS {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub SecurityFlags: u32,
// }

// UNSUPPORTED Rust 4453:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCKET_SECURITY_SETTINGS_IPSEC {
//     pub SecurityProtocol: SOCKET_SECURITY_PROTOCOL,
//     pub SecurityFlags: u32,
//     pub IpsecFlags: u32,
//     pub AuthipMMPolicyKey: windows_sys::core::GUID,
//     pub AuthipQMPolicyKey: windows_sys::core::GUID,
//     pub Reserved: windows_sys::core::GUID,
//     pub Reserved2: u64,
//     pub UserNameStringLen: u32,
//     pub DomainNameStringLen: u32,
//     pub PasswordStringLen: u32,
//     pub AllStrings: [u16; 1],
// }

// UNSUPPORTED Rust 4468:1: declaration Impl has no candidate rule
// impl Default for SOCKET_SECURITY_SETTINGS_IPSEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SOCKET_SETTINGS_ALLOW_INSECURE`: UInt = 2u;
public const val `SOCKET_SETTINGS_GUARANTEE_ENCRYPTION`: UInt = 1u;
public const val `SOCKET_SETTINGS_IPSEC_ALLOW_FIRST_INBOUND_PKT_UNENCRYPTED`: UInt = 4u;
public const val `SOCKET_SETTINGS_IPSEC_OPTIONAL_PEER_NAME_VERIFICATION`: UInt = 2u;
public const val `SOCKET_SETTINGS_IPSEC_PEER_NAME_IS_RAW_FORMAT`: UInt = 8u;
public const val `SOCKET_SETTINGS_IPSEC_SKIP_FILTER_INSTANTIATION`: UInt = 1u;
public typealias `SOCKET_USAGE_TYPE` = Int;
public const val `SOCK_DGRAM`: `WINSOCK_SOCKET_TYPE` = 2;
public const val `SOCK_NOTIFY_EVENT_ERR`: UInt = 64u;
public const val `SOCK_NOTIFY_EVENT_HANGUP`: UInt = 4u;
public const val `SOCK_NOTIFY_EVENT_IN`: UInt = 1u;
public const val `SOCK_NOTIFY_EVENT_OUT`: UInt = 2u;
public const val `SOCK_NOTIFY_EVENT_REMOVE`: UInt = 128u;
public const val `SOCK_NOTIFY_OP_DISABLE`: UInt = 2u;
public const val `SOCK_NOTIFY_OP_ENABLE`: UInt = 1u;
public const val `SOCK_NOTIFY_OP_NONE`: UInt = 0u;
public const val `SOCK_NOTIFY_OP_REMOVE`: UInt = 4u;
public const val `SOCK_NOTIFY_REGISTER_EVENT_HANGUP`: UInt = 4u;
public const val `SOCK_NOTIFY_REGISTER_EVENT_IN`: UInt = 1u;
public const val `SOCK_NOTIFY_REGISTER_EVENT_NONE`: UInt = 0u;
public const val `SOCK_NOTIFY_REGISTER_EVENT_OUT`: UInt = 2u;
// UNSUPPORTED Rust 4494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOCK_NOTIFY_REGISTRATION {
//     pub socket: SOCKET,
//     pub completionKey: *mut core::ffi::c_void,
//     pub eventFilter: u16,
//     pub operation: u8,
//     pub triggerFlags: u8,
//     pub registrationResult: u32,
// }

// UNSUPPORTED Rust 4504:1: declaration Impl has no candidate rule
// impl Default for SOCK_NOTIFY_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SOCK_NOTIFY_TRIGGER_EDGE`: UInt = 8u;
public const val `SOCK_NOTIFY_TRIGGER_LEVEL`: UInt = 4u;
public const val `SOCK_NOTIFY_TRIGGER_ONESHOT`: UInt = 1u;
public const val `SOCK_NOTIFY_TRIGGER_PERSISTENT`: UInt = 2u;
public const val `SOCK_RAW`: `WINSOCK_SOCKET_TYPE` = 3;
public const val `SOCK_RDM`: `WINSOCK_SOCKET_TYPE` = 4;
public const val `SOCK_SEQPACKET`: `WINSOCK_SOCKET_TYPE` = 5;
public const val `SOCK_STREAM`: `WINSOCK_SOCKET_TYPE` = 1;
public const val `SOL_IP`: UInt = 65531u;
public const val `SOL_IPV6`: UInt = 65530u;
public const val `SOL_IRLMP`: Int = 255;
public const val `SOL_SOCKET`: Int = 65535;
public const val `SOMAXCONN`: UInt = 5u;
public const val `SO_ACCEPTCONN`: Int = 2;
public const val `SO_BROADCAST`: Int = 32;
public const val `SO_BSP_STATE`: Int = 4105;
public const val `SO_COMPARTMENT_ID`: UInt = 12292u;
public const val `SO_CONDITIONAL_ACCEPT`: Int = 12290;
public const val `SO_CONNDATA`: Int = 28672;
public const val `SO_CONNDATALEN`: Int = 28676;
public const val `SO_CONNECT_TIME`: Int = 28684;
public const val `SO_CONNOPT`: Int = 28673;
public const val `SO_CONNOPTLEN`: Int = 28677;
public const val `SO_DEBUG`: Int = 1;
public const val `SO_DISCDATA`: Int = 28674;
public const val `SO_DISCDATALEN`: Int = 28678;
public const val `SO_DISCOPT`: Int = 28675;
public const val `SO_DISCOPTLEN`: Int = 28679;
public const val `SO_DONTLINGER`: Int = -129;
public const val `SO_DONTROUTE`: Int = 16;
public const val `SO_ERROR`: Int = 4103;
public const val `SO_EXCLUSIVEADDRUSE`: Int = -5;
public const val `SO_GROUP_ID`: Int = 8193;
public const val `SO_GROUP_PRIORITY`: Int = 8194;
public const val `SO_KEEPALIVE`: Int = 8;
public const val `SO_LINGER`: Int = 128;
public const val `SO_MAXDG`: Int = 28681;
public const val `SO_MAXPATHDG`: Int = 28682;
public const val `SO_MAX_MSG_SIZE`: Int = 8195;
public const val `SO_OOBINLINE`: Int = 256;
public const val `SO_OPENTYPE`: Int = 28680;
public const val `SO_ORIGINAL_DST`: UInt = 12303u;
public const val `SO_PAUSE_ACCEPT`: UInt = 12291u;
public const val `SO_PORT_SCALABILITY`: Int = 12294;
public const val `SO_PROTOCOL_INFO`: Int = 8197;
public const val `SO_PROTOCOL_INFOA`: Int = 8196;
public const val `SO_PROTOCOL_INFOW`: Int = 8197;
public const val `SO_RANDOMIZE_PORT`: Int = 12293;
public const val `SO_RCVBUF`: Int = 4098;
public const val `SO_RCVLOWAT`: Int = 4100;
public const val `SO_RCVTIMEO`: Int = 4102;
public const val `SO_REUSEADDR`: Int = 4;
public const val `SO_REUSE_MULTICASTPORT`: Int = 12296;
public const val `SO_REUSE_UNICASTPORT`: Int = 12295;
public const val `SO_SNDBUF`: Int = 4097;
public const val `SO_SNDLOWAT`: Int = 4099;
public const val `SO_SNDTIMEO`: Int = 4101;
public const val `SO_SYNCHRONOUS_ALERT`: UInt = 16u;
public const val `SO_SYNCHRONOUS_NONALERT`: UInt = 32u;
public const val `SO_TIMESTAMP`: UInt = 12298u;
public const val `SO_TIMESTAMP_ID`: UInt = 12299u;
public const val `SO_TYPE`: Int = 4104;
public const val `SO_UPDATE_ACCEPT_CONTEXT`: Int = 28683;
public const val `SO_UPDATE_CONNECT_CONTEXT`: Int = 28688;
public const val `SO_USELOOPBACK`: Int = 64;
public const val `SYSTEM_CRITICAL_SOCKET`: `SOCKET_USAGE_TYPE` = 1;
public const val `ScopeLevelAdmin`: `SCOPE_LEVEL` = 4;
public const val `ScopeLevelCount`: `SCOPE_LEVEL` = 16;
public const val `ScopeLevelGlobal`: `SCOPE_LEVEL` = 14;
public const val `ScopeLevelInterface`: `SCOPE_LEVEL` = 1;
public const val `ScopeLevelLink`: `SCOPE_LEVEL` = 2;
public const val `ScopeLevelOrganization`: `SCOPE_LEVEL` = 8;
public const val `ScopeLevelSite`: `SCOPE_LEVEL` = 5;
public const val `ScopeLevelSubnet`: `SCOPE_LEVEL` = 3;
public const val `SocketMaximumPriorityHintType`: `SOCKET_PRIORITY_HINT` = 3;
public const val `SocketPriorityHintLow`: `SOCKET_PRIORITY_HINT` = 1;
public const val `SocketPriorityHintNormal`: `SOCKET_PRIORITY_HINT` = 2;
public const val `SocketPriorityHintVeryLow`: `SOCKET_PRIORITY_HINT` = 0;
public typealias `TCPSTATE` = Int;
public const val `TCPSTATE_CLOSED`: `TCPSTATE` = 0;
public const val `TCPSTATE_CLOSE_WAIT`: `TCPSTATE` = 7;
public const val `TCPSTATE_CLOSING`: `TCPSTATE` = 8;
public const val `TCPSTATE_ESTABLISHED`: `TCPSTATE` = 4;
public const val `TCPSTATE_FIN_WAIT_1`: `TCPSTATE` = 5;
public const val `TCPSTATE_FIN_WAIT_2`: `TCPSTATE` = 6;
public const val `TCPSTATE_LAST_ACK`: `TCPSTATE` = 9;
public const val `TCPSTATE_LISTEN`: `TCPSTATE` = 1;
public const val `TCPSTATE_MAX`: `TCPSTATE` = 11;
public const val `TCPSTATE_SYN_RCVD`: `TCPSTATE` = 3;
public const val `TCPSTATE_SYN_SENT`: `TCPSTATE` = 2;
public const val `TCPSTATE_TIME_WAIT`: `TCPSTATE` = 10;
// UNSUPPORTED Rust 4600:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ACK_FREQUENCY_PARAMETERS {
//     pub TcpDelayedAckFrequency: u8,
// }

public const val `TCP_ATMARK`: Int = 8;
public const val `TCP_BSDURGENT`: Int = 28672;
public const val `TCP_CONGESTION_ALGORITHM`: Int = 12;
public const val `TCP_DELAY_FIN_ACK`: Int = 13;
public const val `TCP_EXPEDITED_1122`: Int = 2;
public const val `TCP_FAIL_CONNECT_ON_ICMP_ERROR`: Int = 18;
public const val `TCP_FASTOPEN`: Int = 15;
// UNSUPPORTED Rust 4612:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_HDR {
//     pub th_sport: u16,
//     pub th_dport: u16,
//     pub th_seq: u32,
//     pub th_ack: u32,
//     pub _bitfield: u8,
//     pub th_flags: u8,
//     pub th_win: u16,
//     pub th_sum: u16,
//     pub th_urp: u16,
// }

public const val `TCP_ICMP_ERROR_INFO`: Int = 19;
public typealias `TCP_ICW_LEVEL` = Int;
public const val `TCP_ICW_LEVEL_AGGRESSIVE`: `TCP_ICW_LEVEL` = 3;
public const val `TCP_ICW_LEVEL_COMPAT`: `TCP_ICW_LEVEL` = 254;
public const val `TCP_ICW_LEVEL_DEFAULT`: `TCP_ICW_LEVEL` = 0;
public const val `TCP_ICW_LEVEL_EXPERIMENTAL`: `TCP_ICW_LEVEL` = 4;
public const val `TCP_ICW_LEVEL_HIGH`: `TCP_ICW_LEVEL` = 1;
public const val `TCP_ICW_LEVEL_MAX`: `TCP_ICW_LEVEL` = 255;
public const val `TCP_ICW_LEVEL_VERY_HIGH`: `TCP_ICW_LEVEL` = 2;
// UNSUPPORTED Rust 4634:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_ICW_PARAMETERS {
//     pub Level: TCP_ICW_LEVEL,
// }

// UNSUPPORTED Rust 4639:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_INFO_v0 {
//     pub State: TCPSTATE,
//     pub Mss: u32,
//     pub ConnectionTimeMs: u64,
//     pub TimestampsEnabled: bool,
//     pub RttUs: u32,
//     pub MinRttUs: u32,
//     pub BytesInFlight: u32,
//     pub Cwnd: u32,
//     pub SndWnd: u32,
//     pub RcvWnd: u32,
//     pub RcvBuf: u32,
//     pub BytesOut: u64,
//     pub BytesIn: u64,
//     pub BytesReordered: u32,
//     pub BytesRetrans: u32,
//     pub FastRetrans: u32,
//     pub DupAcksIn: u32,
//     pub TimeoutEpisodes: u32,
//     pub SynRetrans: u8,
// }

// UNSUPPORTED Rust 4662:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_INFO_v1 {
//     pub State: TCPSTATE,
//     pub Mss: u32,
//     pub ConnectionTimeMs: u64,
//     pub TimestampsEnabled: bool,
//     pub RttUs: u32,
//     pub MinRttUs: u32,
//     pub BytesInFlight: u32,
//     pub Cwnd: u32,
//     pub SndWnd: u32,
//     pub RcvWnd: u32,
//     pub RcvBuf: u32,
//     pub BytesOut: u64,
//     pub BytesIn: u64,
//     pub BytesReordered: u32,
//     pub BytesRetrans: u32,
//     pub FastRetrans: u32,
//     pub DupAcksIn: u32,
//     pub TimeoutEpisodes: u32,
//     pub SynRetrans: u8,
//     pub SndLimTransRwin: u32,
//     pub SndLimTimeRwin: u32,
//     pub SndLimBytesRwin: u64,
//     pub SndLimTransCwnd: u32,
//     pub SndLimTimeCwnd: u32,
//     pub SndLimBytesCwnd: u64,
//     pub SndLimTransSnd: u32,
//     pub SndLimTimeSnd: u32,
//     pub SndLimBytesSnd: u64,
// }

public const val `TCP_INITIAL_RTO_DEFAULT_MAX_SYN_RETRANSMISSIONS`: UInt = 0u;
public const val `TCP_INITIAL_RTO_DEFAULT_RTT`: UInt = 0u;
public const val `TCP_INITIAL_RTO_NO_SYN_RETRANSMISSIONS`: UShort = 65534u;
// UNSUPPORTED Rust 4697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_INITIAL_RTO_PARAMETERS {
//     pub Rtt: u16,
//     pub MaxSynRetransmissions: u8,
// }

public const val `TCP_INITIAL_RTO_UNSPECIFIED_MAX_SYN_RETRANSMISSIONS`: UShort = 65535u;
public const val `TCP_KEEPALIVE`: Int = 3;
public const val `TCP_KEEPCNT`: Int = 16;
public const val `TCP_KEEPIDLE`: Int = 3;
public const val `TCP_KEEPINTVL`: Int = 17;
public const val `TCP_MAXRT`: Int = 5;
public const val `TCP_MAXRTMS`: Int = 14;
public const val `TCP_MAXSEG`: Int = 4;
public const val `TCP_NODELAY`: Int = 1;
public const val `TCP_NOSYNRETRIES`: Int = 9;
public const val `TCP_NOURG`: Int = 7;
public const val `TCP_OFFLOAD_NOT_PREFERRED`: Int = 1;
public const val `TCP_OFFLOAD_NO_PREFERENCE`: Int = 0;
public const val `TCP_OFFLOAD_PREFERENCE`: Int = 11;
public const val `TCP_OFFLOAD_PREFERRED`: Int = 2;
// UNSUPPORTED Rust 4718:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct TCP_OPT_FASTOPEN {
//     pub Kind: u8,
//     pub Length: u8,
//     pub Cookie: [u8; 1],
// }

// UNSUPPORTED Rust 4725:1: declaration Impl has no candidate rule
// impl Default for TCP_OPT_FASTOPEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4730:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_OPT_MSS {
//     pub Kind: u8,
//     pub Length: u8,
//     pub Mss: u16,
// }

// UNSUPPORTED Rust 4737:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct TCP_OPT_SACK {
//     pub Kind: u8,
//     pub Length: u8,
//     pub Block: [TCP_OPT_SACK_0; 1],
// }

// UNSUPPORTED Rust 4744:1: declaration Impl has no candidate rule
// impl Default for TCP_OPT_SACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4749:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_OPT_SACK_0 {
//     pub Left: u32,
//     pub Right: u32,
// }

// UNSUPPORTED Rust 4755:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_OPT_SACK_PERMITTED {
//     pub Kind: u8,
//     pub Length: u8,
// }

// UNSUPPORTED Rust 4761:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_OPT_TS {
//     pub Kind: u8,
//     pub Length: u8,
//     pub Val: u32,
//     pub EcR: u32,
// }

// UNSUPPORTED Rust 4769:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_OPT_UNKNOWN {
//     pub Kind: u8,
//     pub Length: u8,
// }

// UNSUPPORTED Rust 4775:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TCP_OPT_WS {
//     pub Kind: u8,
//     pub Length: u8,
//     pub ShiftCnt: u8,
// }

public const val `TCP_STDURG`: Int = 6;
public const val `TCP_TIMESTAMPS`: Int = 10;
public const val `TF_DISCONNECT`: UInt = 1u;
public const val `TF_REUSE_SOCKET`: UInt = 2u;
public const val `TF_USE_DEFAULT_WORKER`: UInt = 0u;
public const val `TF_USE_KERNEL_APC`: UInt = 32u;
public const val `TF_USE_SYSTEM_THREAD`: UInt = 16u;
public const val `TF_WRITE_BEHIND`: UInt = 4u;
public const val `TH_ACK`: UInt = 16u;
public const val `TH_CWR`: UInt = 128u;
public const val `TH_ECE`: UInt = 64u;
public const val `TH_FIN`: UInt = 1u;
public const val `TH_NETDEV`: UInt = 1u;
public const val `TH_OPT_EOL`: UInt = 0u;
public const val `TH_OPT_FASTOPEN`: UInt = 34u;
public const val `TH_OPT_MSS`: UInt = 2u;
public const val `TH_OPT_NOP`: UInt = 1u;
public const val `TH_OPT_SACK`: UInt = 5u;
public const val `TH_OPT_SACK_PERMITTED`: UInt = 4u;
public const val `TH_OPT_TS`: UInt = 8u;
public const val `TH_OPT_WS`: UInt = 3u;
public const val `TH_PSH`: UInt = 8u;
public const val `TH_RST`: UInt = 4u;
public const val `TH_SYN`: UInt = 2u;
public const val `TH_TAPI`: UInt = 2u;
public const val `TH_URG`: UInt = 32u;
// UNSUPPORTED Rust 4808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TIMESTAMPING_CONFIG {
//     pub Flags: u32,
//     pub TxTimestampsBuffered: u16,
// }

public const val `TIMESTAMPING_FLAG_RX`: UInt = 1u;
public const val `TIMESTAMPING_FLAG_TX`: UInt = 2u;
// UNSUPPORTED Rust 4816:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TIMEVAL {
//     pub tv_sec: i32,
//     pub tv_usec: i32,
// }

public const val `TNS_PLAN_CARRIER_ID_CODE`: UInt = 1u;
public const val `TNS_TYPE_NATIONAL`: UInt = 64u;
public const val `TP_DISCONNECT`: UInt = 1u;
public const val `TP_ELEMENT_EOP`: UInt = 4u;
public const val `TP_ELEMENT_FILE`: UInt = 2u;
public const val `TP_ELEMENT_MEMORY`: UInt = 1u;
public const val `TP_REUSE_SOCKET`: UInt = 2u;
public const val `TP_USE_DEFAULT_WORKER`: UInt = 0u;
public const val `TP_USE_KERNEL_APC`: UInt = 32u;
public const val `TP_USE_SYSTEM_THREAD`: UInt = 16u;
// UNSUPPORTED Rust 4832:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRANSMIT_FILE_BUFFERS {
//     pub Head: *mut core::ffi::c_void,
//     pub HeadLength: u32,
//     pub Tail: *mut core::ffi::c_void,
//     pub TailLength: u32,
// }

// UNSUPPORTED Rust 4840:1: declaration Impl has no candidate rule
// impl Default for TRANSMIT_FILE_BUFFERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4845:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRANSMIT_PACKETS_ELEMENT {
//     pub dwElFlags: u32,
//     pub cLength: u32,
//     pub Anonymous: TRANSMIT_PACKETS_ELEMENT_0,
// }

// UNSUPPORTED Rust 4852:1: declaration Impl has no candidate rule
// impl Default for TRANSMIT_PACKETS_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4857:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRANSMIT_PACKETS_ELEMENT_0 {
//     pub Anonymous: TRANSMIT_PACKETS_ELEMENT_0_0,
//     pub pBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4863:1: declaration Impl has no candidate rule
// impl Default for TRANSMIT_PACKETS_ELEMENT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4868:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRANSMIT_PACKETS_ELEMENT_0_0 {
//     pub nFileOffset: i64,
//     pub hFile: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 4874:1: declaration Impl has no candidate rule
// impl Default for TRANSMIT_PACKETS_ELEMENT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRANSPORT_SETTING_ID {
//     pub Guid: windows_sys::core::GUID,
// }

public const val `TR_END_TO_END`: UInt = 1u;
public const val `TR_NOIND`: UInt = 0u;
public const val `TR_NO_END_TO_END`: UInt = 2u;
public const val `TT_CBR`: UInt = 4u;
public const val `TT_NOIND`: UInt = 0u;
public const val `TT_VBR`: UInt = 8u;
public typealias `TUNNEL_SUB_TYPE` = Int;
public const val `TUNNEL_SUB_TYPE_CP`: `TUNNEL_SUB_TYPE` = 1;
public const val `TUNNEL_SUB_TYPE_HA`: `TUNNEL_SUB_TYPE` = 3;
public const val `TUNNEL_SUB_TYPE_IPTLS`: `TUNNEL_SUB_TYPE` = 2;
public const val `TUNNEL_SUB_TYPE_NONE`: `TUNNEL_SUB_TYPE` = 0;
public const val `UDP_CHECKSUM_COVERAGE`: Int = 20;
public const val `UDP_COALESCED_INFO`: UInt = 3u;
public const val `UDP_NOCHECKSUM`: Int = 1;
public const val `UDP_RECV_MAX_COALESCED_SIZE`: Int = 3;
public const val `UDP_SEND_MSG_SIZE`: Int = 2;
public const val `UNIX_PATH_MAX`: UInt = 108u;
public const val `UP_P2MP`: UInt = 1u;
public const val `UP_P2P`: UInt = 0u;
// UNSUPPORTED Rust 4903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VLAN_TAG {
//     pub Anonymous: VLAN_TAG_0,
//     pub Type: u16,
// }

// UNSUPPORTED Rust 4909:1: declaration Impl has no candidate rule
// impl Default for VLAN_TAG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4914:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VLAN_TAG_0 {
//     pub Tag: u16,
//     pub Anonymous: VLAN_TAG_0_0,
// }

// UNSUPPORTED Rust 4920:1: declaration Impl has no candidate rule
// impl Default for VLAN_TAG_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4925:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VLAN_TAG_0_0 {
//     pub _bitfield: u16,
// }

public const val `VNSPROTO_IPC`: UInt = 1u;
public const val `VNSPROTO_RELIABLE_IPC`: UInt = 2u;
public const val `VNSPROTO_SPP`: UInt = 3u;
public const val `WCE_AF_IRDA`: UInt = 22u;
// UNSUPPORTED Rust 4934:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WCE_DEVICELIST {
//     pub numDevice: u32,
//     pub Device: [WCE_IRDA_DEVICE_INFO; 1],
// }

// UNSUPPORTED Rust 4940:1: declaration Impl has no candidate rule
// impl Default for WCE_DEVICELIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4945:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WCE_IRDA_DEVICE_INFO {
//     pub irdaDeviceID: [u8; 4],
//     pub irdaDeviceName: [i8; 22],
//     pub Reserved: [u8; 2],
// }

// UNSUPPORTED Rust 4952:1: declaration Impl has no candidate rule
// impl Default for WCE_IRDA_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WCE_PF_IRDA`: UInt = 22u;
public const val `WINDOWS_AF_IRDA`: UInt = 26u;
// UNSUPPORTED Rust 4959:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_DEVICELIST {
//     pub numDevice: u32,
//     pub Device: [WINDOWS_IRDA_DEVICE_INFO; 1],
// }

// UNSUPPORTED Rust 4965:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_DEVICELIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IAS_QUERY {
//     pub irdaDeviceID: [u8; 4],
//     pub irdaClassName: [i8; 64],
//     pub irdaAttribName: [i8; 256],
//     pub irdaAttribType: u32,
//     pub irdaAttribute: WINDOWS_IAS_QUERY_0,
// }

// UNSUPPORTED Rust 4979:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_QUERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4984:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINDOWS_IAS_QUERY_0 {
//     pub irdaAttribInt: i32,
//     pub irdaAttribOctetSeq: WINDOWS_IAS_QUERY_0_0,
//     pub irdaAttribUsrStr: WINDOWS_IAS_QUERY_0_1,
// }

// UNSUPPORTED Rust 4991:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_QUERY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4996:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IAS_QUERY_0_0 {
//     pub Len: u32,
//     pub OctetSeq: [u8; 1024],
// }

// UNSUPPORTED Rust 5002:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_QUERY_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5007:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IAS_QUERY_0_1 {
//     pub Len: u32,
//     pub CharSet: u32,
//     pub UsrStr: [u8; 256],
// }

// UNSUPPORTED Rust 5014:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_QUERY_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5019:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IAS_SET {
//     pub irdaClassName: [i8; 64],
//     pub irdaAttribName: [i8; 256],
//     pub irdaAttribType: u32,
//     pub irdaAttribute: WINDOWS_IAS_SET_0,
// }

// UNSUPPORTED Rust 5027:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5032:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINDOWS_IAS_SET_0 {
//     pub irdaAttribInt: i32,
//     pub irdaAttribOctetSeq: WINDOWS_IAS_SET_0_0,
//     pub irdaAttribUsrStr: WINDOWS_IAS_SET_0_1,
// }

// UNSUPPORTED Rust 5039:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_SET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IAS_SET_0_0 {
//     pub Len: u16,
//     pub OctetSeq: [u8; 1024],
// }

// UNSUPPORTED Rust 5050:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_SET_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IAS_SET_0_1 {
//     pub Len: u8,
//     pub CharSet: u8,
//     pub UsrStr: [u8; 256],
// }

// UNSUPPORTED Rust 5062:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IAS_SET_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5067:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINDOWS_IRDA_DEVICE_INFO {
//     pub irdaDeviceID: [u8; 4],
//     pub irdaDeviceName: [i8; 22],
//     pub irdaDeviceHints1: u8,
//     pub irdaDeviceHints2: u8,
//     pub irdaCharSet: u8,
// }

// UNSUPPORTED Rust 5076:1: declaration Impl has no candidate rule
// impl Default for WINDOWS_IRDA_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINDOWS_PF_IRDA`: UInt = 26u;
public typealias `WINSOCK_SHUTDOWN_HOW` = Int;
public typealias `WINSOCK_SOCKET_TYPE` = Int;
public const val `WSABASEERR`: `WSA_ERROR` = 10000;
// UNSUPPORTED Rust 5085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSABUF {
//     pub len: u32,
//     pub buf: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 5091:1: declaration Impl has no candidate rule
// impl Default for WSABUF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5096:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct WSACOMPLETION {
//     pub Type: WSACOMPLETIONTYPE,
//     pub Parameters: WSACOMPLETION_0,
// }

// UNSUPPORTED Rust 5103:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSACOMPLETION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5109:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub union WSACOMPLETION_0 {
//     pub WindowMessage: WSACOMPLETION_0_0,
//     pub Event: WSACOMPLETION_0_1,
//     pub Apc: WSACOMPLETION_0_2,
//     pub Port: WSACOMPLETION_0_3,
// }

// UNSUPPORTED Rust 5118:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSACOMPLETION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct WSACOMPLETION_0_2 {
//     pub lpOverlapped: *mut super::super::System::IO::OVERLAPPED,
//     pub lpfnCompletionProc: LPWSAOVERLAPPED_COMPLETION_ROUTINE,
// }

// UNSUPPORTED Rust 5131:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSACOMPLETION_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5137:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct WSACOMPLETION_0_1 {
//     pub lpOverlapped: *mut super::super::System::IO::OVERLAPPED,
// }

// UNSUPPORTED Rust 5143:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSACOMPLETION_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5149:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct WSACOMPLETION_0_3 {
//     pub lpOverlapped: *mut super::super::System::IO::OVERLAPPED,
//     pub hPort: super::super::Foundation::HANDLE,
//     pub Key: usize,
// }

// UNSUPPORTED Rust 5157:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSACOMPLETION_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct WSACOMPLETION_0_0 {
//     pub hWnd: super::super::Foundation::HWND,
//     pub uMsg: u32,
//     pub context: super::super::Foundation::WPARAM,
// }

// UNSUPPORTED Rust 5171:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSACOMPLETION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSACOMPLETIONTYPE` = Int;
// UNSUPPORTED Rust 5178:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct WSADATA {
//     pub wVersion: u16,
//     pub wHighVersion: u16,
//     pub szDescription: [i8; 257],
//     pub szSystemStatus: [i8; 129],
//     pub iMaxSockets: u16,
//     pub iMaxUdpDg: u16,
//     pub lpVendorInfo: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 5190:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for WSADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct WSADATA {
//     pub wVersion: u16,
//     pub wHighVersion: u16,
//     pub iMaxSockets: u16,
//     pub iMaxUdpDg: u16,
//     pub lpVendorInfo: windows_sys::core::PSTR,
//     pub szDescription: [i8; 257],
//     pub szSystemStatus: [i8; 129],
// }

// UNSUPPORTED Rust 5208:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for WSADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSADESCRIPTION_LEN`: UInt = 256u;
public const val `WSAEACCES`: `WSA_ERROR` = 10013;
public const val `WSAEADDRINUSE`: `WSA_ERROR` = 10048;
public const val `WSAEADDRNOTAVAIL`: `WSA_ERROR` = 10049;
public const val `WSAEAFNOSUPPORT`: `WSA_ERROR` = 10047;
public const val `WSAEALREADY`: `WSA_ERROR` = 10037;
public const val `WSAEBADF`: `WSA_ERROR` = 10009;
public const val `WSAECANCELLED`: `WSA_ERROR` = 10103;
public typealias `WSAECOMPARATOR` = Int;
public const val `WSAECONNABORTED`: `WSA_ERROR` = 10053;
public const val `WSAECONNREFUSED`: `WSA_ERROR` = 10061;
public const val `WSAECONNRESET`: `WSA_ERROR` = 10054;
public const val `WSAEDESTADDRREQ`: `WSA_ERROR` = 10039;
public const val `WSAEDISCON`: `WSA_ERROR` = 10101;
public const val `WSAEDQUOT`: `WSA_ERROR` = 10069;
public const val `WSAEFAULT`: `WSA_ERROR` = 10014;
public const val `WSAEHOSTDOWN`: `WSA_ERROR` = 10064;
public const val `WSAEHOSTUNREACH`: `WSA_ERROR` = 10065;
public const val `WSAEINPROGRESS`: `WSA_ERROR` = 10036;
public const val `WSAEINTR`: `WSA_ERROR` = 10004;
public const val `WSAEINVAL`: `WSA_ERROR` = 10022;
public const val `WSAEINVALIDPROCTABLE`: `WSA_ERROR` = 10104;
public const val `WSAEINVALIDPROVIDER`: `WSA_ERROR` = 10105;
public const val `WSAEISCONN`: `WSA_ERROR` = 10056;
public const val `WSAELOOP`: `WSA_ERROR` = 10062;
public const val `WSAEMFILE`: `WSA_ERROR` = 10024;
public const val `WSAEMSGSIZE`: `WSA_ERROR` = 10040;
public const val `WSAENAMETOOLONG`: `WSA_ERROR` = 10063;
public const val `WSAENETDOWN`: `WSA_ERROR` = 10050;
public const val `WSAENETRESET`: `WSA_ERROR` = 10052;
public const val `WSAENETUNREACH`: `WSA_ERROR` = 10051;
public const val `WSAENOBUFS`: `WSA_ERROR` = 10055;
public const val `WSAENOMORE`: `WSA_ERROR` = 10102;
public const val `WSAENOPROTOOPT`: `WSA_ERROR` = 10042;
public const val `WSAENOTCONN`: `WSA_ERROR` = 10057;
public const val `WSAENOTEMPTY`: `WSA_ERROR` = 10066;
public const val `WSAENOTSOCK`: `WSA_ERROR` = 10038;
public const val `WSAEOPNOTSUPP`: `WSA_ERROR` = 10045;
public const val `WSAEPFNOSUPPORT`: `WSA_ERROR` = 10046;
public const val `WSAEPROCLIM`: `WSA_ERROR` = 10067;
public const val `WSAEPROTONOSUPPORT`: `WSA_ERROR` = 10043;
public const val `WSAEPROTOTYPE`: `WSA_ERROR` = 10041;
public const val `WSAEPROVIDERFAILEDINIT`: `WSA_ERROR` = 10106;
public const val `WSAEREFUSED`: `WSA_ERROR` = 10112;
public const val `WSAEREMOTE`: `WSA_ERROR` = 10071;
public typealias `WSAESETSERVICEOP` = Int;
public const val `WSAESHUTDOWN`: `WSA_ERROR` = 10058;
public const val `WSAESOCKTNOSUPPORT`: `WSA_ERROR` = 10044;
public const val `WSAESTALE`: `WSA_ERROR` = 10070;
public const val `WSAETIMEDOUT`: `WSA_ERROR` = 10060;
public const val `WSAETOOMANYREFS`: `WSA_ERROR` = 10059;
public const val `WSAEUSERS`: `WSA_ERROR` = 10068;
public typealias `WSAEVENT` = Long;
public const val `WSAEWOULDBLOCK`: `WSA_ERROR` = 10035;
public const val `WSAHOST_NOT_FOUND`: `WSA_ERROR` = 11001;
// UNSUPPORTED Rust 5269:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_ACCEPTEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5367df1_cbac_11cf_95ca_00805f48a192);

// UNSUPPORTED Rust 5270:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_CONNECTEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25a207b9_ddf3_4660_8ee9_76e58c74063e);

// UNSUPPORTED Rust 5271:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_DISCONNECTEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fda2e11_8630_436f_a031_f536a6eec157);

// UNSUPPORTED Rust 5272:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_GETACCEPTEXSOCKADDRS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5367df2_cbac_11cf_95ca_00805f48a192);

// UNSUPPORTED Rust 5273:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_MULTIPLE_RIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8509e081_96dd_4005_b165_9e2ee8c79e3f);

// UNSUPPORTED Rust 5274:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_TRANSMITFILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5367df0_cbac_11cf_95ca_00805f48a192);

// UNSUPPORTED Rust 5275:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_TRANSMITPACKETS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd9689da0_1f90_11d3_9971_00c04f68c876);

// UNSUPPORTED Rust 5276:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_WSAPOLL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18c76f85_dc66_4964_972e_23c27238312b);

// UNSUPPORTED Rust 5277:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_WSARECVMSG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf689d7c8_6f1f_436b_8a53_e54fe351c322);

// UNSUPPORTED Rust 5278:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WSAID_WSASENDMSG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa441e712_754f_43ca_84a7_0dee44cf606d);

// UNSUPPORTED Rust 5279:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSAMSG {
//     pub name: *mut SOCKADDR,
//     pub namelen: i32,
//     pub lpBuffers: *mut WSABUF,
//     pub dwBufferCount: u32,
//     pub Control: WSABUF,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 5289:1: declaration Impl has no candidate rule
// impl Default for WSAMSG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSANAMESPACE_INFOA {
//     pub NSProviderId: windows_sys::core::GUID,
//     pub dwNameSpace: u32,
//     pub fActive: windows_sys::core::BOOL,
//     pub dwVersion: u32,
//     pub lpszIdentifier: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 5303:1: declaration Impl has no candidate rule
// impl Default for WSANAMESPACE_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct WSANAMESPACE_INFOEXA {
//     pub NSProviderId: windows_sys::core::GUID,
//     pub dwNameSpace: u32,
//     pub fActive: windows_sys::core::BOOL,
//     pub dwVersion: u32,
//     pub lpszIdentifier: windows_sys::core::PSTR,
//     pub ProviderSpecific: super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 5319:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for WSANAMESPACE_INFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct WSANAMESPACE_INFOEXW {
//     pub NSProviderId: windows_sys::core::GUID,
//     pub dwNameSpace: u32,
//     pub fActive: windows_sys::core::BOOL,
//     pub dwVersion: u32,
//     pub lpszIdentifier: windows_sys::core::PWSTR,
//     pub ProviderSpecific: super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 5336:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for WSANAMESPACE_INFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSANAMESPACE_INFOW {
//     pub NSProviderId: windows_sys::core::GUID,
//     pub dwNameSpace: u32,
//     pub fActive: windows_sys::core::BOOL,
//     pub dwVersion: u32,
//     pub lpszIdentifier: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5351:1: declaration Impl has no candidate rule
// impl Default for WSANAMESPACE_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSANETWORKEVENTS {
//     pub lNetworkEvents: i32,
//     pub iErrorCode: [i32; 10],
// }

// UNSUPPORTED Rust 5362:1: declaration Impl has no candidate rule
// impl Default for WSANETWORKEVENTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSANOTINITIALISED`: `WSA_ERROR` = 10093;
public const val `WSANO_DATA`: `WSA_ERROR` = 11004;
public const val `WSANO_RECOVERY`: `WSA_ERROR` = 11003;
// UNSUPPORTED Rust 5370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSANSCLASSINFOA {
//     pub lpszName: windows_sys::core::PSTR,
//     pub dwNameSpace: u32,
//     pub dwValueType: u32,
//     pub dwValueSize: u32,
//     pub lpValue: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5379:1: declaration Impl has no candidate rule
// impl Default for WSANSCLASSINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSANSCLASSINFOW {
//     pub lpszName: windows_sys::core::PWSTR,
//     pub dwNameSpace: u32,
//     pub dwValueType: u32,
//     pub dwValueSize: u32,
//     pub lpValue: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5393:1: declaration Impl has no candidate rule
// impl Default for WSANSCLASSINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5398:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSAPOLLDATA {
//     pub result: i32,
//     pub fds: u32,
//     pub timeout: i32,
//     pub fdArray: [WSAPOLLFD; 1],
// }

// UNSUPPORTED Rust 5406:1: declaration Impl has no candidate rule
// impl Default for WSAPOLLDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSAPOLLFD {
//     pub fd: SOCKET,
//     pub events: WSAPOLL_EVENT_FLAGS,
//     pub revents: WSAPOLL_EVENT_FLAGS,
// }

public typealias `WSAPOLL_EVENT_FLAGS` = Short;
// UNSUPPORTED Rust 5419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSAPROTOCOLCHAIN {
//     pub ChainLen: i32,
//     pub ChainEntries: [u32; 7],
// }

// UNSUPPORTED Rust 5425:1: declaration Impl has no candidate rule
// impl Default for WSAPROTOCOLCHAIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSAPROTOCOL_INFOA {
//     pub dwServiceFlags1: u32,
//     pub dwServiceFlags2: u32,
//     pub dwServiceFlags3: u32,
//     pub dwServiceFlags4: u32,
//     pub dwProviderFlags: u32,
//     pub ProviderId: windows_sys::core::GUID,
//     pub dwCatalogEntryId: u32,
//     pub ProtocolChain: WSAPROTOCOLCHAIN,
//     pub iVersion: i32,
//     pub iAddressFamily: i32,
//     pub iMaxSockAddr: i32,
//     pub iMinSockAddr: i32,
//     pub iSocketType: i32,
//     pub iProtocol: i32,
//     pub iProtocolMaxOffset: i32,
//     pub iNetworkByteOrder: i32,
//     pub iSecurityScheme: i32,
//     pub dwMessageSize: u32,
//     pub dwProviderReserved: u32,
//     pub szProtocol: [i8; 256],
// }

// UNSUPPORTED Rust 5454:1: declaration Impl has no candidate rule
// impl Default for WSAPROTOCOL_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSAPROTOCOL_INFOW {
//     pub dwServiceFlags1: u32,
//     pub dwServiceFlags2: u32,
//     pub dwServiceFlags3: u32,
//     pub dwServiceFlags4: u32,
//     pub dwProviderFlags: u32,
//     pub ProviderId: windows_sys::core::GUID,
//     pub dwCatalogEntryId: u32,
//     pub ProtocolChain: WSAPROTOCOLCHAIN,
//     pub iVersion: i32,
//     pub iAddressFamily: i32,
//     pub iMaxSockAddr: i32,
//     pub iMinSockAddr: i32,
//     pub iSocketType: i32,
//     pub iProtocol: i32,
//     pub iProtocolMaxOffset: i32,
//     pub iNetworkByteOrder: i32,
//     pub iSecurityScheme: i32,
//     pub dwMessageSize: u32,
//     pub dwProviderReserved: u32,
//     pub szProtocol: [u16; 256],
// }

// UNSUPPORTED Rust 5483:1: declaration Impl has no candidate rule
// impl Default for WSAPROTOCOL_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSAPROTOCOL_LEN`: UInt = 255u;
// UNSUPPORTED Rust 5489:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct WSAQUERYSET2A {
//     pub dwSize: u32,
//     pub lpszServiceInstanceName: windows_sys::core::PSTR,
//     pub lpVersion: *mut WSAVERSION,
//     pub lpszComment: windows_sys::core::PSTR,
//     pub dwNameSpace: u32,
//     pub lpNSProviderId: *mut windows_sys::core::GUID,
//     pub lpszContext: windows_sys::core::PSTR,
//     pub dwNumberOfProtocols: u32,
//     pub lpafpProtocols: *mut AFPROTOCOLS,
//     pub lpszQueryString: windows_sys::core::PSTR,
//     pub dwNumberOfCsAddrs: u32,
//     pub lpcsaBuffer: *mut CSADDR_INFO,
//     pub dwOutputFlags: u32,
//     pub lpBlob: *mut super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 5508:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for WSAQUERYSET2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5514:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct WSAQUERYSET2W {
//     pub dwSize: u32,
//     pub lpszServiceInstanceName: windows_sys::core::PWSTR,
//     pub lpVersion: *mut WSAVERSION,
//     pub lpszComment: windows_sys::core::PWSTR,
//     pub dwNameSpace: u32,
//     pub lpNSProviderId: *mut windows_sys::core::GUID,
//     pub lpszContext: windows_sys::core::PWSTR,
//     pub dwNumberOfProtocols: u32,
//     pub lpafpProtocols: *mut AFPROTOCOLS,
//     pub lpszQueryString: windows_sys::core::PWSTR,
//     pub dwNumberOfCsAddrs: u32,
//     pub lpcsaBuffer: *mut CSADDR_INFO,
//     pub dwOutputFlags: u32,
//     pub lpBlob: *mut super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 5533:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for WSAQUERYSET2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5539:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct WSAQUERYSETA {
//     pub dwSize: u32,
//     pub lpszServiceInstanceName: windows_sys::core::PSTR,
//     pub lpServiceClassId: *mut windows_sys::core::GUID,
//     pub lpVersion: *mut WSAVERSION,
//     pub lpszComment: windows_sys::core::PSTR,
//     pub dwNameSpace: u32,
//     pub lpNSProviderId: *mut windows_sys::core::GUID,
//     pub lpszContext: windows_sys::core::PSTR,
//     pub dwNumberOfProtocols: u32,
//     pub lpafpProtocols: *mut AFPROTOCOLS,
//     pub lpszQueryString: windows_sys::core::PSTR,
//     pub dwNumberOfCsAddrs: u32,
//     pub lpcsaBuffer: *mut CSADDR_INFO,
//     pub dwOutputFlags: u32,
//     pub lpBlob: *mut super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 5559:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for WSAQUERYSETA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5565:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct WSAQUERYSETW {
//     pub dwSize: u32,
//     pub lpszServiceInstanceName: windows_sys::core::PWSTR,
//     pub lpServiceClassId: *mut windows_sys::core::GUID,
//     pub lpVersion: *mut WSAVERSION,
//     pub lpszComment: windows_sys::core::PWSTR,
//     pub dwNameSpace: u32,
//     pub lpNSProviderId: *mut windows_sys::core::GUID,
//     pub lpszContext: windows_sys::core::PWSTR,
//     pub dwNumberOfProtocols: u32,
//     pub lpafpProtocols: *mut AFPROTOCOLS,
//     pub lpszQueryString: windows_sys::core::PWSTR,
//     pub dwNumberOfCsAddrs: u32,
//     pub lpcsaBuffer: *mut CSADDR_INFO,
//     pub dwOutputFlags: u32,
//     pub lpBlob: *mut super::super::System::Com::BLOB,
// }

// UNSUPPORTED Rust 5585:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for WSAQUERYSETW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5591:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy)]
// pub struct WSASENDMSG {
//     pub lpMsg: *mut WSAMSG,
//     pub dwFlags: u32,
//     pub lpNumberOfBytesSent: *mut u32,
//     pub lpOverlapped: *mut super::super::System::IO::OVERLAPPED,
//     pub lpCompletionRoutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE,
// }

// UNSUPPORTED Rust 5601:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WSASENDMSG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSASERVICECLASSINFOA {
//     pub lpServiceClassId: *mut windows_sys::core::GUID,
//     pub lpszServiceClassName: windows_sys::core::PSTR,
//     pub dwCount: u32,
//     pub lpClassInfos: *mut WSANSCLASSINFOA,
// }

// UNSUPPORTED Rust 5615:1: declaration Impl has no candidate rule
// impl Default for WSASERVICECLASSINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSASERVICECLASSINFOW {
//     pub lpServiceClassId: *mut windows_sys::core::GUID,
//     pub lpszServiceClassName: windows_sys::core::PWSTR,
//     pub dwCount: u32,
//     pub lpClassInfos: *mut WSANSCLASSINFOW,
// }

// UNSUPPORTED Rust 5628:1: declaration Impl has no candidate rule
// impl Default for WSASERVICECLASSINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSASERVICE_NOT_FOUND`: `WSA_ERROR` = 10108;
public const val `WSASYSCALLFAILURE`: `WSA_ERROR` = 10107;
public const val `WSASYSNOTREADY`: `WSA_ERROR` = 10091;
public const val `WSASYS_STATUS_LEN`: UInt = 128u;
// UNSUPPORTED Rust 5637:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSATHREADID {
//     pub ThreadHandle: super::super::Foundation::HANDLE,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 5643:1: declaration Impl has no candidate rule
// impl Default for WSATHREADID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSATRY_AGAIN`: `WSA_ERROR` = 11002;
public const val `WSATYPE_NOT_FOUND`: `WSA_ERROR` = 10109;
public const val `WSAVERNOTSUPPORTED`: `WSA_ERROR` = 10092;
// UNSUPPORTED Rust 5651:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSAVERSION {
//     pub dwVersion: u32,
//     pub ecHow: WSAECOMPARATOR,
// }

public typealias `WSA_COMPATIBILITY_BEHAVIOR_ID` = Int;
// UNSUPPORTED Rust 5658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSA_COMPATIBILITY_MODE {
//     pub BehaviorId: WSA_COMPATIBILITY_BEHAVIOR_ID,
//     pub TargetOsVersion: u32,
// }

public typealias `WSA_ERROR` = Int;
public const val `WSA_E_CANCELLED`: `WSA_ERROR` = 10111;
public const val `WSA_E_NO_MORE`: `WSA_ERROR` = 10110;
public const val `WSA_FLAG_ACCESS_SYSTEM_SECURITY`: UInt = 64u;
public const val `WSA_FLAG_MULTIPOINT_C_LEAF`: UInt = 4u;
public const val `WSA_FLAG_MULTIPOINT_C_ROOT`: UInt = 2u;
public const val `WSA_FLAG_MULTIPOINT_D_LEAF`: UInt = 16u;
public const val `WSA_FLAG_MULTIPOINT_D_ROOT`: UInt = 8u;
public const val `WSA_FLAG_NO_HANDLE_INHERIT`: UInt = 128u;
public const val `WSA_FLAG_OVERLAPPED`: UInt = 1u;
public const val `WSA_FLAG_REGISTERED_IO`: UInt = 256u;
public const val `WSA_INFINITE`: UInt = 4294967295u;
public const val `WSA_INVALID_EVENT`: `WSAEVENT` = 0L;
public const val `WSA_INVALID_HANDLE`: `WSA_ERROR` = 6;
public const val `WSA_INVALID_PARAMETER`: `WSA_ERROR` = 87;
public const val `WSA_IO_INCOMPLETE`: `WSA_ERROR` = 996;
public const val `WSA_IO_PENDING`: `WSA_ERROR` = 997;
public const val `WSA_IPSEC_NAME_POLICY_ERROR`: `WSA_ERROR` = 11033;
public const val `WSA_MAXIMUM_WAIT_EVENTS`: UInt = 64u;
public const val `WSA_NOT_ENOUGH_MEMORY`: `WSA_ERROR` = 8;
public const val `WSA_OPERATION_ABORTED`: `WSA_ERROR` = 995;
public const val `WSA_QOS_ADMISSION_FAILURE`: `WSA_ERROR` = 11010;
public const val `WSA_QOS_BAD_OBJECT`: `WSA_ERROR` = 11013;
public const val `WSA_QOS_BAD_STYLE`: `WSA_ERROR` = 11012;
public const val `WSA_QOS_EFILTERCOUNT`: `WSA_ERROR` = 11021;
public const val `WSA_QOS_EFILTERSTYLE`: `WSA_ERROR` = 11019;
public const val `WSA_QOS_EFILTERTYPE`: `WSA_ERROR` = 11020;
public const val `WSA_QOS_EFLOWCOUNT`: `WSA_ERROR` = 11023;
public const val `WSA_QOS_EFLOWDESC`: `WSA_ERROR` = 11026;
public const val `WSA_QOS_EFLOWSPEC`: `WSA_ERROR` = 11017;
public const val `WSA_QOS_EOBJLENGTH`: `WSA_ERROR` = 11022;
public const val `WSA_QOS_EPOLICYOBJ`: `WSA_ERROR` = 11025;
public const val `WSA_QOS_EPROVSPECBUF`: `WSA_ERROR` = 11018;
public const val `WSA_QOS_EPSFILTERSPEC`: `WSA_ERROR` = 11028;
public const val `WSA_QOS_EPSFLOWSPEC`: `WSA_ERROR` = 11027;
public const val `WSA_QOS_ESDMODEOBJ`: `WSA_ERROR` = 11029;
public const val `WSA_QOS_ESERVICETYPE`: `WSA_ERROR` = 11016;
public const val `WSA_QOS_ESHAPERATEOBJ`: `WSA_ERROR` = 11030;
public const val `WSA_QOS_EUNKOWNPSOBJ`: `WSA_ERROR` = 11024;
public const val `WSA_QOS_GENERIC_ERROR`: `WSA_ERROR` = 11015;
public const val `WSA_QOS_NO_RECEIVERS`: `WSA_ERROR` = 11008;
public const val `WSA_QOS_NO_SENDERS`: `WSA_ERROR` = 11007;
public const val `WSA_QOS_POLICY_FAILURE`: `WSA_ERROR` = 11011;
public const val `WSA_QOS_RECEIVERS`: `WSA_ERROR` = 11005;
public const val `WSA_QOS_REQUEST_CONFIRMED`: `WSA_ERROR` = 11009;
public const val `WSA_QOS_RESERVED_PETYPE`: `WSA_ERROR` = 11031;
public const val `WSA_QOS_SENDERS`: `WSA_ERROR` = 11006;
public const val `WSA_QOS_TRAFFIC_CTRL_ERROR`: `WSA_ERROR` = 11014;
public const val `WSA_SECURE_HOST_NOT_FOUND`: `WSA_ERROR` = 11032;
public const val `WSA_WAIT_EVENT_0`: `WSA_ERROR` = 0;
public const val `WSA_WAIT_FAILED`: UInt = 4294967295u;
public const val `WSA_WAIT_IO_COMPLETION`: `WSA_ERROR` = 192;
public const val `WSA_WAIT_TIMEOUT`: UInt = 258u;
// UNSUPPORTED Rust 5717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSC_PROVIDER_AUDIT_INFO {
//     pub RecordSize: u32,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5723:1: declaration Impl has no candidate rule
// impl Default for WSC_PROVIDER_AUDIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSC_PROVIDER_INFO_TYPE` = Int;
public const val `WSK_SO_BASE`: UInt = 16384u;
// UNSUPPORTED Rust 5730:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSPDATA {
//     pub wVersion: u16,
//     pub wHighVersion: u16,
//     pub szDescription: [u16; 256],
// }

// UNSUPPORTED Rust 5737:1: declaration Impl has no candidate rule
// impl Default for WSPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSPDESCRIPTION_LEN`: UInt = 255u;
// UNSUPPORTED Rust 5743:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_IO")]
// #[derive(Clone, Copy, Default)]
// pub struct WSPPROC_TABLE {
//     pub lpWSPAccept: LPWSPACCEPT,
//     pub lpWSPAddressToString: LPWSPADDRESSTOSTRING,
//     pub lpWSPAsyncSelect: LPWSPASYNCSELECT,
//     pub lpWSPBind: LPWSPBIND,
//     pub lpWSPCancelBlockingCall: LPWSPCANCELBLOCKINGCALL,
//     pub lpWSPCleanup: LPWSPCLEANUP,
//     pub lpWSPCloseSocket: LPWSPCLOSESOCKET,
//     pub lpWSPConnect: LPWSPCONNECT,
//     pub lpWSPDuplicateSocket: LPWSPDUPLICATESOCKET,
//     pub lpWSPEnumNetworkEvents: LPWSPENUMNETWORKEVENTS,
//     pub lpWSPEventSelect: LPWSPEVENTSELECT,
//     pub lpWSPGetOverlappedResult: LPWSPGETOVERLAPPEDRESULT,
//     pub lpWSPGetPeerName: LPWSPGETPEERNAME,
//     pub lpWSPGetSockName: LPWSPGETSOCKNAME,
//     pub lpWSPGetSockOpt: LPWSPGETSOCKOPT,
//     pub lpWSPGetQOSByName: LPWSPGETQOSBYNAME,
//     pub lpWSPIoctl: LPWSPIOCTL,
//     pub lpWSPJoinLeaf: LPWSPJOINLEAF,
//     pub lpWSPListen: LPWSPLISTEN,
//     pub lpWSPRecv: LPWSPRECV,
//     pub lpWSPRecvDisconnect: LPWSPRECVDISCONNECT,
//     pub lpWSPRecvFrom: LPWSPRECVFROM,
//     pub lpWSPSelect: LPWSPSELECT,
//     pub lpWSPSend: LPWSPSEND,
//     pub lpWSPSendDisconnect: LPWSPSENDDISCONNECT,
//     pub lpWSPSendTo: LPWSPSENDTO,
//     pub lpWSPSetSockOpt: LPWSPSETSOCKOPT,
//     pub lpWSPShutdown: LPWSPSHUTDOWN,
//     pub lpWSPSocket: LPWSPSOCKET,
//     pub lpWSPStringToAddress: LPWSPSTRINGTOADDRESS,
// }

// UNSUPPORTED Rust 5778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSPUPCALLTABLE {
//     pub lpWPUCloseEvent: LPWPUCLOSEEVENT,
//     pub lpWPUCloseSocketHandle: LPWPUCLOSESOCKETHANDLE,
//     pub lpWPUCreateEvent: LPWPUCREATEEVENT,
//     pub lpWPUCreateSocketHandle: LPWPUCREATESOCKETHANDLE,
//     pub lpWPUFDIsSet: LPWPUFDISSET,
//     pub lpWPUGetProviderPath: LPWPUGETPROVIDERPATH,
//     pub lpWPUModifyIFSHandle: LPWPUMODIFYIFSHANDLE,
//     pub lpWPUPostMessage: LPWPUPOSTMESSAGE,
//     pub lpWPUQueryBlockingCallback: LPWPUQUERYBLOCKINGCALLBACK,
//     pub lpWPUQuerySocketHandleContext: LPWPUQUERYSOCKETHANDLECONTEXT,
//     pub lpWPUQueueApc: LPWPUQUEUEAPC,
//     pub lpWPUResetEvent: LPWPURESETEVENT,
//     pub lpWPUSetEvent: LPWPUSETEVENT,
//     pub lpWPUOpenCurrentThread: LPWPUOPENCURRENTTHREAD,
//     pub lpWPUCloseThread: LPWPUCLOSETHREAD,
// }

public const val `WSS_OPERATION_IN_PROGRESS`: Int = 259;
public const val `WsaBehaviorAll`: `WSA_COMPATIBILITY_BEHAVIOR_ID` = 0;
public const val `WsaBehaviorAutoTuning`: `WSA_COMPATIBILITY_BEHAVIOR_ID` = 2;
public const val `WsaBehaviorReceiveBuffering`: `WSA_COMPATIBILITY_BEHAVIOR_ID` = 1;
public const val `XP1_CONNECTIONLESS`: UInt = 1u;
public const val `XP1_CONNECT_DATA`: UInt = 128u;
public const val `XP1_DISCONNECT_DATA`: UInt = 256u;
public const val `XP1_EXPEDITED_DATA`: UInt = 64u;
public const val `XP1_GRACEFUL_CLOSE`: UInt = 32u;
public const val `XP1_GUARANTEED_DELIVERY`: UInt = 2u;
public const val `XP1_GUARANTEED_ORDER`: UInt = 4u;
public const val `XP1_IFS_HANDLES`: UInt = 131072u;
public const val `XP1_INTERRUPT`: UInt = 16384u;
public const val `XP1_MESSAGE_ORIENTED`: UInt = 8u;
public const val `XP1_MULTIPOINT_CONTROL_PLANE`: UInt = 2048u;
public const val `XP1_MULTIPOINT_DATA_PLANE`: UInt = 4096u;
public const val `XP1_PARTIAL_MESSAGE`: UInt = 262144u;
public const val `XP1_PSEUDO_STREAM`: UInt = 16u;
public const val `XP1_QOS_SUPPORTED`: UInt = 8192u;
public const val `XP1_SAN_SUPPORT_SDP`: UInt = 524288u;
public const val `XP1_SUPPORT_BROADCAST`: UInt = 512u;
public const val `XP1_SUPPORT_MULTIPOINT`: UInt = 1024u;
public const val `XP1_UNI_RECV`: UInt = 65536u;
public const val `XP1_UNI_SEND`: UInt = 32768u;
public const val `XP_BANDWIDTH_ALLOCATION`: UInt = 2048u;
public const val `XP_CONNECTIONLESS`: UInt = 1u;
public const val `XP_CONNECT_DATA`: UInt = 128u;
public const val `XP_DISCONNECT_DATA`: UInt = 256u;
public const val `XP_ENCRYPTS`: UInt = 8192u;
public const val `XP_EXPEDITED_DATA`: UInt = 64u;
public const val `XP_FRAGMENTATION`: UInt = 4096u;
public const val `XP_GRACEFUL_CLOSE`: UInt = 32u;
public const val `XP_GUARANTEED_DELIVERY`: UInt = 2u;
public const val `XP_GUARANTEED_ORDER`: UInt = 4u;
public const val `XP_MESSAGE_ORIENTED`: UInt = 8u;
public const val `XP_PSEUDO_STREAM`: UInt = 16u;
public const val `XP_SUPPORTS_BROADCAST`: UInt = 512u;
public const val `XP_SUPPORTS_MULTICAST`: UInt = 1024u;
public const val `_BIG_ENDIAN`: UInt = 4321u;
public const val `_LITTLE_ENDIAN`: UInt = 1234u;
public const val `_PDP_ENDIAN`: UInt = 3412u;
public const val `_SS_MAXSIZE`: UInt = 128u;
public typealias `eWINDOW_ADVANCE_METHOD` = Int;
// UNSUPPORTED Rust 5840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct netent {
//     pub n_name: windows_sys::core::PSTR,
//     pub n_aliases: *mut *mut i8,
//     pub n_addrtype: i16,
//     pub n_net: u32,
// }

// UNSUPPORTED Rust 5848:1: declaration Impl has no candidate rule
// impl Default for netent {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5853:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union sockaddr_gen {
//     pub Address: SOCKADDR,
//     pub AddressIn: SOCKADDR_IN,
//     pub AddressIn6: sockaddr_in6_old,
// }

// UNSUPPORTED Rust 5860:1: declaration Impl has no candidate rule
// impl Default for sockaddr_gen {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct sockaddr_in6_old {
//     pub sin6_family: i16,
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: IN6_ADDR,
// }

// UNSUPPORTED Rust 5873:1: declaration Impl has no candidate rule
// impl Default for sockaddr_in6_old {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `socklen_t` = Int;
// UNSUPPORTED Rust 5879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct sockproto {
//     pub sp_family: u16,
//     pub sp_protocol: u16,
// }

// UNSUPPORTED Rust 5885:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct tcp_keepalive {
//     pub onoff: u32,
//     pub keepalivetime: u32,
//     pub keepaliveinterval: u32,
// }

