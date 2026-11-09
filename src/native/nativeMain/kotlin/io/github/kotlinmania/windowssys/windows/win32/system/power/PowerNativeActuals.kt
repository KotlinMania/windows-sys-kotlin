@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CallNtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_CallNtPowerInformation(informationlevel, inputbuffer.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.toCPointer<ByteVar>(), outputbufferlength)

public actual fun CanUserWritePwrScheme(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_CanUserWritePwrScheme()

public actual fun DeletePwrScheme(uiid: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_DeletePwrScheme(uiid)

public actual fun DevicePowerClose(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_DevicePowerClose()

public actual fun DevicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: Long, pbuffersize: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_DevicePowerEnumDevices(queryindex, queryinterpretationflags, queryflags, preturnbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>())

public actual fun DevicePowerOpen(debugmask: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_DevicePowerOpen(debugmask)

public actual fun DevicePowerSetDeviceState(devicedescription: PCWSTR, setflags: UInt, setdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_DevicePowerSetDeviceState(devicedescription.toCPointer<ByteVar>(), setflags, setdata.toCPointer<ByteVar>())

public actual fun EnumPwrSchemes(lpfn: PWRSCHEMESENUMPROC, lparam: LPARAM): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_EnumPwrSchemes(lpfn.toLong().toCPointer<ByteVar>(), lparam)

public actual fun GetActivePwrScheme(puiid: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_GetActivePwrScheme(puiid.toCPointer<ByteVar>())

public actual fun GetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_GetCurrentPowerPolicies(pglobalpowerpolicy.toCPointer<ByteVar>(), ppowerpolicy.toCPointer<ByteVar>())

public actual fun GetDevicePowerState(hdevice: HANDLE, pfon: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_GetDevicePowerState(hdevice.toCPointer<ByteVar>(), pfon.toCPointer<ByteVar>())

public actual fun GetPwrCapabilities(lpspc: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_GetPwrCapabilities(lpspc.toCPointer<ByteVar>())

public actual fun GetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_GetPwrDiskSpindownRange(puimax.toCPointer<ByteVar>(), puimin.toCPointer<ByteVar>())

public actual fun GetSystemPowerStatus(lpsystempowerstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_GetSystemPowerStatus(lpsystempowerstatus.toCPointer<ByteVar>())

public actual fun IsAdminOverrideActive(papp: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_IsAdminOverrideActive(papp.toCPointer<ByteVar>())

public actual fun IsPwrHibernateAllowed(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_IsPwrHibernateAllowed()

public actual fun IsPwrShutdownAllowed(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_IsPwrShutdownAllowed()

public actual fun IsPwrSuspendAllowed(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_IsPwrSuspendAllowed()

public actual fun IsSystemResumeAutomatic(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_IsSystemResumeAutomatic()

public actual fun PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerCanRestoreIndividualDefaultPowerScheme(schemeguid.toCPointer<ByteVar>())

public actual fun PowerClearRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerClearRequest(powerrequest.toCPointer<ByteVar>(), requesttype)

public actual fun PowerCreatePossibleSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerCreatePossibleSetting(rootsystempowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), possiblesettingindex)

public actual fun PowerCreateRequest(context: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerCreateRequest(context.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PowerCreateSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerCreateSetting(rootsystempowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>())

public actual fun PowerDeleteScheme(rootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerDeleteScheme(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>())

public actual fun PowerDeterminePlatformRole(): POWER_PLATFORM_ROLE =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerDeterminePlatformRole()

public actual fun PowerDeterminePlatformRoleEx(version: POWER_PLATFORM_ROLE_VERSION): POWER_PLATFORM_ROLE =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerDeterminePlatformRoleEx(version)

public actual fun PowerDuplicateScheme(rootpowerkey: HKEY, sourceschemeguid: Long, destinationschemeguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerDuplicateScheme(rootpowerkey.toCPointer<ByteVar>(), sourceschemeguid.toCPointer<ByteVar>(), destinationschemeguid.toCPointer<ByteVar>())

public actual fun PowerEnumerate(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: POWER_DATA_ACCESSOR, index: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerEnumerate(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), accessflags, index, buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerGetActiveScheme(userrootpowerkey: HKEY, activepolicyguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerGetActiveScheme(userrootpowerkey.toCPointer<ByteVar>(), activepolicyguid.toCPointer<ByteVar>())

public actual fun PowerImportPowerScheme(rootpowerkey: HKEY, importfilenamepath: PCWSTR, destinationschemeguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerImportPowerScheme(rootpowerkey.toCPointer<ByteVar>(), importfilenamepath.toCPointer<ByteVar>(), destinationschemeguid.toCPointer<ByteVar>())

public actual fun PowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerIsSettingRangeDefined(subkeyguid.toCPointer<ByteVar>(), settingguid.toCPointer<ByteVar>())

public actual fun PowerOpenSystemPowerKey(phsystempowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerOpenSystemPowerKey(phsystempowerkey.toCPointer<ByteVar>(), access, openexisting)

public actual fun PowerOpenUserPowerKey(phuserpowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerOpenUserPowerKey(phuserpowerkey.toCPointer<ByteVar>(), access, openexisting)

public actual fun PowerReadACDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadACDefaultIndex(rootpowerkey.toCPointer<ByteVar>(), schemepersonalityguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), acdefaultindex.toCPointer<ByteVar>())

public actual fun PowerReadACValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadACValue(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), type.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadACValueIndex(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), acvalueindex.toCPointer<ByteVar>())

public actual fun PowerReadDCDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadDCDefaultIndex(rootpowerkey.toCPointer<ByteVar>(), schemepersonalityguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), dcdefaultindex.toCPointer<ByteVar>())

public actual fun PowerReadDCValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadDCValue(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), type.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadDCValueIndex(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), dcvalueindex.toCPointer<ByteVar>())

public actual fun PowerReadDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadDescription(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadFriendlyName(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadIconResourceSpecifier(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadPossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadPossibleDescription(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), possiblesettingindex, buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadPossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadPossibleFriendlyName(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), possiblesettingindex, buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadPossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadPossibleValue(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), type.toCPointer<ByteVar>(), possiblesettingindex, buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadSettingAttributes(subgroupguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>())

public actual fun PowerReadValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadValueIncrement(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), valueincrement.toCPointer<ByteVar>())

public actual fun PowerReadValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadValueMax(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), valuemaximum.toCPointer<ByteVar>())

public actual fun PowerReadValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadValueMin(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), valueminimum.toCPointer<ByteVar>())

public actual fun PowerReadValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReadValueUnitsSpecifier(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun PowerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EFFECTIVE_POWER_MODE_CALLBACK, context: Long, registrationhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerRegisterForEffectivePowerModeNotifications(version, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun PowerRegisterSuspendResumeNotification(flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerRegisterSuspendResumeNotification(flags, recipient.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerRemovePowerSetting(powersettingsubkeyguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>())

public actual fun PowerReplaceDefaultPowerSchemes(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReplaceDefaultPowerSchemes()

public actual fun PowerReportThermalEvent(event: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerReportThermalEvent(event.toCPointer<ByteVar>())

public actual fun PowerRestoreDefaultPowerSchemes(): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerRestoreDefaultPowerSchemes()

public actual fun PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerRestoreIndividualDefaultPowerScheme(schemeguid.toCPointer<ByteVar>())

public actual fun PowerSetActiveScheme(userrootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerSetActiveScheme(userrootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>())

public actual fun PowerSetRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerSetRequest(powerrequest.toCPointer<ByteVar>(), requesttype)

public actual fun PowerSettingAccessCheck(accessflags: POWER_DATA_ACCESSOR, powerguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerSettingAccessCheck(accessflags, powerguid.toCPointer<ByteVar>())

public actual fun PowerSettingAccessCheckEx(accessflags: POWER_DATA_ACCESSOR, powerguid: Long, accesstype: REG_SAM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerSettingAccessCheckEx(accessflags, powerguid.toCPointer<ByteVar>(), accesstype)

public actual fun PowerSettingRegisterNotification(settingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerSettingRegisterNotification(settingguid.toCPointer<ByteVar>(), flags, recipient.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun PowerSettingUnregisterNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerSettingUnregisterNotification(registrationhandle)

public actual fun PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle.toCPointer<ByteVar>())

public actual fun PowerUnregisterSuspendResumeNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerUnregisterSuspendResumeNotification(registrationhandle)

public actual fun PowerWriteACDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteACDefaultIndex(rootsystempowerkey.toCPointer<ByteVar>(), schemepersonalityguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), defaultacindex)

public actual fun PowerWriteACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteACValueIndex(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), acvalueindex)

public actual fun PowerWriteDCDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteDCDefaultIndex(rootsystempowerkey.toCPointer<ByteVar>(), schemepersonalityguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), defaultdcindex)

public actual fun PowerWriteDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteDCValueIndex(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), dcvalueindex)

public actual fun PowerWriteDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteDescription(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize)

public actual fun PowerWriteFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteFriendlyName(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize)

public actual fun PowerWriteIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteIconResourceSpecifier(rootpowerkey.toCPointer<ByteVar>(), schemeguid.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize)

public actual fun PowerWritePossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWritePossibleDescription(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), possiblesettingindex, buffer.toCPointer<ByteVar>(), buffersize)

public actual fun PowerWritePossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWritePossibleFriendlyName(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), possiblesettingindex, buffer.toCPointer<ByteVar>(), buffersize)

public actual fun PowerWritePossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: UInt, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWritePossibleValue(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), type, possiblesettingindex, buffer.toCPointer<ByteVar>(), buffersize)

public actual fun PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteSettingAttributes(subgroupguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), attributes)

public actual fun PowerWriteValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteValueIncrement(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), valueincrement)

public actual fun PowerWriteValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteValueMax(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), valuemaximum)

public actual fun PowerWriteValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteValueMin(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), valueminimum)

public actual fun PowerWriteValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_PowerWriteValueUnitsSpecifier(rootpowerkey.toCPointer<ByteVar>(), subgroupofpowersettingsguid.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize)

public actual fun ReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_ReadGlobalPwrPolicy(pglobalpowerpolicy.toCPointer<ByteVar>())

public actual fun ReadProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_ReadProcessorPwrScheme(uiid, pmachineprocessorpowerpolicy.toCPointer<ByteVar>())

public actual fun ReadPwrScheme(uiid: UInt, ppowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_ReadPwrScheme(uiid, ppowerpolicy.toCPointer<ByteVar>())

public actual fun RegisterPowerSettingNotification(hrecipient: HANDLE, powersettingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_RegisterPowerSettingNotification(hrecipient.toCPointer<ByteVar>(), powersettingguid.toCPointer<ByteVar>(), flags)

public actual fun RegisterSuspendResumeNotification(hrecipient: HANDLE, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_RegisterSuspendResumeNotification(hrecipient.toCPointer<ByteVar>(), flags)

public actual fun RequestWakeupLatency(latency: LATENCY_TIME): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_RequestWakeupLatency(latency)

public actual fun SetActivePwrScheme(uiid: UInt, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_SetActivePwrScheme(uiid, pglobalpowerpolicy.toCPointer<ByteVar>(), ppowerpolicy.toCPointer<ByteVar>())

public actual fun SetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_SetSuspendState(bhibernate, bforce, bwakeupeventsdisabled)

public actual fun SetSystemPowerState(fsuspend: BOOL, fforce: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_SetSystemPowerState(fsuspend, fforce)

public actual fun SetThreadExecutionState(esflags: EXECUTION_STATE): EXECUTION_STATE =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_SetThreadExecutionState(esflags)

public actual fun UnregisterPowerSettingNotification(handle: HPOWERNOTIFY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_UnregisterPowerSettingNotification(handle)

public actual fun UnregisterSuspendResumeNotification(handle: HPOWERNOTIFY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_UnregisterSuspendResumeNotification(handle)

public actual fun ValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_ValidatePowerPolicies(pglobalpowerpolicy.toCPointer<ByteVar>(), ppowerpolicy.toCPointer<ByteVar>())

public actual fun WriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_WriteGlobalPwrPolicy(pglobalpowerpolicy.toCPointer<ByteVar>())

public actual fun WriteProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_WriteProcessorPwrScheme(uiid, pmachineprocessorpowerpolicy.toCPointer<ByteVar>())

public actual fun WritePwrScheme(puiid: Long, lpszschemename: PCWSTR, lpszdescription: PCWSTR, lpscheme: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_WritePwrScheme(puiid.toCPointer<ByteVar>(), lpszschemename.toCPointer<ByteVar>(), lpszdescription.toCPointer<ByteVar>(), lpscheme.toCPointer<ByteVar>())
