@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.COpaquePointer
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
private external fun _initWindowsWin32NetworkmanagementIphelperNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementIphelperNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementIphelperNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_addIPAddress(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_addIPAddress(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_cancelIPChangeNotify(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_cancelIPChangeNotify(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_cancelIfTimestampConfigChange(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_cancelIfTimestampConfigChange(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_cancelMibChangeNotify2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_cancelMibChangeNotify2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_captureInterfaceHardwareCrossTimestamp(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_captureInterfaceHardwareCrossTimestamp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentGuidToId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentGuidToId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentIdToGuid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentIdToGuid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceAliasToLuid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceAliasToLuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceGuidToLuid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceGuidToLuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceIndexToLuid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceIndexToLuid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToAlias(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToAlias(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToGuid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToGuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToIndex(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToIndex(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertIpv4MaskToLength(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertIpv4MaskToLength(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_convertLengthToIpv4Mask(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertLengthToIpv4Mask(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createAnycastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createAnycastIpAddressEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createPersistentTcpPortReservation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createPersistentTcpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createPersistentUdpPortReservation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createPersistentUdpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createProxyArpEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createProxyArpEntry(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createSortedAddressPairs(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createSortedAddressPairs(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_createUnicastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_createUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteAnycastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteAnycastIpAddressEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteIPAddress(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIPAddress(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deletePersistentTcpPortReservation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deletePersistentTcpPortReservation(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deletePersistentUdpPortReservation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deletePersistentUdpPortReservation(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteProxyArpEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteProxyArpEntry(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_deleteUnicastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_disableMediaSense(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_disableMediaSense(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_enableRouter(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_enableRouter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable2(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_flushIpPathTable(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_flushIpPathTable(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_freeDnsSettings(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_freeDnsSettings(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_freeInterfaceDnsSettings(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_freeInterfaceDnsSettings(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_freeMibTable(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_freeMibTable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getAdapterIndex(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdapterIndex(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getAdapterOrderMap()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdapterOrderMap(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getAdaptersAddresses(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdaptersAddresses(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getAdaptersInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdaptersInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressTable(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getBestInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestInterface(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getBestInterfaceEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestInterfaceEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getBestRoute(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestRoute(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getBestRoute2(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestRoute2(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentId()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentId(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentScope(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentScope(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getDefaultCompartmentId()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getDefaultCompartmentId(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getDnsSettings(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getDnsSettings(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getExtendedTcpTable(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getExtendedTcpTable(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getExtendedUdpTable(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getExtendedUdpTable(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getFriendlyIfIndex(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getFriendlyIfIndex(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatistics(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatisticsEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2Ex(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2Ex(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfStackTable(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfStackTable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfTable2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfTable2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIfTable2Ex(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfTable2Ex(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceActiveTimestampCapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceActiveTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceCurrentTimestampCapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceCurrentTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceHardwareTimestampCapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceHardwareTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceSupportedTimestampCapabilities(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceSupportedTimestampCapabilities(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getInvertedIfStackTable(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInvertedIfStackTable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpAddrTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpAddrTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpErrorString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpErrorString(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpForwardEntry2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable2(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceTable(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpNetEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetEntry2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable2(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpNetworkConnectionBandwidthEstimates(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetworkConnectionBandwidthEstimates(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpPathEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpPathEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpPathTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpPathTable(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpStatistics(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getIpStatisticsEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getJobCompartmentId(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getJobCompartmentId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressTable(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHint(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHint(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHintForInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHintForInterface(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getNetworkInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkInformation(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getNetworkParams(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkParams(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getNumberOfInterfaces(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNumberOfInterfaces(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromPidAndInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromPidAndInfo(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcp6Entry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcp6Entry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcpEntry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcpEntry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdp6Entry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdp6Entry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdpEntry(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdpEntry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getPerAdapterInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getPerAdapterInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getPerTcp6ConnectionEStats(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getPerTcp6ConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getPerTcpConnectionEStats(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getPerTcpConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getRTTAndHopCount(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getRTTAndHopCount(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getSessionCompartmentId(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getSessionCompartmentId(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatistics(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcpTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTcpTable2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpTable2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getTeredoPort(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTeredoPort(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUdp6Table(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdp6Table(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatistics(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUdpTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpTable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUniDirectionalAdapterInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUniDirectionalAdapterInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressTable(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmp6CreateFile()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmp6CreateFile(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmp6ParseReplies(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmp6ParseReplies(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmp6SendEcho2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmp6SendEcho2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: String, p10: Int, p11: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmpCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpCloseHandle(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmpCreateFile()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpCreateFile(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmpParseReplies(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpParseReplies(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2Ex(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2Ex(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: Int, p11: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_initializeIpForwardEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_initializeIpForwardEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_initializeIpInterfaceEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_initializeIpInterfaceEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_initializeUnicastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_initializeUnicastIpAddressEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_ipReleaseAddress(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_ipReleaseAddress(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_ipRenewAddress(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_ipRenewAddress(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentTcpPortReservation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentTcpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentUdpPortReservation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentUdpPortReservation(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_nhpAllocateAndGetInterfaceInfoFromStack(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_nhpAllocateAndGetInterfaceInfoFromStack(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyAddrChange(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyAddrChange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyIfTimestampConfigChange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyIfTimestampConfigChange(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyIpInterfaceChange(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyIpInterfaceChange(p0: Int, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyNetworkConnectivityHintChange(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyNetworkConnectivityHintChange(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange2(p0: Int, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyStableUnicastIpAddressTable(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyStableUnicastIpAddressTable(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyTeredoPortChange(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyTeredoPortChange(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_notifyUnicastIpAddressChange(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyUnicastIpAddressChange(p0: Int, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_parseNetworkString(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_parseNetworkString(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfAddFiltersToInterface(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfAddFiltersToInterface(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfAddGlobalFilterToInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfAddGlobalFilterToInterface(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIPAddress(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIPAddress(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIndex(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIndex(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfCreateInterface(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfCreateInterface(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfDeleteInterface(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfDeleteInterface(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfDeleteLog()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfDeleteLog(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfGetInterfaceStatistics(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfGetInterfaceStatistics(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfMakeLog(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfMakeLog(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfRebindFilters(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRebindFilters(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFilterHandles(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFilterHandles(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFiltersFromInterface(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFiltersFromInterface(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveGlobalFilterFromInterface(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRemoveGlobalFilterFromInterface(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfSetLogBuffer(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfSetLogBuffer(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfTestPacket(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfTestPacket(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_pfUnBindInterface(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfUnBindInterface(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_registerInterfaceTimestampConfigChange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_registerInterfaceTimestampConfigChange(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_resolveIpNetEntry2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_resolveIpNetEntry2(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_resolveNeighbor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_resolveNeighbor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_restoreMediaSense(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_restoreMediaSense(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_sendARP(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_sendARP(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentId(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentId(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentScope(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentScope(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setDnsSettings(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setDnsSettings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIfEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIfEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpInterfaceEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpInterfaceEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry2(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpStatistics(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpStatisticsEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpStatisticsEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setIpTTL(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpTTL(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setJobCompartmentId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setJobCompartmentId(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setNetworkInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setNetworkInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setPerTcp6ConnectionEStats(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setPerTcp6ConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setPerTcpConnectionEStats(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setPerTcpConnectionEStats(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setSessionCompartmentId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setSessionCompartmentId(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setTcpEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setTcpEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_setUnicastIpAddressEntry(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_setUnicastIpAddressEntry(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_unenableRouter(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_unenableRouter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_unregisterInterfaceTimestampConfigChange(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_unregisterInterfaceTimestampConfigChange(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_ifIndextoname(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_ifIndextoname(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_iphelper_ifNametoindex(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_iphelper_ifNametoindex(p0: String): Int

public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: COpaquePointer?, nteinstance: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_addIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), (ntecontext?.value ?: 0L).toString(), (nteinstance?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIPChangeNotify(notifyoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_cancelIPChangeNotify((notifyoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_cancelIfTimestampConfigChange((notificationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_cancelMibChangeNotify2((notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: COpaquePointer?, crosstimestamp: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_captureInterfaceHardwareCrossTimestamp((interfaceluid?.value ?: 0L).toString(), (crosstimestamp?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCompartmentGuidToId(compartmentguid: COpaquePointer?, compartmentid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentGuidToId((compartmentguid?.value ?: 0L).toString(), (compartmentid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentIdToGuid(compartmentid.toInt(), (compartmentguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceAliasToLuid((interfacealias?.value ?: 0L).toString(), (interfaceluid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceGuidToLuid(interfaceguid: COpaquePointer?, interfaceluid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceGuidToLuid((interfaceguid?.value ?: 0L).toString(), (interfaceluid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceIndexToLuid(interfaceindex.toInt(), (interfaceluid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToAlias(interfaceluid: COpaquePointer?, interfacealias: Pwstr, length: ULong): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToAlias((interfaceluid?.value ?: 0L).toString(), (interfacealias?.value ?: 0L).toString(), length.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToGuid(interfaceluid: COpaquePointer?, interfaceguid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToGuid((interfaceluid?.value ?: 0L).toString(), (interfaceguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToIndex(interfaceluid: COpaquePointer?, interfaceindex: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToIndex((interfaceluid?.value ?: 0L).toString(), (interfaceindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToNameA(interfaceluid: COpaquePointer?, interfacename: Pstr, length: ULong): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameA((interfaceluid?.value ?: 0L).toString(), (interfacename?.value ?: 0L).toString(), length.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToNameW(interfaceluid: COpaquePointer?, interfacename: Pwstr, length: ULong): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameW((interfaceluid?.value ?: 0L).toString(), (interfacename?.value ?: 0L).toString(), length.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidA((interfacename?.value ?: 0L).toString(), (interfaceluid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidW((interfacename?.value ?: 0L).toString(), (interfaceluid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertIpv4MaskToLength(mask.toInt(), (masklength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_convertLengthToIpv4Mask(masklength.toInt(), (mask?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createAnycastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpForwardEntry(proute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry((proute?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpForwardEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpNetEntry(parpentry: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry((parpentry?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpNetEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createPersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), (token?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createPersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), (token?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSortedAddressPairs(sourceaddresslist: COpaquePointer?, sourceaddresscount: UInt, destinationaddresslist: COpaquePointer?, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: COpaquePointer?, sortedaddresspaircount: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createSortedAddressPairs((sourceaddresslist?.value ?: 0L).toString(), sourceaddresscount.toInt(), (destinationaddresslist?.value ?: 0L).toString(), destinationaddresscount.toInt(), addresssortoptions.toInt(), (sortedaddresspairlist?.value ?: 0L).toString(), (sortedaddresspaircount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_createUnicastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteAnycastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIPAddress(ntecontext.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpForwardEntry(proute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry((proute?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpForwardEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpNetEntry(parpentry: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry((parpentry?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpNetEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deletePersistentTcpPortReservation(startport.toInt(), numberofports.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deletePersistentUdpPortReservation(startport.toInt(), numberofports.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_deleteUnicastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableMediaSense(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_disableMediaSense((phandle?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableRouter(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_enableRouter((phandle?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable(dwifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable2(family.toInt(), interfaceindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_flushIpPathTable(family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDnsSettings(settings: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_freeDnsSettings((settings?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeInterfaceDnsSettings(settings: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_freeInterfaceDnsSettings((settings?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeMibTable(memory: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_freeMibTable((memory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdapterIndex((adaptername?.value ?: 0L).toString(), (ifindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdapterOrderMap(): COpaquePointer? =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdapterOrderMap().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: COpaquePointer?, adapteraddresses: COpaquePointer?, sizepointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdaptersAddresses(family.toInt(), flags.toInt(), (reserved?.value ?: 0L).toString(), (adapteraddresses?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdaptersInfo(adapterinfo: COpaquePointer?, sizepointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAdaptersInfo((adapterinfo?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressTable(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestInterface(dwdestaddr.toInt(), (pdwbestifindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestInterfaceEx(pdestaddr: COpaquePointer?, pdwbestifindex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestInterfaceEx((pdestaddr?.value ?: 0L).toString(), (pdwbestifindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), (pbestroute?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestRoute2(interfaceluid: COpaquePointer?, interfaceindex: UInt, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, addresssortoptions: UInt, bestroute: COpaquePointer?, bestsourceaddress: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getBestRoute2((interfaceluid?.value ?: 0L).toString(), interfaceindex.toInt(), (sourceaddress?.value ?: 0L).toString(), (destinationaddress?.value ?: 0L).toString(), addresssortoptions.toInt(), (bestroute?.value ?: 0L).toString(), (bestsourceaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadCompartmentScope(compartmentscope: COpaquePointer?, compartmentid: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentScope((compartmentscope?.value ?: 0L).toString(), (compartmentid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getDefaultCompartmentId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDnsSettings(settings: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getDnsSettings((settings?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExtendedTcpTable(ptcptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getExtendedTcpTable((ptcptable?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExtendedUdpTable(pudptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getExtendedUdpTable((pudptable?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getFriendlyIfIndex(ifindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIcmpStatistics(statistics: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatistics((statistics?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIcmpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatisticsEx((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry(pifrow: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfEntry((pifrow?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2Ex(level, (row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfStackTable(table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfStackTable((table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable(piftable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfTable((piftable?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), border).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable2(table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfTable2((table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIfTable2Ex(level, (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceActiveTimestampCapabilities((interfaceluid?.value ?: 0L).toString(), (timestampcapabilites?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceCurrentTimestampCapabilities((interfaceluid?.value ?: 0L).toString(), (timestampcapabilites?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceHardwareTimestampCapabilities((interfaceluid?.value ?: 0L).toString(), (timestampcapabilites?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceInfo(piftable: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceInfo((piftable?.value ?: 0L).toString(), (dwoutbuflen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInterfaceSupportedTimestampCapabilities((interfaceluid?.value ?: 0L).toString(), (timestampcapabilites?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInvertedIfStackTable(table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getInvertedIfStackTable((table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpAddrTable(pipaddrtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpAddrTable((pipaddrtable?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), border).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpErrorString(errorcode.toInt(), (buffer?.value ?: 0L).toString(), (size?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpForwardEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardTable(pipforwardtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable((pipforwardtable?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), border).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardTable2(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable2(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpInterfaceEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpInterfaceTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceTable(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetTable(ipnettable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable((ipnettable?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetTable2(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable2(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toInt(), (bandwidthestimates?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpPathEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpPathEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpPathTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpPathTable(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpStatistics(statistics: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpStatistics((statistics?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getIpStatisticsEx((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getJobCompartmentId((jobhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMulticastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressTable(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkConnectivityHint(connectivityhint: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHint((connectivityhint?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHintForInterface(interfaceindex.toInt(), (connectivityhint?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkInformation(networkguid: COpaquePointer?, compartmentid: COpaquePointer?, siteid: COpaquePointer?, networkname: Pwstr, length: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkInformation((networkguid?.value ?: 0L).toString(), (compartmentid?.value ?: 0L).toString(), (siteid?.value ?: 0L).toString(), (networkname?.value ?: 0L).toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkParams(pfixedinfo: COpaquePointer?, poutbuflen: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNetworkParams((pfixedinfo?.value ?: 0L).toString(), (poutbuflen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfInterfaces(pdwnumif: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getNumberOfInterfaces((pdwnumif?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromPidAndInfo(ulpid.toInt(), (pinfo?.value ?: 0L).toString(), cls, (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcp6Entry((ptcpentry?.value ?: 0L).toString(), cls, (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcpEntry((ptcpentry?.value ?: 0L).toString(), cls, (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdp6Entry((pudpentry?.value ?: 0L).toString(), cls, (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromUdpEntry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdpEntry((pudpentry?.value ?: 0L).toString(), cls, (pbuffer?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: COpaquePointer?, poutbuflen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getPerAdapterInfo(ifindex.toInt(), (pperadapterinfo?.value ?: 0L).toString(), (poutbuflen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getPerTcp6ConnectionEStats((row?.value ?: 0L).toString(), estatstype, (rw?.value ?: 0L).toString(), rwversion.toInt(), rwsize.toInt(), (ros?.value ?: 0L).toString(), rosversion.toInt(), rossize.toInt(), (rod?.value ?: 0L).toString(), rodversion.toInt(), rodsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getPerTcpConnectionEStats((row?.value ?: 0L).toString(), estatstype, (rw?.value ?: 0L).toString(), rwversion.toInt(), rwsize.toInt(), (ros?.value ?: 0L).toString(), rosversion.toInt(), rossize.toInt(), (rod?.value ?: 0L).toString(), rodversion.toInt(), rodsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: COpaquePointer?, maxhops: UInt, rtt: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getRTTAndHopCount(destipaddress.toInt(), (hopcount?.value ?: 0L).toString(), maxhops.toInt(), (rtt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getSessionCompartmentId(sessionid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcp6Table(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table((tcptable?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcp6Table2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table2((tcptable?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatistics(statistics: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpStatistics((statistics?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx2((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpTable(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpTable((tcptable?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpTable2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTcpTable2((tcptable?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeredoPort(port: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getTeredoPort((port?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdp6Table(udp6table: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdp6Table((udp6table?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatistics(stats: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpStatistics((stats?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx2((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpTable(udptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUdpTable((udptable?.value ?: 0L).toString(), (sizepointer?.value ?: 0L).toString(), order).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUniDirectionalAdapterInfo(pipifinfo: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUniDirectionalAdapterInfo((pipifinfo?.value ?: 0L).toString(), (dwoutbuflen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressTable(family.toInt(), (table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6CreateFile(): Handle =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmp6CreateFile().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6ParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmp6ParseReplies((replybuffer?.value ?: 0L).toString(), replysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmp6SendEcho2((icmphandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (sourceaddress?.value ?: 0L).toString(), (destinationaddress?.value ?: 0L).toString(), (requestdata?.value ?: 0L).toString(), requestsize.toInt(), (requestoptions?.value ?: 0L).toString(), (replybuffer?.value ?: 0L).toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpCloseHandle((icmphandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpCreateFile(): Handle =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpCreateFile().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpParseReplies((replybuffer?.value ?: 0L).toString(), replysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho((icmphandle?.value ?: 0L).toString(), destinationaddress.toInt(), (requestdata?.value ?: 0L).toString(), requestsize.toInt(), (requestoptions?.value ?: 0L).toString(), (replybuffer?.value ?: 0L).toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2((icmphandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), destinationaddress.toInt(), (requestdata?.value ?: 0L).toString(), requestsize.toInt(), (requestoptions?.value ?: 0L).toString(), (replybuffer?.value ?: 0L).toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: UInt, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2Ex((icmphandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), sourceaddress.toInt(), destinationaddress.toInt(), (requestdata?.value ?: 0L).toString(), requestsize.toInt(), (requestoptions?.value ?: 0L).toString(), (replybuffer?.value ?: 0L).toString(), replysize.toInt(), timeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeIpForwardEntry(row: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_initializeIpForwardEntry((row?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeIpInterfaceEntry(row: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_initializeIpInterfaceEntry((row?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeUnicastIpAddressEntry(row: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_initializeUnicastIpAddressEntry((row?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ipReleaseAddress(adapterinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_ipReleaseAddress((adapterinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ipRenewAddress(adapterinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_ipRenewAddress((adapterinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), (token?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), (token?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: COpaquePointer?, pdwcount: COpaquePointer?, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_nhpAllocateAndGetInterfaceInfoFromStack((pptable?.value ?: 0L).toString(), (pdwcount?.value ?: 0L).toString(), border, (hheap?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyAddrChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyAddrChange((handle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyIfTimestampConfigChange(callercontext: COpaquePointer?, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyIfTimestampConfigChange((callercontext?.value ?: 0L).toString(), 0L.toString(), (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyIpInterfaceChange(family.toInt(), 0L.toString(), (callercontext?.value ?: 0L).toString(), initialnotification, (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyNetworkConnectivityHintChange(0L.toString(), (callercontext?.value ?: 0L).toString(), initialnotification, (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyRouteChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange((handle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange2(addressfamily.toInt(), 0L.toString(), (callercontext?.value ?: 0L).toString(), initialnotification, (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?, callercallback: PstableUnicastIpaddressTableCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyStableUnicastIpAddressTable(family.toInt(), (table?.value ?: 0L).toString(), 0L.toString(), (callercontext?.value ?: 0L).toString(), (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyTeredoPortChange(0L.toString(), (callercontext?.value ?: 0L).toString(), initialnotification, (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_notifyUnicastIpAddressChange(family.toInt(), 0L.toString(), (callercontext?.value ?: 0L).toString(), initialnotification, (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: COpaquePointer?, portnumber: COpaquePointer?, prefixlength: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_parseNetworkString((networkstring?.value ?: 0L).toString(), types.toInt(), (addressinfo?.value ?: 0L).toString(), (portnumber?.value ?: 0L).toString(), (prefixlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfAddFiltersToInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?, pfhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfAddFiltersToInterface((ih?.value ?: 0L).toString(), cinfilters.toInt(), (pfiltin?.value ?: 0L).toString(), coutfilters.toInt(), (pfiltout?.value ?: 0L).toString(), (pfhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfAddGlobalFilterToInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfAddGlobalFilterToInterface((pinterface?.value ?: 0L).toString(), gffilter).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfBindInterfaceToIPAddress(pinterface: COpaquePointer?, pfattype: Pfaddresstype, ipaddress: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIPAddress((pinterface?.value ?: 0L).toString(), pfattype, (ipaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfBindInterfaceToIndex(pinterface: COpaquePointer?, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIndex((pinterface?.value ?: 0L).toString(), dwindex.toInt(), pfatlinktype, (linkipaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, (ppinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfDeleteInterface(pinterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfDeleteInterface((pinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfDeleteLog(): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfDeleteLog().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfGetInterfaceStatistics(pinterface: COpaquePointer?, ppfstats: COpaquePointer?, pdwbuffersize: COpaquePointer?, fresetcounters: Bool): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfGetInterfaceStatistics((pinterface?.value ?: 0L).toString(), (ppfstats?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), fresetcounters).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfMakeLog(hevent: Handle): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfMakeLog((hevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRebindFilters(pinterface: COpaquePointer?, platebindinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRebindFilters((pinterface?.value ?: 0L).toString(), (platebindinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveFilterHandles(pinterface: COpaquePointer?, cfilters: UInt, pvhandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFilterHandles((pinterface?.value ?: 0L).toString(), cfilters.toInt(), (pvhandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveFiltersFromInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFiltersFromInterface((ih?.value ?: 0L).toString(), cinfilters.toInt(), (pfiltin?.value ?: 0L).toString(), coutfilters.toInt(), (pfiltout?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfRemoveGlobalFilterFromInterface((pinterface?.value ?: 0L).toString(), gffilter).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfSetLogBuffer(pbbuffer: COpaquePointer?, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: COpaquePointer?, pdwlostentries: COpaquePointer?, pdwsizeused: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfSetLogBuffer((pbbuffer?.value ?: 0L).toString(), dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), (pdwloggedentries?.value ?: 0L).toString(), (pdwlostentries?.value ?: 0L).toString(), (pdwsizeused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfTestPacket(pininterface: COpaquePointer?, poutinterface: COpaquePointer?, cbytes: UInt, pbpacket: COpaquePointer?, ppaction: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfTestPacket((pininterface?.value ?: 0L).toString(), (poutinterface?.value ?: 0L).toString(), cbytes.toInt(), (pbpacket?.value ?: 0L).toString(), (ppaction?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfUnBindInterface(pinterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_pfUnBindInterface((pinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_registerInterfaceTimestampConfigChange(0L.toString(), (callercontext?.value ?: 0L).toString(), (notificationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveIpNetEntry2(row: COpaquePointer?, sourceaddress: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_resolveIpNetEntry2((row?.value ?: 0L).toString(), (sourceaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveNeighbor(networkaddress: COpaquePointer?, physicaladdress: COpaquePointer?, physicaladdresslength: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_resolveNeighbor((networkaddress?.value ?: 0L).toString(), (physicaladdress?.value ?: 0L).toString(), (physicaladdresslength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMediaSense(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_restoreMediaSense((poverlapped?.value ?: 0L).toString(), (lpdwenablecount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: COpaquePointer?, phyaddrlen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_sendARP(destip.toInt(), srcip.toInt(), (pmacaddr?.value ?: 0L).toString(), (phyaddrlen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentId(compartmentid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentScope(compartmentscope.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDnsSettings(settings: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setDnsSettings((settings?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIfEntry(pifrow: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIfEntry((pifrow?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpForwardEntry(proute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry((proute?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpForwardEntry2(route: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry2((route?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpInterfaceEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpInterfaceEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpNetEntry(parpentry: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry((parpentry?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpNetEntry2(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry2((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpStatistics(pipstats: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpStatistics((pipstats?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpStatisticsEx((statistics?.value ?: 0L).toString(), family.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpTTL(nttl: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setIpTTL(nttl.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setJobCompartmentId((jobhandle?.value ?: 0L).toString(), compartmentid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNetworkInformation(networkguid: COpaquePointer?, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setNetworkInformation((networkguid?.value ?: 0L).toString(), compartmentid.toInt(), (networkname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setPerTcp6ConnectionEStats((row?.value ?: 0L).toString(), estatstype, (rw?.value ?: 0L).toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setPerTcpConnectionEStats((row?.value ?: 0L).toString(), estatstype, (rw?.value ?: 0L).toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTcpEntry(ptcprow: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setTcpEntry((ptcprow?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_setUnicastIpAddressEntry((row?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unenableRouter(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_unenableRouter((poverlapped?.value ?: 0L).toString(), (lpdwenablecount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_iphelper_unregisterInterfaceTimestampConfigChange((notificationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_ifIndextoname(interfaceindex.toInt(), (interfacename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_iphelper_ifNametoindex((interfacename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
