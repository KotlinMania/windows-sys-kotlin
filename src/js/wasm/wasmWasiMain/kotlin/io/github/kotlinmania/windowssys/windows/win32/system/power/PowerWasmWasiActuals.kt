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

public actual fun CallNtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun CanUserWritePwrScheme(): Boolean =
    false

public actual fun DeletePwrScheme(uiid: UInt): Boolean =
    false

public actual fun DevicePowerClose(): Boolean =
    false

public actual fun DevicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: Long, pbuffersize: Long): Boolean =
    false

public actual fun DevicePowerOpen(debugmask: UInt): Boolean =
    false

public actual fun DevicePowerSetDeviceState(devicedescription: PCWSTR, setflags: UInt, setdata: Long): UInt =
    0u

public actual fun EnumPwrSchemes(lpfn: PWRSCHEMESENUMPROC, lparam: LPARAM): Boolean =
    false

public actual fun GetActivePwrScheme(puiid: Long): Boolean =
    false

public actual fun GetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    false

public actual fun GetDevicePowerState(hdevice: HANDLE, pfon: Long): BOOL =
    0

public actual fun GetPwrCapabilities(lpspc: Long): Boolean =
    false

public actual fun GetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean =
    false

public actual fun GetSystemPowerStatus(lpsystempowerstatus: Long): BOOL =
    0

public actual fun IsAdminOverrideActive(papp: Long): Boolean =
    false

public actual fun IsPwrHibernateAllowed(): Boolean =
    false

public actual fun IsPwrShutdownAllowed(): Boolean =
    false

public actual fun IsPwrSuspendAllowed(): Boolean =
    false

public actual fun IsSystemResumeAutomatic(): BOOL =
    0

public actual fun PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    0u

public actual fun PowerClearRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    0

public actual fun PowerCreatePossibleSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt): WIN32_ERROR =
    0u

public actual fun PowerCreateRequest(context: Long): HANDLE =
    0L

public actual fun PowerCreateSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long): WIN32_ERROR =
    0u

public actual fun PowerDeleteScheme(rootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    0u

public actual fun PowerDeterminePlatformRole(): POWER_PLATFORM_ROLE =
    0

public actual fun PowerDeterminePlatformRoleEx(version: POWER_PLATFORM_ROLE_VERSION): POWER_PLATFORM_ROLE =
    0

public actual fun PowerDuplicateScheme(rootpowerkey: HKEY, sourceschemeguid: Long, destinationschemeguid: Long): WIN32_ERROR =
    0u

public actual fun PowerEnumerate(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: POWER_DATA_ACCESSOR, index: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerGetActiveScheme(userrootpowerkey: HKEY, activepolicyguid: Long): WIN32_ERROR =
    0u

public actual fun PowerImportPowerScheme(rootpowerkey: HKEY, importfilenamepath: PCWSTR, destinationschemeguid: Long): WIN32_ERROR =
    0u

public actual fun PowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean =
    false

public actual fun PowerOpenSystemPowerKey(phsystempowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    0u

public actual fun PowerOpenUserPowerKey(phuserpowerkey: Long, access: UInt, openexisting: BOOL): UInt =
    0u

public actual fun PowerReadACDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): UInt =
    0u

public actual fun PowerReadACValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): WIN32_ERROR =
    0u

public actual fun PowerReadDCDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): UInt =
    0u

public actual fun PowerReadDCValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): UInt =
    0u

public actual fun PowerReadDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadPossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadPossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadPossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): UInt =
    0u

public actual fun PowerReadValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): WIN32_ERROR =
    0u

public actual fun PowerReadValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): WIN32_ERROR =
    0u

public actual fun PowerReadValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): WIN32_ERROR =
    0u

public actual fun PowerReadValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR =
    0u

public actual fun PowerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EFFECTIVE_POWER_MODE_CALLBACK, context: Long, registrationhandle: Long): HRESULT =
    0

public actual fun PowerRegisterSuspendResumeNotification(flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    0u

public actual fun PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): WIN32_ERROR =
    0u

public actual fun PowerReplaceDefaultPowerSchemes(): UInt =
    0u

public actual fun PowerReportThermalEvent(event: Long): WIN32_ERROR =
    0u

public actual fun PowerRestoreDefaultPowerSchemes(): WIN32_ERROR =
    0u

public actual fun PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR =
    0u

public actual fun PowerSetActiveScheme(userrootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR =
    0u

public actual fun PowerSetRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL =
    0

public actual fun PowerSettingAccessCheck(accessflags: POWER_DATA_ACCESSOR, powerguid: Long): WIN32_ERROR =
    0u

public actual fun PowerSettingAccessCheckEx(accessflags: POWER_DATA_ACCESSOR, powerguid: Long, accesstype: REG_SAM_FLAGS): WIN32_ERROR =
    0u

public actual fun PowerSettingRegisterNotification(settingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR =
    0u

public actual fun PowerSettingUnregisterNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    0u

public actual fun PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): HRESULT =
    0

public actual fun PowerUnregisterSuspendResumeNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR =
    0u

public actual fun PowerWriteACDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: UInt): UInt =
    0u

public actual fun PowerWriteACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteDCDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: UInt): UInt =
    0u

public actual fun PowerWriteDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: UInt): UInt =
    0u

public actual fun PowerWriteDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun PowerWritePossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun PowerWritePossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun PowerWritePossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: UInt, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: UInt): WIN32_ERROR =
    0u

public actual fun PowerWriteValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR =
    0u

public actual fun ReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    false

public actual fun ReadProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    false

public actual fun ReadPwrScheme(uiid: UInt, ppowerpolicy: Long): Boolean =
    false

public actual fun RegisterPowerSettingNotification(hrecipient: HANDLE, powersettingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    0L

public actual fun RegisterSuspendResumeNotification(hrecipient: HANDLE, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY =
    0L

public actual fun RequestWakeupLatency(latency: LATENCY_TIME): BOOL =
    0

public actual fun SetActivePwrScheme(uiid: UInt, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    false

public actual fun SetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    false

public actual fun SetSystemPowerState(fsuspend: BOOL, fforce: BOOL): BOOL =
    0

public actual fun SetThreadExecutionState(esflags: EXECUTION_STATE): EXECUTION_STATE =
    0u

public actual fun UnregisterPowerSettingNotification(handle: HPOWERNOTIFY): BOOL =
    0

public actual fun UnregisterSuspendResumeNotification(handle: HPOWERNOTIFY): BOOL =
    0

public actual fun ValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean =
    false

public actual fun WriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean =
    false

public actual fun WriteProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean =
    false

public actual fun WritePwrScheme(puiid: Long, lpszschemename: PCWSTR, lpszdescription: PCWSTR, lpscheme: Long): Boolean =
    false
