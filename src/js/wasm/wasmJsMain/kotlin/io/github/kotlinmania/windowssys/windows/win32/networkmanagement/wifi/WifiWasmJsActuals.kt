@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementWifiNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementWifiNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementWifiNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanConnect(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanConnect(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanConnect2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanConnect2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanScan(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanScan(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession((hsessionhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle((hclienthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession((hsessionhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(dwclientversion.toInt(), (pdwnegotiatedversion?.value ?: 0L).toString(), (phclienthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: COpaquePointer?, phsessionhandle: COpaquePointer?, pguidsessioninterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession((hclienthandle?.value ?: 0L).toString(), (plegacymacaddress?.value ?: 0L).toString(), (phsessionhandle?.value ?: 0L).toString(), (pguidsessioninterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: COpaquePointer?, pvcontext: COpaquePointer?, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession((hclienthandle?.value ?: 0L).toString(), (pdeviceaddress?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString(), 0L.toString(), (phsessionhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility((pdeviceaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanAllocateMemory(dwmemorysize: UInt): COpaquePointer? =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(dwmemorysize.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle((hclienthandle?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanConnect((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (pconnectionparameters?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanConnect2((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (pconnectionparameters?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdeviceserviceguid: COpaquePointer?, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (pdeviceserviceguid?.value ?: 0L).toString(), dwopcode.toInt(), dwinbuffersize.toInt(), (pinbuffer?.value ?: 0L).toString(), dwoutbuffersize.toInt(), (poutbuffer?.value ?: 0L).toString(), (pdwbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: COpaquePointer?, ppinterfacelist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces((hclienthandle?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (ppinterfacelist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: COpaquePointer?, strformat: Pcwstr, preserved: COpaquePointer?, pppsdiedatalist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList((hclienthandle?.value ?: 0L).toString(), dwiedatasize.toInt(), (prawiedata?.value ?: 0L).toString(), (strformat?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (pppsdiedatalist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanFreeMemory(pmemory: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory((pmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), dwflags.toInt(), (preserved?.value ?: 0L).toString(), (ppavailablenetworklist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), dwflags.toInt(), (preserved?.value ?: 0L).toString(), (ppavailablenetworklist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: COpaquePointer?, ppnetworklist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList((hclienthandle?.value ?: 0L).toString(), wlanfilterlisttype, (preserved?.value ?: 0L).toString(), (ppnetworklist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppcapability: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (ppcapability?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: COpaquePointer?, ppwlanbsslist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (pdot11ssid?.value ?: 0L).toString(), dot11bsstype, bsecurityenabled, (preserved?.value ?: 0L).toString(), (ppwlanbsslist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pstrprofilexml: COpaquePointer?, pdwflags: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (pstrprofilexml?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString(), (pdwgrantedaccess?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (pdwdatasize?.value ?: 0L).toString(), (ppdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (ppprofilelist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: COpaquePointer?, pstrcurrentsddl: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings((hclienthandle?.value ?: 0L).toString(), securableobject, (pvaluetype?.value ?: 0L).toString(), (pstrcurrentsddl?.value ?: 0L).toString(), (pdwgrantedaccess?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, ppdevsvcguidlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (ppdevsvcguidlist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart((hclienthandle?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop((hclienthandle?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings((hclienthandle?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: COpaquePointer?, ppvdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty((hclienthandle?.value ?: 0L).toString(), opcode, (pdwdatasize?.value ?: 0L).toString(), (ppvdata?.value ?: 0L).toString(), (pwlanopcodevaluetype?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: COpaquePointer?, ppuckeydata: COpaquePointer?, pbispassphrase: COpaquePointer?, pbpersistent: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey((hclienthandle?.value ?: 0L).toString(), (pdwkeylength?.value ?: 0L).toString(), (ppuckeydata?.value ?: 0L).toString(), (pbispassphrase?.value ?: 0L).toString(), (pbpersistent?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus((hclienthandle?.value ?: 0L).toString(), (ppwlanhostednetworkstatus?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings((hclienthandle?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty((hclienthandle?.value ?: 0L).toString(), opcode, dwdatasize.toInt(), (pvdata?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: COpaquePointer?, bispassphrase: Bool, bpersistent: Bool, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey((hclienthandle?.value ?: 0L).toString(), dwkeylength.toInt(), (puckeydata?.value ?: 0L).toString(), bispassphrase, bpersistent, (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing((hclienthandle?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing((hclienthandle?.value ?: 0L).toString(), (pfailreason?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), type, dwinbuffersize.toInt(), (pinbuffer?.value ?: 0L).toString(), dwoutbuffersize.toInt(), (poutbuffer?.value ?: 0L).toString(), (pdwbytesreturned?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: COpaquePointer?, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(dwclientversion.toInt(), (preserved?.value ?: 0L).toString(), (pdwnegotiatedversion?.value ?: 0L).toString(), (phclienthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter((hclienthandle?.value ?: 0L).toString(), opcode, (preserved?.value ?: 0L).toString(), (pdwdatasize?.value ?: 0L).toString(), (ppdata?.value ?: 0L).toString(), (pwlanopcodevaluetype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), opcode, (preserved?.value ?: 0L).toString(), (pdwdatasize?.value ?: 0L).toString(), (ppdata?.value ?: 0L).toString(), (pwlanopcodevaluetype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), (pstringbuffer?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification((hclienthandle?.value ?: 0L).toString(), (pdevsvcguidlist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: COpaquePointer?, preserved: COpaquePointer?, pdwprevnotifsource: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification((hclienthandle?.value ?: 0L).toString(), dwnotifsource.toInt(), bignoreduplicate, 0L.toString(), (pcallbackcontext?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (pdwprevnotifsource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification((hclienthandle?.value ?: 0L).toString(), bregister, (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (stroldprofilename?.value ?: 0L).toString(), (strnewprofilename?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), (stralluserprofilesecurity?.value ?: 0L).toString(), dwflags.toInt(), boverwrite, (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, piedata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanScan((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (pdot11ssid?.value ?: 0L).toString(), (piedata?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter((hclienthandle?.value ?: 0L).toString(), opcode, dwdatasize.toInt(), (pdata?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList((hclienthandle?.value ?: 0L).toString(), wlanfilterlisttype, (pnetworklist?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), opcode, dwdatasize.toInt(), (pdata?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: COpaquePointer?, pdwreasoncode: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), dwflags.toInt(), (strprofilexml?.value ?: 0L).toString(), (stralluserprofilesecurity?.value ?: 0L).toString(), boverwrite, (preserved?.value ?: 0L).toString(), (pdwreasoncode?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), dwdatasize.toInt(), (pdata?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), dwflags.toInt(), (streapxmluserdata?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwitems: UInt, strprofilenames: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), dwitems.toInt(), (strprofilenames?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwposition: UInt, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition((hclienthandle?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), dwposition.toInt(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: COpaquePointer?, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList((hclienthandle?.value ?: 0L).toString(), (strformat?.value ?: 0L).toString(), (ppsdiedatalist?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings((hclienthandle?.value ?: 0L).toString(), securableobject, (strmodifiedsddl?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: COpaquePointer?, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: COpaquePointer?, pwlanreasoncode: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(dwclientversion.toInt(), (wstrprofilename?.value ?: 0L).toString(), (pinterfaceguid?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), wlstartpage, (preserved?.value ?: 0L).toString(), (pwlanreasoncode?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
