@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
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

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr, pbuffersize: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerDevicePowerEnumDevices")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerDevicePowerOpen")
private external fun wasiWindowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask: Int): Int

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask.toInt()) != 0)

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState")

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerEnumPwrSchemes")

public actual fun getActivePwrScheme(puiid: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetActivePwrScheme")

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies")

public actual fun getDevicePowerState(hdevice: Handle, pfon: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetDevicePowerState")

public actual fun getPwrCapabilities(lpspc: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetPwrCapabilities")

public actual fun getPwrDiskSpindownRange(puimax: MutPtr, puimin: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange")

public actual fun getSystemPowerStatus(lpsystempowerstatus: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerGetSystemPowerStatus")

public actual fun isAdminOverrideActive(papp: ConstPtr): Boolean =
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
    wasiWindowssysWindowsWin32SystemPowerIsSystemResumeAutomatic()

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme")

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerClearRequest")

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting")

public actual fun powerCreateRequest(context: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCreateRequest")

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerCreateSetting")

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerDeleteScheme")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRole(): Int

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRole()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version: Int): Int

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    wasiWindowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version.toInt())

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr, destinationschemeguid: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerDuplicateScheme")

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerEnumerate")

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerGetActiveScheme")

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerImportPowerScheme")

public actual fun powerIsSettingRangeDefined(subkeyguid: ConstPtr, settingguid: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined")

public actual fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey")

public actual fun powerOpenUserPowerKey(phuserpowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey")

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acdefaultindex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex")

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadACValue")

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadACValueIndex")

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcdefaultindex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex")

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDCValue")

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDCValueIndex")

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadDescription")

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadFriendlyName")

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier")

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadPossibleDescription")

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName")

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadPossibleValue")

public actual fun powerReadSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadSettingAttributes")

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueIncrement")

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueMax")

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueMin")

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier")

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr, registrationhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications")

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification")

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRemovePowerSetting")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes(): Int

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    wasiWindowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes().toUInt()

public actual fun powerReportThermalEvent(event: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerReportThermalEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes(): Int

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    wasiWindowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes().toUInt()

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme")

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSetActiveScheme")

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSetRequest")

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSettingAccessCheck")

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr, accesstype: RegSamFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx")

public actual fun powerSettingRegisterNotification(settingguid: ConstPtr, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle: Long): Int

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    wasiWindowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle).toUInt()

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle: Long): Int

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    wasiWindowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle).toUInt()

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultacindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex")

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteACValueIndex")

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultdcindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex")

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex")

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteDescription")

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteFriendlyName")

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier")

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWritePossibleDescription")

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName")

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWritePossibleValue")

public actual fun powerWriteSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr, attributes: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes")

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueIncrement")

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueMax")

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueMin")

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier")

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy")

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerReadProcessorPwrScheme")

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerReadPwrScheme")

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr, flags: RegisterNotificationFlags): Hpowernotify =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification")

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerRequestWakeupLatency")
private external fun wasiWindowssysWindowsWin32SystemPowerRequestWakeupLatency(latency: Int): Int

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    wasiWindowssysWindowsWin32SystemPowerRequestWakeupLatency(latency)

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr, ppowerpolicy: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerSetActivePwrScheme")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerSetSuspendState")
private external fun wasiWindowssysWindowsWin32SystemPowerSetSuspendState(bhibernate: Int, bforce: Int, bwakeupeventsdisabled: Int): Int

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    (wasiWindowssysWindowsWin32SystemPowerSetSuspendState(if (bhibernate) 1 else 0, if (bforce) 1 else 0, if (bwakeupeventsdisabled) 1 else 0) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerSetSystemPowerState")
private external fun wasiWindowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend: Int, fforce: Int): Int

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    wasiWindowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend, fforce)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerSetThreadExecutionState")
private external fun wasiWindowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags: Int): Int

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    wasiWindowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle: Long): Int

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    wasiWindowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification")
private external fun wasiWindowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle: Long): Int

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    wasiWindowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle)

public actual fun validatePowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerValidatePowerPolicies")

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy")

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme")

public actual fun writePwrScheme(puiid: ConstPtr, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPowerWritePwrScheme")
