package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent

public expect fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun enumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int

public expect fun enumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int

public expect fun freeAddrInfoEx(paddrinfoex: COpaquePointer?)

public expect fun freeAddrInfoExW(paddrinfoex: COpaquePointer?)

public expect fun freeAddrInfoW(paddrinfo: COpaquePointer?)

public expect fun getAcceptExSockaddrs(lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: COpaquePointer?, localsockaddrlength: COpaquePointer?, remotesockaddr: COpaquePointer?, remotesockaddrlength: COpaquePointer?)

public expect fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int

public expect fun getAddrInfoExCancel(lphandle: COpaquePointer?): Int

public expect fun getAddrInfoExOverlappedResult(lpoverlapped: COpaquePointer?): Int

public expect fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: COpaquePointer?): Int

public expect fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int

public expect fun getAddressByNameA(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pstr, lpdwaliasbufferlength: COpaquePointer?): Int

public expect fun getAddressByNameW(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcwstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: COpaquePointer?): Int

public expect fun getHostNameW(name: Pwstr, namelen: Int): Int

public expect fun getNameByTypeA(lpservicetype: COpaquePointer?, lpservicename: Pstr, dwnamelength: UInt): Int

public expect fun getNameByTypeW(lpservicetype: COpaquePointer?, lpservicename: Pwstr, dwnamelength: UInt): Int

public expect fun getNameInfoW(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int

public expect fun getServiceA(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int

public expect fun getServiceW(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int

public expect fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: COpaquePointer?): Int

public expect fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: COpaquePointer?): Int

public expect fun inetNtopW(family: Int, paddr: COpaquePointer?, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr

public expect fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: COpaquePointer?): Int

public expect fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: COpaquePointer?, timeoutms: UInt, completioncount: UInt, completionportentries: COpaquePointer?, receivedentrycount: COpaquePointer?): UInt

public expect fun rtlEthernetAddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr

public expect fun rtlEthernetAddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr

public expect fun rtlEthernetStringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int

public expect fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int

public expect fun rtlIpv4AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr

public expect fun rtlIpv4AddressToStringExA(address: COpaquePointer?, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int

public expect fun rtlIpv4AddressToStringExW(address: COpaquePointer?, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int

public expect fun rtlIpv4AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr

public expect fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int

public expect fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int

public expect fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int

public expect fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int

public expect fun rtlIpv6AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr

public expect fun rtlIpv6AddressToStringExA(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int

public expect fun rtlIpv6AddressToStringExW(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int

public expect fun rtlIpv6AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr

public expect fun rtlIpv6StringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int

public expect fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int

public expect fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int

public expect fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int

public expect fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int

public expect fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int

public expect fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int

public expect fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int

public expect fun setSocketMediaStreamingMode(value: Bool): Hresult

public expect fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: COpaquePointer?, lptransmitbuffers: COpaquePointer?, dwreserved: UInt): Bool

public expect fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: COpaquePointer?, dwerror: UInt, cbtransferred: UInt, lperrno: COpaquePointer?): Int

public expect fun wSAAccept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket

public expect fun wSAAddressToStringA(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pstr, lpdwaddressstringlength: COpaquePointer?): Int

public expect fun wSAAddressToStringW(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pwstr, lpdwaddressstringlength: COpaquePointer?): Int

public expect fun wSAAdvertiseProvider(puuidproviderid: COpaquePointer?, pnspv2routine: COpaquePointer?): Int

public expect fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle

public expect fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle

public expect fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle

public expect fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle

public expect fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle

public expect fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle

public expect fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int

public expect fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int

public expect fun wSACancelBlockingCall(): Int

public expect fun wSACleanup(): Int

public expect fun wSACloseEvent(hevent: Wsaevent): Bool

public expect fun wSAConnect(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?): Int

public expect fun wSAConnectByList(s: Socket, socketaddress: COpaquePointer?, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun wSACreateEvent(): Wsaevent

public expect fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int

public expect fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int

public expect fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int

public expect fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int

public expect fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int

public expect fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int

public expect fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: COpaquePointer?): Int

public expect fun wSAEnumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int

public expect fun wSAEnumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int

public expect fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int

public expect fun wSAGetLastError(): WsaError

public expect fun wSAGetOverlappedResult(s: Socket, lpoverlapped: COpaquePointer?, lpcbtransfer: COpaquePointer?, fwait: Bool, lpdwflags: COpaquePointer?): Bool

public expect fun wSAGetQOSByName(s: Socket, lpqosname: COpaquePointer?, lpqos: COpaquePointer?): Bool

public expect fun wSAGetServiceClassInfoA(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int

public expect fun wSAGetServiceClassInfoW(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int

public expect fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pstr, lpdwbufferlength: COpaquePointer?): Int

public expect fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pwstr, lpdwbufferlength: COpaquePointer?): Int

public expect fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: COpaquePointer?): Int

public expect fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: COpaquePointer?): Int

public expect fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt): Int

public expect fun wSAInstallServiceClassA(lpserviceclassinfo: COpaquePointer?): Int

public expect fun wSAInstallServiceClassW(lpserviceclassinfo: COpaquePointer?): Int

public expect fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSAIsBlocking(): Bool

public expect fun wSAJoinLeaf(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, dwflags: UInt): Socket

public expect fun wSALookupServiceBeginA(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int

public expect fun wSALookupServiceBeginW(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int

public expect fun wSALookupServiceEnd(hlookup: Handle): Int

public expect fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int

public expect fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int

public expect fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpcompletion: COpaquePointer?): Int

public expect fun wSANtohl(s: Socket, netlong: UInt, lphostlong: COpaquePointer?): Int

public expect fun wSANtohs(s: Socket, netshort: UShort, lphostshort: COpaquePointer?): Int

public expect fun wSAPoll(fdarray: COpaquePointer?, fds: UInt, timeout: Int): Int

public expect fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int

public expect fun wSAProviderConfigChange(lpnotificationhandle: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: COpaquePointer?, securityquerytemplatelen: UInt, securityqueryinfo: COpaquePointer?, securityqueryinfolen: COpaquePointer?, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARecv(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: COpaquePointer?): Int

public expect fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: COpaquePointer?): Int

public expect fun wSARecvFrom(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpfrom: COpaquePointer?, lpfromlen: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARemoveServiceClass(lpserviceclassid: COpaquePointer?): Int

public expect fun wSAResetEvent(hevent: Wsaevent): Bool

public expect fun wSARevertImpersonation(): Int

public expect fun wSASend(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: COpaquePointer?): Int

public expect fun wSASendMsg(handle: Socket, lpmsg: COpaquePointer?, dwflags: UInt, lpnumberofbytessent: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASendTo(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpto: COpaquePointer?, itolen: Int, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc

public expect fun wSASetEvent(hevent: Wsaevent): Bool

public expect fun wSASetLastError(ierror: Int)

public expect fun wSASetServiceA(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int

public expect fun wSASetServiceW(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int

public expect fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: COpaquePointer?, peertargetnamelen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASetSocketSecurity(socket: Socket, securitysettings: COpaquePointer?, securitysettingslen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket

public expect fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket

public expect fun wSAStartup(wversionrequested: UShort, lpwsadata: COpaquePointer?): Int

public expect fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int

public expect fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int

public expect fun wSAUnadvertiseProvider(puuidproviderid: COpaquePointer?): Int

public expect fun wSAUnhookBlockingHook(): Int

public expect fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: COpaquePointer?, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent

public expect fun wSCDeinstallProvider(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCDeinstallProvider32(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCEnableNSProvider(lpproviderid: COpaquePointer?, fenable: Bool): Int

public expect fun wSCEnableNSProvider32(lpproviderid: COpaquePointer?, fenable: Bool): Int

public expect fun wSCEnumNameSpaceProviders32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int

public expect fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int

public expect fun wSCEnumProtocols(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCEnumProtocols32(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCGetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int

public expect fun wSCGetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int

public expect fun wSCGetProviderPath(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCGetProviderPath32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int

public expect fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int

public expect fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int

public expect fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int

public expect fun wSCInstallProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int

public expect fun wscinstallProvider6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int

public expect fun wscinstallProviderAndChains6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lpdwcatalogentryid: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: COpaquePointer?, lperrno: COpaquePointer?): Int

public expect fun wSCSetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int

public expect fun wSCSetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int

public expect fun wSCUnInstallNameSpace(lpproviderid: COpaquePointer?): Int

public expect fun wSCUnInstallNameSpace32(lpproviderid: COpaquePointer?): Int

public expect fun wSCUpdateProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int

public expect fun wSCUpdateProvider32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int

public expect fun wSCWriteNameSpaceOrder(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int

public expect fun wSCWriteNameSpaceOrder32(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int

public expect fun wSCWriteProviderOrder(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int

public expect fun wSCWriteProviderOrder32(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int

public expect fun wsafdisSet(fd: Socket, param1: COpaquePointer?): Int

public expect fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket

public expect fun bind(s: Socket, name: COpaquePointer?, namelen: Int): Int

public expect fun closesocket(s: Socket): Int

public expect fun connect(s: Socket, name: COpaquePointer?, namelen: Int): Int

public expect fun freeaddrinfo(paddrinfo: COpaquePointer?)

public expect fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int

public expect fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): COpaquePointer?

public expect fun gethostbyname(name: Pcstr): COpaquePointer?

public expect fun gethostname(name: Pstr, namelen: Int): Int

public expect fun getnameinfo(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int

public expect fun getpeername(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int

public expect fun getprotobyname(name: Pcstr): COpaquePointer?

public expect fun getprotobynumber(number: Int): COpaquePointer?

public expect fun getservbyname(name: Pcstr, proto: Pcstr): COpaquePointer?

public expect fun getservbyport(port: Int, proto: Pcstr): COpaquePointer?

public expect fun getsockname(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int

public expect fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: COpaquePointer?): Int

public expect fun htonl(hostlong: UInt): UInt

public expect fun htons(hostshort: UShort): UShort

public expect fun inetAddr(cp: Pcstr): UInt

public expect fun inetNtoa(input: InAddr): Pstr

public expect fun inetNtop(family: Int, paddr: COpaquePointer?, pstringbuf: Pstr, stringbufsize: ULong): Pcstr

public expect fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: COpaquePointer?): Int

public expect fun ioctlsocket(s: Socket, cmd: Int, argp: COpaquePointer?): Int

public expect fun listen(s: Socket, backlog: Int): Int

public expect fun ntohl(netlong: UInt): UInt

public expect fun ntohs(netshort: UShort): UShort

public expect fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int

public expect fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: COpaquePointer?, fromlen: COpaquePointer?): Int

public expect fun select(nfds: Int, readfds: COpaquePointer?, writefds: COpaquePointer?, exceptfds: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int

public expect fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: COpaquePointer?, tolen: Int): Int

public expect fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int

public expect fun shutdown(s: Socket, how: WinsockShutdownHow): Int

public expect fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket
