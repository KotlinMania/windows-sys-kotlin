@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32StorageIscsidiscJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, loginoptions: Long, keysize: Int, key: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, loginoptions: Long, keysize: Int, key: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, loginoptions: Long, securityflags: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, loginoptions: Long, securityflags: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetA(targetname: Long, targetalias: Long, targetflags: Int, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetW(targetname: Long, targetalias: Long, targetflags: Int, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceA(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceW(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addRadiusServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_addRadiusServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_clearPersistentIScsiDevices(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoA(initiatorname: Long, initiatorportnumber: Int, reserved: Long, authinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoW(initiatorname: Long, initiatorportnumber: Int, reserved: Long, authinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameA(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameW(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationA(targetname: Long, discoverymechanism: Long, infoclass: Int, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationW(targetname: Long, discoverymechanism: Long, infoclass: Int, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_getIScsiVersionInformation(versioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetA(targetname: Long, isinformationalsession: Boolean, initiatorinstance: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, mappings: Long, loginoptions: Long, keysize: Int, key: Long, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetW(targetname: Long, isinformationalsession: Boolean, initiatorinstance: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, mappings: Long, loginoptions: Long, keysize: Int, key: Long, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_logoutIScsiTarget(uniquesessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_refreshISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_refreshISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiConnection(uniquesessionid: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetA(initiatorinstance: Long, initiatorportnumber: Int, targetname: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetW(initiatorinstance: Long, initiatorportnumber: Int, targetname: Long, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetA(targetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetW(targetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceA(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceW(devicepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeRadiusServerA(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_removeRadiusServerW(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportISNSServerListA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportISNSServerListW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListA(buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListW(buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsA(initiatorname: Long, targetname: Long, targetportaltag: Long, elementcount: Long, portals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsW(initiatorname: Long, targetname: Long, targetportaltag: Long, elementcount: Long, portals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_sendScsiInquiry(uniquesessionid: Long, lun: Long, evpdcmddt: Byte, pagecode: Byte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_sendScsiReadCapacity(uniquesessionid: Long, lun: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_sendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiGroupPresharedKey(keylength: Int, key: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoA(initiatorname: Long, initiatorportnumber: Int, authinfo: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoW(initiatorname: Long, initiatorportnumber: Int, authinfo: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: Int, sharedsecret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameA(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameW(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: Int, sharedsecret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressA(initiatorname: Long, initiatorportnumber: Int, destinationaddress: Long, outermodeaddress: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressW(initiatorname: Long, initiatorportnumber: Int, destinationaddress: Long, outermodeaddress: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiDevices(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiVolumes(): Int
}

public actual fun addISNSServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addISNSServerA((address?.value ?: 0L)).toUInt()

public actual fun addISNSServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addISNSServerW((address?.value ?: 0L)).toUInt()

public actual fun addIScsiConnectionA(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionA((uniquesessionid?.value ?: 0L), (reserved?.value ?: 0L), initiatorportnumber.toInt(), (targetportal?.value ?: 0L), securityflags.toLong(), (loginoptions?.value ?: 0L), keysize.toInt(), (key?.value ?: 0L), (connectionid?.value ?: 0L)).toUInt()

public actual fun addIScsiConnectionW(uniquesessionid: COpaquePointer?, reserved: COpaquePointer?, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, connectionid: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addIScsiConnectionW((uniquesessionid?.value ?: 0L), (reserved?.value ?: 0L), initiatorportnumber.toInt(), (targetportal?.value ?: 0L), securityflags.toLong(), (loginoptions?.value ?: 0L), keysize.toInt(), (key?.value ?: 0L), (connectionid?.value ?: 0L)).toUInt()

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalA((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (loginoptions?.value ?: 0L), securityflags.toLong(), (portal?.value ?: 0L)).toUInt()

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: COpaquePointer?, securityflags: ULong, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addIScsiSendTargetPortalW((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (loginoptions?.value ?: 0L), securityflags.toLong(), (portal?.value ?: 0L)).toUInt()

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetA((targetname?.value ?: 0L), (targetalias?.value ?: 0L), targetflags.toInt(), persist, (mappings?.value ?: 0L), (loginoptions?.value ?: 0L), (portalgroup?.value ?: 0L)).toUInt()

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: COpaquePointer?, loginoptions: COpaquePointer?, portalgroup: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addIScsiStaticTargetW((targetname?.value ?: 0L), (targetalias?.value ?: 0L), targetflags.toInt(), persist, (mappings?.value ?: 0L), (loginoptions?.value ?: 0L), (portalgroup?.value ?: 0L)).toUInt()

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceA((devicepath?.value ?: 0L)).toUInt()

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addPersistentIScsiDeviceW((devicepath?.value ?: 0L)).toUInt()

public actual fun addRadiusServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addRadiusServerA((address?.value ?: 0L)).toUInt()

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_addRadiusServerW((address?.value ?: 0L)).toUInt()

public actual fun clearPersistentIScsiDevices(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_clearPersistentIScsiDevices().toUInt()

public actual fun getDevicesForIScsiSessionA(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionA((uniquesessionid?.value ?: 0L), (devicecount?.value ?: 0L), (devices?.value ?: 0L)).toUInt()

public actual fun getDevicesForIScsiSessionW(uniquesessionid: COpaquePointer?, devicecount: COpaquePointer?, devices: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getDevicesForIScsiSessionW((uniquesessionid?.value ?: 0L), (devicecount?.value ?: 0L), (devices?.value ?: 0L)).toUInt()

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoA((initiatorname?.value ?: 0L), initiatorportnumber.toInt(), (reserved?.value ?: 0L), (authinfo?.value ?: 0L)).toUInt()

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: COpaquePointer?, authinfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiIKEInfoW((initiatorname?.value ?: 0L), initiatorportnumber.toInt(), (reserved?.value ?: 0L), (authinfo?.value ?: 0L)).toUInt()

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameA((initiatornodename?.value ?: 0L)).toUInt()

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiInitiatorNodeNameW((initiatornodename?.value ?: 0L)).toUInt()

public actual fun getIScsiSessionListA(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListA((buffersize?.value ?: 0L), (sessioncount?.value ?: 0L), (sessioninfo?.value ?: 0L)).toUInt()

public actual fun getIScsiSessionListEx(buffersize: COpaquePointer?, sessioncountptr: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListEx((buffersize?.value ?: 0L), (sessioncountptr?.value ?: 0L), (sessioninfo?.value ?: 0L)).toUInt()

public actual fun getIScsiSessionListW(buffersize: COpaquePointer?, sessioncount: COpaquePointer?, sessioninfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiSessionListW((buffersize?.value ?: 0L), (sessioncount?.value ?: 0L), (sessioninfo?.value ?: 0L)).toUInt()

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationA((targetname?.value ?: 0L), (discoverymechanism?.value ?: 0L), infoclass, (buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiTargetInformationW((targetname?.value ?: 0L), (discoverymechanism?.value ?: 0L), infoclass, (buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun getIScsiVersionInformation(versioninfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_getIScsiVersionInformation((versioninfo?.value ?: 0L)).toUInt()

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetA((targetname?.value ?: 0L), isinformationalsession, (initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (targetportal?.value ?: 0L), securityflags.toLong(), (mappings?.value ?: 0L), (loginoptions?.value ?: 0L), keysize.toInt(), (key?.value ?: 0L), ispersistent, (uniquesessionid?.value ?: 0L), (uniqueconnectionid?.value ?: 0L)).toUInt()

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: COpaquePointer?, securityflags: ULong, mappings: COpaquePointer?, loginoptions: COpaquePointer?, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: COpaquePointer?, uniqueconnectionid: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_loginIScsiTargetW((targetname?.value ?: 0L), isinformationalsession, (initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (targetportal?.value ?: 0L), securityflags.toLong(), (mappings?.value ?: 0L), (loginoptions?.value ?: 0L), keysize.toInt(), (key?.value ?: 0L), ispersistent, (uniquesessionid?.value ?: 0L), (uniqueconnectionid?.value ?: 0L)).toUInt()

public actual fun logoutIScsiTarget(uniquesessionid: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_logoutIScsiTarget((uniquesessionid?.value ?: 0L)).toUInt()

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_refreshISNSServerA((address?.value ?: 0L)).toUInt()

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_refreshISNSServerW((address?.value ?: 0L)).toUInt()

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalA((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (portal?.value ?: 0L)).toUInt()

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_refreshIScsiSendTargetPortalW((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (portal?.value ?: 0L)).toUInt()

public actual fun removeISNSServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeISNSServerA((address?.value ?: 0L)).toUInt()

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeISNSServerW((address?.value ?: 0L)).toUInt()

public actual fun removeIScsiConnection(uniquesessionid: COpaquePointer?, connectionid: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiConnection((uniquesessionid?.value ?: 0L), (connectionid?.value ?: 0L)).toUInt()

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetA((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (targetname?.value ?: 0L), (portal?.value ?: 0L)).toUInt()

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiPersistentTargetW((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (targetname?.value ?: 0L), (portal?.value ?: 0L)).toUInt()

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalA((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (portal?.value ?: 0L)).toUInt()

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiSendTargetPortalW((initiatorinstance?.value ?: 0L), initiatorportnumber.toInt(), (portal?.value ?: 0L)).toUInt()

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetA((targetname?.value ?: 0L)).toUInt()

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeIScsiStaticTargetW((targetname?.value ?: 0L)).toUInt()

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceA((devicepath?.value ?: 0L)).toUInt()

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removePersistentIScsiDeviceW((devicepath?.value ?: 0L)).toUInt()

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeRadiusServerA((address?.value ?: 0L)).toUInt()

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_removeRadiusServerW((address?.value ?: 0L)).toUInt()

public actual fun reportActiveIScsiTargetMappingsA(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsA((buffersize?.value ?: 0L), (mappingcount?.value ?: 0L), (mappings?.value ?: 0L)).toUInt()

public actual fun reportActiveIScsiTargetMappingsW(buffersize: COpaquePointer?, mappingcount: COpaquePointer?, mappings: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportActiveIScsiTargetMappingsW((buffersize?.value ?: 0L), (mappingcount?.value ?: 0L), (mappings?.value ?: 0L)).toUInt()

public actual fun reportISNSServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportISNSServerListA((buffersizeinchar?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportISNSServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportISNSServerListW((buffersizeinchar?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportIScsiInitiatorListA(buffersize: COpaquePointer?, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListA((buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportIScsiInitiatorListW(buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiInitiatorListW((buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportIScsiPersistentLoginsA(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsA((count?.value ?: 0L), (persistentlogininfo?.value ?: 0L), (buffersizeinbytes?.value ?: 0L)).toUInt()

public actual fun reportIScsiPersistentLoginsW(count: COpaquePointer?, persistentlogininfo: COpaquePointer?, buffersizeinbytes: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiPersistentLoginsW((count?.value ?: 0L), (persistentlogininfo?.value ?: 0L), (buffersizeinbytes?.value ?: 0L)).toUInt()

public actual fun reportIScsiSendTargetPortalsA(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsA((portalcount?.value ?: 0L), (portalinfo?.value ?: 0L)).toUInt()

public actual fun reportIScsiSendTargetPortalsExA(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExA((portalcount?.value ?: 0L), (portalinfosize?.value ?: 0L), (portalinfo?.value ?: 0L)).toUInt()

public actual fun reportIScsiSendTargetPortalsExW(portalcount: COpaquePointer?, portalinfosize: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsExW((portalcount?.value ?: 0L), (portalinfosize?.value ?: 0L), (portalinfo?.value ?: 0L)).toUInt()

public actual fun reportIScsiSendTargetPortalsW(portalcount: COpaquePointer?, portalinfo: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiSendTargetPortalsW((portalcount?.value ?: 0L), (portalinfo?.value ?: 0L)).toUInt()

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsA((initiatorname?.value ?: 0L), (targetname?.value ?: 0L), (targetportaltag?.value ?: 0L), (elementcount?.value ?: 0L), (portals?.value ?: 0L)).toUInt()

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: COpaquePointer?, elementcount: COpaquePointer?, portals: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetPortalsW((initiatorname?.value ?: 0L), (targetname?.value ?: 0L), (targetportaltag?.value ?: 0L), (elementcount?.value ?: 0L), (portals?.value ?: 0L)).toUInt()

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsA(forceupdate, (buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: COpaquePointer?, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportIScsiTargetsW(forceupdate, (buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesA((buffersizeinchar?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportPersistentIScsiDevicesW((buffersizeinchar?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportRadiusServerListA(buffersizeinchar: COpaquePointer?, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListA((buffersizeinchar?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun reportRadiusServerListW(buffersizeinchar: COpaquePointer?, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_reportRadiusServerListW((buffersizeinchar?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun sendScsiInquiry(uniquesessionid: COpaquePointer?, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_sendScsiInquiry((uniquesessionid?.value ?: 0L), lun.toLong(), evpdcmddt.toByte(), pagecode.toByte(), (scsistatus?.value ?: 0L), (responsesize?.value ?: 0L), (responsebuffer?.value ?: 0L), (sensesize?.value ?: 0L), (sensebuffer?.value ?: 0L)).toUInt()

public actual fun sendScsiReadCapacity(uniquesessionid: COpaquePointer?, lun: ULong, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_sendScsiReadCapacity((uniquesessionid?.value ?: 0L), lun.toLong(), (scsistatus?.value ?: 0L), (responsesize?.value ?: 0L), (responsebuffer?.value ?: 0L), (sensesize?.value ?: 0L), (sensebuffer?.value ?: 0L)).toUInt()

public actual fun sendScsiReportLuns(uniquesessionid: COpaquePointer?, scsistatus: COpaquePointer?, responsesize: COpaquePointer?, responsebuffer: COpaquePointer?, sensesize: COpaquePointer?, sensebuffer: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_sendScsiReportLuns((uniquesessionid?.value ?: 0L), (scsistatus?.value ?: 0L), (responsesize?.value ?: 0L), (responsebuffer?.value ?: 0L), (sensesize?.value ?: 0L), (sensebuffer?.value ?: 0L)).toUInt()

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: COpaquePointer?, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiGroupPresharedKey(keylength.toInt(), (key?.value ?: 0L), persist).toUInt()

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoA((initiatorname?.value ?: 0L), initiatorportnumber.toInt(), (authinfo?.value ?: 0L), persist).toUInt()

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: COpaquePointer?, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiIKEInfoW((initiatorname?.value ?: 0L), initiatorportnumber.toInt(), (authinfo?.value ?: 0L), persist).toUInt()

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), (sharedsecret?.value ?: 0L)).toUInt()

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameA((initiatornodename?.value ?: 0L)).toUInt()

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorNodeNameW((initiatornodename?.value ?: 0L)).toUInt()

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: COpaquePointer?): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), (sharedsecret?.value ?: 0L)).toUInt()

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressA((initiatorname?.value ?: 0L), initiatorportnumber.toInt(), (destinationaddress?.value ?: 0L), (outermodeaddress?.value ?: 0L), persist).toUInt()

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setIScsiTunnelModeOuterAddressW((initiatorname?.value ?: 0L), initiatorportnumber.toInt(), (destinationaddress?.value ?: 0L), (outermodeaddress?.value ?: 0L), persist).toUInt()

public actual fun setupPersistentIScsiDevices(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiDevices().toUInt()

public actual fun setupPersistentIScsiVolumes(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssys_windows_win32_storage_iscsidisc_setupPersistentIScsiVolumes().toUInt()
