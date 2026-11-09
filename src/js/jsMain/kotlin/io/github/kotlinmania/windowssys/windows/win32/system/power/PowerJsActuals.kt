@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.system.registry.REG_SAM_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.REGISTER_NOTIFICATION_FLAGS

private val _windowsWin32SystemPowerNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CallNtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_CallNtPowerInformation(informationlevel, inputbuffer.toString(), inputbufferlength.toInt(), outputbuffer.toString(), outputbufferlength.toInt()) as Int) else 0

public actual fun CanUserWritePwrScheme(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_CanUserWritePwrScheme() as Boolean) else false

public actual fun DeletePwrScheme(uiid: UInt): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_DeletePwrScheme(uiid.toInt()) as Boolean) else false

public actual fun DevicePowerClose(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_DevicePowerClose() as Boolean) else false

public actual fun DevicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: Long, pbuffersize: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_DevicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), preturnbuffer.toString(), pbuffersize.toString()) as Boolean) else false

public actual fun DevicePowerOpen(debugmask: UInt): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_DevicePowerOpen(debugmask.toInt()) as Boolean) else false

public actual fun DevicePowerSetDeviceState(devicedescription: PCWSTR, setflags: UInt, setdata: Long): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_DevicePowerSetDeviceState(devicedescription.toString(), setflags.toInt(), setdata.toString()) as Int).toUInt() else 0u

public actual fun EnumPwrSchemes(lpfn: PWRSCHEMESENUMPROC, lparam: LPARAM): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_EnumPwrSchemes(lpfn.toLong().toString(), lparam.toString()) as Boolean) else false

public actual fun GetActivePwrScheme(puiid: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_GetActivePwrScheme(puiid.toString()) as Boolean) else false

public actual fun GetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_GetCurrentPowerPolicies(pglobalpowerpolicy.toString(), ppowerpolicy.toString()) as Boolean) else false

public actual fun GetDevicePowerState(hdevice: HANDLE, pfon: Long): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_GetDevicePowerState(hdevice.toString(), pfon.toString()) as Int) else 0

public actual fun GetPwrCapabilities(lpspc: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_GetPwrCapabilities(lpspc.toString()) as Boolean) else false

public actual fun GetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_GetPwrDiskSpindownRange(puimax.toString(), puimin.toString()) as Boolean) else false

public actual fun GetSystemPowerStatus(lpsystempowerstatus: Long): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_GetSystemPowerStatus(lpsystempowerstatus.toString()) as Int) else 0

public actual fun IsAdminOverrideActive(papp: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_IsAdminOverrideActive(papp.toString()) as Boolean) else false

public actual fun IsPwrHibernateAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_IsPwrHibernateAllowed() as Boolean) else false

public actual fun IsPwrShutdownAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_IsPwrShutdownAllowed() as Boolean) else false

public actual fun IsPwrSuspendAllowed(): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_IsPwrSuspendAllowed() as Boolean) else false

public actual fun IsSystemResumeAutomatic(): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_IsSystemResumeAutomatic() as Int) else 0

public actual fun PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerCanRestoreIndividualDefaultPowerScheme(schemeguid.toString()) as Int).toUInt() else 0u

public actual fun PowerClearRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerClearRequest(powerrequest.toString(), requesttype) as Int) else 0

public actual fun PowerCreatePossibleSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerCreatePossibleSetting(rootsystempowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), possiblesettingindex.toInt()) as Int).toUInt() else 0u

public actual fun PowerCreateRequest(context: Long): HANDLE =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerCreateRequest(context.toString()) as String).toLong() else 0L

public actual fun PowerCreateSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerCreateSetting(rootsystempowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString()) as Int).toUInt() else 0u

public actual fun PowerDeleteScheme(rootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerDeleteScheme(rootpowerkey.toString(), schemeguid.toString()) as Int).toUInt() else 0u

public actual fun PowerDeterminePlatformRole(): POWER_PLATFORM_ROLE =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerDeterminePlatformRole() as Int) else 0

public actual fun PowerDeterminePlatformRoleEx(version: POWER_PLATFORM_ROLE_VERSION): POWER_PLATFORM_ROLE =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerDeterminePlatformRoleEx(version.toInt()) as Int) else 0

public actual fun PowerDuplicateScheme(rootpowerkey: HKEY, sourceschemeguid: Long, destinationschemeguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerDuplicateScheme(rootpowerkey.toString(), sourceschemeguid.toString(), destinationschemeguid.toString()) as Int).toUInt() else 0u

public actual fun PowerEnumerate(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: POWER_DATA_ACCESSOR, index: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerEnumerate(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), accessflags, index.toInt(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerGetActiveScheme(userrootpowerkey: HKEY, activepolicyguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerGetActiveScheme(userrootpowerkey.toString(), activepolicyguid.toString()) as Int).toUInt() else 0u

public actual fun PowerImportPowerScheme(rootpowerkey: HKEY, importfilenamepath: PCWSTR, destinationschemeguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerImportPowerScheme(rootpowerkey.toString(), importfilenamepath.toString(), destinationschemeguid.toString()) as Int).toUInt() else 0u

public actual fun PowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerIsSettingRangeDefined(subkeyguid.toString(), settingguid.toString()) as Boolean) else false

public actual fun PowerOpenSystemPowerKey(phsystempowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerOpenSystemPowerKey(phsystempowerkey.toString(), access.toInt(), openexisting) as Int).toUInt() else 0u

public actual fun PowerOpenUserPowerKey(phuserpowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerOpenUserPowerKey(phuserpowerkey.toString(), access.toInt(), openexisting) as Int).toUInt() else 0u

public actual fun PowerReadACDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadACDefaultIndex(rootpowerkey.toString(), schemepersonalityguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), acdefaultindex.toString()) as Int).toUInt() else 0u

public actual fun PowerReadACValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadACValue(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), type.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadACValueIndex(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), acvalueindex.toString()) as Int).toUInt() else 0u

public actual fun PowerReadDCDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadDCDefaultIndex(rootpowerkey.toString(), schemepersonalityguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), dcdefaultindex.toString()) as Int).toUInt() else 0u

public actual fun PowerReadDCValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadDCValue(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), type.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadDCValueIndex(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), dcvalueindex.toString()) as Int).toUInt() else 0u

public actual fun PowerReadDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadDescription(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadFriendlyName(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadIconResourceSpecifier(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadPossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadPossibleDescription(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), possiblesettingindex.toInt(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadPossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadPossibleFriendlyName(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), possiblesettingindex.toInt(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadPossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadPossibleValue(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), type.toString(), possiblesettingindex.toInt(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadSettingAttributes(subgroupguid.toString(), powersettingguid.toString()) as Int).toUInt() else 0u

public actual fun PowerReadValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadValueIncrement(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), valueincrement.toString()) as Int).toUInt() else 0u

public actual fun PowerReadValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadValueMax(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), valuemaximum.toString()) as Int).toUInt() else 0u

public actual fun PowerReadValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadValueMin(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), valueminimum.toString()) as Int).toUInt() else 0u

public actual fun PowerReadValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReadValueUnitsSpecifier(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun PowerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EFFECTIVE_POWER_MODE_CALLBACK, context: Long, registrationhandle: Long): HRESULT =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerRegisterForEffectivePowerModeNotifications(version.toInt(), callback.toLong().toString(), context.toString(), registrationhandle.toString()) as Int) else 0

public actual fun PowerRegisterSuspendResumeNotification(flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerRegisterSuspendResumeNotification(flags.toInt(), recipient.toString(), registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerRemovePowerSetting(powersettingsubkeyguid.toString(), powersettingguid.toString()) as Int).toUInt() else 0u

public actual fun PowerReplaceDefaultPowerSchemes(): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReplaceDefaultPowerSchemes() as Int).toUInt() else 0u

public actual fun PowerReportThermalEvent(event: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerReportThermalEvent(event.toString()) as Int).toUInt() else 0u

public actual fun PowerRestoreDefaultPowerSchemes(): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerRestoreDefaultPowerSchemes() as Int).toUInt() else 0u

public actual fun PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerRestoreIndividualDefaultPowerScheme(schemeguid.toString()) as Int).toUInt() else 0u

public actual fun PowerSetActiveScheme(userrootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerSetActiveScheme(userrootpowerkey.toString(), schemeguid.toString()) as Int).toUInt() else 0u

public actual fun PowerSetRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerSetRequest(powerrequest.toString(), requesttype) as Int) else 0

public actual fun PowerSettingAccessCheck(accessflags: POWER_DATA_ACCESSOR, powerguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerSettingAccessCheck(accessflags, powerguid.toString()) as Int).toUInt() else 0u

public actual fun PowerSettingAccessCheckEx(accessflags: POWER_DATA_ACCESSOR, powerguid: Long, accesstype: REG_SAM_FLAGS): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerSettingAccessCheckEx(accessflags, powerguid.toString(), accesstype.toInt()) as Int).toUInt() else 0u

public actual fun PowerSettingRegisterNotification(settingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerSettingRegisterNotification(settingguid.toString(), flags.toInt(), recipient.toString(), registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun PowerSettingUnregisterNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerSettingUnregisterNotification(registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): HRESULT =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle.toString()) as Int) else 0

public actual fun PowerUnregisterSuspendResumeNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerUnregisterSuspendResumeNotification(registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun PowerWriteACDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteACDefaultIndex(rootsystempowerkey.toString(), schemepersonalityguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), defaultacindex.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteACValueIndex(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), acvalueindex.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteDCDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteDCDefaultIndex(rootsystempowerkey.toString(), schemepersonalityguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), defaultdcindex.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: UInt): UInt =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteDCValueIndex(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), dcvalueindex.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteDescription(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteFriendlyName(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteIconResourceSpecifier(rootpowerkey.toString(), schemeguid.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun PowerWritePossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWritePossibleDescription(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), possiblesettingindex.toInt(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun PowerWritePossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWritePossibleFriendlyName(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), possiblesettingindex.toInt(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun PowerWritePossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: UInt, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWritePossibleValue(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), type.toInt(), possiblesettingindex.toInt(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteSettingAttributes(subgroupguid.toString(), powersettingguid.toString(), attributes.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteValueIncrement(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), valueincrement.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteValueMax(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), valuemaximum.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteValueMin(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), valueminimum.toInt()) as Int).toUInt() else 0u

public actual fun PowerWriteValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_PowerWriteValueUnitsSpecifier(rootpowerkey.toString(), subgroupofpowersettingsguid.toString(), powersettingguid.toString(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun ReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_ReadGlobalPwrPolicy(pglobalpowerpolicy.toString()) as Boolean) else false

public actual fun ReadProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_ReadProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.toString()) as Boolean) else false

public actual fun ReadPwrScheme(uiid: UInt, ppowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_ReadPwrScheme(uiid.toInt(), ppowerpolicy.toString()) as Boolean) else false

public actual fun RegisterPowerSettingNotification(hrecipient: HANDLE, powersettingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_RegisterPowerSettingNotification(hrecipient.toString(), powersettingguid.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun RegisterSuspendResumeNotification(hrecipient: HANDLE, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_RegisterSuspendResumeNotification(hrecipient.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun RequestWakeupLatency(latency: LATENCY_TIME): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_RequestWakeupLatency(latency) as Int) else 0

public actual fun SetActivePwrScheme(uiid: UInt, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_SetActivePwrScheme(uiid.toInt(), pglobalpowerpolicy.toString(), ppowerpolicy.toString()) as Boolean) else false

public actual fun SetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_SetSuspendState(bhibernate, bforce, bwakeupeventsdisabled) as Boolean) else false

public actual fun SetSystemPowerState(fsuspend: BOOL, fforce: BOOL): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_SetSystemPowerState(fsuspend, fforce) as Int) else 0

public actual fun SetThreadExecutionState(esflags: EXECUTION_STATE): EXECUTION_STATE =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_SetThreadExecutionState(esflags.toInt()) as Int).toUInt() else 0u

public actual fun UnregisterPowerSettingNotification(handle: HPOWERNOTIFY): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_UnregisterPowerSettingNotification(handle.toString()) as Int) else 0

public actual fun UnregisterSuspendResumeNotification(handle: HPOWERNOTIFY): BOOL =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_UnregisterSuspendResumeNotification(handle.toString()) as Int) else 0

public actual fun ValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_ValidatePowerPolicies(pglobalpowerpolicy.toString(), ppowerpolicy.toString()) as Boolean) else false

public actual fun WriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_WriteGlobalPwrPolicy(pglobalpowerpolicy.toString()) as Boolean) else false

public actual fun WriteProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_WriteProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.toString()) as Boolean) else false

public actual fun WritePwrScheme(puiid: Long, lpszschemename: PCWSTR, lpszdescription: PCWSTR, lpscheme: Long): Boolean =
    if (_windowsWin32SystemPowerNapiAddon != null) (_windowsWin32SystemPowerNapiAddon.windowssys_windows_win32_system_power_WritePwrScheme(puiid.toString(), lpszschemename.toString(), lpszdescription.toString(), lpscheme.toString()) as Boolean) else false
