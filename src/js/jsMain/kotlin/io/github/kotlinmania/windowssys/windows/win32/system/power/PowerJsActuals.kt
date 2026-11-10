@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SystemPowerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_callNtPowerInformation(informationlevel, (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun canUserWritePwrScheme(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_canUserWritePwrScheme() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_deletePwrScheme(uiid.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerClose(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_devicePowerClose() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_devicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), (preturnbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_devicePowerOpen(debugmask.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_devicePowerSetDeviceState((devicedescription?.value ?: 0L).toString(), setflags.toInt(), (setdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_enumPwrSchemes(0L.toString(), lparam.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActivePwrScheme(puiid: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_getActivePwrScheme((puiid?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_getCurrentPowerPolicies((pglobalpowerpolicy?.value ?: 0L).toString(), (ppowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDevicePowerState(hdevice: Handle, pfon: COpaquePointer?): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_getDevicePowerState((hdevice?.value ?: 0L).toString(), (pfon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrCapabilities(lpspc: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_getPwrCapabilities((lpspc?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPwrDiskSpindownRange(puimax: COpaquePointer?, puimin: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_getPwrDiskSpindownRange((puimax?.value ?: 0L).toString(), (puimin?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPowerStatus(lpsystempowerstatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_getSystemPowerStatus((lpsystempowerstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAdminOverrideActive(papp: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_isAdminOverrideActive((papp?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrHibernateAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_isPwrHibernateAllowed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrShutdownAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_isPwrShutdownAllowed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isPwrSuspendAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_isPwrSuspendAllowed() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isSystemResumeAutomatic(): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_isSystemResumeAutomatic() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme((schemeguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerClearRequest((powerrequest?.value ?: 0L).toString(), requesttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerCreatePossibleSetting((rootsystempowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateRequest(context: COpaquePointer?): Handle =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerCreateRequest((context?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerCreateSetting((rootsystempowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerDeleteScheme((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerDeterminePlatformRole() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(version.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: COpaquePointer?, destinationschemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerDuplicateScheme((rootpowerkey?.value ?: 0L).toString(), (sourceschemeguid?.value ?: 0L).toString(), (destinationschemeguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, accessflags: PowerDataAccessor, index: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerEnumerate((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), accessflags, index.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerGetActiveScheme((userrootpowerkey?.value ?: 0L).toString(), (activepolicyguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerImportPowerScheme((rootpowerkey?.value ?: 0L).toString(), (importfilenamepath?.value ?: 0L).toString(), (destinationschemeguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerIsSettingRangeDefined(subkeyguid: COpaquePointer?, settingguid: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerIsSettingRangeDefined((subkeyguid?.value ?: 0L).toString(), (settingguid?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerOpenSystemPowerKey((phsystempowerkey?.value ?: 0L).toString(), access.toInt(), openexisting) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerOpenUserPowerKey(phuserpowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerOpenUserPowerKey((phuserpowerkey?.value ?: 0L).toString(), access.toInt(), openexisting) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acdefaultindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadACDefaultIndex((rootpowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (acdefaultindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadACValue((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadACValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (acvalueindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcdefaultindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadDCDefaultIndex((rootpowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (dcdefaultindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadDCValue((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadDCValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (dcvalueindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadDescription((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadFriendlyName((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadIconResourceSpecifier((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadPossibleDescription((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadPossibleFriendlyName((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadPossibleValue((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadSettingAttributes((subgroupguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadValueIncrement((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (valueincrement?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadValueMax((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (valuemaximum?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadValueMin((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (valueminimum?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(version.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(flags.toInt(), (recipient?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerRemovePowerSetting((powersettingsubkeyguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerReportThermalEvent(event: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerReportThermalEvent((event?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme((schemeguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerSetActiveScheme((userrootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerSetRequest((powerrequest?.value ?: 0L).toString(), requesttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerSettingAccessCheck(accessflags, (powerguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: COpaquePointer?, accesstype: RegSamFlags): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerSettingAccessCheckEx(accessflags, (powerguid?.value ?: 0L).toString(), accesstype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingRegisterNotification(settingguid: COpaquePointer?, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerSettingRegisterNotification((settingguid?.value ?: 0L).toString(), flags.toInt(), (recipient?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerSettingUnregisterNotification(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications((registrationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultacindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteACDefaultIndex((rootsystempowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), defaultacindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteACValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), acvalueindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultdcindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteDCDefaultIndex((rootsystempowerkey?.value ?: 0L).toString(), (schemepersonalityguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), defaultdcindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteDCValueIndex((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), dcvalueindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteDescription((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteFriendlyName((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier((rootpowerkey?.value ?: 0L).toString(), (schemeguid?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWritePossibleDescription((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWritePossibleFriendlyName((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: UInt, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWritePossibleValue((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), type.toInt(), possiblesettingindex.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?, attributes: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteSettingAttributes((subgroupguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), attributes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteValueIncrement((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), valueincrement.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteValueMax((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), valuemaximum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteValueMin((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), valueminimum.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier((rootpowerkey?.value ?: 0L).toString(), (subgroupofpowersettingsguid?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_readGlobalPwrPolicy((pglobalpowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_readProcessorPwrScheme(uiid.toInt(), (pmachineprocessorpowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_readPwrScheme(uiid.toInt(), (ppowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: COpaquePointer?, flags: RegisterNotificationFlags): Hpowernotify =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_registerPowerSettingNotification((hrecipient?.value ?: 0L).toString(), (powersettingguid?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_registerSuspendResumeNotification((hrecipient?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_requestWakeupLatency(latency) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_setActivePwrScheme(uiid.toInt(), (pglobalpowerpolicy?.value ?: 0L).toString(), (ppowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_setSuspendState(bhibernate, bforce, bwakeupeventsdisabled) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_setSystemPowerState(fsuspend, fforce) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_setThreadExecutionState(esflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_unregisterPowerSettingNotification(handle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(handle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validatePowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_validatePowerPolicies((pglobalpowerpolicy?.value ?: 0L).toString(), (ppowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_writeGlobalPwrPolicy((pglobalpowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_writeProcessorPwrScheme(uiid.toInt(), (pmachineprocessorpowerpolicy?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writePwrScheme(puiid: COpaquePointer?, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: COpaquePointer?): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_writePwrScheme((puiid?.value ?: 0L).toString(), (lpszschemename?.value ?: 0L).toString(), (lpszdescription?.value ?: 0L).toString(), (lpscheme?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")
