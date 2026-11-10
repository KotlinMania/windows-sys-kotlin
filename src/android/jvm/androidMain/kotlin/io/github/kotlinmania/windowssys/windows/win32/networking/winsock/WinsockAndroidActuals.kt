@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent

private object WindowsWin32NetworkingWinsockJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_acceptEx(slistensocket: Long, sacceptsocket: Long, lpoutputbuffer: Long, dwreceivedatalength: Int, dwlocaladdresslength: Int, dwremoteaddresslength: Int, lpdwbytesreceived: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_enumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_enumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_freeAddrInfoEx(paddrinfoex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_freeAddrInfoExW(paddrinfoex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_freeAddrInfoW(paddrinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAcceptExSockaddrs(lpoutputbuffer: Long, dwreceivedatalength: Int, dwlocaladdresslength: Int, dwremoteaddresslength: Int, localsockaddr: Long, localsockaddrlength: Long, remotesockaddr: Long, remotesockaddrlength: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddrInfoExA(pname: Long, pservicename: Long, dwnamespace: Int, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddrInfoExCancel(lphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddrInfoExOverlappedResult(lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddrInfoExW(pname: Long, pservicename: Long, dwnamespace: Int, lpnspid: Long, hints: Long, ppresult: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddrInfoW(pnodename: Long, pservicename: Long, phints: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddressByNameA(dwnamespace: Int, lpservicetype: Long, lpservicename: Long, lpiprotocols: Long, dwresolution: Int, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: Long, lpdwaliasbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getAddressByNameW(dwnamespace: Int, lpservicetype: Long, lpservicename: Long, lpiprotocols: Long, dwresolution: Int, lpserviceasyncinfo: Long, lpcsaddrbuffer: Long, lpdwbufferlength: Long, lpaliasbuffer: Long, lpdwaliasbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getHostNameW(name: Long, namelen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getNameByTypeA(lpservicetype: Long, lpservicename: Long, dwnamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getNameByTypeW(lpservicetype: Long, lpservicename: Long, dwnamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getNameInfoW(psockaddr: Long, sockaddrlength: Int, pnodebuffer: Long, nodebuffersize: Int, pservicebuffer: Long, servicebuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getServiceA(dwnamespace: Int, lpguid: Long, lpservicename: Long, dwproperties: Int, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getServiceW(dwnamespace: Int, lpguid: Long, lpservicename: Long, dwproperties: Int, lpbuffer: Long, lpdwbuffersize: Long, lpserviceasyncinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getTypeByNameA(lpservicename: Long, lpservicetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_getTypeByNameW(lpservicename: Long, lpservicetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inetNtopW(family: Int, paddr: Long, pstringbuf: Long, stringbufsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inetPtonW(family: Int, pszaddrstring: Long, paddrbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_processSocketNotifications(completionport: Long, registrationcount: Int, registrationinfos: Long, timeoutms: Int, completioncount: Int, completionportentries: Long, receivedentrycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressA(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressW(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExA(address: Long, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExW(address: Long, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressA(s: Long, strict: Boolean, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExA(addressstring: Long, strict: Boolean, address: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExW(addressstring: Long, strict: Boolean, address: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressW(s: Long, strict: Boolean, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringA(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExA(address: Long, scopeid: Int, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExW(address: Long, scopeid: Int, port: Short, addressstring: Long, addressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringW(addr: Long, s: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressA(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExA(addressstring: Long, address: Long, scopeid: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExW(addressstring: Long, address: Long, scopeid: Long, port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressW(s: Long, terminator: Long, addr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_setAddrInfoExA(pname: Long, pservicename: Long, paddresses: Long, dwaddresscount: Int, lpblob: Long, dwflags: Int, dwnamespace: Int, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_setAddrInfoExW(pname: Long, pservicename: Long, paddresses: Long, dwaddresscount: Int, lpblob: Long, dwflags: Int, dwnamespace: Int, lpnspid: Long, timeout: Long, lpoverlapped: Long, lpcompletionroutine: Long, lpnamehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_setServiceA(dwnamespace: Int, dwoperation: Int, dwflags: Int, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_setServiceW(dwnamespace: Int, dwoperation: Int, dwflags: Int, lpserviceinfo: Long, lpserviceasyncinfo: Long, lpdwstatusflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_setSocketMediaStreamingMode(value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_transmitFile(hsocket: Long, hfile: Long, nnumberofbytestowrite: Int, nnumberofbytespersend: Int, lpoverlapped: Long, lptransmitbuffers: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wPUCompleteOverlappedRequest(s: Long, lpoverlapped: Long, dwerror: Int, cbtransferred: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAccept(s: Long, addr: Long, addrlen: Long, lpfncondition: Long, dwcallbackdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAddressToStringA(lpsaaddress: Long, dwaddresslength: Int, lpprotocolinfo: Long, lpszaddressstring: Long, lpdwaddressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAddressToStringW(lpsaaddress: Long, dwaddresslength: Int, lpprotocolinfo: Long, lpszaddressstring: Long, lpdwaddressstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAdvertiseProvider(puuidproviderid: Long, pnspv2routine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByAddr(hwnd: Long, wmsg: Int, addr: Long, len: Int, type: Int, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByName(hwnd: Long, wmsg: Int, name: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByName(hwnd: Long, wmsg: Int, name: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByNumber(hwnd: Long, wmsg: Int, number: Int, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncGetServByName(hwnd: Long, wmsg: Int, name: Long, proto: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncGetServByPort(hwnd: Long, wmsg: Int, port: Int, proto: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAAsyncSelect(s: Long, hwnd: Long, wmsg: Int, levent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSACancelAsyncRequest(hasynctaskhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSACancelBlockingCall(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSACleanup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSACloseEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAConnect(s: Long, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAConnectByList(s: Long, socketaddress: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAConnectByNameA(s: Long, nodename: Long, servicename: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAConnectByNameW(s: Long, nodename: Long, servicename: Long, localaddresslength: Long, localaddress: Long, remoteaddresslength: Long, remoteaddress: Long, timeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSACreateEvent(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSADeleteSocketPeerTargetName(socket: Long, peeraddr: Long, peeraddrlen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSADuplicateSocketA(s: Long, dwprocessid: Int, lpprotocolinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSADuplicateSocketW(s: Long, dwprocessid: Int, lpprotocolinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExA(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersW(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumNetworkEvents(s: Long, heventobject: Long, lpnetworkevents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumProtocolsA(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEnumProtocolsW(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAEventSelect(s: Long, heventobject: Long, lnetworkevents: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetLastError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetOverlappedResult(s: Long, lpoverlapped: Long, lpcbtransfer: Long, fwait: Int, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetQOSByName(s: Long, lpqosname: Long, lpqos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoA(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoW(lpproviderid: Long, lpserviceclassid: Long, lpdwbufsize: Long, lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdA(lpserviceclassid: Long, lpszserviceclassname: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdW(lpserviceclassid: Long, lpszserviceclassname: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAHtonl(s: Long, hostlong: Int, lpnetlong: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAHtons(s: Long, hostshort: Short, lpnetshort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAImpersonateSocketPeer(socket: Long, peeraddr: Long, peeraddrlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAInstallServiceClassA(lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAInstallServiceClassW(lpserviceclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAIoctl(s: Long, dwiocontrolcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAIsBlocking(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAJoinLeaf(s: Long, name: Long, namelen: Int, lpcallerdata: Long, lpcalleedata: Long, lpsqos: Long, lpgqos: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSALookupServiceBeginA(lpqsrestrictions: Long, dwcontrolflags: Int, lphlookup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSALookupServiceBeginW(lpqsrestrictions: Long, dwcontrolflags: Int, lphlookup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSALookupServiceEnd(hlookup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSALookupServiceNextA(hlookup: Long, dwcontrolflags: Int, lpdwbufferlength: Long, lpqsresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSALookupServiceNextW(hlookup: Long, dwcontrolflags: Int, lpdwbufferlength: Long, lpqsresults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSANSPIoctl(hlookup: Long, dwcontrolcode: Int, lpvinbuffer: Long, cbinbuffer: Int, lpvoutbuffer: Long, cboutbuffer: Int, lpcbbytesreturned: Long, lpcompletion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSANtohl(s: Long, netlong: Int, lphostlong: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSANtohs(s: Long, netshort: Short, lphostshort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAPoll(fdarray: Long, fds: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAProviderCompleteAsyncCall(hasynccall: Long, iretcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAProviderConfigChange(lpnotificationhandle: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAQuerySocketSecurity(socket: Long, securityquerytemplate: Long, securityquerytemplatelen: Int, securityqueryinfo: Long, securityqueryinfolen: Long, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSARecv(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytesrecvd: Long, lpflags: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSARecvDisconnect(s: Long, lpinbounddisconnectdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSARecvEx(s: Long, buf: Long, len: Int, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSARecvFrom(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytesrecvd: Long, lpflags: Long, lpfrom: Long, lpfromlen: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSARemoveServiceClass(lpserviceclassid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAResetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSARevertImpersonation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASend(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytessent: Long, dwflags: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASendDisconnect(s: Long, lpoutbounddisconnectdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASendMsg(handle: Long, lpmsg: Long, dwflags: Int, lpnumberofbytessent: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASendTo(s: Long, lpbuffers: Long, dwbuffercount: Int, lpnumberofbytessent: Long, dwflags: Int, lpto: Long, itolen: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASetLastError(ierror: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASetServiceA(lpqsreginfo: Long, essoperation: Int, dwcontrolflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASetServiceW(lpqsreginfo: Long, essoperation: Int, dwcontrolflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASetSocketPeerTargetName(socket: Long, peertargetname: Long, peertargetnamelen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASetSocketSecurity(socket: Long, securitysettings: Long, securitysettingslen: Int, overlapped: Long, completionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: Long, g: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAStartup(wversionrequested: Short, lpwsadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAStringToAddressA(addressstring: Long, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAStringToAddressW(addressstring: Long, addressfamily: Int, lpprotocolinfo: Long, lpaddress: Long, lpaddresslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAUnadvertiseProvider(puuidproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAUnhookBlockingHook(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSAWaitForMultipleEvents(cevents: Int, lphevents: Long, fwaitall: Int, dwtimeout: Int, falertable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCDeinstallProvider(lpproviderid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCDeinstallProvider32(lpproviderid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCEnableNSProvider(lpproviderid: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCEnableNSProvider32(lpproviderid: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProviders32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: Long, lpnspbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCEnumProtocols(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCEnumProtocols32(lpiprotocols: Long, lpprotocolbuffer: Long, lpdwbufferlength: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCGetApplicationCategory(path: Long, pathlength: Int, extra: Long, extralength: Int, ppermittedlspcategories: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCGetProviderInfo(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCGetProviderInfo32(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCGetProviderPath(lpproviderid: Long, lpszproviderdllpath: Long, lpproviderdllpathlen: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCGetProviderPath32(lpproviderid: Long, lpszproviderdllpath: Long, lpproviderdllpathlen: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCInstallNameSpace(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCInstallNameSpace32(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long, lpproviderspecific: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx32(lpszidentifier: Long, lpszpathname: Long, dwnamespace: Int, dwversion: Int, lpproviderid: Long, lpproviderspecific: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCInstallProvider(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wscinstallProvider6432(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wscinstallProviderAndChains6432(lpproviderid: Long, lpszproviderdllpath: Long, lpszproviderdllpath32: Long, lpszlspname: Long, dwserviceflags: Int, lpprotocolinfolist: Long, dwnumberofentries: Int, lpdwcatalogentryid: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCSetApplicationCategory(path: Long, pathlength: Int, extra: Long, extralength: Int, permittedlspcategories: Int, pprevpermlspcat: Long, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCSetProviderInfo(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCSetProviderInfo32(lpproviderid: Long, infotype: Int, info: Long, infosize: Long, flags: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace(lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace32(lpproviderid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCUpdateProvider(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCUpdateProvider32(lpproviderid: Long, lpszproviderdllpath: Long, lpprotocolinfolist: Long, dwnumberofentries: Int, lperrno: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder(lpproviderid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder32(lpproviderid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder(lpwdcatalogentryid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder32(lpwdcatalogentryid: Long, dwnumberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_wsafdisSet(fd: Long, param1: Long): Int

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
    external fun windowssys_windows_win32_networking_winsock_inetAddr(cp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inetNtop(family: Int, paddr: Long, pstringbuf: Long, stringbufsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winsock_inetPton(family: Int, pszaddrstring: Long, paddrbuf: Long): Int

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

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_acceptEx(slistensocket.toLong(), sacceptsocket.toLong(), (lpoutputbuffer?.value ?: 0L), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), (lpdwbytesreceived?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun enumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_enumProtocolsA((lpiprotocols?.value ?: 0L), (lpprotocolbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun enumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_enumProtocolsW((lpiprotocols?.value ?: 0L), (lpprotocolbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun freeAddrInfoEx(paddrinfoex: COpaquePointer?) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_freeAddrInfoEx((paddrinfoex?.value ?: 0L))
}

public actual fun freeAddrInfoExW(paddrinfoex: COpaquePointer?) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_freeAddrInfoExW((paddrinfoex?.value ?: 0L))
}

public actual fun freeAddrInfoW(paddrinfo: COpaquePointer?) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_freeAddrInfoW((paddrinfo?.value ?: 0L))
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: COpaquePointer?, localsockaddrlength: COpaquePointer?, remotesockaddr: COpaquePointer?, remotesockaddrlength: COpaquePointer?) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAcceptExSockaddrs((lpoutputbuffer?.value ?: 0L), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), (localsockaddr?.value ?: 0L), (localsockaddrlength?.value ?: 0L), (remotesockaddr?.value ?: 0L), (remotesockaddrlength?.value ?: 0L))
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddrInfoExA((pname?.value ?: 0L), (pservicename?.value ?: 0L), dwnamespace.toInt(), (lpnspid?.value ?: 0L), (hints?.value ?: 0L), (ppresult?.value ?: 0L), (timeout?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, (lpnamehandle?.value ?: 0L))

public actual fun getAddrInfoExCancel(lphandle: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddrInfoExCancel((lphandle?.value ?: 0L))

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddrInfoExOverlappedResult((lpoverlapped?.value ?: 0L))

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddrInfoExW((pname?.value ?: 0L), (pservicename?.value ?: 0L), dwnamespace.toInt(), (lpnspid?.value ?: 0L), (hints?.value ?: 0L), (ppresult?.value ?: 0L), (timeout?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, (lphandle?.value ?: 0L))

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddrInfoW((pnodename?.value ?: 0L), (pservicename?.value ?: 0L), (phints?.value ?: 0L), (ppresult?.value ?: 0L))

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pstr, lpdwaliasbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddressByNameA(dwnamespace.toInt(), (lpservicetype?.value ?: 0L), (lpservicename?.value ?: 0L), (lpiprotocols?.value ?: 0L), dwresolution.toInt(), (lpserviceasyncinfo?.value ?: 0L), (lpcsaddrbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lpaliasbuffer?.value ?: 0L), (lpdwaliasbufferlength?.value ?: 0L))

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcwstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getAddressByNameW(dwnamespace.toInt(), (lpservicetype?.value ?: 0L), (lpservicename?.value ?: 0L), (lpiprotocols?.value ?: 0L), dwresolution.toInt(), (lpserviceasyncinfo?.value ?: 0L), (lpcsaddrbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lpaliasbuffer?.value ?: 0L), (lpdwaliasbufferlength?.value ?: 0L))

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getHostNameW((name?.value ?: 0L), namelen)

public actual fun getNameByTypeA(lpservicetype: COpaquePointer?, lpservicename: Pstr, dwnamelength: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getNameByTypeA((lpservicetype?.value ?: 0L), (lpservicename?.value ?: 0L), dwnamelength.toInt())

public actual fun getNameByTypeW(lpservicetype: COpaquePointer?, lpservicename: Pwstr, dwnamelength: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getNameByTypeW((lpservicetype?.value ?: 0L), (lpservicename?.value ?: 0L), dwnamelength.toInt())

public actual fun getNameInfoW(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getNameInfoW((psockaddr?.value ?: 0L), sockaddrlength, (pnodebuffer?.value ?: 0L), nodebuffersize.toInt(), (pservicebuffer?.value ?: 0L), servicebuffersize.toInt(), flags)

public actual fun getServiceA(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getServiceA(dwnamespace.toInt(), (lpguid?.value ?: 0L), (lpservicename?.value ?: 0L), dwproperties.toInt(), (lpbuffer?.value ?: 0L), (lpdwbuffersize?.value ?: 0L), (lpserviceasyncinfo?.value ?: 0L))

public actual fun getServiceW(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getServiceW(dwnamespace.toInt(), (lpguid?.value ?: 0L), (lpservicename?.value ?: 0L), dwproperties.toInt(), (lpbuffer?.value ?: 0L), (lpdwbuffersize?.value ?: 0L), (lpserviceasyncinfo?.value ?: 0L))

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getTypeByNameA((lpservicename?.value ?: 0L), (lpservicetype?.value ?: 0L))

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getTypeByNameW((lpservicename?.value ?: 0L), (lpservicetype?.value ?: 0L))

public actual fun inetNtopW(family: Int, paddr: COpaquePointer?, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inetNtopW(family, (paddr?.value ?: 0L), (pstringbuf?.value ?: 0L), stringbufsize.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inetPtonW(family, (pszaddrstring?.value ?: 0L), (paddrbuf?.value ?: 0L))

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: COpaquePointer?, timeoutms: UInt, completioncount: UInt, completionportentries: COpaquePointer?, receivedentrycount: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_processSocketNotifications((completionport?.value ?: 0L), registrationcount.toInt(), (registrationinfos?.value ?: 0L), timeoutms.toInt(), completioncount.toInt(), (completionportentries?.value ?: 0L), (receivedentrycount?.value ?: 0L)).toUInt()

public actual fun rtlEthernetAddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringA((addr?.value ?: 0L), (s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEthernetAddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringW((addr?.value ?: 0L), (s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressA((s?.value ?: 0L), (terminator?.value ?: 0L), (addr?.value ?: 0L))

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressW((s?.value ?: 0L), (terminator?.value ?: 0L), (addr?.value ?: 0L))

public actual fun rtlIpv4AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringA((addr?.value ?: 0L), (s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlIpv4AddressToStringExA(address: COpaquePointer?, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExA((address?.value ?: 0L), port.toShort(), (addressstring?.value ?: 0L), (addressstringlength?.value ?: 0L))

public actual fun rtlIpv4AddressToStringExW(address: COpaquePointer?, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExW((address?.value ?: 0L), port.toShort(), (addressstring?.value ?: 0L), (addressstringlength?.value ?: 0L))

public actual fun rtlIpv4AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringW((addr?.value ?: 0L), (s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressA((s?.value ?: 0L), strict, (terminator?.value ?: 0L), (addr?.value ?: 0L))

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExA((addressstring?.value ?: 0L), strict, (address?.value ?: 0L), (port?.value ?: 0L))

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExW((addressstring?.value ?: 0L), strict, (address?.value ?: 0L), (port?.value ?: 0L))

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressW((s?.value ?: 0L), strict, (terminator?.value ?: 0L), (addr?.value ?: 0L))

public actual fun rtlIpv6AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringA((addr?.value ?: 0L), (s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlIpv6AddressToStringExA(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExA((address?.value ?: 0L), scopeid.toInt(), port.toShort(), (addressstring?.value ?: 0L), (addressstringlength?.value ?: 0L))

public actual fun rtlIpv6AddressToStringExW(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExW((address?.value ?: 0L), scopeid.toInt(), port.toShort(), (addressstring?.value ?: 0L), (addressstringlength?.value ?: 0L))

public actual fun rtlIpv6AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringW((addr?.value ?: 0L), (s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressA((s?.value ?: 0L), (terminator?.value ?: 0L), (addr?.value ?: 0L))

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExA((addressstring?.value ?: 0L), (address?.value ?: 0L), (scopeid?.value ?: 0L), (port?.value ?: 0L))

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExW((addressstring?.value ?: 0L), (address?.value ?: 0L), (scopeid?.value ?: 0L), (port?.value ?: 0L))

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressW((s?.value ?: 0L), (terminator?.value ?: 0L), (addr?.value ?: 0L))

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setAddrInfoExA((pname?.value ?: 0L), (pservicename?.value ?: 0L), (paddresses?.value ?: 0L), dwaddresscount.toInt(), (lpblob?.value ?: 0L), dwflags.toInt(), dwnamespace.toInt(), (lpnspid?.value ?: 0L), (timeout?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, (lpnamehandle?.value ?: 0L))

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setAddrInfoExW((pname?.value ?: 0L), (pservicename?.value ?: 0L), (paddresses?.value ?: 0L), dwaddresscount.toInt(), (lpblob?.value ?: 0L), dwflags.toInt(), dwnamespace.toInt(), (lpnspid?.value ?: 0L), (timeout?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, (lpnamehandle?.value ?: 0L))

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), (lpserviceinfo?.value ?: 0L), (lpserviceasyncinfo?.value ?: 0L), (lpdwstatusflags?.value ?: 0L))

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), (lpserviceinfo?.value ?: 0L), (lpserviceasyncinfo?.value ?: 0L), (lpdwstatusflags?.value ?: 0L))

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setSocketMediaStreamingMode(value)

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: COpaquePointer?, lptransmitbuffers: COpaquePointer?, dwreserved: UInt): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_transmitFile(hsocket.toLong(), (hfile?.value ?: 0L), nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), (lpoverlapped?.value ?: 0L), (lptransmitbuffers?.value ?: 0L), dwreserved.toInt())

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: COpaquePointer?, dwerror: UInt, cbtransferred: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wPUCompleteOverlappedRequest(s.toLong(), (lpoverlapped?.value ?: 0L), dwerror.toInt(), cbtransferred.toInt(), (lperrno?.value ?: 0L))

public actual fun wSAAccept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAccept(s.toLong(), (addr?.value ?: 0L), (addrlen?.value ?: 0L), 0L, dwcallbackdata.toLong()).toULong()

public actual fun wSAAddressToStringA(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pstr, lpdwaddressstringlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAddressToStringA((lpsaaddress?.value ?: 0L), dwaddresslength.toInt(), (lpprotocolinfo?.value ?: 0L), (lpszaddressstring?.value ?: 0L), (lpdwaddressstringlength?.value ?: 0L))

public actual fun wSAAddressToStringW(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pwstr, lpdwaddressstringlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAddressToStringW((lpsaaddress?.value ?: 0L), dwaddresslength.toInt(), (lpprotocolinfo?.value ?: 0L), (lpszaddressstring?.value ?: 0L), (lpdwaddressstringlength?.value ?: 0L))

public actual fun wSAAdvertiseProvider(puuidproviderid: COpaquePointer?, pnspv2routine: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAdvertiseProvider((puuidproviderid?.value ?: 0L), (pnspv2routine?.value ?: 0L))

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByAddr((hwnd?.value ?: 0L), wmsg.toInt(), (addr?.value ?: 0L), len, type, (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByName((hwnd?.value ?: 0L), wmsg.toInt(), (name?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByName((hwnd?.value ?: 0L), wmsg.toInt(), (name?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByNumber((hwnd?.value ?: 0L), wmsg.toInt(), number, (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncGetServByName((hwnd?.value ?: 0L), wmsg.toInt(), (name?.value ?: 0L), (proto?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncGetServByPort((hwnd?.value ?: 0L), wmsg.toInt(), port, (proto?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAAsyncSelect(s.toLong(), (hwnd?.value ?: 0L), wmsg.toInt(), levent)

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSACancelAsyncRequest((hasynctaskhandle?.value ?: 0L))

public actual fun wSACancelBlockingCall(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSACancelBlockingCall()

public actual fun wSACleanup(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSACleanup()

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSACloseEvent(hevent)

public actual fun wSAConnect(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAConnect(s.toLong(), (name?.value ?: 0L), namelen, (lpcallerdata?.value ?: 0L), (lpcalleedata?.value ?: 0L), (lpsqos?.value ?: 0L), (lpgqos?.value ?: 0L))

public actual fun wSAConnectByList(s: Socket, socketaddress: COpaquePointer?, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAConnectByList(s.toLong(), (socketaddress?.value ?: 0L), (localaddresslength?.value ?: 0L), (localaddress?.value ?: 0L), (remoteaddresslength?.value ?: 0L), (remoteaddress?.value ?: 0L), (timeout?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAConnectByNameA(s.toLong(), (nodename?.value ?: 0L), (servicename?.value ?: 0L), (localaddresslength?.value ?: 0L), (localaddress?.value ?: 0L), (remoteaddresslength?.value ?: 0L), (remoteaddress?.value ?: 0L), (timeout?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAConnectByNameW(s.toLong(), (nodename?.value ?: 0L), (servicename?.value ?: 0L), (localaddresslength?.value ?: 0L), (localaddress?.value ?: 0L), (remoteaddresslength?.value ?: 0L), (remoteaddress?.value ?: 0L), (timeout?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun wSACreateEvent(): Wsaevent =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSACreateEvent()

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSADeleteSocketPeerTargetName(socket.toLong(), (peeraddr?.value ?: 0L), peeraddrlen.toInt(), (overlapped?.value ?: 0L), 0L)

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSADuplicateSocketA(s.toLong(), dwprocessid.toInt(), (lpprotocolinfo?.value ?: 0L))

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSADuplicateSocketW(s.toLong(), dwprocessid.toInt(), (lpprotocolinfo?.value ?: 0L))

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersA((lpdwbufferlength?.value ?: 0L), (lpnspbuffer?.value ?: 0L))

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExA((lpdwbufferlength?.value ?: 0L), (lpnspbuffer?.value ?: 0L))

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExW((lpdwbufferlength?.value ?: 0L), (lpnspbuffer?.value ?: 0L))

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersW((lpdwbufferlength?.value ?: 0L), (lpnspbuffer?.value ?: 0L))

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumNetworkEvents(s.toLong(), heventobject, (lpnetworkevents?.value ?: 0L))

public actual fun wSAEnumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumProtocolsA((lpiprotocols?.value ?: 0L), (lpprotocolbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun wSAEnumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEnumProtocolsW((lpiprotocols?.value ?: 0L), (lpprotocolbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAEventSelect(s.toLong(), heventobject, lnetworkevents)

public actual fun wSAGetLastError(): WsaError =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetLastError()

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: COpaquePointer?, lpcbtransfer: COpaquePointer?, fwait: Bool, lpdwflags: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetOverlappedResult(s.toLong(), (lpoverlapped?.value ?: 0L), (lpcbtransfer?.value ?: 0L), fwait, (lpdwflags?.value ?: 0L))

public actual fun wSAGetQOSByName(s: Socket, lpqosname: COpaquePointer?, lpqos: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetQOSByName(s.toLong(), (lpqosname?.value ?: 0L), (lpqos?.value ?: 0L))

public actual fun wSAGetServiceClassInfoA(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoA((lpproviderid?.value ?: 0L), (lpserviceclassid?.value ?: 0L), (lpdwbufsize?.value ?: 0L), (lpserviceclassinfo?.value ?: 0L))

public actual fun wSAGetServiceClassInfoW(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoW((lpproviderid?.value ?: 0L), (lpserviceclassid?.value ?: 0L), (lpdwbufsize?.value ?: 0L), (lpserviceclassinfo?.value ?: 0L))

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pstr, lpdwbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdA((lpserviceclassid?.value ?: 0L), (lpszserviceclassname?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pwstr, lpdwbufferlength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdW((lpserviceclassid?.value ?: 0L), (lpszserviceclassname?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAHtonl(s.toLong(), hostlong.toInt(), (lpnetlong?.value ?: 0L))

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAHtons(s.toLong(), hostshort.toShort(), (lpnetshort?.value ?: 0L))

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAImpersonateSocketPeer(socket.toLong(), (peeraddr?.value ?: 0L), peeraddrlen.toInt())

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAInstallServiceClassA((lpserviceclassinfo?.value ?: 0L))

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAInstallServiceClassW((lpserviceclassinfo?.value ?: 0L))

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAIoctl(s.toLong(), dwiocontrolcode.toInt(), (lpvinbuffer?.value ?: 0L), cbinbuffer.toInt(), (lpvoutbuffer?.value ?: 0L), cboutbuffer.toInt(), (lpcbbytesreturned?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSAIsBlocking(): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAIsBlocking()

public actual fun wSAJoinLeaf(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, dwflags: UInt): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAJoinLeaf(s.toLong(), (name?.value ?: 0L), namelen, (lpcallerdata?.value ?: 0L), (lpcalleedata?.value ?: 0L), (lpsqos?.value ?: 0L), (lpgqos?.value ?: 0L), dwflags.toInt()).toULong()

public actual fun wSALookupServiceBeginA(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSALookupServiceBeginA((lpqsrestrictions?.value ?: 0L), dwcontrolflags.toInt(), (lphlookup?.value ?: 0L))

public actual fun wSALookupServiceBeginW(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSALookupServiceBeginW((lpqsrestrictions?.value ?: 0L), dwcontrolflags.toInt(), (lphlookup?.value ?: 0L))

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSALookupServiceEnd((hlookup?.value ?: 0L))

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSALookupServiceNextA((hlookup?.value ?: 0L), dwcontrolflags.toInt(), (lpdwbufferlength?.value ?: 0L), (lpqsresults?.value ?: 0L))

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSALookupServiceNextW((hlookup?.value ?: 0L), dwcontrolflags.toInt(), (lpdwbufferlength?.value ?: 0L), (lpqsresults?.value ?: 0L))

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpcompletion: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSANSPIoctl((hlookup?.value ?: 0L), dwcontrolcode.toInt(), (lpvinbuffer?.value ?: 0L), cbinbuffer.toInt(), (lpvoutbuffer?.value ?: 0L), cboutbuffer.toInt(), (lpcbbytesreturned?.value ?: 0L), (lpcompletion?.value ?: 0L))

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSANtohl(s.toLong(), netlong.toInt(), (lphostlong?.value ?: 0L))

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSANtohs(s.toLong(), netshort.toShort(), (lphostshort?.value ?: 0L))

public actual fun wSAPoll(fdarray: COpaquePointer?, fds: UInt, timeout: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAPoll((fdarray?.value ?: 0L), fds.toInt(), timeout)

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAProviderCompleteAsyncCall((hasynccall?.value ?: 0L), iretcode)

public actual fun wSAProviderConfigChange(lpnotificationhandle: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAProviderConfigChange((lpnotificationhandle?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: COpaquePointer?, securityquerytemplatelen: UInt, securityqueryinfo: COpaquePointer?, securityqueryinfolen: COpaquePointer?, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAQuerySocketSecurity(socket.toLong(), (securityquerytemplate?.value ?: 0L), securityquerytemplatelen.toInt(), (securityqueryinfo?.value ?: 0L), (securityqueryinfolen?.value ?: 0L), (overlapped?.value ?: 0L), 0L)

public actual fun wSARecv(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSARecv(s.toLong(), (lpbuffers?.value ?: 0L), dwbuffercount.toInt(), (lpnumberofbytesrecvd?.value ?: 0L), (lpflags?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSARecvDisconnect(s.toLong(), (lpinbounddisconnectdata?.value ?: 0L))

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSARecvEx(s.toLong(), (buf?.value ?: 0L), len, (flags?.value ?: 0L))

public actual fun wSARecvFrom(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpfrom: COpaquePointer?, lpfromlen: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSARecvFrom(s.toLong(), (lpbuffers?.value ?: 0L), dwbuffercount.toInt(), (lpnumberofbytesrecvd?.value ?: 0L), (lpflags?.value ?: 0L), (lpfrom?.value ?: 0L), (lpfromlen?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSARemoveServiceClass(lpserviceclassid: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSARemoveServiceClass((lpserviceclassid?.value ?: 0L))

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAResetEvent(hevent)

public actual fun wSARevertImpersonation(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSARevertImpersonation()

public actual fun wSASend(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASend(s.toLong(), (lpbuffers?.value ?: 0L), dwbuffercount.toInt(), (lpnumberofbytessent?.value ?: 0L), dwflags.toInt(), (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASendDisconnect(s.toLong(), (lpoutbounddisconnectdata?.value ?: 0L))

public actual fun wSASendMsg(handle: Socket, lpmsg: COpaquePointer?, dwflags: UInt, lpnumberofbytessent: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASendMsg(handle.toLong(), (lpmsg?.value ?: 0L), dwflags.toInt(), (lpnumberofbytessent?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSASendTo(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpto: COpaquePointer?, itolen: Int, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASendTo(s.toLong(), (lpbuffers?.value ?: 0L), dwbuffercount.toInt(), (lpnumberofbytessent?.value ?: 0L), dwflags.toInt(), (lpto?.value ?: 0L), itolen, (lpoverlapped?.value ?: 0L), 0L)

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    null

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASetEvent(hevent)

public actual fun wSASetLastError(ierror: Int) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASetLastError(ierror)
}

public actual fun wSASetServiceA(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASetServiceA((lpqsreginfo?.value ?: 0L), essoperation, dwcontrolflags.toInt())

public actual fun wSASetServiceW(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASetServiceW((lpqsreginfo?.value ?: 0L), essoperation, dwcontrolflags.toInt())

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: COpaquePointer?, peertargetnamelen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASetSocketPeerTargetName(socket.toLong(), (peertargetname?.value ?: 0L), peertargetnamelen.toInt(), (overlapped?.value ?: 0L), 0L)

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: COpaquePointer?, securitysettingslen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASetSocketSecurity(socket.toLong(), (securitysettings?.value ?: 0L), securitysettingslen.toInt(), (overlapped?.value ?: 0L), 0L)

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASocketA(af, type, protocol, (lpprotocolinfo?.value ?: 0L), g.toInt(), dwflags.toInt()).toULong()

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSASocketW(af, type, protocol, (lpprotocolinfo?.value ?: 0L), g.toInt(), dwflags.toInt()).toULong()

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAStartup(wversionrequested.toShort(), (lpwsadata?.value ?: 0L))

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAStringToAddressA((addressstring?.value ?: 0L), addressfamily, (lpprotocolinfo?.value ?: 0L), (lpaddress?.value ?: 0L), (lpaddresslength?.value ?: 0L))

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAStringToAddressW((addressstring?.value ?: 0L), addressfamily, (lpprotocolinfo?.value ?: 0L), (lpaddress?.value ?: 0L), (lpaddresslength?.value ?: 0L))

public actual fun wSAUnadvertiseProvider(puuidproviderid: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAUnadvertiseProvider((puuidproviderid?.value ?: 0L))

public actual fun wSAUnhookBlockingHook(): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAUnhookBlockingHook()

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: COpaquePointer?, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSAWaitForMultipleEvents(cevents.toInt(), (lphevents?.value ?: 0L), fwaitall, dwtimeout.toInt(), falertable).toUInt()

public actual fun wSCDeinstallProvider(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCDeinstallProvider((lpproviderid?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCDeinstallProvider32(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCDeinstallProvider32((lpproviderid?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCEnableNSProvider(lpproviderid: COpaquePointer?, fenable: Bool): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCEnableNSProvider((lpproviderid?.value ?: 0L), fenable)

public actual fun wSCEnableNSProvider32(lpproviderid: COpaquePointer?, fenable: Bool): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCEnableNSProvider32((lpproviderid?.value ?: 0L), fenable)

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProviders32((lpdwbufferlength?.value ?: 0L), (lpnspbuffer?.value ?: 0L))

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProvidersEx32((lpdwbufferlength?.value ?: 0L), (lpnspbuffer?.value ?: 0L))

public actual fun wSCEnumProtocols(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCEnumProtocols((lpiprotocols?.value ?: 0L), (lpprotocolbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCEnumProtocols32(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCEnumProtocols32((lpiprotocols?.value ?: 0L), (lpprotocolbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCGetApplicationCategory((path?.value ?: 0L), pathlength.toInt(), (extra?.value ?: 0L), extralength.toInt(), (ppermittedlspcategories?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCGetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCGetProviderInfo((lpproviderid?.value ?: 0L), infotype, (info?.value ?: 0L), (infosize?.value ?: 0L), flags.toInt(), (lperrno?.value ?: 0L))

public actual fun wSCGetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCGetProviderInfo32((lpproviderid?.value ?: 0L), infotype, (info?.value ?: 0L), (infosize?.value ?: 0L), flags.toInt(), (lperrno?.value ?: 0L))

public actual fun wSCGetProviderPath(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCGetProviderPath((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpproviderdllpathlen?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCGetProviderPath32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCGetProviderPath32((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpproviderdllpathlen?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCInstallNameSpace((lpszidentifier?.value ?: 0L), (lpszpathname?.value ?: 0L), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L))

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCInstallNameSpace32((lpszidentifier?.value ?: 0L), (lpszpathname?.value ?: 0L), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L))

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx((lpszidentifier?.value ?: 0L), (lpszpathname?.value ?: 0L), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L), (lpproviderspecific?.value ?: 0L))

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx32((lpszidentifier?.value ?: 0L), (lpszpathname?.value ?: 0L), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L), (lpproviderspecific?.value ?: 0L))

public actual fun wSCInstallProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCInstallProvider((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpprotocolinfolist?.value ?: 0L), dwnumberofentries.toInt(), (lperrno?.value ?: 0L))

public actual fun wscinstallProvider6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wscinstallProvider6432((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpprotocolinfolist?.value ?: 0L), dwnumberofentries.toInt(), (lperrno?.value ?: 0L))

public actual fun wscinstallProviderAndChains6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lpdwcatalogentryid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wscinstallProviderAndChains6432((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpszproviderdllpath32?.value ?: 0L), (lpszlspname?.value ?: 0L), dwserviceflags.toInt(), (lpprotocolinfolist?.value ?: 0L), dwnumberofentries.toInt(), (lpdwcatalogentryid?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: COpaquePointer?, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCSetApplicationCategory((path?.value ?: 0L), pathlength.toInt(), (extra?.value ?: 0L), extralength.toInt(), permittedlspcategories.toInt(), (pprevpermlspcat?.value ?: 0L), (lperrno?.value ?: 0L))

public actual fun wSCSetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCSetProviderInfo((lpproviderid?.value ?: 0L), infotype, (info?.value ?: 0L), infosize.toLong(), flags.toInt(), (lperrno?.value ?: 0L))

public actual fun wSCSetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCSetProviderInfo32((lpproviderid?.value ?: 0L), infotype, (info?.value ?: 0L), infosize.toLong(), flags.toInt(), (lperrno?.value ?: 0L))

public actual fun wSCUnInstallNameSpace(lpproviderid: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace((lpproviderid?.value ?: 0L))

public actual fun wSCUnInstallNameSpace32(lpproviderid: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace32((lpproviderid?.value ?: 0L))

public actual fun wSCUpdateProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCUpdateProvider((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpprotocolinfolist?.value ?: 0L), dwnumberofentries.toInt(), (lperrno?.value ?: 0L))

public actual fun wSCUpdateProvider32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCUpdateProvider32((lpproviderid?.value ?: 0L), (lpszproviderdllpath?.value ?: 0L), (lpprotocolinfolist?.value ?: 0L), dwnumberofentries.toInt(), (lperrno?.value ?: 0L))

public actual fun wSCWriteNameSpaceOrder(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder((lpproviderid?.value ?: 0L), dwnumberofentries.toInt())

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder32((lpproviderid?.value ?: 0L), dwnumberofentries.toInt())

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder((lpwdcatalogentryid?.value ?: 0L), dwnumberofentries.toInt())

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder32((lpwdcatalogentryid?.value ?: 0L), dwnumberofentries.toInt())

public actual fun wsafdisSet(fd: Socket, param1: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_wsafdisSet(fd.toLong(), (param1?.value ?: 0L))

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_accept(s.toLong(), (addr?.value ?: 0L), (addrlen?.value ?: 0L)).toULong()

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_bind(s.toLong(), (name?.value ?: 0L), namelen)

public actual fun closesocket(s: Socket): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_closesocket(s.toLong())

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_connect(s.toLong(), (name?.value ?: 0L), namelen)

public actual fun freeaddrinfo(paddrinfo: COpaquePointer?) {
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_freeaddrinfo((paddrinfo?.value ?: 0L))
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getaddrinfo((pnodename?.value ?: 0L), (pservicename?.value ?: 0L), (phints?.value ?: 0L), (ppresult?.value ?: 0L))

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): COpaquePointer? =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_gethostbyaddr((addr?.value ?: 0L), len, type).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostbyname(name: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_gethostbyname((name?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_gethostname((name?.value ?: 0L), namelen)

public actual fun getnameinfo(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getnameinfo((psockaddr?.value ?: 0L), sockaddrlength, (pnodebuffer?.value ?: 0L), nodebuffersize.toInt(), (pservicebuffer?.value ?: 0L), servicebuffersize.toInt(), flags)

public actual fun getpeername(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getpeername(s.toLong(), (name?.value ?: 0L), (namelen?.value ?: 0L))

public actual fun getprotobyname(name: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getprotobyname((name?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getprotobynumber(number: Int): COpaquePointer? =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getprotobynumber(number).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getservbyname(name: Pcstr, proto: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getservbyname((name?.value ?: 0L), (proto?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getservbyport(port: Int, proto: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getservbyport(port, (proto?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getsockname(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getsockname(s.toLong(), (name?.value ?: 0L), (namelen?.value ?: 0L))

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_getsockopt(s.toLong(), level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun htonl(hostlong: UInt): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_htonl(hostlong.toInt()).toUInt()

public actual fun htons(hostshort: UShort): UShort =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_htons(hostshort.toShort()).toUShort()

public actual fun inetAddr(cp: Pcstr): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inetAddr((cp?.value ?: 0L)).toUInt()

public actual fun inetNtoa(input: InAddr): Pstr =
    null

public actual fun inetNtop(family: Int, paddr: COpaquePointer?, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inetNtop(family, (paddr?.value ?: 0L), (pstringbuf?.value ?: 0L), stringbufsize.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_inetPton(family, (pszaddrstring?.value ?: 0L), (paddrbuf?.value ?: 0L))

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ioctlsocket(s.toLong(), cmd, (argp?.value ?: 0L))

public actual fun listen(s: Socket, backlog: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_listen(s.toLong(), backlog)

public actual fun ntohl(netlong: UInt): UInt =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ntohl(netlong.toInt()).toUInt()

public actual fun ntohs(netshort: UShort): UShort =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_ntohs(netshort.toShort()).toUShort()

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_recv(s.toLong(), (buf?.value ?: 0L), len, flags)

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: COpaquePointer?, fromlen: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_recvfrom(s.toLong(), (buf?.value ?: 0L), len, flags, (from?.value ?: 0L), (fromlen?.value ?: 0L))

public actual fun select(nfds: Int, readfds: COpaquePointer?, writefds: COpaquePointer?, exceptfds: COpaquePointer?, timeout: COpaquePointer?): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_select(nfds, (readfds?.value ?: 0L), (writefds?.value ?: 0L), (exceptfds?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_send(s.toLong(), (buf?.value ?: 0L), len, flags)

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: COpaquePointer?, tolen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_sendto(s.toLong(), (buf?.value ?: 0L), len, flags, (to?.value ?: 0L), tolen)

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_setsockopt(s.toLong(), level, optname, (optval?.value ?: 0L), optlen)

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_shutdown(s.toLong(), how)

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    WindowsWin32NetworkingWinsockJniBridge.windowssys_windows_win32_networking_winsock_socket(af, type, protocol).toULong()
