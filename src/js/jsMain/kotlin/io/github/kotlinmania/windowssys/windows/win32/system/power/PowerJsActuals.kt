@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32SystemPowerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerCallNtPowerInformation(informationlevel, inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canUserWritePwrScheme(): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerCanUserWritePwrScheme() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerDeletePwrScheme(uiid.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerClose(): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerDevicePowerClose() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr, pbuffersize: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), preturnbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(devicedescription.rawAddress.toString(), setflags.toInt(), setdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerEnumPwrSchemes(0L.toString(), lparam.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActivePwrScheme(puiid: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerGetActivePwrScheme(puiid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(pglobalpowerpolicy.rawAddress.toString(), ppowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicePowerState(hdevice: Handle, pfon: MutPtr): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerGetDevicePowerState(hdevice.rawAddress.toString(), pfon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrCapabilities(lpspc: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerGetPwrCapabilities(lpspc.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrDiskSpindownRange(puimax: MutPtr, puimin: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(puimax.rawAddress.toString(), puimin.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPowerStatus(lpsystempowerstatus: MutPtr): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerGetSystemPowerStatus(lpsystempowerstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAdminOverrideActive(papp: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerIsAdminOverrideActive(papp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrHibernateAllowed(): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrShutdownAllowed(): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrSuspendAllowed(): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSystemResumeAutomatic(): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerClearRequest(powerrequest.rawAddress.toString(), requesttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(rootsystempowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateRequest(context: ConstPtr): Handle =
    if (windowsWin32SystemPowerNapiAddon != null) MutPtr((windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerCreateRequest(context.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerCreateSetting(rootsystempowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerDeleteScheme(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr, destinationschemeguid: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerDuplicateScheme(rootpowerkey.rawAddress.toString(), sourceschemeguid.rawAddress.toString(), destinationschemeguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerEnumerate(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), accessflags, index.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerGetActiveScheme(userrootpowerkey.rawAddress.toString(), activepolicyguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerImportPowerScheme(rootpowerkey.rawAddress.toString(), importfilenamepath.rawAddress.toString(), destinationschemeguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerIsSettingRangeDefined(subkeyguid: ConstPtr, settingguid: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(subkeyguid.rawAddress.toString(), settingguid.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(phsystempowerkey.rawAddress.toString(), access.toInt(), openexisting) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenUserPowerKey(phuserpowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(phuserpowerkey.rawAddress.toString(), access.toInt(), openexisting) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acdefaultindex: MutPtr): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(rootpowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), acdefaultindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadACValue(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadACValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), acvalueindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcdefaultindex: MutPtr): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(rootpowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), dcdefaultindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadDCValue(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: MutPtr): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), dcvalueindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadDescription(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadFriendlyName(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadPossibleValue(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(subgroupguid.rawAddress.toString(), powersettingguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadValueIncrement(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueincrement.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadValueMax(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valuemaximum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadValueMin(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueminimum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr, registrationhandle: MutPtr): Hresult =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(version.toInt(), 0L.toString(), context.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(flags.toInt(), recipient.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(powersettingsubkeyguid.rawAddress.toString(), powersettingguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReportThermalEvent(event: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerReportThermalEvent(event.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerSetActiveScheme(userrootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerSetRequest(powerrequest.rawAddress.toString(), requesttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(accessflags, powerguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr, accesstype: RegSamFlags): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(accessflags, powerguid.rawAddress.toString(), accesstype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingRegisterNotification(settingguid: ConstPtr, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(settingguid.rawAddress.toString(), flags.toInt(), recipient.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr): Hresult =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(registrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultacindex: UInt): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(rootsystempowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), defaultacindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), acvalueindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultdcindex: UInt): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(rootsystempowerkey.rawAddress.toString(), schemepersonalityguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), defaultdcindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: UInt): UInt =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), dcvalueindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteDescription(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(rootpowerkey.rawAddress.toString(), schemeguid.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWritePossibleValue(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), type.toInt(), possiblesettingindex.toInt(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr, attributes: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(subgroupguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), attributes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueincrement.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteValueMax(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valuemaximum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteValueMin(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), valueminimum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(rootpowerkey.rawAddress.toString(), subgroupofpowersettingsguid.rawAddress.toString(), powersettingguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(pglobalpowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerReadPwrScheme(uiid.toInt(), ppowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr, flags: RegisterNotificationFlags): Hpowernotify =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(hrecipient.rawAddress.toString(), powersettingguid.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(hrecipient.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerRequestWakeupLatency(latency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr, ppowerpolicy: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerSetActivePwrScheme(uiid.toInt(), pglobalpowerpolicy.rawAddress.toString(), ppowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerSetSuspendState(bhibernate, bforce, bwakeupeventsdisabled) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend, fforce) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validatePowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerValidatePowerPolicies(pglobalpowerpolicy.rawAddress.toString(), ppowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(pglobalpowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePwrScheme(puiid: ConstPtr, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr): Boolean =
    if (windowsWin32SystemPowerNapiAddon != null) (windowsWin32SystemPowerNapiAddon.windowssysWindowsWin32SystemPowerWritePwrScheme(puiid.rawAddress.toString(), lpszschemename.rawAddress.toString(), lpszdescription.rawAddress.toString(), lpscheme.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")
