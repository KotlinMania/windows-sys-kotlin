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

private val _windowsWin32NetworkingWinsockNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_acceptEx(slistensocket.toString(), sacceptsocket.toString(), (lpoutputbuffer?.value ?: 0L).toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), (lpdwbytesreceived?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_enumProtocolsA((lpiprotocols?.value ?: 0L).toString(), (lpprotocolbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_enumProtocolsW((lpiprotocols?.value ?: 0L).toString(), (lpprotocolbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeAddrInfoEx(paddrinfoex: COpaquePointer?) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_freeAddrInfoEx((paddrinfoex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeAddrInfoExW(paddrinfoex: COpaquePointer?) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_freeAddrInfoExW((paddrinfoex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeAddrInfoW(paddrinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_freeAddrInfoW((paddrinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: COpaquePointer?, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: COpaquePointer?, localsockaddrlength: COpaquePointer?, remotesockaddr: COpaquePointer?, remotesockaddrlength: COpaquePointer?) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAcceptExSockaddrs((lpoutputbuffer?.value ?: 0L).toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), (localsockaddr?.value ?: 0L).toString(), (localsockaddrlength?.value ?: 0L).toString(), (remotesockaddr?.value ?: 0L).toString(), (remotesockaddrlength?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddrInfoExA((pname?.value ?: 0L).toString(), (pservicename?.value ?: 0L).toString(), dwnamespace.toInt(), (lpnspid?.value ?: 0L).toString(), (hints?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), (lpnamehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExCancel(lphandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddrInfoExCancel((lphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddrInfoExOverlappedResult((lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: COpaquePointer?, hints: COpaquePointer?, ppresult: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddrInfoExW((pname?.value ?: 0L).toString(), (pservicename?.value ?: 0L).toString(), dwnamespace.toInt(), (lpnspid?.value ?: 0L).toString(), (hints?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), (lphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddrInfoW((pnodename?.value ?: 0L).toString(), (pservicename?.value ?: 0L).toString(), (phints?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pstr, lpdwaliasbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddressByNameA(dwnamespace.toInt(), (lpservicetype?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpiprotocols?.value ?: 0L).toString(), dwresolution.toInt(), (lpserviceasyncinfo?.value ?: 0L).toString(), (lpcsaddrbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lpaliasbuffer?.value ?: 0L).toString(), (lpdwaliasbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: COpaquePointer?, lpservicename: Pcwstr, lpiprotocols: COpaquePointer?, dwresolution: UInt, lpserviceasyncinfo: COpaquePointer?, lpcsaddrbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getAddressByNameW(dwnamespace.toInt(), (lpservicetype?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpiprotocols?.value ?: 0L).toString(), dwresolution.toInt(), (lpserviceasyncinfo?.value ?: 0L).toString(), (lpcsaddrbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lpaliasbuffer?.value ?: 0L).toString(), (lpdwaliasbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getHostNameW((name?.value ?: 0L).toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameByTypeA(lpservicetype: COpaquePointer?, lpservicename: Pstr, dwnamelength: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getNameByTypeA((lpservicetype?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwnamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameByTypeW(lpservicetype: COpaquePointer?, lpservicename: Pwstr, dwnamelength: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getNameByTypeW((lpservicetype?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwnamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameInfoW(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getNameInfoW((psockaddr?.value ?: 0L).toString(), sockaddrlength, (pnodebuffer?.value ?: 0L).toString(), nodebuffersize.toInt(), (pservicebuffer?.value ?: 0L).toString(), servicebuffersize.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceA(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getServiceA(dwnamespace.toInt(), (lpguid?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwproperties.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbuffersize?.value ?: 0L).toString(), (lpserviceasyncinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceW(dwnamespace: UInt, lpguid: COpaquePointer?, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getServiceW(dwnamespace.toInt(), (lpguid?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwproperties.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbuffersize?.value ?: 0L).toString(), (lpserviceasyncinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getTypeByNameA((lpservicename?.value ?: 0L).toString(), (lpservicetype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getTypeByNameW((lpservicename?.value ?: 0L).toString(), (lpservicetype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtopW(family: Int, paddr: COpaquePointer?, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inetNtopW(family, (paddr?.value ?: 0L).toString(), (pstringbuf?.value ?: 0L).toString(), stringbufsize.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inetPtonW(family, (pszaddrstring?.value ?: 0L).toString(), (paddrbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: COpaquePointer?, timeoutms: UInt, completioncount: UInt, completionportentries: COpaquePointer?, receivedentrycount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_processSocketNotifications((completionport?.value ?: 0L).toString(), registrationcount.toInt(), (registrationinfos?.value ?: 0L).toString(), timeoutms.toInt(), completioncount.toInt(), (completionportentries?.value ?: 0L).toString(), (receivedentrycount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetAddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringA((addr?.value ?: 0L).toString(), (s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetAddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlEthernetAddressToStringW((addr?.value ?: 0L).toString(), (s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressA((s?.value ?: 0L).toString(), (terminator?.value ?: 0L).toString(), (addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlEthernetStringToAddressW((s?.value ?: 0L).toString(), (terminator?.value ?: 0L).toString(), (addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringA((addr?.value ?: 0L).toString(), (s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringExA(address: COpaquePointer?, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExA((address?.value ?: 0L).toString(), port.toInt(), (addressstring?.value ?: 0L).toString(), (addressstringlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringExW(address: COpaquePointer?, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringExW((address?.value ?: 0L).toString(), port.toInt(), (addressstring?.value ?: 0L).toString(), (addressstringlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4AddressToStringW((addr?.value ?: 0L).toString(), (s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressA((s?.value ?: 0L).toString(), strict, (terminator?.value ?: 0L).toString(), (addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExA((addressstring?.value ?: 0L).toString(), strict, (address?.value ?: 0L).toString(), (port?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: COpaquePointer?, port: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressExW((addressstring?.value ?: 0L).toString(), strict, (address?.value ?: 0L).toString(), (port?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv4StringToAddressW((s?.value ?: 0L).toString(), strict, (terminator?.value ?: 0L).toString(), (addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringA(addr: COpaquePointer?, s: Pstr): Pstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringA((addr?.value ?: 0L).toString(), (s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringExA(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExA((address?.value ?: 0L).toString(), scopeid.toInt(), port.toInt(), (addressstring?.value ?: 0L).toString(), (addressstringlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringExW(address: COpaquePointer?, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringExW((address?.value ?: 0L).toString(), scopeid.toInt(), port.toInt(), (addressstring?.value ?: 0L).toString(), (addressstringlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringW(addr: COpaquePointer?, s: Pwstr): Pwstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6AddressToStringW((addr?.value ?: 0L).toString(), (s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressA((s?.value ?: 0L).toString(), (terminator?.value ?: 0L).toString(), (addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExA((addressstring?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), (scopeid?.value ?: 0L).toString(), (port?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: COpaquePointer?, scopeid: COpaquePointer?, port: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressExW((addressstring?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), (scopeid?.value ?: 0L).toString(), (port?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: COpaquePointer?, addr: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_rtlIpv6StringToAddressW((s?.value ?: 0L).toString(), (terminator?.value ?: 0L).toString(), (addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setAddrInfoExA((pname?.value ?: 0L).toString(), (pservicename?.value ?: 0L).toString(), (paddresses?.value ?: 0L).toString(), dwaddresscount.toInt(), (lpblob?.value ?: 0L).toString(), dwflags.toInt(), dwnamespace.toInt(), (lpnspid?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), (lpnamehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: COpaquePointer?, dwaddresscount: UInt, lpblob: COpaquePointer?, dwflags: UInt, dwnamespace: UInt, lpnspid: COpaquePointer?, timeout: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setAddrInfoExW((pname?.value ?: 0L).toString(), (pservicename?.value ?: 0L).toString(), (paddresses?.value ?: 0L).toString(), dwaddresscount.toInt(), (lpblob?.value ?: 0L).toString(), dwflags.toInt(), dwnamespace.toInt(), (lpnspid?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), (lpnamehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), (lpserviceinfo?.value ?: 0L).toString(), (lpserviceasyncinfo?.value ?: 0L).toString(), (lpdwstatusflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: COpaquePointer?, lpserviceasyncinfo: COpaquePointer?, lpdwstatusflags: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), (lpserviceinfo?.value ?: 0L).toString(), (lpserviceasyncinfo?.value ?: 0L).toString(), (lpdwstatusflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setSocketMediaStreamingMode(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: COpaquePointer?, lptransmitbuffers: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_transmitFile(hsocket.toString(), (hfile?.value ?: 0L).toString(), nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), (lpoverlapped?.value ?: 0L).toString(), (lptransmitbuffers?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: COpaquePointer?, dwerror: UInt, cbtransferred: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wPUCompleteOverlappedRequest(s.toString(), (lpoverlapped?.value ?: 0L).toString(), dwerror.toInt(), cbtransferred.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAccept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAccept(s.toString(), (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), 0L.toString(), dwcallbackdata.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAddressToStringA(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pstr, lpdwaddressstringlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAddressToStringA((lpsaaddress?.value ?: 0L).toString(), dwaddresslength.toInt(), (lpprotocolinfo?.value ?: 0L).toString(), (lpszaddressstring?.value ?: 0L).toString(), (lpdwaddressstringlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAddressToStringW(lpsaaddress: COpaquePointer?, dwaddresslength: UInt, lpprotocolinfo: COpaquePointer?, lpszaddressstring: Pwstr, lpdwaddressstringlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAddressToStringW((lpsaaddress?.value ?: 0L).toString(), dwaddresslength.toInt(), (lpprotocolinfo?.value ?: 0L).toString(), (lpszaddressstring?.value ?: 0L).toString(), (lpdwaddressstringlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAdvertiseProvider(puuidproviderid: COpaquePointer?, pnspv2routine: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAdvertiseProvider((puuidproviderid?.value ?: 0L).toString(), (pnspv2routine?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByAddr((hwnd?.value ?: 0L).toString(), wmsg.toInt(), (addr?.value ?: 0L).toString(), len, type, (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncGetHostByName((hwnd?.value ?: 0L).toString(), wmsg.toInt(), (name?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByName((hwnd?.value ?: 0L).toString(), wmsg.toInt(), (name?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncGetProtoByNumber((hwnd?.value ?: 0L).toString(), wmsg.toInt(), number, (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncGetServByName((hwnd?.value ?: 0L).toString(), wmsg.toInt(), (name?.value ?: 0L).toString(), (proto?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncGetServByPort((hwnd?.value ?: 0L).toString(), wmsg.toInt(), port, (proto?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAAsyncSelect(s.toString(), (hwnd?.value ?: 0L).toString(), wmsg.toInt(), levent) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSACancelAsyncRequest((hasynctaskhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACancelBlockingCall(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSACancelBlockingCall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACleanup(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSACleanup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSACloseEvent(hevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnect(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAConnect(s.toString(), (name?.value ?: 0L).toString(), namelen, (lpcallerdata?.value ?: 0L).toString(), (lpcalleedata?.value ?: 0L).toString(), (lpsqos?.value ?: 0L).toString(), (lpgqos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByList(s: Socket, socketaddress: COpaquePointer?, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAConnectByList(s.toString(), (socketaddress?.value ?: 0L).toString(), (localaddresslength?.value ?: 0L).toString(), (localaddress?.value ?: 0L).toString(), (remoteaddresslength?.value ?: 0L).toString(), (remoteaddress?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAConnectByNameA(s.toString(), (nodename?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (localaddresslength?.value ?: 0L).toString(), (localaddress?.value ?: 0L).toString(), (remoteaddresslength?.value ?: 0L).toString(), (remoteaddress?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: COpaquePointer?, localaddress: COpaquePointer?, remoteaddresslength: COpaquePointer?, remoteaddress: COpaquePointer?, timeout: COpaquePointer?, reserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAConnectByNameW(s.toString(), (nodename?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (localaddresslength?.value ?: 0L).toString(), (localaddress?.value ?: 0L).toString(), (remoteaddresslength?.value ?: 0L).toString(), (remoteaddress?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACreateEvent(): Wsaevent =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSACreateEvent() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSADeleteSocketPeerTargetName(socket.toString(), (peeraddr?.value ?: 0L).toString(), peeraddrlen.toInt(), (overlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSADuplicateSocketA(s.toString(), dwprocessid.toInt(), (lpprotocolinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSADuplicateSocketW(s.toString(), dwprocessid.toInt(), (lpprotocolinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersA((lpdwbufferlength?.value ?: 0L).toString(), (lpnspbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExA((lpdwbufferlength?.value ?: 0L).toString(), (lpnspbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersExW((lpdwbufferlength?.value ?: 0L).toString(), (lpnspbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumNameSpaceProvidersW((lpdwbufferlength?.value ?: 0L).toString(), (lpnspbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumNetworkEvents(s.toString(), heventobject.toString(), (lpnetworkevents?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumProtocolsA(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumProtocolsA((lpiprotocols?.value ?: 0L).toString(), (lpprotocolbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumProtocolsW(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEnumProtocolsW((lpiprotocols?.value ?: 0L).toString(), (lpprotocolbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAEventSelect(s.toString(), heventobject.toString(), lnetworkevents) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetLastError(): WsaError =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetLastError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: COpaquePointer?, lpcbtransfer: COpaquePointer?, fwait: Bool, lpdwflags: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetOverlappedResult(s.toString(), (lpoverlapped?.value ?: 0L).toString(), (lpcbtransfer?.value ?: 0L).toString(), fwait, (lpdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetQOSByName(s: Socket, lpqosname: COpaquePointer?, lpqos: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetQOSByName(s.toString(), (lpqosname?.value ?: 0L).toString(), (lpqos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassInfoA(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoA((lpproviderid?.value ?: 0L).toString(), (lpserviceclassid?.value ?: 0L).toString(), (lpdwbufsize?.value ?: 0L).toString(), (lpserviceclassinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassInfoW(lpproviderid: COpaquePointer?, lpserviceclassid: COpaquePointer?, lpdwbufsize: COpaquePointer?, lpserviceclassinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetServiceClassInfoW((lpproviderid?.value ?: 0L).toString(), (lpserviceclassid?.value ?: 0L).toString(), (lpdwbufsize?.value ?: 0L).toString(), (lpserviceclassinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pstr, lpdwbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdA((lpserviceclassid?.value ?: 0L).toString(), (lpszserviceclassname?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: COpaquePointer?, lpszserviceclassname: Pwstr, lpdwbufferlength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAGetServiceClassNameByClassIdW((lpserviceclassid?.value ?: 0L).toString(), (lpszserviceclassname?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAHtonl(s.toString(), hostlong.toInt(), (lpnetlong?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAHtons(s.toString(), hostshort.toInt(), (lpnetshort?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: COpaquePointer?, peeraddrlen: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAImpersonateSocketPeer(socket.toString(), (peeraddr?.value ?: 0L).toString(), peeraddrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAInstallServiceClassA((lpserviceclassinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAInstallServiceClassW((lpserviceclassinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAIoctl(s.toString(), dwiocontrolcode.toInt(), (lpvinbuffer?.value ?: 0L).toString(), cbinbuffer.toInt(), (lpvoutbuffer?.value ?: 0L).toString(), cboutbuffer.toInt(), (lpcbbytesreturned?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAIsBlocking(): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAIsBlocking() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAJoinLeaf(s: Socket, name: COpaquePointer?, namelen: Int, lpcallerdata: COpaquePointer?, lpcalleedata: COpaquePointer?, lpsqos: COpaquePointer?, lpgqos: COpaquePointer?, dwflags: UInt): Socket =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAJoinLeaf(s.toString(), (name?.value ?: 0L).toString(), namelen, (lpcallerdata?.value ?: 0L).toString(), (lpcalleedata?.value ?: 0L).toString(), (lpsqos?.value ?: 0L).toString(), (lpgqos?.value ?: 0L).toString(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceBeginA(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSALookupServiceBeginA((lpqsrestrictions?.value ?: 0L).toString(), dwcontrolflags.toInt(), (lphlookup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceBeginW(lpqsrestrictions: COpaquePointer?, dwcontrolflags: UInt, lphlookup: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSALookupServiceBeginW((lpqsrestrictions?.value ?: 0L).toString(), dwcontrolflags.toInt(), (lphlookup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSALookupServiceEnd((hlookup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSALookupServiceNextA((hlookup?.value ?: 0L).toString(), dwcontrolflags.toInt(), (lpdwbufferlength?.value ?: 0L).toString(), (lpqsresults?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: COpaquePointer?, lpqsresults: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSALookupServiceNextW((hlookup?.value ?: 0L).toString(), dwcontrolflags.toInt(), (lpdwbufferlength?.value ?: 0L).toString(), (lpqsresults?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?, lpcompletion: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSANSPIoctl((hlookup?.value ?: 0L).toString(), dwcontrolcode.toInt(), (lpvinbuffer?.value ?: 0L).toString(), cbinbuffer.toInt(), (lpvoutbuffer?.value ?: 0L).toString(), cboutbuffer.toInt(), (lpcbbytesreturned?.value ?: 0L).toString(), (lpcompletion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSANtohl(s.toString(), netlong.toInt(), (lphostlong?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSANtohs(s.toString(), netshort.toInt(), (lphostshort?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAPoll(fdarray: COpaquePointer?, fds: UInt, timeout: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAPoll((fdarray?.value ?: 0L).toString(), fds.toInt(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAProviderCompleteAsyncCall((hasynccall?.value ?: 0L).toString(), iretcode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAProviderConfigChange(lpnotificationhandle: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAProviderConfigChange((lpnotificationhandle?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: COpaquePointer?, securityquerytemplatelen: UInt, securityqueryinfo: COpaquePointer?, securityqueryinfolen: COpaquePointer?, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAQuerySocketSecurity(socket.toString(), (securityquerytemplate?.value ?: 0L).toString(), securityquerytemplatelen.toInt(), (securityqueryinfo?.value ?: 0L).toString(), (securityqueryinfolen?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecv(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSARecv(s.toString(), (lpbuffers?.value ?: 0L).toString(), dwbuffercount.toInt(), (lpnumberofbytesrecvd?.value ?: 0L).toString(), (lpflags?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSARecvDisconnect(s.toString(), (lpinbounddisconnectdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSARecvEx(s.toString(), (buf?.value ?: 0L).toString(), len, (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvFrom(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytesrecvd: COpaquePointer?, lpflags: COpaquePointer?, lpfrom: COpaquePointer?, lpfromlen: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSARecvFrom(s.toString(), (lpbuffers?.value ?: 0L).toString(), dwbuffercount.toInt(), (lpnumberofbytesrecvd?.value ?: 0L).toString(), (lpflags?.value ?: 0L).toString(), (lpfrom?.value ?: 0L).toString(), (lpfromlen?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARemoveServiceClass(lpserviceclassid: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSARemoveServiceClass((lpserviceclassid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAResetEvent(hevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARevertImpersonation(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSARevertImpersonation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASend(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASend(s.toString(), (lpbuffers?.value ?: 0L).toString(), dwbuffercount.toInt(), (lpnumberofbytessent?.value ?: 0L).toString(), dwflags.toInt(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASendDisconnect(s.toString(), (lpoutbounddisconnectdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendMsg(handle: Socket, lpmsg: COpaquePointer?, dwflags: UInt, lpnumberofbytessent: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASendMsg(handle.toString(), (lpmsg?.value ?: 0L).toString(), dwflags.toInt(), (lpnumberofbytessent?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendTo(s: Socket, lpbuffers: COpaquePointer?, dwbuffercount: UInt, lpnumberofbytessent: COpaquePointer?, dwflags: UInt, lpto: COpaquePointer?, itolen: Int, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASendTo(s.toString(), (lpbuffers?.value ?: 0L).toString(), dwbuffercount.toInt(), (lpnumberofbytessent?.value ?: 0L).toString(), dwflags.toInt(), (lpto?.value ?: 0L).toString(), itolen, (lpoverlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASetEvent(hevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetLastError(ierror: Int) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASetLastError(ierror)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSASetServiceA(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASetServiceA((lpqsreginfo?.value ?: 0L).toString(), essoperation, dwcontrolflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetServiceW(lpqsreginfo: COpaquePointer?, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASetServiceW((lpqsreginfo?.value ?: 0L).toString(), essoperation, dwcontrolflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: COpaquePointer?, peertargetnamelen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASetSocketPeerTargetName(socket.toString(), (peertargetname?.value ?: 0L).toString(), peertargetnamelen.toInt(), (overlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: COpaquePointer?, securitysettingslen: UInt, overlapped: COpaquePointer?, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASetSocketSecurity(socket.toString(), (securitysettings?.value ?: 0L).toString(), securitysettingslen.toInt(), (overlapped?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASocketA(af, type, protocol, (lpprotocolinfo?.value ?: 0L).toString(), g.toInt(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: COpaquePointer?, g: UInt, dwflags: UInt): Socket =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSASocketW(af, type, protocol, (lpprotocolinfo?.value ?: 0L).toString(), g.toInt(), dwflags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAStartup(wversionrequested.toInt(), (lpwsadata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAStringToAddressA((addressstring?.value ?: 0L).toString(), addressfamily, (lpprotocolinfo?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpaddresslength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: COpaquePointer?, lpaddress: COpaquePointer?, lpaddresslength: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAStringToAddressW((addressstring?.value ?: 0L).toString(), addressfamily, (lpprotocolinfo?.value ?: 0L).toString(), (lpaddress?.value ?: 0L).toString(), (lpaddresslength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAUnadvertiseProvider(puuidproviderid: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAUnadvertiseProvider((puuidproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAUnhookBlockingHook(): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAUnhookBlockingHook() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: COpaquePointer?, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSAWaitForMultipleEvents(cevents.toInt(), (lphevents?.value ?: 0L).toString(), fwaitall, dwtimeout.toInt(), falertable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCDeinstallProvider(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCDeinstallProvider((lpproviderid?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCDeinstallProvider32(lpproviderid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCDeinstallProvider32((lpproviderid?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnableNSProvider(lpproviderid: COpaquePointer?, fenable: Bool): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCEnableNSProvider((lpproviderid?.value ?: 0L).toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnableNSProvider32(lpproviderid: COpaquePointer?, fenable: Bool): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCEnableNSProvider32((lpproviderid?.value ?: 0L).toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProviders32((lpdwbufferlength?.value ?: 0L).toString(), (lpnspbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: COpaquePointer?, lpnspbuffer: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCEnumNameSpaceProvidersEx32((lpdwbufferlength?.value ?: 0L).toString(), (lpnspbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumProtocols(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCEnumProtocols((lpiprotocols?.value ?: 0L).toString(), (lpprotocolbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumProtocols32(lpiprotocols: COpaquePointer?, lpprotocolbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCEnumProtocols32((lpiprotocols?.value ?: 0L).toString(), (lpprotocolbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCGetApplicationCategory((path?.value ?: 0L).toString(), pathlength.toInt(), (extra?.value ?: 0L).toString(), extralength.toInt(), (ppermittedlspcategories?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCGetProviderInfo((lpproviderid?.value ?: 0L).toString(), infotype, (info?.value ?: 0L).toString(), (infosize?.value ?: 0L).toString(), flags.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: COpaquePointer?, flags: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCGetProviderInfo32((lpproviderid?.value ?: 0L).toString(), infotype, (info?.value ?: 0L).toString(), (infosize?.value ?: 0L).toString(), flags.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderPath(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCGetProviderPath((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpproviderdllpathlen?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderPath32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCGetProviderPath32((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpproviderdllpathlen?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCInstallNameSpace((lpszidentifier?.value ?: 0L).toString(), (lpszpathname?.value ?: 0L).toString(), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCInstallNameSpace32((lpszidentifier?.value ?: 0L).toString(), (lpszpathname?.value ?: 0L).toString(), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx((lpszidentifier?.value ?: 0L).toString(), (lpszpathname?.value ?: 0L).toString(), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L).toString(), (lpproviderspecific?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: COpaquePointer?, lpproviderspecific: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCInstallNameSpaceEx32((lpszidentifier?.value ?: 0L).toString(), (lpszpathname?.value ?: 0L).toString(), dwnamespace.toInt(), dwversion.toInt(), (lpproviderid?.value ?: 0L).toString(), (lpproviderspecific?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCInstallProvider((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpprotocolinfolist?.value ?: 0L).toString(), dwnumberofentries.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscinstallProvider6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wscinstallProvider6432((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpprotocolinfolist?.value ?: 0L).toString(), dwnumberofentries.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscinstallProviderAndChains6432(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lpdwcatalogentryid: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wscinstallProviderAndChains6432((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpszproviderdllpath32?.value ?: 0L).toString(), (lpszlspname?.value ?: 0L).toString(), dwserviceflags.toInt(), (lpprotocolinfolist?.value ?: 0L).toString(), dwnumberofentries.toInt(), (lpdwcatalogentryid?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: COpaquePointer?, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCSetApplicationCategory((path?.value ?: 0L).toString(), pathlength.toInt(), (extra?.value ?: 0L).toString(), extralength.toInt(), permittedlspcategories.toInt(), (pprevpermlspcat?.value ?: 0L).toString(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetProviderInfo(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCSetProviderInfo((lpproviderid?.value ?: 0L).toString(), infotype, (info?.value ?: 0L).toString(), infosize.toString(), flags.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetProviderInfo32(lpproviderid: COpaquePointer?, infotype: WscProviderInfoType, info: COpaquePointer?, infosize: ULong, flags: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCSetProviderInfo32((lpproviderid?.value ?: 0L).toString(), infotype, (info?.value ?: 0L).toString(), infosize.toString(), flags.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUnInstallNameSpace(lpproviderid: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace((lpproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUnInstallNameSpace32(lpproviderid: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCUnInstallNameSpace32((lpproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUpdateProvider(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCUpdateProvider((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpprotocolinfolist?.value ?: 0L).toString(), dwnumberofentries.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUpdateProvider32(lpproviderid: COpaquePointer?, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: COpaquePointer?, dwnumberofentries: UInt, lperrno: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCUpdateProvider32((lpproviderid?.value ?: 0L).toString(), (lpszproviderdllpath?.value ?: 0L).toString(), (lpprotocolinfolist?.value ?: 0L).toString(), dwnumberofentries.toInt(), (lperrno?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteNameSpaceOrder(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder((lpproviderid?.value ?: 0L).toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: COpaquePointer?, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCWriteNameSpaceOrder32((lpproviderid?.value ?: 0L).toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder((lpwdcatalogentryid?.value ?: 0L).toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: COpaquePointer?, dwnumberofentries: UInt): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wSCWriteProviderOrder32((lpwdcatalogentryid?.value ?: 0L).toString(), dwnumberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsafdisSet(fd: Socket, param1: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_wsafdisSet(fd.toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_accept(s.toString(), (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_bind(s.toString(), (name?.value ?: 0L).toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closesocket(s: Socket): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_closesocket(s.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_connect(s.toString(), (name?.value ?: 0L).toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(paddrinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingWinsockNapiAddon != null) {
        _windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_freeaddrinfo((paddrinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: COpaquePointer?, ppresult: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getaddrinfo((pnodename?.value ?: 0L).toString(), (pservicename?.value ?: 0L).toString(), (phints?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): COpaquePointer? =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_gethostbyaddr((addr?.value ?: 0L).toString(), len, type) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostbyname(name: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_gethostbyname((name?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_gethostname((name?.value ?: 0L).toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(psockaddr: COpaquePointer?, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getnameinfo((psockaddr?.value ?: 0L).toString(), sockaddrlength, (pnodebuffer?.value ?: 0L).toString(), nodebuffersize.toInt(), (pservicebuffer?.value ?: 0L).toString(), servicebuffersize.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getpeername(s.toString(), (name?.value ?: 0L).toString(), (namelen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getprotobyname((name?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(number: Int): COpaquePointer? =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getprotobynumber(number) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: Pcstr, proto: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getservbyname((name?.value ?: 0L).toString(), (proto?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyport(port: Int, proto: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getservbyport(port, (proto?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(s: Socket, name: COpaquePointer?, namelen: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getsockname(s.toString(), (name?.value ?: 0L).toString(), (namelen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_getsockopt(s.toString(), level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htonl(hostlong: UInt): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_htonl(hostlong.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htons(hostshort: UShort): UShort =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_htons(hostshort.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetAddr(cp: Pcstr): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inetAddr((cp?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtoa(input: InAddr): Pstr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtop(family: Int, paddr: COpaquePointer?, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inetNtop(family, (paddr?.value ?: 0L).toString(), (pstringbuf?.value ?: 0L).toString(), stringbufsize.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_inetPton(family, (pszaddrstring?.value ?: 0L).toString(), (paddrbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ioctlsocket(s.toString(), cmd, (argp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(s: Socket, backlog: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_listen(s.toString(), backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntohl(netlong: UInt): UInt =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ntohl(netlong.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntohs(netshort: UShort): UShort =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_ntohs(netshort.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_recv(s.toString(), (buf?.value ?: 0L).toString(), len, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: COpaquePointer?, fromlen: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_recvfrom(s.toString(), (buf?.value ?: 0L).toString(), len, flags, (from?.value ?: 0L).toString(), (fromlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: Int, readfds: COpaquePointer?, writefds: COpaquePointer?, exceptfds: COpaquePointer?, timeout: COpaquePointer?): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (exceptfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_send(s.toString(), (buf?.value ?: 0L).toString(), len, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: COpaquePointer?, tolen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_sendto(s.toString(), (buf?.value ?: 0L).toString(), len, flags, (to?.value ?: 0L).toString(), tolen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_setsockopt(s.toString(), level, optname, (optval?.value ?: 0L).toString(), optlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_shutdown(s.toString(), how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    if (_windowsWin32NetworkingWinsockNapiAddon != null) (_windowsWin32NetworkingWinsockNapiAddon.windowssys_windows_win32_networking_winsock_socket(af, type, protocol) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
