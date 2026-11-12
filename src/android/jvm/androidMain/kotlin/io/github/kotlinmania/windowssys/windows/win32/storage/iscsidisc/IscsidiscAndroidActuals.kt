@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32StorageIscsidiscJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(uniquesessionid: Long, reserved: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, loginoptions: Long, keysize: Int, key: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(uniquesessionid: Long, reserved: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, loginoptions: Long, keysize: Int, key: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, loginoptions: Long, securityflags: Long, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, loginoptions: Long, securityflags: Long, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(targetname: Long, targetalias: Long, targetflags: Int, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(targetname: Long, targetalias: Long, targetflags: Int, persist: Boolean, mappings: Long, loginoptions: Long, portalgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(devicepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(devicepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(uniquesessionid: Long, devicecount: Long, devices: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(uniquesessionid: Long, devicecount: Long, devices: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(initiatorname: Long, initiatorportnumber: Int, reserved: Long, authinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(initiatorname: Long, initiatorportnumber: Int, reserved: Long, authinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(buffersize: Long, sessioncount: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(buffersize: Long, sessioncountptr: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(buffersize: Long, sessioncount: Long, sessioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(targetname: Long, discoverymechanism: Long, infoclass: Int, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(targetname: Long, discoverymechanism: Long, infoclass: Int, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(versioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(targetname: Long, isinformationalsession: Boolean, initiatorinstance: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, mappings: Long, loginoptions: Long, keysize: Int, key: Long, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(targetname: Long, isinformationalsession: Boolean, initiatorinstance: Long, initiatorportnumber: Int, targetportal: Long, securityflags: Long, mappings: Long, loginoptions: Long, keysize: Int, key: Long, ispersistent: Boolean, uniquesessionid: Long, uniqueconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(uniquesessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(uniquesessionid: Long, connectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(initiatorinstance: Long, initiatorportnumber: Int, targetname: Long, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(initiatorinstance: Long, initiatorportnumber: Int, targetname: Long, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(initiatorinstance: Long, initiatorportnumber: Int, portal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(targetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(targetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(devicepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(devicepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(buffersize: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(buffersize: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(count: Long, persistentlogininfo: Long, buffersizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(portalcount: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(portalcount: Long, portalinfosize: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(portalcount: Long, portalinfosize: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(portalcount: Long, portalinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(initiatorname: Long, targetname: Long, targetportaltag: Long, elementcount: Long, portals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(initiatorname: Long, targetname: Long, targetportaltag: Long, elementcount: Long, portals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(forceupdate: Boolean, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(forceupdate: Boolean, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(buffersizeinchar: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(uniquesessionid: Long, lun: Long, evpdcmddt: Byte, pagecode: Byte, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(uniquesessionid: Long, lun: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(uniquesessionid: Long, scsistatus: Long, responsesize: Long, responsebuffer: Long, sensesize: Long, sensebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(keylength: Int, key: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(initiatorname: Long, initiatorportnumber: Int, authinfo: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(initiatorname: Long, initiatorportnumber: Int, authinfo: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(sharedsecretlength: Int, sharedsecret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(initiatornodename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: Int, sharedsecret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(initiatorname: Long, initiatorportnumber: Int, destinationaddress: Long, outermodeaddress: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(initiatorname: Long, initiatorportnumber: Int, destinationaddress: Long, outermodeaddress: Long, persist: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes(): Int
}

public actual fun addISNSServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddISNSServerA(address.rawAddress).toUInt()

public actual fun addISNSServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddISNSServerW(address.rawAddress).toUInt()

public actual fun addIScsiConnectionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(uniquesessionid.rawAddress, reserved.rawAddress, initiatorportnumber.toInt(), targetportal.rawAddress, securityflags.toLong(), loginoptions.rawAddress, keysize.toInt(), key.rawAddress, connectionid.rawAddress).toUInt()

public actual fun addIScsiConnectionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(uniquesessionid.rawAddress, reserved.rawAddress, initiatorportnumber.toInt(), targetportal.rawAddress, securityflags.toLong(), loginoptions.rawAddress, keysize.toInt(), key.rawAddress, connectionid.rawAddress).toUInt()

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortala>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(initiatorinstance.rawAddress, initiatorportnumber.toInt(), loginoptions.rawAddress, securityflags.toLong(), portal.rawAddress).toUInt()

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortalw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(initiatorinstance.rawAddress, initiatorportnumber.toInt(), loginoptions.rawAddress, securityflags.toLong(), portal.rawAddress).toUInt()

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupa>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(targetname.rawAddress, targetalias.rawAddress, targetflags.toInt(), persist, mappings.rawAddress, loginoptions.rawAddress, portalgroup.rawAddress).toUInt()

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(targetname.rawAddress, targetalias.rawAddress, targetflags.toInt(), persist, mappings.rawAddress, loginoptions.rawAddress, portalgroup.rawAddress).toUInt()

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(devicepath.rawAddress).toUInt()

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(devicepath.rawAddress).toUInt()

public actual fun addRadiusServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(address.rawAddress).toUInt()

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(address.rawAddress).toUInt()

public actual fun clearPersistentIScsiDevices(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices().toUInt()

public actual fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessiona>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(uniquesessionid.rawAddress, devicecount.rawAddress, devices.rawAddress).toUInt()

public actual fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessionw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(uniquesessionid.rawAddress, devicecount.rawAddress, devices.rawAddress).toUInt()

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(initiatorname.rawAddress, initiatorportnumber.toInt(), reserved.rawAddress, authinfo.rawAddress).toUInt()

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(initiatorname.rawAddress, initiatorportnumber.toInt(), reserved.rawAddress, authinfo.rawAddress).toUInt()

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(initiatornodename.rawAddress).toUInt()

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(initiatornodename.rawAddress).toUInt()

public actual fun getIScsiSessionListA(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoa>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(buffersize.rawAddress, sessioncount.rawAddress, sessioninfo.rawAddress).toUInt()

public actual fun getIScsiSessionListEx(buffersize: MutPtr<UInt>, sessioncountptr: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoEx>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(buffersize.rawAddress, sessioncountptr.rawAddress, sessioninfo.rawAddress).toUInt()

public actual fun getIScsiSessionListW(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfow>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(buffersize.rawAddress, sessioncount.rawAddress, sessioninfo.rawAddress).toUInt()

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(targetname.rawAddress, discoverymechanism.rawAddress, infoclass, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(targetname.rawAddress, discoverymechanism.rawAddress, infoclass, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun getIScsiVersionInformation(versioninfo: MutPtr<IscsiVersionInfo>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(versioninfo.rawAddress).toUInt()

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(targetname.rawAddress, isinformationalsession, initiatorinstance.rawAddress, initiatorportnumber.toInt(), targetportal.rawAddress, securityflags.toLong(), mappings.rawAddress, loginoptions.rawAddress, keysize.toInt(), key.rawAddress, ispersistent, uniquesessionid.rawAddress, uniqueconnectionid.rawAddress).toUInt()

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(targetname.rawAddress, isinformationalsession, initiatorinstance.rawAddress, initiatorportnumber.toInt(), targetportal.rawAddress, securityflags.toLong(), mappings.rawAddress, loginoptions.rawAddress, keysize.toInt(), key.rawAddress, ispersistent, uniquesessionid.rawAddress, uniqueconnectionid.rawAddress).toUInt()

public actual fun logoutIScsiTarget(uniquesessionid: MutPtr<IscsiUniqueSessionId>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(uniquesessionid.rawAddress).toUInt()

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(address.rawAddress).toUInt()

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(address.rawAddress).toUInt()

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(initiatorinstance.rawAddress, initiatorportnumber.toInt(), portal.rawAddress).toUInt()

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(initiatorinstance.rawAddress, initiatorportnumber.toInt(), portal.rawAddress).toUInt()

public actual fun removeISNSServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(address.rawAddress).toUInt()

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(address.rawAddress).toUInt()

public actual fun removeIScsiConnection(uniquesessionid: MutPtr<IscsiUniqueSessionId>, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(uniquesessionid.rawAddress, connectionid.rawAddress).toUInt()

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr<IscsiTargetPortala>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(initiatorinstance.rawAddress, initiatorportnumber.toInt(), targetname.rawAddress, portal.rawAddress).toUInt()

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr<IscsiTargetPortalw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(initiatorinstance.rawAddress, initiatorportnumber.toInt(), targetname.rawAddress, portal.rawAddress).toUInt()

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(initiatorinstance.rawAddress, initiatorportnumber.toInt(), portal.rawAddress).toUInt()

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(initiatorinstance.rawAddress, initiatorportnumber.toInt(), portal.rawAddress).toUInt()

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(targetname.rawAddress).toUInt()

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(targetname.rawAddress).toUInt()

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(devicepath.rawAddress).toUInt()

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(devicepath.rawAddress).toUInt()

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(address.rawAddress).toUInt()

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(address.rawAddress).toUInt()

public actual fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappinga>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(buffersize.rawAddress, mappingcount.rawAddress, mappings.rawAddress).toUInt()

public actual fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappingw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(buffersize.rawAddress, mappingcount.rawAddress, mappings.rawAddress).toUInt()

public actual fun reportISNSServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(buffersizeinchar.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportISNSServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(buffersizeinchar.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportIScsiInitiatorListA(buffersize: MutPtr<UInt>, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportIScsiInitiatorListW(buffersize: MutPtr<UInt>, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportIScsiPersistentLoginsA(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfoa>, buffersizeinbytes: MutPtr<UInt>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(count.rawAddress, persistentlogininfo.rawAddress, buffersizeinbytes.rawAddress).toUInt()

public actual fun reportIScsiPersistentLoginsW(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfow>, buffersizeinbytes: MutPtr<UInt>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(count.rawAddress, persistentlogininfo.rawAddress, buffersizeinbytes.rawAddress).toUInt()

public actual fun reportIScsiSendTargetPortalsA(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoa>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(portalcount.rawAddress, portalinfo.rawAddress).toUInt()

public actual fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExa>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(portalcount.rawAddress, portalinfosize.rawAddress, portalinfo.rawAddress).toUInt()

public actual fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(portalcount.rawAddress, portalinfosize.rawAddress, portalinfo.rawAddress).toUInt()

public actual fun reportIScsiSendTargetPortalsW(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfow>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(portalcount.rawAddress, portalinfo.rawAddress).toUInt()

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortala>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(initiatorname.rawAddress, targetname.rawAddress, targetportaltag.rawAddress, elementcount.rawAddress, portals.rawAddress).toUInt()

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortalw>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(initiatorname.rawAddress, targetname.rawAddress, targetportaltag.rawAddress, elementcount.rawAddress, portals.rawAddress).toUInt()

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(forceupdate, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(forceupdate, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(buffersizeinchar.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(buffersizeinchar.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportRadiusServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(buffersizeinchar.rawAddress, buffer.rawAddress).toUInt()

public actual fun reportRadiusServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(buffersizeinchar.rawAddress, buffer.rawAddress).toUInt()

public actual fun sendScsiInquiry(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(uniquesessionid.rawAddress, lun.toLong(), evpdcmddt.toByte(), pagecode.toByte(), scsistatus.rawAddress, responsesize.rawAddress, responsebuffer.rawAddress, sensesize.rawAddress, sensebuffer.rawAddress).toUInt()

public actual fun sendScsiReadCapacity(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(uniquesessionid.rawAddress, lun.toLong(), scsistatus.rawAddress, responsesize.rawAddress, responsebuffer.rawAddress, sensesize.rawAddress, sensebuffer.rawAddress).toUInt()

public actual fun sendScsiReportLuns(uniquesessionid: MutPtr<IscsiUniqueSessionId>, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(uniquesessionid.rawAddress, scsistatus.rawAddress, responsesize.rawAddress, responsebuffer.rawAddress, sensesize.rawAddress, sensebuffer.rawAddress).toUInt()

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr<UByte>, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(keylength.toInt(), key.rawAddress, persist).toUInt()

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(initiatorname.rawAddress, initiatorportnumber.toInt(), authinfo.rawAddress, persist).toUInt()

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(initiatorname.rawAddress, initiatorportnumber.toInt(), authinfo.rawAddress, persist).toUInt()

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(sharedsecretlength.toInt(), sharedsecret.rawAddress).toUInt()

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(initiatornodename.rawAddress).toUInt()

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(initiatornodename.rawAddress).toUInt()

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength.toInt(), sharedsecret.rawAddress).toUInt()

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(initiatorname.rawAddress, initiatorportnumber.toInt(), destinationaddress.rawAddress, outermodeaddress.rawAddress, persist).toUInt()

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(initiatorname.rawAddress, initiatorportnumber.toInt(), destinationaddress.rawAddress, outermodeaddress.rawAddress, persist).toUInt()

public actual fun setupPersistentIScsiDevices(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices().toUInt()

public actual fun setupPersistentIScsiVolumes(): UInt =
    WindowsWin32StorageIscsidiscJniBridge.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes().toUInt()
