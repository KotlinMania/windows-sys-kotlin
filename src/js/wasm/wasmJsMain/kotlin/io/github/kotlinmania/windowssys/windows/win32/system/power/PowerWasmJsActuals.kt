@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegSamFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.RegisterNotificationFlags

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemPowerNapiAddon(): Boolean

private val _windowsWin32SystemPowerNapiAvailable: Boolean = _initWindowsWin32SystemPowerNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_callNtPowerInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_callNtPowerInformation(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_canUserWritePwrScheme()")
private external fun _wasm_windowssys_windows_win32_system_power_canUserWritePwrScheme(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_deletePwrScheme(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_deletePwrScheme(p0: Int): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_devicePowerClose()")
private external fun _wasm_windowssys_windows_win32_system_power_devicePowerClose(): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_devicePowerEnumDevices(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_devicePowerEnumDevices(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_devicePowerOpen(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_devicePowerOpen(p0: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_devicePowerSetDeviceState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_devicePowerSetDeviceState(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_enumPwrSchemes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_enumPwrSchemes(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_getActivePwrScheme(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_getActivePwrScheme(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_getCurrentPowerPolicies(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_getCurrentPowerPolicies(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_getDevicePowerState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_getDevicePowerState(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_getPwrCapabilities(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_getPwrCapabilities(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_getPwrDiskSpindownRange(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_getPwrDiskSpindownRange(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_getSystemPowerStatus(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_getSystemPowerStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_isAdminOverrideActive(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_isAdminOverrideActive(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_isPwrHibernateAllowed()")
private external fun _wasm_windowssys_windows_win32_system_power_isPwrHibernateAllowed(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_isPwrShutdownAllowed()")
private external fun _wasm_windowssys_windows_win32_system_power_isPwrShutdownAllowed(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_isPwrSuspendAllowed()")
private external fun _wasm_windowssys_windows_win32_system_power_isPwrSuspendAllowed(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_isSystemResumeAutomatic()")
private external fun _wasm_windowssys_windows_win32_system_power_isSystemResumeAutomatic(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerClearRequest(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerClearRequest(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerCreatePossibleSetting(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerCreatePossibleSetting(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerCreateRequest(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerCreateRequest(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerCreateSetting(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerCreateSetting(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerDeleteScheme(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerDeleteScheme(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerDeterminePlatformRole()")
private external fun _wasm_windowssys_windows_win32_system_power_powerDeterminePlatformRole(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerDuplicateScheme(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerDuplicateScheme(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerEnumerate(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_power_powerEnumerate(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerGetActiveScheme(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerGetActiveScheme(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerImportPowerScheme(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerImportPowerScheme(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerIsSettingRangeDefined(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerIsSettingRangeDefined(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerOpenSystemPowerKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerOpenSystemPowerKey(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerOpenUserPowerKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerOpenUserPowerKey(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadACDefaultIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadACDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadACValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadACValue(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadACValueIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadACValueIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadDCDefaultIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadDCDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadDCValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadDCValue(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadDCValueIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadDCValueIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadDescription(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadDescription(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadFriendlyName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadIconResourceSpecifier(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadIconResourceSpecifier(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadPossibleDescription(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadPossibleDescription(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadPossibleFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadPossibleFriendlyName(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadPossibleValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadPossibleValue(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadSettingAttributes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadSettingAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadValueIncrement(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadValueIncrement(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadValueMax(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadValueMax(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadValueMin(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadValueMin(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerRemovePowerSetting(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerRemovePowerSetting(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes()")
private external fun _wasm_windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerReportThermalEvent(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerReportThermalEvent(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes()")
private external fun _wasm_windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerSetActiveScheme(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerSetActiveScheme(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerSetRequest(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerSetRequest(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerSettingAccessCheck(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_powerSettingAccessCheck(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerSettingAccessCheckEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerSettingAccessCheckEx(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerSettingRegisterNotification(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerSettingRegisterNotification(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerSettingUnregisterNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerSettingUnregisterNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteACDefaultIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteACDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteACValueIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteACValueIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteDCDefaultIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteDCDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteDCValueIndex(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteDCValueIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteDescription(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteDescription(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteFriendlyName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWritePossibleDescription(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWritePossibleDescription(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWritePossibleFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWritePossibleFriendlyName(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWritePossibleValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWritePossibleValue(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteSettingAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteSettingAttributes(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteValueIncrement(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteValueIncrement(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteValueMax(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteValueMax(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteValueMin(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteValueMin(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_readGlobalPwrPolicy(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_readGlobalPwrPolicy(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_readProcessorPwrScheme(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_readProcessorPwrScheme(p0: Int, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_readPwrScheme(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_readPwrScheme(p0: Int, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_registerPowerSettingNotification(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_registerPowerSettingNotification(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_registerSuspendResumeNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_registerSuspendResumeNotification(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_requestWakeupLatency(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_requestWakeupLatency(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_setActivePwrScheme(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_setActivePwrScheme(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_setSuspendState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_power_setSuspendState(p0: Boolean, p1: Boolean, p2: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_setSystemPowerState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_setSystemPowerState(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_setThreadExecutionState(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_setThreadExecutionState(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_unregisterPowerSettingNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_unregisterPowerSettingNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_validatePowerPolicies(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_validatePowerPolicies(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_writeGlobalPwrPolicy(p0)")
private external fun _wasm_windowssys_windows_win32_system_power_writeGlobalPwrPolicy(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_writeProcessorPwrScheme(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_power_writeProcessorPwrScheme(p0: Int, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_power_writePwrScheme(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_power_writePwrScheme(p0: String, p1: String, p2: String, p3: String): Boolean

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_callNtPowerInformation(informationlevel, (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canUserWritePwrScheme(): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_canUserWritePwrScheme() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_deletePwrScheme(uiid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerClose(): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_devicePowerClose() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_devicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), (preturnbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_devicePowerOpen(debugmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_devicePowerSetDeviceState((devicedescription?.value ?: 0L).toString(), setflags.toInt(), (setdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_enumPwrSchemes(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActivePwrScheme(puiid: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_getActivePwrScheme((puiid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_getCurrentPowerPolicies((pglobalpowerpolicy?.value ?: 0L).toString(), (ppowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicePowerState(hdevice: Handle, pfon: COpaquePointer?): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_getDevicePowerState((hdevice?.value ?: 0L).toString(), (pfon?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrCapabilities(lpspc: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_getPwrCapabilities((lpspc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrDiskSpindownRange(puimax: COpaquePointer?, puimin: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_getPwrDiskSpindownRange((puimax?.value ?: 0L).toString(), (puimin?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPowerStatus(lpsystempowerstatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_getSystemPowerStatus((lpsystempowerstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAdminOverrideActive(papp: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_isAdminOverrideActive((papp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrHibernateAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_isPwrHibernateAllowed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrShutdownAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_isPwrShutdownAllowed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrSuspendAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_isPwrSuspendAllowed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSystemResumeAutomatic(): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_isSystemResumeAutomatic() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme((schemeguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerClearRequest((powerrequest?.value ?: 0L).toString(), requesttype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerCreatePossibleSetting((rootsystempowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateRequest(context: COpaquePointer?): Handle =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerCreateRequest((context?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerCreateSetting((rootsystempowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerDeleteScheme((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerDeterminePlatformRole() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: COpaquePointer?, destinationschemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerDuplicateScheme((rootpowerkey?.value ?: 0L).toString(), (sourceschemeguid?.value ?: 0L).toString(), (destinationschemeguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, accessflags: PowerDataAccessor, index: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerEnumerate((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), accessflags, index.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerGetActiveScheme((userrootpowerkey?.value ?: 0L).toString(), (activepolicyguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerImportPowerScheme((rootpowerkey?.value ?: 0L).toString(), (importfilenamepath?.value ?: 0L).toString(), (destinationschemeguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerIsSettingRangeDefined(subkeyguid: COpaquePointer?, settingguid: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerIsSettingRangeDefined((subkeyguid?.value ?: 0L).toString(), (settingguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerOpenSystemPowerKey((phsystempowerkey?.value ?: 0L).toString(), access.toInt(), openexisting).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenUserPowerKey(phuserpowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerOpenUserPowerKey((phuserpowerkey?.value ?: 0L).toString(), access.toInt(), openexisting).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acdefaultindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadACDefaultIndex((rootpowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (acdefaultindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadACValue((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadACValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (acvalueindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcdefaultindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadDCDefaultIndex((rootpowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (dcdefaultindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadDCValue((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadDCValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (dcvalueindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadDescription((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadFriendlyName((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadIconResourceSpecifier((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadPossibleDescription((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadPossibleFriendlyName((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadPossibleValue((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadSettingAttributes((subgroupguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadValueIncrement((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (valueincrement?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadValueMax((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (valuemaximum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadValueMin((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (valueminimum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(version.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(flags.toInt(), (recipient?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerRemovePowerSetting((powersettingsubkeyguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReportThermalEvent(event: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerReportThermalEvent((event?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme((schemeguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerSetActiveScheme((userrootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerSetRequest((powerrequest?.value ?: 0L).toString(), requesttype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerSettingAccessCheck(accessflags, (powerguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: COpaquePointer?, accesstype: RegSamFlags): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerSettingAccessCheckEx(accessflags, (powerguid?.value ?: 0L).toString(), accesstype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingRegisterNotification(settingguid: COpaquePointer?, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerSettingRegisterNotification((settingguid?.value ?: 0L).toString(), flags.toInt(), (recipient?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerSettingUnregisterNotification(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications((registrationhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultacindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteACDefaultIndex((rootsystempowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), defaultacindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteACValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), acvalueindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultdcindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteDCDefaultIndex((rootsystempowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), defaultdcindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteDCValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), dcvalueindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteDescription((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteFriendlyName((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWritePossibleDescription((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWritePossibleFriendlyName((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: UInt, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWritePossibleValue((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), type.toInt(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?, attributes: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteSettingAttributes((subgroupguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), attributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteValueIncrement((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), valueincrement.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteValueMax((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), valuemaximum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteValueMin((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), valueminimum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_readGlobalPwrPolicy((pglobalpowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_readProcessorPwrScheme(uiid.toInt(), (pmachineprocessorpowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_readPwrScheme(uiid.toInt(), (ppowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: COpaquePointer?, flags: RegisterNotificationFlags): Hpowernotify =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_registerPowerSettingNotification((hrecipient?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_registerSuspendResumeNotification((hrecipient?.value ?: 0L).toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_requestWakeupLatency(latency) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_setActivePwrScheme(uiid.toInt(), (pglobalpowerpolicy?.value ?: 0L).toString(), (ppowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_setSuspendState(bhibernate, bforce, bwakeupeventsdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_setSystemPowerState(fsuspend, fforce) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_setThreadExecutionState(esflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_unregisterPowerSettingNotification(handle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(handle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validatePowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_validatePowerPolicies((pglobalpowerpolicy?.value ?: 0L).toString(), (ppowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_writeGlobalPwrPolicy((pglobalpowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_writeProcessorPwrScheme(uiid.toInt(), (pmachineprocessorpowerpolicy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePwrScheme(puiid: COpaquePointer?, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAvailable) _wasm_windowssys_windows_win32_system_power_writePwrScheme((puiid?.value ?: 0L).toString(), (lpszschemename?.value ?: 0L).toString(), (lpszdescription?.value ?: 0L).toString(), (lpscheme?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
