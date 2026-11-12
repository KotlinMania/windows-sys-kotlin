@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr, lpoverlapped: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockAcceptEx")

public actual fun enumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockEnumProtocolsA")

public actual fun enumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockEnumProtocolsW")

public actual fun freeAddrInfoEx(paddrinfoex: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx")

public actual fun freeAddrInfoExW(paddrinfoex: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW")

public actual fun freeAddrInfoW(paddrinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW")

public actual fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr, localsockaddrlength: MutPtr, remotesockaddr: MutPtr, remotesockaddrlength: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs")

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA")

public actual fun getAddrInfoExCancel(lphandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel")

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult")

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW")

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr, ppresult: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoW")

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddressByNameA")

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcwstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddressByNameW")

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetHostNameW")

public actual fun getNameByTypeA(lpservicetype: ConstPtr, lpservicename: Pstr, dwnamelength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetNameByTypeA")

public actual fun getNameByTypeW(lpservicetype: ConstPtr, lpservicename: Pwstr, dwnamelength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetNameByTypeW")

public actual fun getNameInfoW(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetNameInfoW")

public actual fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetServiceA")

public actual fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetServiceW")

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetTypeByNameA")

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetTypeByNameW")

public actual fun inetNtopW(family: Int, paddr: ConstPtr, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetNtopW")

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetPtonW")

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr, receivedentrycount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications")

public actual fun rtlEthernetAddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA")

public actual fun rtlEthernetAddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW")

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA")

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW")

public actual fun rtlIpv4AddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA")

public actual fun rtlIpv4AddressToStringExA(address: ConstPtr, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA")

public actual fun rtlIpv4AddressToStringExW(address: ConstPtr, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW")

public actual fun rtlIpv4AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW")

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA")

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr, port: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA")

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr, port: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW")

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW")

public actual fun rtlIpv6AddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA")

public actual fun rtlIpv6AddressToStringExA(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA")

public actual fun rtlIpv6AddressToStringExW(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW")

public actual fun rtlIpv6AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW")

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA")

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA")

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW")

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW")

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA")

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW")

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetServiceA")

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetServiceW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value: Int): Int

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    wasiWindowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value)

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr, lptransmitbuffers: ConstPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockTransmitFile")

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest")

public actual fun wSAAccept(s: Socket, addr: MutPtr, addrlen: MutPtr, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAccept")

public actual fun wSAAddressToStringA(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA")

public actual fun wSAAddressToStringW(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW")

public actual fun wSAAdvertiseProvider(puuidproviderid: ConstPtr, pnspv2routine: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider")

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr")

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName")

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName")

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber")

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName")

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort")

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect")

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall(): Int

public actual fun wSACancelBlockingCall(): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSACleanup")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSACleanup(): Int

public actual fun wSACleanup(): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSACleanup()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSACloseEvent")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent: Long): Int

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    wasiWindowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent)

public actual fun wSAConnect(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnect")

public actual fun wSAConnectByList(s: Socket, socketaddress: ConstPtr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnectByList")

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA")

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSACreateEvent")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSACreateEvent(): Long

public actual fun wSACreateEvent(): Wsaevent =
    wasiWindowssysWindowsWin32NetworkingWinsockWSACreateEvent()

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName")

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA")

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW")

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA")

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA")

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW")

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW")

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents")

public actual fun wSAEnumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA")

public actual fun wSAEnumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAEventSelect")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAEventSelect(s: Long, heventobject: Long, lnetworkevents: Int): Int

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAEventSelect(s.toLong(), heventobject, lnetworkevents)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAGetLastError")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAGetLastError(): Int

public actual fun wSAGetLastError(): WsaError =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAGetLastError()

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr, lpcbtransfer: MutPtr, fwait: Bool, lpdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult")

public actual fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr, lpqos: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName")

public actual fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA")

public actual fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW")

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA")

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW")

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAHtonl")

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAHtons")

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer")

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA")

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW")

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAIoctl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAIsBlocking")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAIsBlocking(): Int

public actual fun wSAIsBlocking(): Bool =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAIsBlocking()

public actual fun wSAJoinLeaf(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr, dwflags: UInt): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf")

public actual fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA")

public actual fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW")

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd")

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA")

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW")

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpcompletion: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSANSPIoctl")

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSANtohl")

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSANtohs")

public actual fun wSAPoll(fdarray: MutPtr, fds: UInt, timeout: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAPoll")

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall")

public actual fun wSAProviderConfigChange(lpnotificationhandle: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange")

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr, securityqueryinfolen: MutPtr, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity")

public actual fun wSARecv(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecv")

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect")

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecvEx")

public actual fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpfrom: MutPtr, lpfromlen: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecvFrom")

public actual fun wSARemoveServiceClass(lpserviceclassid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAResetEvent")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent: Long): Int

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSARevertImpersonation(): Int

public actual fun wSARevertImpersonation(): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSARevertImpersonation()

public actual fun wSASend(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASend")

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASendDisconnect")

public actual fun wSASendMsg(handle: Socket, lpmsg: ConstPtr, dwflags: UInt, lpnumberofbytessent: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASendMsg")

public actual fun wSASendTo(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpto: ConstPtr, itolen: Int, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASendTo")

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetBlockingHook")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSASetEvent")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent: Long): Int

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    wasiWindowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSASetLastError")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror: Int): Unit

public actual fun wSASetLastError(ierror: Int): Unit =
    wasiWindowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror)

public actual fun wSASetServiceA(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetServiceA")

public actual fun wSASetServiceW(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetServiceW")

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr, peertargetnamelen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName")

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr, securitysettingslen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity")

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASocketA")

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASocketW")

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAStartup")

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA")

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW")

public actual fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook(): Int

public actual fun wSAUnhookBlockingHook(): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook()

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents")

public actual fun wSCDeinstallProvider(lpproviderid: ConstPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider")

public actual fun wSCDeinstallProvider32(lpproviderid: ConstPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32")

public actual fun wSCEnableNSProvider(lpproviderid: ConstPtr, fenable: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider")

public actual fun wSCEnableNSProvider32(lpproviderid: ConstPtr, fenable: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32")

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32")

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32")

public actual fun wSCEnumProtocols(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols")

public actual fun wSCEnumProtocols32(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32")

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory")

public actual fun wSCGetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo")

public actual fun wSCGetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32")

public actual fun wSCGetProviderPath(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath")

public actual fun wSCGetProviderPath32(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32")

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace")

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32")

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx")

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32")

public actual fun wSCInstallProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallProvider")

public actual fun wscinstallProvider6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432")

public actual fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432")

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory")

public actual fun wSCSetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo")

public actual fun wSCSetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32")

public actual fun wSCUnInstallNameSpace(lpproviderid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace")

public actual fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32")

public actual fun wSCUpdateProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider")

public actual fun wSCUpdateProvider32(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32")

public actual fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder")

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32")

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder")

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32")

public actual fun wsafdisSet(fd: Socket, param1: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWsafdisSet")

public actual fun accept(s: Socket, addr: MutPtr, addrlen: MutPtr): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockAccept")

public actual fun bind(s: Socket, name: ConstPtr, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockBind")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockClosesocket")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockClosesocket(s: Long): Int

public actual fun closesocket(s: Socket): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockClosesocket(s.toLong())

public actual fun connect(s: Socket, name: ConstPtr, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockConnect")

public actual fun freeaddrinfo(paddrinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeaddrinfo")

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr, ppresult: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetaddrinfo")

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGethostbyaddr")

public actual fun gethostbyname(name: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGethostbyname")

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGethostname")

public actual fun getnameinfo(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetnameinfo")

public actual fun getpeername(s: Socket, name: MutPtr, namelen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetpeername")

public actual fun getprotobyname(name: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetprotobyname")

public actual fun getprotobynumber(number: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetprotobynumber")

public actual fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetservbyname")

public actual fun getservbyport(port: Int, proto: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetservbyport")

public actual fun getsockname(s: Socket, name: MutPtr, namelen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetsockname")

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetsockopt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockHtonl")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockHtonl(hostlong: Int): Int

public actual fun htonl(hostlong: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingWinsockHtonl(hostlong.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockHtons")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockHtons(hostshort: Int): Int

public actual fun htons(hostshort: UShort): UShort =
    wasiWindowssysWindowsWin32NetworkingWinsockHtons(hostshort.toInt()).toUShort()

public actual fun inetAddr(cp: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetAddr")

public actual fun inetNtoa(input: InAddr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetNtoa")

public actual fun inetNtop(family: Int, paddr: ConstPtr, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetNtop")

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetPton")

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockIoctlsocket")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockListen")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockListen(s: Long, backlog: Int): Int

public actual fun listen(s: Socket, backlog: Int): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockListen(s.toLong(), backlog)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockNtohl")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockNtohl(netlong: Int): Int

public actual fun ntohl(netlong: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingWinsockNtohl(netlong.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockNtohs")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockNtohs(netshort: Int): Int

public actual fun ntohs(netshort: UShort): UShort =
    wasiWindowssysWindowsWin32NetworkingWinsockNtohs(netshort.toInt()).toUShort()

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRecv")

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr, fromlen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRecvfrom")

public actual fun select(nfds: Int, readfds: MutPtr, writefds: MutPtr, exceptfds: MutPtr, timeout: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSelect")

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSend")

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr, tolen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSendto")

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetsockopt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockShutdown")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockShutdown(s: Long, how: Int): Int

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockShutdown(s.toLong(), how)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockSocket")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockSocket(af: Int, type: Int, protocol: Int): Long

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    wasiWindowssysWindowsWin32NetworkingWinsockSocket(af, type, protocol).toULong()
