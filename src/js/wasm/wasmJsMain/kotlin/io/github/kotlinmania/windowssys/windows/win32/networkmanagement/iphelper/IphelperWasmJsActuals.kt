@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementIphelperNapiAddon(): Boolean

private val windowsWin32NetworkmanagementIphelperNapiAvailable: Boolean = initWindowsWin32NetworkmanagementIphelperNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperEnableRouter(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperEnableRouter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: String, p10: Int, p11: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: Int, p11: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(p0: Int, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(p0: Int, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(p0: Int, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSendARP(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSendARP(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(p0: String): Int

public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: MutPtr, nteinstance: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), ntecontext.rawAddress.toString(), nteinstance.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIPChangeNotify(notifyoverlapped: ConstPtr): Bool =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(notifyoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(notificationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: ConstPtr, crosstimestamp: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(interfaceluid.rawAddress.toString(), crosstimestamp.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCompartmentGuidToId(compartmentguid: ConstPtr, compartmentid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(compartmentguid.rawAddress.toString(), compartmentid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(compartmentid.toInt(), compartmentguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(interfacealias.rawAddress.toString(), interfaceluid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceGuidToLuid(interfaceguid: ConstPtr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(interfaceguid.rawAddress.toString(), interfaceluid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(interfaceindex.toInt(), interfaceluid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToAlias(interfaceluid: ConstPtr, interfacealias: Pwstr, length: ULong): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(interfaceluid.rawAddress.toString(), interfacealias.rawAddress.toString(), length.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToGuid(interfaceluid: ConstPtr, interfaceguid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(interfaceluid.rawAddress.toString(), interfaceguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToIndex(interfaceluid: ConstPtr, interfaceindex: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(interfaceluid.rawAddress.toString(), interfaceindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToNameA(interfaceluid: ConstPtr, interfacename: Pstr, length: ULong): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(interfaceluid.rawAddress.toString(), interfacename.rawAddress.toString(), length.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToNameW(interfaceluid: ConstPtr, interfacename: Pwstr, length: ULong): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(interfaceluid.rawAddress.toString(), interfacename.rawAddress.toString(), length.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(interfacename.rawAddress.toString(), interfaceluid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(interfacename.rawAddress.toString(), interfaceluid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(mask.toInt(), masklength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(masklength.toInt(), mask.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAnycastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpForwardEntry(proute: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(proute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpForwardEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpNetEntry(parpentry: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(parpentry.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpNetEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSortedAddressPairs(sourceaddresslist: ConstPtr, sourceaddresscount: UInt, destinationaddresslist: ConstPtr, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: MutPtr, sortedaddresspaircount: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(sourceaddresslist.rawAddress.toString(), sourceaddresscount.toInt(), destinationaddresslist.rawAddress.toString(), destinationaddresscount.toInt(), addresssortoptions.toInt(), sortedaddresspairlist.rawAddress.toString(), sortedaddresspaircount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUnicastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAnycastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(ntecontext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpForwardEntry(proute: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(proute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpForwardEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpNetEntry(parpentry: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(parpentry.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpNetEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(startport.toInt(), numberofports.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(startport.toInt(), numberofports.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUnicastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableMediaSense(phandle: MutPtr, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(phandle.rawAddress.toString(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableRouter(phandle: MutPtr, poverlapped: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperEnableRouter(phandle.rawAddress.toString(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(dwifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(family.toInt(), interfaceindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDnsSettings(settings: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(settings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeInterfaceDnsSettings(settings: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(settings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeMibTable(memory: ConstPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(memory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(adaptername.rawAddress.toString(), ifindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdapterOrderMap(): MutPtr =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: ConstPtr, adapteraddresses: MutPtr, sizepointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(family.toInt(), flags.toInt(), reserved.rawAddress.toString(), adapteraddresses.rawAddress.toString(), sizepointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdaptersInfo(adapterinfo: MutPtr, sizepointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(adapterinfo.rawAddress.toString(), sizepointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAnycastIpAddressEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(dwdestaddr.toInt(), pdwbestifindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestInterfaceEx(pdestaddr: ConstPtr, pdwbestifindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(pdestaddr.rawAddress.toString(), pdwbestifindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), pbestroute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestRoute2(interfaceluid: ConstPtr, interfaceindex: UInt, sourceaddress: ConstPtr, destinationaddress: ConstPtr, addresssortoptions: UInt, bestroute: MutPtr, bestsourceaddress: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(interfaceluid.rawAddress.toString(), interfaceindex.toInt(), sourceaddress.rawAddress.toString(), destinationaddress.rawAddress.toString(), addresssortoptions.toInt(), bestroute.rawAddress.toString(), bestsourceaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadCompartmentScope(compartmentscope: MutPtr, compartmentid: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(compartmentscope.rawAddress.toString(), compartmentid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDnsSettings(settings: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(settings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExtendedTcpTable(ptcptable: MutPtr, pdwsize: MutPtr, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(ptcptable.rawAddress.toString(), pdwsize.rawAddress.toString(), border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExtendedUdpTable(pudptable: MutPtr, pdwsize: MutPtr, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(pudptable.rawAddress.toString(), pdwsize.rawAddress.toString(), border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(ifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIcmpStatistics(statistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(statistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIcmpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry(pifrow: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(pifrow.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry2(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(level, row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfStackTable(table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable(piftable: MutPtr, pdwsize: MutPtr, border: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfTable(piftable.rawAddress.toString(), pdwsize.rawAddress.toString(), border).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable2(table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(level, table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceDnsSettings(iface: Guid, settings: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceInfo(piftable: MutPtr, dwoutbuflen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(piftable.rawAddress.toString(), dwoutbuflen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInvertedIfStackTable(table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpAddrTable(pipaddrtable: MutPtr, pdwsize: MutPtr, border: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(pipaddrtable.rawAddress.toString(), pdwsize.rawAddress.toString(), border).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(errorcode.toInt(), buffer.rawAddress.toString(), size.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardEntry2(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardTable(pipforwardtable: MutPtr, pdwsize: MutPtr, border: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(pipforwardtable.rawAddress.toString(), pdwsize.rawAddress.toString(), border).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardTable2(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpInterfaceEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpInterfaceTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetEntry2(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetTable(ipnettable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(ipnettable.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetTable2(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toInt(), bandwidthestimates.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpPathEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpPathTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpStatistics(statistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(statistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(jobhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMulticastIpAddressEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkConnectivityHint(connectivityhint: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(connectivityhint.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(interfaceindex.toInt(), connectivityhint.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkInformation(networkguid: ConstPtr, compartmentid: MutPtr, siteid: MutPtr, networkname: Pwstr, length: UInt): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(networkguid.rawAddress.toString(), compartmentid.rawAddress.toString(), siteid.rawAddress.toString(), networkname.rawAddress.toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkParams(pfixedinfo: MutPtr, poutbuflen: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(pfixedinfo.rawAddress.toString(), poutbuflen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfInterfaces(pdwnumif: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(pdwnumif.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(ulpid.toInt(), pinfo.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(ptcpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(ptcpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(pudpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromUdpEntry(pudpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(pudpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: MutPtr, poutbuflen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(ifindex.toInt(), pperadapterinfo.rawAddress.toString(), poutbuflen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerTcp6ConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: MutPtr, rwversion: UInt, rwsize: UInt, ros: MutPtr, rosversion: UInt, rossize: UInt, rod: MutPtr, rodversion: UInt, rodsize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), ros.rawAddress.toString(), rosversion.toInt(), rossize.toInt(), rod.rawAddress.toString(), rodversion.toInt(), rodsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerTcpConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: MutPtr, rwversion: UInt, rwsize: UInt, ros: MutPtr, rosversion: UInt, rossize: UInt, rod: MutPtr, rodversion: UInt, rodsize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), ros.rawAddress.toString(), rosversion.toInt(), rossize.toInt(), rod.rawAddress.toString(), rodversion.toInt(), rodsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: MutPtr, maxhops: UInt, rtt: MutPtr): Bool =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(destipaddress.toInt(), hopcount.rawAddress.toString(), maxhops.toInt(), rtt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(sessionid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcp6Table(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcp6Table2(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatistics(statistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(statistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatisticsEx2(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpTable(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpTable2(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeredoPort(port: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(port.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdp6Table(udp6table: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(udp6table.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatistics(stats: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(stats.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatisticsEx2(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpTable(udptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(udptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUniDirectionalAdapterInfo(pipifinfo: MutPtr, dwoutbuflen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(pipifinfo.rawAddress.toString(), dwoutbuflen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicastIpAddressEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(family.toInt(), table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6CreateFile(): Handle =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6ParseReplies(replybuffer: MutPtr, replysize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(replybuffer.rawAddress.toString(), replysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, sourceaddress: ConstPtr, destinationaddress: ConstPtr, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(icmphandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), sourceaddress.rawAddress.toString(), destinationaddress.rawAddress.toString(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(icmphandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpCreateFile(): Handle =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpParseReplies(replybuffer: MutPtr, replysize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(replybuffer.rawAddress.toString(), replysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(icmphandle.rawAddress.toString(), destinationaddress.toInt(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(icmphandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), destinationaddress.toInt(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, sourceaddress: UInt, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(icmphandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), sourceaddress.toInt(), destinationaddress.toInt(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeIpForwardEntry(row: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(row.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeIpInterfaceEntry(row: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(row.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeUnicastIpAddressEntry(row: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(row.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ipReleaseAddress(adapterinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(adapterinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ipRenewAddress(adapterinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(adapterinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: MutPtr, pdwcount: MutPtr, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(pptable.rawAddress.toString(), pdwcount.rawAddress.toString(), border, hheap.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyAddrChange(handle: MutPtr, overlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(handle.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyIfTimestampConfigChange(callercontext: ConstPtr, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(callercontext.rawAddress.toString(), 0L.toString(), notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(family.toInt(), 0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyRouteChange(handle: MutPtr, overlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(handle.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(addressfamily.toInt(), 0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: MutPtr, callercallback: PstableUnicastIpaddressTableCallback, callercontext: ConstPtr, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(family.toInt(), table.rawAddress.toString(), 0L.toString(), callercontext.rawAddress.toString(), notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(family.toInt(), 0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: MutPtr, portnumber: MutPtr, prefixlength: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(networkstring.rawAddress.toString(), types.toInt(), addressinfo.rawAddress.toString(), portnumber.rawAddress.toString(), prefixlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfAddFiltersToInterface(ih: MutPtr, cinfilters: UInt, pfiltin: MutPtr, coutfilters: UInt, pfiltout: MutPtr, pfhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(ih.rawAddress.toString(), cinfilters.toInt(), pfiltin.rawAddress.toString(), coutfilters.toInt(), pfiltout.rawAddress.toString(), pfhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfAddGlobalFilterToInterface(pinterface: MutPtr, gffilter: GlobalFilter): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(pinterface.rawAddress.toString(), gffilter).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfBindInterfaceToIPAddress(pinterface: MutPtr, pfattype: Pfaddresstype, ipaddress: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(pinterface.rawAddress.toString(), pfattype, ipaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfBindInterfaceToIndex(pinterface: MutPtr, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(pinterface.rawAddress.toString(), dwindex.toInt(), pfatlinktype, linkipaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, ppinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfDeleteInterface(pinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(pinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfDeleteLog(): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfGetInterfaceStatistics(pinterface: MutPtr, ppfstats: MutPtr, pdwbuffersize: MutPtr, fresetcounters: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(pinterface.rawAddress.toString(), ppfstats.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), fresetcounters).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfMakeLog(hevent: Handle): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(hevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRebindFilters(pinterface: MutPtr, platebindinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(pinterface.rawAddress.toString(), platebindinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveFilterHandles(pinterface: MutPtr, cfilters: UInt, pvhandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(pinterface.rawAddress.toString(), cfilters.toInt(), pvhandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveFiltersFromInterface(ih: MutPtr, cinfilters: UInt, pfiltin: MutPtr, coutfilters: UInt, pfiltout: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(ih.rawAddress.toString(), cinfilters.toInt(), pfiltin.rawAddress.toString(), coutfilters.toInt(), pfiltout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: MutPtr, gffilter: GlobalFilter): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(pinterface.rawAddress.toString(), gffilter).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfSetLogBuffer(pbbuffer: MutPtr, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: MutPtr, pdwlostentries: MutPtr, pdwsizeused: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(pbbuffer.rawAddress.toString(), dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), pdwloggedentries.rawAddress.toString(), pdwlostentries.rawAddress.toString(), pdwsizeused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfTestPacket(pininterface: MutPtr, poutinterface: MutPtr, cbytes: UInt, pbpacket: MutPtr, ppaction: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(pininterface.rawAddress.toString(), poutinterface.rawAddress.toString(), cbytes.toInt(), pbpacket.rawAddress.toString(), ppaction.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfUnBindInterface(pinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(pinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: ConstPtr, notificationhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(0L.toString(), callercontext.rawAddress.toString(), notificationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveIpNetEntry2(row: MutPtr, sourceaddress: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(row.rawAddress.toString(), sourceaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveNeighbor(networkaddress: ConstPtr, physicaladdress: MutPtr, physicaladdresslength: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(networkaddress.rawAddress.toString(), physicaladdress.rawAddress.toString(), physicaladdresslength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMediaSense(poverlapped: ConstPtr, lpdwenablecount: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(poverlapped.rawAddress.toString(), lpdwenablecount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: MutPtr, phyaddrlen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSendARP(destip.toInt(), srcip.toInt(), pmacaddr.rawAddress.toString(), phyaddrlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(compartmentid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(compartmentscope.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDnsSettings(settings: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(settings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIfEntry(pifrow: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(pifrow.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInterfaceDnsSettings(iface: Guid, settings: ConstPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpForwardEntry(proute: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(proute.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpForwardEntry2(route: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(route.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpInterfaceEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpNetEntry(parpentry: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(parpentry.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpNetEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpStatistics(pipstats: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(pipstats.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpStatisticsEx(statistics: ConstPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(statistics.rawAddress.toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpTTL(nttl: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(nttl.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(jobhandle.rawAddress.toString(), compartmentid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNetworkInformation(networkguid: ConstPtr, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(networkguid.rawAddress.toString(), compartmentid.toInt(), networkname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerTcp6ConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: ConstPtr, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerTcpConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: ConstPtr, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTcpEntry(ptcprow: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(ptcprow.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUnicastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(row.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unenableRouter(poverlapped: ConstPtr, lpdwenablecount: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(poverlapped.rawAddress.toString(), lpdwenablecount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(notificationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(interfaceindex.toInt(), interfacename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(interfacename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
