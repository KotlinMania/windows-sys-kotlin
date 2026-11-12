package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun enumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int

public expect fun enumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int

public expect fun freeAddrInfoEx(paddrinfoex: ConstPtr)

public expect fun freeAddrInfoExW(paddrinfoex: ConstPtr)

public expect fun freeAddrInfoW(paddrinfo: ConstPtr)

public expect fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr, localsockaddrlength: MutPtr, remotesockaddr: MutPtr, remotesockaddrlength: MutPtr)

public expect fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int

public expect fun getAddrInfoExCancel(lphandle: ConstPtr): Int

public expect fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr): Int

public expect fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr): Int

public expect fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr, ppresult: MutPtr): Int

public expect fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr): Int

public expect fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcwstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr): Int

public expect fun getHostNameW(name: Pwstr, namelen: Int): Int

public expect fun getNameByTypeA(lpservicetype: ConstPtr, lpservicename: Pstr, dwnamelength: UInt): Int

public expect fun getNameByTypeW(lpservicetype: ConstPtr, lpservicename: Pwstr, dwnamelength: UInt): Int

public expect fun getNameInfoW(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int

public expect fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int

public expect fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int

public expect fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr): Int

public expect fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr): Int

public expect fun inetNtopW(family: Int, paddr: ConstPtr, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr

public expect fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr): Int

public expect fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr, receivedentrycount: MutPtr): UInt

public expect fun rtlEthernetAddressToStringA(addr: ConstPtr, s: Pstr): Pstr

public expect fun rtlEthernetAddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr

public expect fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int

public expect fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int

public expect fun rtlIpv4AddressToStringA(addr: ConstPtr, s: Pstr): Pstr

public expect fun rtlIpv4AddressToStringExA(address: ConstPtr, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int

public expect fun rtlIpv4AddressToStringExW(address: ConstPtr, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int

public expect fun rtlIpv4AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr

public expect fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int

public expect fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr, port: MutPtr): Int

public expect fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr, port: MutPtr): Int

public expect fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int

public expect fun rtlIpv6AddressToStringA(addr: ConstPtr, s: Pstr): Pstr

public expect fun rtlIpv6AddressToStringExA(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int

public expect fun rtlIpv6AddressToStringExW(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int

public expect fun rtlIpv6AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr

public expect fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int

public expect fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int

public expect fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int

public expect fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int

public expect fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int

public expect fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int

public expect fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int

public expect fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int

public expect fun setSocketMediaStreamingMode(value: Bool): Hresult

public expect fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr, lptransmitbuffers: ConstPtr, dwreserved: UInt): Bool

public expect fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr): Int

public expect fun wSAAccept(s: Socket, addr: MutPtr, addrlen: MutPtr, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket

public expect fun wSAAddressToStringA(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr): Int

public expect fun wSAAddressToStringW(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr): Int

public expect fun wSAAdvertiseProvider(puuidproviderid: ConstPtr, pnspv2routine: ConstPtr): Int

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

public expect fun wSAConnect(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr): Int

public expect fun wSAConnectByList(s: Socket, socketaddress: ConstPtr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool

public expect fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool

public expect fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool

public expect fun wSACreateEvent(): Wsaevent

public expect fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int

public expect fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int

public expect fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int

public expect fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int

public expect fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int

public expect fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int

public expect fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr): Int

public expect fun wSAEnumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int

public expect fun wSAEnumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int

public expect fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int

public expect fun wSAGetLastError(): WsaError

public expect fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr, lpcbtransfer: MutPtr, fwait: Bool, lpdwflags: MutPtr): Bool

public expect fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr, lpqos: MutPtr): Bool

public expect fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int

public expect fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int

public expect fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr): Int

public expect fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr): Int

public expect fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr): Int

public expect fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr): Int

public expect fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt): Int

public expect fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr): Int

public expect fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr): Int

public expect fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSAIsBlocking(): Bool

public expect fun wSAJoinLeaf(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr, dwflags: UInt): Socket

public expect fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int

public expect fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int

public expect fun wSALookupServiceEnd(hlookup: Handle): Int

public expect fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int

public expect fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int

public expect fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpcompletion: ConstPtr): Int

public expect fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr): Int

public expect fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr): Int

public expect fun wSAPoll(fdarray: MutPtr, fds: UInt, timeout: Int): Int

public expect fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int

public expect fun wSAProviderConfigChange(lpnotificationhandle: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr, securityqueryinfolen: MutPtr, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARecv(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr): Int

public expect fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr): Int

public expect fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpfrom: MutPtr, lpfromlen: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSARemoveServiceClass(lpserviceclassid: ConstPtr): Int

public expect fun wSAResetEvent(hevent: Wsaevent): Bool

public expect fun wSARevertImpersonation(): Int

public expect fun wSASend(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr): Int

public expect fun wSASendMsg(handle: Socket, lpmsg: ConstPtr, dwflags: UInt, lpnumberofbytessent: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASendTo(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpto: ConstPtr, itolen: Int, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc

public expect fun wSASetEvent(hevent: Wsaevent): Bool

public expect fun wSASetLastError(ierror: Int)

public expect fun wSASetServiceA(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int

public expect fun wSASetServiceW(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int

public expect fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr, peertargetnamelen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr, securitysettingslen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int

public expect fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket

public expect fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket

public expect fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr): Int

public expect fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int

public expect fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int

public expect fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr): Int

public expect fun wSAUnhookBlockingHook(): Int

public expect fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent

public expect fun wSCDeinstallProvider(lpproviderid: ConstPtr, lperrno: MutPtr): Int

public expect fun wSCDeinstallProvider32(lpproviderid: ConstPtr, lperrno: MutPtr): Int

public expect fun wSCEnableNSProvider(lpproviderid: ConstPtr, fenable: Bool): Int

public expect fun wSCEnableNSProvider32(lpproviderid: ConstPtr, fenable: Bool): Int

public expect fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int

public expect fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int

public expect fun wSCEnumProtocols(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int

public expect fun wSCEnumProtocols32(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int

public expect fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr, lperrno: MutPtr): Int

public expect fun wSCGetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int

public expect fun wSCGetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int

public expect fun wSCGetProviderPath(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int

public expect fun wSCGetProviderPath32(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int

public expect fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int

public expect fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int

public expect fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int

public expect fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int

public expect fun wSCInstallProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int

public expect fun wscinstallProvider6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int

public expect fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr, lperrno: MutPtr): Int

public expect fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr, lperrno: MutPtr): Int

public expect fun wSCSetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int

public expect fun wSCSetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int

public expect fun wSCUnInstallNameSpace(lpproviderid: ConstPtr): Int

public expect fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr): Int

public expect fun wSCUpdateProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int

public expect fun wSCUpdateProvider32(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int

public expect fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr, dwnumberofentries: UInt): Int

public expect fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr, dwnumberofentries: UInt): Int

public expect fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int

public expect fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int

public expect fun wsafdisSet(fd: Socket, param1: MutPtr): Int

public expect fun accept(s: Socket, addr: MutPtr, addrlen: MutPtr): Socket

public expect fun bind(s: Socket, name: ConstPtr, namelen: Int): Int

public expect fun closesocket(s: Socket): Int

public expect fun connect(s: Socket, name: ConstPtr, namelen: Int): Int

public expect fun freeaddrinfo(paddrinfo: ConstPtr)

public expect fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr, ppresult: MutPtr): Int

public expect fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr

public expect fun gethostbyname(name: Pcstr): MutPtr

public expect fun gethostname(name: Pstr, namelen: Int): Int

public expect fun getnameinfo(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int

public expect fun getpeername(s: Socket, name: MutPtr, namelen: MutPtr): Int

public expect fun getprotobyname(name: Pcstr): MutPtr

public expect fun getprotobynumber(number: Int): MutPtr

public expect fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr

public expect fun getservbyport(port: Int, proto: Pcstr): MutPtr

public expect fun getsockname(s: Socket, name: MutPtr, namelen: MutPtr): Int

public expect fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr): Int

public expect fun htonl(hostlong: UInt): UInt

public expect fun htons(hostshort: UShort): UShort

public expect fun inetAddr(cp: Pcstr): UInt

public expect fun inetNtoa(input: InAddr): Pstr

public expect fun inetNtop(family: Int, paddr: ConstPtr, pstringbuf: Pstr, stringbufsize: ULong): Pcstr

public expect fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr): Int

public expect fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr): Int

public expect fun listen(s: Socket, backlog: Int): Int

public expect fun ntohl(netlong: UInt): UInt

public expect fun ntohs(netshort: UShort): UShort

public expect fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int

public expect fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr, fromlen: MutPtr): Int

public expect fun select(nfds: Int, readfds: MutPtr, writefds: MutPtr, exceptfds: MutPtr, timeout: ConstPtr): Int

public expect fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int

public expect fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr, tolen: Int): Int

public expect fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int

public expect fun shutdown(s: Socket, how: WinsockShutdownHow): Int

public expect fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket
