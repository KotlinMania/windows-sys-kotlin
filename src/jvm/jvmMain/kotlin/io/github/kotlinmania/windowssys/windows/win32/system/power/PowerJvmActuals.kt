@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemPowerJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemPowerJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerCallNtPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerCanUserWritePwrScheme(): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerDeletePwrScheme(uiid: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerDevicePowerClose(): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(queryindex: Int, queryinterpretationflags: Int, queryflags: Int, preturnbuffer: Long, pbuffersize: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(devicedescription: Long, setflags: Int, setdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerEnumPwrSchemes(lpfn: Long, lparam: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerGetActivePwrScheme(puiid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerGetDevicePowerState(hdevice: Long, pfon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerGetPwrCapabilities(lpspc: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(puimax: Long, puimin: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerGetSystemPowerStatus(lpsystempowerstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerIsAdminOverrideActive(papp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed(): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed(): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed(): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(schemeguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerClearRequest(powerrequest: Long, requesttype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(rootsystempowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerCreateRequest(context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerCreateSetting(rootsystempowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerDeleteScheme(rootpowerkey: Long, schemeguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerDuplicateScheme(rootpowerkey: Long, sourceschemeguid: Long, destinationschemeguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerEnumerate(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, accessflags: Int, index: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerGetActiveScheme(userrootpowerkey: Long, activepolicyguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerImportPowerScheme(rootpowerkey: Long, importfilenamepath: Long, destinationschemeguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(subkeyguid: Long, settingguid: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(phsystempowerkey: Long, access: Int, openexisting: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(phuserpowerkey: Long, access: Int, openexisting: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(rootpowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acdefaultindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadACValue(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadACValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(rootpowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcdefaultindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadDCValue(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadDescription(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadFriendlyName(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadPossibleValue(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Long, possiblesettingindex: Int, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(subgroupguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadValueIncrement(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadValueMax(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadValueMin(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(version: Int, callback: Long, context: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(flags: Int, recipient: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(powersettingsubkeyguid: Long, powersettingguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerReportThermalEvent(event: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(schemeguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerSetActiveScheme(userrootpowerkey: Long, schemeguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerSetRequest(powerrequest: Long, requesttype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(accessflags: Int, powerguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(accessflags: Int, powerguid: Long, accesstype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(settingguid: Long, flags: Int, recipient: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(rootsystempowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultacindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, acvalueindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(rootsystempowerkey: Long, schemepersonalityguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, defaultdcindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, dcvalueindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteDescription(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(rootpowerkey: Long, schemeguid: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWritePossibleValue(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, type: Int, possiblesettingindex: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(subgroupguid: Long, powersettingguid: Long, attributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueincrement: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteValueMax(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valuemaximum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteValueMin(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, valueminimum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(rootpowerkey: Long, subgroupofpowersettingsguid: Long, powersettingguid: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(uiid: Int, pmachineprocessorpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerReadPwrScheme(uiid: Int, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(hrecipient: Long, powersettingguid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(hrecipient: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerRequestWakeupLatency(latency: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerSetActivePwrScheme(uiid: Int, pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerSetSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerValidatePowerPolicies(pglobalpowerpolicy: Long, ppowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(pglobalpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(uiid: Int, pmachineprocessorpowerpolicy: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemPowerWritePwrScheme(puiid: Long, lpszschemename: Long, lpszdescription: Long, lpscheme: Long): Boolean
}

public actual fun callNtPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerCallNtPowerInformation(informationlevel, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun canUserWritePwrScheme(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerCanUserWritePwrScheme()

public actual fun deletePwrScheme(uiid: UInt): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerDeletePwrScheme(uiid.toInt())

public actual fun devicePowerClose(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerDevicePowerClose()

public actual fun devicePowerEnumDevices(queryindex: UInt, queryinterpretationflags: UInt, queryflags: UInt, preturnbuffer: MutPtr, pbuffersize: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(queryindex.toInt(), queryinterpretationflags.toInt(), queryflags.toInt(), preturnbuffer.rawAddress, pbuffersize.rawAddress)

public actual fun devicePowerOpen(debugmask: UInt): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerDevicePowerOpen(debugmask.toInt())

public actual fun devicePowerSetDeviceState(devicedescription: Pcwstr, setflags: UInt, setdata: ConstPtr): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(devicedescription.rawAddress, setflags.toInt(), setdata.rawAddress).toUInt()

public actual fun enumPwrSchemes(lpfn: Pwrschemesenumproc, lparam: Lparam): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerEnumPwrSchemes(0L, lparam)

public actual fun getActivePwrScheme(puiid: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerGetActivePwrScheme(puiid.rawAddress)

public actual fun getCurrentPowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(pglobalpowerpolicy.rawAddress, ppowerpolicy.rawAddress)

public actual fun getDevicePowerState(hdevice: Handle, pfon: MutPtr): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerGetDevicePowerState(hdevice.rawAddress, pfon.rawAddress)

public actual fun getPwrCapabilities(lpspc: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerGetPwrCapabilities(lpspc.rawAddress)

public actual fun getPwrDiskSpindownRange(puimax: MutPtr, puimin: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(puimax.rawAddress, puimin.rawAddress)

public actual fun getSystemPowerStatus(lpsystempowerstatus: MutPtr): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerGetSystemPowerStatus(lpsystempowerstatus.rawAddress)

public actual fun isAdminOverrideActive(papp: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerIsAdminOverrideActive(papp.rawAddress)

public actual fun isPwrHibernateAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed()

public actual fun isPwrShutdownAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed()

public actual fun isPwrSuspendAllowed(): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed()

public actual fun isSystemResumeAutomatic(): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic()

public actual fun powerCanRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress).toUInt()

public actual fun powerClearRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerClearRequest(powerrequest.rawAddress, requesttype)

public actual fun powerCreatePossibleSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(rootsystempowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, possiblesettingindex.toInt()).toUInt()

public actual fun powerCreateRequest(context: ConstPtr): Handle =
    MutPtr(WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerCreateRequest(context.rawAddress))

public actual fun powerCreateSetting(rootsystempowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerCreateSetting(rootsystempowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress).toUInt()

public actual fun powerDeleteScheme(rootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerDeleteScheme(rootpowerkey.rawAddress, schemeguid.rawAddress).toUInt()

public actual fun powerDeterminePlatformRole(): PowerPlatformRole =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole()

public actual fun powerDeterminePlatformRoleEx(version: PowerPlatformRoleVersion): PowerPlatformRole =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(version.toInt())

public actual fun powerDuplicateScheme(rootpowerkey: Hkey, sourceschemeguid: ConstPtr, destinationschemeguid: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerDuplicateScheme(rootpowerkey.rawAddress, sourceschemeguid.rawAddress, destinationschemeguid.rawAddress).toUInt()

public actual fun powerEnumerate(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, accessflags: PowerDataAccessor, index: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerEnumerate(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, accessflags, index.toInt(), buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerGetActiveScheme(userrootpowerkey: Hkey, activepolicyguid: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerGetActiveScheme(userrootpowerkey.rawAddress, activepolicyguid.rawAddress).toUInt()

public actual fun powerImportPowerScheme(rootpowerkey: Hkey, importfilenamepath: Pcwstr, destinationschemeguid: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerImportPowerScheme(rootpowerkey.rawAddress, importfilenamepath.rawAddress, destinationschemeguid.rawAddress).toUInt()

public actual fun powerIsSettingRangeDefined(subkeyguid: ConstPtr, settingguid: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(subkeyguid.rawAddress, settingguid.rawAddress)

public actual fun powerOpenSystemPowerKey(phsystempowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(phsystempowerkey.rawAddress, access.toInt(), openexisting).toUInt()

public actual fun powerOpenUserPowerKey(phuserpowerkey: MutPtr, access: UInt, openexisting: Bool): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(phuserpowerkey.rawAddress, access.toInt(), openexisting).toUInt()

public actual fun powerReadACDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acdefaultindex: MutPtr): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(rootpowerkey.rawAddress, schemepersonalityguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, acdefaultindex.rawAddress).toUInt()

public actual fun powerReadACValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadACValue(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, type.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadACValueIndex(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, acvalueindex.rawAddress).toUInt()

public actual fun powerReadDCDefaultIndex(rootpowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcdefaultindex: MutPtr): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(rootpowerkey.rawAddress, schemepersonalityguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, dcdefaultindex.rawAddress).toUInt()

public actual fun powerReadDCValue(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadDCValue(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, type.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: MutPtr): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, dcvalueindex.rawAddress).toUInt()

public actual fun powerReadDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadDescription(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadFriendlyName(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadPossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, possiblesettingindex.toInt(), buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadPossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, possiblesettingindex.toInt(), buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadPossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: MutPtr, possiblesettingindex: UInt, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadPossibleValue(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, type.rawAddress, possiblesettingindex.toInt(), buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerReadSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(subgroupguid.rawAddress, powersettingguid.rawAddress).toUInt()

public actual fun powerReadValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadValueIncrement(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, valueincrement.rawAddress).toUInt()

public actual fun powerReadValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadValueMax(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, valuemaximum.rawAddress).toUInt()

public actual fun powerReadValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadValueMin(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, valueminimum.rawAddress).toUInt()

public actual fun powerReadValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun powerRegisterForEffectivePowerModeNotifications(version: UInt, callback: EffectivePowerModeCallback, context: ConstPtr, registrationhandle: MutPtr): Hresult =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(version.toInt(), 0L, context.rawAddress, registrationhandle.rawAddress)

public actual fun powerRegisterSuspendResumeNotification(flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(flags.toInt(), recipient.rawAddress, registrationhandle.rawAddress).toUInt()

public actual fun powerRemovePowerSetting(powersettingsubkeyguid: ConstPtr, powersettingguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(powersettingsubkeyguid.rawAddress, powersettingguid.rawAddress).toUInt()

public actual fun powerReplaceDefaultPowerSchemes(): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes().toUInt()

public actual fun powerReportThermalEvent(event: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerReportThermalEvent(event.rawAddress).toUInt()

public actual fun powerRestoreDefaultPowerSchemes(): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes().toUInt()

public actual fun powerRestoreIndividualDefaultPowerScheme(schemeguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(schemeguid.rawAddress).toUInt()

public actual fun powerSetActiveScheme(userrootpowerkey: Hkey, schemeguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerSetActiveScheme(userrootpowerkey.rawAddress, schemeguid.rawAddress).toUInt()

public actual fun powerSetRequest(powerrequest: Handle, requesttype: PowerRequestType): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerSetRequest(powerrequest.rawAddress, requesttype)

public actual fun powerSettingAccessCheck(accessflags: PowerDataAccessor, powerguid: ConstPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(accessflags, powerguid.rawAddress).toUInt()

public actual fun powerSettingAccessCheckEx(accessflags: PowerDataAccessor, powerguid: ConstPtr, accesstype: RegSamFlags): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(accessflags, powerguid.rawAddress, accesstype.toInt()).toUInt()

public actual fun powerSettingRegisterNotification(settingguid: ConstPtr, flags: RegisterNotificationFlags, recipient: Handle, registrationhandle: MutPtr): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(settingguid.rawAddress, flags.toInt(), recipient.rawAddress, registrationhandle.rawAddress).toUInt()

public actual fun powerSettingUnregisterNotification(registrationhandle: Hpowernotify): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(registrationhandle).toUInt()

public actual fun powerUnregisterFromEffectivePowerModeNotifications(registrationhandle: ConstPtr): Hresult =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(registrationhandle.rawAddress)

public actual fun powerUnregisterSuspendResumeNotification(registrationhandle: Hpowernotify): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(registrationhandle).toUInt()

public actual fun powerWriteACDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultacindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(rootsystempowerkey.rawAddress, schemepersonalityguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, defaultacindex.toInt()).toUInt()

public actual fun powerWriteACValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, acvalueindex: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, acvalueindex.toInt()).toUInt()

public actual fun powerWriteDCDefaultIndex(rootsystempowerkey: Hkey, schemepersonalityguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, defaultdcindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(rootsystempowerkey.rawAddress, schemepersonalityguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, defaultdcindex.toInt()).toUInt()

public actual fun powerWriteDCValueIndex(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, dcvalueindex: UInt): UInt =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, dcvalueindex.toInt()).toUInt()

public actual fun powerWriteDescription(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteDescription(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun powerWriteFriendlyName(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun powerWriteIconResourceSpecifier(rootpowerkey: Hkey, schemeguid: ConstPtr, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(rootpowerkey.rawAddress, schemeguid.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun powerWritePossibleDescription(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, possiblesettingindex.toInt(), buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun powerWritePossibleFriendlyName(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, possiblesettingindex.toInt(), buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun powerWritePossibleValue(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, type: UInt, possiblesettingindex: UInt, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWritePossibleValue(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, type.toInt(), possiblesettingindex.toInt(), buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun powerWriteSettingAttributes(subgroupguid: ConstPtr, powersettingguid: ConstPtr, attributes: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(subgroupguid.rawAddress, powersettingguid.rawAddress, attributes.toInt()).toUInt()

public actual fun powerWriteValueIncrement(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueincrement: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, valueincrement.toInt()).toUInt()

public actual fun powerWriteValueMax(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valuemaximum: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteValueMax(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, valuemaximum.toInt()).toUInt()

public actual fun powerWriteValueMin(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, valueminimum: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteValueMin(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, valueminimum.toInt()).toUInt()

public actual fun powerWriteValueUnitsSpecifier(rootpowerkey: Hkey, subgroupofpowersettingsguid: ConstPtr, powersettingguid: ConstPtr, buffer: ConstPtr, buffersize: UInt): Win32Error =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(rootpowerkey.rawAddress, subgroupofpowersettingsguid.rawAddress, powersettingguid.rawAddress, buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun readGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(pglobalpowerpolicy.rawAddress)

public actual fun readProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.rawAddress)

public actual fun readPwrScheme(uiid: UInt, ppowerpolicy: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerReadPwrScheme(uiid.toInt(), ppowerpolicy.rawAddress)

public actual fun registerPowerSettingNotification(hrecipient: Handle, powersettingguid: ConstPtr, flags: RegisterNotificationFlags): Hpowernotify =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(hrecipient.rawAddress, powersettingguid.rawAddress, flags.toInt())

public actual fun registerSuspendResumeNotification(hrecipient: Handle, flags: RegisterNotificationFlags): Hpowernotify =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(hrecipient.rawAddress, flags.toInt())

public actual fun requestWakeupLatency(latency: LatencyTime): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerRequestWakeupLatency(latency)

public actual fun setActivePwrScheme(uiid: UInt, pglobalpowerpolicy: ConstPtr, ppowerpolicy: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerSetActivePwrScheme(uiid.toInt(), pglobalpowerpolicy.rawAddress, ppowerpolicy.rawAddress)

public actual fun setSuspendState(bhibernate: Boolean, bforce: Boolean, bwakeupeventsdisabled: Boolean): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerSetSuspendState(bhibernate, bforce, bwakeupeventsdisabled)

public actual fun setSystemPowerState(fsuspend: Bool, fforce: Bool): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerSetSystemPowerState(fsuspend, fforce)

public actual fun setThreadExecutionState(esflags: ExecutionState): ExecutionState =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerSetThreadExecutionState(esflags.toInt()).toUInt()

public actual fun unregisterPowerSettingNotification(handle: Hpowernotify): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(handle)

public actual fun unregisterSuspendResumeNotification(handle: Hpowernotify): Bool =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(handle)

public actual fun validatePowerPolicies(pglobalpowerpolicy: MutPtr, ppowerpolicy: MutPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerValidatePowerPolicies(pglobalpowerpolicy.rawAddress, ppowerpolicy.rawAddress)

public actual fun writeGlobalPwrPolicy(pglobalpowerpolicy: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(pglobalpowerpolicy.rawAddress)

public actual fun writeProcessorPwrScheme(uiid: UInt, pmachineprocessorpowerpolicy: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(uiid.toInt(), pmachineprocessorpowerpolicy.rawAddress)

public actual fun writePwrScheme(puiid: ConstPtr, lpszschemename: Pcwstr, lpszdescription: Pcwstr, lpscheme: ConstPtr): Boolean =
    WindowsWin32SystemPowerJniBridge.windowssysWindowsWin32SystemPowerWritePwrScheme(puiid.rawAddress, lpszschemename.rawAddress, lpszdescription.rawAddress, lpscheme.rawAddress)
