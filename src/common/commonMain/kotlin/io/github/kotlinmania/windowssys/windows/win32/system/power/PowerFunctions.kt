package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegSamFlags
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ReasonContext
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.RegisterNotificationFlags

public expect fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus

public expect fun canUserWritePwrScheme(): Boolean

public expect fun deletePwrScheme(uiid: UInt): Boolean

public expect fun devicePowerClose(): Boolean

public expect fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr<UByte>, pbuffersize: MutPtr<UInt>): Boolean

public expect fun devicePowerOpen(debugmask: UInt): Boolean

public expect fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr<CVoid>): UInt

public expect fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean

public expect fun getActivePwrScheme(puiid: MutPtr<UInt>): Boolean

public expect fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr<GlobalPowerPolicy>, ppowerpolicy: MutPtr<PowerPolicy>): Boolean

public expect fun getDevicePowerState(hdevice: Handle, pfon: MutPtr<Bool>): Bool

public expect fun getPwrCapabilities(lpspc: MutPtr<SystemPowerCapabilities>): Boolean

public expect fun getPwrDiskSpindownRange(puimax: MutPtr<UInt>, puimin: MutPtr<UInt>): Boolean

public expect fun getSystemPowerStatus(lpsystempowerstatus: MutPtr<SystemPowerStatus>): Bool

public expect fun isAdminOverrideActive(papp: ConstPtr<AdministratorPowerPolicy>): Boolean

public expect fun isPwrHibernateAllowed(): Boolean

public expect fun isPwrShutdownAllowed(): Boolean

public expect fun isPwrSuspendAllowed(): Boolean

public expect fun isSystemResumeAutomatic(): Bool

public expect fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr<Guid>): Win32Error

public expect fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool

public expect fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt): Win32Error

public expect fun powerCreateRequest(context: ConstPtr<ReasonContext>): Handle

public expect fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): Win32Error

public expect fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>): Win32Error

public expect fun powerDeterminePlatformRole(): PowerPlatformRole

public expect fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole

public expect fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr<Guid>, destinationschemeguid: MutPtr<MutPtr<Guid>>): Win32Error

public expect fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr<MutPtr<Guid>>): Win32Error

public expect fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr<MutPtr<Guid>>): Win32Error

public expect fun powerIsSettingRangeDefined(subkeyguid: ConstPtr<Guid>, settingguid: ConstPtr<Guid>): Boolean

public expect fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr<Hkey>, access: UInt, openexisting: Bool): UInt

public expect fun powerOpenUserPowerKey(phuserpowerkey: MutPtr<Hkey>, access: UInt, openexisting: Bool): UInt

public expect fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acdefaultindex: MutPtr<UInt>): UInt

public expect fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acvalueindex: MutPtr<UInt>): Win32Error

public expect fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcdefaultindex: MutPtr<UInt>): UInt

public expect fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcvalueindex: MutPtr<UInt>): UInt

public expect fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerReadSettingAttributes(subgroupguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): UInt

public expect fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueincrement: MutPtr<UInt>): Win32Error

public expect fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valuemaximum: MutPtr<UInt>): Win32Error

public expect fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueminimum: MutPtr<UInt>): Win32Error

public expect fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error

public expect fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr<CVoid>, registrationhandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr<MutPtr<CVoid>>): Win32Error

public expect fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): Win32Error

public expect fun powerReplaceDefaultPowerSchemes(): UInt

public expect fun powerReportThermalEvent(event: ConstPtr<ThermalEvent>): Win32Error

public expect fun powerRestoreDefaultPowerSchemes(): Win32Error

public expect fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr<Guid>): Win32Error

public expect fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr<Guid>): Win32Error

public expect fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool

public expect fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr<Guid>): Win32Error

public expect fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr<Guid>, accesstype: RegSamFlags): Win32Error

public expect fun powerSettingRegisterNotification(settingguid: ConstPtr<Guid>, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr<MutPtr<CVoid>>): Win32Error

public expect fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error

public expect fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr<CVoid>): Hresult

public expect fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error

public expect fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, defaultacindex: UInt): UInt

public expect fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acvalueindex: UInt): Win32Error

public expect fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, defaultdcindex: UInt): UInt

public expect fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcvalueindex: UInt): UInt

public expect fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun powerWriteSettingAttributes(subgroupguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, attributes: UInt): Win32Error

public expect fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueincrement: UInt): Win32Error

public expect fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valuemaximum: UInt): Win32Error

public expect fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueminimum: UInt): Win32Error

public expect fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error

public expect fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>): Boolean

public expect fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr<MachineProcessorPowerPolicy>): Boolean

public expect fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr<PowerPolicy>): Boolean

public expect fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr<Guid>, flags: RegisterNotificationFlags): Hpowernotify

public expect fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify

public expect fun requestWakeupLatency(latency: LatencyTime): Bool

public expect fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>, ppowerpolicy: ConstPtr<PowerPolicy>): Boolean

public expect fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean

public expect fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool

public expect fun setThreadExecutionState(esflags: ExecutionState): ExecutionState

public expect fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool

public expect fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool

public expect fun validatePowerPolicies(pglobalpowerpolicy: MutPtr<GlobalPowerPolicy>, ppowerpolicy: MutPtr<PowerPolicy>): Boolean

public expect fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>): Boolean

public expect fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr<MachineProcessorPowerPolicy>): Boolean

public expect fun writePwrScheme(puiid: ConstPtr<UInt>, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr<PowerPolicy>): Boolean
