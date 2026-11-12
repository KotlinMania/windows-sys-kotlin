@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegSamFlags
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ReasonContext
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.RegisterNotificationFlags

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemPowerNapiAddon(): Boolean

private val windowsWin32SystemPowerNapiAvailable: Boolean = initWindowsWin32SystemPowerNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerCallNtPowerInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerCallNtPowerInformation(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerCanUserWritePwrScheme()")
private external fun wasmWindowssysWindowsWin32SystemPowerCanUserWritePwrScheme(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerDeletePwrScheme(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerDeletePwrScheme(p0: Int): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerDevicePowerClose()")
private external fun wasmWindowssysWindowsWin32SystemPowerDevicePowerClose(): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerDevicePowerEnumDevices(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerDevicePowerOpen(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerDevicePowerOpen(p0: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerEnumPwrSchemes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerEnumPwrSchemes(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerGetActivePwrScheme(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerGetActivePwrScheme(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerGetDevicePowerState(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerGetDevicePowerState(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerGetPwrCapabilities(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerGetPwrCapabilities(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerGetSystemPowerStatus(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerGetSystemPowerStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerIsAdminOverrideActive(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerIsAdminOverrideActive(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed()")
private external fun wasmWindowssysWindowsWin32SystemPowerIsPwrHibernateAllowed(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed()")
private external fun wasmWindowssysWindowsWin32SystemPowerIsPwrShutdownAllowed(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed()")
private external fun wasmWindowssysWindowsWin32SystemPowerIsPwrSuspendAllowed(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic()")
private external fun wasmWindowssysWindowsWin32SystemPowerIsSystemResumeAutomatic(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerClearRequest(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerClearRequest(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerCreateRequest(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerCreateRequest(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerCreateSetting(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerCreateSetting(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerDeleteScheme(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerDeleteScheme(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole()")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRole(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerDuplicateScheme(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerDuplicateScheme(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerEnumerate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerEnumerate(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerGetActiveScheme(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerGetActiveScheme(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerImportPowerScheme(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerImportPowerScheme(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadACValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadACValue(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadACValueIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadACValueIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadDCValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadDCValue(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadDCValueIndex(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadDescription(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadDescription(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadFriendlyName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadPossibleDescription(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadPossibleValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadPossibleValue(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadSettingAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadValueIncrement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadValueIncrement(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadValueMax(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadValueMax(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadValueMin(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadValueMin(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerRemovePowerSetting(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes()")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerReportThermalEvent(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerReportThermalEvent(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes()")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerSetActiveScheme(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerSetActiveScheme(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerSetRequest(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerSetRequest(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerSettingAccessCheck(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteACValueIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteDescription(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteDescription(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteFriendlyName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWritePossibleDescription(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWritePossibleValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWritePossibleValue(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteValueIncrement(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteValueMax(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteValueMax(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteValueMin(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteValueMin(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerReadProcessorPwrScheme(p0: Int, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerReadPwrScheme(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerReadPwrScheme(p0: Int, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerRequestWakeupLatency(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerRequestWakeupLatency(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerSetActivePwrScheme(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerSetActivePwrScheme(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerSetSuspendState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPowerSetSuspendState(p0: Boolean, p1: Boolean, p2: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerSetSystemPowerState(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerSetSystemPowerState(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerSetThreadExecutionState(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerSetThreadExecutionState(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerValidatePowerPolicies(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerValidatePowerPolicies(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(p0)")
private external fun wasmWindowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(p0: Int, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPowerWritePwrScheme(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPowerWritePwrScheme(p0: String, p1: String, p2: String, p3: String): Boolean

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerCallNtPowerInformation(informationlevel, inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canUserWritePwrScheme(): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerCanUserWritePwrScheme() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerDeletePwrScheme(uiid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerClose(): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerDevicePowerClose() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr<UByte>, pbuffersize: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerDevicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), preturnbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(devicedescription.rawAddress.toString(), setflags.toInt(), setdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerEnumPwrSchemes(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActivePwrScheme(puiid: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerGetActivePwrScheme(puiid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr<GlobalPowerPolicy>, ppowerpolicy: MutPtr<PowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(pglobalpowerpolicy.rawAddress.toString(), ppowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicePowerState(hdevice: Handle, pfon: MutPtr<Bool>): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerGetDevicePowerState(hdevice.rawAddress.toString(), pfon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrCapabilities(lpspc: MutPtr<SystemPowerCapabilities>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerGetPwrCapabilities(lpspc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrDiskSpindownRange(puimax: MutPtr<UInt>, puimin: MutPtr<UInt>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(puimax.rawAddress.toString(), puimin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPowerStatus(lpsystempowerstatus: MutPtr<SystemPowerStatus>): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerGetSystemPowerStatus(lpsystempowerstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAdminOverrideActive(papp: ConstPtr<AdministratorPowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerIsAdminOverrideActive(papp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrHibernateAllowed(): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerIsPwrHibernateAllowed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrShutdownAllowed(): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerIsPwrShutdownAllowed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrSuspendAllowed(): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerIsPwrSuspendAllowed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSystemResumeAutomatic(): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerIsSystemResumeAutomatic() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerClearRequest(powerrequest.rawAddress.toString(), requesttype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(rootsystempowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateRequest(context: ConstPtr<ReasonContext>): Handle =
    if (windowsWin32SystemPowerNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemPowerPowerCreateRequest(context.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerCreateSetting(rootsystempowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerDeleteScheme(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRole() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr<Guid>, destinationschemeguid: MutPtr<MutPtr<Guid>>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerDuplicateScheme(rootpowerkey.rawAddress.toString(), sourceschemeguid.rawAddress.toString(), destinationschemeguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerEnumerate(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), accessflags, index.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr<MutPtr<Guid>>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerGetActiveScheme(userrootpowerkey.rawAddress.toString(), activepolicyguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr<MutPtr<Guid>>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerImportPowerScheme(rootpowerkey.rawAddress.toString(), importfilenamepath.rawAddress.toString(), destinationschemeguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerIsSettingRangeDefined(subkeyguid: ConstPtr<Guid>, settingguid: ConstPtr<Guid>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(subkeyguid.rawAddress.toString(), settingguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr<Hkey>, access: UInt, openexisting: Bool): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(phsystempowerkey.rawAddress.toString(), access.toInt(), openexisting).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenUserPowerKey(phuserpowerkey: MutPtr<Hkey>, access: UInt, openexisting: Bool): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(phuserpowerkey.rawAddress.toString(), access.toInt(), openexisting).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acdefaultindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(rootpowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), acdefaultindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadACValue(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acvalueindex: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadACValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), acvalueindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcdefaultindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(rootpowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), dcdefaultindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadDCValue(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcvalueindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadDCValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), dcvalueindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadDescription(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadFriendlyName(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadPossibleDescription(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadPossibleValue(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadSettingAttributes(subgroupguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadSettingAttributes(subgroupguid.rawAddress.toString(), powersettingguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueincrement: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadValueIncrement(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueincrement.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valuemaximum: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadValueMax(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valuemaximum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueminimum: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadValueMin(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueminimum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr<CVoid>, registrationhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(version.toInt(), 0L.toString(), context.rawAddress.toString(), registrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(flags.toInt(), recipient.rawAddress.toString(), registrationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerRemovePowerSetting(powersettingsubkeyguid.rawAddress.toString(), powersettingguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReportThermalEvent(event: ConstPtr<ThermalEvent>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerReportThermalEvent(event.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerSetActiveScheme(userrootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerSetRequest(powerrequest.rawAddress.toString(), requesttype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerSettingAccessCheck(accessflags, powerguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr<Guid>, accesstype: RegSamFlags): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(accessflags, powerguid.rawAddress.toString(), accesstype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingRegisterNotification(settingguid: ConstPtr<Guid>, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(settingguid.rawAddress.toString(), flags.toInt(), recipient.rawAddress.toString(), registrationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(registrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, defaultacindex: UInt): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(rootsystempowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), defaultacindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acvalueindex: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteACValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), acvalueindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, defaultdcindex: UInt): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(rootsystempowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), defaultdcindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcvalueindex: UInt): UInt =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), dcvalueindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteDescription(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteFriendlyName(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWritePossibleDescription(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWritePossibleValue(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.toInt(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteSettingAttributes(subgroupguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, attributes: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(subgroupguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), attributes.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueincrement: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteValueIncrement(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueincrement.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valuemaximum: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteValueMax(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valuemaximum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueminimum: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteValueMin(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueminimum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(pglobalpowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr<MachineProcessorPowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerReadProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr<PowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerReadPwrScheme(uiid.toInt(), ppowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr<Guid>, flags: RegisterNotificationFlags): Hpowernotify =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(hrecipient.rawAddress.toString(), powersettingguid.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(hrecipient.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerRequestWakeupLatency(latency) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>, ppowerpolicy: ConstPtr<PowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerSetActivePwrScheme(uiid.toInt(), pglobalpowerpolicy.rawAddress.toString(), ppowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerSetSuspendState(bhibernate, bforce, bwakeupeventsdisabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend, fforce) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validatePowerPolicies(pglobalpowerpolicy: MutPtr<GlobalPowerPolicy>, ppowerpolicy: MutPtr<PowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerValidatePowerPolicies(pglobalpowerpolicy.rawAddress.toString(), ppowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(pglobalpowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr<MachineProcessorPowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePwrScheme(puiid: ConstPtr<UInt>, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr<PowerPolicy>): Boolean =
    if (windowsWin32SystemPowerNapiAvailable) wasmWindowssysWindowsWin32SystemPowerWritePwrScheme(puiid.rawAddress.toString(), lpszschemename.rawAddress.toString(), lpszdescription.rawAddress.toString(), lpscheme.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
