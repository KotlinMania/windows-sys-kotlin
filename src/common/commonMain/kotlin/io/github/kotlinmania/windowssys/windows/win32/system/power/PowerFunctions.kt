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

public expect fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus

public expect fun canUserWritePwrScheme(): Boolean

public expect fun deletePwrScheme(uiid: UInt): Boolean

public expect fun devicePowerClose(): Boolean

public expect fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr, pbuffersize: MutPtr): Boolean

public expect fun devicePowerOpen(debugmask: UInt): Boolean

public expect fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr): UInt

public expect fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean

public expect fun getActivePwrScheme(puiid: MutPtr): Boolean

public expect fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean

public expect fun getDevicePowerState(hdevice: Handle, pfon: MutPtr): Bool

public expect fun getPwrCapabilities(lpspc: MutPtr): Boolean

public expect fun getPwrDiskSpindownRange(puimax: MutPtr, puimin: MutPtr): Boolean

public expect fun getSystemPowerStatus(lpsystempowerstatus: MutPtr): Bool

public expect fun isAdminOverrideActive(papp: ConstPtr): Boolean

public expect fun isPwrHibernateAllowed(): Boolean

public expect fun isPwrShutdownAllowed(): Boolean

public expect fun isPwrSuspendAllowed(): Boolean

public expect fun isSystemResumeAutomatic(): Bool

public expect fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error

public expect fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool

public expect fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt): Win32Error

public expect fun powerCreateRequest(context: ConstPtr): Handle

public expect fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr): Win32Error

public expect fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error

public expect fun powerDeterminePlatformRole(): PowerPlatformRole

public expect fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole

public expect fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr, destinationschemeguid: MutPtr): Win32Error

public expect fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr): Win32Error

public expect fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr): Win32Error

public expect fun powerIsSettingRangeDefined(subkeyguid: ConstPtr, settingguid: ConstPtr): Boolean

public expect fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr, access: UInt, openexisting: Bool): UInt

public expect fun powerOpenUserPowerKey(phuserpowerkey: MutPtr, access: UInt, openexisting: Bool): UInt

public expect fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acdefaultindex: MutPtr): UInt

public expect fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: MutPtr): Win32Error

public expect fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcdefaultindex: MutPtr): UInt

public expect fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: MutPtr): UInt

public expect fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerReadSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr): UInt

public expect fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: MutPtr): Win32Error

public expect fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: MutPtr): Win32Error

public expect fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: MutPtr): Win32Error

public expect fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error

public expect fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr, registrationhandle: MutPtr): Hresult

public expect fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error

public expect fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr, powersettingguid: ConstPtr): Win32Error

public expect fun powerReplaceDefaultPowerSchemes(): UInt

public expect fun powerReportThermalEvent(event: ConstPtr): Win32Error

public expect fun powerRestoreDefaultPowerSchemes(): Win32Error

public expect fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error

public expect fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error

public expect fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool

public expect fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr): Win32Error

public expect fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr, accesstype: RegSamFlags): Win32Error

public expect fun powerSettingRegisterNotification(settingguid: ConstPtr, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error

public expect fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error

public expect fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr): Hresult

public expect fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error

public expect fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultacindex: UInt): UInt

public expect fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: UInt): Win32Error

public expect fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultdcindex: UInt): UInt

public expect fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: UInt): UInt

public expect fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun powerWriteSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr, attributes: UInt): Win32Error

public expect fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: UInt): Win32Error

public expect fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: UInt): Win32Error

public expect fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: UInt): Win32Error

public expect fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error

public expect fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean

public expect fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr): Boolean

public expect fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr): Boolean

public expect fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr, flags: RegisterNotificationFlags): Hpowernotify

public expect fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify

public expect fun requestWakeupLatency(latency: LatencyTime): Bool

public expect fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr, ppowerpolicy: ConstPtr): Boolean

public expect fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean

public expect fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool

public expect fun setThreadExecutionState(esflags: ExecutionState): ExecutionState

public expect fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool

public expect fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool

public expect fun validatePowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean

public expect fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean

public expect fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr): Boolean

public expect fun writePwrScheme(puiid: ConstPtr, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr): Boolean
