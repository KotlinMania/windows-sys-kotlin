package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import io.github.kotlinmania.windowssys.windows.win32.system.io.OverlappedEntry

public expect fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun enumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int

public expect fun enumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int

public expect fun freeAddrInfoEx(paddrinfoex: ConstPtr<Addrinfoexa>)

public expect fun freeAddrInfoExW(paddrinfoex: ConstPtr<Addrinfoexw>)

public expect fun freeAddrInfoW(paddrinfo: ConstPtr<Addrinfow>)

public expect fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr<MutPtr<Sockaddr>>, localsockaddrlength: MutPtr<Int>, remotesockaddr: MutPtr<MutPtr<Sockaddr>>, remotesockaddrlength: MutPtr<Int>)

public expect fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexa>, ppresult: MutPtr<MutPtr<Addrinfoexa>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int

public expect fun getAddrInfoExCancel(lphandle: ConstPtr<Handle>): Int

public expect fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Int

public expect fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexw>, ppresult: MutPtr<MutPtr<Addrinfoexw>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr<Handle>): Int

public expect fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr<Addrinfow>, ppresult: MutPtr<MutPtr<Addrinfow>>): Int

public expect fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr<UInt>): Int

public expect fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcwstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr<UInt>): Int

public expect fun getHostNameW(name: Pwstr, namelen: Int): Int

public expect fun getNameByTypeA(lpservicetype: ConstPtr<Guid>, lpservicename: Pstr, dwnamelength: UInt): Int

public expect fun getNameByTypeW(lpservicetype: ConstPtr<Guid>, lpservicename: Pwstr, dwnamelength: UInt): Int

public expect fun getNameInfoW(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int

public expect fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int

public expect fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int

public expect fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr<Guid>): Int

public expect fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr<Guid>): Int

public expect fun inetNtopW(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr

public expect fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr<CVoid>): Int

public expect fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr<SockNotifyRegistration>, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr<OverlappedEntry>, receivedentrycount: MutPtr<UInt>): UInt

public expect fun rtlEthernetAddressToStringA(addr: ConstPtr<DlEui48>, s: Pstr): Pstr

public expect fun rtlEthernetAddressToStringW(addr: ConstPtr<DlEui48>, s: Pwstr): Pwstr

public expect fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<DlEui48>): Int

public expect fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<DlEui48>): Int

public expect fun rtlIpv4AddressToStringA(addr: ConstPtr<InAddr>, s: Pstr): Pstr

public expect fun rtlIpv4AddressToStringExA(address: ConstPtr<InAddr>, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int

public expect fun rtlIpv4AddressToStringExW(address: ConstPtr<InAddr>, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int

public expect fun rtlIpv4AddressToStringW(addr: ConstPtr<InAddr>, s: Pwstr): Pwstr

public expect fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr<Pcstr>, addr: MutPtr<InAddr>): Int

public expect fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int

public expect fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int

public expect fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr<Pcwstr>, addr: MutPtr<InAddr>): Int

public expect fun rtlIpv6AddressToStringA(addr: ConstPtr<In6Addr>, s: Pstr): Pstr

public expect fun rtlIpv6AddressToStringExA(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int

public expect fun rtlIpv6AddressToStringExW(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int

public expect fun rtlIpv6AddressToStringW(addr: ConstPtr<In6Addr>, s: Pwstr): Pwstr

public expect fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<In6Addr>): Int

public expect fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int

public expect fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int

public expect fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<In6Addr>): Int

public expect fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int

public expect fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int

public expect fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfoa>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int

public expect fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfow>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int

public expect fun setSocketMediaStreamingMode(value: Bool): Hresult

public expect fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr<Overlapped>, lptransmitbuffers: ConstPtr<TransmitFileBuffers>, dwreserved: UInt): Bool

public expect fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr<Overlapped>, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSAAccept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket

public expect fun wSAAddressToStringA(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr<UInt>): Int

public expect fun wSAAddressToStringW(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr<UInt>): Int

public expect fun wSAAdvertiseProvider(puuidproviderid: ConstPtr<Guid>, pnspv2routine: ConstPtr<Nspv2Routine>): Int

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

public expect fun wSAConnect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>): Int

public expect fun wSAConnectByList(s: Socket, socketaddress: ConstPtr<SocketAddressList>, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool

public expect fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool

public expect fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool

public expect fun wSACreateEvent(): Wsaevent

public expect fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfoa>): Int

public expect fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfow>): Int

public expect fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoa>): Int

public expect fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexa>): Int

public expect fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int

public expect fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int

public expect fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr<Wsanetworkevents>): Int

public expect fun wSAEnumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfoa>, lpdwbufferlength: MutPtr<UInt>): Int

public expect fun wSAEnumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>): Int

public expect fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int

public expect fun wSAGetLastError(): WsaError

public expect fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr<Overlapped>, lpcbtransfer: MutPtr<UInt>, fwait: Bool, lpdwflags: MutPtr<UInt>): Bool

public expect fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr<Wsabuf>, lpqos: MutPtr<Qos>): Bool

public expect fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfoa>): Int

public expect fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfow>): Int

public expect fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr<UInt>): Int

public expect fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr<UInt>): Int

public expect fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr<UInt>): Int

public expect fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr<UShort>): Int

public expect fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt): Int

public expect fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfoa>): Int

public expect fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>): Int

public expect fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSAIsBlocking(): Bool

public expect fun wSAJoinLeaf(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>, dwflags: UInt): Socket

public expect fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr<Wsaqueryseta>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int

public expect fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr<Wsaquerysetw>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int

public expect fun wSALookupServiceEnd(hlookup: Handle): Int

public expect fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaqueryseta>): Int

public expect fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaquerysetw>): Int

public expect fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpcompletion: ConstPtr<Wsacompletion>): Int

public expect fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr<UInt>): Int

public expect fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr<UShort>): Int

public expect fun wSAPoll(fdarray: MutPtr<Wsapollfd>, fds: UInt, timeout: Int): Int

public expect fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int

public expect fun wSAProviderConfigChange(lpnotificationhandle: MutPtr<Handle>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr<SocketSecurityQueryTemplate>, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr<SocketSecurityQueryInfo>, securityqueryinfolen: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARecv(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr<Wsabuf>): Int

public expect fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr<Int>): Int

public expect fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpfrom: MutPtr<Sockaddr>, lpfromlen: MutPtr<Int>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARemoveServiceClass(lpserviceclassid: ConstPtr<Guid>): Int

public expect fun wSAResetEvent(hevent: Wsaevent): Bool

public expect fun wSARevertImpersonation(): Int

public expect fun wSASend(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr<Wsabuf>): Int

public expect fun wSASendMsg(handle: Socket, lpmsg: ConstPtr<Wsamsg>, dwflags: UInt, lpnumberofbytessent: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASendTo(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpto: ConstPtr<Sockaddr>, itolen: Int, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc

public expect fun wSASetEvent(hevent: Wsaevent): Bool

public expect fun wSASetLastError(ierror: Int)

public expect fun wSASetServiceA(lpqsreginfo: ConstPtr<Wsaqueryseta>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int

public expect fun wSASetServiceW(lpqsreginfo: ConstPtr<Wsaquerysetw>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int

public expect fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr<SocketPeerTargetName>, peertargetnamelen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr<SocketSecuritySettings>, securitysettingslen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, g: UInt, dwflags: UInt): Socket

public expect fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, g: UInt, dwflags: UInt): Socket

public expect fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr<Wsadata>): Int

public expect fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int

public expect fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int

public expect fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr<Guid>): Int

public expect fun wSAUnhookBlockingHook(): Int

public expect fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr<Handle>, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent

public expect fun wSCDeinstallProvider(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int

public expect fun wSCDeinstallProvider32(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int

public expect fun wSCEnableNSProvider(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int

public expect fun wSCEnableNSProvider32(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int

public expect fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int

public expect fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int

public expect fun wSCEnumProtocols(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int

public expect fun wSCEnumProtocols32(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int

public expect fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr<UInt>, lperrno: MutPtr<Int>): Int

public expect fun wSCGetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSCGetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSCGetProviderPath(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int

public expect fun wSCGetProviderPath32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int

public expect fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int

public expect fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int

public expect fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int

public expect fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int

public expect fun wSCInstallProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int

public expect fun wscinstallProvider6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int

public expect fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr<UInt>, lperrno: MutPtr<Int>): Int

public expect fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr<UInt>, lperrno: MutPtr<Int>): Int

public expect fun wSCSetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSCSetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSCUnInstallNameSpace(lpproviderid: ConstPtr<Guid>): Int

public expect fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr<Guid>): Int

public expect fun wSCUpdateProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSCUpdateProvider32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int

public expect fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int

public expect fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int

public expect fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int

public expect fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int

public expect fun wsafdisSet(fd: Socket, param1: MutPtr<FdSet>): Int

public expect fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>): Socket

public expect fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int

public expect fun closesocket(s: Socket): Int

public expect fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int

public expect fun freeaddrinfo(paddrinfo: ConstPtr<Addrinfoa>)

public expect fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr<Addrinfoa>, ppresult: MutPtr<MutPtr<Addrinfoa>>): Int

public expect fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr<Hostent>

public expect fun gethostbyname(name: Pcstr): MutPtr<Hostent>

public expect fun gethostname(name: Pstr, namelen: Int): Int

public expect fun getnameinfo(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int

public expect fun getpeername(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int

public expect fun getprotobyname(name: Pcstr): MutPtr<Protoent>

public expect fun getprotobynumber(number: Int): MutPtr<Protoent>

public expect fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr<Servent>

public expect fun getservbyport(port: Int, proto: Pcstr): MutPtr<Servent>

public expect fun getsockname(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int

public expect fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr<Int>): Int

public expect fun htonl(hostlong: UInt): UInt

public expect fun htons(hostshort: UShort): UShort

public expect fun inetAddr(cp: Pcstr): UInt

public expect fun inetNtoa(input: InAddr): Pstr

public expect fun inetNtop(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pstr, stringbufsize: ULong): Pcstr

public expect fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr<CVoid>): Int

public expect fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr<UInt>): Int

public expect fun listen(s: Socket, backlog: Int): Int

public expect fun ntohl(netlong: UInt): UInt

public expect fun ntohs(netshort: UShort): UShort

public expect fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int

public expect fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr<Sockaddr>, fromlen: MutPtr<Int>): Int

public expect fun select(nfds: Int, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, exceptfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): Int

public expect fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int

public expect fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr<Sockaddr>, tolen: Int): Int

public expect fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int

public expect fun shutdown(s: Socket, how: WinsockShutdownHow): Int

public expect fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket
