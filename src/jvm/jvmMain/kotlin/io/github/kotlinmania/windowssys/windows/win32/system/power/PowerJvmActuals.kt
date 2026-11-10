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

private object WindowsWin32SystemPowerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_power_callNtPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_canUserWritePwrScheme(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_deletePwrScheme(uiid: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_devicePowerClose(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_devicePowerEnumDevices(queryindex: Int, queryinterpretationflags: Int, queryflags: Int, preturnbuffer: Long, pbuffersize: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_devicePowerOpen(debugmask: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_devicePowerSetDeviceState(devicedescription: Long, setflags: Int, setdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_enumPwrSchemes(lpfn: Long, lparam: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_getActivePwrScheme(puiid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_getCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_getDevicePowerState(hdevice: Long, pfon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_getPwrCapabilities(lpspc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_getPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_getSystemPowerStatus(lpsystempowerstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_isAdminOverrideActive(papp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_isPwrHibernateAllowed(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_isPwrShutdownAllowed(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_isPwrSuspendAllowed(): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_isSystemResumeAutomatic(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerClearRequest(powerrequest: Long, requesttype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerCreatePossibleSetting(rootsystempowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerCreateRequest(context: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerCreateSetting(rootsystempowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerDeleteScheme(rootpowerkey: Long, schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerDeterminePlatformRole(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(version: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerDuplicateScheme(rootpowerkey: Long, sourceschemeguid: Long, destinationschemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerEnumerate(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: Int, index: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerGetActiveScheme(userrootpowerkey: Long, activepolicyguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerImportPowerScheme(rootpowerkey: Long, importfilenamepath: Long, destinationschemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerOpenSystemPowerKey(phsystempowerkey: Long, access: Int, openexisting: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerOpenUserPowerKey(phuserpowerkey: Long, access: Int, openexisting: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadACDefaultIndex(rootpowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadACValue(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadACValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadDCDefaultIndex(rootpowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadDCValue(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadDCValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadDescription(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadFriendlyName(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadIconResourceSpecifier(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadPossibleDescription(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadPossibleFriendlyName(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadPossibleValue(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadValueIncrement(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadValueMax(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadValueMin(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(version: Int, callback: Long, context: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(flags: Int, recipient: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerReportThermalEvent(event: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme(schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerSetActiveScheme(userrootpowerkey: Long, schemeguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerSetRequest(powerrequest: Long, requesttype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerSettingAccessCheck(accessflags: Int, powerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerSettingAccessCheckEx(accessflags: Int, powerguid: Long, accesstype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerSettingRegisterNotification(settingguid: Long, flags: Int, recipient: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerSettingUnregisterNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteACDefaultIndex(rootsystempowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteACValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteDCDefaultIndex(rootsystempowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteDCValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteDescription(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteFriendlyName(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWritePossibleDescription(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWritePossibleFriendlyName(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWritePossibleValue(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Int, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteValueIncrement(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteValueMax(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteValueMin(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_readGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_readProcessorPwrScheme(uiid: Int, pmachineprocessorpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_readPwrScheme(uiid: Int, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_registerPowerSettingNotification(hrecipient: Long, powersettingguid: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_registerSuspendResumeNotification(hrecipient: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_requestWakeupLatency(latency: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_setActivePwrScheme(uiid: Int, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_setSystemPowerState(fsuspend: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_setThreadExecutionState(esflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_unregisterPowerSettingNotification(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_power_validatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_writeGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_writeProcessorPwrScheme(uiid: Int, pmachineprocessorpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_power_writePwrScheme(puiid: Long, lpszschemename: Long, lpszdescription: Long, lpscheme: Long): Boolean
}

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_callNtPowerInformation(informationlevel, (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())

public actual fun canUserWritePwrScheme(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_canUserWritePwrScheme()

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_deletePwrScheme(uiid.toInt())

public actual fun devicePowerClose(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_devicePowerClose()

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_devicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), (preturnbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L))

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_devicePowerOpen(debugmask.toInt())

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: COpaquePointer?): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_devicePowerSetDeviceState((devicedescription?.value ?: 0L), setflags.toInt(), (setdata?.value ?: 0L)).toUInt()

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_enumPwrSchemes(0L, lparam)

public actual fun getActivePwrScheme(puiid: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_getActivePwrScheme((puiid?.value ?: 0L))

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_getCurrentPowerPolicies((pglobalpowerpolicy?.value ?: 0L), (ppowerpolicy?.value ?: 0L))

public actual fun getDevicePowerState(hdevice: Handle, pfon: COpaquePointer?): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_getDevicePowerState((hdevice?.value ?: 0L), (pfon?.value ?: 0L))

public actual fun getPwrCapabilities(lpspc: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_getPwrCapabilities((lpspc?.value ?: 0L))

public actual fun getPwrDiskSpindownRange(puimax: COpaquePointer?, puimin: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_getPwrDiskSpindownRange((puimax?.value ?: 0L), (puimin?.value ?: 0L))

public actual fun getSystemPowerStatus(lpsystempowerstatus: COpaquePointer?): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_getSystemPowerStatus((lpsystempowerstatus?.value ?: 0L))

public actual fun isAdminOverrideActive(papp: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_isAdminOverrideActive((papp?.value ?: 0L))

public actual fun isPwrHibernateAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_isPwrHibernateAllowed()

public actual fun isPwrShutdownAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_isPwrShutdownAllowed()

public actual fun isPwrSuspendAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_isPwrSuspendAllowed()

public actual fun isSystemResumeAutomatic(): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_isSystemResumeAutomatic()

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerCanRestoreIndividualDefaultPowerScheme((schemeguid?.value ?: 0L)).toUInt()

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerClearRequest((powerrequest?.value ?: 0L), requesttype)

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerCreatePossibleSetting((rootsystempowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), possiblesettingindex.toInt()).toUInt()

public actual fun powerCreateRequest(context: COpaquePointer?): Handle =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerCreateRequest((context?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerCreateSetting((rootsystempowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L)).toUInt()

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerDeleteScheme((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L)).toUInt()

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerDeterminePlatformRole()

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerDeterminePlatformRoleEx(version.toInt())

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: COpaquePointer?, destinationschemeguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerDuplicateScheme((rootpowerkey?.value ?: 0L), (sourceschemeguid?.value ?: 0L), (destinationschemeguid?.value ?: 0L)).toUInt()

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, accessflags: PowerDataAccessor, index: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerEnumerate((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), accessflags, index.toInt(), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerGetActiveScheme((userrootpowerkey?.value ?: 0L), (activepolicyguid?.value ?: 0L)).toUInt()

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerImportPowerScheme((rootpowerkey?.value ?: 0L), (importfilenamepath?.value ?: 0L), (destinationschemeguid?.value ?: 0L)).toUInt()

public actual fun powerIsSettingRangeDefined(subkeyguid: COpaquePointer?, settingguid: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerIsSettingRangeDefined((subkeyguid?.value ?: 0L), (settingguid?.value ?: 0L))

public actual fun powerOpenSystemPowerKey(phsystempowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerOpenSystemPowerKey((phsystempowerkey?.value ?: 0L), access.toInt(), openexisting).toUInt()

public actual fun powerOpenUserPowerKey(phuserpowerkey: COpaquePointer?, access: UInt, openexisting: Bool): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerOpenUserPowerKey((phuserpowerkey?.value ?: 0L), access.toInt(), openexisting).toUInt()

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acdefaultindex: COpaquePointer?): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadACDefaultIndex((rootpowerkey?.value ?: 0L), (schemepersonalityguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (acdefaultindex?.value ?: 0L)).toUInt()

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadACValue((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (type?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadACValueIndex((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (acvalueindex?.value ?: 0L)).toUInt()

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcdefaultindex: COpaquePointer?): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadDCDefaultIndex((rootpowerkey?.value ?: 0L), (schemepersonalityguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (dcdefaultindex?.value ?: 0L)).toUInt()

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadDCValue((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (type?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: COpaquePointer?): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadDCValueIndex((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (dcvalueindex?.value ?: 0L)).toUInt()

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadDescription((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadFriendlyName((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadIconResourceSpecifier((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadPossibleDescription((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), possiblesettingindex.toInt(), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadPossibleFriendlyName((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), possiblesettingindex.toInt(), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadPossibleValue((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (type?.value ?: 0L), possiblesettingindex.toInt(), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerReadSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadSettingAttributes((subgroupguid?.value ?: 0L), (powersettingguid?.value ?: 0L)).toUInt()

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadValueIncrement((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (valueincrement?.value ?: 0L)).toUInt()

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadValueMax((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (valuemaximum?.value ?: 0L)).toUInt()

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadValueMin((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (valueminimum?.value ?: 0L)).toUInt()

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReadValueUnitsSpecifier((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerRegisterForEffectivePowerModeNotifications(version.toInt(), 0L, (context?.value ?: 0L), (registrationhandle?.value ?: 0L))

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerRegisterSuspendResumeNotification(flags.toInt(), (recipient?.value ?: 0L), (registrationhandle?.value ?: 0L)).toUInt()

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: COpaquePointer?, powersettingguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerRemovePowerSetting((powersettingsubkeyguid?.value ?: 0L), (powersettingguid?.value ?: 0L)).toUInt()

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReplaceDefaultPowerSchemes().toUInt()

public actual fun powerReportThermalEvent(event: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerReportThermalEvent((event?.value ?: 0L)).toUInt()

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerRestoreDefaultPowerSchemes().toUInt()

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerRestoreIndividualDefaultPowerScheme((schemeguid?.value ?: 0L)).toUInt()

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerSetActiveScheme((userrootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L)).toUInt()

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerSetRequest((powerrequest?.value ?: 0L), requesttype)

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerSettingAccessCheck(accessflags, (powerguid?.value ?: 0L)).toUInt()

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: COpaquePointer?, accesstype: RegSamFlags): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerSettingAccessCheckEx(accessflags, (powerguid?.value ?: 0L), accesstype.toInt()).toUInt()

public actual fun powerSettingRegisterNotification(settingguid: COpaquePointer?, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: COpaquePointer?): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerSettingRegisterNotification((settingguid?.value ?: 0L), flags.toInt(), (recipient?.value ?: 0L), (registrationhandle?.value ?: 0L)).toUInt()

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerSettingUnregisterNotification(registrationhandle.toLong()).toUInt()

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerUnregisterFromEffectivePowerModeNotifications((registrationhandle?.value ?: 0L))

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerUnregisterSuspendResumeNotification(registrationhandle.toLong()).toUInt()

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultacindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteACDefaultIndex((rootsystempowerkey?.value ?: 0L), (schemepersonalityguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), defaultacindex.toInt()).toUInt()

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, acvalueindex: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteACValueIndex((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), acvalueindex.toInt()).toUInt()

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, defaultdcindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteDCDefaultIndex((rootsystempowerkey?.value ?: 0L), (schemepersonalityguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), defaultdcindex.toInt()).toUInt()

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, dcvalueindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteDCValueIndex((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), dcvalueindex.toInt()).toUInt()

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteDescription((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteFriendlyName((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: COpaquePointer?, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteIconResourceSpecifier((rootpowerkey?.value ?: 0L), (schemeguid?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWritePossibleDescription((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), possiblesettingindex.toInt(), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWritePossibleFriendlyName((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), possiblesettingindex.toInt(), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, type: UInt, possiblesettingindex: UInt, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWritePossibleValue((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), type.toInt(), possiblesettingindex.toInt(), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun powerWriteSettingAttributes(subgroupguid: COpaquePointer?, powersettingguid: COpaquePointer?, attributes: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteSettingAttributes((subgroupguid?.value ?: 0L), (powersettingguid?.value ?: 0L), attributes.toInt()).toUInt()

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueincrement: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteValueIncrement((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), valueincrement.toInt()).toUInt()

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valuemaximum: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteValueMax((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), valuemaximum.toInt()).toUInt()

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, valueminimum: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteValueMin((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), valueminimum.toInt()).toUInt()

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: COpaquePointer?, powersettingguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_powerWriteValueUnitsSpecifier((rootpowerkey?.value ?: 0L), (subgroupofpowersettingsguid?.value ?: 0L), (powersettingguid?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_readGlobalPwrPolicy((pglobalpowerpolicy?.value ?: 0L))

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_readProcessorPwrScheme(uiid.toInt(), (pmachineprocessorpowerpolicy?.value ?: 0L))

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_readPwrScheme(uiid.toInt(), (ppowerpolicy?.value ?: 0L))

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: COpaquePointer?, flags: RegisterNotificationFlags): Hpowernotify =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_registerPowerSettingNotification((hrecipient?.value ?: 0L), (powersettingguid?.value ?: 0L), flags.toInt())

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_registerSuspendResumeNotification((hrecipient?.value ?: 0L), flags.toInt())

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_requestWakeupLatency(latency)

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_setActivePwrScheme(uiid.toInt(), (pglobalpowerpolicy?.value ?: 0L), (ppowerpolicy?.value ?: 0L))

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_setSuspendState(bhibernate, bforce, bwakeupeventsdisabled)

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_setSystemPowerState(fsuspend, fforce)

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_setThreadExecutionState(esflags.toInt()).toUInt()

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_unregisterPowerSettingNotification(handle.toLong())

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_unregisterSuspendResumeNotification(handle.toLong())

public actual fun validatePowerPolicies(pglobalpowerpolicy: COpaquePointer?, ppowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_validatePowerPolicies((pglobalpowerpolicy?.value ?: 0L), (ppowerpolicy?.value ?: 0L))

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_writeGlobalPwrPolicy((pglobalpowerpolicy?.value ?: 0L))

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_writeProcessorPwrScheme(uiid.toInt(), (pmachineprocessorpowerpolicy?.value ?: 0L))

public actual fun writePwrScheme(puiid: COpaquePointer?, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: COpaquePointer?): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssys_windows_win32_system_power_writePwrScheme((puiid?.value ?: 0L), (lpszschemename?.value ?: 0L), (lpszdescription?.value ?: 0L), (lpscheme?.value ?: 0L))
