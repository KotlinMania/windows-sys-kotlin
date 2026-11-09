@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32StorageIscsidiscJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, loginoptions: Long, keysize: Int, key: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, loginoptions: Long, keysize: Int, key: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, loginoptions: Long, securityflags: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, loginoptions: Long, securityflags: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA(targetname: Long, targetalias: Long, targetflags: Int, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW(targetname: Long, targetalias: Long, targetflags: Int, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA(initiatorname: Long, initiatorportnumber: Int, reserved: Long, authinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW(initiatorname: Long, initiatorportnumber: Int, reserved: Long, authinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA(targetname: Long, discoverymechanism: Long, infoclass: Int, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW(targetname: Long, discoverymechanism: Long, infoclass: Int, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation(versioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA(targetname: Long, isinformationalsession: Boolean, initiatorinstance: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, mappings: Long, loginoptions: Long, keysize: Int, key: Long, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW(targetname: Long, isinformationalsession: Boolean, initiatorinstance: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, mappings: Long, loginoptions: Long, keysize: Int, key: Long, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget(uniquesessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA(initiatorinstance: Long, initiatorportnumber: Int, targetname: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW(initiatorinstance: Long, initiatorportnumber: Int, targetname: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA(targetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW(targetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA(buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW(buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA(initiatorname: Long, targetname: Long, targetportaltag: Long, elementcount: Long, portals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW(initiatorname: Long, targetname: Long, targetportaltag: Long, elementcount: Long, portals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry(uniquesessionid: Long, lun: Long, evpdcmddt: Byte, pagecode: Byte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity(uniquesessionid: Long, lun: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey(keylength: Int, key: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA(initiatorname: Long, initiatorportnumber: Int, authinfo: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW(initiatorname: Long, initiatorportnumber: Int, authinfo: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: Int, sharedsecret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: Int, sharedsecret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA(initiatorname: Long, initiatorportnumber: Int, destinationaddress: Long, outermodeaddress: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW(initiatorname: Long, initiatorportnumber: Int, destinationaddress: Long, outermodeaddress: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes(): Int
}

public actual fun AddISNSServerA(address: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddISNSServerA(address).toUInt()

public actual fun AddISNSServerW(address: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddISNSServerW(address).toUInt()

public actual fun AddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionA(uniquesessionid, reserved, initiatorportnumber.toInt(), targetportal, securityflags.toLong(), loginoptions, keysize.toInt(), key, connectionid).toUInt()

public actual fun AddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, loginoptions: Long, keysize: UInt, key: PCSTR, connectionid: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddIScsiConnectionW(uniquesessionid, reserved, initiatorportnumber.toInt(), targetportal, securityflags.toLong(), loginoptions, keysize.toInt(), key, connectionid).toUInt()

public actual fun AddIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalA(initiatorinstance, initiatorportnumber.toInt(), loginoptions, securityflags.toLong(), portal).toUInt()

public actual fun AddIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, loginoptions: Long, securityflags: ULong, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddIScsiSendTargetPortalW(initiatorinstance, initiatorportnumber.toInt(), loginoptions, securityflags.toLong(), portal).toUInt()

public actual fun AddIScsiStaticTargetA(targetname: PCSTR, targetalias: PCSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetA(targetname, targetalias, targetflags.toInt(), persist, mappings, loginoptions, portalgroup).toUInt()

public actual fun AddIScsiStaticTargetW(targetname: PCWSTR, targetalias: PCWSTR, targetflags: UInt, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddIScsiStaticTargetW(targetname, targetalias, targetflags.toInt(), persist, mappings, loginoptions, portalgroup).toUInt()

public actual fun AddPersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceA(devicepath).toUInt()

public actual fun AddPersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddPersistentIScsiDeviceW(devicepath).toUInt()

public actual fun AddRadiusServerA(address: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddRadiusServerA(address).toUInt()

public actual fun AddRadiusServerW(address: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_AddRadiusServerW(address).toUInt()

public actual fun ClearPersistentIScsiDevices(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ClearPersistentIScsiDevices().toUInt()

public actual fun GetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionA(uniquesessionid, devicecount, devices).toUInt()

public actual fun GetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetDevicesForIScsiSessionW(uniquesessionid, devicecount, devices).toUInt()

public actual fun GetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoA(initiatorname, initiatorportnumber.toInt(), reserved, authinfo).toUInt()

public actual fun GetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, reserved: Long, authinfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiIKEInfoW(initiatorname, initiatorportnumber.toInt(), reserved, authinfo).toUInt()

public actual fun GetIScsiInitiatorNodeNameA(initiatornodename: PSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameA(initiatornodename).toUInt()

public actual fun GetIScsiInitiatorNodeNameW(initiatornodename: PWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiInitiatorNodeNameW(initiatornodename).toUInt()

public actual fun GetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListA(buffersize, sessioncount, sessioninfo).toUInt()

public actual fun GetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListEx(buffersize, sessioncountptr, sessioninfo).toUInt()

public actual fun GetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiSessionListW(buffersize, sessioncount, sessioninfo).toUInt()

public actual fun GetIScsiTargetInformationA(targetname: PCSTR, discoverymechanism: PCSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationA(targetname, discoverymechanism, infoclass, buffersize, buffer).toUInt()

public actual fun GetIScsiTargetInformationW(targetname: PCWSTR, discoverymechanism: PCWSTR, infoclass: TARGET_INFORMATION_CLASS, buffersize: Long, buffer: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiTargetInformationW(targetname, discoverymechanism, infoclass, buffersize, buffer).toUInt()

public actual fun GetIScsiVersionInformation(versioninfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_GetIScsiVersionInformation(versioninfo).toUInt()

public actual fun LoginIScsiTargetA(targetname: PCSTR, isinformationalsession: Boolean, initiatorinstance: PCSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetA(targetname, isinformationalsession, initiatorinstance, initiatorportnumber.toInt(), targetportal, securityflags.toLong(), mappings, loginoptions, keysize.toInt(), key, ispersistent, uniquesessionid, uniqueconnectionid).toUInt()

public actual fun LoginIScsiTargetW(targetname: PCWSTR, isinformationalsession: Boolean, initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetportal: Long, securityflags: ULong, mappings: Long, loginoptions: Long, keysize: UInt, key: PCSTR, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_LoginIScsiTargetW(targetname, isinformationalsession, initiatorinstance, initiatorportnumber.toInt(), targetportal, securityflags.toLong(), mappings, loginoptions, keysize.toInt(), key, ispersistent, uniquesessionid, uniqueconnectionid).toUInt()

public actual fun LogoutIScsiTarget(uniquesessionid: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_LogoutIScsiTarget(uniquesessionid).toUInt()

public actual fun RefreshISNSServerA(address: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerA(address).toUInt()

public actual fun RefreshISNSServerW(address: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RefreshISNSServerW(address).toUInt()

public actual fun RefreshIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalA(initiatorinstance, initiatorportnumber.toInt(), portal).toUInt()

public actual fun RefreshIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RefreshIScsiSendTargetPortalW(initiatorinstance, initiatorportnumber.toInt(), portal).toUInt()

public actual fun RemoveISNSServerA(address: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerA(address).toUInt()

public actual fun RemoveISNSServerW(address: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveISNSServerW(address).toUInt()

public actual fun RemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiConnection(uniquesessionid, connectionid).toUInt()

public actual fun RemoveIScsiPersistentTargetA(initiatorinstance: PCSTR, initiatorportnumber: UInt, targetname: PCSTR, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetA(initiatorinstance, initiatorportnumber.toInt(), targetname, portal).toUInt()

public actual fun RemoveIScsiPersistentTargetW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, targetname: PCWSTR, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiPersistentTargetW(initiatorinstance, initiatorportnumber.toInt(), targetname, portal).toUInt()

public actual fun RemoveIScsiSendTargetPortalA(initiatorinstance: PCSTR, initiatorportnumber: UInt, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalA(initiatorinstance, initiatorportnumber.toInt(), portal).toUInt()

public actual fun RemoveIScsiSendTargetPortalW(initiatorinstance: PCWSTR, initiatorportnumber: UInt, portal: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiSendTargetPortalW(initiatorinstance, initiatorportnumber.toInt(), portal).toUInt()

public actual fun RemoveIScsiStaticTargetA(targetname: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetA(targetname).toUInt()

public actual fun RemoveIScsiStaticTargetW(targetname: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveIScsiStaticTargetW(targetname).toUInt()

public actual fun RemovePersistentIScsiDeviceA(devicepath: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceA(devicepath).toUInt()

public actual fun RemovePersistentIScsiDeviceW(devicepath: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemovePersistentIScsiDeviceW(devicepath).toUInt()

public actual fun RemoveRadiusServerA(address: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerA(address).toUInt()

public actual fun RemoveRadiusServerW(address: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_RemoveRadiusServerW(address).toUInt()

public actual fun ReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsA(buffersize, mappingcount, mappings).toUInt()

public actual fun ReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportActiveIScsiTargetMappingsW(buffersize, mappingcount, mappings).toUInt()

public actual fun ReportISNSServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListA(buffersizeinchar, buffer).toUInt()

public actual fun ReportISNSServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportISNSServerListW(buffersizeinchar, buffer).toUInt()

public actual fun ReportIScsiInitiatorListA(buffersize: Long, buffer: PSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListA(buffersize, buffer).toUInt()

public actual fun ReportIScsiInitiatorListW(buffersize: Long, buffer: PWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiInitiatorListW(buffersize, buffer).toUInt()

public actual fun ReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsA(count, persistentlogininfo, buffersizeinbytes).toUInt()

public actual fun ReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiPersistentLoginsW(count, persistentlogininfo, buffersizeinbytes).toUInt()

public actual fun ReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsA(portalcount, portalinfo).toUInt()

public actual fun ReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExA(portalcount, portalinfosize, portalinfo).toUInt()

public actual fun ReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsExW(portalcount, portalinfosize, portalinfo).toUInt()

public actual fun ReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiSendTargetPortalsW(portalcount, portalinfo).toUInt()

public actual fun ReportIScsiTargetPortalsA(initiatorname: PCSTR, targetname: PCSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsA(initiatorname, targetname, targetportaltag, elementcount, portals).toUInt()

public actual fun ReportIScsiTargetPortalsW(initiatorname: PCWSTR, targetname: PCWSTR, targetportaltag: Long, elementcount: Long, portals: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetPortalsW(initiatorname, targetname, targetportaltag, elementcount, portals).toUInt()

public actual fun ReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: PSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsA(forceupdate, buffersize, buffer).toUInt()

public actual fun ReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: PWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportIScsiTargetsW(forceupdate, buffersize, buffer).toUInt()

public actual fun ReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: PSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesA(buffersizeinchar, buffer).toUInt()

public actual fun ReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportPersistentIScsiDevicesW(buffersizeinchar, buffer).toUInt()

public actual fun ReportRadiusServerListA(buffersizeinchar: Long, buffer: PSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListA(buffersizeinchar, buffer).toUInt()

public actual fun ReportRadiusServerListW(buffersizeinchar: Long, buffer: PWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_ReportRadiusServerListW(buffersizeinchar, buffer).toUInt()

public actual fun SendScsiInquiry(uniquesessionid: Long, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SendScsiInquiry(uniquesessionid, lun.toLong(), evpdcmddt.toByte(), pagecode.toByte(), scsistatus, responsesize, responsebuffer, sensesize, sensebuffer).toUInt()

public actual fun SendScsiReadCapacity(uniquesessionid: Long, lun: ULong, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SendScsiReadCapacity(uniquesessionid, lun.toLong(), scsistatus, responsesize, responsebuffer, sensesize, sensebuffer).toUInt()

public actual fun SendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SendScsiReportLuns(uniquesessionid, scsistatus, responsesize, responsebuffer, sensesize, sensebuffer).toUInt()

public actual fun SetIScsiGroupPresharedKey(keylength: UInt, key: Long, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiGroupPresharedKey(keylength.toInt(), key, persist).toUInt()

public actual fun SetIScsiIKEInfoA(initiatorname: PCSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoA(initiatorname, initiatorportnumber.toInt(), authinfo, persist).toUInt()

public actual fun SetIScsiIKEInfoW(initiatorname: PCWSTR, initiatorportnumber: UInt, authinfo: Long, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiIKEInfoW(initiatorname, initiatorportnumber.toInt(), authinfo, persist).toUInt()

public actual fun SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), sharedsecret).toUInt()

public actual fun SetIScsiInitiatorNodeNameA(initiatornodename: PCSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameA(initiatornodename).toUInt()

public actual fun SetIScsiInitiatorNodeNameW(initiatornodename: PCWSTR): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorNodeNameW(initiatornodename).toUInt()

public actual fun SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: Long): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), sharedsecret).toUInt()

public actual fun SetIScsiTunnelModeOuterAddressA(initiatorname: PCSTR, initiatorportnumber: UInt, destinationaddress: PCSTR, outermodeaddress: PCSTR, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressA(initiatorname, initiatorportnumber.toInt(), destinationaddress, outermodeaddress, persist).toUInt()

public actual fun SetIScsiTunnelModeOuterAddressW(initiatorname: PCWSTR, initiatorportnumber: UInt, destinationaddress: PCWSTR, outermodeaddress: PCWSTR, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetIScsiTunnelModeOuterAddressW(initiatorname, initiatorportnumber.toInt(), destinationaddress, outermodeaddress, persist).toUInt()

public actual fun SetupPersistentIScsiDevices(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiDevices().toUInt()

public actual fun SetupPersistentIScsiVolumes(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_SetupPersistentIScsiVolumes().toUInt()
