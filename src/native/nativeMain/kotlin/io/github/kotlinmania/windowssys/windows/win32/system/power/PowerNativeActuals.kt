@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_callNtPowerInformation(informationlevel, inputbuffer?.value?.toCPointer<ByteVar>(), inputbufferlength, outputbuffer?.value?.toCPointer<ByteVar>(), outputbufferlength)

public actual fun canUserWritePwrScheme(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_canUserWritePwrScheme()

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_deletePwrScheme(uiid)

public actual fun devicePowerClose(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_devicePowerClose()

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_devicePowerEnumDevices(queryindex, queryinterpretationflags, queryflags, preturnbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>())

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_devicePowerOpen(debugmask)

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_devicePowerSetDeviceState(devicedescription?.value?.toCPointer<ByteVar>(), setflags, setdata?.value?.toCPointer<ByteVar>())

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_enumPwrSchemes(0L.toCPointer<ByteVar>(), lparam)

public actual fun getActivePwrScheme(puiid: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_getActivePwrScheme(puiid?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_getCurrentPowerPolicies(pglobalpowerpolicy?.value?.toCPointer<ByteVar>(), ppowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun getDevicePowerState(hdevice: Handle, pfon: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_getDevicePowerState(hdevice?.value?.toCPointer<ByteVar>(), pfon?.value?.toCPointer<ByteVar>())

public actual fun getPwrCapabilities(lpspc: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_getPwrCapabilities(lpspc?.value?.toCPointer<ByteVar>())

public actual fun getPwrDiskSpindownRange(puimax: COpaquePointer?, puimin: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_getPwrDiskSpindownRange(puimax?.value?.toCPointer<ByteVar>(), puimin?.value?.toCPointer<ByteVar>())

public actual fun getSystemPowerStatus(lpsystempowerstatus: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_getSystemPowerStatus(lpsystempowerstatus?.value?.toCPointer<ByteVar>())

public actual fun isAdminOverrideActive(papp: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_isAdminOverrideActive(papp?.value?.toCPointer<ByteVar>())

public actual fun isPwrHibernateAllowed(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_isPwrHibernateAllowed()

public actual fun isPwrShutdownAllowed(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_isPwrShutdownAllowed()

public actual fun isPwrSuspendAllowed(): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_isPwrSuspendAllowed()

public actual fun isSystemResumeAutomatic(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_isSystemResumeAutomatic()

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme(schemeguid?.value?.toCPointer<ByteVar>())

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerClearRequest(powerrequest?.value?.toCPointer<ByteVar>(), requesttype)

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerCreatePossibleSetting(rootsystempowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), possiblesettingindex)

public actual fun powerCreateRequest(context: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerCreateRequest(context?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerCreateSetting(rootsystempowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>())

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerDeleteScheme(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>())

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerDeterminePlatformRole()

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(version)

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: COpaquePointer?, destinationschemeguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerDuplicateScheme(rootpowerkey?.value?.toCPointer<ByteVar>(), sourceschemeguid?.value?.toCPointer<ByteVar>(), destinationschemeguid?.value?.toCPointer<ByteVar>())

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, accessflags: PowerDataAccessor, index: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerEnumerate(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), accessflags, index, buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerGetActiveScheme(userrootpowerkey?.value?.toCPointer<ByteVar>(), activepolicyguid?.value?.toCPointer<ByteVar>())

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerImportPowerScheme(rootpowerkey?.value?.toCPointer<ByteVar>(), importfilenamepath?.value?.toCPointer<ByteVar>(), destinationschemeguid?.value?.toCPointer<ByteVar>())

public actual fun powerIsSettingRangeDefined(subkeyguid: COpaquePointer?, settingguid: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerIsSettingRangeDefined(subkeyguid?.value?.toCPointer<ByteVar>(), settingguid?.value?.toCPointer<ByteVar>())

public actual fun powerOpenSystemPowerKey(phsystempowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerOpenSystemPowerKey(phsystempowerkey?.value?.toCPointer<ByteVar>(), access, openexisting)

public actual fun powerOpenUserPowerKey(phuserpowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerOpenUserPowerKey(phuserpowerkey?.value?.toCPointer<ByteVar>(), access, openexisting)

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acdefaultindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadACDefaultIndex(rootpowerkey?.value?.toCPointer<ByteVar>(), schemepersonalityguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), acdefaultindex?.value?.toCPointer<ByteVar>())

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadACValue(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadACValueIndex(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), acvalueindex?.value?.toCPointer<ByteVar>())

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcdefaultindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadDCDefaultIndex(rootpowerkey?.value?.toCPointer<ByteVar>(), schemepersonalityguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), dcdefaultindex?.value?.toCPointer<ByteVar>())

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadDCValue(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadDCValueIndex(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), dcvalueindex?.value?.toCPointer<ByteVar>())

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadDescription(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadFriendlyName(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadIconResourceSpecifier(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadPossibleDescription(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), possiblesettingindex, buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadPossibleFriendlyName(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), possiblesettingindex, buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadPossibleValue(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), possiblesettingindex, buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerReadSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadSettingAttributes(subgroupguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>())

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadValueIncrement(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), valueincrement?.value?.toCPointer<ByteVar>())

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadValueMax(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), valuemaximum?.value?.toCPointer<ByteVar>())

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadValueMin(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), valueminimum?.value?.toCPointer<ByteVar>())

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(version, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(flags, recipient?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerRemovePowerSetting(powersettingsubkeyguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>())

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes()

public actual fun powerReportThermalEvent(event: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerReportThermalEvent(event?.value?.toCPointer<ByteVar>())

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes()

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme(schemeguid?.value?.toCPointer<ByteVar>())

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerSetActiveScheme(userrootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>())

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerSetRequest(powerrequest?.value?.toCPointer<ByteVar>(), requesttype)

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerSettingAccessCheck(accessflags, powerguid?.value?.toCPointer<ByteVar>())

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: COpaquePointer?, accesstype: RegSamFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerSettingAccessCheckEx(accessflags, powerguid?.value?.toCPointer<ByteVar>(), accesstype)

public actual fun powerSettingRegisterNotification(settingguid: COpaquePointer?, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerSettingRegisterNotification(settingguid?.value?.toCPointer<ByteVar>(), flags, recipient?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerSettingUnregisterNotification(registrationhandle.toLong())

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications(registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(registrationhandle.toLong())

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultacindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteACDefaultIndex(rootsystempowerkey?.value?.toCPointer<ByteVar>(), schemepersonalityguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), defaultacindex)

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteACValueIndex(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), acvalueindex)

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultdcindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteDCDefaultIndex(rootsystempowerkey?.value?.toCPointer<ByteVar>(), schemepersonalityguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), defaultdcindex)

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteDCValueIndex(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), dcvalueindex)

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteDescription(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteFriendlyName(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier(rootpowerkey?.value?.toCPointer<ByteVar>(), schemeguid?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWritePossibleDescription(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), possiblesettingindex, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWritePossibleFriendlyName(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), possiblesettingindex, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: UInt, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWritePossibleValue(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), type, possiblesettingindex, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun powerWriteSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?, attributes: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteSettingAttributes(subgroupguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), attributes)

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteValueIncrement(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), valueincrement)

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteValueMax(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), valuemaximum)

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteValueMin(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), valueminimum)

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier(rootpowerkey?.value?.toCPointer<ByteVar>(), subgroupofpowersettingsguid?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_readGlobalPwrPolicy(pglobalpowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_readProcessorPwrScheme(uiid, pmachineprocessorpowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_readPwrScheme(uiid, ppowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: COpaquePointer?, flags: RegisterNotificationFlags): Hpowernotify =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_registerPowerSettingNotification(hrecipient?.value?.toCPointer<ByteVar>(), powersettingguid?.value?.toCPointer<ByteVar>(), flags)

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_registerSuspendResumeNotification(hrecipient?.value?.toCPointer<ByteVar>(), flags)

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_requestWakeupLatency(latency)

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_setActivePwrScheme(uiid, pglobalpowerpolicy?.value?.toCPointer<ByteVar>(), ppowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_setSuspendState(bhibernate, bforce, bwakeupeventsdisabled)

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_setSystemPowerState(fsuspend, fforce)

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_setThreadExecutionState(esflags)

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_unregisterPowerSettingNotification(handle.toLong())

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(handle.toLong())

public actual fun validatePowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_validatePowerPolicies(pglobalpowerpolicy?.value?.toCPointer<ByteVar>(), ppowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_writeGlobalPwrPolicy(pglobalpowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_writeProcessorPwrScheme(uiid, pmachineprocessorpowerpolicy?.value?.toCPointer<ByteVar>())

public actual fun writePwrScheme(puiid: COpaquePointer?, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssys_windows_win32_system_power_writePwrScheme(puiid?.value?.toCPointer<ByteVar>(), lpszschemename?.value?.toCPointer<ByteVar>(), lpszdescription?.value?.toCPointer<ByteVar>(), lpscheme?.value?.toCPointer<ByteVar>())
