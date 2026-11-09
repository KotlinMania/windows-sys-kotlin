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

private object WindowsWin32SystemPowerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_power_CallNtPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_CanUserWritePwrScheme(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_DeletePwrScheme(uiid: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_DevicePowerClose(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_DevicePowerEnumDevices(queryindex: Int, queryinterpretationflags: Int, queryflags: Int, preturnbuffer: Long, pbuffersize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_DevicePowerOpen(debugmask: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_DevicePowerSetDeviceState(devicedescription: Long, setflags: Int, setdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_EnumPwrSchemes(lpfn: Long, lparam: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_GetActivePwrScheme(puiid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_GetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_GetDevicePowerState(hdevice: Long, pfon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_GetPwrCapabilities(lpspc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_GetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_GetSystemPowerStatus(lpsystempowerstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_IsAdminOverrideActive(papp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_IsPwrHibernateAllowed(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_IsPwrShutdownAllowed(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_IsPwrSuspendAllowed(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_IsSystemResumeAutomatic(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerClearRequest(powerrequest: Long, requesttype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerCreatePossibleSetting(rootsystempowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerCreateRequest(context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerCreateSetting(rootsystempowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerDeleteScheme(rootpowerkey: Long, schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerDeterminePlatformRole(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerDeterminePlatformRoleEx(version: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerDuplicateScheme(rootpowerkey: Long, sourceschemeguid: Long, destinationschemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerEnumerate(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: Int, index: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerGetActiveScheme(userrootpowerkey: Long, activepolicyguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerImportPowerScheme(rootpowerkey: Long, importfilenamepath: Long, destinationschemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerOpenSystemPowerKey(phsystempowerkey: Long, access: Int, openexisting: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerOpenUserPowerKey(phuserpowerkey: Long, access: Int, openexisting: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadACDefaultIndex(rootpowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadACValue(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadACValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadDCDefaultIndex(rootpowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadDCValue(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadDCValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadDescription(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadFriendlyName(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadIconResourceSpecifier(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadPossibleDescription(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadPossibleFriendlyName(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadPossibleValue(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadValueIncrement(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadValueMax(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadValueMin(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReadValueUnitsSpecifier(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerRegisterForEffectivePowerModeNotifications(version: Int, callback: Long, context: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerRegisterSuspendResumeNotification(flags: Int, recipient: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReplaceDefaultPowerSchemes(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerReportThermalEvent(event: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerRestoreDefaultPowerSchemes(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerSetActiveScheme(userrootpowerkey: Long, schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerSetRequest(powerrequest: Long, requesttype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerSettingAccessCheck(accessflags: Int, powerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerSettingAccessCheckEx(accessflags: Int, powerguid: Long, accesstype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerSettingRegisterNotification(settingguid: Long, flags: Int, recipient: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerSettingUnregisterNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerUnregisterSuspendResumeNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteACDefaultIndex(rootsystempowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteACValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteDCDefaultIndex(rootsystempowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteDCValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteDescription(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteFriendlyName(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteIconResourceSpecifier(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWritePossibleDescription(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWritePossibleFriendlyName(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWritePossibleValue(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Int, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteValueIncrement(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteValueMax(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteValueMin(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_PowerWriteValueUnitsSpecifier(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_ReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_ReadProcessorPwrScheme(uiid: Int, pmachineprocessorpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_ReadPwrScheme(uiid: Int, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_RegisterPowerSettingNotification(hrecipient: Long, powersettingguid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_power_RegisterSuspendResumeNotification(hrecipient: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_power_RequestWakeupLatency(latency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_SetActivePwrScheme(uiid: Int, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_SetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_SetSystemPowerState(fsuspend: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_SetThreadExecutionState(esflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_UnregisterPowerSettingNotification(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_UnregisterSuspendResumeNotification(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_ValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_WriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_WriteProcessorPwrScheme(uiid: Int, pmachineprocessorpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_WritePwrScheme(puiid: Long, lpszschemename: Long, lpszdescription: Long, lpscheme: Long): Boolean
}

public actual fun CallNtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_CallNtPowerInformation(informationlevel, inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt())

public actual fun CanUserWritePwrScheme(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_CanUserWritePwrScheme()

public actual fun DeletePwrScheme(uiid: UInt): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_DeletePwrScheme(uiid.toInt())

public actual fun DevicePowerClose(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_DevicePowerClose()

public actual fun DevicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: Long, pbuffersize: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_DevicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), preturnbuffer, pbuffersize)

public actual fun DevicePowerOpen(debugmask: UInt): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_DevicePowerOpen(debugmask.toInt())

public actual fun DevicePowerSetDeviceState(devicedescription: PCWSTR, setflags: UInt, setdata: Long): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_DevicePowerSetDeviceState(devicedescription, setflags.toInt(), setdata).toUInt()

public actual fun EnumPwrSchemes(lpfn: PWRSCHEMESENUMPROC, lparam: LPARAM): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_EnumPwrSchemes(lpfn.toLong(), lparam)

public actual fun GetActivePwrScheme(puiid: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_GetActivePwrScheme(puiid)

public actual fun GetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_GetCurrentPowerPolicies(pglobalpowerpolicy, ppowerpolicy)

public actual fun GetDevicePowerState(hdevice: HANDLE, pfon: Long): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_GetDevicePowerState(hdevice, pfon)

public actual fun GetPwrCapabilities(lpspc: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_GetPwrCapabilities(lpspc)

public actual fun GetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_GetPwrDiskSpindownRange(puimax, puimin)

public actual fun GetSystemPowerStatus(lpsystempowerstatus: Long): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_GetSystemPowerStatus(lpsystempowerstatus)

public actual fun IsAdminOverrideActive(papp: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_IsAdminOverrideActive(papp)

public actual fun IsPwrHibernateAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_IsPwrHibernateAllowed()

public actual fun IsPwrShutdownAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_IsPwrShutdownAllowed()

public actual fun IsPwrSuspendAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_IsPwrSuspendAllowed()

public actual fun IsSystemResumeAutomatic(): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_IsSystemResumeAutomatic()

public actual fun PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerCanRestoreIndividualDefaultPowerScheme(schemeguid).toUInt()

public actual fun PowerClearRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerClearRequest(powerrequest, requesttype)

public actual fun PowerCreatePossibleSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerCreatePossibleSetting(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toInt()).toUInt()

public actual fun PowerCreateRequest(context: Long): HANDLE =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerCreateRequest(context)

public actual fun PowerCreateSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerCreateSetting(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid).toUInt()

public actual fun PowerDeleteScheme(rootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerDeleteScheme(rootpowerkey, schemeguid).toUInt()

public actual fun PowerDeterminePlatformRole(): POWER_PLATFORM_ROLE =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerDeterminePlatformRole()

public actual fun PowerDeterminePlatformRoleEx(version: POWER_PLATFORM_ROLE_VERSION): POWER_PLATFORM_ROLE =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerDeterminePlatformRoleEx(version.toInt())

public actual fun PowerDuplicateScheme(rootpowerkey: HKEY, sourceschemeguid: Long, destinationschemeguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerDuplicateScheme(rootpowerkey, sourceschemeguid, destinationschemeguid).toUInt()

public actual fun PowerEnumerate(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: POWER_DATA_ACCESSOR, index: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerEnumerate(rootpowerkey, schemeguid, subgroupofpowersettingsguid, accessflags, index.toInt(), buffer, buffersize).toUInt()

public actual fun PowerGetActiveScheme(userrootpowerkey: HKEY, activepolicyguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerGetActiveScheme(userrootpowerkey, activepolicyguid).toUInt()

public actual fun PowerImportPowerScheme(rootpowerkey: HKEY, importfilenamepath: PCWSTR, destinationschemeguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerImportPowerScheme(rootpowerkey, importfilenamepath, destinationschemeguid).toUInt()

public actual fun PowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerIsSettingRangeDefined(subkeyguid, settingguid)

public actual fun PowerOpenSystemPowerKey(phsystempowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerOpenSystemPowerKey(phsystempowerkey, access.toInt(), openexisting).toUInt()

public actual fun PowerOpenUserPowerKey(phuserpowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerOpenUserPowerKey(phuserpowerkey, access.toInt(), openexisting).toUInt()

public actual fun PowerReadACDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadACDefaultIndex(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, acdefaultindex).toUInt()

public actual fun PowerReadACValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadACValue(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize).toUInt()

public actual fun PowerReadACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadACValueIndex(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex).toUInt()

public actual fun PowerReadDCDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadDCDefaultIndex(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, dcdefaultindex).toUInt()

public actual fun PowerReadDCValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadDCValue(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize).toUInt()

public actual fun PowerReadDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadDCValueIndex(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex).toUInt()

public actual fun PowerReadDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadDescription(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize).toUInt()

public actual fun PowerReadFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadFriendlyName(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize).toUInt()

public actual fun PowerReadIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadIconResourceSpecifier(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize).toUInt()

public actual fun PowerReadPossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadPossibleDescription(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toInt(), buffer, buffersize).toUInt()

public actual fun PowerReadPossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadPossibleFriendlyName(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toInt(), buffer, buffersize).toUInt()

public actual fun PowerReadPossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadPossibleValue(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex.toInt(), buffer, buffersize).toUInt()

public actual fun PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadSettingAttributes(subgroupguid, powersettingguid).toUInt()

public actual fun PowerReadValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadValueIncrement(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement).toUInt()

public actual fun PowerReadValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadValueMax(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum).toUInt()

public actual fun PowerReadValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadValueMin(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum).toUInt()

public actual fun PowerReadValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReadValueUnitsSpecifier(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize).toUInt()

public actual fun PowerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EFFECTIVE_POWER_MODE_CALLBACK, context: Long, registrationhandle: Long): HRESULT =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerRegisterForEffectivePowerModeNotifications(version.toInt(), callback.toLong(), context, registrationhandle)

public actual fun PowerRegisterSuspendResumeNotification(flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerRegisterSuspendResumeNotification(flags.toInt(), recipient, registrationhandle).toUInt()

public actual fun PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerRemovePowerSetting(powersettingsubkeyguid, powersettingguid).toUInt()

public actual fun PowerReplaceDefaultPowerSchemes(): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReplaceDefaultPowerSchemes().toUInt()

public actual fun PowerReportThermalEvent(event: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerReportThermalEvent(event).toUInt()

public actual fun PowerRestoreDefaultPowerSchemes(): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerRestoreDefaultPowerSchemes().toUInt()

public actual fun PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerRestoreIndividualDefaultPowerScheme(schemeguid).toUInt()

public actual fun PowerSetActiveScheme(userrootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerSetActiveScheme(userrootpowerkey, schemeguid).toUInt()

public actual fun PowerSetRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerSetRequest(powerrequest, requesttype)

public actual fun PowerSettingAccessCheck(accessflags: POWER_DATA_ACCESSOR, powerguid: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerSettingAccessCheck(accessflags, powerguid).toUInt()

public actual fun PowerSettingAccessCheckEx(accessflags: POWER_DATA_ACCESSOR, powerguid: Long, accesstype: REG_SAM_FLAGS): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerSettingAccessCheckEx(accessflags, powerguid, accesstype.toInt()).toUInt()

public actual fun PowerSettingRegisterNotification(settingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerSettingRegisterNotification(settingguid, flags.toInt(), recipient, registrationhandle).toUInt()

public actual fun PowerSettingUnregisterNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerSettingUnregisterNotification(registrationhandle).toUInt()

public actual fun PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): HRESULT =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle)

public actual fun PowerUnregisterSuspendResumeNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerUnregisterSuspendResumeNotification(registrationhandle).toUInt()

public actual fun PowerWriteACDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteACDefaultIndex(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultacindex.toInt()).toUInt()

public actual fun PowerWriteACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteACValueIndex(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex.toInt()).toUInt()

public actual fun PowerWriteDCDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteDCDefaultIndex(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultdcindex.toInt()).toUInt()

public actual fun PowerWriteDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteDCValueIndex(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex.toInt()).toUInt()

public actual fun PowerWriteDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteDescription(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toInt()).toUInt()

public actual fun PowerWriteFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteFriendlyName(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toInt()).toUInt()

public actual fun PowerWriteIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteIconResourceSpecifier(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toInt()).toUInt()

public actual fun PowerWritePossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWritePossibleDescription(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toInt(), buffer, buffersize.toInt()).toUInt()

public actual fun PowerWritePossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWritePossibleFriendlyName(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toInt(), buffer, buffersize.toInt()).toUInt()

public actual fun PowerWritePossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: UInt, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWritePossibleValue(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type.toInt(), possiblesettingindex.toInt(), buffer, buffersize.toInt()).toUInt()

public actual fun PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteSettingAttributes(subgroupguid, powersettingguid, attributes.toInt()).toUInt()

public actual fun PowerWriteValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteValueIncrement(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement.toInt()).toUInt()

public actual fun PowerWriteValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteValueMax(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum.toInt()).toUInt()

public actual fun PowerWriteValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteValueMin(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum.toInt()).toUInt()

public actual fun PowerWriteValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_PowerWriteValueUnitsSpecifier(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toInt()).toUInt()

public actual fun ReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_ReadGlobalPwrPolicy(pglobalpowerpolicy)

public actual fun ReadProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_ReadProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy)

public actual fun ReadPwrScheme(uiid: UInt, ppowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_ReadPwrScheme(uiid.toInt(), ppowerpolicy)

public actual fun RegisterPowerSettingNotification(hrecipient: HANDLE, powersettingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_RegisterPowerSettingNotification(hrecipient, powersettingguid, flags.toInt())

public actual fun RegisterSuspendResumeNotification(hrecipient: HANDLE, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_RegisterSuspendResumeNotification(hrecipient, flags.toInt())

public actual fun RequestWakeupLatency(latency: LATENCY_TIME): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_RequestWakeupLatency(latency)

public actual fun SetActivePwrScheme(uiid: UInt, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_SetActivePwrScheme(uiid.toInt(), pglobalpowerpolicy, ppowerpolicy)

public actual fun SetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_SetSuspendState(bhibernate, bforce, bwakeupeventsdisabled)

public actual fun SetSystemPowerState(fsuspend: BOOL, fforce: BOOL): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_SetSystemPowerState(fsuspend, fforce)

public actual fun SetThreadExecutionState(esflags: EXECUTION_STATE): EXECUTION_STATE =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_SetThreadExecutionState(esflags.toInt()).toUInt()

public actual fun UnregisterPowerSettingNotification(handle: HPOWERNOTIFY): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_UnregisterPowerSettingNotification(handle)

public actual fun UnregisterSuspendResumeNotification(handle: HPOWERNOTIFY): BOOL =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_UnregisterSuspendResumeNotification(handle)

public actual fun ValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_ValidatePowerPolicies(pglobalpowerpolicy, ppowerpolicy)

public actual fun WriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_WriteGlobalPwrPolicy(pglobalpowerpolicy)

public actual fun WriteProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_WriteProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy)

public actual fun WritePwrScheme(puiid: Long, lpszschemename: PCWSTR, lpszdescription: PCWSTR, lpscheme: Long): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_WritePwrScheme(puiid, lpszschemename, lpszdescription, lpscheme)
