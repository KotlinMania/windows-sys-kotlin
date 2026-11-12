@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import io.github.kotlinmania.windowssys.windows.win32.system.io.OverlappedEntry

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockAcceptEx")

public actual fun enumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockEnumProtocolsA")

public actual fun enumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockEnumProtocolsW")

public actual fun freeAddrInfoEx(paddrinfoex: ConstPtr<Addrinfoexa>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx")

public actual fun freeAddrInfoExW(paddrinfoex: ConstPtr<Addrinfoexw>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW")

public actual fun freeAddrInfoW(paddrinfo: ConstPtr<Addrinfow>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW")

public actual fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr<MutPtr<Sockaddr>>, localsockaddrlength: MutPtr<Int>, remotesockaddr: MutPtr<MutPtr<Sockaddr>>, remotesockaddrlength: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs")

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexa>, ppresult: MutPtr<MutPtr<Addrinfoexa>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA")

public actual fun getAddrInfoExCancel(lphandle: ConstPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel")

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult")

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexw>, ppresult: MutPtr<MutPtr<Addrinfoexw>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW")

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr<Addrinfow>, ppresult: MutPtr<MutPtr<Addrinfow>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddrInfoW")

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddressByNameA")

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcwstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetAddressByNameW")

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetHostNameW")

public actual fun getNameByTypeA(lpservicetype: ConstPtr<Guid>, lpservicename: Pstr, dwnamelength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetNameByTypeA")

public actual fun getNameByTypeW(lpservicetype: ConstPtr<Guid>, lpservicename: Pwstr, dwnamelength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetNameByTypeW")

public actual fun getNameInfoW(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetNameInfoW")

public actual fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetServiceA")

public actual fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetServiceW")

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetTypeByNameA")

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetTypeByNameW")

public actual fun inetNtopW(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetNtopW")

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetPtonW")

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr<SockNotifyRegistration>, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr<OverlappedEntry>, receivedentrycount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications")

public actual fun rtlEthernetAddressToStringA(addr: ConstPtr<DlEui48>, s: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA")

public actual fun rtlEthernetAddressToStringW(addr: ConstPtr<DlEui48>, s: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW")

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<DlEui48>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA")

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<DlEui48>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW")

public actual fun rtlIpv4AddressToStringA(addr: ConstPtr<InAddr>, s: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA")

public actual fun rtlIpv4AddressToStringExA(address: ConstPtr<InAddr>, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA")

public actual fun rtlIpv4AddressToStringExW(address: ConstPtr<InAddr>, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW")

public actual fun rtlIpv4AddressToStringW(addr: ConstPtr<InAddr>, s: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW")

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr<Pcstr>, addr: MutPtr<InAddr>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA")

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA")

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW")

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr<Pcwstr>, addr: MutPtr<InAddr>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW")

public actual fun rtlIpv6AddressToStringA(addr: ConstPtr<In6Addr>, s: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA")

public actual fun rtlIpv6AddressToStringExA(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA")

public actual fun rtlIpv6AddressToStringExW(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW")

public actual fun rtlIpv6AddressToStringW(addr: ConstPtr<In6Addr>, s: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW")

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<In6Addr>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA")

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA")

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW")

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<In6Addr>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW")

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA")

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW")

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfoa>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetServiceA")

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfow>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSetServiceW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value: Int): Int

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    wasiWindowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value)

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr<Overlapped>, lptransmitbuffers: ConstPtr<TransmitFileBuffers>, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockTransmitFile")

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr<Overlapped>, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest")

public actual fun wSAAccept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAccept")

public actual fun wSAAddressToStringA(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA")

public actual fun wSAAddressToStringW(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW")

public actual fun wSAAdvertiseProvider(puuidproviderid: ConstPtr<Guid>, pnspv2routine: ConstPtr<Nspv2Routine>): Int =
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

public actual fun wSAConnect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnect")

public actual fun wSAConnectByList(s: Socket, socketaddress: ConstPtr<SocketAddressList>, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnectByList")

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA")

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSACreateEvent")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSACreateEvent(): Long

public actual fun wSACreateEvent(): Wsaevent =
    wasiWindowssysWindowsWin32NetworkingWinsockWSACreateEvent()

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName")

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfoa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA")

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfow>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW")

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA")

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA")

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW")

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW")

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr<Wsanetworkevents>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents")

public actual fun wSAEnumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfoa>, lpdwbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA")

public actual fun wSAEnumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAEventSelect")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAEventSelect(s: Long, heventobject: Long, lnetworkevents: Int): Int

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAEventSelect(s.toLong(), heventobject, lnetworkevents)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAGetLastError")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAGetLastError(): Int

public actual fun wSAGetLastError(): WsaError =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAGetLastError()

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr<Overlapped>, lpcbtransfer: MutPtr<UInt>, fwait: Bool, lpdwflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult")

public actual fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr<Wsabuf>, lpqos: MutPtr<Qos>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName")

public actual fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfoa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA")

public actual fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfow>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW")

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA")

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW")

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAHtonl")

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAHtons")

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer")

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfoa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA")

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW")

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAIoctl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAIsBlocking")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAIsBlocking(): Int

public actual fun wSAIsBlocking(): Bool =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAIsBlocking()

public actual fun wSAJoinLeaf(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>, dwflags: UInt): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf")

public actual fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr<Wsaqueryseta>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA")

public actual fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr<Wsaquerysetw>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW")

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd")

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaqueryseta>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA")

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaquerysetw>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW")

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpcompletion: ConstPtr<Wsacompletion>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSANSPIoctl")

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSANtohl")

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSANtohs")

public actual fun wSAPoll(fdarray: MutPtr<Wsapollfd>, fds: UInt, timeout: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAPoll")

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall")

public actual fun wSAProviderConfigChange(lpnotificationhandle: MutPtr<Handle>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange")

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr<SocketSecurityQueryTemplate>, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr<SocketSecurityQueryInfo>, securityqueryinfolen: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity")

public actual fun wSARecv(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecv")

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr<Wsabuf>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect")

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecvEx")

public actual fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpfrom: MutPtr<Sockaddr>, lpfromlen: MutPtr<Int>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARecvFrom")

public actual fun wSARemoveServiceClass(lpserviceclassid: ConstPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAResetEvent")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent: Long): Int

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSARevertImpersonation(): Int

public actual fun wSARevertImpersonation(): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSARevertImpersonation()

public actual fun wSASend(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASend")

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr<Wsabuf>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASendDisconnect")

public actual fun wSASendMsg(handle: Socket, lpmsg: ConstPtr<Wsamsg>, dwflags: UInt, lpnumberofbytessent: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASendMsg")

public actual fun wSASendTo(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpto: ConstPtr<Sockaddr>, itolen: Int, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
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

public actual fun wSASetServiceA(lpqsreginfo: ConstPtr<Wsaqueryseta>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetServiceA")

public actual fun wSASetServiceW(lpqsreginfo: ConstPtr<Wsaquerysetw>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetServiceW")

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr<SocketPeerTargetName>, peertargetnamelen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName")

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr<SocketSecuritySettings>, securitysettingslen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity")

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, g: UInt, dwflags: UInt): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASocketA")

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, g: UInt, dwflags: UInt): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSASocketW")

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr<Wsadata>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAStartup")

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA")

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW")

public actual fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook(): Int

public actual fun wSAUnhookBlockingHook(): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook()

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr<Handle>, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents")

public actual fun wSCDeinstallProvider(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider")

public actual fun wSCDeinstallProvider32(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32")

public actual fun wSCEnableNSProvider(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider")

public actual fun wSCEnableNSProvider32(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32")

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32")

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32")

public actual fun wSCEnumProtocols(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols")

public actual fun wSCEnumProtocols32(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32")

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory")

public actual fun wSCGetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo")

public actual fun wSCGetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32")

public actual fun wSCGetProviderPath(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath")

public actual fun wSCGetProviderPath32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32")

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace")

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32")

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx")

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32")

public actual fun wSCInstallProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCInstallProvider")

public actual fun wscinstallProvider6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432")

public actual fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432")

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory")

public actual fun wSCSetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo")

public actual fun wSCSetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32")

public actual fun wSCUnInstallNameSpace(lpproviderid: ConstPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace")

public actual fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32")

public actual fun wSCUpdateProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider")

public actual fun wSCUpdateProvider32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32")

public actual fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder")

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32")

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder")

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32")

public actual fun wsafdisSet(fd: Socket, param1: MutPtr<FdSet>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockWsafdisSet")

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockAccept")

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockBind")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinsockClosesocket")
private external fun wasiWindowssysWindowsWin32NetworkingWinsockClosesocket(s: Long): Int

public actual fun closesocket(s: Socket): Int =
    wasiWindowssysWindowsWin32NetworkingWinsockClosesocket(s.toLong())

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockConnect")

public actual fun freeaddrinfo(paddrinfo: ConstPtr<Addrinfoa>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockFreeaddrinfo")

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr<Addrinfoa>, ppresult: MutPtr<MutPtr<Addrinfoa>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetaddrinfo")

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr<Hostent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGethostbyaddr")

public actual fun gethostbyname(name: Pcstr): MutPtr<Hostent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGethostbyname")

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGethostname")

public actual fun getnameinfo(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetnameinfo")

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetpeername")

public actual fun getprotobyname(name: Pcstr): MutPtr<Protoent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetprotobyname")

public actual fun getprotobynumber(number: Int): MutPtr<Protoent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetprotobynumber")

public actual fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr<Servent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetservbyname")

public actual fun getservbyport(port: Int, proto: Pcstr): MutPtr<Servent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetservbyport")

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockGetsockname")

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr<Int>): Int =
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

public actual fun inetNtop(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetNtop")

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockInetPton")

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr<UInt>): Int =
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

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr<Sockaddr>, fromlen: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockRecvfrom")

public actual fun select(nfds: Int, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, exceptfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSelect")

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinsockSend")

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr<Sockaddr>, tolen: Int): Int =
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
