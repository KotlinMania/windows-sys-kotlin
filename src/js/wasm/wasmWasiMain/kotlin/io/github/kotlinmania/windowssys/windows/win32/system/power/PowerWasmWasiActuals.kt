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

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun canUserWritePwrScheme(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devicePowerClose(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getActivePwrScheme(puiid: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDevicePowerState(hdevice: Handle, pfon: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPwrCapabilities(lpspc: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPwrDiskSpindownRange(puimax: COpaquePointer?, puimin: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemPowerStatus(lpsystempowerstatus: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isAdminOverrideActive(papp: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isPwrHibernateAllowed(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isPwrShutdownAllowed(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isPwrSuspendAllowed(): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isSystemResumeAutomatic(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerCreateRequest(context: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: COpaquePointer?, destinationschemeguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, accessflags: PowerDataAccessor, index: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerIsSettingRangeDefined(subkeyguid: COpaquePointer?, settingguid: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerOpenUserPowerKey(phuserpowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acdefaultindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcdefaultindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerReportThermalEvent(event: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: COpaquePointer?, accesstype: RegSamFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerSettingRegisterNotification(settingguid: COpaquePointer?, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultacindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultdcindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: UInt, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?, attributes: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: COpaquePointer?, flags: RegisterNotificationFlags): Hpowernotify =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun validatePowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writePwrScheme(puiid: COpaquePointer?, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
