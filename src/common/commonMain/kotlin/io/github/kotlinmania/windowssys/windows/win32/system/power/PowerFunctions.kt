package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(index: UInt, namesize: UInt, name: PCWSTR, descriptionsize: UInt, description: PCWSTR, policy: Long, context: LPARAM): Boolean
}

public fun interface FnCallback1 {
    public operator fun invoke(mode: EFFECTIVE_POWER_MODE, context: Long)
}

public fun CallNtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("powrprof.dll", "CallNtPowerInformation", longArrayOf(informationlevel.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}

public fun CanUserWritePwrScheme(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "CanUserWritePwrScheme", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun DeletePwrScheme(uiid: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "DeletePwrScheme", longArrayOf(uiid.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun DevicePowerClose(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "DevicePowerClose", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun DevicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: Long, pbuffersize: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "DevicePowerEnumDevices", longArrayOf(queryindex.toLong(), queryinterpretationflags.toLong(), queryflags.toLong(), preturnbuffer, pbuffersize))
    return (rawRet and 0xFFL) != 0L
}

public fun DevicePowerOpen(debugmask: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "DevicePowerOpen", longArrayOf(debugmask.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun DevicePowerSetDeviceState(devicedescription: PCWSTR, setflags: UInt, setdata: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "DevicePowerSetDeviceState", longArrayOf(devicedescription, setflags.toLong(), setdata)).toUInt()
}

public fun EnumPwrSchemes(lpfn: PWRSCHEMESENUMPROC, lparam: LPARAM): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "EnumPwrSchemes", longArrayOf(Win32DynamicFfi.objectSlot(lpfn), lparam))
    return (rawRet and 0xFFL) != 0L
}

public fun GetActivePwrScheme(puiid: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "GetActivePwrScheme", longArrayOf(puiid))
    return (rawRet and 0xFFL) != 0L
}

public fun GetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "GetCurrentPowerPolicies", longArrayOf(pglobalpowerpolicy, ppowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun GetDevicePowerState(hdevice: HANDLE, pfon: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDevicePowerState", longArrayOf(hdevice, pfon)).toInt()
}

public fun GetPwrCapabilities(lpspc: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "GetPwrCapabilities", longArrayOf(lpspc))
    return (rawRet and 0xFFL) != 0L
}

public fun GetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "GetPwrDiskSpindownRange", longArrayOf(puimax, puimin))
    return (rawRet and 0xFFL) != 0L
}

public fun GetSystemPowerStatus(lpsystempowerstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetSystemPowerStatus", longArrayOf(lpsystempowerstatus)).toInt()
}

public fun IsAdminOverrideActive(papp: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "IsAdminOverrideActive", longArrayOf(papp))
    return (rawRet and 0xFFL) != 0L
}

public fun IsPwrHibernateAllowed(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "IsPwrHibernateAllowed", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun IsPwrShutdownAllowed(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "IsPwrShutdownAllowed", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun IsPwrSuspendAllowed(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "IsPwrSuspendAllowed", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun IsSystemResumeAutomatic(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsSystemResumeAutomatic", longArrayOf()).toInt()
}

public fun PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerCanRestoreIndividualDefaultPowerScheme", longArrayOf(schemeguid)).toUInt()
}

public fun PowerClearRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PowerClearRequest", longArrayOf(powerrequest, requesttype.toLong())).toInt()
}

public fun PowerCreatePossibleSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerCreatePossibleSetting", longArrayOf(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong())).toUInt()
}

public fun PowerCreateRequest(context: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "PowerCreateRequest", longArrayOf(context))
}

public fun PowerCreateSetting(rootsystempowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerCreateSetting", longArrayOf(rootsystempowerkey, subgroupofpowersettingsguid, powersettingguid)).toUInt()
}

public fun PowerDeleteScheme(rootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerDeleteScheme", longArrayOf(rootpowerkey, schemeguid)).toUInt()
}

public fun PowerDeterminePlatformRole(): POWER_PLATFORM_ROLE {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerDeterminePlatformRole", longArrayOf()).toInt()
}

public fun PowerDeterminePlatformRoleEx(version: POWER_PLATFORM_ROLE_VERSION): POWER_PLATFORM_ROLE {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerDeterminePlatformRoleEx", longArrayOf(version.toLong())).toInt()
}

public fun PowerDuplicateScheme(rootpowerkey: HKEY, sourceschemeguid: Long, destinationschemeguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerDuplicateScheme", longArrayOf(rootpowerkey, sourceschemeguid, destinationschemeguid)).toUInt()
}

public fun PowerEnumerate(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: POWER_DATA_ACCESSOR, index: UInt, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerEnumerate", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, accessflags.toLong(), index.toLong(), buffer, buffersize)).toUInt()
}

public fun PowerGetActiveScheme(userrootpowerkey: HKEY, activepolicyguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerGetActiveScheme", longArrayOf(userrootpowerkey, activepolicyguid)).toUInt()
}

public fun PowerImportPowerScheme(rootpowerkey: HKEY, importfilenamepath: PCWSTR, destinationschemeguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerImportPowerScheme", longArrayOf(rootpowerkey, importfilenamepath, destinationschemeguid)).toUInt()
}

public fun PowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "PowerIsSettingRangeDefined", longArrayOf(subkeyguid, settingguid))
    return (rawRet and 0xFFL) != 0L
}

public fun PowerOpenSystemPowerKey(phsystempowerkey: Long, access: UInt, openexisting: BOOL): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerOpenSystemPowerKey", longArrayOf(phsystempowerkey, access.toLong(), openexisting.toLong())).toUInt()
}

public fun PowerOpenUserPowerKey(phuserpowerkey: Long, access: UInt, openexisting: BOOL): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerOpenUserPowerKey", longArrayOf(phuserpowerkey, access.toLong(), openexisting.toLong())).toUInt()
}

public fun PowerReadACDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadACDefaultIndex", longArrayOf(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, acdefaultindex)).toUInt()
}

public fun PowerReadACValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadACValue", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize)).toUInt()
}

public fun PowerReadACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadACValueIndex", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex)).toUInt()
}

public fun PowerReadDCDefaultIndex(rootpowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDCDefaultIndex", longArrayOf(rootpowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, dcdefaultindex)).toUInt()
}

public fun PowerReadDCValue(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDCValue", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize)).toUInt()
}

public fun PowerReadDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDCValueIndex", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex)).toUInt()
}

public fun PowerReadDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDescription", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize)).toUInt()
}

public fun PowerReadFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadFriendlyName", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize)).toUInt()
}

public fun PowerReadIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadIconResourceSpecifier", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize)).toUInt()
}

public fun PowerReadPossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadPossibleDescription", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize)).toUInt()
}

public fun PowerReadPossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadPossibleFriendlyName", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize)).toUInt()
}

public fun PowerReadPossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadPossibleValue", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex.toLong(), buffer, buffersize)).toUInt()
}

public fun PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadSettingAttributes", longArrayOf(subgroupguid, powersettingguid)).toUInt()
}

public fun PowerReadValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueIncrement", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement)).toUInt()
}

public fun PowerReadValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueMax", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum)).toUInt()
}

public fun PowerReadValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueMin", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum)).toUInt()
}

public fun PowerReadValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueUnitsSpecifier", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize)).toUInt()
}

public fun PowerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EFFECTIVE_POWER_MODE_CALLBACK, context: Long, registrationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerRegisterForEffectivePowerModeNotifications", longArrayOf(version.toLong(), Win32DynamicFfi.objectSlot(callback), context, registrationhandle)).toInt()
}

public fun PowerRegisterSuspendResumeNotification(flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerRegisterSuspendResumeNotification", longArrayOf(flags.toLong(), recipient, registrationhandle)).toUInt()
}

public fun PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerRemovePowerSetting", longArrayOf(powersettingsubkeyguid, powersettingguid)).toUInt()
}

public fun PowerReplaceDefaultPowerSchemes(): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReplaceDefaultPowerSchemes", longArrayOf()).toUInt()
}

public fun PowerReportThermalEvent(event: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReportThermalEvent", longArrayOf(event)).toUInt()
}

public fun PowerRestoreDefaultPowerSchemes(): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerRestoreDefaultPowerSchemes", longArrayOf()).toUInt()
}

public fun PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerRestoreIndividualDefaultPowerScheme", longArrayOf(schemeguid)).toUInt()
}

public fun PowerSetActiveScheme(userrootpowerkey: HKEY, schemeguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerSetActiveScheme", longArrayOf(userrootpowerkey, schemeguid)).toUInt()
}

public fun PowerSetRequest(powerrequest: HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PowerSetRequest", longArrayOf(powerrequest, requesttype.toLong())).toInt()
}

public fun PowerSettingAccessCheck(accessflags: POWER_DATA_ACCESSOR, powerguid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingAccessCheck", longArrayOf(accessflags.toLong(), powerguid)).toUInt()
}

public fun PowerSettingAccessCheckEx(accessflags: POWER_DATA_ACCESSOR, powerguid: Long, accesstype: REG_SAM_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingAccessCheckEx", longArrayOf(accessflags.toLong(), powerguid, accesstype.toLong())).toUInt()
}

public fun PowerSettingRegisterNotification(settingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS, recipient: HANDLE, registrationhandle: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingRegisterNotification", longArrayOf(settingguid, flags.toLong(), recipient, registrationhandle)).toUInt()
}

public fun PowerSettingUnregisterNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingUnregisterNotification", longArrayOf(registrationhandle)).toUInt()
}

public fun PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerUnregisterFromEffectivePowerModeNotifications", longArrayOf(registrationhandle)).toInt()
}

public fun PowerUnregisterSuspendResumeNotification(registrationhandle: HPOWERNOTIFY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerUnregisterSuspendResumeNotification", longArrayOf(registrationhandle)).toUInt()
}

public fun PowerWriteACDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: UInt): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteACDefaultIndex", longArrayOf(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultacindex.toLong())).toUInt()
}

public fun PowerWriteACValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteACValueIndex", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex.toLong())).toUInt()
}

public fun PowerWriteDCDefaultIndex(rootsystempowerkey: HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: UInt): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteDCDefaultIndex", longArrayOf(rootsystempowerkey, schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultdcindex.toLong())).toUInt()
}

public fun PowerWriteDCValueIndex(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: UInt): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteDCValueIndex", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex.toLong())).toUInt()
}

public fun PowerWriteDescription(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteDescription", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong())).toUInt()
}

public fun PowerWriteFriendlyName(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteFriendlyName", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong())).toUInt()
}

public fun PowerWriteIconResourceSpecifier(rootpowerkey: HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteIconResourceSpecifier", longArrayOf(rootpowerkey, schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong())).toUInt()
}

public fun PowerWritePossibleDescription(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWritePossibleDescription", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize.toLong())).toUInt()
}

public fun PowerWritePossibleFriendlyName(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWritePossibleFriendlyName", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize.toLong())).toUInt()
}

public fun PowerWritePossibleValue(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: UInt, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWritePossibleValue", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, type.toLong(), possiblesettingindex.toLong(), buffer, buffersize.toLong())).toUInt()
}

public fun PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteSettingAttributes", longArrayOf(subgroupguid, powersettingguid, attributes.toLong())).toUInt()
}

public fun PowerWriteValueIncrement(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueIncrement", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueincrement.toLong())).toUInt()
}

public fun PowerWriteValueMax(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueMax", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valuemaximum.toLong())).toUInt()
}

public fun PowerWriteValueMin(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueMin", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, valueminimum.toLong())).toUInt()
}

public fun PowerWriteValueUnitsSpecifier(rootpowerkey: HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueUnitsSpecifier", longArrayOf(rootpowerkey, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong())).toUInt()
}

public fun ReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "ReadGlobalPwrPolicy", longArrayOf(pglobalpowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun ReadProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "ReadProcessorPwrScheme", longArrayOf(uiid.toLong(), pmachineprocessorpowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun ReadPwrScheme(uiid: UInt, ppowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "ReadPwrScheme", longArrayOf(uiid.toLong(), ppowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun RegisterPowerSettingNotification(hrecipient: HANDLE, powersettingguid: Long, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterPowerSettingNotification", longArrayOf(hrecipient, powersettingguid, flags.toLong()))
}

public fun RegisterSuspendResumeNotification(hrecipient: HANDLE, flags: REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterSuspendResumeNotification", longArrayOf(hrecipient, flags.toLong()))
}

public fun RequestWakeupLatency(latency: LATENCY_TIME): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "RequestWakeupLatency", longArrayOf(latency.toLong())).toInt()
}

public fun SetActivePwrScheme(uiid: UInt, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "SetActivePwrScheme", longArrayOf(uiid.toLong(), pglobalpowerpolicy, ppowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun SetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "SetSuspendState", longArrayOf(if (bhibernate) 1L else 0L, if (bforce) 1L else 0L, if (bwakeupeventsdisabled) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun SetSystemPowerState(fsuspend: BOOL, fforce: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetSystemPowerState", longArrayOf(fsuspend.toLong(), fforce.toLong())).toInt()
}

public fun SetThreadExecutionState(esflags: EXECUTION_STATE): EXECUTION_STATE {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadExecutionState", longArrayOf(esflags.toLong())).toUInt()
}

public fun UnregisterPowerSettingNotification(handle: HPOWERNOTIFY): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterPowerSettingNotification", longArrayOf(handle)).toInt()
}

public fun UnregisterSuspendResumeNotification(handle: HPOWERNOTIFY): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterSuspendResumeNotification", longArrayOf(handle)).toInt()
}

public fun ValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "ValidatePowerPolicies", longArrayOf(pglobalpowerpolicy, ppowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun WriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "WriteGlobalPwrPolicy", longArrayOf(pglobalpowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun WriteProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "WriteProcessorPwrScheme", longArrayOf(uiid.toLong(), pmachineprocessorpowerpolicy))
    return (rawRet and 0xFFL) != 0L
}

public fun WritePwrScheme(puiid: Long, lpszschemename: PCWSTR, lpszdescription: PCWSTR, lpscheme: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "WritePwrScheme", longArrayOf(puiid, lpszschemename, lpszdescription, lpscheme))
    return (rawRet and 0xFFL) != 0L
}
