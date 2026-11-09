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

public actual fun AcceptEx(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL =
    0

public actual fun EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    0

public actual fun EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    0

public actual fun FreeAddrInfoEx(paddrinfoex: Long) {
}

public actual fun FreeAddrInfoExW(paddrinfoex: Long) {
}

public actual fun FreeAddrInfoW(paddrinfo: Long) {
}

public actual fun GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long) {
}

public actual fun GetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    0

public actual fun GetAddrInfoExCancel(lphandle: Long): Int =
    0

public actual fun GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int =
    0

public actual fun GetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle: Long): Int =
    0

public actual fun GetAddrInfoW(pnodename: PCWSTR, pservicename: PCWSTR, phints: Long, ppresult: Long): Int =
    0

public actual fun GetAddressByNameA(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PSTR, lpdwaliasbufferlength: Long): Int =
    0

public actual fun GetAddressByNameW(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCWSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PWSTR, lpdwaliasbufferlength: Long): Int =
    0

public actual fun GetHostNameW(name: PWSTR, namelen: Int): Int =
    0

public actual fun GetNameByTypeA(lpservicetype: Long, lpservicename: PSTR, dwnamelength: UInt): Int =
    0

public actual fun GetNameByTypeW(lpservicetype: Long, lpservicename: PWSTR, dwnamelength: UInt): Int =
    0

public actual fun GetNameInfoW(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PWSTR, nodebuffersize: UInt, pservicebuffer: PWSTR, servicebuffersize: UInt, flags: Int): Int =
    0

public actual fun GetServiceA(dwnamespace: UInt, lpguid: Long, lpservicename: PCSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    0

public actual fun GetServiceW(dwnamespace: UInt, lpguid: Long, lpservicename: PCWSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    0

public actual fun GetTypeByNameA(lpservicename: PCSTR, lpservicetype: Long): Int =
    0

public actual fun GetTypeByNameW(lpservicename: PCWSTR, lpservicetype: Long): Int =
    0

public actual fun InetNtopW(family: Int, paddr: Long, pstringbuf: PWSTR, stringbufsize: ULong): PCWSTR =
    0L

public actual fun InetPtonW(family: Int, pszaddrstring: PCWSTR, paddrbuf: Long): Int =
    0

public actual fun ProcessSocketNotifications(completionport: HANDLE, registrationcount: UInt, registrationinfos: Long, timeoutms: UInt, completioncount: UInt, completionportentries: Long, receivedentrycount: Long): UInt =
    0u

public actual fun RtlEthernetAddressToStringA(addr: Long, s: PSTR): PSTR =
    0L

public actual fun RtlEthernetAddressToStringW(addr: Long, s: PWSTR): PWSTR =
    0L

public actual fun RtlEthernetStringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    0

public actual fun RtlEthernetStringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    0

public actual fun RtlIpv4AddressToStringA(addr: Long, s: PSTR): PSTR =
    0L

public actual fun RtlIpv4AddressToStringExA(address: Long, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    0

public actual fun RtlIpv4AddressToStringExW(address: Long, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    0

public actual fun RtlIpv4AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    0L

public actual fun RtlIpv4StringToAddressA(s: PCSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    0

public actual fun RtlIpv4StringToAddressExA(addressstring: PCSTR, strict: Boolean, address: Long, port: Long): Int =
    0

public actual fun RtlIpv4StringToAddressExW(addressstring: PCWSTR, strict: Boolean, address: Long, port: Long): Int =
    0

public actual fun RtlIpv4StringToAddressW(s: PCWSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    0

public actual fun RtlIpv6AddressToStringA(addr: Long, s: PSTR): PSTR =
    0L

public actual fun RtlIpv6AddressToStringExA(address: Long, scopeid: UInt, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    0

public actual fun RtlIpv6AddressToStringExW(address: Long, scopeid: UInt, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    0

public actual fun RtlIpv6AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    0L

public actual fun RtlIpv6StringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    0

public actual fun RtlIpv6StringToAddressExA(addressstring: PCSTR, address: Long, scopeid: Long, port: Long): Int =
    0

public actual fun RtlIpv6StringToAddressExW(addressstring: PCWSTR, address: Long, scopeid: Long, port: Long): Int =
    0

public actual fun RtlIpv6StringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    0

public actual fun SetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    0

public actual fun SetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    0

public actual fun SetServiceA(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    0

public actual fun SetServiceW(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    0

public actual fun SetSocketMediaStreamingMode(value: BOOL): HRESULT =
    0

public actual fun TransmitFile(hsocket: SOCKET, hfile: HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL =
    0

public actual fun WPUCompleteOverlappedRequest(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int =
    0

public actual fun WSAAccept(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong): SOCKET =
    0uL

public actual fun WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PSTR, lpdwaddressstringlength: Long): Int =
    0

public actual fun WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long): Int =
    0

public actual fun WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int =
    0

public actual fun WSAAsyncGetHostByAddr(hwnd: HWND, wmsg: UInt, addr: PCSTR, len: Int, type: Int, buf: PSTR, buflen: Int): HANDLE =
    0L

public actual fun WSAAsyncGetHostByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    0L

public actual fun WSAAsyncGetProtoByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    0L

public actual fun WSAAsyncGetProtoByNumber(hwnd: HWND, wmsg: UInt, number: Int, buf: PSTR, buflen: Int): HANDLE =
    0L

public actual fun WSAAsyncGetServByName(hwnd: HWND, wmsg: UInt, name: PCSTR, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    0L

public actual fun WSAAsyncGetServByPort(hwnd: HWND, wmsg: UInt, port: Int, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    0L

public actual fun WSAAsyncSelect(s: SOCKET, hwnd: HWND, wmsg: UInt, levent: Int): Int =
    0

public actual fun WSACancelAsyncRequest(hasynctaskhandle: HANDLE): Int =
    0

public actual fun WSACancelBlockingCall(): Int =
    0

public actual fun WSACleanup(): Int =
    0

public actual fun WSACloseEvent(hevent: WSAEVENT): BOOL =
    0

public actual fun WSAConnect(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int =
    0

public actual fun WSAConnectByList(s: SOCKET, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    0

public actual fun WSAConnectByNameA(s: SOCKET, nodename: PCSTR, servicename: PCSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    0

public actual fun WSAConnectByNameW(s: SOCKET, nodename: PCWSTR, servicename: PCWSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    0

public actual fun WSACreateEvent(): WSAEVENT =
    0L

public actual fun WSADeleteSocketPeerTargetName(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSADuplicateSocketA(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    0

public actual fun WSADuplicateSocketW(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    0

public actual fun WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    0

public actual fun WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    0

public actual fun WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    0

public actual fun WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    0

public actual fun WSAEnumNetworkEvents(s: SOCKET, heventobject: WSAEVENT, lpnetworkevents: Long): Int =
    0

public actual fun WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    0

public actual fun WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    0

public actual fun WSAEventSelect(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int): Int =
    0

public actual fun WSAGetLastError(): WSA_ERROR =
    0

public actual fun WSAGetOverlappedResult(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long): BOOL =
    0

public actual fun WSAGetQOSByName(s: SOCKET, lpqosname: Long, lpqos: Long): BOOL =
    0

public actual fun WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    0

public actual fun WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    0

public actual fun WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: PSTR, lpdwbufferlength: Long): Int =
    0

public actual fun WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: PWSTR, lpdwbufferlength: Long): Int =
    0

public actual fun WSAHtonl(s: SOCKET, hostlong: UInt, lpnetlong: Long): Int =
    0

public actual fun WSAHtons(s: SOCKET, hostshort: UShort, lpnetshort: Long): Int =
    0

public actual fun WSAImpersonateSocketPeer(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt): Int =
    0

public actual fun WSAInstallServiceClassA(lpserviceclassinfo: Long): Int =
    0

public actual fun WSAInstallServiceClassW(lpserviceclassinfo: Long): Int =
    0

public actual fun WSAIoctl(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSAIsBlocking(): BOOL =
    0

public actual fun WSAJoinLeaf(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt): SOCKET =
    0uL

public actual fun WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    0

public actual fun WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    0

public actual fun WSALookupServiceEnd(hlookup: HANDLE): Int =
    0

public actual fun WSALookupServiceNextA(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    0

public actual fun WSALookupServiceNextW(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    0

public actual fun WSANSPIoctl(hlookup: HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long): Int =
    0

public actual fun WSANtohl(s: SOCKET, netlong: UInt, lphostlong: Long): Int =
    0

public actual fun WSANtohs(s: SOCKET, netshort: UShort, lphostshort: Long): Int =
    0

public actual fun WSAPoll(fdarray: Long, fds: UInt, timeout: Int): Int =
    0

public actual fun WSAProviderCompleteAsyncCall(hasynccall: HANDLE, iretcode: Int): Int =
    0

public actual fun WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSAQuerySocketSecurity(socket: SOCKET, securityquerytemplate: Long, securityquerytemplatelen: UInt, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSARecv(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSARecvDisconnect(s: SOCKET, lpinbounddisconnectdata: Long): Int =
    0

public actual fun WSARecvEx(s: SOCKET, buf: PSTR, len: Int, flags: Long): Int =
    0

public actual fun WSARecvFrom(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSARemoveServiceClass(lpserviceclassid: Long): Int =
    0

public actual fun WSAResetEvent(hevent: WSAEVENT): BOOL =
    0

public actual fun WSARevertImpersonation(): Int =
    0

public actual fun WSASend(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSASendDisconnect(s: SOCKET, lpoutbounddisconnectdata: Long): Int =
    0

public actual fun WSASendMsg(handle: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSASendTo(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSASetBlockingHook(lpblockfunc: FARPROC): FARPROC =
    null

public actual fun WSASetEvent(hevent: WSAEVENT): BOOL =
    0

public actual fun WSASetLastError(ierror: Int) {
}

public actual fun WSASetServiceA(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    0

public actual fun WSASetServiceW(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    0

public actual fun WSASetSocketPeerTargetName(socket: SOCKET, peertargetname: Long, peertargetnamelen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSASetSocketSecurity(socket: SOCKET, securitysettings: Long, securitysettingslen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    0

public actual fun WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    0uL

public actual fun WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    0uL

public actual fun WSAStartup(wversionrequested: UShort, lpwsadata: Long): Int =
    0

public actual fun WSAStringToAddressA(addressstring: PCSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    0

public actual fun WSAStringToAddressW(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    0

public actual fun WSAUnadvertiseProvider(puuidproviderid: Long): Int =
    0

public actual fun WSAUnhookBlockingHook(): Int =
    0

public actual fun WSAWaitForMultipleEvents(cevents: UInt, lphevents: Long, fwaitall: BOOL, dwtimeout: UInt, falertable: BOOL): WAIT_EVENT =
    0u

public actual fun WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int =
    0

public actual fun WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int =
    0

public actual fun WSCEnableNSProvider(lpproviderid: Long, fenable: BOOL): Int =
    0

public actual fun WSCEnableNSProvider32(lpproviderid: Long, fenable: BOOL): Int =
    0

public actual fun WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    0

public actual fun WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    0

public actual fun WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    0

public actual fun WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    0

public actual fun WSCGetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, ppermittedlspcategories: Long, lperrno: Long): Int =
    0

public actual fun WSCGetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    0

public actual fun WSCGetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    0

public actual fun WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    0

public actual fun WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    0

public actual fun WSCInstallNameSpace(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    0

public actual fun WSCInstallNameSpace32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    0

public actual fun WSCInstallNameSpaceEx(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    0

public actual fun WSCInstallNameSpaceEx32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    0

public actual fun WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    0

public actual fun WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    0

public actual fun WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpszproviderdllpath32: PCWSTR, lpszlspname: PCWSTR, dwserviceflags: UInt, lpprotocolinfolist: Long, dwnumberofentries: UInt, lpdwcatalogentryid: Long, lperrno: Long): Int =
    0

public actual fun WSCSetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: Long, lperrno: Long): Int =
    0

public actual fun WSCSetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    0

public actual fun WSCSetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    0

public actual fun WSCUnInstallNameSpace(lpproviderid: Long): Int =
    0

public actual fun WSCUnInstallNameSpace32(lpproviderid: Long): Int =
    0

public actual fun WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    0

public actual fun WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    0

public actual fun WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: UInt): Int =
    0

public actual fun WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: UInt): Int =
    0

public actual fun WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    0

public actual fun WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    0

public actual fun __WSAFDIsSet(fd: SOCKET, param1: Long): Int =
    0

public actual fun accept(s: SOCKET, addr: Long, addrlen: Long): SOCKET =
    0uL

public actual fun bind(s: SOCKET, name: Long, namelen: Int): Int =
    0

public actual fun closesocket(s: SOCKET): Int =
    0

public actual fun connect(s: SOCKET, name: Long, namelen: Int): Int =
    0

public actual fun freeaddrinfo(paddrinfo: Long) {
}

public actual fun getaddrinfo(pnodename: PCSTR, pservicename: PCSTR, phints: Long, ppresult: Long): Int =
    0

public actual fun gethostbyaddr(addr: PCSTR, len: Int, type: Int): Long =
    0L

public actual fun gethostbyname(name: PCSTR): Long =
    0L

public actual fun gethostname(name: PSTR, namelen: Int): Int =
    0

public actual fun getnameinfo(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PSTR, nodebuffersize: UInt, pservicebuffer: PSTR, servicebuffersize: UInt, flags: Int): Int =
    0

public actual fun getpeername(s: SOCKET, name: Long, namelen: Long): Int =
    0

public actual fun getprotobyname(name: PCSTR): Long =
    0L

public actual fun getprotobynumber(number: Int): Long =
    0L

public actual fun getservbyname(name: PCSTR, proto: PCSTR): Long =
    0L

public actual fun getservbyport(port: Int, proto: PCSTR): Long =
    0L

public actual fun getsockname(s: SOCKET, name: Long, namelen: Long): Int =
    0

public actual fun getsockopt(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long): Int =
    0

public actual fun htonl(hostlong: UInt): UInt =
    0u

public actual fun htons(hostshort: UShort): UShort =
    0u

public actual fun inet_addr(cp: PCSTR): UInt =
    0u

public actual fun inet_ntoa(input: IN_ADDR): PSTR =
    0L

public actual fun inet_ntop(family: Int, paddr: Long, pstringbuf: PSTR, stringbufsize: ULong): PCSTR =
    0L

public actual fun inet_pton(family: Int, pszaddrstring: PCSTR, paddrbuf: Long): Int =
    0

public actual fun ioctlsocket(s: SOCKET, cmd: Int, argp: Long): Int =
    0

public actual fun listen(s: SOCKET, backlog: Int): Int =
    0

public actual fun ntohl(netlong: UInt): UInt =
    0u

public actual fun ntohs(netshort: UShort): UShort =
    0u

public actual fun recv(s: SOCKET, buf: PSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    0

public actual fun recvfrom(s: SOCKET, buf: PSTR, len: Int, flags: Int, from: Long, fromlen: Long): Int =
    0

public actual fun select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int =
    0

public actual fun send(s: SOCKET, buf: PCSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    0

public actual fun sendto(s: SOCKET, buf: PCSTR, len: Int, flags: Int, to: Long, tolen: Int): Int =
    0

public actual fun setsockopt(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int): Int =
    0

public actual fun shutdown(s: SOCKET, how: WINSOCK_SHUTDOWN_HOW): Int =
    0

public actual fun socket(af: Int, type: WINSOCK_SOCKET_TYPE, protocol: Int): SOCKET =
    0uL
