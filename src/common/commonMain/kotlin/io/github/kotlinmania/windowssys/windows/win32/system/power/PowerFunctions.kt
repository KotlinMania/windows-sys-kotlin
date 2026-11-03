package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(index: UInt, namesize: UInt, name: PCWSTR, descriptionsize: UInt, description: PCWSTR, policy: Long, context: Foundation.LPARAM): Boolean
}

public fun interface FnCallback1 {
    public operator fun invoke(mode: EFFECTIVE_POWER_MODE, context: Long)
}

public fun CallNtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("powrprof.dll", "CallNtPowerInformation", longArrayOf(informationlevel.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong()))
    return Foundation.NTSTATUS()
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

public fun EnumPwrSchemes(lpfn: PWRSCHEMESENUMPROC, lparam: Foundation.LPARAM): Boolean {
    val rawRet = Win32DynamicFfi.invoke("powrprof.dll", "EnumPwrSchemes", longArrayOf(Win32DynamicFfi.objectSlot(lpfn), Win32DynamicFfi.objectSlot(lparam)))
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

public fun GetDevicePowerState(hdevice: Foundation.HANDLE, pfon: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetDevicePowerState", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), pfon)).toInt()
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

public fun PowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerCanRestoreIndividualDefaultPowerScheme", longArrayOf(schemeguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerClearRequest(powerrequest: Foundation.HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PowerClearRequest", longArrayOf(Win32DynamicFfi.objectSlot(powerrequest), requesttype.toLong())).toInt()
}

public fun PowerCreatePossibleSetting(rootsystempowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerCreatePossibleSetting", longArrayOf(Win32DynamicFfi.objectSlot(rootsystempowerkey), subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerCreateRequest(context: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("kernel32.dll", "PowerCreateRequest", longArrayOf(context))
    return Foundation.HANDLE()
}

public fun PowerCreateSetting(rootsystempowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerCreateSetting", longArrayOf(Win32DynamicFfi.objectSlot(rootsystempowerkey), subgroupofpowersettingsguid, powersettingguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerDeleteScheme(rootpowerkey: Registry.HKEY, schemeguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerDeleteScheme", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerDeterminePlatformRole(): POWER_PLATFORM_ROLE {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerDeterminePlatformRole", longArrayOf()).toInt()
}

public fun PowerDeterminePlatformRoleEx(version: POWER_PLATFORM_ROLE_VERSION): POWER_PLATFORM_ROLE {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerDeterminePlatformRoleEx", longArrayOf(version.toLong())).toInt()
}

public fun PowerDuplicateScheme(rootpowerkey: Registry.HKEY, sourceschemeguid: Long, destinationschemeguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerDuplicateScheme", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), sourceschemeguid, destinationschemeguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerEnumerate(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: POWER_DATA_ACCESSOR, index: UInt, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerEnumerate", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, accessflags.toLong(), index.toLong(), buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerGetActiveScheme(userrootpowerkey: Registry.HKEY, activepolicyguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerGetActiveScheme", longArrayOf(Win32DynamicFfi.objectSlot(userrootpowerkey), activepolicyguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerImportPowerScheme(rootpowerkey: Registry.HKEY, importfilenamepath: PCWSTR, destinationschemeguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerImportPowerScheme", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), importfilenamepath, destinationschemeguid))
    return Foundation.WIN32_ERROR()
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

public fun PowerReadACDefaultIndex(rootpowerkey: Registry.HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadACDefaultIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, acdefaultindex)).toUInt()
}

public fun PowerReadACValue(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadACValue", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadACValueIndex(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadACValueIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadDCDefaultIndex(rootpowerkey: Registry.HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDCDefaultIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, dcdefaultindex)).toUInt()
}

public fun PowerReadDCValue(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDCValue", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, type, buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadDCValueIndex(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDCValueIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex)).toUInt()
}

public fun PowerReadDescription(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadDescription", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadFriendlyName(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadFriendlyName", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadIconResourceSpecifier(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadIconResourceSpecifier", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadPossibleDescription(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadPossibleDescription", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadPossibleFriendlyName(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadPossibleFriendlyName", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadPossibleValue(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: UInt, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadPossibleValue", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, type, possiblesettingindex.toLong(), buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReadSettingAttributes", longArrayOf(subgroupguid, powersettingguid)).toUInt()
}

public fun PowerReadValueIncrement(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueIncrement", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, valueincrement))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadValueMax(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueMax", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, valuemaximum))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadValueMin(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueMin", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, valueminimum))
    return Foundation.WIN32_ERROR()
}

public fun PowerReadValueUnitsSpecifier(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReadValueUnitsSpecifier", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, buffer, buffersize))
    return Foundation.WIN32_ERROR()
}

public fun PowerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EFFECTIVE_POWER_MODE_CALLBACK, context: Long, registrationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerRegisterForEffectivePowerModeNotifications", longArrayOf(version.toLong(), Win32DynamicFfi.objectSlot(callback), context, registrationhandle)).toInt()
}

public fun PowerRegisterSuspendResumeNotification(flags: UI.WindowsAndMessaging.REGISTER_NOTIFICATION_FLAGS, recipient: Foundation.HANDLE, registrationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerRegisterSuspendResumeNotification", longArrayOf(Win32DynamicFfi.objectSlot(flags), Win32DynamicFfi.objectSlot(recipient), registrationhandle))
    return Foundation.WIN32_ERROR()
}

public fun PowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerRemovePowerSetting", longArrayOf(powersettingsubkeyguid, powersettingguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerReplaceDefaultPowerSchemes(): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerReplaceDefaultPowerSchemes", longArrayOf()).toUInt()
}

public fun PowerReportThermalEvent(event: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerReportThermalEvent", longArrayOf(event))
    return Foundation.WIN32_ERROR()
}

public fun PowerRestoreDefaultPowerSchemes(): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerRestoreDefaultPowerSchemes", longArrayOf())
    return Foundation.WIN32_ERROR()
}

public fun PowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerRestoreIndividualDefaultPowerScheme", longArrayOf(schemeguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerSetActiveScheme(userrootpowerkey: Registry.HKEY, schemeguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerSetActiveScheme", longArrayOf(Win32DynamicFfi.objectSlot(userrootpowerkey), schemeguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerSetRequest(powerrequest: Foundation.HANDLE, requesttype: POWER_REQUEST_TYPE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "PowerSetRequest", longArrayOf(Win32DynamicFfi.objectSlot(powerrequest), requesttype.toLong())).toInt()
}

public fun PowerSettingAccessCheck(accessflags: POWER_DATA_ACCESSOR, powerguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingAccessCheck", longArrayOf(accessflags.toLong(), powerguid))
    return Foundation.WIN32_ERROR()
}

public fun PowerSettingAccessCheckEx(accessflags: POWER_DATA_ACCESSOR, powerguid: Long, accesstype: Registry.REG_SAM_FLAGS): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingAccessCheckEx", longArrayOf(accessflags.toLong(), powerguid, Win32DynamicFfi.objectSlot(accesstype)))
    return Foundation.WIN32_ERROR()
}

public fun PowerSettingRegisterNotification(settingguid: Long, flags: UI.WindowsAndMessaging.REGISTER_NOTIFICATION_FLAGS, recipient: Foundation.HANDLE, registrationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingRegisterNotification", longArrayOf(settingguid, Win32DynamicFfi.objectSlot(flags), Win32DynamicFfi.objectSlot(recipient), registrationhandle))
    return Foundation.WIN32_ERROR()
}

public fun PowerSettingUnregisterNotification(registrationhandle: HPOWERNOTIFY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerSettingUnregisterNotification", longArrayOf(registrationhandle))
    return Foundation.WIN32_ERROR()
}

public fun PowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerUnregisterFromEffectivePowerModeNotifications", longArrayOf(registrationhandle)).toInt()
}

public fun PowerUnregisterSuspendResumeNotification(registrationhandle: HPOWERNOTIFY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerUnregisterSuspendResumeNotification", longArrayOf(registrationhandle))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteACDefaultIndex(rootsystempowerkey: Registry.HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: UInt): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteACDefaultIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootsystempowerkey), schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultacindex.toLong())).toUInt()
}

public fun PowerWriteACValueIndex(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteACValueIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, acvalueindex.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteDCDefaultIndex(rootsystempowerkey: Registry.HKEY, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: UInt): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteDCDefaultIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootsystempowerkey), schemepersonalityguid, subgroupofpowersettingsguid, powersettingguid, defaultdcindex.toLong())).toUInt()
}

public fun PowerWriteDCValueIndex(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: UInt): UInt {
    return Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteDCValueIndex", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, dcvalueindex.toLong())).toUInt()
}

public fun PowerWriteDescription(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteDescription", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteFriendlyName(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteFriendlyName", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteIconResourceSpecifier(rootpowerkey: Registry.HKEY, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteIconResourceSpecifier", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), schemeguid, subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWritePossibleDescription(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWritePossibleDescription", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWritePossibleFriendlyName(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWritePossibleFriendlyName", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, possiblesettingindex.toLong(), buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWritePossibleValue(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: UInt, possiblesettingindex: UInt, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWritePossibleValue", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, type.toLong(), possiblesettingindex.toLong(), buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteSettingAttributes", longArrayOf(subgroupguid, powersettingguid, attributes.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteValueIncrement(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueIncrement", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, valueincrement.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteValueMax(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueMax", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, valuemaximum.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteValueMin(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueMin", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, valueminimum.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun PowerWriteValueUnitsSpecifier(rootpowerkey: Registry.HKEY, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("powrprof.dll", "PowerWriteValueUnitsSpecifier", longArrayOf(Win32DynamicFfi.objectSlot(rootpowerkey), subgroupofpowersettingsguid, powersettingguid, buffer, buffersize.toLong()))
    return Foundation.WIN32_ERROR()
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

public fun RegisterPowerSettingNotification(hrecipient: Foundation.HANDLE, powersettingguid: Long, flags: UI.WindowsAndMessaging.REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterPowerSettingNotification", longArrayOf(Win32DynamicFfi.objectSlot(hrecipient), powersettingguid, Win32DynamicFfi.objectSlot(flags)))
}

public fun RegisterSuspendResumeNotification(hrecipient: Foundation.HANDLE, flags: UI.WindowsAndMessaging.REGISTER_NOTIFICATION_FLAGS): HPOWERNOTIFY {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterSuspendResumeNotification", longArrayOf(Win32DynamicFfi.objectSlot(hrecipient), Win32DynamicFfi.objectSlot(flags)))
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
