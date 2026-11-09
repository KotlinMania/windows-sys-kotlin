@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32NetworkingWinsockNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AcceptEx(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_AcceptEx(slistensocket.toString(), sacceptsocket.toString(), lpoutputbuffer.toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), lpdwbytesreceived.toString(), lpoverlapped.toString()) as Int) else 0

public actual fun EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_EnumProtocolsA(lpiprotocols.toString(), lpprotocolbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_EnumProtocolsW(lpiprotocols.toString(), lpprotocolbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun FreeAddrInfoEx(paddrinfoex: Long) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_FreeAddrInfoEx(paddrinfoex.toString())
    }
}

public actual fun FreeAddrInfoExW(paddrinfoex: Long) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_FreeAddrInfoExW(paddrinfoex.toString())
    }
}

public actual fun FreeAddrInfoW(paddrinfo: Long) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_FreeAddrInfoW(paddrinfo.toString())
    }
}

public actual fun GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs(lpoutputbuffer.toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), localsockaddr.toString(), localsockaddrlength.toString(), remotesockaddr.toString(), remotesockaddrlength.toString())
    }
}

public actual fun GetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddrInfoExA(pname.toString(), pservicename.toString(), dwnamespace.toInt(), lpnspid.toString(), hints.toString(), ppresult.toString(), timeout.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString(), lpnamehandle.toString()) as Int) else 0

public actual fun GetAddrInfoExCancel(lphandle: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel(lphandle.toString()) as Int) else 0

public actual fun GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult(lpoverlapped.toString()) as Int) else 0

public actual fun GetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddrInfoExW(pname.toString(), pservicename.toString(), dwnamespace.toInt(), lpnspid.toString(), hints.toString(), ppresult.toString(), timeout.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString(), lphandle.toString()) as Int) else 0

public actual fun GetAddrInfoW(pnodename: PCWSTR, pservicename: PCWSTR, phints: Long, ppresult: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddrInfoW(pnodename.toString(), pservicename.toString(), phints.toString(), ppresult.toString()) as Int) else 0

public actual fun GetAddressByNameA(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PSTR, lpdwaliasbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddressByNameA(dwnamespace.toInt(), lpservicetype.toString(), lpservicename.toString(), lpiprotocols.toString(), dwresolution.toInt(), lpserviceasyncinfo.toString(), lpcsaddrbuffer.toString(), lpdwbufferlength.toString(), lpaliasbuffer.toString(), lpdwaliasbufferlength.toString()) as Int) else 0

public actual fun GetAddressByNameW(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCWSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PWSTR, lpdwaliasbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetAddressByNameW(dwnamespace.toInt(), lpservicetype.toString(), lpservicename.toString(), lpiprotocols.toString(), dwresolution.toInt(), lpserviceasyncinfo.toString(), lpcsaddrbuffer.toString(), lpdwbufferlength.toString(), lpaliasbuffer.toString(), lpdwaliasbufferlength.toString()) as Int) else 0

public actual fun GetHostNameW(name: PWSTR, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetHostNameW(name.toString(), namelen) as Int) else 0

public actual fun GetNameByTypeA(lpservicetype: Long, lpservicename: PSTR, dwnamelength: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetNameByTypeA(lpservicetype.toString(), lpservicename.toString(), dwnamelength.toInt()) as Int) else 0

public actual fun GetNameByTypeW(lpservicetype: Long, lpservicename: PWSTR, dwnamelength: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetNameByTypeW(lpservicetype.toString(), lpservicename.toString(), dwnamelength.toInt()) as Int) else 0

public actual fun GetNameInfoW(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PWSTR, nodebuffersize: UInt, pservicebuffer: PWSTR, servicebuffersize: UInt, flags: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetNameInfoW(psockaddr.toString(), sockaddrlength, pnodebuffer.toString(), nodebuffersize.toInt(), pservicebuffer.toString(), servicebuffersize.toInt(), flags) as Int) else 0

public actual fun GetServiceA(dwnamespace: UInt, lpguid: Long, lpservicename: PCSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetServiceA(dwnamespace.toInt(), lpguid.toString(), lpservicename.toString(), dwproperties.toInt(), lpbuffer.toString(), lpdwbuffersize.toString(), lpserviceasyncinfo.toString()) as Int) else 0

public actual fun GetServiceW(dwnamespace: UInt, lpguid: Long, lpservicename: PCWSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetServiceW(dwnamespace.toInt(), lpguid.toString(), lpservicename.toString(), dwproperties.toInt(), lpbuffer.toString(), lpdwbuffersize.toString(), lpserviceasyncinfo.toString()) as Int) else 0

public actual fun GetTypeByNameA(lpservicename: PCSTR, lpservicetype: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetTypeByNameA(lpservicename.toString(), lpservicetype.toString()) as Int) else 0

public actual fun GetTypeByNameW(lpservicename: PCWSTR, lpservicetype: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_GetTypeByNameW(lpservicename.toString(), lpservicetype.toString()) as Int) else 0

public actual fun InetNtopW(family: Int, paddr: Long, pstringbuf: PWSTR, stringbufsize: ULong): PCWSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_InetNtopW(family, paddr.toString(), pstringbuf.toString(), stringbufsize.toString()) as String).toLong() else 0L

public actual fun InetPtonW(family: Int, pszaddrstring: PCWSTR, paddrbuf: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_InetPtonW(family, pszaddrstring.toString(), paddrbuf.toString()) as Int) else 0

public actual fun ProcessSocketNotifications(completionport: HANDLE, registrationcount: UInt, registrationinfos: Long, timeoutms: UInt, completioncount: UInt, completionportentries: Long, receivedentrycount: Long): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ProcessSocketNotifications(completionport.toString(), registrationcount.toInt(), registrationinfos.toString(), timeoutms.toInt(), completioncount.toInt(), completionportentries.toString(), receivedentrycount.toString()) as Int).toUInt() else 0u

public actual fun RtlEthernetAddressToStringA(addr: Long, s: PSTR): PSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA(addr.toString(), s.toString()) as String).toLong() else 0L

public actual fun RtlEthernetAddressToStringW(addr: Long, s: PWSTR): PWSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW(addr.toString(), s.toString()) as String).toLong() else 0L

public actual fun RtlEthernetStringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA(s.toString(), terminator.toString(), addr.toString()) as Int) else 0

public actual fun RtlEthernetStringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW(s.toString(), terminator.toString(), addr.toString()) as Int) else 0

public actual fun RtlIpv4AddressToStringA(addr: Long, s: PSTR): PSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA(addr.toString(), s.toString()) as String).toLong() else 0L

public actual fun RtlIpv4AddressToStringExA(address: Long, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA(address.toString(), port.toInt(), addressstring.toString(), addressstringlength.toString()) as Int) else 0

public actual fun RtlIpv4AddressToStringExW(address: Long, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW(address.toString(), port.toInt(), addressstring.toString(), addressstringlength.toString()) as Int) else 0

public actual fun RtlIpv4AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW(addr.toString(), s.toString()) as String).toLong() else 0L

public actual fun RtlIpv4StringToAddressA(s: PCSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA(s.toString(), strict, terminator.toString(), addr.toString()) as Int) else 0

public actual fun RtlIpv4StringToAddressExA(addressstring: PCSTR, strict: Boolean, address: Long, port: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA(addressstring.toString(), strict, address.toString(), port.toString()) as Int) else 0

public actual fun RtlIpv4StringToAddressExW(addressstring: PCWSTR, strict: Boolean, address: Long, port: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW(addressstring.toString(), strict, address.toString(), port.toString()) as Int) else 0

public actual fun RtlIpv4StringToAddressW(s: PCWSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW(s.toString(), strict, terminator.toString(), addr.toString()) as Int) else 0

public actual fun RtlIpv6AddressToStringA(addr: Long, s: PSTR): PSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA(addr.toString(), s.toString()) as String).toLong() else 0L

public actual fun RtlIpv6AddressToStringExA(address: Long, scopeid: UInt, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA(address.toString(), scopeid.toInt(), port.toInt(), addressstring.toString(), addressstringlength.toString()) as Int) else 0

public actual fun RtlIpv6AddressToStringExW(address: Long, scopeid: UInt, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW(address.toString(), scopeid.toInt(), port.toInt(), addressstring.toString(), addressstringlength.toString()) as Int) else 0

public actual fun RtlIpv6AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW(addr.toString(), s.toString()) as String).toLong() else 0L

public actual fun RtlIpv6StringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA(s.toString(), terminator.toString(), addr.toString()) as Int) else 0

public actual fun RtlIpv6StringToAddressExA(addressstring: PCSTR, address: Long, scopeid: Long, port: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA(addressstring.toString(), address.toString(), scopeid.toString(), port.toString()) as Int) else 0

public actual fun RtlIpv6StringToAddressExW(addressstring: PCWSTR, address: Long, scopeid: Long, port: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW(addressstring.toString(), address.toString(), scopeid.toString(), port.toString()) as Int) else 0

public actual fun RtlIpv6StringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW(s.toString(), terminator.toString(), addr.toString()) as Int) else 0

public actual fun SetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_SetAddrInfoExA(pname.toString(), pservicename.toString(), paddresses.toString(), dwaddresscount.toInt(), lpblob.toString(), dwflags.toInt(), dwnamespace.toInt(), lpnspid.toString(), timeout.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString(), lpnamehandle.toString()) as Int) else 0

public actual fun SetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_SetAddrInfoExW(pname.toString(), pservicename.toString(), paddresses.toString(), dwaddresscount.toInt(), lpblob.toString(), dwflags.toInt(), dwnamespace.toInt(), lpnspid.toString(), timeout.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString(), lpnamehandle.toString()) as Int) else 0

public actual fun SetServiceA(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_SetServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.toString(), lpserviceasyncinfo.toString(), lpdwstatusflags.toString()) as Int) else 0

public actual fun SetServiceW(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_SetServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.toString(), lpserviceasyncinfo.toString(), lpdwstatusflags.toString()) as Int) else 0

public actual fun SetSocketMediaStreamingMode(value: BOOL): HRESULT =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode(value) as Int) else 0

public actual fun TransmitFile(hsocket: SOCKET, hfile: HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_TransmitFile(hsocket.toString(), hfile.toString(), nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), lpoverlapped.toString(), lptransmitbuffers.toString(), dwreserved.toInt()) as Int) else 0

public actual fun WPUCompleteOverlappedRequest(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest(s.toString(), lpoverlapped.toString(), dwerror.toInt(), cbtransferred.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSAAccept(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong): SOCKET =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAccept(s.toString(), addr.toString(), addrlen.toString(), lpfncondition.toLong().toString(), dwcallbackdata.toString()) as String).toULong() else 0uL

public actual fun WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PSTR, lpdwaddressstringlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAddressToStringA(lpsaaddress.toString(), dwaddresslength.toInt(), lpprotocolinfo.toString(), lpszaddressstring.toString(), lpdwaddressstringlength.toString()) as Int) else 0

public actual fun WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAddressToStringW(lpsaaddress.toString(), dwaddresslength.toInt(), lpprotocolinfo.toString(), lpszaddressstring.toString(), lpdwaddressstringlength.toString()) as Int) else 0

public actual fun WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider(puuidproviderid.toString(), pnspv2routine.toString()) as Int) else 0

public actual fun WSAAsyncGetHostByAddr(hwnd: HWND, wmsg: UInt, addr: PCSTR, len: Int, type: Int, buf: PSTR, buflen: Int): HANDLE =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr(hwnd.toString(), wmsg.toInt(), addr.toString(), len, type, buf.toString(), buflen) as String).toLong() else 0L

public actual fun WSAAsyncGetHostByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName(hwnd.toString(), wmsg.toInt(), name.toString(), buf.toString(), buflen) as String).toLong() else 0L

public actual fun WSAAsyncGetProtoByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName(hwnd.toString(), wmsg.toInt(), name.toString(), buf.toString(), buflen) as String).toLong() else 0L

public actual fun WSAAsyncGetProtoByNumber(hwnd: HWND, wmsg: UInt, number: Int, buf: PSTR, buflen: Int): HANDLE =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber(hwnd.toString(), wmsg.toInt(), number, buf.toString(), buflen) as String).toLong() else 0L

public actual fun WSAAsyncGetServByName(hwnd: HWND, wmsg: UInt, name: PCSTR, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName(hwnd.toString(), wmsg.toInt(), name.toString(), proto.toString(), buf.toString(), buflen) as String).toLong() else 0L

public actual fun WSAAsyncGetServByPort(hwnd: HWND, wmsg: UInt, port: Int, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort(hwnd.toString(), wmsg.toInt(), port, proto.toString(), buf.toString(), buflen) as String).toLong() else 0L

public actual fun WSAAsyncSelect(s: SOCKET, hwnd: HWND, wmsg: UInt, levent: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAAsyncSelect(s.toString(), hwnd.toString(), wmsg.toInt(), levent) as Int) else 0

public actual fun WSACancelAsyncRequest(hasynctaskhandle: HANDLE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest(hasynctaskhandle.toString()) as Int) else 0

public actual fun WSACancelBlockingCall(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSACancelBlockingCall() as Int) else 0

public actual fun WSACleanup(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSACleanup() as Int) else 0

public actual fun WSACloseEvent(hevent: WSAEVENT): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSACloseEvent(hevent.toString()) as Int) else 0

public actual fun WSAConnect(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAConnect(s.toString(), name.toString(), namelen, lpcallerdata.toString(), lpcalleedata.toString(), lpsqos.toString(), lpgqos.toString()) as Int) else 0

public actual fun WSAConnectByList(s: SOCKET, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAConnectByList(s.toString(), socketaddress.toString(), localaddresslength.toString(), localaddress.toString(), remoteaddresslength.toString(), remoteaddress.toString(), timeout.toString(), reserved.toString()) as Int) else 0

public actual fun WSAConnectByNameA(s: SOCKET, nodename: PCSTR, servicename: PCSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAConnectByNameA(s.toString(), nodename.toString(), servicename.toString(), localaddresslength.toString(), localaddress.toString(), remoteaddresslength.toString(), remoteaddress.toString(), timeout.toString(), reserved.toString()) as Int) else 0

public actual fun WSAConnectByNameW(s: SOCKET, nodename: PCWSTR, servicename: PCWSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAConnectByNameW(s.toString(), nodename.toString(), servicename.toString(), localaddresslength.toString(), localaddress.toString(), remoteaddresslength.toString(), remoteaddress.toString(), timeout.toString(), reserved.toString()) as Int) else 0

public actual fun WSACreateEvent(): WSAEVENT =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSACreateEvent() as String).toLong() else 0L

public actual fun WSADeleteSocketPeerTargetName(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName(socket.toString(), peeraddr.toString(), peeraddrlen.toInt(), overlapped.toString(), completionroutine.toLong().toString()) as Int) else 0

public actual fun WSADuplicateSocketA(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSADuplicateSocketA(s.toString(), dwprocessid.toInt(), lpprotocolinfo.toString()) as Int) else 0

public actual fun WSADuplicateSocketW(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSADuplicateSocketW(s.toString(), dwprocessid.toInt(), lpprotocolinfo.toString()) as Int) else 0

public actual fun WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA(lpdwbufferlength.toString(), lpnspbuffer.toString()) as Int) else 0

public actual fun WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA(lpdwbufferlength.toString(), lpnspbuffer.toString()) as Int) else 0

public actual fun WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW(lpdwbufferlength.toString(), lpnspbuffer.toString()) as Int) else 0

public actual fun WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW(lpdwbufferlength.toString(), lpnspbuffer.toString()) as Int) else 0

public actual fun WSAEnumNetworkEvents(s: SOCKET, heventobject: WSAEVENT, lpnetworkevents: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents(s.toString(), heventobject.toString(), lpnetworkevents.toString()) as Int) else 0

public actual fun WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA(lpiprotocols.toString(), lpprotocolbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW(lpiprotocols.toString(), lpprotocolbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun WSAEventSelect(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAEventSelect(s.toString(), heventobject.toString(), lnetworkevents) as Int) else 0

public actual fun WSAGetLastError(): WSA_ERROR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetLastError() as Int) else 0

public actual fun WSAGetOverlappedResult(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult(s.toString(), lpoverlapped.toString(), lpcbtransfer.toString(), fwait, lpdwflags.toString()) as Int) else 0

public actual fun WSAGetQOSByName(s: SOCKET, lpqosname: Long, lpqos: Long): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetQOSByName(s.toString(), lpqosname.toString(), lpqos.toString()) as Int) else 0

public actual fun WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA(lpproviderid.toString(), lpserviceclassid.toString(), lpdwbufsize.toString(), lpserviceclassinfo.toString()) as Int) else 0

public actual fun WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW(lpproviderid.toString(), lpserviceclassid.toString(), lpdwbufsize.toString(), lpserviceclassinfo.toString()) as Int) else 0

public actual fun WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: PSTR, lpdwbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA(lpserviceclassid.toString(), lpszserviceclassname.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: PWSTR, lpdwbufferlength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW(lpserviceclassid.toString(), lpszserviceclassname.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun WSAHtonl(s: SOCKET, hostlong: UInt, lpnetlong: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAHtonl(s.toString(), hostlong.toInt(), lpnetlong.toString()) as Int) else 0

public actual fun WSAHtons(s: SOCKET, hostshort: UShort, lpnetshort: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAHtons(s.toString(), hostshort.toInt(), lpnetshort.toString()) as Int) else 0

public actual fun WSAImpersonateSocketPeer(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer(socket.toString(), peeraddr.toString(), peeraddrlen.toInt()) as Int) else 0

public actual fun WSAInstallServiceClassA(lpserviceclassinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA(lpserviceclassinfo.toString()) as Int) else 0

public actual fun WSAInstallServiceClassW(lpserviceclassinfo: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW(lpserviceclassinfo.toString()) as Int) else 0

public actual fun WSAIoctl(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAIoctl(s.toString(), dwiocontrolcode.toInt(), lpvinbuffer.toString(), cbinbuffer.toInt(), lpvoutbuffer.toString(), cboutbuffer.toInt(), lpcbbytesreturned.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSAIsBlocking(): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAIsBlocking() as Int) else 0

public actual fun WSAJoinLeaf(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt): SOCKET =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAJoinLeaf(s.toString(), name.toString(), namelen, lpcallerdata.toString(), lpcalleedata.toString(), lpsqos.toString(), lpgqos.toString(), dwflags.toInt()) as String).toULong() else 0uL

public actual fun WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA(lpqsrestrictions.toString(), dwcontrolflags.toInt(), lphlookup.toString()) as Int) else 0

public actual fun WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW(lpqsrestrictions.toString(), dwcontrolflags.toInt(), lphlookup.toString()) as Int) else 0

public actual fun WSALookupServiceEnd(hlookup: HANDLE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSALookupServiceEnd(hlookup.toString()) as Int) else 0

public actual fun WSALookupServiceNextA(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSALookupServiceNextA(hlookup.toString(), dwcontrolflags.toInt(), lpdwbufferlength.toString(), lpqsresults.toString()) as Int) else 0

public actual fun WSALookupServiceNextW(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSALookupServiceNextW(hlookup.toString(), dwcontrolflags.toInt(), lpdwbufferlength.toString(), lpqsresults.toString()) as Int) else 0

public actual fun WSANSPIoctl(hlookup: HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSANSPIoctl(hlookup.toString(), dwcontrolcode.toInt(), lpvinbuffer.toString(), cbinbuffer.toInt(), lpvoutbuffer.toString(), cboutbuffer.toInt(), lpcbbytesreturned.toString(), lpcompletion.toString()) as Int) else 0

public actual fun WSANtohl(s: SOCKET, netlong: UInt, lphostlong: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSANtohl(s.toString(), netlong.toInt(), lphostlong.toString()) as Int) else 0

public actual fun WSANtohs(s: SOCKET, netshort: UShort, lphostshort: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSANtohs(s.toString(), netshort.toInt(), lphostshort.toString()) as Int) else 0

public actual fun WSAPoll(fdarray: Long, fds: UInt, timeout: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAPoll(fdarray.toString(), fds.toInt(), timeout) as Int) else 0

public actual fun WSAProviderCompleteAsyncCall(hasynccall: HANDLE, iretcode: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall(hasynccall.toString(), iretcode) as Int) else 0

public actual fun WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAProviderConfigChange(lpnotificationhandle.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSAQuerySocketSecurity(socket: SOCKET, securityquerytemplate: Long, securityquerytemplatelen: UInt, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity(socket.toString(), securityquerytemplate.toString(), securityquerytemplatelen.toInt(), securityqueryinfo.toString(), securityqueryinfolen.toString(), overlapped.toString(), completionroutine.toLong().toString()) as Int) else 0

public actual fun WSARecv(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSARecv(s.toString(), lpbuffers.toString(), dwbuffercount.toInt(), lpnumberofbytesrecvd.toString(), lpflags.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSARecvDisconnect(s: SOCKET, lpinbounddisconnectdata: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSARecvDisconnect(s.toString(), lpinbounddisconnectdata.toString()) as Int) else 0

public actual fun WSARecvEx(s: SOCKET, buf: PSTR, len: Int, flags: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSARecvEx(s.toString(), buf.toString(), len, flags.toString()) as Int) else 0

public actual fun WSARecvFrom(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSARecvFrom(s.toString(), lpbuffers.toString(), dwbuffercount.toInt(), lpnumberofbytesrecvd.toString(), lpflags.toString(), lpfrom.toString(), lpfromlen.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSARemoveServiceClass(lpserviceclassid: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSARemoveServiceClass(lpserviceclassid.toString()) as Int) else 0

public actual fun WSAResetEvent(hevent: WSAEVENT): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAResetEvent(hevent.toString()) as Int) else 0

public actual fun WSARevertImpersonation(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSARevertImpersonation() as Int) else 0

public actual fun WSASend(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASend(s.toString(), lpbuffers.toString(), dwbuffercount.toInt(), lpnumberofbytessent.toString(), dwflags.toInt(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSASendDisconnect(s: SOCKET, lpoutbounddisconnectdata: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASendDisconnect(s.toString(), lpoutbounddisconnectdata.toString()) as Int) else 0

public actual fun WSASendMsg(handle: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASendMsg(handle.toString(), lpmsg.toString(), dwflags.toInt(), lpnumberofbytessent.toString(), lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSASendTo(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASendTo(s.toString(), lpbuffers.toString(), dwbuffercount.toInt(), lpnumberofbytessent.toString(), dwflags.toInt(), lpto.toString(), itolen, lpoverlapped.toString(), lpcompletionroutine.toLong().toString()) as Int) else 0

public actual fun WSASetBlockingHook(lpblockfunc: FARPROC): FARPROC =
    null

public actual fun WSASetEvent(hevent: WSAEVENT): BOOL =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASetEvent(hevent.toString()) as Int) else 0

public actual fun WSASetLastError(ierror: Int) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASetLastError(ierror)
    }
}

public actual fun WSASetServiceA(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASetServiceA(lpqsreginfo.toString(), essoperation, dwcontrolflags.toInt()) as Int) else 0

public actual fun WSASetServiceW(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASetServiceW(lpqsreginfo.toString(), essoperation, dwcontrolflags.toInt()) as Int) else 0

public actual fun WSASetSocketPeerTargetName(socket: SOCKET, peertargetname: Long, peertargetnamelen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName(socket.toString(), peertargetname.toString(), peertargetnamelen.toInt(), overlapped.toString(), completionroutine.toLong().toString()) as Int) else 0

public actual fun WSASetSocketSecurity(socket: SOCKET, securitysettings: Long, securitysettingslen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASetSocketSecurity(socket.toString(), securitysettings.toString(), securitysettingslen.toInt(), overlapped.toString(), completionroutine.toLong().toString()) as Int) else 0

public actual fun WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASocketA(af, type, protocol, lpprotocolinfo.toString(), g.toInt(), dwflags.toInt()) as String).toULong() else 0uL

public actual fun WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSASocketW(af, type, protocol, lpprotocolinfo.toString(), g.toInt(), dwflags.toInt()) as String).toULong() else 0uL

public actual fun WSAStartup(wversionrequested: UShort, lpwsadata: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAStartup(wversionrequested.toInt(), lpwsadata.toString()) as Int) else 0

public actual fun WSAStringToAddressA(addressstring: PCSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAStringToAddressA(addressstring.toString(), addressfamily, lpprotocolinfo.toString(), lpaddress.toString(), lpaddresslength.toString()) as Int) else 0

public actual fun WSAStringToAddressW(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAStringToAddressW(addressstring.toString(), addressfamily, lpprotocolinfo.toString(), lpaddress.toString(), lpaddresslength.toString()) as Int) else 0

public actual fun WSAUnadvertiseProvider(puuidproviderid: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider(puuidproviderid.toString()) as Int) else 0

public actual fun WSAUnhookBlockingHook(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook() as Int) else 0

public actual fun WSAWaitForMultipleEvents(cevents: UInt, lphevents: Long, fwaitall: BOOL, dwtimeout: UInt, falertable: BOOL): WAIT_EVENT =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents(cevents.toInt(), lphevents.toString(), fwaitall, dwtimeout.toInt(), falertable) as Int).toUInt() else 0u

public actual fun WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCDeinstallProvider(lpproviderid.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32(lpproviderid.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCEnableNSProvider(lpproviderid: Long, fenable: BOOL): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCEnableNSProvider(lpproviderid.toString(), fenable) as Int) else 0

public actual fun WSCEnableNSProvider32(lpproviderid: Long, fenable: BOOL): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32(lpproviderid.toString(), fenable) as Int) else 0

public actual fun WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32(lpdwbufferlength.toString(), lpnspbuffer.toString()) as Int) else 0

public actual fun WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32(lpdwbufferlength.toString(), lpnspbuffer.toString()) as Int) else 0

public actual fun WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCEnumProtocols(lpiprotocols.toString(), lpprotocolbuffer.toString(), lpdwbufferlength.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCEnumProtocols32(lpiprotocols.toString(), lpprotocolbuffer.toString(), lpdwbufferlength.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCGetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, ppermittedlspcategories: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory(path.toString(), pathlength.toInt(), extra.toString(), extralength.toInt(), ppermittedlspcategories.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCGetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCGetProviderInfo(lpproviderid.toString(), infotype, info.toString(), infosize.toString(), flags.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCGetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32(lpproviderid.toString(), infotype, info.toString(), infosize.toString(), flags.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCGetProviderPath(lpproviderid.toString(), lpszproviderdllpath.toString(), lpproviderdllpathlen.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCGetProviderPath32(lpproviderid.toString(), lpszproviderdllpath.toString(), lpproviderdllpathlen.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCInstallNameSpace(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallNameSpace(lpszidentifier.toString(), lpszpathname.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.toString()) as Int) else 0

public actual fun WSCInstallNameSpace32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32(lpszidentifier.toString(), lpszpathname.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.toString()) as Int) else 0

public actual fun WSCInstallNameSpaceEx(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx(lpszidentifier.toString(), lpszpathname.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.toString(), lpproviderspecific.toString()) as Int) else 0

public actual fun WSCInstallNameSpaceEx32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32(lpszidentifier.toString(), lpszpathname.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.toString(), lpproviderspecific.toString()) as Int) else 0

public actual fun WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallProvider(lpproviderid.toString(), lpszproviderdllpath.toString(), lpprotocolinfolist.toString(), dwnumberofentries.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32(lpproviderid.toString(), lpszproviderdllpath.toString(), lpprotocolinfolist.toString(), dwnumberofentries.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpszproviderdllpath32: PCWSTR, lpszlspname: PCWSTR, dwserviceflags: UInt, lpprotocolinfolist: Long, dwnumberofentries: UInt, lpdwcatalogentryid: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32(lpproviderid.toString(), lpszproviderdllpath.toString(), lpszproviderdllpath32.toString(), lpszlspname.toString(), dwserviceflags.toInt(), lpprotocolinfolist.toString(), dwnumberofentries.toInt(), lpdwcatalogentryid.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCSetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: Long, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory(path.toString(), pathlength.toInt(), extra.toString(), extralength.toInt(), permittedlspcategories.toInt(), pprevpermlspcat.toString(), lperrno.toString()) as Int) else 0

public actual fun WSCSetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCSetProviderInfo(lpproviderid.toString(), infotype, info.toString(), infosize.toString(), flags.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCSetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32(lpproviderid.toString(), infotype, info.toString(), infosize.toString(), flags.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCUnInstallNameSpace(lpproviderid: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace(lpproviderid.toString()) as Int) else 0

public actual fun WSCUnInstallNameSpace32(lpproviderid: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32(lpproviderid.toString()) as Int) else 0

public actual fun WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCUpdateProvider(lpproviderid.toString(), lpszproviderdllpath.toString(), lpprotocolinfolist.toString(), dwnumberofentries.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCUpdateProvider32(lpproviderid.toString(), lpszproviderdllpath.toString(), lpprotocolinfolist.toString(), dwnumberofentries.toInt(), lperrno.toString()) as Int) else 0

public actual fun WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder(lpproviderid.toString(), dwnumberofentries.toInt()) as Int) else 0

public actual fun WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32(lpproviderid.toString(), dwnumberofentries.toInt()) as Int) else 0

public actual fun WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder(lpwdcatalogentryid.toString(), dwnumberofentries.toInt()) as Int) else 0

public actual fun WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32(lpwdcatalogentryid.toString(), dwnumberofentries.toInt()) as Int) else 0

public actual fun __WSAFDIsSet(fd: SOCKET, param1: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock___WSAFDIsSet(fd.toString(), param1.toString()) as Int) else 0

public actual fun accept(s: SOCKET, addr: Long, addrlen: Long): SOCKET =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_accept(s.toString(), addr.toString(), addrlen.toString()) as String).toULong() else 0uL

public actual fun bind(s: SOCKET, name: Long, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_bind(s.toString(), name.toString(), namelen) as Int) else 0

public actual fun closesocket(s: SOCKET): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_closesocket(s.toString()) as Int) else 0

public actual fun connect(s: SOCKET, name: Long, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_connect(s.toString(), name.toString(), namelen) as Int) else 0

public actual fun freeaddrinfo(paddrinfo: Long) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_freeaddrinfo(paddrinfo.toString())
    }
}

public actual fun getaddrinfo(pnodename: PCSTR, pservicename: PCSTR, phints: Long, ppresult: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getaddrinfo(pnodename.toString(), pservicename.toString(), phints.toString(), ppresult.toString()) as Int) else 0

public actual fun gethostbyaddr(addr: PCSTR, len: Int, type: Int): Long =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_gethostbyaddr(addr.toString(), len, type) as String).toLong() else 0L

public actual fun gethostbyname(name: PCSTR): Long =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_gethostbyname(name.toString()) as String).toLong() else 0L

public actual fun gethostname(name: PSTR, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_gethostname(name.toString(), namelen) as Int) else 0

public actual fun getnameinfo(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PSTR, nodebuffersize: UInt, pservicebuffer: PSTR, servicebuffersize: UInt, flags: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getnameinfo(psockaddr.toString(), sockaddrlength, pnodebuffer.toString(), nodebuffersize.toInt(), pservicebuffer.toString(), servicebuffersize.toInt(), flags) as Int) else 0

public actual fun getpeername(s: SOCKET, name: Long, namelen: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getpeername(s.toString(), name.toString(), namelen.toString()) as Int) else 0

public actual fun getprotobyname(name: PCSTR): Long =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getprotobyname(name.toString()) as String).toLong() else 0L

public actual fun getprotobynumber(number: Int): Long =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getprotobynumber(number) as String).toLong() else 0L

public actual fun getservbyname(name: PCSTR, proto: PCSTR): Long =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getservbyname(name.toString(), proto.toString()) as String).toLong() else 0L

public actual fun getservbyport(port: Int, proto: PCSTR): Long =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getservbyport(port, proto.toString()) as String).toLong() else 0L

public actual fun getsockname(s: SOCKET, name: Long, namelen: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getsockname(s.toString(), name.toString(), namelen.toString()) as Int) else 0

public actual fun getsockopt(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getsockopt(s.toString(), level, optname, optval.toString(), optlen.toString()) as Int) else 0

public actual fun htonl(hostlong: UInt): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_htonl(hostlong.toInt()) as Int).toUInt() else 0u

public actual fun htons(hostshort: UShort): UShort =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_htons(hostshort.toInt()) as Int).toUShort() else 0u

public actual fun inet_addr(cp: PCSTR): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inet_addr(cp.toString()) as Int).toUInt() else 0u

public actual fun inet_ntoa(input: IN_ADDR): PSTR =
    0L

public actual fun inet_ntop(family: Int, paddr: Long, pstringbuf: PSTR, stringbufsize: ULong): PCSTR =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inet_ntop(family, paddr.toString(), pstringbuf.toString(), stringbufsize.toString()) as String).toLong() else 0L

public actual fun inet_pton(family: Int, pszaddrstring: PCSTR, paddrbuf: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inet_pton(family, pszaddrstring.toString(), paddrbuf.toString()) as Int) else 0

public actual fun ioctlsocket(s: SOCKET, cmd: Int, argp: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ioctlsocket(s.toString(), cmd, argp.toString()) as Int) else 0

public actual fun listen(s: SOCKET, backlog: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_listen(s.toString(), backlog) as Int) else 0

public actual fun ntohl(netlong: UInt): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ntohl(netlong.toInt()) as Int).toUInt() else 0u

public actual fun ntohs(netshort: UShort): UShort =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ntohs(netshort.toInt()) as Int).toUShort() else 0u

public actual fun recv(s: SOCKET, buf: PSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_recv(s.toString(), buf.toString(), len, flags) as Int) else 0

public actual fun recvfrom(s: SOCKET, buf: PSTR, len: Int, flags: Int, from: Long, fromlen: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_recvfrom(s.toString(), buf.toString(), len, flags, from.toString(), fromlen.toString()) as Int) else 0

public actual fun select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_select(nfds, readfds.toString(), writefds.toString(), exceptfds.toString(), timeout.toString()) as Int) else 0

public actual fun send(s: SOCKET, buf: PCSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_send(s.toString(), buf.toString(), len, flags) as Int) else 0

public actual fun sendto(s: SOCKET, buf: PCSTR, len: Int, flags: Int, to: Long, tolen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_sendto(s.toString(), buf.toString(), len, flags, to.toString(), tolen) as Int) else 0

public actual fun setsockopt(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setsockopt(s.toString(), level, optname, optval.toString(), optlen) as Int) else 0

public actual fun shutdown(s: SOCKET, how: WINSOCK_SHUTDOWN_HOW): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_shutdown(s.toString(), how) as Int) else 0

public actual fun socket(af: Int, type: WINSOCK_SOCKET_TYPE, protocol: Int): SOCKET =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_socket(af, type, protocol) as String).toULong() else 0uL
