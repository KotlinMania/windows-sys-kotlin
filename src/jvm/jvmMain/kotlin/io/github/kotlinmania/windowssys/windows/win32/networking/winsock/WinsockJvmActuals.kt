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

private object WindowsWin32NetworkingWinsockJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_AcceptEx(slistensocket: Long, sacceptsocket: Long, lpoutputbuffer: Long, dwreceivedatalength: Int, dwlocaladdresslength: Int, dwremoteaddresslength: Int, lpdwbytesreceived: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_FreeAddrInfoEx(paddrinfoex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_FreeAddrInfoExW(paddrinfoex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_FreeAddrInfoW(paddrinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: Int, dwlocaladdresslength: Int, dwremoteaddresslength: Int, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddrInfoExA(pname: Long, pservicename: Long, dwnamespace: Int, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel(lphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddrInfoExW(pname: Long, pservicename: Long, dwnamespace: Int, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddrInfoW(pnodename: Long, pservicename: Long, phints: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddressByNameA(dwnamespace: Int, lpservicetype: Long, lpservicename: Long, lpiprotocols: Long, dwresolution: Int, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: Long, lpdwaliasbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetAddressByNameW(dwnamespace: Int, lpservicetype: Long, lpservicename: Long, lpiprotocols: Long, dwresolution: Int, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: Long, lpdwaliasbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetHostNameW(name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetNameByTypeA(lpservicetype: Long, lpservicename: Long, dwnamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetNameByTypeW(lpservicetype: Long, lpservicename: Long, dwnamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetNameInfoW(psockaddr: Long, sockaddrlength: Int, pnodebuffer: Long, nodebuffersize: Int, pservicebuffer: Long, servicebuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetServiceA(dwnamespace: Int, lpguid: Long, lpservicename: Long, dwproperties: Int, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetServiceW(dwnamespace: Int, lpguid: Long, lpservicename: Long, dwproperties: Int, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetTypeByNameA(lpservicename: Long, lpservicetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_GetTypeByNameW(lpservicename: Long, lpservicetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_InetNtopW(family: Int, paddr: Long, pstringbuf: Long, stringbufsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_InetPtonW(family: Int, pszaddrstring: Long, paddrbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_ProcessSocketNotifications(completionport: Long, registrationcount: Int, registrationinfos: Long, timeoutms: Int, completioncount: Int, completionportentries: Long, receivedentrycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA(address: Long, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW(address: Long, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA(s: Long, strict: Boolean, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA(addressstring: Long, strict: Boolean, address: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW(addressstring: Long, strict: Boolean, address: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW(s: Long, strict: Boolean, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA(address: Long, scopeid: Int, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW(address: Long, scopeid: Int, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA(addressstring: Long, address: Long, scopeid: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW(addressstring: Long, address: Long, scopeid: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_SetAddrInfoExA(pname: Long, pservicename: Long, paddresses: Long, dwaddresscount: Int, lpblob: Long, dwflags: Int, dwnamespace: Int, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_SetAddrInfoExW(pname: Long, pservicename: Long, paddresses: Long, dwaddresscount: Int, lpblob: Long, dwflags: Int, dwnamespace: Int, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_SetServiceA(dwnamespace: Int, dwoperation: Int, dwflags: Int, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_SetServiceW(dwnamespace: Int, dwoperation: Int, dwflags: Int, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode(value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_TransmitFile(hsocket: Long, hfile: Long, nnumberofbytestowrite: Int, nnumberofbytespersend: Int, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest(s: Long, lpoverlapped: Long, dwerror: Int, cbtransferred: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAccept(s: Long, addr: Long, addrlen: Long, lpfncondition: Long, dwcallbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: Int, lpprotocolinfo: Long, lpszaddressstring: Long, lpdwaddressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: Int, lpprotocolinfo: Long, lpszaddressstring: Long, lpdwaddressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr(hwnd: Long, wmsg: Int, addr: Long, len: Int, type: Int, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName(hwnd: Long, wmsg: Int, name: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName(hwnd: Long, wmsg: Int, name: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber(hwnd: Long, wmsg: Int, number: Int, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName(hwnd: Long, wmsg: Int, name: Long, proto: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort(hwnd: Long, wmsg: Int, port: Int, proto: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAAsyncSelect(s: Long, hwnd: Long, wmsg: Int, levent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest(hasynctaskhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSACancelBlockingCall(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSACleanup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSACloseEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAConnect(s: Long, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAConnectByList(s: Long, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAConnectByNameA(s: Long, nodename: Long, servicename: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAConnectByNameW(s: Long, nodename: Long, servicename: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSACreateEvent(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName(socket: Long, peeraddr: Long, peeraddrlen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSADuplicateSocketA(s: Long, dwprocessid: Int, lpprotocolinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSADuplicateSocketW(s: Long, dwprocessid: Int, lpprotocolinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents(s: Long, heventobject: Long, lpnetworkevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAEventSelect(s: Long, heventobject: Long, lnetworkevents: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetLastError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult(s: Long, lpoverlapped: Long, lpcbtransfer: Long, fwait: Int, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetQOSByName(s: Long, lpqosname: Long, lpqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAHtonl(s: Long, hostlong: Int, lpnetlong: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAHtons(s: Long, hostshort: Short, lpnetshort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer(socket: Long, peeraddr: Long, peeraddrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA(lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW(lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAIoctl(s: Long, dwiocontrolcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAIsBlocking(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAJoinLeaf(s: Long, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: Int, lphlookup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: Int, lphlookup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSALookupServiceEnd(hlookup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSALookupServiceNextA(hlookup: Long, dwcontrolflags: Int, lpdwbufferlength: Long, lpqsresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSALookupServiceNextW(hlookup: Long, dwcontrolflags: Int, lpdwbufferlength: Long, lpqsresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSANSPIoctl(hlookup: Long, dwcontrolcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long, lpcompletion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSANtohl(s: Long, netlong: Int, lphostlong: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSANtohs(s: Long, netshort: Short, lphostshort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAPoll(fdarray: Long, fds: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall(hasynccall: Long, iretcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity(socket: Long, securityquerytemplate: Long, securityquerytemplatelen: Int, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSARecv(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSARecvDisconnect(s: Long, lpinbounddisconnectdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSARecvEx(s: Long, buf: Long, len: Int, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSARecvFrom(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSARemoveServiceClass(lpserviceclassid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAResetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSARevertImpersonation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASend(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytessent: Long, dwflags: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASendDisconnect(s: Long, lpoutbounddisconnectdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASendMsg(handle: Long, lpmsg: Long, dwflags: Int, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASendTo(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytessent: Long, dwflags: Int, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASetLastError(ierror: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASetServiceA(lpqsreginfo: Long, essoperation: Int, dwcontrolflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASetServiceW(lpqsreginfo: Long, essoperation: Int, dwcontrolflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName(socket: Long, peertargetname: Long, peertargetnamelen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASetSocketSecurity(socket: Long, securitysettings: Long, securitysettingslen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAStartup(wversionrequested: Short, lpwsadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAStringToAddressA(addressstring: Long, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAStringToAddressW(addressstring: Long, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider(puuidproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents(cevents: Int, lphevents: Long, fwaitall: Int, dwtimeout: Int, falertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCEnableNSProvider(lpproviderid: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32(lpproviderid: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory(path: Long, pathlength: Int, extra: Long, extralength: Int, ppermittedlspcategories: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCGetProviderInfo(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: Long, lpproviderdllpathlen: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: Long, lpproviderdllpathlen: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallNameSpace(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long, lpproviderspecific: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long, lpproviderspecific: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: Long, lpszproviderdllpath32: Long, lpszlspname: Long, dwserviceflags: Int, lpprotocolinfolist: Long, dwnumberofentries: Int, lpdwcatalogentryid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory(path: Long, pathlength: Int, extra: Long, extralength: Int, permittedlspcategories: Int, pprevpermlspcat: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCSetProviderInfo(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace(lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32(lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock___WSAFDIsSet(fd: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_accept(s: Long, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_bind(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_closesocket(s: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_connect(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_freeaddrinfo(paddrinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getaddrinfo(pnodename: Long, pservicename: Long, phints: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_gethostbyaddr(addr: Long, len: Int, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_gethostbyname(name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_gethostname(name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getnameinfo(psockaddr: Long, sockaddrlength: Int, pnodebuffer: Long, nodebuffersize: Int, pservicebuffer: Long, servicebuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getpeername(s: Long, name: Long, namelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getprotobyname(name: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getprotobynumber(number: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getservbyname(name: Long, proto: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getservbyport(port: Int, proto: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getsockname(s: Long, name: Long, namelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_htonl(hostlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_htons(hostshort: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inet_addr(cp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inet_ntop(family: Int, paddr: Long, pstringbuf: Long, stringbufsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inet_pton(family: Int, pszaddrstring: Long, paddrbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_ioctlsocket(s: Long, cmd: Int, argp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_listen(s: Long, backlog: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_ntohl(netlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_ntohs(netshort: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_recv(s: Long, buf: Long, len: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_recvfrom(s: Long, buf: Long, len: Int, flags: Int, from: Long, fromlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_send(s: Long, buf: Long, len: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_sendto(s: Long, buf: Long, len: Int, flags: Int, to: Long, tolen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_setsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_shutdown(s: Long, how: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_socket(af: Int, type: Int, protocol: Int): Long
}

public actual fun AcceptEx(slistensocket: SOCKET, sacceptsocket: SOCKET, lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: Long, lpoverlapped: Long): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_AcceptEx(slistensocket.toLong(), sacceptsocket.toLong(), lpoutputbuffer, dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), lpdwbytesreceived, lpoverlapped)

public actual fun EnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_EnumProtocolsA(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)

public actual fun EnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_EnumProtocolsW(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)

public actual fun FreeAddrInfoEx(paddrinfoex: Long) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_FreeAddrInfoEx(paddrinfoex)
}

public actual fun FreeAddrInfoExW(paddrinfoex: Long) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_FreeAddrInfoExW(paddrinfoex)
}

public actual fun FreeAddrInfoW(paddrinfo: Long) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_FreeAddrInfoW(paddrinfo)
}

public actual fun GetAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAcceptExSockaddrs(lpoutputbuffer, dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), localsockaddr, localsockaddrlength, remotesockaddr, remotesockaddrlength)
}

public actual fun GetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddrInfoExA(pname, pservicename, dwnamespace.toInt(), lpnspid, hints, ppresult, timeout, lpoverlapped, lpcompletionroutine.toLong(), lpnamehandle)

public actual fun GetAddrInfoExCancel(lphandle: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddrInfoExCancel(lphandle)

public actual fun GetAddrInfoExOverlappedResult(lpoverlapped: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddrInfoExOverlappedResult(lpoverlapped)

public actual fun GetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, dwnamespace: UInt, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lphandle: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddrInfoExW(pname, pservicename, dwnamespace.toInt(), lpnspid, hints, ppresult, timeout, lpoverlapped, lpcompletionroutine.toLong(), lphandle)

public actual fun GetAddrInfoW(pnodename: PCWSTR, pservicename: PCWSTR, phints: Long, ppresult: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddrInfoW(pnodename, pservicename, phints, ppresult)

public actual fun GetAddressByNameA(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PSTR, lpdwaliasbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddressByNameA(dwnamespace.toInt(), lpservicetype, lpservicename, lpiprotocols, dwresolution.toInt(), lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength)

public actual fun GetAddressByNameW(dwnamespace: UInt, lpservicetype: Long, lpservicename: PCWSTR, lpiprotocols: Long, dwresolution: UInt, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: PWSTR, lpdwaliasbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetAddressByNameW(dwnamespace.toInt(), lpservicetype, lpservicename, lpiprotocols, dwresolution.toInt(), lpserviceasyncinfo, lpcsaddrbuffer, lpdwbufferlength, lpaliasbuffer, lpdwaliasbufferlength)

public actual fun GetHostNameW(name: PWSTR, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetHostNameW(name, namelen)

public actual fun GetNameByTypeA(lpservicetype: Long, lpservicename: PSTR, dwnamelength: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetNameByTypeA(lpservicetype, lpservicename, dwnamelength.toInt())

public actual fun GetNameByTypeW(lpservicetype: Long, lpservicename: PWSTR, dwnamelength: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetNameByTypeW(lpservicetype, lpservicename, dwnamelength.toInt())

public actual fun GetNameInfoW(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PWSTR, nodebuffersize: UInt, pservicebuffer: PWSTR, servicebuffersize: UInt, flags: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetNameInfoW(psockaddr, sockaddrlength, pnodebuffer, nodebuffersize.toInt(), pservicebuffer, servicebuffersize.toInt(), flags)

public actual fun GetServiceA(dwnamespace: UInt, lpguid: Long, lpservicename: PCSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetServiceA(dwnamespace.toInt(), lpguid, lpservicename, dwproperties.toInt(), lpbuffer, lpdwbuffersize, lpserviceasyncinfo)

public actual fun GetServiceW(dwnamespace: UInt, lpguid: Long, lpservicename: PCWSTR, dwproperties: UInt, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetServiceW(dwnamespace.toInt(), lpguid, lpservicename, dwproperties.toInt(), lpbuffer, lpdwbuffersize, lpserviceasyncinfo)

public actual fun GetTypeByNameA(lpservicename: PCSTR, lpservicetype: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetTypeByNameA(lpservicename, lpservicetype)

public actual fun GetTypeByNameW(lpservicename: PCWSTR, lpservicetype: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_GetTypeByNameW(lpservicename, lpservicetype)

public actual fun InetNtopW(family: Int, paddr: Long, pstringbuf: PWSTR, stringbufsize: ULong): PCWSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_InetNtopW(family, paddr, pstringbuf, stringbufsize.toLong())

public actual fun InetPtonW(family: Int, pszaddrstring: PCWSTR, paddrbuf: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_InetPtonW(family, pszaddrstring, paddrbuf)

public actual fun ProcessSocketNotifications(completionport: HANDLE, registrationcount: UInt, registrationinfos: Long, timeoutms: UInt, completioncount: UInt, completionportentries: Long, receivedentrycount: Long): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ProcessSocketNotifications(completionport, registrationcount.toInt(), registrationinfos, timeoutms.toInt(), completioncount.toInt(), completionportentries, receivedentrycount).toUInt()

public actual fun RtlEthernetAddressToStringA(addr: Long, s: PSTR): PSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringA(addr, s)

public actual fun RtlEthernetAddressToStringW(addr: Long, s: PWSTR): PWSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlEthernetAddressToStringW(addr, s)

public actual fun RtlEthernetStringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressA(s, terminator, addr)

public actual fun RtlEthernetStringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlEthernetStringToAddressW(s, terminator, addr)

public actual fun RtlIpv4AddressToStringA(addr: Long, s: PSTR): PSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringA(addr, s)

public actual fun RtlIpv4AddressToStringExA(address: Long, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExA(address, port.toShort(), addressstring, addressstringlength)

public actual fun RtlIpv4AddressToStringExW(address: Long, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringExW(address, port.toShort(), addressstring, addressstringlength)

public actual fun RtlIpv4AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4AddressToStringW(addr, s)

public actual fun RtlIpv4StringToAddressA(s: PCSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressA(s, strict, terminator, addr)

public actual fun RtlIpv4StringToAddressExA(addressstring: PCSTR, strict: Boolean, address: Long, port: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExA(addressstring, strict, address, port)

public actual fun RtlIpv4StringToAddressExW(addressstring: PCWSTR, strict: Boolean, address: Long, port: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressExW(addressstring, strict, address, port)

public actual fun RtlIpv4StringToAddressW(s: PCWSTR, strict: Boolean, terminator: Long, addr: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv4StringToAddressW(s, strict, terminator, addr)

public actual fun RtlIpv6AddressToStringA(addr: Long, s: PSTR): PSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringA(addr, s)

public actual fun RtlIpv6AddressToStringExA(address: Long, scopeid: UInt, port: UShort, addressstring: PSTR, addressstringlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExA(address, scopeid.toInt(), port.toShort(), addressstring, addressstringlength)

public actual fun RtlIpv6AddressToStringExW(address: Long, scopeid: UInt, port: UShort, addressstring: PWSTR, addressstringlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringExW(address, scopeid.toInt(), port.toShort(), addressstring, addressstringlength)

public actual fun RtlIpv6AddressToStringW(addr: Long, s: PWSTR): PWSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6AddressToStringW(addr, s)

public actual fun RtlIpv6StringToAddressA(s: PCSTR, terminator: Long, addr: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressA(s, terminator, addr)

public actual fun RtlIpv6StringToAddressExA(addressstring: PCSTR, address: Long, scopeid: Long, port: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExA(addressstring, address, scopeid, port)

public actual fun RtlIpv6StringToAddressExW(addressstring: PCWSTR, address: Long, scopeid: Long, port: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressExW(addressstring, address, scopeid, port)

public actual fun RtlIpv6StringToAddressW(s: PCWSTR, terminator: Long, addr: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_RtlIpv6StringToAddressW(s, terminator, addr)

public actual fun SetAddrInfoExA(pname: PCSTR, pservicename: PCSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_SetAddrInfoExA(pname, pservicename, paddresses, dwaddresscount.toInt(), lpblob, dwflags.toInt(), dwnamespace.toInt(), lpnspid, timeout, lpoverlapped, lpcompletionroutine.toLong(), lpnamehandle)

public actual fun SetAddrInfoExW(pname: PCWSTR, pservicename: PCWSTR, paddresses: Long, dwaddresscount: UInt, lpblob: Long, dwflags: UInt, dwnamespace: UInt, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: LPLOOKUPSERVICE_COMPLETION_ROUTINE, lpnamehandle: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_SetAddrInfoExW(pname, pservicename, paddresses, dwaddresscount.toInt(), lpblob, dwflags.toInt(), dwnamespace.toInt(), lpnspid, timeout, lpoverlapped, lpcompletionroutine.toLong(), lpnamehandle)

public actual fun SetServiceA(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_SetServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags)

public actual fun SetServiceW(dwnamespace: UInt, dwoperation: SET_SERVICE_OPERATION, dwflags: UInt, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_SetServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo, lpserviceasyncinfo, lpdwstatusflags)

public actual fun SetSocketMediaStreamingMode(value: BOOL): HRESULT =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_SetSocketMediaStreamingMode(value)

public actual fun TransmitFile(hsocket: SOCKET, hfile: HANDLE, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: UInt): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_TransmitFile(hsocket.toLong(), hfile, nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), lpoverlapped, lptransmitbuffers, dwreserved.toInt())

public actual fun WPUCompleteOverlappedRequest(s: SOCKET, lpoverlapped: Long, dwerror: UInt, cbtransferred: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WPUCompleteOverlappedRequest(s.toLong(), lpoverlapped, dwerror.toInt(), cbtransferred.toInt(), lperrno)

public actual fun WSAAccept(s: SOCKET, addr: Long, addrlen: Long, lpfncondition: LPCONDITIONPROC, dwcallbackdata: ULong): SOCKET =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAccept(s.toLong(), addr, addrlen, lpfncondition.toLong(), dwcallbackdata.toLong()).toULong()

public actual fun WSAAddressToStringA(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PSTR, lpdwaddressstringlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAddressToStringA(lpsaaddress, dwaddresslength.toInt(), lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength)

public actual fun WSAAddressToStringW(lpsaaddress: Long, dwaddresslength: UInt, lpprotocolinfo: Long, lpszaddressstring: PWSTR, lpdwaddressstringlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAddressToStringW(lpsaaddress, dwaddresslength.toInt(), lpprotocolinfo, lpszaddressstring, lpdwaddressstringlength)

public actual fun WSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAdvertiseProvider(puuidproviderid, pnspv2routine)

public actual fun WSAAsyncGetHostByAddr(hwnd: HWND, wmsg: UInt, addr: PCSTR, len: Int, type: Int, buf: PSTR, buflen: Int): HANDLE =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByAddr(hwnd, wmsg.toInt(), addr, len, type, buf, buflen)

public actual fun WSAAsyncGetHostByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncGetHostByName(hwnd, wmsg.toInt(), name, buf, buflen)

public actual fun WSAAsyncGetProtoByName(hwnd: HWND, wmsg: UInt, name: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByName(hwnd, wmsg.toInt(), name, buf, buflen)

public actual fun WSAAsyncGetProtoByNumber(hwnd: HWND, wmsg: UInt, number: Int, buf: PSTR, buflen: Int): HANDLE =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncGetProtoByNumber(hwnd, wmsg.toInt(), number, buf, buflen)

public actual fun WSAAsyncGetServByName(hwnd: HWND, wmsg: UInt, name: PCSTR, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncGetServByName(hwnd, wmsg.toInt(), name, proto, buf, buflen)

public actual fun WSAAsyncGetServByPort(hwnd: HWND, wmsg: UInt, port: Int, proto: PCSTR, buf: PSTR, buflen: Int): HANDLE =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncGetServByPort(hwnd, wmsg.toInt(), port, proto, buf, buflen)

public actual fun WSAAsyncSelect(s: SOCKET, hwnd: HWND, wmsg: UInt, levent: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAAsyncSelect(s.toLong(), hwnd, wmsg.toInt(), levent)

public actual fun WSACancelAsyncRequest(hasynctaskhandle: HANDLE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSACancelAsyncRequest(hasynctaskhandle)

public actual fun WSACancelBlockingCall(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSACancelBlockingCall()

public actual fun WSACleanup(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSACleanup()

public actual fun WSACloseEvent(hevent: WSAEVENT): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSACloseEvent(hevent)

public actual fun WSAConnect(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAConnect(s.toLong(), name, namelen, lpcallerdata, lpcalleedata, lpsqos, lpgqos)

public actual fun WSAConnectByList(s: SOCKET, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAConnectByList(s.toLong(), socketaddress, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved)

public actual fun WSAConnectByNameA(s: SOCKET, nodename: PCSTR, servicename: PCSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAConnectByNameA(s.toLong(), nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved)

public actual fun WSAConnectByNameW(s: SOCKET, nodename: PCWSTR, servicename: PCWSTR, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAConnectByNameW(s.toLong(), nodename, servicename, localaddresslength, localaddress, remoteaddresslength, remoteaddress, timeout, reserved)

public actual fun WSACreateEvent(): WSAEVENT =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSACreateEvent()

public actual fun WSADeleteSocketPeerTargetName(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSADeleteSocketPeerTargetName(socket.toLong(), peeraddr, peeraddrlen.toInt(), overlapped, completionroutine.toLong())

public actual fun WSADuplicateSocketA(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSADuplicateSocketA(s.toLong(), dwprocessid.toInt(), lpprotocolinfo)

public actual fun WSADuplicateSocketW(s: SOCKET, dwprocessid: UInt, lpprotocolinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSADuplicateSocketW(s.toLong(), dwprocessid.toInt(), lpprotocolinfo)

public actual fun WSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersA(lpdwbufferlength, lpnspbuffer)

public actual fun WSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExA(lpdwbufferlength, lpnspbuffer)

public actual fun WSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersExW(lpdwbufferlength, lpnspbuffer)

public actual fun WSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumNameSpaceProvidersW(lpdwbufferlength, lpnspbuffer)

public actual fun WSAEnumNetworkEvents(s: SOCKET, heventobject: WSAEVENT, lpnetworkevents: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumNetworkEvents(s.toLong(), heventobject, lpnetworkevents)

public actual fun WSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumProtocolsA(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)

public actual fun WSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEnumProtocolsW(lpiprotocols, lpprotocolbuffer, lpdwbufferlength)

public actual fun WSAEventSelect(s: SOCKET, heventobject: WSAEVENT, lnetworkevents: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAEventSelect(s.toLong(), heventobject, lnetworkevents)

public actual fun WSAGetLastError(): WSA_ERROR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetLastError()

public actual fun WSAGetOverlappedResult(s: SOCKET, lpoverlapped: Long, lpcbtransfer: Long, fwait: BOOL, lpdwflags: Long): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetOverlappedResult(s.toLong(), lpoverlapped, lpcbtransfer, fwait, lpdwflags)

public actual fun WSAGetQOSByName(s: SOCKET, lpqosname: Long, lpqos: Long): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetQOSByName(s.toLong(), lpqosname, lpqos)

public actual fun WSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoA(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo)

public actual fun WSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetServiceClassInfoW(lpproviderid, lpserviceclassid, lpdwbufsize, lpserviceclassinfo)

public actual fun WSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: PSTR, lpdwbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdA(lpserviceclassid, lpszserviceclassname, lpdwbufferlength)

public actual fun WSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: PWSTR, lpdwbufferlength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAGetServiceClassNameByClassIdW(lpserviceclassid, lpszserviceclassname, lpdwbufferlength)

public actual fun WSAHtonl(s: SOCKET, hostlong: UInt, lpnetlong: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAHtonl(s.toLong(), hostlong.toInt(), lpnetlong)

public actual fun WSAHtons(s: SOCKET, hostshort: UShort, lpnetshort: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAHtons(s.toLong(), hostshort.toShort(), lpnetshort)

public actual fun WSAImpersonateSocketPeer(socket: SOCKET, peeraddr: Long, peeraddrlen: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAImpersonateSocketPeer(socket.toLong(), peeraddr, peeraddrlen.toInt())

public actual fun WSAInstallServiceClassA(lpserviceclassinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAInstallServiceClassA(lpserviceclassinfo)

public actual fun WSAInstallServiceClassW(lpserviceclassinfo: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAInstallServiceClassW(lpserviceclassinfo)

public actual fun WSAIoctl(s: SOCKET, dwiocontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAIoctl(s.toLong(), dwiocontrolcode.toInt(), lpvinbuffer, cbinbuffer.toInt(), lpvoutbuffer, cboutbuffer.toInt(), lpcbbytesreturned, lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSAIsBlocking(): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAIsBlocking()

public actual fun WSAJoinLeaf(s: SOCKET, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: UInt): SOCKET =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAJoinLeaf(s.toLong(), name, namelen, lpcallerdata, lpcalleedata, lpsqos, lpgqos, dwflags.toInt()).toULong()

public actual fun WSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSALookupServiceBeginA(lpqsrestrictions, dwcontrolflags.toInt(), lphlookup)

public actual fun WSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: UInt, lphlookup: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSALookupServiceBeginW(lpqsrestrictions, dwcontrolflags.toInt(), lphlookup)

public actual fun WSALookupServiceEnd(hlookup: HANDLE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSALookupServiceEnd(hlookup)

public actual fun WSALookupServiceNextA(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSALookupServiceNextA(hlookup, dwcontrolflags.toInt(), lpdwbufferlength, lpqsresults)

public actual fun WSALookupServiceNextW(hlookup: HANDLE, dwcontrolflags: UInt, lpdwbufferlength: Long, lpqsresults: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSALookupServiceNextW(hlookup, dwcontrolflags.toInt(), lpdwbufferlength, lpqsresults)

public actual fun WSANSPIoctl(hlookup: HANDLE, dwcontrolcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long, lpcompletion: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSANSPIoctl(hlookup, dwcontrolcode.toInt(), lpvinbuffer, cbinbuffer.toInt(), lpvoutbuffer, cboutbuffer.toInt(), lpcbbytesreturned, lpcompletion)

public actual fun WSANtohl(s: SOCKET, netlong: UInt, lphostlong: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSANtohl(s.toLong(), netlong.toInt(), lphostlong)

public actual fun WSANtohs(s: SOCKET, netshort: UShort, lphostshort: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSANtohs(s.toLong(), netshort.toShort(), lphostshort)

public actual fun WSAPoll(fdarray: Long, fds: UInt, timeout: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAPoll(fdarray, fds.toInt(), timeout)

public actual fun WSAProviderCompleteAsyncCall(hasynccall: HANDLE, iretcode: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAProviderCompleteAsyncCall(hasynccall, iretcode)

public actual fun WSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAProviderConfigChange(lpnotificationhandle, lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSAQuerySocketSecurity(socket: SOCKET, securityquerytemplate: Long, securityquerytemplatelen: UInt, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAQuerySocketSecurity(socket.toLong(), securityquerytemplate, securityquerytemplatelen.toInt(), securityqueryinfo, securityqueryinfolen, overlapped, completionroutine.toLong())

public actual fun WSARecv(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSARecv(s.toLong(), lpbuffers, dwbuffercount.toInt(), lpnumberofbytesrecvd, lpflags, lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSARecvDisconnect(s: SOCKET, lpinbounddisconnectdata: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSARecvDisconnect(s.toLong(), lpinbounddisconnectdata)

public actual fun WSARecvEx(s: SOCKET, buf: PSTR, len: Int, flags: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSARecvEx(s.toLong(), buf, len, flags)

public actual fun WSARecvFrom(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSARecvFrom(s.toLong(), lpbuffers, dwbuffercount.toInt(), lpnumberofbytesrecvd, lpflags, lpfrom, lpfromlen, lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSARemoveServiceClass(lpserviceclassid: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSARemoveServiceClass(lpserviceclassid)

public actual fun WSAResetEvent(hevent: WSAEVENT): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAResetEvent(hevent)

public actual fun WSARevertImpersonation(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSARevertImpersonation()

public actual fun WSASend(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASend(s.toLong(), lpbuffers, dwbuffercount.toInt(), lpnumberofbytessent, dwflags.toInt(), lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSASendDisconnect(s: SOCKET, lpoutbounddisconnectdata: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASendDisconnect(s.toLong(), lpoutbounddisconnectdata)

public actual fun WSASendMsg(handle: SOCKET, lpmsg: Long, dwflags: UInt, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASendMsg(handle.toLong(), lpmsg, dwflags.toInt(), lpnumberofbytessent, lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSASendTo(s: SOCKET, lpbuffers: Long, dwbuffercount: UInt, lpnumberofbytessent: Long, dwflags: UInt, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASendTo(s.toLong(), lpbuffers, dwbuffercount.toInt(), lpnumberofbytessent, dwflags.toInt(), lpto, itolen, lpoverlapped, lpcompletionroutine.toLong())

public actual fun WSASetBlockingHook(lpblockfunc: FARPROC): FARPROC =
    null

public actual fun WSASetEvent(hevent: WSAEVENT): BOOL =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASetEvent(hevent)

public actual fun WSASetLastError(ierror: Int) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASetLastError(ierror)
}

public actual fun WSASetServiceA(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASetServiceA(lpqsreginfo, essoperation, dwcontrolflags.toInt())

public actual fun WSASetServiceW(lpqsreginfo: Long, essoperation: WSAESETSERVICEOP, dwcontrolflags: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASetServiceW(lpqsreginfo, essoperation, dwcontrolflags.toInt())

public actual fun WSASetSocketPeerTargetName(socket: SOCKET, peertargetname: Long, peertargetnamelen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASetSocketPeerTargetName(socket.toLong(), peertargetname, peertargetnamelen.toInt(), overlapped, completionroutine.toLong())

public actual fun WSASetSocketSecurity(socket: SOCKET, securitysettings: Long, securitysettingslen: UInt, overlapped: Long, completionroutine: LPWSAOVERLAPPED_COMPLETION_ROUTINE): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASetSocketSecurity(socket.toLong(), securitysettings, securitysettingslen.toInt(), overlapped, completionroutine.toLong())

public actual fun WSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASocketA(af, type, protocol, lpprotocolinfo, g.toInt(), dwflags.toInt()).toULong()

public actual fun WSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: UInt, dwflags: UInt): SOCKET =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSASocketW(af, type, protocol, lpprotocolinfo, g.toInt(), dwflags.toInt()).toULong()

public actual fun WSAStartup(wversionrequested: UShort, lpwsadata: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAStartup(wversionrequested.toShort(), lpwsadata)

public actual fun WSAStringToAddressA(addressstring: PCSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAStringToAddressA(addressstring, addressfamily, lpprotocolinfo, lpaddress, lpaddresslength)

public actual fun WSAStringToAddressW(addressstring: PCWSTR, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAStringToAddressW(addressstring, addressfamily, lpprotocolinfo, lpaddress, lpaddresslength)

public actual fun WSAUnadvertiseProvider(puuidproviderid: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAUnadvertiseProvider(puuidproviderid)

public actual fun WSAUnhookBlockingHook(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAUnhookBlockingHook()

public actual fun WSAWaitForMultipleEvents(cevents: UInt, lphevents: Long, fwaitall: BOOL, dwtimeout: UInt, falertable: BOOL): WAIT_EVENT =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSAWaitForMultipleEvents(cevents.toInt(), lphevents, fwaitall, dwtimeout.toInt(), falertable).toUInt()

public actual fun WSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCDeinstallProvider(lpproviderid, lperrno)

public actual fun WSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCDeinstallProvider32(lpproviderid, lperrno)

public actual fun WSCEnableNSProvider(lpproviderid: Long, fenable: BOOL): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCEnableNSProvider(lpproviderid, fenable)

public actual fun WSCEnableNSProvider32(lpproviderid: Long, fenable: BOOL): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCEnableNSProvider32(lpproviderid, fenable)

public actual fun WSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProviders32(lpdwbufferlength, lpnspbuffer)

public actual fun WSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCEnumNameSpaceProvidersEx32(lpdwbufferlength, lpnspbuffer)

public actual fun WSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCEnumProtocols(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno)

public actual fun WSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCEnumProtocols32(lpiprotocols, lpprotocolbuffer, lpdwbufferlength, lperrno)

public actual fun WSCGetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, ppermittedlspcategories: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCGetApplicationCategory(path, pathlength.toInt(), extra, extralength.toInt(), ppermittedlspcategories, lperrno)

public actual fun WSCGetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCGetProviderInfo(lpproviderid, infotype, info, infosize, flags.toInt(), lperrno)

public actual fun WSCGetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: Long, flags: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCGetProviderInfo32(lpproviderid, infotype, info, infosize, flags.toInt(), lperrno)

public actual fun WSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCGetProviderPath(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno)

public actual fun WSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: PWSTR, lpproviderdllpathlen: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCGetProviderPath32(lpproviderid, lpszproviderdllpath, lpproviderdllpathlen, lperrno)

public actual fun WSCInstallNameSpace(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallNameSpace(lpszidentifier, lpszpathname, dwnamespace.toInt(), dwversion.toInt(), lpproviderid)

public actual fun WSCInstallNameSpace32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallNameSpace32(lpszidentifier, lpszpathname, dwnamespace.toInt(), dwversion.toInt(), lpproviderid)

public actual fun WSCInstallNameSpaceEx(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx(lpszidentifier, lpszpathname, dwnamespace.toInt(), dwversion.toInt(), lpproviderid, lpproviderspecific)

public actual fun WSCInstallNameSpaceEx32(lpszidentifier: PCWSTR, lpszpathname: PCWSTR, dwnamespace: UInt, dwversion: UInt, lpproviderid: Long, lpproviderspecific: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallNameSpaceEx32(lpszidentifier, lpszpathname, dwnamespace.toInt(), dwversion.toInt(), lpproviderid, lpproviderspecific)

public actual fun WSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallProvider(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toInt(), lperrno)

public actual fun WSCInstallProvider64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallProvider64_32(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toInt(), lperrno)

public actual fun WSCInstallProviderAndChains64_32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpszproviderdllpath32: PCWSTR, lpszlspname: PCWSTR, dwserviceflags: UInt, lpprotocolinfolist: Long, dwnumberofentries: UInt, lpdwcatalogentryid: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCInstallProviderAndChains64_32(lpproviderid, lpszproviderdllpath, lpszproviderdllpath32, lpszlspname, dwserviceflags.toInt(), lpprotocolinfolist, dwnumberofentries.toInt(), lpdwcatalogentryid, lperrno)

public actual fun WSCSetApplicationCategory(path: PCWSTR, pathlength: UInt, extra: PCWSTR, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: Long, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCSetApplicationCategory(path, pathlength.toInt(), extra, extralength.toInt(), permittedlspcategories.toInt(), pprevpermlspcat, lperrno)

public actual fun WSCSetProviderInfo(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCSetProviderInfo(lpproviderid, infotype, info, infosize.toLong(), flags.toInt(), lperrno)

public actual fun WSCSetProviderInfo32(lpproviderid: Long, infotype: WSC_PROVIDER_INFO_TYPE, info: Long, infosize: ULong, flags: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCSetProviderInfo32(lpproviderid, infotype, info, infosize.toLong(), flags.toInt(), lperrno)

public actual fun WSCUnInstallNameSpace(lpproviderid: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace(lpproviderid)

public actual fun WSCUnInstallNameSpace32(lpproviderid: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCUnInstallNameSpace32(lpproviderid)

public actual fun WSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCUpdateProvider(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toInt(), lperrno)

public actual fun WSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: PCWSTR, lpprotocolinfolist: Long, dwnumberofentries: UInt, lperrno: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCUpdateProvider32(lpproviderid, lpszproviderdllpath, lpprotocolinfolist, dwnumberofentries.toInt(), lperrno)

public actual fun WSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder(lpproviderid, dwnumberofentries.toInt())

public actual fun WSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCWriteNameSpaceOrder32(lpproviderid, dwnumberofentries.toInt())

public actual fun WSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder(lpwdcatalogentryid, dwnumberofentries.toInt())

public actual fun WSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_WSCWriteProviderOrder32(lpwdcatalogentryid, dwnumberofentries.toInt())

public actual fun __WSAFDIsSet(fd: SOCKET, param1: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock___WSAFDIsSet(fd.toLong(), param1)

public actual fun accept(s: SOCKET, addr: Long, addrlen: Long): SOCKET =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_accept(s.toLong(), addr, addrlen).toULong()

public actual fun bind(s: SOCKET, name: Long, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_bind(s.toLong(), name, namelen)

public actual fun closesocket(s: SOCKET): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_closesocket(s.toLong())

public actual fun connect(s: SOCKET, name: Long, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_connect(s.toLong(), name, namelen)

public actual fun freeaddrinfo(paddrinfo: Long) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_freeaddrinfo(paddrinfo)
}

public actual fun getaddrinfo(pnodename: PCSTR, pservicename: PCSTR, phints: Long, ppresult: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getaddrinfo(pnodename, pservicename, phints, ppresult)

public actual fun gethostbyaddr(addr: PCSTR, len: Int, type: Int): Long =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_gethostbyaddr(addr, len, type)

public actual fun gethostbyname(name: PCSTR): Long =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_gethostbyname(name)

public actual fun gethostname(name: PSTR, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_gethostname(name, namelen)

public actual fun getnameinfo(psockaddr: Long, sockaddrlength: socklen_t, pnodebuffer: PSTR, nodebuffersize: UInt, pservicebuffer: PSTR, servicebuffersize: UInt, flags: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getnameinfo(psockaddr, sockaddrlength, pnodebuffer, nodebuffersize.toInt(), pservicebuffer, servicebuffersize.toInt(), flags)

public actual fun getpeername(s: SOCKET, name: Long, namelen: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getpeername(s.toLong(), name, namelen)

public actual fun getprotobyname(name: PCSTR): Long =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getprotobyname(name)

public actual fun getprotobynumber(number: Int): Long =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getprotobynumber(number)

public actual fun getservbyname(name: PCSTR, proto: PCSTR): Long =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getservbyname(name, proto)

public actual fun getservbyport(port: Int, proto: PCSTR): Long =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getservbyport(port, proto)

public actual fun getsockname(s: SOCKET, name: Long, namelen: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getsockname(s.toLong(), name, namelen)

public actual fun getsockopt(s: SOCKET, level: Int, optname: Int, optval: PSTR, optlen: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getsockopt(s.toLong(), level, optname, optval, optlen)

public actual fun htonl(hostlong: UInt): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_htonl(hostlong.toInt()).toUInt()

public actual fun htons(hostshort: UShort): UShort =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_htons(hostshort.toShort()).toUShort()

public actual fun inet_addr(cp: PCSTR): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inet_addr(cp).toUInt()

public actual fun inet_ntoa(input: IN_ADDR): PSTR =
    0L

public actual fun inet_ntop(family: Int, paddr: Long, pstringbuf: PSTR, stringbufsize: ULong): PCSTR =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inet_ntop(family, paddr, pstringbuf, stringbufsize.toLong())

public actual fun inet_pton(family: Int, pszaddrstring: PCSTR, paddrbuf: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inet_pton(family, pszaddrstring, paddrbuf)

public actual fun ioctlsocket(s: SOCKET, cmd: Int, argp: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ioctlsocket(s.toLong(), cmd, argp)

public actual fun listen(s: SOCKET, backlog: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_listen(s.toLong(), backlog)

public actual fun ntohl(netlong: UInt): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ntohl(netlong.toInt()).toUInt()

public actual fun ntohs(netshort: UShort): UShort =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ntohs(netshort.toShort()).toUShort()

public actual fun recv(s: SOCKET, buf: PSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_recv(s.toLong(), buf, len, flags)

public actual fun recvfrom(s: SOCKET, buf: PSTR, len: Int, flags: Int, from: Long, fromlen: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_recvfrom(s.toLong(), buf, len, flags, from, fromlen)

public actual fun select(nfds: Int, readfds: Long, writefds: Long, exceptfds: Long, timeout: Long): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_select(nfds, readfds, writefds, exceptfds, timeout)

public actual fun send(s: SOCKET, buf: PCSTR, len: Int, flags: SEND_RECV_FLAGS): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_send(s.toLong(), buf, len, flags)

public actual fun sendto(s: SOCKET, buf: PCSTR, len: Int, flags: Int, to: Long, tolen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_sendto(s.toLong(), buf, len, flags, to, tolen)

public actual fun setsockopt(s: SOCKET, level: Int, optname: Int, optval: PCSTR, optlen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setsockopt(s.toLong(), level, optname, optval, optlen)

public actual fun shutdown(s: SOCKET, how: WINSOCK_SHUTDOWN_HOW): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_shutdown(s.toLong(), how)

public actual fun socket(af: Int, type: WINSOCK_SOCKET_TYPE, protocol: Int): SOCKET =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_socket(af, type, protocol).toULong()
