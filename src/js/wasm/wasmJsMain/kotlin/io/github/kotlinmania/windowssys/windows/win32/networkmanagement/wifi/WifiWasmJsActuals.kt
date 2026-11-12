@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementWifiNapiAddon(): Boolean

private val windowsWin32NetworkmanagementWifiNapiAvailable: Boolean = initWindowsWin32NetworkmanagementWifiNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanConnect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanConnect(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanConnect2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanConnect2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanScan(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanScan(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(hsessionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(hclienthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(hsessionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(dwclientversion.toInt(), pdwnegotiatedversion.rawAddress.toString(), phclienthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr, phsessionhandle: MutPtr, pguidsessioninterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(hclienthandle.rawAddress.toString(), plegacymacaddress.rawAddress.toString(), phsessionhandle.rawAddress.toString(), pguidsessioninterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr, pvcontext: ConstPtr, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(hclienthandle.rawAddress.toString(), pdeviceaddress.rawAddress.toString(), pvcontext.rawAddress.toString(), 0L.toString(), phsessionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(pdeviceaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(dwmemorysize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(hclienthandle.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanConnect(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pconnectionparameters.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanConnect2(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pconnectionparameters.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdeviceserviceguid: ConstPtr, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pdeviceserviceguid.rawAddress.toString(), dwopcode.toInt(), dwinbuffersize.toInt(), pinbuffer.rawAddress.toString(), dwoutbuffersize.toInt(), poutbuffer.rawAddress.toString(), pdwbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr, ppinterfacelist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(hclienthandle.rawAddress.toString(), preserved.rawAddress.toString(), ppinterfacelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr, strformat: Pcwstr, preserved: ConstPtr, pppsdiedatalist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(hclienthandle.rawAddress.toString(), dwiedatasize.toInt(), prawiedata.rawAddress.toString(), strformat.rawAddress.toString(), preserved.rawAddress.toString(), pppsdiedatalist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanFreeMemory(pmemory: ConstPtr) {
    if (windowsWin32NetworkmanagementWifiNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwflags.toInt(), preserved.rawAddress.toString(), ppavailablenetworklist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwflags.toInt(), preserved.rawAddress.toString(), ppavailablenetworklist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr, ppnetworklist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(hclienthandle.rawAddress.toString(), wlanfilterlisttype, preserved.rawAddress.toString(), ppnetworklist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppcapability: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), preserved.rawAddress.toString(), ppcapability.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr, ppwlanbsslist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pdot11ssid.rawAddress.toString(), dot11bsstype, bsecurityenabled, preserved.rawAddress.toString(), ppwlanbsslist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pstrprofilexml: MutPtr, pdwflags: MutPtr, pdwgrantedaccess: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), preserved.rawAddress.toString(), pstrprofilexml.rawAddress.toString(), pdwflags.rawAddress.toString(), pdwgrantedaccess.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), preserved.rawAddress.toString(), ppprofilelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr, pstrcurrentsddl: MutPtr, pdwgrantedaccess: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(hclienthandle.rawAddress.toString(), securableobject, pvaluetype.rawAddress.toString(), pstrcurrentsddl.rawAddress.toString(), pdwgrantedaccess.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr, ppdevsvcguidlist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), ppdevsvcguidlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr, ppvdata: MutPtr, pwlanopcodevaluetype: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(hclienthandle.rawAddress.toString(), opcode, pdwdatasize.rawAddress.toString(), ppvdata.rawAddress.toString(), pwlanopcodevaluetype.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr, ppuckeydata: MutPtr, pbispassphrase: MutPtr, pbpersistent: MutPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(hclienthandle.rawAddress.toString(), pdwkeylength.rawAddress.toString(), ppuckeydata.rawAddress.toString(), pbispassphrase.rawAddress.toString(), pbpersistent.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(hclienthandle.rawAddress.toString(), ppwlanhostednetworkstatus.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(hclienthandle.rawAddress.toString(), opcode, dwdatasize.toInt(), pvdata.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(hclienthandle.rawAddress.toString(), dwkeylength.toInt(), puckeydata.rawAddress.toString(), bispassphrase, bpersistent, pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), type, dwinbuffersize.toInt(), pinbuffer.rawAddress.toString(), dwoutbuffersize.toInt(), poutbuffer.rawAddress.toString(), pdwbytesreturned.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(dwclientversion.toInt(), preserved.rawAddress.toString(), pdwnegotiatedversion.rawAddress.toString(), phclienthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(hclienthandle.rawAddress.toString(), opcode, preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString(), pwlanopcodevaluetype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), opcode, preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString(), pwlanopcodevaluetype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), pstringbuffer.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(hclienthandle.rawAddress.toString(), pdevsvcguidlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr, preserved: ConstPtr, pdwprevnotifsource: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(hclienthandle.rawAddress.toString(), dwnotifsource.toInt(), bignoreduplicate, 0L.toString(), pcallbackcontext.rawAddress.toString(), preserved.rawAddress.toString(), pdwprevnotifsource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(hclienthandle.rawAddress.toString(), bregister, preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), stroldprofilename.rawAddress.toString(), strnewprofilename.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), stralluserprofilesecurity.rawAddress.toString(), dwflags.toInt(), boverwrite, preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, piedata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanScan(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pdot11ssid.rawAddress.toString(), piedata.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(hclienthandle.rawAddress.toString(), opcode, dwdatasize.toInt(), pdata.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(hclienthandle.rawAddress.toString(), wlanfilterlisttype, pnetworklist.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), opcode, dwdatasize.toInt(), pdata.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr, pdwreasoncode: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwflags.toInt(), strprofilexml.rawAddress.toString(), stralluserprofilesecurity.rawAddress.toString(), boverwrite, preserved.rawAddress.toString(), pdwreasoncode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), dwdatasize.toInt(), pdata.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), dwflags.toInt(), streapxmluserdata.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwitems: UInt, strprofilenames: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwitems.toInt(), strprofilenames.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), dwposition.toInt(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(hclienthandle.rawAddress.toString(), strformat.rawAddress.toString(), ppsdiedatalist.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(hclienthandle.rawAddress.toString(), securableobject, strmodifiedsddl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr, pwlanreasoncode: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(dwclientversion.toInt(), wstrprofilename.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), hwnd.rawAddress.toString(), wlstartpage, preserved.rawAddress.toString(), pwlanreasoncode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
