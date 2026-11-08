package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROCFn
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT

public fun interface FnCallback {
    public operator fun invoke(dwerror: UInt, dwbytes: UInt, lpoverlapped: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(lpcallerid: Long, lpcallerdata: Long, lpsqos: Long, lpgqos: Long, lpcalleeid: Long, lpcalleedata: Long, g: Long, dwcallbackdata: ULong): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(dwerror: UInt, cbtransferred: UInt, lpoverlapped: Long, dwflags: UInt)
}

public fun AcceptEx(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("mswsock.dll", "AcceptEx", longArrayOf(slistensocket.toLong(), sacceptsocket.toLong(), lpoutputbuffer, dwreceivedatalength.toLong(), dwlocaladdresslength.toLong(), dwremoteaddresslength.toLong(), lpdwbytesreceived, lpoverlapped)).toInt()
}

public fun EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "EnumProtocolsA", longArrayOf(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)).toInt()
}

public fun EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "EnumProtocolsW", longArrayOf(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)).toInt()
}

public fun FreeAddrInfoEx(paddrinfoex: Long) {
    Win32DynamicFfi.invoke("ws2_32.dll", "FreeAddrInfoEx", longArrayOf(paddrinfoex))
}

public fun FreeAddrInfoExW(paddrinfoex: Long) {
    Win32DynamicFfi.invoke("ws2_32.dll", "FreeAddrInfoExW", longArrayOf(paddrinfoex))
}

public fun FreeAddrInfoW(paddrinfo: Long) {
    Win32DynamicFfi.invoke("ws2_32.dll", "FreeAddrInfoW", longArrayOf(paddrinfo))
}

public fun GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long) {
    Win32DynamicFfi.invoke("mswsock.dll", "GetAcceptExSockaddrs", longArrayOf(lpoutputbuffer, dwreceivedatalength.toLong(), dwlocaladdresslength.toLong(), dwremoteaddresslength.toLong(), localsockaddr, localsockaddrlength, remotesockaddr, remotesockaddrlength))
}

public fun GetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetAddrInfoExA", longArrayOf(pname, pservicename, dwnamespace.toLong(), lpnspid, hints, ppresult, timeout, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine), lpnamehandle)).toInt()
}

public fun GetAddrInfoExCancel(lphandle: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetAddrInfoExCancel", longArrayOf(lphandle)).toInt()
}

public fun GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetAddrInfoExOverlappedResult", longArrayOf(lpoverlapped)).toInt()
}

public fun GetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetAddrInfoExW", longArrayOf(pname, pservicename, dwnamespace.toLong(), lpnspid, hints, ppresult, timeout, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine), lphandle)).toInt()
}

public fun GetAddrInfoW(pnodename: PCWSTR, pservicename: PCWSTR, phints: Long, ppresult: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetAddrInfoW", longArrayOf(pnodename, pservicename, phints, ppresult)).toInt()
}

public fun GetAddressByNameA(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PSTR, lpdwaliasbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetAddressByNameA", longArrayOf(dwnamespace.toLong(), lpservicetype, lpservicename, lpiprotocols, dwresolution.toLong(), lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength)).toInt()
}

public fun GetAddressByNameW(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCWSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PWSTR, lpdwaliasbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetAddressByNameW", longArrayOf(dwnamespace.toLong(), lpservicetype, lpservicename, lpiprotocols, dwresolution.toLong(), lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength)).toInt()
}

public fun GetHostNameW(name: PWSTR, namelen: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetHostNameW", longArrayOf(name, namelen.toLong())).toInt()
}

public fun GetNameByTypeA(lpservicetype: Long, lpservicename: PSTR, dwnamelength: UInt): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetNameByTypeA", longArrayOf(lpservicetype, lpservicename, dwnamelength.toLong())).toInt()
}

public fun GetNameByTypeW(lpservicetype: Long, lpservicename: PWSTR, dwnamelength: UInt): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetNameByTypeW", longArrayOf(lpservicetype, lpservicename, dwnamelength.toLong())).toInt()
}

public fun GetNameInfoW(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PWSTR, nodebuffersize: UInt, pservicebuffer: PWSTR, servicebuffersize: UInt, flags: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "GetNameInfoW", longArrayOf(psockaddr, sockaddrlength.toLong(), pnodebuffer, nodebuffersize.toLong(), pservicebuffer, servicebuffersize.toLong(), flags.toLong())).toInt()
}

public fun GetServiceA(dwnamespace: UInt, lpguid: Long, lpservicename: PCSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetServiceA", longArrayOf(dwnamespace.toLong(), lpguid, lpservicename, dwproperties.toLong(), lpbuffer, lpdwbuffersize, lpserviceasyncinfo)).toInt()
}

public fun GetServiceW(dwnamespace: UInt, lpguid: Long, lpservicename: PCWSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetServiceW", longArrayOf(dwnamespace.toLong(), lpguid, lpservicename, dwproperties.toLong(), lpbuffer, lpdwbuffersize, lpserviceasyncinfo)).toInt()
}

public fun GetTypeByNameA(lpservicename: PCSTR, lpservicetype: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetTypeByNameA", longArrayOf(lpservicename, lpservicetype)).toInt()
}

public fun GetTypeByNameW(lpservicename: PCWSTR, lpservicetype: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "GetTypeByNameW", longArrayOf(lpservicename, lpservicetype)).toInt()
}

public fun InetNtopW(family: Int, paddr: Long, pstringbuf: PWSTR, stringbufsize: ULong): PCWSTR {
    return Win32DynamicFfi.invoke("ws2_32.dll", "InetNtopW", longArrayOf(family.toLong(), paddr, pstringbuf, stringbufsize.toLong()))
}

public fun InetPtonW(family: Int, pszaddrstring: PCWSTR, paddrbuf: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "InetPtonW", longArrayOf(family.toLong(), pszaddrstring, paddrbuf)).toInt()
}

public fun ProcessSocketNotifications(completionport: HANDLE, registrationcount: UInt, registrationinfos: Long, timeoutms: UInt, completioncount: UInt, completionportentries: Long, receivedentrycount: Long): UInt {
    return Win32DynamicFfi.invoke("ws2_32.dll", "ProcessSocketNotifications", longArrayOf(completionport, registrationcount.toLong(), registrationinfos, timeoutms.toLong(), completioncount.toLong(), completionportentries, receivedentrycount)).toUInt()
}

public fun RtlEthernetAddressToStringA(addr: Long, s: PSTR): PSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEthernetAddressToStringA", longArrayOf(addr, s))
}

public fun RtlEthernetAddressToStringW(addr: Long, s: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEthernetAddressToStringW", longArrayOf(addr, s))
}

public fun RtlEthernetStringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEthernetStringToAddressA", longArrayOf(s, terminator, addr)).toInt()
}

public fun RtlEthernetStringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlEthernetStringToAddressW", longArrayOf(s, terminator, addr)).toInt()
}

public fun RtlIpv4AddressToStringA(addr: Long, s: PSTR): PSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4AddressToStringA", longArrayOf(addr, s))
}

public fun RtlIpv4AddressToStringExA(address: Long, port: UShort, addressstring: PSTR, addressstringlength: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4AddressToStringExA", longArrayOf(address, port.toLong(), addressstring, addressstringlength)).toInt()
}

public fun RtlIpv4AddressToStringExW(address: Long, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4AddressToStringExW", longArrayOf(address, port.toLong(), addressstring, addressstringlength)).toInt()
}

public fun RtlIpv4AddressToStringW(addr: Long, s: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4AddressToStringW", longArrayOf(addr, s))
}

public fun RtlIpv4StringToAddressA(s: PCSTR, strict: Boolean, terminator: Long, addr: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4StringToAddressA", longArrayOf(s, if (strict) 1L else 0L, terminator, addr)).toInt()
}

public fun RtlIpv4StringToAddressExA(addressstring: PCSTR, strict: Boolean, address: Long, port: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4StringToAddressExA", longArrayOf(addressstring, if (strict) 1L else 0L, address, port)).toInt()
}

public fun RtlIpv4StringToAddressExW(addressstring: PCWSTR, strict: Boolean, address: Long, port: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4StringToAddressExW", longArrayOf(addressstring, if (strict) 1L else 0L, address, port)).toInt()
}

public fun RtlIpv4StringToAddressW(s: PCWSTR, strict: Boolean, terminator: Long, addr: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv4StringToAddressW", longArrayOf(s, if (strict) 1L else 0L, terminator, addr)).toInt()
}

public fun RtlIpv6AddressToStringA(addr: Long, s: PSTR): PSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6AddressToStringA", longArrayOf(addr, s))
}

public fun RtlIpv6AddressToStringExA(address: Long, scopeid: UInt, port: UShort, addressstring: PSTR, addressstringlength: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6AddressToStringExA", longArrayOf(address, scopeid.toLong(), port.toLong(), addressstring, addressstringlength)).toInt()
}

public fun RtlIpv6AddressToStringExW(address: Long, scopeid: UInt, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6AddressToStringExW", longArrayOf(address, scopeid.toLong(), port.toLong(), addressstring, addressstringlength)).toInt()
}

public fun RtlIpv6AddressToStringW(addr: Long, s: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6AddressToStringW", longArrayOf(addr, s))
}

public fun RtlIpv6StringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6StringToAddressA", longArrayOf(s, terminator, addr)).toInt()
}

public fun RtlIpv6StringToAddressExA(addressstring: PCSTR, address: Long, scopeid: Long, port: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6StringToAddressExA", longArrayOf(addressstring, address, scopeid, port)).toInt()
}

public fun RtlIpv6StringToAddressExW(addressstring: PCWSTR, address: Long, scopeid: Long, port: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6StringToAddressExW", longArrayOf(addressstring, address, scopeid, port)).toInt()
}

public fun RtlIpv6StringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlIpv6StringToAddressW", longArrayOf(s, terminator, addr)).toInt()
}

public fun SetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "SetAddrInfoExA", longArrayOf(pname, pservicename, paddresses, dwaddresscount.toLong(), lpblob, dwflags.toLong(), dwnamespace.toLong(), lpnspid, timeout, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine), lpnamehandle)).toInt()
}

public fun SetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "SetAddrInfoExW", longArrayOf(pname, pservicename, paddresses, dwaddresscount.toLong(), lpblob, dwflags.toLong(), dwnamespace.toLong(), lpnspid, timeout, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine), lpnamehandle)).toInt()
}

public fun SetServiceA(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "SetServiceA", longArrayOf(dwnamespace.toLong(), dwoperation.toLong(), dwflags.toLong(), lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags)).toInt()
}

public fun SetServiceW(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "SetServiceW", longArrayOf(dwnamespace.toLong(), dwoperation.toLong(), dwflags.toLong(), lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags)).toInt()
}

public fun SetSocketMediaStreamingMode(value: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("windows.networking.dll", "SetSocketMediaStreamingMode", longArrayOf(value.toLong())).toInt()
}

public fun TransmitFile(hsocket: SOCKET, hfile: HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("mswsock.dll", "TransmitFile", longArrayOf(hsocket.toLong(), hfile, nnumberofbytestowrite.toLong(), nnumberofbytespersend.toLong(), lpoverlapped, lptransmitbuffers, dwreserved.toLong())).toInt()
}

public fun WPUCompleteOverlappedRequest(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WPUCompleteOverlappedRequest", longArrayOf(s.toLong(), lpoverlapped, dwerror.toLong(), cbtransferred.toLong(), lperrno)).toInt()
}

public fun WSAAccept(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong): SOCKET {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAccept", longArrayOf(s.toLong(), addr, addrlen, Win32DynamicFfi.objectSlot(lpfncondition), dwcallbackdata.toLong())).toULong()
}

public fun WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PSTR, lpdwaddressstringlength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAddressToStringA", longArrayOf(lpsaaddress, dwaddresslength.toLong(), lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength)).toInt()
}

public fun WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAddressToStringW", longArrayOf(lpsaaddress, dwaddresslength.toLong(), lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength)).toInt()
}

public fun WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAdvertiseProvider", longArrayOf(puuidproviderid, pnspv2routine)).toInt()
}

public fun WSAAsyncGetHostByAddr(hwnd: HWND, wmsg: UInt, addr: PCSTR, len: Int, type: Int, buf: PSTR, buflen: Int): HANDLE {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncGetHostByAddr", longArrayOf(hwnd, wmsg.toLong(), addr, len.toLong(), type.toLong(), buf, buflen.toLong()))
}

public fun WSAAsyncGetHostByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncGetHostByName", longArrayOf(hwnd, wmsg.toLong(), name, buf, buflen.toLong()))
}

public fun WSAAsyncGetProtoByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncGetProtoByName", longArrayOf(hwnd, wmsg.toLong(), name, buf, buflen.toLong()))
}

public fun WSAAsyncGetProtoByNumber(hwnd: HWND, wmsg: UInt, number: Int, buf: PSTR, buflen: Int): HANDLE {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncGetProtoByNumber", longArrayOf(hwnd, wmsg.toLong(), number.toLong(), buf, buflen.toLong()))
}

public fun WSAAsyncGetServByName(hwnd: HWND, wmsg: UInt, name: PCSTR, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncGetServByName", longArrayOf(hwnd, wmsg.toLong(), name, proto, buf, buflen.toLong()))
}

public fun WSAAsyncGetServByPort(hwnd: HWND, wmsg: UInt, port: Int, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncGetServByPort", longArrayOf(hwnd, wmsg.toLong(), port.toLong(), proto, buf, buflen.toLong()))
}

public fun WSAAsyncSelect(s: SOCKET, hwnd: HWND, wmsg: UInt, levent: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAAsyncSelect", longArrayOf(s.toLong(), hwnd, wmsg.toLong(), levent.toLong())).toInt()
}

public fun WSACancelAsyncRequest(hasynctaskhandle: HANDLE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSACancelAsyncRequest", longArrayOf(hasynctaskhandle)).toInt()
}

public fun WSACancelBlockingCall(): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSACancelBlockingCall", longArrayOf()).toInt()
}

public fun WSACleanup(): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSACleanup", longArrayOf()).toInt()
}

public fun WSACloseEvent(hevent: WSAEVENT): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSACloseEvent", longArrayOf(hevent)).toInt()
}

public fun WSAConnect(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAConnect", longArrayOf(s.toLong(), name, namelen.toLong(), lpcallerdata, lpcalleedata, lpsqos, lpgqos)).toInt()
}

public fun WSAConnectByList(s: SOCKET, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAConnectByList", longArrayOf(s.toLong(), socketaddress, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved)).toInt()
}

public fun WSAConnectByNameA(s: SOCKET, nodename: PCSTR, servicename: PCSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAConnectByNameA", longArrayOf(s.toLong(), nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved)).toInt()
}

public fun WSAConnectByNameW(s: SOCKET, nodename: PCWSTR, servicename: PCWSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAConnectByNameW", longArrayOf(s.toLong(), nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved)).toInt()
}

public fun WSACreateEvent(): WSAEVENT {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSACreateEvent", longArrayOf())
}

public fun WSADeleteSocketPeerTargetName(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "WSADeleteSocketPeerTargetName", longArrayOf(socket.toLong(), peeraddr, peeraddrlen.toLong(), overlapped, Win32DynamicFfi.objectSlot(completionroutine))).toInt()
}

public fun WSADuplicateSocketA(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSADuplicateSocketA", longArrayOf(s.toLong(), dwprocessid.toLong(), lpprotocolinfo)).toInt()
}

public fun WSADuplicateSocketW(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSADuplicateSocketW", longArrayOf(s.toLong(), dwprocessid.toLong(), lpprotocolinfo)).toInt()
}

public fun WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumNameSpaceProvidersA", longArrayOf(lpdwbufferlength, lpnspbuffer)).toInt()
}

public fun WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumNameSpaceProvidersExA", longArrayOf(lpdwbufferlength, lpnspbuffer)).toInt()
}

public fun WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumNameSpaceProvidersExW", longArrayOf(lpdwbufferlength, lpnspbuffer)).toInt()
}

public fun WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumNameSpaceProvidersW", longArrayOf(lpdwbufferlength, lpnspbuffer)).toInt()
}

public fun WSAEnumNetworkEvents(s: SOCKET, heventobject: WSAEVENT, lpnetworkevents: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumNetworkEvents", longArrayOf(s.toLong(), heventobject, lpnetworkevents)).toInt()
}

public fun WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumProtocolsA", longArrayOf(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)).toInt()
}

public fun WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEnumProtocolsW", longArrayOf(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)).toInt()
}

public fun WSAEventSelect(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAEventSelect", longArrayOf(s.toLong(), heventobject, lnetworkevents.toLong())).toInt()
}

public fun WSAGetLastError(): WSA_ERROR {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetLastError", longArrayOf()).toInt()
}

public fun WSAGetOverlappedResult(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetOverlappedResult", longArrayOf(s.toLong(), lpoverlapped, lpcbtransfer, fwait.toLong(), lpdwflags)).toInt()
}

public fun WSAGetQOSByName(s: SOCKET, lpqosname: Long, lpqos: Long): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetQOSByName", longArrayOf(s.toLong(), lpqosname, lpqos)).toInt()
}

public fun WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetServiceClassInfoA", longArrayOf(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo)).toInt()
}

public fun WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetServiceClassInfoW", longArrayOf(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo)).toInt()
}

public fun WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: PSTR, lpdwbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetServiceClassNameByClassIdA", longArrayOf(lpserviceclassid, lpszserviceclassname, lpdwbufferlength)).toInt()
}

public fun WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: PWSTR, lpdwbufferlength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAGetServiceClassNameByClassIdW", longArrayOf(lpserviceclassid, lpszserviceclassname, lpdwbufferlength)).toInt()
}

public fun WSAHtonl(s: SOCKET, hostlong: UInt, lpnetlong: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAHtonl", longArrayOf(s.toLong(), hostlong.toLong(), lpnetlong)).toInt()
}

public fun WSAHtons(s: SOCKET, hostshort: UShort, lpnetshort: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAHtons", longArrayOf(s.toLong(), hostshort.toLong(), lpnetshort)).toInt()
}

public fun WSAImpersonateSocketPeer(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt): Int {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "WSAImpersonateSocketPeer", longArrayOf(socket.toLong(), peeraddr, peeraddrlen.toLong())).toInt()
}

public fun WSAInstallServiceClassA(lpserviceclassinfo: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAInstallServiceClassA", longArrayOf(lpserviceclassinfo)).toInt()
}

public fun WSAInstallServiceClassW(lpserviceclassinfo: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAInstallServiceClassW", longArrayOf(lpserviceclassinfo)).toInt()
}

public fun WSAIoctl(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAIoctl", longArrayOf(s.toLong(), dwiocontrolcode.toLong(), lpvinbuffer, cbinbuffer.toLong(), lpvoutbuffer, cboutbuffer.toLong(), lpcbbytesreturned, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSAIsBlocking(): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAIsBlocking", longArrayOf()).toInt()
}

public fun WSAJoinLeaf(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt): SOCKET {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAJoinLeaf", longArrayOf(s.toLong(), name, namelen.toLong(), lpcallerdata, lpcalleedata, lpsqos, lpgqos, dwflags.toLong())).toULong()
}

public fun WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSALookupServiceBeginA", longArrayOf(lpqsrestrictions, dwcontrolflags.toLong(), lphlookup)).toInt()
}

public fun WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSALookupServiceBeginW", longArrayOf(lpqsrestrictions, dwcontrolflags.toLong(), lphlookup)).toInt()
}

public fun WSALookupServiceEnd(hlookup: HANDLE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSALookupServiceEnd", longArrayOf(hlookup)).toInt()
}

public fun WSALookupServiceNextA(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSALookupServiceNextA", longArrayOf(hlookup, dwcontrolflags.toLong(), lpdwbufferlength, lpqsresults)).toInt()
}

public fun WSALookupServiceNextW(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSALookupServiceNextW", longArrayOf(hlookup, dwcontrolflags.toLong(), lpdwbufferlength, lpqsresults)).toInt()
}

public fun WSANSPIoctl(hlookup: HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSANSPIoctl", longArrayOf(hlookup, dwcontrolcode.toLong(), lpvinbuffer, cbinbuffer.toLong(), lpvoutbuffer, cboutbuffer.toLong(), lpcbbytesreturned, lpcompletion)).toInt()
}

public fun WSANtohl(s: SOCKET, netlong: UInt, lphostlong: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSANtohl", longArrayOf(s.toLong(), netlong.toLong(), lphostlong)).toInt()
}

public fun WSANtohs(s: SOCKET, netshort: UShort, lphostshort: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSANtohs", longArrayOf(s.toLong(), netshort.toLong(), lphostshort)).toInt()
}

public fun WSAPoll(fdarray: Long, fds: UInt, timeout: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAPoll", longArrayOf(fdarray, fds.toLong(), timeout.toLong())).toInt()
}

public fun WSAProviderCompleteAsyncCall(hasynccall: HANDLE, iretcode: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAProviderCompleteAsyncCall", longArrayOf(hasynccall, iretcode.toLong())).toInt()
}

public fun WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAProviderConfigChange", longArrayOf(lpnotificationhandle, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSAQuerySocketSecurity(socket: SOCKET, securityquerytemplate: Long, securityquerytemplatelen: UInt, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "WSAQuerySocketSecurity", longArrayOf(socket.toLong(), securityquerytemplate, securityquerytemplatelen.toLong(), securityqueryinfo, securityqueryinfolen, overlapped, Win32DynamicFfi.objectSlot(completionroutine))).toInt()
}

public fun WSARecv(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSARecv", longArrayOf(s.toLong(), lpbuffers, dwbuffercount.toLong(), lpnumberofbytesrecvd, lpflags, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSARecvDisconnect(s: SOCKET, lpinbounddisconnectdata: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSARecvDisconnect", longArrayOf(s.toLong(), lpinbounddisconnectdata)).toInt()
}

public fun WSARecvEx(s: SOCKET, buf: PSTR, len: Int, flags: Long): Int {
    return Win32DynamicFfi.invoke("mswsock.dll", "WSARecvEx", longArrayOf(s.toLong(), buf, len.toLong(), flags)).toInt()
}

public fun WSARecvFrom(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSARecvFrom", longArrayOf(s.toLong(), lpbuffers, dwbuffercount.toLong(), lpnumberofbytesrecvd, lpflags, lpfrom, lpfromlen, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSARemoveServiceClass(lpserviceclassid: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSARemoveServiceClass", longArrayOf(lpserviceclassid)).toInt()
}

public fun WSAResetEvent(hevent: WSAEVENT): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAResetEvent", longArrayOf(hevent)).toInt()
}

public fun WSARevertImpersonation(): Int {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "WSARevertImpersonation", longArrayOf()).toInt()
}

public fun WSASend(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASend", longArrayOf(s.toLong(), lpbuffers, dwbuffercount.toLong(), lpnumberofbytessent, dwflags.toLong(), lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSASendDisconnect(s: SOCKET, lpoutbounddisconnectdata: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASendDisconnect", longArrayOf(s.toLong(), lpoutbounddisconnectdata)).toInt()
}

public fun WSASendMsg(handle: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASendMsg", longArrayOf(handle.toLong(), lpmsg, dwflags.toLong(), lpnumberofbytessent, lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSASendTo(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASendTo", longArrayOf(s.toLong(), lpbuffers, dwbuffercount.toLong(), lpnumberofbytessent, dwflags.toLong(), lpto, itolen.toLong(), lpoverlapped, Win32DynamicFfi.objectSlot(lpcompletionroutine))).toInt()
}

public fun WSASetBlockingHook(lpblockfunc: FARPROC): FARPROC {
    val rawRet = Win32DynamicFfi.invoke("ws2_32.dll", "WSASetBlockingHook", longArrayOf(Win32DynamicFfi.objectSlot(lpblockfunc)))
    return if (rawRet == 0L) null else FARPROCFn { Win32DynamicFfi.invokePtr(rawRet, longArrayOf()) }
}

public fun WSASetEvent(hevent: WSAEVENT): BOOL {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASetEvent", longArrayOf(hevent)).toInt()
}

public fun WSASetLastError(ierror: Int) {
    Win32DynamicFfi.invoke("ws2_32.dll", "WSASetLastError", longArrayOf(ierror.toLong()))
}

public fun WSASetServiceA(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASetServiceA", longArrayOf(lpqsreginfo, essoperation.toLong(), dwcontrolflags.toLong())).toInt()
}

public fun WSASetServiceW(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASetServiceW", longArrayOf(lpqsreginfo, essoperation.toLong(), dwcontrolflags.toLong())).toInt()
}

public fun WSASetSocketPeerTargetName(socket: SOCKET, peertargetname: Long, peertargetnamelen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "WSASetSocketPeerTargetName", longArrayOf(socket.toLong(), peertargetname, peertargetnamelen.toLong(), overlapped, Win32DynamicFfi.objectSlot(completionroutine))).toInt()
}

public fun WSASetSocketSecurity(socket: SOCKET, securitysettings: Long, securitysettingslen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "WSASetSocketSecurity", longArrayOf(socket.toLong(), securitysettings, securitysettingslen.toLong(), overlapped, Win32DynamicFfi.objectSlot(completionroutine))).toInt()
}

public fun WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASocketA", longArrayOf(af.toLong(), type.toLong(), protocol.toLong(), lpprotocolinfo, g.toLong(), dwflags.toLong())).toULong()
}

public fun WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSASocketW", longArrayOf(af.toLong(), type.toLong(), protocol.toLong(), lpprotocolinfo, g.toLong(), dwflags.toLong())).toULong()
}

public fun WSAStartup(wversionrequested: UShort, lpwsadata: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAStartup", longArrayOf(wversionrequested.toLong(), lpwsadata)).toInt()
}

public fun WSAStringToAddressA(addressstring: PCSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAStringToAddressA", longArrayOf(addressstring, addressfamily.toLong(), lpprotocolinfo, lpaddress, lpaddresslength)).toInt()
}

public fun WSAStringToAddressW(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAStringToAddressW", longArrayOf(addressstring, addressfamily.toLong(), lpprotocolinfo, lpaddress, lpaddresslength)).toInt()
}

public fun WSAUnadvertiseProvider(puuidproviderid: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAUnadvertiseProvider", longArrayOf(puuidproviderid)).toInt()
}

public fun WSAUnhookBlockingHook(): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAUnhookBlockingHook", longArrayOf()).toInt()
}

public fun WSAWaitForMultipleEvents(cevents: UInt, lphevents: Long, fwaitall: BOOL, dwtimeout: UInt, falertable: BOOL): WAIT_EVENT {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSAWaitForMultipleEvents", longArrayOf(cevents.toLong(), lphevents, fwaitall.toLong(), dwtimeout.toLong(), falertable.toLong())).toUInt()
}

public fun WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCDeinstallProvider", longArrayOf(lpproviderid, lperrno)).toInt()
}

public fun WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCDeinstallProvider32", longArrayOf(lpproviderid, lperrno)).toInt()
}

public fun WSCEnableNSProvider(lpproviderid: Long, fenable: BOOL): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCEnableNSProvider", longArrayOf(lpproviderid, fenable.toLong())).toInt()
}

public fun WSCEnableNSProvider32(lpproviderid: Long, fenable: BOOL): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCEnableNSProvider32", longArrayOf(lpproviderid, fenable.toLong())).toInt()
}

public fun WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCEnumNameSpaceProviders32", longArrayOf(lpdwbufferlength, lpnspbuffer)).toInt()
}

public fun WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCEnumNameSpaceProvidersEx32", longArrayOf(lpdwbufferlength, lpnspbuffer)).toInt()
}

public fun WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCEnumProtocols", longArrayOf(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno)).toInt()
}

public fun WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCEnumProtocols32", longArrayOf(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno)).toInt()
}

public fun WSCGetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, ppermittedlspcategories: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCGetApplicationCategory", longArrayOf(path, pathlength.toLong(), extra, extralength.toLong(), ppermittedlspcategories, lperrno)).toInt()
}

public fun WSCGetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCGetProviderInfo", longArrayOf(lpproviderid, infotype.toLong(), info, infosize, flags.toLong(), lperrno)).toInt()
}

public fun WSCGetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCGetProviderInfo32", longArrayOf(lpproviderid, infotype.toLong(), info, infosize, flags.toLong(), lperrno)).toInt()
}

public fun WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCGetProviderPath", longArrayOf(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno)).toInt()
}

public fun WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCGetProviderPath32", longArrayOf(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno)).toInt()
}

public fun WSCInstallNameSpace(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallNameSpace", longArrayOf(lpszidentifier, lpszpathname, dwnamespace.toLong(), dwversion.toLong(), lpproviderid)).toInt()
}

public fun WSCInstallNameSpace32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallNameSpace32", longArrayOf(lpszidentifier, lpszpathname, dwnamespace.toLong(), dwversion.toLong(), lpproviderid)).toInt()
}

public fun WSCInstallNameSpaceEx(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallNameSpaceEx", longArrayOf(lpszidentifier, lpszpathname, dwnamespace.toLong(), dwversion.toLong(), lpproviderid, lpproviderspecific)).toInt()
}

public fun WSCInstallNameSpaceEx32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallNameSpaceEx32", longArrayOf(lpszidentifier, lpszpathname, dwnamespace.toLong(), dwversion.toLong(), lpproviderid, lpproviderspecific)).toInt()
}

public fun WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallProvider", longArrayOf(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toLong(), lperrno)).toInt()
}

public fun WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallProvider64_32", longArrayOf(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toLong(), lperrno)).toInt()
}

public fun WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpszproviderdllpath32: PCWSTR, lpszlspname: PCWSTR, dwserviceflags: UInt, lpprotocolinfolist: Long, dwnumberofentries: UInt, lpdwcatalogentryid: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCInstallProviderAndChains64_32", longArrayOf(lpproviderid, lpszproviderdllpath, lpszproviderdllpath32, lpszlspname, dwserviceflags.toLong(), lpprotocolinfolist, dwnumberofentries.toLong(), lpdwcatalogentryid, lperrno)).toInt()
}

public fun WSCSetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: Long, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCSetApplicationCategory", longArrayOf(path, pathlength.toLong(), extra, extralength.toLong(), permittedlspcategories.toLong(), pprevpermlspcat, lperrno)).toInt()
}

public fun WSCSetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCSetProviderInfo", longArrayOf(lpproviderid, infotype.toLong(), info, infosize.toLong(), flags.toLong(), lperrno)).toInt()
}

public fun WSCSetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCSetProviderInfo32", longArrayOf(lpproviderid, infotype.toLong(), info, infosize.toLong(), flags.toLong(), lperrno)).toInt()
}

public fun WSCUnInstallNameSpace(lpproviderid: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCUnInstallNameSpace", longArrayOf(lpproviderid)).toInt()
}

public fun WSCUnInstallNameSpace32(lpproviderid: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCUnInstallNameSpace32", longArrayOf(lpproviderid)).toInt()
}

public fun WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCUpdateProvider", longArrayOf(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toLong(), lperrno)).toInt()
}

public fun WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCUpdateProvider32", longArrayOf(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toLong(), lperrno)).toInt()
}

public fun WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: UInt): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCWriteNameSpaceOrder", longArrayOf(lpproviderid, dwnumberofentries.toLong())).toInt()
}

public fun WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: UInt): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCWriteNameSpaceOrder32", longArrayOf(lpproviderid, dwnumberofentries.toLong())).toInt()
}

public fun WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCWriteProviderOrder", longArrayOf(lpwdcatalogentryid, dwnumberofentries.toLong())).toInt()
}

public fun WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "WSCWriteProviderOrder32", longArrayOf(lpwdcatalogentryid, dwnumberofentries.toLong())).toInt()
}

public fun __WSAFDIsSet(fd: SOCKET, param1: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "__WSAFDIsSet", longArrayOf(fd.toLong(), param1)).toInt()
}

public fun accept(s: SOCKET, addr: Long, addrlen: Long): SOCKET {
    return Win32DynamicFfi.invoke("ws2_32.dll", "accept", longArrayOf(s.toLong(), addr, addrlen)).toULong()
}

public fun bind(s: SOCKET, name: Long, namelen: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "bind", longArrayOf(s.toLong(), name, namelen.toLong())).toInt()
}

public fun closesocket(s: SOCKET): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "closesocket", longArrayOf(s.toLong())).toInt()
}

public fun connect(s: SOCKET, name: Long, namelen: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "connect", longArrayOf(s.toLong(), name, namelen.toLong())).toInt()
}

public fun freeaddrinfo(paddrinfo: Long) {
    Win32DynamicFfi.invoke("ws2_32.dll", "freeaddrinfo", longArrayOf(paddrinfo))
}

public fun getaddrinfo(pnodename: PCSTR, pservicename: PCSTR, phints: Long, ppresult: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getaddrinfo", longArrayOf(pnodename, pservicename, phints, ppresult)).toInt()
}

public fun gethostbyaddr(addr: PCSTR, len: Int, type: Int): Long {
    return Win32DynamicFfi.invoke("ws2_32.dll", "gethostbyaddr", longArrayOf(addr, len.toLong(), type.toLong()))
}

public fun gethostbyname(name: PCSTR): Long {
    return Win32DynamicFfi.invoke("ws2_32.dll", "gethostbyname", longArrayOf(name))
}

public fun gethostname(name: PSTR, namelen: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "gethostname", longArrayOf(name, namelen.toLong())).toInt()
}

public fun getnameinfo(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PSTR, nodebuffersize: UInt, pservicebuffer: PSTR, servicebuffersize: UInt, flags: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getnameinfo", longArrayOf(psockaddr, sockaddrlength.toLong(), pnodebuffer, nodebuffersize.toLong(), pservicebuffer, servicebuffersize.toLong(), flags.toLong())).toInt()
}

public fun getpeername(s: SOCKET, name: Long, namelen: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getpeername", longArrayOf(s.toLong(), name, namelen)).toInt()
}

public fun getprotobyname(name: PCSTR): Long {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getprotobyname", longArrayOf(name))
}

public fun getprotobynumber(number: Int): Long {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getprotobynumber", longArrayOf(number.toLong()))
}

public fun getservbyname(name: PCSTR, proto: PCSTR): Long {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getservbyname", longArrayOf(name, proto))
}

public fun getservbyport(port: Int, proto: PCSTR): Long {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getservbyport", longArrayOf(port.toLong(), proto))
}

public fun getsockname(s: SOCKET, name: Long, namelen: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getsockname", longArrayOf(s.toLong(), name, namelen)).toInt()
}

public fun getsockopt(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "getsockopt", longArrayOf(s.toLong(), level.toLong(), optname.toLong(), optval, optlen)).toInt()
}

public fun htonl(hostlong: UInt): UInt {
    return Win32DynamicFfi.invoke("ws2_32.dll", "htonl", longArrayOf(hostlong.toLong())).toUInt()
}

public fun htons(hostshort: UShort): UShort {
    return Win32DynamicFfi.invoke("ws2_32.dll", "htons", longArrayOf(hostshort.toLong())).toUShort()
}

public fun inet_addr(cp: PCSTR): UInt {
    return Win32DynamicFfi.invoke("ws2_32.dll", "inet_addr", longArrayOf(cp)).toUInt()
}

public fun inet_ntoa(input: IN_ADDR): PSTR {
    return Win32DynamicFfi.invoke("ws2_32.dll", "inet_ntoa", longArrayOf((((input.S_un.S_un_b.s_b1.toLong() and 0xFFL) or ((input.S_un.S_un_b.s_b2.toLong() and 0xFFL) shl 8) or ((input.S_un.S_un_b.s_b3.toLong() and 0xFFL) shl 16) or ((input.S_un.S_un_b.s_b4.toLong() and 0xFFL) shl 24)) or ((input.S_un.S_un_w.s_w1.toLong() and 0xFFFFL) or ((input.S_un.S_un_w.s_w2.toLong() and 0xFFFFL) shl 16)) or (input.S_un.S_addr.toLong() and 0xFFFF_FFFFL))))
}

public fun inet_ntop(family: Int, paddr: Long, pstringbuf: PSTR, stringbufsize: ULong): PCSTR {
    return Win32DynamicFfi.invoke("ws2_32.dll", "inet_ntop", longArrayOf(family.toLong(), paddr, pstringbuf, stringbufsize.toLong()))
}

public fun inet_pton(family: Int, pszaddrstring: PCSTR, paddrbuf: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "inet_pton", longArrayOf(family.toLong(), pszaddrstring, paddrbuf)).toInt()
}

public fun ioctlsocket(s: SOCKET, cmd: Int, argp: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "ioctlsocket", longArrayOf(s.toLong(), cmd.toLong(), argp)).toInt()
}

public fun listen(s: SOCKET, backlog: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "listen", longArrayOf(s.toLong(), backlog.toLong())).toInt()
}

public fun ntohl(netlong: UInt): UInt {
    return Win32DynamicFfi.invoke("ws2_32.dll", "ntohl", longArrayOf(netlong.toLong())).toUInt()
}

public fun ntohs(netshort: UShort): UShort {
    return Win32DynamicFfi.invoke("ws2_32.dll", "ntohs", longArrayOf(netshort.toLong())).toUShort()
}

public fun recv(s: SOCKET, buf: PSTR, len: Int, flags: SEND_RECV_FLAGS): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "recv", longArrayOf(s.toLong(), buf, len.toLong(), flags.toLong())).toInt()
}

public fun recvfrom(s: SOCKET, buf: PSTR, len: Int, flags: Int, from: Long, fromlen: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "recvfrom", longArrayOf(s.toLong(), buf, len.toLong(), flags.toLong(), from, fromlen)).toInt()
}

public fun select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "select", longArrayOf(nfds.toLong(), readfds, writefds, exceptfds, timeout)).toInt()
}

public fun send(s: SOCKET, buf: PCSTR, len: Int, flags: SEND_RECV_FLAGS): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "send", longArrayOf(s.toLong(), buf, len.toLong(), flags.toLong())).toInt()
}

public fun sendto(s: SOCKET, buf: PCSTR, len: Int, flags: Int, to: Long, tolen: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "sendto", longArrayOf(s.toLong(), buf, len.toLong(), flags.toLong(), to, tolen.toLong())).toInt()
}

public fun setsockopt(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "setsockopt", longArrayOf(s.toLong(), level.toLong(), optname.toLong(), optval, optlen.toLong())).toInt()
}

public fun shutdown(s: SOCKET, how: WINSOCK_SHUTDOWN_HOW): Int {
    return Win32DynamicFfi.invoke("ws2_32.dll", "shutdown", longArrayOf(s.toLong(), how.toLong())).toInt()
}

public fun socket(af: Int, type: WINSOCK_SOCKET_TYPE, protocol: Int): SOCKET {
    return Win32DynamicFfi.invoke("ws2_32.dll", "socket", longArrayOf(af.toLong(), type.toLong(), protocol.toLong())).toULong()
}
