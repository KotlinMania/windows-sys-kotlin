@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AcceptEx(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_AcceptEx(slistensocket, sacceptsocket, lpoutputbuffer.toCPointer<ByteVar>(), dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, lpdwbytesreceived.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_EnumProtocolsA(lpiprotocols.toCPointer<ByteVar>(), lpprotocolbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_EnumProtocolsW(lpiprotocols.toCPointer<ByteVar>(), lpprotocolbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun FreeAddrInfoEx(paddrinfoex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_FreeAddrInfoEx(paddrinfoex.toCPointer<ByteVar>())
}

public actual fun FreeAddrInfoExW(paddrinfoex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_FreeAddrInfoExW(paddrinfoex.toCPointer<ByteVar>())
}

public actual fun FreeAddrInfoW(paddrinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_FreeAddrInfoW(paddrinfo.toCPointer<ByteVar>())
}

public actual fun GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs(lpoutputbuffer.toCPointer<ByteVar>(), dwreceivedatalength, dwlocaladdresslength, dwremoteaddresslength, localsockaddr.toCPointer<ByteVar>(), localsockaddrlength.toCPointer<ByteVar>(), remotesockaddr.toCPointer<ByteVar>(), remotesockaddrlength.toCPointer<ByteVar>())
}

public actual fun GetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddrInfoExA(pname.toCPointer<ByteVar>(), pservicename.toCPointer<ByteVar>(), dwnamespace, lpnspid.toCPointer<ByteVar>(), hints.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>(), lpnamehandle.toCPointer<ByteVar>())

public actual fun GetAddrInfoExCancel(lphandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel(lphandle.toCPointer<ByteVar>())

public actual fun GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult(lpoverlapped.toCPointer<ByteVar>())

public actual fun GetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddrInfoExW(pname.toCPointer<ByteVar>(), pservicename.toCPointer<ByteVar>(), dwnamespace, lpnspid.toCPointer<ByteVar>(), hints.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>(), lphandle.toCPointer<ByteVar>())

public actual fun GetAddrInfoW(pnodename: PCWSTR, pservicename: PCWSTR, phints: Long, ppresult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddrInfoW(pnodename.toCPointer<ByteVar>(), pservicename.toCPointer<ByteVar>(), phints.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun GetAddressByNameA(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PSTR, lpdwaliasbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddressByNameA(dwnamespace, lpservicetype.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpiprotocols.toCPointer<ByteVar>(), dwresolution, lpserviceasyncinfo.toCPointer<ByteVar>(), lpcsaddrbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lpaliasbuffer.toCPointer<ByteVar>(), lpdwaliasbufferlength.toCPointer<ByteVar>())

public actual fun GetAddressByNameW(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCWSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PWSTR, lpdwaliasbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetAddressByNameW(dwnamespace, lpservicetype.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpiprotocols.toCPointer<ByteVar>(), dwresolution, lpserviceasyncinfo.toCPointer<ByteVar>(), lpcsaddrbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lpaliasbuffer.toCPointer<ByteVar>(), lpdwaliasbufferlength.toCPointer<ByteVar>())

public actual fun GetHostNameW(name: PWSTR, namelen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetHostNameW(name.toCPointer<ByteVar>(), namelen)

public actual fun GetNameByTypeA(lpservicetype: Long, lpservicename: PSTR, dwnamelength: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetNameByTypeA(lpservicetype.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), dwnamelength)

public actual fun GetNameByTypeW(lpservicetype: Long, lpservicename: PWSTR, dwnamelength: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetNameByTypeW(lpservicetype.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), dwnamelength)

public actual fun GetNameInfoW(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PWSTR, nodebuffersize: UInt, pservicebuffer: PWSTR, servicebuffersize: UInt, flags: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetNameInfoW(psockaddr.toCPointer<ByteVar>(), sockaddrlength, pnodebuffer.toCPointer<ByteVar>(), nodebuffersize, pservicebuffer.toCPointer<ByteVar>(), servicebuffersize, flags)

public actual fun GetServiceA(dwnamespace: UInt, lpguid: Long, lpservicename: PCSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetServiceA(dwnamespace, lpguid.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), dwproperties, lpbuffer.toCPointer<ByteVar>(), lpdwbuffersize.toCPointer<ByteVar>(), lpserviceasyncinfo.toCPointer<ByteVar>())

public actual fun GetServiceW(dwnamespace: UInt, lpguid: Long, lpservicename: PCWSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetServiceW(dwnamespace, lpguid.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), dwproperties, lpbuffer.toCPointer<ByteVar>(), lpdwbuffersize.toCPointer<ByteVar>(), lpserviceasyncinfo.toCPointer<ByteVar>())

public actual fun GetTypeByNameA(lpservicename: PCSTR, lpservicetype: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetTypeByNameA(lpservicename.toCPointer<ByteVar>(), lpservicetype.toCPointer<ByteVar>())

public actual fun GetTypeByNameW(lpservicename: PCWSTR, lpservicetype: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_GetTypeByNameW(lpservicename.toCPointer<ByteVar>(), lpservicetype.toCPointer<ByteVar>())

public actual fun InetNtopW(family: Int, paddr: Long, pstringbuf: PWSTR, stringbufsize: ULong): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_InetNtopW(family, paddr.toCPointer<ByteVar>(), pstringbuf.toCPointer<ByteVar>(), stringbufsize)?.toLong() ?: 0L

public actual fun InetPtonW(family: Int, pszaddrstring: PCWSTR, paddrbuf: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_InetPtonW(family, pszaddrstring.toCPointer<ByteVar>(), paddrbuf.toCPointer<ByteVar>())

public actual fun ProcessSocketNotifications(completionport: HANDLE, registrationcount: UInt, registrationinfos: Long, timeoutms: UInt, completioncount: UInt, completionportentries: Long, receivedentrycount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ProcessSocketNotifications(completionport.toCPointer<ByteVar>(), registrationcount, registrationinfos.toCPointer<ByteVar>(), timeoutms, completioncount, completionportentries.toCPointer<ByteVar>(), receivedentrycount.toCPointer<ByteVar>())

public actual fun RtlEthernetAddressToStringA(addr: Long, s: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA(addr.toCPointer<ByteVar>(), s.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlEthernetAddressToStringW(addr: Long, s: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW(addr.toCPointer<ByteVar>(), s.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlEthernetStringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA(s.toCPointer<ByteVar>(), terminator.toCPointer<ByteVar>(), addr.toCPointer<ByteVar>())

public actual fun RtlEthernetStringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW(s.toCPointer<ByteVar>(), terminator.toCPointer<ByteVar>(), addr.toCPointer<ByteVar>())

public actual fun RtlIpv4AddressToStringA(addr: Long, s: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA(addr.toCPointer<ByteVar>(), s.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlIpv4AddressToStringExA(address: Long, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA(address.toCPointer<ByteVar>(), port, addressstring.toCPointer<ByteVar>(), addressstringlength.toCPointer<ByteVar>())

public actual fun RtlIpv4AddressToStringExW(address: Long, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW(address.toCPointer<ByteVar>(), port, addressstring.toCPointer<ByteVar>(), addressstringlength.toCPointer<ByteVar>())

public actual fun RtlIpv4AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW(addr.toCPointer<ByteVar>(), s.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlIpv4StringToAddressA(s: PCSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA(s.toCPointer<ByteVar>(), strict, terminator.toCPointer<ByteVar>(), addr.toCPointer<ByteVar>())

public actual fun RtlIpv4StringToAddressExA(addressstring: PCSTR, strict: Boolean, address: Long, port: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA(addressstring.toCPointer<ByteVar>(), strict, address.toCPointer<ByteVar>(), port.toCPointer<ByteVar>())

public actual fun RtlIpv4StringToAddressExW(addressstring: PCWSTR, strict: Boolean, address: Long, port: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW(addressstring.toCPointer<ByteVar>(), strict, address.toCPointer<ByteVar>(), port.toCPointer<ByteVar>())

public actual fun RtlIpv4StringToAddressW(s: PCWSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW(s.toCPointer<ByteVar>(), strict, terminator.toCPointer<ByteVar>(), addr.toCPointer<ByteVar>())

public actual fun RtlIpv6AddressToStringA(addr: Long, s: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA(addr.toCPointer<ByteVar>(), s.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlIpv6AddressToStringExA(address: Long, scopeid: UInt, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA(address.toCPointer<ByteVar>(), scopeid, port, addressstring.toCPointer<ByteVar>(), addressstringlength.toCPointer<ByteVar>())

public actual fun RtlIpv6AddressToStringExW(address: Long, scopeid: UInt, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW(address.toCPointer<ByteVar>(), scopeid, port, addressstring.toCPointer<ByteVar>(), addressstringlength.toCPointer<ByteVar>())

public actual fun RtlIpv6AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW(addr.toCPointer<ByteVar>(), s.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlIpv6StringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA(s.toCPointer<ByteVar>(), terminator.toCPointer<ByteVar>(), addr.toCPointer<ByteVar>())

public actual fun RtlIpv6StringToAddressExA(addressstring: PCSTR, address: Long, scopeid: Long, port: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA(addressstring.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), scopeid.toCPointer<ByteVar>(), port.toCPointer<ByteVar>())

public actual fun RtlIpv6StringToAddressExW(addressstring: PCWSTR, address: Long, scopeid: Long, port: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW(addressstring.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), scopeid.toCPointer<ByteVar>(), port.toCPointer<ByteVar>())

public actual fun RtlIpv6StringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW(s.toCPointer<ByteVar>(), terminator.toCPointer<ByteVar>(), addr.toCPointer<ByteVar>())

public actual fun SetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_SetAddrInfoExA(pname.toCPointer<ByteVar>(), pservicename.toCPointer<ByteVar>(), paddresses.toCPointer<ByteVar>(), dwaddresscount, lpblob.toCPointer<ByteVar>(), dwflags, dwnamespace, lpnspid.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>(), lpnamehandle.toCPointer<ByteVar>())

public actual fun SetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_SetAddrInfoExW(pname.toCPointer<ByteVar>(), pservicename.toCPointer<ByteVar>(), paddresses.toCPointer<ByteVar>(), dwaddresscount, lpblob.toCPointer<ByteVar>(), dwflags, dwnamespace, lpnspid.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>(), lpnamehandle.toCPointer<ByteVar>())

public actual fun SetServiceA(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_SetServiceA(dwnamespace, dwoperation, dwflags, lpserviceinfo.toCPointer<ByteVar>(), lpserviceasyncinfo.toCPointer<ByteVar>(), lpdwstatusflags.toCPointer<ByteVar>())

public actual fun SetServiceW(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_SetServiceW(dwnamespace, dwoperation, dwflags, lpserviceinfo.toCPointer<ByteVar>(), lpserviceasyncinfo.toCPointer<ByteVar>(), lpdwstatusflags.toCPointer<ByteVar>())

public actual fun SetSocketMediaStreamingMode(value: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode(value)

public actual fun TransmitFile(hsocket: SOCKET, hfile: HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_TransmitFile(hsocket, hfile.toCPointer<ByteVar>(), nnumberofbytestowrite, nnumberofbytespersend, lpoverlapped.toCPointer<ByteVar>(), lptransmitbuffers.toCPointer<ByteVar>(), dwreserved)

public actual fun WPUCompleteOverlappedRequest(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest(s, lpoverlapped.toCPointer<ByteVar>(), dwerror, cbtransferred, lperrno.toCPointer<ByteVar>())

public actual fun WSAAccept(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong): SOCKET =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAccept(s, addr.toCPointer<ByteVar>(), addrlen.toCPointer<ByteVar>(), lpfncondition.toLong().toCPointer<ByteVar>(), dwcallbackdata)

public actual fun WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PSTR, lpdwaddressstringlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAddressToStringA(lpsaaddress.toCPointer<ByteVar>(), dwaddresslength, lpprotocolinfo.toCPointer<ByteVar>(), lpszaddressstring.toCPointer<ByteVar>(), lpdwaddressstringlength.toCPointer<ByteVar>())

public actual fun WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAddressToStringW(lpsaaddress.toCPointer<ByteVar>(), dwaddresslength, lpprotocolinfo.toCPointer<ByteVar>(), lpszaddressstring.toCPointer<ByteVar>(), lpdwaddressstringlength.toCPointer<ByteVar>())

public actual fun WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider(puuidproviderid.toCPointer<ByteVar>(), pnspv2routine.toCPointer<ByteVar>())

public actual fun WSAAsyncGetHostByAddr(hwnd: HWND, wmsg: UInt, addr: PCSTR, len: Int, type: Int, buf: PSTR, buflen: Int): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr(hwnd.toCPointer<ByteVar>(), wmsg, addr.toCPointer<ByteVar>(), len, type, buf.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L

public actual fun WSAAsyncGetHostByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName(hwnd.toCPointer<ByteVar>(), wmsg, name.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L

public actual fun WSAAsyncGetProtoByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName(hwnd.toCPointer<ByteVar>(), wmsg, name.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L

public actual fun WSAAsyncGetProtoByNumber(hwnd: HWND, wmsg: UInt, number: Int, buf: PSTR, buflen: Int): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber(hwnd.toCPointer<ByteVar>(), wmsg, number, buf.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L

public actual fun WSAAsyncGetServByName(hwnd: HWND, wmsg: UInt, name: PCSTR, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName(hwnd.toCPointer<ByteVar>(), wmsg, name.toCPointer<ByteVar>(), proto.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L

public actual fun WSAAsyncGetServByPort(hwnd: HWND, wmsg: UInt, port: Int, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort(hwnd.toCPointer<ByteVar>(), wmsg, port, proto.toCPointer<ByteVar>(), buf.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L

public actual fun WSAAsyncSelect(s: SOCKET, hwnd: HWND, wmsg: UInt, levent: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAAsyncSelect(s, hwnd.toCPointer<ByteVar>(), wmsg, levent)

public actual fun WSACancelAsyncRequest(hasynctaskhandle: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest(hasynctaskhandle.toCPointer<ByteVar>())

public actual fun WSACancelBlockingCall(): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSACancelBlockingCall()

public actual fun WSACleanup(): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSACleanup()

public actual fun WSACloseEvent(hevent: WSAEVENT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSACloseEvent(hevent)

public actual fun WSAConnect(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAConnect(s, name.toCPointer<ByteVar>(), namelen, lpcallerdata.toCPointer<ByteVar>(), lpcalleedata.toCPointer<ByteVar>(), lpsqos.toCPointer<ByteVar>(), lpgqos.toCPointer<ByteVar>())

public actual fun WSAConnectByList(s: SOCKET, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAConnectByList(s, socketaddress.toCPointer<ByteVar>(), localaddresslength.toCPointer<ByteVar>(), localaddress.toCPointer<ByteVar>(), remoteaddresslength.toCPointer<ByteVar>(), remoteaddress.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun WSAConnectByNameA(s: SOCKET, nodename: PCSTR, servicename: PCSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAConnectByNameA(s, nodename.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), localaddresslength.toCPointer<ByteVar>(), localaddress.toCPointer<ByteVar>(), remoteaddresslength.toCPointer<ByteVar>(), remoteaddress.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun WSAConnectByNameW(s: SOCKET, nodename: PCWSTR, servicename: PCWSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAConnectByNameW(s, nodename.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), localaddresslength.toCPointer<ByteVar>(), localaddress.toCPointer<ByteVar>(), remoteaddresslength.toCPointer<ByteVar>(), remoteaddress.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun WSACreateEvent(): WSAEVENT =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSACreateEvent()

public actual fun WSADeleteSocketPeerTargetName(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName(socket, peeraddr.toCPointer<ByteVar>(), peeraddrlen, overlapped.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSADuplicateSocketA(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSADuplicateSocketA(s, dwprocessid, lpprotocolinfo.toCPointer<ByteVar>())

public actual fun WSADuplicateSocketW(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSADuplicateSocketW(s, dwprocessid, lpprotocolinfo.toCPointer<ByteVar>())

public actual fun WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA(lpdwbufferlength.toCPointer<ByteVar>(), lpnspbuffer.toCPointer<ByteVar>())

public actual fun WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA(lpdwbufferlength.toCPointer<ByteVar>(), lpnspbuffer.toCPointer<ByteVar>())

public actual fun WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW(lpdwbufferlength.toCPointer<ByteVar>(), lpnspbuffer.toCPointer<ByteVar>())

public actual fun WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW(lpdwbufferlength.toCPointer<ByteVar>(), lpnspbuffer.toCPointer<ByteVar>())

public actual fun WSAEnumNetworkEvents(s: SOCKET, heventobject: WSAEVENT, lpnetworkevents: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents(s, heventobject, lpnetworkevents.toCPointer<ByteVar>())

public actual fun WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA(lpiprotocols.toCPointer<ByteVar>(), lpprotocolbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW(lpiprotocols.toCPointer<ByteVar>(), lpprotocolbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun WSAEventSelect(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAEventSelect(s, heventobject, lnetworkevents)

public actual fun WSAGetLastError(): WSA_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetLastError()

public actual fun WSAGetOverlappedResult(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult(s, lpoverlapped.toCPointer<ByteVar>(), lpcbtransfer.toCPointer<ByteVar>(), fwait, lpdwflags.toCPointer<ByteVar>())

public actual fun WSAGetQOSByName(s: SOCKET, lpqosname: Long, lpqos: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetQOSByName(s, lpqosname.toCPointer<ByteVar>(), lpqos.toCPointer<ByteVar>())

public actual fun WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA(lpproviderid.toCPointer<ByteVar>(), lpserviceclassid.toCPointer<ByteVar>(), lpdwbufsize.toCPointer<ByteVar>(), lpserviceclassinfo.toCPointer<ByteVar>())

public actual fun WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW(lpproviderid.toCPointer<ByteVar>(), lpserviceclassid.toCPointer<ByteVar>(), lpdwbufsize.toCPointer<ByteVar>(), lpserviceclassinfo.toCPointer<ByteVar>())

public actual fun WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: PSTR, lpdwbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA(lpserviceclassid.toCPointer<ByteVar>(), lpszserviceclassname.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: PWSTR, lpdwbufferlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW(lpserviceclassid.toCPointer<ByteVar>(), lpszserviceclassname.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun WSAHtonl(s: SOCKET, hostlong: UInt, lpnetlong: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAHtonl(s, hostlong, lpnetlong.toCPointer<ByteVar>())

public actual fun WSAHtons(s: SOCKET, hostshort: UShort, lpnetshort: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAHtons(s, hostshort, lpnetshort.toCPointer<ByteVar>())

public actual fun WSAImpersonateSocketPeer(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer(socket, peeraddr.toCPointer<ByteVar>(), peeraddrlen)

public actual fun WSAInstallServiceClassA(lpserviceclassinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA(lpserviceclassinfo.toCPointer<ByteVar>())

public actual fun WSAInstallServiceClassW(lpserviceclassinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW(lpserviceclassinfo.toCPointer<ByteVar>())

public actual fun WSAIoctl(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAIoctl(s, dwiocontrolcode, lpvinbuffer.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSAIsBlocking(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAIsBlocking()

public actual fun WSAJoinLeaf(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt): SOCKET =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAJoinLeaf(s, name.toCPointer<ByteVar>(), namelen, lpcallerdata.toCPointer<ByteVar>(), lpcalleedata.toCPointer<ByteVar>(), lpsqos.toCPointer<ByteVar>(), lpgqos.toCPointer<ByteVar>(), dwflags)

public actual fun WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA(lpqsrestrictions.toCPointer<ByteVar>(), dwcontrolflags, lphlookup.toCPointer<ByteVar>())

public actual fun WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW(lpqsrestrictions.toCPointer<ByteVar>(), dwcontrolflags, lphlookup.toCPointer<ByteVar>())

public actual fun WSALookupServiceEnd(hlookup: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSALookupServiceEnd(hlookup.toCPointer<ByteVar>())

public actual fun WSALookupServiceNextA(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSALookupServiceNextA(hlookup.toCPointer<ByteVar>(), dwcontrolflags, lpdwbufferlength.toCPointer<ByteVar>(), lpqsresults.toCPointer<ByteVar>())

public actual fun WSALookupServiceNextW(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSALookupServiceNextW(hlookup.toCPointer<ByteVar>(), dwcontrolflags, lpdwbufferlength.toCPointer<ByteVar>(), lpqsresults.toCPointer<ByteVar>())

public actual fun WSANSPIoctl(hlookup: HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSANSPIoctl(hlookup.toCPointer<ByteVar>(), dwcontrolcode, lpvinbuffer.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned.toCPointer<ByteVar>(), lpcompletion.toCPointer<ByteVar>())

public actual fun WSANtohl(s: SOCKET, netlong: UInt, lphostlong: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSANtohl(s, netlong, lphostlong.toCPointer<ByteVar>())

public actual fun WSANtohs(s: SOCKET, netshort: UShort, lphostshort: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSANtohs(s, netshort, lphostshort.toCPointer<ByteVar>())

public actual fun WSAPoll(fdarray: Long, fds: UInt, timeout: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAPoll(fdarray.toCPointer<ByteVar>(), fds, timeout)

public actual fun WSAProviderCompleteAsyncCall(hasynccall: HANDLE, iretcode: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall(hasynccall.toCPointer<ByteVar>(), iretcode)

public actual fun WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAProviderConfigChange(lpnotificationhandle.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSAQuerySocketSecurity(socket: SOCKET, securityquerytemplate: Long, securityquerytemplatelen: UInt, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity(socket, securityquerytemplate.toCPointer<ByteVar>(), securityquerytemplatelen, securityqueryinfo.toCPointer<ByteVar>(), securityqueryinfolen.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSARecv(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSARecv(s, lpbuffers.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytesrecvd.toCPointer<ByteVar>(), lpflags.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSARecvDisconnect(s: SOCKET, lpinbounddisconnectdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSARecvDisconnect(s, lpinbounddisconnectdata.toCPointer<ByteVar>())

public actual fun WSARecvEx(s: SOCKET, buf: PSTR, len: Int, flags: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSARecvEx(s, buf.toCPointer<ByteVar>(), len, flags.toCPointer<ByteVar>())

public actual fun WSARecvFrom(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSARecvFrom(s, lpbuffers.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytesrecvd.toCPointer<ByteVar>(), lpflags.toCPointer<ByteVar>(), lpfrom.toCPointer<ByteVar>(), lpfromlen.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSARemoveServiceClass(lpserviceclassid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSARemoveServiceClass(lpserviceclassid.toCPointer<ByteVar>())

public actual fun WSAResetEvent(hevent: WSAEVENT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAResetEvent(hevent)

public actual fun WSARevertImpersonation(): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSARevertImpersonation()

public actual fun WSASend(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASend(s, lpbuffers.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytessent.toCPointer<ByteVar>(), dwflags, lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSASendDisconnect(s: SOCKET, lpoutbounddisconnectdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASendDisconnect(s, lpoutbounddisconnectdata.toCPointer<ByteVar>())

public actual fun WSASendMsg(handle: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASendMsg(handle, lpmsg.toCPointer<ByteVar>(), dwflags, lpnumberofbytessent.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSASendTo(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASendTo(s, lpbuffers.toCPointer<ByteVar>(), dwbuffercount, lpnumberofbytessent.toCPointer<ByteVar>(), dwflags, lpto.toCPointer<ByteVar>(), itolen, lpoverlapped.toCPointer<ByteVar>(), lpcompletionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSASetBlockingHook(lpblockfunc: FARPROC): FARPROC =
    null

public actual fun WSASetEvent(hevent: WSAEVENT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASetEvent(hevent)

public actual fun WSASetLastError(ierror: Int) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASetLastError(ierror)
}

public actual fun WSASetServiceA(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASetServiceA(lpqsreginfo.toCPointer<ByteVar>(), essoperation, dwcontrolflags)

public actual fun WSASetServiceW(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASetServiceW(lpqsreginfo.toCPointer<ByteVar>(), essoperation, dwcontrolflags)

public actual fun WSASetSocketPeerTargetName(socket: SOCKET, peertargetname: Long, peertargetnamelen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName(socket, peertargetname.toCPointer<ByteVar>(), peertargetnamelen, overlapped.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSASetSocketSecurity(socket: SOCKET, securitysettings: Long, securitysettingslen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASetSocketSecurity(socket, securitysettings.toCPointer<ByteVar>(), securitysettingslen, overlapped.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>())

public actual fun WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASocketA(af, type, protocol, lpprotocolinfo.toCPointer<ByteVar>(), g, dwflags)

public actual fun WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSASocketW(af, type, protocol, lpprotocolinfo.toCPointer<ByteVar>(), g, dwflags)

public actual fun WSAStartup(wversionrequested: UShort, lpwsadata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAStartup(wversionrequested, lpwsadata.toCPointer<ByteVar>())

public actual fun WSAStringToAddressA(addressstring: PCSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAStringToAddressA(addressstring.toCPointer<ByteVar>(), addressfamily, lpprotocolinfo.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), lpaddresslength.toCPointer<ByteVar>())

public actual fun WSAStringToAddressW(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAStringToAddressW(addressstring.toCPointer<ByteVar>(), addressfamily, lpprotocolinfo.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), lpaddresslength.toCPointer<ByteVar>())

public actual fun WSAUnadvertiseProvider(puuidproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider(puuidproviderid.toCPointer<ByteVar>())

public actual fun WSAUnhookBlockingHook(): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook()

public actual fun WSAWaitForMultipleEvents(cevents: UInt, lphevents: Long, fwaitall: BOOL, dwtimeout: UInt, falertable: BOOL): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents(cevents, lphevents.toCPointer<ByteVar>(), fwaitall, dwtimeout, falertable)

public actual fun WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCDeinstallProvider(lpproviderid.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32(lpproviderid.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCEnableNSProvider(lpproviderid: Long, fenable: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCEnableNSProvider(lpproviderid.toCPointer<ByteVar>(), fenable)

public actual fun WSCEnableNSProvider32(lpproviderid: Long, fenable: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32(lpproviderid.toCPointer<ByteVar>(), fenable)

public actual fun WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32(lpdwbufferlength.toCPointer<ByteVar>(), lpnspbuffer.toCPointer<ByteVar>())

public actual fun WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32(lpdwbufferlength.toCPointer<ByteVar>(), lpnspbuffer.toCPointer<ByteVar>())

public actual fun WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCEnumProtocols(lpiprotocols.toCPointer<ByteVar>(), lpprotocolbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCEnumProtocols32(lpiprotocols.toCPointer<ByteVar>(), lpprotocolbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCGetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, ppermittedlspcategories: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory(path.toCPointer<ByteVar>(), pathlength, extra.toCPointer<ByteVar>(), extralength, ppermittedlspcategories.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCGetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCGetProviderInfo(lpproviderid.toCPointer<ByteVar>(), infotype, info.toCPointer<ByteVar>(), infosize.toCPointer<ByteVar>(), flags, lperrno.toCPointer<ByteVar>())

public actual fun WSCGetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32(lpproviderid.toCPointer<ByteVar>(), infotype, info.toCPointer<ByteVar>(), infosize.toCPointer<ByteVar>(), flags, lperrno.toCPointer<ByteVar>())

public actual fun WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCGetProviderPath(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpproviderdllpathlen.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCGetProviderPath32(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpproviderdllpathlen.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCInstallNameSpace(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallNameSpace(lpszidentifier.toCPointer<ByteVar>(), lpszpathname.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.toCPointer<ByteVar>())

public actual fun WSCInstallNameSpace32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32(lpszidentifier.toCPointer<ByteVar>(), lpszpathname.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.toCPointer<ByteVar>())

public actual fun WSCInstallNameSpaceEx(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx(lpszidentifier.toCPointer<ByteVar>(), lpszpathname.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.toCPointer<ByteVar>(), lpproviderspecific.toCPointer<ByteVar>())

public actual fun WSCInstallNameSpaceEx32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32(lpszidentifier.toCPointer<ByteVar>(), lpszpathname.toCPointer<ByteVar>(), dwnamespace, dwversion, lpproviderid.toCPointer<ByteVar>(), lpproviderspecific.toCPointer<ByteVar>())

public actual fun WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallProvider(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpprotocolinfolist.toCPointer<ByteVar>(), dwnumberofentries, lperrno.toCPointer<ByteVar>())

public actual fun WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpprotocolinfolist.toCPointer<ByteVar>(), dwnumberofentries, lperrno.toCPointer<ByteVar>())

public actual fun WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpszproviderdllpath32: PCWSTR, lpszlspname: PCWSTR, dwserviceflags: UInt, lpprotocolinfolist: Long, dwnumberofentries: UInt, lpdwcatalogentryid: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpszproviderdllpath32.toCPointer<ByteVar>(), lpszlspname.toCPointer<ByteVar>(), dwserviceflags, lpprotocolinfolist.toCPointer<ByteVar>(), dwnumberofentries, lpdwcatalogentryid.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCSetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: Long, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory(path.toCPointer<ByteVar>(), pathlength, extra.toCPointer<ByteVar>(), extralength, permittedlspcategories, pprevpermlspcat.toCPointer<ByteVar>(), lperrno.toCPointer<ByteVar>())

public actual fun WSCSetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCSetProviderInfo(lpproviderid.toCPointer<ByteVar>(), infotype, info.toCPointer<ByteVar>(), infosize, flags, lperrno.toCPointer<ByteVar>())

public actual fun WSCSetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32(lpproviderid.toCPointer<ByteVar>(), infotype, info.toCPointer<ByteVar>(), infosize, flags, lperrno.toCPointer<ByteVar>())

public actual fun WSCUnInstallNameSpace(lpproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace(lpproviderid.toCPointer<ByteVar>())

public actual fun WSCUnInstallNameSpace32(lpproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32(lpproviderid.toCPointer<ByteVar>())

public actual fun WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCUpdateProvider(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpprotocolinfolist.toCPointer<ByteVar>(), dwnumberofentries, lperrno.toCPointer<ByteVar>())

public actual fun WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCUpdateProvider32(lpproviderid.toCPointer<ByteVar>(), lpszproviderdllpath.toCPointer<ByteVar>(), lpprotocolinfolist.toCPointer<ByteVar>(), dwnumberofentries, lperrno.toCPointer<ByteVar>())

public actual fun WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder(lpproviderid.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32(lpproviderid.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder(lpwdcatalogentryid.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32(lpwdcatalogentryid.toCPointer<ByteVar>(), dwnumberofentries)

public actual fun __WSAFDIsSet(fd: SOCKET, param1: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock___WSAFDIsSet(fd, param1.toCPointer<ByteVar>())

public actual fun accept(s: SOCKET, addr: Long, addrlen: Long): SOCKET =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_accept(s, addr.toCPointer<ByteVar>(), addrlen.toCPointer<ByteVar>())

public actual fun bind(s: SOCKET, name: Long, namelen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_bind(s, name.toCPointer<ByteVar>(), namelen)

public actual fun closesocket(s: SOCKET): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_closesocket(s)

public actual fun connect(s: SOCKET, name: Long, namelen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_connect(s, name.toCPointer<ByteVar>(), namelen)

public actual fun freeaddrinfo(paddrinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_freeaddrinfo(paddrinfo.toCPointer<ByteVar>())
}

public actual fun getaddrinfo(pnodename: PCSTR, pservicename: PCSTR, phints: Long, ppresult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getaddrinfo(pnodename.toCPointer<ByteVar>(), pservicename.toCPointer<ByteVar>(), phints.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun gethostbyaddr(addr: PCSTR, len: Int, type: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_gethostbyaddr(addr.toCPointer<ByteVar>(), len, type)?.toLong() ?: 0L

public actual fun gethostbyname(name: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_gethostbyname(name.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun gethostname(name: PSTR, namelen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_gethostname(name.toCPointer<ByteVar>(), namelen)

public actual fun getnameinfo(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PSTR, nodebuffersize: UInt, pservicebuffer: PSTR, servicebuffersize: UInt, flags: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getnameinfo(psockaddr.toCPointer<ByteVar>(), sockaddrlength, pnodebuffer.toCPointer<ByteVar>(), nodebuffersize, pservicebuffer.toCPointer<ByteVar>(), servicebuffersize, flags)

public actual fun getpeername(s: SOCKET, name: Long, namelen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getpeername(s, name.toCPointer<ByteVar>(), namelen.toCPointer<ByteVar>())

public actual fun getprotobyname(name: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getprotobyname(name.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun getprotobynumber(number: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getprotobynumber(number)?.toLong() ?: 0L

public actual fun getservbyname(name: PCSTR, proto: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getservbyname(name.toCPointer<ByteVar>(), proto.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun getservbyport(port: Int, proto: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getservbyport(port, proto.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun getsockname(s: SOCKET, name: Long, namelen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getsockname(s, name.toCPointer<ByteVar>(), namelen.toCPointer<ByteVar>())

public actual fun getsockopt(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_getsockopt(s, level, optname, optval.toCPointer<ByteVar>(), optlen.toCPointer<ByteVar>())

public actual fun htonl(hostlong: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_htonl(hostlong)

public actual fun htons(hostshort: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_htons(hostshort)

public actual fun inet_addr(cp: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inet_addr(cp.toCPointer<ByteVar>())

public actual fun inet_ntoa(input: IN_ADDR): PSTR =
    0L

public actual fun inet_ntop(family: Int, paddr: Long, pstringbuf: PSTR, stringbufsize: ULong): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inet_ntop(family, paddr.toCPointer<ByteVar>(), pstringbuf.toCPointer<ByteVar>(), stringbufsize)?.toLong() ?: 0L

public actual fun inet_pton(family: Int, pszaddrstring: PCSTR, paddrbuf: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_inet_pton(family, pszaddrstring.toCPointer<ByteVar>(), paddrbuf.toCPointer<ByteVar>())

public actual fun ioctlsocket(s: SOCKET, cmd: Int, argp: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ioctlsocket(s, cmd, argp.toCPointer<ByteVar>())

public actual fun listen(s: SOCKET, backlog: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_listen(s, backlog)

public actual fun ntohl(netlong: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ntohl(netlong)

public actual fun ntohs(netshort: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_ntohs(netshort)

public actual fun recv(s: SOCKET, buf: PSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_recv(s, buf.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(s: SOCKET, buf: PSTR, len: Int, flags: Int, from: Long, fromlen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_recvfrom(s, buf.toCPointer<ByteVar>(), len, flags, from.toCPointer<ByteVar>(), fromlen.toCPointer<ByteVar>())

public actual fun select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_select(nfds, readfds.toCPointer<ByteVar>(), writefds.toCPointer<ByteVar>(), exceptfds.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>())

public actual fun send(s: SOCKET, buf: PCSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_send(s, buf.toCPointer<ByteVar>(), len, flags)

public actual fun sendto(s: SOCKET, buf: PCSTR, len: Int, flags: Int, to: Long, tolen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_sendto(s, buf.toCPointer<ByteVar>(), len, flags, to.toCPointer<ByteVar>(), tolen)

public actual fun setsockopt(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_setsockopt(s, level, optname, optval.toCPointer<ByteVar>(), optlen)

public actual fun shutdown(s: SOCKET, how: WINSOCK_SHUTDOWN_HOW): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_shutdown(s, how)

public actual fun socket(af: Int, type: WINSOCK_SOCKET_TYPE, protocol: Int): SOCKET =
    io.github.kotlinmania.windowssys.windows.win32.networking.winsock.cinterop.windowssys_windows_win32_networking_winsock_socket(af, type, protocol)
