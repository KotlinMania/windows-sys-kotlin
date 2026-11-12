@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageIscsidiscNapiAddon(): Boolean

private val windowsWin32StorageIscsidiscNapiAvailable: Boolean = initWindowsWin32StorageIscsidiscNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddISNSServerA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddISNSServerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddISNSServerW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddISNSServerW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(p0: String, p1: String, p2: Int, p3: Boolean, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddRadiusServerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscAddRadiusServerW(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices()")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: String, p10: Boolean, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(p0: String, p1: Boolean, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: String, p10: Boolean, p11: String, p12: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportISNSServerListA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportISNSServerListW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(p0: Boolean, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(p0: Boolean, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSendScsiInquiry(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(p0: Int, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(p0: String, p1: Int, p2: String, p3: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(p0: String, p1: Int, p2: String, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(p0)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(p0: String, p1: Int, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(p0: String, p1: Int, p2: String, p3: String, p4: Boolean): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices()")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes()")
private external fun wasmWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes(): Int

public actual fun addISNSServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddISNSServerA(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addISNSServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddISNSServerW(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiConnectionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(uniquesessionid.rawAddress.toString(), reserved.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), connectionid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiConnectionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(uniquesessionid.rawAddress.toString(), reserved.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), connectionid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortala>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), loginoptions.rawAddress.toString(), securityflags.toString(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortalw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), loginoptions.rawAddress.toString(), securityflags.toString(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupa>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(targetname.rawAddress.toString(), targetalias.rawAddress.toString(), targetflags.toInt(), persist, mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), portalgroup.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(targetname.rawAddress.toString(), targetalias.rawAddress.toString(), targetflags.toInt(), persist, mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), portalgroup.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(devicepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(devicepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRadiusServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddRadiusServerA(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscAddRadiusServerW(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearPersistentIScsiDevices(): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessiona>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(uniquesessionid.rawAddress.toString(), devicecount.rawAddress.toString(), devices.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessionw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(uniquesessionid.rawAddress.toString(), devicecount.rawAddress.toString(), devices.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), reserved.rawAddress.toString(), authinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), reserved.rawAddress.toString(), authinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(initiatornodename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(initiatornodename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListA(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoa>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(buffersize.rawAddress.toString(), sessioncount.rawAddress.toString(), sessioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListEx(buffersize: MutPtr<UInt>, sessioncountptr: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoEx>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(buffersize.rawAddress.toString(), sessioncountptr.rawAddress.toString(), sessioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiSessionListW(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfow>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(buffersize.rawAddress.toString(), sessioncount.rawAddress.toString(), sessioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(targetname.rawAddress.toString(), discoverymechanism.rawAddress.toString(), infoclass, buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(targetname.rawAddress.toString(), discoverymechanism.rawAddress.toString(), infoclass, buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIScsiVersionInformation(versioninfo: MutPtr<IscsiVersionInfo>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(versioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(targetname.rawAddress.toString(), isinformationalsession, initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), ispersistent, uniquesessionid.rawAddress.toString(), uniqueconnectionid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(targetname.rawAddress.toString(), isinformationalsession, initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetportal.rawAddress.toString(), securityflags.toString(), mappings.rawAddress.toString(), loginoptions.rawAddress.toString(), keysize.toInt(), key.rawAddress.toString(), ispersistent, uniquesessionid.rawAddress.toString(), uniqueconnectionid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logoutIScsiTarget(uniquesessionid: MutPtr<IscsiUniqueSessionId>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(uniquesessionid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeISNSServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiConnection(uniquesessionid: MutPtr<IscsiUniqueSessionId>, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(uniquesessionid.rawAddress.toString(), connectionid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr<IscsiTargetPortala>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetname.rawAddress.toString(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr<IscsiTargetPortalw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), targetname.rawAddress.toString(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(initiatorinstance.rawAddress.toString(), initiatorportnumber.toInt(), portal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(targetname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(targetname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(devicepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(devicepath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappinga>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(buffersize.rawAddress.toString(), mappingcount.rawAddress.toString(), mappings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappingw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(buffersize.rawAddress.toString(), mappingcount.rawAddress.toString(), mappings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportISNSServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportISNSServerListA(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportISNSServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportISNSServerListW(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiInitiatorListA(buffersize: MutPtr<UInt>, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiInitiatorListW(buffersize: MutPtr<UInt>, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiPersistentLoginsA(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfoa>, buffersizeinbytes: MutPtr<UInt>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(count.rawAddress.toString(), persistentlogininfo.rawAddress.toString(), buffersizeinbytes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiPersistentLoginsW(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfow>, buffersizeinbytes: MutPtr<UInt>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(count.rawAddress.toString(), persistentlogininfo.rawAddress.toString(), buffersizeinbytes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsA(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoa>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(portalcount.rawAddress.toString(), portalinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExa>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(portalcount.rawAddress.toString(), portalinfosize.rawAddress.toString(), portalinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(portalcount.rawAddress.toString(), portalinfosize.rawAddress.toString(), portalinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiSendTargetPortalsW(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfow>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(portalcount.rawAddress.toString(), portalinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortala>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(initiatorname.rawAddress.toString(), targetname.rawAddress.toString(), targetportaltag.rawAddress.toString(), elementcount.rawAddress.toString(), portals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortalw>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(initiatorname.rawAddress.toString(), targetname.rawAddress.toString(), targetportaltag.rawAddress.toString(), elementcount.rawAddress.toString(), portals.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(forceupdate, buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(forceupdate, buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportRadiusServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportRadiusServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(buffersizeinchar.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiInquiry(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSendScsiInquiry(uniquesessionid.rawAddress.toString(), lun.toString(), evpdcmddt.toInt(), pagecode.toInt(), scsistatus.rawAddress.toString(), responsesize.rawAddress.toString(), responsebuffer.rawAddress.toString(), sensesize.rawAddress.toString(), sensebuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiReadCapacity(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(uniquesessionid.rawAddress.toString(), lun.toString(), scsistatus.rawAddress.toString(), responsesize.rawAddress.toString(), responsebuffer.rawAddress.toString(), sensesize.rawAddress.toString(), sensebuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendScsiReportLuns(uniquesessionid: MutPtr<IscsiUniqueSessionId>, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(uniquesessionid.rawAddress.toString(), scsistatus.rawAddress.toString(), responsesize.rawAddress.toString(), responsebuffer.rawAddress.toString(), sensesize.rawAddress.toString(), sensebuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr<UByte>, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(keylength.toInt(), key.rawAddress.toString(), persist).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), authinfo.rawAddress.toString(), persist).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), authinfo.rawAddress.toString(), persist).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), sharedsecret.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(initiatornodename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(initiatornodename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), sharedsecret.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), destinationaddress.rawAddress.toString(), outermodeaddress.rawAddress.toString(), persist).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(initiatorname.rawAddress.toString(), initiatorportnumber.toInt(), destinationaddress.rawAddress.toString(), outermodeaddress.rawAddress.toString(), persist).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPersistentIScsiDevices(): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupPersistentIScsiVolumes(): UInt =
    if (windowsWin32StorageIscsidiscNapiAvailable) wasmWindowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
