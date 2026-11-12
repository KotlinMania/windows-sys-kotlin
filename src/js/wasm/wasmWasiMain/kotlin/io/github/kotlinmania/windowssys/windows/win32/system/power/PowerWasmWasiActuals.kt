@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerCallNtPowerInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerCanUserWritePwrScheme")
private external fun wasiWindowssysWindowsWin32SystemPowerCanUserWritePwrScheme(): Int

public actual fun canUserWritePwrScheme(): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerCanUserWritePwrScheme() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerDeletePwrScheme")
private external fun wasiWindowssysWindowsWin32SystemPowerDeletePwrScheme(uiid: Int): Int

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerDeletePwrScheme(uiid.toInt()) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerDevicePowerClose")
private external fun wasiWindowssysWindowsWin32SystemPowerDevicePowerClose(): Int

public actual fun devicePowerClose(): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerDevicePowerClose() != 0)

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr<UByte>, pbuffersize: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerDevicePowerEnumDevices")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerDevicePowerOpen")
private external fun wasiWindowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask: Int): Int

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask.toInt()) != 0)

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerEnumPwrSchemes")

public actual fun getActivePwrScheme(puiid: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetActivePwrScheme")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr<GlobalPowerPolicy>, ppowerpolicy: MutPtr<PowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies")

public actual fun getDevicePowerState(hdevice: Handle, pfon: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetDevicePowerState")

public actual fun getPwrCapabilities(lpspc: MutPtr<SystemPowerCapabilities>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetPwrCapabilities")

public actual fun getPwrDiskSpindownRange(puimax: MutPtr<UInt>, puimin: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange")

public actual fun getSystemPowerStatus(lpsystempowerstatus: MutPtr<SystemPowerStatus>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetSystemPowerStatus")

public actual fun isAdminOverrideActive(papp: ConstPtr<AdministratorPowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerIsAdminOverrideActive")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed")
private external fun wasiWindowssysWindowsWin32SystemPowerIsPwrHibernateAllowed(): Int

public actual fun isPwrHibernateAllowed(): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerIsPwrHibernateAllowed() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed")
private external fun wasiWindowssysWindowsWin32SystemPowerIsPwrShutdownAllowed(): Int

public actual fun isPwrShutdownAllowed(): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerIsPwrShutdownAllowed() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed")
private external fun wasiWindowssysWindowsWin32SystemPowerIsPwrSuspendAllowed(): Int

public actual fun isPwrSuspendAllowed(): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerIsPwrSuspendAllowed() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic")
private external fun wasiWindowssysWindowsWin32SystemPowerIsSystemResumeAutomatic(): Int

public actual fun isSystemResumeAutomatic(): Bool =
    wasiWindowssysWindowsWin32SystemPowerIsSystemResumeAutomatic().toInt()

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerClearRequest")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting")

public actual fun powerCreateRequest(context: ConstPtr<ReasonContext>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCreateRequest")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCreateSetting")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerDeleteScheme")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRole(): Int

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRole().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version: Int): Int

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version.toInt()).toInt()

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr<Guid>, destinationschemeguid: MutPtr<MutPtr<Guid>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerDuplicateScheme")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerEnumerate")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr<MutPtr<Guid>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerGetActiveScheme")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr<MutPtr<Guid>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerImportPowerScheme")

public actual fun powerIsSettingRangeDefined(subkeyguid: ConstPtr<Guid>, settingguid: ConstPtr<Guid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr<Hkey>, access: UInt, openexisting: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey")

public actual fun powerOpenUserPowerKey(phuserpowerkey: MutPtr<Hkey>, access: UInt, openexisting: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acdefaultindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadACValue")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acvalueindex: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadACValueIndex")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcdefaultindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDCValue")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcvalueindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDCValueIndex")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDescription")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadFriendlyName")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadPossibleDescription")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: MutPtr<UInt>, possiblesettingindex: UInt, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadPossibleValue")

public actual fun powerReadSettingAttributes(subgroupguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadSettingAttributes")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueincrement: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueIncrement")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valuemaximum: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueMax")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueminimum: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueMin")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: MutPtr<UByte>, buffersize: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr<CVoid>, registrationhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr<MutPtr<CVoid>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRemovePowerSetting")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes(): Int

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    wasiWindowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes().toUInt()

public actual fun powerReportThermalEvent(event: ConstPtr<ThermalEvent>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReportThermalEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes(): Int

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    wasiWindowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes().toUInt()

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSetActiveScheme")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSetRequest")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSettingAccessCheck")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr<Guid>, accesstype: RegSamFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx")

public actual fun powerSettingRegisterNotification(settingguid: ConstPtr<Guid>, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr<MutPtr<CVoid>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle: Long): Int

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    wasiWindowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle).toUInt()

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle: Long): Int

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    wasiWindowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle).toUInt()

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, defaultacindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, acvalueindex: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteACValueIndex")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, defaultdcindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, dcvalueindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteDescription")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteFriendlyName")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr<Guid>, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWritePossibleDescription")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWritePossibleValue")

public actual fun powerWriteSettingAttributes(subgroupguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, attributes: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueincrement: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueIncrement")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valuemaximum: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueMax")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, valueminimum: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueMin")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr<Guid>, powersettingguid: ConstPtr<Guid>, buffer: ConstPtr<UByte>, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr<MachineProcessorPowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerReadProcessorPwrScheme")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr<PowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerReadPwrScheme")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr<Guid>, flags: RegisterNotificationFlags): Hpowernotify =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerRequestWakeupLatency")
private external fun wasiWindowssysWindowsWin32SystemPowerRequestWakeupLatency(latency: Int): Int

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    wasiWindowssysWindowsWin32SystemPowerRequestWakeupLatency(latency).toInt()

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>, ppowerpolicy: ConstPtr<PowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerSetActivePwrScheme")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerSetSuspendState")
private external fun wasiWindowssysWindowsWin32SystemPowerSetSuspendState(bhibernate: Int, bforce: Int, bwakeupeventsdisabled: Int): Int

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerSetSuspendState(if (bhibernate) 1 else 0, if (bforce) 1 else 0, if (bwakeupeventsdisabled) 1 else 0) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerSetSystemPowerState")
private external fun wasiWindowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend: Int, fforce: Int): Int

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    wasiWindowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend, fforce).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerSetThreadExecutionState")
private external fun wasiWindowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags: Int): Int

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    wasiWindowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle: Long): Int

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    wasiWindowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle: Long): Int

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    wasiWindowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle).toInt()

public actual fun validatePowerPolicies(pglobalpowerpolicy: MutPtr<GlobalPowerPolicy>, ppowerpolicy: MutPtr<PowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerValidatePowerPolicies")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr<GlobalPowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr<MachineProcessorPowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme")

public actual fun writePwrScheme(puiid: ConstPtr<UInt>, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr<PowerPolicy>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerWritePwrScheme")
