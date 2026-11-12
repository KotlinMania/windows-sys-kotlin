@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingWinsockNapiAddon(): Boolean

private val windowsWin32NetworkingWinsockNapiAvailable: Boolean = initWindowsWin32NetworkingWinsockNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockAcceptEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockAcceptEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockEnumProtocolsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockEnumProtocolsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockEnumProtocolsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockEnumProtocolsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddrInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddressByNameA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddressByNameA(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetAddressByNameW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetAddressByNameW(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetHostNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetHostNameW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetNameByTypeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetNameByTypeA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetNameByTypeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetNameByTypeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetNameInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetNameInfoW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetServiceA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetServiceA(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetServiceW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetServiceW(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetTypeByNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetTypeByNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetTypeByNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetTypeByNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockInetNtopW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockInetNtopW(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockInetPtonW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockInetPtonW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSetServiceA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSetServiceA(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSetServiceW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSetServiceW(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockTransmitFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockTransmitFile(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAccept(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAccept(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(p0: String, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(p0: String, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(p0: String, p1: Int, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSACleanup()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSACleanup(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSACloseEvent(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSACloseEvent(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAConnect(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAConnect(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAConnectByList(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAConnectByList(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSACreateEvent()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSACreateEvent(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAEventSelect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAEventSelect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetLastError()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetLastError(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAHtonl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAHtonl(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAHtons(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAHtons(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAIoctl(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAIoctl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAIsBlocking()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAIsBlocking(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSANSPIoctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSANSPIoctl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSANtohl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSANtohl(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSANtohs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSANtohs(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAPoll(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAPoll(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSARecv(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSARecv(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSARecvEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSARecvEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSARecvFrom(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSARecvFrom(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAResetEvent(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAResetEvent(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSARevertImpersonation()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSARevertImpersonation(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASend(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASend(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASendDisconnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASendDisconnect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASendMsg(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASendMsg(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASendTo(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASendTo(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASetEvent(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASetEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASetLastError(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASetLastError(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASetServiceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASetServiceA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASetServiceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASetServiceW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASocketA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASocketA(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSASocketW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSASocketW(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAStartup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAStartup(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook()")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCInstallProvider(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallProvider(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockWsafdisSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockWsafdisSet(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockAccept(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockAccept(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockBind(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockBind(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockClosesocket(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockClosesocket(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockConnect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockConnect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockFreeaddrinfo(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockFreeaddrinfo(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetaddrinfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetaddrinfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGethostbyaddr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGethostbyaddr(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGethostbyname(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGethostbyname(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGethostname(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGethostname(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetpeername(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetpeername(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetprotobyname(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetprotobyname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetprotobynumber(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetprotobynumber(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetservbyname(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetservbyname(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetservbyport(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetservbyport(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetsockname(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetsockname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockGetsockopt(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockHtonl(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockHtonl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockHtons(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockHtons(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockInetAddr(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockInetAddr(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockInetNtop(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockInetNtop(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockInetPton(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockInetPton(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockIoctlsocket(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockIoctlsocket(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockListen(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockListen(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockNtohl(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockNtohl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockNtohs(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockNtohs(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRecv(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRecv(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockRecvfrom(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSelect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSelect(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSend(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSendto(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSetsockopt(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockShutdown(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockShutdown(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinsockSocket(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinsockSocket(p0: Int, p1: Int, p2: Int): String

public actual fun acceptEx(slistensocket: Socket, sacceptsocket: Socket, lpoutputbuffer: MutPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, lpdwbytesreceived: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockAcceptEx(slistensocket.toString(), sacceptsocket.toString(), lpoutputbuffer.rawAddress.toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), lpdwbytesreceived.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockEnumProtocolsA(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockEnumProtocolsW(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeAddrInfoEx(paddrinfoex: ConstPtr<Addrinfoexa>) {
    if (windowsWin32NetworkingWinsockNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinsockFreeAddrInfoEx(paddrinfoex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeAddrInfoExW(paddrinfoex: ConstPtr<Addrinfoexw>) {
    if (windowsWin32NetworkingWinsockNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinsockFreeAddrInfoExW(paddrinfoex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeAddrInfoW(paddrinfo: ConstPtr<Addrinfow>) {
    if (windowsWin32NetworkingWinsockNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinsockFreeAddrInfoW(paddrinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAcceptExSockaddrs(lpoutputbuffer: ConstPtr<CVoid>, dwreceivedatalength: UInt, dwlocaladdresslength: UInt, dwremoteaddresslength: UInt, localsockaddr: MutPtr<MutPtr<Sockaddr>>, localsockaddrlength: MutPtr<Int>, remotesockaddr: MutPtr<MutPtr<Sockaddr>>, remotesockaddrlength: MutPtr<Int>) {
    if (windowsWin32NetworkingWinsockNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinsockGetAcceptExSockaddrs(lpoutputbuffer.rawAddress.toString(), dwreceivedatalength.toInt(), dwlocaladdresslength.toInt(), dwremoteaddresslength.toInt(), localsockaddr.rawAddress.toString(), localsockaddrlength.rawAddress.toString(), remotesockaddr.rawAddress.toString(), remotesockaddrlength.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAddrInfoExA(pname: Pcstr, pservicename: Pcstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexa>, ppresult: MutPtr<MutPtr<Addrinfoexa>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExA(pname.rawAddress.toString(), pservicename.rawAddress.toString(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), hints.rawAddress.toString(), ppresult.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lpnamehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExCancel(lphandle: ConstPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExCancel(lphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExOverlappedResult(lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, hints: ConstPtr<Addrinfoexw>, ppresult: MutPtr<MutPtr<Addrinfoexw>>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lphandle: MutPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoExW(pname.rawAddress.toString(), pservicename.rawAddress.toString(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), hints.rawAddress.toString(), ppresult.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddrInfoW(pnodename: Pcwstr, pservicename: Pcwstr, phints: ConstPtr<Addrinfow>, ppresult: MutPtr<MutPtr<Addrinfow>>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddrInfoW(pnodename.rawAddress.toString(), pservicename.rawAddress.toString(), phints.rawAddress.toString(), ppresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddressByNameA(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pstr, lpdwaliasbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddressByNameA(dwnamespace.toInt(), lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), lpiprotocols.rawAddress.toString(), dwresolution.toInt(), lpserviceasyncinfo.rawAddress.toString(), lpcsaddrbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpaliasbuffer.rawAddress.toString(), lpdwaliasbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAddressByNameW(dwnamespace: UInt, lpservicetype: ConstPtr<Guid>, lpservicename: Pcwstr, lpiprotocols: ConstPtr<Int>, dwresolution: UInt, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpcsaddrbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpaliasbuffer: Pwstr, lpdwaliasbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetAddressByNameW(dwnamespace.toInt(), lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), lpiprotocols.rawAddress.toString(), dwresolution.toInt(), lpserviceasyncinfo.rawAddress.toString(), lpcsaddrbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpaliasbuffer.rawAddress.toString(), lpdwaliasbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHostNameW(name: Pwstr, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetHostNameW(name.rawAddress.toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameByTypeA(lpservicetype: ConstPtr<Guid>, lpservicename: Pstr, dwnamelength: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetNameByTypeA(lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), dwnamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameByTypeW(lpservicetype: ConstPtr<Guid>, lpservicename: Pwstr, dwnamelength: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetNameByTypeW(lpservicetype.rawAddress.toString(), lpservicename.rawAddress.toString(), dwnamelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNameInfoW(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pwstr, nodebuffersize: UInt, pservicebuffer: Pwstr, servicebuffersize: UInt, flags: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetNameInfoW(psockaddr.rawAddress.toString(), sockaddrlength, pnodebuffer.rawAddress.toString(), nodebuffersize.toInt(), pservicebuffer.rawAddress.toString(), servicebuffersize.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceA(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetServiceA(dwnamespace.toInt(), lpguid.rawAddress.toString(), lpservicename.rawAddress.toString(), dwproperties.toInt(), lpbuffer.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceW(dwnamespace: UInt, lpguid: ConstPtr<Guid>, lpservicename: Pcwstr, dwproperties: UInt, lpbuffer: MutPtr<CVoid>, lpdwbuffersize: MutPtr<UInt>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetServiceW(dwnamespace.toInt(), lpguid.rawAddress.toString(), lpservicename.rawAddress.toString(), dwproperties.toInt(), lpbuffer.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTypeByNameA(lpservicename: Pcstr, lpservicetype: MutPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetTypeByNameA(lpservicename.rawAddress.toString(), lpservicetype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTypeByNameW(lpservicename: Pcwstr, lpservicetype: MutPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetTypeByNameW(lpservicename.rawAddress.toString(), lpservicetype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtopW(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pwstr, stringbufsize: ULong): Pcwstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32NetworkingWinsockInetNtopW(family, paddr.rawAddress.toString(), pstringbuf.rawAddress.toString(), stringbufsize.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetPtonW(family: Int, pszaddrstring: Pcwstr, paddrbuf: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockInetPtonW(family, pszaddrstring.rawAddress.toString(), paddrbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processSocketNotifications(completionport: Handle, registrationcount: UInt, registrationinfos: MutPtr<SockNotifyRegistration>, timeoutms: UInt, completioncount: UInt, completionportentries: MutPtr<OverlappedEntry>, receivedentrycount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockProcessSocketNotifications(completionport.rawAddress.toString(), registrationcount.toInt(), registrationinfos.rawAddress.toString(), timeoutms.toInt(), completioncount.toInt(), completionportentries.rawAddress.toString(), receivedentrycount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetAddressToStringA(addr: ConstPtr<DlEui48>, s: Pstr): Pstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringA(addr.rawAddress.toString(), s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetAddressToStringW(addr: ConstPtr<DlEui48>, s: Pwstr): Pwstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetAddressToStringW(addr.rawAddress.toString(), s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetStringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<DlEui48>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressA(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEthernetStringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<DlEui48>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlEthernetStringToAddressW(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringA(addr: ConstPtr<InAddr>, s: Pstr): Pstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringA(addr.rawAddress.toString(), s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringExA(address: ConstPtr<InAddr>, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExA(address.rawAddress.toString(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringExW(address: ConstPtr<InAddr>, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringExW(address.rawAddress.toString(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4AddressToStringW(addr: ConstPtr<InAddr>, s: Pwstr): Pwstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4AddressToStringW(addr.rawAddress.toString(), s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressA(s: Pcstr, strict: Boolean, terminator: MutPtr<Pcstr>, addr: MutPtr<InAddr>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressA(s.rawAddress.toString(), strict, terminator.rawAddress.toString(), addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressExA(addressstring: Pcstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExA(addressstring.rawAddress.toString(), strict, address.rawAddress.toString(), port.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressExW(addressstring: Pcwstr, strict: Boolean, address: MutPtr<InAddr>, port: MutPtr<UShort>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressExW(addressstring.rawAddress.toString(), strict, address.rawAddress.toString(), port.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv4StringToAddressW(s: Pcwstr, strict: Boolean, terminator: MutPtr<Pcwstr>, addr: MutPtr<InAddr>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv4StringToAddressW(s.rawAddress.toString(), strict, terminator.rawAddress.toString(), addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringA(addr: ConstPtr<In6Addr>, s: Pstr): Pstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringA(addr.rawAddress.toString(), s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringExA(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pstr, addressstringlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExA(address.rawAddress.toString(), scopeid.toInt(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringExW(address: ConstPtr<In6Addr>, scopeid: UInt, port: UShort, addressstring: Pwstr, addressstringlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringExW(address.rawAddress.toString(), scopeid.toInt(), port.toInt(), addressstring.rawAddress.toString(), addressstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6AddressToStringW(addr: ConstPtr<In6Addr>, s: Pwstr): Pwstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6AddressToStringW(addr.rawAddress.toString(), s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressA(s: Pcstr, terminator: MutPtr<Pcstr>, addr: MutPtr<In6Addr>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressA(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressExA(addressstring: Pcstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExA(addressstring.rawAddress.toString(), address.rawAddress.toString(), scopeid.rawAddress.toString(), port.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressExW(addressstring: Pcwstr, address: MutPtr<In6Addr>, scopeid: MutPtr<UInt>, port: MutPtr<UShort>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressExW(addressstring.rawAddress.toString(), address.rawAddress.toString(), scopeid.rawAddress.toString(), port.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIpv6StringToAddressW(s: Pcwstr, terminator: MutPtr<Pcwstr>, addr: MutPtr<In6Addr>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRtlIpv6StringToAddressW(s.rawAddress.toString(), terminator.rawAddress.toString(), addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAddrInfoExA(pname: Pcstr, pservicename: Pcstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSetAddrInfoExA(pname.rawAddress.toString(), pservicename.rawAddress.toString(), paddresses.rawAddress.toString(), dwaddresscount.toInt(), lpblob.rawAddress.toString(), dwflags.toInt(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lpnamehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAddrInfoExW(pname: Pcwstr, pservicename: Pcwstr, paddresses: ConstPtr<SocketAddress>, dwaddresscount: UInt, lpblob: ConstPtr<Blob>, dwflags: UInt, dwnamespace: UInt, lpnspid: ConstPtr<Guid>, timeout: ConstPtr<Timeval>, lpoverlapped: ConstPtr<Overlapped>, lpcompletionroutine: LplookupserviceCompletionRoutine, lpnamehandle: MutPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSetAddrInfoExW(pname.rawAddress.toString(), pservicename.rawAddress.toString(), paddresses.rawAddress.toString(), dwaddresscount.toInt(), lpblob.rawAddress.toString(), dwflags.toInt(), dwnamespace.toInt(), lpnspid.rawAddress.toString(), timeout.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), lpnamehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceA(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfoa>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSetServiceA(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString(), lpdwstatusflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceW(dwnamespace: UInt, dwoperation: SetServiceOperation, dwflags: UInt, lpserviceinfo: ConstPtr<ServiceInfow>, lpserviceasyncinfo: ConstPtr<ServiceAsyncInfo>, lpdwstatusflags: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSetServiceW(dwnamespace.toInt(), dwoperation.toInt(), dwflags.toInt(), lpserviceinfo.rawAddress.toString(), lpserviceasyncinfo.rawAddress.toString(), lpdwstatusflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSocketMediaStreamingMode(value: Bool): Hresult =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSetSocketMediaStreamingMode(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transmitFile(hsocket: Socket, hfile: Handle, nnumberofbytestowrite: UInt, nnumberofbytespersend: UInt, lpoverlapped: MutPtr<Overlapped>, lptransmitbuffers: ConstPtr<TransmitFileBuffers>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockTransmitFile(hsocket.toString(), hfile.rawAddress.toString(), nnumberofbytestowrite.toInt(), nnumberofbytespersend.toInt(), lpoverlapped.rawAddress.toString(), lptransmitbuffers.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wPUCompleteOverlappedRequest(s: Socket, lpoverlapped: MutPtr<Overlapped>, dwerror: UInt, cbtransferred: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWPUCompleteOverlappedRequest(s.toString(), lpoverlapped.rawAddress.toString(), dwerror.toInt(), cbtransferred.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAccept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>, lpfncondition: Lpconditionproc, dwcallbackdata: ULong): Socket =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAAccept(s.toString(), addr.rawAddress.toString(), addrlen.rawAddress.toString(), 0L.toString(), dwcallbackdata.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAddressToStringA(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpszaddressstring: Pstr, lpdwaddressstringlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAAddressToStringA(lpsaaddress.rawAddress.toString(), dwaddresslength.toInt(), lpprotocolinfo.rawAddress.toString(), lpszaddressstring.rawAddress.toString(), lpdwaddressstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAddressToStringW(lpsaaddress: ConstPtr<Sockaddr>, dwaddresslength: UInt, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpszaddressstring: Pwstr, lpdwaddressstringlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAAddressToStringW(lpsaaddress.rawAddress.toString(), dwaddresslength.toInt(), lpprotocolinfo.rawAddress.toString(), lpszaddressstring.rawAddress.toString(), lpdwaddressstringlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAdvertiseProvider(puuidproviderid: ConstPtr<Guid>, pnspv2routine: ConstPtr<Nspv2Routine>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAAdvertiseProvider(puuidproviderid.rawAddress.toString(), pnspv2routine.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetHostByAddr(hwnd: Hwnd, wmsg: UInt, addr: Pcstr, len: Int, type: Int, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByAddr(hwnd.rawAddress.toString(), wmsg.toInt(), addr.rawAddress.toString(), len, type, buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetHostByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetHostByName(hwnd.rawAddress.toString(), wmsg.toInt(), name.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetProtoByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByName(hwnd.rawAddress.toString(), wmsg.toInt(), name.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetProtoByNumber(hwnd: Hwnd, wmsg: UInt, number: Int, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetProtoByNumber(hwnd.rawAddress.toString(), wmsg.toInt(), number, buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetServByName(hwnd: Hwnd, wmsg: UInt, name: Pcstr, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByName(hwnd.rawAddress.toString(), wmsg.toInt(), name.rawAddress.toString(), proto.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncGetServByPort(hwnd: Hwnd, wmsg: UInt, port: Int, proto: Pcstr, buf: Pstr, buflen: Int): Handle =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncGetServByPort(hwnd.rawAddress.toString(), wmsg.toInt(), port, proto.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAAsyncSelect(s: Socket, hwnd: Hwnd, wmsg: UInt, levent: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAAsyncSelect(s.toString(), hwnd.rawAddress.toString(), wmsg.toInt(), levent) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACancelAsyncRequest(hasynctaskhandle: Handle): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSACancelAsyncRequest(hasynctaskhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACancelBlockingCall(): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSACancelBlockingCall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACleanup(): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSACleanup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACloseEvent(hevent: Wsaevent): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSACloseEvent(hevent.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAConnect(s.toString(), name.rawAddress.toString(), namelen, lpcallerdata.rawAddress.toString(), lpcalleedata.rawAddress.toString(), lpsqos.rawAddress.toString(), lpgqos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByList(s: Socket, socketaddress: ConstPtr<SocketAddressList>, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAConnectByList(s.toString(), socketaddress.rawAddress.toString(), localaddresslength.rawAddress.toString(), localaddress.rawAddress.toString(), remoteaddresslength.rawAddress.toString(), remoteaddress.rawAddress.toString(), timeout.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByNameA(s: Socket, nodename: Pcstr, servicename: Pcstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAConnectByNameA(s.toString(), nodename.rawAddress.toString(), servicename.rawAddress.toString(), localaddresslength.rawAddress.toString(), localaddress.rawAddress.toString(), remoteaddresslength.rawAddress.toString(), remoteaddress.rawAddress.toString(), timeout.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAConnectByNameW(s: Socket, nodename: Pcwstr, servicename: Pcwstr, localaddresslength: MutPtr<UInt>, localaddress: MutPtr<Sockaddr>, remoteaddresslength: MutPtr<UInt>, remoteaddress: MutPtr<Sockaddr>, timeout: ConstPtr<Timeval>, reserved: ConstPtr<Overlapped>): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAConnectByNameW(s.toString(), nodename.rawAddress.toString(), servicename.rawAddress.toString(), localaddresslength.rawAddress.toString(), localaddress.rawAddress.toString(), remoteaddresslength.rawAddress.toString(), remoteaddress.rawAddress.toString(), timeout.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSACreateEvent(): Wsaevent =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSACreateEvent().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADeleteSocketPeerTargetName(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSADeleteSocketPeerTargetName(socket.toString(), peeraddr.rawAddress.toString(), peeraddrlen.toInt(), overlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADuplicateSocketA(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfoa>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSADuplicateSocketA(s.toString(), dwprocessid.toInt(), lpprotocolinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSADuplicateSocketW(s: Socket, dwprocessid: UInt, lpprotocolinfo: MutPtr<WsaprotocolInfow>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSADuplicateSocketW(s.toString(), dwprocessid.toInt(), lpprotocolinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoa>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersA(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersExA(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexa>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExA(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersExW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersExW(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNameSpaceProvidersW(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNameSpaceProvidersW(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumNetworkEvents(s: Socket, heventobject: Wsaevent, lpnetworkevents: MutPtr<Wsanetworkevents>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumNetworkEvents(s.toString(), heventobject.toString(), lpnetworkevents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumProtocolsA(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfoa>, lpdwbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsA(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEnumProtocolsW(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEnumProtocolsW(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAEventSelect(s: Socket, heventobject: Wsaevent, lnetworkevents: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAEventSelect(s.toString(), heventobject.toString(), lnetworkevents) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetLastError(): WsaError =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetLastError() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetOverlappedResult(s: Socket, lpoverlapped: ConstPtr<Overlapped>, lpcbtransfer: MutPtr<UInt>, fwait: Bool, lpdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetOverlappedResult(s.toString(), lpoverlapped.rawAddress.toString(), lpcbtransfer.rawAddress.toString(), fwait, lpdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetQOSByName(s: Socket, lpqosname: ConstPtr<Wsabuf>, lpqos: MutPtr<Qos>): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetQOSByName(s.toString(), lpqosname.rawAddress.toString(), lpqos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassInfoA(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfoa>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoA(lpproviderid.rawAddress.toString(), lpserviceclassid.rawAddress.toString(), lpdwbufsize.rawAddress.toString(), lpserviceclassinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassInfoW(lpproviderid: ConstPtr<Guid>, lpserviceclassid: ConstPtr<Guid>, lpdwbufsize: MutPtr<UInt>, lpserviceclassinfo: MutPtr<Wsaserviceclassinfow>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassInfoW(lpproviderid.rawAddress.toString(), lpserviceclassid.rawAddress.toString(), lpdwbufsize.rawAddress.toString(), lpserviceclassinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassNameByClassIdA(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pstr, lpdwbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdA(lpserviceclassid.rawAddress.toString(), lpszserviceclassname.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAGetServiceClassNameByClassIdW(lpserviceclassid: ConstPtr<Guid>, lpszserviceclassname: Pwstr, lpdwbufferlength: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAGetServiceClassNameByClassIdW(lpserviceclassid.rawAddress.toString(), lpszserviceclassname.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAHtonl(s: Socket, hostlong: UInt, lpnetlong: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAHtonl(s.toString(), hostlong.toInt(), lpnetlong.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAHtons(s: Socket, hostshort: UShort, lpnetshort: MutPtr<UShort>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAHtons(s.toString(), hostshort.toInt(), lpnetshort.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAImpersonateSocketPeer(socket: Socket, peeraddr: ConstPtr<Sockaddr>, peeraddrlen: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAImpersonateSocketPeer(socket.toString(), peeraddr.rawAddress.toString(), peeraddrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAInstallServiceClassA(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfoa>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassA(lpserviceclassinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAInstallServiceClassW(lpserviceclassinfo: ConstPtr<Wsaserviceclassinfow>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAInstallServiceClassW(lpserviceclassinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAIoctl(s: Socket, dwiocontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAIoctl(s.toString(), dwiocontrolcode.toInt(), lpvinbuffer.rawAddress.toString(), cbinbuffer.toInt(), lpvoutbuffer.rawAddress.toString(), cboutbuffer.toInt(), lpcbbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAIsBlocking(): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAIsBlocking() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAJoinLeaf(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int, lpcallerdata: ConstPtr<Wsabuf>, lpcalleedata: MutPtr<Wsabuf>, lpsqos: ConstPtr<Qos>, lpgqos: ConstPtr<Qos>, dwflags: UInt): Socket =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAJoinLeaf(s.toString(), name.rawAddress.toString(), namelen, lpcallerdata.rawAddress.toString(), lpcalleedata.rawAddress.toString(), lpsqos.rawAddress.toString(), lpgqos.rawAddress.toString(), dwflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceBeginA(lpqsrestrictions: ConstPtr<Wsaqueryseta>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginA(lpqsrestrictions.rawAddress.toString(), dwcontrolflags.toInt(), lphlookup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceBeginW(lpqsrestrictions: ConstPtr<Wsaquerysetw>, dwcontrolflags: UInt, lphlookup: MutPtr<Handle>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceBeginW(lpqsrestrictions.rawAddress.toString(), dwcontrolflags.toInt(), lphlookup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceEnd(hlookup: Handle): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceEnd(hlookup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceNextA(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaqueryseta>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceNextA(hlookup.rawAddress.toString(), dwcontrolflags.toInt(), lpdwbufferlength.rawAddress.toString(), lpqsresults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSALookupServiceNextW(hlookup: Handle, dwcontrolflags: UInt, lpdwbufferlength: MutPtr<UInt>, lpqsresults: MutPtr<Wsaquerysetw>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSALookupServiceNextW(hlookup.rawAddress.toString(), dwcontrolflags.toInt(), lpdwbufferlength.rawAddress.toString(), lpqsresults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANSPIoctl(hlookup: Handle, dwcontrolcode: UInt, lpvinbuffer: ConstPtr<CVoid>, cbinbuffer: UInt, lpvoutbuffer: MutPtr<CVoid>, cboutbuffer: UInt, lpcbbytesreturned: MutPtr<UInt>, lpcompletion: ConstPtr<Wsacompletion>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSANSPIoctl(hlookup.rawAddress.toString(), dwcontrolcode.toInt(), lpvinbuffer.rawAddress.toString(), cbinbuffer.toInt(), lpvoutbuffer.rawAddress.toString(), cboutbuffer.toInt(), lpcbbytesreturned.rawAddress.toString(), lpcompletion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANtohl(s: Socket, netlong: UInt, lphostlong: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSANtohl(s.toString(), netlong.toInt(), lphostlong.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSANtohs(s: Socket, netshort: UShort, lphostshort: MutPtr<UShort>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSANtohs(s.toString(), netshort.toInt(), lphostshort.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAPoll(fdarray: MutPtr<Wsapollfd>, fds: UInt, timeout: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAPoll(fdarray.rawAddress.toString(), fds.toInt(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAProviderCompleteAsyncCall(hasynccall: Handle, iretcode: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAProviderCompleteAsyncCall(hasynccall.rawAddress.toString(), iretcode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAProviderConfigChange(lpnotificationhandle: MutPtr<Handle>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAProviderConfigChange(lpnotificationhandle.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAQuerySocketSecurity(socket: Socket, securityquerytemplate: ConstPtr<SocketSecurityQueryTemplate>, securityquerytemplatelen: UInt, securityqueryinfo: MutPtr<SocketSecurityQueryInfo>, securityqueryinfolen: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAQuerySocketSecurity(socket.toString(), securityquerytemplate.rawAddress.toString(), securityquerytemplatelen.toInt(), securityqueryinfo.rawAddress.toString(), securityqueryinfolen.rawAddress.toString(), overlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecv(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSARecv(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytesrecvd.rawAddress.toString(), lpflags.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvDisconnect(s: Socket, lpinbounddisconnectdata: ConstPtr<Wsabuf>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSARecvDisconnect(s.toString(), lpinbounddisconnectdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvEx(s: Socket, buf: Pstr, len: Int, flags: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSARecvEx(s.toString(), buf.rawAddress.toString(), len, flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARecvFrom(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytesrecvd: MutPtr<UInt>, lpflags: MutPtr<UInt>, lpfrom: MutPtr<Sockaddr>, lpfromlen: MutPtr<Int>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSARecvFrom(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytesrecvd.rawAddress.toString(), lpflags.rawAddress.toString(), lpfrom.rawAddress.toString(), lpfromlen.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARemoveServiceClass(lpserviceclassid: ConstPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSARemoveServiceClass(lpserviceclassid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAResetEvent(hevent: Wsaevent): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAResetEvent(hevent.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSARevertImpersonation(): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSARevertImpersonation() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASend(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASend(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytessent.rawAddress.toString(), dwflags.toInt(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendDisconnect(s: Socket, lpoutbounddisconnectdata: ConstPtr<Wsabuf>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASendDisconnect(s.toString(), lpoutbounddisconnectdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendMsg(handle: Socket, lpmsg: ConstPtr<Wsamsg>, dwflags: UInt, lpnumberofbytessent: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASendMsg(handle.toString(), lpmsg.rawAddress.toString(), dwflags.toInt(), lpnumberofbytessent.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASendTo(s: Socket, lpbuffers: ConstPtr<Wsabuf>, dwbuffercount: UInt, lpnumberofbytessent: MutPtr<UInt>, dwflags: UInt, lpto: ConstPtr<Sockaddr>, itolen: Int, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASendTo(s.toString(), lpbuffers.rawAddress.toString(), dwbuffercount.toInt(), lpnumberofbytessent.rawAddress.toString(), dwflags.toInt(), lpto.rawAddress.toString(), itolen, lpoverlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetBlockingHook(lpblockfunc: Farproc): Farproc =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetEvent(hevent: Wsaevent): Bool =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASetEvent(hevent.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetLastError(ierror: Int) {
    if (windowsWin32NetworkingWinsockNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinsockWSASetLastError(ierror)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSASetServiceA(lpqsreginfo: ConstPtr<Wsaqueryseta>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASetServiceA(lpqsreginfo.rawAddress.toString(), essoperation, dwcontrolflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetServiceW(lpqsreginfo: ConstPtr<Wsaquerysetw>, essoperation: Wsaesetserviceop, dwcontrolflags: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASetServiceW(lpqsreginfo.rawAddress.toString(), essoperation, dwcontrolflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetSocketPeerTargetName(socket: Socket, peertargetname: ConstPtr<SocketPeerTargetName>, peertargetnamelen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASetSocketPeerTargetName(socket.toString(), peertargetname.rawAddress.toString(), peertargetnamelen.toInt(), overlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASetSocketSecurity(socket: Socket, securitysettings: ConstPtr<SocketSecuritySettings>, securitysettingslen: UInt, overlapped: ConstPtr<Overlapped>, completionroutine: LpwsaoverlappedCompletionRoutine): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASetSocketSecurity(socket.toString(), securitysettings.rawAddress.toString(), securitysettingslen.toInt(), overlapped.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASocketA(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, g: UInt, dwflags: UInt): Socket =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASocketA(af, type, protocol, lpprotocolinfo.rawAddress.toString(), g.toInt(), dwflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSASocketW(af: Int, type: Int, protocol: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, g: UInt, dwflags: UInt): Socket =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSASocketW(af, type, protocol, lpprotocolinfo.rawAddress.toString(), g.toInt(), dwflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStartup(wversionrequested: UShort, lpwsadata: MutPtr<Wsadata>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAStartup(wversionrequested.toInt(), lpwsadata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStringToAddressA(addressstring: Pcstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfoa>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAStringToAddressA(addressstring.rawAddress.toString(), addressfamily, lpprotocolinfo.rawAddress.toString(), lpaddress.rawAddress.toString(), lpaddresslength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAStringToAddressW(addressstring: Pcwstr, addressfamily: Int, lpprotocolinfo: ConstPtr<WsaprotocolInfow>, lpaddress: MutPtr<Sockaddr>, lpaddresslength: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAStringToAddressW(addressstring.rawAddress.toString(), addressfamily, lpprotocolinfo.rawAddress.toString(), lpaddress.rawAddress.toString(), lpaddresslength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAUnadvertiseProvider(puuidproviderid: ConstPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAUnadvertiseProvider(puuidproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAUnhookBlockingHook(): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAUnhookBlockingHook() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSAWaitForMultipleEvents(cevents: UInt, lphevents: ConstPtr<Handle>, fwaitall: Bool, dwtimeout: UInt, falertable: Bool): WaitEvent =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSAWaitForMultipleEvents(cevents.toInt(), lphevents.rawAddress.toString(), fwaitall, dwtimeout.toInt(), falertable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCDeinstallProvider(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider(lpproviderid.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCDeinstallProvider32(lpproviderid: ConstPtr<Guid>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCDeinstallProvider32(lpproviderid.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnableNSProvider(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider(lpproviderid.rawAddress.toString(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnableNSProvider32(lpproviderid: ConstPtr<Guid>, fenable: Bool): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCEnableNSProvider32(lpproviderid.rawAddress.toString(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumNameSpaceProviders32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfow>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProviders32(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumNameSpaceProvidersEx32(lpdwbufferlength: MutPtr<UInt>, lpnspbuffer: MutPtr<WsanamespaceInfoexw>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumNameSpaceProvidersEx32(lpdwbufferlength.rawAddress.toString(), lpnspbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumProtocols(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumProtocols(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCEnumProtocols32(lpiprotocols: ConstPtr<Int>, lpprotocolbuffer: MutPtr<WsaprotocolInfow>, lpdwbufferlength: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCEnumProtocols32(lpiprotocols.rawAddress.toString(), lpprotocolbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, ppermittedlspcategories: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCGetApplicationCategory(path.rawAddress.toString(), pathlength.toInt(), extra.rawAddress.toString(), extralength.toInt(), ppermittedlspcategories.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.rawAddress.toString(), flags.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: MutPtr<UByte>, infosize: MutPtr<ULong>, flags: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderInfo32(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.rawAddress.toString(), flags.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderPath(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderPath(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpproviderdllpathlen.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCGetProviderPath32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pwstr, lpproviderdllpathlen: MutPtr<Int>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCGetProviderPath32(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpproviderdllpathlen.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpace(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpace32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpace32(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpaceEx(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString(), lpproviderspecific.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallNameSpaceEx32(lpszidentifier: Pcwstr, lpszpathname: Pcwstr, dwnamespace: UInt, dwversion: UInt, lpproviderid: ConstPtr<Guid>, lpproviderspecific: ConstPtr<Blob>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallNameSpaceEx32(lpszidentifier.rawAddress.toString(), lpszpathname.rawAddress.toString(), dwnamespace.toInt(), dwversion.toInt(), lpproviderid.rawAddress.toString(), lpproviderspecific.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCInstallProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCInstallProvider(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscinstallProvider6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWscinstallProvider6432(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wscinstallProviderAndChains6432(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpszproviderdllpath32: Pcwstr, lpszlspname: Pcwstr, dwserviceflags: UInt, lpprotocolinfolist: MutPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lpdwcatalogentryid: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWscinstallProviderAndChains6432(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpszproviderdllpath32.rawAddress.toString(), lpszlspname.rawAddress.toString(), dwserviceflags.toInt(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lpdwcatalogentryid.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetApplicationCategory(path: Pcwstr, pathlength: UInt, extra: Pcwstr, extralength: UInt, permittedlspcategories: UInt, pprevpermlspcat: MutPtr<UInt>, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCSetApplicationCategory(path.rawAddress.toString(), pathlength.toInt(), extra.rawAddress.toString(), extralength.toInt(), permittedlspcategories.toInt(), pprevpermlspcat.rawAddress.toString(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetProviderInfo(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.toString(), flags.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCSetProviderInfo32(lpproviderid: ConstPtr<Guid>, infotype: WscProviderInfoType, info: ConstPtr<UByte>, infosize: ULong, flags: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCSetProviderInfo32(lpproviderid.rawAddress.toString(), infotype, info.rawAddress.toString(), infosize.toString(), flags.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUnInstallNameSpace(lpproviderid: ConstPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace(lpproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUnInstallNameSpace32(lpproviderid: ConstPtr<Guid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCUnInstallNameSpace32(lpproviderid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUpdateProvider(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCUpdateProvider(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCUpdateProvider32(lpproviderid: ConstPtr<Guid>, lpszproviderdllpath: Pcwstr, lpprotocolinfolist: ConstPtr<WsaprotocolInfow>, dwnumberofentries: UInt, lperrno: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCUpdateProvider32(lpproviderid.rawAddress.toString(), lpszproviderdllpath.rawAddress.toString(), lpprotocolinfolist.rawAddress.toString(), dwnumberofentries.toInt(), lperrno.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteNameSpaceOrder(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder(lpproviderid.rawAddress.toString(), dwnumberofentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteNameSpaceOrder32(lpproviderid: MutPtr<Guid>, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteNameSpaceOrder32(lpproviderid.rawAddress.toString(), dwnumberofentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteProviderOrder(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder(lpwdcatalogentryid.rawAddress.toString(), dwnumberofentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSCWriteProviderOrder32(lpwdcatalogentryid: MutPtr<UInt>, dwnumberofentries: UInt): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWSCWriteProviderOrder32(lpwdcatalogentryid.rawAddress.toString(), dwnumberofentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsafdisSet(fd: Socket, param1: MutPtr<FdSet>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockWsafdisSet(fd.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<Int>): Socket =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockAccept(s.toString(), addr.rawAddress.toString(), addrlen.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockBind(s.toString(), name.rawAddress.toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closesocket(s: Socket): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockClosesocket(s.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockConnect(s.toString(), name.rawAddress.toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(paddrinfo: ConstPtr<Addrinfoa>) {
    if (windowsWin32NetworkingWinsockNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinsockFreeaddrinfo(paddrinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getaddrinfo(pnodename: Pcstr, pservicename: Pcstr, phints: ConstPtr<Addrinfoa>, ppresult: MutPtr<MutPtr<Addrinfoa>>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetaddrinfo(pnodename.rawAddress.toString(), pservicename.rawAddress.toString(), phints.rawAddress.toString(), ppresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostbyaddr(addr: Pcstr, len: Int, type: Int): MutPtr<Hostent> =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockGethostbyaddr(addr.rawAddress.toString(), len, type).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostbyname(name: Pcstr): MutPtr<Hostent> =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockGethostbyname(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: Pstr, namelen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGethostname(name.rawAddress.toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(psockaddr: ConstPtr<Sockaddr>, sockaddrlength: SocklenT, pnodebuffer: Pstr, nodebuffersize: UInt, pservicebuffer: Pstr, servicebuffersize: UInt, flags: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetnameinfo(psockaddr.rawAddress.toString(), sockaddrlength, pnodebuffer.rawAddress.toString(), nodebuffersize.toInt(), pservicebuffer.rawAddress.toString(), servicebuffersize.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetpeername(s.toString(), name.rawAddress.toString(), namelen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: Pcstr): MutPtr<Protoent> =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockGetprotobyname(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(number: Int): MutPtr<Protoent> =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockGetprotobynumber(number).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: Pcstr, proto: Pcstr): MutPtr<Servent> =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyport(port: Int, proto: Pcstr): MutPtr<Servent> =
    if (windowsWin32NetworkingWinsockNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinsockGetservbyport(port, proto.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, namelen: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetsockname(s.toString(), name.rawAddress.toString(), namelen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(s: Socket, level: Int, optname: Int, optval: Pstr, optlen: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockGetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htonl(hostlong: UInt): UInt =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockHtonl(hostlong.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htons(hostshort: UShort): UShort =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockHtons(hostshort.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetAddr(cp: Pcstr): UInt =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockInetAddr(cp.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtoa(input: InAddr): Pstr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetNtop(family: Int, paddr: ConstPtr<CVoid>, pstringbuf: Pstr, stringbufsize: ULong): Pcstr =
    if (windowsWin32NetworkingWinsockNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32NetworkingWinsockInetNtop(family, paddr.rawAddress.toString(), pstringbuf.rawAddress.toString(), stringbufsize.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inetPton(family: Int, pszaddrstring: Pcstr, paddrbuf: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockInetPton(family, pszaddrstring.rawAddress.toString(), paddrbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctlsocket(s: Socket, cmd: Int, argp: MutPtr<UInt>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockIoctlsocket(s.toString(), cmd, argp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(s: Socket, backlog: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockListen(s.toString(), backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntohl(netlong: UInt): UInt =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockNtohl(netlong.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntohs(netshort: UShort): UShort =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockNtohs(netshort.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: Socket, buf: Pstr, len: Int, flags: SendRecvFlags): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRecv(s.toString(), buf.rawAddress.toString(), len, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: Socket, buf: Pstr, len: Int, flags: Int, from: MutPtr<Sockaddr>, fromlen: MutPtr<Int>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockRecvfrom(s.toString(), buf.rawAddress.toString(), len, flags, from.rawAddress.toString(), fromlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: Int, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, exceptfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), exceptfds.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(s: Socket, buf: Pcstr, len: Int, flags: SendRecvFlags): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSend(s.toString(), buf.rawAddress.toString(), len, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(s: Socket, buf: Pcstr, len: Int, flags: Int, to: ConstPtr<Sockaddr>, tolen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSendto(s.toString(), buf.rawAddress.toString(), len, flags, to.rawAddress.toString(), tolen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(s: Socket, level: Int, optname: Int, optval: Pcstr, optlen: Int): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: Socket, how: WinsockShutdownHow): Int =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockShutdown(s.toString(), how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(af: Int, type: WinsockSocketType, protocol: Int): Socket =
    if (windowsWin32NetworkingWinsockNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinsockSocket(af, type, protocol).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
