package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT

public expect fun AcceptEx(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL

public expect fun EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

public expect fun EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

public expect fun FreeAddrInfoEx(paddrinfoex: Long)

public expect fun FreeAddrInfoExW(paddrinfoex: Long)

public expect fun FreeAddrInfoW(paddrinfo: Long)

public expect fun GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long)

public expect fun GetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int

public expect fun GetAddrInfoExCancel(lphandle: Long): Int

public expect fun GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int

public expect fun GetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle: Long): Int

public expect fun GetAddrInfoW(pnodename: PCWSTR, pservicename: PCWSTR, phints: Long, ppresult: Long): Int

public expect fun GetAddressByNameA(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PSTR, lpdwaliasbufferlength: Long): Int

public expect fun GetAddressByNameW(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCWSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PWSTR, lpdwaliasbufferlength: Long): Int

public expect fun GetHostNameW(name: PWSTR, namelen: Int): Int

public expect fun GetNameByTypeA(lpservicetype: Long, lpservicename: PSTR, dwnamelength: UInt): Int

public expect fun GetNameByTypeW(lpservicetype: Long, lpservicename: PWSTR, dwnamelength: UInt): Int

public expect fun GetNameInfoW(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PWSTR, nodebuffersize: UInt, pservicebuffer: PWSTR, servicebuffersize: UInt, flags: Int): Int

public expect fun GetServiceA(dwnamespace: UInt, lpguid: Long, lpservicename: PCSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

public expect fun GetServiceW(dwnamespace: UInt, lpguid: Long, lpservicename: PCWSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

public expect fun GetTypeByNameA(lpservicename: PCSTR, lpservicetype: Long): Int

public expect fun GetTypeByNameW(lpservicename: PCWSTR, lpservicetype: Long): Int

public expect fun InetNtopW(family: Int, paddr: Long, pstringbuf: PWSTR, stringbufsize: ULong): PCWSTR

public expect fun InetPtonW(family: Int, pszaddrstring: PCWSTR, paddrbuf: Long): Int

public expect fun ProcessSocketNotifications(completionport: HANDLE, registrationcount: UInt, registrationinfos: Long, timeoutms: UInt, completioncount: UInt, completionportentries: Long, receivedentrycount: Long): UInt

public expect fun RtlEthernetAddressToStringA(addr: Long, s: PSTR): PSTR

public expect fun RtlEthernetAddressToStringW(addr: Long, s: PWSTR): PWSTR

public expect fun RtlEthernetStringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int

public expect fun RtlEthernetStringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int

public expect fun RtlIpv4AddressToStringA(addr: Long, s: PSTR): PSTR

public expect fun RtlIpv4AddressToStringExA(address: Long, port: UShort, addressstring: PSTR, addressstringlength: Long): Int

public expect fun RtlIpv4AddressToStringExW(address: Long, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int

public expect fun RtlIpv4AddressToStringW(addr: Long, s: PWSTR): PWSTR

public expect fun RtlIpv4StringToAddressA(s: PCSTR, strict: Boolean, terminator: Long, addr: Long): Int

public expect fun RtlIpv4StringToAddressExA(addressstring: PCSTR, strict: Boolean, address: Long, port: Long): Int

public expect fun RtlIpv4StringToAddressExW(addressstring: PCWSTR, strict: Boolean, address: Long, port: Long): Int

public expect fun RtlIpv4StringToAddressW(s: PCWSTR, strict: Boolean, terminator: Long, addr: Long): Int

public expect fun RtlIpv6AddressToStringA(addr: Long, s: PSTR): PSTR

public expect fun RtlIpv6AddressToStringExA(address: Long, scopeid: UInt, port: UShort, addressstring: PSTR, addressstringlength: Long): Int

public expect fun RtlIpv6AddressToStringExW(address: Long, scopeid: UInt, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int

public expect fun RtlIpv6AddressToStringW(addr: Long, s: PWSTR): PWSTR

public expect fun RtlIpv6StringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int

public expect fun RtlIpv6StringToAddressExA(addressstring: PCSTR, address: Long, scopeid: Long, port: Long): Int

public expect fun RtlIpv6StringToAddressExW(addressstring: PCWSTR, address: Long, scopeid: Long, port: Long): Int

public expect fun RtlIpv6StringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int

public expect fun SetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int

public expect fun SetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int

public expect fun SetServiceA(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

public expect fun SetServiceW(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

public expect fun SetSocketMediaStreamingMode(value: BOOL): HRESULT

public expect fun TransmitFile(hsocket: SOCKET, hfile: HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL

public expect fun WPUCompleteOverlappedRequest(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int

public expect fun WSAAccept(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong): SOCKET

public expect fun WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PSTR, lpdwaddressstringlength: Long): Int

public expect fun WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long): Int

public expect fun WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int

public expect fun WSAAsyncGetHostByAddr(hwnd: HWND, wmsg: UInt, addr: PCSTR, len: Int, type: Int, buf: PSTR, buflen: Int): HANDLE

public expect fun WSAAsyncGetHostByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE

public expect fun WSAAsyncGetProtoByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE

public expect fun WSAAsyncGetProtoByNumber(hwnd: HWND, wmsg: UInt, number: Int, buf: PSTR, buflen: Int): HANDLE

public expect fun WSAAsyncGetServByName(hwnd: HWND, wmsg: UInt, name: PCSTR, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE

public expect fun WSAAsyncGetServByPort(hwnd: HWND, wmsg: UInt, port: Int, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE

public expect fun WSAAsyncSelect(s: SOCKET, hwnd: HWND, wmsg: UInt, levent: Int): Int

public expect fun WSACancelAsyncRequest(hasynctaskhandle: HANDLE): Int

public expect fun WSACancelBlockingCall(): Int

public expect fun WSACleanup(): Int

public expect fun WSACloseEvent(hevent: WSAEVENT): BOOL

public expect fun WSAConnect(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int

public expect fun WSAConnectByList(s: SOCKET, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL

public expect fun WSAConnectByNameA(s: SOCKET, nodename: PCSTR, servicename: PCSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL

public expect fun WSAConnectByNameW(s: SOCKET, nodename: PCWSTR, servicename: PCWSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL

public expect fun WSACreateEvent(): WSAEVENT

public expect fun WSADeleteSocketPeerTargetName(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSADuplicateSocketA(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int

public expect fun WSADuplicateSocketW(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int

public expect fun WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

public expect fun WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

public expect fun WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

public expect fun WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

public expect fun WSAEnumNetworkEvents(s: SOCKET, heventobject: WSAEVENT, lpnetworkevents: Long): Int

public expect fun WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

public expect fun WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

public expect fun WSAEventSelect(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int): Int

public expect fun WSAGetLastError(): WSA_ERROR

public expect fun WSAGetOverlappedResult(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long): BOOL

public expect fun WSAGetQOSByName(s: SOCKET, lpqosname: Long, lpqos: Long): BOOL

public expect fun WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

public expect fun WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

public expect fun WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: PSTR, lpdwbufferlength: Long): Int

public expect fun WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: PWSTR, lpdwbufferlength: Long): Int

public expect fun WSAHtonl(s: SOCKET, hostlong: UInt, lpnetlong: Long): Int

public expect fun WSAHtons(s: SOCKET, hostshort: UShort, lpnetshort: Long): Int

public expect fun WSAImpersonateSocketPeer(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt): Int

public expect fun WSAInstallServiceClassA(lpserviceclassinfo: Long): Int

public expect fun WSAInstallServiceClassW(lpserviceclassinfo: Long): Int

public expect fun WSAIoctl(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSAIsBlocking(): BOOL

public expect fun WSAJoinLeaf(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt): SOCKET

public expect fun WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int

public expect fun WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int

public expect fun WSALookupServiceEnd(hlookup: HANDLE): Int

public expect fun WSALookupServiceNextA(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int

public expect fun WSALookupServiceNextW(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int

public expect fun WSANSPIoctl(hlookup: HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long): Int

public expect fun WSANtohl(s: SOCKET, netlong: UInt, lphostlong: Long): Int

public expect fun WSANtohs(s: SOCKET, netshort: UShort, lphostshort: Long): Int

public expect fun WSAPoll(fdarray: Long, fds: UInt, timeout: Int): Int

public expect fun WSAProviderCompleteAsyncCall(hasynccall: HANDLE, iretcode: Int): Int

public expect fun WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSAQuerySocketSecurity(socket: SOCKET, securityquerytemplate: Long, securityquerytemplatelen: UInt, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSARecv(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSARecvDisconnect(s: SOCKET, lpinbounddisconnectdata: Long): Int

public expect fun WSARecvEx(s: SOCKET, buf: PSTR, len: Int, flags: Long): Int

public expect fun WSARecvFrom(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSARemoveServiceClass(lpserviceclassid: Long): Int

public expect fun WSAResetEvent(hevent: WSAEVENT): BOOL

public expect fun WSARevertImpersonation(): Int

public expect fun WSASend(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSASendDisconnect(s: SOCKET, lpoutbounddisconnectdata: Long): Int

public expect fun WSASendMsg(handle: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSASendTo(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSASetBlockingHook(lpblockfunc: FARPROC): FARPROC

public expect fun WSASetEvent(hevent: WSAEVENT): BOOL

public expect fun WSASetLastError(ierror: Int)

public expect fun WSASetServiceA(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int

public expect fun WSASetServiceW(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int

public expect fun WSASetSocketPeerTargetName(socket: SOCKET, peertargetname: Long, peertargetnamelen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSASetSocketSecurity(socket: SOCKET, securitysettings: Long, securitysettingslen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int

public expect fun WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET

public expect fun WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET

public expect fun WSAStartup(wversionrequested: UShort, lpwsadata: Long): Int

public expect fun WSAStringToAddressA(addressstring: PCSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

public expect fun WSAStringToAddressW(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

public expect fun WSAUnadvertiseProvider(puuidproviderid: Long): Int

public expect fun WSAUnhookBlockingHook(): Int

public expect fun WSAWaitForMultipleEvents(cevents: UInt, lphevents: Long, fwaitall: BOOL, dwtimeout: UInt, falertable: BOOL): WAIT_EVENT

public expect fun WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int

public expect fun WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int

public expect fun WSCEnableNSProvider(lpproviderid: Long, fenable: BOOL): Int

public expect fun WSCEnableNSProvider32(lpproviderid: Long, fenable: BOOL): Int

public expect fun WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

public expect fun WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

public expect fun WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

public expect fun WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

public expect fun WSCGetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, ppermittedlspcategories: Long, lperrno: Long): Int

public expect fun WSCGetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int

public expect fun WSCGetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int

public expect fun WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int

public expect fun WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int

public expect fun WSCInstallNameSpace(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int

public expect fun WSCInstallNameSpace32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int

public expect fun WSCInstallNameSpaceEx(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int

public expect fun WSCInstallNameSpaceEx32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int

public expect fun WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int

public expect fun WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int

public expect fun WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpszproviderdllpath32: PCWSTR, lpszlspname: PCWSTR, dwserviceflags: UInt, lpprotocolinfolist: Long, dwnumberofentries: UInt, lpdwcatalogentryid: Long, lperrno: Long): Int

public expect fun WSCSetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: Long, lperrno: Long): Int

public expect fun WSCSetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int

public expect fun WSCSetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int

public expect fun WSCUnInstallNameSpace(lpproviderid: Long): Int

public expect fun WSCUnInstallNameSpace32(lpproviderid: Long): Int

public expect fun WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int

public expect fun WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int

public expect fun WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: UInt): Int

public expect fun WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: UInt): Int

public expect fun WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int

public expect fun WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int

public expect fun __WSAFDIsSet(fd: SOCKET, param1: Long): Int

public expect fun accept(s: SOCKET, addr: Long, addrlen: Long): SOCKET

public expect fun bind(s: SOCKET, name: Long, namelen: Int): Int

public expect fun closesocket(s: SOCKET): Int

public expect fun connect(s: SOCKET, name: Long, namelen: Int): Int

public expect fun freeaddrinfo(paddrinfo: Long)

public expect fun getaddrinfo(pnodename: PCSTR, pservicename: PCSTR, phints: Long, ppresult: Long): Int

public expect fun gethostbyaddr(addr: PCSTR, len: Int, type: Int): Long

public expect fun gethostbyname(name: PCSTR): Long

public expect fun gethostname(name: PSTR, namelen: Int): Int

public expect fun getnameinfo(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PSTR, nodebuffersize: UInt, pservicebuffer: PSTR, servicebuffersize: UInt, flags: Int): Int

public expect fun getpeername(s: SOCKET, name: Long, namelen: Long): Int

public expect fun getprotobyname(name: PCSTR): Long

public expect fun getprotobynumber(number: Int): Long

public expect fun getservbyname(name: PCSTR, proto: PCSTR): Long

public expect fun getservbyport(port: Int, proto: PCSTR): Long

public expect fun getsockname(s: SOCKET, name: Long, namelen: Long): Int

public expect fun getsockopt(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long): Int

public expect fun htonl(hostlong: UInt): UInt

public expect fun htons(hostshort: UShort): UShort

public expect fun inet_addr(cp: PCSTR): UInt

public expect fun inet_ntoa(input: IN_ADDR): PSTR

public expect fun inet_ntop(family: Int, paddr: Long, pstringbuf: PSTR, stringbufsize: ULong): PCSTR

public expect fun inet_pton(family: Int, pszaddrstring: PCSTR, paddrbuf: Long): Int

public expect fun ioctlsocket(s: SOCKET, cmd: Int, argp: Long): Int

public expect fun listen(s: SOCKET, backlog: Int): Int

public expect fun ntohl(netlong: UInt): UInt

public expect fun ntohs(netshort: UShort): UShort

public expect fun recv(s: SOCKET, buf: PSTR, len: Int, flags: SEND_RECV_FLAGS): Int

public expect fun recvfrom(s: SOCKET, buf: PSTR, len: Int, flags: Int, from: Long, fromlen: Long): Int

public expect fun select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int

public expect fun send(s: SOCKET, buf: PCSTR, len: Int, flags: SEND_RECV_FLAGS): Int

public expect fun sendto(s: SOCKET, buf: PCSTR, len: Int, flags: Int, to: Long, tolen: Int): Int

public expect fun setsockopt(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int): Int

public expect fun shutdown(s: SOCKET, how: WINSOCK_SHUTDOWN_HOW): Int

public expect fun socket(af: Int, type: WINSOCK_SOCKET_TYPE, protocol: Int): SOCKET
