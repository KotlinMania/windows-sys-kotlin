@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32NetworkingWinsockNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockAcceptEx(slistensocket.toString(), sacceptsocket.toString(), lpoutputbuffer.rawAddress.toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), lpdwbytesreceived.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockEnumProtocolsA(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockEnumProtocolsW(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeAddrInfoEx(paddrinfoex: ConstPtr) {
    if (windowsWin32NetworkingWinsockNapiAddon != null) {
        windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(paddrinfoex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeAddrInfoExW(paddrinfoex: ConstPtr) {
    if (windowsWin32NetworkingWinsockNapiAddon != null) {
        windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(paddrinfoex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeAddrInfoW(paddrinfo: ConstPtr) {
    if (windowsWin32NetworkingWinsockNapiAddon != null) {
        windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(paddrinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr, localsockaddrlength: MutPtr, remotesockaddr: MutPtr, remotesockaddrlength: MutPtr) {
    if (windowsWin32NetworkingWinsockNapiAddon != null) {
        windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(lpoutputbuffer.rawAddress.toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), localsockaddr.rawAddress.toString(), localsockaddrlength.rawAddress.toString(), remotesockaddr.rawAddress.toString(), remotesockaddrlength.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(pname.rawAddress.toString(), pservicename.rawAddress.toString(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), hints.rawAddress.toString(), ppresult.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lpnamehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExCancel(lphandle: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(lphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr, hints: ConstPtr, ppresult: MutPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(pname.rawAddress.toString(), pservicename.rawAddress.toString(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), hints.rawAddress.toString(), ppresult.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr, ppresult: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddrInfoW(pnodename.rawAddress.toString(), pservicename.rawAddress.toString(), phints.rawAddress.toString(), ppresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddressByNameA(dwnamespace.toInt(), lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), lpiprotocols.rawAddress.toString(), dwresolution.toInt(), lpserviceasyncinfo.rawAddress.toString(), lpcsaddrbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpaliasbuffer.rawAddress.toString(), lpdwaliasbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr, lpservicename: Pcwstr, lpiprotocols: ConstPtr, dwresolution: UInt, lpserviceasyncinfo: ConstPtr, lpcsaddrbuffer: MutPtr, lpdwbufferlength: MutPtr, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetAddressByNameW(dwnamespace.toInt(), lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), lpiprotocols.rawAddress.toString(), dwresolution.toInt(), lpserviceasyncinfo.rawAddress.toString(), lpcsaddrbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpaliasbuffer.rawAddress.toString(), lpdwaliasbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetHostNameW(name.rawAddress.toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameByTypeA(lpservicetype: ConstPtr, lpservicename: Pstr, dwnamelength: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetNameByTypeA(lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), dwnamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameByTypeW(lpservicetype: ConstPtr, lpservicename: Pwstr, dwnamelength: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetNameByTypeW(lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), dwnamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameInfoW(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetNameInfoW(psockaddr.rawAddress.toString(), sockaddrlength, pnodebuffer.rawAddress.toString(), nodebuffersize.toInt(), pservicebuffer.rawAddress.toString(), servicebuffersize.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetServiceA(dwnamespace.toInt(), lpguid.rawAddress.toString(), lpservicename.rawAddress.toString(), dwproperties.toInt(), lpbuffer.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr, lpdwbuffersize: MutPtr, lpserviceasyncinfo: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetServiceW(dwnamespace.toInt(), lpguid.rawAddress.toString(), lpservicename.rawAddress.toString(), dwproperties.toInt(), lpbuffer.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetTypeByNameA(lpservicename.rawAddress.toString(), lpservicetype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetTypeByNameW(lpservicename.rawAddress.toString(), lpservicetype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtopW(family: Int, paddr: ConstPtr, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) ConstPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockInetNtopW(family, paddr.rawAddress.toString(), pstringbuf.rawAddress.toString(), stringbufsize.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockInetPtonW(family, pszaddrstring.rawAddress.toString(), paddrbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr, receivedentrycount: MutPtr): UInt =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(completionport.rawAddress.toString(), registrationcount.toInt(), registrationinfos.rawAddress.toString(), timeoutms.toInt(), completioncount.toInt(), completionportentries.rawAddress.toString(), receivedentrycount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetAddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(addr.rawAddress.toString(), s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetAddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(addr.rawAddress.toString(), s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(addr.rawAddress.toString(), s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringExA(address: ConstPtr, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(address.rawAddress.toString(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringExW(address: ConstPtr, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(address.rawAddress.toString(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(addr.rawAddress.toString(), s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(s.rawAddress.toString(), strict, terminator.rawAddress.toString(), addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr, port: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(addressstring.rawAddress.toString(), strict, address.rawAddress.toString(), port.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr, port: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(addressstring.rawAddress.toString(), strict, address.rawAddress.toString(), port.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr, addr: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(s.rawAddress.toString(), strict, terminator.rawAddress.toString(), addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringA(addr: ConstPtr, s: Pstr): Pstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(addr.rawAddress.toString(), s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringExA(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(address.rawAddress.toString(), scopeid.toInt(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringExW(address: ConstPtr, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(address.rawAddress.toString(), scopeid.toInt(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringW(addr: ConstPtr, s: Pwstr): Pwstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(addr.rawAddress.toString(), s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr, addr: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(addressstring.rawAddress.toString(), address.rawAddress.toString(), scopeid.rawAddress.toString(), port.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr, scopeid: MutPtr, port: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(addressstring.rawAddress.toString(), address.rawAddress.toString(), scopeid.rawAddress.toString(), port.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr, addr: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(pname.rawAddress.toString(), pservicename.rawAddress.toString(), paddresses.rawAddress.toString(), dwaddresscount.toInt(), lpblob.rawAddress.toString(), dwflags.toInt(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lpnamehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr, dwaddresscount: UInt, lpblob: ConstPtr, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr, timeout: ConstPtr, lpoverlapped: ConstPtr, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(pname.rawAddress.toString(), pservicename.rawAddress.toString(), paddresses.rawAddress.toString(), dwaddresscount.toInt(), lpblob.rawAddress.toString(), dwflags.toInt(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lpnamehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSetServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString(), lpdwstatusflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr, lpserviceasyncinfo: ConstPtr, lpdwstatusflags: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSetServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString(), lpdwstatusflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr, lptransmitbuffers: ConstPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockTransmitFile(hsocket.toString(), hfile.rawAddress.toString(), nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), lpoverlapped.rawAddress.toString(), lptransmitbuffers.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(s.toString(), lpoverlapped.rawAddress.toString(), dwerror.toInt(), cbtransferred.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAccept(s: Socket, addr: MutPtr, addrlen: MutPtr, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAccept(s.toString(), addr.rawAddress.toString(), addrlen.rawAddress.toString(), 0L.toString(), dwcallbackdata.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAddressToStringA(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(lpsaaddress.rawAddress.toString(), dwaddresslength.toInt(), lpprotocolinfo.rawAddress.toString(), lpszaddressstring.rawAddress.toString(), lpdwaddressstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAddressToStringW(lpsaaddress: ConstPtr, dwaddresslength: UInt, lpprotocolinfo: ConstPtr, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(lpsaaddress.rawAddress.toString(), dwaddresslength.toInt(), lpprotocolinfo.rawAddress.toString(), lpszaddressstring.rawAddress.toString(), lpdwaddressstringlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAdvertiseProvider(puuidproviderid: ConstPtr, pnspv2routine: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(puuidproviderid.rawAddress.toString(), pnspv2routine.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(hwnd.rawAddress.toString(), wmsg.toInt(), addr.rawAddress.toString(), len, type, buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(hwnd.rawAddress.toString(), wmsg.toInt(), name.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(hwnd.rawAddress.toString(), wmsg.toInt(), name.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(hwnd.rawAddress.toString(), wmsg.toInt(), number, buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(hwnd.rawAddress.toString(), wmsg.toInt(), name.rawAddress.toString(), proto.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(hwnd.rawAddress.toString(), wmsg.toInt(), port, proto.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(s.toString(), hwnd.rawAddress.toString(), wmsg.toInt(), levent) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(hasynctaskhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACancelBlockingCall(): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACleanup(): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSACleanup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnect(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAConnect(s.toString(), name.rawAddress.toString(), namelen, lpcallerdata.rawAddress.toString(), lpcalleedata.rawAddress.toString(), lpsqos.rawAddress.toString(), lpgqos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByList(s: Socket, socketaddress: ConstPtr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAConnectByList(s.toString(), socketaddress.rawAddress.toString(), localaddresslength.rawAddress.toString(), localaddress.rawAddress.toString(), remoteaddresslength.rawAddress.toString(), remoteaddress.rawAddress.toString(), timeout.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(s.toString(), nodename.rawAddress.toString(), servicename.rawAddress.toString(), localaddresslength.rawAddress.toString(), localaddress.rawAddress.toString(), remoteaddresslength.rawAddress.toString(), remoteaddress.rawAddress.toString(), timeout.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr, localaddress: MutPtr, remoteaddresslength: MutPtr, remoteaddress: MutPtr, timeout: ConstPtr, reserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(s.toString(), nodename.rawAddress.toString(), servicename.rawAddress.toString(), localaddresslength.rawAddress.toString(), localaddress.rawAddress.toString(), remoteaddresslength.rawAddress.toString(), remoteaddress.rawAddress.toString(), timeout.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACreateEvent(): Wsaevent =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSACreateEvent() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(socket.toString(), peeraddr.rawAddress.toString(), peeraddrlen.toInt(), overlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(s.toString(), dwprocessid.toInt(), lpprotocolinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(s.toString(), dwprocessid.toInt(), lpprotocolinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(s.toString(), heventobject.toString(), lpnetworkevents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumProtocolsA(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumProtocolsW(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAEventSelect(s.toString(), heventobject.toString(), lnetworkevents) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetLastError(): WsaError =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetLastError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr, lpcbtransfer: MutPtr, fwait: Bool, lpdwflags: MutPtr): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(s.toString(), lpoverlapped.rawAddress.toString(), lpcbtransfer.rawAddress.toString(), fwait, lpdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr, lpqos: MutPtr): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(s.toString(), lpqosname.rawAddress.toString(), lpqos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(lpproviderid.rawAddress.toString(), lpserviceclassid.rawAddress.toString(), lpdwbufsize.rawAddress.toString(), lpserviceclassinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr, lpserviceclassid: ConstPtr, lpdwbufsize: MutPtr, lpserviceclassinfo: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(lpproviderid.rawAddress.toString(), lpserviceclassid.rawAddress.toString(), lpdwbufsize.rawAddress.toString(), lpserviceclassinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(lpserviceclassid.rawAddress.toString(), lpszserviceclassname.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(lpserviceclassid.rawAddress.toString(), lpszserviceclassname.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAHtonl(s.toString(), hostlong.toInt(), lpnetlong.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAHtons(s.toString(), hostshort.toInt(), lpnetshort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr, peeraddrlen: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(socket.toString(), peeraddr.rawAddress.toString(), peeraddrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(lpserviceclassinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(lpserviceclassinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAIoctl(s.toString(), dwiocontrolcode.toInt(), lpvinbuffer.rawAddress.toString(), cbinbuffer.toInt(), lpvoutbuffer.rawAddress.toString(), cboutbuffer.toInt(), lpcbbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAIsBlocking(): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAIsBlocking() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAJoinLeaf(s: Socket, name: ConstPtr, namelen: Int, lpcallerdata: ConstPtr, lpcalleedata: MutPtr, lpsqos: ConstPtr, lpgqos: ConstPtr, dwflags: UInt): Socket =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(s.toString(), name.rawAddress.toString(), namelen, lpcallerdata.rawAddress.toString(), lpcalleedata.rawAddress.toString(), lpsqos.rawAddress.toString(), lpgqos.rawAddress.toString(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(lpqsrestrictions.rawAddress.toString(), dwcontrolflags.toInt(), lphlookup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr, dwcontrolflags: UInt, lphlookup: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(lpqsrestrictions.rawAddress.toString(), dwcontrolflags.toInt(), lphlookup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(hlookup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(hlookup.rawAddress.toString(), dwcontrolflags.toInt(), lpdwbufferlength.rawAddress.toString(), lpqsresults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr, lpqsresults: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(hlookup.rawAddress.toString(), dwcontrolflags.toInt(), lpdwbufferlength.rawAddress.toString(), lpqsresults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr, lpcompletion: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSANSPIoctl(hlookup.rawAddress.toString(), dwcontrolcode.toInt(), lpvinbuffer.rawAddress.toString(), cbinbuffer.toInt(), lpvoutbuffer.rawAddress.toString(), cboutbuffer.toInt(), lpcbbytesreturned.rawAddress.toString(), lpcompletion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSANtohl(s.toString(), netlong.toInt(), lphostlong.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSANtohs(s.toString(), netshort.toInt(), lphostshort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAPoll(fdarray: MutPtr, fds: UInt, timeout: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAPoll(fdarray.rawAddress.toString(), fds.toInt(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(hasynccall.rawAddress.toString(), iretcode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAProviderConfigChange(lpnotificationhandle: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(lpnotificationhandle.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr, securityqueryinfolen: MutPtr, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(socket.toString(), securityquerytemplate.rawAddress.toString(), securityquerytemplatelen.toInt(), securityqueryinfo.rawAddress.toString(), securityqueryinfolen.rawAddress.toString(), overlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecv(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSARecv(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytesrecvd.rawAddress.toString(), lpflags.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(s.toString(), lpinbounddisconnectdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSARecvEx(s.toString(), buf.rawAddress.toString(), len, flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr, lpflags: MutPtr, lpfrom: MutPtr, lpfromlen: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSARecvFrom(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytesrecvd.rawAddress.toString(), lpflags.rawAddress.toString(), lpfrom.rawAddress.toString(), lpfromlen.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARemoveServiceClass(lpserviceclassid: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(lpserviceclassid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARevertImpersonation(): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASend(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASend(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytessent.rawAddress.toString(), dwflags.toInt(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASendDisconnect(s.toString(), lpoutbounddisconnectdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendMsg(handle: Socket, lpmsg: ConstPtr, dwflags: UInt, lpnumberofbytessent: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASendMsg(handle.toString(), lpmsg.rawAddress.toString(), dwflags.toInt(), lpnumberofbytessent.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendTo(s: Socket, lpbuffers: ConstPtr, dwbuffercount: UInt, lpnumberofbytessent: MutPtr, dwflags: UInt, lpto: ConstPtr, itolen: Int, lpoverlapped: MutPtr, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASendTo(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytessent.rawAddress.toString(), dwflags.toInt(), lpto.rawAddress.toString(), itolen, lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetLastError(ierror: Int) {
    if (windowsWin32NetworkingWinsockNapiAddon != null) {
        windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSASetServiceA(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASetServiceA(lpqsreginfo.rawAddress.toString(), essoperation, dwcontrolflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetServiceW(lpqsreginfo: ConstPtr, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASetServiceW(lpqsreginfo.rawAddress.toString(), essoperation, dwcontrolflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr, peertargetnamelen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(socket.toString(), peertargetname.rawAddress.toString(), peertargetnamelen.toInt(), overlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr, securitysettingslen: UInt, overlapped: ConstPtr, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(socket.toString(), securitysettings.rawAddress.toString(), securitysettingslen.toInt(), overlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASocketA(af, type, protocol, lpprotocolinfo.rawAddress.toString(), g.toInt(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr, g: UInt, dwflags: UInt): Socket =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSASocketW(af, type, protocol, lpprotocolinfo.rawAddress.toString(), g.toInt(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAStartup(wversionrequested.toInt(), lpwsadata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(addressstring.rawAddress.toString(), addressfamily, lpprotocolinfo.rawAddress.toString(), lpaddress.rawAddress.toString(), lpaddresslength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr, lpaddress: MutPtr, lpaddresslength: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(addressstring.rawAddress.toString(), addressfamily, lpprotocolinfo.rawAddress.toString(), lpaddress.rawAddress.toString(), lpaddresslength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(puuidproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAUnhookBlockingHook(): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(cevents.toInt(), lphevents.rawAddress.toString(), fwaitall, dwtimeout.toInt(), falertable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCDeinstallProvider(lpproviderid: ConstPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(lpproviderid.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCDeinstallProvider32(lpproviderid: ConstPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(lpproviderid.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnableNSProvider(lpproviderid: ConstPtr, fenable: Bool): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(lpproviderid.rawAddress.toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnableNSProvider32(lpproviderid: ConstPtr, fenable: Bool): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(lpproviderid.rawAddress.toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr, lpnspbuffer: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumProtocols(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumProtocols32(lpiprotocols: ConstPtr, lpprotocolbuffer: MutPtr, lpdwbufferlength: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(path.rawAddress.toString(), pathlength.toInt(), extra.rawAddress.toString(), extralength.toInt(), ppermittedlspcategories.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.rawAddress.toString(), flags.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: MutPtr, infosize: MutPtr, flags: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.rawAddress.toString(), flags.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderPath(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpproviderdllpathlen.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderPath32(lpproviderid: ConstPtr, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpproviderdllpathlen.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString(), lpproviderspecific.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr, lpproviderspecific: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString(), lpproviderspecific.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCInstallProvider(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscinstallProvider6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpszproviderdllpath32.rawAddress.toString(), lpszlspname.rawAddress.toString(), dwserviceflags.toInt(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lpdwcatalogentryid.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(path.rawAddress.toString(), pathlength.toInt(), extra.rawAddress.toString(), extralength.toInt(), permittedlspcategories.toInt(), pprevpermlspcat.rawAddress.toString(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetProviderInfo(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.toString(), flags.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetProviderInfo32(lpproviderid: ConstPtr, infotype: WscProviderInfoType, info: ConstPtr, infosize: ULong, flags: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.toString(), flags.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUnInstallNameSpace(lpproviderid: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(lpproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(lpproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUpdateProvider(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUpdateProvider32(lpproviderid: ConstPtr, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr, dwnumberofentries: UInt, lperrno: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(lpproviderid.rawAddress.toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(lpproviderid.rawAddress.toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(lpwdcatalogentryid.rawAddress.toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(lpwdcatalogentryid.rawAddress.toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsafdisSet(fd: Socket, param1: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockWsafdisSet(fd.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: Socket, addr: MutPtr, addrlen: MutPtr): Socket =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockAccept(s.toString(), addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(s: Socket, name: ConstPtr, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockBind(s.toString(), name.rawAddress.toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closesocket(s: Socket): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockClosesocket(s.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: Socket, name: ConstPtr, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockConnect(s.toString(), name.rawAddress.toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(paddrinfo: ConstPtr) {
    if (windowsWin32NetworkingWinsockNapiAddon != null) {
        windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockFreeaddrinfo(paddrinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr, ppresult: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetaddrinfo(pnodename.rawAddress.toString(), pservicename.rawAddress.toString(), phints.rawAddress.toString(), ppresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGethostbyaddr(addr.rawAddress.toString(), len, type) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostbyname(name: Pcstr): MutPtr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGethostbyname(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGethostname(name.rawAddress.toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(psockaddr: ConstPtr, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetnameinfo(psockaddr.rawAddress.toString(), sockaddrlength, pnodebuffer.rawAddress.toString(), nodebuffersize.toInt(), pservicebuffer.rawAddress.toString(), servicebuffersize.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: Socket, name: MutPtr, namelen: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetpeername(s.toString(), name.rawAddress.toString(), namelen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: Pcstr): MutPtr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetprotobyname(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(number: Int): MutPtr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetprotobynumber(number) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyport(port: Int, proto: Pcstr): MutPtr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) MutPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetservbyport(port, proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(s: Socket, name: MutPtr, namelen: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetsockname(s.toString(), name.rawAddress.toString(), namelen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockGetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htonl(hostlong: UInt): UInt =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockHtonl(hostlong.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htons(hostshort: UShort): UShort =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockHtons(hostshort.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetAddr(cp: Pcstr): UInt =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockInetAddr(cp.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtoa(input: InAddr): Pstr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtop(family: Int, paddr: ConstPtr, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    if (windowsWin32NetworkingWinsockNapiAddon != null) ConstPtr((windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockInetNtop(family, paddr.rawAddress.toString(), pstringbuf.rawAddress.toString(), stringbufsize.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockInetPton(family, pszaddrstring.rawAddress.toString(), paddrbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockIoctlsocket(s.toString(), cmd, argp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(s: Socket, backlog: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockListen(s.toString(), backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntohl(netlong: UInt): UInt =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockNtohl(netlong.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntohs(netshort: UShort): UShort =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockNtohs(netshort.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRecv(s.toString(), buf.rawAddress.toString(), len, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr, fromlen: MutPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockRecvfrom(s.toString(), buf.rawAddress.toString(), len, flags, from.rawAddress.toString(), fromlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: Int, readfds: MutPtr, writefds: MutPtr, exceptfds: MutPtr, timeout: ConstPtr): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), exceptfds.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSend(s.toString(), buf.rawAddress.toString(), len, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr, tolen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSendto(s.toString(), buf.rawAddress.toString(), len, flags, to.rawAddress.toString(), tolen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockShutdown(s.toString(), how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    if (windowsWin32NetworkingWinsockNapiAddon != null) (windowsWin32NetworkingWinsockNapiAddon.windowssysWindowsWin32NetworkingWinsockSocket(af, type, protocol) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
