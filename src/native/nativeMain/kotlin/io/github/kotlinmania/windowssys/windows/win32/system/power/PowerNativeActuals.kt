@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerCallNtPowerInformation
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerCanUserWritePwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerDeletePwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerDevicePowerClose
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerDevicePowerEnumDevices
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerDevicePowerOpen
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerEnumPwrSchemes
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerGetActivePwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerGetDevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerGetPwrCapabilities
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerGetSystemPowerStatus
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerIsAdminOverrideActive
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerClearRequest
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerCreateRequest
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerCreateSetting
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerDeleteScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerDuplicateScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerEnumerate
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerGetActiveScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerImportPowerScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadACValue
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadACValueIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadDCValue
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadDCValueIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadDescription
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadFriendlyName
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadPossibleDescription
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadPossibleValue
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadSettingAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadValueIncrement
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadValueMax
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadValueMin
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerRemovePowerSetting
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerReportThermalEvent
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerSetActiveScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerSetRequest
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerSettingAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteACValueIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteDescription
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteFriendlyName
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWritePossibleDescription
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWritePossibleValue
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteValueIncrement
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteValueMax
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteValueMin
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerReadProcessorPwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerReadPwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerRequestWakeupLatency
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerSetActivePwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerSetSuspendState
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerSetSystemPowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerSetThreadExecutionState
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerValidatePowerPolicies
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.power.cinterop.windowssysWindowsWin32SystemPowerWritePwrScheme
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegSamFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.RegisterNotificationFlags
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    windowssysWindowsWin32SystemPowerCallNtPowerInformation(informationlevel, inputbuffer.rawAddress.toCPointer<ByteVar>(), inputbufferlength, outputbuffer.rawAddress.toCPointer<ByteVar>(), outputbufferlength)

public actual fun canUserWritePwrScheme(): Boolean =
    windowssysWindowsWin32SystemPowerCanUserWritePwrScheme()

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    windowssysWindowsWin32SystemPowerDeletePwrScheme(uiid)

public actual fun devicePowerClose(): Boolean =
    windowssysWindowsWin32SystemPowerDevicePowerClose()

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr, pbuffersize: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(queryindex, queryinterpretationflags, queryflags, preturnbuffer.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    windowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask)

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr): UInt =
    windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(devicedescription.rawAddress.toCPointer<ByteVar>(), setflags, setdata.rawAddress.toCPointer<ByteVar>())

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    windowssysWindowsWin32SystemPowerEnumPwrSchemes(0L.toCPointer<ByteVar>(), lparam)

public actual fun getActivePwrScheme(puiid: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerGetActivePwrScheme(puiid.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(pglobalpowerpolicy.rawAddress.toCPointer<ByteVar>(), ppowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun getDevicePowerState(hdevice: Handle, pfon: MutPtr): Bool =
    windowssysWindowsWin32SystemPowerGetDevicePowerState(hdevice.rawAddress.toCPointer<ByteVar>(), pfon.rawAddress.toCPointer<ByteVar>())

public actual fun getPwrCapabilities(lpspc: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerGetPwrCapabilities(lpspc.rawAddress.toCPointer<ByteVar>())

public actual fun getPwrDiskSpindownRange(puimax: MutPtr, puimin: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(puimax.rawAddress.toCPointer<ByteVar>(), puimin.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemPowerStatus(lpsystempowerstatus: MutPtr): Bool =
    windowssysWindowsWin32SystemPowerGetSystemPowerStatus(lpsystempowerstatus.rawAddress.toCPointer<ByteVar>())

public actual fun isAdminOverrideActive(papp: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerIsAdminOverrideActive(papp.rawAddress.toCPointer<ByteVar>())

public actual fun isPwrHibernateAllowed(): Boolean =
    windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed()

public actual fun isPwrShutdownAllowed(): Boolean =
    windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed()

public actual fun isPwrSuspendAllowed(): Boolean =
    windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed()

public actual fun isSystemResumeAutomatic(): Bool =
    windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic()

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    windowssysWindowsWin32SystemPowerPowerClearRequest(powerrequest.rawAddress.toCPointer<ByteVar>(), requesttype)

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(rootsystempowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), possiblesettingindex)

public actual fun powerCreateRequest(context: ConstPtr): Handle =
    MutPtr(windowssysWindowsWin32SystemPowerPowerCreateRequest(context.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerCreateSetting(rootsystempowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerDeleteScheme(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole()

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version)

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr, destinationschemeguid: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerDuplicateScheme(rootpowerkey.rawAddress.toCPointer<ByteVar>(), sourceschemeguid.rawAddress.toCPointer<ByteVar>(), destinationschemeguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerEnumerate(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), accessflags, index, buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerGetActiveScheme(userrootpowerkey.rawAddress.toCPointer<ByteVar>(), activepolicyguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerImportPowerScheme(rootpowerkey.rawAddress.toCPointer<ByteVar>(), importfilenamepath.rawAddress.toCPointer<ByteVar>(), destinationschemeguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerIsSettingRangeDefined(subkeyguid: ConstPtr, settingguid: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(subkeyguid.rawAddress.toCPointer<ByteVar>(), settingguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(phsystempowerkey.rawAddress.toCPointer<ByteVar>(), access, openexisting)

public actual fun powerOpenUserPowerKey(phuserpowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(phuserpowerkey.rawAddress.toCPointer<ByteVar>(), access, openexisting)

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acdefaultindex: MutPtr): UInt =
    windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemepersonalityguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), acdefaultindex.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadACValue(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), type.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadACValueIndex(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), acvalueindex.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcdefaultindex: MutPtr): UInt =
    windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemepersonalityguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), dcdefaultindex.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadDCValue(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), type.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: MutPtr): UInt =
    windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), dcvalueindex.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadDescription(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadFriendlyName(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), possiblesettingindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), possiblesettingindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadPossibleValue(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), type.rawAddress.toCPointer<ByteVar>(), possiblesettingindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr): UInt =
    windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(subgroupguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadValueIncrement(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), valueincrement.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadValueMax(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), valuemaximum.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadValueMin(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), valueminimum.rawAddress.toCPointer<ByteVar>())

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr, registrationhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(version, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(flags, recipient.rawAddress.toCPointer<ByteVar>(), registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(powersettingsubkeyguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes()

public actual fun powerReportThermalEvent(event: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerReportThermalEvent(event.rawAddress.toCPointer<ByteVar>())

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes()

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerSetActiveScheme(userrootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    windowssysWindowsWin32SystemPowerPowerSetRequest(powerrequest.rawAddress.toCPointer<ByteVar>(), requesttype)

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(accessflags, powerguid.rawAddress.toCPointer<ByteVar>())

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr, accesstype: RegSamFlags): Win32Error =
    windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(accessflags, powerguid.rawAddress.toCPointer<ByteVar>(), accesstype)

public actual fun powerSettingRegisterNotification(settingguid: ConstPtr, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(settingguid.rawAddress.toCPointer<ByteVar>(), flags, recipient.rawAddress.toCPointer<ByteVar>(), registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle)

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle)

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultacindex: UInt): UInt =
    windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(rootsystempowerkey.rawAddress.toCPointer<ByteVar>(), schemepersonalityguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), defaultacindex)

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), acvalueindex)

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultdcindex: UInt): UInt =
    windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(rootsystempowerkey.rawAddress.toCPointer<ByteVar>(), schemepersonalityguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), defaultdcindex)

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: UInt): UInt =
    windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), dcvalueindex)

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteDescription(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(rootpowerkey.rawAddress.toCPointer<ByteVar>(), schemeguid.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), possiblesettingindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), possiblesettingindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWritePossibleValue(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), type, possiblesettingindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun powerWriteSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr, attributes: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(subgroupguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), attributes)

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), valueincrement)

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteValueMax(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), valuemaximum)

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteValueMin(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), valueminimum)

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(rootpowerkey.rawAddress.toCPointer<ByteVar>(), subgroupofpowersettingsguid.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(pglobalpowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(uiid, pmachineprocessorpowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerReadPwrScheme(uiid, ppowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr, flags: RegisterNotificationFlags): Hpowernotify =
    windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(hrecipient.rawAddress.toCPointer<ByteVar>(), powersettingguid.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(hrecipient.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    windowssysWindowsWin32SystemPowerRequestWakeupLatency(latency)

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr, ppowerpolicy: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerSetActivePwrScheme(uiid, pglobalpowerpolicy.rawAddress.toCPointer<ByteVar>(), ppowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    windowssysWindowsWin32SystemPowerSetSuspendState(bhibernate, bforce, bwakeupeventsdisabled)

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    windowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend, fforce)

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    windowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags)

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle)

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle)

public actual fun validatePowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    windowssysWindowsWin32SystemPowerValidatePowerPolicies(pglobalpowerpolicy.rawAddress.toCPointer<ByteVar>(), ppowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(pglobalpowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(uiid, pmachineprocessorpowerpolicy.rawAddress.toCPointer<ByteVar>())

public actual fun writePwrScheme(puiid: ConstPtr, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr): Boolean =
    windowssysWindowsWin32SystemPowerWritePwrScheme(puiid.rawAddress.toCPointer<ByteVar>(), lpszschemename.rawAddress.toCPointer<ByteVar>(), lpszdescription.rawAddress.toCPointer<ByteVar>(), lpscheme.rawAddress.toCPointer<ByteVar>())
